//! CLI tool driving the API client
use anyhow::{anyhow, Context, Result};
use log::{debug, info};
// models may be unused if all inputs are primitive types
#[allow(unused_imports)]
use openapi_client::{
    models, ApiNoContext, Client, ContextWrapperExt,
    RootGetResponse,
};
use simple_logger::SimpleLogger;
use structopt::StructOpt;
use swagger::{AuthData, ContextBuilder, EmptyContext, Push, XSpanIdString};

type ClientContext = swagger::make_context_ty!(
    ContextBuilder,
    EmptyContext,
    Option<AuthData>,
    XSpanIdString
);

#[derive(StructOpt, Debug)]
#[structopt(
    name = "iplocation.net API",
    version = "1.0.1-pre.0",
    about = "CLI access to iplocation.net API"
)]
struct Cli {
    #[structopt(subcommand)]
    operation: Operation,

    /// Address or hostname of the server hosting this API, including optional port
    #[structopt(short = "a", long, default_value = "http://localhost")]
    server_address: String,

    /// Path to the client private key if using client-side TLS authentication
    #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
    #[structopt(long, requires_all(&["client-certificate", "server-certificate"]))]
    client_key: Option<String>,

    /// Path to the client's public certificate associated with the private key
    #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
    #[structopt(long, requires_all(&["client-key", "server-certificate"]))]
    client_certificate: Option<String>,

    /// Path to CA certificate used to authenticate the server
    #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
    #[structopt(long)]
    server_certificate: Option<String>,

    /// If set, write output to file instead of stdout
    #[structopt(short, long)]
    output_file: Option<String>,

    #[structopt(flatten)]
    verbosity: clap_verbosity_flag::Verbosity,
}

#[derive(StructOpt, Debug)]
enum Operation {
    /// Get geolocation of an IP address
    RootGet {
        /// An IPv4 or IPv6 address that you would like to lookup.
        ip: String,
        /// Output format, the following formats are supported: plain xml json jsonp php csv serialized
        format: Option<String>,
        /// Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".
        delimiter: Option<String>,
    },
}

#[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
fn create_client(args: &Cli, context: ClientContext) -> Result<Box<dyn ApiNoContext<ClientContext>>> {
    if args.client_certificate.is_some() {
        debug!("Using mutual TLS");
        let client = Client::try_new_https_mutual(
            &args.server_address,
            args.server_certificate.clone().unwrap(),
            args.client_key.clone().unwrap(),
            args.client_certificate.clone().unwrap(),
        )
        .context("Failed to create HTTPS client")?;
        Ok(Box::new(client.with_context(context)))
    } else if args.server_certificate.is_some() {
        debug!("Using TLS with pinned server certificate");
        let client =
            Client::try_new_https_pinned(&args.server_address, args.server_certificate.clone().unwrap())
                .context("Failed to create HTTPS client")?;
        Ok(Box::new(client.with_context(context)))
    } else {
        debug!("Using client without certificates");
        let client =
            Client::try_new(&args.server_address).context("Failed to create HTTP(S) client")?;
        Ok(Box::new(client.with_context(context)))
    }
}

#[cfg(any(target_os = "macos", target_os = "windows", target_os = "ios"))]
fn create_client(args: &Cli, context: ClientContext) -> Result<Box<dyn ApiNoContext<ClientContext>>> {
    let client =
        Client::try_new(&args.server_address).context("Failed to create HTTP(S) client")?;
    Ok(Box::new(client.with_context(context)))
}

#[tokio::main]
async fn main() -> Result<()> {
    let args = Cli::from_args();
    if let Some(log_level) = args.verbosity.log_level() {
        SimpleLogger::new().with_level(log_level.to_level_filter()).init()?;
    }

    debug!("Arguments: {:?}", &args);

    let auth_data: Option<AuthData> = None;

    #[allow(trivial_casts)]
    let context = swagger::make_context!(
        ContextBuilder,
        EmptyContext,
        auth_data,
        XSpanIdString::default()
    );

    let client = create_client(&args, context)?;

    let result = match args.operation {
        Operation::RootGet {
            ip,
            format,
            delimiter,
        } => {
            info!("Performing a RootGet request");

            let result = client.root_get(
                ip,
                format,
                delimiter,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                RootGetResponse::SuccessfullyProcessedTheRequest
                (body)
                => "SuccessfullyProcessedTheRequest\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                RootGetResponse::FailedToCompleteTheRequest
                (body)
                => "FailedToCompleteTheRequest\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
                RootGetResponse::CommandNotFound
                (body)
                => "CommandNotFound\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
    };

    if let Some(output_file) = args.output_file {
        std::fs::write(output_file, result)?
    } else {
        println!("{}", result);
    }
    Ok(())
}

// May be unused if all inputs are primitive types
#[allow(dead_code)]
fn parse_json<'a, T: serde::de::Deserialize<'a>>(json_string: &'a str) -> Result<T> {
    serde_json::from_str(json_string).map_err(|err| anyhow!("Error parsing input: {}", err))
}

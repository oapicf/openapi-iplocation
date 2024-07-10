#![allow(unused_qualifications)]

use http::HeaderValue;
use validator::Validate;

#[cfg(feature = "server")]
use crate::header;
use crate::{models, types::*};

      
    #[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
    #[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))] 
    pub struct RootGetQueryParams {
            /// An IPv4 or IPv6 address that you would like to lookup.
                #[serde(rename = "ip")]
                pub ip: String,
            /// Output format, the following formats are supported: plain xml json jsonp php csv serialized
                #[serde(rename = "format")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub format: Option<String>,
            /// Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".
                #[serde(rename = "delimiter")]
                #[serde(skip_serializing_if="Option::is_none")]
                pub delimiter: Option<String>,
    }






#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct Get200Response {
/// IPv4 or IPv6 address used to lookup geolocation.
    #[serde(rename = "ip")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub ip: Option<String>,

/// IP number in long integer (represented as string).
    #[serde(rename = "ip_number")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub ip_number: Option<String>,

/// IP version either 4 or 6.
    #[serde(rename = "ip_version")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub ip_version: Option<i32>,

/// Full name of the IP country.
    #[serde(rename = "country_name")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub country_name: Option<String>,

/// ISO ALPHA-2 Country Code.
    #[serde(rename = "country_code2")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub country_code2: Option<String>,

/// Internet Service Provider (ISP) who owns the IP address.
    #[serde(rename = "isp")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub isp: Option<String>,

/// Response status code to indicate success or failed completion of the API call.
    #[serde(rename = "response_code")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub response_code: Option<String>,

/// Response message to indicate success or failed completion of the API call.
    #[serde(rename = "response_message")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub response_message: Option<String>,

}


impl Get200Response {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> Get200Response {
        Get200Response {
            ip: None,
            ip_number: None,
            ip_version: None,
            country_name: None,
            country_code2: None,
            isp: None,
            response_code: None,
            response_message: None,
        }
    }
}

/// Converts the Get200Response value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for Get200Response {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.ip.as_ref().map(|ip| {
                [
                    "ip".to_string(),
                    ip.to_string(),
                ].join(",")
            }),


            self.ip_number.as_ref().map(|ip_number| {
                [
                    "ip_number".to_string(),
                    ip_number.to_string(),
                ].join(",")
            }),


            self.ip_version.as_ref().map(|ip_version| {
                [
                    "ip_version".to_string(),
                    ip_version.to_string(),
                ].join(",")
            }),


            self.country_name.as_ref().map(|country_name| {
                [
                    "country_name".to_string(),
                    country_name.to_string(),
                ].join(",")
            }),


            self.country_code2.as_ref().map(|country_code2| {
                [
                    "country_code2".to_string(),
                    country_code2.to_string(),
                ].join(",")
            }),


            self.isp.as_ref().map(|isp| {
                [
                    "isp".to_string(),
                    isp.to_string(),
                ].join(",")
            }),


            self.response_code.as_ref().map(|response_code| {
                [
                    "response_code".to_string(),
                    response_code.to_string(),
                ].join(",")
            }),


            self.response_message.as_ref().map(|response_message| {
                [
                    "response_message".to_string(),
                    response_message.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a Get200Response value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for Get200Response {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub ip: Vec<String>,
            pub ip_number: Vec<String>,
            pub ip_version: Vec<i32>,
            pub country_name: Vec<String>,
            pub country_code2: Vec<String>,
            pub isp: Vec<String>,
            pub response_code: Vec<String>,
            pub response_message: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing Get200Response".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "ip" => intermediate_rep.ip.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "ip_number" => intermediate_rep.ip_number.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "ip_version" => intermediate_rep.ip_version.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "country_name" => intermediate_rep.country_name.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "country_code2" => intermediate_rep.country_code2.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "isp" => intermediate_rep.isp.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "response_code" => intermediate_rep.response_code.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "response_message" => intermediate_rep.response_message.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing Get200Response".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(Get200Response {
            ip: intermediate_rep.ip.into_iter().next(),
            ip_number: intermediate_rep.ip_number.into_iter().next(),
            ip_version: intermediate_rep.ip_version.into_iter().next(),
            country_name: intermediate_rep.country_name.into_iter().next(),
            country_code2: intermediate_rep.country_code2.into_iter().next(),
            isp: intermediate_rep.isp.into_iter().next(),
            response_code: intermediate_rep.response_code.into_iter().next(),
            response_message: intermediate_rep.response_message.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<Get200Response> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<Get200Response>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<Get200Response>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for Get200Response - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<Get200Response> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <Get200Response as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into Get200Response - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}







#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct Get400Response {
/// Response status code to indicate success or failed completion of the API call.
    #[serde(rename = "response_code")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub response_code: Option<String>,

/// Response message to indicate success or failed completion of the API call.
    #[serde(rename = "response_message")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub response_message: Option<String>,

}


impl Get400Response {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> Get400Response {
        Get400Response {
            response_code: None,
            response_message: None,
        }
    }
}

/// Converts the Get400Response value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for Get400Response {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.response_code.as_ref().map(|response_code| {
                [
                    "response_code".to_string(),
                    response_code.to_string(),
                ].join(",")
            }),


            self.response_message.as_ref().map(|response_message| {
                [
                    "response_message".to_string(),
                    response_message.to_string(),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a Get400Response value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for Get400Response {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub response_code: Vec<String>,
            pub response_message: Vec<String>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing Get400Response".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "response_code" => intermediate_rep.response_code.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "response_message" => intermediate_rep.response_message.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing Get400Response".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(Get400Response {
            response_code: intermediate_rep.response_code.into_iter().next(),
            response_message: intermediate_rep.response_message.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<Get400Response> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<Get400Response>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<Get400Response>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for Get400Response - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<Get400Response> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <Get400Response as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into Get400Response - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}




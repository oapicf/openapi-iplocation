using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Get geolocation of an IP address
/// </summary>

public class RootGetEndpoint : FastEndpoints.Endpoint<RootGetRequest, Get200Response>
{
    public override void Configure()
    {
        Get("/");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("default");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 404);
        });

        Summary(s => {
            s.Summary = "Get geolocation of an IP address";
            s.RequestParam(r => r.Ip, "An IPv4 or IPv6 address that you would like to lookup.");
            s.RequestParam(r => r.Format, "Output format, the following formats are supported: plain xml json jsonp php csv serialized");
            s.RequestParam(r => r.Delimiter, "Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;.");
            s.Responses[200] = "Successfully processed the request.";
            s.Responses[400] = "Failed to complete the request.";
            s.Responses[404] = "Command not found.";
        });
    }

    public override async Task HandleAsync(RootGetRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


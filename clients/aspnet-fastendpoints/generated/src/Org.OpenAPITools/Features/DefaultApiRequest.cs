
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class RootGetRequest
{
    /// <summary>
    /// An IPv4 or IPv6 address that you would like to lookup.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ip")]
    public string Ip { get; set; }
    /// <summary>
    /// Output format, the following formats are supported: plain xml json jsonp php csv serialized
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("format")]
    public string? Format { get; set; }
    /// <summary>
    /// Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("delimiter")]
    public string? Delimiter { get; set; }
}



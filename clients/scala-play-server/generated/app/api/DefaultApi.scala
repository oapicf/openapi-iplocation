package api

import play.api.libs.json._
import model.Get200Response
import model.Get400Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2023-04-02T00:27:18.710311Z[Etc/UTC]")
trait DefaultApi {
  /**
    * Get geolocation of an IP address
    * Retrieve geolocation of an IP address. 
    * @param ip An IPv4 or IPv6 address that you would like to lookup.
    * @param format Output format, the following formats are supported: plain xml json jsonp php csv serialized
    * @param delimiter Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;.
    */
  def rootGet(ip: OasAnyTypeNotMapped, format: Option[OasAnyTypeNotMapped], delimiter: Option[OasAnyTypeNotMapped]): Get200Response
}

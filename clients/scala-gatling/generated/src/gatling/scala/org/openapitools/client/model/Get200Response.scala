
package org.openapitools.client.model


case class Get200Response (
    /* IPv4 or IPv6 address used to lookup geolocation. */
    _ip: Option[String],
    /* IP number in long integer. */
    _ipNumber: Option[Int64],
    /* IP version either 4 or 6. */
    _ipVersion: Option[Integer],
    /* Full name of the IP country. */
    _countryName: Option[String],
    /* ISO ALPHA-2 Country Code. */
    _countryCode2: Option[String],
    /* Internet Service Provider (ISP) who owns the IP address. */
    _isp: Option[String],
    /* Response status code to indicate success or failed completion of the API call. */
    _responseCode: Option[String],
    /* Response message to indicate success or failed completion of the API call. */
    _responseMessage: Option[String]
)
object Get200Response {
    def toStringBody(var_ip: Object, var_ipNumber: Object, var_ipVersion: Object, var_countryName: Object, var_countryCode2: Object, var_isp: Object, var_responseCode: Object, var_responseMessage: Object) =
        s"""
        | {
        | "ip":$var_ip,"ipNumber":$var_ipNumber,"ipVersion":$var_ipVersion,"countryName":$var_countryName,"countryCode2":$var_countryCode2,"isp":$var_isp,"responseCode":$var_responseCode,"responseMessage":$var_responseMessage
        | }
        """.stripMargin
}

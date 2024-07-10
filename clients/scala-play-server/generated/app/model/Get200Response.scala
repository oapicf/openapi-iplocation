package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for __get_200_response.
  * @param ip IPv4 or IPv6 address used to lookup geolocation.
  * @param ipNumber IP number in long integer (represented as string).
  * @param ipVersion IP version either 4 or 6.
  * @param countryName Full name of the IP country.
  * @param countryCode2 ISO ALPHA-2 Country Code.
  * @param isp Internet Service Provider (ISP) who owns the IP address.
  * @param responseCode Response status code to indicate success or failed completion of the API call.
  * @param responseMessage Response message to indicate success or failed completion of the API call.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-10T08:38:47.237053013Z[Etc/UTC]", comments = "Generator version: 7.6.0")
case class Get200Response(
  ip: Option[String],
  ipNumber: Option[String],
  ipVersion: Option[Int],
  countryName: Option[String],
  countryCode2: Option[String],
  isp: Option[String],
  responseCode: Option[String],
  responseMessage: Option[String]
)

object Get200Response {
  implicit lazy val get200ResponseJsonFormat: Format[Get200Response] = Json.format[Get200Response]
}


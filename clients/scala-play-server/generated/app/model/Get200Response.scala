package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for __get_200_response.
  * @param ip IPv4 or IPv6 address used to lookup geolocation.
  * @param ipNumber IP number in long integer.
  * @param ipVersion IP version either 4 or 6.
  * @param countryName Full name of the IP country.
  * @param countryCode2 ISO ALPHA-2 Country Code.
  * @param isp Internet Service Provider (ISP) who owns the IP address.
  * @param responseCode Response status code to indicate success or failed completion of the API call.
  * @param responseMessage Response message to indicate success or failed completion of the API call.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2023-04-02T00:27:18.710311Z[Etc/UTC]")
case class Get200Response(
  ip: Option[OasAnyTypeNotMapped],
  ipNumber: Option[OasAnyTypeNotMapped],
  ipVersion: Option[OasAnyTypeNotMapped],
  countryName: Option[OasAnyTypeNotMapped],
  countryCode2: Option[OasAnyTypeNotMapped],
  isp: Option[OasAnyTypeNotMapped],
  responseCode: Option[OasAnyTypeNotMapped],
  responseMessage: Option[OasAnyTypeNotMapped]
)

object Get200Response {
  implicit lazy val get200ResponseJsonFormat: Format[Get200Response] = Json.format[Get200Response]
}


package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Get200Response._

case class Get200Response (
  /* IPv4 or IPv6 address used to lookup geolocation. */
  ip: Option[String],
/* IP number in long integer (represented as string). */
  ipNumber: Option[String],
/* IP version either 4 or 6. */
  ipVersion: Option[Integer],
/* Full name of the IP country. */
  countryName: Option[String],
/* ISO ALPHA-2 Country Code. */
  countryCode2: Option[String],
/* Internet Service Provider (ISP) who owns the IP address. */
  isp: Option[String],
/* Response status code to indicate success or failed completion of the API call. */
  responseCode: Option[String],
/* Response message to indicate success or failed completion of the API call. */
  responseMessage: Option[String])

object Get200Response {
  import DateTimeCodecs._

  implicit val Get200ResponseCodecJson: CodecJson[Get200Response] = CodecJson.derive[Get200Response]
  implicit val Get200ResponseDecoder: EntityDecoder[Get200Response] = jsonOf[Get200Response]
  implicit val Get200ResponseEncoder: EntityEncoder[Get200Response] = jsonEncoderOf[Get200Response]
}

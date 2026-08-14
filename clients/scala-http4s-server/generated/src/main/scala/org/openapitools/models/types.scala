package org.openapitools.models

import java.time._

import io.circe.refined._
import io.circe.syntax._
import io.circe.{ Decoder, Encoder }
import io.circe.generic.semiauto.{ deriveDecoder, deriveEncoder }


/**
* 
* @param ip IPv4 or IPv6 address used to lookup geolocation.
* @param ipUnderscorenumber IP number in long integer (represented as string).
* @param ipUnderscoreversion IP version either 4 or 6.
* @param countryUnderscorename Full name of the IP country.
* @param countryUnderscorecode2 ISO ALPHA-2 Country Code.
* @param isp Internet Service Provider (ISP) who owns the IP address.
* @param responseUnderscorecode Response status code to indicate success or failed completion of the API call.
* @param responseUnderscoremessage Response message to indicate success or failed completion of the API call.
*/

case class Get200Response(
  ip: Option[String],
  ipUnderscorenumber: Option[String],
  ipUnderscoreversion: Option[Int],
  countryUnderscorename: Option[String],
  countryUnderscorecode2: Option[String],
  isp: Option[String],
  responseUnderscorecode: Option[String],
  responseUnderscoremessage: Option[String]
)
object Get200Response {
  implicit val encoderGet200Response: Encoder[Get200Response] = deriveEncoder[Get200Response].mapJson(_.dropNullValues)
  implicit val decoderGet200Response: Decoder[Get200Response] = deriveDecoder[Get200Response]
}

/**
* 
* @param responseUnderscorecode Response status code to indicate success or failed completion of the API call.
* @param responseUnderscoremessage Response message to indicate success or failed completion of the API call.
*/

case class Get400Response(
  responseUnderscorecode: Option[String],
  responseUnderscoremessage: Option[String]
)
object Get400Response {
  implicit val encoderGet400Response: Encoder[Get400Response] = deriveEncoder[Get400Response].mapJson(_.dropNullValues)
  implicit val decoderGet400Response: Decoder[Get400Response] = deriveDecoder[Get400Response]
}


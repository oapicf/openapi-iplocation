package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

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
case class Get200Response(ip: Option[String],
                ipUnderscorenumber: Option[String],
                ipUnderscoreversion: Option[Int],
                countryUnderscorename: Option[String],
                countryUnderscorecode2: Option[String],
                isp: Option[String],
                responseUnderscorecode: Option[String],
                responseUnderscoremessage: Option[String]
                )

object Get200Response {
    /**
     * Creates the codec for converting Get200Response from and to JSON.
     */
    implicit val decoder: Decoder[Get200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[Get200Response] = deriveEncoder
}

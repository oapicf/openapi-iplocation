package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Get400Response._

case class Get400Response (
  /* Response status code to indicate success or failed completion of the API call. */
  responseCode: Option[AnyType],
/* Response message to indicate success or failed completion of the API call. */
  responseMessage: Option[AnyType])

object Get400Response {
  import DateTimeCodecs._

  implicit val Get400ResponseCodecJson: CodecJson[Get400Response] = CodecJson.derive[Get400Response]
  implicit val Get400ResponseDecoder: EntityDecoder[Get400Response] = jsonOf[Get400Response]
  implicit val Get400ResponseEncoder: EntityEncoder[Get400Response] = jsonEncoderOf[Get400Response]
}

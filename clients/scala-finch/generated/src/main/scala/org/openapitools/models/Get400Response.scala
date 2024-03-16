package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AnyType

/**
 * 
 * @param responseUnderscorecode Response status code to indicate success or failed completion of the API call.
 * @param responseUnderscoremessage Response message to indicate success or failed completion of the API call.
 */
case class Get400Response(responseUnderscorecode: Option[AnyType],
                responseUnderscoremessage: Option[AnyType]
                )

object Get400Response {
    /**
     * Creates the codec for converting Get400Response from and to JSON.
     */
    implicit val decoder: Decoder[Get400Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[Get400Response] = deriveEncoder
}

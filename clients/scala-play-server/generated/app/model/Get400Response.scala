package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for __get_400_response.
  * @param responseCode Response status code to indicate success or failed completion of the API call.
  * @param responseMessage Response message to indicate success or failed completion of the API call.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T21:38:36.552147004Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class Get400Response(
  responseCode: Option[String],
  responseMessage: Option[String]
)

object Get400Response {
  implicit lazy val get400ResponseJsonFormat: Format[Get400Response] = Json.format[Get400Response]
}


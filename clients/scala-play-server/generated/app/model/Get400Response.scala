package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for __get_400_response.
  * @param responseCode Response status code to indicate success or failed completion of the API call.
  * @param responseMessage Response message to indicate success or failed completion of the API call.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2023-04-02T00:27:18.710311Z[Etc/UTC]")
case class Get400Response(
  responseCode: Option[OasAnyTypeNotMapped],
  responseMessage: Option[OasAnyTypeNotMapped]
)

object Get400Response {
  implicit lazy val get400ResponseJsonFormat: Format[Get400Response] = Json.format[Get400Response]
}


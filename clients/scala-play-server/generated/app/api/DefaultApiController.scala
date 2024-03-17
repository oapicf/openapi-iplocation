package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Get200Response
import model.Get400Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-16T21:38:36.552147004Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Singleton
class DefaultApiController @Inject()(cc: ControllerComponents, api: DefaultApi) extends AbstractController(cc) {
  /**
    * GET /?ip=[value]&format=[value]&delimiter=[value]
    */
  def rootGet(): Action[AnyContent] = Action { request =>
    def executeApi(): Get200Response = {
      val ip = request.getQueryString("ip")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("ip", "query string")
        }
        
      val format = request.getQueryString("format")
        
      val delimiter = request.getQueryString("delimiter")
        
      api.rootGet(ip, format, delimiter)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}

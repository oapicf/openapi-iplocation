package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.Get200Response
import org.openapitools.server.model.Get400Response


class DefaultApi(
    defaultService: DefaultApiService,
    defaultMarshaller: DefaultApiMarshaller
) {

  
  import defaultMarshaller._

  lazy val route: Route =
    path() { 
      get { 
        parameters("ip".as[String], "format".as[String].?, "delimiter".as[String].?) { (ip, format, delimiter) => 
            defaultService.rootGet(ip = ip, format = format, delimiter = delimiter)
        }
      }
    }
}


trait DefaultApiService {

  def rootGet200(responseGet200Response: Get200Response)(implicit toEntityMarshallerGet200Response: ToEntityMarshaller[Get200Response]): Route =
    complete((200, responseGet200Response))
  def rootGet400(responseGet400Response: Get400Response)(implicit toEntityMarshallerGet400Response: ToEntityMarshaller[Get400Response]): Route =
    complete((400, responseGet400Response))
  def rootGet404(responseGet400Response: Get400Response)(implicit toEntityMarshallerGet400Response: ToEntityMarshaller[Get400Response]): Route =
    complete((404, responseGet400Response))
  /**
   * Code: 200, Message: Successfully processed the request., DataType: Get200Response
   * Code: 400, Message: Failed to complete the request., DataType: Get400Response
   * Code: 404, Message: Command not found., DataType: Get400Response
   */
  def rootGet(ip: String, format: Option[String], delimiter: Option[String])
      (implicit toEntityMarshallerGet400Response: ToEntityMarshaller[Get400Response], toEntityMarshallerGet200Response: ToEntityMarshaller[Get200Response]): Route

}

trait DefaultApiMarshaller {


  implicit def toEntityMarshallerGet400Response: ToEntityMarshaller[Get400Response]

  implicit def toEntityMarshallerGet200Response: ToEntityMarshaller[Get200Response]

}


package api

import model.Get200Response
import model.Get400Response

/**
  * Provides a default implementation for [[DefaultApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-10T08:38:47.237053013Z[Etc/UTC]", comments = "Generator version: 7.6.0")
class DefaultApiImpl extends DefaultApi {
  /**
    * @inheritdoc
    */
  override def rootGet(ip: String, format: Option[String], delimiter: Option[String]): Get200Response = {
    // TODO: Implement better logic

    Get200Response(None, None, None, None, None, None, None, None)
  }
}

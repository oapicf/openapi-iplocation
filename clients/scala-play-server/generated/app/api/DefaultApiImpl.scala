package api

import model.Get200Response
import model.Get400Response

/**
  * Provides a default implementation for [[DefaultApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2023-04-02T00:27:18.710311Z[Etc/UTC]")
class DefaultApiImpl extends DefaultApi {
  /**
    * @inheritdoc
    */
  override def rootGet(ip: OasAnyTypeNotMapped, format: Option[OasAnyTypeNotMapped], delimiter: Option[OasAnyTypeNotMapped]): Get200Response = {
    // TODO: Implement better logic

    Get200Response(None, None, None, None, None, None, None, None)
  }
}

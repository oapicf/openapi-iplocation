
package org.openapitools.client.model


case class Get400Response (
    /* Response status code to indicate success or failed completion of the API call. */
    _responseCode: Option[AnyType],
    /* Response message to indicate success or failed completion of the API call. */
    _responseMessage: Option[AnyType]
)
object Get400Response {
    def toStringBody(var_responseCode: Object, var_responseMessage: Object) =
        s"""
        | {
        | "responseCode":$var_responseCode,"responseMessage":$var_responseMessage
        | }
        """.stripMargin
}

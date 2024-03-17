package org.openapitools.server.model


/**
 * @param responseCode Response status code to indicate success or failed completion of the API call. for example: ''null''
 * @param responseMessage Response message to indicate success or failed completion of the API call. for example: ''null''
*/
final case class Get400Response (
  responseCode: Option[String] = None,
  responseMessage: Option[String] = None
)


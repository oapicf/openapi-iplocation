/**
 * iplocation.net API
 * OpenAPI v3 specification and a set of generated API clients for iplocation.net
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.api

import org.openapitools.client.model.Get200Response
import org.openapitools.client.model.Get400Response
import org.openapitools.client.core.JsonSupport._
import sttp.client3._
import sttp.model.Method

object DefaultApi {
  def apply(baseUrl: String = "https://api.iplocation.net") = new DefaultApi(baseUrl)
}

class DefaultApi(baseUrl: String) {

  /**
   * Retrieve geolocation of an IP address. 
   * 
   * Expected answers:
   *   code 200 : Get200Response (Successfully processed the request.)
   *   code 400 : Get400Response (Failed to complete the request.)
   *   code 404 : Get400Response (Command not found.)
   * 
   * @param ip An IPv4 or IPv6 address that you would like to lookup.
   * @param format Output format, the following formats are supported: plain xml json jsonp php csv serialized
   * @param delimiter Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".
   */
  def rootGet(ip: String, format: Option[String] = None, delimiter: Option[String] = None
): Request[Either[ResponseException[String, Exception], Get200Response], Any] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/?ip=${ ip }&format=${ format }&delimiter=${ delimiter }")
      .contentType("application/json")
      .response(asJson[Get200Response])

}
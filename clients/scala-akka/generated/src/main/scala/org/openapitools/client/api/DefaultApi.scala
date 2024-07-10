/**
 * iplocation.net API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

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
  def rootGet(ip: String, format: Option[String] = None, delimiter: Option[String] = None): ApiRequest[Get200Response] =
    ApiRequest[Get200Response](ApiMethods.GET, baseUrl, "/", "application/json")
      .withQueryParam("ip", ip)
      .withQueryParam("format", format)
      .withQueryParam("delimiter", delimiter)
      .withSuccessResponse[Get200Response](200)
      .withErrorResponse[Get400Response](400)
      .withErrorResponse[Get400Response](404)
      



}

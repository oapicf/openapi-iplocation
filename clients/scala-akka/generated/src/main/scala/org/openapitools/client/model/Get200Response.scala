/**
 * iplocation.net API
 * OpenAPI v3 specification and a set of generated API clients for iplocation.net
 *
 * The version of the OpenAPI document: 1.1.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

import org.openapitools.client.core.ApiModel

case class Get200Response (
  /* IPv4 or IPv6 address used to lookup geolocation. */
  ip: Option[String] = None,
  /* IP number in long integer (represented as string). */
  ipNumber: Option[String] = None,
  /* IP version either 4 or 6. */
  ipVersion: Option[Int] = None,
  /* Full name of the IP country. */
  countryName: Option[String] = None,
  /* ISO ALPHA-2 Country Code. */
  countryCode2: Option[String] = None,
  /* Internet Service Provider (ISP) who owns the IP address. */
  isp: Option[String] = None,
  /* Response status code to indicate success or failed completion of the API call. */
  responseCode: Option[String] = None,
  /* Response message to indicate success or failed completion of the API call. */
  responseMessage: Option[String] = None
) extends ApiModel


/**
 * iplocation.net API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

import org.openapitools.client.core.ApiModel

case class Get200Response (
  /* IPv4 or IPv6 address used to lookup geolocation. */
  ip: Option[AnyType] = None,
  /* IP number in long integer. */
  ipNumber: Option[AnyType] = None,
  /* IP version either 4 or 6. */
  ipVersion: Option[AnyType] = None,
  /* Full name of the IP country. */
  countryName: Option[AnyType] = None,
  /* ISO ALPHA-2 Country Code. */
  countryCode2: Option[AnyType] = None,
  /* Internet Service Provider (ISP) who owns the IP address. */
  isp: Option[AnyType] = None,
  /* Response status code to indicate success or failed completion of the API call. */
  responseCode: Option[AnyType] = None,
  /* Response message to indicate success or failed completion of the API call. */
  responseMessage: Option[AnyType] = None
) extends ApiModel


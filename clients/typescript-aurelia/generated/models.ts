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


export interface Get200Response {
  /**
   * IPv4 or IPv6 address used to lookup geolocation.
   */
  ip?: string;
  /**
   * IP number in long integer (represented as string).
   */
  ip_number?: string;
  /**
   * IP version either 4 or 6.
   */
  ip_version?: number;
  /**
   * Full name of the IP country.
   */
  country_name?: string;
  /**
   * ISO ALPHA-2 Country Code.
   */
  country_code2?: string;
  /**
   * Internet Service Provider (ISP) who owns the IP address.
   */
  isp?: string;
  /**
   * Response status code to indicate success or failed completion of the API call.
   */
  response_code?: string;
  /**
   * Response message to indicate success or failed completion of the API call.
   */
  response_message?: string;
}


export interface Get400Response {
  /**
   * Response status code to indicate success or failed completion of the API call.
   */
  response_code?: string;
  /**
   * Response message to indicate success or failed completion of the API call.
   */
  response_message?: string;
}


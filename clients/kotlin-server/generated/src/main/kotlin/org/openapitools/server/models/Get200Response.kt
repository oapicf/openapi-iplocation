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
package org.openapitools.server.models


/**
 * 
 * @param ip IPv4 or IPv6 address used to lookup geolocation.
 * @param ipNumber IP number in long integer (represented as string).
 * @param ipVersion IP version either 4 or 6.
 * @param countryName Full name of the IP country.
 * @param countryCode2 ISO ALPHA-2 Country Code.
 * @param isp Internet Service Provider (ISP) who owns the IP address.
 * @param responseCode Response status code to indicate success or failed completion of the API call.
 * @param responseMessage Response message to indicate success or failed completion of the API call.
 */
data class Get200Response(
    /* IPv4 or IPv6 address used to lookup geolocation. */
    val ip: kotlin.String? = null,
    /* IP number in long integer (represented as string). */
    val ipNumber: kotlin.String? = null,
    /* IP version either 4 or 6. */
    val ipVersion: kotlin.Int? = null,
    /* Full name of the IP country. */
    val countryName: kotlin.String? = null,
    /* ISO ALPHA-2 Country Code. */
    val countryCode2: kotlin.String? = null,
    /* Internet Service Provider (ISP) who owns the IP address. */
    val isp: kotlin.String? = null,
    /* Response status code to indicate success or failed completion of the API call. */
    val responseCode: kotlin.String? = null,
    /* Response message to indicate success or failed completion of the API call. */
    val responseMessage: kotlin.String? = null
) 


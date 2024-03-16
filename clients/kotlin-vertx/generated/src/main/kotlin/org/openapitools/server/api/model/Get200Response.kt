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
package org.openapitools.server.api.model


        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param ip IPv4 or IPv6 address used to lookup geolocation.
 * @param ipNumber IP number in long integer.
 * @param ipVersion IP version either 4 or 6.
 * @param countryName Full name of the IP country.
 * @param countryCode2 ISO ALPHA-2 Country Code.
 * @param isp Internet Service Provider (ISP) who owns the IP address.
 * @param responseCode Response status code to indicate success or failed completion of the API call.
 * @param responseMessage Response message to indicate success or failed completion of the API call.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class Get200Response (
    /* IPv4 or IPv6 address used to lookup geolocation. */
    val ip: kotlin.Any? = null,
    /* IP number in long integer. */
    val ipNumber: kotlin.Any? = null,
    /* IP version either 4 or 6. */
    val ipVersion: kotlin.Any? = null,
    /* Full name of the IP country. */
    val countryName: kotlin.Any? = null,
    /* ISO ALPHA-2 Country Code. */
    val countryCode2: kotlin.Any? = null,
    /* Internet Service Provider (ISP) who owns the IP address. */
    val isp: kotlin.Any? = null,
    /* Response status code to indicate success or failed completion of the API call. */
    val responseCode: kotlin.Any? = null,
    /* Response message to indicate success or failed completion of the API call. */
    val responseMessage: kotlin.Any? = null
) {

}


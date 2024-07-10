/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
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


data class Get200Response (

    /* IPv4 or IPv6 address used to lookup geolocation. */
    @Json(name = "ip")
    val ip: kotlin.String? = null,

    /* IP number in long integer (represented as string). */
    @Json(name = "ip_number")
    val ipNumber: kotlin.String? = null,

    /* IP version either 4 or 6. */
    @Json(name = "ip_version")
    val ipVersion: kotlin.Int? = null,

    /* Full name of the IP country. */
    @Json(name = "country_name")
    val countryName: kotlin.String? = null,

    /* ISO ALPHA-2 Country Code. */
    @Json(name = "country_code2")
    val countryCode2: kotlin.String? = null,

    /* Internet Service Provider (ISP) who owns the IP address. */
    @Json(name = "isp")
    val isp: kotlin.String? = null,

    /* Response status code to indicate success or failed completion of the API call. */
    @Json(name = "response_code")
    val responseCode: kotlin.String? = null,

    /* Response message to indicate success or failed completion of the API call. */
    @Json(name = "response_message")
    val responseMessage: kotlin.String? = null

)


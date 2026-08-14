package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Get200Response(
    /** IPv4 or IPv6 address used to lookup geolocation. */
    val ip: kotlin.String? = null,
    /** IP number in long integer (represented as string). */
    val ipNumber: kotlin.String? = null,
    /** IP version either 4 or 6. */
    val ipVersion: kotlin.Int? = null,
    /** Full name of the IP country. */
    val countryName: kotlin.String? = null,
    /** ISO ALPHA-2 Country Code. */
    val countryCode2: kotlin.String? = null,
    /** Internet Service Provider (ISP) who owns the IP address. */
    val isp: kotlin.String? = null,
    /** Response status code to indicate success or failed completion of the API call. */
    val responseCode: kotlin.String? = null,
    /** Response message to indicate success or failed completion of the API call. */
    val responseMessage: kotlin.String? = null
)

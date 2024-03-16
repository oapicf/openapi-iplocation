package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.*
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

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
data class Get200Response(

    @field:Valid
    @Schema(example = "null", description = "IPv4 or IPv6 address used to lookup geolocation.")
    @get:JsonProperty("ip") val ip: kotlin.Any? = null,

    @field:Valid
    @Schema(example = "null", description = "IP number in long integer.")
    @get:JsonProperty("ip_number") val ipNumber: kotlin.Any? = null,

    @field:Valid
    @Schema(example = "null", description = "IP version either 4 or 6.")
    @get:JsonProperty("ip_version") val ipVersion: kotlin.Any? = null,

    @field:Valid
    @Schema(example = "null", description = "Full name of the IP country.")
    @get:JsonProperty("country_name") val countryName: kotlin.Any? = null,

    @field:Valid
    @Schema(example = "null", description = "ISO ALPHA-2 Country Code.")
    @get:JsonProperty("country_code2") val countryCode2: kotlin.Any? = null,

    @field:Valid
    @Schema(example = "null", description = "Internet Service Provider (ISP) who owns the IP address.")
    @get:JsonProperty("isp") val isp: kotlin.Any? = null,

    @field:Valid
    @Schema(example = "null", description = "Response status code to indicate success or failed completion of the API call.")
    @get:JsonProperty("response_code") val responseCode: kotlin.Any? = null,

    @field:Valid
    @Schema(example = "null", description = "Response message to indicate success or failed completion of the API call.")
    @get:JsonProperty("response_message") val responseMessage: kotlin.Any? = null
) {

}


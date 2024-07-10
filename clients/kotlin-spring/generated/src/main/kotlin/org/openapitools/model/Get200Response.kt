package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

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

    @Schema(example = "null", description = "IPv4 or IPv6 address used to lookup geolocation.")
    @get:JsonProperty("ip") val ip: kotlin.String? = null,

    @Schema(example = "null", description = "IP number in long integer (represented as string).")
    @get:JsonProperty("ip_number") val ipNumber: kotlin.String? = null,

    @Schema(example = "null", description = "IP version either 4 or 6.")
    @get:JsonProperty("ip_version") val ipVersion: kotlin.Int? = null,

    @Schema(example = "null", description = "Full name of the IP country.")
    @get:JsonProperty("country_name") val countryName: kotlin.String? = null,

    @Schema(example = "null", description = "ISO ALPHA-2 Country Code.")
    @get:JsonProperty("country_code2") val countryCode2: kotlin.String? = null,

    @Schema(example = "null", description = "Internet Service Provider (ISP) who owns the IP address.")
    @get:JsonProperty("isp") val isp: kotlin.String? = null,

    @Schema(example = "null", description = "Response status code to indicate success or failed completion of the API call.")
    @get:JsonProperty("response_code") val responseCode: kotlin.String? = null,

    @Schema(example = "null", description = "Response message to indicate success or failed completion of the API call.")
    @get:JsonProperty("response_message") val responseMessage: kotlin.String? = null
) {

}


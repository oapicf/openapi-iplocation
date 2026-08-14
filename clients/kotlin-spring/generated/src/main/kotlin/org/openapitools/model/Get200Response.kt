package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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

    @Schema(description = "IPv4 or IPv6 address used to lookup geolocation.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ip")
    @get:JsonProperty("ip") val ip: kotlin.String? = null,

    @Schema(description = "IP number in long integer (represented as string).")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ip_number")
    @get:JsonProperty("ip_number") val ipNumber: kotlin.String? = null,

    @Schema(description = "IP version either 4 or 6.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ip_version")
    @get:JsonProperty("ip_version") val ipVersion: kotlin.Int? = null,

    @Schema(description = "Full name of the IP country.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("country_name")
    @get:JsonProperty("country_name") val countryName: kotlin.String? = null,

    @Schema(description = "ISO ALPHA-2 Country Code.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("country_code2")
    @get:JsonProperty("country_code2") val countryCode2: kotlin.String? = null,

    @Schema(description = "Internet Service Provider (ISP) who owns the IP address.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("isp")
    @get:JsonProperty("isp") val isp: kotlin.String? = null,

    @Schema(description = "Response status code to indicate success or failed completion of the API call.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("response_code")
    @get:JsonProperty("response_code") val responseCode: kotlin.String? = null,

    @Schema(description = "Response message to indicate success or failed completion of the API call.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("response_message")
    @get:JsonProperty("response_message") val responseMessage: kotlin.String? = null
) {

}


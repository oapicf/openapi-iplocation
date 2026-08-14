@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Get200Response(
    @field:JsonProperty("ip")
    val ip: kotlin.String? = null,

    @field:JsonProperty("ip_number")
    val ipNumber: kotlin.String? = null,

    @field:JsonProperty("ip_version")
    val ipVersion: kotlin.Int? = null,

    @field:JsonProperty("country_name")
    val countryName: kotlin.String? = null,

    @field:JsonProperty("country_code2")
    val countryCode2: kotlin.String? = null,

    @field:JsonProperty("isp")
    val isp: kotlin.String? = null,

    @field:JsonProperty("response_code")
    val responseCode: kotlin.String? = null,

    @field:JsonProperty("response_message")
    val responseMessage: kotlin.String? = null,

)

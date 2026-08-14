@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Get400Response(
    @field:JsonProperty("response_code")
    val responseCode: kotlin.String? = null,

    @field:JsonProperty("response_message")
    val responseMessage: kotlin.String? = null,

)

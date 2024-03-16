package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.*
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param responseCode Response status code to indicate success or failed completion of the API call.
 * @param responseMessage Response message to indicate success or failed completion of the API call.
 */
data class Get400Response(

    @field:Valid
    @Schema(example = "null", description = "Response status code to indicate success or failed completion of the API call.")
    @get:JsonProperty("response_code") val responseCode: kotlin.Any? = null,

    @field:Valid
    @Schema(example = "null", description = "Response message to indicate success or failed completion of the API call.")
    @get:JsonProperty("response_message") val responseMessage: kotlin.Any? = null
) {

}


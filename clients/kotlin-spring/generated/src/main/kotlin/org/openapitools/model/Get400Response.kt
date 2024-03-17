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
 * @param responseCode Response status code to indicate success or failed completion of the API call.
 * @param responseMessage Response message to indicate success or failed completion of the API call.
 */
data class Get400Response(

    @Schema(example = "null", description = "Response status code to indicate success or failed completion of the API call.")
    @get:JsonProperty("response_code") val responseCode: kotlin.String? = null,

    @Schema(example = "null", description = "Response message to indicate success or failed completion of the API call.")
    @get:JsonProperty("response_message") val responseMessage: kotlin.String? = null
) {

}


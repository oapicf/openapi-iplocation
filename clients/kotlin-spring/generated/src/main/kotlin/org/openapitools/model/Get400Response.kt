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
 * @param responseCode Response status code to indicate success or failed completion of the API call.
 * @param responseMessage Response message to indicate success or failed completion of the API call.
 */
data class Get400Response(

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


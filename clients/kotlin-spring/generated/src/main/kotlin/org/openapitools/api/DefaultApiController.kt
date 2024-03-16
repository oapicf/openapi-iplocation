package org.openapitools.api

import org.openapitools.model.Get200Response
import org.openapitools.model.Get400Response
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.constraints.*
import javax.validation.Valid

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:}")
class DefaultApiController() {

    @Operation(
        summary = "Get geolocation of an IP address",
        operationId = "rootGet",
        description = "Retrieve geolocation of an IP address. ",
        responses = [
            ApiResponse(responseCode = "200", description = "Successfully processed the request.", content = [Content(schema = Schema(implementation = Get200Response::class))]),
            ApiResponse(responseCode = "400", description = "Failed to complete the request.", content = [Content(schema = Schema(implementation = Get400Response::class))]),
            ApiResponse(responseCode = "404", description = "Command not found.", content = [Content(schema = Schema(implementation = Get400Response::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/"],
        produces = ["application/json"]
    )
    fun rootGet(@NotNull @Parameter(description = "An IPv4 or IPv6 address that you would like to lookup.", required = true) @Valid @RequestParam(value = "ip", required = true) ip: kotlin.Any,@Parameter(description = "Output format, the following formats are supported: plain xml json jsonp php csv serialized") @Valid @RequestParam(value = "format", required = false) format: kotlin.Any?,@Parameter(description = "Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".") @Valid @RequestParam(value = "delimiter", required = false) delimiter: kotlin.Any?): ResponseEntity<Get200Response> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}

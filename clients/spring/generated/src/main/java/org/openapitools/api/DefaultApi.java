/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.9.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Get200Response;
import org.openapitools.model.Get400Response;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-02T22:34:13.629797501Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Validated
@Tag(name = "default", description = "the default API")
public interface DefaultApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET / : Get geolocation of an IP address
     * Retrieve geolocation of an IP address. 
     *
     * @param ip An IPv4 or IPv6 address that you would like to lookup. (required)
     * @param format Output format, the following formats are supported: plain xml json jsonp php csv serialized (optional)
     * @param delimiter Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. (optional)
     * @return Successfully processed the request. (status code 200)
     *         or Failed to complete the request. (status code 400)
     *         or Command not found. (status code 404)
     */
    @Operation(
        operationId = "rootGet",
        summary = "Get geolocation of an IP address",
        description = "Retrieve geolocation of an IP address. ",
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully processed the request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Get200Response.class))
            }),
            @ApiResponse(responseCode = "400", description = "Failed to complete the request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Get400Response.class))
            }),
            @ApiResponse(responseCode = "404", description = "Command not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Get400Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Get200Response> rootGet(
        @NotNull @Parameter(name = "ip", description = "An IPv4 or IPv6 address that you would like to lookup.", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "ip", required = true) String ip,
        @Parameter(name = "format", description = "Output format, the following formats are supported: plain xml json jsonp php csv serialized", in = ParameterIn.QUERY) @Valid @RequestParam(value = "format", required = false) String format,
        @Parameter(name = "delimiter", description = "Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".", in = ParameterIn.QUERY) @Valid @RequestParam(value = "delimiter", required = false) String delimiter
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"response_code\" : \"response_code\", \"ip_version\" : 0, \"response_message\" : \"response_message\", \"ip\" : \"ip\", \"isp\" : \"isp\", \"country_name\" : \"country_name\", \"country_code2\" : \"country_code2\", \"ip_number\" : \"ip_number\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"response_code\" : \"response_code\", \"response_message\" : \"response_message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"response_code\" : \"response_code\", \"response_message\" : \"response_message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}

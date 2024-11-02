package org.openapitools.api;

import org.openapitools.model.Get200Response;
import org.openapitools.model.Get400Response;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("")
@Api(description = "the default API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-02T22:26:56.552406928Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DefaultApi {

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Get geolocation of an IP address", notes = "Retrieve geolocation of an IP address. ", response = Get200Response.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully processed the request.", response = Get200Response.class),
        @ApiResponse(code = 400, message = "Failed to complete the request.", response = Get400Response.class),
        @ApiResponse(code = 404, message = "Command not found.", response = Get400Response.class)
    })
    public Response rootGet(@QueryParam("ip") @NotNull  @ApiParam("An IPv4 or IPv6 address that you would like to lookup.")  String ip,@QueryParam("format")  @ApiParam("Output format, the following formats are supported: plain xml json jsonp php csv serialized")  String format,@QueryParam("delimiter")  @ApiParam("Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;.")  String delimiter) {
        return Response.ok().entity("magic!").build();
    }
}

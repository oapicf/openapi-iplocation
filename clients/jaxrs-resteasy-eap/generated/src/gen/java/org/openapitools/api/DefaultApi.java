package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Get200Response;
import org.openapitools.model.Get400Response;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("")


@io.swagger.annotations.Api(description = "the default API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2025-05-10T04:59:05.748413885Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public interface DefaultApi  {

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get geolocation of an IP address", notes = "Retrieve geolocation of an IP address. ", response = Get200Response.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successfully processed the request.", response = Get200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Failed to complete the request.", response = Get400Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Command not found.", response = Get400Response.class) })
    public Response rootGet( @NotNull @QueryParam("ip") String ip, @QueryParam("format") String format, @QueryParam("delimiter") String delimiter,@Context SecurityContext securityContext);
}

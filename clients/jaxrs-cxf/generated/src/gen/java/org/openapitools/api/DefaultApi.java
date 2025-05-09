package org.openapitools.api;

import org.openapitools.model.Get200Response;
import org.openapitools.model.Get400Response;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * iplocation.net API
 *
 * <p>OpenAPI v3 specification and a set of generated API clients for iplocation.net
 *
 */
@Path("")
@Api(value = "/", description = "")
public interface DefaultApi  {

    /**
     * Get geolocation of an IP address
     *
     * Retrieve geolocation of an IP address. 
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get geolocation of an IP address", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully processed the request.", response = Get200Response.class),
        @ApiResponse(code = 400, message = "Failed to complete the request.", response = Get400Response.class),
        @ApiResponse(code = 404, message = "Command not found.", response = Get400Response.class) })
    public Get200Response rootGet(@QueryParam("ip") @NotNull String ip, @QueryParam("format") String format, @QueryParam("delimiter") String delimiter);
}

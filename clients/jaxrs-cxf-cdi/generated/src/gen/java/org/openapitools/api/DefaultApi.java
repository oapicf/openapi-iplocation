package org.openapitools.api;

import org.openapitools.model.Get200Response;
import org.openapitools.model.Get400Response;
import org.openapitools.api.DefaultApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.PATCH;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("")
@RequestScoped

@Api(description = "the default API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2023-04-02T00:24:55.075139Z[Etc/UTC]")

public class DefaultApi  {

  @Context SecurityContext securityContext;

  @Inject DefaultApiService delegate;


    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get geolocation of an IP address", notes = "Retrieve geolocation of an IP address. ", response = Get200Response.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully processed the request.", response = Get200Response.class),
        @ApiResponse(code = 400, message = "Failed to complete the request.", response = Get400Response.class),
        @ApiResponse(code = 404, message = "Command not found.", response = Get400Response.class) })
    public Response rootGet( @NotNull @ApiParam(value = "An IPv4 or IPv6 address that you would like to lookup.",required=true)  @QueryParam("ip") Object ip, @ApiParam(value = "Output format, the following formats are supported: plain xml json jsonp php csv serialized")  @QueryParam("format") Object format, @ApiParam(value = "Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".")  @QueryParam("delimiter") Object delimiter) {
        return delegate.rootGet(ip, format, delimiter, securityContext);
    }
}

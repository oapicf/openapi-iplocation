package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.DefaultApiService;
import org.openapitools.api.factories.DefaultApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Get200Response;
import org.openapitools.model.Get400Response;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("")


@io.swagger.annotations.Api(description = "the default API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-07-10T08:33:49.022800961Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class DefaultApi  {
   private final DefaultApiService delegate = DefaultApiServiceFactory.getDefaultApi();

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get geolocation of an IP address", notes = "Retrieve geolocation of an IP address. ", response = Get200Response.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successfully processed the request.", response = Get200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Failed to complete the request.", response = Get200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Command not found.", response = Get200Response.class) })
    public Response rootGet(@ApiParam(value = "An IPv4 or IPv6 address that you would like to lookup.",required=true) @QueryParam("ip") String ip
,@ApiParam(value = "Output format, the following formats are supported: plain xml json jsonp php csv serialized") @QueryParam("format") String format
,@ApiParam(value = "Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".") @QueryParam("delimiter") String delimiter
)
    throws NotFoundException {
        return delegate.rootGet(ip,format,delimiter);
    }
}

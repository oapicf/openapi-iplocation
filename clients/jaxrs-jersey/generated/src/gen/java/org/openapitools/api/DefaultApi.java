package org.openapitools.api;

import org.openapitools.api.DefaultApiService;
import org.openapitools.api.factories.DefaultApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Get200Response;
import org.openapitools.model.Get400Response;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("")


@io.swagger.annotations.Api(description = "the default API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-07-10T08:34:34.467840489Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class DefaultApi  {
   private final DefaultApiService delegate;

   public DefaultApi(@Context ServletConfig servletContext) {
      DefaultApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("DefaultApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (DefaultApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = DefaultApiServiceFactory.getDefaultApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get geolocation of an IP address", notes = "Retrieve geolocation of an IP address. ", response = Get200Response.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successfully processed the request.", response = Get200Response.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Failed to complete the request.", response = Get400Response.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Command not found.", response = Get400Response.class)
    })
    public Response rootGet(@ApiParam(value = "An IPv4 or IPv6 address that you would like to lookup.", required = true) @QueryParam("ip") @NotNull  String ip,@ApiParam(value = "Output format, the following formats are supported: plain xml json jsonp php csv serialized") @QueryParam("format")  String format,@ApiParam(value = "Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".") @QueryParam("delimiter")  String delimiter,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.rootGet(ip, format, delimiter, securityContext);
    }
}

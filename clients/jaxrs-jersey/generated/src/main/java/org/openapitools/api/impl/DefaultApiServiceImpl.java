package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.Get200Response;
import org.openapitools.model.Get400Response;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-02T22:26:41.607555201Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DefaultApiServiceImpl extends DefaultApiService {
    @Override
    public Response rootGet( @NotNull String ip, String format, String delimiter, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}

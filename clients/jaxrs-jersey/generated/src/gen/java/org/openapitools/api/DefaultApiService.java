package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.Get200Response;
import org.openapitools.model.Get400Response;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-16T21:36:17.215606986Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public abstract class DefaultApiService {
    public abstract Response rootGet( @NotNull String ip,String format,String delimiter,SecurityContext securityContext) throws NotFoundException;
}
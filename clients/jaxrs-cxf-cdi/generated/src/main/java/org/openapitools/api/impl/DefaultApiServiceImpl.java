package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import org.openapitools.model.Get200Response;
import org.openapitools.model.Get400Response;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-11-02T22:26:36.836035960Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DefaultApiServiceImpl implements DefaultApiService {
      @Override
      public Response rootGet(String ip, String format, String delimiter, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}

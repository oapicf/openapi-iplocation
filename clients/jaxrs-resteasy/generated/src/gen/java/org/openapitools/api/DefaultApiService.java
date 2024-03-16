package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.Get200Response;
import org.openapitools.model.Get400Response;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2023-04-02T00:24:59.590078Z[Etc/UTC]")
public interface DefaultApiService {
      Response rootGet(Object ip,Object format,Object delimiter,SecurityContext securityContext)
      throws NotFoundException;
}

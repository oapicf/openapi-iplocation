package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.Get200Response;
import org.openapitools.model.Get400Response;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-11-02T22:26:46.143119810Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public interface DefaultApiService {
      Response rootGet(String ip,String format,String delimiter,SecurityContext securityContext)
      throws NotFoundException;
}

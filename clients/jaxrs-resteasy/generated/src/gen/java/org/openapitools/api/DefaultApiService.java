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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-07-10T08:34:39.559120604Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public interface DefaultApiService {
      Response rootGet(String ip,String format,String delimiter,SecurityContext securityContext)
      throws NotFoundException;
}

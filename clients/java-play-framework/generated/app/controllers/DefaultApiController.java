package controllers;

import apimodels.Get200Response;
import apimodels.Get400Response;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-04-02T00:24:40.469244Z[Etc/UTC]")
public class DefaultApiController extends Controller {
    private final DefaultApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private DefaultApiController(Config configuration, DefaultApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result rootGet(Http.Request request) throws Exception {
        String valueip = request.getQueryString("ip");
        Object ip;
        if (valueip != null) {
            ip = valueip;
        } else {
            throw new IllegalArgumentException("'ip' parameter is required");
        }
        String valueformat = request.getQueryString("format");
        Object format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        String valuedelimiter = request.getQueryString("delimiter");
        Object delimiter;
        if (valuedelimiter != null) {
            delimiter = valuedelimiter;
        } else {
            delimiter = null;
        }
        return imp.rootGetHttp(request, ip, format, delimiter);
    }

}

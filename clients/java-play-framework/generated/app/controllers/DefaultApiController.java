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
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-02T22:26:07.217339944Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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
        String ip;
        if (valueip != null) {
            ip = valueip;
        } else {
            throw new IllegalArgumentException("'ip' parameter is required");
        }
        String valueformat = request.getQueryString("format");
        String format;
        if (valueformat != null) {
            format = valueformat;
        } else {
            format = null;
        }
        String valuedelimiter = request.getQueryString("delimiter");
        String delimiter;
        if (valuedelimiter != null) {
            delimiter = valuedelimiter;
        } else {
            delimiter = null;
        }
        return imp.rootGetHttp(request, ip, format, delimiter);
    }

}

package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Get200Response;
import org.openapitools.vertxweb.server.model.Get400Response;

import com.fasterxml.jackson.core.type.TypeReference;
import io.vertx.core.json.jackson.DatabindCodec;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.validation.RequestParameters;
import io.vertx.ext.web.validation.RequestParameter;
import io.vertx.ext.web.validation.ValidationHandler;
import io.vertx.ext.web.RoutingContext;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class DefaultApiHandler {

    private static final Logger logger = LoggerFactory.getLogger(DefaultApiHandler.class);

    private final DefaultApi api;

    public DefaultApiHandler(DefaultApi api) {
        this.api = api;
    }

    @Deprecated
    public DefaultApiHandler() {
        this(new DefaultApiImpl());
    }

    public void mount(RouterBuilder builder) {
        builder.operation("rootGet").handler(this::rootGet);
    }

    private void rootGet(RoutingContext routingContext) {
        logger.info("rootGet()");

        // Param extraction
        RequestParameters requestParameters = routingContext.get(ValidationHandler.REQUEST_CONTEXT_KEY);

        Object ip = requestParameters.queryParameter("ip") != null ? requestParameters.queryParameter("ip").getObject() : null;
        Object format = requestParameters.queryParameter("format") != null ? requestParameters.queryParameter("format").getObject() : null;
        Object delimiter = requestParameters.queryParameter("delimiter") != null ? requestParameters.queryParameter("delimiter").getObject() : null;

        logger.debug("Parameter ip is {}", ip);
        logger.debug("Parameter format is {}", format);
        logger.debug("Parameter delimiter is {}", delimiter);

        api.rootGet(ip, format, delimiter)
            .onSuccess(apiResponse -> {
                routingContext.response().setStatusCode(apiResponse.getStatusCode());
                if (apiResponse.hasData()) {
                    routingContext.json(apiResponse.getData());
                } else {
                    routingContext.response().end();
                }
            })
            .onFailure(routingContext::fail);
    }

}

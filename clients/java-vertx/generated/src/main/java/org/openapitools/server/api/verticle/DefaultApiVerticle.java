package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.Get200Response;
import org.openapitools.server.api.model.Get400Response;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class DefaultApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(DefaultApiVerticle.class);

    static final String GET__SERVICE_ID = "GET_";
    
    final DefaultApi service;

    public DefaultApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.DefaultApiImpl");
            service = (DefaultApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("DefaultApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for GET_
        vertx.eventBus().<JsonObject> consumer(GET__SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "GET_";
                JsonObject ipParam = message.body().getJsonObject("ip");
                if (ipParam == null) {
                    manageError(message, new MainApiException(400, "ip is required"), serviceId);
                    return;
                }
                Object ip = Json.mapper.readValue(ipParam.encode(), Object.class);
                JsonObject formatParam = message.body().getJsonObject("format");
                if (formatParam == null) {
                    manageError(message, new MainApiException(400, "format is required"), serviceId);
                    return;
                }
                Object format = Json.mapper.readValue(formatParam.encode(), Object.class);
                JsonObject delimiterParam = message.body().getJsonObject("delimiter");
                if (delimiterParam == null) {
                    manageError(message, new MainApiException(400, "delimiter is required"), serviceId);
                    return;
                }
                Object delimiter = Json.mapper.readValue(delimiterParam.encode(), Object.class);
                service.rootGet(ip, format, delimiter, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "GET_");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("GET_", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
    }

    private void manageError(Message<JsonObject> message, Throwable cause, String serviceName) {
        int code = MainApiException.INTERNAL_SERVER_ERROR.getStatusCode();
        String statusMessage = MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage();
        if (cause instanceof MainApiException) {
            code = ((MainApiException)cause).getStatusCode();
            statusMessage = ((MainApiException)cause).getStatusMessage();
        } else {
            logUnexpectedError(serviceName, cause);
        }

        message.fail(code, statusMessage);
    }

    private void logUnexpectedError(String serviceName, Throwable cause) {
        LOGGER.error("Unexpected error in "+ serviceName, cause);
    }
}

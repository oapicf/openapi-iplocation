package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Get200Response;
import org.openapitools.vertxweb.server.model.Get400Response;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface DefaultApi  {
    Future<ApiResponse<Get200Response>> rootGet(String ip, String format, String delimiter);
}

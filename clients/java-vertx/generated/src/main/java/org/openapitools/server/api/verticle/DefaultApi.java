package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Get200Response;
import org.openapitools.server.api.model.Get400Response;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface DefaultApi  {
    //GET_
    void rootGet(String ip, String format, String delimiter, Handler<AsyncResult<Get200Response>> handler);

}

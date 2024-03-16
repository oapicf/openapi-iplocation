package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Get200Response;
import org.openapitools.server.api.model.Get400Response;
import org.openapitools.server.api.MainApiException;

public final class DefaultApiException extends MainApiException {
    public DefaultApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final DefaultApiException Default_rootGet_200_Exception = new DefaultApiException(200, "Successfully processed the request.");
    public static final DefaultApiException Default_rootGet_400_Exception = new DefaultApiException(400, "Failed to complete the request.");
    public static final DefaultApiException Default_rootGet_404_Exception = new DefaultApiException(404, "Command not found.");
    

}
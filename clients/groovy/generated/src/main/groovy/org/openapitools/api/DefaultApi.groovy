package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Get200Response
import org.openapitools.model.Get400Response

class DefaultApi {
    String basePath = "https://api.iplocation.net"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def rootGet ( Object ip, Object format, Object delimiter, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (ip == null) {
            throw new RuntimeException("missing required params ip")
        }

        if (ip != null) {
            queryParams.put("ip", ip)
        }
        if (format != null) {
            queryParams.put("format", format)
        }
        if (delimiter != null) {
            queryParams.put("delimiter", delimiter)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Get200Response.class )

    }

}

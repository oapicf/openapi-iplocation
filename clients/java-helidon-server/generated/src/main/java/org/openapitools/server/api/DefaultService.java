package org.openapitools.server.api;

import org.openapitools.server.model.Get200Response;
import org.openapitools.server.model.Get400Response;
import java.util.HexFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import io.helidon.http.Status;

import io.helidon.webserver.http.HttpRules;
import io.helidon.webserver.http.ServerRequest;
import io.helidon.webserver.http.ServerResponse;
import io.helidon.webserver.http.HttpService;

@io.helidon.common.Generated(value = "org.openapitools.codegen.languages.JavaHelidonServerCodegen",
                             trigger = "tag = 'Default'",
                             version = "7.24.0")
public interface DefaultService extends HttpService {

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void routing(HttpRules rules) {
        rules.get("/", this::rootGet);
    }


    /**
     * GET / : Get geolocation of an IP address.
     *
     * @param request the server request
     * @param response the server response
     */
    void rootGet(ServerRequest request, ServerResponse response);
}

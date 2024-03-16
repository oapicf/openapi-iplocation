package org.openapitools.controller;

import org.openapitools.model.Get200Response;
import org.openapitools.model.Get400Response;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for DefaultController
 */
@MicronautTest
public class DefaultControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    DefaultController controller;

    /**
     * This test is used to validate the implementation of rootGet() method
     *
     * The method should: Get geolocation of an IP address
     *
     * Retrieve geolocation of an IP address. 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void rootGetMethodTest() {
        // given
        Object ip = null;
        Object _format = null;
        Object delimiter = null;

        // when
        Get200Response result = controller.rootGet(ip, _format, delimiter).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/' to the features of rootGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void rootGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("application/json");
        request.getParameters()
            .add("ip", String.valueOf(null)) // The query parameter format should be 
            .add("format", String.valueOf(null)) // The query parameter format should be 
            .add("delimiter", String.valueOf(null)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Get200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}

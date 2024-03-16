package org.openapitools.api;

import org.openapitools.model.Get200Response;
import org.openapitools.model.Get400Response;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for DefaultApi
 */
@MicronautTest
public class DefaultApiTest {

    @Inject
    DefaultApi api;

    
    /**
     * Get geolocation of an IP address
     *
     * Retrieve geolocation of an IP address. 
     */
    @Test
    @Disabled("Not Implemented")
    public void rootGetTest() {
        // given
        Object ip = null;
        Object _format = null;
        Object delimiter = null;

        // when
        Get200Response body = api.rootGet(ip, _format, delimiter).block();

        // then
        // TODO implement the rootGetTest()
    }

    
}

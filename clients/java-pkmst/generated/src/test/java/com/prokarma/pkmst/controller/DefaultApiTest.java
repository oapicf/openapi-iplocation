/*
 * iplocation.net API
 * OpenAPI v3 specification and a set of generated API clients for iplocation.net
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.prokarma.pkmst.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.prokarma.pkmst.model.Get200Response;
import com.prokarma.pkmst.model.Get400Response;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final DefaultApi api = new DefaultApiController(objectMapper);

    private final String accept = "application/json";

    
    /**
     * Get geolocation of an IP address
     *
     * Retrieve geolocation of an IP address. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void rootGetTest() throws Exception {
        String ip = null;
        String format = null;
        String delimiter = null;
    ResponseEntity<Get200Response> response = api.rootGet(ip, format, delimiter , accept);

        // TODO: test validations
    }
    
}

package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Get200Response;
import com.prokarma.pkmst.model.Get400Response;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implementation
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-02T22:26:02.843268540Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Controller
public class DefaultApiController implements DefaultApi {
    private final ObjectMapper objectMapper;
@Autowired
    public DefaultApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Get200Response> rootGet(@ApiParam(value = "An IPv4 or IPv6 address that you would like to lookup.", required = true)  @RequestParam(value = "ip", required = true) String ip,
        @ApiParam(value = "Output format, the following formats are supported: plain xml json jsonp php csv serialized")  @RequestParam(value = "format", required = false) String format,
        @ApiParam(value = "Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".")  @RequestParam(value = "delimiter", required = false) String delimiter,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Get200Response>(objectMapper.readValue("", Get200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Get200Response>(objectMapper.readValue("", Get200Response.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Get200Response>(objectMapper.readValue("", Get200Response.class), HttpStatus.OK);
        }

        return new ResponseEntity<Get200Response>(HttpStatus.OK);
    }

}

/**
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.6.0).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.api;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.stereotype.Component;
import org.openapitools.model.*;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.LoggingLevel;

@Component
public class DefaultApi extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        

        /**
        GET / : Get geolocation of an IP address
        **/
        rest()
            .get("/")
                .description("Get geolocation of an IP address")
                .id("rootGetApi")
                .produces("application/json")
                .outType(Get200Response.class)
                .param()
                    .name("ip")
                    .type(RestParamType.query)
                    .required(true)
                    .description("An IPv4 or IPv6 address that you would like to lookup.")
                .endParam()
                .param()
                    .name("format")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Output format, the following formats are supported: plain xml json jsonp php csv serialized")
                .endParam()
                .param()
                    .name("delimiter")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".")
                .endParam()
                .to("direct:rootGet");
        
    }
}

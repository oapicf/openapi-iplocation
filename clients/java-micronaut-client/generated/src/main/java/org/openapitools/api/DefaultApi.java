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

package org.openapitools.api;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.*;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.core.convert.format.Format;
import reactor.core.publisher.Mono;
import org.openapitools.model.Get200Response;
import org.openapitools.model.Get400Response;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-07-10T08:33:36.722295102Z[Etc/UTC]", comments = "Generator version: 7.6.0")
@Client("${openapi-micronaut-client-base-path}")
public interface DefaultApi {
    /**
     * Get geolocation of an IP address
     * Retrieve geolocation of an IP address. 
     *
     * @param ip An IPv4 or IPv6 address that you would like to lookup. (required)
     * @param _format Output format, the following formats are supported: plain xml json jsonp php csv serialized (optional)
     * @param delimiter Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. (optional)
     * @return Get200Response
     */
    @Get(uri="/")
    @Consumes({"application/json"})
    Mono<Get200Response> rootGet(
        @QueryValue(value="ip") @NotNull String ip, 
        @QueryValue(value="format") @Nullable String _format, 
        @QueryValue(value="delimiter") @Nullable String delimiter
    );

}

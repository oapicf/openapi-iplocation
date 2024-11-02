/*
 * iplocation.net API
 *
 * OpenAPI v3 specification and a set of generated API clients for iplocation.net
 *
 * OpenAPI document version: 1.0.1-pre.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.handler;

import io.undertow.server.*;
import io.undertow.util.*;

import org.openapitools.model.*;

@SuppressWarnings("TooManyFunctions")
public interface PathHandlerInterface {

    /**
     * <p>Get geolocation of an IP address</p>
     *
     * <p>Retrieve geolocation of an IP address. </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ip</b>"
     * <p>An IPv4 or IPv6 address that you would like to lookup.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>format</b>"
     * <p>Output format, the following formats are supported: plain xml json jsonp php csv serialized</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>delimiter</b>"
     * <p>Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Get200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Successfully processed the request.</li>
     * <li><b>400 (client error)</b>: Failed to complete the request.</li>
     * <li><b>404 (client error)</b>: Command not found.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler rootGet();
}

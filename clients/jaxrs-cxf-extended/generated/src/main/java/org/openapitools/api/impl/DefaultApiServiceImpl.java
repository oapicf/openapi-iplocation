package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.Get200Response;
import org.openapitools.model.Get400Response;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * iplocation.net API
 *
 * <p>No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 */
public class DefaultApiServiceImpl implements DefaultApi {
    /**
     * Get geolocation of an IP address
     *
     * Retrieve geolocation of an IP address. 
     *
     */
    @Override
    public Get200Response rootGet(Object ip, Object format, Object delimiter) {
        // TODO: Implement...
        return null;
    }

}

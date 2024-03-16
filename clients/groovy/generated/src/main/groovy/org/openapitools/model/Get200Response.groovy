package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class Get200Response {
    /* IPv4 or IPv6 address used to lookup geolocation. */
    Object ip = null
    /* IP number in long integer. */
    Object ipNumber = null
    /* IP version either 4 or 6. */
    Object ipVersion = null
    /* Full name of the IP country. */
    Object countryName = null
    /* ISO ALPHA-2 Country Code. */
    Object countryCode2 = null
    /* Internet Service Provider (ISP) who owns the IP address. */
    Object isp = null
    /* Response status code to indicate success or failed completion of the API call. */
    Object responseCode = null
    /* Response message to indicate success or failed completion of the API call. */
    Object responseMessage = null
}

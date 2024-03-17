package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Int64;

@Canonical
class Get200Response {
    /* IPv4 or IPv6 address used to lookup geolocation. */
    String ip
    /* IP number in long integer. */
    Int64 ipNumber = null
    /* IP version either 4 or 6. */
    Integer ipVersion
    /* Full name of the IP country. */
    String countryName
    /* ISO ALPHA-2 Country Code. */
    String countryCode2
    /* Internet Service Provider (ISP) who owns the IP address. */
    String isp
    /* Response status code to indicate success or failed completion of the API call. */
    String responseCode
    /* Response message to indicate success or failed completion of the API call. */
    String responseMessage
}

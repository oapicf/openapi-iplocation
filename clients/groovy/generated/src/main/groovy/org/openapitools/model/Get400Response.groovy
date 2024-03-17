package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class Get400Response {
    /* Response status code to indicate success or failed completion of the API call. */
    String responseCode
    /* Response message to indicate success or failed completion of the API call. */
    String responseMessage
}

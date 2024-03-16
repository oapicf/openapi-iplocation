package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class Get400Response {
    /* Response status code to indicate success or failed completion of the API call. */
    Object responseCode = null
    /* Response message to indicate success or failed completion of the API call. */
    Object responseMessage = null
}

/*
 * iplocation.net API
 * OpenAPI v3 specification and a set of generated API clients for iplocation.net
 *
 * The version of the OpenAPI document: 1.0.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Get400Response
 */
@JsonPropertyOrder({
  Get400Response.JSON_PROPERTY_RESPONSE_CODE,
  Get400Response.JSON_PROPERTY_RESPONSE_MESSAGE
})
@JsonTypeName("__get_400_response")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-02T22:25:51.826890678Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class Get400Response {
    public static final String JSON_PROPERTY_RESPONSE_CODE = "response_code";
    private String responseCode;

    public static final String JSON_PROPERTY_RESPONSE_MESSAGE = "response_message";
    private String responseMessage;

    public Get400Response() {
    }

    public Get400Response responseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    /**
     * Response status code to indicate success or failed completion of the API call.
     * @return responseCode
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_RESPONSE_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getResponseCode() {
        return responseCode;
    }

    @JsonProperty(JSON_PROPERTY_RESPONSE_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public Get400Response responseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
        return this;
    }

    /**
     * Response message to indicate success or failed completion of the API call.
     * @return responseMessage
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_RESPONSE_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getResponseMessage() {
        return responseMessage;
    }

    @JsonProperty(JSON_PROPERTY_RESPONSE_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Get400Response get400Response = (Get400Response) o;
        return Objects.equals(this.responseCode, get400Response.responseCode) &&
            Objects.equals(this.responseMessage, get400Response.responseMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseCode, responseMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Get400Response {\n");
        sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
        sb.append("    responseMessage: ").append(toIndentedString(responseMessage)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}


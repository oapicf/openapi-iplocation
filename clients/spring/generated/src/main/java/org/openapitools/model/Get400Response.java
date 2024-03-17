package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Get400Response
 */

@JsonTypeName("__get_400_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-16T21:38:45.888909540Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Get400Response {

  private String responseCode;

  private String responseMessage;

  public Get400Response responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  /**
   * Response status code to indicate success or failed completion of the API call.
   * @return responseCode
  */
  
  @Schema(name = "response_code", description = "Response status code to indicate success or failed completion of the API call.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("response_code")
  public String getResponseCode() {
    return responseCode;
  }

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
  
  @Schema(name = "response_message", description = "Response message to indicate success or failed completion of the API call.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("response_message")
  public String getResponseMessage() {
    return responseMessage;
  }

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


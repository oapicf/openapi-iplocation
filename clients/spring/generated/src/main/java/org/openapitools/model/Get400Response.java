package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Get400Response
 */

@JsonTypeName("__get_400_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-15T05:02:00.432570964Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class Get400Response {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String responseCode;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String responseMessage;

  public Get400Response responseCode(@Nullable String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  /**
   * Response status code to indicate success or failed completion of the API call.
   * @return responseCode
   */
  
  @Schema(name = "response_code", description = "Response status code to indicate success or failed completion of the API call.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("response_code")
  public @Nullable String getResponseCode() {
    return responseCode;
  }

  @JsonProperty("response_code")
  public void setResponseCode(@Nullable String responseCode) {
    this.responseCode = responseCode;
  }

  public Get400Response responseMessage(@Nullable String responseMessage) {
    this.responseMessage = responseMessage;
    return this;
  }

  /**
   * Response message to indicate success or failed completion of the API call.
   * @return responseMessage
   */
  
  @Schema(name = "response_message", description = "Response message to indicate success or failed completion of the API call.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("response_message")
  public @Nullable String getResponseMessage() {
    return responseMessage;
  }

  @JsonProperty("response_message")
  public void setResponseMessage(@Nullable String responseMessage) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


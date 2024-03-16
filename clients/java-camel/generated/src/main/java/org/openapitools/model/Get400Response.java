package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
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
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2023-04-02T00:24:48.867024Z[Etc/UTC]")
public class Get400Response {

  @JsonProperty("response_code")
  private JsonNullable<Object> responseCode = JsonNullable.undefined();

  @JsonProperty("response_message")
  private JsonNullable<Object> responseMessage = JsonNullable.undefined();

  public Get400Response responseCode(Object responseCode) {
    this.responseCode = JsonNullable.of(responseCode);
    return this;
  }

  /**
   * Response status code to indicate success or failed completion of the API call.
   * @return responseCode
  */
  
  @Schema(name = "response_code", description = "Response status code to indicate success or failed completion of the API call.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(JsonNullable<Object> responseCode) {
    this.responseCode = responseCode;
  }

  public Get400Response responseMessage(Object responseMessage) {
    this.responseMessage = JsonNullable.of(responseMessage);
    return this;
  }

  /**
   * Response message to indicate success or failed completion of the API call.
   * @return responseMessage
  */
  
  @Schema(name = "response_message", description = "Response message to indicate success or failed completion of the API call.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getResponseMessage() {
    return responseMessage;
  }

  public void setResponseMessage(JsonNullable<Object> responseMessage) {
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
    return equalsNullable(this.responseCode, get400Response.responseCode) &&
        equalsNullable(this.responseMessage, get400Response.responseMessage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(responseCode), hashCodeNullable(responseMessage));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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


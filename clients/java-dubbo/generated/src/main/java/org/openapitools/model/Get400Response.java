package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class Get400Response implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Response status code to indicate success or failed completion of the API call.
   */
  @JsonProperty("response_code")
  private String responseCode;

  /**
   * Response message to indicate success or failed completion of the API call.
   */
  @JsonProperty("response_message")
  private String responseMessage;

  /**
   * Response status code to indicate success or failed completion of the API call.
   * @return responseCode
   */
  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  /**
   * Response message to indicate success or failed completion of the API call.
   * @return responseMessage
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

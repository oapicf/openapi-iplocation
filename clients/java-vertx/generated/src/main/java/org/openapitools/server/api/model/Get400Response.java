package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Get400Response   {
  
  private String responseCode;
  private String responseMessage;

  public Get400Response () {

  }

  public Get400Response (String responseCode, String responseMessage) {
    this.responseCode = responseCode;
    this.responseMessage = responseMessage;
  }

    
  @JsonProperty("response_code")
  public String getResponseCode() {
    return responseCode;
  }
  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

    
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
    return Objects.equals(responseCode, get400Response.responseCode) &&
        Objects.equals(responseMessage, get400Response.responseMessage);
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

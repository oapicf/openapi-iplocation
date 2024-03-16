package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Get400Response  {
  
  @ApiModelProperty(value = "Response status code to indicate success or failed completion of the API call.")
 /**
   * Response status code to indicate success or failed completion of the API call.
  **/
  private Object responseCode = null;

  @ApiModelProperty(value = "Response message to indicate success or failed completion of the API call.")
 /**
   * Response message to indicate success or failed completion of the API call.
  **/
  private Object responseMessage = null;
 /**
   * Response status code to indicate success or failed completion of the API call.
   * @return responseCode
  **/
  @JsonProperty("response_code")
  public Object getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(Object responseCode) {
    this.responseCode = responseCode;
  }

  public Get400Response responseCode(Object responseCode) {
    this.responseCode = responseCode;
    return this;
  }

 /**
   * Response message to indicate success or failed completion of the API call.
   * @return responseMessage
  **/
  @JsonProperty("response_message")
  public Object getResponseMessage() {
    return responseMessage;
  }

  public void setResponseMessage(Object responseMessage) {
    this.responseMessage = responseMessage;
  }

  public Get400Response responseMessage(Object responseMessage) {
    this.responseMessage = responseMessage;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


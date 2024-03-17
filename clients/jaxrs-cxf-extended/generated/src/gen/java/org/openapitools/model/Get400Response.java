package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Get400Response  {
  
 /**
  * Response status code to indicate success or failed completion of the API call.
  */
  @ApiModelProperty(value = "Response status code to indicate success or failed completion of the API call.")
  private String responseCode;

 /**
  * Response message to indicate success or failed completion of the API call.
  */
  @ApiModelProperty(value = "Response message to indicate success or failed completion of the API call.")
  private String responseMessage;
 /**
  * Response status code to indicate success or failed completion of the API call.
  * @return responseCode
  */
  @JsonProperty("response_code")
  public String getResponseCode() {
    return responseCode;
  }

  /**
   * Sets the <code>responseCode</code> property.
   */
 public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  /**
   * Sets the <code>responseCode</code> property.
   */
  public Get400Response responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

 /**
  * Response message to indicate success or failed completion of the API call.
  * @return responseMessage
  */
  @JsonProperty("response_message")
  public String getResponseMessage() {
    return responseMessage;
  }

  /**
   * Sets the <code>responseMessage</code> property.
   */
 public void setResponseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
  }

  /**
   * Sets the <code>responseMessage</code> property.
   */
  public Get400Response responseMessage(String responseMessage) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


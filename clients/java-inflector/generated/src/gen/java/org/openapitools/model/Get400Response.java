package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-02T22:25:47.532937070Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class Get400Response   {
  @JsonProperty("response_code")
  private String responseCode;

  @JsonProperty("response_message")
  private String responseMessage;

  /**
   * Response status code to indicate success or failed completion of the API call.
   **/
  public Get400Response responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  
  @ApiModelProperty(value = "Response status code to indicate success or failed completion of the API call.")
  @JsonProperty("response_code")
  public String getResponseCode() {
    return responseCode;
  }
  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  /**
   * Response message to indicate success or failed completion of the API call.
   **/
  public Get400Response responseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
    return this;
  }

  
  @ApiModelProperty(value = "Response message to indicate success or failed completion of the API call.")
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


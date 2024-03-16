package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2023-04-02T00:25:01.657618Z[Etc/UTC]")
public class Get400Response   {
  
  private Object responseCode = null;
  private Object responseMessage = null;

  /**
   * Response status code to indicate success or failed completion of the API call.
   **/
  
  @ApiModelProperty(value = "Response status code to indicate success or failed completion of the API call.")
  @JsonProperty("response_code")
  public Object getResponseCode() {
    return responseCode;
  }
  public void setResponseCode(Object responseCode) {
    this.responseCode = responseCode;
  }

  /**
   * Response message to indicate success or failed completion of the API call.
   **/
  
  @ApiModelProperty(value = "Response message to indicate success or failed completion of the API call.")
  @JsonProperty("response_message")
  public Object getResponseMessage() {
    return responseMessage;
  }
  public void setResponseMessage(Object responseMessage) {
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


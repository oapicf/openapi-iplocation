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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2023-04-02T00:24:59.590078Z[Etc/UTC]")
public class Get200Response   {
  
  private Object ip = null;
  private Object ipNumber = null;
  private Object ipVersion = null;
  private Object countryName = null;
  private Object countryCode2 = null;
  private Object isp = null;
  private Object responseCode = null;
  private Object responseMessage = null;

  /**
   * IPv4 or IPv6 address used to lookup geolocation.
   **/
  
  @ApiModelProperty(value = "IPv4 or IPv6 address used to lookup geolocation.")
  @JsonProperty("ip")
  public Object getIp() {
    return ip;
  }
  public void setIp(Object ip) {
    this.ip = ip;
  }

  /**
   * IP number in long integer.
   **/
  
  @ApiModelProperty(value = "IP number in long integer.")
  @JsonProperty("ip_number")
  public Object getIpNumber() {
    return ipNumber;
  }
  public void setIpNumber(Object ipNumber) {
    this.ipNumber = ipNumber;
  }

  /**
   * IP version either 4 or 6.
   **/
  
  @ApiModelProperty(value = "IP version either 4 or 6.")
  @JsonProperty("ip_version")
  public Object getIpVersion() {
    return ipVersion;
  }
  public void setIpVersion(Object ipVersion) {
    this.ipVersion = ipVersion;
  }

  /**
   * Full name of the IP country.
   **/
  
  @ApiModelProperty(value = "Full name of the IP country.")
  @JsonProperty("country_name")
  public Object getCountryName() {
    return countryName;
  }
  public void setCountryName(Object countryName) {
    this.countryName = countryName;
  }

  /**
   * ISO ALPHA-2 Country Code.
   **/
  
  @ApiModelProperty(value = "ISO ALPHA-2 Country Code.")
  @JsonProperty("country_code2")
  public Object getCountryCode2() {
    return countryCode2;
  }
  public void setCountryCode2(Object countryCode2) {
    this.countryCode2 = countryCode2;
  }

  /**
   * Internet Service Provider (ISP) who owns the IP address.
   **/
  
  @ApiModelProperty(value = "Internet Service Provider (ISP) who owns the IP address.")
  @JsonProperty("isp")
  public Object getIsp() {
    return isp;
  }
  public void setIsp(Object isp) {
    this.isp = isp;
  }

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
    Get200Response get200Response = (Get200Response) o;
    return Objects.equals(ip, get200Response.ip) &&
        Objects.equals(ipNumber, get200Response.ipNumber) &&
        Objects.equals(ipVersion, get200Response.ipVersion) &&
        Objects.equals(countryName, get200Response.countryName) &&
        Objects.equals(countryCode2, get200Response.countryCode2) &&
        Objects.equals(isp, get200Response.isp) &&
        Objects.equals(responseCode, get200Response.responseCode) &&
        Objects.equals(responseMessage, get200Response.responseMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ip, ipNumber, ipVersion, countryName, countryCode2, isp, responseCode, responseMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Get200Response {\n");
    
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    ipNumber: ").append(toIndentedString(ipNumber)).append("\n");
    sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    countryCode2: ").append(toIndentedString(countryCode2)).append("\n");
    sb.append("    isp: ").append(toIndentedString(isp)).append("\n");
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


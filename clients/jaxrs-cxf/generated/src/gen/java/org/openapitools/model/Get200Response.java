package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Get200Response  {
  
  @ApiModelProperty(value = "IPv4 or IPv6 address used to lookup geolocation.")
 /**
   * IPv4 or IPv6 address used to lookup geolocation.
  **/
  private Object ip = null;

  @ApiModelProperty(value = "IP number in long integer.")
 /**
   * IP number in long integer.
  **/
  private Object ipNumber = null;

  @ApiModelProperty(value = "IP version either 4 or 6.")
 /**
   * IP version either 4 or 6.
  **/
  private Object ipVersion = null;

  @ApiModelProperty(value = "Full name of the IP country.")
 /**
   * Full name of the IP country.
  **/
  private Object countryName = null;

  @ApiModelProperty(value = "ISO ALPHA-2 Country Code.")
 /**
   * ISO ALPHA-2 Country Code.
  **/
  private Object countryCode2 = null;

  @ApiModelProperty(value = "Internet Service Provider (ISP) who owns the IP address.")
 /**
   * Internet Service Provider (ISP) who owns the IP address.
  **/
  private Object isp = null;

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
   * IPv4 or IPv6 address used to lookup geolocation.
   * @return ip
  **/
  @JsonProperty("ip")
  public Object getIp() {
    return ip;
  }

  public void setIp(Object ip) {
    this.ip = ip;
  }

  public Get200Response ip(Object ip) {
    this.ip = ip;
    return this;
  }

 /**
   * IP number in long integer.
   * @return ipNumber
  **/
  @JsonProperty("ip_number")
  public Object getIpNumber() {
    return ipNumber;
  }

  public void setIpNumber(Object ipNumber) {
    this.ipNumber = ipNumber;
  }

  public Get200Response ipNumber(Object ipNumber) {
    this.ipNumber = ipNumber;
    return this;
  }

 /**
   * IP version either 4 or 6.
   * @return ipVersion
  **/
  @JsonProperty("ip_version")
  public Object getIpVersion() {
    return ipVersion;
  }

  public void setIpVersion(Object ipVersion) {
    this.ipVersion = ipVersion;
  }

  public Get200Response ipVersion(Object ipVersion) {
    this.ipVersion = ipVersion;
    return this;
  }

 /**
   * Full name of the IP country.
   * @return countryName
  **/
  @JsonProperty("country_name")
  public Object getCountryName() {
    return countryName;
  }

  public void setCountryName(Object countryName) {
    this.countryName = countryName;
  }

  public Get200Response countryName(Object countryName) {
    this.countryName = countryName;
    return this;
  }

 /**
   * ISO ALPHA-2 Country Code.
   * @return countryCode2
  **/
  @JsonProperty("country_code2")
  public Object getCountryCode2() {
    return countryCode2;
  }

  public void setCountryCode2(Object countryCode2) {
    this.countryCode2 = countryCode2;
  }

  public Get200Response countryCode2(Object countryCode2) {
    this.countryCode2 = countryCode2;
    return this;
  }

 /**
   * Internet Service Provider (ISP) who owns the IP address.
   * @return isp
  **/
  @JsonProperty("isp")
  public Object getIsp() {
    return isp;
  }

  public void setIsp(Object isp) {
    this.isp = isp;
  }

  public Get200Response isp(Object isp) {
    this.isp = isp;
    return this;
  }

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

  public Get200Response responseCode(Object responseCode) {
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

  public Get200Response responseMessage(Object responseMessage) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


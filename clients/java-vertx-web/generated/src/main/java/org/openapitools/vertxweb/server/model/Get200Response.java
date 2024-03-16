package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Get200Response   {
  
  private Object ip = null;
  private Object ipNumber = null;
  private Object ipVersion = null;
  private Object countryName = null;
  private Object countryCode2 = null;
  private Object isp = null;
  private Object responseCode = null;
  private Object responseMessage = null;

  public Get200Response () {

  }

  public Get200Response (Object ip, Object ipNumber, Object ipVersion, Object countryName, Object countryCode2, Object isp, Object responseCode, Object responseMessage) {
    this.ip = ip;
    this.ipNumber = ipNumber;
    this.ipVersion = ipVersion;
    this.countryName = countryName;
    this.countryCode2 = countryCode2;
    this.isp = isp;
    this.responseCode = responseCode;
    this.responseMessage = responseMessage;
  }

    
  @JsonProperty("ip")
  public Object getIp() {
    return ip;
  }
  public void setIp(Object ip) {
    this.ip = ip;
  }

    
  @JsonProperty("ip_number")
  public Object getIpNumber() {
    return ipNumber;
  }
  public void setIpNumber(Object ipNumber) {
    this.ipNumber = ipNumber;
  }

    
  @JsonProperty("ip_version")
  public Object getIpVersion() {
    return ipVersion;
  }
  public void setIpVersion(Object ipVersion) {
    this.ipVersion = ipVersion;
  }

    
  @JsonProperty("country_name")
  public Object getCountryName() {
    return countryName;
  }
  public void setCountryName(Object countryName) {
    this.countryName = countryName;
  }

    
  @JsonProperty("country_code2")
  public Object getCountryCode2() {
    return countryCode2;
  }
  public void setCountryCode2(Object countryCode2) {
    this.countryCode2 = countryCode2;
  }

    
  @JsonProperty("isp")
  public Object getIsp() {
    return isp;
  }
  public void setIsp(Object isp) {
    this.isp = isp;
  }

    
  @JsonProperty("response_code")
  public Object getResponseCode() {
    return responseCode;
  }
  public void setResponseCode(Object responseCode) {
    this.responseCode = responseCode;
  }

    
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

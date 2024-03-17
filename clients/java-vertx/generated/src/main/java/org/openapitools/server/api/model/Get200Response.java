package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.Int64;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Get200Response   {
  
  private String ip;
  private Int64 ipNumber = null;
  private Integer ipVersion;
  private String countryName;
  private String countryCode2;
  private String isp;
  private String responseCode;
  private String responseMessage;

  public Get200Response () {

  }

  public Get200Response (String ip, Int64 ipNumber, Integer ipVersion, String countryName, String countryCode2, String isp, String responseCode, String responseMessage) {
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
  public String getIp() {
    return ip;
  }
  public void setIp(String ip) {
    this.ip = ip;
  }

    
  @JsonProperty("ip_number")
  public Int64 getIpNumber() {
    return ipNumber;
  }
  public void setIpNumber(Int64 ipNumber) {
    this.ipNumber = ipNumber;
  }

    
  @JsonProperty("ip_version")
  public Integer getIpVersion() {
    return ipVersion;
  }
  public void setIpVersion(Integer ipVersion) {
    this.ipVersion = ipVersion;
  }

    
  @JsonProperty("country_name")
  public String getCountryName() {
    return countryName;
  }
  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

    
  @JsonProperty("country_code2")
  public String getCountryCode2() {
    return countryCode2;
  }
  public void setCountryCode2(String countryCode2) {
    this.countryCode2 = countryCode2;
  }

    
  @JsonProperty("isp")
  public String getIsp() {
    return isp;
  }
  public void setIsp(String isp) {
    this.isp = isp;
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

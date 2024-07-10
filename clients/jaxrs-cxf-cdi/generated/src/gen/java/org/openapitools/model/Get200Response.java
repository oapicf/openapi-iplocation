package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class Get200Response   {
  
  private String ip;

  private String ipNumber;

  private Integer ipVersion;

  private String countryName;

  private String countryCode2;

  private String isp;

  private String responseCode;

  private String responseMessage;

  /**
   * IPv4 or IPv6 address used to lookup geolocation.
   **/
  public Get200Response ip(String ip) {
    this.ip = ip;
    return this;
  }

  
  @ApiModelProperty(value = "IPv4 or IPv6 address used to lookup geolocation.")
  @JsonProperty("ip")
  public String getIp() {
    return ip;
  }
  public void setIp(String ip) {
    this.ip = ip;
  }


  /**
   * IP number in long integer (represented as string).
   **/
  public Get200Response ipNumber(String ipNumber) {
    this.ipNumber = ipNumber;
    return this;
  }

  
  @ApiModelProperty(value = "IP number in long integer (represented as string).")
  @JsonProperty("ip_number")
  public String getIpNumber() {
    return ipNumber;
  }
  public void setIpNumber(String ipNumber) {
    this.ipNumber = ipNumber;
  }


  /**
   * IP version either 4 or 6.
   **/
  public Get200Response ipVersion(Integer ipVersion) {
    this.ipVersion = ipVersion;
    return this;
  }

  
  @ApiModelProperty(value = "IP version either 4 or 6.")
  @JsonProperty("ip_version")
  public Integer getIpVersion() {
    return ipVersion;
  }
  public void setIpVersion(Integer ipVersion) {
    this.ipVersion = ipVersion;
  }


  /**
   * Full name of the IP country.
   **/
  public Get200Response countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

  
  @ApiModelProperty(value = "Full name of the IP country.")
  @JsonProperty("country_name")
  public String getCountryName() {
    return countryName;
  }
  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }


  /**
   * ISO ALPHA-2 Country Code.
   **/
  public Get200Response countryCode2(String countryCode2) {
    this.countryCode2 = countryCode2;
    return this;
  }

  
  @ApiModelProperty(value = "ISO ALPHA-2 Country Code.")
  @JsonProperty("country_code2")
  public String getCountryCode2() {
    return countryCode2;
  }
  public void setCountryCode2(String countryCode2) {
    this.countryCode2 = countryCode2;
  }


  /**
   * Internet Service Provider (ISP) who owns the IP address.
   **/
  public Get200Response isp(String isp) {
    this.isp = isp;
    return this;
  }

  
  @ApiModelProperty(value = "Internet Service Provider (ISP) who owns the IP address.")
  @JsonProperty("isp")
  public String getIsp() {
    return isp;
  }
  public void setIsp(String isp) {
    this.isp = isp;
  }


  /**
   * Response status code to indicate success or failed completion of the API call.
   **/
  public Get200Response responseCode(String responseCode) {
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
  public Get200Response responseMessage(String responseMessage) {
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
    Get200Response get200Response = (Get200Response) o;
    return Objects.equals(this.ip, get200Response.ip) &&
        Objects.equals(this.ipNumber, get200Response.ipNumber) &&
        Objects.equals(this.ipVersion, get200Response.ipVersion) &&
        Objects.equals(this.countryName, get200Response.countryName) &&
        Objects.equals(this.countryCode2, get200Response.countryCode2) &&
        Objects.equals(this.isp, get200Response.isp) &&
        Objects.equals(this.responseCode, get200Response.responseCode) &&
        Objects.equals(this.responseMessage, get200Response.responseMessage);
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


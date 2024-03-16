package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Get200Response
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2023-04-02T00:24:38.016308Z[Etc/UTC]")
public class Get200Response   {
  @JsonProperty("ip")
  private Object ip = null;

  @JsonProperty("ip_number")
  private Object ipNumber = null;

  @JsonProperty("ip_version")
  private Object ipVersion = null;

  @JsonProperty("country_name")
  private Object countryName = null;

  @JsonProperty("country_code2")
  private Object countryCode2 = null;

  @JsonProperty("isp")
  private Object isp = null;

  @JsonProperty("response_code")
  private Object responseCode = null;

  @JsonProperty("response_message")
  private Object responseMessage = null;

  public Get200Response ip(Object ip) {
    this.ip = ip;
    return this;
  }

   /**
   * IPv4 or IPv6 address used to lookup geolocation.
   * @return ip
  **/
  @ApiModelProperty(value = "IPv4 or IPv6 address used to lookup geolocation.")
  public Object getIp() {
    return ip;
  }

  public void setIp(Object ip) {
    this.ip = ip;
  }

  public Get200Response ipNumber(Object ipNumber) {
    this.ipNumber = ipNumber;
    return this;
  }

   /**
   * IP number in long integer.
   * @return ipNumber
  **/
  @ApiModelProperty(value = "IP number in long integer.")
  public Object getIpNumber() {
    return ipNumber;
  }

  public void setIpNumber(Object ipNumber) {
    this.ipNumber = ipNumber;
  }

  public Get200Response ipVersion(Object ipVersion) {
    this.ipVersion = ipVersion;
    return this;
  }

   /**
   * IP version either 4 or 6.
   * @return ipVersion
  **/
  @ApiModelProperty(value = "IP version either 4 or 6.")
  public Object getIpVersion() {
    return ipVersion;
  }

  public void setIpVersion(Object ipVersion) {
    this.ipVersion = ipVersion;
  }

  public Get200Response countryName(Object countryName) {
    this.countryName = countryName;
    return this;
  }

   /**
   * Full name of the IP country.
   * @return countryName
  **/
  @ApiModelProperty(value = "Full name of the IP country.")
  public Object getCountryName() {
    return countryName;
  }

  public void setCountryName(Object countryName) {
    this.countryName = countryName;
  }

  public Get200Response countryCode2(Object countryCode2) {
    this.countryCode2 = countryCode2;
    return this;
  }

   /**
   * ISO ALPHA-2 Country Code.
   * @return countryCode2
  **/
  @ApiModelProperty(value = "ISO ALPHA-2 Country Code.")
  public Object getCountryCode2() {
    return countryCode2;
  }

  public void setCountryCode2(Object countryCode2) {
    this.countryCode2 = countryCode2;
  }

  public Get200Response isp(Object isp) {
    this.isp = isp;
    return this;
  }

   /**
   * Internet Service Provider (ISP) who owns the IP address.
   * @return isp
  **/
  @ApiModelProperty(value = "Internet Service Provider (ISP) who owns the IP address.")
  public Object getIsp() {
    return isp;
  }

  public void setIsp(Object isp) {
    this.isp = isp;
  }

  public Get200Response responseCode(Object responseCode) {
    this.responseCode = responseCode;
    return this;
  }

   /**
   * Response status code to indicate success or failed completion of the API call.
   * @return responseCode
  **/
  @ApiModelProperty(value = "Response status code to indicate success or failed completion of the API call.")
  public Object getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(Object responseCode) {
    this.responseCode = responseCode;
  }

  public Get200Response responseMessage(Object responseMessage) {
    this.responseMessage = responseMessage;
    return this;
  }

   /**
   * Response message to indicate success or failed completion of the API call.
   * @return responseMessage
  **/
  @ApiModelProperty(value = "Response message to indicate success or failed completion of the API call.")
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


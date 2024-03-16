package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2023-04-02T00:24:29.018225Z[Etc/UTC]")
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

  /**
   * IPv4 or IPv6 address used to lookup geolocation.
   **/
  public Get200Response ip(Object ip) {
    this.ip = ip;
    return this;
  }

  
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
  public Get200Response ipNumber(Object ipNumber) {
    this.ipNumber = ipNumber;
    return this;
  }

  
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
  public Get200Response ipVersion(Object ipVersion) {
    this.ipVersion = ipVersion;
    return this;
  }

  
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
  public Get200Response countryName(Object countryName) {
    this.countryName = countryName;
    return this;
  }

  
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
  public Get200Response countryCode2(Object countryCode2) {
    this.countryCode2 = countryCode2;
    return this;
  }

  
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
  public Get200Response isp(Object isp) {
    this.isp = isp;
    return this;
  }

  
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
  public Get200Response responseCode(Object responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  
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
  public Get200Response responseMessage(Object responseMessage) {
    this.responseMessage = responseMessage;
    return this;
  }

  
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


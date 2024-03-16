package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("__get_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-04-02T00:25:03.682575Z[Etc/UTC]")
public class Get200Response   {
  private @Valid Object ip = null;
  private @Valid Object ipNumber = null;
  private @Valid Object ipVersion = null;
  private @Valid Object countryName = null;
  private @Valid Object countryCode2 = null;
  private @Valid Object isp = null;
  private @Valid Object responseCode = null;
  private @Valid Object responseMessage = null;

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

  @JsonProperty("ip")
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

  @JsonProperty("ip_number")
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

  @JsonProperty("ip_version")
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

  @JsonProperty("country_name")
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

  @JsonProperty("country_code2")
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

  @JsonProperty("isp")
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

  @JsonProperty("response_code")
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

  @JsonProperty("response_message")
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


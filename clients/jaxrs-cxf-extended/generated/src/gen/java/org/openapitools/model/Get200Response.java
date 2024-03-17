package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.Int64;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Get200Response  {
  
 /**
  * IPv4 or IPv6 address used to lookup geolocation.
  */
  @ApiModelProperty(value = "IPv4 or IPv6 address used to lookup geolocation.")
  private String ip;

 /**
  * IP number in long integer.
  */
  @ApiModelProperty(value = "IP number in long integer.")
  @Valid
  private Int64 ipNumber = null;

 /**
  * IP version either 4 or 6.
  */
  @ApiModelProperty(value = "IP version either 4 or 6.")
  private Integer ipVersion;

 /**
  * Full name of the IP country.
  */
  @ApiModelProperty(value = "Full name of the IP country.")
  private String countryName;

 /**
  * ISO ALPHA-2 Country Code.
  */
  @ApiModelProperty(value = "ISO ALPHA-2 Country Code.")
  private String countryCode2;

 /**
  * Internet Service Provider (ISP) who owns the IP address.
  */
  @ApiModelProperty(value = "Internet Service Provider (ISP) who owns the IP address.")
  private String isp;

 /**
  * Response status code to indicate success or failed completion of the API call.
  */
  @ApiModelProperty(value = "Response status code to indicate success or failed completion of the API call.")
  private String responseCode;

 /**
  * Response message to indicate success or failed completion of the API call.
  */
  @ApiModelProperty(value = "Response message to indicate success or failed completion of the API call.")
  private String responseMessage;
 /**
  * IPv4 or IPv6 address used to lookup geolocation.
  * @return ip
  */
  @JsonProperty("ip")
  public String getIp() {
    return ip;
  }

  /**
   * Sets the <code>ip</code> property.
   */
 public void setIp(String ip) {
    this.ip = ip;
  }

  /**
   * Sets the <code>ip</code> property.
   */
  public Get200Response ip(String ip) {
    this.ip = ip;
    return this;
  }

 /**
  * IP number in long integer.
  * @return ipNumber
  */
  @JsonProperty("ip_number")
  public Int64 getIpNumber() {
    return ipNumber;
  }

  /**
   * Sets the <code>ipNumber</code> property.
   */
 public void setIpNumber(Int64 ipNumber) {
    this.ipNumber = ipNumber;
  }

  /**
   * Sets the <code>ipNumber</code> property.
   */
  public Get200Response ipNumber(Int64 ipNumber) {
    this.ipNumber = ipNumber;
    return this;
  }

 /**
  * IP version either 4 or 6.
  * @return ipVersion
  */
  @JsonProperty("ip_version")
  public Integer getIpVersion() {
    return ipVersion;
  }

  /**
   * Sets the <code>ipVersion</code> property.
   */
 public void setIpVersion(Integer ipVersion) {
    this.ipVersion = ipVersion;
  }

  /**
   * Sets the <code>ipVersion</code> property.
   */
  public Get200Response ipVersion(Integer ipVersion) {
    this.ipVersion = ipVersion;
    return this;
  }

 /**
  * Full name of the IP country.
  * @return countryName
  */
  @JsonProperty("country_name")
  public String getCountryName() {
    return countryName;
  }

  /**
   * Sets the <code>countryName</code> property.
   */
 public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  /**
   * Sets the <code>countryName</code> property.
   */
  public Get200Response countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

 /**
  * ISO ALPHA-2 Country Code.
  * @return countryCode2
  */
  @JsonProperty("country_code2")
  public String getCountryCode2() {
    return countryCode2;
  }

  /**
   * Sets the <code>countryCode2</code> property.
   */
 public void setCountryCode2(String countryCode2) {
    this.countryCode2 = countryCode2;
  }

  /**
   * Sets the <code>countryCode2</code> property.
   */
  public Get200Response countryCode2(String countryCode2) {
    this.countryCode2 = countryCode2;
    return this;
  }

 /**
  * Internet Service Provider (ISP) who owns the IP address.
  * @return isp
  */
  @JsonProperty("isp")
  public String getIsp() {
    return isp;
  }

  /**
   * Sets the <code>isp</code> property.
   */
 public void setIsp(String isp) {
    this.isp = isp;
  }

  /**
   * Sets the <code>isp</code> property.
   */
  public Get200Response isp(String isp) {
    this.isp = isp;
    return this;
  }

 /**
  * Response status code to indicate success or failed completion of the API call.
  * @return responseCode
  */
  @JsonProperty("response_code")
  public String getResponseCode() {
    return responseCode;
  }

  /**
   * Sets the <code>responseCode</code> property.
   */
 public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  /**
   * Sets the <code>responseCode</code> property.
   */
  public Get200Response responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

 /**
  * Response message to indicate success or failed completion of the API call.
  * @return responseMessage
  */
  @JsonProperty("response_message")
  public String getResponseMessage() {
    return responseMessage;
  }

  /**
   * Sets the <code>responseMessage</code> property.
   */
 public void setResponseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
  }

  /**
   * Sets the <code>responseMessage</code> property.
   */
  public Get200Response responseMessage(String responseMessage) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


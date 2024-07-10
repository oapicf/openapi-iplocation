package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Get200Response
 */

@JsonTypeName("__get_200_response")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-07-10T08:34:18.533971208Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class Get200Response {

  private String ip;

  private String ipNumber;

  private Integer ipVersion;

  private String countryName;

  private String countryCode2;

  private String isp;

  private String responseCode;

  private String responseMessage;

  public Get200Response ip(String ip) {
    this.ip = ip;
    return this;
  }

  /**
   * IPv4 or IPv6 address used to lookup geolocation.
   * @return ip
  */
  
  @Schema(name = "ip", description = "IPv4 or IPv6 address used to lookup geolocation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ip")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public Get200Response ipNumber(String ipNumber) {
    this.ipNumber = ipNumber;
    return this;
  }

  /**
   * IP number in long integer (represented as string).
   * @return ipNumber
  */
  
  @Schema(name = "ip_number", description = "IP number in long integer (represented as string).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ip_number")
  public String getIpNumber() {
    return ipNumber;
  }

  public void setIpNumber(String ipNumber) {
    this.ipNumber = ipNumber;
  }

  public Get200Response ipVersion(Integer ipVersion) {
    this.ipVersion = ipVersion;
    return this;
  }

  /**
   * IP version either 4 or 6.
   * @return ipVersion
  */
  
  @Schema(name = "ip_version", description = "IP version either 4 or 6.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ip_version")
  public Integer getIpVersion() {
    return ipVersion;
  }

  public void setIpVersion(Integer ipVersion) {
    this.ipVersion = ipVersion;
  }

  public Get200Response countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

  /**
   * Full name of the IP country.
   * @return countryName
  */
  
  @Schema(name = "country_name", description = "Full name of the IP country.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country_name")
  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public Get200Response countryCode2(String countryCode2) {
    this.countryCode2 = countryCode2;
    return this;
  }

  /**
   * ISO ALPHA-2 Country Code.
   * @return countryCode2
  */
  
  @Schema(name = "country_code2", description = "ISO ALPHA-2 Country Code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country_code2")
  public String getCountryCode2() {
    return countryCode2;
  }

  public void setCountryCode2(String countryCode2) {
    this.countryCode2 = countryCode2;
  }

  public Get200Response isp(String isp) {
    this.isp = isp;
    return this;
  }

  /**
   * Internet Service Provider (ISP) who owns the IP address.
   * @return isp
  */
  
  @Schema(name = "isp", description = "Internet Service Provider (ISP) who owns the IP address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isp")
  public String getIsp() {
    return isp;
  }

  public void setIsp(String isp) {
    this.isp = isp;
  }

  public Get200Response responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  /**
   * Response status code to indicate success or failed completion of the API call.
   * @return responseCode
  */
  
  @Schema(name = "response_code", description = "Response status code to indicate success or failed completion of the API call.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("response_code")
  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  public Get200Response responseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
    return this;
  }

  /**
   * Response message to indicate success or failed completion of the API call.
   * @return responseMessage
  */
  
  @Schema(name = "response_message", description = "Response message to indicate success or failed completion of the API call.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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


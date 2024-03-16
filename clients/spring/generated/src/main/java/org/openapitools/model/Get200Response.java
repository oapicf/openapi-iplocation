package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-02T00:27:25.182827Z[Etc/UTC]")
public class Get200Response {

  @JsonProperty("ip")
  private JsonNullable<Object> ip = JsonNullable.undefined();

  @JsonProperty("ip_number")
  private JsonNullable<Object> ipNumber = JsonNullable.undefined();

  @JsonProperty("ip_version")
  private JsonNullable<Object> ipVersion = JsonNullable.undefined();

  @JsonProperty("country_name")
  private JsonNullable<Object> countryName = JsonNullable.undefined();

  @JsonProperty("country_code2")
  private JsonNullable<Object> countryCode2 = JsonNullable.undefined();

  @JsonProperty("isp")
  private JsonNullable<Object> isp = JsonNullable.undefined();

  @JsonProperty("response_code")
  private JsonNullable<Object> responseCode = JsonNullable.undefined();

  @JsonProperty("response_message")
  private JsonNullable<Object> responseMessage = JsonNullable.undefined();

  public Get200Response ip(Object ip) {
    this.ip = JsonNullable.of(ip);
    return this;
  }

  /**
   * IPv4 or IPv6 address used to lookup geolocation.
   * @return ip
  */
  
  @Schema(name = "ip", description = "IPv4 or IPv6 address used to lookup geolocation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getIp() {
    return ip;
  }

  public void setIp(JsonNullable<Object> ip) {
    this.ip = ip;
  }

  public Get200Response ipNumber(Object ipNumber) {
    this.ipNumber = JsonNullable.of(ipNumber);
    return this;
  }

  /**
   * IP number in long integer.
   * @return ipNumber
  */
  
  @Schema(name = "ip_number", description = "IP number in long integer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getIpNumber() {
    return ipNumber;
  }

  public void setIpNumber(JsonNullable<Object> ipNumber) {
    this.ipNumber = ipNumber;
  }

  public Get200Response ipVersion(Object ipVersion) {
    this.ipVersion = JsonNullable.of(ipVersion);
    return this;
  }

  /**
   * IP version either 4 or 6.
   * @return ipVersion
  */
  
  @Schema(name = "ip_version", description = "IP version either 4 or 6.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getIpVersion() {
    return ipVersion;
  }

  public void setIpVersion(JsonNullable<Object> ipVersion) {
    this.ipVersion = ipVersion;
  }

  public Get200Response countryName(Object countryName) {
    this.countryName = JsonNullable.of(countryName);
    return this;
  }

  /**
   * Full name of the IP country.
   * @return countryName
  */
  
  @Schema(name = "country_name", description = "Full name of the IP country.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getCountryName() {
    return countryName;
  }

  public void setCountryName(JsonNullable<Object> countryName) {
    this.countryName = countryName;
  }

  public Get200Response countryCode2(Object countryCode2) {
    this.countryCode2 = JsonNullable.of(countryCode2);
    return this;
  }

  /**
   * ISO ALPHA-2 Country Code.
   * @return countryCode2
  */
  
  @Schema(name = "country_code2", description = "ISO ALPHA-2 Country Code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getCountryCode2() {
    return countryCode2;
  }

  public void setCountryCode2(JsonNullable<Object> countryCode2) {
    this.countryCode2 = countryCode2;
  }

  public Get200Response isp(Object isp) {
    this.isp = JsonNullable.of(isp);
    return this;
  }

  /**
   * Internet Service Provider (ISP) who owns the IP address.
   * @return isp
  */
  
  @Schema(name = "isp", description = "Internet Service Provider (ISP) who owns the IP address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getIsp() {
    return isp;
  }

  public void setIsp(JsonNullable<Object> isp) {
    this.isp = isp;
  }

  public Get200Response responseCode(Object responseCode) {
    this.responseCode = JsonNullable.of(responseCode);
    return this;
  }

  /**
   * Response status code to indicate success or failed completion of the API call.
   * @return responseCode
  */
  
  @Schema(name = "response_code", description = "Response status code to indicate success or failed completion of the API call.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(JsonNullable<Object> responseCode) {
    this.responseCode = responseCode;
  }

  public Get200Response responseMessage(Object responseMessage) {
    this.responseMessage = JsonNullable.of(responseMessage);
    return this;
  }

  /**
   * Response message to indicate success or failed completion of the API call.
   * @return responseMessage
  */
  
  @Schema(name = "response_message", description = "Response message to indicate success or failed completion of the API call.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public JsonNullable<Object> getResponseMessage() {
    return responseMessage;
  }

  public void setResponseMessage(JsonNullable<Object> responseMessage) {
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
    return equalsNullable(this.ip, get200Response.ip) &&
        equalsNullable(this.ipNumber, get200Response.ipNumber) &&
        equalsNullable(this.ipVersion, get200Response.ipVersion) &&
        equalsNullable(this.countryName, get200Response.countryName) &&
        equalsNullable(this.countryCode2, get200Response.countryCode2) &&
        equalsNullable(this.isp, get200Response.isp) &&
        equalsNullable(this.responseCode, get200Response.responseCode) &&
        equalsNullable(this.responseMessage, get200Response.responseMessage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(ip), hashCodeNullable(ipNumber), hashCodeNullable(ipVersion), hashCodeNullable(countryName), hashCodeNullable(countryCode2), hashCodeNullable(isp), hashCodeNullable(responseCode), hashCodeNullable(responseMessage));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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


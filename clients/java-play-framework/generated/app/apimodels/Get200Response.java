package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Get200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-02T22:26:07.217339944Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Get200Response   {
  @JsonProperty("ip")
  
  private String ip;

  @JsonProperty("ip_number")
  
  private String ipNumber;

  @JsonProperty("ip_version")
  
  private Integer ipVersion;

  @JsonProperty("country_name")
  
  private String countryName;

  @JsonProperty("country_code2")
  
  private String countryCode2;

  @JsonProperty("isp")
  
  private String isp;

  @JsonProperty("response_code")
  
  private String responseCode;

  @JsonProperty("response_message")
  
  private String responseMessage;

  public Get200Response ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * IPv4 or IPv6 address used to lookup geolocation.
   * @return ip
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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


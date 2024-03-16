/*
 * iplocation.net API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Get200Response
 */
@JsonPropertyOrder({
  Get200Response.JSON_PROPERTY_IP,
  Get200Response.JSON_PROPERTY_IP_NUMBER,
  Get200Response.JSON_PROPERTY_IP_VERSION,
  Get200Response.JSON_PROPERTY_COUNTRY_NAME,
  Get200Response.JSON_PROPERTY_COUNTRY_CODE2,
  Get200Response.JSON_PROPERTY_ISP,
  Get200Response.JSON_PROPERTY_RESPONSE_CODE,
  Get200Response.JSON_PROPERTY_RESPONSE_MESSAGE
})
@JsonTypeName("__get_200_response")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2023-04-02T00:24:31.071034Z[Etc/UTC]")
@Introspected
public class Get200Response {
    public static final String JSON_PROPERTY_IP = "ip";
    private Object ip = null;

    public static final String JSON_PROPERTY_IP_NUMBER = "ip_number";
    private Object ipNumber = null;

    public static final String JSON_PROPERTY_IP_VERSION = "ip_version";
    private Object ipVersion = null;

    public static final String JSON_PROPERTY_COUNTRY_NAME = "country_name";
    private Object countryName = null;

    public static final String JSON_PROPERTY_COUNTRY_CODE2 = "country_code2";
    private Object countryCode2 = null;

    public static final String JSON_PROPERTY_ISP = "isp";
    private Object isp = null;

    public static final String JSON_PROPERTY_RESPONSE_CODE = "response_code";
    private Object responseCode = null;

    public static final String JSON_PROPERTY_RESPONSE_MESSAGE = "response_message";
    private Object responseMessage = null;

    public Get200Response() {
    }

    public Get200Response ip(Object ip) {
        this.ip = ip;
        return this;
    }

    /**
     * IPv4 or IPv6 address used to lookup geolocation.
     * @return ip
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_IP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Object getIp() {
        return ip;
    }

    @JsonProperty(JSON_PROPERTY_IP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_IP_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Object getIpNumber() {
        return ipNumber;
    }

    @JsonProperty(JSON_PROPERTY_IP_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_IP_VERSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Object getIpVersion() {
        return ipVersion;
    }

    @JsonProperty(JSON_PROPERTY_IP_VERSION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_COUNTRY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Object getCountryName() {
        return countryName;
    }

    @JsonProperty(JSON_PROPERTY_COUNTRY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_COUNTRY_CODE2)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Object getCountryCode2() {
        return countryCode2;
    }

    @JsonProperty(JSON_PROPERTY_COUNTRY_CODE2)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_ISP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Object getIsp() {
        return isp;
    }

    @JsonProperty(JSON_PROPERTY_ISP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_RESPONSE_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Object getResponseCode() {
        return responseCode;
    }

    @JsonProperty(JSON_PROPERTY_RESPONSE_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_RESPONSE_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Object getResponseMessage() {
        return responseMessage;
    }

    @JsonProperty(JSON_PROPERTY_RESPONSE_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

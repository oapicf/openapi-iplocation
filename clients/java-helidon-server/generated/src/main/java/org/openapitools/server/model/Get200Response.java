package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



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
     * Default constructor.
     */
    public Get200Response() {
    // JSON-B / Jackson
    }

    /**
     * Create Get200Response.
     *
     * @param ip IPv4 or IPv6 address used to lookup geolocation.
     * @param ipNumber IP number in long integer (represented as string).
     * @param ipVersion IP version either 4 or 6.
     * @param countryName Full name of the IP country.
     * @param countryCode2 ISO ALPHA-2 Country Code.
     * @param isp Internet Service Provider (ISP) who owns the IP address.
     * @param responseCode Response status code to indicate success or failed completion of the API call.
     * @param responseMessage Response message to indicate success or failed completion of the API call.
     */
    public Get200Response(
        String ip, 
        String ipNumber, 
        Integer ipVersion, 
        String countryName, 
        String countryCode2, 
        String isp, 
        String responseCode, 
        String responseMessage
    ) {
        this.ip = ip;
        this.ipNumber = ipNumber;
        this.ipVersion = ipVersion;
        this.countryName = countryName;
        this.countryCode2 = countryCode2;
        this.isp = isp;
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
    }



    /**
     * IPv4 or IPv6 address used to lookup geolocation.
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * IP number in long integer (represented as string).
     * @return ipNumber
     */
    public String getIpNumber() {
        return ipNumber;
    }

    public void setIpNumber(String ipNumber) {
        this.ipNumber = ipNumber;
    }

    /**
     * IP version either 4 or 6.
     * @return ipVersion
     */
    public Integer getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
    }

    /**
     * Full name of the IP country.
     * @return countryName
     */
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * ISO ALPHA-2 Country Code.
     * @return countryCode2
     */
    public String getCountryCode2() {
        return countryCode2;
    }

    public void setCountryCode2(String countryCode2) {
        this.countryCode2 = countryCode2;
    }

    /**
     * Internet Service Provider (ISP) who owns the IP address.
     * @return isp
     */
    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    /**
     * Response status code to indicate success or failed completion of the API call.
     * @return responseCode
     */
    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * Response message to indicate success or failed completion of the API call.
     * @return responseMessage
     */
    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}


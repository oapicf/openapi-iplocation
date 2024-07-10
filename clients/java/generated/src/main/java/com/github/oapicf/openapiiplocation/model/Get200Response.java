/*
 * iplocation.net API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.oapicf.openapiiplocation.model;

import java.util.Objects;
import com.github.oapicf.openapiiplocation.model.Int64;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.oapicf.openapiiplocation.JSON;

/**
 * Get200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-16T21:35:33.070084941Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Get200Response {
  public static final String SERIALIZED_NAME_IP = "ip";
  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public static final String SERIALIZED_NAME_IP_NUMBER = "ip_number";
  @SerializedName(SERIALIZED_NAME_IP_NUMBER)
  private Int64 ipNumber = null;

  public static final String SERIALIZED_NAME_IP_VERSION = "ip_version";
  @SerializedName(SERIALIZED_NAME_IP_VERSION)
  private Integer ipVersion;

  public static final String SERIALIZED_NAME_COUNTRY_NAME = "country_name";
  @SerializedName(SERIALIZED_NAME_COUNTRY_NAME)
  private String countryName;

  public static final String SERIALIZED_NAME_COUNTRY_CODE2 = "country_code2";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE2)
  private String countryCode2;

  public static final String SERIALIZED_NAME_ISP = "isp";
  @SerializedName(SERIALIZED_NAME_ISP)
  private String isp;

  public static final String SERIALIZED_NAME_RESPONSE_CODE = "response_code";
  @SerializedName(SERIALIZED_NAME_RESPONSE_CODE)
  private String responseCode;

  public static final String SERIALIZED_NAME_RESPONSE_MESSAGE = "response_message";
  @SerializedName(SERIALIZED_NAME_RESPONSE_MESSAGE)
  private String responseMessage;

  public Get200Response() {
  }

  public Get200Response ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * IPv4 or IPv6 address used to lookup geolocation.
   * @return ip
  **/
  @javax.annotation.Nullable
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }


  public Get200Response ipNumber(Int64 ipNumber) {
    this.ipNumber = ipNumber;
    return this;
  }

   /**
   * IP number in long integer.
   * @return ipNumber
  **/
  @javax.annotation.Nullable
  public Int64 getIpNumber() {
    return ipNumber;
  }

  public void setIpNumber(Int64 ipNumber) {
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("ip");
    openapiFields.add("ip_number");
    openapiFields.add("ip_version");
    openapiFields.add("country_name");
    openapiFields.add("country_code2");
    openapiFields.add("isp");
    openapiFields.add("response_code");
    openapiFields.add("response_message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Get200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Get200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Get200Response is not found in the empty JSON string", Get200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Get200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Get200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ip") != null && !jsonObj.get("ip").isJsonNull()) && !jsonObj.get("ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ip").toString()));
      }
      if ((jsonObj.get("country_name") != null && !jsonObj.get("country_name").isJsonNull()) && !jsonObj.get("country_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_name").toString()));
      }
      if ((jsonObj.get("country_code2") != null && !jsonObj.get("country_code2").isJsonNull()) && !jsonObj.get("country_code2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_code2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_code2").toString()));
      }
      if ((jsonObj.get("isp") != null && !jsonObj.get("isp").isJsonNull()) && !jsonObj.get("isp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isp").toString()));
      }
      if ((jsonObj.get("response_code") != null && !jsonObj.get("response_code").isJsonNull()) && !jsonObj.get("response_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `response_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("response_code").toString()));
      }
      if ((jsonObj.get("response_message") != null && !jsonObj.get("response_message").isJsonNull()) && !jsonObj.get("response_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `response_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("response_message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Get200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Get200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Get200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Get200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<Get200Response>() {
           @Override
           public void write(JsonWriter out, Get200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Get200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Get200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Get200Response
  * @throws IOException if the JSON string is invalid with respect to Get200Response
  */
  public static Get200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Get200Response.class);
  }

 /**
  * Convert an instance of Get200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

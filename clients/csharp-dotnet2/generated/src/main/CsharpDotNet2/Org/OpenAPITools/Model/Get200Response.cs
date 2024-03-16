using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class Get200Response {
    /// <summary>
    /// IPv4 or IPv6 address used to lookup geolocation.
    /// </summary>
    /// <value>IPv4 or IPv6 address used to lookup geolocation.</value>
    [DataMember(Name="ip", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ip")]
    public Object Ip { get; set; }

    /// <summary>
    /// IP number in long integer.
    /// </summary>
    /// <value>IP number in long integer.</value>
    [DataMember(Name="ip_number", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ip_number")]
    public Object IpNumber { get; set; }

    /// <summary>
    /// IP version either 4 or 6.
    /// </summary>
    /// <value>IP version either 4 or 6.</value>
    [DataMember(Name="ip_version", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ip_version")]
    public Object IpVersion { get; set; }

    /// <summary>
    /// Full name of the IP country.
    /// </summary>
    /// <value>Full name of the IP country.</value>
    [DataMember(Name="country_name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "country_name")]
    public Object CountryName { get; set; }

    /// <summary>
    /// ISO ALPHA-2 Country Code.
    /// </summary>
    /// <value>ISO ALPHA-2 Country Code.</value>
    [DataMember(Name="country_code2", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "country_code2")]
    public Object CountryCode2 { get; set; }

    /// <summary>
    /// Internet Service Provider (ISP) who owns the IP address.
    /// </summary>
    /// <value>Internet Service Provider (ISP) who owns the IP address.</value>
    [DataMember(Name="isp", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "isp")]
    public Object Isp { get; set; }

    /// <summary>
    /// Response status code to indicate success or failed completion of the API call.
    /// </summary>
    /// <value>Response status code to indicate success or failed completion of the API call.</value>
    [DataMember(Name="response_code", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "response_code")]
    public Object ResponseCode { get; set; }

    /// <summary>
    /// Response message to indicate success or failed completion of the API call.
    /// </summary>
    /// <value>Response message to indicate success or failed completion of the API call.</value>
    [DataMember(Name="response_message", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "response_message")]
    public Object ResponseMessage { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Get200Response {\n");
      sb.Append("  Ip: ").Append(Ip).Append("\n");
      sb.Append("  IpNumber: ").Append(IpNumber).Append("\n");
      sb.Append("  IpVersion: ").Append(IpVersion).Append("\n");
      sb.Append("  CountryName: ").Append(CountryName).Append("\n");
      sb.Append("  CountryCode2: ").Append(CountryCode2).Append("\n");
      sb.Append("  Isp: ").Append(Isp).Append("\n");
      sb.Append("  ResponseCode: ").Append(ResponseCode).Append("\n");
      sb.Append("  ResponseMessage: ").Append(ResponseMessage).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
    }

}
}

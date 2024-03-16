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
  public class Get400Response {
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
      sb.Append("class Get400Response {\n");
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

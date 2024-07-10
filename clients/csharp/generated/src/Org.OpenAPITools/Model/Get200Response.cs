/*
 * iplocation.net API
 *
 * OpenAPI v3 specification and a set of generated API clients for iplocation.net
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Get200Response
    /// </summary>
    [DataContract(Name = "__get_200_response")]
    public partial class Get200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Get200Response" /> class.
        /// </summary>
        /// <param name="ip">IPv4 or IPv6 address used to lookup geolocation..</param>
        /// <param name="ipNumber">IP number in long integer (represented as string)..</param>
        /// <param name="ipVersion">IP version either 4 or 6..</param>
        /// <param name="countryName">Full name of the IP country..</param>
        /// <param name="countryCode2">ISO ALPHA-2 Country Code..</param>
        /// <param name="isp">Internet Service Provider (ISP) who owns the IP address..</param>
        /// <param name="responseCode">Response status code to indicate success or failed completion of the API call..</param>
        /// <param name="responseMessage">Response message to indicate success or failed completion of the API call..</param>
        public Get200Response(string ip = default(string), string ipNumber = default(string), int ipVersion = default(int), string countryName = default(string), string countryCode2 = default(string), string isp = default(string), string responseCode = default(string), string responseMessage = default(string))
        {
            this.Ip = ip;
            this.IpNumber = ipNumber;
            this.IpVersion = ipVersion;
            this.CountryName = countryName;
            this.CountryCode2 = countryCode2;
            this.Isp = isp;
            this.ResponseCode = responseCode;
            this.ResponseMessage = responseMessage;
        }

        /// <summary>
        /// IPv4 or IPv6 address used to lookup geolocation.
        /// </summary>
        /// <value>IPv4 or IPv6 address used to lookup geolocation.</value>
        [DataMember(Name = "ip", EmitDefaultValue = false)]
        public string Ip { get; set; }

        /// <summary>
        /// IP number in long integer (represented as string).
        /// </summary>
        /// <value>IP number in long integer (represented as string).</value>
        [DataMember(Name = "ip_number", EmitDefaultValue = false)]
        public string IpNumber { get; set; }

        /// <summary>
        /// IP version either 4 or 6.
        /// </summary>
        /// <value>IP version either 4 or 6.</value>
        [DataMember(Name = "ip_version", EmitDefaultValue = false)]
        public int IpVersion { get; set; }

        /// <summary>
        /// Full name of the IP country.
        /// </summary>
        /// <value>Full name of the IP country.</value>
        [DataMember(Name = "country_name", EmitDefaultValue = false)]
        public string CountryName { get; set; }

        /// <summary>
        /// ISO ALPHA-2 Country Code.
        /// </summary>
        /// <value>ISO ALPHA-2 Country Code.</value>
        [DataMember(Name = "country_code2", EmitDefaultValue = false)]
        public string CountryCode2 { get; set; }

        /// <summary>
        /// Internet Service Provider (ISP) who owns the IP address.
        /// </summary>
        /// <value>Internet Service Provider (ISP) who owns the IP address.</value>
        [DataMember(Name = "isp", EmitDefaultValue = false)]
        public string Isp { get; set; }

        /// <summary>
        /// Response status code to indicate success or failed completion of the API call.
        /// </summary>
        /// <value>Response status code to indicate success or failed completion of the API call.</value>
        [DataMember(Name = "response_code", EmitDefaultValue = false)]
        public string ResponseCode { get; set; }

        /// <summary>
        /// Response message to indicate success or failed completion of the API call.
        /// </summary>
        /// <value>Response message to indicate success or failed completion of the API call.</value>
        [DataMember(Name = "response_message", EmitDefaultValue = false)]
        public string ResponseMessage { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
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
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}

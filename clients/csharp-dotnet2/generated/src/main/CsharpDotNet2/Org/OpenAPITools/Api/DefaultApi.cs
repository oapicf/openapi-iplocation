using System;
using System.Collections.Generic;
using RestSharp;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDefaultApi
    {
        /// <summary>
        /// Get geolocation of an IP address Retrieve geolocation of an IP address. 
        /// </summary>
        /// <param name="ip">An IPv4 or IPv6 address that you would like to lookup.</param>
        /// <param name="format">Output format, the following formats are supported: plain xml json jsonp php csv serialized</param>
        /// <param name="delimiter">Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;.</param>
        /// <returns>Get200Response</returns>
        Get200Response RootGet (Object ip, Object format, Object delimiter);
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class DefaultApi : IDefaultApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DefaultApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public DefaultApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient;
            else
                this.ApiClient = apiClient;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DefaultApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DefaultApi(String basePath)
        {
            this.ApiClient = new ApiClient(basePath);
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public void SetBasePath(String basePath)
        {
            this.ApiClient.BasePath = basePath;
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public String GetBasePath(String basePath)
        {
            return this.ApiClient.BasePath;
        }

        /// <summary>
        /// Gets or sets the API client.
        /// </summary>
        /// <value>An instance of the ApiClient</value>
        public ApiClient ApiClient {get; set;}

        /// <summary>
        /// Get geolocation of an IP address Retrieve geolocation of an IP address. 
        /// </summary>
        /// <param name="ip">An IPv4 or IPv6 address that you would like to lookup.</param>
        /// <param name="format">Output format, the following formats are supported: plain xml json jsonp php csv serialized</param>
        /// <param name="delimiter">Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;.</param>
        /// <returns>Get200Response</returns>
        public Get200Response RootGet (Object ip, Object format, Object delimiter)
        {
            
            // verify the required parameter 'ip' is set
            if (ip == null) throw new ApiException(400, "Missing required parameter 'ip' when calling RootGet");
            

            var path = "/";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (ip != null) queryParams.Add("ip", ApiClient.ParameterToString(ip)); // query parameter
 if (format != null) queryParams.Add("format", ApiClient.ParameterToString(format)); // query parameter
 if (delimiter != null) queryParams.Add("delimiter", ApiClient.ParameterToString(delimiter)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling RootGet: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling RootGet: " + response.ErrorMessage, response.ErrorMessage);

            return (Get200Response) ApiClient.Deserialize(response.Content, typeof(Get200Response), response.Headers);
        }

    }
}

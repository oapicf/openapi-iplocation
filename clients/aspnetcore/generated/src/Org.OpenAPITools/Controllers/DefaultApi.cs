/*
 * iplocation.net API
 *
 * OpenAPI v3 specification and a set of generated API clients for iplocation.net
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Http;
using Swashbuckle.AspNetCore.Annotations;
using Swashbuckle.AspNetCore.SwaggerGen;
using Newtonsoft.Json;
using Org.OpenAPITools.Attributes;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    [ApiController]
    public class DefaultApiController : ControllerBase
    { 
        /// <summary>
        /// Get geolocation of an IP address
        /// </summary>
        /// <remarks>Retrieve geolocation of an IP address. </remarks>
        /// <param name="ip">An IPv4 or IPv6 address that you would like to lookup.</param>
        /// <param name="format">Output format, the following formats are supported: plain xml json jsonp php csv serialized</param>
        /// <param name="delimiter">Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;.</param>
        /// <response code="200">Successfully processed the request.</response>
        /// <response code="400">Failed to complete the request.</response>
        /// <response code="404">Command not found.</response>
        [HttpGet]
        [Route("/")]
        [ValidateModelState]
        [SwaggerOperation("RootGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(Get200Response), description: "Successfully processed the request.")]
        [SwaggerResponse(statusCode: 400, type: typeof(Get400Response), description: "Failed to complete the request.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Get400Response), description: "Command not found.")]
        public virtual IActionResult RootGet([FromQuery (Name = "ip")][Required()]string ip, [FromQuery (Name = "format")]string format, [FromQuery (Name = "delimiter")]string delimiter)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Get200Response));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(Get400Response));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Get400Response));
            string exampleJson = null;
            exampleJson = "{\n  \"response_code\" : \"response_code\",\n  \"ip_version\" : 0,\n  \"response_message\" : \"response_message\",\n  \"ip\" : \"ip\",\n  \"isp\" : \"isp\",\n  \"country_name\" : \"country_name\",\n  \"country_code2\" : \"country_code2\",\n  \"ip_number\" : \"ip_number\"\n}";
            exampleJson = "{\n  \"response_code\" : \"response_code\",\n  \"response_message\" : \"response_message\"\n}";
            exampleJson = "{\n  \"response_code\" : \"response_code\",\n  \"response_message\" : \"response_message\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Get200Response>(exampleJson)
            : default(Get200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
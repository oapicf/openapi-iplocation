/**
* iplocation.net API
* OpenAPI v3 specification and a set of generated API clients for iplocation.net
*
* The version of the OpenAPI document: 0.9.0-pre.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.models


/**
 * 
 * @param responseCode Response status code to indicate success or failed completion of the API call.
 * @param responseMessage Response message to indicate success or failed completion of the API call.
 */
data class Get400Response(
    /* Response status code to indicate success or failed completion of the API call. */
    val responseCode: kotlin.String? = null,
    /* Response message to indicate success or failed completion of the API call. */
    val responseMessage: kotlin.String? = null
) 


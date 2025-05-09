/**
* iplocation.net API
* OpenAPI v3 specification and a set of generated API clients for iplocation.net
*
* The version of the OpenAPI document: 1.1.1-pre.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.database.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
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
object Get200Responses : BaseTable<Get200Response>("__get_200_response") {
    val ip = text("ip") /* null */ /* IPv4 or IPv6 address used to lookup geolocation. */
    val ipNumber = text("ip_number") /* null */ /* IP number in long integer (represented as string). */
    val ipVersion = int("ip_version") /* null */ /* IP version either 4 or 6. */
    val countryName = text("country_name") /* null */ /* Full name of the IP country. */
    val countryCode2 = text("country_code2") /* null */ /* ISO ALPHA-2 Country Code. */
    val isp = text("isp") /* null */ /* Internet Service Provider (ISP) who owns the IP address. */
    val responseCode = text("response_code") /* null */ /* Response status code to indicate success or failed completion of the API call. */
    val responseMessage = text("response_message") /* null */ /* Response message to indicate success or failed completion of the API call. */

    /**
     * Create an entity of type Get200Response from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = Get200Response(
        ip = row[ip]  /* kotlin.String? */ /* IPv4 or IPv6 address used to lookup geolocation. */,
        ipNumber = row[ipNumber]  /* kotlin.String? */ /* IP number in long integer (represented as string). */,
        ipVersion = row[ipVersion]  /* kotlin.Int? */ /* IP version either 4 or 6. */,
        countryName = row[countryName]  /* kotlin.String? */ /* Full name of the IP country. */,
        countryCode2 = row[countryCode2]  /* kotlin.String? */ /* ISO ALPHA-2 Country Code. */,
        isp = row[isp]  /* kotlin.String? */ /* Internet Service Provider (ISP) who owns the IP address. */,
        responseCode = row[responseCode]  /* kotlin.String? */ /* Response status code to indicate success or failed completion of the API call. */,
        responseMessage = row[responseMessage]  /* kotlin.String? */ /* Response message to indicate success or failed completion of the API call. */
    )

    /**
    * Assign all the columns from the entity of type Get200Response to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = Get200Response()
    * database.update(Get200Responses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: Get200Response) {
        this.apply {
            set(Get200Responses.ip, entity.ip)
            set(Get200Responses.ipNumber, entity.ipNumber)
            set(Get200Responses.ipVersion, entity.ipVersion)
            set(Get200Responses.countryName, entity.countryName)
            set(Get200Responses.countryCode2, entity.countryCode2)
            set(Get200Responses.isp, entity.isp)
            set(Get200Responses.responseCode, entity.responseCode)
            set(Get200Responses.responseMessage, entity.responseMessage)
        }
    }

}



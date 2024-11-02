/**
* iplocation.net API
* OpenAPI v3 specification and a set of generated API clients for iplocation.net
*
* The version of the OpenAPI document: 1.0.1-pre.0
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
 * @param responseCode Response status code to indicate success or failed completion of the API call.
 * @param responseMessage Response message to indicate success or failed completion of the API call.
 */
object Get400Responses : BaseTable<Get400Response>("__get_400_response") {
    val responseCode = text("response_code") /* null */ /* Response status code to indicate success or failed completion of the API call. */
    val responseMessage = text("response_message") /* null */ /* Response message to indicate success or failed completion of the API call. */

    /**
     * Create an entity of type Get400Response from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = Get400Response(
        responseCode = row[responseCode]  /* kotlin.String? */ /* Response status code to indicate success or failed completion of the API call. */,
        responseMessage = row[responseMessage]  /* kotlin.String? */ /* Response message to indicate success or failed completion of the API call. */
    )

    /**
    * Assign all the columns from the entity of type Get400Response to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = Get400Response()
    * database.update(Get400Responses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: Get400Response) {
        this.apply {
            set(Get400Responses.responseCode, entity.responseCode)
            set(Get400Responses.responseMessage, entity.responseMessage)
        }
    }

}



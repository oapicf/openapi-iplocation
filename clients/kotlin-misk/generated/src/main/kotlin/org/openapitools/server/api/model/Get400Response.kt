package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Get400Response(
    /** Response status code to indicate success or failed completion of the API call. */
    val responseCode: kotlin.String? = null,
    /** Response message to indicate success or failed completion of the API call. */
    val responseMessage: kotlin.String? = null
)

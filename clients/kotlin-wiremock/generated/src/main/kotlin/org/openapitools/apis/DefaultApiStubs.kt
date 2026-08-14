@file:Suppress(
    "RemoveRedundantQualifierName",
    "UnusedImport",
    "unused",
)

package org.openapitools.apis

import com.fasterxml.jackson.databind.ObjectMapper
import com.github.tomakehurst.wiremock.client.MappingBuilder
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder
import com.github.tomakehurst.wiremock.client.WireMock.*
import com.github.tomakehurst.wiremock.matching.StringValuePattern
import org.openapitools.models.*

/**
 * WireMock stub request builder.
 */
open class DefaultApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation rootGet.
     *
     * @param ip query parameter ip pattern.
     * @param format query parameter format pattern.
     * @param delimiter query parameter delimiter pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [RootGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun rootGet(ip: StringValuePattern? = null, format: StringValuePattern? = null, delimiter: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): RootGetStubBuilder =
        RootGetStubBuilder(objectMapper, get(urlPathTemplate("/"))
            .apply { ip?.let { withQueryParam("ip", it) } }
            .apply { format?.let { withQueryParam("format", it) } }
            .apply { delimiter?.let { withQueryParam("delimiter", it) } }
            .configurer()
        )
}

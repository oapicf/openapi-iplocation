package org.openapitools.server.api.api

import misk.testing.MiskTestModule
import jakarta.inject.Inject
import misk.testing.MiskTest
import misk.testing.MiskTestModule
import org.junit.jupiter.api.Test
import misk.web.HttpCall
import misk.web.PathParam
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestHeader
import org.openapitools.server.api.model.Get200Response
import org.openapitools.server.api.model.Get400Response

@MiskTest(startService = true)
internal class DefaultApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var defaultApi: DefaultApiAction

    /**
     * To test DefaultApiAction.rootGet
     */
    @Test
    fun `should handle rootGet`() {
        val ip = TODO()
        val format = TODO()
        val delimiter = TODO()
        val response: Get200Response = defaultApi.rootGet(ip, format, delimiter)
    }
}

package org.openapitools.api

import org.openapitools.model.Get200Response
import org.openapitools.model.Get400Response
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class DefaultApiTest {

    private val api: DefaultApiController = DefaultApiController()

    /**
     * To test DefaultApiController.rootGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun rootGetTest() {
        val ip: kotlin.Any = TODO()
        val format: kotlin.Any? = TODO()
        val delimiter: kotlin.Any? = TODO()
        val response: ResponseEntity<Get200Response> = api.rootGet(ip, format, delimiter)

        // TODO: test validations
    }
}

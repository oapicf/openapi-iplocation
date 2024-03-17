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
        val ip: kotlin.String = TODO()
        val format: kotlin.String? = TODO()
        val delimiter: kotlin.String? = TODO()
        val response: ResponseEntity<Get200Response> = api.rootGet(ip, format, delimiter)

        // TODO: test validations
    }
}

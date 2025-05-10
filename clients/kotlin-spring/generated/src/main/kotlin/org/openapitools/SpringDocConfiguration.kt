package org.openapitools

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.License
import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.security.SecurityScheme

@Configuration
class SpringDocConfiguration {

    @Bean
    fun apiInfo(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("iplocation.net API")
                    .description("OpenAPI v3 specification and a set of generated API clients for iplocation.net")
                    .contact(
                        Contact()
                            .name("OpenAPI Clients Factory")
                            .url("https://github.com/oapicf/openapi-iplocation")
                            .email("blah+oapicf@cliffano.com")
                    )
                    .license(
                        License()
                            .name("MIT")
                                                )
                    .version("1.1.1-pre.0")
            )
    }
}

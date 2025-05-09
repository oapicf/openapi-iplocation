/**
 * 
 * iplocation.net API
 * 
 * 
 * OpenAPI v3 specification and a set of generated API clients for iplocation.net
 * 
 * Version: 1.1.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by OpenAPI Generator: https://openapi-generator.tech
 */

// package openapi3graphql-server

// default_api

export default {
    Query: {

        // @return Get200Response
        RootGet: ($ip, $format, $delimiter) => {
            return {
                "ip": "ip_example",
                "format": "format_example",
                "delimiter": "delimiter_example"
            };
        },

    },

    Mutation: {

    }
}
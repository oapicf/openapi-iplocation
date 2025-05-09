<?php declare(strict_types=1);

/**
 * iplocation.net API
 * OpenAPI v3 specification and a set of generated API clients for iplocation.net
 * PHP version 8.1
 *
 * The version of the OpenAPI document: 1.1.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 * Source files are located at:
 *
 * > https://github.com/OpenAPITools/openapi-generator/blob/master/modules/openapi-generator/src/main/resources/php-laravel/
 */


namespace OpenAPI\Server\Api;


interface DefaultApiInterface {


    /**
     * Operation rootGet
     *
     * Get geolocation of an IP address
     * @param string $ip
     * @param null | string $format
     * @param null | string $delimiter
     * @return \OpenAPI\Server\Model\Get200Response | \OpenAPI\Server\Model\Get400Response | \OpenAPI\Server\Model\Get400Response
     */
    public function rootGet(
            string $ip,
            ?string $format,
            ?string $delimiter,
    ):
        \OpenAPI\Server\Model\Get200Response | 
        \OpenAPI\Server\Model\Get400Response | 
        \OpenAPI\Server\Model\Get400Response
    ;

}

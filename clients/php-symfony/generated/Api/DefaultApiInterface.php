<?php
/**
 * DefaultApiInterface
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * iplocation.net API
 *
 * OpenAPI v3 specification and a set of generated API clients for iplocation.net
 *
 * The version of the OpenAPI document: 1.0.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Api;

use Symfony\Component\HttpFoundation\File\UploadedFile;
use OpenAPI\Server\Model\Get200Response;
use OpenAPI\Server\Model\Get400Response;

/**
 * DefaultApiInterface Interface Doc Comment
 *
 * @category Interface
 * @package  OpenAPI\Server\Api
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
interface DefaultApiInterface
{

    /**
     * Operation rootGet
     *
     * Get geolocation of an IP address
     *
     * @param  string $ip  An IPv4 or IPv6 address that you would like to lookup. (required)
     * @param  string|null $format  Output format, the following formats are supported: plain xml json jsonp php csv serialized (optional)
     * @param  string|null $delimiter  Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;. (optional)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function rootGet(
        string $ip,
        ?string $format,
        ?string $delimiter,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;
}

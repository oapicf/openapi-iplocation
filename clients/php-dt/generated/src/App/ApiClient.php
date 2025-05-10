<?php
declare(strict_types=1);

namespace App;

use Articus\DataTransfer as DT;
use OpenAPIGenerator\APIClient as OAGAC;
use Psr\Http\Client\ClientExceptionInterface;
use Psr\Http\Message\ResponseInterface;

/**
 * iplocation.net API
 * OpenAPI v3 specification and a set of generated API clients for iplocation.net
 * The version of the OpenAPI document: 1.1.1-pre.0
 */
class ApiClient extends OAGAC\AbstractApiClient
{
    //region rootGet
    /**
     * Get geolocation of an IP address
     * @param \App\DTO\RootGETParameterData $parameters
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function rootGetRaw(
        \App\DTO\RootGETParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get geolocation of an IP address
     * @param \App\DTO\RootGETParameterData $parameters
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function rootGet(
        \App\DTO\RootGETParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->rootGetRaw($parameters, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Successfully processed the request. */
                $responseContent = new \App\DTO\Get200Response();
                break;
            case 400:
                /* Failed to complete the request. */
                $responseContent = new \App\DTO\Get400Response();
                break;
            case 404:
                /* Command not found. */
                $responseContent = new \App\DTO\Get400Response();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get geolocation of an IP address
     * @param \App\DTO\RootGETParameterData $parameters
     * @param string $responseMediaType
     * @return \App\DTO\Get200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function rootGetResult(
        \App\DTO\RootGETParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): \App\DTO\Get200Response
    {
        return $this->getSuccessfulContent(...$this->rootGet($parameters, $responseMediaType));
    }
    //endregion
}


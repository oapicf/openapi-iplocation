/* tslint:disable */
/* eslint-disable */
/**
 * iplocation.net API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import type { Configuration } from './configuration';
import type { AxiosPromise, AxiosInstance, RawAxiosRequestConfig } from 'axios';
import globalAxios from 'axios';
// Some imports not used depending on template conditions
// @ts-ignore
import { DUMMY_BASE_URL, assertParamExists, setApiKeyToObject, setBasicAuthToObject, setBearerAuthToObject, setOAuthToObject, setSearchParams, serializeDataIfNeeded, toPathString, createRequestFunction } from './common';
import type { RequestArgs } from './base';
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, BaseAPI, RequiredError, operationServerMap } from './base';

/**
 * 
 * @export
 * @interface Get200Response
 */
export interface Get200Response {
    /**
     * IPv4 or IPv6 address used to lookup geolocation.
     * @type {string}
     * @memberof Get200Response
     */
    'ip'?: string;
    /**
     * IP number in long integer.
     * @type {Int64}
     * @memberof Get200Response
     */
    'ip_number'?: Int64;
    /**
     * IP version either 4 or 6.
     * @type {number}
     * @memberof Get200Response
     */
    'ip_version'?: number;
    /**
     * Full name of the IP country.
     * @type {string}
     * @memberof Get200Response
     */
    'country_name'?: string;
    /**
     * ISO ALPHA-2 Country Code.
     * @type {string}
     * @memberof Get200Response
     */
    'country_code2'?: string;
    /**
     * Internet Service Provider (ISP) who owns the IP address.
     * @type {string}
     * @memberof Get200Response
     */
    'isp'?: string;
    /**
     * Response status code to indicate success or failed completion of the API call.
     * @type {string}
     * @memberof Get200Response
     */
    'response_code'?: string;
    /**
     * Response message to indicate success or failed completion of the API call.
     * @type {string}
     * @memberof Get200Response
     */
    'response_message'?: string;
}
/**
 * 
 * @export
 * @interface Get400Response
 */
export interface Get400Response {
    /**
     * Response status code to indicate success or failed completion of the API call.
     * @type {string}
     * @memberof Get400Response
     */
    'response_code'?: string;
    /**
     * Response message to indicate success or failed completion of the API call.
     * @type {string}
     * @memberof Get400Response
     */
    'response_message'?: string;
}

/**
 * DefaultApi - axios parameter creator
 * @export
 */
export const DefaultApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Retrieve geolocation of an IP address. 
         * @summary Get geolocation of an IP address
         * @param {string} ip An IPv4 or IPv6 address that you would like to lookup.
         * @param {string} [format] Output format, the following formats are supported: plain xml json jsonp php csv serialized
         * @param {string} [delimiter] Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        rootGet: async (ip: string, format?: string, delimiter?: string, options: RawAxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'ip' is not null or undefined
            assertParamExists('rootGet', 'ip', ip)
            const localVarPath = `/`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            if (ip !== undefined) {
                localVarQueryParameter['ip'] = ip;
            }

            if (format !== undefined) {
                localVarQueryParameter['format'] = format;
            }

            if (delimiter !== undefined) {
                localVarQueryParameter['delimiter'] = delimiter;
            }


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * DefaultApi - functional programming interface
 * @export
 */
export const DefaultApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = DefaultApiAxiosParamCreator(configuration)
    return {
        /**
         * Retrieve geolocation of an IP address. 
         * @summary Get geolocation of an IP address
         * @param {string} ip An IPv4 or IPv6 address that you would like to lookup.
         * @param {string} [format] Output format, the following formats are supported: plain xml json jsonp php csv serialized
         * @param {string} [delimiter] Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async rootGet(ip: string, format?: string, delimiter?: string, options?: RawAxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Get200Response>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.rootGet(ip, format, delimiter, options);
            const localVarOperationServerIndex = configuration?.serverIndex ?? 0;
            const localVarOperationServerBasePath = operationServerMap['DefaultApi.rootGet']?.[localVarOperationServerIndex]?.url;
            return (axios, basePath) => createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration)(axios, localVarOperationServerBasePath || basePath);
        },
    }
};

/**
 * DefaultApi - factory interface
 * @export
 */
export const DefaultApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = DefaultApiFp(configuration)
    return {
        /**
         * Retrieve geolocation of an IP address. 
         * @summary Get geolocation of an IP address
         * @param {string} ip An IPv4 or IPv6 address that you would like to lookup.
         * @param {string} [format] Output format, the following formats are supported: plain xml json jsonp php csv serialized
         * @param {string} [delimiter] Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        rootGet(ip: string, format?: string, delimiter?: string, options?: any): AxiosPromise<Get200Response> {
            return localVarFp.rootGet(ip, format, delimiter, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * DefaultApi - object-oriented interface
 * @export
 * @class DefaultApi
 * @extends {BaseAPI}
 */
export class DefaultApi extends BaseAPI {
    /**
     * Retrieve geolocation of an IP address. 
     * @summary Get geolocation of an IP address
     * @param {string} ip An IPv4 or IPv6 address that you would like to lookup.
     * @param {string} [format] Output format, the following formats are supported: plain xml json jsonp php csv serialized
     * @param {string} [delimiter] Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DefaultApi
     */
    public rootGet(ip: string, format?: string, delimiter?: string, options?: RawAxiosRequestConfig) {
        return DefaultApiFp(this.configuration).rootGet(ip, format, delimiter, options).then((request) => request(this.axios, this.basePath));
    }
}




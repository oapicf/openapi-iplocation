/* tslint:disable */
/* eslint-disable */
/**
 * iplocation.net API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import type { Configuration } from './configuration';
import type { AxiosPromise, AxiosInstance, AxiosRequestConfig } from 'axios';
import globalAxios from 'axios';
// Some imports not used depending on template conditions
// @ts-ignore
import { DUMMY_BASE_URL, assertParamExists, setApiKeyToObject, setBasicAuthToObject, setBearerAuthToObject, setOAuthToObject, setSearchParams, serializeDataIfNeeded, toPathString, createRequestFunction } from './common';
import type { RequestArgs } from './base';
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, BaseAPI, RequiredError } from './base';

/**
 * 
 * @export
 * @interface Get200Response
 */
export interface Get200Response {
    /**
     * IPv4 or IPv6 address used to lookup geolocation.
     * @type {any}
     * @memberof Get200Response
     */
    'ip'?: any;
    /**
     * IP number in long integer.
     * @type {any}
     * @memberof Get200Response
     */
    'ip_number'?: any;
    /**
     * IP version either 4 or 6.
     * @type {any}
     * @memberof Get200Response
     */
    'ip_version'?: any;
    /**
     * Full name of the IP country.
     * @type {any}
     * @memberof Get200Response
     */
    'country_name'?: any;
    /**
     * ISO ALPHA-2 Country Code.
     * @type {any}
     * @memberof Get200Response
     */
    'country_code2'?: any;
    /**
     * Internet Service Provider (ISP) who owns the IP address.
     * @type {any}
     * @memberof Get200Response
     */
    'isp'?: any;
    /**
     * Response status code to indicate success or failed completion of the API call.
     * @type {any}
     * @memberof Get200Response
     */
    'response_code'?: any;
    /**
     * Response message to indicate success or failed completion of the API call.
     * @type {any}
     * @memberof Get200Response
     */
    'response_message'?: any;
}
/**
 * 
 * @export
 * @interface Get400Response
 */
export interface Get400Response {
    /**
     * Response status code to indicate success or failed completion of the API call.
     * @type {any}
     * @memberof Get400Response
     */
    'response_code'?: any;
    /**
     * Response message to indicate success or failed completion of the API call.
     * @type {any}
     * @memberof Get400Response
     */
    'response_message'?: any;
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
         * @param {any} ip An IPv4 or IPv6 address that you would like to lookup.
         * @param {any} [format] Output format, the following formats are supported: plain xml json jsonp php csv serialized
         * @param {any} [delimiter] Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        rootGet: async (ip: any, format?: any, delimiter?: any, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
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
         * @param {any} ip An IPv4 or IPv6 address that you would like to lookup.
         * @param {any} [format] Output format, the following formats are supported: plain xml json jsonp php csv serialized
         * @param {any} [delimiter] Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async rootGet(ip: any, format?: any, delimiter?: any, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Get200Response>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.rootGet(ip, format, delimiter, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
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
         * @param {any} ip An IPv4 or IPv6 address that you would like to lookup.
         * @param {any} [format] Output format, the following formats are supported: plain xml json jsonp php csv serialized
         * @param {any} [delimiter] Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        rootGet(ip: any, format?: any, delimiter?: any, options?: any): AxiosPromise<Get200Response> {
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
     * @param {any} ip An IPv4 or IPv6 address that you would like to lookup.
     * @param {any} [format] Output format, the following formats are supported: plain xml json jsonp php csv serialized
     * @param {any} [delimiter] Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DefaultApi
     */
    public rootGet(ip: any, format?: any, delimiter?: any, options?: AxiosRequestConfig) {
        return DefaultApiFp(this.configuration).rootGet(ip, format, delimiter, options).then((request) => request(this.axios, this.basePath));
    }
}



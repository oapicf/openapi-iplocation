// @flow
/* eslint-disable no-use-before-define */
/**
 * iplocation.net API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import * as url from "url";
import * as portableFetch from "portable-fetch";
import { Configuration } from "./configuration";

const BASE_PATH: string = "https://api.iplocation.net".replace(/\/+$/, "");

/**
 *
 * @export
 */
export const COLLECTION_FORMATS = {
    csv: ",",
    ssv: " ",
    tsv: "\t",
    pipes: "|",
};

/**
 *
 * @export
 */
export type FetchAPI = {
    (url: string, init?: any): Promise<Response>;
}

/**
 *
 * @export
 */
export type FetchArgs = {
    url: string;
    options: {};
}

/**
 *
 * @export
 */
export type RequestOptions = {
    headers?: {};
    query?: {};
    body?: string | FormData;
}

/**
 * * @export
 * @class RequiredError
 * @extends {Error}
 */
export class RequiredError extends Error {
    name:string = "RequiredError"
    constructor(field: string, msg?: string) {
        super(msg);
    }
}

/**
 * 
 * @export
 */
export type Get200Response = {
    /**
     * IPv4 or IPv6 address used to lookup geolocation.
     * @type {AnyType}
     * @memberof Get200Response
     */
    ip?: AnyType;
    /**
     * IP number in long integer.
     * @type {AnyType}
     * @memberof Get200Response
     */
    ip_number?: AnyType;
    /**
     * IP version either 4 or 6.
     * @type {AnyType}
     * @memberof Get200Response
     */
    ip_version?: AnyType;
    /**
     * Full name of the IP country.
     * @type {AnyType}
     * @memberof Get200Response
     */
    country_name?: AnyType;
    /**
     * ISO ALPHA-2 Country Code.
     * @type {AnyType}
     * @memberof Get200Response
     */
    country_code2?: AnyType;
    /**
     * Internet Service Provider (ISP) who owns the IP address.
     * @type {AnyType}
     * @memberof Get200Response
     */
    isp?: AnyType;
    /**
     * Response status code to indicate success or failed completion of the API call.
     * @type {AnyType}
     * @memberof Get200Response
     */
    response_code?: AnyType;
    /**
     * Response message to indicate success or failed completion of the API call.
     * @type {AnyType}
     * @memberof Get200Response
     */
    response_message?: AnyType;
}

/**
 * 
 * @export
 */
export type Get400Response = {
    /**
     * Response status code to indicate success or failed completion of the API call.
     * @type {AnyType}
     * @memberof Get400Response
     */
    response_code?: AnyType;
    /**
     * Response message to indicate success or failed completion of the API call.
     * @type {AnyType}
     * @memberof Get400Response
     */
    response_message?: AnyType;
}



/**
 * DefaultApi - fetch parameter creator
 * @export
 */
export const DefaultApiFetchParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Retrieve geolocation of an IP address. 
         * @summary Get geolocation of an IP address
         * @throws {RequiredError}
         */
        rootGet(ip: AnyType, format?: AnyType, delimiter?: AnyType, options: RequestOptions): FetchArgs {
            // verify required parameter 'ip' is not null or undefined
            if (ip === null || ip === undefined) {
                throw new RequiredError('ip','Required parameter ip was null or undefined when calling rootGet.');
            }
            const localVarPath = `/`;
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            if (ip !== undefined) {
                localVarQueryParameter['ip'] = ((ip:any):string);
            }

            if (format !== undefined) {
                localVarQueryParameter['format'] = ((format:any):string);
            }

            if (delimiter !== undefined) {
                localVarQueryParameter['delimiter'] = ((delimiter:any):string);
            }

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            localVarUrlObj.search = null;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

export type DefaultApiType = { 
    rootGet(ip: AnyType, format?: AnyType, delimiter?: AnyType, options?: RequestOptions): Promise<Get200Response>,
}

/**
 * DefaultApi - factory function to inject configuration 
 * @export
 */
export const DefaultApi = function(configuration?: Configuration, fetch: FetchAPI = portableFetch): DefaultApiType {
    const basePath: string = (configuration && configuration.basePath) || BASE_PATH;
    return {
        /**
         * Retrieve geolocation of an IP address. 
         * @summary Get geolocation of an IP address
         * @throws {RequiredError}
         */
        rootGet(ip: AnyType, format?: AnyType, delimiter?: AnyType, options?: RequestOptions = {}): Promise<Get200Response> {
            const localVarFetchArgs = DefaultApiFetchParamCreator(configuration).rootGet(ip, format, delimiter, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
    }
};


export type ApiTypes = { 
    DefaultApi: DefaultApiType,
 }

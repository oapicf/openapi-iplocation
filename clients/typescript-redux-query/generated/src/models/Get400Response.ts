// tslint:disable
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

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface Get400Response
 */
export interface Get400Response  {
    /**
     * Response status code to indicate success or failed completion of the API call.
     * @type {any}
     * @memberof Get400Response
     */
    responseCode?: any;
    /**
     * Response message to indicate success or failed completion of the API call.
     * @type {any}
     * @memberof Get400Response
     */
    responseMessage?: any;
}

export function Get400ResponseFromJSON(json: any): Get400Response {
    return {
        'responseCode': !exists(json, 'response_code') ? undefined : json['response_code'],
        'responseMessage': !exists(json, 'response_message') ? undefined : json['response_message'],
    };
}

export function Get400ResponseToJSON(value?: Get400Response): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'response_code': value.responseCode,
        'response_message': value.responseMessage,
    };
}



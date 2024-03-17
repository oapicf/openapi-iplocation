// tslint:disable
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

import { exists, mapValues } from '../runtime';
import {
    Int64,
    Int64FromJSON,
    Int64ToJSON,
} from './';

/**
 * 
 * @export
 * @interface Get200Response
 */
export interface Get200Response  {
    /**
     * IPv4 or IPv6 address used to lookup geolocation.
     * @type {string}
     * @memberof Get200Response
     */
    ip?: string;
    /**
     * IP number in long integer.
     * @type {Int64}
     * @memberof Get200Response
     */
    ipNumber?: Int64;
    /**
     * IP version either 4 or 6.
     * @type {number}
     * @memberof Get200Response
     */
    ipVersion?: number;
    /**
     * Full name of the IP country.
     * @type {string}
     * @memberof Get200Response
     */
    countryName?: string;
    /**
     * ISO ALPHA-2 Country Code.
     * @type {string}
     * @memberof Get200Response
     */
    countryCode2?: string;
    /**
     * Internet Service Provider (ISP) who owns the IP address.
     * @type {string}
     * @memberof Get200Response
     */
    isp?: string;
    /**
     * Response status code to indicate success or failed completion of the API call.
     * @type {string}
     * @memberof Get200Response
     */
    responseCode?: string;
    /**
     * Response message to indicate success or failed completion of the API call.
     * @type {string}
     * @memberof Get200Response
     */
    responseMessage?: string;
}

export function Get200ResponseFromJSON(json: any): Get200Response {
    return {
        'ip': !exists(json, 'ip') ? undefined : json['ip'],
        'ipNumber': !exists(json, 'ip_number') ? undefined : Int64FromJSON(json['ip_number']),
        'ipVersion': !exists(json, 'ip_version') ? undefined : json['ip_version'],
        'countryName': !exists(json, 'country_name') ? undefined : json['country_name'],
        'countryCode2': !exists(json, 'country_code2') ? undefined : json['country_code2'],
        'isp': !exists(json, 'isp') ? undefined : json['isp'],
        'responseCode': !exists(json, 'response_code') ? undefined : json['response_code'],
        'responseMessage': !exists(json, 'response_message') ? undefined : json['response_message'],
    };
}

export function Get200ResponseToJSON(value?: Get200Response): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'ip': value.ip,
        'ip_number': Int64ToJSON(value.ipNumber),
        'ip_version': value.ipVersion,
        'country_name': value.countryName,
        'country_code2': value.countryCode2,
        'isp': value.isp,
        'response_code': value.responseCode,
        'response_message': value.responseMessage,
    };
}



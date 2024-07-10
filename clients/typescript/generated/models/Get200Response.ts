/**
 * iplocation.net API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { Int64 } from '../models/Int64';
import { HttpFile } from '../http/http';

export class Get200Response {
    /**
    * IPv4 or IPv6 address used to lookup geolocation.
    */
    'ip'?: string;
    /**
    * IP number in long integer.
    */
    'ipNumber'?: Int64;
    /**
    * IP version either 4 or 6.
    */
    'ipVersion'?: number;
    /**
    * Full name of the IP country.
    */
    'countryName'?: string;
    /**
    * ISO ALPHA-2 Country Code.
    */
    'countryCode2'?: string;
    /**
    * Internet Service Provider (ISP) who owns the IP address.
    */
    'isp'?: string;
    /**
    * Response status code to indicate success or failed completion of the API call.
    */
    'responseCode'?: string;
    /**
    * Response message to indicate success or failed completion of the API call.
    */
    'responseMessage'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "ip",
            "baseName": "ip",
            "type": "string",
            "format": ""
        },
        {
            "name": "ipNumber",
            "baseName": "ip_number",
            "type": "Int64",
            "format": ""
        },
        {
            "name": "ipVersion",
            "baseName": "ip_version",
            "type": "number",
            "format": ""
        },
        {
            "name": "countryName",
            "baseName": "country_name",
            "type": "string",
            "format": ""
        },
        {
            "name": "countryCode2",
            "baseName": "country_code2",
            "type": "string",
            "format": ""
        },
        {
            "name": "isp",
            "baseName": "isp",
            "type": "string",
            "format": ""
        },
        {
            "name": "responseCode",
            "baseName": "response_code",
            "type": "string",
            "format": ""
        },
        {
            "name": "responseMessage",
            "baseName": "response_message",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Get200Response.attributeTypeMap;
    }

    public constructor() {
    }
}

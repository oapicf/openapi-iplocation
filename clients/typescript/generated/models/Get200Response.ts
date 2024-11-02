/**
 * iplocation.net API
 * OpenAPI v3 specification and a set of generated API clients for iplocation.net
 *
 * OpenAPI spec version: 1.0.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

export class Get200Response {
    /**
    * IPv4 or IPv6 address used to lookup geolocation.
    */
    'ip'?: string;
    /**
    * IP number in long integer (represented as string).
    */
    'ipNumber'?: string;
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

    static readonly mapping: {[index: string]: string} | undefined = undefined;

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
            "type": "string",
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

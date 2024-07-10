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

import { RequestFile } from './models';
import { Int64 } from './int64';

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

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "ip",
            "baseName": "ip",
            "type": "string"
        },
        {
            "name": "ipNumber",
            "baseName": "ip_number",
            "type": "Int64"
        },
        {
            "name": "ipVersion",
            "baseName": "ip_version",
            "type": "number"
        },
        {
            "name": "countryName",
            "baseName": "country_name",
            "type": "string"
        },
        {
            "name": "countryCode2",
            "baseName": "country_code2",
            "type": "string"
        },
        {
            "name": "isp",
            "baseName": "isp",
            "type": "string"
        },
        {
            "name": "responseCode",
            "baseName": "response_code",
            "type": "string"
        },
        {
            "name": "responseMessage",
            "baseName": "response_message",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return Get200Response.attributeTypeMap;
    }
}

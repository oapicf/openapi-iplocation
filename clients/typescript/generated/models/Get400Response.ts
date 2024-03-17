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

import { HttpFile } from '../http/http';

export class Get400Response {
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
        return Get400Response.attributeTypeMap;
    }

    public constructor() {
    }
}


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

import type { Observable } from 'rxjs';
import type { AjaxResponse } from 'rxjs/ajax';
import { BaseAPI, throwIfNullOrUndefined } from '../runtime';
import type { OperationOpts, HttpQuery } from '../runtime';
import type {
    Get200Response,
    Get400Response,
} from '../models';

export interface RootGetRequest {
    ip: any;
    format?: any;
    delimiter?: any;
}

/**
 * no description
 */
export class DefaultApi extends BaseAPI {

    /**
     * Retrieve geolocation of an IP address. 
     * Get geolocation of an IP address
     */
    rootGet({ ip, format, delimiter }: RootGetRequest): Observable<Get200Response>
    rootGet({ ip, format, delimiter }: RootGetRequest, opts?: OperationOpts): Observable<AjaxResponse<Get200Response>>
    rootGet({ ip, format, delimiter }: RootGetRequest, opts?: OperationOpts): Observable<Get200Response | AjaxResponse<Get200Response>> {
        throwIfNullOrUndefined(ip, 'ip', 'rootGet');

        const query: HttpQuery = { // required parameters are used directly since they are already checked by throwIfNullOrUndefined
            'ip': ip,
        };

        if (format != null) { query['format'] = format; }
        if (delimiter != null) { query['delimiter'] = delimiter; }

        return this.request<Get200Response>({
            url: '/',
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

}

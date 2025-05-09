// tslint:disable
/**
 * iplocation.net API
 * OpenAPI v3 specification and a set of generated API clients for iplocation.net
 *
 * The version of the OpenAPI document: 1.1.1-pre.0
 * Contact: blah+oapicf@cliffano.com
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
    ip: string;
    format?: string;
    delimiter?: string;
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

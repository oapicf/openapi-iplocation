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
/* tslint:disable:no-unused-variable member-ordering */

import { Observable } from 'rxjs/Observable';

import { map } from 'rxjs/operators';
import IHttpClient from '../IHttpClient';
import { inject, injectable } from 'inversify';
import { IAPIConfiguration } from '../IAPIConfiguration';
import { Headers } from '../Headers';
import HttpResponse from '../HttpResponse';

import { Get200Response } from '../model/get200Response';
import { Get400Response } from '../model/get400Response';

import { COLLECTION_FORMATS }  from '../variables';



@injectable()
export class DefaultService {
    private basePath: string = 'https://api.iplocation.net';

    constructor(@inject('IApiHttpClient') private httpClient: IHttpClient,
        @inject('IAPIConfiguration') private APIConfiguration: IAPIConfiguration ) {
        if(this.APIConfiguration.basePath)
            this.basePath = this.APIConfiguration.basePath;
    }

    /**
     * Get geolocation of an IP address
     * Retrieve geolocation of an IP address. 
     * @param ip An IPv4 or IPv6 address that you would like to lookup.
     * @param format Output format, the following formats are supported: plain xml json jsonp php csv serialized
     * @param delimiter Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;.
     
     */
    public rootGet(ip: string, format?: string, delimiter?: string, observe?: 'body', headers?: Headers): Observable<Get200Response>;
    public rootGet(ip: string, format?: string, delimiter?: string, observe?: 'response', headers?: Headers): Observable<HttpResponse<Get200Response>>;
    public rootGet(ip: string, format?: string, delimiter?: string, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (ip === null || ip === undefined){
            throw new Error('Required parameter ip was null or undefined when calling rootGet.');
        }

        let queryParameters: string[] = [];
        if (ip !== undefined) {
            queryParameters.push('ip='+encodeURIComponent(String(ip)));
        }
        if (format !== undefined) {
            queryParameters.push('format='+encodeURIComponent(String(format)));
        }
        if (delimiter !== undefined) {
            queryParameters.push('delimiter='+encodeURIComponent(String(delimiter)));
        }

        headers['Accept'] = 'application/json';

        const response: Observable<HttpResponse<Get200Response>> = this.httpClient.get(`${this.basePath}/?${queryParameters.join('&')}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <Get200Response>(httpResponse.response))
               );
        }
        return response;
    }

}

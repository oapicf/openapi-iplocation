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


import { Meta, OptimisticUpdate, QueryKey, QueryOptions, Rollback, TransformStrategy, Update } from "redux-query";

export const BASE_PATH = "https://api.iplocation.net".replace(/\/+$/, "");

export const Configuration = {
    basePath: '', // This is the value that will be prepended to all endpoints.  For compatibility with
                  // previous versions, the default is an empty string.  Other generators typically use
                  // BASE_PATH as the default.
};

export interface TypedQueryConfig<TState, TBody> {
    force?: boolean;
    meta?: Meta;
    options?: QueryOptions;
    queryKey?: QueryKey;
    update?: Update<TState>;
    optimisticUpdate?: OptimisticUpdate<TState>;
    retry?: boolean;
    rollback?: Rollback<TState>;
    transform?: TransformStrategy<TState, TBody>
}

export class RequiredError extends Error {
    name: "RequiredError" = "RequiredError";
    constructor(public field: string, msg?: string) {
        super(msg);
    }
}

export const COLLECTION_FORMATS = {
    csv: ",",
    ssv: " ",
    tsv: "\t",
    pipes: "|",
};

export type ModelPropertyNaming = 'camelCase' | 'snake_case' | 'PascalCase' | 'original';

export type HttpHeaders = { [key: string]: string };

export function exists(json: any, key: string) {
    const value = json[key];
    return value !== null && value !== undefined;
}

export function mapValues(data: any, fn: (item: any) => any) {
  return Object.keys(data).reduce(
    (acc, key) => ({ ...acc, [key]: fn(data[key]) }),
    {}
  );
}
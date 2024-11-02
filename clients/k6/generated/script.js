/*
 * iplocation.net API
 * OpenAPI v3 specification and a set of generated API clients for iplocation.net
 *
 * OpenAPI spec version: 1.0.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://github.com/OpenAPITools/openapi-generator
 *
 * Generator version: 7.9.0
 */


import http from "k6/http";
import { group, check, sleep } from "k6";

const BASE_URL = "https://api.iplocation.net";
// Sleep duration between successive requests.
// You might want to edit the value of this variable or remove calls to the sleep function on the script.
const SLEEP_DURATION = 0.1;
// Global variables should be initialized.

export default function() {
    group("/", () => {
        let delimiter = 'TODO_EDIT_THE_DELIMITER'; // specify value as there is no example value for this parameter in OpenAPI spec
        let ip = 'TODO_EDIT_THE_IP'; // specify value as there is no example value for this parameter in OpenAPI spec
        let format = 'TODO_EDIT_THE_FORMAT'; // specify value as there is no example value for this parameter in OpenAPI spec

        // Request No. 1: 
        {
            let url = BASE_URL + `/?ip=${ip}&format=${format}&delimiter=${delimiter}`;
            let request = http.get(url);

            check(request, {
                "Successfully processed the request.": (r) => r.status === 200
            });
        }
    });

}

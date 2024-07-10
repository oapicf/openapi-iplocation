/*
 * iplocation.net API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

use crate::models;

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct Get400Response {
    /// Response status code to indicate success or failed completion of the API call.
    #[serde(rename = "response_code", skip_serializing_if = "Option::is_none")]
    pub response_code: Option<String>,
    /// Response message to indicate success or failed completion of the API call.
    #[serde(rename = "response_message", skip_serializing_if = "Option::is_none")]
    pub response_message: Option<String>,
}

impl Get400Response {
    pub fn new() -> Get400Response {
        Get400Response {
            response_code: None,
            response_message: None,
        }
    }
}

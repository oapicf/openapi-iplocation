use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Multipart};
use bytes::Bytes;
use http::Method;
use serde::{Deserialize, Serialize};

use crate::{models, types::*};

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum RootGetResponse {
    /// Successfully processed the request.
    Status200_SuccessfullyProcessedTheRequest
    (models::Get200Response)
    ,
    /// Failed to complete the request.
    Status400_FailedToCompleteTheRequest
    (models::Get400Response)
    ,
    /// Command not found.
    Status404_CommandNotFound
    (models::Get400Response)
}


/// Default
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Default {
    /// Get geolocation of an IP address.
    ///
    /// RootGet - GET /
    async fn root_get(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      query_params: models::RootGetQueryParams,
    ) -> Result<RootGetResponse, String>;
}

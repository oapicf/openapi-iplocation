# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.default_api_base import BaseDefaultApi
import openapi_server.impl

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    HTTPException,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
from pydantic import Field, StrictStr
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.get200_response import Get200Response
from openapi_server.models.get400_response import Get400Response


router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/",
    responses={
        200: {"model": Get200Response, "description": "Successfully processed the request."},
        400: {"model": Get400Response, "description": "Failed to complete the request."},
        404: {"model": Get400Response, "description": "Command not found."},
    },
    tags=["default"],
    summary="Get geolocation of an IP address",
    response_model_by_alias=True,
)
async def root_get(
    ip: Annotated[StrictStr, Field(description="An IPv4 or IPv6 address that you would like to lookup.")] = Query(None, description="An IPv4 or IPv6 address that you would like to lookup.", alias="ip"),
    format: Annotated[Optional[StrictStr], Field(description="Output format, the following formats are supported: plain xml json jsonp php csv serialized")] = Query(None, description="Output format, the following formats are supported: plain xml json jsonp php csv serialized", alias="format"),
    delimiter: Annotated[Optional[StrictStr], Field(description="Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".")] = Query(None, description="Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;.", alias="delimiter"),
) -> Get200Response:
    """Retrieve geolocation of an IP address. """
    if not BaseDefaultApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseDefaultApi.subclasses[0]().root_get(ip, format, delimiter)

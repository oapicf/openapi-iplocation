# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictStr
from typing import Optional
from typing_extensions import Annotated
from openapi_server.models.get200_response import Get200Response
from openapi_server.models.get400_response import Get400Response


class BaseDefaultApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseDefaultApi.subclasses = BaseDefaultApi.subclasses + (cls,)
    async def root_get(
        self,
        ip: Annotated[StrictStr, Field(description="An IPv4 or IPv6 address that you would like to lookup.")],
        format: Annotated[Optional[StrictStr], Field(description="Output format, the following formats are supported: plain xml json jsonp php csv serialized")],
        delimiter: Annotated[Optional[StrictStr], Field(description="Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".")],
    ) -> Get200Response:
        """Retrieve geolocation of an IP address. """
        ...

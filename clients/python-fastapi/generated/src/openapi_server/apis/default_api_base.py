# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from openapi_server.models.get200_response import Get200Response
from openapi_server.models.get400_response import Get400Response


class BaseDefaultApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseDefaultApi.subclasses = BaseDefaultApi.subclasses + (cls,)
    async def root_get(
        self,
        ip: str,
        format: str,
        delimiter: str,
    ) -> Get200Response:
        """Retrieve geolocation of an IP address. """
        ...

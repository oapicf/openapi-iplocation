from typing import List, Dict
from aiohttp import web

from openapi_server.models.get200_response import Get200Response
from openapi_server.models.get400_response import Get400Response
from openapi_server import util


async def root_get(request: web.Request, ip, format=None, delimiter=None) -> web.Response:
    """Get geolocation of an IP address

    Retrieve geolocation of an IP address. 

    :param ip: An IPv4 or IPv6 address that you would like to lookup.
    :type ip: str
    :param format: Output format, the following formats are supported: plain xml json jsonp php csv serialized
    :type format: str
    :param delimiter: Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;.
    :type delimiter: str

    """
    return web.Response(status=200)

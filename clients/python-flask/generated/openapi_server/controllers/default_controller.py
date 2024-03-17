import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.get200_response import Get200Response  # noqa: E501
from openapi_server.models.get400_response import Get400Response  # noqa: E501
from openapi_server import util


def root_get(ip, format=None, delimiter=None):  # noqa: E501
    """Get geolocation of an IP address

    Retrieve geolocation of an IP address.  # noqa: E501

    :param ip: An IPv4 or IPv6 address that you would like to lookup.
    :type ip: str
    :param format: Output format, the following formats are supported: plain xml json jsonp php csv serialized
    :type format: str
    :param delimiter: Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;.
    :type delimiter: str

    :rtype: Union[Get200Response, Tuple[Get200Response, int], Tuple[Get200Response, int, Dict[str, str]]
    """
    return 'do some magic!'

import connexion
import six

from app.openapi_server.models.get200_response import Get200Response  # noqa: E501
from app.openapi_server.models.get400_response import Get400Response  # noqa: E501
from openapi_server import util


def root_get(ip, format=None, delimiter=None):  # noqa: E501
    """Get geolocation of an IP address

    Retrieve geolocation of an IP address.  # noqa: E501

    :param ip: An IPv4 or IPv6 address that you would like to lookup.
    :type ip: dict | bytes
    :param format: Output format, the following formats are supported: plain xml json jsonp php csv serialized
    :type format: dict | bytes
    :param delimiter: Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \&quot;\\n\&quot;, 2 for \&quot;&lt;br&gt;\&quot;.
    :type delimiter: dict | bytes

    :rtype: Get200Response
    """
    if connexion.request.is_json:
        ip = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        format = .from_dict(connexion.request.get_json())  # noqa: E501
    if connexion.request.is_json:
        delimiter = .from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'

# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.get200_response import Get200Response  # noqa: F401
from openapi_server.models.get400_response import Get400Response  # noqa: F401


def test_root_get(client: TestClient):
    """Test case for root_get

    Get geolocation of an IP address
    """
    params = [("ip", 'ip_example'),     ("format", 'format_example'),     ("delimiter", 'delimiter_example')]
    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


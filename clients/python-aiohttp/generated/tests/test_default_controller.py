# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.get200_response import Get200Response
from openapi_server.models.get400_response import Get400Response


pytestmark = pytest.mark.asyncio

async def test_root_get(client):
    """Test case for root_get

    Get geolocation of an IP address
    """
    params = [('ip', 'ip_example'),
                    ('format', 'format_example'),
                    ('delimiter', 'delimiter_example')]
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


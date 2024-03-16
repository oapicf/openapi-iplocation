# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.get200_response import Get200Response  # noqa: E501
from openapi_server.models.get400_response import Get400Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_root_get(self):
        """Test case for root_get

        Get geolocation of an IP address
        """
        query_string = [('ip', None),
                        ('format', None),
                        ('delimiter', None)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()

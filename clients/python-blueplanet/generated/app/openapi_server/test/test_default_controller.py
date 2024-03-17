# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.get200_response import Get200Response  # noqa: E501
from app.openapi_server.models.get400_response import Get400Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_root_get(self):
        """Test case for root_get

        Get geolocation of an IP address
        """
        query_string = [('ip', 'ip_example'),
                        ('format', 'format_example'),
                        ('delimiter', 'delimiter_example')]
        response = self.client.open(
            '/',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()

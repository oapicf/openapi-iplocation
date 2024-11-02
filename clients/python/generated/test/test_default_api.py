# coding: utf-8

"""
    iplocation.net API

    OpenAPI v3 specification and a set of generated API clients for iplocation.net

    The version of the OpenAPI document: 1.0.1-pre.0
    Contact: blah+oapicf@cliffano.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapiiplocation.api.default_api import DefaultApi


class TestDefaultApi(unittest.TestCase):
    """DefaultApi unit test stubs"""

    def setUp(self) -> None:
        self.api = DefaultApi()

    def tearDown(self) -> None:
        pass

    def test_root_get(self) -> None:
        """Test case for root_get

        Get geolocation of an IP address
        """
        pass


if __name__ == '__main__':
    unittest.main()

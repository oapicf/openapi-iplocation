# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from app.openapi_server.models.int64 import Int64  # noqa: F401,E501
from openapi_server import util


class Get200Response(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, ip: str=None, ip_number: Int64=None, ip_version: int=None, country_name: str=None, country_code2: str=None, isp: str=None, response_code: str=None, response_message: str=None):  # noqa: E501
        """Get200Response - a model defined in Swagger

        :param ip: The ip of this Get200Response.  # noqa: E501
        :type ip: str
        :param ip_number: The ip_number of this Get200Response.  # noqa: E501
        :type ip_number: Int64
        :param ip_version: The ip_version of this Get200Response.  # noqa: E501
        :type ip_version: int
        :param country_name: The country_name of this Get200Response.  # noqa: E501
        :type country_name: str
        :param country_code2: The country_code2 of this Get200Response.  # noqa: E501
        :type country_code2: str
        :param isp: The isp of this Get200Response.  # noqa: E501
        :type isp: str
        :param response_code: The response_code of this Get200Response.  # noqa: E501
        :type response_code: str
        :param response_message: The response_message of this Get200Response.  # noqa: E501
        :type response_message: str
        """
        self.swagger_types = {
            'ip': str,
            'ip_number': Int64,
            'ip_version': int,
            'country_name': str,
            'country_code2': str,
            'isp': str,
            'response_code': str,
            'response_message': str
        }

        self.attribute_map = {
            'ip': 'ip',
            'ip_number': 'ip_number',
            'ip_version': 'ip_version',
            'country_name': 'country_name',
            'country_code2': 'country_code2',
            'isp': 'isp',
            'response_code': 'response_code',
            'response_message': 'response_message'
        }

        self._ip = ip
        self._ip_number = ip_number
        self._ip_version = ip_version
        self._country_name = country_name
        self._country_code2 = country_code2
        self._isp = isp
        self._response_code = response_code
        self._response_message = response_message

    @classmethod
    def from_dict(cls, dikt) -> 'Get200Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The __get_200_response of this Get200Response.  # noqa: E501
        :rtype: Get200Response
        """
        return util.deserialize_model(dikt, cls)

    @property
    def ip(self) -> str:
        """Gets the ip of this Get200Response.

        IPv4 or IPv6 address used to lookup geolocation.  # noqa: E501

        :return: The ip of this Get200Response.
        :rtype: str
        """
        return self._ip

    @ip.setter
    def ip(self, ip: str):
        """Sets the ip of this Get200Response.

        IPv4 or IPv6 address used to lookup geolocation.  # noqa: E501

        :param ip: The ip of this Get200Response.
        :type ip: str
        """

        self._ip = ip

    @property
    def ip_number(self) -> Int64:
        """Gets the ip_number of this Get200Response.

        IP number in long integer.  # noqa: E501

        :return: The ip_number of this Get200Response.
        :rtype: Int64
        """
        return self._ip_number

    @ip_number.setter
    def ip_number(self, ip_number: Int64):
        """Sets the ip_number of this Get200Response.

        IP number in long integer.  # noqa: E501

        :param ip_number: The ip_number of this Get200Response.
        :type ip_number: Int64
        """

        self._ip_number = ip_number

    @property
    def ip_version(self) -> int:
        """Gets the ip_version of this Get200Response.

        IP version either 4 or 6.  # noqa: E501

        :return: The ip_version of this Get200Response.
        :rtype: int
        """
        return self._ip_version

    @ip_version.setter
    def ip_version(self, ip_version: int):
        """Sets the ip_version of this Get200Response.

        IP version either 4 or 6.  # noqa: E501

        :param ip_version: The ip_version of this Get200Response.
        :type ip_version: int
        """

        self._ip_version = ip_version

    @property
    def country_name(self) -> str:
        """Gets the country_name of this Get200Response.

        Full name of the IP country.  # noqa: E501

        :return: The country_name of this Get200Response.
        :rtype: str
        """
        return self._country_name

    @country_name.setter
    def country_name(self, country_name: str):
        """Sets the country_name of this Get200Response.

        Full name of the IP country.  # noqa: E501

        :param country_name: The country_name of this Get200Response.
        :type country_name: str
        """

        self._country_name = country_name

    @property
    def country_code2(self) -> str:
        """Gets the country_code2 of this Get200Response.

        ISO ALPHA-2 Country Code.  # noqa: E501

        :return: The country_code2 of this Get200Response.
        :rtype: str
        """
        return self._country_code2

    @country_code2.setter
    def country_code2(self, country_code2: str):
        """Sets the country_code2 of this Get200Response.

        ISO ALPHA-2 Country Code.  # noqa: E501

        :param country_code2: The country_code2 of this Get200Response.
        :type country_code2: str
        """

        self._country_code2 = country_code2

    @property
    def isp(self) -> str:
        """Gets the isp of this Get200Response.

        Internet Service Provider (ISP) who owns the IP address.  # noqa: E501

        :return: The isp of this Get200Response.
        :rtype: str
        """
        return self._isp

    @isp.setter
    def isp(self, isp: str):
        """Sets the isp of this Get200Response.

        Internet Service Provider (ISP) who owns the IP address.  # noqa: E501

        :param isp: The isp of this Get200Response.
        :type isp: str
        """

        self._isp = isp

    @property
    def response_code(self) -> str:
        """Gets the response_code of this Get200Response.

        Response status code to indicate success or failed completion of the API call.  # noqa: E501

        :return: The response_code of this Get200Response.
        :rtype: str
        """
        return self._response_code

    @response_code.setter
    def response_code(self, response_code: str):
        """Sets the response_code of this Get200Response.

        Response status code to indicate success or failed completion of the API call.  # noqa: E501

        :param response_code: The response_code of this Get200Response.
        :type response_code: str
        """

        self._response_code = response_code

    @property
    def response_message(self) -> str:
        """Gets the response_message of this Get200Response.

        Response message to indicate success or failed completion of the API call.  # noqa: E501

        :return: The response_message of this Get200Response.
        :rtype: str
        """
        return self._response_message

    @response_message.setter
    def response_message(self, response_message: str):
        """Sets the response_message of this Get200Response.

        Response message to indicate success or failed completion of the API call.  # noqa: E501

        :param response_message: The response_message of this Get200Response.
        :type response_message: str
        """

        self._response_message = response_message

# coding: utf-8

"""
    iplocation.net API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    The version of the OpenAPI document: 0.9.0-pre.0
    Contact: blah@cliffano.com
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import re  # noqa: F401

from pydantic import validate_arguments, ValidationError
from typing_extensions import Annotated

from pydantic import Field

from typing import Any, Optional

from openapi_client.models.get200_response import Get200Response

from openapi_client.api_client import ApiClient
from openapi_client.exceptions import (  # noqa: F401
    ApiTypeError,
    ApiValueError
)


class DefaultApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient.get_default()
        self.api_client = api_client

    @validate_arguments
    def root_get(self, ip : Annotated[Any, Field(..., description="An IPv4 or IPv6 address that you would like to lookup.")], format : Annotated[Optional[Any], Field(description="Output format, the following formats are supported: plain xml json jsonp php csv serialized")] = None, delimiter : Annotated[Optional[Any], Field(description="Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".")] = None, **kwargs) -> Get200Response:  # noqa: E501
        """Get geolocation of an IP address  # noqa: E501

        Retrieve geolocation of an IP address.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.root_get(ip, format, delimiter, async_req=True)
        >>> result = thread.get()

        :param ip: An IPv4 or IPv6 address that you would like to lookup. (required)
        :type ip: object
        :param format: Output format, the following formats are supported: plain xml json jsonp php csv serialized
        :type format: object
        :param delimiter: Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".
        :type delimiter: object
        :param async_req: Whether to execute the request asynchronously.
        :type async_req: bool, optional
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :type _preload_content: bool, optional
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: Returns the result object.
                 If the method is called asynchronously,
                 returns the request thread.
        :rtype: Get200Response
        """
        kwargs['_return_http_data_only'] = True
        return self.root_get_with_http_info(ip, format, delimiter, **kwargs)  # noqa: E501

    @validate_arguments
    def root_get_with_http_info(self, ip : Annotated[Any, Field(..., description="An IPv4 or IPv6 address that you would like to lookup.")], format : Annotated[Optional[Any], Field(description="Output format, the following formats are supported: plain xml json jsonp php csv serialized")] = None, delimiter : Annotated[Optional[Any], Field(description="Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".")] = None, **kwargs):  # noqa: E501
        """Get geolocation of an IP address  # noqa: E501

        Retrieve geolocation of an IP address.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.root_get_with_http_info(ip, format, delimiter, async_req=True)
        >>> result = thread.get()

        :param ip: An IPv4 or IPv6 address that you would like to lookup. (required)
        :type ip: object
        :param format: Output format, the following formats are supported: plain xml json jsonp php csv serialized
        :type format: object
        :param delimiter: Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".
        :type delimiter: object
        :param async_req: Whether to execute the request asynchronously.
        :type async_req: bool, optional
        :param _return_http_data_only: response data without head status code
                                       and headers
        :type _return_http_data_only: bool, optional
        :param _preload_content: if False, the urllib3.HTTPResponse object will
                                 be returned without reading/decoding response
                                 data. Default is True.
        :type _preload_content: bool, optional
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :param _request_auth: set to override the auth_settings for an a single
                              request; this effectively ignores the authentication
                              in the spec for a single request.
        :type _request_auth: dict, optional
        :type _content_type: string, optional: force content-type for the request
        :return: Returns the result object.
                 If the method is called asynchronously,
                 returns the request thread.
        :rtype: tuple(Get200Response, status_code(int), headers(HTTPHeaderDict))
        """

        _params = locals()

        _all_params = [
            'ip',
            'format',
            'delimiter'
        ]
        _all_params.extend(
            [
                'async_req',
                '_return_http_data_only',
                '_preload_content',
                '_request_timeout',
                '_request_auth',
                '_content_type',
                '_headers'
            ]
        )

        # validate the arguments
        for _key, _val in _params['kwargs'].items():
            if _key not in _all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method root_get" % _key
                )
            _params[_key] = _val
        del _params['kwargs']

        _collection_formats = {}

        # process the path parameters
        _path_params = {}

        # process the query parameters
        _query_params = []
        if _params.get('ip') is not None:  # noqa: E501
            _query_params.append(('ip', _params['ip']))
        if _params.get('format') is not None:  # noqa: E501
            _query_params.append(('format', _params['format']))
        if _params.get('delimiter') is not None:  # noqa: E501
            _query_params.append(('delimiter', _params['delimiter']))

        # process the header parameters
        _header_params = dict(_params.get('_headers', {}))

        # process the form parameters
        _form_params = []
        _files = {}

        # process the body parameter
        _body_params = None

        # set the HTTP header `Accept`
        _header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # authentication setting
        _auth_settings = []  # noqa: E501

        _response_types_map = {
            '200': "Get200Response",
            '400': "Get400Response",
            '404': "Get400Response",
        }

        return self.api_client.call_api(
            '/', 'GET',
            _path_params,
            _query_params,
            _header_params,
            body=_body_params,
            post_params=_form_params,
            files=_files,
            response_types_map=_response_types_map,
            auth_settings=_auth_settings,
            async_req=_params.get('async_req'),
            _return_http_data_only=_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=_params.get('_preload_content', True),
            _request_timeout=_params.get('_request_timeout'),
            collection_formats=_collection_formats,
            _request_auth=_params.get('_request_auth'))

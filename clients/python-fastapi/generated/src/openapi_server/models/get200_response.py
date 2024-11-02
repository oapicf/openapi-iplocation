# coding: utf-8

"""
    iplocation.net API

    OpenAPI v3 specification and a set of generated API clients for iplocation.net

    The version of the OpenAPI document: 1.0.1-pre.0
    Contact: blah+oapicf@cliffano.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json




from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
try:
    from typing import Self
except ImportError:
    from typing_extensions import Self

class Get200Response(BaseModel):
    """
    Get200Response
    """ # noqa: E501
    ip: Optional[StrictStr] = Field(default=None, description="IPv4 or IPv6 address used to lookup geolocation.")
    ip_number: Optional[StrictStr] = Field(default=None, description="IP number in long integer (represented as string).")
    ip_version: Optional[StrictInt] = Field(default=None, description="IP version either 4 or 6.")
    country_name: Optional[StrictStr] = Field(default=None, description="Full name of the IP country.")
    country_code2: Optional[StrictStr] = Field(default=None, description="ISO ALPHA-2 Country Code.")
    isp: Optional[StrictStr] = Field(default=None, description="Internet Service Provider (ISP) who owns the IP address.")
    response_code: Optional[StrictStr] = Field(default=None, description="Response status code to indicate success or failed completion of the API call.")
    response_message: Optional[StrictStr] = Field(default=None, description="Response message to indicate success or failed completion of the API call.")
    __properties: ClassVar[List[str]] = ["ip", "ip_number", "ip_version", "country_name", "country_code2", "isp", "response_code", "response_message"]

    model_config = {
        "populate_by_name": True,
        "validate_assignment": True,
        "protected_namespaces": (),
    }


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of Get200Response from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        _dict = self.model_dump(
            by_alias=True,
            exclude={
            },
            exclude_none=True,
        )
        return _dict

    @classmethod
    def from_dict(cls, obj: Dict) -> Self:
        """Create an instance of Get200Response from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "ip": obj.get("ip"),
            "ip_number": obj.get("ip_number"),
            "ip_version": obj.get("ip_version"),
            "country_name": obj.get("country_name"),
            "country_code2": obj.get("country_code2"),
            "isp": obj.get("isp"),
            "response_code": obj.get("response_code"),
            "response_message": obj.get("response_message")
        })
        return _obj



# coding: utf-8

"""
    iplocation.net API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 0.9.0-pre.0
    Contact: blah@cliffano.com
    Generated by: https://openapi-generator.tech
"""


from fastapi import FastAPI

from openapi_server.apis.default_api import router as DefaultApiRouter

app = FastAPI(
    title="iplocation.net API",
    description="No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)",
    version="0.9.0-pre.0",
)

app.include_router(DefaultApiRouter)


#include "__get_200_response.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test___get_200_response_ip_is_assigned_from_json()
{


    bourne::json input =
    {
        "ip", "hello"
    };

    __get_200_response obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getIp().c_str());






}


void test___get_200_response_ip_number_is_assigned_from_json()
{


    bourne::json input =
    {
        "ip_number", "hello"
    };

    __get_200_response obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getIpNumber().c_str());






}


void test___get_200_response_ip_version_is_assigned_from_json()
{
    bourne::json input =
    {
        "ip_version", 1
    };

    __get_200_response obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getIpVersion());








}


void test___get_200_response_country_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "country_name", "hello"
    };

    __get_200_response obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCountryName().c_str());






}


void test___get_200_response_country_code2_is_assigned_from_json()
{


    bourne::json input =
    {
        "country_code2", "hello"
    };

    __get_200_response obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCountryCode2().c_str());






}


void test___get_200_response_isp_is_assigned_from_json()
{


    bourne::json input =
    {
        "isp", "hello"
    };

    __get_200_response obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getIsp().c_str());






}


void test___get_200_response_response_code_is_assigned_from_json()
{


    bourne::json input =
    {
        "response_code", "hello"
    };

    __get_200_response obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getResponseCode().c_str());






}


void test___get_200_response_response_message_is_assigned_from_json()
{


    bourne::json input =
    {
        "response_message", "hello"
    };

    __get_200_response obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getResponseMessage().c_str());






}



void test___get_200_response_ip_is_converted_to_json()
{

    bourne::json input =
    {
        "ip", "hello"
    };

    __get_200_response obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ip"] == output["ip"]);



}


void test___get_200_response_ip_number_is_converted_to_json()
{

    bourne::json input =
    {
        "ip_number", "hello"
    };

    __get_200_response obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ip_number"] == output["ip_number"]);



}


void test___get_200_response_ip_version_is_converted_to_json()
{
    bourne::json input =
    {
        "ip_version", 1
    };

    __get_200_response obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ip_version"] == output["ip_version"]);




}


void test___get_200_response_country_name_is_converted_to_json()
{

    bourne::json input =
    {
        "country_name", "hello"
    };

    __get_200_response obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["country_name"] == output["country_name"]);



}


void test___get_200_response_country_code2_is_converted_to_json()
{

    bourne::json input =
    {
        "country_code2", "hello"
    };

    __get_200_response obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["country_code2"] == output["country_code2"]);



}


void test___get_200_response_isp_is_converted_to_json()
{

    bourne::json input =
    {
        "isp", "hello"
    };

    __get_200_response obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["isp"] == output["isp"]);



}


void test___get_200_response_response_code_is_converted_to_json()
{

    bourne::json input =
    {
        "response_code", "hello"
    };

    __get_200_response obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["response_code"] == output["response_code"]);



}


void test___get_200_response_response_message_is_converted_to_json()
{

    bourne::json input =
    {
        "response_message", "hello"
    };

    __get_200_response obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["response_message"] == output["response_message"]);



}



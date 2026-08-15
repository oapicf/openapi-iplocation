
#include "__get_400_response.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test___get_400_response_response_code_is_assigned_from_json()
{


    bourne::json input =
    {
        "response_code", "hello"
    };

    __get_400_response obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getResponseCode().c_str());






}


void test___get_400_response_response_message_is_assigned_from_json()
{


    bourne::json input =
    {
        "response_message", "hello"
    };

    __get_400_response obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getResponseMessage().c_str());






}



void test___get_400_response_response_code_is_converted_to_json()
{

    bourne::json input =
    {
        "response_code", "hello"
    };

    __get_400_response obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["response_code"] == output["response_code"]);



}


void test___get_400_response_response_message_is_converted_to_json()
{

    bourne::json input =
    {
        "response_message", "hello"
    };

    __get_400_response obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["response_message"] == output["response_message"]);



}




#include "__get_200_responseTest.cpp"

#include "__get_400_responseTest.cpp"



void setUp(){}

void tearDown(){}

void runTests(){
    
    
    RUN_TEST(test___get_200_response_ip_is_assigned_from_json);
    
    
    RUN_TEST(test___get_200_response_ip_number_is_assigned_from_json);
    
    
    RUN_TEST(test___get_200_response_ip_version_is_assigned_from_json);
    
    
    RUN_TEST(test___get_200_response_country_name_is_assigned_from_json);
    
    
    RUN_TEST(test___get_200_response_country_code2_is_assigned_from_json);
    
    
    RUN_TEST(test___get_200_response_isp_is_assigned_from_json);
    
    
    RUN_TEST(test___get_200_response_response_code_is_assigned_from_json);
    
    
    RUN_TEST(test___get_200_response_response_message_is_assigned_from_json);
    
    
    
    RUN_TEST(test___get_400_response_response_code_is_assigned_from_json);
    
    
    RUN_TEST(test___get_400_response_response_message_is_assigned_from_json);
    
    

    
    
    RUN_TEST(test___get_200_response_ip_is_converted_to_json);
    
    
    RUN_TEST(test___get_200_response_ip_number_is_converted_to_json);
    
    
    RUN_TEST(test___get_200_response_ip_version_is_converted_to_json);
    
    
    RUN_TEST(test___get_200_response_country_name_is_converted_to_json);
    
    
    RUN_TEST(test___get_200_response_country_code2_is_converted_to_json);
    
    
    RUN_TEST(test___get_200_response_isp_is_converted_to_json);
    
    
    RUN_TEST(test___get_200_response_response_code_is_converted_to_json);
    
    
    RUN_TEST(test___get_200_response_response_message_is_converted_to_json);
    
    
    
    RUN_TEST(test___get_400_response_response_code_is_converted_to_json);
    
    
    RUN_TEST(test___get_400_response_response_message_is_converted_to_json);
    
    


}

int main(void) {
    UNITY_BEGIN();
    runTests();
    return UNITY_END();
}

void setup() {
    UNITY_BEGIN();
    runTests();
    UNITY_END();
}

void loop() {

}

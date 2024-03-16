note
    description: "API tests for DEFAULT_API"
    date: "$Date$"
    revision: "$Revision$"


class DEFAULT_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_root_get
            -- Get geolocation of an IP address
            --
            -- Retrieve geolocation of an IP address. 
        local
            l_response: MODEL__GET_200_RESPONSE
            l_ip: ANY
            l_format: ANY
            l_delimiter: ANY
        do
            -- TODO: Initialize required params.
            -- l_ip

            -- l_response := api.root_get(l_ip, l_format, l_delimiter)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: DEFAULT_API
            -- Create an object instance of `DEFAULT_API'.
        once
            create { DEFAULT_API } Result
        end

end

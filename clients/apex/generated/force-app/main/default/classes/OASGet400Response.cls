/*
 * iplocation.net API
 * OpenAPI v3 specification and a set of generated API clients for iplocation.net
 *
 * The version of the OpenAPI document: 1.1.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * OASGet400Response
 */
public class OASGet400Response implements OAS.MappedProperties {
    /**
     * Response status code to indicate success or failed completion of the API call.
     * @return responseCode
     */
    public String responseCode { get; set; }

    /**
     * Response message to indicate success or failed completion of the API call.
     * @return responseMessage
     */
    public String responseMessage { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'response_code' => 'responseCode',
        'response_message' => 'responseMessage'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'response_code' => 'responseCode',
        'response_message' => 'responseMessage'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASGet400Response getExample() {
        OASGet400Response get400Response = new OASGet400Response();
          get400Response.responseCode = '';
          get400Response.responseMessage = '';
        return get400Response;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASGet400Response) {           
            OASGet400Response get400Response = (OASGet400Response) obj;
            return this.responseCode == get400Response.responseCode
                && this.responseMessage == get400Response.responseMessage;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (responseCode == null ? 0 : System.hashCode(responseCode));
        hashCode = (17 * hashCode) + (responseMessage == null ? 0 : System.hashCode(responseMessage));
        return hashCode;
    }
}


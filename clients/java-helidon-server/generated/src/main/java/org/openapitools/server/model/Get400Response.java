package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class Get400Response   {

    private String responseCode;
    private String responseMessage;

    /**
     * Default constructor.
     */
    public Get400Response() {
    // JSON-B / Jackson
    }

    /**
     * Create Get400Response.
     *
     * @param responseCode Response status code to indicate success or failed completion of the API call.
     * @param responseMessage Response message to indicate success or failed completion of the API call.
     */
    public Get400Response(
        String responseCode, 
        String responseMessage
    ) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
    }



    /**
     * Response status code to indicate success or failed completion of the API call.
     * @return responseCode
     */
    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * Response message to indicate success or failed completion of the API call.
     * @return responseMessage
     */
    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Get400Response {\n");
        
        sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
        sb.append("    responseMessage: ").append(toIndentedString(responseMessage)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}


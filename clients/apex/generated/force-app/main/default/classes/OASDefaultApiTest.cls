@isTest
private class OASDefaultApiTest {
    /**
     * Get geolocation of an IP address
     *
     * Retrieve geolocation of an IP address.\n
     */
    @isTest
    private static void rootGetTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'ip' => '',
            'format' => '',
            'delimiter' => ''
        };

        OASClient client;
        OASDefaultApi api;
        OASGet200Response response;
        OASGet200Response expectedResponse;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        js = JSON.serialize(OASGet200Response.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASGet200Response.getExample();
        response = (OASGet200Response) api.rootGet(params);
        System.assertEquals(expectedResponse, response);
    }
}
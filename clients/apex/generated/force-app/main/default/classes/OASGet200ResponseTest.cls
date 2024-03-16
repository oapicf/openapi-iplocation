@isTest
private class OASGet200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGet200Response get200Response1 = OASGet200Response.getExample();
        OASGet200Response get200Response2 = get200Response1;
        OASGet200Response get200Response3 = new OASGet200Response();
        OASGet200Response get200Response4 = get200Response3;

        System.assert(get200Response1.equals(get200Response2));
        System.assert(get200Response2.equals(get200Response1));
        System.assert(get200Response1.equals(get200Response1));
        System.assert(get200Response3.equals(get200Response4));
        System.assert(get200Response4.equals(get200Response3));
        System.assert(get200Response3.equals(get200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGet200Response get200Response1 = OASGet200Response.getExample();
        OASGet200Response get200Response2 = OASGet200Response.getExample();
        OASGet200Response get200Response3 = new OASGet200Response();
        OASGet200Response get200Response4 = new OASGet200Response();

        System.assert(get200Response1.equals(get200Response2));
        System.assert(get200Response2.equals(get200Response1));
        System.assert(get200Response3.equals(get200Response4));
        System.assert(get200Response4.equals(get200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGet200Response get200Response1 = OASGet200Response.getExample();
        OASGet200Response get200Response2 = new OASGet200Response();

        System.assertEquals(false, get200Response1.equals('foo'));
        System.assertEquals(false, get200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGet200Response get200Response1 = OASGet200Response.getExample();
        OASGet200Response get200Response2 = new OASGet200Response();
        OASGet200Response get200Response3;

        System.assertEquals(false, get200Response1.equals(get200Response3));
        System.assertEquals(false, get200Response2.equals(get200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGet200Response get200Response1 = OASGet200Response.getExample();
        OASGet200Response get200Response2 = new OASGet200Response();

        System.assertEquals(get200Response1.hashCode(), get200Response1.hashCode());
        System.assertEquals(get200Response2.hashCode(), get200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGet200Response get200Response1 = OASGet200Response.getExample();
        OASGet200Response get200Response2 = OASGet200Response.getExample();
        OASGet200Response get200Response3 = new OASGet200Response();
        OASGet200Response get200Response4 = new OASGet200Response();

        System.assert(get200Response1.equals(get200Response2));
        System.assert(get200Response3.equals(get200Response4));
        System.assertEquals(get200Response1.hashCode(), get200Response2.hashCode());
        System.assertEquals(get200Response3.hashCode(), get200Response4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASGet200Response get200Response = new OASGet200Response();
        Map<String, String> x-property-mappings = get200Response.getx-property-mappings();
        System.assertEquals('ipNumber', x-property-mappings.get('ip_number'));
        System.assertEquals('ipVersion', x-property-mappings.get('ip_version'));
        System.assertEquals('countryName', x-property-mappings.get('country_name'));
        System.assertEquals('countryCode2', x-property-mappings.get('country_code2'));
        System.assertEquals('responseCode', x-property-mappings.get('response_code'));
        System.assertEquals('responseMessage', x-property-mappings.get('response_message'));
    }
}

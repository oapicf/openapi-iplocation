@isTest
private class OASGet400ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASGet400Response get400Response1 = OASGet400Response.getExample();
        OASGet400Response get400Response2 = get400Response1;
        OASGet400Response get400Response3 = new OASGet400Response();
        OASGet400Response get400Response4 = get400Response3;

        System.assert(get400Response1.equals(get400Response2));
        System.assert(get400Response2.equals(get400Response1));
        System.assert(get400Response1.equals(get400Response1));
        System.assert(get400Response3.equals(get400Response4));
        System.assert(get400Response4.equals(get400Response3));
        System.assert(get400Response3.equals(get400Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGet400Response get400Response1 = OASGet400Response.getExample();
        OASGet400Response get400Response2 = OASGet400Response.getExample();
        OASGet400Response get400Response3 = new OASGet400Response();
        OASGet400Response get400Response4 = new OASGet400Response();

        System.assert(get400Response1.equals(get400Response2));
        System.assert(get400Response2.equals(get400Response1));
        System.assert(get400Response3.equals(get400Response4));
        System.assert(get400Response4.equals(get400Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGet400Response get400Response1 = OASGet400Response.getExample();
        OASGet400Response get400Response2 = new OASGet400Response();

        System.assertEquals(false, get400Response1.equals('foo'));
        System.assertEquals(false, get400Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGet400Response get400Response1 = OASGet400Response.getExample();
        OASGet400Response get400Response2 = new OASGet400Response();
        OASGet400Response get400Response3;

        System.assertEquals(false, get400Response1.equals(get400Response3));
        System.assertEquals(false, get400Response2.equals(get400Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGet400Response get400Response1 = OASGet400Response.getExample();
        OASGet400Response get400Response2 = new OASGet400Response();

        System.assertEquals(get400Response1.hashCode(), get400Response1.hashCode());
        System.assertEquals(get400Response2.hashCode(), get400Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGet400Response get400Response1 = OASGet400Response.getExample();
        OASGet400Response get400Response2 = OASGet400Response.getExample();
        OASGet400Response get400Response3 = new OASGet400Response();
        OASGet400Response get400Response4 = new OASGet400Response();

        System.assert(get400Response1.equals(get400Response2));
        System.assert(get400Response3.equals(get400Response4));
        System.assertEquals(get400Response1.hashCode(), get400Response2.hashCode());
        System.assertEquals(get400Response3.hashCode(), get400Response4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASGet400Response get400Response = new OASGet400Response();
        Map<String, String> x-property-mappings = get400Response.getx-property-mappings();
        System.assertEquals('responseCode', x-property-mappings.get('response_code'));
        System.assertEquals('responseMessage', x-property-mappings.get('response_message'));
    }
}

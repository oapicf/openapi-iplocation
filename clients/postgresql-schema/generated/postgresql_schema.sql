--
-- Schema objects for PostgreSQL
-- "iplocation.net API"
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--

--
-- DROP OBJECTS
-- (remove comment prefix to start using DROP commands)
--
-- TABLES
--
-- DROP TABLE IF EXISTS __get_200_response;
-- DROP TABLE IF EXISTS __get_400_response;

--
-- TYPES
--


--
-- CREATE OBJECTS
--
-- TYPES
--

--
-- TABLES
--
--
-- Table '__get_200_response' generated from model 'UnderscoreUnderscoregetUnderscore200Underscoreresponse'
--
CREATE TABLE IF NOT EXISTS __get_200_response (
    ip TEXT DEFAULT NULL,
    ip_number TEXT DEFAULT NULL,
    ip_version INTEGER DEFAULT NULL,
    country_name TEXT DEFAULT NULL,
    country_code2 TEXT DEFAULT NULL,
    isp TEXT DEFAULT NULL,
    response_code TEXT DEFAULT NULL,
    response_message TEXT DEFAULT NULL
);
;
COMMENT ON COLUMN __get_200_response.ip IS 'IPv4 or IPv6 address used to lookup geolocation.';
COMMENT ON COLUMN __get_200_response.ip_number IS 'IP number in long integer (represented as string).';
COMMENT ON COLUMN __get_200_response.ip_version IS 'IP version either 4 or 6.';
COMMENT ON COLUMN __get_200_response.country_name IS 'Full name of the IP country.';
COMMENT ON COLUMN __get_200_response.country_code2 IS 'ISO ALPHA-2 Country Code.';
COMMENT ON COLUMN __get_200_response.isp IS 'Internet Service Provider (ISP) who owns the IP address.';
COMMENT ON COLUMN __get_200_response.response_code IS 'Response status code to indicate success or failed completion of the API call.';
COMMENT ON COLUMN __get_200_response.response_message IS 'Response message to indicate success or failed completion of the API call.';

--
-- Table '__get_400_response' generated from model 'UnderscoreUnderscoregetUnderscore400Underscoreresponse'
--
CREATE TABLE IF NOT EXISTS __get_400_response (
    response_code TEXT DEFAULT NULL,
    response_message TEXT DEFAULT NULL
);
;
COMMENT ON COLUMN __get_400_response.response_code IS 'Response status code to indicate success or failed completion of the API call.';
COMMENT ON COLUMN __get_400_response.response_message IS 'Response message to indicate success or failed completion of the API call.';


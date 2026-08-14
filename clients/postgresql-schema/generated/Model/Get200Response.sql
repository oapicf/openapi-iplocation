--
-- "iplocation.net API"
-- Prepared SQL queries for '__get_200_response' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table '__get_200_response'
--
SELECT ip, ip_number, ip_version, country_name, country_code2, isp, response_code, response_message FROM __get_200_response WHERE 1=1;

--
-- INSERT template for table '__get_200_response'
--
INSERT INTO __get_200_response (ip, ip_number, ip_version, country_name, country_code2, isp, response_code, response_message) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table '__get_200_response'
--
UPDATE __get_200_response SET ip = ?, ip_number = ?, ip_version = ?, country_name = ?, country_code2 = ?, isp = ?, response_code = ?, response_message = ? WHERE 1=2;

--
-- DELETE template for table '__get_200_response'
--
DELETE FROM __get_200_response WHERE 1=2;


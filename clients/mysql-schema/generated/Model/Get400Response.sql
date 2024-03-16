--
-- iplocation.net API.
-- Prepared SQL queries for '__get_400_response' definition.
--


--
-- SELECT template for table `__get_400_response`
--
SELECT `response_code`, `response_message` FROM `__get_400_response` WHERE 1;

--
-- INSERT template for table `__get_400_response`
--
INSERT INTO `__get_400_response`(`response_code`, `response_message`) VALUES (?, ?);

--
-- UPDATE template for table `__get_400_response`
--
UPDATE `__get_400_response` SET `response_code` = ?, `response_message` = ? WHERE 1;

--
-- DELETE template for table `__get_400_response`
--
DELETE FROM `__get_400_response` WHERE 0;


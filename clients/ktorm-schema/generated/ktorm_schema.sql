

-- --------------------------------------------------------------------------
-- Table structure for table `__get_200_response` generated from model 'get200Response'
--

CREATE TABLE IF NOT EXISTS `__get_200_response` (
  `ip` text /*IPv4 or IPv6 address used to lookup geolocation.*/,
  `ip_number` long /*IP number in long integer.*/,
  `ip_version` int /*IP version either 4 or 6.*/,
  `country_name` text /*Full name of the IP country.*/,
  `country_code2` text /*ISO ALPHA-2 Country Code.*/,
  `isp` text /*Internet Service Provider (ISP) who owns the IP address.*/,
  `response_code` text /*Response status code to indicate success or failed completion of the API call.*/,
  `response_message` text /*Response message to indicate success or failed completion of the API call.*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `__get_400_response` generated from model 'get400Response'
--

CREATE TABLE IF NOT EXISTS `__get_400_response` (
  `response_code` text /*Response status code to indicate success or failed completion of the API call.*/,
  `response_message` text /*Response message to indicate success or failed completion of the API call.*/
); 



--
-- Table structure for table `_db_version`
--
CREATE TABLE IF NOT EXISTS `_db_version` (
  `version`    LONG    DEFAULT 1
);

/* SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO"; */
/* SET AUTOCOMMIT = 0; */
/* START TRANSACTION; */
/* SET time_zone = "+00:00"; */

-- --------------------------------------------------------

--
-- Table structure for table `__get_200_response` generated from model 'UnderscoreUnderscoregetUnderscore200Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `__get_200_response` (
  `ip` TEXT DEFAULT NULL COMMENT 'IPv4 or IPv6 address used to lookup geolocation.',
  `ip_number` TEXT DEFAULT NULL COMMENT 'IP number in long integer (represented as string).',
  `ip_version` INT DEFAULT NULL COMMENT 'IP version either 4 or 6.',
  `country_name` TEXT DEFAULT NULL COMMENT 'Full name of the IP country.',
  `country_code2` TEXT DEFAULT NULL COMMENT 'ISO ALPHA-2 Country Code.',
  `isp` TEXT DEFAULT NULL COMMENT 'Internet Service Provider (ISP) who owns the IP address.',
  `response_code` TEXT DEFAULT NULL COMMENT 'Response status code to indicate success or failed completion of the API call.',
  `response_message` TEXT DEFAULT NULL COMMENT 'Response message to indicate success or failed completion of the API call.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `__get_400_response` generated from model 'UnderscoreUnderscoregetUnderscore400Underscoreresponse'
--

CREATE TABLE IF NOT EXISTS `__get_400_response` (
  `response_code` TEXT DEFAULT NULL COMMENT 'Response status code to indicate success or failed completion of the API call.',
  `response_message` TEXT DEFAULT NULL COMMENT 'Response message to indicate success or failed completion of the API call.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;



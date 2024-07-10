/*
 * __get_200_response.h
 *
 * 
 */

#ifndef ___get_200_response_H_
#define ___get_200_response_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class __get_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	__get_200_response();
	__get_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~__get_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get IPv4 or IPv6 address used to lookup geolocation.
	 */
	std::string getIp();

	/*! \brief Set IPv4 or IPv6 address used to lookup geolocation.
	 */
	void setIp(std::string  ip);
	/*! \brief Get IP number in long integer (represented as string).
	 */
	std::string getIpNumber();

	/*! \brief Set IP number in long integer (represented as string).
	 */
	void setIpNumber(std::string  ip_number);
	/*! \brief Get IP version either 4 or 6.
	 */
	int getIpVersion();

	/*! \brief Set IP version either 4 or 6.
	 */
	void setIpVersion(int  ip_version);
	/*! \brief Get Full name of the IP country.
	 */
	std::string getCountryName();

	/*! \brief Set Full name of the IP country.
	 */
	void setCountryName(std::string  country_name);
	/*! \brief Get ISO ALPHA-2 Country Code.
	 */
	std::string getCountryCode2();

	/*! \brief Set ISO ALPHA-2 Country Code.
	 */
	void setCountryCode2(std::string  country_code2);
	/*! \brief Get Internet Service Provider (ISP) who owns the IP address.
	 */
	std::string getIsp();

	/*! \brief Set Internet Service Provider (ISP) who owns the IP address.
	 */
	void setIsp(std::string  isp);
	/*! \brief Get Response status code to indicate success or failed completion of the API call.
	 */
	std::string getResponseCode();

	/*! \brief Set Response status code to indicate success or failed completion of the API call.
	 */
	void setResponseCode(std::string  response_code);
	/*! \brief Get Response message to indicate success or failed completion of the API call.
	 */
	std::string getResponseMessage();

	/*! \brief Set Response message to indicate success or failed completion of the API call.
	 */
	void setResponseMessage(std::string  response_message);

private:
	std::string ip;
	std::string ip_number;
	int ip_version;
	std::string country_name;
	std::string country_code2;
	std::string isp;
	std::string response_code;
	std::string response_message;
	void __init();
	void __cleanup();

};
}
}

#endif /* ___get_200_response_H_ */

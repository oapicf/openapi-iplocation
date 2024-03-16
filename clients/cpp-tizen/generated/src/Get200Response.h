/*
 * __get_200_response.h
 *
 * 
 */

#ifndef ___get_200_response_H_
#define ___get_200_response_H_


#include <string>
#include "AnyType.h"
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
	AnyType getIp();

	/*! \brief Set IPv4 or IPv6 address used to lookup geolocation.
	 */
	void setIp(AnyType  ip);
	/*! \brief Get IP number in long integer.
	 */
	AnyType getIpNumber();

	/*! \brief Set IP number in long integer.
	 */
	void setIpNumber(AnyType  ip_number);
	/*! \brief Get IP version either 4 or 6.
	 */
	AnyType getIpVersion();

	/*! \brief Set IP version either 4 or 6.
	 */
	void setIpVersion(AnyType  ip_version);
	/*! \brief Get Full name of the IP country.
	 */
	AnyType getCountryName();

	/*! \brief Set Full name of the IP country.
	 */
	void setCountryName(AnyType  country_name);
	/*! \brief Get ISO ALPHA-2 Country Code.
	 */
	AnyType getCountryCode2();

	/*! \brief Set ISO ALPHA-2 Country Code.
	 */
	void setCountryCode2(AnyType  country_code2);
	/*! \brief Get Internet Service Provider (ISP) who owns the IP address.
	 */
	AnyType getIsp();

	/*! \brief Set Internet Service Provider (ISP) who owns the IP address.
	 */
	void setIsp(AnyType  isp);
	/*! \brief Get Response status code to indicate success or failed completion of the API call.
	 */
	AnyType getResponseCode();

	/*! \brief Set Response status code to indicate success or failed completion of the API call.
	 */
	void setResponseCode(AnyType  response_code);
	/*! \brief Get Response message to indicate success or failed completion of the API call.
	 */
	AnyType getResponseMessage();

	/*! \brief Set Response message to indicate success or failed completion of the API call.
	 */
	void setResponseMessage(AnyType  response_message);

private:
	AnyType ip;
	AnyType ip_number;
	AnyType ip_version;
	AnyType country_name;
	AnyType country_code2;
	AnyType isp;
	AnyType response_code;
	AnyType response_message;
	void __init();
	void __cleanup();

};
}
}

#endif /* ___get_200_response_H_ */

/*
 * __get_400_response.h
 *
 * 
 */

#ifndef ___get_400_response_H_
#define ___get_400_response_H_


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

class __get_400_response : public Object {
public:
	/*! \brief Constructor.
	 */
	__get_400_response();
	__get_400_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~__get_400_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	AnyType response_code;
	AnyType response_message;
	void __init();
	void __cleanup();

};
}
}

#endif /* ___get_400_response_H_ */

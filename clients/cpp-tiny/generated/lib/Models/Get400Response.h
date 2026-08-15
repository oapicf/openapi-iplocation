
/*
 * __get_400_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT___get_400_response_H_
#define TINY_CPP_CLIENT___get_400_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class __get_400_response{
public:

    /*! \brief Constructor.
	 */
    __get_400_response();
    __get_400_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~__get_400_response();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Response status code to indicate success or failed completion of the API call.
	 */
	std::string getResponseCode();

	/*! \brief Set Response status code to indicate success or failed completion of the API call.
	 */
	void setResponseCode(std::string response_code);
	/*! \brief Get Response message to indicate success or failed completion of the API call.
	 */
	std::string getResponseMessage();

	/*! \brief Set Response message to indicate success or failed completion of the API call.
	 */
	void setResponseMessage(std::string response_message);


    private:
    std::string response_code{};
    std::string response_message{};
};
}

#endif /* TINY_CPP_CLIENT___get_400_response_H_ */

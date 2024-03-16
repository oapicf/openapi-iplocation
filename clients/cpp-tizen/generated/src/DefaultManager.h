#ifndef _DefaultManager_H_
#define _DefaultManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "__get_200_response.h"
#include "__get_400_response.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Default Default
 * \ingroup Operations
 *  @{
 */
class DefaultManager {
public:
	DefaultManager();
	virtual ~DefaultManager();

/*! \brief Get geolocation of an IP address. *Synchronous*
 *
 * Retrieve geolocation of an IP address. 
 * \param ip An IPv4 or IPv6 address that you would like to lookup. *Required*
 * \param format Output format, the following formats are supported: plain xml json jsonp php csv serialized
 * \param delimiter Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool rootGetSync(char * accessToken,
	AnyType ip, AnyType format, AnyType delimiter, 
	void(* handler)(__get_200_response, Error, void* )
	, void* userData);

/*! \brief Get geolocation of an IP address. *Asynchronous*
 *
 * Retrieve geolocation of an IP address. 
 * \param ip An IPv4 or IPv6 address that you would like to lookup. *Required*
 * \param format Output format, the following formats are supported: plain xml json jsonp php csv serialized
 * \param delimiter Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for \"\\n\", 2 for \"<br>\".
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool rootGetAsync(char * accessToken,
	AnyType ip, AnyType format, AnyType delimiter, 
	void(* handler)(__get_200_response, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.iplocation.net";
	}
};
/** @}*/

}
}
#endif /* DefaultManager_H_ */

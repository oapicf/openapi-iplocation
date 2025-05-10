#' Create a new Get200Response
#'
#' @description
#' Get200Response Class
#'
#' @docType class
#' @title Get200Response
#' @description Get200Response Class
#' @format An \code{R6Class} generator object
#' @field ip IPv4 or IPv6 address used to lookup geolocation. character [optional]
#' @field ip_number IP number in long integer (represented as string). character [optional]
#' @field ip_version IP version either 4 or 6. integer [optional]
#' @field country_name Full name of the IP country. character [optional]
#' @field country_code2 ISO ALPHA-2 Country Code. character [optional]
#' @field isp Internet Service Provider (ISP) who owns the IP address. character [optional]
#' @field response_code Response status code to indicate success or failed completion of the API call. character [optional]
#' @field response_message Response message to indicate success or failed completion of the API call. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Get200Response <- R6::R6Class(
  "Get200Response",
  public = list(
    `ip` = NULL,
    `ip_number` = NULL,
    `ip_version` = NULL,
    `country_name` = NULL,
    `country_code2` = NULL,
    `isp` = NULL,
    `response_code` = NULL,
    `response_message` = NULL,

    #' @description
    #' Initialize a new Get200Response class.
    #'
    #' @param ip IPv4 or IPv6 address used to lookup geolocation.
    #' @param ip_number IP number in long integer (represented as string).
    #' @param ip_version IP version either 4 or 6.
    #' @param country_name Full name of the IP country.
    #' @param country_code2 ISO ALPHA-2 Country Code.
    #' @param isp Internet Service Provider (ISP) who owns the IP address.
    #' @param response_code Response status code to indicate success or failed completion of the API call.
    #' @param response_message Response message to indicate success or failed completion of the API call.
    #' @param ... Other optional arguments.
    initialize = function(`ip` = NULL, `ip_number` = NULL, `ip_version` = NULL, `country_name` = NULL, `country_code2` = NULL, `isp` = NULL, `response_code` = NULL, `response_message` = NULL, ...) {
      if (!is.null(`ip`)) {
        if (!(is.character(`ip`) && length(`ip`) == 1)) {
          stop(paste("Error! Invalid data for `ip`. Must be a string:", `ip`))
        }
        self$`ip` <- `ip`
      }
      if (!is.null(`ip_number`)) {
        if (!(is.character(`ip_number`) && length(`ip_number`) == 1)) {
          stop(paste("Error! Invalid data for `ip_number`. Must be a string:", `ip_number`))
        }
        self$`ip_number` <- `ip_number`
      }
      if (!is.null(`ip_version`)) {
        if (!(is.numeric(`ip_version`) && length(`ip_version`) == 1)) {
          stop(paste("Error! Invalid data for `ip_version`. Must be an integer:", `ip_version`))
        }
        self$`ip_version` <- `ip_version`
      }
      if (!is.null(`country_name`)) {
        if (!(is.character(`country_name`) && length(`country_name`) == 1)) {
          stop(paste("Error! Invalid data for `country_name`. Must be a string:", `country_name`))
        }
        self$`country_name` <- `country_name`
      }
      if (!is.null(`country_code2`)) {
        if (!(is.character(`country_code2`) && length(`country_code2`) == 1)) {
          stop(paste("Error! Invalid data for `country_code2`. Must be a string:", `country_code2`))
        }
        self$`country_code2` <- `country_code2`
      }
      if (!is.null(`isp`)) {
        if (!(is.character(`isp`) && length(`isp`) == 1)) {
          stop(paste("Error! Invalid data for `isp`. Must be a string:", `isp`))
        }
        self$`isp` <- `isp`
      }
      if (!is.null(`response_code`)) {
        if (!(is.character(`response_code`) && length(`response_code`) == 1)) {
          stop(paste("Error! Invalid data for `response_code`. Must be a string:", `response_code`))
        }
        self$`response_code` <- `response_code`
      }
      if (!is.null(`response_message`)) {
        if (!(is.character(`response_message`) && length(`response_message`) == 1)) {
          stop(paste("Error! Invalid data for `response_message`. Must be a string:", `response_message`))
        }
        self$`response_message` <- `response_message`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return Get200Response as a base R list.
    #' @examples
    #' # convert array of Get200Response (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert Get200Response to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      Get200ResponseObject <- list()
      if (!is.null(self$`ip`)) {
        Get200ResponseObject[["ip"]] <-
          self$`ip`
      }
      if (!is.null(self$`ip_number`)) {
        Get200ResponseObject[["ip_number"]] <-
          self$`ip_number`
      }
      if (!is.null(self$`ip_version`)) {
        Get200ResponseObject[["ip_version"]] <-
          self$`ip_version`
      }
      if (!is.null(self$`country_name`)) {
        Get200ResponseObject[["country_name"]] <-
          self$`country_name`
      }
      if (!is.null(self$`country_code2`)) {
        Get200ResponseObject[["country_code2"]] <-
          self$`country_code2`
      }
      if (!is.null(self$`isp`)) {
        Get200ResponseObject[["isp"]] <-
          self$`isp`
      }
      if (!is.null(self$`response_code`)) {
        Get200ResponseObject[["response_code"]] <-
          self$`response_code`
      }
      if (!is.null(self$`response_message`)) {
        Get200ResponseObject[["response_message"]] <-
          self$`response_message`
      }
      return(Get200ResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of Get200Response
    #'
    #' @param input_json the JSON input
    #' @return the instance of Get200Response
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ip`)) {
        self$`ip` <- this_object$`ip`
      }
      if (!is.null(this_object$`ip_number`)) {
        self$`ip_number` <- this_object$`ip_number`
      }
      if (!is.null(this_object$`ip_version`)) {
        self$`ip_version` <- this_object$`ip_version`
      }
      if (!is.null(this_object$`country_name`)) {
        self$`country_name` <- this_object$`country_name`
      }
      if (!is.null(this_object$`country_code2`)) {
        self$`country_code2` <- this_object$`country_code2`
      }
      if (!is.null(this_object$`isp`)) {
        self$`isp` <- this_object$`isp`
      }
      if (!is.null(this_object$`response_code`)) {
        self$`response_code` <- this_object$`response_code`
      }
      if (!is.null(this_object$`response_message`)) {
        self$`response_message` <- this_object$`response_message`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return Get200Response in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of Get200Response
    #'
    #' @param input_json the JSON input
    #' @return the instance of Get200Response
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ip` <- this_object$`ip`
      self$`ip_number` <- this_object$`ip_number`
      self$`ip_version` <- this_object$`ip_version`
      self$`country_name` <- this_object$`country_name`
      self$`country_code2` <- this_object$`country_code2`
      self$`isp` <- this_object$`isp`
      self$`response_code` <- this_object$`response_code`
      self$`response_message` <- this_object$`response_message`
      self
    },

    #' @description
    #' Validate JSON input with respect to Get200Response and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Get200Response
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# Get200Response$unlock()
#
## Below is an example to define the print function
# Get200Response$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Get200Response$lock()


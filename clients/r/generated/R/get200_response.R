#' Create a new Get200Response
#'
#' @description
#' Get200Response Class
#'
#' @docType class
#' @title Get200Response
#' @description Get200Response Class
#' @format An \code{R6Class} generator object
#' @field ip IPv4 or IPv6 address used to lookup geolocation. \link{AnyType} [optional]
#' @field ip_number IP number in long integer. \link{AnyType} [optional]
#' @field ip_version IP version either 4 or 6. \link{AnyType} [optional]
#' @field country_name Full name of the IP country. \link{AnyType} [optional]
#' @field country_code2 ISO ALPHA-2 Country Code. \link{AnyType} [optional]
#' @field isp Internet Service Provider (ISP) who owns the IP address. \link{AnyType} [optional]
#' @field response_code Response status code to indicate success or failed completion of the API call. \link{AnyType} [optional]
#' @field response_message Response message to indicate success or failed completion of the API call. \link{AnyType} [optional]
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
    #' Initialize a new Get200Response class.
    #'
    #' @description
    #' Initialize a new Get200Response class.
    #'
    #' @param ip IPv4 or IPv6 address used to lookup geolocation.
    #' @param ip_number IP number in long integer.
    #' @param ip_version IP version either 4 or 6.
    #' @param country_name Full name of the IP country.
    #' @param country_code2 ISO ALPHA-2 Country Code.
    #' @param isp Internet Service Provider (ISP) who owns the IP address.
    #' @param response_code Response status code to indicate success or failed completion of the API call.
    #' @param response_message Response message to indicate success or failed completion of the API call.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`ip` = NULL, `ip_number` = NULL, `ip_version` = NULL, `country_name` = NULL, `country_code2` = NULL, `isp` = NULL, `response_code` = NULL, `response_message` = NULL, ...) {
      if (!is.null(`ip`)) {
        stopifnot(R6::is.R6(`ip`))
        self$`ip` <- `ip`
      }
      if (!is.null(`ip_number`)) {
        stopifnot(R6::is.R6(`ip_number`))
        self$`ip_number` <- `ip_number`
      }
      if (!is.null(`ip_version`)) {
        stopifnot(R6::is.R6(`ip_version`))
        self$`ip_version` <- `ip_version`
      }
      if (!is.null(`country_name`)) {
        stopifnot(R6::is.R6(`country_name`))
        self$`country_name` <- `country_name`
      }
      if (!is.null(`country_code2`)) {
        stopifnot(R6::is.R6(`country_code2`))
        self$`country_code2` <- `country_code2`
      }
      if (!is.null(`isp`)) {
        stopifnot(R6::is.R6(`isp`))
        self$`isp` <- `isp`
      }
      if (!is.null(`response_code`)) {
        stopifnot(R6::is.R6(`response_code`))
        self$`response_code` <- `response_code`
      }
      if (!is.null(`response_message`)) {
        stopifnot(R6::is.R6(`response_message`))
        self$`response_message` <- `response_message`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Get200Response in JSON format
    #' @export
    toJSON = function() {
      Get200ResponseObject <- list()
      if (!is.null(self$`ip`)) {
        Get200ResponseObject[["ip"]] <-
          self$`ip`$toJSON()
      }
      if (!is.null(self$`ip_number`)) {
        Get200ResponseObject[["ip_number"]] <-
          self$`ip_number`$toJSON()
      }
      if (!is.null(self$`ip_version`)) {
        Get200ResponseObject[["ip_version"]] <-
          self$`ip_version`$toJSON()
      }
      if (!is.null(self$`country_name`)) {
        Get200ResponseObject[["country_name"]] <-
          self$`country_name`$toJSON()
      }
      if (!is.null(self$`country_code2`)) {
        Get200ResponseObject[["country_code2"]] <-
          self$`country_code2`$toJSON()
      }
      if (!is.null(self$`isp`)) {
        Get200ResponseObject[["isp"]] <-
          self$`isp`$toJSON()
      }
      if (!is.null(self$`response_code`)) {
        Get200ResponseObject[["response_code"]] <-
          self$`response_code`$toJSON()
      }
      if (!is.null(self$`response_message`)) {
        Get200ResponseObject[["response_message"]] <-
          self$`response_message`$toJSON()
      }
      Get200ResponseObject
    },
    #' Deserialize JSON string into an instance of Get200Response
    #'
    #' @description
    #' Deserialize JSON string into an instance of Get200Response
    #'
    #' @param input_json the JSON input
    #' @return the instance of Get200Response
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ip`)) {
        ip_object <- AnyType$new()
        ip_object$fromJSON(jsonlite::toJSON(this_object$ip, auto_unbox = TRUE, digits = NA))
        self$`ip` <- ip_object
      }
      if (!is.null(this_object$`ip_number`)) {
        ip_number_object <- AnyType$new()
        ip_number_object$fromJSON(jsonlite::toJSON(this_object$ip_number, auto_unbox = TRUE, digits = NA))
        self$`ip_number` <- ip_number_object
      }
      if (!is.null(this_object$`ip_version`)) {
        ip_version_object <- AnyType$new()
        ip_version_object$fromJSON(jsonlite::toJSON(this_object$ip_version, auto_unbox = TRUE, digits = NA))
        self$`ip_version` <- ip_version_object
      }
      if (!is.null(this_object$`country_name`)) {
        country_name_object <- AnyType$new()
        country_name_object$fromJSON(jsonlite::toJSON(this_object$country_name, auto_unbox = TRUE, digits = NA))
        self$`country_name` <- country_name_object
      }
      if (!is.null(this_object$`country_code2`)) {
        country_code2_object <- AnyType$new()
        country_code2_object$fromJSON(jsonlite::toJSON(this_object$country_code2, auto_unbox = TRUE, digits = NA))
        self$`country_code2` <- country_code2_object
      }
      if (!is.null(this_object$`isp`)) {
        isp_object <- AnyType$new()
        isp_object$fromJSON(jsonlite::toJSON(this_object$isp, auto_unbox = TRUE, digits = NA))
        self$`isp` <- isp_object
      }
      if (!is.null(this_object$`response_code`)) {
        response_code_object <- AnyType$new()
        response_code_object$fromJSON(jsonlite::toJSON(this_object$response_code, auto_unbox = TRUE, digits = NA))
        self$`response_code` <- response_code_object
      }
      if (!is.null(this_object$`response_message`)) {
        response_message_object <- AnyType$new()
        response_message_object$fromJSON(jsonlite::toJSON(this_object$response_message, auto_unbox = TRUE, digits = NA))
        self$`response_message` <- response_message_object
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Get200Response in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`ip`)) {
          sprintf(
          '"ip":
          %s
          ',
          jsonlite::toJSON(self$`ip`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`ip_number`)) {
          sprintf(
          '"ip_number":
          %s
          ',
          jsonlite::toJSON(self$`ip_number`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`ip_version`)) {
          sprintf(
          '"ip_version":
          %s
          ',
          jsonlite::toJSON(self$`ip_version`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`country_name`)) {
          sprintf(
          '"country_name":
          %s
          ',
          jsonlite::toJSON(self$`country_name`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`country_code2`)) {
          sprintf(
          '"country_code2":
          %s
          ',
          jsonlite::toJSON(self$`country_code2`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`isp`)) {
          sprintf(
          '"isp":
          %s
          ',
          jsonlite::toJSON(self$`isp`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`response_code`)) {
          sprintf(
          '"response_code":
          %s
          ',
          jsonlite::toJSON(self$`response_code`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`response_message`)) {
          sprintf(
          '"response_message":
          %s
          ',
          jsonlite::toJSON(self$`response_message`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of Get200Response
    #'
    #' @description
    #' Deserialize JSON string into an instance of Get200Response
    #'
    #' @param input_json the JSON input
    #' @return the instance of Get200Response
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ip` <- AnyType$new()$fromJSON(jsonlite::toJSON(this_object$ip, auto_unbox = TRUE, digits = NA))
      self$`ip_number` <- AnyType$new()$fromJSON(jsonlite::toJSON(this_object$ip_number, auto_unbox = TRUE, digits = NA))
      self$`ip_version` <- AnyType$new()$fromJSON(jsonlite::toJSON(this_object$ip_version, auto_unbox = TRUE, digits = NA))
      self$`country_name` <- AnyType$new()$fromJSON(jsonlite::toJSON(this_object$country_name, auto_unbox = TRUE, digits = NA))
      self$`country_code2` <- AnyType$new()$fromJSON(jsonlite::toJSON(this_object$country_code2, auto_unbox = TRUE, digits = NA))
      self$`isp` <- AnyType$new()$fromJSON(jsonlite::toJSON(this_object$isp, auto_unbox = TRUE, digits = NA))
      self$`response_code` <- AnyType$new()$fromJSON(jsonlite::toJSON(this_object$response_code, auto_unbox = TRUE, digits = NA))
      self$`response_message` <- AnyType$new()$fromJSON(jsonlite::toJSON(this_object$response_message, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to Get200Response
    #'
    #' @description
    #' Validate JSON input with respect to Get200Response and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Get200Response
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
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


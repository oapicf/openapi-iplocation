#' Create a new Get400Response
#'
#' @description
#' Get400Response Class
#'
#' @docType class
#' @title Get400Response
#' @description Get400Response Class
#' @format An \code{R6Class} generator object
#' @field response_code Response status code to indicate success or failed completion of the API call. \link{AnyType} [optional]
#' @field response_message Response message to indicate success or failed completion of the API call. \link{AnyType} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Get400Response <- R6::R6Class(
  "Get400Response",
  public = list(
    `response_code` = NULL,
    `response_message` = NULL,
    #' Initialize a new Get400Response class.
    #'
    #' @description
    #' Initialize a new Get400Response class.
    #'
    #' @param response_code Response status code to indicate success or failed completion of the API call.
    #' @param response_message Response message to indicate success or failed completion of the API call.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`response_code` = NULL, `response_message` = NULL, ...) {
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
    #' @return Get400Response in JSON format
    #' @export
    toJSON = function() {
      Get400ResponseObject <- list()
      if (!is.null(self$`response_code`)) {
        Get400ResponseObject[["response_code"]] <-
          self$`response_code`$toJSON()
      }
      if (!is.null(self$`response_message`)) {
        Get400ResponseObject[["response_message"]] <-
          self$`response_message`$toJSON()
      }
      Get400ResponseObject
    },
    #' Deserialize JSON string into an instance of Get400Response
    #'
    #' @description
    #' Deserialize JSON string into an instance of Get400Response
    #'
    #' @param input_json the JSON input
    #' @return the instance of Get400Response
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
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
    #' @return Get400Response in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
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
    #' Deserialize JSON string into an instance of Get400Response
    #'
    #' @description
    #' Deserialize JSON string into an instance of Get400Response
    #'
    #' @param input_json the JSON input
    #' @return the instance of Get400Response
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`response_code` <- AnyType$new()$fromJSON(jsonlite::toJSON(this_object$response_code, auto_unbox = TRUE, digits = NA))
      self$`response_message` <- AnyType$new()$fromJSON(jsonlite::toJSON(this_object$response_message, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to Get400Response
    #'
    #' @description
    #' Validate JSON input with respect to Get400Response and throw an exception if invalid
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
    #' @return String representation of Get400Response
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
# Get400Response$unlock()
#
## Below is an example to define the print function
# Get400Response$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Get400Response$lock()


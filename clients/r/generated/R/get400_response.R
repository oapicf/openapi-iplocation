#' Create a new Get400Response
#'
#' @description
#' Get400Response Class
#'
#' @docType class
#' @title Get400Response
#' @description Get400Response Class
#' @format An \code{R6Class} generator object
#' @field response_code Response status code to indicate success or failed completion of the API call. character [optional]
#' @field response_message Response message to indicate success or failed completion of the API call. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Get400Response <- R6::R6Class(
  "Get400Response",
  public = list(
    `response_code` = NULL,
    `response_message` = NULL,

    #' @description
    #' Initialize a new Get400Response class.
    #'
    #' @param response_code Response status code to indicate success or failed completion of the API call.
    #' @param response_message Response message to indicate success or failed completion of the API call.
    #' @param ... Other optional arguments.
    initialize = function(`response_code` = NULL, `response_message` = NULL, ...) {
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
    #' @return Get400Response as a base R list.
    #' @examples
    #' # convert array of Get400Response (x) to a data frame
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
    #' Convert Get400Response to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      Get400ResponseObject <- list()
      if (!is.null(self$`response_code`)) {
        Get400ResponseObject[["response_code"]] <-
          self$`response_code`
      }
      if (!is.null(self$`response_message`)) {
        Get400ResponseObject[["response_message"]] <-
          self$`response_message`
      }
      return(Get400ResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of Get400Response
    #'
    #' @param input_json the JSON input
    #' @return the instance of Get400Response
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
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
    #' @return Get400Response in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of Get400Response
    #'
    #' @param input_json the JSON input
    #' @return the instance of Get400Response
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`response_code` <- this_object$`response_code`
      self$`response_message` <- this_object$`response_message`
      self
    },

    #' @description
    #' Validate JSON input with respect to Get400Response and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Get400Response
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
# Get400Response$unlock()
#
## Below is an example to define the print function
# Get400Response$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Get400Response$lock()


(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

type t = {
    (* Response status code to indicate success or failed completion of the API call. *)
    response_code: Any_type.t option [@default None];
    (* Response message to indicate success or failed completion of the API call. *)
    response_message: Any_type.t option [@default None];
} [@@deriving yojson { strict = false }, show ];;

let create () : t = {
    response_code = None;
    response_message = None;
}


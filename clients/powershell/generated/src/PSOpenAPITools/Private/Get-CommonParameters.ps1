#
# iplocation.net API
# No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
# Version: 0.9.0-pre.0
# Contact: blah@cliffano.com
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.Synopsis
    Helper function to get common parameters (Verbose, Debug, etc.)
.Example
    Get-CommonParameters
#>
function Get-CommonParameters {
    function tmp {
        [CmdletBinding()]
        Param ()
    }

    (Get-Command -Name tmp -CommandType Function).Parameters.Keys
}

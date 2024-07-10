#
# iplocation.net API
# OpenAPI v3 specification and a set of generated API clients for iplocation.net
# Version: 0.9.0-pre.0
# Contact: blah+oapicf@cliffano.com
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

Get geolocation of an IP address

.DESCRIPTION

No description available.

.PARAMETER Ip
An IPv4 or IPv6 address that you would like to lookup.

.PARAMETER Format
Output format, the following formats are supported: plain xml json jsonp php csv serialized

.PARAMETER Delimiter
Delimiter between proxies. Can be used only with format plain. The following types are supported: 1 for ""\n"", 2 for ""<br>"".

.PARAMETER WithHttpInfo

A switch when turned on will return a hash table of Response, StatusCode and Headers instead of just the Response

.OUTPUTS

Get200Response
#>
function Invoke-RootGet {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${Ip},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${Format},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${Delimiter},
        [Switch]
        $WithHttpInfo
    )

    Process {
        'Calling method: Invoke-RootGet' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $LocalVarAccepts = @()
        $LocalVarContentTypes = @()
        $LocalVarQueryParameters = @{}
        $LocalVarHeaderParameters = @{}
        $LocalVarFormParameters = @{}
        $LocalVarPathParameters = @{}
        $LocalVarCookieParameters = @{}
        $LocalVarBodyParameter = $null

        $Configuration = Get-Configuration
        # HTTP header 'Accept' (if needed)
        $LocalVarAccepts = @('application/json')

        $LocalVarUri = '/'

        if (!$Ip) {
            throw "Error! The required parameter `Ip` missing when calling rootGet."
        }
        $LocalVarQueryParameters['ip'] = $Ip

        if ($Format) {
            $LocalVarQueryParameters['format'] = $Format
        }

        if ($Delimiter) {
            $LocalVarQueryParameters['delimiter'] = $Delimiter
        }

        $LocalVarResult = Invoke-ApiClient -Method 'GET' `
                                -Uri $LocalVarUri `
                                -Accepts $LocalVarAccepts `
                                -ContentTypes $LocalVarContentTypes `
                                -Body $LocalVarBodyParameter `
                                -HeaderParameters $LocalVarHeaderParameters `
                                -QueryParameters $LocalVarQueryParameters `
                                -FormParameters $LocalVarFormParameters `
                                -CookieParameters $LocalVarCookieParameters `
                                -ReturnType "Get200Response" `
                                -IsBodyNullable $false

        if ($WithHttpInfo.IsPresent) {
            return $LocalVarResult
        } else {
            return $LocalVarResult["Response"]
        }
    }
}


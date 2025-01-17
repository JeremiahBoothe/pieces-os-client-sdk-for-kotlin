/**
* Pieces Isomorphic OpenAPI
* Endpoints for Assets, Formats, Users, Asset, Format, User.
*
* The version of the OpenAPI document: 1.0
* Contact: tsavo@pieces.app
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import org.openapitools.client.models.SystemExecutionCpuInformation

import com.squareup.moshi.Json

/**
 * This is system information that we are able to get from the users machine(rust package TBD). TODO potentially pull this out of TLP.
 * @param memory 
 * @param os 
 * @param kernel 
 * @param cpu 
 */

data class SystemExecutionInformation (
    @Json(name = "memory")
    val memory: kotlin.Int,
    @Json(name = "os")
    val os: kotlin.String,
    @Json(name = "kernel")
    val kernel: kotlin.String,
    @Json(name = "cpu")
    val cpu: SystemExecutionCpuInformation
)


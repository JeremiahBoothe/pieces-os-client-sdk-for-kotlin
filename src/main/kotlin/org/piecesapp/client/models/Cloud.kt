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

import org.openapitools.client.models.AllocationStatus
import org.openapitools.client.models.GroupedTimestamp

import com.squareup.moshi.Json

/**
 * connected: This is the last time that we connected to our cloud. updated: This is the last time that this pod was updated. 
 * @param id This is the identification of 
 * @param user This is a reference to a UserUuid
 * @param status 
 * @param address this is the url to the specific users pod. ie userUUID.pieces.cloud
 * @param ip This is the specific ip that we can ping of our specific pod ie. 12.34.1234 
 * @param connected 
 * @param updated 
 * @param version 
 */

data class Cloud (
    /* This is the identification of  */
    @Json(name = "id")
    val id: kotlin.String,
    /* This is a reference to a UserUuid */
    @Json(name = "user")
    val user: kotlin.String,
    @Json(name = "status")
    val status: AllocationStatus,
    /* this is the url to the specific users pod. ie userUUID.pieces.cloud */
    @Json(name = "address")
    val address: kotlin.String,
    /* This is the specific ip that we can ping of our specific pod ie. 12.34.1234  */
    @Json(name = "ip")
    val ip: kotlin.String,
    @Json(name = "connected")
    val connected: GroupedTimestamp,
    @Json(name = "updated")
    val updated: GroupedTimestamp,
    @Json(name = "version")
    val version: kotlin.String
)


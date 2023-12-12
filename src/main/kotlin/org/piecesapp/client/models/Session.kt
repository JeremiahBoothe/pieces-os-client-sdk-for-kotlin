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
package org.piecesapp.client.models

import org.piecesapp.client.models.GroupedTimestamp

import com.squareup.moshi.Json

/**
 * This is a specific model that will let us know at what time this user was using the application.
 * @param id The UUID of the current Session
 * @param opened 
 * @param closed 
 */

data class Session (
    /* The UUID of the current Session */
    @Json(name = "id")
    val id: kotlin.String,
    @Json(name = "opened")
    val opened: GroupedTimestamp,
    @Json(name = "closed")
    val closed: GroupedTimestamp? = null
)


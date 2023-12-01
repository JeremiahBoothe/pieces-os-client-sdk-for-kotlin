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

import org.openapitools.client.models.Application
import org.openapitools.client.models.EmbeddedModelSchema
import org.openapitools.client.models.FlattenedUserProfile
import org.openapitools.client.models.GroupedTimestamp
import org.openapitools.client.models.MechanismEnum
import org.openapitools.client.models.ReferencedAsset
import org.openapitools.client.models.ReferencedFormat
import org.openapitools.client.models.SeededConnectorTracking

import com.squareup.moshi.Json

/**
 * Note: - if mechanism == internal we will not display to the user.
 * @param id 
 * @param created 
 * @param updated 
 * @param event 
 * @param application 
 * @param mechanism 
 * @param schema 
 * @param deleted 
 * @param asset 
 * @param format 
 * @param user 
 * @param rank 
 */

data class FlattenedActivity (
    @Json(name = "id")
    val id: kotlin.String,
    @Json(name = "created")
    val created: GroupedTimestamp,
    @Json(name = "updated")
    val updated: GroupedTimestamp,
    @Json(name = "event")
    val event: SeededConnectorTracking,
    @Json(name = "application")
    val application: Application,
    @Json(name = "mechanism")
    val mechanism: MechanismEnum,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "deleted")
    val deleted: GroupedTimestamp? = null,
    @Json(name = "asset")
    val asset: ReferencedAsset? = null,
    @Json(name = "format")
    val format: ReferencedFormat? = null,
    @Json(name = "user")
    val user: FlattenedUserProfile? = null,
    @Json(name = "rank")
    val rank: kotlin.Int? = null
)

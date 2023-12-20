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

import org.piecesapp.client.models.AllocationCloudStatus
import org.piecesapp.client.models.AllocationCloudUrls
import org.piecesapp.client.models.EmbeddedModelSchema
import org.piecesapp.client.models.GroupedTimestamp

import com.squareup.moshi.Json

/**
 * update && version: will be present only if your cloud was successfully spun up && running.  updated: is the last time this was updated.
 * @param id This is a uuid that represents this cloud.(this is the same as the userid)
 * @param user this is your useruuid.
 * @param urls 
 * @param status 
 * @param project This is the project that this is attached to.
 * @param schema 
 * @param updated 
 * @param version this is the current version of the server.
 * @param region this is the region where the project is defined.
 */

data class AllocationCloud (
    /* This is a uuid that represents this cloud.(this is the same as the userid) */
    @Json(name = "id")
    val id: kotlin.String,
    /* this is your useruuid. */
    @Json(name = "user")
    val user: kotlin.String,
    @Json(name = "urls")
    val urls: AllocationCloudUrls,
    @Json(name = "status")
    val status: AllocationCloudStatus,
    /* This is the project that this is attached to. */
    @Json(name = "project")
    val project: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "updated")
    val updated: GroupedTimestamp? = null,
    /* this is the current version of the server. */
    @Json(name = "version")
    val version: kotlin.String? = null,
    /* this is the region where the project is defined. */
    @Json(name = "region")
    val region: kotlin.String? = null
)


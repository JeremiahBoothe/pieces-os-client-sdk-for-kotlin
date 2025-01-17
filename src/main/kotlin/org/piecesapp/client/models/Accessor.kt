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

import org.openapitools.client.models.EmbeddedModelSchema
import org.openapitools.client.models.FlattenedUserProfile

import com.squareup.moshi.Json

/**
 * This is used to determine who has accessed a share. and how many times.  The user here is the user that accessed this Piece.(optional) if undefined then this user was not logged in yet.
 * @param id 
 * @param os this is an os id.
 * @param share 
 * @param count how many times this user accessed this piece.
 * @param schema 
 * @param user 
 */

data class Accessor (
    @Json(name = "id")
    val id: kotlin.String,
    /* this is an os id. */
    @Json(name = "os")
    val os: kotlin.String,
    @Json(name = "share")
    val share: kotlin.String,
    /* how many times this user accessed this piece. */
    @Json(name = "count")
    val count: kotlin.Int,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "user")
    val user: FlattenedUserProfile? = null
)


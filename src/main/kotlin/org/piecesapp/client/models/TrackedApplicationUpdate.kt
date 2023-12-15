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
import org.openapitools.client.models.TrackedApplication
import org.openapitools.client.models.TrackedUserProfile

import com.squareup.moshi.Json

/**
 * This is a model used to track when an Application is Updated
 * @param current 
 * @param schema 
 * @param previous 
 * @param user 
 */

data class TrackedApplicationUpdate (
    @Json(name = "current")
    val current: TrackedApplication,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "previous")
    val previous: TrackedApplication? = null,
    @Json(name = "user")
    val user: TrackedUserProfile? = null
)


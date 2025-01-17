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

import org.openapitools.client.models.ApplicationNameEnum
import org.openapitools.client.models.EmbeddedModelSchema
import org.openapitools.client.models.PlatformEnum

import com.squareup.moshi.Json

/**
 * A Model to describe what application a format/analytics event originated.
 * @param id The ID of the tracked application.
 * @param name 
 * @param version This is the specific version number 0.0.0
 * @param platform 
 * @param schema 
 * @param automaticUnload This is a proper that will let us know if we will proactivity unload all of your machine learning models.by default this is false.
 */

data class TrackedApplication (
    /* The ID of the tracked application. */
    @Json(name = "id")
    val id: kotlin.String,
    @Json(name = "name")
    val name: ApplicationNameEnum,
    /* This is the specific version number 0.0.0 */
    @Json(name = "version")
    val version: kotlin.String,
    @Json(name = "platform")
    val platform: PlatformEnum,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    /* This is a proper that will let us know if we will proactivity unload all of your machine learning models.by default this is false. */
    @Json(name = "automaticUnload")
    val automaticUnload: kotlin.Boolean? = null
)


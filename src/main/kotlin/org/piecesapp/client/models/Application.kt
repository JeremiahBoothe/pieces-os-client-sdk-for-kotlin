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
import org.openapitools.client.models.CapabilitiesEnum
import org.openapitools.client.models.EmbeddedModelSchema
import org.openapitools.client.models.MechanismEnum
import org.openapitools.client.models.PlatformEnum
import org.openapitools.client.models.PrivacyEnum

import com.squareup.moshi.Json

/**
 * A Model to describe what application a format/analytics event originated.  mechanism: This will let us know where this came from. ie.only 2 enums are used here or else throw and error. default mechanism here is MANUAL- meaning that this came from our user Connecting an application. INTERNAL - means that this came from a shareable link
 * @param id The ID of the application at the device level
 * @param name 
 * @param version This is the specific version number 0.0.0
 * @param platform 
 * @param onboarded 
 * @param privacy 
 * @param schema 
 * @param capabilities 
 * @param mechanism 
 * @param automaticUnload This is a proper that will let us know if we will proactivity unload all of your machine learning models.by default this is false.
 */

data class Application (
    /* The ID of the application at the device level */
    @Json(name = "id")
    val id: kotlin.String,
    @Json(name = "name")
    val name: ApplicationNameEnum,
    /* This is the specific version number 0.0.0 */
    @Json(name = "version")
    val version: kotlin.String,
    @Json(name = "platform")
    val platform: PlatformEnum,
    @Json(name = "onboarded")
    val onboarded: kotlin.Boolean,
    @Json(name = "privacy")
    val privacy: PrivacyEnum,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "capabilities")
    val capabilities: CapabilitiesEnum? = null,
    @Json(name = "mechanism")
    val mechanism: MechanismEnum? = null,
    /* This is a proper that will let us know if we will proactivity unload all of your machine learning models.by default this is false. */
    @Json(name = "automaticUnload")
    val automaticUnload: kotlin.Boolean? = null
)


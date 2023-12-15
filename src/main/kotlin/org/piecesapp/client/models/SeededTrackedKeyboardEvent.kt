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
import org.openapitools.client.models.SeededTrackedKeyboardEventIdentifierDescriptionPairs

import com.squareup.moshi.Json

/**
 * This is a model that will hold relavent information in relation to a keyboard(including shortcuts) analytics event (usage).
 * @param description This also needs structure such as key vals or enums
 * @param shortcut 
 * @param schema 
 * @param identifierDescriptionPair 
 */

data class SeededTrackedKeyboardEvent (
    /* This also needs structure such as key vals or enums */
    @Json(name = "description")
    val description: kotlin.String,
    @Json(name = "shortcut")
    val shortcut: kotlin.collections.List<kotlin.Int>,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "identifier_description_pair")
    val identifierDescriptionPair: SeededTrackedKeyboardEventIdentifierDescriptionPairs? = null
)


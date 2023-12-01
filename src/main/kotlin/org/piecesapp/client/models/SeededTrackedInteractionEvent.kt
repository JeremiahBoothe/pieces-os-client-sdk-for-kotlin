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
import org.openapitools.client.models.SeededTrackedInteractionEventIdentifierDescriptionPairs

import com.squareup.moshi.Json

/**
 * This is a model that will hold relavent information in relation to an interaction(ONLY CLICK/TAP) analytics event(usage). If you want to register an event that relates to an interaction with the key then register a Keyboard Event. 
 * @param description These need structure
 * @param schema 
 * @param element 
 * @param identifierDescriptionPair 
 */

data class SeededTrackedInteractionEvent (
    /* These need structure */
    @Json(name = "description")
    val description: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "element")
    val element: kotlin.String? = null,
    @Json(name = "identifier_description_pair")
    val identifierDescriptionPair: SeededTrackedInteractionEventIdentifierDescriptionPairs? = null
)

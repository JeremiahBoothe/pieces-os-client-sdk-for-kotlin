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

import com.squareup.moshi.Json

/**
 * This is a model that will hold relavent information in relation to an interaction(ONLY CLICK/TAP) analytics event(usage). If you want to register an event that relates to an interaction with the key then register a Keyboard Event. 
 * @param description (optional) a description of this button that was clicked. or maybe what it did.
 * @param schema 
 * @param element This is an identifer that will allow the developer to know what unique button/field was interacted with.
 */

data class TrackedInteractionEvent (
    /* (optional) a description of this button that was clicked. or maybe what it did. */
    @Json(name = "description")
    val description: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    /* This is an identifer that will allow the developer to know what unique button/field was interacted with. */
    @Json(name = "element")
    val element: kotlin.String? = null
)


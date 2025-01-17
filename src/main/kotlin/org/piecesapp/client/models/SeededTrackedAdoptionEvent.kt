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

import org.openapitools.client.models.AnalyticsTrackedAdoptionEventIdentifierDescriptionPairs
import org.openapitools.client.models.EmbeddedModelSchema

import com.squareup.moshi.Json

/**
 * 
 * @param schema 
 * @param identifierDescriptionPair 
 */

data class SeededTrackedAdoptionEvent (
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "identifier_description_pair")
    val identifierDescriptionPair: AnalyticsTrackedAdoptionEventIdentifierDescriptionPairs? = null
)


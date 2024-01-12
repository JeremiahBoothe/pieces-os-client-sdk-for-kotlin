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

import org.piecesapp.client.models.DiscoveredHtmlWebpage
import org.piecesapp.client.models.EmbeddedModelSchema

import com.squareup.moshi.Json

/**
 * Assumption: The iterable will be in the exact same order as it was passed in within the seededDiscoveredHtmlWebpages
 * @param iterable 
 * @param application 
 * @param schema 
 */

data class DiscoveredHtmlWebpages (
    @Json(name = "iterable")
    val iterable: kotlin.collections.List<DiscoveredHtmlWebpage>,
    @Json(name = "application")
    val application: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null
)


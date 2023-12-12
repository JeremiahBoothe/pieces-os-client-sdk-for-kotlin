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

import org.piecesapp.client.models.EmbeddedModelSchema
import org.piecesapp.client.models.SeededAssetMetadata
import org.piecesapp.client.models.SeededFile
import org.piecesapp.client.models.SeededFragment
import org.piecesapp.client.models.TLPDirectedDiscoveryFilters

import com.squareup.moshi.Json

/**
 * 
 * @param schema 
 * @param file 
 * @param fragment 
 * @param directory 
 * @param metadata 
 * @param filters 
 */

data class DiscoveredAsset (
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "file")
    val file: SeededFile? = null,
    @Json(name = "fragment")
    val fragment: SeededFragment? = null,
    @Json(name = "directory")
    val directory: kotlin.String? = null,
    @Json(name = "metadata")
    val metadata: SeededAssetMetadata? = null,
    @Json(name = "filters")
    val filters: TLPDirectedDiscoveryFilters? = null
)


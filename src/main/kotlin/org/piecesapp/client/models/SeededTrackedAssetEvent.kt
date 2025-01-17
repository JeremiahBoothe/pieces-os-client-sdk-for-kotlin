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
import org.openapitools.client.models.ReferencedAsset
import org.openapitools.client.models.TrackedAssetEventIdentifierDescriptionPairs
import org.openapitools.client.models.TrackedAssetEventMetadata

import com.squareup.moshi.Json

/**
 * This seeded tracked asset event will be recieved by a context on the OS Server side, which will then be able to look up the asset id and structure the asset for shipment to Segment aka a fully built TrackedAssetEvent
 * @param asset 
 * @param identifierDescriptionPair 
 * @param schema 
 * @param metadata 
 */

data class SeededTrackedAssetEvent (
    @Json(name = "asset")
    val asset: ReferencedAsset,
    @Json(name = "identifier_description_pair")
    val identifierDescriptionPair: TrackedAssetEventIdentifierDescriptionPairs,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "metadata")
    val metadata: TrackedAssetEventMetadata? = null
)


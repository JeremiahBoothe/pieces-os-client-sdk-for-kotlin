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
import org.openapitools.client.models.TrackedFormat
import org.openapitools.client.models.TrackedFormatEventIdentifierDescriptionPairs
import org.openapitools.client.models.TrackedFormatEventMetadata

import com.squareup.moshi.Json

/**
 * This is a model that represents a generic event that we may want to track in relation to a format, for example beamed, copied, downloaded, and view. ** Note: This is the model that will get returned by our api, and is. Representative of a full TrackedFormat event. **
 * @param format 
 * @param identifierDescriptionPair 
 * @param schema 
 * @param metadata 
 */

data class TrackedFormatEvent (
    @Json(name = " format")
    val format: TrackedFormat,
    @Json(name = "identifier_description_pair")
    val identifierDescriptionPair: TrackedFormatEventIdentifierDescriptionPairs,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "metadata")
    val metadata: TrackedFormatEventMetadata? = null
)


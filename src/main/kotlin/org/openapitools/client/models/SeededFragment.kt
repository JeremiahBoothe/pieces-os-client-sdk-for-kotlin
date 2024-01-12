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
import org.piecesapp.client.models.FragmentMetadata
import org.piecesapp.client.models.TransferableBytes
import org.piecesapp.client.models.TransferableString

import com.squareup.moshi.Json

/**
 * This will be either a TransferableString or TransferableBytes that represent your fragment. ONLY Pass one or the other DONT pass both or neither.
 * @param schema 
 * @param string 
 * @param bytes 
 * @param metadata 
 */

data class SeededFragment (
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "string")
    val string: TransferableString? = null,
    @Json(name = "bytes")
    val bytes: TransferableBytes? = null,
    @Json(name = "metadata")
    val metadata: FragmentMetadata? = null
)


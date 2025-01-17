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

import org.openapitools.client.models.ClassificationSpecificEnum
import org.openapitools.client.models.EmbeddedModelSchema

import com.squareup.moshi.Json

/**
 * This is a model for metadata of a file!
 * @param schema 
 * @param name This is the name of your file.
 * @param ext 
 * @param size This is the size(in bytes)
 */

data class FileMetadata (
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    /* This is the name of your file. */
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "ext")
    val ext: ClassificationSpecificEnum? = null,
    /* This is the size(in bytes) */
    @Json(name = "size")
    val size: kotlin.Int? = null
)


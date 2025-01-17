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
import org.openapitools.client.models.FileMetadata
import org.openapitools.client.models.TransferableBytes
import org.openapitools.client.models.TransferableString

import com.squareup.moshi.Json

/**
 * This is a base model for a File(Seeded).  We will Throw an Error, if the text and the bytes properties are both null && if both the text and bytes properties are both defined. Ensure that you pass either a text or bytes property.  bytes and string are both optionl but, if both are null or both are defined we will throw an error. So You will be required to pass one or the other, NOT both.
 * @param schema 
 * @param bytes 
 * @param string 
 * @param metadata 
 */

data class SeededFile (
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "bytes")
    val bytes: TransferableBytes? = null,
    @Json(name = "string")
    val string: TransferableString? = null,
    @Json(name = "metadata")
    val metadata: FileMetadata? = null
)


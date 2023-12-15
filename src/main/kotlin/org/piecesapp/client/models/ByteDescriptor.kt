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
 * This is a nice microclass to help with managing the size of a File or Fragment in a readable way for UI's
 * @param value 
 * @param readable 
 * @param schema 
 */

data class ByteDescriptor (
    @Json(name = "value")
    val value: kotlin.Long,
    @Json(name = "readable")
    val readable: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null
)


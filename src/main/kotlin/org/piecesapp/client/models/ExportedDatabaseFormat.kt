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
 * 
 * @param id this is the id of the format
 * @param raw these are bytes.
 * @param schema 
 */

data class ExportedDatabaseFormat (
    /* this is the id of the format */
    @Json(name = "id")
    val id: kotlin.String,
    /* these are bytes. */
    @Json(name = "raw")
    val raw: kotlin.collections.List<kotlin.Int>,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null
)


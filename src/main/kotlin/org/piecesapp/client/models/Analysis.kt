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

import org.openapitools.client.models.CodeAnalysis
import org.openapitools.client.models.EmbeddedModelSchema
import org.openapitools.client.models.ImageAnalysis

import com.squareup.moshi.Json

/**
 * This the the MlAnalysis Object, that will go on a format.  this will hold all the different analysis models!  ** keep format just a uuid for now **
 * @param id 
 * @param format this is a reference to the format that it belongs too.
 * @param schema 
 * @param code 
 * @param image 
 */

data class Analysis (
    @Json(name = "id")
    val id: kotlin.String,
    /* this is a reference to the format that it belongs too. */
    @Json(name = "format")
    val format: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "code")
    val code: CodeAnalysis? = null,
    @Json(name = "image")
    val image: ImageAnalysis? = null
)


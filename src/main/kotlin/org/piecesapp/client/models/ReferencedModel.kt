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
 * *****NOTE:***** This is the basic referencedModel, for Now since we dont have a FlattenedModel, im going to simply not include the reference, because I do NOT want to attach a Model here (would cause breaking changes if we switched from a Model -> a flattenedModel). and (2) we are under going Model changes to the Model, so would cause issues.
 * @param id 
 * @param schema 
 */

data class ReferencedModel (
    @Json(name = "id")
    val id: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null
)


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

import org.openapitools.client.models.AssetFilterPhrase
import org.openapitools.client.models.AssetFilterTimestamp
import org.openapitools.client.models.AssetFilters
import org.openapitools.client.models.ClassificationSpecificEnum
import org.openapitools.client.models.EmbeddedModelSchema

import com.squareup.moshi.Json

/**
 * ** in the future, consider adding an optional bool's called nextAnd, nextOr which will say that the next filter will be  AND behavor or OR behavior.  \"operations\": here is is an optional property to allow or behavior,(we will only allow 1 level deep of or's), if or is not passed in then it is just simply ignored. If or is passed in then we will be or'd together with the top level filter and considered extras. default behavior for operations is and, however yoour can specifiy OR operations as well.
 * @param schema 
 * @param classification 
 * @param tags 
 * @param websites 
 * @param persons 
 * @param phrase 
 * @param created 
 * @param updated 
 * @param operations 
 */

data class AssetFilter (
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "classification")
    val classification: ClassificationSpecificEnum? = null,
    @Json(name = "tags")
    val tags: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "websites")
    val websites: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "persons")
    val persons: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "phrase")
    val phrase: AssetFilterPhrase? = null,
    @Json(name = "created")
    val created: AssetFilterTimestamp? = null,
    @Json(name = "updated")
    val updated: AssetFilterTimestamp? = null,
    @Json(name = "operations")
    val operations: AssetFilters? = null
)


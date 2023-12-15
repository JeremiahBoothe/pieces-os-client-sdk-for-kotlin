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
import org.openapitools.client.models.PersonBasicType

import com.squareup.moshi.Json

/**
 * This an iterable of People that are attached to a specific distribution ie, slack, maigun, ...etc
 * @param iterable 
 * @param schema 
 */

data class Recipients (
    @Json(name = "iterable")
    val iterable: kotlin.collections.List<PersonBasicType>,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null
)


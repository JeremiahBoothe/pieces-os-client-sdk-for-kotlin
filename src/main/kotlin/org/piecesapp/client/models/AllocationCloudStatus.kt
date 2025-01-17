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

import org.openapitools.client.models.AllocationStatusEnum
import org.openapitools.client.models.EmbeddedModelSchema

import com.squareup.moshi.Json

/**
 * 
 * @param cloud 
 * @param schema 
 */

data class AllocationCloudStatus (
    @Json(name = "cloud")
    val cloud: AllocationStatusEnum,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null
)


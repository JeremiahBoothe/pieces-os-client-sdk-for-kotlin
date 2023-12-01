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

import org.openapitools.client.models.ClassificationGenericEnum
import org.openapitools.client.models.ClassificationRenderingEnum
import org.openapitools.client.models.ClassificationSpecificEnum
import org.openapitools.client.models.EmbeddedModelSchema

import com.squareup.moshi.Json

/**
 * This is the specific classification of an Asset's Format.(This is on a per format basis b/c an asset could have different formats that are different format representations of the Asset.)
 * @param schema 
 * @param generic 
 * @param specific 
 * @param rendering 
 */

data class SeededClassification (
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "generic")
    val generic: ClassificationGenericEnum? = null,
    @Json(name = "specific")
    val specific: ClassificationSpecificEnum? = null,
    @Json(name = "rendering")
    val rendering: ClassificationRenderingEnum? = null
)

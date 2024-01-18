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
package org.piecesapp.client.models

import org.piecesapp.client.models.ClassificationGenericEnum
import org.piecesapp.client.models.ClassificationSpecificEnum
import org.piecesapp.client.models.EmbeddedModelSchema
import org.piecesapp.client.models.FragmentFormat

import com.squareup.moshi.Json

/**
 * This is the output iterable model for '/machine_learning/text/technical_language/parsers/segmentation'  specific is optional here, however you can pass in classify: true to get the specific classificaiton in the case the generic is code.
 * @param generic 
 * @param fragment 
 * @param schema 
 * @param specific 
 */

data class SegmentedTechnicalLanguageFragment (
    @Json(name = "generic")
    val generic: ClassificationGenericEnum,
    @Json(name = "fragment")
    val fragment: FragmentFormat,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "specific")
    val specific: ClassificationSpecificEnum? = null
)

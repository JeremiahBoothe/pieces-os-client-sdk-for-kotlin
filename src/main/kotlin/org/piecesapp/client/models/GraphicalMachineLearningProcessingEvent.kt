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
import org.openapitools.client.models.GraphicalImageProcessing
import org.openapitools.client.models.GraphicalOCRProcessing
import org.openapitools.client.models.GraphicalSVGStatistics

import com.squareup.moshi.Json

/**
 * 
 * @param schema 
 * @param ocr 
 * @param image 
 * @param svg 
 */

data class GraphicalMachineLearningProcessingEvent (
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "ocr")
    val ocr: GraphicalOCRProcessing? = null,
    @Json(name = "image")
    val image: GraphicalImageProcessing? = null,
    @Json(name = "svg")
    val svg: GraphicalSVGStatistics? = null
)


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


import com.squareup.moshi.Json

/**
 * 
 * @param mean this is the mean confidence returned by tesseract
 */

data class OCRConfidence (
    /* this is the mean confidence returned by tesseract */
    @Json(name = "mean")
    val mean: kotlin.Int
)


/**
* Runtime Common Library
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 1.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.piecesapp.client.apis


import com.squareup.moshi.Json

/**
 * This object is a filter is applied to a description value with a unique label and the confidence level of the filter and whether or not it should be applied
 * @param label 
 * @param confidence Confidence is a value between 0 and 1
 * @param applied 
 */

data class TLPDescriptionFilter (
    @Json(name = "label")
    val label: TLPDescriptionFilterEnum,
    /* Confidence is a value between 0 and 1 */
    @Json(name = "confidence")
    val confidence: java.math.BigDecimal? = null,
    @Json(name = "applied")
    val applied: kotlin.Boolean? = null
)


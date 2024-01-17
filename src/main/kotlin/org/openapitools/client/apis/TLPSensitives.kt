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
 * This is a model that represents many individual sensitive pieces of data.
 * @param iterable 
 */

data class TLPSensitives (
    @Json(name = "iterable")
    val iterable: kotlin.collections.List<TLPSensitive>
)


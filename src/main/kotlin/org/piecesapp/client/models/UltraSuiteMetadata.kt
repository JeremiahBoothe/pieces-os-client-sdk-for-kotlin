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

import org.openapitools.client.models.Ext

import com.squareup.moshi.Json

/**
 * This is some additional metadata retreived from UltraSuite.
 * @param ext 
 * @param name 
 */

data class UltraSuiteMetadata (
    @Json(name = "ext")
    val ext: Ext? = null,
    @Json(name = "name")
    val name: kotlin.String? = null
)

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
 * This is specifically for our allocation server metadata.
 * @param project 
 * @param region 
 */

data class Auth0UserAllocationMetadata (
    @Json(name = "project")
    val project: kotlin.String,
    @Json(name = "region")
    val region: kotlin.String
)


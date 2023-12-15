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

import org.openapitools.client.models.TLPCodeSnippetTagifyColor

import com.squareup.moshi.Json

/**
 * 
 * @param hexes This is an array of our tagged hexes
 */

data class TLPCodeSnippetTagifyColorReturnable (
    /* This is an array of our tagged hexes */
    @Json(name = "hexes")
    val hexes: kotlin.collections.List<TLPCodeSnippetTagifyColor>
)


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

import com.squareup.moshi.Json

/**
 * 
 * @param schema 
 * @param assetsListRefreshed 
 */

data class SeededTrackedKeyboardEventIdentifierDescriptionPairs (
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    @Json(name = "assets_list_refreshed")
    val assetsListRefreshed: SeededTrackedKeyboardEventIdentifierDescriptionPairs.AssetsListRefreshed? = null
) {

    /**
    * 
    * Values: theAssetsListWasRefreshedThroughAKeyboardShortcut
    */
    
    enum class AssetsListRefreshed(val value: kotlin.String){
        @Json(name = "the_assets_list_was_refreshed_through_a_keyboard_shortcut") theAssetsListWasRefreshedThroughAKeyboardShortcut("the_assets_list_was_refreshed_through_a_keyboard_shortcut");
    }
}


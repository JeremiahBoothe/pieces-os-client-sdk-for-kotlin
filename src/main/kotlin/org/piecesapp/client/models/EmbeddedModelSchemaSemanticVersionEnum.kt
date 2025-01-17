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


import com.squareup.moshi.Json

/**
* This is a Semantic Version Enum that will reflect the Semantic version of the api.
* Values: mAJOR0MINOR0PATCH1
*/

enum class EmbeddedModelSchemaSemanticVersionEnum(val value: kotlin.String){


    @Json(name = "MAJOR_0_MINOR_0_PATCH_1")
    mAJOR0MINOR0PATCH1("MAJOR_0_MINOR_0_PATCH_1");



    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }

}


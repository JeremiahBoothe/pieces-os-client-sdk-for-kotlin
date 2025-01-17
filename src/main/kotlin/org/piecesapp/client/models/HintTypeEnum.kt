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
* This is the hint enum used to describe a type of hint.
* Values: sUGGESTEDQUERY,qGPTHINT
*/

enum class HintTypeEnum(val value: kotlin.String){


    @Json(name = "SUGGESTED_QUERY")
    sUGGESTEDQUERY("SUGGESTED_QUERY"),


    @Json(name = "QGPT_HINT")
    qGPTHINT("QGPT_HINT");



    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }

}


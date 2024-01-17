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
* An enumeration where a developer can optimize the configuration for a model.  SPEED: This version will optimize for faster data processing, but sacrifice accuracy.  ACCURACY: This version will optimize for more precise results, but sacrifice speed.  BALANCED: This version is a mix between SPEED and ACCURACY.
* Values: bALANCED,sPEED,aCCURACY
*/

enum class TLPModelBehaviorEnum(val value: kotlin.String){


    @Json(name = "BALANCED")
    bALANCED("BALANCED"),


    @Json(name = "SPEED")
    sPEED("SPEED"),


    @Json(name = "ACCURACY")
    aCCURACY("ACCURACY");



    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }

}


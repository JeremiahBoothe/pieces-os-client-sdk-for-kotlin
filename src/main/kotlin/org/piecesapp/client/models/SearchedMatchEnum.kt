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
* 
* Values: tITLE,aNNOTATION,hINT,cONTENT,fUZZY,mULTIPLE,tAGS,wEBSITES,pERSONS
*/

enum class SearchedMatchEnum(val value: kotlin.String){


    @Json(name = "TITLE")
    tITLE("TITLE"),


    @Json(name = "ANNOTATION")
    aNNOTATION("ANNOTATION"),


    @Json(name = "HINT")
    hINT("HINT"),


    @Json(name = "CONTENT")
    cONTENT("CONTENT"),


    @Json(name = "FUZZY")
    fUZZY("FUZZY"),


    @Json(name = "MULTIPLE")
    mULTIPLE("MULTIPLE"),


    @Json(name = "TAGS")
    tAGS("TAGS"),


    @Json(name = "WEBSITES")
    wEBSITES("WEBSITES"),


    @Json(name = "PERSONS")
    pERSONS("PERSONS");



    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }

}


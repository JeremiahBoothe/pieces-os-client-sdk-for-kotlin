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
* This is the enum that is use to describe the category of our Sensitive Model.
* Values: sECRET,aPIKEY,cLIENTID,cLIENTSECRET,sECRETKEY,aPITOKEN,aCCESSKEY,aCCESSTOKEN,uRL,pUBLICKEY,pRIVATEKEY,aPIID,wEBHOOKURL
*/

enum class SensitiveCategoryEnum(val value: kotlin.String){


    @Json(name = "SECRET")
    sECRET("SECRET"),


    @Json(name = "API_KEY")
    aPIKEY("API_KEY"),


    @Json(name = "CLIENT_ID")
    cLIENTID("CLIENT_ID"),


    @Json(name = "CLIENT_SECRET")
    cLIENTSECRET("CLIENT_SECRET"),


    @Json(name = "SECRET_KEY")
    sECRETKEY("SECRET_KEY"),


    @Json(name = "API_TOKEN")
    aPITOKEN("API_TOKEN"),


    @Json(name = "ACCESS_KEY")
    aCCESSKEY("ACCESS_KEY"),


    @Json(name = "ACCESS_TOKEN")
    aCCESSTOKEN("ACCESS_TOKEN"),


    @Json(name = "URL")
    uRL("URL"),


    @Json(name = "PUBLIC_KEY")
    pUBLICKEY("PUBLIC_KEY"),


    @Json(name = "PRIVATE_KEY")
    pRIVATEKEY("PRIVATE_KEY"),


    @Json(name = "API_ID")
    aPIID("API_ID"),


    @Json(name = "WEB_HOOK_URL")
    wEBHOOKURL("WEB_HOOK_URL");



    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }

}

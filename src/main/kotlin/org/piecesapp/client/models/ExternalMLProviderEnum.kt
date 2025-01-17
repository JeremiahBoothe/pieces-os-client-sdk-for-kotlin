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
* This is a Model used for the Model class. This will be used to describe the provider in which this Mode lcam from IE meta, google, apple, ...etc
* Values: aPPLE,aMAZON,gOOGLE,mETA,oPENAI,lMSYS,sALESFORCE,hUGGINGFACE,uNIVERSITYOFWASHINGTON,oPENLMRESEARCH,mICROSOFT,uCBERKLEY,pEKINGUNIVERSITY,rENMINUNIVERSITYOFCHINA,tOGETHERAI,dATABRICKS,eLEUTHERAI,fUDANUNIVERSITY,bLICKDL,hONGKONGBAPTISTUNIVERSITY,bIGCODE,jINA,pIECES
*/

enum class ExternalMLProviderEnum(val value: kotlin.String){


    @Json(name = "APPLE")
    aPPLE("APPLE"),


    @Json(name = "AMAZON")
    aMAZON("AMAZON"),


    @Json(name = "GOOGLE")
    gOOGLE("GOOGLE"),


    @Json(name = "META")
    mETA("META"),


    @Json(name = "OPENAI")
    oPENAI("OPENAI"),


    @Json(name = "LMSYS")
    lMSYS("LMSYS"),


    @Json(name = "SALESFORCE")
    sALESFORCE("SALESFORCE"),


    @Json(name = "HUGGING_FACE")
    hUGGINGFACE("HUGGING_FACE"),


    @Json(name = "UNIVERSITY_OF_WASHINGTON")
    uNIVERSITYOFWASHINGTON("UNIVERSITY_OF_WASHINGTON"),


    @Json(name = "OPEN_LM_RESEARCH")
    oPENLMRESEARCH("OPEN_LM_RESEARCH"),


    @Json(name = "MICROSOFT")
    mICROSOFT("MICROSOFT"),


    @Json(name = "UC_BERKLEY")
    uCBERKLEY("UC_BERKLEY"),


    @Json(name = "PEKING_UNIVERSITY")
    pEKINGUNIVERSITY("PEKING_UNIVERSITY"),


    @Json(name = "RENMIN_UNIVERSITY_OF_CHINA")
    rENMINUNIVERSITYOFCHINA("RENMIN_UNIVERSITY_OF_CHINA"),


    @Json(name = "TOGETHER_AI")
    tOGETHERAI("TOGETHER_AI"),


    @Json(name = "DATABRICKS")
    dATABRICKS("DATABRICKS"),


    @Json(name = "ELEUTHER_AI")
    eLEUTHERAI("ELEUTHER_AI"),


    @Json(name = "FUDAN_UNIVERSITY")
    fUDANUNIVERSITY("FUDAN_UNIVERSITY"),


    @Json(name = "BLICKDL")
    bLICKDL("BLICKDL"),


    @Json(name = "HONG_KONG_BAPTIST_UNIVERSITY")
    hONGKONGBAPTISTUNIVERSITY("HONG_KONG_BAPTIST_UNIVERSITY"),


    @Json(name = "BIGCODE")
    bIGCODE("BIGCODE"),


    @Json(name = "JINA")
    jINA("JINA"),


    @Json(name = "PIECES")
    pIECES("PIECES");



    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }

}


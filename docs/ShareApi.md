# ShareApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**shareScoresIncrement**](ShareApi.md#shareScoresIncrement) | **POST** /share/{share}/scores/increment | &#39;/share/{share}/scores/increment&#39; [POST]
[**shareSnapshot**](ShareApi.md#shareSnapshot) | **GET** /share/{share} | /share/{share}
[**shareUpdate**](ShareApi.md#shareUpdate) | **POST** /share/update | /share/update [POST]


<a name="shareScoresIncrement"></a>
# **shareScoresIncrement**
> shareScoresIncrement(share, seededScoreIncrement)

&#39;/share/{share}/scores/increment&#39; [POST]

This will take in a SeededScoreIncrement and will increment the material relative to the incoming body.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShareApi()
val share : kotlin.String = share_example // kotlin.String | Share id
val seededScoreIncrement : SeededScoreIncrement =  // SeededScoreIncrement | 
try {
    apiInstance.shareScoresIncrement(share, seededScoreIncrement)
} catch (e: ClientException) {
    println("4xx response calling ShareApi#shareScoresIncrement")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShareApi#shareScoresIncrement")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **share** | **kotlin.String**| Share id |
 **seededScoreIncrement** | [**SeededScoreIncrement**](SeededScoreIncrement.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="shareSnapshot"></a>
# **shareSnapshot**
> Share shareSnapshot(share, transferables)

/share/{share}

Get the snapshot of a specific share.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShareApi()
val share : kotlin.String = share_example // kotlin.String | Share id
val transferables : kotlin.Boolean = true // kotlin.Boolean | This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement)
try {
    val result : Share = apiInstance.shareSnapshot(share, transferables)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShareApi#shareSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShareApi#shareSnapshot")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **share** | **kotlin.String**| Share id |
 **transferables** | **kotlin.Boolean**| This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) | [optional]

### Return type

[**Share**](Share.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="shareUpdate"></a>
# **shareUpdate**
> Share shareUpdate(transferables, share)

/share/update [POST]

This endpoint will accept a Share that the user wants to update, and will return a full Share that was updated!

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShareApi()
val transferables : kotlin.Boolean = true // kotlin.Boolean | This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement)
val share : Share =  // Share | This is the Share that needs to be updated.
try {
    val result : Share = apiInstance.shareUpdate(transferables, share)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShareApi#shareUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShareApi#shareUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferables** | **kotlin.Boolean**| This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) | [optional]
 **share** | [**Share**](Share.md)| This is the Share that needs to be updated. | [optional]

### Return type

[**Share**](Share.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# SharesApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sharesCreateNewShare**](SharesApi.md#sharesCreateNewShare) | **POST** /shares/create | /shares/create [POST]
[**sharesDeleteShare**](SharesApi.md#sharesDeleteShare) | **POST** /shares/{share}/delete | /shares/{share}/delete [POST]
[**sharesSnapshot**](SharesApi.md#sharesSnapshot) | **GET** /shares | /shares [GET]
[**sharesSpecificShareSnapshot**](SharesApi.md#sharesSpecificShareSnapshot) | **GET** /shares/{share} | /shares/{share} [GET]


<a name="sharesCreateNewShare"></a>
# **sharesCreateNewShare**
> Shares sharesCreateNewShare(transferables, seededShare)

/shares/create [POST]

This endpoint will accept an asset. Response here will be a Share that was created.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = SharesApi()
val transferables : kotlin.Boolean = true // kotlin.Boolean | This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement)
val seededShare : SeededShare =  // SeededShare | 
try {
    val result : Shares = apiInstance.sharesCreateNewShare(transferables, seededShare)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharesApi#sharesCreateNewShare")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharesApi#sharesCreateNewShare")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferables** | **kotlin.Boolean**| This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) | [optional]
 **seededShare** | [**SeededShare**](SeededShare.md)|  | [optional]

### Return type

[**Shares**](Shares.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sharesDeleteShare"></a>
# **sharesDeleteShare**
> kotlin.String sharesDeleteShare(share)

/shares/{share}/delete [POST]

This endpoint will just take a share id(as a url param) to delete out of the shares table, will return the share id that was deleted.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = SharesApi()
val share : kotlin.String = share_example // kotlin.String | Share id
try {
    val result : kotlin.String = apiInstance.sharesDeleteShare(share)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharesApi#sharesDeleteShare")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharesApi#sharesDeleteShare")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **share** | **kotlin.String**| Share id |

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sharesSnapshot"></a>
# **sharesSnapshot**
> Shares sharesSnapshot(transferables)

/shares [GET]

This will return all of your shares. A Share is an asset that you as a user decided to share with another user via link.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = SharesApi()
val transferables : kotlin.Boolean = true // kotlin.Boolean | This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement)
try {
    val result : Shares = apiInstance.sharesSnapshot(transferables)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharesApi#sharesSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharesApi#sharesSnapshot")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferables** | **kotlin.Boolean**| This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) | [optional]

### Return type

[**Shares**](Shares.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sharesSpecificShareSnapshot"></a>
# **sharesSpecificShareSnapshot**
> Share sharesSpecificShareSnapshot(share, transferables)

/shares/{share} [GET]

This is an endpoint to enable a client to access a specific share through a provided share id.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = SharesApi()
val share : kotlin.String = share_example // kotlin.String | Share id
val transferables : kotlin.Boolean = true // kotlin.Boolean | This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement)
try {
    val result : Share = apiInstance.sharesSpecificShareSnapshot(share, transferables)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharesApi#sharesSpecificShareSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharesApi#sharesSpecificShareSnapshot")
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


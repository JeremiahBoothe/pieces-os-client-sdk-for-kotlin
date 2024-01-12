# AnchorPointsApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**anchorPointsCreateNewAnchorPoint**](AnchorPointsApi.md#anchorPointsCreateNewAnchorPoint) | **POST** /anchor_points/create | /anchor_points/create [POST]
[**anchorPointsDeleteSpecificAnchorPoint**](AnchorPointsApi.md#anchorPointsDeleteSpecificAnchorPoint) | **POST** /anchor_points/{anchor_point}/delete | /anchor_points/{anchor_point}/delete [POST]
[**anchorPointsSnapshot**](AnchorPointsApi.md#anchorPointsSnapshot) | **GET** /anchor_points | /anchor_points [GET]


<a name="anchorPointsCreateNewAnchorPoint"></a>
# **anchorPointsCreateNewAnchorPoint**
> AnchorPoint anchorPointsCreateNewAnchorPoint(transferables, seededAnchorPoint)

/anchor_points/create [POST]

This will create a anchorPoint.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = AnchorPointsApi()
val transferables : kotlin.Boolean = true // kotlin.Boolean | This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement)
val seededAnchorPoint : SeededAnchorPoint =  // SeededAnchorPoint | 
try {
    val result : AnchorPoint = apiInstance.anchorPointsCreateNewAnchorPoint(transferables, seededAnchorPoint)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnchorPointsApi#anchorPointsCreateNewAnchorPoint")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnchorPointsApi#anchorPointsCreateNewAnchorPoint")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferables** | **kotlin.Boolean**| This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) | [optional]
 **seededAnchorPoint** | [**SeededAnchorPoint**](SeededAnchorPoint.md)|  | [optional]

### Return type

[**AnchorPoint**](AnchorPoint.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="anchorPointsDeleteSpecificAnchorPoint"></a>
# **anchorPointsDeleteSpecificAnchorPoint**
> anchorPointsDeleteSpecificAnchorPoint(anchorPoint)

/anchor_points/{anchor_point}/delete [POST]

This will delete a specific anchorPoint!

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = AnchorPointsApi()
val anchorPoint : kotlin.String = anchorPoint_example // kotlin.String | This is the specific uuid of an anchor_point.
try {
    apiInstance.anchorPointsDeleteSpecificAnchorPoint(anchorPoint)
} catch (e: ClientException) {
    println("4xx response calling AnchorPointsApi#anchorPointsDeleteSpecificAnchorPoint")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnchorPointsApi#anchorPointsDeleteSpecificAnchorPoint")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **anchorPoint** | **kotlin.String**| This is the specific uuid of an anchor_point. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="anchorPointsSnapshot"></a>
# **anchorPointsSnapshot**
> AnchorPoints anchorPointsSnapshot(transferables)

/anchor_points [GET]

This will get a snapshot of all your anchorPoints.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = AnchorPointsApi()
val transferables : kotlin.Boolean = true // kotlin.Boolean | This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement)
try {
    val result : AnchorPoints = apiInstance.anchorPointsSnapshot(transferables)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnchorPointsApi#anchorPointsSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnchorPointsApi#anchorPointsSnapshot")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferables** | **kotlin.Boolean**| This is a boolean that will decided if we are want to return the transferable data (default) or not(performance enhancement) | [optional]

### Return type

[**AnchorPoints**](AnchorPoints.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


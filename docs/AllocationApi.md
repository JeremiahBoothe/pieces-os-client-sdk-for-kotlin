# AllocationApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allocationSnapshot**](AllocationApi.md#allocationSnapshot) | **GET** /allocation/{allocation} | /allocation/{allocation} [GET]
[**allocationUpdate**](AllocationApi.md#allocationUpdate) | **POST** /allocation/update | /allocation/update [POST]


<a name="allocationSnapshot"></a>
# **allocationSnapshot**
> AllocationCloud allocationSnapshot(allocation)

/allocation/{allocation} [GET]

This will get a snapshot of a specific allocation.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = AllocationApi()
val allocation : kotlin.String = allocation_example // kotlin.String | 
try {
    val result : AllocationCloud = apiInstance.allocationSnapshot(allocation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AllocationApi#allocationSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AllocationApi#allocationSnapshot")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocation** | **kotlin.String**|  |

### Return type

[**AllocationCloud**](AllocationCloud.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="allocationUpdate"></a>
# **allocationUpdate**
> AllocationCloud allocationUpdate(allocationCloud)

/allocation/update [POST]

This will update a specific allocation.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = AllocationApi()
val allocationCloud : AllocationCloud =  // AllocationCloud | 
try {
    val result : AllocationCloud = apiInstance.allocationUpdate(allocationCloud)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AllocationApi#allocationUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AllocationApi#allocationUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationCloud** | [**AllocationCloud**](AllocationCloud.md)|  | [optional]

### Return type

[**AllocationCloud**](AllocationCloud.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


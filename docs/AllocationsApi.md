# AllocationsApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allocationsConnectNewCloud**](AllocationsApi.md#allocationsConnectNewCloud) | **POST** /allocations/connect | /allocations/connect [POST]
[**allocationsCreateNewAllocation**](AllocationsApi.md#allocationsCreateNewAllocation) | **POST** /allocations/create | /allocations/create [POST]
[**allocationsDeleteAllocation**](AllocationsApi.md#allocationsDeleteAllocation) | **POST** /allocations/delete | /allocations/delete [POST]
[**allocationsDisconnectCloud**](AllocationsApi.md#allocationsDisconnectCloud) | **POST** /allocations/disconnect | /allocations/disconnect [POST]
[**allocationsReconnectCloud**](AllocationsApi.md#allocationsReconnectCloud) | **POST** /allocations/reconnect | /allocations/reconnect [POST]
[**allocationsSnapshot**](AllocationsApi.md#allocationsSnapshot) | **GET** /allocations | /allocations [GET]


<a name="allocationsConnectNewCloud"></a>
# **allocationsConnectNewCloud**
> AllocationCloud allocationsConnectNewCloud(userProfile)

/allocations/connect [POST]

This will attempt to connect to a specific users cloud.(Required that the current user is logged in.)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AllocationsApi()
val userProfile : UserProfile =  // UserProfile | 
try {
    val result : AllocationCloud = apiInstance.allocationsConnectNewCloud(userProfile)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AllocationsApi#allocationsConnectNewCloud")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AllocationsApi#allocationsConnectNewCloud")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userProfile** | [**UserProfile**](UserProfile.md)|  | [optional]

### Return type

[**AllocationCloud**](AllocationCloud.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="allocationsCreateNewAllocation"></a>
# **allocationsCreateNewAllocation**
> AllocationCloud allocationsCreateNewAllocation(allocationCloud)

/allocations/create [POST]

This is unimplemented locally. This will create an allocation. ONLY used within the cloud.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AllocationsApi()
val allocationCloud : AllocationCloud =  // AllocationCloud | 
try {
    val result : AllocationCloud = apiInstance.allocationsCreateNewAllocation(allocationCloud)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AllocationsApi#allocationsCreateNewAllocation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AllocationsApi#allocationsCreateNewAllocation")
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

<a name="allocationsDeleteAllocation"></a>
# **allocationsDeleteAllocation**
> kotlin.String allocationsDeleteAllocation(allocationCloud)

/allocations/delete [POST]

This is unimplemented locally. This will delete an allocation. ONLY used within the cloud.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AllocationsApi()
val allocationCloud : AllocationCloud =  // AllocationCloud | 
try {
    val result : kotlin.String = apiInstance.allocationsDeleteAllocation(allocationCloud)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AllocationsApi#allocationsDeleteAllocation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AllocationsApi#allocationsDeleteAllocation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationCloud** | [**AllocationCloud**](AllocationCloud.md)|  | [optional]

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="allocationsDisconnectCloud"></a>
# **allocationsDisconnectCloud**
> kotlin.String allocationsDisconnectCloud(allocationCloud)

/allocations/disconnect [POST]

This will attempt to disconnect to a specific users cloud.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AllocationsApi()
val allocationCloud : AllocationCloud =  // AllocationCloud | 
try {
    val result : kotlin.String = apiInstance.allocationsDisconnectCloud(allocationCloud)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AllocationsApi#allocationsDisconnectCloud")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AllocationsApi#allocationsDisconnectCloud")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationCloud** | [**AllocationCloud**](AllocationCloud.md)|  | [optional]

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="allocationsReconnectCloud"></a>
# **allocationsReconnectCloud**
> AllocationCloud allocationsReconnectCloud(allocationCloud)

/allocations/reconnect [POST]

This will attempt to reconnect to a users cloud. This will ensure that we are connected to a users cloud and will ensure that all the data associated with a user&#39;s cloud is up-to-date.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AllocationsApi()
val allocationCloud : AllocationCloud =  // AllocationCloud | 
try {
    val result : AllocationCloud = apiInstance.allocationsReconnectCloud(allocationCloud)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AllocationsApi#allocationsReconnectCloud")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AllocationsApi#allocationsReconnectCloud")
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

<a name="allocationsSnapshot"></a>
# **allocationsSnapshot**
> Allocations allocationsSnapshot()

/allocations [GET]

This is going to get a snapshot of all of the connected allocations.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AllocationsApi()
try {
    val result : Allocations = apiInstance.allocationsSnapshot()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AllocationsApi#allocationsSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AllocationsApi#allocationsSnapshot")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Allocations**](Allocations.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


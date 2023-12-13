# ApplicationApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applicationUpdate**](ApplicationApi.md#applicationUpdate) | **POST** /application/update | /application/update [GET]


<a name="applicationUpdate"></a>
# **applicationUpdate**
> Application applicationUpdate(application)

/application/update [GET]

This is an endpoint for updating an application.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationApi()
val application : Application =  // Application | 
try {
    val result : Application = apiInstance.applicationUpdate(application)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationApi#applicationUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationApi#applicationUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | [**Application**](Application.md)|  | [optional]

### Return type

[**Application**](Application.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


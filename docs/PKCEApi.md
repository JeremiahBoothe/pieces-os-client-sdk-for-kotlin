# PKCEApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clearPKCE**](PKCEApi.md#clearPKCE) | **POST** /pkce/clear | /pkce/clear [POST]
[**generateCode**](PKCEApi.md#generateCode) | **POST** /pkce/code | /pkce/code [POST]
[**generateToken**](PKCEApi.md#generateToken) | **POST** /pkce/token | /pkce/token [POST]
[**getChallenge**](PKCEApi.md#getChallenge) | **GET** /pkce/challenge | Your GET endpoint
[**respondWithCode**](PKCEApi.md#respondWithCode) | **POST** /pkce/response/code | /pkce/response/code [POST]


<a name="clearPKCE"></a>
# **clearPKCE**
> clearPKCE()

/pkce/clear [POST]

This is a function to Clear a PKCE Authentication Flow

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = PKCEApi()
try {
    apiInstance.clearPKCE()
} catch (e: ClientException) {
    println("4xx response calling PKCEApi#clearPKCE")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PKCEApi#clearPKCE")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="generateCode"></a>
# **generateCode**
> PKCE generateCode(seededPKCE)

/pkce/code [POST]

An endpoint to get the PKCE Code - this endpoint proxies the call out to Authorize within Auth0

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = PKCEApi()
val seededPKCE : SeededPKCE =  // SeededPKCE | All of the properties that the client might want to send over to authorize a PKCE Code Flow
try {
    val result : PKCE = apiInstance.generateCode(seededPKCE)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PKCEApi#generateCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PKCEApi#generateCode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **seededPKCE** | [**SeededPKCE**](SeededPKCE.md)| All of the properties that the client might want to send over to authorize a PKCE Code Flow | [optional]

### Return type

[**PKCE**](PKCE.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="generateToken"></a>
# **generateToken**
> PKCE generateToken(tokenizedPKCE)

/pkce/token [POST]

A proxy endpoint for PKCE token generation, internally calls Auth0 /oauth/token

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = PKCEApi()
val tokenizedPKCE : TokenizedPKCE =  // TokenizedPKCE | The needed properties to exchange a PKCE Code for an OAuth Token
try {
    val result : PKCE = apiInstance.generateToken(tokenizedPKCE)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PKCEApi#generateToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PKCEApi#generateToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenizedPKCE** | [**TokenizedPKCE**](TokenizedPKCE.md)| The needed properties to exchange a PKCE Code for an OAuth Token | [optional]

### Return type

[**PKCE**](PKCE.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChallenge"></a>
# **getChallenge**
> PKCE getChallenge()

Your GET endpoint

An endpoint that returns a PKCE Challenge

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = PKCEApi()
try {
    val result : PKCE = apiInstance.getChallenge()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PKCEApi#getChallenge")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PKCEApi#getChallenge")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PKCE**](PKCE.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="respondWithCode"></a>
# **respondWithCode**
> PKCE respondWithCode(code, state, schema)

/pkce/response/code [POST]

This is a callback function hosted to help pass along the ResultedPKCE code from authorize through to the callback.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = PKCEApi()
val code : kotlin.String = code_example // kotlin.String | The PKCE Code to be used to access a Token.
val state : kotlin.String = state_example // kotlin.String | Likely the state that will be returned which should match the requested state as well as the nonce
val schema : EmbeddedModelSchema =  // EmbeddedModelSchema | 
try {
    val result : PKCE = apiInstance.respondWithCode(code, state, schema)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PKCEApi#respondWithCode")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PKCEApi#respondWithCode")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **kotlin.String**| The PKCE Code to be used to access a Token. |
 **state** | **kotlin.String**| Likely the state that will be returned which should match the requested state as well as the nonce |
 **schema** | [**EmbeddedModelSchema**](EmbeddedModelSchema.md)|  | [optional]

### Return type

[**PKCE**](PKCE.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json, text/html


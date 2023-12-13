# UserApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clearUser**](UserApi.md#clearUser) | **POST** /user/clear | /user/clear
[**selectUser**](UserApi.md#selectUser) | **POST** /user/select | /user/select [POST]
[**streamUser**](UserApi.md#streamUser) | **GET** /user/stream | /user/stream [GET]
[**updateUser**](UserApi.md#updateUser) | **POST** /user/update | /user/update [POST]
[**userProviders**](UserApi.md#userProviders) | **GET** /user/providers | Your GET endpoint
[**userSnapshot**](UserApi.md#userSnapshot) | **GET** /user | /user [GET]
[**userUpdateVanity**](UserApi.md#userUpdateVanity) | **POST** /user/update/vanity | /user/update/vanity [POST]


<a name="clearUser"></a>
# **clearUser**
> clearUser()

/user/clear

An endpoint to clear the current user. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserApi()
try {
    apiInstance.clearUser()
} catch (e: ClientException) {
    println("4xx response calling UserApi#clearUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#clearUser")
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

<a name="selectUser"></a>
# **selectUser**
> UserProfile selectUser(auth0User)

/user/select [POST]

This will select the current user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserApi()
val auth0User : Auth0User =  // Auth0User | 
try {
    val result : UserProfile = apiInstance.selectUser(auth0User)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#selectUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#selectUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auth0User** | [**Auth0User**](Auth0User.md)|  | [optional]

### Return type

[**UserProfile**](UserProfile.md)

### Authorization


Configure auth0:
    ApiClient.accessToken = ""
Configure auth0:
    ApiClient.accessToken = ""
Configure auth0:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="streamUser"></a>
# **streamUser**
> UserProfile streamUser()

/user/stream [GET]

This will stream in the current user, not quiet sure yet how we want to do this.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserApi()
try {
    val result : UserProfile = apiInstance.streamUser()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#streamUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#streamUser")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserProfile**](UserProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUser"></a>
# **updateUser**
> UserProfile updateUser(userProfile)

/user/update [POST]

This will update a specific user in the database.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserApi()
val userProfile : UserProfile =  // UserProfile | 
try {
    val result : UserProfile = apiInstance.updateUser(userProfile)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#updateUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#updateUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userProfile** | [**UserProfile**](UserProfile.md)|  | [optional]

### Return type

[**UserProfile**](UserProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="userProviders"></a>
# **userProviders**
> ReturnedUserProfile userProviders()

Your GET endpoint

This will retrieve all the users Providers that are connected to this account.  If called locally. we will 501 - because it is not implemented locally yet.  If called in the cloud, we will refresh &amp;&amp; get your access tokens to access these providers.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserApi()
try {
    val result : ReturnedUserProfile = apiInstance.userProviders()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#userProviders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#userProviders")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ReturnedUserProfile**](ReturnedUserProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userSnapshot"></a>
# **userSnapshot**
> ReturnedUserProfile userSnapshot()

/user [GET]

This will return a snapshot of the current user. This will return our ReturnUserProfile and the user on that object is just a UserProfile and can potentially be null.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserApi()
try {
    val result : ReturnedUserProfile = apiInstance.userSnapshot()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#userSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#userSnapshot")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ReturnedUserProfile**](ReturnedUserProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userUpdateVanity"></a>
# **userUpdateVanity**
> UserProfile userUpdateVanity(userProfile)

/user/update/vanity [POST]

This is a local route to update your vanityname. ie mark.pieces.cloud, where \&quot;mark\&quot; is the vanityname.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserApi()
val userProfile : UserProfile =  // UserProfile | This will take an update userProfile, with the updated vanity name!
try {
    val result : UserProfile = apiInstance.userUpdateVanity(userProfile)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#userUpdateVanity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#userUpdateVanity")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userProfile** | [**UserProfile**](UserProfile.md)| This will take an update userProfile, with the updated vanity name! | [optional]

### Return type

[**UserProfile**](UserProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


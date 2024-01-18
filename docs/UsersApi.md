# UsersApi

All URIs are relative to *http://localhost:3000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticateFromOauthToken**](UsersApi.md#authenticateFromOauthToken) | **POST** /users/authenticate/from_token | /users/authenticate/from_token [POST]
[**usersDisconnectUser**](UsersApi.md#usersDisconnectUser) | **POST** /users/{user}/disconnect | /users/{user}/disconnect [POST]
[**usersSnapshot**](UsersApi.md#usersSnapshot) | **GET** /users | /users [GET]
[**usersSpecificUserSnapshot**](UsersApi.md#usersSpecificUserSnapshot) | **GET** /users/{user} | /users/{user} [GET] Scoped to Users


<a name="authenticateFromOauthToken"></a>
# **authenticateFromOauthToken**
> UserProfile authenticateFromOauthToken(oauthToken)

/users/authenticate/from_token [POST]

Creates a User From a oAuth Token

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = UsersApi()
val oauthToken : OAuthToken =  // OAuthToken | 
try {
    val result : UserProfile = apiInstance.authenticateFromOauthToken(oauthToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#authenticateFromOauthToken")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#authenticateFromOauthToken")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oauthToken** | [**OAuthToken**](OAuthToken.md)|  | [optional]

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

<a name="usersDisconnectUser"></a>
# **usersDisconnectUser**
> Users usersDisconnectUser(user)

/users/{user}/disconnect [POST]

Locally Removing a user for the purpose of Signing Out

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = UsersApi()
val user : kotlin.String = user_example // kotlin.String | 
try {
    val result : Users = apiInstance.usersDisconnectUser(user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersDisconnectUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersDisconnectUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | **kotlin.String**|  |

### Return type

[**Users**](Users.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersSnapshot"></a>
# **usersSnapshot**
> Users usersSnapshot()

/users [GET]

this will return a snapshot of all of the users that are in the users database. TODO might want to make this internal.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = UsersApi()
try {
    val result : Users = apiInstance.usersSnapshot()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersSnapshot")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Users**](Users.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="usersSpecificUserSnapshot"></a>
# **usersSpecificUserSnapshot**
> UserProfile usersSpecificUserSnapshot(user)

/users/{user} [GET] Scoped to Users

This enables the client to get the current user.  This endpoint will return a UserPRofile or will throw an error since you are sending user uid.

### Example
```kotlin
// Import classes:
//import org.piecesapp.client.infrastructure.*
//import org.piecesapp.client.models.*

val apiInstance = UsersApi()
val user : java.util.UUID = 497f6eca-6276-4993-bfeb-53cbbbba6f08 // java.util.UUID | The id (uuid) for a specific user.
try {
    val result : UserProfile = apiInstance.usersSpecificUserSnapshot(user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersSpecificUserSnapshot")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersSpecificUserSnapshot")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**java.util.UUID**](.md)| The id (uuid) for a specific user. |

### Return type

[**UserProfile**](UserProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


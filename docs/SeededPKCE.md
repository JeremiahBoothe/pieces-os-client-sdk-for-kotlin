
# SeededPKCE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**responseType** | [**inline**](#ResponseTypeEnum) | Indicates to Auth0 which OAuth 2.0 Flow you want to perform. Use code for Authorization Code Grant (PKCE) Flow. | 
**state** | [**java.util.UUID**](java.util.UUID.md) | An opaque value the clients adds to the initial request that Auth0 includes when redirecting the back to the client. This value must be used by the client to prevent CSRF attacks. | 
**nonce** | [**java.util.UUID**](java.util.UUID.md) | A local key that is held as the comparator to state, thus they should be the same. | 
**codeChallenge** | **kotlin.String** | Generated challenge from the code_verifier. | 
**codeChallengeMethod** | [**inline**](#CodeChallengeMethodEnum) | Method used to generate the challenge. The PKCE spec defines two methods, S256 and plain, however, Auth0 supports only S256 since the latter is discouraged. | 
**scope** | [**inline**](#kotlin.collections.List&lt;ScopeEnum&gt;) | The scopes which you want to request authorization for. These must be separated by a space. You can request any of the standard OpenID Connect (OIDC) scopes about users, such as profile and email, custom claims that must conform to a namespaced format, or any scopes supported by the target API (for example, read:contacts). Include offline_access to get a Refresh Token. | 
**clientId** | **kotlin.String** | Your application&#39;s Client ID. | 
**schema** | [**EmbeddedModelSchema**](EmbeddedModelSchema.md) |  |  [optional]
**redirectUri** | [**java.net.URI**](java.net.URI.md) | http://localhost:8080/authentication/response |  [optional]
**domain** | [**java.net.URI**](java.net.URI.md) | https://auth.pieces.services/authorize |  [optional]
**audience** | [**java.net.URI**](java.net.URI.md) | The unique identifier of the target API you want to access. i.e. https://pieces.us.auth0.com/api/v2/ |  [optional]
**screenHint** | [**inline**](#ScreenHintEnum) | Provides a hint to Auth0 as to what flow should be displayed. The default behavior is to show a login page but you can override this by passing &#39;signup&#39; to show the signup page instead. |  [optional]
**prompt** | [**inline**](#PromptEnum) |  To initiate a silent authentication request, use prompt&#x3D;none (see Remarks for more info). |  [optional]
**organization** | **kotlin.String** |  |  [optional]
**invitation** | **kotlin.String** |  |  [optional]
**ADDITIONAL_PARAMETERS** | [**SeededPKCEADDITIONALPARAMETERS**](SeededPKCEADDITIONALPARAMETERS.md) |  |  [optional]
**responseMode** | [**inline**](#ResponseModeEnum) |  |  [optional]


<a name="ResponseTypeEnum"></a>
## Enum: response_type
Name | Value
---- | -----
responseType | code, token, id_token


<a name="CodeChallengeMethodEnum"></a>
## Enum: code_challenge_method
Name | Value
---- | -----
codeChallengeMethod | S256


<a name="kotlin.collections.List<ScopeEnum>"></a>
## Enum: scope
Name | Value
---- | -----
scope | offline_access, email, profile, openid


<a name="ScreenHintEnum"></a>
## Enum: screen_hint
Name | Value
---- | -----
screenHint | signup


<a name="PromptEnum"></a>
## Enum: prompt
Name | Value
---- | -----
prompt | login, none


<a name="ResponseModeEnum"></a>
## Enum: response_mode
Name | Value
---- | -----
responseMode | form_post, web_message, fragment, query




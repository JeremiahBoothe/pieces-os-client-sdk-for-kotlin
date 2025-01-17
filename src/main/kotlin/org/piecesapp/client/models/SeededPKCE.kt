/**
* Pieces Isomorphic OpenAPI
* Endpoints for Assets, Formats, Users, Asset, Format, User.
*
* The version of the OpenAPI document: 1.0
* Contact: tsavo@pieces.app
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import org.openapitools.client.models.EmbeddedModelSchema
import org.openapitools.client.models.SeededPKCEADDITIONALPARAMETERS

import com.squareup.moshi.Json

/**
 * A model that initialized a PKCE Authentication Flow.
 * @param responseType Indicates to Auth0 which OAuth 2.0 Flow you want to perform. Use code for Authorization Code Grant (PKCE) Flow.
 * @param state An opaque value the clients adds to the initial request that Auth0 includes when redirecting the back to the client. This value must be used by the client to prevent CSRF attacks.
 * @param nonce A local key that is held as the comparator to state, thus they should be the same.
 * @param codeChallenge Generated challenge from the code_verifier.
 * @param codeChallengeMethod Method used to generate the challenge. The PKCE spec defines two methods, S256 and plain, however, Auth0 supports only S256 since the latter is discouraged.
 * @param scope The scopes which you want to request authorization for. These must be separated by a space. You can request any of the standard OpenID Connect (OIDC) scopes about users, such as profile and email, custom claims that must conform to a namespaced format, or any scopes supported by the target API (for example, read:contacts). Include offline_access to get a Refresh Token.
 * @param clientId Your application's Client ID.
 * @param schema 
 * @param redirectUri http://localhost:8080/authentication/response
 * @param domain https://auth.pieces.services/authorize
 * @param audience The unique identifier of the target API you want to access. i.e. https://pieces.us.auth0.com/api/v2/
 * @param screenHint Provides a hint to Auth0 as to what flow should be displayed. The default behavior is to show a login page but you can override this by passing 'signup' to show the signup page instead.
 * @param prompt  To initiate a silent authentication request, use prompt=none (see Remarks for more info).
 * @param organization 
 * @param invitation 
 * @param ADDITIONAL_PARAMETERS 
 * @param responseMode 
 */

data class SeededPKCE (
    /* Indicates to Auth0 which OAuth 2.0 Flow you want to perform. Use code for Authorization Code Grant (PKCE) Flow. */
    @Json(name = "response_type")
    val responseType: SeededPKCE.ResponseType,
    /* An opaque value the clients adds to the initial request that Auth0 includes when redirecting the back to the client. This value must be used by the client to prevent CSRF attacks. */
    @Json(name = "state")
    val state: java.util.UUID,
    /* A local key that is held as the comparator to state, thus they should be the same. */
    @Json(name = "nonce")
    val nonce: java.util.UUID,
    /* Generated challenge from the code_verifier. */
    @Json(name = "code_challenge")
    val codeChallenge: kotlin.String,
    /* Method used to generate the challenge. The PKCE spec defines two methods, S256 and plain, however, Auth0 supports only S256 since the latter is discouraged. */
    @Json(name = "code_challenge_method")
    val codeChallengeMethod: SeededPKCE.CodeChallengeMethod,
    /* The scopes which you want to request authorization for. These must be separated by a space. You can request any of the standard OpenID Connect (OIDC) scopes about users, such as profile and email, custom claims that must conform to a namespaced format, or any scopes supported by the target API (for example, read:contacts). Include offline_access to get a Refresh Token. */
    @Json(name = "scope")
    val scope: kotlin.collections.List<SeededPKCE.Scope>,
    /* Your application's Client ID. */
    @Json(name = "client_id")
    val clientId: kotlin.String,
    @Json(name = "schema")
    val schema: EmbeddedModelSchema? = null,
    /* http://localhost:8080/authentication/response */
    @Json(name = "redirect_uri")
    val redirectUri: java.net.URI? = null,
    /* https://auth.pieces.services/authorize */
    @Json(name = "domain")
    val domain: java.net.URI? = null,
    /* The unique identifier of the target API you want to access. i.e. https://pieces.us.auth0.com/api/v2/ */
    @Json(name = "audience")
    val audience: java.net.URI? = null,
    /* Provides a hint to Auth0 as to what flow should be displayed. The default behavior is to show a login page but you can override this by passing 'signup' to show the signup page instead. */
    @Json(name = "screen_hint")
    val screenHint: SeededPKCE.ScreenHint? = null,
    /*  To initiate a silent authentication request, use prompt=none (see Remarks for more info). */
    @Json(name = "prompt")
    val prompt: SeededPKCE.Prompt? = null,
    @Json(name = "organization")
    val organization: kotlin.String? = null,
    @Json(name = "invitation")
    val invitation: kotlin.String? = null,
    @Json(name = "ADDITIONAL_PARAMETERS")
    val ADDITIONAL_PARAMETERS: SeededPKCEADDITIONALPARAMETERS? = null,
    @Json(name = "response_mode")
    val responseMode: SeededPKCE.ResponseMode? = null
) {

    /**
    * Indicates to Auth0 which OAuth 2.0 Flow you want to perform. Use code for Authorization Code Grant (PKCE) Flow.
    * Values: code,token,idToken
    */
    
    enum class ResponseType(val value: kotlin.String){
        @Json(name = "code") code("code"),
        @Json(name = "token") token("token"),
        @Json(name = "id_token") idToken("id_token");
    }
    /**
    * Method used to generate the challenge. The PKCE spec defines two methods, S256 and plain, however, Auth0 supports only S256 since the latter is discouraged.
    * Values: s256
    */
    
    enum class CodeChallengeMethod(val value: kotlin.String){
        @Json(name = "S256") s256("S256");
    }
    /**
    * The scopes which you want to request authorization for. These must be separated by a space. You can request any of the standard OpenID Connect (OIDC) scopes about users, such as profile and email, custom claims that must conform to a namespaced format, or any scopes supported by the target API (for example, read:contacts). Include offline_access to get a Refresh Token.
    * Values: offlineAccess,email,profile,openid
    */
    
    enum class Scope(val value: kotlin.String){
        @Json(name = "offline_access") offlineAccess("offline_access"),
        @Json(name = "email") email("email"),
        @Json(name = "profile") profile("profile"),
        @Json(name = "openid") openid("openid");
    }
    /**
    * Provides a hint to Auth0 as to what flow should be displayed. The default behavior is to show a login page but you can override this by passing 'signup' to show the signup page instead.
    * Values: signup
    */
    
    enum class ScreenHint(val value: kotlin.String){
        @Json(name = "signup") signup("signup");
    }
    /**
    *  To initiate a silent authentication request, use prompt=none (see Remarks for more info).
    * Values: login,none
    */
    
    enum class Prompt(val value: kotlin.String){
        @Json(name = "login") login("login"),
        @Json(name = "none") none("none");
    }
    /**
    * 
    * Values: formPost,webMessage,fragment,query
    */
    
    enum class ResponseMode(val value: kotlin.String){
        @Json(name = "form_post") formPost("form_post"),
        @Json(name = "web_message") webMessage("web_message"),
        @Json(name = "fragment") fragment("fragment"),
        @Json(name = "query") query("query");
    }
}


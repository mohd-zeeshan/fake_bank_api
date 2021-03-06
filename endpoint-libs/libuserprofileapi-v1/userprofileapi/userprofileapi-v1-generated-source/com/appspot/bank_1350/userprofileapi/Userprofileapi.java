/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-05-27 16:00:31 UTC)
 * on 2016-06-29 at 07:26:39 UTC 
 * Modify at your own risk.
 */

package com.appspot.bank_1350.userprofileapi;

/**
 * Service definition for Userprofileapi (v1).
 *
 * <p>
 * An API to manage user profiles
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link UserprofileapiRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Userprofileapi extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.21.0 of the userprofileapi library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://bank-1350.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "userprofileapi/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Userprofileapi(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Userprofileapi(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getUserProfile".
   *
   * This request holds the parameters needed by the userprofileapi server.  After setting any
   * optional parameters, call the {@link GetUserProfile#execute()} method to invoke the remote
   * operation.
   *
   * @param userId
   * @return the request
   */
  public GetUserProfile getUserProfile(java.lang.Long userId) throws java.io.IOException {
    GetUserProfile result = new GetUserProfile(userId);
    initialize(result);
    return result;
  }

  public class GetUserProfile extends UserprofileapiRequest<com.appspot.bank_1350.userprofileapi.model.UserProfile> {

    private static final String REST_PATH = "userprofile/{userId}";

    /**
     * Create a request for the method "getUserProfile".
     *
     * This request holds the parameters needed by the the userprofileapi server.  After setting any
     * optional parameters, call the {@link GetUserProfile#execute()} method to invoke the remote
     * operation. <p> {@link GetUserProfile#initialize(com.google.api.client.googleapis.services.Abstr
     * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param userId
     * @since 1.13
     */
    protected GetUserProfile(java.lang.Long userId) {
      super(Userprofileapi.this, "GET", REST_PATH, null, com.appspot.bank_1350.userprofileapi.model.UserProfile.class);
      this.userId = com.google.api.client.util.Preconditions.checkNotNull(userId, "Required parameter userId must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetUserProfile setAlt(java.lang.String alt) {
      return (GetUserProfile) super.setAlt(alt);
    }

    @Override
    public GetUserProfile setFields(java.lang.String fields) {
      return (GetUserProfile) super.setFields(fields);
    }

    @Override
    public GetUserProfile setKey(java.lang.String key) {
      return (GetUserProfile) super.setKey(key);
    }

    @Override
    public GetUserProfile setOauthToken(java.lang.String oauthToken) {
      return (GetUserProfile) super.setOauthToken(oauthToken);
    }

    @Override
    public GetUserProfile setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetUserProfile) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetUserProfile setQuotaUser(java.lang.String quotaUser) {
      return (GetUserProfile) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetUserProfile setUserIp(java.lang.String userIp) {
      return (GetUserProfile) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long userId;

    /**

     */
    public java.lang.Long getUserId() {
      return userId;
    }

    public GetUserProfile setUserId(java.lang.Long userId) {
      this.userId = userId;
      return this;
    }

    @Override
    public GetUserProfile set(String parameterName, Object value) {
      return (GetUserProfile) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertUserProfile".
   *
   * This request holds the parameters needed by the userprofileapi server.  After setting any
   * optional parameters, call the {@link InsertUserProfile#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.appspot.bank_1350.userprofileapi.model.UserProfile}
   * @return the request
   */
  public InsertUserProfile insertUserProfile(com.appspot.bank_1350.userprofileapi.model.UserProfile content) throws java.io.IOException {
    InsertUserProfile result = new InsertUserProfile(content);
    initialize(result);
    return result;
  }

  public class InsertUserProfile extends UserprofileapiRequest<com.appspot.bank_1350.userprofileapi.model.UserProfile> {

    private static final String REST_PATH = "userprofile";

    /**
     * Create a request for the method "insertUserProfile".
     *
     * This request holds the parameters needed by the the userprofileapi server.  After setting any
     * optional parameters, call the {@link InsertUserProfile#execute()} method to invoke the remote
     * operation. <p> {@link InsertUserProfile#initialize(com.google.api.client.googleapis.services.Ab
     * stractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param content the {@link com.appspot.bank_1350.userprofileapi.model.UserProfile}
     * @since 1.13
     */
    protected InsertUserProfile(com.appspot.bank_1350.userprofileapi.model.UserProfile content) {
      super(Userprofileapi.this, "POST", REST_PATH, content, com.appspot.bank_1350.userprofileapi.model.UserProfile.class);
    }

    @Override
    public InsertUserProfile setAlt(java.lang.String alt) {
      return (InsertUserProfile) super.setAlt(alt);
    }

    @Override
    public InsertUserProfile setFields(java.lang.String fields) {
      return (InsertUserProfile) super.setFields(fields);
    }

    @Override
    public InsertUserProfile setKey(java.lang.String key) {
      return (InsertUserProfile) super.setKey(key);
    }

    @Override
    public InsertUserProfile setOauthToken(java.lang.String oauthToken) {
      return (InsertUserProfile) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertUserProfile setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertUserProfile) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertUserProfile setQuotaUser(java.lang.String quotaUser) {
      return (InsertUserProfile) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertUserProfile setUserIp(java.lang.String userIp) {
      return (InsertUserProfile) super.setUserIp(userIp);
    }

    @Override
    public InsertUserProfile set(String parameterName, Object value) {
      return (InsertUserProfile) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listUserProfile".
   *
   * This request holds the parameters needed by the userprofileapi server.  After setting any
   * optional parameters, call the {@link ListUserProfile#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   */
  public ListUserProfile listUserProfile() throws java.io.IOException {
    ListUserProfile result = new ListUserProfile();
    initialize(result);
    return result;
  }

  public class ListUserProfile extends UserprofileapiRequest<com.appspot.bank_1350.userprofileapi.model.CollectionResponseUserProfile> {

    private static final String REST_PATH = "userprofile";

    /**
     * Create a request for the method "listUserProfile".
     *
     * This request holds the parameters needed by the the userprofileapi server.  After setting any
     * optional parameters, call the {@link ListUserProfile#execute()} method to invoke the remote
     * operation. <p> {@link ListUserProfile#initialize(com.google.api.client.googleapis.services.Abst
     * ractGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @since 1.13
     */
    protected ListUserProfile() {
      super(Userprofileapi.this, "GET", REST_PATH, null, com.appspot.bank_1350.userprofileapi.model.CollectionResponseUserProfile.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListUserProfile setAlt(java.lang.String alt) {
      return (ListUserProfile) super.setAlt(alt);
    }

    @Override
    public ListUserProfile setFields(java.lang.String fields) {
      return (ListUserProfile) super.setFields(fields);
    }

    @Override
    public ListUserProfile setKey(java.lang.String key) {
      return (ListUserProfile) super.setKey(key);
    }

    @Override
    public ListUserProfile setOauthToken(java.lang.String oauthToken) {
      return (ListUserProfile) super.setOauthToken(oauthToken);
    }

    @Override
    public ListUserProfile setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListUserProfile) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListUserProfile setQuotaUser(java.lang.String quotaUser) {
      return (ListUserProfile) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListUserProfile setUserIp(java.lang.String userIp) {
      return (ListUserProfile) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListUserProfile setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListUserProfile setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListUserProfile set(String parameterName, Object value) {
      return (ListUserProfile) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeUserProfile".
   *
   * This request holds the parameters needed by the userprofileapi server.  After setting any
   * optional parameters, call the {@link RemoveUserProfile#execute()} method to invoke the remote
   * operation.
   *
   * @param userId
   * @return the request
   */
  public RemoveUserProfile removeUserProfile(java.lang.Long userId) throws java.io.IOException {
    RemoveUserProfile result = new RemoveUserProfile(userId);
    initialize(result);
    return result;
  }

  public class RemoveUserProfile extends UserprofileapiRequest<Void> {

    private static final String REST_PATH = "userprofile/{userId}";

    /**
     * Create a request for the method "removeUserProfile".
     *
     * This request holds the parameters needed by the the userprofileapi server.  After setting any
     * optional parameters, call the {@link RemoveUserProfile#execute()} method to invoke the remote
     * operation. <p> {@link RemoveUserProfile#initialize(com.google.api.client.googleapis.services.Ab
     * stractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param userId
     * @since 1.13
     */
    protected RemoveUserProfile(java.lang.Long userId) {
      super(Userprofileapi.this, "DELETE", REST_PATH, null, Void.class);
      this.userId = com.google.api.client.util.Preconditions.checkNotNull(userId, "Required parameter userId must be specified.");
    }

    @Override
    public RemoveUserProfile setAlt(java.lang.String alt) {
      return (RemoveUserProfile) super.setAlt(alt);
    }

    @Override
    public RemoveUserProfile setFields(java.lang.String fields) {
      return (RemoveUserProfile) super.setFields(fields);
    }

    @Override
    public RemoveUserProfile setKey(java.lang.String key) {
      return (RemoveUserProfile) super.setKey(key);
    }

    @Override
    public RemoveUserProfile setOauthToken(java.lang.String oauthToken) {
      return (RemoveUserProfile) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveUserProfile setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveUserProfile) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveUserProfile setQuotaUser(java.lang.String quotaUser) {
      return (RemoveUserProfile) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveUserProfile setUserIp(java.lang.String userIp) {
      return (RemoveUserProfile) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long userId;

    /**

     */
    public java.lang.Long getUserId() {
      return userId;
    }

    public RemoveUserProfile setUserId(java.lang.Long userId) {
      this.userId = userId;
      return this;
    }

    @Override
    public RemoveUserProfile set(String parameterName, Object value) {
      return (RemoveUserProfile) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateUserProfile".
   *
   * This request holds the parameters needed by the userprofileapi server.  After setting any
   * optional parameters, call the {@link UpdateUserProfile#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.appspot.bank_1350.userprofileapi.model.UserProfile}
   * @return the request
   */
  public UpdateUserProfile updateUserProfile(com.appspot.bank_1350.userprofileapi.model.UserProfile content) throws java.io.IOException {
    UpdateUserProfile result = new UpdateUserProfile(content);
    initialize(result);
    return result;
  }

  public class UpdateUserProfile extends UserprofileapiRequest<com.appspot.bank_1350.userprofileapi.model.UserProfile> {

    private static final String REST_PATH = "userprofile";

    /**
     * Create a request for the method "updateUserProfile".
     *
     * This request holds the parameters needed by the the userprofileapi server.  After setting any
     * optional parameters, call the {@link UpdateUserProfile#execute()} method to invoke the remote
     * operation. <p> {@link UpdateUserProfile#initialize(com.google.api.client.googleapis.services.Ab
     * stractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param content the {@link com.appspot.bank_1350.userprofileapi.model.UserProfile}
     * @since 1.13
     */
    protected UpdateUserProfile(com.appspot.bank_1350.userprofileapi.model.UserProfile content) {
      super(Userprofileapi.this, "PUT", REST_PATH, content, com.appspot.bank_1350.userprofileapi.model.UserProfile.class);
    }

    @Override
    public UpdateUserProfile setAlt(java.lang.String alt) {
      return (UpdateUserProfile) super.setAlt(alt);
    }

    @Override
    public UpdateUserProfile setFields(java.lang.String fields) {
      return (UpdateUserProfile) super.setFields(fields);
    }

    @Override
    public UpdateUserProfile setKey(java.lang.String key) {
      return (UpdateUserProfile) super.setKey(key);
    }

    @Override
    public UpdateUserProfile setOauthToken(java.lang.String oauthToken) {
      return (UpdateUserProfile) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateUserProfile setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateUserProfile) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateUserProfile setQuotaUser(java.lang.String quotaUser) {
      return (UpdateUserProfile) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateUserProfile setUserIp(java.lang.String userIp) {
      return (UpdateUserProfile) super.setUserIp(userIp);
    }

    @Override
    public UpdateUserProfile set(String parameterName, Object value) {
      return (UpdateUserProfile) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Userprofileapi}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Userprofileapi}. */
    @Override
    public Userprofileapi build() {
      return new Userprofileapi(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link UserprofileapiRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setUserprofileapiRequestInitializer(
        UserprofileapiRequestInitializer userprofileapiRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(userprofileapiRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}

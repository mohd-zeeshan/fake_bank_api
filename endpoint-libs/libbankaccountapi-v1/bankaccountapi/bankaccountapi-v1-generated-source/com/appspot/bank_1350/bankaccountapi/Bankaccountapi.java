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
 * on 2016-06-29 at 07:26:51 UTC 
 * Modify at your own risk.
 */

package com.appspot.bank_1350.bankaccountapi;

/**
 * Service definition for Bankaccountapi (v1).
 *
 * <p>
 * An API to manage bank accounts
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link BankaccountapiRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Bankaccountapi extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.21.0 of the bankaccountapi library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
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
  public static final String DEFAULT_SERVICE_PATH = "bankaccountapi/v1/";

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
  public Bankaccountapi(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Bankaccountapi(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getBankAccount".
   *
   * This request holds the parameters needed by the bankaccountapi server.  After setting any
   * optional parameters, call the {@link GetBankAccount#execute()} method to invoke the remote
   * operation.
   *
   * @param accountNumber
   * @return the request
   */
  public GetBankAccount getBankAccount(java.lang.Long accountNumber) throws java.io.IOException {
    GetBankAccount result = new GetBankAccount(accountNumber);
    initialize(result);
    return result;
  }

  public class GetBankAccount extends BankaccountapiRequest<com.appspot.bank_1350.bankaccountapi.model.BankAccount> {

    private static final String REST_PATH = "bankaccount/{accountNumber}";

    /**
     * Create a request for the method "getBankAccount".
     *
     * This request holds the parameters needed by the the bankaccountapi server.  After setting any
     * optional parameters, call the {@link GetBankAccount#execute()} method to invoke the remote
     * operation. <p> {@link GetBankAccount#initialize(com.google.api.client.googleapis.services.Abstr
     * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param accountNumber
     * @since 1.13
     */
    protected GetBankAccount(java.lang.Long accountNumber) {
      super(Bankaccountapi.this, "GET", REST_PATH, null, com.appspot.bank_1350.bankaccountapi.model.BankAccount.class);
      this.accountNumber = com.google.api.client.util.Preconditions.checkNotNull(accountNumber, "Required parameter accountNumber must be specified.");
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
    public GetBankAccount setAlt(java.lang.String alt) {
      return (GetBankAccount) super.setAlt(alt);
    }

    @Override
    public GetBankAccount setFields(java.lang.String fields) {
      return (GetBankAccount) super.setFields(fields);
    }

    @Override
    public GetBankAccount setKey(java.lang.String key) {
      return (GetBankAccount) super.setKey(key);
    }

    @Override
    public GetBankAccount setOauthToken(java.lang.String oauthToken) {
      return (GetBankAccount) super.setOauthToken(oauthToken);
    }

    @Override
    public GetBankAccount setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetBankAccount) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetBankAccount setQuotaUser(java.lang.String quotaUser) {
      return (GetBankAccount) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetBankAccount setUserIp(java.lang.String userIp) {
      return (GetBankAccount) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long accountNumber;

    /**

     */
    public java.lang.Long getAccountNumber() {
      return accountNumber;
    }

    public GetBankAccount setAccountNumber(java.lang.Long accountNumber) {
      this.accountNumber = accountNumber;
      return this;
    }

    @Override
    public GetBankAccount set(String parameterName, Object value) {
      return (GetBankAccount) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertBankAccount".
   *
   * This request holds the parameters needed by the bankaccountapi server.  After setting any
   * optional parameters, call the {@link InsertBankAccount#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.appspot.bank_1350.bankaccountapi.model.BankAccount}
   * @return the request
   */
  public InsertBankAccount insertBankAccount(com.appspot.bank_1350.bankaccountapi.model.BankAccount content) throws java.io.IOException {
    InsertBankAccount result = new InsertBankAccount(content);
    initialize(result);
    return result;
  }

  public class InsertBankAccount extends BankaccountapiRequest<com.appspot.bank_1350.bankaccountapi.model.BankAccount> {

    private static final String REST_PATH = "bankaccount";

    /**
     * Create a request for the method "insertBankAccount".
     *
     * This request holds the parameters needed by the the bankaccountapi server.  After setting any
     * optional parameters, call the {@link InsertBankAccount#execute()} method to invoke the remote
     * operation. <p> {@link InsertBankAccount#initialize(com.google.api.client.googleapis.services.Ab
     * stractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param content the {@link com.appspot.bank_1350.bankaccountapi.model.BankAccount}
     * @since 1.13
     */
    protected InsertBankAccount(com.appspot.bank_1350.bankaccountapi.model.BankAccount content) {
      super(Bankaccountapi.this, "POST", REST_PATH, content, com.appspot.bank_1350.bankaccountapi.model.BankAccount.class);
    }

    @Override
    public InsertBankAccount setAlt(java.lang.String alt) {
      return (InsertBankAccount) super.setAlt(alt);
    }

    @Override
    public InsertBankAccount setFields(java.lang.String fields) {
      return (InsertBankAccount) super.setFields(fields);
    }

    @Override
    public InsertBankAccount setKey(java.lang.String key) {
      return (InsertBankAccount) super.setKey(key);
    }

    @Override
    public InsertBankAccount setOauthToken(java.lang.String oauthToken) {
      return (InsertBankAccount) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertBankAccount setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertBankAccount) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertBankAccount setQuotaUser(java.lang.String quotaUser) {
      return (InsertBankAccount) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertBankAccount setUserIp(java.lang.String userIp) {
      return (InsertBankAccount) super.setUserIp(userIp);
    }

    @Override
    public InsertBankAccount set(String parameterName, Object value) {
      return (InsertBankAccount) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listBankAccount".
   *
   * This request holds the parameters needed by the bankaccountapi server.  After setting any
   * optional parameters, call the {@link ListBankAccount#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   */
  public ListBankAccount listBankAccount() throws java.io.IOException {
    ListBankAccount result = new ListBankAccount();
    initialize(result);
    return result;
  }

  public class ListBankAccount extends BankaccountapiRequest<com.appspot.bank_1350.bankaccountapi.model.CollectionResponseBankAccount> {

    private static final String REST_PATH = "bankaccount";

    /**
     * Create a request for the method "listBankAccount".
     *
     * This request holds the parameters needed by the the bankaccountapi server.  After setting any
     * optional parameters, call the {@link ListBankAccount#execute()} method to invoke the remote
     * operation. <p> {@link ListBankAccount#initialize(com.google.api.client.googleapis.services.Abst
     * ractGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @since 1.13
     */
    protected ListBankAccount() {
      super(Bankaccountapi.this, "GET", REST_PATH, null, com.appspot.bank_1350.bankaccountapi.model.CollectionResponseBankAccount.class);
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
    public ListBankAccount setAlt(java.lang.String alt) {
      return (ListBankAccount) super.setAlt(alt);
    }

    @Override
    public ListBankAccount setFields(java.lang.String fields) {
      return (ListBankAccount) super.setFields(fields);
    }

    @Override
    public ListBankAccount setKey(java.lang.String key) {
      return (ListBankAccount) super.setKey(key);
    }

    @Override
    public ListBankAccount setOauthToken(java.lang.String oauthToken) {
      return (ListBankAccount) super.setOauthToken(oauthToken);
    }

    @Override
    public ListBankAccount setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListBankAccount) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListBankAccount setQuotaUser(java.lang.String quotaUser) {
      return (ListBankAccount) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListBankAccount setUserIp(java.lang.String userIp) {
      return (ListBankAccount) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListBankAccount setCursor(java.lang.String cursor) {
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

    public ListBankAccount setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListBankAccount set(String parameterName, Object value) {
      return (ListBankAccount) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listBankAccountByUserId".
   *
   * This request holds the parameters needed by the bankaccountapi server.  After setting any
   * optional parameters, call the {@link ListBankAccountByUserId#execute()} method to invoke the
   * remote operation.
   *
   * @param userId
   * @return the request
   */
  public ListBankAccountByUserId listBankAccountByUserId(java.lang.Long userId) throws java.io.IOException {
    ListBankAccountByUserId result = new ListBankAccountByUserId(userId);
    initialize(result);
    return result;
  }

  public class ListBankAccountByUserId extends BankaccountapiRequest<com.appspot.bank_1350.bankaccountapi.model.CollectionResponseBankAccount> {

    private static final String REST_PATH = "collectionresponse_bankaccount/{userId}";

    /**
     * Create a request for the method "listBankAccountByUserId".
     *
     * This request holds the parameters needed by the the bankaccountapi server.  After setting any
     * optional parameters, call the {@link ListBankAccountByUserId#execute()} method to invoke the
     * remote operation. <p> {@link ListBankAccountByUserId#initialize(com.google.api.client.googleapi
     * s.services.AbstractGoogleClientRequest)} must be called to initialize this instance immediately
     * after invoking the constructor. </p>
     *
     * @param userId
     * @since 1.13
     */
    protected ListBankAccountByUserId(java.lang.Long userId) {
      super(Bankaccountapi.this, "GET", REST_PATH, null, com.appspot.bank_1350.bankaccountapi.model.CollectionResponseBankAccount.class);
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
    public ListBankAccountByUserId setAlt(java.lang.String alt) {
      return (ListBankAccountByUserId) super.setAlt(alt);
    }

    @Override
    public ListBankAccountByUserId setFields(java.lang.String fields) {
      return (ListBankAccountByUserId) super.setFields(fields);
    }

    @Override
    public ListBankAccountByUserId setKey(java.lang.String key) {
      return (ListBankAccountByUserId) super.setKey(key);
    }

    @Override
    public ListBankAccountByUserId setOauthToken(java.lang.String oauthToken) {
      return (ListBankAccountByUserId) super.setOauthToken(oauthToken);
    }

    @Override
    public ListBankAccountByUserId setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListBankAccountByUserId) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListBankAccountByUserId setQuotaUser(java.lang.String quotaUser) {
      return (ListBankAccountByUserId) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListBankAccountByUserId setUserIp(java.lang.String userIp) {
      return (ListBankAccountByUserId) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long userId;

    /**

     */
    public java.lang.Long getUserId() {
      return userId;
    }

    public ListBankAccountByUserId setUserId(java.lang.Long userId) {
      this.userId = userId;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListBankAccountByUserId setCursor(java.lang.String cursor) {
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

    public ListBankAccountByUserId setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListBankAccountByUserId set(String parameterName, Object value) {
      return (ListBankAccountByUserId) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeBankAccount".
   *
   * This request holds the parameters needed by the bankaccountapi server.  After setting any
   * optional parameters, call the {@link RemoveBankAccount#execute()} method to invoke the remote
   * operation.
   *
   * @param accountNumber
   * @return the request
   */
  public RemoveBankAccount removeBankAccount(java.lang.Long accountNumber) throws java.io.IOException {
    RemoveBankAccount result = new RemoveBankAccount(accountNumber);
    initialize(result);
    return result;
  }

  public class RemoveBankAccount extends BankaccountapiRequest<Void> {

    private static final String REST_PATH = "bankaccount/{accountNumber}";

    /**
     * Create a request for the method "removeBankAccount".
     *
     * This request holds the parameters needed by the the bankaccountapi server.  After setting any
     * optional parameters, call the {@link RemoveBankAccount#execute()} method to invoke the remote
     * operation. <p> {@link RemoveBankAccount#initialize(com.google.api.client.googleapis.services.Ab
     * stractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param accountNumber
     * @since 1.13
     */
    protected RemoveBankAccount(java.lang.Long accountNumber) {
      super(Bankaccountapi.this, "DELETE", REST_PATH, null, Void.class);
      this.accountNumber = com.google.api.client.util.Preconditions.checkNotNull(accountNumber, "Required parameter accountNumber must be specified.");
    }

    @Override
    public RemoveBankAccount setAlt(java.lang.String alt) {
      return (RemoveBankAccount) super.setAlt(alt);
    }

    @Override
    public RemoveBankAccount setFields(java.lang.String fields) {
      return (RemoveBankAccount) super.setFields(fields);
    }

    @Override
    public RemoveBankAccount setKey(java.lang.String key) {
      return (RemoveBankAccount) super.setKey(key);
    }

    @Override
    public RemoveBankAccount setOauthToken(java.lang.String oauthToken) {
      return (RemoveBankAccount) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveBankAccount setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveBankAccount) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveBankAccount setQuotaUser(java.lang.String quotaUser) {
      return (RemoveBankAccount) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveBankAccount setUserIp(java.lang.String userIp) {
      return (RemoveBankAccount) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long accountNumber;

    /**

     */
    public java.lang.Long getAccountNumber() {
      return accountNumber;
    }

    public RemoveBankAccount setAccountNumber(java.lang.Long accountNumber) {
      this.accountNumber = accountNumber;
      return this;
    }

    @Override
    public RemoveBankAccount set(String parameterName, Object value) {
      return (RemoveBankAccount) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateBankAccount".
   *
   * This request holds the parameters needed by the bankaccountapi server.  After setting any
   * optional parameters, call the {@link UpdateBankAccount#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.appspot.bank_1350.bankaccountapi.model.BankAccount}
   * @return the request
   */
  public UpdateBankAccount updateBankAccount(com.appspot.bank_1350.bankaccountapi.model.BankAccount content) throws java.io.IOException {
    UpdateBankAccount result = new UpdateBankAccount(content);
    initialize(result);
    return result;
  }

  public class UpdateBankAccount extends BankaccountapiRequest<com.appspot.bank_1350.bankaccountapi.model.BankAccount> {

    private static final String REST_PATH = "bankaccount";

    /**
     * Create a request for the method "updateBankAccount".
     *
     * This request holds the parameters needed by the the bankaccountapi server.  After setting any
     * optional parameters, call the {@link UpdateBankAccount#execute()} method to invoke the remote
     * operation. <p> {@link UpdateBankAccount#initialize(com.google.api.client.googleapis.services.Ab
     * stractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param content the {@link com.appspot.bank_1350.bankaccountapi.model.BankAccount}
     * @since 1.13
     */
    protected UpdateBankAccount(com.appspot.bank_1350.bankaccountapi.model.BankAccount content) {
      super(Bankaccountapi.this, "PUT", REST_PATH, content, com.appspot.bank_1350.bankaccountapi.model.BankAccount.class);
    }

    @Override
    public UpdateBankAccount setAlt(java.lang.String alt) {
      return (UpdateBankAccount) super.setAlt(alt);
    }

    @Override
    public UpdateBankAccount setFields(java.lang.String fields) {
      return (UpdateBankAccount) super.setFields(fields);
    }

    @Override
    public UpdateBankAccount setKey(java.lang.String key) {
      return (UpdateBankAccount) super.setKey(key);
    }

    @Override
    public UpdateBankAccount setOauthToken(java.lang.String oauthToken) {
      return (UpdateBankAccount) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateBankAccount setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateBankAccount) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateBankAccount setQuotaUser(java.lang.String quotaUser) {
      return (UpdateBankAccount) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateBankAccount setUserIp(java.lang.String userIp) {
      return (UpdateBankAccount) super.setUserIp(userIp);
    }

    @Override
    public UpdateBankAccount set(String parameterName, Object value) {
      return (UpdateBankAccount) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Bankaccountapi}.
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

    /** Builds a new instance of {@link Bankaccountapi}. */
    @Override
    public Bankaccountapi build() {
      return new Bankaccountapi(this);
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
     * Set the {@link BankaccountapiRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setBankaccountapiRequestInitializer(
        BankaccountapiRequestInitializer bankaccountapiRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(bankaccountapiRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}

public abstract class com.openfeint.internal.request.BaseRequest {
	 /* .source "BaseRequest.java" */
	 /* # static fields */
	 private static Integer DEFAULT_RETRIES;
	 private static Long DEFAULT_TIMEOUT;
	 protected static java.lang.String TAG;
	 private static java.lang.String sBaseServerURL;
	 /* # instance fields */
	 protected com.openfeint.internal.request.OrderedArgList mArgs;
	 private java.lang.String mCurrentURL;
	 private java.util.concurrent.Future mFuture;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/concurrent/Future", */
	 /* "<*>;" */
	 /* } */
} // .end annotation
} // .end field
private org.apache.http.params.HttpParams mHttpParams;
private java.lang.String mKey;
private org.apache.http.client.methods.HttpUriRequest mRequest;
private Boolean mResponded;
private mResponseBody;
private Integer mResponseCode;
private java.lang.String mResponseEncoding;
private java.lang.String mResponseType;
private Integer mRetriesLeft;
private Long mSecondsSinceEpoch;
private java.lang.String mSignature;
private org.apache.http.HttpResponse response_;
/* # direct methods */
static com.openfeint.internal.request.BaseRequest ( ) {
/* .locals 2 */
/* .prologue */
/* .line 34 */
int v0 = 2; // const/4 v0, 0x2
/* .line 35 */
/* const-wide/16 v0, 0x4e20 */
/* sput-wide v0, Lcom/openfeint/internal/request/BaseRequest;->DEFAULT_TIMEOUT:J */
/* .line 37 */
final String v0 = "Request"; // const-string v0, "Request"
/* .line 47 */
int v0 = 0; // const/4 v0, 0x0
return;
} // .end method
public com.openfeint.internal.request.BaseRequest ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
int v0 = 0; // const/4 v0, 0x0
/* .line 96 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 41 */
/* iput-boolean v1, p0, Lcom/openfeint/internal/request/BaseRequest;->mResponded:Z */
/* .line 42 */
this.mResponseEncoding = v0;
/* .line 43 */
this.mResponseType = v0;
/* .line 49 */
this.mSignature = v0;
/* .line 50 */
this.mKey = v0;
/* .line 51 */
/* iput v1, p0, Lcom/openfeint/internal/request/BaseRequest;->mRetriesLeft:I */
/* .line 56 */
this.mCurrentURL = v0;
/* .line 59 */
this.mFuture = v0;
/* .line 61 */
this.mHttpParams = v0;
/* .line 97 */
return;
} // .end method
public com.openfeint.internal.request.BaseRequest ( ) {
/* .locals 2 */
/* .param p1, "args" # Lcom/openfeint/internal/request/OrderedArgList; */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
int v0 = 0; // const/4 v0, 0x0
/* .line 100 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 41 */
/* iput-boolean v1, p0, Lcom/openfeint/internal/request/BaseRequest;->mResponded:Z */
/* .line 42 */
this.mResponseEncoding = v0;
/* .line 43 */
this.mResponseType = v0;
/* .line 49 */
this.mSignature = v0;
/* .line 50 */
this.mKey = v0;
/* .line 51 */
/* iput v1, p0, Lcom/openfeint/internal/request/BaseRequest;->mRetriesLeft:I */
/* .line 56 */
this.mCurrentURL = v0;
/* .line 59 */
this.mFuture = v0;
/* .line 61 */
this.mHttpParams = v0;
/* .line 101 */
(( com.openfeint.internal.request.BaseRequest ) p0 ).setArgs ( p1 ); // invoke-virtual {p0, p1}, Lcom/openfeint/internal/request/BaseRequest;->setArgs(Lcom/openfeint/internal/request/OrderedArgList;)V
/* .line 102 */
return;
} // .end method
static java.lang.String access$002 ( com.openfeint.internal.request.BaseRequest p0, java.lang.String p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/request/BaseRequest; */
/* .param p1, "x1" # Ljava/lang/String; */
/* .prologue */
/* .line 32 */
this.mCurrentURL = p1;
} // .end method
static access$100 ( com.openfeint.internal.request.BaseRequest p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/openfeint/internal/request/BaseRequest; */
/* .prologue */
/* .line 32 */
v0 = this.mResponseBody;
} // .end method
static access$102 ( com.openfeint.internal.request.BaseRequest p0, Object[] p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/request/BaseRequest; */
/* .param p1, "x1" # [B */
/* .prologue */
/* .line 32 */
this.mResponseBody = p1;
} // .end method
static Integer access$202 ( com.openfeint.internal.request.BaseRequest p0, Integer p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/request/BaseRequest; */
/* .param p1, "x1" # I */
/* .prologue */
/* .line 32 */
/* iput p1, p0, Lcom/openfeint/internal/request/BaseRequest;->mResponseCode:I */
} // .end method
static java.lang.String access$302 ( com.openfeint.internal.request.BaseRequest p0, java.lang.String p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/request/BaseRequest; */
/* .param p1, "x1" # Ljava/lang/String; */
/* .prologue */
/* .line 32 */
this.mResponseEncoding = p1;
} // .end method
static java.lang.String access$402 ( com.openfeint.internal.request.BaseRequest p0, java.lang.String p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/request/BaseRequest; */
/* .param p1, "x1" # Ljava/lang/String; */
/* .prologue */
/* .line 32 */
this.mResponseType = p1;
} // .end method
static org.apache.http.client.methods.HttpUriRequest access$500 ( com.openfeint.internal.request.BaseRequest p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/openfeint/internal/request/BaseRequest; */
/* .prologue */
/* .line 32 */
v0 = this.mRequest;
} // .end method
static org.apache.http.HttpResponse access$602 ( com.openfeint.internal.request.BaseRequest p0, org.apache.http.HttpResponse p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/request/BaseRequest; */
/* .param p1, "x1" # Lorg/apache/http/HttpResponse; */
/* .prologue */
/* .line 32 */
this.response_ = p1;
} // .end method
private void fakeServerException ( com.openfeint.internal.resource.ServerException p0 ) {
/* .locals 1 */
/* .param p1, "se" # Lcom/openfeint/internal/resource/ServerException; */
/* .prologue */
/* .line 283 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/openfeint/internal/request/BaseRequest;->mResponseCode:I */
/* .line 284 */
(( com.openfeint.internal.resource.ServerException ) p1 ).generate ( ); // invoke-virtual {p1}, Lcom/openfeint/internal/resource/ServerException;->generate()Ljava/lang/String;
(( java.lang.String ) v0 ).getBytes ( ); // invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
this.mResponseBody = v0;
/* .line 285 */
final String v0 = "application/json;"; // const-string v0, "application/json;"
this.mResponseType = v0;
/* .line 286 */
return;
} // .end method
/* # virtual methods */
protected final void addParams ( org.apache.http.client.methods.HttpUriRequest p0 ) {
/* .locals 1 */
/* .param p1, "retval" # Lorg/apache/http/client/methods/HttpUriRequest; */
/* .prologue */
/* .line 177 */
v0 = this.mHttpParams;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 178 */
	 v0 = this.mHttpParams;
	 /* .line 180 */
} // :cond_0
return;
} // .end method
protected java.lang.String currentURL ( ) {
/* .locals 1 */
/* .prologue */
/* .line 57 */
v0 = this.mCurrentURL;
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.mCurrentURL;
} // :goto_0
} // :cond_0
(( com.openfeint.internal.request.BaseRequest ) p0 ).url ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/BaseRequest;->url()Ljava/lang/String;
} // .end method
public final void exec ( Boolean p0 ) {
/* .locals 11 */
/* .param p1, "forceFailure" # Z */
/* .prologue */
int v10 = 0; // const/4 v10, 0x0
int v9 = 0; // const/4 v9, 0x0
/* .line 183 */
(( com.openfeint.internal.request.BaseRequest ) p0 ).generateRequest ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/BaseRequest;->generateRequest()Lorg/apache/http/client/methods/HttpUriRequest;
this.mRequest = v6;
/* .line 185 */
v6 = (( com.openfeint.internal.request.BaseRequest ) p0 ).numRetries ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/BaseRequest;->numRetries()I
/* iput v6, p0, Lcom/openfeint/internal/request/BaseRequest;->mRetriesLeft:I */
/* .line 187 */
this.mResponseBody = v9;
/* .line 188 */
/* iput v10, p0, Lcom/openfeint/internal/request/BaseRequest;->mResponseCode:I */
/* .line 189 */
this.response_ = v9;
/* .line 192 */
v6 = this.mRequest;
(( java.net.URI ) v6 ).getPath ( ); // invoke-virtual {v6}, Ljava/net/URI;->getPath()Ljava/lang/String;
/* .line 193 */
/* .local v4, "path":Ljava/lang/String; */
final String v6 = "//"; // const-string v6, "//"
v6 = (( java.lang.String ) v4 ).contains ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 195 */
/* new-instance v5, Lcom/openfeint/internal/resource/ServerException; */
/* invoke-direct {v5}, Lcom/openfeint/internal/resource/ServerException;-><init>()V */
/* .line 196 */
/* .local v5, "se":Lcom/openfeint/internal/resource/ServerException; */
final String v6 = "RequestError"; // const-string v6, "RequestError"
this.exceptionClass = v6;
/* .line 197 */
com.openfeint.internal.OpenFeintInternal .getRString ( v6 );
this.message = v6;
/* .line 198 */
int v6 = 1; // const/4 v6, 0x1
/* iput-boolean v6, v5, Lcom/openfeint/internal/resource/ServerException;->needsDeveloperAttention:Z */
/* .line 199 */
/* invoke-direct {p0, v5}, Lcom/openfeint/internal/request/BaseRequest;->fakeServerException(Lcom/openfeint/internal/resource/ServerException;)V */
/* .line 279 */
} // .end local v5 # "se":Lcom/openfeint/internal/resource/ServerException;
} // :cond_0
} // :goto_0
/* iget v6, p0, Lcom/openfeint/internal/request/BaseRequest;->mResponseCode:I */
v7 = this.mResponseBody;
(( com.openfeint.internal.request.BaseRequest ) p0 ).onResponseOffMainThread ( v6, v7 ); // invoke-virtual {p0, v6, v7}, Lcom/openfeint/internal/request/BaseRequest;->onResponseOffMainThread(I[B)V
/* .line 280 */
return;
/* .line 209 */
} // :cond_1
try { // :try_start_0
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v6 ).getClient ( ); // invoke-virtual {v6}, Lcom/openfeint/internal/OpenFeintInternal;->getClient()Lorg/apache/http/impl/client/AbstractHttpClient;
/* .line 210 */
/* .local v0, "client":Lorg/apache/http/impl/client/AbstractHttpClient; */
/* new-instance v1, Lorg/apache/http/protocol/BasicHttpContext; */
/* invoke-direct {v1}, Lorg/apache/http/protocol/BasicHttpContext;-><init>()V */
/* .line 211 */
/* .local v1, "context":Lorg/apache/http/protocol/HttpContext; */
/* new-instance v3, Lcom/openfeint/internal/request/BaseRequest$1; */
/* invoke-direct {v3, p0, v1}, Lcom/openfeint/internal/request/BaseRequest$1;-><init>(Lcom/openfeint/internal/request/BaseRequest;Lorg/apache/http/protocol/HttpContext;)V */
/* .line 251 */
/* .local v3, "handler":Lorg/apache/http/client/ResponseHandler;, "Lorg/apache/http/client/ResponseHandler<Ljava/lang/Object;>;" */
v6 = this.mRequest;
(( org.apache.http.impl.client.AbstractHttpClient ) v0 ).execute ( v6, v3, v1 ); // invoke-virtual {v0, v6, v3, v1}, Lorg/apache/http/impl/client/AbstractHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;Lorg/apache/http/protocol/HttpContext;)Ljava/lang/Object;
/* .line 253 */
int v6 = 0; // const/4 v6, 0x0
this.mRequest = v6;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 200 */
} // .end local v0 # "client":Lorg/apache/http/impl/client/AbstractHttpClient;
} // .end local v1 # "context":Lorg/apache/http/protocol/HttpContext;
} // .end local v3 # "handler":Lorg/apache/http/client/ResponseHandler;, "Lorg/apache/http/client/ResponseHandler<Ljava/lang/Object;>;"
} // :cond_2
v6 = this.mResponseBody;
/* if-nez v6, :cond_0 */
/* .line 204 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 205 */
int v6 = 0; // const/4 v6, 0x0
try { // :try_start_1
/* iput v6, p0, Lcom/openfeint/internal/request/BaseRequest;->mRetriesLeft:I */
/* .line 206 */
/* new-instance v6, Ljava/lang/Exception; */
final String v7 = "Forced failure"; // const-string v7, "Forced failure"
/* invoke-direct {v6, v7}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V */
/* throw v6 */
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 255 */
/* :catch_0 */
/* move-exception v2 */
/* .line 256 */
/* .local v2, "e":Ljava/lang/Exception; */
v6 = com.openfeint.internal.request.BaseRequest.TAG;
/* new-instance v7, Ljava/lang/StringBuilder; */
/* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
final String v8 = "Error executing request \'"; // const-string v8, "Error executing request \'"
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.openfeint.internal.request.BaseRequest ) p0 ).path ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/BaseRequest;->path()Ljava/lang/String;
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v8 = "\'."; // const-string v8, "\'."
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v6,v7 );
/* .line 257 */
v6 = java.lang.System.err;
(( java.lang.Exception ) v2 ).printStackTrace ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/Exception;->printStackTrace(Ljava/io/PrintStream;)V
/* .line 260 */
this.mResponseBody = v9;
/* .line 261 */
/* iput v10, p0, Lcom/openfeint/internal/request/BaseRequest;->mResponseCode:I */
/* .line 262 */
this.response_ = v9;
/* .line 264 */
/* iget v6, p0, Lcom/openfeint/internal/request/BaseRequest;->mRetriesLeft:I */
/* add-int/lit8 v6, v6, -0x1 */
/* iput v6, p0, Lcom/openfeint/internal/request/BaseRequest;->mRetriesLeft:I */
/* if-gez v6, :cond_2 */
/* .line 266 */
/* new-instance v5, Lcom/openfeint/internal/resource/ServerException; */
/* invoke-direct {v5}, Lcom/openfeint/internal/resource/ServerException;-><init>()V */
/* .line 267 */
/* .restart local v5 # "se":Lcom/openfeint/internal/resource/ServerException; */
(( java.lang.Object ) v2 ).getClass ( ); // invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v6 ).getName ( ); // invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;
this.exceptionClass = v6;
/* .line 268 */
(( java.lang.Exception ) v2 ).getMessage ( ); // invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
this.message = v6;
/* .line 269 */
v6 = this.message;
/* if-nez v6, :cond_3 */
/* .line 270 */
com.openfeint.internal.OpenFeintInternal .getRString ( v6 );
this.message = v6;
/* .line 272 */
} // :cond_3
/* invoke-direct {p0, v5}, Lcom/openfeint/internal/request/BaseRequest;->fakeServerException(Lcom/openfeint/internal/resource/ServerException;)V */
/* goto/16 :goto_0 */
} // .end method
protected org.apache.http.HttpEntity genEntity ( ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/UnsupportedEncodingException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 129 */
final String v0 = "UTF-8"; // const-string v0, "UTF-8"
/* .line 130 */
/* .local v0, "encoding":Ljava/lang/String; */
/* new-instance v1, Lorg/apache/http/client/entity/UrlEncodedFormEntity; */
v2 = this.mArgs;
(( com.openfeint.internal.request.OrderedArgList ) v2 ).getArgs ( ); // invoke-virtual {v2}, Lcom/openfeint/internal/request/OrderedArgList;->getArgs()Ljava/util/List;
/* invoke-direct {v1, v2, v0}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V */
/* .line 131 */
/* .local v1, "entity":Lorg/apache/http/client/entity/UrlEncodedFormEntity; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "application/x-www-form-urlencoded; charset="; // const-string v3, "application/x-www-form-urlencoded; charset="
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( org.apache.http.client.entity.UrlEncodedFormEntity ) v1 ).setContentType ( v2 ); // invoke-virtual {v1, v2}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;->setContentType(Ljava/lang/String;)V
/* .line 132 */
} // .end method
protected org.apache.http.client.methods.HttpUriRequest generateRequest ( ) {
/* .locals 9 */
/* .prologue */
/* .line 136 */
int v4 = 0; // const/4 v4, 0x0
/* .line 137 */
/* .local v4, "retval":Lorg/apache/http/client/methods/HttpUriRequest; */
(( com.openfeint.internal.request.BaseRequest ) p0 ).method ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/BaseRequest;->method()Ljava/lang/String;
/* .line 139 */
/* .local v2, "meth":Ljava/lang/String; */
final String v6 = "GET"; // const-string v6, "GET"
v6 = (( java.lang.String ) v2 ).equals ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v6, :cond_0 */
final String v6 = "DELETE"; // const-string v6, "DELETE"
v6 = (( java.lang.String ) v2 ).equals ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_5
/* .line 140 */
} // :cond_0
(( com.openfeint.internal.request.BaseRequest ) p0 ).url ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/BaseRequest;->url()Ljava/lang/String;
/* .line 141 */
/* .local v5, "url":Ljava/lang/String; */
v6 = this.mArgs;
(( com.openfeint.internal.request.OrderedArgList ) v6 ).getArgString ( ); // invoke-virtual {v6}, Lcom/openfeint/internal/request/OrderedArgList;->getArgString()Ljava/lang/String;
/* .line 142 */
/* .local v0, "argString":Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 143 */
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v6 ).append ( v5 ); // invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = "?"; // const-string v7, "?"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 145 */
} // :cond_1
final String v6 = "GET"; // const-string v6, "GET"
v6 = (( java.lang.String ) v2 ).equals ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_4
/* new-instance v4, Lorg/apache/http/client/methods/HttpGet; */
} // .end local v4 # "retval":Lorg/apache/http/client/methods/HttpUriRequest;
/* invoke-direct {v4, v5}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V */
/* .line 164 */
} // .end local v0 # "argString":Ljava/lang/String;
} // .end local v5 # "url":Ljava/lang/String;
/* .restart local v4 # "retval":Lorg/apache/http/client/methods/HttpUriRequest; */
} // :cond_2
} // :goto_0
v6 = (( com.openfeint.internal.request.BaseRequest ) p0 ).signed ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/BaseRequest;->signed()Z
if ( v6 != null) { // if-eqz v6, :cond_3
v6 = this.mSignature;
if ( v6 != null) { // if-eqz v6, :cond_3
v6 = this.mKey;
if ( v6 != null) { // if-eqz v6, :cond_3
/* .line 165 */
final String v6 = "X-OF-Signature"; // const-string v6, "X-OF-Signature"
v7 = this.mSignature;
/* .line 166 */
final String v6 = "X-OF-Key"; // const-string v6, "X-OF-Key"
v7 = this.mKey;
/* .line 169 */
} // :cond_3
(( com.openfeint.internal.request.BaseRequest ) p0 ).addParams ( v4 ); // invoke-virtual {p0, v4}, Lcom/openfeint/internal/request/BaseRequest;->addParams(Lorg/apache/http/client/methods/HttpUriRequest;)V
/* .line 171 */
/* .line 146 */
/* .restart local v0 # "argString":Ljava/lang/String; */
/* .restart local v5 # "url":Ljava/lang/String; */
} // :cond_4
final String v6 = "DELETE"; // const-string v6, "DELETE"
v6 = (( java.lang.String ) v2 ).equals ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_2
/* new-instance v4, Lorg/apache/http/client/methods/HttpDelete; */
} // .end local v4 # "retval":Lorg/apache/http/client/methods/HttpUriRequest;
/* invoke-direct {v4, v5}, Lorg/apache/http/client/methods/HttpDelete;-><init>(Ljava/lang/String;)V */
/* .restart local v4 # "retval":Lorg/apache/http/client/methods/HttpUriRequest; */
/* .line 148 */
} // .end local v0 # "argString":Ljava/lang/String;
} // .end local v5 # "url":Ljava/lang/String;
} // :cond_5
int v3 = 0; // const/4 v3, 0x0
/* .line 150 */
/* .local v3, "postReq":Lorg/apache/http/client/methods/HttpEntityEnclosingRequestBase; */
final String v6 = "POST"; // const-string v6, "POST"
v6 = (( java.lang.String ) v2 ).equals ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_6
/* new-instance v3, Lorg/apache/http/client/methods/HttpPost; */
} // .end local v3 # "postReq":Lorg/apache/http/client/methods/HttpEntityEnclosingRequestBase;
(( com.openfeint.internal.request.BaseRequest ) p0 ).url ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/BaseRequest;->url()Ljava/lang/String;
/* invoke-direct {v3, v6}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V */
/* .line 155 */
/* .restart local v3 # "postReq":Lorg/apache/http/client/methods/HttpEntityEnclosingRequestBase; */
} // :goto_1
try { // :try_start_0
(( com.openfeint.internal.request.BaseRequest ) p0 ).genEntity ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/BaseRequest;->genEntity()Lorg/apache/http/HttpEntity;
(( org.apache.http.client.methods.HttpEntityEnclosingRequestBase ) v3 ).setEntity ( v6 ); // invoke-virtual {v3, v6}, Lorg/apache/http/client/methods/HttpEntityEnclosingRequestBase;->setEntity(Lorg/apache/http/HttpEntity;)V
/* :try_end_0 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 161 */
} // :goto_2
/* move-object v4, v3 */
/* .line 151 */
} // :cond_6
final String v6 = "PUT"; // const-string v6, "PUT"
v6 = (( java.lang.String ) v2 ).equals ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_7
/* new-instance v3, Lorg/apache/http/client/methods/HttpPut; */
} // .end local v3 # "postReq":Lorg/apache/http/client/methods/HttpEntityEnclosingRequestBase;
(( com.openfeint.internal.request.BaseRequest ) p0 ).url ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/BaseRequest;->url()Ljava/lang/String;
/* invoke-direct {v3, v6}, Lorg/apache/http/client/methods/HttpPut;-><init>(Ljava/lang/String;)V */
/* .restart local v3 # "postReq":Lorg/apache/http/client/methods/HttpEntityEnclosingRequestBase; */
/* .line 152 */
} // :cond_7
/* new-instance v6, Ljava/lang/RuntimeException; */
/* new-instance v7, Ljava/lang/StringBuilder; */
/* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
final String v8 = "Unsupported HTTP method: "; // const-string v8, "Unsupported HTTP method: "
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).append ( v2 ); // invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v6, v7}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v6 */
/* .line 156 */
/* :catch_0 */
/* move-exception v1 */
/* .line 157 */
/* .local v1, "e":Ljava/io/UnsupportedEncodingException; */
v6 = com.openfeint.internal.request.BaseRequest.TAG;
final String v7 = "Unable to encode request."; // const-string v7, "Unable to encode request."
com.openfeint.internal.OpenFeintInternal .log ( v6,v7 );
/* .line 158 */
v6 = java.lang.System.err;
(( java.io.UnsupportedEncodingException ) v1 ).printStackTrace ( v6 ); // invoke-virtual {v1, v6}, Ljava/io/UnsupportedEncodingException;->printStackTrace(Ljava/io/PrintStream;)V
} // .end method
public java.util.concurrent.Future getFuture ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/concurrent/Future", */
/* "<*>;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 68 */
v0 = this.mFuture;
} // .end method
protected org.apache.http.params.HttpParams getHttpParams ( ) {
/* .locals 1 */
/* .prologue */
/* .line 72 */
v0 = this.mHttpParams;
/* if-nez v0, :cond_0 */
/* .line 73 */
/* new-instance v0, Lorg/apache/http/params/BasicHttpParams; */
/* invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V */
this.mHttpParams = v0;
/* .line 75 */
} // :cond_0
v0 = this.mHttpParams;
} // .end method
public org.apache.http.HttpResponse getResponse ( ) {
/* .locals 1 */
/* .prologue */
/* .line 291 */
v0 = this.response_;
} // .end method
protected java.lang.String getResponseEncoding ( ) {
/* .locals 1 */
/* .prologue */
/* .line 44 */
v0 = this.mResponseEncoding;
} // .end method
protected java.lang.String getResponseType ( ) {
/* .locals 1 */
/* .prologue */
/* .line 45 */
v0 = this.mResponseType;
} // .end method
public void launch ( ) {
/* .locals 0 */
/* .prologue */
/* .line 314 */
com.openfeint.internal.OpenFeintInternal .makeRequest ( p0 );
/* .line 315 */
return;
} // .end method
public abstract java.lang.String method ( ) {
} // .end method
public Boolean needsDeviceSession ( ) {
/* .locals 1 */
/* .prologue */
/* .line 93 */
v0 = (( com.openfeint.internal.request.BaseRequest ) p0 ).signed ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/BaseRequest;->signed()Z
} // .end method
public Integer numRetries ( ) {
/* .locals 1 */
/* .prologue */
/* .line 53 */
} // .end method
public final void onResponse ( ) {
/* .locals 3 */
/* .prologue */
/* .line 298 */
/* iget-boolean v1, p0, Lcom/openfeint/internal/request/BaseRequest;->mResponded:Z */
/* if-nez v1, :cond_1 */
/* .line 299 */
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, p0, Lcom/openfeint/internal/request/BaseRequest;->mResponded:Z */
/* .line 300 */
v1 = this.mResponseBody;
/* if-nez v1, :cond_0 */
/* .line 302 */
int v1 = 0; // const/4 v1, 0x0
/* iput v1, p0, Lcom/openfeint/internal/request/BaseRequest;->mResponseCode:I */
/* .line 303 */
/* new-instance v0, Lcom/openfeint/internal/resource/ServerException; */
/* invoke-direct {v0}, Lcom/openfeint/internal/resource/ServerException;-><init>()V */
/* .line 304 */
/* .local v0, "se":Lcom/openfeint/internal/resource/ServerException; */
final String v1 = "Unknown"; // const-string v1, "Unknown"
this.exceptionClass = v1;
/* .line 305 */
com.openfeint.internal.OpenFeintInternal .getRString ( v1 );
this.message = v1;
/* .line 306 */
/* invoke-direct {p0, v0}, Lcom/openfeint/internal/request/BaseRequest;->fakeServerException(Lcom/openfeint/internal/resource/ServerException;)V */
/* .line 308 */
} // .end local v0 # "se":Lcom/openfeint/internal/resource/ServerException;
} // :cond_0
/* iget v1, p0, Lcom/openfeint/internal/request/BaseRequest;->mResponseCode:I */
v2 = this.mResponseBody;
(( com.openfeint.internal.request.BaseRequest ) p0 ).onResponse ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lcom/openfeint/internal/request/BaseRequest;->onResponse(I[B)V
/* .line 309 */
int v1 = 0; // const/4 v1, 0x0
this.response_ = v1;
/* .line 311 */
} // :cond_1
return;
} // .end method
public abstract void onResponse ( Integer p0, Object[] p1 ) {
} // .end method
protected void onResponseOffMainThread ( Integer p0, Object[] p1 ) {
/* .locals 0 */
/* .param p1, "responseCode" # I */
/* .param p2, "body" # [B */
/* .prologue */
/* .line 294 */
return;
} // .end method
public abstract java.lang.String path ( ) {
} // .end method
public void postTimeoutCleanup ( ) {
/* .locals 4 */
/* .prologue */
/* .line 318 */
v0 = this.mRequest;
/* .line 319 */
/* .local v0, "req":Lorg/apache/http/client/methods/HttpUriRequest; */
int v2 = 0; // const/4 v2, 0x0
this.mRequest = v2;
/* .line 321 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 324 */
/* new-instance v2, Ljava/lang/Thread; */
/* new-instance v3, Lcom/openfeint/internal/request/BaseRequest$2; */
/* invoke-direct {v3, p0, v0}, Lcom/openfeint/internal/request/BaseRequest$2;-><init>(Lcom/openfeint/internal/request/BaseRequest;Lorg/apache/http/client/methods/HttpUriRequest;)V */
/* invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
(( java.lang.Thread ) v2 ).start ( ); // invoke-virtual {v2}, Ljava/lang/Thread;->start()V
/* .line 335 */
} // :cond_0
/* new-instance v1, Lcom/openfeint/internal/resource/ServerException; */
/* invoke-direct {v1}, Lcom/openfeint/internal/resource/ServerException;-><init>()V */
/* .line 336 */
/* .local v1, "se":Lcom/openfeint/internal/resource/ServerException; */
final String v2 = "Timeout"; // const-string v2, "Timeout"
this.exceptionClass = v2;
/* .line 337 */
com.openfeint.internal.OpenFeintInternal .getRString ( v2 );
this.message = v2;
/* .line 338 */
/* invoke-direct {p0, v1}, Lcom/openfeint/internal/request/BaseRequest;->fakeServerException(Lcom/openfeint/internal/resource/ServerException;)V */
/* .line 339 */
return;
} // .end method
public final void setArgs ( com.openfeint.internal.request.OrderedArgList p0 ) {
/* .locals 0 */
/* .param p1, "args" # Lcom/openfeint/internal/request/OrderedArgList; */
/* .prologue */
/* .line 125 */
this.mArgs = p1;
/* .line 126 */
return;
} // .end method
public void setFuture ( java.util.concurrent.Future p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/concurrent/Future", */
/* "<*>;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 64 */
/* .local p1, "future":Ljava/util/concurrent/Future;, "Ljava/util/concurrent/Future<*>;" */
this.mFuture = p1;
/* .line 65 */
return;
} // .end method
protected Boolean shouldRedirect ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 174 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public final void sign ( com.openfeint.internal.request.Signer p0 ) {
/* .locals 6 */
/* .param p1, "authority" # Lcom/openfeint/internal/request/Signer; */
/* .prologue */
/* .line 116 */
v0 = this.mArgs;
/* if-nez v0, :cond_0 */
/* new-instance v0, Lcom/openfeint/internal/request/OrderedArgList; */
/* invoke-direct {v0}, Lcom/openfeint/internal/request/OrderedArgList;-><init>()V */
this.mArgs = v0;
/* .line 117 */
} // :cond_0
v0 = (( com.openfeint.internal.request.BaseRequest ) p0 ).signed ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/BaseRequest;->signed()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 118 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* const-wide/16 v2, 0x3e8 */
/* div-long/2addr v0, v2 */
/* iput-wide v0, p0, Lcom/openfeint/internal/request/BaseRequest;->mSecondsSinceEpoch:J */
/* .line 119 */
(( com.openfeint.internal.request.BaseRequest ) p0 ).path ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/BaseRequest;->path()Ljava/lang/String;
(( com.openfeint.internal.request.BaseRequest ) p0 ).method ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/BaseRequest;->method()Ljava/lang/String;
/* iget-wide v3, p0, Lcom/openfeint/internal/request/BaseRequest;->mSecondsSinceEpoch:J */
v5 = this.mArgs;
/* move-object v0, p1 */
/* invoke-virtual/range {v0 ..v5}, Lcom/openfeint/internal/request/Signer;->sign(Ljava/lang/String;Ljava/lang/String;JLcom/openfeint/internal/request/OrderedArgList;)Ljava/lang/String; */
this.mSignature = v0;
/* .line 120 */
(( com.openfeint.internal.request.Signer ) p1 ).getKey ( ); // invoke-virtual {p1}, Lcom/openfeint/internal/request/Signer;->getKey()Ljava/lang/String;
this.mKey = v0;
/* .line 122 */
} // :cond_1
return;
} // .end method
public Boolean signed ( ) {
/* .locals 1 */
/* .prologue */
/* .line 87 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Long timeout ( ) {
/* .locals 2 */
/* .prologue */
/* .line 54 */
/* sget-wide v0, Lcom/openfeint/internal/request/BaseRequest;->DEFAULT_TIMEOUT:J */
/* return-wide v0 */
} // .end method
public java.lang.String url ( ) {
/* .locals 2 */
/* .prologue */
/* .line 109 */
v0 = com.openfeint.internal.request.BaseRequest.sBaseServerURL;
/* if-nez v0, :cond_0 */
/* .line 110 */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v0 ).getServerUrl ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/OpenFeintInternal;->getServerUrl()Ljava/lang/String;
/* .line 112 */
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = com.openfeint.internal.request.BaseRequest.sBaseServerURL;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.openfeint.internal.request.BaseRequest ) p0 ).path ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/request/BaseRequest;->path()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public Boolean wantsLogin ( ) {
/* .locals 1 */
/* .prologue */
/* .line 83 */
int v0 = 0; // const/4 v0, 0x0
} // .end method

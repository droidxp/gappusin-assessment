public class com.loopj.android.http.AsyncHttpClient {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/loopj/android/http/AsyncHttpClient$InflatingEntity; */
	 /* } */
} // .end annotation
/* # static fields */
public static final Integer DEFAULT_MAX_CONNECTIONS;
public static final Integer DEFAULT_SOCKET_TIMEOUT;
private static final java.lang.String ENCODING;
private static final java.lang.String ENCODING_GZIP;
private static final java.lang.String HEADER_ACCEPT_ENCODING;
private static Integer maxConnections;
private static Integer socketTimeout;
/* # instance fields */
private org.apache.http.impl.client.DefaultHttpClient httpClient;
private org.apache.http.protocol.HttpContext httpContext;
private java.util.concurrent.ExecutorService threadPool;
/* # direct methods */
static com.loopj.android.http.AsyncHttpClient ( ) {
	 /* .locals 1 */
	 /* const/16 v0, 0xa */
	 /* const/16 v0, 0x7530 */
	 return;
} // .end method
public com.loopj.android.http.AsyncHttpClient ( ) {
	 /* .locals 6 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* new-instance v0, Lorg/apache/http/params/BasicHttpParams; */
	 /* invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V */
	 /* int-to-long v1, v1 */
	 org.apache.http.conn.params.ConnManagerParams .setTimeout ( v0,v1,v2 );
	 /* new-instance v1, Lorg/apache/http/conn/params/ConnPerRouteBean; */
	 /* invoke-direct {v1, v2}, Lorg/apache/http/conn/params/ConnPerRouteBean;-><init>(I)V */
	 org.apache.http.conn.params.ConnManagerParams .setMaxConnectionsPerRoute ( v0,v1 );
	 /* const/16 v1, 0xa */
	 org.apache.http.conn.params.ConnManagerParams .setMaxTotalConnections ( v0,v1 );
	 org.apache.http.params.HttpConnectionParams .setSoTimeout ( v0,v1 );
	 int v1 = 1; // const/4 v1, 0x1
	 org.apache.http.params.HttpConnectionParams .setTcpNoDelay ( v0,v1 );
	 v1 = org.apache.http.HttpVersion.HTTP_1_1;
	 org.apache.http.params.HttpProtocolParams .setVersion ( v0,v1 );
	 org.apache.http.params.HttpProtocolParams .setUserAgent ( v0,p1 );
	 /* new-instance v1, Lorg/apache/http/conn/scheme/SchemeRegistry; */
	 /* invoke-direct {v1}, Lorg/apache/http/conn/scheme/SchemeRegistry;-><init>()V */
	 /* new-instance v2, Lorg/apache/http/conn/scheme/Scheme; */
	 final String v3 = "http"; // const-string v3, "http"
	 org.apache.http.conn.scheme.PlainSocketFactory .getSocketFactory ( );
	 /* const/16 v5, 0x50 */
	 /* invoke-direct {v2, v3, v4, v5}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V */
	 (( org.apache.http.conn.scheme.SchemeRegistry ) v1 ).register ( v2 ); // invoke-virtual {v1, v2}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
	 /* new-instance v2, Lorg/apache/http/conn/scheme/Scheme; */
	 final String v3 = "https"; // const-string v3, "https"
	 org.apache.http.conn.ssl.SSLSocketFactory .getSocketFactory ( );
	 /* const/16 v5, 0x1bb */
	 /* invoke-direct {v2, v3, v4, v5}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V */
	 (( org.apache.http.conn.scheme.SchemeRegistry ) v1 ).register ( v2 ); // invoke-virtual {v1, v2}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
	 /* new-instance v2, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager; */
	 /* invoke-direct {v2, v0, v1}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V */
	 java.util.concurrent.Executors .newCachedThreadPool ( );
	 this.threadPool = v1;
	 /* new-instance v1, Lorg/apache/http/protocol/SyncBasicHttpContext; */
	 /* new-instance v3, Lorg/apache/http/protocol/BasicHttpContext; */
	 /* invoke-direct {v3}, Lorg/apache/http/protocol/BasicHttpContext;-><init>()V */
	 /* invoke-direct {v1, v3}, Lorg/apache/http/protocol/SyncBasicHttpContext;-><init>(Lorg/apache/http/protocol/HttpContext;)V */
	 this.httpContext = v1;
	 /* new-instance v1, Lorg/apache/http/impl/client/DefaultHttpClient; */
	 /* invoke-direct {v1, v2, v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V */
	 this.httpClient = v1;
	 v0 = this.httpClient;
	 /* new-instance v1, Lcom/loopj/android/http/AsyncHttpClient$1; */
	 /* invoke-direct {v1, p0}, Lcom/loopj/android/http/AsyncHttpClient$1;-><init>(Lcom/loopj/android/http/AsyncHttpClient;)V */
	 (( org.apache.http.impl.client.DefaultHttpClient ) v0 ).addRequestInterceptor ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->addRequestInterceptor(Lorg/apache/http/HttpRequestInterceptor;)V
	 v0 = this.httpClient;
	 /* new-instance v1, Lcom/loopj/android/http/AsyncHttpClient$2; */
	 /* invoke-direct {v1, p0}, Lcom/loopj/android/http/AsyncHttpClient$2;-><init>(Lcom/loopj/android/http/AsyncHttpClient;)V */
	 (( org.apache.http.impl.client.DefaultHttpClient ) v0 ).addResponseInterceptor ( v1 ); // invoke-virtual {v0, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->addResponseInterceptor(Lorg/apache/http/HttpResponseInterceptor;)V
	 return;
} // .end method
/* # virtual methods */
protected void addHeaders ( org.apache.http.client.methods.HttpRequestBase p0, java.util.HashMap p1 ) {
	 /* .locals 3 */
	 if ( p2 != null) { // if-eqz p2, :cond_0
		 (( java.util.HashMap ) p2 ).entrySet ( ); // invoke-virtual {p2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
		 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = 		 } // :goto_0
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* check-cast v0, Ljava/util/Map$Entry; */
			 /* check-cast v1, Ljava/lang/String; */
			 /* check-cast v0, Ljava/lang/String; */
			 (( org.apache.http.client.methods.HttpRequestBase ) p1 ).addHeader ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Lorg/apache/http/client/methods/HttpRequestBase;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
		 } // :cond_0
		 return;
	 } // .end method
	 public void delete ( java.lang.String p0, java.util.HashMap p1, com.loopj.android.http.AsyncHttpResponseHandler p2 ) {
		 /* .locals 5 */
		 /* new-instance v0, Lorg/apache/http/client/methods/HttpDelete; */
		 /* invoke-direct {v0, p1}, Lorg/apache/http/client/methods/HttpDelete;-><init>(Ljava/lang/String;)V */
		 (( com.loopj.android.http.AsyncHttpClient ) p0 ).addHeaders ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Lcom/loopj/android/http/AsyncHttpClient;->addHeaders(Lorg/apache/http/client/methods/HttpRequestBase;Ljava/util/HashMap;)V
		 v1 = this.threadPool;
		 /* new-instance v2, Lcom/loopj/android/http/AsyncHttpRequest; */
		 v3 = this.httpClient;
		 v4 = this.httpContext;
		 /* invoke-direct {v2, v3, v4, v0, p3}, Lcom/loopj/android/http/AsyncHttpRequest;-><init>(Lorg/apache/http/client/HttpClient;Lorg/apache/http/protocol/HttpContext;Lorg/apache/http/client/methods/HttpUriRequest;Lcom/loopj/android/http/AsyncHttpResponseHandler;)V */
		 return;
	 } // .end method
	 public void get ( java.lang.String p0, com.loopj.android.http.AsyncHttpResponseHandler p1 ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 (( com.loopj.android.http.AsyncHttpClient ) p0 ).get ( p1, v0, p2 ); // invoke-virtual {p0, p1, v0, p2}, Lcom/loopj/android/http/AsyncHttpClient;->get(Ljava/lang/String;Ljava/util/HashMap;Lcom/loopj/android/http/AsyncHttpResponseHandler;)V
		 return;
	 } // .end method
	 public void get ( java.lang.String p0, java.util.HashMap p1, com.loopj.android.http.AsyncHttpResponseHandler p2 ) {
		 /* .locals 5 */
		 /* new-instance v0, Lorg/apache/http/client/methods/HttpGet; */
		 /* invoke-direct {v0, p1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V */
		 (( com.loopj.android.http.AsyncHttpClient ) p0 ).addHeaders ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Lcom/loopj/android/http/AsyncHttpClient;->addHeaders(Lorg/apache/http/client/methods/HttpRequestBase;Ljava/util/HashMap;)V
		 v1 = this.threadPool;
		 /* new-instance v2, Lcom/loopj/android/http/AsyncHttpRequest; */
		 v3 = this.httpClient;
		 v4 = this.httpContext;
		 /* invoke-direct {v2, v3, v4, v0, p3}, Lcom/loopj/android/http/AsyncHttpRequest;-><init>(Lorg/apache/http/client/HttpClient;Lorg/apache/http/protocol/HttpContext;Lorg/apache/http/client/methods/HttpUriRequest;Lcom/loopj/android/http/AsyncHttpResponseHandler;)V */
		 return;
	 } // .end method
	 public void head ( java.lang.String p0, java.util.HashMap p1, com.loopj.android.http.AsyncHttpResponseHandler p2 ) {
		 /* .locals 5 */
		 /* new-instance v0, Lorg/apache/http/client/methods/HttpHead; */
		 /* invoke-direct {v0, p1}, Lorg/apache/http/client/methods/HttpHead;-><init>(Ljava/lang/String;)V */
		 (( com.loopj.android.http.AsyncHttpClient ) p0 ).addHeaders ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Lcom/loopj/android/http/AsyncHttpClient;->addHeaders(Lorg/apache/http/client/methods/HttpRequestBase;Ljava/util/HashMap;)V
		 v1 = this.threadPool;
		 /* new-instance v2, Lcom/loopj/android/http/AsyncHttpRequest; */
		 v3 = this.httpClient;
		 v4 = this.httpContext;
		 /* invoke-direct {v2, v3, v4, v0, p3}, Lcom/loopj/android/http/AsyncHttpRequest;-><init>(Lorg/apache/http/client/HttpClient;Lorg/apache/http/protocol/HttpContext;Lorg/apache/http/client/methods/HttpUriRequest;Lcom/loopj/android/http/AsyncHttpResponseHandler;)V */
		 return;
	 } // .end method
	 public void post ( java.lang.String p0, com.loopj.android.http.AsyncHttpResponseHandler p1 ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 (( com.loopj.android.http.AsyncHttpClient ) p0 ).post ( p1, v0, v0, p2 ); // invoke-virtual {p0, p1, v0, v0, p2}, Lcom/loopj/android/http/AsyncHttpClient;->post(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;Lcom/loopj/android/http/AsyncHttpResponseHandler;)V
		 return;
	 } // .end method
	 public void post ( java.lang.String p0, java.util.HashMap p1, java.lang.String p2, com.loopj.android.http.AsyncHttpResponseHandler p3 ) {
		 /* .locals 5 */
		 /* new-instance v1, Lorg/apache/http/client/methods/HttpPost; */
		 /* invoke-direct {v1, p1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V */
		 if ( p3 != null) { // if-eqz p3, :cond_0
			 try { // :try_start_0
				 /* new-instance v0, Lorg/apache/http/entity/StringEntity; */
				 /* invoke-direct {v0, p3}, Lorg/apache/http/entity/StringEntity;-><init>(Ljava/lang/String;)V */
				 (( org.apache.http.client.methods.HttpPost ) v1 ).setEntity ( v0 ); // invoke-virtual {v1, v0}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
				 /* :try_end_0 */
				 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 } // :cond_0
		 } // :goto_0
		 (( com.loopj.android.http.AsyncHttpClient ) p0 ).addHeaders ( v1, p2 ); // invoke-virtual {p0, v1, p2}, Lcom/loopj/android/http/AsyncHttpClient;->addHeaders(Lorg/apache/http/client/methods/HttpRequestBase;Ljava/util/HashMap;)V
		 if ( p2 != null) { // if-eqz p2, :cond_1
			 final String v0 = "Content-Type"; // const-string v0, "Content-Type"
			 (( java.util.HashMap ) p2 ).get ( v0 ); // invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
			 /* if-nez v0, :cond_2 */
		 } // :cond_1
		 final String v0 = "Content-Type"; // const-string v0, "Content-Type"
		 final String v2 = "application/x-www-form-urlencoded"; // const-string v2, "application/x-www-form-urlencoded"
		 (( org.apache.http.client.methods.HttpPost ) v1 ).addHeader ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
	 } // :cond_2
	 v0 = this.threadPool;
	 /* new-instance v2, Lcom/loopj/android/http/AsyncHttpRequest; */
	 v3 = this.httpClient;
	 v4 = this.httpContext;
	 /* invoke-direct {v2, v3, v4, v1, p4}, Lcom/loopj/android/http/AsyncHttpRequest;-><init>(Lorg/apache/http/client/HttpClient;Lorg/apache/http/protocol/HttpContext;Lorg/apache/http/client/methods/HttpUriRequest;Lcom/loopj/android/http/AsyncHttpResponseHandler;)V */
	 return;
	 /* :catch_0 */
	 /* move-exception v0 */
	 final String v2 = "Corona"; // const-string v2, "Corona"
	 /* new-instance v3, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v4 = "ERROR: Could not set body for POST request: "; // const-string v4, "ERROR: Could not set body for POST request: "
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.io.IOException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
	 (( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .v ( v2,v0 );
} // .end method
public void put ( java.lang.String p0, java.util.HashMap p1, java.lang.String p2, com.loopj.android.http.AsyncHttpResponseHandler p3 ) {
	 /* .locals 5 */
	 /* new-instance v1, Lorg/apache/http/client/methods/HttpPut; */
	 /* invoke-direct {v1, p1}, Lorg/apache/http/client/methods/HttpPut;-><init>(Ljava/lang/String;)V */
	 if ( p3 != null) { // if-eqz p3, :cond_0
		 try { // :try_start_0
			 /* new-instance v0, Lorg/apache/http/entity/StringEntity; */
			 /* invoke-direct {v0, p3}, Lorg/apache/http/entity/StringEntity;-><init>(Ljava/lang/String;)V */
			 (( org.apache.http.client.methods.HttpPut ) v1 ).setEntity ( v0 ); // invoke-virtual {v1, v0}, Lorg/apache/http/client/methods/HttpPut;->setEntity(Lorg/apache/http/HttpEntity;)V
			 /* :try_end_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :cond_0
	 } // :goto_0
	 (( com.loopj.android.http.AsyncHttpClient ) p0 ).addHeaders ( v1, p2 ); // invoke-virtual {p0, v1, p2}, Lcom/loopj/android/http/AsyncHttpClient;->addHeaders(Lorg/apache/http/client/methods/HttpRequestBase;Ljava/util/HashMap;)V
	 v0 = this.threadPool;
	 /* new-instance v2, Lcom/loopj/android/http/AsyncHttpRequest; */
	 v3 = this.httpClient;
	 v4 = this.httpContext;
	 /* invoke-direct {v2, v3, v4, v1, p4}, Lcom/loopj/android/http/AsyncHttpRequest;-><init>(Lorg/apache/http/client/HttpClient;Lorg/apache/http/protocol/HttpContext;Lorg/apache/http/client/methods/HttpUriRequest;Lcom/loopj/android/http/AsyncHttpResponseHandler;)V */
	 return;
	 /* :catch_0 */
	 /* move-exception v0 */
	 final String v2 = "Corona"; // const-string v2, "Corona"
	 /* new-instance v3, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v4 = "ERROR: Could not set body for PUT request: "; // const-string v4, "ERROR: Could not set body for PUT request: "
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.io.IOException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
	 (( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .v ( v2,v0 );
} // .end method
public void setCookieStore ( org.apache.http.client.CookieStore p0 ) {
	 /* .locals 2 */
	 v0 = this.httpContext;
	 final String v1 = "http.cookie-store"; // const-string v1, "http.cookie-store"
	 return;
} // .end method

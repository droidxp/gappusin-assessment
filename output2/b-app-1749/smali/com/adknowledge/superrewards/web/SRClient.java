public class com.adknowledge.superrewards.web.SRClient {
	 /* .source "SRClient.java" */
	 /* # static fields */
	 private static com.adknowledge.superrewards.web.SRClient instance;
	 public static java.lang.String uid;
	 /* # instance fields */
	 protected org.apache.http.impl.client.DefaultHttpClient httpClient;
	 org.apache.http.client.HttpRequestRetryHandler myRetryHandler;
	 /* # direct methods */
	 private com.adknowledge.superrewards.web.SRClient ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 37 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 83 */
		 /* new-instance v0, Lcom/adknowledge/superrewards/web/SRClient$1; */
		 /* invoke-direct {v0, p0}, Lcom/adknowledge/superrewards/web/SRClient$1;-><init>(Lcom/adknowledge/superrewards/web/SRClient;)V */
		 this.myRetryHandler = v0;
		 /* .line 38 */
		 (( com.adknowledge.superrewards.web.SRClient ) p0 ).getClient ( ); // invoke-virtual {p0}, Lcom/adknowledge/superrewards/web/SRClient;->getClient()Lorg/apache/http/impl/client/DefaultHttpClient;
		 this.httpClient = v0;
		 /* .line 39 */
		 return;
	 } // .end method
	 public static com.adknowledge.superrewards.web.SRClient getInstance ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 46 */
		 v0 = com.adknowledge.superrewards.web.SRClient.instance;
		 /* if-nez v0, :cond_0 */
		 /* .line 47 */
		 /* new-instance v0, Lcom/adknowledge/superrewards/web/SRClient; */
		 /* invoke-direct {v0}, Lcom/adknowledge/superrewards/web/SRClient;-><init>()V */
		 /* .line 49 */
	 } // :cond_0
	 v0 = com.adknowledge.superrewards.web.SRClient.instance;
} // .end method
/* # virtual methods */
public com.adknowledge.superrewards.web.SRRequest createRequest ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 57 */
	 /* new-instance v0, Lcom/adknowledge/superrewards/web/SRRequest; */
	 v1 = this.httpClient;
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/web/SRRequest;-><init>(Lorg/apache/http/impl/client/DefaultHttpClient;)V */
	 /* .line 58 */
	 /* .local v0, "request":Lcom/adknowledge/superrewards/web/SRRequest; */
} // .end method
public org.apache.http.impl.client.DefaultHttpClient getClient ( ) {
	 /* .locals 9 */
	 /* .prologue */
	 /* .line 62 */
	 int v3 = 0; // const/4 v3, 0x0
	 /* .line 64 */
	 /* .local v3, "ret":Lorg/apache/http/impl/client/DefaultHttpClient; */
	 /* new-instance v1, Lorg/apache/http/params/BasicHttpParams; */
	 /* invoke-direct {v1}, Lorg/apache/http/params/BasicHttpParams;-><init>()V */
	 /* .line 65 */
	 /* .local v1, "params":Lorg/apache/http/params/HttpParams; */
	 v5 = org.apache.http.HttpVersion.HTTP_1_1;
	 org.apache.http.params.HttpProtocolParams .setVersion ( v1,v5 );
	 /* .line 66 */
	 final String v5 = "utf-8"; // const-string v5, "utf-8"
	 org.apache.http.params.HttpProtocolParams .setContentCharset ( v1,v5 );
	 /* .line 67 */
	 final String v5 = "http.protocol.expect-continue"; // const-string v5, "http.protocol.expect-continue"
	 int v6 = 0; // const/4 v6, 0x0
	 /* .line 70 */
	 /* new-instance v2, Lorg/apache/http/conn/scheme/SchemeRegistry; */
	 /* invoke-direct {v2}, Lorg/apache/http/conn/scheme/SchemeRegistry;-><init>()V */
	 /* .line 71 */
	 /* .local v2, "registry":Lorg/apache/http/conn/scheme/SchemeRegistry; */
	 /* new-instance v5, Lorg/apache/http/conn/scheme/Scheme; */
	 final String v6 = "http"; // const-string v6, "http"
	 org.apache.http.conn.scheme.PlainSocketFactory .getSocketFactory ( );
	 /* const/16 v8, 0x50 */
	 /* invoke-direct {v5, v6, v7, v8}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V */
	 (( org.apache.http.conn.scheme.SchemeRegistry ) v2 ).register ( v5 ); // invoke-virtual {v2, v5}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
	 /* .line 72 */
	 org.apache.http.conn.ssl.SSLSocketFactory .getSocketFactory ( );
	 /* .line 73 */
	 /* .local v4, "sslSocketFactory":Lorg/apache/http/conn/ssl/SSLSocketFactory; */
	 v5 = org.apache.http.conn.ssl.SSLSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
	 (( org.apache.http.conn.ssl.SSLSocketFactory ) v4 ).setHostnameVerifier ( v5 ); // invoke-virtual {v4, v5}, Lorg/apache/http/conn/ssl/SSLSocketFactory;->setHostnameVerifier(Lorg/apache/http/conn/ssl/X509HostnameVerifier;)V
	 /* .line 74 */
	 /* new-instance v5, Lorg/apache/http/conn/scheme/Scheme; */
	 final String v6 = "https"; // const-string v6, "https"
	 /* const/16 v7, 0x1bb */
	 /* invoke-direct {v5, v6, v4, v7}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V */
	 (( org.apache.http.conn.scheme.SchemeRegistry ) v2 ).register ( v5 ); // invoke-virtual {v2, v5}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
	 /* .line 76 */
	 /* new-instance v0, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager; */
	 /* invoke-direct {v0, v1, v2}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V */
	 /* .line 77 */
	 /* .local v0, "manager":Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager; */
	 /* new-instance v3, Lorg/apache/http/impl/client/DefaultHttpClient; */
} // .end local v3 # "ret":Lorg/apache/http/impl/client/DefaultHttpClient;
/* invoke-direct {v3, v0, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V */
/* .line 78 */
/* .restart local v3 # "ret":Lorg/apache/http/impl/client/DefaultHttpClient; */
v5 = this.myRetryHandler;
(( org.apache.http.impl.client.DefaultHttpClient ) v3 ).setHttpRequestRetryHandler ( v5 ); // invoke-virtual {v3, v5}, Lorg/apache/http/impl/client/DefaultHttpClient;->setHttpRequestRetryHandler(Lorg/apache/http/client/HttpRequestRetryHandler;)V
/* .line 79 */
} // .end method

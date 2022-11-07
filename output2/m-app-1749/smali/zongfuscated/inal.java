public class inal implements org.apache.http.client.HttpClient {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lzongfuscated/d$a; */
	 /* } */
} // .end annotation
/* # instance fields */
private final org.apache.http.client.HttpClient a;
/* # direct methods */
static inal ( ) {
	 /* .locals 1 */
	 /* const-class v0, Lzongfuscated/d; */
	 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
	 return;
} // .end method
 inal ( ) { //synthethic
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-direct {p0, v0}, Lzongfuscated/d;-><init>(B)V */
	 return;
} // .end method
private inal ( ) {
	 /* .locals 6 */
	 /* const v1, 0xea60 */
	 int v3 = 5; // const/4 v3, 0x5
	 int v2 = 0; // const/4 v2, 0x0
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* new-instance v0, Lorg/apache/http/params/BasicHttpParams; */
	 /* invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V */
	 org.apache.http.params.HttpConnectionParams .setStaleCheckingEnabled ( v0,v2 );
	 org.apache.http.params.HttpConnectionParams .setConnectionTimeout ( v0,v1 );
	 org.apache.http.params.HttpConnectionParams .setSoTimeout ( v0,v1 );
	 /* const v1, 0x8000 */
	 org.apache.http.params.HttpConnectionParams .setSocketBufferSize ( v0,v1 );
	 final String v1 = "http.protocol.expect-continue"; // const-string v1, "http.protocol.expect-continue"
	 org.apache.http.conn.params.ConnManagerParams .setMaxTotalConnections ( v0,v3 );
	 /* new-instance v1, Lorg/apache/http/conn/params/ConnPerRouteBean; */
	 /* invoke-direct {v1, v3}, Lorg/apache/http/conn/params/ConnPerRouteBean;-><init>(I)V */
	 org.apache.http.conn.params.ConnManagerParams .setMaxConnectionsPerRoute ( v0,v1 );
	 org.apache.http.client.params.HttpClientParams .setRedirecting ( v0,v2 );
	 final String v1 = "rfc2109"; // const-string v1, "rfc2109"
	 org.apache.http.client.params.HttpClientParams .setCookiePolicy ( v0,v1 );
	 final String v1 = "Android"; // const-string v1, "Android"
	 org.apache.http.params.HttpProtocolParams .setUserAgent ( v0,v1 );
	 v1 = org.apache.http.HttpVersion.HTTP_1_1;
	 org.apache.http.params.HttpProtocolParams .setVersion ( v0,v1 );
	 final String v1 = "UTF-8"; // const-string v1, "UTF-8"
	 org.apache.http.params.HttpProtocolParams .setContentCharset ( v0,v1 );
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
	 /* new-instance v1, Lzongfuscated/d$1; */
	 /* invoke-direct {v1, v2, v0}, Lzongfuscated/d$1;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V */
	 this.a = v1;
	 return;
} // .end method
public static org.apache.http.client.HttpClient a ( ) {
	 /* .locals 1 */
	 zongfuscated.d$a .a ( );
	 v0 = this.a;
} // .end method
/* # virtual methods */
public final java.lang.Object execute ( org.apache.http.HttpHost p0, org.apache.http.HttpRequest p1, org.apache.http.client.ResponseHandler p2 ) {
	 /* .locals 1 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">(", */
	 /* "Lorg/apache/http/HttpHost;", */
	 /* "Lorg/apache/http/HttpRequest;", */
	 /* "Lorg/apache/http/client/ResponseHandler", */
	 /* "<+TT;>;)TT;" */
	 /* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
v0 = this.a;
} // .end method
public final java.lang.Object execute ( org.apache.http.HttpHost p0, org.apache.http.HttpRequest p1, org.apache.http.client.ResponseHandler p2, org.apache.http.protocol.HttpContext p3 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Lorg/apache/http/HttpHost;", */
/* "Lorg/apache/http/HttpRequest;", */
/* "Lorg/apache/http/client/ResponseHandler", */
/* "<+TT;>;", */
/* "Lorg/apache/http/protocol/HttpContext;", */
/* ")TT;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
v0 = this.a;
} // .end method
public final java.lang.Object execute ( org.apache.http.client.methods.HttpUriRequest p0, org.apache.http.client.ResponseHandler p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Lorg/apache/http/client/methods/HttpUriRequest;", */
/* "Lorg/apache/http/client/ResponseHandler", */
/* "<+TT;>;)TT;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
v0 = this.a;
} // .end method
public final java.lang.Object execute ( org.apache.http.client.methods.HttpUriRequest p0, org.apache.http.client.ResponseHandler p1, org.apache.http.protocol.HttpContext p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Lorg/apache/http/client/methods/HttpUriRequest;", */
/* "Lorg/apache/http/client/ResponseHandler", */
/* "<+TT;>;", */
/* "Lorg/apache/http/protocol/HttpContext;", */
/* ")TT;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
v0 = this.a;
} // .end method
public final org.apache.http.HttpResponse execute ( org.apache.http.HttpHost p0, org.apache.http.HttpRequest p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
v0 = this.a;
} // .end method
public final org.apache.http.HttpResponse execute ( org.apache.http.HttpHost p0, org.apache.http.HttpRequest p1, org.apache.http.protocol.HttpContext p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
v0 = this.a;
} // .end method
public final org.apache.http.HttpResponse execute ( org.apache.http.client.methods.HttpUriRequest p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
v0 = this.a;
} // .end method
public final org.apache.http.HttpResponse execute ( org.apache.http.client.methods.HttpUriRequest p0, org.apache.http.protocol.HttpContext p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
v0 = this.a;
} // .end method
protected final void finalize ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Throwable; */
/* } */
} // .end annotation
try { // :try_start_0
(( zongfuscated.d ) p0 ).getConnectionManager ( ); // invoke-virtual {p0}, Lzongfuscated/d;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* invoke-super {p0}, Ljava/lang/Object;->finalize()V */
return;
/* :catchall_0 */
/* move-exception v0 */
/* invoke-super {p0}, Ljava/lang/Object;->finalize()V */
/* throw v0 */
} // .end method
public final org.apache.http.conn.ClientConnectionManager getConnectionManager ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
public final org.apache.http.params.HttpParams getParams ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method

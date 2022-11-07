class com.chartboost.sdk.CBAPIConnection$TrustingSocketFactory extends org.apache.http.conn.ssl.SSLSocketFactory {
	 /* .source "CBAPIConnection.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/chartboost/sdk/CBAPIConnection; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "TrustingSocketFactory" */
} // .end annotation
/* # instance fields */
javax.net.ssl.SSLContext sslContext;
final com.chartboost.sdk.CBAPIConnection this$0; //synthetic
/* # direct methods */
public com.chartboost.sdk.CBAPIConnection$TrustingSocketFactory ( ) {
/* .locals 5 */
/* .param p2, "truststore" # Ljava/security/KeyStore; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 278 */
this.this$0 = p1;
/* .line 279 */
/* invoke-direct {p0, p2}, Lorg/apache/http/conn/ssl/SSLSocketFactory;-><init>(Ljava/security/KeyStore;)V */
/* .line 276 */
final String v1 = "TLS"; // const-string v1, "TLS"
javax.net.ssl.SSLContext .getInstance ( v1 );
this.sslContext = v1;
/* .line 281 */
/* new-instance v0, Lcom/chartboost/sdk/CBAPIConnection$TrustingSocketFactory$1; */
/* invoke-direct {v0, p0}, Lcom/chartboost/sdk/CBAPIConnection$TrustingSocketFactory$1;-><init>(Lcom/chartboost/sdk/CBAPIConnection$TrustingSocketFactory;)V */
/* .line 292 */
/* .local v0, "tm":Ljavax/net/ssl/TrustManager; */
v1 = this.sslContext;
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljavax/net/ssl/TrustManager; */
int v3 = 0; // const/4 v3, 0x0
/* aput-object v0, v2, v3 */
(( javax.net.ssl.SSLContext ) v1 ).init ( v4, v2, v4 ); // invoke-virtual {v1, v4, v2, v4}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V
/* .line 293 */
return;
} // .end method
/* # virtual methods */
public java.net.Socket createSocket ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 302 */
v0 = this.sslContext;
(( javax.net.ssl.SSLContext ) v0 ).getSocketFactory ( ); // invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;
(( javax.net.ssl.SSLSocketFactory ) v0 ).createSocket ( ); // invoke-virtual {v0}, Ljavax/net/ssl/SSLSocketFactory;->createSocket()Ljava/net/Socket;
} // .end method
public java.net.Socket createSocket ( java.net.Socket p0, java.lang.String p1, Integer p2, Boolean p3 ) {
/* .locals 1 */
/* .param p1, "socket" # Ljava/net/Socket; */
/* .param p2, "host" # Ljava/lang/String; */
/* .param p3, "port" # I */
/* .param p4, "autoClose" # Z */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Ljava/net/UnknownHostException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 297 */
v0 = this.sslContext;
(( javax.net.ssl.SSLContext ) v0 ).getSocketFactory ( ); // invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;
(( javax.net.ssl.SSLSocketFactory ) v0 ).createSocket ( p1, p2, p3, p4 ); // invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;
} // .end method

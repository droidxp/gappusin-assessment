public class com.openfeint.internal.request.Client extends org.apache.http.impl.client.DefaultHttpClient {
	 /* .source "Client.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/openfeint/internal/request/Client$Executor;, */
	 /* Lcom/openfeint/internal/request/Client$GzipDecompressingEntity; */
	 /* } */
} // .end annotation
/* # static fields */
private static final Integer EXCESS_THREAD_LIFETIME;
private static final Integer MAX_THREADS;
private static final Integer MIN_THREADS;
private static final java.lang.String TAG;
/* # instance fields */
private com.openfeint.internal.CookieStore mCookieStore;
final java.util.concurrent.ExecutorService mExecutor;
private Boolean mForceOffline;
private android.os.Handler mMainThreadHandler;
private com.openfeint.internal.request.Signer mSigner;
/* # direct methods */
public com.openfeint.internal.request.Client ( ) {
	 /* .locals 2 */
	 /* .param p1, "key" # Ljava/lang/String; */
	 /* .param p2, "secret" # Ljava/lang/String; */
	 /* .param p3, "prefs" # Lcom/openfeint/internal/SyncedStore; */
	 /* .prologue */
	 /* .line 112 */
	 com.openfeint.internal.request.Client .makeCCM ( );
	 /* new-instance v1, Lorg/apache/http/params/BasicHttpParams; */
	 /* invoke-direct {v1}, Lorg/apache/http/params/BasicHttpParams;-><init>()V */
	 /* invoke-direct {p0, v0, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V */
	 /* .line 114 */
	 /* new-instance v0, Lcom/openfeint/internal/request/Client$Executor; */
	 /* invoke-direct {v0, p0}, Lcom/openfeint/internal/request/Client$Executor;-><init>(Lcom/openfeint/internal/request/Client;)V */
	 this.mExecutor = v0;
	 /* .line 116 */
	 /* new-instance v0, Lcom/openfeint/internal/request/Signer; */
	 /* invoke-direct {v0, p1, p2}, Lcom/openfeint/internal/request/Signer;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
	 this.mSigner = v0;
	 /* .line 117 */
	 /* new-instance v0, Landroid/os/Handler; */
	 /* invoke-direct {v0}, Landroid/os/Handler;-><init>()V */
	 this.mMainThreadHandler = v0;
	 /* .line 118 */
	 /* new-instance v0, Lcom/openfeint/internal/CookieStore; */
	 /* invoke-direct {v0, p3}, Lcom/openfeint/internal/CookieStore;-><init>(Lcom/openfeint/internal/SyncedStore;)V */
	 this.mCookieStore = v0;
	 /* .line 120 */
	 v0 = this.mCookieStore;
	 (( com.openfeint.internal.request.Client ) p0 ).setCookieStore ( v0 ); // invoke-virtual {p0, v0}, Lcom/openfeint/internal/request/Client;->setCookieStore(Lorg/apache/http/client/CookieStore;)V
	 /* .line 123 */
	 /* new-instance v0, Lcom/openfeint/internal/request/Client$1; */
	 /* invoke-direct {v0, p0}, Lcom/openfeint/internal/request/Client$1;-><init>(Lcom/openfeint/internal/request/Client;)V */
	 (( com.openfeint.internal.request.Client ) p0 ).addRequestInterceptor ( v0 ); // invoke-virtual {p0, v0}, Lcom/openfeint/internal/request/Client;->addRequestInterceptor(Lorg/apache/http/HttpRequestInterceptor;)V
	 /* .line 131 */
	 /* new-instance v0, Lcom/openfeint/internal/request/Client$2; */
	 /* invoke-direct {v0, p0}, Lcom/openfeint/internal/request/Client$2;-><init>(Lcom/openfeint/internal/request/Client;)V */
	 (( com.openfeint.internal.request.Client ) p0 ).addResponseInterceptor ( v0 ); // invoke-virtual {p0, v0}, Lcom/openfeint/internal/request/Client;->addResponseInterceptor(Lorg/apache/http/HttpResponseInterceptor;)V
	 /* .line 150 */
	 return;
} // .end method
static android.os.Handler access$000 ( com.openfeint.internal.request.Client p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Lcom/openfeint/internal/request/Client; */
	 /* .prologue */
	 /* .line 38 */
	 v0 = this.mMainThreadHandler;
} // .end method
static com.openfeint.internal.request.Signer access$100 ( com.openfeint.internal.request.Client p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Lcom/openfeint/internal/request/Client; */
	 /* .prologue */
	 /* .line 38 */
	 v0 = this.mSigner;
} // .end method
static Boolean access$200 ( com.openfeint.internal.request.Client p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Lcom/openfeint/internal/request/Client; */
	 /* .prologue */
	 /* .line 38 */
	 /* iget-boolean v0, p0, Lcom/openfeint/internal/request/Client;->mForceOffline:Z */
} // .end method
static final org.apache.http.conn.ClientConnectionManager makeCCM ( ) {
	 /* .locals 6 */
	 /* .prologue */
	 /* .line 92 */
	 /* new-instance v1, Lorg/apache/http/conn/scheme/SchemeRegistry; */
	 /* invoke-direct {v1}, Lorg/apache/http/conn/scheme/SchemeRegistry;-><init>()V */
	 /* .line 93 */
	 /* .local v1, "sr":Lorg/apache/http/conn/scheme/SchemeRegistry; */
	 /* new-instance v2, Lorg/apache/http/conn/scheme/Scheme; */
	 final String v3 = "http"; // const-string v3, "http"
	 org.apache.http.conn.scheme.PlainSocketFactory .getSocketFactory ( );
	 /* const/16 v5, 0x50 */
	 /* invoke-direct {v2, v3, v4, v5}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V */
	 (( org.apache.http.conn.scheme.SchemeRegistry ) v1 ).register ( v2 ); // invoke-virtual {v1, v2}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
	 /* .line 94 */
	 /* new-instance v2, Lorg/apache/http/conn/scheme/Scheme; */
	 final String v3 = "https"; // const-string v3, "https"
	 org.apache.http.conn.ssl.SSLSocketFactory .getSocketFactory ( );
	 /* const/16 v5, 0x1bb */
	 /* invoke-direct {v2, v3, v4, v5}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V */
	 (( org.apache.http.conn.scheme.SchemeRegistry ) v1 ).register ( v2 ); // invoke-virtual {v1, v2}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
	 /* .line 96 */
	 /* new-instance v0, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager; */
	 /* new-instance v2, Lorg/apache/http/params/BasicHttpParams; */
	 /* invoke-direct {v2}, Lorg/apache/http/params/BasicHttpParams;-><init>()V */
	 /* invoke-direct {v0, v2, v1}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V */
	 /* .line 98 */
	 /* .local v0, "ccm":Lorg/apache/http/conn/ClientConnectionManager; */
} // .end method
/* # virtual methods */
public final void makeRequest ( com.openfeint.internal.request.BaseRequest p0 ) {
	 /* .locals 2 */
	 /* .param p1, "req" # Lcom/openfeint/internal/request/BaseRequest; */
	 /* .prologue */
	 /* .line 153 */
	 (( com.openfeint.internal.request.BaseRequest ) p1 ).timeout ( ); // invoke-virtual {p1}, Lcom/openfeint/internal/request/BaseRequest;->timeout()J
	 /* move-result-wide v0 */
	 (( com.openfeint.internal.request.Client ) p0 ).makeRequest ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Lcom/openfeint/internal/request/Client;->makeRequest(Lcom/openfeint/internal/request/BaseRequest;J)V
	 /* .line 154 */
	 return;
} // .end method
public final void makeRequest ( com.openfeint.internal.request.BaseRequest p0, Long p1 ) {
	 /* .locals 7 */
	 /* .param p1, "req" # Lcom/openfeint/internal/request/BaseRequest; */
	 /* .param p2, "timeoutMillis" # J */
	 /* .prologue */
	 /* .line 158 */
	 /* new-instance v6, Lcom/openfeint/internal/request/Client$3; */
	 /* invoke-direct {v6, p0, p1}, Lcom/openfeint/internal/request/Client$3;-><init>(Lcom/openfeint/internal/request/Client;Lcom/openfeint/internal/request/BaseRequest;)V */
	 /* .line 164 */
	 /* .local v6, "onResponse":Ljava/lang/Runnable; */
	 /* new-instance v2, Lcom/openfeint/internal/request/Client$4; */
	 /* invoke-direct {v2, p0, p1, v6}, Lcom/openfeint/internal/request/Client$4;-><init>(Lcom/openfeint/internal/request/Client;Lcom/openfeint/internal/request/BaseRequest;Ljava/lang/Runnable;)V */
	 /* .line 177 */
	 /* .local v2, "onTimeout":Ljava/lang/Runnable; */
	 /* new-instance v0, Lcom/openfeint/internal/request/Client$5; */
	 /* move-object v1, p0 */
	 /* move-wide v3, p2 */
	 /* move-object v5, p1 */
	 /* invoke-direct/range {v0 ..v6}, Lcom/openfeint/internal/request/Client$5;-><init>(Lcom/openfeint/internal/request/Client;Ljava/lang/Runnable;JLcom/openfeint/internal/request/BaseRequest;Ljava/lang/Runnable;)V */
	 /* .line 188 */
	 /* .local v0, "requestRunnable":Ljava/lang/Runnable; */
	 v1 = this.mExecutor;
	 (( com.openfeint.internal.request.BaseRequest ) p1 ).setFuture ( v1 ); // invoke-virtual {p1, v1}, Lcom/openfeint/internal/request/BaseRequest;->setFuture(Ljava/util/concurrent/Future;)V
	 /* .line 189 */
	 return;
} // .end method
public void restoreInstanceState ( android.os.Bundle p0 ) {
	 /* .locals 1 */
	 /* .param p1, "inState" # Landroid/os/Bundle; */
	 /* .prologue */
	 /* .line 58 */
	 v0 = this.mCookieStore;
	 (( com.openfeint.internal.CookieStore ) v0 ).restoreInstanceState ( p1 ); // invoke-virtual {v0, p1}, Lcom/openfeint/internal/CookieStore;->restoreInstanceState(Landroid/os/Bundle;)V
	 /* .line 59 */
	 final String v0 = "mForceOffline"; // const-string v0, "mForceOffline"
	 v0 = 	 (( android.os.Bundle ) p1 ).getBoolean ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
	 /* iput-boolean v0, p0, Lcom/openfeint/internal/request/Client;->mForceOffline:Z */
	 /* .line 60 */
	 return;
} // .end method
public void saveInstanceState ( android.os.Bundle p0 ) {
	 /* .locals 2 */
	 /* .param p1, "outState" # Landroid/os/Bundle; */
	 /* .prologue */
	 /* .line 53 */
	 v0 = this.mCookieStore;
	 (( com.openfeint.internal.CookieStore ) v0 ).saveInstanceState ( p1 ); // invoke-virtual {v0, p1}, Lcom/openfeint/internal/CookieStore;->saveInstanceState(Landroid/os/Bundle;)V
	 /* .line 54 */
	 final String v0 = "mForceOffline"; // const-string v0, "mForceOffline"
	 /* iget-boolean v1, p0, Lcom/openfeint/internal/request/Client;->mForceOffline:Z */
	 (( android.os.Bundle ) p1 ).putBoolean ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
	 /* .line 55 */
	 return;
} // .end method
public Boolean toggleForceOffline ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 63 */
	 /* iget-boolean v0, p0, Lcom/openfeint/internal/request/Client;->mForceOffline:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 64 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/openfeint/internal/request/Client;->mForceOffline:Z */
		 /* .line 65 */
		 final String v0 = "HTTPClient"; // const-string v0, "HTTPClient"
		 final String v1 = "forceOffline = FALSE"; // const-string v1, "forceOffline = FALSE"
		 com.openfeint.internal.OpenFeintInternal .log ( v0,v1 );
		 /* .line 70 */
	 } // :goto_0
	 /* iget-boolean v0, p0, Lcom/openfeint/internal/request/Client;->mForceOffline:Z */
	 /* .line 67 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/openfeint/internal/request/Client;->mForceOffline:Z */
/* .line 68 */
final String v0 = "HTTPClient"; // const-string v0, "HTTPClient"
final String v1 = "forceOffline = TRUE"; // const-string v1, "forceOffline = TRUE"
com.openfeint.internal.OpenFeintInternal .log ( v0,v1 );
} // .end method

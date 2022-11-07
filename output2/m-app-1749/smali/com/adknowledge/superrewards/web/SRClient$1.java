class com.adknowledge.superrewards.web.SRClient$1 implements org.apache.http.client.HttpRequestRetryHandler {
	 /* .source "SRClient.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/adknowledge/superrewards/web/SRClient; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.adknowledge.superrewards.web.SRClient this$0; //synthetic
/* # direct methods */
 com.adknowledge.superrewards.web.SRClient$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 83 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Boolean retryRequest ( java.io.IOException p0, Integer p1, org.apache.http.protocol.HttpContext p2 ) {
/* .locals 5 */
/* .param p1, "exception" # Ljava/io/IOException; */
/* .param p2, "executionCount" # I */
/* .param p3, "context" # Lorg/apache/http/protocol/HttpContext; */
/* .prologue */
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 89 */
int v4 = 5; // const/4 v4, 0x5
/* if-lt p2, v4, :cond_1 */
/* .line 108 */
} // :cond_0
} // :goto_0
/* .line 93 */
} // :cond_1
/* instance-of v4, p1, Lorg/apache/http/NoHttpResponseException; */
if ( v4 != null) { // if-eqz v4, :cond_2
/* move v2, v3 */
/* .line 95 */
/* .line 97 */
} // :cond_2
/* instance-of v4, p1, Ljavax/net/ssl/SSLHandshakeException; */
/* if-nez v4, :cond_0 */
/* .line 101 */
final String v4 = "http.request"; // const-string v4, "http.request"
/* check-cast v1, Lorg/apache/http/HttpRequest; */
/* .line 103 */
/* .local v1, "request":Lorg/apache/http/HttpRequest; */
/* instance-of v4, v1, Lorg/apache/http/HttpEntityEnclosingRequest; */
/* if-nez v4, :cond_3 */
/* move v0, v3 */
/* .line 104 */
/* .local v0, "idempotent":Z */
} // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_0
/* move v2, v3 */
/* .line 106 */
} // .end local v0 # "idempotent":Z
} // :cond_3
/* move v0, v2 */
/* .line 103 */
} // .end method

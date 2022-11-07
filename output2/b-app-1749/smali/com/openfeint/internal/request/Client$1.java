class com.openfeint.internal.request.Client$1 implements org.apache.http.HttpRequestInterceptor {
	 /* .source "Client.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/request/Client;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/openfeint/internal/SyncedStore;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.request.Client this$0; //synthetic
/* # direct methods */
 com.openfeint.internal.request.Client$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 123 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void process ( org.apache.http.HttpRequest p0, org.apache.http.protocol.HttpContext p1 ) {
/* .locals 2 */
/* .param p1, "request" # Lorg/apache/http/HttpRequest; */
/* .param p2, "context" # Lorg/apache/http/protocol/HttpContext; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/http/HttpException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 125 */
v0 = final String v0 = "Accept-Encoding"; // const-string v0, "Accept-Encoding"
/* if-nez v0, :cond_0 */
/* .line 126 */
final String v0 = "Accept-Encoding"; // const-string v0, "Accept-Encoding"
final String v1 = "gzip"; // const-string v1, "gzip"
/* .line 128 */
} // :cond_0
return;
} // .end method

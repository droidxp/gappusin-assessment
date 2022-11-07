class com.openfeint.internal.request.BaseRequest$1 implements org.apache.http.client.ResponseHandler {
	 /* .source "BaseRequest.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/request/BaseRequest;->exec(Z)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Object;", */
/* "Lorg/apache/http/client/ResponseHandler", */
/* "<", */
/* "Ljava/lang/Object;", */
/* ">;" */
/* } */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.request.BaseRequest this$0; //synthetic
final org.apache.http.protocol.HttpContext val$context; //synthetic
/* # direct methods */
 com.openfeint.internal.request.BaseRequest$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 211 */
this.this$0 = p1;
this.val$context = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public java.lang.Object handleResponse ( org.apache.http.HttpResponse p0 ) {
/* .locals 10 */
/* .param p1, "response" # Lorg/apache/http/HttpResponse; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/http/client/ClientProtocolException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
int v9 = 0; // const/4 v9, 0x0
/* .line 217 */
v5 = this.val$context;
final String v6 = "http.request"; // const-string v6, "http.request"
/* check-cast v3, Lorg/apache/http/client/methods/HttpUriRequest; */
/* .line 219 */
/* .local v3, "currentReq":Lorg/apache/http/client/methods/HttpUriRequest; */
v5 = this.val$context;
final String v6 = "http.target_host"; // const-string v6, "http.target_host"
/* check-cast v2, Lorg/apache/http/HttpHost; */
/* .line 221 */
/* .local v2, "currentHost":Lorg/apache/http/HttpHost; */
v5 = this.this$0;
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
(( org.apache.http.HttpHost ) v2 ).toURI ( ); // invoke-virtual {v2}, Lorg/apache/http/HttpHost;->toURI()Ljava/lang/String;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.request.BaseRequest .access$002 ( v5,v6 );
/* .line 223 */
/* .line 225 */
/* .local v4, "entity":Lorg/apache/http/HttpEntity; */
v5 = this.this$0;
/* new-array v6, v9, [B */
com.openfeint.internal.request.BaseRequest .access$102 ( v5,v6 );
/* .line 226 */
v6 = v5 = this.this$0;
com.openfeint.internal.request.BaseRequest .access$202 ( v5,v6 );
/* .line 228 */
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 229 */
/* .line 230 */
/* .local v0, "contentEncoding":Lorg/apache/http/Header; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 231 */
v5 = this.this$0;
com.openfeint.internal.request.BaseRequest .access$302 ( v5,v6 );
/* .line 234 */
} // :cond_0
/* .line 235 */
/* .local v1, "contentType":Lorg/apache/http/Header; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 236 */
v5 = this.this$0;
com.openfeint.internal.request.BaseRequest .access$402 ( v5,v6 );
/* .line 239 */
} // :cond_1
v5 = this.this$0;
org.apache.http.util.EntityUtils .toByteArray ( v4 );
com.openfeint.internal.request.BaseRequest .access$102 ( v5,v6 );
/* .line 240 */
/* move-result-wide v5 */
/* const-wide/16 v7, 0x0 */
/* cmp-long v5, v5, v7 */
/* if-ltz v5, :cond_2 */
/* move-result-wide v5 */
v7 = this.this$0;
com.openfeint.internal.request.BaseRequest .access$100 ( v7 );
/* array-length v7, v7 */
/* int-to-long v7, v7 */
/* cmp-long v5, v5, v7 */
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 242 */
v5 = com.openfeint.internal.request.BaseRequest.TAG;
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "Content-Length mismatch with content - "; // const-string v7, "Content-Length mismatch with content - "
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v7 = this.this$0;
com.openfeint.internal.request.BaseRequest .access$500 ( v7 );
(( java.net.URI ) v7 ).toASCIIString ( ); // invoke-virtual {v7}, Ljava/net/URI;->toASCIIString()Ljava/lang/String;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v5,v6 );
/* .line 243 */
v5 = this.this$0;
com.openfeint.internal.request.BaseRequest .access$202 ( v5,v9 );
/* .line 246 */
} // .end local v0 # "contentEncoding":Lorg/apache/http/Header;
} // .end local v1 # "contentType":Lorg/apache/http/Header;
} // :cond_2
v5 = this.this$0;
com.openfeint.internal.request.BaseRequest .access$602 ( v5,p1 );
/* .line 247 */
int v5 = 0; // const/4 v5, 0x0
} // .end method

class com.openfeint.internal.request.Client$2 implements org.apache.http.HttpResponseInterceptor {
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
 com.openfeint.internal.request.Client$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 131 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void process ( org.apache.http.HttpResponse p0, org.apache.http.protocol.HttpContext p1 ) {
/* .locals 6 */
/* .param p1, "response" # Lorg/apache/http/HttpResponse; */
/* .param p2, "context" # Lorg/apache/http/protocol/HttpContext; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/apache/http/HttpException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 133 */
/* .line 134 */
/* .local v2, "entity":Lorg/apache/http/HttpEntity; */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 135 */
/* .line 136 */
/* .local v0, "ceheader":Lorg/apache/http/Header; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 137 */
	 /* .line 138 */
	 /* .local v1, "codecs":[Lorg/apache/http/HeaderElement; */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 139 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* .local v3, "i":I */
	 } // :goto_0
	 /* array-length v4, v1 */
	 /* if-ge v3, v4, :cond_0 */
	 /* .line 140 */
	 /* aget-object v4, v1, v3 */
	 final String v5 = "gzip"; // const-string v5, "gzip"
	 v4 = 	 (( java.lang.String ) v4 ).equalsIgnoreCase ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
	 if ( v4 != null) { // if-eqz v4, :cond_1
		 /* .line 141 */
		 /* new-instance v4, Lcom/openfeint/internal/request/Client$GzipDecompressingEntity; */
		 /* invoke-direct {v4, v5}, Lcom/openfeint/internal/request/Client$GzipDecompressingEntity;-><init>(Lorg/apache/http/HttpEntity;)V */
		 /* .line 148 */
	 } // .end local v0 # "ceheader":Lorg/apache/http/Header;
} // .end local v1 # "codecs":[Lorg/apache/http/HeaderElement;
} // .end local v3 # "i":I
} // :cond_0
return;
/* .line 139 */
/* .restart local v0 # "ceheader":Lorg/apache/http/Header; */
/* .restart local v1 # "codecs":[Lorg/apache/http/HeaderElement; */
/* .restart local v3 # "i":I */
} // :cond_1
/* add-int/lit8 v3, v3, 0x1 */
} // .end method

class com.openfeint.internal.request.Client$GzipDecompressingEntity extends org.apache.http.entity.HttpEntityWrapper {
	 /* .source "Client.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/openfeint/internal/request/Client; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "GzipDecompressingEntity" */
} // .end annotation
/* # direct methods */
public com.openfeint.internal.request.Client$GzipDecompressingEntity ( ) {
/* .locals 0 */
/* .param p1, "entity" # Lorg/apache/http/HttpEntity; */
/* .prologue */
/* .line 76 */
/* invoke-direct {p0, p1}, Lorg/apache/http/entity/HttpEntityWrapper;-><init>(Lorg/apache/http/HttpEntity;)V */
/* .line 77 */
return;
} // .end method
/* # virtual methods */
public java.io.InputStream getContent ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException;, */
/* Ljava/lang/IllegalStateException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 81 */
v1 = this.wrappedEntity;
/* .line 82 */
/* .local v0, "wrappedin":Ljava/io/InputStream; */
/* new-instance v1, Ljava/util/zip/GZIPInputStream; */
/* invoke-direct {v1, v0}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V */
} // .end method
public Long getContentLength ( ) {
/* .locals 2 */
/* .prologue */
/* .line 87 */
/* const-wide/16 v0, -0x1 */
/* return-wide v0 */
} // .end method

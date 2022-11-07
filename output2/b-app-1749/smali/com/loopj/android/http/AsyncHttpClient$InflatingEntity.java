class com.loopj.android.http.AsyncHttpClient$InflatingEntity extends org.apache.http.entity.HttpEntityWrapper {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/loopj/android/http/AsyncHttpClient; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "InflatingEntity" */
} // .end annotation
/* # direct methods */
public com.loopj.android.http.AsyncHttpClient$InflatingEntity ( ) {
/* .locals 0 */
/* invoke-direct {p0, p1}, Lorg/apache/http/entity/HttpEntityWrapper;-><init>(Lorg/apache/http/HttpEntity;)V */
return;
} // .end method
/* # virtual methods */
public java.io.InputStream getContent ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* new-instance v0, Ljava/util/zip/GZIPInputStream; */
v1 = this.wrappedEntity;
/* invoke-direct {v0, v1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V */
} // .end method
public Long getContentLength ( ) {
/* .locals 2 */
/* const-wide/16 v0, -0x1 */
/* return-wide v0 */
} // .end method

class com.loopj.android.http.AsyncHttpClient$2 implements org.apache.http.HttpResponseInterceptor {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/loopj/android/http/AsyncHttpClient;-><init>(Ljava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.loopj.android.http.AsyncHttpClient this$0; //synthetic
/* # direct methods */
 com.loopj.android.http.AsyncHttpClient$2 ( ) {
/* .locals 0 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void process ( org.apache.http.HttpResponse p0, org.apache.http.protocol.HttpContext p1 ) {
/* .locals 5 */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* array-length v2, v1 */
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-ge v0, v2, :cond_0 */
/* aget-object v3, v1, v0 */
final String v4 = "gzip"; // const-string v4, "gzip"
v3 = (( java.lang.String ) v3 ).equalsIgnoreCase ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_1
	 /* new-instance v0, Lcom/loopj/android/http/AsyncHttpClient$InflatingEntity; */
	 /* invoke-direct {v0, v1}, Lcom/loopj/android/http/AsyncHttpClient$InflatingEntity;-><init>(Lorg/apache/http/HttpEntity;)V */
} // :cond_0
return;
} // :cond_1
/* add-int/lit8 v0, v0, 0x1 */
} // .end method

class com.openfeint.internal.request.BaseRequest$2 implements java.lang.Runnable {
	 /* .source "BaseRequest.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/request/BaseRequest;->postTimeoutCleanup()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.request.BaseRequest this$0; //synthetic
final org.apache.http.client.methods.HttpUriRequest val$req; //synthetic
/* # direct methods */
 com.openfeint.internal.request.BaseRequest$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 324 */
this.this$0 = p1;
this.val$req = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 1 */
/* .prologue */
/* .line 327 */
try { // :try_start_0
	 v0 = this.val$req;
	 /* :try_end_0 */
	 /* .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 331 */
} // :goto_0
return;
/* .line 328 */
/* :catch_0 */
/* move-exception v0 */
} // .end method

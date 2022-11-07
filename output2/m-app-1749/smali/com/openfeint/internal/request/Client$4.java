class com.openfeint.internal.request.Client$4 implements java.lang.Runnable {
	 /* .source "Client.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/request/Client;->makeRequest(Lcom/openfeint/internal/request/BaseRequest;J)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.request.Client this$0; //synthetic
final java.lang.Runnable val$onResponse; //synthetic
final com.openfeint.internal.request.BaseRequest val$req; //synthetic
/* # direct methods */
 com.openfeint.internal.request.Client$4 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 164 */
this.this$0 = p1;
this.val$req = p2;
this.val$onResponse = p3;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 167 */
v1 = this.val$req;
(( com.openfeint.internal.request.BaseRequest ) v1 ).getResponse ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/request/BaseRequest;->getResponse()Lorg/apache/http/HttpResponse;
/* if-nez v1, :cond_0 */
/* .line 168 */
v1 = this.val$req;
(( com.openfeint.internal.request.BaseRequest ) v1 ).getFuture ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/request/BaseRequest;->getFuture()Ljava/util/concurrent/Future;
v0 = int v2 = 1; // const/4 v2, 0x1
/* .line 169 */
/* .local v0, "victory":Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 170 */
	 v1 = this.val$req;
	 (( com.openfeint.internal.request.BaseRequest ) v1 ).postTimeoutCleanup ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/request/BaseRequest;->postTimeoutCleanup()V
	 /* .line 171 */
	 v1 = this.this$0;
	 com.openfeint.internal.request.Client .access$000 ( v1 );
	 v2 = this.val$onResponse;
	 (( android.os.Handler ) v1 ).post ( v2 ); // invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
	 /* .line 174 */
} // .end local v0 # "victory":Z
} // :cond_0
return;
} // .end method

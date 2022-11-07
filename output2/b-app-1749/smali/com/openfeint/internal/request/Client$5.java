class com.openfeint.internal.request.Client$5 implements java.lang.Runnable {
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
final java.lang.Runnable val$onTimeout; //synthetic
final com.openfeint.internal.request.BaseRequest val$req; //synthetic
final Long val$timeoutMillis; //synthetic
/* # direct methods */
 com.openfeint.internal.request.Client$5 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 177 */
this.this$0 = p1;
this.val$onTimeout = p2;
/* iput-wide p3, p0, Lcom/openfeint/internal/request/Client$5;->val$timeoutMillis:J */
this.val$req = p5;
this.val$onResponse = p6;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 4 */
/* .prologue */
/* .line 180 */
v0 = this.this$0;
com.openfeint.internal.request.Client .access$000 ( v0 );
v1 = this.val$onTimeout;
/* iget-wide v2, p0, Lcom/openfeint/internal/request/Client$5;->val$timeoutMillis:J */
(( android.os.Handler ) v0 ).postDelayed ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
/* .line 181 */
v0 = this.val$req;
v1 = this.this$0;
com.openfeint.internal.request.Client .access$100 ( v1 );
(( com.openfeint.internal.request.BaseRequest ) v0 ).sign ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/internal/request/BaseRequest;->sign(Lcom/openfeint/internal/request/Signer;)V
/* .line 182 */
v0 = this.val$req;
v1 = this.this$0;
v1 = com.openfeint.internal.request.Client .access$200 ( v1 );
(( com.openfeint.internal.request.BaseRequest ) v0 ).exec ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/internal/request/BaseRequest;->exec(Z)V
/* .line 183 */
v0 = this.this$0;
com.openfeint.internal.request.Client .access$000 ( v0 );
v1 = this.val$onTimeout;
(( android.os.Handler ) v0 ).removeCallbacks ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
/* .line 184 */
v0 = this.this$0;
com.openfeint.internal.request.Client .access$000 ( v0 );
v1 = this.val$onResponse;
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 185 */
return;
} // .end method

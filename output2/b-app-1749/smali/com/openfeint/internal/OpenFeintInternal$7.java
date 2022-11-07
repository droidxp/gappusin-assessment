class com.openfeint.internal.OpenFeintInternal$7 implements java.lang.Runnable {
	 /* .source "OpenFeintInternal.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/OpenFeintInternal;->_makeRequest(Lcom/openfeint/internal/request/BaseRequest;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.OpenFeintInternal this$0; //synthetic
final com.openfeint.internal.request.BaseRequest val$req; //synthetic
/* # direct methods */
 com.openfeint.internal.OpenFeintInternal$7 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 667 */
this.this$0 = p1;
this.val$req = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 669 */
v0 = this.this$0;
v0 = this.mClient;
v1 = this.val$req;
(( com.openfeint.internal.request.Client ) v0 ).makeRequest ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/internal/request/Client;->makeRequest(Lcom/openfeint/internal/request/BaseRequest;)V
/* .line 670 */
return;
} // .end method

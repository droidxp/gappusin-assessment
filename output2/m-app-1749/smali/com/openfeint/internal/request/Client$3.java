class com.openfeint.internal.request.Client$3 implements java.lang.Runnable {
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
final com.openfeint.internal.request.BaseRequest val$req; //synthetic
/* # direct methods */
 com.openfeint.internal.request.Client$3 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 158 */
this.this$0 = p1;
this.val$req = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 1 */
/* .prologue */
/* .line 160 */
v0 = this.val$req;
(( com.openfeint.internal.request.BaseRequest ) v0 ).onResponse ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/request/BaseRequest;->onResponse()V
/* .line 161 */
return;
} // .end method

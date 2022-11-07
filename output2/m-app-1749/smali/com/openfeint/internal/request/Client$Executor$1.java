class com.openfeint.internal.request.Client$Executor$1 implements java.util.concurrent.RejectedExecutionHandler {
	 /* .source "Client.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/request/Client$Executor;-><init>(Lcom/openfeint/internal/request/Client;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.request.Client val$this$0; //synthetic
/* # direct methods */
 com.openfeint.internal.request.Client$Executor$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 103 */
this.val$this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void rejectedExecution ( java.lang.Runnable p0, java.util.concurrent.ThreadPoolExecutor p1 ) {
/* .locals 3 */
/* .param p1, "arg0" # Ljava/lang/Runnable; */
/* .param p2, "arg1" # Ljava/util/concurrent/ThreadPoolExecutor; */
/* .prologue */
/* .line 105 */
final String v0 = "HTTPClient"; // const-string v0, "HTTPClient"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Can\'t submit runnable "; // const-string v2, "Can\'t submit runnable "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Object ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v0,v1 );
/* .line 106 */
return;
} // .end method

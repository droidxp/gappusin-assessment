class inal extends java.util.concurrent.ThreadPoolExecutor {
	 /* .source "Client.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/openfeint/internal/request/Client; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x12 */
/* name = "Executor" */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.request.Client this$0; //synthetic
/* # direct methods */
 inal ( ) {
/* .locals 8 */
/* .prologue */
/* .line 102 */
this.this$0 = p1;
/* .line 103 */
int v1 = 2; // const/4 v1, 0x2
int v2 = 4; // const/4 v2, 0x4
/* const-wide/16 v3, 0x1e */
v5 = java.util.concurrent.TimeUnit.SECONDS;
/* new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue; */
/* invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V */
/* new-instance v7, Lcom/openfeint/internal/request/Client$Executor$1; */
/* invoke-direct {v7, p1}, Lcom/openfeint/internal/request/Client$Executor$1;-><init>(Lcom/openfeint/internal/request/Client;)V */
/* move-object v0, p0 */
/* invoke-direct/range {v0 ..v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/RejectedExecutionHandler;)V */
/* .line 108 */
return;
} // .end method

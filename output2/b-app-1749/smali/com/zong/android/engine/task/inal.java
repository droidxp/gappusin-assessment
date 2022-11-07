class inal implements java.util.concurrent.ThreadFactory {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/zong/android/engine/task/PaymentProcessorTask; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1a */
/* name = "a" */
} // .end annotation
/* # direct methods */
 inal ( ) { //synthethic
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, v0}, Lcom/zong/android/engine/task/PaymentProcessorTask$a;-><init>(B)V */
return;
} // .end method
private inal ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public final java.lang.Thread newThread ( java.lang.Runnable p0 ) {
/* .locals 2 */
/* new-instance v0, Ljava/lang/Thread; */
/* invoke-direct {v0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
int v1 = 1; // const/4 v1, 0x1
(( java.lang.Thread ) v0 ).setDaemon ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Thread;->setDaemon(Z)V
} // .end method

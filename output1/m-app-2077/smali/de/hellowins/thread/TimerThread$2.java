class de.hellowins.thread.TimerThread$2 implements java.lang.Runnable {
	 /* .source "TimerThread.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lde/hellowins/thread/TimerThread;->startNewTimerThread()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final de.hellowins.thread.TimerThread this$0; //synthetic
/* # direct methods */
 de.hellowins.thread.TimerThread$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 51 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 54 */
} // :goto_0
v1 = this.this$0;
/* iget-boolean v1, v1, Lde/hellowins/thread/TimerThread;->timerRunning:Z */
/* if-nez v1, :cond_0 */
/* .line 62 */
return;
/* .line 55 */
} // :cond_0
v1 = this.this$0;
de.hellowins.thread.TimerThread .access$1 ( v1 );
/* .line 57 */
/* const-wide/16 v1, 0x1f4 */
try { // :try_start_0
java.lang.Thread .sleep ( v1,v2 );
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 58 */
/* :catch_0 */
/* move-exception v0 */
/* .line 59 */
/* .local v0, "e":Ljava/lang/InterruptedException; */
(( java.lang.InterruptedException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V
} // .end method

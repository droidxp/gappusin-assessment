public class de.hellowins.thread.TimerThread {
	 /* .source "TimerThread.java" */
	 /* # instance fields */
	 de.hellowins.handler.TimerUpdateHandler callBackHandler;
	 public Boolean timerRunning;
	 final java.lang.Runnable updateRunnable;
	 private final android.os.Handler updateTimerHandler;
	 /* # direct methods */
	 public de.hellowins.thread.TimerThread ( ) {
		 /* .locals 1 */
		 /* .param p1, "handler" # Lde/hellowins/handler/TimerUpdateHandler; */
		 /* .prologue */
		 /* .line 14 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 8 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lde/hellowins/thread/TimerThread;->timerRunning:Z */
		 /* .line 10 */
		 /* new-instance v0, Landroid/os/Handler; */
		 /* invoke-direct {v0}, Landroid/os/Handler;-><init>()V */
		 this.updateTimerHandler = v0;
		 /* .line 42 */
		 /* new-instance v0, Lde/hellowins/thread/TimerThread$1; */
		 /* invoke-direct {v0, p0}, Lde/hellowins/thread/TimerThread$1;-><init>(Lde/hellowins/thread/TimerThread;)V */
		 this.updateRunnable = v0;
		 /* .line 15 */
		 this.callBackHandler = p1;
		 /* .line 16 */
		 return;
	 } // .end method
	 static void access$0 ( de.hellowins.thread.TimerThread p0 ) { //synthethic
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 34 */
		 /* invoke-direct {p0}, Lde/hellowins/thread/TimerThread;->updateTimer()V */
		 return;
	 } // .end method
	 static void access$1 ( de.hellowins.thread.TimerThread p0 ) { //synthethic
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 38 */
		 /* invoke-direct {p0}, Lde/hellowins/thread/TimerThread;->updateTimeHandler()V */
		 return;
	 } // .end method
	 private void updateTimeHandler ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 39 */
		 v0 = this.updateTimerHandler;
		 v1 = this.updateRunnable;
		 (( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
		 /* .line 40 */
		 return;
	 } // .end method
	 private void updateTimer ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 35 */
		 v0 = this.callBackHandler;
		 /* .line 36 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void start ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 22 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lde/hellowins/thread/TimerThread;->timerRunning:Z */
		 /* .line 23 */
		 (( de.hellowins.thread.TimerThread ) p0 ).startNewTimerThread ( ); // invoke-virtual {p0}, Lde/hellowins/thread/TimerThread;->startNewTimerThread()V
		 /* .line 24 */
		 return;
	 } // .end method
	 protected void startNewTimerThread ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 51 */
		 /* new-instance v0, Ljava/lang/Thread; */
		 /* new-instance v1, Lde/hellowins/thread/TimerThread$2; */
		 /* invoke-direct {v1, p0}, Lde/hellowins/thread/TimerThread$2;-><init>(Lde/hellowins/thread/TimerThread;)V */
		 /* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
		 /* .line 63 */
		 (( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
		 /* .line 64 */
		 return;
	 } // .end method
	 public void stop ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 29 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lde/hellowins/thread/TimerThread;->timerRunning:Z */
		 /* .line 30 */
		 return;
	 } // .end method

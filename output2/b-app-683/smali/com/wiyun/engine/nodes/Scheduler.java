public class com.wiyun.engine.nodes.Scheduler extends com.wiyun.engine.BaseWYObject {
	 /* .source "Scheduler.java" */
	 /* # static fields */
	 private static com.wiyun.engine.nodes.Scheduler sInstance;
	 /* # direct methods */
	 static com.wiyun.engine.nodes.Scheduler ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 24 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 8 */
		 return;
	 } // .end method
	 private com.wiyun.engine.nodes.Scheduler ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 42 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 43 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Scheduler;->nativeInit()V */
		 /* .line 44 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.Scheduler getInstance ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 32 */
		 /* const-class v1, Lcom/wiyun/engine/nodes/Scheduler; */
		 /* monitor-enter v1 */
		 /* .line 33 */
		 try { // :try_start_0
			 v0 = com.wiyun.engine.nodes.Scheduler.sInstance;
			 /* if-nez v0, :cond_0 */
			 /* .line 34 */
			 /* new-instance v0, Lcom/wiyun/engine/nodes/Scheduler; */
			 /* invoke-direct {v0}, Lcom/wiyun/engine/nodes/Scheduler;-><init>()V */
			 /* .line 38 */
		 } // :goto_0
		 v0 = com.wiyun.engine.nodes.Scheduler.sInstance;
		 /* monitor-exit v1 */
		 /* .line 36 */
	 } // :cond_0
	 v0 = com.wiyun.engine.nodes.Scheduler.sInstance;
	 v2 = 	 com.wiyun.engine.nodes.Scheduler .nativeGetInstance ( );
	 (( com.wiyun.engine.nodes.Scheduler ) v0 ).setPointer ( v2 ); // invoke-virtual {v0, v2}, Lcom/wiyun/engine/nodes/Scheduler;->setPointer(I)V
	 /* .line 32 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit v1 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v0 */
} // .end method
private static native Integer nativeGetInstance ( ) {
} // .end method
private native void nativeInit ( ) {
} // .end method
/* # virtual methods */
public native Float getTimeScale ( ) {
} // .end method
public native void schedule ( com.wiyun.engine.nodes.Timer p0 ) {
} // .end method
public native void setTimeScale ( Float p0 ) {
} // .end method
public native void unschedule ( com.wiyun.engine.nodes.Timer p0 ) {
} // .end method

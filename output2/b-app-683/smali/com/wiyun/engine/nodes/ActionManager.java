public class com.wiyun.engine.nodes.ActionManager extends com.wiyun.engine.BaseWYObject {
	 /* .source "ActionManager.java" */
	 /* # static fields */
	 private static com.wiyun.engine.nodes.ActionManager sInstance;
	 /* # direct methods */
	 static com.wiyun.engine.nodes.ActionManager ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 17 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 16 */
		 return;
	 } // .end method
	 private com.wiyun.engine.nodes.ActionManager ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 36 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 37 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/ActionManager;->nativeInit()V */
		 /* .line 38 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.ActionManager getInstance ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 25 */
		 /* const-class v1, Lcom/wiyun/engine/nodes/ActionManager; */
		 /* monitor-enter v1 */
		 /* .line 26 */
		 try { // :try_start_0
			 v0 = com.wiyun.engine.nodes.ActionManager.sInstance;
			 /* if-nez v0, :cond_0 */
			 /* .line 27 */
			 /* new-instance v0, Lcom/wiyun/engine/nodes/ActionManager; */
			 /* invoke-direct {v0}, Lcom/wiyun/engine/nodes/ActionManager;-><init>()V */
			 /* .line 31 */
		 } // :goto_0
		 v0 = com.wiyun.engine.nodes.ActionManager.sInstance;
		 /* monitor-exit v1 */
		 /* .line 29 */
	 } // :cond_0
	 v0 = com.wiyun.engine.nodes.ActionManager.sInstance;
	 v2 = 	 com.wiyun.engine.nodes.ActionManager .nativeGetInstance ( );
	 (( com.wiyun.engine.nodes.ActionManager ) v0 ).setPointer ( v2 ); // invoke-virtual {v0, v2}, Lcom/wiyun/engine/nodes/ActionManager;->setPointer(I)V
	 /* .line 25 */
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
public native void addAction ( com.wiyun.engine.actions.Action p0, com.wiyun.engine.nodes.Node p1, Boolean p2 ) {
} // .end method
public native Integer getRunningActionCount ( com.wiyun.engine.nodes.Node p0 ) {
} // .end method
public void pauseAllActions ( com.wiyun.engine.nodes.Node p0 ) {
	 /* .locals 1 */
	 /* .param p1, "target" # Lcom/wiyun/engine/nodes/Node; */
	 /* .prologue */
	 /* .line 49 */
	 int v0 = 0; // const/4 v0, 0x0
	 (( com.wiyun.engine.nodes.ActionManager ) p0 ).pauseAllActions ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/wiyun/engine/nodes/ActionManager;->pauseAllActions(Lcom/wiyun/engine/nodes/Node;Z)V
	 /* .line 50 */
	 return;
} // .end method
public native void pauseAllActions ( com.wiyun.engine.nodes.Node p0, Boolean p1 ) {
} // .end method
public native void removeAction ( com.wiyun.engine.actions.Action p0 ) {
} // .end method
public native void removeAction ( com.wiyun.engine.nodes.Node p0, Integer p1 ) {
} // .end method
public native void removeAllActions ( ) {
} // .end method
public native void removeAllActions ( com.wiyun.engine.nodes.Node p0 ) {
} // .end method
public native void removeAllActions ( com.wiyun.engine.nodes.Node p0, Boolean p1 ) {
} // .end method
public void resumeAllActions ( com.wiyun.engine.nodes.Node p0 ) {
	 /* .locals 1 */
	 /* .param p1, "target" # Lcom/wiyun/engine/nodes/Node; */
	 /* .prologue */
	 /* .line 66 */
	 int v0 = 0; // const/4 v0, 0x0
	 (( com.wiyun.engine.nodes.ActionManager ) p0 ).resumeAllActions ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/wiyun/engine/nodes/ActionManager;->resumeAllActions(Lcom/wiyun/engine/nodes/Node;Z)V
	 /* .line 67 */
	 return;
} // .end method
public native void resumeAllActions ( com.wiyun.engine.nodes.Node p0, Boolean p1 ) {
} // .end method

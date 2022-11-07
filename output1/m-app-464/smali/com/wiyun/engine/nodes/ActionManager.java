public class com.wiyun.engine.nodes.ActionManager extends com.wiyun.engine.BaseWYObject {
	 /* # static fields */
	 private static com.wiyun.engine.nodes.ActionManager sInstance;
	 /* # direct methods */
	 static com.wiyun.engine.nodes.ActionManager ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 return;
	 } // .end method
	 private com.wiyun.engine.nodes.ActionManager ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/ActionManager;->nativeInit()V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.ActionManager getInstance ( ) {
		 /* .locals 3 */
		 /* const-class v1, Lcom/wiyun/engine/nodes/ActionManager; */
		 /* monitor-enter v1 */
		 try { // :try_start_0
			 v0 = com.wiyun.engine.nodes.ActionManager.sInstance;
			 /* if-nez v0, :cond_0 */
			 /* new-instance v0, Lcom/wiyun/engine/nodes/ActionManager; */
			 /* invoke-direct {v0}, Lcom/wiyun/engine/nodes/ActionManager;-><init>()V */
		 } // :goto_0
		 v0 = com.wiyun.engine.nodes.ActionManager.sInstance;
		 /* monitor-exit v1 */
	 } // :cond_0
	 v0 = com.wiyun.engine.nodes.ActionManager.sInstance;
	 v2 = 	 com.wiyun.engine.nodes.ActionManager .nativeGetInstance ( );
	 (( com.wiyun.engine.nodes.ActionManager ) v0 ).setPointer ( v2 ); // invoke-virtual {v0, v2}, Lcom/wiyun/engine/nodes/ActionManager;->setPointer(I)V
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit v1 */
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
	 int v0 = 0; // const/4 v0, 0x0
	 (( com.wiyun.engine.nodes.ActionManager ) p0 ).pauseAllActions ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/wiyun/engine/nodes/ActionManager;->pauseAllActions(Lcom/wiyun/engine/nodes/Node;Z)V
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
	 int v0 = 0; // const/4 v0, 0x0
	 (( com.wiyun.engine.nodes.ActionManager ) p0 ).resumeAllActions ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/wiyun/engine/nodes/ActionManager;->resumeAllActions(Lcom/wiyun/engine/nodes/Node;Z)V
	 return;
} // .end method
public native void resumeAllActions ( com.wiyun.engine.nodes.Node p0, Boolean p1 ) {
} // .end method

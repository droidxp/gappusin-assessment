public class com.wiyun.engine.actions.Action extends com.wiyun.engine.BaseWYObject implements com.wiyun.engine.types.ICopyable {
	 /* # interfaces */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.Action ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.Action ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/Action; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/Action;-><init>(I)V */
} // .end method
private native Integer nativeGetTarget ( ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.Action copy ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
(( com.wiyun.engine.actions.Action ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Action;->copy()Lcom/wiyun/engine/actions/Action;
} // .end method
public native Integer getTag ( ) {
} // .end method
public com.wiyun.engine.nodes.Node getTarget ( ) {
/* .locals 1 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/actions/Action;->nativeGetTarget()I */
com.wiyun.engine.nodes.Node .from ( v0 );
} // .end method
public Integer getTargetPointer ( ) {
/* .locals 1 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/actions/Action;->nativeGetTarget()I */
} // .end method
public native Boolean isDone ( ) {
} // .end method
public native Boolean isPaused ( ) {
} // .end method
public native Boolean isRunning ( ) {
} // .end method
protected native Integer nativeCopy ( ) {
} // .end method
protected native Integer nativeReverse ( ) {
} // .end method
public com.wiyun.engine.actions.Action reverse ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public native void setCallback ( com.wiyun.engine.actions.Action$Callback p0 ) {
} // .end method
public native void setTag ( Integer p0 ) {
} // .end method
public native void start ( com.wiyun.engine.nodes.Node p0 ) {
} // .end method
public native void step ( Float p0 ) {
} // .end method
public native void stop ( ) {
} // .end method
public native void update ( Float p0 ) {
} // .end method

public class com.wiyun.engine.transitions.TransitionScene extends com.wiyun.engine.nodes.Scene {
	 /* # direct methods */
	 protected com.wiyun.engine.transitions.TransitionScene ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Scene;-><init>()V */
		 return;
	 } // .end method
	 protected com.wiyun.engine.transitions.TransitionScene ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Scene;-><init>()V */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/transitions/TransitionScene;->nativeInit(FLcom/wiyun/engine/nodes/Scene;)V */
		 return;
	 } // .end method
	 protected com.wiyun.engine.transitions.TransitionScene ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Scene;-><init>(I)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.Scene from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.transitions.TransitionScene .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.transitions.TransitionScene from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/transitions/TransitionScene; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/transitions/TransitionScene;-><init>(I)V */
} // .end method
public static com.wiyun.engine.transitions.TransitionScene make ( Float p0, com.wiyun.engine.nodes.Scene p1 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/transitions/TransitionScene; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/transitions/TransitionScene;-><init>(FLcom/wiyun/engine/nodes/Scene;)V */
} // .end method
private native void nativeInit ( Float p0, com.wiyun.engine.nodes.Scene p1 ) {
} // .end method
/* # virtual methods */
protected void doNativeInit ( ) {
/* .locals 0 */
return;
} // .end method
public native Float getDuration ( ) {
} // .end method
protected com.wiyun.engine.actions.IntervalAction getInAction ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
protected com.wiyun.engine.nodes.Node getInActionTarget ( ) {
/* .locals 1 */
(( com.wiyun.engine.transitions.TransitionScene ) p0 ).getInScene ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/transitions/TransitionScene;->getInScene()Lcom/wiyun/engine/nodes/Scene;
} // .end method
public com.wiyun.engine.nodes.Scene getInScene ( ) {
/* .locals 1 */
v0 = (( com.wiyun.engine.transitions.TransitionScene ) p0 ).nativeGetInScene ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/transitions/TransitionScene;->nativeGetInScene()I
com.wiyun.engine.nodes.Scene .from ( v0 );
} // .end method
protected com.wiyun.engine.actions.IntervalAction getOutAction ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
protected com.wiyun.engine.nodes.Node getOutActionTarget ( ) {
/* .locals 1 */
(( com.wiyun.engine.transitions.TransitionScene ) p0 ).getOutScene ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/transitions/TransitionScene;->getOutScene()Lcom/wiyun/engine/nodes/Scene;
} // .end method
public com.wiyun.engine.nodes.Scene getOutScene ( ) {
/* .locals 1 */
v0 = (( com.wiyun.engine.transitions.TransitionScene ) p0 ).nativeGetOutScene ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/transitions/TransitionScene;->nativeGetOutScene()I
com.wiyun.engine.nodes.Scene .from ( v0 );
} // .end method
protected void initScenes ( ) {
/* .locals 0 */
return;
} // .end method
public native Integer nativeGetInScene ( ) {
} // .end method
public native Integer nativeGetOutScene ( ) {
} // .end method
protected void postFinish ( ) {
/* .locals 0 */
return;
} // .end method
public native void setFinishCallback ( com.wiyun.engine.utils.TargetSelector p0 ) {
} // .end method
public native void setInEaseAction ( com.wiyun.engine.actions.ease.EaseAction p0 ) {
} // .end method
public native void setInScene ( com.wiyun.engine.nodes.Scene p0 ) {
} // .end method
public native void setOutEaseAction ( com.wiyun.engine.actions.ease.EaseAction p0 ) {
} // .end method
public native void setOutScene ( com.wiyun.engine.nodes.Scene p0 ) {
} // .end method
protected Boolean shouldInSceneOnTop ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method

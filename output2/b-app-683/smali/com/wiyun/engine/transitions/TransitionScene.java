public class com.wiyun.engine.transitions.TransitionScene extends com.wiyun.engine.nodes.Scene {
	 /* .source "TransitionScene.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.transitions.TransitionScene ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 21 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Scene;-><init>()V */
		 /* .line 22 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.transitions.TransitionScene ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "inScene" # Lcom/wiyun/engine/nodes/Scene; */
		 /* .prologue */
		 /* .line 24 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Scene;-><init>()V */
		 /* .line 25 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/transitions/TransitionScene;->nativeInit(FLcom/wiyun/engine/nodes/Scene;)V */
		 /* .line 26 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.transitions.TransitionScene ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 31 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Scene;-><init>(I)V */
		 /* .line 32 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.Scene from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.transitions.TransitionScene .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.transitions.TransitionScene from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 18 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/transitions/TransitionScene; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/transitions/TransitionScene;-><init>(I)V */
} // .end method
public static com.wiyun.engine.transitions.TransitionScene make ( Float p0, com.wiyun.engine.nodes.Scene p1 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "inScene" # Lcom/wiyun/engine/nodes/Scene; */
/* .prologue */
/* .line 14 */
/* new-instance v0, Lcom/wiyun/engine/transitions/TransitionScene; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/transitions/TransitionScene;-><init>(FLcom/wiyun/engine/nodes/Scene;)V */
} // .end method
private native void nativeInit ( Float p0, com.wiyun.engine.nodes.Scene p1 ) {
} // .end method
/* # virtual methods */
protected void doNativeInit ( ) {
/* .locals 0 */
/* .prologue */
/* .line 36 */
return;
} // .end method
public native Float getDuration ( ) {
} // .end method
protected com.wiyun.engine.actions.IntervalAction getInAction ( ) {
/* .locals 1 */
/* .prologue */
/* .line 96 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
protected com.wiyun.engine.nodes.Node getInActionTarget ( ) {
/* .locals 1 */
/* .prologue */
/* .line 79 */
(( com.wiyun.engine.transitions.TransitionScene ) p0 ).getInScene ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/transitions/TransitionScene;->getInScene()Lcom/wiyun/engine/nodes/Scene;
} // .end method
public com.wiyun.engine.nodes.Scene getInScene ( ) {
/* .locals 1 */
/* .prologue */
/* .line 41 */
v0 = (( com.wiyun.engine.transitions.TransitionScene ) p0 ).nativeGetInScene ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/transitions/TransitionScene;->nativeGetInScene()I
com.wiyun.engine.nodes.Scene .from ( v0 );
} // .end method
protected com.wiyun.engine.actions.IntervalAction getOutAction ( ) {
/* .locals 1 */
/* .prologue */
/* .line 103 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
protected com.wiyun.engine.nodes.Node getOutActionTarget ( ) {
/* .locals 1 */
/* .prologue */
/* .line 89 */
(( com.wiyun.engine.transitions.TransitionScene ) p0 ).getOutScene ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/transitions/TransitionScene;->getOutScene()Lcom/wiyun/engine/nodes/Scene;
} // .end method
public com.wiyun.engine.nodes.Scene getOutScene ( ) {
/* .locals 1 */
/* .prologue */
/* .line 54 */
v0 = (( com.wiyun.engine.transitions.TransitionScene ) p0 ).nativeGetOutScene ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/transitions/TransitionScene;->nativeGetOutScene()I
com.wiyun.engine.nodes.Scene .from ( v0 );
} // .end method
protected void initScenes ( ) {
/* .locals 0 */
/* .prologue */
/* .line 70 */
return;
} // .end method
public native Integer nativeGetInScene ( ) {
} // .end method
public native Integer nativeGetOutScene ( ) {
} // .end method
protected void postFinish ( ) {
/* .locals 0 */
/* .prologue */
/* .line 129 */
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
/* .prologue */
/* .line 138 */
int v0 = 1; // const/4 v0, 0x1
} // .end method

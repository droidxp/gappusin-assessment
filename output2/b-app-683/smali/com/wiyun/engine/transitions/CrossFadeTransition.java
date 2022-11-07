public class com.wiyun.engine.transitions.CrossFadeTransition extends com.wiyun.engine.transitions.TransitionScene {
	 /* .source "CrossFadeTransition.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.transitions.CrossFadeTransition ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "inScene" # Lcom/wiyun/engine/nodes/Scene; */
		 /* .prologue */
		 /* .line 26 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/transitions/TransitionScene;-><init>()V */
		 /* .line 27 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/transitions/CrossFadeTransition;->nativeInit(FLcom/wiyun/engine/nodes/Scene;)V */
		 /* .line 28 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.transitions.CrossFadeTransition ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 41 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/transitions/TransitionScene;-><init>(I)V */
		 /* .line 42 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.transitions.CrossFadeTransition from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 37 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/transitions/CrossFadeTransition; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/transitions/CrossFadeTransition;-><init>(I)V */
} // .end method
public static com.wiyun.engine.transitions.TransitionScene from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.transitions.CrossFadeTransition .from ( p0 );
} // .end method
public static com.wiyun.engine.transitions.CrossFadeTransition make ( Float p0, com.wiyun.engine.nodes.Scene p1 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "inScene" # Lcom/wiyun/engine/nodes/Scene; */
/* .prologue */
/* .line 20 */
/* new-instance v0, Lcom/wiyun/engine/transitions/CrossFadeTransition; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/transitions/CrossFadeTransition;-><init>(FLcom/wiyun/engine/nodes/Scene;)V */
} // .end method
public static com.wiyun.engine.transitions.TransitionScene make ( Float p0, com.wiyun.engine.nodes.Scene p1 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.transitions.CrossFadeTransition .make ( p0,p1 );
} // .end method
private native void nativeInit ( Float p0, com.wiyun.engine.nodes.Scene p1 ) {
} // .end method

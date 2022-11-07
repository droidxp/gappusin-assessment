public class com.wiyun.engine.transitions.ClipInTransition extends com.wiyun.engine.transitions.TransitionScene {
	 /* .source "ClipInTransition.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.transitions.ClipInTransition ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "inScene" # Lcom/wiyun/engine/nodes/Scene; */
		 /* .param p3, "direction" # I */
		 /* .prologue */
		 /* .line 34 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/transitions/TransitionScene;-><init>()V */
		 /* .line 35 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/transitions/ClipInTransition;->nativeInit(FLcom/wiyun/engine/nodes/Scene;I)V */
		 /* .line 36 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.transitions.ClipInTransition ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 43 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/transitions/TransitionScene;-><init>(I)V */
		 /* .line 44 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.transitions.ClipInTransition from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 39 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/transitions/ClipInTransition; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/transitions/ClipInTransition;-><init>(I)V */
} // .end method
public static com.wiyun.engine.transitions.TransitionScene from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.transitions.ClipInTransition .from ( p0 );
} // .end method
public static com.wiyun.engine.transitions.ClipInTransition make ( Float p0, com.wiyun.engine.nodes.Scene p1, Integer p2 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "inScene" # Lcom/wiyun/engine/nodes/Scene; */
/* .param p2, "direction" # I */
/* .prologue */
/* .line 31 */
/* new-instance v0, Lcom/wiyun/engine/transitions/ClipInTransition; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/transitions/ClipInTransition;-><init>(FLcom/wiyun/engine/nodes/Scene;I)V */
} // .end method
private native void nativeInit ( Float p0, com.wiyun.engine.nodes.Scene p1, Integer p2 ) {
} // .end method

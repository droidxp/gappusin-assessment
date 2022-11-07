public class com.wiyun.engine.transitions.FlipYTransition extends com.wiyun.engine.transitions.TransitionScene {
	 /* .source "FlipYTransition.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.transitions.FlipYTransition ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "inScene" # Lcom/wiyun/engine/nodes/Scene; */
		 /* .param p3, "toTop" # Z */
		 /* .prologue */
		 /* .line 24 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/transitions/TransitionScene;-><init>()V */
		 /* .line 25 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/transitions/FlipYTransition;->nativeInit(FLcom/wiyun/engine/nodes/Scene;Z)V */
		 /* .line 26 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.transitions.FlipYTransition ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 39 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/transitions/TransitionScene;-><init>(I)V */
		 /* .line 40 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.transitions.FlipYTransition from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 35 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/transitions/FlipYTransition; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/transitions/FlipYTransition;-><init>(I)V */
} // .end method
public static com.wiyun.engine.transitions.TransitionScene from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.transitions.FlipYTransition .from ( p0 );
} // .end method
public static com.wiyun.engine.transitions.FlipYTransition make ( Float p0, com.wiyun.engine.nodes.Scene p1, Boolean p2 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "inScene" # Lcom/wiyun/engine/nodes/Scene; */
/* .param p2, "toTop" # Z */
/* .prologue */
/* .line 21 */
/* new-instance v0, Lcom/wiyun/engine/transitions/FlipYTransition; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/transitions/FlipYTransition;-><init>(FLcom/wiyun/engine/nodes/Scene;Z)V */
} // .end method
private native void nativeInit ( Float p0, com.wiyun.engine.nodes.Scene p1, Boolean p2 ) {
} // .end method

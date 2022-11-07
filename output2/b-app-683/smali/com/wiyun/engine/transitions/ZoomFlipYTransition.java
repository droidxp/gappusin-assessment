public class com.wiyun.engine.transitions.ZoomFlipYTransition extends com.wiyun.engine.transitions.TransitionScene {
	 /* .source "ZoomFlipYTransition.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.transitions.ZoomFlipYTransition ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "inScene" # Lcom/wiyun/engine/nodes/Scene; */
		 /* .param p3, "toTop" # Z */
		 /* .param p4, "scale" # F */
		 /* .prologue */
		 /* .line 25 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/transitions/TransitionScene;-><init>()V */
		 /* .line 26 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lcom/wiyun/engine/transitions/ZoomFlipYTransition;->nativeInit(FLcom/wiyun/engine/nodes/Scene;ZF)V */
		 /* .line 27 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.transitions.ZoomFlipYTransition ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 40 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/transitions/TransitionScene;-><init>(I)V */
		 /* .line 41 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.transitions.TransitionScene from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.transitions.ZoomFlipYTransition .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.transitions.ZoomFlipYTransition from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 36 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/transitions/ZoomFlipYTransition; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/transitions/ZoomFlipYTransition;-><init>(I)V */
} // .end method
public static com.wiyun.engine.transitions.ZoomFlipYTransition make ( Float p0, com.wiyun.engine.nodes.Scene p1, Boolean p2, Float p3 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "inScene" # Lcom/wiyun/engine/nodes/Scene; */
/* .param p2, "toTop" # Z */
/* .param p3, "scale" # F */
/* .prologue */
/* .line 22 */
/* new-instance v0, Lcom/wiyun/engine/transitions/ZoomFlipYTransition; */
/* invoke-direct {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/transitions/ZoomFlipYTransition;-><init>(FLcom/wiyun/engine/nodes/Scene;ZF)V */
} // .end method
private native void nativeInit ( Float p0, com.wiyun.engine.nodes.Scene p1, Boolean p2, Float p3 ) {
} // .end method

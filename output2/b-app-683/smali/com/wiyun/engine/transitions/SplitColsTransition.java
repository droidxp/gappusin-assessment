public class com.wiyun.engine.transitions.SplitColsTransition extends com.wiyun.engine.transitions.TransitionScene {
	 /* .source "SplitColsTransition.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.transitions.SplitColsTransition ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "inScene" # Lcom/wiyun/engine/nodes/Scene; */
		 /* .param p3, "cols" # I */
		 /* .prologue */
		 /* .line 24 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/transitions/TransitionScene;-><init>()V */
		 /* .line 25 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/transitions/SplitColsTransition;->nativeInit(FLcom/wiyun/engine/nodes/Scene;I)V */
		 /* .line 26 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.transitions.SplitColsTransition ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 39 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/transitions/TransitionScene;-><init>(I)V */
		 /* .line 40 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.transitions.SplitColsTransition from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 35 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/transitions/SplitColsTransition; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/transitions/SplitColsTransition;-><init>(I)V */
} // .end method
public static com.wiyun.engine.transitions.TransitionScene from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.transitions.SplitColsTransition .from ( p0 );
} // .end method
public static com.wiyun.engine.transitions.SplitColsTransition make ( Float p0, com.wiyun.engine.nodes.Scene p1, Integer p2 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "inScene" # Lcom/wiyun/engine/nodes/Scene; */
/* .param p2, "cols" # I */
/* .prologue */
/* .line 21 */
/* new-instance v0, Lcom/wiyun/engine/transitions/SplitColsTransition; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/transitions/SplitColsTransition;-><init>(FLcom/wiyun/engine/nodes/Scene;I)V */
} // .end method
private native void nativeInit ( Float p0, com.wiyun.engine.nodes.Scene p1, Integer p2 ) {
} // .end method

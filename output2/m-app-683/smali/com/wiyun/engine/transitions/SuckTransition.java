public class com.wiyun.engine.transitions.SuckTransition extends com.wiyun.engine.transitions.TransitionScene {
	 /* .source "SuckTransition.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.transitions.SuckTransition ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "inScene" # Lcom/wiyun/engine/nodes/Scene; */
		 /* .param p3, "suckX" # F */
		 /* .param p4, "suckY" # F */
		 /* .prologue */
		 /* .line 42 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/transitions/TransitionScene;-><init>()V */
		 /* .line 43 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lcom/wiyun/engine/transitions/SuckTransition;->nativeInit(FLcom/wiyun/engine/nodes/Scene;FF)V */
		 /* .line 44 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.transitions.SuckTransition ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 57 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/transitions/TransitionScene;-><init>(I)V */
		 /* .line 58 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.transitions.SuckTransition from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 53 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/transitions/SuckTransition; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/transitions/SuckTransition;-><init>(I)V */
} // .end method
public static com.wiyun.engine.transitions.TransitionScene from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.transitions.SuckTransition .from ( p0 );
} // .end method
public static com.wiyun.engine.transitions.SuckTransition make ( Float p0, com.wiyun.engine.nodes.Scene p1, Float p2, Float p3 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "inScene" # Lcom/wiyun/engine/nodes/Scene; */
/* .param p2, "suckX" # F */
/* .param p3, "suckY" # F */
/* .prologue */
/* .line 39 */
/* new-instance v0, Lcom/wiyun/engine/transitions/SuckTransition; */
/* invoke-direct {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/transitions/SuckTransition;-><init>(FLcom/wiyun/engine/nodes/Scene;FF)V */
} // .end method
private native void nativeInit ( Float p0, com.wiyun.engine.nodes.Scene p1, Float p2, Float p3 ) {
} // .end method

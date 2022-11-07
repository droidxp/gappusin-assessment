public class com.wiyun.engine.transitions.LeftSlideInTransition extends com.wiyun.engine.transitions.TransitionScene {
	 /* .source "LeftSlideInTransition.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.transitions.LeftSlideInTransition ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "inScene" # Lcom/wiyun/engine/nodes/Scene; */
		 /* .prologue */
		 /* .line 23 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/transitions/TransitionScene;-><init>()V */
		 /* .line 24 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/transitions/LeftSlideInTransition;->nativeInit(FLcom/wiyun/engine/nodes/Scene;)V */
		 /* .line 25 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.transitions.LeftSlideInTransition ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 38 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/transitions/TransitionScene;-><init>(I)V */
		 /* .line 39 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.transitions.LeftSlideInTransition from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 34 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/transitions/LeftSlideInTransition; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/transitions/LeftSlideInTransition;-><init>(I)V */
} // .end method
public static com.wiyun.engine.transitions.TransitionScene from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.transitions.LeftSlideInTransition .from ( p0 );
} // .end method
public static com.wiyun.engine.transitions.LeftSlideInTransition make ( Float p0, com.wiyun.engine.nodes.Scene p1 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "inScene" # Lcom/wiyun/engine/nodes/Scene; */
/* .prologue */
/* .line 20 */
/* new-instance v0, Lcom/wiyun/engine/transitions/LeftSlideInTransition; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/transitions/LeftSlideInTransition;-><init>(FLcom/wiyun/engine/nodes/Scene;)V */
} // .end method
public static com.wiyun.engine.transitions.TransitionScene make ( Float p0, com.wiyun.engine.nodes.Scene p1 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.transitions.LeftSlideInTransition .make ( p0,p1 );
} // .end method
private native void nativeInit ( Float p0, com.wiyun.engine.nodes.Scene p1 ) {
} // .end method

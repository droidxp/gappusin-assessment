public class com.wiyun.engine.transitions.TurnOffTilesTransition extends com.wiyun.engine.transitions.TransitionScene {
	 /* .source "TurnOffTilesTransition.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.transitions.TurnOffTilesTransition ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "inScene" # Lcom/wiyun/engine/nodes/Scene; */
		 /* .param p3, "rows" # I */
		 /* .param p4, "cols" # I */
		 /* .prologue */
		 /* .line 39 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/transitions/TransitionScene;-><init>()V */
		 /* .line 40 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lcom/wiyun/engine/transitions/TurnOffTilesTransition;->nativeInit(FLcom/wiyun/engine/nodes/Scene;II)V */
		 /* .line 41 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.transitions.TurnOffTilesTransition ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 54 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/transitions/TransitionScene;-><init>(I)V */
		 /* .line 55 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.transitions.TransitionScene from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.transitions.TurnOffTilesTransition .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.transitions.TurnOffTilesTransition from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 50 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/transitions/TurnOffTilesTransition; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/transitions/TurnOffTilesTransition;-><init>(I)V */
} // .end method
public static com.wiyun.engine.transitions.TransitionScene make ( Float p0, com.wiyun.engine.nodes.Scene p1 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.transitions.TurnOffTilesTransition .make ( p0,p1 );
} // .end method
public static com.wiyun.engine.transitions.TurnOffTilesTransition make ( Float p0, com.wiyun.engine.nodes.Scene p1 ) {
/* .locals 2 */
/* .param p0, "duration" # F */
/* .param p1, "inScene" # Lcom/wiyun/engine/nodes/Scene; */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 20 */
/* new-instance v0, Lcom/wiyun/engine/transitions/TurnOffTilesTransition; */
/* invoke-direct {v0, p0, p1, v1, v1}, Lcom/wiyun/engine/transitions/TurnOffTilesTransition;-><init>(FLcom/wiyun/engine/nodes/Scene;II)V */
} // .end method
public static com.wiyun.engine.transitions.TurnOffTilesTransition make ( Float p0, com.wiyun.engine.nodes.Scene p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "inScene" # Lcom/wiyun/engine/nodes/Scene; */
/* .param p2, "rows" # I */
/* .param p3, "cols" # I */
/* .prologue */
/* .line 36 */
/* new-instance v0, Lcom/wiyun/engine/transitions/TurnOffTilesTransition; */
/* invoke-direct {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/transitions/TurnOffTilesTransition;-><init>(FLcom/wiyun/engine/nodes/Scene;II)V */
} // .end method
private native void nativeInit ( Float p0, com.wiyun.engine.nodes.Scene p1, Integer p2, Integer p3 ) {
} // .end method

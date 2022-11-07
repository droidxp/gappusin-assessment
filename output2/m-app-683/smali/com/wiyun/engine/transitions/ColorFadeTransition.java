public class com.wiyun.engine.transitions.ColorFadeTransition extends com.wiyun.engine.transitions.TransitionScene {
	 /* .source "ColorFadeTransition.java" */
	 /* # direct methods */
	 public com.wiyun.engine.transitions.ColorFadeTransition ( ) {
		 /* .locals 2 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "inScene" # Lcom/wiyun/engine/nodes/Scene; */
		 /* .prologue */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 52 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
		 /* invoke-direct {v0, v1, v1, v1}, Lcom/wiyun/engine/types/WYColor3B;-><init>(III)V */
		 /* invoke-direct {p0, p1, p2, v0}, Lcom/wiyun/engine/transitions/ColorFadeTransition;-><init>(FLcom/wiyun/engine/nodes/Scene;Lcom/wiyun/engine/types/WYColor3B;)V */
		 /* .line 53 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.transitions.ColorFadeTransition ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "inScene" # Lcom/wiyun/engine/nodes/Scene; */
		 /* .param p3, "rgb" # Lcom/wiyun/engine/types/WYColor3B; */
		 /* .prologue */
		 /* .line 28 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/transitions/TransitionScene;-><init>()V */
		 /* .line 29 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/transitions/ColorFadeTransition;->nativeInit(FLcom/wiyun/engine/nodes/Scene;Lcom/wiyun/engine/types/WYColor3B;)V */
		 /* .line 30 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.transitions.ColorFadeTransition ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 43 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/transitions/TransitionScene;-><init>(I)V */
		 /* .line 44 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.transitions.ColorFadeTransition from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 39 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/transitions/ColorFadeTransition; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/transitions/ColorFadeTransition;-><init>(I)V */
} // .end method
public static com.wiyun.engine.transitions.TransitionScene from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.transitions.ColorFadeTransition .from ( p0 );
} // .end method
public static com.wiyun.engine.transitions.ColorFadeTransition make ( Float p0, com.wiyun.engine.nodes.Scene p1, com.wiyun.engine.types.WYColor3B p2 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "inScene" # Lcom/wiyun/engine/nodes/Scene; */
/* .param p2, "rgb" # Lcom/wiyun/engine/types/WYColor3B; */
/* .prologue */
/* .line 22 */
/* new-instance v0, Lcom/wiyun/engine/transitions/ColorFadeTransition; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/transitions/ColorFadeTransition;-><init>(FLcom/wiyun/engine/nodes/Scene;Lcom/wiyun/engine/types/WYColor3B;)V */
} // .end method
private native void nativeInit ( Float p0, com.wiyun.engine.nodes.Scene p1, com.wiyun.engine.types.WYColor3B p2 ) {
} // .end method

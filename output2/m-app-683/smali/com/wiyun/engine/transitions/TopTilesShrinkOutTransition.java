public class com.wiyun.engine.transitions.TopTilesShrinkOutTransition extends com.wiyun.engine.transitions.TransitionScene {
	 /* .source "TopTilesShrinkOutTransition.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.transitions.TopTilesShrinkOutTransition ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "inScene" # Lcom/wiyun/engine/nodes/Scene; */
		 /* .param p3, "rows" # I */
		 /* .param p4, "cols" # I */
		 /* .prologue */
		 /* .line 47 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/transitions/TransitionScene;-><init>()V */
		 /* .line 48 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lcom/wiyun/engine/transitions/TopTilesShrinkOutTransition;->nativeInit(FLcom/wiyun/engine/nodes/Scene;II)V */
		 /* .line 49 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.transitions.TopTilesShrinkOutTransition ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 62 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/transitions/TransitionScene;-><init>(I)V */
		 /* .line 63 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.transitions.TopTilesShrinkOutTransition from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 58 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/transitions/TopTilesShrinkOutTransition; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/transitions/TopTilesShrinkOutTransition;-><init>(I)V */
} // .end method
public static com.wiyun.engine.transitions.TransitionScene from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.transitions.TopTilesShrinkOutTransition .from ( p0 );
} // .end method
public static com.wiyun.engine.transitions.TopTilesShrinkOutTransition make ( Float p0, com.wiyun.engine.nodes.Scene p1 ) {
/* .locals 2 */
/* .param p0, "duration" # F */
/* .param p1, "inScene" # Lcom/wiyun/engine/nodes/Scene; */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 20 */
/* new-instance v0, Lcom/wiyun/engine/transitions/TopTilesShrinkOutTransition; */
/* invoke-direct {v0, p0, p1, v1, v1}, Lcom/wiyun/engine/transitions/TopTilesShrinkOutTransition;-><init>(FLcom/wiyun/engine/nodes/Scene;II)V */
} // .end method
public static com.wiyun.engine.transitions.TopTilesShrinkOutTransition make ( Float p0, com.wiyun.engine.nodes.Scene p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "inScene" # Lcom/wiyun/engine/nodes/Scene; */
/* .param p2, "rows" # I */
/* .param p3, "cols" # I */
/* .prologue */
/* .line 36 */
/* new-instance v0, Lcom/wiyun/engine/transitions/TopTilesShrinkOutTransition; */
/* invoke-direct {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/transitions/TopTilesShrinkOutTransition;-><init>(FLcom/wiyun/engine/nodes/Scene;II)V */
} // .end method
public static com.wiyun.engine.transitions.TransitionScene make ( Float p0, com.wiyun.engine.nodes.Scene p1 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.transitions.TopTilesShrinkOutTransition .make ( p0,p1 );
} // .end method
private native void nativeInit ( Float p0, com.wiyun.engine.nodes.Scene p1, Integer p2, Integer p3 ) {
} // .end method

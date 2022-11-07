public class com.wiyun.engine.astar.AStarStep extends com.wiyun.engine.BaseWYObject {
	 /* .source "AStarStep.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.astar.AStarStep ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 28 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
		 /* .line 29 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.astar.AStarStep ( ) {
		 /* .locals 0 */
		 /* .param p1, "x" # I */
		 /* .param p2, "y" # I */
		 /* .prologue */
		 /* .line 19 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 20 */
		 (( com.wiyun.engine.astar.AStarStep ) p0 ).doNativeInit ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/wiyun/engine/astar/AStarStep;->doNativeInit(II)V
		 /* .line 21 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.astar.AStarStep from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 24 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/astar/AStarStep; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/astar/AStarStep;-><init>(I)V */
} // .end method
public static com.wiyun.engine.astar.AStarStep make ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .param p0, "x" # I */
/* .param p1, "y" # I */
/* .prologue */
/* .line 16 */
/* new-instance v0, Lcom/wiyun/engine/astar/AStarStep; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/astar/AStarStep;-><init>(II)V */
} // .end method
private native void nativeInit ( Integer p0, Integer p1 ) {
} // .end method
/* # virtual methods */
protected void doNativeInit ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* .param p1, "x" # I */
/* .param p2, "y" # I */
/* .prologue */
/* .line 32 */
/* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/astar/AStarStep;->nativeInit(II)V */
/* .line 33 */
return;
} // .end method
public native final Float getF ( ) {
} // .end method
public native final Float getG ( ) {
} // .end method
public native final Float getH ( ) {
} // .end method
public native final Integer getX ( ) {
} // .end method
public native final Integer getY ( ) {
} // .end method
public native final void setF ( Float p0 ) {
} // .end method
public native final void setG ( Float p0 ) {
} // .end method
public native final void setH ( Float p0 ) {
} // .end method
public native final void setX ( Integer p0 ) {
} // .end method
public native final void setY ( Integer p0 ) {
} // .end method

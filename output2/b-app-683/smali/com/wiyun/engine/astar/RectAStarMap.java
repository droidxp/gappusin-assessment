public class com.wiyun.engine.astar.RectAStarMap extends com.wiyun.engine.astar.AStarMap {
	 /* .source "RectAStarMap.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.astar.RectAStarMap ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 27 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/astar/AStarMap;-><init>(I)V */
		 /* .line 28 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.astar.RectAStarMap ( ) {
		 /* .locals 0 */
		 /* .param p1, "width" # I */
		 /* .param p2, "height" # I */
		 /* .param p3, "isAllowDiagonal" # Z */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/astar/AStarMap;-><init>()V */
		 /* .line 19 */
		 (( com.wiyun.engine.astar.RectAStarMap ) p0 ).doNativeInit ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/wiyun/engine/astar/RectAStarMap;->doNativeInit(IIZ)V
		 /* .line 20 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.astar.RectAStarMap from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 23 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/astar/RectAStarMap; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/astar/RectAStarMap;-><init>(I)V */
} // .end method
public static com.wiyun.engine.astar.RectAStarMap make ( Integer p0, Integer p1, Boolean p2 ) {
/* .locals 1 */
/* .param p0, "width" # I */
/* .param p1, "height" # I */
/* .param p2, "isAllowDiagonal" # Z */
/* .prologue */
/* .line 15 */
/* new-instance v0, Lcom/wiyun/engine/astar/RectAStarMap; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/astar/RectAStarMap;-><init>(IIZ)V */
} // .end method
private native void nativeInit ( Integer p0, Integer p1, Boolean p2 ) {
} // .end method
/* # virtual methods */
protected void doNativeInit ( Integer p0, Integer p1, Boolean p2 ) {
/* .locals 0 */
/* .param p1, "width" # I */
/* .param p2, "height" # I */
/* .param p3, "isAllowDiagonal" # Z */
/* .prologue */
/* .line 31 */
/* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/astar/RectAStarMap;->nativeInit(IIZ)V */
/* .line 32 */
return;
} // .end method

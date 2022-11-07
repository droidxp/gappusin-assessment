public class com.wiyun.engine.astar.HexagonAStarMap extends com.wiyun.engine.astar.AStarMap {
	 /* .source "HexagonAStarMap.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.astar.HexagonAStarMap ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 26 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/astar/AStarMap;-><init>(I)V */
		 /* .line 27 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.astar.HexagonAStarMap ( ) {
		 /* .locals 0 */
		 /* .param p1, "width" # I */
		 /* .param p2, "height" # I */
		 /* .prologue */
		 /* .line 17 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/astar/AStarMap;-><init>()V */
		 /* .line 18 */
		 (( com.wiyun.engine.astar.HexagonAStarMap ) p0 ).doNativeInit ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/wiyun/engine/astar/HexagonAStarMap;->doNativeInit(II)V
		 /* .line 19 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.astar.RectAStarMap from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 22 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/astar/RectAStarMap; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/astar/RectAStarMap;-><init>(I)V */
} // .end method
public static com.wiyun.engine.astar.HexagonAStarMap make ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .param p0, "width" # I */
/* .param p1, "height" # I */
/* .prologue */
/* .line 14 */
/* new-instance v0, Lcom/wiyun/engine/astar/HexagonAStarMap; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/astar/HexagonAStarMap;-><init>(II)V */
} // .end method
private native void nativeInit ( Integer p0, Integer p1 ) {
} // .end method
/* # virtual methods */
protected void doNativeInit ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* .param p1, "width" # I */
/* .param p2, "height" # I */
/* .prologue */
/* .line 30 */
/* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/astar/HexagonAStarMap;->nativeInit(II)V */
/* .line 31 */
return;
} // .end method

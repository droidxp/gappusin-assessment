public class com.wiyun.engine.astar.AStarMap extends com.wiyun.engine.BaseWYObject {
	 /* .source "AStarMap.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.astar.AStarMap ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 9 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 10 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.astar.AStarMap ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 13 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
		 /* .line 14 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public native final void blockTile ( Integer p0, Integer p1 ) {
	 } // .end method
	 public native final void freeTile ( Integer p0, Integer p1 ) {
	 } // .end method
	 public native Float getStepG ( com.wiyun.engine.astar.AStarTile p0, com.wiyun.engine.astar.AStarTile p1 ) {
	 } // .end method
	 public final com.wiyun.engine.astar.AStarTile getTileAt ( Integer p0, Integer p1 ) {
		 /* .locals 2 */
		 /* .param p1, "x" # I */
		 /* .param p2, "y" # I */
		 /* .prologue */
		 /* .line 49 */
		 v0 = 		 (( com.wiyun.engine.astar.AStarMap ) p0 ).nativeGetTileAt ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/wiyun/engine/astar/AStarMap;->nativeGetTileAt(II)I
		 /* .line 50 */
		 /* .local v0, "pointer":I */
		 /* new-instance v1, Lcom/wiyun/engine/astar/AStarTile; */
		 /* invoke-direct {v1, v0}, Lcom/wiyun/engine/astar/AStarTile;-><init>(I)V */
	 } // .end method
	 public native final Boolean isBlockedAt ( Integer p0, Integer p1 ) {
	 } // .end method
	 public native Boolean isValidTile ( Integer p0, Integer p1 ) {
	 } // .end method
	 public native final Integer nativeGetTileAt ( Integer p0, Integer p1 ) {
	 } // .end method

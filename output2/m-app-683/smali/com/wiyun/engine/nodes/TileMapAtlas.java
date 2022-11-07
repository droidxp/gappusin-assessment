public abstract class com.wiyun.engine.nodes.TileMapAtlas extends com.wiyun.engine.nodes.AtlasNode {
	 /* .source "TileMapAtlas.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.TileMapAtlas ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 10 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/AtlasNode;-><init>()V */
		 /* .line 11 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.TileMapAtlas ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 14 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/AtlasNode;-><init>(I)V */
		 /* .line 15 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.TileMapAtlas ( ) {
		 /* .locals 0 */
		 /* .param p1, "texture" # Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .param p2, "tileWidth" # I */
		 /* .param p3, "tileHeight" # I */
		 /* .prologue */
		 /* .line 24 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/AtlasNode;-><init>()V */
		 /* .line 25 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public native Integer getHorizontalTileCount ( ) {
	 } // .end method
	 public native final Integer getTile ( Integer p0, Integer p1 ) {
	 } // .end method
	 public final Integer getTile ( com.wiyun.engine.types.WYGridSize p0 ) {
		 /* .locals 2 */
		 /* .param p1, "pos" # Lcom/wiyun/engine/types/WYGridSize; */
		 /* .prologue */
		 /* .line 69 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYGridSize;->x:I */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYGridSize;->y:I */
		 v0 = 		 (( com.wiyun.engine.nodes.TileMapAtlas ) p0 ).getTile ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/nodes/TileMapAtlas;->getTile(II)I
	 } // .end method
	 public native Integer getVerticalTileCount ( ) {
	 } // .end method
	 public native Boolean hasTileAt ( Integer p0, Integer p1 ) {
	 } // .end method
	 public native void setTile ( Integer p0, Integer p1, Integer p2 ) {
	 } // .end method
	 public void setTile ( Integer p0, com.wiyun.engine.types.WYGridSize p1 ) {
		 /* .locals 2 */
		 /* .param p1, "tileValue" # I */
		 /* .param p2, "pos" # Lcom/wiyun/engine/types/WYGridSize; */
		 /* .prologue */
		 /* .line 79 */
		 /* iget v0, p2, Lcom/wiyun/engine/types/WYGridSize;->x:I */
		 /* iget v1, p2, Lcom/wiyun/engine/types/WYGridSize;->y:I */
		 (( com.wiyun.engine.nodes.TileMapAtlas ) p0 ).setTile ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Lcom/wiyun/engine/nodes/TileMapAtlas;->setTile(III)V
		 /* .line 80 */
		 return;
	 } // .end method
	 public native Integer tileValueAt ( Integer p0, Integer p1 ) {
	 } // .end method

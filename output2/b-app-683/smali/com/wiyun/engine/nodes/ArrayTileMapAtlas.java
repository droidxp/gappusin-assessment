public class com.wiyun.engine.nodes.ArrayTileMapAtlas extends com.wiyun.engine.nodes.TileMapAtlas {
	 /* .source "ArrayTileMapAtlas.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.ArrayTileMapAtlas ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 49 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/TileMapAtlas;-><init>(I)V */
		 /* .line 50 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.ArrayTileMapAtlas ( ) {
		 /* .locals 0 */
		 /* .param p1, "texture" # Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .param p2, "tileWidth" # I */
		 /* .param p3, "tileHeight" # I */
		 /* .param p4, "xTiles" # I */
		 /* .param p5, "yTiles" # I */
		 /* .prologue */
		 /* .line 34 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/TileMapAtlas;-><init>()V */
		 /* .line 35 */
		 /* invoke-direct/range {p0 ..p5}, Lcom/wiyun/engine/nodes/ArrayTileMapAtlas;->nativeInit(Lcom/wiyun/engine/opengl/Texture2D;IIII)V */
		 /* .line 36 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.ArrayTileMapAtlas from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 45 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/ArrayTileMapAtlas; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/ArrayTileMapAtlas;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.nodes.ArrayTileMapAtlas .from ( p0 );
} // .end method
public static com.wiyun.engine.nodes.ArrayTileMapAtlas make ( com.wiyun.engine.opengl.Texture2D p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 6 */
/* .param p0, "texture" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .param p1, "tileWidth" # I */
/* .param p2, "tileHeight" # I */
/* .param p3, "xTiles" # I */
/* .param p4, "yTiles" # I */
/* .prologue */
/* .line 22 */
/* new-instance v0, Lcom/wiyun/engine/nodes/ArrayTileMapAtlas; */
/* move-object v1, p0 */
/* move v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/nodes/ArrayTileMapAtlas;-><init>(Lcom/wiyun/engine/opengl/Texture2D;IIII)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.opengl.Texture2D p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
} // .end method
/* # virtual methods */
public native void setTiles ( Integer[] p0 ) {
} // .end method

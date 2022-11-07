public class com.wiyun.engine.nodes.TGATileMapAtlas extends com.wiyun.engine.nodes.TileMapAtlas {
	 /* .source "TGATileMapAtlas.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.TGATileMapAtlas ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 45 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/TileMapAtlas;-><init>(I)V */
		 /* .line 46 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.TGATileMapAtlas ( ) {
		 /* .locals 0 */
		 /* .param p1, "texture" # Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .param p2, "mapResId" # I */
		 /* .param p3, "tileWidth" # I */
		 /* .param p4, "tileHeight" # I */
		 /* .prologue */
		 /* .line 30 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/TileMapAtlas;-><init>()V */
		 /* .line 31 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lcom/wiyun/engine/nodes/TGATileMapAtlas;->nativeInit(Lcom/wiyun/engine/opengl/Texture2D;III)V */
		 /* .line 32 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.nodes.TGATileMapAtlas .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.nodes.TGATileMapAtlas from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 41 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/TGATileMapAtlas; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/TGATileMapAtlas;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.TGATileMapAtlas make ( com.wiyun.engine.opengl.Texture2D p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .param p0, "texture" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .param p1, "mapResId" # I */
/* .param p2, "tileWidth" # I */
/* .param p3, "tileHeight" # I */
/* .prologue */
/* .line 19 */
/* new-instance v0, Lcom/wiyun/engine/nodes/TGATileMapAtlas; */
/* invoke-direct {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/nodes/TGATileMapAtlas;-><init>(Lcom/wiyun/engine/opengl/Texture2D;III)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.opengl.Texture2D p0, Integer p1, Integer p2, Integer p3 ) {
} // .end method

public class com.wiyun.engine.tmx.TMXLayer extends com.wiyun.engine.nodes.SpriteBatchNode {
	 /* .source "TMXLayer.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.tmx.TMXLayer ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 27 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/SpriteBatchNode;-><init>(I)V */
		 /* .line 28 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.SpriteBatchNode from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.tmx.TMXLayer .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.tmx.TMXLayer from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 20 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/tmx/TMXLayer; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/tmx/TMXLayer;-><init>(I)V */
} // .end method
private native void nativeGetColor ( com.wiyun.engine.types.WYColor3B p0 ) {
} // .end method
private native void nativeGetPositionAt ( Integer p0, Integer p1, com.wiyun.engine.types.WYPoint p2 ) {
} // .end method
private native void nativeGetTileCoordinateAt ( Float p0, Float p1, com.wiyun.engine.types.WYDimension p2 ) {
} // .end method
private native void nativeSetColor ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
private native Integer nativeTileAt ( Integer p0, Integer p1 ) {
} // .end method
/* # virtual methods */
public native Integer getAlpha ( ) {
} // .end method
public com.wiyun.engine.types.WYColor3B getColor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 194 */
/* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor3B;-><init>()V */
/* .line 195 */
/* .local v0, "color":Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/tmx/TMXLayer;->nativeGetColor(Lcom/wiyun/engine/types/WYColor3B;)V */
/* .line 196 */
} // .end method
public native Integer getGidAt ( Integer p0, Integer p1 ) {
} // .end method
public native getGids ( ) {
} // .end method
public native Integer getLayerHeight ( ) {
} // .end method
public native Integer getLayerWidth ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getPositionAt ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .param p1, "x" # I */
/* .param p2, "y" # I */
/* .prologue */
/* .line 166 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 167 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, p1, p2, v0}, Lcom/wiyun/engine/tmx/TMXLayer;->nativeGetPositionAt(IILcom/wiyun/engine/types/WYPoint;)V */
/* .line 168 */
} // .end method
public native java.lang.String getProperty ( java.lang.String p0 ) {
} // .end method
public com.wiyun.engine.types.WYDimension getTileCoordinateAt ( Float p0, Float p1 ) {
/* .locals 1 */
/* .param p1, "x" # F */
/* .param p2, "y" # F */
/* .prologue */
/* .line 182 */
com.wiyun.engine.types.WYDimension .makeZero ( );
/* .line 183 */
/* .local v0, "d":Lcom/wiyun/engine/types/WYDimension; */
/* invoke-direct {p0, p1, p2, v0}, Lcom/wiyun/engine/tmx/TMXLayer;->nativeGetTileCoordinateAt(FFLcom/wiyun/engine/types/WYDimension;)V */
/* .line 184 */
} // .end method
public native Integer getTileHeight ( ) {
} // .end method
public native Integer getTileWidth ( ) {
} // .end method
public native void removeTile ( com.wiyun.engine.nodes.SpriteEx p0 ) {
} // .end method
public native void removeTileAt ( Integer p0, Integer p1 ) {
} // .end method
public native void setAlpha ( Integer p0 ) {
} // .end method
public void setColor ( com.wiyun.engine.types.WYColor3B p0 ) {
/* .locals 3 */
/* .param p1, "color" # Lcom/wiyun/engine/types/WYColor3B; */
/* .prologue */
/* .line 202 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
/* iget v2, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
/* invoke-direct {p0, v0, v1, v2}, Lcom/wiyun/engine/tmx/TMXLayer;->nativeSetColor(III)V */
/* .line 203 */
return;
} // .end method
public native void setTileAt ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
public com.wiyun.engine.nodes.SpriteEx tileAt ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .param p1, "x" # I */
/* .param p2, "y" # I */
/* .prologue */
/* .line 103 */
v0 = /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/tmx/TMXLayer;->nativeTileAt(II)I */
com.wiyun.engine.nodes.SpriteEx .from ( v0 );
} // .end method
public native void updateTileAt ( Integer p0, Integer p1, Integer p2 ) {
} // .end method

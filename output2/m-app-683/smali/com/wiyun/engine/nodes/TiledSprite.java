public class com.wiyun.engine.nodes.TiledSprite extends com.wiyun.engine.nodes.Node {
	 /* .source "TiledSprite.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.TiledSprite ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 33 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* .line 34 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.TiledSprite ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 30 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
		 /* .line 31 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.TiledSprite ( ) {
		 /* .locals 0 */
		 /* .param p1, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .prologue */
		 /* .line 36 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* .line 37 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/TiledSprite;->nativeInit(Lcom/wiyun/engine/opengl/Texture2D;)V */
		 /* .line 38 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.nodes.TiledSprite .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.nodes.TiledSprite from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 26 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/TiledSprite; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/TiledSprite;-><init>(I)V */
} // .end method
private native Integer getBlendFuncDst ( ) {
} // .end method
private native Integer getBlendFuncSrc ( ) {
} // .end method
public static com.wiyun.engine.nodes.TiledSprite make ( com.wiyun.engine.opengl.Texture2D p0 ) {
/* .locals 1 */
/* .param p0, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .prologue */
/* .line 22 */
/* new-instance v0, Lcom/wiyun/engine/nodes/TiledSprite; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/TiledSprite;-><init>(Lcom/wiyun/engine/opengl/Texture2D;)V */
} // .end method
private native void nativeGetColor ( com.wiyun.engine.types.WYColor3B p0 ) {
} // .end method
private native Integer nativeGetTexture ( ) {
} // .end method
private native void nativeInit ( com.wiyun.engine.opengl.Texture2D p0 ) {
} // .end method
private native void nativeSetColor ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
private native void setBlendFunc ( Integer p0, Integer p1 ) {
} // .end method
/* # virtual methods */
protected void doNativeInit ( ) {
/* .locals 0 */
/* .prologue */
/* .line 42 */
return;
} // .end method
public native void fling ( Float p0, Float p1 ) {
} // .end method
public native Integer getAlpha ( ) {
} // .end method
public com.wiyun.engine.types.WYBlendFunc getBlendFunc ( ) {
/* .locals 3 */
/* .prologue */
/* .line 54 */
/* new-instance v0, Lcom/wiyun/engine/types/WYBlendFunc; */
v1 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/TiledSprite;->getBlendFuncSrc()I */
v2 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/TiledSprite;->getBlendFuncDst()I */
/* invoke-direct {v0, v1, v2}, Lcom/wiyun/engine/types/WYBlendFunc;-><init>(II)V */
} // .end method
public com.wiyun.engine.types.WYColor3B getColor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 71 */
/* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor3B;-><init>()V */
/* .line 72 */
/* .local v0, "color":Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/TiledSprite;->nativeGetColor(Lcom/wiyun/engine/types/WYColor3B;)V */
/* .line 73 */
} // .end method
public native Float getMaxOffsetX ( ) {
} // .end method
public native Float getMaxOffsetY ( ) {
} // .end method
public native Float getMinOffsetX ( ) {
} // .end method
public native Float getMinOffsetY ( ) {
} // .end method
public native Float getSpacingX ( ) {
} // .end method
public native Float getSpacingY ( ) {
} // .end method
public com.wiyun.engine.opengl.Texture2D getTexture ( ) {
/* .locals 1 */
/* .prologue */
/* .line 47 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/TiledSprite;->nativeGetTexture()I */
com.wiyun.engine.opengl.Texture2D .from ( v0 );
} // .end method
public native Boolean isDither ( ) {
} // .end method
public native Boolean isFlinging ( ) {
} // .end method
public native Boolean isStretch ( ) {
} // .end method
public native Boolean isTileHorizontal ( ) {
} // .end method
public native Boolean isTileVertical ( ) {
} // .end method
public native void offsetBy ( Float p0, Float p1 ) {
} // .end method
public native void setAlpha ( Integer p0 ) {
} // .end method
public void setBlendFunc ( com.wiyun.engine.types.WYBlendFunc p0 ) {
/* .locals 2 */
/* .param p1, "blendFunc" # Lcom/wiyun/engine/types/WYBlendFunc; */
/* .prologue */
/* .line 61 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYBlendFunc;->src:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYBlendFunc;->dst:I */
/* invoke-direct {p0, v0, v1}, Lcom/wiyun/engine/nodes/TiledSprite;->setBlendFunc(II)V */
/* .line 62 */
return;
} // .end method
public void setColor ( com.wiyun.engine.types.WYColor3B p0 ) {
/* .locals 3 */
/* .param p1, "color" # Lcom/wiyun/engine/types/WYColor3B; */
/* .prologue */
/* .line 79 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
/* iget v2, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
/* invoke-direct {p0, v0, v1, v2}, Lcom/wiyun/engine/nodes/TiledSprite;->nativeSetColor(III)V */
/* .line 80 */
return;
} // .end method
public native void setDither ( Boolean p0 ) {
} // .end method
public native void setMaxOffsetX ( Float p0 ) {
} // .end method
public native void setMaxOffsetY ( Float p0 ) {
} // .end method
public native void setMinOffsetX ( Float p0 ) {
} // .end method
public native void setMinOffsetY ( Float p0 ) {
} // .end method
public native void setOffsetX ( Float p0 ) {
} // .end method
public native void setOffsetY ( Float p0 ) {
} // .end method
public native void setSpacing ( Float p0, Float p1 ) {
} // .end method
public native void setStretch ( Boolean p0 ) {
} // .end method
public native void setTexture ( com.wiyun.engine.opengl.Texture2D p0 ) {
} // .end method
public native void setTextureRect ( com.wiyun.engine.types.WYRect p0 ) {
} // .end method
public native void setTileDirection ( Boolean p0, Boolean p1 ) {
} // .end method
public native void stopFling ( ) {
} // .end method

public class com.wiyun.engine.nodes.SpriteBatchNode extends com.wiyun.engine.nodes.Node {
	 /* .source "SpriteBatchNode.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.SpriteBatchNode ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 13 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* .line 14 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.SpriteBatchNode ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 17 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
		 /* .line 18 */
		 return;
	 } // .end method
	 public com.wiyun.engine.nodes.SpriteBatchNode ( ) {
		 /* .locals 0 */
		 /* .param p1, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .prologue */
		 /* .line 25 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* .line 26 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/SpriteBatchNode;->nativeInit(Lcom/wiyun/engine/opengl/Texture2D;)V */
		 /* .line 27 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.nodes.SpriteBatchNode .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.nodes.SpriteBatchNode from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 43 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/SpriteBatchNode; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/SpriteBatchNode;-><init>(I)V */
} // .end method
private native Integer getBlendFuncDst ( ) {
} // .end method
private native Integer getBlendFuncSrc ( ) {
} // .end method
public static com.wiyun.engine.nodes.SpriteBatchNode make ( com.wiyun.engine.opengl.Texture2D p0 ) {
/* .locals 1 */
/* .param p0, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .prologue */
/* .line 39 */
/* new-instance v0, Lcom/wiyun/engine/nodes/SpriteBatchNode; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/SpriteBatchNode;-><init>(Lcom/wiyun/engine/opengl/Texture2D;)V */
} // .end method
private native void nativeGetColor ( com.wiyun.engine.types.WYColor3B p0 ) {
} // .end method
private native void nativeInit ( com.wiyun.engine.opengl.Texture2D p0 ) {
} // .end method
private native void nativeSetColor ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
private native Integer nativegetTexAtlas ( ) {
} // .end method
private native Integer nativegetTexture ( ) {
} // .end method
private native void nativesetTexture ( com.wiyun.engine.opengl.Texture2D p0 ) {
} // .end method
private native void setBlendFunc ( Integer p0, Integer p1 ) {
} // .end method
/* # virtual methods */
protected void doNativeInit ( ) {
/* .locals 0 */
/* .prologue */
/* .line 31 */
return;
} // .end method
public native Integer getAlpha ( ) {
} // .end method
public com.wiyun.engine.types.WYBlendFunc getBlendFunc ( ) {
/* .locals 3 */
/* .prologue */
/* .line 117 */
/* new-instance v0, Lcom/wiyun/engine/types/WYBlendFunc; */
v1 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/SpriteBatchNode;->getBlendFuncSrc()I */
v2 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/SpriteBatchNode;->getBlendFuncDst()I */
/* invoke-direct {v0, v1, v2}, Lcom/wiyun/engine/types/WYBlendFunc;-><init>(II)V */
} // .end method
public com.wiyun.engine.types.WYColor3B getColor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 134 */
/* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor3B;-><init>()V */
/* .line 135 */
/* .local v0, "color":Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/SpriteBatchNode;->nativeGetColor(Lcom/wiyun/engine/types/WYColor3B;)V */
/* .line 136 */
} // .end method
public com.wiyun.engine.opengl.TextureAtlas getTexAtlas ( ) {
/* .locals 2 */
/* .prologue */
/* .line 67 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/SpriteBatchNode;->nativegetTexAtlas()I */
/* .line 68 */
/* .local v0, "pointer":I */
com.wiyun.engine.opengl.TextureAtlas .from ( v0 );
} // .end method
public com.wiyun.engine.opengl.Texture2D getTexture ( ) {
/* .locals 2 */
/* .prologue */
/* .line 62 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/SpriteBatchNode;->nativegetTexture()I */
/* .line 63 */
/* .local v0, "pointer":I */
com.wiyun.engine.opengl.Texture2D .from ( v0 );
} // .end method
public native Boolean isBlend ( ) {
} // .end method
public native Boolean isDither ( ) {
} // .end method
public native void setAlpha ( Integer p0 ) {
} // .end method
public native void setAlphaFunc ( Integer p0, Float p1 ) {
} // .end method
public native void setBlend ( Boolean p0 ) {
} // .end method
public void setBlendFunc ( com.wiyun.engine.types.WYBlendFunc p0 ) {
/* .locals 2 */
/* .param p1, "blendFunc" # Lcom/wiyun/engine/types/WYBlendFunc; */
/* .prologue */
/* .line 124 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYBlendFunc;->src:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYBlendFunc;->dst:I */
/* invoke-direct {p0, v0, v1}, Lcom/wiyun/engine/nodes/SpriteBatchNode;->setBlendFunc(II)V */
/* .line 125 */
return;
} // .end method
public void setColor ( com.wiyun.engine.types.WYColor3B p0 ) {
/* .locals 3 */
/* .param p1, "color" # Lcom/wiyun/engine/types/WYColor3B; */
/* .prologue */
/* .line 142 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
/* iget v2, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
/* invoke-direct {p0, v0, v1, v2}, Lcom/wiyun/engine/nodes/SpriteBatchNode;->nativeSetColor(III)V */
/* .line 143 */
return;
} // .end method
public native void setDither ( Boolean p0 ) {
} // .end method
public void setTexture ( com.wiyun.engine.opengl.Texture2D p0 ) {
/* .locals 0 */
/* .param p1, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .prologue */
/* .line 58 */
/* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/SpriteBatchNode;->nativesetTexture(Lcom/wiyun/engine/opengl/Texture2D;)V */
/* .line 59 */
return;
} // .end method

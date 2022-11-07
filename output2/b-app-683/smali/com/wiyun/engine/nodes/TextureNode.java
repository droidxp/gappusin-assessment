public class com.wiyun.engine.nodes.TextureNode extends com.wiyun.engine.nodes.Node implements com.wiyun.engine.nodes.Node$IColorable implements com.wiyun.engine.nodes.Node$ISizable implements com.wiyun.engine.nodes.Node$IBlendableTextureOwner {
	 /* .source "TextureNode.java" */
	 /* # interfaces */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.TextureNode ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* .line 19 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.TextureNode ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 22 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
		 /* .line 23 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.nodes.TextureNode .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.nodes.TextureNode from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 15 */
		 /* new-instance v0, Lcom/wiyun/engine/nodes/TextureNode; */
		 /* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/TextureNode;-><init>(I)V */
	 } // .end method
	 private native Integer getBlendFuncDst ( ) {
	 } // .end method
	 private native Integer getBlendFuncSrc ( ) {
	 } // .end method
	 private native Integer nativeGetAnimationById ( Integer p0 ) {
	 } // .end method
	 private native void nativeGetColor ( com.wiyun.engine.types.WYColor3B p0 ) {
	 } // .end method
	 private native Integer nativeGetDisplayFrame ( ) {
	 } // .end method
	 private native Integer nativeGetTexture ( ) {
	 } // .end method
	 private native void nativeInit ( ) {
	 } // .end method
	 private native Integer nativeMakeFrame ( ) {
	 } // .end method
	 private native void nativeSetColor ( Integer p0, Integer p1, Integer p2 ) {
	 } // .end method
	 private native void nativegetTextureRect ( com.wiyun.engine.types.WYRect p0 ) {
	 } // .end method
	 private native void setBlendFunc ( Integer p0, Integer p1 ) {
	 } // .end method
	 /* # virtual methods */
	 public native void addAnimation ( com.wiyun.engine.nodes.Animation p0 ) {
	 } // .end method
	 protected void doNativeInit ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 27 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/TextureNode;->nativeInit()V */
		 /* .line 28 */
		 return;
	 } // .end method
	 public native Integer getAlpha ( ) {
	 } // .end method
	 public com.wiyun.engine.nodes.Animation getAnimationById ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p1, "id" # I */
		 /* .prologue */
		 /* .line 127 */
		 v0 = 		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/TextureNode;->nativeGetAnimationById(I)I */
		 com.wiyun.engine.nodes.Animation .from ( v0 );
	 } // .end method
	 public com.wiyun.engine.types.WYBlendFunc getBlendFunc ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 40 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYBlendFunc; */
		 v1 = 		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/TextureNode;->getBlendFuncSrc()I */
		 v2 = 		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/TextureNode;->getBlendFuncDst()I */
		 /* invoke-direct {v0, v1, v2}, Lcom/wiyun/engine/types/WYBlendFunc;-><init>(II)V */
	 } // .end method
	 public com.wiyun.engine.types.WYColor3B getColor ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 57 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor3B;-><init>()V */
		 /* .line 58 */
		 /* .local v0, "color":Lcom/wiyun/engine/types/WYColor3B; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/TextureNode;->nativeGetColor(Lcom/wiyun/engine/types/WYColor3B;)V */
		 /* .line 59 */
	 } // .end method
	 public com.wiyun.engine.nodes.Frame getDisplayFrame ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 119 */
		 /* new-instance v0, Lcom/wiyun/engine/nodes/SpriteFrame; */
		 v1 = 		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/TextureNode;->nativeGetDisplayFrame()I */
		 /* invoke-direct {v0, v1}, Lcom/wiyun/engine/nodes/SpriteFrame;-><init>(I)V */
	 } // .end method
	 public com.wiyun.engine.opengl.Texture2D getTexture ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 33 */
		 v0 = 		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/TextureNode;->nativeGetTexture()I */
		 com.wiyun.engine.opengl.Texture2D .from ( v0 );
	 } // .end method
	 public com.wiyun.engine.types.WYRect getTextureRect ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 161 */
		 com.wiyun.engine.types.WYRect .makeZero ( );
		 /* .line 162 */
		 /* .local v0, "rect":Lcom/wiyun/engine/types/WYRect; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/TextureNode;->nativegetTextureRect(Lcom/wiyun/engine/types/WYRect;)V */
		 /* .line 163 */
	 } // .end method
	 public native Boolean isAutoFit ( ) {
	 } // .end method
	 public native Boolean isBlend ( ) {
	 } // .end method
	 public native Boolean isDither ( ) {
	 } // .end method
	 public native Boolean isFlipX ( ) {
	 } // .end method
	 public native Boolean isFlipY ( ) {
	 } // .end method
	 public native Boolean isFrameDisplayed ( com.wiyun.engine.nodes.Frame p0 ) {
	 } // .end method
	 public native Boolean isRotatedZwoptex ( ) {
	 } // .end method
	 public com.wiyun.engine.nodes.SpriteFrame makeFrame ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 199 */
		 v0 = 		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/TextureNode;->nativeMakeFrame()I */
		 com.wiyun.engine.nodes.SpriteFrame .from ( v0 );
	 } // .end method
	 public native void setAlpha ( Integer p0 ) {
	 } // .end method
	 public native void setAlphaFunc ( Integer p0, Float p1 ) {
	 } // .end method
	 public native void setAutoFit ( Boolean p0 ) {
	 } // .end method
	 public native void setBlend ( Boolean p0 ) {
	 } // .end method
	 public void setBlendFunc ( com.wiyun.engine.types.WYBlendFunc p0 ) {
		 /* .locals 2 */
		 /* .param p1, "blendFunc" # Lcom/wiyun/engine/types/WYBlendFunc; */
		 /* .prologue */
		 /* .line 47 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYBlendFunc;->src:I */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYBlendFunc;->dst:I */
		 /* invoke-direct {p0, v0, v1}, Lcom/wiyun/engine/nodes/TextureNode;->setBlendFunc(II)V */
		 /* .line 48 */
		 return;
	 } // .end method
	 public void setColor ( com.wiyun.engine.types.WYColor3B p0 ) {
		 /* .locals 3 */
		 /* .param p1, "color" # Lcom/wiyun/engine/types/WYColor3B; */
		 /* .prologue */
		 /* .line 65 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
		 /* iget v2, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
		 /* invoke-direct {p0, v0, v1, v2}, Lcom/wiyun/engine/nodes/TextureNode;->nativeSetColor(III)V */
		 /* .line 66 */
		 return;
	 } // .end method
	 public native void setDisplayFrame ( Integer p0, Integer p1 ) {
	 } // .end method
	 public native void setDisplayFrame ( com.wiyun.engine.nodes.Frame p0 ) {
	 } // .end method
	 public native void setDither ( Boolean p0 ) {
	 } // .end method
	 public native void setFlipX ( Boolean p0 ) {
	 } // .end method
	 public native void setFlipY ( Boolean p0 ) {
	 } // .end method
	 public native void setRotatedZwoptex ( Boolean p0 ) {
	 } // .end method
	 public native void setTexture ( com.wiyun.engine.opengl.Texture2D p0 ) {
	 } // .end method
	 public native void setTextureRect ( com.wiyun.engine.types.WYRect p0 ) {
	 } // .end method

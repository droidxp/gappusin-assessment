public class com.wiyun.engine.nodes.TextureNode extends com.wiyun.engine.nodes.Node implements com.wiyun.engine.nodes.Node$IBlendableTextureOwner implements com.wiyun.engine.nodes.Node$IColorable implements com.wiyun.engine.nodes.Node$ISizable {
	 /* # interfaces */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.TextureNode ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.TextureNode ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.nodes.TextureNode .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.nodes.TextureNode from ( Integer p0 ) {
		 /* .locals 1 */
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
	 private native void nativeSetColor ( Integer p0, Integer p1, Integer p2 ) {
	 } // .end method
	 private native void setBlendFunc ( Integer p0, Integer p1 ) {
	 } // .end method
	 /* # virtual methods */
	 public native void addAnimation ( com.wiyun.engine.nodes.Animation p0 ) {
	 } // .end method
	 protected void doNativeInit ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/TextureNode;->nativeInit()V */
		 return;
	 } // .end method
	 public native Integer getAlpha ( ) {
	 } // .end method
	 public com.wiyun.engine.nodes.Animation getAnimationById ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = 		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/TextureNode;->nativeGetAnimationById(I)I */
		 com.wiyun.engine.nodes.Animation .from ( v0 );
	 } // .end method
	 public com.wiyun.engine.types.WYBlendFunc getBlendFunc ( ) {
		 /* .locals 3 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYBlendFunc; */
		 v1 = 		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/TextureNode;->getBlendFuncSrc()I */
		 v2 = 		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/TextureNode;->getBlendFuncDst()I */
		 /* invoke-direct {v0, v1, v2}, Lcom/wiyun/engine/types/WYBlendFunc;-><init>(II)V */
	 } // .end method
	 public com.wiyun.engine.types.WYColor3B getColor ( ) {
		 /* .locals 1 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor3B;-><init>()V */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/TextureNode;->nativeGetColor(Lcom/wiyun/engine/types/WYColor3B;)V */
	 } // .end method
	 public com.wiyun.engine.nodes.Frame getDisplayFrame ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Lcom/wiyun/engine/nodes/SpriteFrame; */
		 v1 = 		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/TextureNode;->nativeGetDisplayFrame()I */
		 /* invoke-direct {v0, v1}, Lcom/wiyun/engine/nodes/SpriteFrame;-><init>(I)V */
	 } // .end method
	 public com.wiyun.engine.opengl.Texture2D getTexture ( ) {
		 /* .locals 1 */
		 v0 = 		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/TextureNode;->nativeGetTexture()I */
		 com.wiyun.engine.opengl.Texture2D .from ( v0 );
	 } // .end method
	 public native Boolean isFrameDisplayed ( com.wiyun.engine.nodes.Frame p0 ) {
	 } // .end method
	 public native void setAlpha ( Integer p0 ) {
	 } // .end method
	 public native void setAutoFit ( Boolean p0 ) {
	 } // .end method
	 public void setBlendFunc ( com.wiyun.engine.types.WYBlendFunc p0 ) {
		 /* .locals 2 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYBlendFunc;->src:I */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYBlendFunc;->dst:I */
		 /* invoke-direct {p0, v0, v1}, Lcom/wiyun/engine/nodes/TextureNode;->setBlendFunc(II)V */
		 return;
	 } // .end method
	 public void setColor ( com.wiyun.engine.types.WYColor3B p0 ) {
		 /* .locals 3 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
		 /* iget v2, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
		 /* invoke-direct {p0, v0, v1, v2}, Lcom/wiyun/engine/nodes/TextureNode;->nativeSetColor(III)V */
		 return;
	 } // .end method
	 public native void setDisplayFrame ( Integer p0, Integer p1 ) {
	 } // .end method
	 public native void setDisplayFrame ( com.wiyun.engine.nodes.Frame p0 ) {
	 } // .end method
	 public native void setTexture ( com.wiyun.engine.opengl.Texture2D p0 ) {
	 } // .end method
	 public native void setTextureRect ( com.wiyun.engine.types.WYRect p0 ) {
	 } // .end method

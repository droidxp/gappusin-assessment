public abstract class com.wiyun.engine.nodes.AtlasNode extends com.wiyun.engine.nodes.Node implements com.wiyun.engine.nodes.Node$IColorable implements com.wiyun.engine.nodes.Node$IBlendableTextureOwner {
	 /* .source "AtlasNode.java" */
	 /* # interfaces */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.AtlasNode ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 11 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* .line 12 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.AtlasNode ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 19 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
		 /* .line 20 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.AtlasNode ( ) {
		 /* .locals 0 */
		 /* .param p1, "texture" # Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .param p2, "itemWidth" # I */
		 /* .param p3, "itemHeight" # I */
		 /* .param p4, "capacity" # I */
		 /* .prologue */
		 /* .line 14 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* .line 16 */
		 return;
	 } // .end method
	 private native Integer getBlendFuncDst ( ) {
	 } // .end method
	 private native Integer getBlendFuncSrc ( ) {
	 } // .end method
	 private native void nativeGetColor ( com.wiyun.engine.types.WYColor3B p0 ) {
	 } // .end method
	 private native Integer nativeGetTexture ( ) {
	 } // .end method
	 private native void nativeSetColor ( Integer p0, Integer p1, Integer p2 ) {
	 } // .end method
	 private native void setBlendFunc ( Integer p0, Integer p1 ) {
	 } // .end method
	 /* # virtual methods */
	 protected void doNativeInit ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 24 */
		 return;
	 } // .end method
	 public native Integer getAlpha ( ) {
	 } // .end method
	 public com.wiyun.engine.types.WYBlendFunc getBlendFunc ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 27 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYBlendFunc; */
		 v1 = 		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/AtlasNode;->getBlendFuncSrc()I */
		 v2 = 		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/AtlasNode;->getBlendFuncDst()I */
		 /* invoke-direct {v0, v1, v2}, Lcom/wiyun/engine/types/WYBlendFunc;-><init>(II)V */
	 } // .end method
	 public com.wiyun.engine.types.WYColor3B getColor ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 44 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor3B;-><init>()V */
		 /* .line 45 */
		 /* .local v0, "color":Lcom/wiyun/engine/types/WYColor3B; */
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/AtlasNode;->nativeGetColor(Lcom/wiyun/engine/types/WYColor3B;)V */
		 /* .line 46 */
	 } // .end method
	 public com.wiyun.engine.opengl.Texture2D getTexture ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 58 */
		 v0 = 		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/AtlasNode;->nativeGetTexture()I */
		 com.wiyun.engine.opengl.Texture2D .from ( v0 );
	 } // .end method
	 public native void setAlpha ( Integer p0 ) {
	 } // .end method
	 public void setBlendFunc ( com.wiyun.engine.types.WYBlendFunc p0 ) {
		 /* .locals 2 */
		 /* .param p1, "blendFunc" # Lcom/wiyun/engine/types/WYBlendFunc; */
		 /* .prologue */
		 /* .line 34 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYBlendFunc;->src:I */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYBlendFunc;->dst:I */
		 /* invoke-direct {p0, v0, v1}, Lcom/wiyun/engine/nodes/AtlasNode;->setBlendFunc(II)V */
		 /* .line 35 */
		 return;
	 } // .end method
	 public void setColor ( com.wiyun.engine.types.WYColor3B p0 ) {
		 /* .locals 3 */
		 /* .param p1, "color" # Lcom/wiyun/engine/types/WYColor3B; */
		 /* .prologue */
		 /* .line 52 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
		 /* iget v2, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
		 /* invoke-direct {p0, v0, v1, v2}, Lcom/wiyun/engine/nodes/AtlasNode;->nativeSetColor(III)V */
		 /* .line 53 */
		 return;
	 } // .end method
	 public native void setTexture ( com.wiyun.engine.opengl.Texture2D p0 ) {
	 } // .end method

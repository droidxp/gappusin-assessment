public class com.wiyun.engine.nodes.NinePatchSprite extends com.wiyun.engine.nodes.Node implements com.wiyun.engine.nodes.Node$IColorable implements com.wiyun.engine.nodes.Node$ISizable implements com.wiyun.engine.nodes.Node$IBlendableTextureOwner {
	 /* .source "NinePatchSprite.java" */
	 /* # interfaces */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.NinePatchSprite ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 45 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* .line 46 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.NinePatchSprite ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 49 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
		 /* .line 50 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.NinePatchSprite ( ) {
		 /* .locals 0 */
		 /* .param p1, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .param p2, "texRect" # Lcom/wiyun/engine/types/WYRect; */
		 /* .param p3, "patchRect" # Lcom/wiyun/engine/types/WYRect; */
		 /* .prologue */
		 /* .line 52 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* .line 53 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/nodes/NinePatchSprite;->nativeInit(Lcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYRect;Lcom/wiyun/engine/types/WYRect;)V */
		 /* .line 54 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.NinePatchSprite from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 42 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/NinePatchSprite; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/NinePatchSprite;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.nodes.NinePatchSprite .from ( p0 );
} // .end method
private native Integer getBlendFuncDst ( ) {
} // .end method
private native Integer getBlendFuncSrc ( ) {
} // .end method
public static com.wiyun.engine.nodes.NinePatchSprite make ( com.wiyun.engine.opengl.Texture2D p0, com.wiyun.engine.types.WYRect p1 ) {
/* .locals 4 */
/* .param p0, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .param p1, "patchRect" # Lcom/wiyun/engine/types/WYRect; */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 25 */
v1 = (( com.wiyun.engine.opengl.Texture2D ) p0 ).getWidth ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/opengl/Texture2D;->getWidth()F
v2 = (( com.wiyun.engine.opengl.Texture2D ) p0 ).getHeight ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/opengl/Texture2D;->getHeight()F
com.wiyun.engine.types.WYRect .make ( v3,v3,v1,v2 );
/* .line 26 */
/* .local v0, "r":Lcom/wiyun/engine/types/WYRect; */
com.wiyun.engine.nodes.NinePatchSprite .make ( p0,v0,p1 );
} // .end method
public static com.wiyun.engine.nodes.NinePatchSprite make ( com.wiyun.engine.opengl.Texture2D p0, com.wiyun.engine.types.WYRect p1, com.wiyun.engine.types.WYRect p2 ) {
/* .locals 1 */
/* .param p0, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .param p1, "texRect" # Lcom/wiyun/engine/types/WYRect; */
/* .param p2, "patchRect" # Lcom/wiyun/engine/types/WYRect; */
/* .prologue */
/* .line 38 */
/* new-instance v0, Lcom/wiyun/engine/nodes/NinePatchSprite; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/nodes/NinePatchSprite;-><init>(Lcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYRect;Lcom/wiyun/engine/types/WYRect;)V */
} // .end method
private native void nativeGetColor ( com.wiyun.engine.types.WYColor3B p0 ) {
} // .end method
private native Integer nativeGetTexture ( ) {
} // .end method
private native void nativeInit ( com.wiyun.engine.opengl.Texture2D p0, com.wiyun.engine.types.WYRect p1, com.wiyun.engine.types.WYRect p2 ) {
} // .end method
private native void nativeSetColor ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
private native void nativegetTextureRect ( com.wiyun.engine.types.WYRect p0 ) {
} // .end method
private native void setBlendFunc ( Integer p0, Integer p1 ) {
} // .end method
/* # virtual methods */
protected void doNativeInit ( ) {
/* .locals 0 */
/* .prologue */
/* .line 58 */
return;
} // .end method
public native Integer getAlpha ( ) {
} // .end method
public com.wiyun.engine.types.WYBlendFunc getBlendFunc ( ) {
/* .locals 3 */
/* .prologue */
/* .line 70 */
/* new-instance v0, Lcom/wiyun/engine/types/WYBlendFunc; */
v1 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/NinePatchSprite;->getBlendFuncSrc()I */
v2 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/NinePatchSprite;->getBlendFuncDst()I */
/* invoke-direct {v0, v1, v2}, Lcom/wiyun/engine/types/WYBlendFunc;-><init>(II)V */
} // .end method
public com.wiyun.engine.types.WYColor3B getColor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 87 */
/* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor3B;-><init>()V */
/* .line 88 */
/* .local v0, "color":Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/NinePatchSprite;->nativeGetColor(Lcom/wiyun/engine/types/WYColor3B;)V */
/* .line 89 */
} // .end method
public com.wiyun.engine.opengl.Texture2D getTexture ( ) {
/* .locals 1 */
/* .prologue */
/* .line 63 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/NinePatchSprite;->nativeGetTexture()I */
com.wiyun.engine.opengl.Texture2D .from ( v0 );
} // .end method
public com.wiyun.engine.types.WYRect getTextureRect ( ) {
/* .locals 1 */
/* .prologue */
/* .line 129 */
com.wiyun.engine.types.WYRect .makeZero ( );
/* .line 130 */
/* .local v0, "rect":Lcom/wiyun/engine/types/WYRect; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/NinePatchSprite;->nativegetTextureRect(Lcom/wiyun/engine/types/WYRect;)V */
/* .line 131 */
} // .end method
public native Boolean isBlend ( ) {
} // .end method
public native void setAlpha ( Integer p0 ) {
} // .end method
public native void setBlend ( Boolean p0 ) {
} // .end method
public void setBlendFunc ( com.wiyun.engine.types.WYBlendFunc p0 ) {
/* .locals 2 */
/* .param p1, "blendFunc" # Lcom/wiyun/engine/types/WYBlendFunc; */
/* .prologue */
/* .line 77 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYBlendFunc;->src:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYBlendFunc;->dst:I */
/* invoke-direct {p0, v0, v1}, Lcom/wiyun/engine/nodes/NinePatchSprite;->setBlendFunc(II)V */
/* .line 78 */
return;
} // .end method
public void setColor ( com.wiyun.engine.types.WYColor3B p0 ) {
/* .locals 3 */
/* .param p1, "color" # Lcom/wiyun/engine/types/WYColor3B; */
/* .prologue */
/* .line 95 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
/* iget v2, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
/* invoke-direct {p0, v0, v1, v2}, Lcom/wiyun/engine/nodes/NinePatchSprite;->nativeSetColor(III)V */
/* .line 96 */
return;
} // .end method
public native void setTexture ( com.wiyun.engine.opengl.Texture2D p0 ) {
} // .end method
public native void setTextureRect ( com.wiyun.engine.types.WYRect p0 ) {
} // .end method

public class com.wiyun.engine.nodes.RenderTexture extends com.wiyun.engine.nodes.Node implements com.wiyun.engine.nodes.Node$IColorable {
	 /* .source "RenderTexture.java" */
	 /* # interfaces */
	 /* # direct methods */
	 public com.wiyun.engine.nodes.RenderTexture ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 43 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* .line 44 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/RenderTexture;->nativeInit()V */
		 /* .line 45 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.RenderTexture ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 58 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
		 /* .line 59 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.RenderTexture ( ) {
		 /* .locals 0 */
		 /* .param p1, "width" # I */
		 /* .param p2, "height" # I */
		 /* .prologue */
		 /* .line 39 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* .line 40 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/nodes/RenderTexture;->nativeInit(II)V */
		 /* .line 41 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.nodes.RenderTexture .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.nodes.RenderTexture from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 54 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/RenderTexture; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/RenderTexture;-><init>(I)V */
} // .end method
private native Integer getBlendFuncDst ( ) {
} // .end method
private native Integer getBlendFuncSrc ( ) {
} // .end method
public static com.wiyun.engine.nodes.RenderTexture make ( ) {
/* .locals 1 */
/* .prologue */
/* .line 36 */
/* new-instance v0, Lcom/wiyun/engine/nodes/RenderTexture; */
/* invoke-direct {v0}, Lcom/wiyun/engine/nodes/RenderTexture;-><init>()V */
} // .end method
public static com.wiyun.engine.nodes.RenderTexture make ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .param p0, "width" # I */
/* .param p1, "height" # I */
/* .prologue */
/* .line 25 */
/* new-instance v0, Lcom/wiyun/engine/nodes/RenderTexture; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/nodes/RenderTexture;-><init>(II)V */
} // .end method
private native Integer nativeCreateTexture ( ) {
} // .end method
private native void nativeGetColor ( com.wiyun.engine.types.WYColor3B p0 ) {
} // .end method
private native void nativeInit ( ) {
} // .end method
private native void nativeInit ( Integer p0, Integer p1 ) {
} // .end method
private native void nativeSetBlendFunc ( Integer p0, Integer p1 ) {
} // .end method
private native void nativeSetColor ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
/* # virtual methods */
public native void beginRender ( ) {
} // .end method
public native void beginRender ( Float p0, Float p1, Float p2, Float p3 ) {
} // .end method
public native void clear ( Float p0, Float p1, Float p2, Float p3 ) {
} // .end method
public com.wiyun.engine.opengl.Texture2D createTexture ( ) {
/* .locals 1 */
/* .prologue */
/* .line 168 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/RenderTexture;->nativeCreateTexture()I */
com.wiyun.engine.opengl.Texture2D .from ( v0 );
} // .end method
protected void doNativeInit ( ) {
/* .locals 0 */
/* .prologue */
/* .line 63 */
return;
} // .end method
public native void endRender ( ) {
} // .end method
public native Integer getAlpha ( ) {
} // .end method
public com.wiyun.engine.types.WYBlendFunc getBlendFunc ( ) {
/* .locals 3 */
/* .prologue */
/* .line 126 */
/* new-instance v0, Lcom/wiyun/engine/types/WYBlendFunc; */
v1 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/RenderTexture;->getBlendFuncSrc()I */
v2 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/RenderTexture;->getBlendFuncDst()I */
/* invoke-direct {v0, v1, v2}, Lcom/wiyun/engine/types/WYBlendFunc;-><init>(II)V */
} // .end method
public com.wiyun.engine.types.WYColor3B getColor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 143 */
/* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor3B;-><init>()V */
/* .line 144 */
/* .local v0, "color":Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/RenderTexture;->nativeGetColor(Lcom/wiyun/engine/types/WYColor3B;)V */
/* .line 145 */
} // .end method
public native void setAlpha ( Integer p0 ) {
} // .end method
public void setBlendFunc ( com.wiyun.engine.types.WYBlendFunc p0 ) {
/* .locals 2 */
/* .param p1, "blendFunc" # Lcom/wiyun/engine/types/WYBlendFunc; */
/* .prologue */
/* .line 133 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYBlendFunc;->src:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYBlendFunc;->dst:I */
/* invoke-direct {p0, v0, v1}, Lcom/wiyun/engine/nodes/RenderTexture;->nativeSetBlendFunc(II)V */
/* .line 134 */
return;
} // .end method
public void setColor ( com.wiyun.engine.types.WYColor3B p0 ) {
/* .locals 3 */
/* .param p1, "color" # Lcom/wiyun/engine/types/WYColor3B; */
/* .prologue */
/* .line 151 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
/* iget v2, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
/* invoke-direct {p0, v0, v1, v2}, Lcom/wiyun/engine/nodes/RenderTexture;->nativeSetColor(III)V */
/* .line 152 */
return;
} // .end method

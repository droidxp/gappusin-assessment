public class com.wiyun.engine.nodes.AtlasLabel extends com.wiyun.engine.nodes.Node implements com.wiyun.engine.nodes.Node$ILabel {
	 /* .source "AtlasLabel.java" */
	 /* # interfaces */
	 /* # static fields */
	 public static final Integer CENTER;
	 public static final Integer LEFT;
	 public static final Integer RIGHT;
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.AtlasLabel ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 59 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* .line 60 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.AtlasLabel ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 56 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
		 /* .line 57 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.AtlasLabel ( ) {
		 /* .locals 0 */
		 /* .param p1, "text" # Ljava/lang/String; */
		 /* .param p2, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .param p3, "map" # Lcom/wiyun/engine/nodes/CharMap; */
		 /* .prologue */
		 /* .line 62 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* .line 63 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/nodes/AtlasLabel;->nativeInit(Ljava/lang/String;Lcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/nodes/CharMap;)V */
		 /* .line 64 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.AtlasLabel from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 48 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/AtlasLabel; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/AtlasLabel;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.nodes.AtlasLabel .from ( p0 );
} // .end method
private native Integer getBlendFuncDst ( ) {
} // .end method
private native Integer getBlendFuncSrc ( ) {
} // .end method
public static com.wiyun.engine.nodes.AtlasLabel make ( java.lang.String p0, com.wiyun.engine.opengl.Texture2D p1, com.wiyun.engine.nodes.CharMap p2 ) {
/* .locals 1 */
/* .param p0, "text" # Ljava/lang/String; */
/* .param p1, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .param p2, "map" # Lcom/wiyun/engine/nodes/CharMap; */
/* .prologue */
/* .line 52 */
/* new-instance v0, Lcom/wiyun/engine/nodes/AtlasLabel; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/nodes/AtlasLabel;-><init>(Ljava/lang/String;Lcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/nodes/CharMap;)V */
} // .end method
private native void nativeGetColor ( com.wiyun.engine.types.WYColor3B p0 ) {
} // .end method
private native Integer nativeGetTexture ( ) {
} // .end method
private native void nativeInit ( java.lang.String p0, com.wiyun.engine.opengl.Texture2D p1, com.wiyun.engine.nodes.CharMap p2 ) {
} // .end method
private native void nativeSetColor ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
private native void setBlendFunc ( Integer p0, Integer p1 ) {
} // .end method
/* # virtual methods */
protected void doNativeInit ( ) {
/* .locals 0 */
/* .prologue */
/* .line 70 */
return;
} // .end method
public native Integer getAlignment ( ) {
} // .end method
public native Integer getAlpha ( ) {
} // .end method
public com.wiyun.engine.types.WYBlendFunc getBlendFunc ( ) {
/* .locals 3 */
/* .prologue */
/* .line 73 */
/* new-instance v0, Lcom/wiyun/engine/types/WYBlendFunc; */
v1 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/AtlasLabel;->getBlendFuncSrc()I */
v2 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/AtlasLabel;->getBlendFuncDst()I */
/* invoke-direct {v0, v1, v2}, Lcom/wiyun/engine/types/WYBlendFunc;-><init>(II)V */
} // .end method
public com.wiyun.engine.types.WYColor3B getColor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 90 */
/* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor3B;-><init>()V */
/* .line 91 */
/* .local v0, "color":Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/AtlasLabel;->nativeGetColor(Lcom/wiyun/engine/types/WYColor3B;)V */
/* .line 92 */
} // .end method
public native Float getLineSpacing ( ) {
} // .end method
public native Float getLineWidth ( ) {
} // .end method
public native java.lang.String getText ( ) {
} // .end method
public com.wiyun.engine.opengl.Texture2D getTexture ( ) {
/* .locals 1 */
/* .prologue */
/* .line 104 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/AtlasLabel;->nativeGetTexture()I */
com.wiyun.engine.opengl.Texture2D .from ( v0 );
} // .end method
public native void setAlignment ( Integer p0 ) {
} // .end method
public native void setAlpha ( Integer p0 ) {
} // .end method
public void setBlendFunc ( com.wiyun.engine.types.WYBlendFunc p0 ) {
/* .locals 2 */
/* .param p1, "blendFunc" # Lcom/wiyun/engine/types/WYBlendFunc; */
/* .prologue */
/* .line 80 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYBlendFunc;->src:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYBlendFunc;->dst:I */
/* invoke-direct {p0, v0, v1}, Lcom/wiyun/engine/nodes/AtlasLabel;->setBlendFunc(II)V */
/* .line 81 */
return;
} // .end method
public void setColor ( com.wiyun.engine.types.WYColor3B p0 ) {
/* .locals 3 */
/* .param p1, "color" # Lcom/wiyun/engine/types/WYColor3B; */
/* .prologue */
/* .line 98 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
/* iget v2, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
/* invoke-direct {p0, v0, v1, v2}, Lcom/wiyun/engine/nodes/AtlasLabel;->nativeSetColor(III)V */
/* .line 99 */
return;
} // .end method
public native void setLineSpacing ( Float p0 ) {
} // .end method
public native void setLineWidth ( Float p0 ) {
} // .end method
public native void setText ( java.lang.String p0 ) {
} // .end method
public native void setTexture ( com.wiyun.engine.opengl.Texture2D p0 ) {
} // .end method

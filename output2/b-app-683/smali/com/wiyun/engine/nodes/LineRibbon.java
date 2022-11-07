public class com.wiyun.engine.nodes.LineRibbon extends com.wiyun.engine.nodes.Ribbon {
	 /* .source "LineRibbon.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.LineRibbon ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 27 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Ribbon;-><init>(I)V */
		 /* .line 28 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.LineRibbon ( ) {
		 /* .locals 0 */
		 /* .param p1, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .param p2, "color" # Lcom/wiyun/engine/types/WYColor4B; */
		 /* .prologue */
		 /* .line 30 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Ribbon;-><init>()V */
		 /* .line 31 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/nodes/LineRibbon;->nativeInit(Lcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYColor4B;)V */
		 /* .line 32 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.LineRibbon from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 23 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/LineRibbon; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/LineRibbon;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Ribbon from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.nodes.LineRibbon .from ( p0 );
} // .end method
public static com.wiyun.engine.nodes.LineRibbon make ( com.wiyun.engine.opengl.Texture2D p0, com.wiyun.engine.types.WYColor4B p1 ) {
/* .locals 1 */
/* .param p0, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .param p1, "color" # Lcom/wiyun/engine/types/WYColor4B; */
/* .prologue */
/* .line 19 */
/* new-instance v0, Lcom/wiyun/engine/nodes/LineRibbon; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/nodes/LineRibbon;-><init>(Lcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYColor4B;)V */
} // .end method
private native void nativeGetColor ( com.wiyun.engine.types.WYColor3B p0 ) {
} // .end method
private native void nativeGetLineColor ( Integer p0, com.wiyun.engine.types.WYColor4B p1 ) {
} // .end method
private native void nativeGetLinePointList ( Integer p0, com.wiyun.engine.types.WYPoint[] p1 ) {
} // .end method
private native Integer nativeGetTexture ( ) {
} // .end method
private native void nativeInit ( com.wiyun.engine.opengl.Texture2D p0, com.wiyun.engine.types.WYColor4B p1 ) {
} // .end method
private native void nativeSetColor ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
/* # virtual methods */
public native Integer getAlpha ( ) {
} // .end method
public com.wiyun.engine.types.WYColor3B getColor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 48 */
/* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor3B;-><init>()V */
/* .line 49 */
/* .local v0, "color":Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/LineRibbon;->nativeGetColor(Lcom/wiyun/engine/types/WYColor3B;)V */
/* .line 50 */
} // .end method
public com.wiyun.engine.types.WYColor4B getLineColor ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "index" # I */
/* .prologue */
/* .line 84 */
/* new-instance v0, Lcom/wiyun/engine/types/WYColor4B; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor4B;-><init>()V */
/* .line 85 */
/* .local v0, "c":Lcom/wiyun/engine/types/WYColor4B; */
/* invoke-direct {p0, p1, v0}, Lcom/wiyun/engine/nodes/LineRibbon;->nativeGetLineColor(ILcom/wiyun/engine/types/WYColor4B;)V */
/* .line 86 */
} // .end method
public native Integer getLineCount ( ) {
} // .end method
public native Integer getLinePointCount ( Integer p0 ) {
} // .end method
public com.wiyun.engine.types.WYPoint getLinePointList ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "index" # I */
/* .prologue */
/* .line 113 */
/* if-ltz p1, :cond_0 */
v2 = (( com.wiyun.engine.nodes.LineRibbon ) p0 ).getLineCount ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/nodes/LineRibbon;->getLineCount()I
/* if-lt p1, v2, :cond_1 */
/* .line 114 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 120 */
} // :goto_0
/* .line 116 */
} // :cond_1
v2 = (( com.wiyun.engine.nodes.LineRibbon ) p0 ).getLinePointCount ( p1 ); // invoke-virtual {p0, p1}, Lcom/wiyun/engine/nodes/LineRibbon;->getLinePointCount(I)I
/* new-array v1, v2, [Lcom/wiyun/engine/types/WYPoint; */
/* .line 117 */
/* .local v1, "list":[Lcom/wiyun/engine/types/WYPoint; */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_1
/* array-length v2, v1 */
/* if-lt v0, v2, :cond_2 */
/* .line 119 */
/* invoke-direct {p0, p1, v1}, Lcom/wiyun/engine/nodes/LineRibbon;->nativeGetLinePointList(I[Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 118 */
} // :cond_2
com.wiyun.engine.types.WYPoint .makeZero ( );
/* aput-object v2, v1, v0 */
/* .line 117 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public native Float getLineWidth ( Integer p0 ) {
} // .end method
public com.wiyun.engine.opengl.Texture2D getTexture ( ) {
/* .locals 1 */
/* .prologue */
/* .line 37 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/LineRibbon;->nativeGetTexture()I */
com.wiyun.engine.opengl.Texture2D .from ( v0 );
} // .end method
public native void setAlpha ( Integer p0 ) {
} // .end method
public void setColor ( com.wiyun.engine.types.WYColor3B p0 ) {
/* .locals 3 */
/* .param p1, "color" # Lcom/wiyun/engine/types/WYColor3B; */
/* .prologue */
/* .line 56 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
/* iget v2, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
/* invoke-direct {p0, v0, v1, v2}, Lcom/wiyun/engine/nodes/LineRibbon;->nativeSetColor(III)V */
/* .line 57 */
return;
} // .end method
public native void setLineWidth ( Float p0 ) {
} // .end method
public native void setTexture ( com.wiyun.engine.opengl.Texture2D p0 ) {
} // .end method

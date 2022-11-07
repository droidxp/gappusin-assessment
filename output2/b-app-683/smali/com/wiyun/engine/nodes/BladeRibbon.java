public class com.wiyun.engine.nodes.BladeRibbon extends com.wiyun.engine.nodes.Ribbon {
	 /* .source "BladeRibbon.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.BladeRibbon ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 29 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Ribbon;-><init>(I)V */
		 /* .line 30 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.BladeRibbon ( ) {
		 /* .locals 0 */
		 /* .param p1, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .param p2, "color" # Lcom/wiyun/engine/types/WYColor4B; */
		 /* .param p3, "fade" # F */
		 /* .prologue */
		 /* .line 32 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Ribbon;-><init>()V */
		 /* .line 33 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/nodes/BladeRibbon;->nativeInit(Lcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYColor4B;F)V */
		 /* .line 34 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.BladeRibbon from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 25 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/BladeRibbon; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/BladeRibbon;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Ribbon from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.nodes.BladeRibbon .from ( p0 );
} // .end method
public static com.wiyun.engine.nodes.BladeRibbon make ( com.wiyun.engine.opengl.Texture2D p0, com.wiyun.engine.types.WYColor4B p1, Float p2 ) {
/* .locals 1 */
/* .param p0, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .param p1, "color" # Lcom/wiyun/engine/types/WYColor4B; */
/* .param p2, "fade" # F */
/* .prologue */
/* .line 21 */
/* new-instance v0, Lcom/wiyun/engine/nodes/BladeRibbon; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/nodes/BladeRibbon;-><init>(Lcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYColor4B;F)V */
} // .end method
private native void nativeGetColor ( com.wiyun.engine.types.WYColor3B p0 ) {
} // .end method
private native Integer nativeGetTexture ( ) {
} // .end method
private native void nativeInit ( com.wiyun.engine.opengl.Texture2D p0, com.wiyun.engine.types.WYColor4B p1, Float p2 ) {
} // .end method
private native void nativeSetColor ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
/* # virtual methods */
public native Integer getAlpha ( ) {
} // .end method
public com.wiyun.engine.types.WYColor3B getColor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 65 */
/* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor3B;-><init>()V */
/* .line 66 */
/* .local v0, "color":Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/BladeRibbon;->nativeGetColor(Lcom/wiyun/engine/types/WYColor3B;)V */
/* .line 67 */
} // .end method
public native Integer getMaxPointCount ( ) {
} // .end method
public com.wiyun.engine.opengl.Texture2D getTexture ( ) {
/* .locals 1 */
/* .prologue */
/* .line 54 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/BladeRibbon;->nativeGetTexture()I */
com.wiyun.engine.opengl.Texture2D .from ( v0 );
} // .end method
public native void setAlpha ( Integer p0 ) {
} // .end method
public void setColor ( com.wiyun.engine.types.WYColor3B p0 ) {
/* .locals 3 */
/* .param p1, "color" # Lcom/wiyun/engine/types/WYColor3B; */
/* .prologue */
/* .line 73 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
/* iget v2, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
/* invoke-direct {p0, v0, v1, v2}, Lcom/wiyun/engine/nodes/BladeRibbon;->nativeSetColor(III)V */
/* .line 74 */
return;
} // .end method
public native void setMaxPointCount ( Integer p0 ) {
} // .end method
public native void setTexture ( com.wiyun.engine.opengl.Texture2D p0 ) {
} // .end method

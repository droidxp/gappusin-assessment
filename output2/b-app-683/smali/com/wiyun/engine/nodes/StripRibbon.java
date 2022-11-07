public class com.wiyun.engine.nodes.StripRibbon extends com.wiyun.engine.nodes.Ribbon {
	 /* .source "StripRibbon.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.StripRibbon ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 26 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Ribbon;-><init>(I)V */
		 /* .line 27 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.StripRibbon ( ) {
		 /* .locals 0 */
		 /* .param p1, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .param p2, "color" # Lcom/wiyun/engine/types/WYColor4B; */
		 /* .param p3, "fade" # F */
		 /* .prologue */
		 /* .line 29 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Ribbon;-><init>()V */
		 /* .line 30 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/nodes/StripRibbon;->nativeInit(Lcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYColor4B;F)V */
		 /* .line 31 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.Ribbon from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.nodes.StripRibbon .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.nodes.StripRibbon from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 22 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/StripRibbon; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/StripRibbon;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.StripRibbon make ( com.wiyun.engine.opengl.Texture2D p0, com.wiyun.engine.types.WYColor4B p1, Float p2 ) {
/* .locals 1 */
/* .param p0, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .param p1, "color" # Lcom/wiyun/engine/types/WYColor4B; */
/* .param p2, "fade" # F */
/* .prologue */
/* .line 18 */
/* new-instance v0, Lcom/wiyun/engine/nodes/StripRibbon; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/nodes/StripRibbon;-><init>(Lcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYColor4B;F)V */
} // .end method
private native Integer nativeGetTexture ( ) {
} // .end method
private native void nativeInit ( com.wiyun.engine.opengl.Texture2D p0, com.wiyun.engine.types.WYColor4B p1, Float p2 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.opengl.Texture2D getTexture ( ) {
/* .locals 1 */
/* .prologue */
/* .line 36 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/StripRibbon;->nativeGetTexture()I */
com.wiyun.engine.opengl.Texture2D .from ( v0 );
} // .end method
public native void setTexture ( com.wiyun.engine.opengl.Texture2D p0 ) {
} // .end method

public class com.wiyun.engine.nodes.LineRibbon extends com.wiyun.engine.nodes.Ribbon {
	 /* # direct methods */
	 private com.wiyun.engine.nodes.LineRibbon ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Ribbon;-><init>(I)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.nodes.LineRibbon ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Ribbon;-><init>()V */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/nodes/LineRibbon;->nativeInit(Lcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYColor4B;)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.LineRibbon from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/LineRibbon; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/LineRibbon;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Ribbon from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
com.wiyun.engine.nodes.LineRibbon .from ( p0 );
} // .end method
public static com.wiyun.engine.nodes.LineRibbon make ( com.wiyun.engine.opengl.Texture2D p0, com.wiyun.engine.types.WYColor4B p1 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/nodes/LineRibbon; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/nodes/LineRibbon;-><init>(Lcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYColor4B;)V */
} // .end method
private native Integer nativeGetTexture ( ) {
} // .end method
private native void nativeInit ( com.wiyun.engine.opengl.Texture2D p0, com.wiyun.engine.types.WYColor4B p1 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.opengl.Texture2D getTexture ( ) {
/* .locals 1 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/LineRibbon;->nativeGetTexture()I */
com.wiyun.engine.opengl.Texture2D .from ( v0 );
} // .end method
public native void setTexture ( com.wiyun.engine.opengl.Texture2D p0 ) {
} // .end method

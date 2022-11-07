public class com.wiyun.engine.nodes.ColorLayer extends com.wiyun.engine.nodes.Layer implements com.wiyun.engine.nodes.Node$IColorable implements com.wiyun.engine.nodes.Node$ISizable {
	 /* # interfaces */
	 /* # direct methods */
	 public com.wiyun.engine.nodes.ColorLayer ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Layer;-><init>()V */
		 com.wiyun.engine.types.WYColor4B .make ( v0,v0,v0,v0 );
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/ColorLayer;->nativeInit(Lcom/wiyun/engine/types/WYColor4B;)V */
		 return;
	 } // .end method
	 public com.wiyun.engine.nodes.ColorLayer ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Layer;-><init>(I)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.nodes.ColorLayer ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Layer;-><init>()V */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/ColorLayer;->nativeInit(Lcom/wiyun/engine/types/WYColor4B;)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.ColorLayer from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/ColorLayer; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/ColorLayer;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Layer from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
com.wiyun.engine.nodes.ColorLayer .from ( p0 );
} // .end method
public static com.wiyun.engine.nodes.ColorLayer make ( ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/nodes/ColorLayer; */
/* invoke-direct {v0}, Lcom/wiyun/engine/nodes/ColorLayer;-><init>()V */
} // .end method
public static com.wiyun.engine.nodes.ColorLayer make ( com.wiyun.engine.types.WYColor4B p0 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/nodes/ColorLayer; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/ColorLayer;-><init>(Lcom/wiyun/engine/types/WYColor4B;)V */
} // .end method
public static com.wiyun.engine.nodes.Layer make ( ) { //bridge//synthethic
/* .locals 1 */
com.wiyun.engine.nodes.ColorLayer .make ( );
} // .end method
private native void nativeGetColor ( com.wiyun.engine.types.WYColor3B p0 ) {
} // .end method
private native void nativeInit ( com.wiyun.engine.types.WYColor4B p0 ) {
} // .end method
private native void nativeSetColor ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
/* # virtual methods */
protected void doNativeInit ( ) {
/* .locals 0 */
return;
} // .end method
public native Integer getAlpha ( ) {
} // .end method
public com.wiyun.engine.types.WYColor3B getColor ( ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor3B;-><init>()V */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/ColorLayer;->nativeGetColor(Lcom/wiyun/engine/types/WYColor3B;)V */
} // .end method
public native void setAlpha ( Integer p0 ) {
} // .end method
public void setColor ( com.wiyun.engine.types.WYColor3B p0 ) {
/* .locals 3 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
/* iget v2, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
/* invoke-direct {p0, v0, v1, v2}, Lcom/wiyun/engine/nodes/ColorLayer;->nativeSetColor(III)V */
return;
} // .end method

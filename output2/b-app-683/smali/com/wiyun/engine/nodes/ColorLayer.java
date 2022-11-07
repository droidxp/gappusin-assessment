public class com.wiyun.engine.nodes.ColorLayer extends com.wiyun.engine.nodes.Layer implements com.wiyun.engine.nodes.Node$IColorable implements com.wiyun.engine.nodes.Node$ISizable {
	 /* .source "ColorLayer.java" */
	 /* # interfaces */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.ColorLayer ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 32 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Layer;-><init>()V */
		 /* .line 33 */
		 com.wiyun.engine.types.WYColor4B .make ( v0,v0,v0,v0 );
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/ColorLayer;->nativeInit(Lcom/wiyun/engine/types/WYColor4B;)V */
		 /* .line 34 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.ColorLayer ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 56 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Layer;-><init>(I)V */
		 /* .line 57 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.ColorLayer ( ) {
		 /* .locals 0 */
		 /* .param p1, "color" # Lcom/wiyun/engine/types/WYColor4B; */
		 /* .prologue */
		 /* .line 41 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Layer;-><init>()V */
		 /* .line 42 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/ColorLayer;->nativeInit(Lcom/wiyun/engine/types/WYColor4B;)V */
		 /* .line 43 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.ColorLayer from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 52 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/ColorLayer; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/ColorLayer;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Layer from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.nodes.ColorLayer .from ( p0 );
} // .end method
public static com.wiyun.engine.nodes.ColorLayer make ( ) {
/* .locals 1 */
/* .prologue */
/* .line 16 */
/* new-instance v0, Lcom/wiyun/engine/nodes/ColorLayer; */
/* invoke-direct {v0}, Lcom/wiyun/engine/nodes/ColorLayer;-><init>()V */
} // .end method
public static com.wiyun.engine.nodes.ColorLayer make ( com.wiyun.engine.types.WYColor4B p0 ) {
/* .locals 1 */
/* .param p0, "color" # Lcom/wiyun/engine/types/WYColor4B; */
/* .prologue */
/* .line 26 */
/* new-instance v0, Lcom/wiyun/engine/nodes/ColorLayer; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/ColorLayer;-><init>(Lcom/wiyun/engine/types/WYColor4B;)V */
} // .end method
public static com.wiyun.engine.nodes.Layer make ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
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
/* .prologue */
/* .line 63 */
return;
} // .end method
public native Integer getAlpha ( ) {
} // .end method
public com.wiyun.engine.types.WYColor3B getColor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 70 */
/* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor3B;-><init>()V */
/* .line 71 */
/* .local v0, "color":Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/ColorLayer;->nativeGetColor(Lcom/wiyun/engine/types/WYColor3B;)V */
/* .line 72 */
} // .end method
public native void setAlpha ( Integer p0 ) {
} // .end method
public void setColor ( com.wiyun.engine.types.WYColor3B p0 ) {
/* .locals 3 */
/* .param p1, "color" # Lcom/wiyun/engine/types/WYColor3B; */
/* .prologue */
/* .line 78 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
/* iget v2, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
/* invoke-direct {p0, v0, v1, v2}, Lcom/wiyun/engine/nodes/ColorLayer;->nativeSetColor(III)V */
/* .line 79 */
return;
} // .end method

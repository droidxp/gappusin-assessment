public class com.wiyun.engine.nodes.MultiplexLayer extends com.wiyun.engine.nodes.Layer {
	 /* .source "MultiplexLayer.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.MultiplexLayer ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 40 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Layer;-><init>(I)V */
		 /* .line 41 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.MultiplexLayer ( ) {
		 /* .locals 3 */
		 /* .param p1, "params" # [Lcom/wiyun/engine/nodes/Layer; */
		 /* .prologue */
		 /* .line 23 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Layer;-><init>()V */
		 /* .line 24 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/MultiplexLayer;->nativeInit()V */
		 /* .line 25 */
		 /* array-length v2, p1 */
		 int v1 = 0; // const/4 v1, 0x0
	 } // :goto_0
	 /* if-lt v1, v2, :cond_0 */
	 /* .line 27 */
	 return;
	 /* .line 25 */
} // :cond_0
/* aget-object v0, p1, v1 */
/* .line 26 */
/* .local v0, "layer":Lcom/wiyun/engine/nodes/Layer; */
(( com.wiyun.engine.nodes.MultiplexLayer ) p0 ).addLayer ( v0 ); // invoke-virtual {p0, v0}, Lcom/wiyun/engine/nodes/MultiplexLayer;->addLayer(Lcom/wiyun/engine/nodes/Layer;)V
/* .line 25 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public static com.wiyun.engine.nodes.Layer from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.nodes.MultiplexLayer .from ( p0 );
} // .end method
public static com.wiyun.engine.nodes.MultiplexLayer from ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "pointer" # I */
/* .prologue */
/* .line 36 */
/* if-nez p0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/MultiplexLayer; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/MultiplexLayer;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.MultiplexLayer make ( com.wiyun.engine.nodes.Layer...p0 ) {
/* .locals 1 */
/* .param p0, "params" # [Lcom/wiyun/engine/nodes/Layer; */
/* .prologue */
/* .line 15 */
/* new-instance v0, Lcom/wiyun/engine/nodes/MultiplexLayer; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/MultiplexLayer;-><init>([Lcom/wiyun/engine/nodes/Layer;)V */
} // .end method
private native void nativeInit ( ) {
} // .end method
/* # virtual methods */
public native void addLayer ( com.wiyun.engine.nodes.Layer p0 ) {
} // .end method
protected void doNativeInit ( ) {
/* .locals 0 */
/* .prologue */
/* .line 45 */
return;
} // .end method
public native Integer getCurrentLayerIndex ( ) {
} // .end method
public native void switchTo ( Integer p0 ) {
} // .end method

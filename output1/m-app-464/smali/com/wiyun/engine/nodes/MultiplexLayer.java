public class com.wiyun.engine.nodes.MultiplexLayer extends com.wiyun.engine.nodes.Layer {
	 /* # direct methods */
	 private com.wiyun.engine.nodes.MultiplexLayer ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Layer;-><init>(I)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.nodes.MultiplexLayer ( ) {
		 /* .locals 3 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Layer;-><init>()V */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/MultiplexLayer;->nativeInit()V */
		 /* array-length v1, p1 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
	 /* if-lt v0, v1, :cond_0 */
	 return;
} // :cond_0
/* aget-object v2, p1, v0 */
(( com.wiyun.engine.nodes.MultiplexLayer ) p0 ).addLayer ( v2 ); // invoke-virtual {p0, v2}, Lcom/wiyun/engine/nodes/MultiplexLayer;->addLayer(Lcom/wiyun/engine/nodes/Layer;)V
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public static com.wiyun.engine.nodes.Layer from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
com.wiyun.engine.nodes.MultiplexLayer .from ( p0 );
} // .end method
public static com.wiyun.engine.nodes.MultiplexLayer from ( Integer p0 ) {
/* .locals 1 */
/* if-nez p0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/MultiplexLayer; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/MultiplexLayer;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.MultiplexLayer make ( com.wiyun.engine.nodes.Layer...p0 ) {
/* .locals 1 */
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
return;
} // .end method

public class com.wiyun.engine.nodes.Layer extends com.wiyun.engine.nodes.Node {
	 /* .source "Layer.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.Layer ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* .line 19 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.Layer ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 32 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
		 /* .line 33 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.Layer from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 28 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/Layer; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/Layer;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.nodes.Layer .from ( p0 );
} // .end method
public static com.wiyun.engine.nodes.Layer make ( ) {
/* .locals 1 */
/* .prologue */
/* .line 15 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Layer; */
/* invoke-direct {v0}, Lcom/wiyun/engine/nodes/Layer;-><init>()V */
} // .end method
private native void nativeInit ( ) {
} // .end method
/* # virtual methods */
protected void doNativeInit ( ) {
/* .locals 0 */
/* .prologue */
/* .line 38 */
/* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Layer;->nativeInit()V */
/* .line 39 */
return;
} // .end method

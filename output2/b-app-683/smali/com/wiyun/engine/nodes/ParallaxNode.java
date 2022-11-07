public class com.wiyun.engine.nodes.ParallaxNode extends com.wiyun.engine.nodes.Node {
	 /* .source "ParallaxNode.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.ParallaxNode ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 30 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* .line 31 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/ParallaxNode;->nativeInit()V */
		 /* .line 32 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.ParallaxNode ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 45 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
		 /* .line 46 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.nodes.ParallaxNode .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.nodes.ParallaxNode from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 41 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/ParallaxNode; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/ParallaxNode;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.ParallaxNode make ( ) {
/* .locals 1 */
/* .prologue */
/* .line 24 */
/* new-instance v0, Lcom/wiyun/engine/nodes/ParallaxNode; */
/* invoke-direct {v0}, Lcom/wiyun/engine/nodes/ParallaxNode;-><init>()V */
} // .end method
private native void nativeInit ( ) {
} // .end method
/* # virtual methods */
public native void addChild ( com.wiyun.engine.nodes.Node p0, Integer p1, Float p2, Float p3 ) {
} // .end method
public native void addChild ( com.wiyun.engine.nodes.Node p0, Integer p1, Integer p2 ) {
} // .end method
protected void doNativeInit ( ) {
/* .locals 0 */
/* .prologue */
/* .line 52 */
return;
} // .end method
public native void fling ( Float p0, Float p1 ) {
} // .end method
public native Float getMaxX ( ) {
} // .end method
public native Float getMaxY ( ) {
} // .end method
public native Float getMinX ( ) {
} // .end method
public native Float getMinY ( ) {
} // .end method
public native Float getOffsetX ( ) {
} // .end method
public native Float getOffsetY ( ) {
} // .end method
public native void offsetBy ( Float p0, Float p1 ) {
} // .end method
public native void removeAllChildren ( Boolean p0 ) {
} // .end method
public native void removeChild ( com.wiyun.engine.nodes.Node p0, Boolean p1 ) {
} // .end method
public native void setMaxX ( Float p0 ) {
} // .end method
public native void setMaxY ( Float p0 ) {
} // .end method
public native void setMinX ( Float p0 ) {
} // .end method
public native void setMinY ( Float p0 ) {
} // .end method
public native void stopFling ( ) {
} // .end method

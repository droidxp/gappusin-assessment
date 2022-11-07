public class com.wiyun.engine.box2d.Box2D extends com.wiyun.engine.nodes.Node {
	 /* .source "Box2D.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.Box2D ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 23 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* .line 24 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/Box2D;->nativeInit()V */
		 /* .line 25 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.Box2D ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 43 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
		 /* .line 44 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.Box2D from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 39 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/Box2D; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/Box2D;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.box2d.Box2D .from ( p0 );
} // .end method
public static com.wiyun.engine.box2d.Box2D make ( ) {
/* .locals 1 */
/* .prologue */
/* .line 17 */
/* new-instance v0, Lcom/wiyun/engine/box2d/Box2D; */
/* invoke-direct {v0}, Lcom/wiyun/engine/box2d/Box2D;-><init>()V */
} // .end method
private native Integer nativeGetBox2DRender ( ) {
} // .end method
private native Integer nativeGetDebugDraw ( ) {
} // .end method
private native Integer nativeGetWorld ( ) {
} // .end method
private native void nativeInit ( ) {
} // .end method
/* # virtual methods */
protected void doNativeInit ( ) {
/* .locals 0 */
/* .prologue */
/* .line 48 */
return;
} // .end method
public com.wiyun.engine.box2d.Box2DRender getBox2DRender ( ) {
/* .locals 1 */
/* .prologue */
/* .line 129 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/Box2D;->nativeGetBox2DRender()I */
com.wiyun.engine.box2d.Box2DRender .from ( v0 );
} // .end method
public com.wiyun.engine.box2d.DebugDraw getDebugDraw ( ) {
/* .locals 1 */
/* .prologue */
/* .line 111 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/Box2D;->nativeGetDebugDraw()I */
com.wiyun.engine.box2d.DebugDraw .from ( v0 );
} // .end method
public native Float getMeterPixels ( ) {
} // .end method
public com.wiyun.engine.box2d.dynamics.World getWorld ( ) {
/* .locals 1 */
/* .prologue */
/* .line 56 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/Box2D;->nativeGetWorld()I */
com.wiyun.engine.box2d.dynamics.World .from ( v0 );
} // .end method
public native Boolean isDebugDraw ( ) {
} // .end method
public native Float meter2Pixel ( Float p0 ) {
} // .end method
public native Float pixel2Meter ( Float p0 ) {
} // .end method
public native void setBox2DRender ( com.wiyun.engine.box2d.Box2DRender p0 ) {
} // .end method
public native void setDebugDraw ( Boolean p0 ) {
} // .end method
public native void setMeterPixels ( Float p0 ) {
} // .end method

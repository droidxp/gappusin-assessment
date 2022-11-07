public class com.wiyun.engine.box2d.collision.PolygonShape extends com.wiyun.engine.box2d.collision.Shape {
	 /* .source "PolygonShape.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.collision.PolygonShape ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 15 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/collision/Shape;-><init>()V */
		 /* .line 16 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/collision/PolygonShape;->nativeNew()V */
		 /* .line 17 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.collision.PolygonShape ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 22 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/box2d/collision/Shape;-><init>(I)V */
		 /* .line 23 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.collision.PolygonShape from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 8 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/collision/PolygonShape; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/collision/PolygonShape;-><init>(I)V */
} // .end method
public static com.wiyun.engine.box2d.collision.PolygonShape make ( ) {
/* .locals 1 */
/* .prologue */
/* .line 12 */
/* new-instance v0, Lcom/wiyun/engine/box2d/collision/PolygonShape; */
/* invoke-direct {v0}, Lcom/wiyun/engine/box2d/collision/PolygonShape;-><init>()V */
} // .end method
private native void nativeGetCentroid ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetVertex ( com.wiyun.engine.types.WYPoint p0, Integer p1 ) {
} // .end method
private native void nativeNew ( ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.box2d.collision.PolygonShape clone ( com.wiyun.engine.box2d.dynamics.World p0 ) {
/* .locals 1 */
/* .param p1, "world" # Lcom/wiyun/engine/box2d/dynamics/World; */
/* .prologue */
/* .line 26 */
v0 = /* invoke-super {p0, p1}, Lcom/wiyun/engine/box2d/collision/Shape;->copy(Lcom/wiyun/engine/box2d/dynamics/World;)I */
com.wiyun.engine.box2d.collision.PolygonShape .from ( v0 );
} // .end method
public com.wiyun.engine.types.WYPoint getCentroid ( ) {
/* .locals 1 */
/* .prologue */
/* .line 81 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 82 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/collision/PolygonShape;->nativeGetCentroid(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 83 */
} // .end method
public com.wiyun.engine.types.WYPoint getVertex ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "index" # I */
/* .prologue */
/* .line 68 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 69 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0, p1}, Lcom/wiyun/engine/box2d/collision/PolygonShape;->nativeGetVertex(Lcom/wiyun/engine/types/WYPoint;I)V */
/* .line 70 */
} // .end method
public native Integer getVertexCount ( ) {
} // .end method
public native void setAsBox ( Float p0, Float p1 ) {
} // .end method
public native void setAsBox ( Float p0, Float p1, Float p2, Float p3, Float p4 ) {
} // .end method
public native void setVertices ( com.wiyun.engine.types.WYPoint[] p0 ) {
} // .end method
public native Boolean validate ( ) {
} // .end method

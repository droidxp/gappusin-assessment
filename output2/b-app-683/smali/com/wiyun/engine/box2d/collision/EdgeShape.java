public class com.wiyun.engine.box2d.collision.EdgeShape extends com.wiyun.engine.box2d.collision.Shape {
	 /* .source "EdgeShape.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.collision.EdgeShape ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 15 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/collision/Shape;-><init>()V */
		 /* .line 16 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/collision/EdgeShape;->nativeNew()V */
		 /* .line 17 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.collision.EdgeShape ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 22 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/box2d/collision/Shape;-><init>(I)V */
		 /* .line 23 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.collision.EdgeShape from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 8 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/collision/EdgeShape; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/collision/EdgeShape;-><init>(I)V */
} // .end method
public static com.wiyun.engine.box2d.collision.EdgeShape make ( ) {
/* .locals 1 */
/* .prologue */
/* .line 12 */
/* new-instance v0, Lcom/wiyun/engine/box2d/collision/EdgeShape; */
/* invoke-direct {v0}, Lcom/wiyun/engine/box2d/collision/EdgeShape;-><init>()V */
} // .end method
private native void nativeGetAdjacentVertex1 ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetAdjacentVertex2 ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetEndpoint1 ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetEndpoint2 ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeNew ( ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.box2d.collision.EdgeShape clone ( com.wiyun.engine.box2d.dynamics.World p0 ) {
/* .locals 1 */
/* .param p1, "world" # Lcom/wiyun/engine/box2d/dynamics/World; */
/* .prologue */
/* .line 26 */
v0 = /* invoke-super {p0, p1}, Lcom/wiyun/engine/box2d/collision/Shape;->copy(Lcom/wiyun/engine/box2d/dynamics/World;)I */
com.wiyun.engine.box2d.collision.EdgeShape .from ( v0 );
} // .end method
public com.wiyun.engine.types.WYPoint getAdjacentVertex1 ( ) {
/* .locals 1 */
/* .prologue */
/* .line 70 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 71 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/collision/EdgeShape;->nativeGetAdjacentVertex1(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 72 */
} // .end method
public com.wiyun.engine.types.WYPoint getAdjacentVertex2 ( ) {
/* .locals 1 */
/* .prologue */
/* .line 78 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 79 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/collision/EdgeShape;->nativeGetAdjacentVertex2(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 80 */
} // .end method
public com.wiyun.engine.types.WYPoint getEndpoint1 ( ) {
/* .locals 1 */
/* .prologue */
/* .line 45 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 46 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/collision/EdgeShape;->nativeGetEndpoint1(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 47 */
} // .end method
public com.wiyun.engine.types.WYPoint getEndpoint2 ( ) {
/* .locals 1 */
/* .prologue */
/* .line 58 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 59 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/collision/EdgeShape;->nativeGetEndpoint2(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 60 */
} // .end method
public native Boolean hasAdjacentVertex1 ( ) {
} // .end method
public native Boolean hasAdjacentVertex2 ( ) {
} // .end method
public native void setEndpoints ( Float p0, Float p1, Float p2, Float p3 ) {
} // .end method

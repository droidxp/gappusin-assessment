public class com.wiyun.engine.box2d.collision.ChainShape extends com.wiyun.engine.box2d.collision.Shape {
	 /* .source "ChainShape.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.collision.ChainShape ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 23 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/collision/Shape;-><init>()V */
		 /* .line 24 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/collision/ChainShape;->nativeNew()V */
		 /* .line 25 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.collision.ChainShape ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 28 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/box2d/collision/Shape;-><init>(I)V */
		 /* .line 29 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.collision.ChainShape from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 16 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/collision/ChainShape; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/collision/ChainShape;-><init>(I)V */
} // .end method
public static com.wiyun.engine.box2d.collision.ChainShape make ( ) {
/* .locals 1 */
/* .prologue */
/* .line 20 */
/* new-instance v0, Lcom/wiyun/engine/box2d/collision/ChainShape; */
/* invoke-direct {v0}, Lcom/wiyun/engine/box2d/collision/ChainShape;-><init>()V */
} // .end method
private native Integer nativeGetChildEdge ( Integer p0 ) {
} // .end method
private native void nativeGetNextVertex ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetPrevVertex ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetVertex ( com.wiyun.engine.types.WYPoint p0, Integer p1 ) {
} // .end method
private native void nativeGetVertices ( com.wiyun.engine.types.WYPoint[] p0 ) {
} // .end method
private native void nativeNew ( ) {
} // .end method
/* # virtual methods */
public native void SetNextVertex ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
public native void SetPrevVertex ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
public com.wiyun.engine.box2d.collision.ChainShape clone ( com.wiyun.engine.box2d.dynamics.World p0 ) {
/* .locals 1 */
/* .param p1, "world" # Lcom/wiyun/engine/box2d/dynamics/World; */
/* .prologue */
/* .line 34 */
v0 = /* invoke-super {p0, p1}, Lcom/wiyun/engine/box2d/collision/Shape;->copy(Lcom/wiyun/engine/box2d/dynamics/World;)I */
com.wiyun.engine.box2d.collision.ChainShape .from ( v0 );
} // .end method
public native void createChain ( com.wiyun.engine.types.WYPoint[] p0 ) {
} // .end method
public native void createLoop ( com.wiyun.engine.types.WYPoint[] p0 ) {
} // .end method
public com.wiyun.engine.box2d.collision.EdgeShape getChildEdge ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "index" # I */
/* .prologue */
/* .line 107 */
v0 = /* invoke-direct {p0, p1}, Lcom/wiyun/engine/box2d/collision/ChainShape;->nativeGetChildEdge(I)I */
com.wiyun.engine.box2d.collision.EdgeShape .from ( v0 );
} // .end method
public native Integer getCount ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getNextVertex ( ) {
/* .locals 1 */
/* .prologue */
/* .line 82 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 83 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/collision/ChainShape;->nativeGetNextVertex(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 84 */
} // .end method
public com.wiyun.engine.types.WYPoint getPrevVertex ( ) {
/* .locals 1 */
/* .prologue */
/* .line 69 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 70 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/collision/ChainShape;->nativeGetPrevVertex(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 71 */
} // .end method
public com.wiyun.engine.types.WYPoint getVertex ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "index" # I */
/* .prologue */
/* .line 126 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 127 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0, p1}, Lcom/wiyun/engine/box2d/collision/ChainShape;->nativeGetVertex(Lcom/wiyun/engine/types/WYPoint;I)V */
/* .line 128 */
} // .end method
public com.wiyun.engine.types.WYPoint getVertices ( ) {
/* .locals 2 */
/* .prologue */
/* .line 140 */
v1 = (( com.wiyun.engine.box2d.collision.ChainShape ) p0 ).getCount ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/box2d/collision/ChainShape;->getCount()I
/* new-array v0, v1, [Lcom/wiyun/engine/types/WYPoint; */
/* .line 141 */
/* .local v0, "vertices":[Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/collision/ChainShape;->nativeGetVertices([Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 142 */
} // .end method
public native Boolean hasNextVertex ( ) {
} // .end method
public native Boolean hasPrevVertex ( ) {
} // .end method

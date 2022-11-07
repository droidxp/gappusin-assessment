public class com.wiyun.engine.box2d.collision.CircleShape extends com.wiyun.engine.box2d.collision.Shape {
	 /* .source "CircleShape.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.collision.CircleShape ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 15 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/collision/Shape;-><init>()V */
		 /* .line 16 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/collision/CircleShape;->nativeNew()V */
		 /* .line 17 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.collision.CircleShape ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 22 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/box2d/collision/Shape;-><init>(I)V */
		 /* .line 23 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.collision.CircleShape from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 8 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/collision/CircleShape; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/collision/CircleShape;-><init>(I)V */
} // .end method
public static com.wiyun.engine.box2d.collision.CircleShape make ( ) {
/* .locals 1 */
/* .prologue */
/* .line 12 */
/* new-instance v0, Lcom/wiyun/engine/box2d/collision/CircleShape; */
/* invoke-direct {v0}, Lcom/wiyun/engine/box2d/collision/CircleShape;-><init>()V */
} // .end method
private native void nativeGetPosition ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetSupportVertex ( com.wiyun.engine.types.WYPoint p0, Float p1, Float p2 ) {
} // .end method
private native void nativeGetVertex ( com.wiyun.engine.types.WYPoint p0, Integer p1 ) {
} // .end method
private native void nativeNew ( ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.box2d.collision.CircleShape clone ( com.wiyun.engine.box2d.dynamics.World p0 ) {
/* .locals 1 */
/* .param p1, "world" # Lcom/wiyun/engine/box2d/dynamics/World; */
/* .prologue */
/* .line 26 */
v0 = /* invoke-super {p0, p1}, Lcom/wiyun/engine/box2d/collision/Shape;->copy(Lcom/wiyun/engine/box2d/dynamics/World;)I */
com.wiyun.engine.box2d.collision.CircleShape .from ( v0 );
} // .end method
public com.wiyun.engine.types.WYPoint getPosition ( ) {
/* .locals 1 */
/* .prologue */
/* .line 43 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 44 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/collision/CircleShape;->nativeGetPosition(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 45 */
} // .end method
public native Integer getSupport ( Float p0, Float p1 ) {
} // .end method
public Integer getSupport ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p1, "d" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 54 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
v0 = (( com.wiyun.engine.box2d.collision.CircleShape ) p0 ).getSupport ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/box2d/collision/CircleShape;->getSupport(FF)I
} // .end method
public com.wiyun.engine.types.WYPoint getSupportVertex ( Float p0, Float p1 ) {
/* .locals 1 */
/* .param p1, "x" # F */
/* .param p2, "y" # F */
/* .prologue */
/* .line 73 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 74 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0, p1, p2}, Lcom/wiyun/engine/box2d/collision/CircleShape;->nativeGetSupportVertex(Lcom/wiyun/engine/types/WYPoint;FF)V */
/* .line 75 */
} // .end method
public com.wiyun.engine.types.WYPoint getSupportVertex ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p1, "d" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 66 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.box2d.collision.CircleShape ) p0 ).getSupportVertex ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/box2d/collision/CircleShape;->getSupportVertex(FF)Lcom/wiyun/engine/types/WYPoint;
} // .end method
public com.wiyun.engine.types.WYPoint getVertex ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "index" # I */
/* .prologue */
/* .line 89 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 90 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0, p1}, Lcom/wiyun/engine/box2d/collision/CircleShape;->nativeGetVertex(Lcom/wiyun/engine/types/WYPoint;I)V */
/* .line 91 */
} // .end method
public native Integer getVertexCount ( ) {
} // .end method
public native void setPosition ( Float p0, Float p1 ) {
} // .end method

public class com.wiyun.engine.box2d.collision.Manifold extends com.wiyun.engine.BaseObject {
	 /* .source "Manifold.java" */
	 /* # static fields */
	 public static final Integer TYPE_CIRCLES;
	 public static final Integer TYPE_FACE_A;
	 public static final Integer TYPE_FACE_B;
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.collision.Manifold ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 16 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseObject;-><init>()V */
		 /* .line 17 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.collision.Manifold ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 20 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseObject;-><init>(I)V */
		 /* .line 21 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.collision.Manifold from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 13 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/collision/Manifold; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/collision/Manifold;-><init>(I)V */
} // .end method
private native void nativeGetLocalNormal ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetLocalPoint ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetManifoldPoint ( Integer p0, com.wiyun.engine.box2d.collision.ManifoldPoint p1 ) {
} // .end method
/* # virtual methods */
public native void destroy ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint getLocalNormal ( ) {
/* .locals 1 */
/* .prologue */
/* .line 64 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 65 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/collision/Manifold;->nativeGetLocalNormal(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 66 */
} // .end method
public com.wiyun.engine.types.WYPoint getLocalPoint ( ) {
/* .locals 1 */
/* .prologue */
/* .line 51 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 52 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/box2d/collision/Manifold;->nativeGetLocalPoint(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 53 */
} // .end method
public com.wiyun.engine.box2d.collision.ManifoldPoint getManifoldPoint ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "index" # I */
/* .prologue */
/* .line 78 */
/* new-instance v0, Lcom/wiyun/engine/box2d/collision/ManifoldPoint; */
/* invoke-direct {v0}, Lcom/wiyun/engine/box2d/collision/ManifoldPoint;-><init>()V */
/* .line 79 */
/* .local v0, "mp":Lcom/wiyun/engine/box2d/collision/ManifoldPoint; */
/* invoke-direct {p0, p1, v0}, Lcom/wiyun/engine/box2d/collision/Manifold;->nativeGetManifoldPoint(ILcom/wiyun/engine/box2d/collision/ManifoldPoint;)V */
/* .line 80 */
} // .end method
public native Integer getPointCount ( ) {
} // .end method
public native Integer getType ( ) {
} // .end method

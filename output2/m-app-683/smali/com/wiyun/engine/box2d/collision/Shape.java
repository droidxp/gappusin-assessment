public abstract class com.wiyun.engine.box2d.collision.Shape extends com.wiyun.engine.BaseObject {
	 /* .source "Shape.java" */
	 /* # static fields */
	 public static final Integer TYPE_CIRCLE;
	 public static final Integer TYPE_EDGE;
	 public static final Integer TYPE_LOOP;
	 public static final Integer TYPE_POLYGON;
	 public static final Integer TYPE_UNKNOWN;
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.collision.Shape ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 15 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseObject;-><init>()V */
		 /* .line 16 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.collision.Shape ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 19 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseObject;-><init>(I)V */
		 /* .line 20 */
		 return;
	 } // .end method
	 private native void nativeComputeAABB ( com.wiyun.engine.box2d.collision.AABB p0, com.wiyun.engine.box2d.common.Transform p1, Integer p2 ) {
	 } // .end method
	 private native void nativeComputeMass ( com.wiyun.engine.box2d.collision.MassData p0, Float p1 ) {
	 } // .end method
	 private native void nativeRayCast ( com.wiyun.engine.box2d.collision.RayCastOutput p0, com.wiyun.engine.box2d.collision.RayCastInput p1, com.wiyun.engine.box2d.common.Transform p2, Integer p3 ) {
	 } // .end method
	 /* # virtual methods */
	 public com.wiyun.engine.box2d.collision.AABB computeAABB ( com.wiyun.engine.box2d.common.Transform p0, Integer p1 ) {
		 /* .locals 1 */
		 /* .param p1, "xf" # Lcom/wiyun/engine/box2d/common/Transform; */
		 /* .param p2, "childIndex" # I */
		 /* .prologue */
		 /* .line 94 */
		 /* new-instance v0, Lcom/wiyun/engine/box2d/collision/AABB; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/box2d/collision/AABB;-><init>()V */
		 /* .line 95 */
		 /* .local v0, "ab":Lcom/wiyun/engine/box2d/collision/AABB; */
		 /* invoke-direct {p0, v0, p1, p2}, Lcom/wiyun/engine/box2d/collision/Shape;->nativeComputeAABB(Lcom/wiyun/engine/box2d/collision/AABB;Lcom/wiyun/engine/box2d/common/Transform;I)V */
		 /* .line 96 */
	 } // .end method
	 public com.wiyun.engine.box2d.collision.MassData computeMass ( Float p0 ) {
		 /* .locals 1 */
		 /* .param p1, "density" # F */
		 /* .prologue */
		 /* .line 109 */
		 /* new-instance v0, Lcom/wiyun/engine/box2d/collision/MassData; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/box2d/collision/MassData;-><init>()V */
		 /* .line 110 */
		 /* .local v0, "d":Lcom/wiyun/engine/box2d/collision/MassData; */
		 /* invoke-direct {p0, v0, p1}, Lcom/wiyun/engine/box2d/collision/Shape;->nativeComputeMass(Lcom/wiyun/engine/box2d/collision/MassData;F)V */
		 /* .line 111 */
	 } // .end method
	 protected native Integer copy ( com.wiyun.engine.box2d.dynamics.World p0 ) {
	 } // .end method
	 public native Integer getChildCount ( ) {
	 } // .end method
	 public native Float getRadius ( ) {
	 } // .end method
	 public native Integer getType ( ) {
	 } // .end method
	 public com.wiyun.engine.box2d.collision.RayCastOutput rayCast ( com.wiyun.engine.box2d.collision.RayCastInput p0, com.wiyun.engine.box2d.common.Transform p1, Integer p2 ) {
		 /* .locals 1 */
		 /* .param p1, "input" # Lcom/wiyun/engine/box2d/collision/RayCastInput; */
		 /* .param p2, "trans" # Lcom/wiyun/engine/box2d/common/Transform; */
		 /* .param p3, "childIndex" # I */
		 /* .prologue */
		 /* .line 79 */
		 /* new-instance v0, Lcom/wiyun/engine/box2d/collision/RayCastOutput; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/box2d/collision/RayCastOutput;-><init>()V */
		 /* .line 80 */
		 /* .local v0, "o":Lcom/wiyun/engine/box2d/collision/RayCastOutput; */
		 /* invoke-direct {p0, v0, p1, p2, p3}, Lcom/wiyun/engine/box2d/collision/Shape;->nativeRayCast(Lcom/wiyun/engine/box2d/collision/RayCastOutput;Lcom/wiyun/engine/box2d/collision/RayCastInput;Lcom/wiyun/engine/box2d/common/Transform;I)V */
		 /* .line 81 */
	 } // .end method
	 public native void setRadius ( Float p0 ) {
	 } // .end method
	 public native void setType ( Integer p0 ) {
	 } // .end method
	 public native Boolean testPoint ( com.wiyun.engine.box2d.common.Transform p0, com.wiyun.engine.types.WYPoint p1 ) {
	 } // .end method

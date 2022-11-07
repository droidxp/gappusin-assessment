public class com.wiyun.engine.box2d.CollisionDetector extends com.wiyun.engine.BaseWYObject {
	 /* .source "CollisionDetector.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.CollisionDetector ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 27 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 28 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/CollisionDetector;->nativeInit()V */
		 /* .line 29 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.CollisionDetector ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 32 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
		 /* .line 33 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.CollisionDetector from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 24 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/CollisionDetector; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/CollisionDetector;-><init>(I)V */
} // .end method
public static com.wiyun.engine.box2d.CollisionDetector make ( ) {
/* .locals 1 */
/* .prologue */
/* .line 20 */
/* new-instance v0, Lcom/wiyun/engine/box2d/CollisionDetector; */
/* invoke-direct {v0}, Lcom/wiyun/engine/box2d/CollisionDetector;-><init>()V */
} // .end method
private native void nativeInit ( ) {
} // .end method
/* # virtual methods */
public native Boolean isCollided ( com.wiyun.engine.nodes.Node p0, com.wiyun.engine.nodes.Node p1, com.wiyun.engine.box2d.CDResult p2 ) {
} // .end method
public native Boolean isCollided ( com.wiyun.engine.nodes.Node p0, com.wiyun.engine.types.WYRect p1, com.wiyun.engine.box2d.CDResult p2 ) {
} // .end method
public native Boolean isCollided ( com.wiyun.engine.types.WYRect p0, com.wiyun.engine.types.WYRect p1, com.wiyun.engine.box2d.CDResult p2 ) {
} // .end method
public native void setNodeShape ( com.wiyun.engine.nodes.Node p0, Integer p1 ) {
} // .end method
public native void setNodeShape ( com.wiyun.engine.nodes.Node p0, com.wiyun.engine.types.WYPoint[] p1 ) {
} // .end method

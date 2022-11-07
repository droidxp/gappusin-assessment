public class com.wiyun.engine.box2d.DebugDraw extends com.wiyun.engine.BaseObject {
	 /* .source "DebugDraw.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.DebugDraw ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 16 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseObject;-><init>()V */
		 /* .line 17 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.DebugDraw ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 20 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseObject;-><init>(I)V */
		 /* .line 21 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.DebugDraw from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 13 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/DebugDraw; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/DebugDraw;-><init>(I)V */
} // .end method
/* # virtual methods */
public native void drawCircle ( com.wiyun.engine.types.WYPoint p0, Float p1, com.wiyun.engine.types.WYColor3F p2 ) {
} // .end method
public native void drawPoint ( com.wiyun.engine.types.WYPoint p0, Float p1, com.wiyun.engine.types.WYColor3F p2 ) {
} // .end method
public native void drawPolygon ( com.wiyun.engine.types.WYPoint[] p0, com.wiyun.engine.types.WYColor3F p1 ) {
} // .end method
public native void drawSegment ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1, com.wiyun.engine.types.WYColor3F p2 ) {
} // .end method
public native void drawSolidCircle ( com.wiyun.engine.types.WYPoint p0, Float p1, com.wiyun.engine.types.WYPoint p2, com.wiyun.engine.types.WYColor3F p3 ) {
} // .end method
public native void drawSolidPolygon ( com.wiyun.engine.types.WYPoint[] p0, com.wiyun.engine.types.WYColor3F p1 ) {
} // .end method
public native void drawTransform ( com.wiyun.engine.box2d.common.Transform p0 ) {
} // .end method

public class com.wiyun.engine.opengl.Primitives {
	 /* # direct methods */
	 public com.wiyun.engine.opengl.Primitives ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static native void drawBezier ( com.wiyun.engine.types.WYBezierConfig p0, Integer p1 ) {
	 } // .end method
	 public static native void drawCircle ( Float p0, Float p1, Float p2, Float p3, Integer p4, Boolean p5 ) {
	 } // .end method
	 public static native void drawDashLine ( Float p0, Float p1, Float p2, Float p3, Float p4 ) {
	 } // .end method
	 public static native void drawDashPath ( Float[] p0, Float p1 ) {
	 } // .end method
	 public static native void drawHypotrochoid ( com.wiyun.engine.types.WYHypotrochoidConfig p0, Integer p1 ) {
	 } // .end method
	 public static native void drawLagrange ( com.wiyun.engine.types.WYLagrangeConfig p0, Integer p1 ) {
	 } // .end method
	 public static native void drawLine ( Float p0, Float p1, Float p2, Float p3 ) {
	 } // .end method
	 public static void drawLine ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
		 /* .locals 4 */
		 /* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* iget v2, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* iget v3, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 com.wiyun.engine.opengl.Primitives .drawLine ( v0,v1,v2,v3 );
		 return;
	 } // .end method
	 public static native void drawPath ( Float[] p0 ) {
	 } // .end method
	 public static native void drawPoint ( Float p0, Float p1 ) {
	 } // .end method
	 public static native void drawPoints ( Float[] p0 ) {
	 } // .end method
	 public static native void drawPoints ( com.wiyun.engine.types.WYPoint[] p0 ) {
	 } // .end method
	 public static native void drawPoly ( com.wiyun.engine.types.WYPoint[] p0, Boolean p1 ) {
	 } // .end method
	 public static native void drawRect ( com.wiyun.engine.types.WYRect p0 ) {
	 } // .end method
	 public static native void drawSolidCircle ( Float p0, Float p1, Float p2, Integer p3, com.wiyun.engine.types.WYColor4B p4 ) {
	 } // .end method
	 public static native void drawSolidPoly ( com.wiyun.engine.types.WYPoint[] p0, com.wiyun.engine.types.WYColor4B p1 ) {
	 } // .end method
	 public static native void drawSolidRect ( com.wiyun.engine.types.WYRect p0, com.wiyun.engine.types.WYColor4B p1 ) {
	 } // .end method

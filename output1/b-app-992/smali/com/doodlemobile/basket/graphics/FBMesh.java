public class com.doodlemobile.basket.graphics.FBMesh {
	 /* # instance fields */
	 private Long a;
	 /* # direct methods */
	 private static native Long nativeCreateObject ( Integer p0, Float[] p1, Integer p2, Integer[] p3, Integer p4, Integer p5, Integer p6, Integer p7 ) {
	 } // .end method
	 private static native void nativeReleaseObject ( Long p0 ) {
	 } // .end method
	 private static native void nativeRender ( Long p0, Long p1, Float p2, Float p3, Float p4, Float p5 ) {
	 } // .end method
	 /* # virtual methods */
	 protected final void finalize ( ) {
		 /* .locals 4 */
		 /* const-wide/16 v2, 0x0 */
		 /* iget-wide v0, p0, Lcom/doodlemobile/basket/graphics/FBMesh;->a:J */
		 /* cmp-long v0, v0, v2 */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* iget-wide v0, p0, Lcom/doodlemobile/basket/graphics/FBMesh;->a:J */
			 com.doodlemobile.basket.graphics.FBMesh .nativeReleaseObject ( v0,v1 );
			 /* iput-wide v2, p0, Lcom/doodlemobile/basket/graphics/FBMesh;->a:J */
		 } // :cond_0
		 return;
	 } // .end method

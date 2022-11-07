public class com.doodlemobile.basket.math.Matrix {
	 /* # instance fields */
	 private Long a;
	 /* # direct methods */
	 static com.doodlemobile.basket.math.Matrix ( ) {
		 /* .locals 0 */
		 com.doodlemobile.basket.util.Util .a ( );
		 return;
	 } // .end method
	 public com.doodlemobile.basket.math.Matrix ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 com.doodlemobile.basket.math.Matrix .createNativeObject ( );
		 /* move-result-wide v0 */
		 /* iput-wide v0, p0, Lcom/doodlemobile/basket/math/Matrix;->a:J */
		 return;
	 } // .end method
	 private static native Long createNativeObject ( ) {
	 } // .end method
	 private static native void nativeCopyTo ( Long p0, Long p1 ) {
	 } // .end method
	 public static native void nativeloadortho2d ( Long p0, Float p1, Float p2, Float p3, Float p4 ) {
	 } // .end method
	 public static native void nativeloadquat ( Long p0, Float p1, Float p2, Float p3, Float p4 ) {
	 } // .end method
	 public static native void nativepushrotation ( Long p0, Float p1 ) {
	 } // .end method
	 public static native void nativepushrotation1 ( Long p0, Float p1, Float p2, Float p3, Float p4 ) {
	 } // .end method
	 public static native void nativepushrotationwithquat ( Long p0, Float p1, Float p2, Float p3, Float p4 ) {
	 } // .end method
	 public static native void nativepushscale ( Long p0, Float p1 ) {
	 } // .end method
	 public static native void nativepushscale1 ( Long p0, Float p1, Float p2 ) {
	 } // .end method
	 public static native void nativepushscale2 ( Long p0, Float p1, Float p2, Float p3 ) {
	 } // .end method
	 public static native void nativepushtranslate ( Long p0, Float p1, Float p2 ) {
	 } // .end method
	 public static native void nativepushtranslate1 ( Long p0, Float p1, Float p2, Float p3 ) {
	 } // .end method
	 private static native void releaseNativeObject ( Long p0 ) {
	 } // .end method
	 /* # virtual methods */
	 protected final void finalize ( ) {
		 /* .locals 4 */
		 /* const-wide/16 v2, 0x0 */
		 /* iget-wide v0, p0, Lcom/doodlemobile/basket/math/Matrix;->a:J */
		 /* cmp-long v0, v0, v2 */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* iget-wide v0, p0, Lcom/doodlemobile/basket/math/Matrix;->a:J */
			 com.doodlemobile.basket.math.Matrix .releaseNativeObject ( v0,v1 );
			 /* iput-wide v2, p0, Lcom/doodlemobile/basket/math/Matrix;->a:J */
		 } // :cond_0
		 return;
	 } // .end method

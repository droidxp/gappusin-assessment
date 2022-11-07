public class com.doodlemobile.basket.math.MatrixStack {
	 /* # instance fields */
	 private Long a;
	 /* # direct methods */
	 static com.doodlemobile.basket.math.MatrixStack ( ) {
		 /* .locals 0 */
		 com.doodlemobile.basket.util.Util .a ( );
		 return;
	 } // .end method
	 private com.doodlemobile.basket.math.MatrixStack ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* const-wide/16 v0, 0x0 */
		 /* iput-wide v0, p0, Lcom/doodlemobile/basket/math/MatrixStack;->a:J */
		 /* const/16 v0, 0x20 */
		 com.doodlemobile.basket.math.MatrixStack .createNativeObject ( v0 );
		 /* move-result-wide v0 */
		 /* iput-wide v0, p0, Lcom/doodlemobile/basket/math/MatrixStack;->a:J */
		 return;
	 } // .end method
	 public com.doodlemobile.basket.math.MatrixStack ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/doodlemobile/basket/math/MatrixStack;-><init>()V */
		 return;
	 } // .end method
	 private static native Long createNativeObject ( Integer p0 ) {
	 } // .end method
	 private static native void nativeCopyTo ( Long p0, Long p1 ) {
	 } // .end method
	 public static native void nativeloadortho2d ( Long p0, Float p1, Float p2, Float p3, Float p4 ) {
	 } // .end method
	 private static native void nativepop ( Long p0 ) {
	 } // .end method
	 private static native void nativepush ( Long p0 ) {
	 } // .end method
	 public static native void nativepushrotation ( Long p0, Float p1 ) {
	 } // .end method
	 public static native void nativepushrotation1 ( Long p0, Float p1, Float p2, Float p3, Float p4 ) {
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
	 private static native void nativereset ( Long p0 ) {
	 } // .end method
	 private static native void releaseNativeObject ( Long p0 ) {
	 } // .end method
	 /* # virtual methods */
	 public final void a ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/doodlemobile/basket/math/MatrixStack;->a:J */
		 com.doodlemobile.basket.math.MatrixStack .nativereset ( v0,v1 );
		 return;
	 } // .end method
	 public final void a ( Float p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/doodlemobile/basket/math/MatrixStack;->a:J */
		 com.doodlemobile.basket.math.MatrixStack .nativepushrotation ( v0,v1,p1 );
		 return;
	 } // .end method
	 public final void a ( Float p0, Float p1 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/doodlemobile/basket/math/MatrixStack;->a:J */
		 com.doodlemobile.basket.math.MatrixStack .nativepushtranslate ( v0,v1,p1,p2 );
		 return;
	 } // .end method
	 public final void b ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/doodlemobile/basket/math/MatrixStack;->a:J */
		 com.doodlemobile.basket.math.MatrixStack .nativepush ( v0,v1 );
		 return;
	 } // .end method
	 public final void b ( Float p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/doodlemobile/basket/math/MatrixStack;->a:J */
		 com.doodlemobile.basket.math.MatrixStack .nativepushscale ( v0,v1,p1 );
		 return;
	 } // .end method
	 public final void b ( Float p0, Float p1 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/doodlemobile/basket/math/MatrixStack;->a:J */
		 com.doodlemobile.basket.math.MatrixStack .nativepushscale1 ( v0,v1,p1,p2 );
		 return;
	 } // .end method
	 public final void c ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/doodlemobile/basket/math/MatrixStack;->a:J */
		 com.doodlemobile.basket.math.MatrixStack .nativepop ( v0,v1 );
		 return;
	 } // .end method
	 public final void c ( Float p0, Float p1 ) {
		 /* .locals 6 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* iget-wide v0, p0, Lcom/doodlemobile/basket/math/MatrixStack;->a:J */
		 /* move v3, v2 */
		 /* move v4, p1 */
		 /* move v5, p2 */
		 /* invoke-static/range {v0 ..v5}, Lcom/doodlemobile/basket/math/MatrixStack;->nativeloadortho2d(JFFFF)V */
		 return;
	 } // .end method
	 public final Long d ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/doodlemobile/basket/math/MatrixStack;->a:J */
		 /* return-wide v0 */
	 } // .end method
	 protected final void finalize ( ) {
		 /* .locals 4 */
		 /* const-wide/16 v2, 0x0 */
		 /* iget-wide v0, p0, Lcom/doodlemobile/basket/math/MatrixStack;->a:J */
		 /* cmp-long v0, v0, v2 */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* iget-wide v0, p0, Lcom/doodlemobile/basket/math/MatrixStack;->a:J */
			 com.doodlemobile.basket.math.MatrixStack .releaseNativeObject ( v0,v1 );
			 /* iput-wide v2, p0, Lcom/doodlemobile/basket/math/MatrixStack;->a:J */
		 } // :cond_0
		 return;
	 } // .end method

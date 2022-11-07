public class com.doodlemobile.basket.util.Util {
	 /* # static fields */
	 private static Boolean a;
	 /* # direct methods */
	 static com.doodlemobile.basket.util.Util ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 com.doodlemobile.basket.util.Util.a = (v0!= 0);
		 return;
	 } // .end method
	 public com.doodlemobile.basket.util.Util ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void a ( ) {
		 /* .locals 1 */
		 /* sget-boolean v0, Lcom/doodlemobile/basket/util/Util;->a:Z */
		 /* if-nez v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
		 com.doodlemobile.basket.util.Util.a = (v0!= 0);
		 final String v0 = "basket"; // const-string v0, "basket"
		 java.lang.System .loadLibrary ( v0 );
		 com.doodlemobile.basket.util.Util .initdbg ( );
	 } // :cond_0
	 return;
} // .end method
public static a ( Integer[] p0, Integer p1 ) {
	 /* .locals 3 */
	 int v2 = 0; // const/4 v2, 0x0
	 /* new-array v0, p1, [I */
	 /* array-length v1, p0 */
	 v1 = 	 java.lang.Math .min ( v1,p1 );
	 java.lang.System .arraycopy ( p0,v2,v0,v2,v1 );
} // .end method
public static java.lang.Object a ( java.lang.Object[] p0, Integer p1 ) {
	 /* .locals 3 */
	 int v2 = 0; // const/4 v2, 0x0
	 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
	 (( java.lang.Class ) v0 ).getComponentType ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
	 java.lang.reflect.Array .newInstance ( v0,p1 );
	 /* check-cast v0, [Ljava/lang/Object; */
	 /* array-length v1, p0 */
	 v1 = 	 java.lang.Math .min ( v1,p1 );
	 java.lang.System .arraycopy ( p0,v2,v0,v2,v1 );
} // .end method
private static native void initdbg ( ) {
} // .end method
private static void nativeCrashed ( ) {
	 /* .locals 2 */
	 /* new-instance v0, Ljava/lang/RuntimeException; */
	 final String v1 = "crashed here (native trace should follow after the Java trace)"; // const-string v1, "crashed here (native trace should follow after the Java trace)"
	 /* invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
	 (( java.lang.RuntimeException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/RuntimeException;->printStackTrace()V
	 return;
} // .end method
public static native void nativeRenderLines ( Long p0, Long p1, Float p2, Integer p3, Float p4, Float p5, Float p6, Float p7 ) {
} // .end method
public static native void nativeRenderParticle ( Long p0, Long p1, Long p2, Long p3, Integer p4, Integer p5 ) {
} // .end method
public static native void nativeRenderPolygon ( Long p0, Long p1, Integer p2, Float p3, Float p4, Float p5, Float p6, Float p7 ) {
} // .end method
public static native void nativeRenderRect ( Long p0, Float p1, Float p2, Float p3, Float p4, Float p5, Float p6, Float p7, Float p8 ) {
} // .end method
public static native void nativeRenderRect1 ( Long p0, Integer p1, Float p2, Float p3, Float p4, Float p5, Float p6, Float p7, Float p8, Float p9, Float p10, Float p11, Float p12, Float p13 ) {
} // .end method
public static native void nativeRenderRects ( Long p0, Long p1, Long p2, Integer p3, Integer p4, Float p5, Float p6, Float p7, Float p8 ) {
} // .end method
public static native void nativeRenderVertices ( Integer p0, Long p1, Long p2, Float p3, Integer p4, Float p5, Float p6, Float p7, Float p8 ) {
} // .end method

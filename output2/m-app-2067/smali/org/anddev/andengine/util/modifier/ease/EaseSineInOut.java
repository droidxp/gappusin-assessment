public class org.anddev.andengine.util.modifier.ease.EaseSineInOut implements org.anddev.andengine.util.modifier.ease.IEaseFunction {
	 /* # interfaces */
	 /* # static fields */
	 private static org.anddev.andengine.util.modifier.ease.EaseSineInOut INSTANCE;
	 /* # direct methods */
	 private org.anddev.andengine.util.modifier.ease.EaseSineInOut ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.util.modifier.ease.EaseSineInOut getInstance ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.util.modifier.ease.EaseSineInOut.INSTANCE;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Lorg/anddev/andengine/util/modifier/ease/EaseSineInOut; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/util/modifier/ease/EaseSineInOut;-><init>()V */
	 } // :cond_0
	 v0 = org.anddev.andengine.util.modifier.ease.EaseSineInOut.INSTANCE;
} // .end method
/* # virtual methods */
public Float getPercentageDone ( Float p0, Float p1, Float p2, Float p3 ) {
	 /* .locals 3 */
	 /* neg-float v0, p4 */
	 /* const/high16 v1, 0x3f000000 # 0.5f */
	 /* mul-float/2addr v0, v1 */
	 /* const v1, 0x40490fdb # (float)Math.PI */
	 /* mul-float/2addr v1, p1 */
	 /* div-float/2addr v1, p2 */
	 v1 = 	 android.util.FloatMath .cos ( v1 );
	 /* const/high16 v2, 0x3f800000 # 1.0f */
	 /* sub-float/2addr v1, v2 */
	 /* mul-float/2addr v0, v1 */
	 /* add-float/2addr v0, p3 */
} // .end method

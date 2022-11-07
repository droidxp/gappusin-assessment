public class org.anddev.andengine.util.modifier.ease.EaseCircularOut implements org.anddev.andengine.util.modifier.ease.IEaseFunction {
	 /* # interfaces */
	 /* # static fields */
	 private static org.anddev.andengine.util.modifier.ease.EaseCircularOut INSTANCE;
	 /* # direct methods */
	 private org.anddev.andengine.util.modifier.ease.EaseCircularOut ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.util.modifier.ease.EaseCircularOut getInstance ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.util.modifier.ease.EaseCircularOut.INSTANCE;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Lorg/anddev/andengine/util/modifier/ease/EaseCircularOut; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/util/modifier/ease/EaseCircularOut;-><init>()V */
	 } // :cond_0
	 v0 = org.anddev.andengine.util.modifier.ease.EaseCircularOut.INSTANCE;
} // .end method
/* # virtual methods */
public Float getPercentageDone ( Float p0, Float p1, Float p2, Float p3 ) {
	 /* .locals 2 */
	 /* const/high16 v1, 0x3f800000 # 1.0f */
	 /* div-float v0, p1, p2 */
	 /* sub-float/2addr v0, v1 */
	 /* mul-float/2addr v0, v0 */
	 /* sub-float v0, v1, v0 */
	 v0 = 	 android.util.FloatMath .sqrt ( v0 );
	 /* mul-float/2addr v0, p4 */
	 /* add-float/2addr v0, p3 */
} // .end method

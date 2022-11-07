public class org.anddev.andengine.util.modifier.ease.EaseCircularIn implements org.anddev.andengine.util.modifier.ease.IEaseFunction {
	 /* # interfaces */
	 /* # static fields */
	 private static org.anddev.andengine.util.modifier.ease.EaseCircularIn INSTANCE;
	 /* # direct methods */
	 private org.anddev.andengine.util.modifier.ease.EaseCircularIn ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.util.modifier.ease.EaseCircularIn getInstance ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.util.modifier.ease.EaseCircularIn.INSTANCE;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Lorg/anddev/andengine/util/modifier/ease/EaseCircularIn; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/util/modifier/ease/EaseCircularIn;-><init>()V */
	 } // :cond_0
	 v0 = org.anddev.andengine.util.modifier.ease.EaseCircularIn.INSTANCE;
} // .end method
/* # virtual methods */
public Float getPercentageDone ( Float p0, Float p1, Float p2, Float p3 ) {
	 /* .locals 3 */
	 /* const/high16 v2, 0x3f800000 # 1.0f */
	 /* neg-float v0, p4 */
	 /* div-float v1, p1, p2 */
	 /* mul-float/2addr v1, v1 */
	 /* sub-float v1, v2, v1 */
	 v1 = 	 android.util.FloatMath .sqrt ( v1 );
	 /* sub-float/2addr v1, v2 */
	 /* mul-float/2addr v0, v1 */
	 /* add-float/2addr v0, p3 */
} // .end method

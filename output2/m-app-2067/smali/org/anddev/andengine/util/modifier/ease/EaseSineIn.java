public class org.anddev.andengine.util.modifier.ease.EaseSineIn implements org.anddev.andengine.util.constants.MathConstants implements org.anddev.andengine.util.modifier.ease.IEaseFunction {
	 /* # interfaces */
	 /* # static fields */
	 private static org.anddev.andengine.util.modifier.ease.EaseSineIn INSTANCE;
	 /* # direct methods */
	 private org.anddev.andengine.util.modifier.ease.EaseSineIn ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.util.modifier.ease.EaseSineIn getInstance ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.util.modifier.ease.EaseSineIn.INSTANCE;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Lorg/anddev/andengine/util/modifier/ease/EaseSineIn; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/util/modifier/ease/EaseSineIn;-><init>()V */
	 } // :cond_0
	 v0 = org.anddev.andengine.util.modifier.ease.EaseSineIn.INSTANCE;
} // .end method
/* # virtual methods */
public Float getPercentageDone ( Float p0, Float p1, Float p2, Float p3 ) {
	 /* .locals 3 */
	 /* neg-float v0, p4 */
	 /* div-float v1, p1, p2 */
	 /* const v2, 0x3fc90fdb */
	 /* mul-float/2addr v1, v2 */
	 v1 = 	 android.util.FloatMath .cos ( v1 );
	 /* mul-float/2addr v0, v1 */
	 /* add-float/2addr v0, p4 */
	 /* add-float/2addr v0, p3 */
} // .end method

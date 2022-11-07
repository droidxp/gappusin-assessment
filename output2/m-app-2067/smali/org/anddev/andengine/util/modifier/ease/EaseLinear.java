public class org.anddev.andengine.util.modifier.ease.EaseLinear implements org.anddev.andengine.util.modifier.ease.IEaseFunction {
	 /* # interfaces */
	 /* # static fields */
	 private static org.anddev.andengine.util.modifier.ease.EaseLinear INSTANCE;
	 /* # direct methods */
	 private org.anddev.andengine.util.modifier.ease.EaseLinear ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.util.modifier.ease.EaseLinear getInstance ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.util.modifier.ease.EaseLinear.INSTANCE;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Lorg/anddev/andengine/util/modifier/ease/EaseLinear; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/util/modifier/ease/EaseLinear;-><init>()V */
	 } // :cond_0
	 v0 = org.anddev.andengine.util.modifier.ease.EaseLinear.INSTANCE;
} // .end method
/* # virtual methods */
public Float getPercentageDone ( Float p0, Float p1, Float p2, Float p3 ) {
	 /* .locals 1 */
	 /* mul-float v0, p4, p1 */
	 /* div-float/2addr v0, p2 */
	 /* add-float/2addr v0, p3 */
} // .end method

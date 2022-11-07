public class org.anddev.andengine.util.modifier.ease.EaseBounceIn implements org.anddev.andengine.util.modifier.ease.IEaseFunction {
	 /* # interfaces */
	 /* # static fields */
	 private static org.anddev.andengine.util.modifier.ease.EaseBounceIn INSTANCE;
	 /* # direct methods */
	 private org.anddev.andengine.util.modifier.ease.EaseBounceIn ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.util.modifier.ease.EaseBounceIn getInstance ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.util.modifier.ease.EaseBounceIn.INSTANCE;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Lorg/anddev/andengine/util/modifier/ease/EaseBounceIn; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/util/modifier/ease/EaseBounceIn;-><init>()V */
	 } // :cond_0
	 v0 = org.anddev.andengine.util.modifier.ease.EaseBounceIn.INSTANCE;
} // .end method
/* # virtual methods */
public Float getPercentageDone ( Float p0, Float p1, Float p2, Float p3 ) {
	 /* .locals 3 */
	 org.anddev.andengine.util.modifier.ease.EaseBounceOut .getInstance ( );
	 /* sub-float v1, p2, p1 */
	 int v2 = 0; // const/4 v2, 0x0
	 v0 = 	 (( org.anddev.andengine.util.modifier.ease.EaseBounceOut ) v0 ).getPercentageDone ( v1, p2, v2, p4 ); // invoke-virtual {v0, v1, p2, v2, p4}, Lorg/anddev/andengine/util/modifier/ease/EaseBounceOut;->getPercentageDone(FFFF)F
	 /* sub-float v0, p4, v0 */
	 /* add-float/2addr v0, p3 */
} // .end method

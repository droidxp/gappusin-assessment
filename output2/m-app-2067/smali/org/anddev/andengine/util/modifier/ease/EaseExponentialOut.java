public class org.anddev.andengine.util.modifier.ease.EaseExponentialOut implements org.anddev.andengine.util.modifier.ease.IEaseFunction {
	 /* # interfaces */
	 /* # static fields */
	 private static org.anddev.andengine.util.modifier.ease.EaseExponentialOut INSTANCE;
	 /* # direct methods */
	 private org.anddev.andengine.util.modifier.ease.EaseExponentialOut ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.util.modifier.ease.EaseExponentialOut getInstance ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.util.modifier.ease.EaseExponentialOut.INSTANCE;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Lorg/anddev/andengine/util/modifier/ease/EaseExponentialOut; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/util/modifier/ease/EaseExponentialOut;-><init>()V */
	 } // :cond_0
	 v0 = org.anddev.andengine.util.modifier.ease.EaseExponentialOut.INSTANCE;
} // .end method
/* # virtual methods */
public Float getPercentageDone ( Float p0, Float p1, Float p2, Float p3 ) {
	 /* .locals 6 */
	 /* cmpl-float v0, p1, p2 */
	 /* if-nez v0, :cond_0 */
	 /* add-float v0, p3, p4 */
	 /* float-to-double v0, v0 */
} // :goto_0
/* double-to-float v0, v0 */
} // :cond_0
/* float-to-double v0, p4 */
/* const-wide/high16 v2, 0x4000000000000000L # 2.0 */
/* const/high16 v4, -0x3ee00000 # -10.0f */
/* mul-float/2addr v4, p1 */
/* div-float/2addr v4, p2 */
/* float-to-double v4, v4 */
java.lang.Math .pow ( v2,v3,v4,v5 );
/* move-result-wide v2 */
/* neg-double v2, v2 */
/* const-wide/high16 v4, 0x3ff0000000000000L # 1.0 */
/* add-double/2addr v2, v4 */
/* mul-double/2addr v0, v2 */
/* float-to-double v2, p3 */
/* add-double/2addr v0, v2 */
} // .end method

public class org.anddev.andengine.util.modifier.ease.EaseCircularInOut implements org.anddev.andengine.util.modifier.ease.IEaseFunction {
	 /* # interfaces */
	 /* # static fields */
	 private static org.anddev.andengine.util.modifier.ease.EaseCircularInOut INSTANCE;
	 /* # direct methods */
	 private org.anddev.andengine.util.modifier.ease.EaseCircularInOut ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.util.modifier.ease.EaseCircularInOut getInstance ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.util.modifier.ease.EaseCircularInOut.INSTANCE;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Lorg/anddev/andengine/util/modifier/ease/EaseCircularInOut; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/util/modifier/ease/EaseCircularInOut;-><init>()V */
	 } // :cond_0
	 v0 = org.anddev.andengine.util.modifier.ease.EaseCircularInOut.INSTANCE;
} // .end method
/* # virtual methods */
public Float getPercentageDone ( Float p0, Float p1, Float p2, Float p3 ) {
	 /* .locals 7 */
	 /* const-wide/high16 v5, 0x3fe0000000000000L # 0.5 */
	 /* const/high16 v4, 0x3f800000 # 1.0f */
	 /* float-to-double v0, p1 */
	 /* float-to-double v2, p2 */
	 /* mul-double/2addr v2, v5 */
	 /* div-double/2addr v0, v2 */
	 /* double-to-float v0, v0 */
	 /* cmpg-float v1, v0, v4 */
	 /* if-gez v1, :cond_0 */
	 /* neg-float v1, p4 */
	 /* float-to-double v1, v1 */
	 /* mul-double/2addr v1, v5 */
	 /* mul-float/2addr v0, v0 */
	 /* sub-float v0, v4, v0 */
	 v0 = 	 android.util.FloatMath .sqrt ( v0 );
	 /* sub-float/2addr v0, v4 */
	 /* float-to-double v3, v0 */
	 /* mul-double v0, v1, v3 */
	 /* float-to-double v2, p3 */
	 /* add-double/2addr v0, v2 */
	 /* double-to-float v0, v0 */
} // :goto_0
} // :cond_0
/* float-to-double v1, p4 */
/* mul-double/2addr v1, v5 */
/* const/high16 v3, 0x40000000 # 2.0f */
/* sub-float/2addr v0, v3 */
/* mul-float/2addr v0, v0 */
/* sub-float v0, v4, v0 */
v0 = android.util.FloatMath .sqrt ( v0 );
/* add-float/2addr v0, v4 */
/* float-to-double v3, v0 */
/* mul-double v0, v1, v3 */
/* float-to-double v2, p3 */
/* add-double/2addr v0, v2 */
/* double-to-float v0, v0 */
} // .end method

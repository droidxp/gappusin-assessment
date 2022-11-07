public class org.anddev.andengine.util.modifier.ease.EaseBackInOut implements org.anddev.andengine.util.modifier.ease.IEaseFunction {
	 /* # interfaces */
	 /* # static fields */
	 private static org.anddev.andengine.util.modifier.ease.EaseBackInOut INSTANCE;
	 /* # direct methods */
	 private org.anddev.andengine.util.modifier.ease.EaseBackInOut ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.util.modifier.ease.EaseBackInOut getInstance ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.util.modifier.ease.EaseBackInOut.INSTANCE;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Lorg/anddev/andengine/util/modifier/ease/EaseBackInOut; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/util/modifier/ease/EaseBackInOut;-><init>()V */
	 } // :cond_0
	 v0 = org.anddev.andengine.util.modifier.ease.EaseBackInOut.INSTANCE;
} // .end method
/* # virtual methods */
public Float getPercentageDone ( Float p0, Float p1, Float p2, Float p3 ) {
	 /* .locals 6 */
	 /* const v5, 0x406612ff */
	 /* const v4, 0x402612ff */
	 /* const/high16 v2, 0x3f000000 # 0.5f */
	 /* const/high16 v3, 0x40000000 # 2.0f */
	 /* mul-float v0, p2, v2 */
	 /* div-float v0, p1, v0 */
	 /* const/high16 v1, 0x3f800000 # 1.0f */
	 /* cmpg-float v1, v0, v1 */
	 /* if-gez v1, :cond_0 */
	 /* mul-float v1, p4, v2 */
	 /* mul-float v2, v0, v0 */
	 /* mul-float/2addr v0, v5 */
	 /* sub-float/2addr v0, v4 */
	 /* mul-float/2addr v0, v2 */
	 /* mul-float/2addr v0, v1 */
	 /* add-float/2addr v0, p3 */
} // :goto_0
} // :cond_0
/* div-float v1, p4, v3 */
/* sub-float/2addr v0, v3 */
/* mul-float v2, v0, v0 */
/* mul-float/2addr v0, v5 */
/* add-float/2addr v0, v4 */
/* mul-float/2addr v0, v2 */
/* add-float/2addr v0, v3 */
/* mul-float/2addr v0, v1 */
/* add-float/2addr v0, p3 */
} // .end method

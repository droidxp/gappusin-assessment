public class org.anddev.andengine.util.modifier.ease.EaseQuadInOut implements org.anddev.andengine.util.modifier.ease.IEaseFunction {
	 /* # interfaces */
	 /* # static fields */
	 private static org.anddev.andengine.util.modifier.ease.EaseQuadInOut INSTANCE;
	 /* # direct methods */
	 private org.anddev.andengine.util.modifier.ease.EaseQuadInOut ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.util.modifier.ease.EaseQuadInOut getInstance ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.util.modifier.ease.EaseQuadInOut.INSTANCE;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Lorg/anddev/andengine/util/modifier/ease/EaseQuadInOut; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/util/modifier/ease/EaseQuadInOut;-><init>()V */
	 } // :cond_0
	 v0 = org.anddev.andengine.util.modifier.ease.EaseQuadInOut.INSTANCE;
} // .end method
/* # virtual methods */
public Float getPercentageDone ( Float p0, Float p1, Float p2, Float p3 ) {
	 /* .locals 4 */
	 /* const/high16 v3, 0x3f800000 # 1.0f */
	 /* const/high16 v2, 0x3f000000 # 0.5f */
	 /* mul-float v0, p2, v2 */
	 /* div-float v0, p1, v0 */
	 /* cmpg-float v1, v0, v3 */
	 /* if-gez v1, :cond_0 */
	 /* mul-float v1, p4, v2 */
	 /* mul-float/2addr v1, v0 */
	 /* mul-float/2addr v0, v1 */
	 /* add-float/2addr v0, p3 */
} // :goto_0
} // :cond_0
/* neg-float v1, p4 */
/* mul-float/2addr v1, v2 */
/* sub-float/2addr v0, v3 */
/* const/high16 v2, 0x40000000 # 2.0f */
/* sub-float v2, v0, v2 */
/* mul-float/2addr v0, v2 */
/* sub-float/2addr v0, v3 */
/* mul-float/2addr v0, v1 */
/* add-float/2addr v0, p3 */
} // .end method
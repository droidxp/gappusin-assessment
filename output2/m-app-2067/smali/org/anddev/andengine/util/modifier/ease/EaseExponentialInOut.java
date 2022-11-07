public class org.anddev.andengine.util.modifier.ease.EaseExponentialInOut implements org.anddev.andengine.util.modifier.ease.IEaseFunction {
	 /* # interfaces */
	 /* # static fields */
	 private static org.anddev.andengine.util.modifier.ease.EaseExponentialInOut INSTANCE;
	 /* # direct methods */
	 private org.anddev.andengine.util.modifier.ease.EaseExponentialInOut ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.util.modifier.ease.EaseExponentialInOut getInstance ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.util.modifier.ease.EaseExponentialInOut.INSTANCE;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Lorg/anddev/andengine/util/modifier/ease/EaseExponentialInOut; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/util/modifier/ease/EaseExponentialInOut;-><init>()V */
	 } // :cond_0
	 v0 = org.anddev.andengine.util.modifier.ease.EaseExponentialInOut.INSTANCE;
} // .end method
/* # virtual methods */
public Float getPercentageDone ( Float p0, Float p1, Float p2, Float p3 ) {
	 /* .locals 7 */
	 /* const/high16 v4, 0x3f800000 # 1.0f */
	 /* const/high16 v2, 0x3f000000 # 0.5f */
	 /* const-wide/high16 v5, 0x4000000000000000L # 2.0 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* cmpl-float v0, p1, v0 */
	 /* if-nez v0, :cond_0 */
	 /* move v0, p3 */
} // :goto_0
} // :cond_0
/* cmpl-float v0, p1, p2 */
/* if-nez v0, :cond_1 */
/* add-float v0, p3, p4 */
} // :cond_1
/* mul-float v0, p2, v2 */
/* div-float v0, p1, v0 */
/* cmpg-float v1, v0, v4 */
/* if-gez v1, :cond_2 */
/* mul-float v1, p4, v2 */
/* float-to-double v1, v1 */
/* const/high16 v3, 0x41200000 # 10.0f */
/* sub-float/2addr v0, v4 */
/* mul-float/2addr v0, v3 */
/* float-to-double v3, v0 */
java.lang.Math .pow ( v5,v6,v3,v4 );
/* move-result-wide v3 */
/* mul-double v0, v1, v3 */
/* float-to-double v2, p3 */
/* add-double/2addr v0, v2 */
/* double-to-float v0, v0 */
} // :cond_2
/* mul-float v1, p4, v2 */
/* float-to-double v1, v1 */
/* const/high16 v3, -0x3ee00000 # -10.0f */
/* sub-float/2addr v0, v4 */
/* mul-float/2addr v0, v3 */
/* float-to-double v3, v0 */
java.lang.Math .pow ( v5,v6,v3,v4 );
/* move-result-wide v3 */
/* neg-double v3, v3 */
/* add-double/2addr v3, v5 */
/* mul-double v0, v1, v3 */
/* float-to-double v2, p3 */
/* add-double/2addr v0, v2 */
/* double-to-float v0, v0 */
} // .end method

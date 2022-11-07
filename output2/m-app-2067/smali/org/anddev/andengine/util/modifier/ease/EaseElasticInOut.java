public class org.anddev.andengine.util.modifier.ease.EaseElasticInOut implements org.anddev.andengine.util.constants.MathConstants implements org.anddev.andengine.util.modifier.ease.IEaseFunction {
	 /* # interfaces */
	 /* # static fields */
	 private static org.anddev.andengine.util.modifier.ease.EaseElasticInOut INSTANCE;
	 /* # direct methods */
	 private org.anddev.andengine.util.modifier.ease.EaseElasticInOut ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.util.modifier.ease.EaseElasticInOut getInstance ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.util.modifier.ease.EaseElasticInOut.INSTANCE;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Lorg/anddev/andengine/util/modifier/ease/EaseElasticInOut; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/util/modifier/ease/EaseElasticInOut;-><init>()V */
	 } // :cond_0
	 v0 = org.anddev.andengine.util.modifier.ease.EaseElasticInOut.INSTANCE;
} // .end method
/* # virtual methods */
public Float getPercentageDone ( Float p0, Float p1, Float p2, Float p3 ) {
	 /* .locals 11 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* cmpl-float v0, p1, v0 */
	 /* if-nez v0, :cond_0 */
	 /* move v0, p3 */
} // :goto_0
} // :cond_0
/* float-to-double v0, p1 */
/* float-to-double v2, p2 */
/* const-wide/high16 v4, 0x3fe0000000000000L # 0.5 */
/* mul-double/2addr v2, v4 */
/* div-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* const/high16 v1, 0x40000000 # 2.0f */
/* cmpl-float v1, v0, v1 */
/* if-nez v1, :cond_1 */
/* add-float v0, p3, p4 */
} // :cond_1
/* const v1, 0x3ee66667 # 0.45000002f */
/* mul-float/2addr v1, p2 */
/* const/high16 v2, 0x40800000 # 4.0f */
/* div-float v2, v1, v2 */
/* const/high16 v3, 0x3f800000 # 1.0f */
/* cmpg-float v3, v0, v3 */
/* if-gez v3, :cond_2 */
/* const-wide/high16 v3, -0x4020000000000000L # -0.5 */
/* float-to-double v5, p4 */
/* const-wide/high16 v7, 0x4000000000000000L # 2.0 */
/* const/high16 v9, 0x41200000 # 10.0f */
/* const/high16 v10, 0x3f800000 # 1.0f */
/* sub-float/2addr v0, v10 */
/* mul-float/2addr v9, v0 */
/* float-to-double v9, v9 */
java.lang.Math .pow ( v7,v8,v9,v10 );
/* move-result-wide v7 */
/* mul-double/2addr v5, v7 */
/* mul-float/2addr v0, p2 */
/* sub-float/2addr v0, v2 */
/* const v2, 0x40c90fdb */
/* mul-float/2addr v0, v2 */
/* div-float/2addr v0, v1 */
v0 = android.util.FloatMath .sin ( v0 );
/* float-to-double v0, v0 */
/* mul-double/2addr v0, v5 */
/* mul-double/2addr v0, v3 */
/* float-to-double v2, p3 */
/* add-double/2addr v0, v2 */
/* double-to-float v0, v0 */
} // :cond_2
/* float-to-double v3, p4 */
/* const-wide/high16 v5, 0x4000000000000000L # 2.0 */
/* const/high16 v7, -0x3ee00000 # -10.0f */
/* const/high16 v8, 0x3f800000 # 1.0f */
/* sub-float/2addr v0, v8 */
/* mul-float/2addr v7, v0 */
/* float-to-double v7, v7 */
java.lang.Math .pow ( v5,v6,v7,v8 );
/* move-result-wide v5 */
/* mul-double/2addr v3, v5 */
/* mul-float/2addr v0, p2 */
/* sub-float/2addr v0, v2 */
/* const v2, 0x40c90fdb */
/* mul-float/2addr v0, v2 */
/* div-float/2addr v0, v1 */
v0 = android.util.FloatMath .sin ( v0 );
/* float-to-double v0, v0 */
/* mul-double/2addr v0, v3 */
/* const-wide/high16 v2, 0x3fe0000000000000L # 0.5 */
/* mul-double/2addr v0, v2 */
/* float-to-double v2, p4 */
/* add-double/2addr v0, v2 */
/* float-to-double v2, p3 */
/* add-double/2addr v0, v2 */
/* double-to-float v0, v0 */
} // .end method

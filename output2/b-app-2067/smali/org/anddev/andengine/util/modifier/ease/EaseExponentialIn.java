public class org.anddev.andengine.util.modifier.ease.EaseExponentialIn implements org.anddev.andengine.util.modifier.ease.IEaseFunction {
	 /* # interfaces */
	 /* # static fields */
	 private static org.anddev.andengine.util.modifier.ease.EaseExponentialIn INSTANCE;
	 /* # direct methods */
	 private org.anddev.andengine.util.modifier.ease.EaseExponentialIn ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.util.modifier.ease.EaseExponentialIn getInstance ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.util.modifier.ease.EaseExponentialIn.INSTANCE;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Lorg/anddev/andengine/util/modifier/ease/EaseExponentialIn; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/util/modifier/ease/EaseExponentialIn;-><init>()V */
	 } // :cond_0
	 v0 = org.anddev.andengine.util.modifier.ease.EaseExponentialIn.INSTANCE;
} // .end method
/* # virtual methods */
public Float getPercentageDone ( Float p0, Float p1, Float p2, Float p3 ) {
	 /* .locals 7 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* cmpl-float v0, p1, v0 */
	 /* if-nez v0, :cond_0 */
	 /* float-to-double v0, p3 */
} // :goto_0
/* double-to-float v0, v0 */
} // :cond_0
/* float-to-double v0, p4 */
/* const-wide/high16 v2, 0x4000000000000000L # 2.0 */
/* const/high16 v4, 0x41200000 # 10.0f */
/* div-float v5, p1, p2 */
/* const/high16 v6, 0x3f800000 # 1.0f */
/* sub-float/2addr v5, v6 */
/* mul-float/2addr v4, v5 */
/* float-to-double v4, v4 */
java.lang.Math .pow ( v2,v3,v4,v5 );
/* move-result-wide v2 */
/* mul-double/2addr v0, v2 */
/* float-to-double v2, p3 */
/* add-double/2addr v0, v2 */
/* const v2, 0x3a83126f # 0.001f */
/* mul-float/2addr v2, p4 */
/* float-to-double v2, v2 */
/* sub-double/2addr v0, v2 */
} // .end method

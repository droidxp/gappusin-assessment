public class org.anddev.andengine.util.modifier.ease.EaseBounceOut implements org.anddev.andengine.util.modifier.ease.IEaseFunction {
	 /* # interfaces */
	 /* # static fields */
	 private static org.anddev.andengine.util.modifier.ease.EaseBounceOut INSTANCE;
	 /* # direct methods */
	 private org.anddev.andengine.util.modifier.ease.EaseBounceOut ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.util.modifier.ease.EaseBounceOut getInstance ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.util.modifier.ease.EaseBounceOut.INSTANCE;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Lorg/anddev/andengine/util/modifier/ease/EaseBounceOut; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/util/modifier/ease/EaseBounceOut;-><init>()V */
	 } // :cond_0
	 v0 = org.anddev.andengine.util.modifier.ease.EaseBounceOut.INSTANCE;
} // .end method
/* # virtual methods */
public Float getPercentageDone ( Float p0, Float p1, Float p2, Float p3 ) {
	 /* .locals 6 */
	 /* const/high16 v5, 0x40f20000 # 7.5625f */
	 /* div-float v0, p1, p2 */
	 /* float-to-double v1, v0 */
	 /* const-wide v3, 0x3fd745d1745d1746L # 0.36363636363636365 */
	 /* cmpg-double v1, v1, v3 */
	 /* if-gez v1, :cond_0 */
	 /* mul-float v1, v5, v0 */
	 /* mul-float/2addr v0, v1 */
	 /* mul-float/2addr v0, p4 */
	 /* add-float/2addr v0, p3 */
} // :goto_0
} // :cond_0
/* float-to-double v1, v0 */
/* const-wide v3, 0x3fe745d1745d1746L # 0.7272727272727273 */
/* cmpg-double v1, v1, v3 */
/* if-gez v1, :cond_1 */
/* const v1, 0x3f0ba2e9 */
/* sub-float/2addr v0, v1 */
/* mul-float v1, v5, v0 */
/* mul-float/2addr v0, v1 */
/* const/high16 v1, 0x3f400000 # 0.75f */
/* add-float/2addr v0, v1 */
/* mul-float/2addr v0, p4 */
/* add-float/2addr v0, p3 */
} // :cond_1
/* float-to-double v1, v0 */
/* const-wide v3, 0x3fed1745d1745d17L # 0.9090909090909091 */
/* cmpg-double v1, v1, v3 */
/* if-gez v1, :cond_2 */
/* const v1, 0x3f51745d */
/* sub-float/2addr v0, v1 */
/* mul-float v1, v5, v0 */
/* mul-float/2addr v0, v1 */
/* const/high16 v1, 0x3f700000 # 0.9375f */
/* add-float/2addr v0, v1 */
/* mul-float/2addr v0, p4 */
/* add-float/2addr v0, p3 */
} // :cond_2
/* const v1, 0x3f745d17 */
/* sub-float/2addr v0, v1 */
/* mul-float v1, v5, v0 */
/* mul-float/2addr v0, v1 */
/* const/high16 v1, 0x3f7c0000 # 0.984375f */
/* add-float/2addr v0, v1 */
/* mul-float/2addr v0, p4 */
/* add-float/2addr v0, p3 */
} // .end method

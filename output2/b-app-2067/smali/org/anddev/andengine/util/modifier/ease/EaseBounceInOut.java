public class org.anddev.andengine.util.modifier.ease.EaseBounceInOut implements org.anddev.andengine.util.modifier.ease.IEaseFunction {
	 /* # interfaces */
	 /* # static fields */
	 private static org.anddev.andengine.util.modifier.ease.EaseBounceInOut INSTANCE;
	 /* # direct methods */
	 private org.anddev.andengine.util.modifier.ease.EaseBounceInOut ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.util.modifier.ease.EaseBounceInOut getInstance ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.util.modifier.ease.EaseBounceInOut.INSTANCE;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Lorg/anddev/andengine/util/modifier/ease/EaseBounceInOut; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/util/modifier/ease/EaseBounceInOut;-><init>()V */
	 } // :cond_0
	 v0 = org.anddev.andengine.util.modifier.ease.EaseBounceInOut.INSTANCE;
} // .end method
/* # virtual methods */
public Float getPercentageDone ( Float p0, Float p1, Float p2, Float p3 ) {
	 /* .locals 9 */
	 /* const/high16 v8, 0x40000000 # 2.0f */
	 int v7 = 0; // const/4 v7, 0x0
	 /* const/high16 v6, 0x3f000000 # 0.5f */
	 /* float-to-double v0, p1 */
	 /* float-to-double v2, p2 */
	 /* const-wide/high16 v4, 0x3fe0000000000000L # 0.5 */
	 /* mul-double/2addr v2, v4 */
	 /* cmpg-double v0, v0, v2 */
	 /* if-gez v0, :cond_0 */
	 org.anddev.andengine.util.modifier.ease.EaseBounceIn .getInstance ( );
	 /* mul-float v1, p1, v8 */
	 v0 = 	 (( org.anddev.andengine.util.modifier.ease.EaseBounceIn ) v0 ).getPercentageDone ( v1, p2, v7, p4 ); // invoke-virtual {v0, v1, p2, v7, p4}, Lorg/anddev/andengine/util/modifier/ease/EaseBounceIn;->getPercentageDone(FFFF)F
	 /* mul-float/2addr v0, v6 */
	 /* add-float/2addr v0, p3 */
} // :goto_0
} // :cond_0
org.anddev.andengine.util.modifier.ease.EaseBounceOut .getInstance ( );
/* mul-float v1, p1, v8 */
/* sub-float/2addr v1, p2 */
v0 = (( org.anddev.andengine.util.modifier.ease.EaseBounceOut ) v0 ).getPercentageDone ( v1, p2, v7, p4 ); // invoke-virtual {v0, v1, p2, v7, p4}, Lorg/anddev/andengine/util/modifier/ease/EaseBounceOut;->getPercentageDone(FFFF)F
/* mul-float/2addr v0, v6 */
/* mul-float v1, p4, v6 */
/* add-float/2addr v0, v1 */
/* add-float/2addr v0, p3 */
} // .end method

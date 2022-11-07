public class org.anddev.andengine.util.MathUtils implements org.anddev.andengine.util.constants.MathConstants {
	 /* # interfaces */
	 /* # static fields */
	 public static java.util.Random RANDOM;
	 /* # direct methods */
	 static org.anddev.andengine.util.MathUtils ( ) {
		 /* .locals 3 */
		 /* new-instance v0, Ljava/util/Random; */
		 java.lang.System .nanoTime ( );
		 /* move-result-wide v1 */
		 /* invoke-direct {v0, v1, v2}, Ljava/util/Random;-><init>(J)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.util.MathUtils ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static final Float arrayAverage ( Float[] p0 ) {
		 /* .locals 2 */
		 v0 = 		 org.anddev.andengine.util.MathUtils .arraySum ( p0 );
		 /* array-length v1, p0 */
		 /* int-to-float v1, v1 */
		 /* div-float/2addr v0, v1 */
	 } // .end method
	 public static final Float arraySum ( Float[] p0 ) {
		 /* .locals 5 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* array-length v1, p0 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* move v4, v2 */
		 /* move v2, v0 */
		 /* move v0, v4 */
	 } // :goto_0
	 /* if-lt v0, v1, :cond_0 */
} // :cond_0
/* aget v3, p0, v0 */
/* add-float/2addr v2, v3 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public static final void arraySumInternal ( Integer[] p0 ) {
/* .locals 5 */
int v4 = 1; // const/4 v4, 0x1
/* array-length v0, p0 */
/* move v1, v4 */
} // :goto_0
/* if-lt v1, v0, :cond_0 */
return;
} // :cond_0
/* sub-int v2, v1, v4 */
/* aget v2, p0, v2 */
/* aget v3, p0, v1 */
/* add-int/2addr v2, v3 */
/* aput v2, p0, v1 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public static final void arraySumInternal ( Long[] p0 ) {
/* .locals 7 */
int v6 = 1; // const/4 v6, 0x1
/* array-length v0, p0 */
/* move v1, v6 */
} // :goto_0
/* if-lt v1, v0, :cond_0 */
return;
} // :cond_0
/* sub-int v2, v1, v6 */
/* aget-wide v2, p0, v2 */
/* aget-wide v4, p0, v1 */
/* add-long/2addr v2, v4 */
/* aput-wide v2, p0, v1 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public static final void arraySumInternal ( Long[] p0, Long p1 ) {
/* .locals 7 */
int v6 = 1; // const/4 v6, 0x1
int v2 = 0; // const/4 v2, 0x0
/* aget-wide v0, p0, v2 */
/* mul-long/2addr v0, p1 */
/* aput-wide v0, p0, v2 */
/* array-length v0, p0 */
/* move v1, v6 */
} // :goto_0
/* if-lt v1, v0, :cond_0 */
return;
} // :cond_0
/* sub-int v2, v1, v6 */
/* aget-wide v2, p0, v2 */
/* aget-wide v4, p0, v1 */
/* mul-long/2addr v4, p1 */
/* add-long/2addr v2, v4 */
/* aput-wide v2, p0, v1 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public static final void arraySumInto ( Long[] p0, Long[] p1, Long p2 ) {
/* .locals 7 */
int v6 = 1; // const/4 v6, 0x1
int v2 = 0; // const/4 v2, 0x0
/* aget-wide v0, p0, v2 */
/* mul-long/2addr v0, p2 */
/* aput-wide v0, p1, v2 */
/* array-length v0, p0 */
/* move v1, v6 */
} // :goto_0
/* if-lt v1, v0, :cond_0 */
return;
} // :cond_0
/* sub-int v2, v1, v6 */
/* aget-wide v2, p1, v2 */
/* aget-wide v4, p0, v1 */
/* mul-long/2addr v4, p2 */
/* add-long/2addr v2, v4 */
/* aput-wide v2, p1, v1 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public static Float atan2 ( Float p0, Float p1 ) {
/* .locals 4 */
/* float-to-double v0, p0 */
/* float-to-double v2, p1 */
java.lang.Math .atan2 ( v0,v1,v2,v3 );
/* move-result-wide v0 */
/* double-to-float v0, v0 */
} // .end method
public static Float bringToBounds ( Float p0, Float p1, Float p2 ) {
/* .locals 1 */
v0 = java.lang.Math .min ( p1,p2 );
v0 = java.lang.Math .max ( p0,v0 );
} // .end method
public static Integer bringToBounds ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 1 */
v0 = java.lang.Math .min ( p1,p2 );
v0 = java.lang.Math .max ( p0,v0 );
} // .end method
public static final Float degToRad ( Float p0 ) {
/* .locals 1 */
/* const v0, 0x3c8efa35 */
/* mul-float/2addr v0, p0 */
} // .end method
public static Float distance ( Float p0, Float p1, Float p2, Float p3 ) {
/* .locals 2 */
/* sub-float v0, p2, p0 */
/* sub-float v1, p3, p1 */
/* mul-float/2addr v0, v0 */
/* mul-float/2addr v1, v1 */
/* add-float/2addr v0, v1 */
v0 = android.util.FloatMath .sqrt ( v0 );
} // .end method
public static final Boolean isPowerOfTwo ( Integer p0 ) {
/* .locals 2 */
int v1 = 1; // const/4 v1, 0x1
if ( p0 != null) { // if-eqz p0, :cond_0
/* sub-int v0, p0, v1 */
/* and-int/2addr v0, p0 */
/* if-nez v0, :cond_0 */
/* move v0, v1 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static final Integer nextPowerOfTwo ( Float p0 ) {
/* .locals 2 */
/* float-to-double v0, p0 */
java.lang.Math .ceil ( v0,v1 );
/* move-result-wide v0 */
/* double-to-int v0, v0 */
v0 = org.anddev.andengine.util.MathUtils .nextPowerOfTwo ( v0 );
} // .end method
public static final Integer nextPowerOfTwo ( Integer p0 ) {
/* .locals 3 */
int v1 = 1; // const/4 v1, 0x1
/* if-nez p0, :cond_0 */
/* move v0, v1 */
} // :goto_0
} // :cond_0
/* add-int/lit8 v0, p0, -0x1 */
} // :goto_1
/* const/16 v2, 0x20 */
/* if-lt v1, v2, :cond_1 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
/* shr-int v2, v0, v1 */
/* or-int/2addr v0, v2 */
/* shl-int/lit8 v1, v1, 0x1 */
} // .end method
public static final Float radToDeg ( Float p0 ) {
/* .locals 1 */
/* const v0, 0x42652ee0 */
/* mul-float/2addr v0, p0 */
} // .end method
public static final Float random ( Float p0, Float p1 ) {
/* .locals 2 */
v0 = org.anddev.andengine.util.MathUtils.RANDOM;
v0 = (( java.util.Random ) v0 ).nextFloat ( ); // invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F
/* sub-float v1, p1, p0 */
/* mul-float/2addr v0, v1 */
/* add-float/2addr v0, p0 */
} // .end method
public static final Integer random ( Integer p0, Integer p1 ) {
/* .locals 2 */
v0 = org.anddev.andengine.util.MathUtils.RANDOM;
/* sub-int v1, p1, p0 */
/* add-int/lit8 v1, v1, 0x1 */
v0 = (( java.util.Random ) v0 ).nextInt ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I
/* add-int/2addr v0, p0 */
} // .end method
public static final Integer randomSign ( ) {
/* .locals 1 */
v0 = org.anddev.andengine.util.MathUtils.RANDOM;
v0 = (( java.util.Random ) v0 ).nextBoolean ( ); // invoke-virtual {v0}, Ljava/util/Random;->nextBoolean()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = -1; // const/4 v0, -0x1
} // .end method
public static revertRotateAndScaleAroundCenter ( Float[] p0, Float p1, Float p2, Float p3, Float p4, Float p5, Float p6, Float p7 ) {
/* .locals 1 */
org.anddev.andengine.util.MathUtils .revertScaleAroundCenter ( p0,p4,p5,p6,p7 );
org.anddev.andengine.util.MathUtils .revertRotateAroundCenter ( p0,p1,p2,p3 );
} // .end method
public static revertRotateAroundCenter ( Float[] p0, Float p1, Float p2, Float p3 ) {
/* .locals 1 */
/* neg-float v0, p1 */
org.anddev.andengine.util.MathUtils .rotateAroundCenter ( p0,v0,p2,p3 );
} // .end method
public static revertScaleAroundCenter ( Float[] p0, Float p1, Float p2, Float p3, Float p4 ) {
/* .locals 2 */
/* const/high16 v1, 0x3f800000 # 1.0f */
/* div-float v0, v1, p1 */
/* div-float/2addr v1, p2 */
org.anddev.andengine.util.MathUtils .scaleAroundCenter ( p0,v0,v1,p3,p4 );
} // .end method
public static rotateAndScaleAroundCenter ( Float[] p0, Float p1, Float p2, Float p3, Float p4, Float p5, Float p6, Float p7 ) {
/* .locals 1 */
org.anddev.andengine.util.MathUtils .rotateAroundCenter ( p0,p1,p2,p3 );
org.anddev.andengine.util.MathUtils .scaleAroundCenter ( p0,p4,p5,p6,p7 );
} // .end method
public static rotateAroundCenter ( Float[] p0, Float p1, Float p2, Float p3 ) {
/* .locals 7 */
int v0 = 0; // const/4 v0, 0x0
/* cmpl-float v0, p1, v0 */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = org.anddev.andengine.util.MathUtils .degToRad ( p1 );
v1 = android.util.FloatMath .sin ( v0 );
v0 = android.util.FloatMath .cos ( v0 );
/* array-length v2, p0 */
int v3 = 2; // const/4 v3, 0x2
/* sub-int/2addr v2, v3 */
} // :goto_0
/* if-gez v2, :cond_1 */
} // :cond_0
} // :cond_1
/* aget v3, p0, v2 */
/* add-int/lit8 v4, v2, 0x1 */
/* aget v4, p0, v4 */
/* sub-float v5, v3, p2 */
/* mul-float/2addr v5, v0 */
/* sub-float v6, v4, p3 */
/* mul-float/2addr v6, v1 */
/* sub-float/2addr v5, v6 */
/* add-float/2addr v5, p2 */
/* aput v5, p0, v2 */
/* add-int/lit8 v5, v2, 0x1 */
/* sub-float/2addr v3, p2 */
/* mul-float/2addr v3, v1 */
/* sub-float/2addr v4, p3 */
/* mul-float/2addr v4, v0 */
/* add-float/2addr v3, v4 */
/* add-float/2addr v3, p3 */
/* aput v3, p0, v5 */
/* add-int/lit8 v2, v2, -0x2 */
} // .end method
public static scaleAroundCenter ( Float[] p0, Float p1, Float p2, Float p3, Float p4 ) {
/* .locals 3 */
/* const/high16 v1, 0x3f800000 # 1.0f */
/* cmpl-float v0, p1, v1 */
/* if-nez v0, :cond_0 */
/* cmpl-float v0, p2, v1 */
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
/* array-length v0, p0 */
int v1 = 2; // const/4 v1, 0x2
/* sub-int/2addr v0, v1 */
} // :goto_0
/* if-gez v0, :cond_2 */
} // :cond_1
} // :cond_2
/* aget v1, p0, v0 */
/* sub-float/2addr v1, p3 */
/* mul-float/2addr v1, p1 */
/* add-float/2addr v1, p3 */
/* aput v1, p0, v0 */
/* add-int/lit8 v1, v0, 0x1 */
/* add-int/lit8 v2, v0, 0x1 */
/* aget v2, p0, v2 */
/* sub-float/2addr v2, p4 */
/* mul-float/2addr v2, p2 */
/* add-float/2addr v2, p4 */
/* aput v2, p0, v1 */
/* add-int/lit8 v0, v0, -0x2 */
} // .end method
public static final Integer sum ( Integer[] p0 ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
/* array-length v1, p0 */
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
/* move v3, v1 */
/* move v1, v0 */
/* move v0, v3 */
} // :goto_0
/* if-gez v0, :cond_0 */
} // :cond_0
/* aget v2, p0, v0 */
/* add-int/2addr v1, v2 */
/* add-int/lit8 v0, v0, -0x1 */
} // .end method

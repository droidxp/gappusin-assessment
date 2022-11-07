public class com.badlogic.gdx.math.MathUtils {
	 /* # static fields */
	 private static final Integer ATAN2_BITS;
	 private static final Integer ATAN2_BITS2;
	 private static final Integer ATAN2_COUNT;
	 private static final Integer ATAN2_DIM;
	 private static final Integer ATAN2_MASK;
	 private static final Double BIG_ENOUGH_CEIL;
	 private static final Double BIG_ENOUGH_FLOOR;
	 private static final Integer BIG_ENOUGH_INT;
	 private static final Double BIG_ENOUGH_ROUND;
	 private static final Double CEIL;
	 private static final Float INV_ATAN2_DIM_MINUS_1;
	 public static final Float PI;
	 private static final Integer SIN_BITS;
	 private static final Integer SIN_COUNT;
	 private static final Integer SIN_MASK;
	 private static final atan2;
	 public static final cos;
	 private static final Float degFull;
	 private static final Float degToIndex;
	 public static final Float degreesToRadians;
	 private static final Float radFull;
	 private static final Float radToIndex;
	 public static final Float radiansToDegrees;
	 public static java.util.Random random;
	 public static final sin;
	 /* # direct methods */
	 static com.badlogic.gdx.math.MathUtils ( ) {
		 /* .locals 9 */
		 /* const v7, 0x41b60b61 */
		 /* const v6, 0x3c8efa35 */
		 /* const/16 v5, 0x2000 */
		 int v8 = 0; // const/4 v8, 0x0
		 /* new-array v0, v5, [F */
		 /* new-array v0, v5, [F */
		 /* move v0, v8 */
	 } // :goto_0
	 /* if-ge v0, v5, :cond_0 */
	 /* int-to-float v1, v0 */
	 /* const/high16 v2, 0x3f000000 # 0.5f */
	 /* add-float/2addr v1, v2 */
	 /* const/high16 v2, 0x46000000 # 8192.0f */
	 /* div-float/2addr v1, v2 */
	 /* const v2, 0x40c90fdb */
	 /* mul-float/2addr v1, v2 */
	 v2 = com.badlogic.gdx.math.MathUtils.sin;
	 /* float-to-double v3, v1 */
	 java.lang.Math .sin ( v3,v4 );
	 /* move-result-wide v3 */
	 /* double-to-float v3, v3 */
	 /* aput v3, v2, v0 */
	 v2 = com.badlogic.gdx.math.MathUtils.cos;
	 /* float-to-double v3, v1 */
	 java.lang.Math .cos ( v3,v4 );
	 /* move-result-wide v3 */
	 /* double-to-float v1, v3 */
	 /* aput v1, v2, v0 */
	 /* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
/* move v0, v8 */
} // :goto_1
/* const/16 v1, 0x168 */
/* if-ge v0, v1, :cond_1 */
v1 = com.badlogic.gdx.math.MathUtils.sin;
/* int-to-float v2, v0 */
/* mul-float/2addr v2, v7 */
/* float-to-int v2, v2 */
/* and-int/lit16 v2, v2, 0x1fff */
/* int-to-float v3, v0 */
/* mul-float/2addr v3, v6 */
/* float-to-double v3, v3 */
java.lang.Math .sin ( v3,v4 );
/* move-result-wide v3 */
/* double-to-float v3, v3 */
/* aput v3, v1, v2 */
v1 = com.badlogic.gdx.math.MathUtils.cos;
/* int-to-float v2, v0 */
/* mul-float/2addr v2, v7 */
/* float-to-int v2, v2 */
/* and-int/lit16 v2, v2, 0x1fff */
/* int-to-float v3, v0 */
/* mul-float/2addr v3, v6 */
/* float-to-double v3, v3 */
java.lang.Math .cos ( v3,v4 );
/* move-result-wide v3 */
/* double-to-float v3, v3 */
/* aput v3, v1, v2 */
/* add-int/lit8 v0, v0, 0x5a */
} // :cond_1
/* const-wide/high16 v0, 0x40d0000000000000L # 16384.0 */
java.lang.Math .sqrt ( v0,v1 );
/* move-result-wide v0 */
/* double-to-int v0, v0 */
/* const/high16 v0, 0x3f800000 # 1.0f */
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
/* int-to-float v1, v1 */
/* div-float/2addr v0, v1 */
/* const/16 v0, 0x4000 */
/* new-array v0, v0, [F */
/* move v0, v8 */
} // :goto_2
/* if-ge v0, v1, :cond_3 */
/* move v1, v8 */
} // :goto_3
/* if-ge v1, v2, :cond_2 */
/* int-to-float v2, v0 */
/* int-to-float v3, v3 */
/* div-float/2addr v2, v3 */
/* int-to-float v3, v1 */
/* int-to-float v4, v4 */
/* div-float/2addr v3, v4 */
v4 = com.badlogic.gdx.math.MathUtils.atan2;
/* mul-int/2addr v5, v1 */
/* add-int/2addr v5, v0 */
/* float-to-double v6, v3 */
/* float-to-double v2, v2 */
java.lang.Math .atan2 ( v6,v7,v2,v3 );
/* move-result-wide v2 */
/* double-to-float v2, v2 */
/* aput v2, v4, v5 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_3
/* new-instance v0, Ljava/util/Random; */
/* invoke-direct {v0}, Ljava/util/Random;-><init>()V */
/* const-wide v0, 0x40d0004000000000L # 16385.0 */
com.badlogic.gdx.utils.NumberUtils .doubleToLongBits ( v0,v1 );
/* move-result-wide v0 */
/* const-wide/16 v2, 0x1 */
/* sub-long/2addr v0, v2 */
com.badlogic.gdx.utils.NumberUtils .longBitsToDouble ( v0,v1 );
/* move-result-wide v0 */
/* sput-wide v0, Lcom/badlogic/gdx/math/MathUtils;->BIG_ENOUGH_CEIL:D */
return;
} // .end method
public com.badlogic.gdx.math.MathUtils ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public static final Float atan2 ( Float p0, Float p1 ) {
/* .locals 8 */
/* const/high16 v1, -0x40800000 # -1.0f */
/* const/high16 v6, 0x3f800000 # 1.0f */
int v2 = 0; // const/4 v2, 0x0
/* cmpg-float v0, p1, v2 */
/* if-gez v0, :cond_1 */
/* cmpg-float v0, p0, v2 */
/* if-gez v0, :cond_0 */
/* neg-float v0, p0 */
/* move v1, v0 */
/* move v0, v6 */
} // :goto_0
/* neg-float v2, p1 */
/* const v3, -0x3fb6f025 */
/* move v7, v3 */
/* move v3, v1 */
/* move v1, v7 */
} // :goto_1
/* cmpg-float v4, v2, v3 */
/* if-gez v4, :cond_3 */
/* move v4, v3 */
} // :goto_2
/* mul-float/2addr v4, v5 */
/* div-float v4, v6, v4 */
/* mul-float/2addr v2, v4 */
/* float-to-int v2, v2 */
/* mul-float/2addr v3, v4 */
/* float-to-int v3, v3 */
v4 = com.badlogic.gdx.math.MathUtils.atan2;
/* mul-int/2addr v3, v5 */
/* add-int/2addr v2, v3 */
/* aget v2, v4, v2 */
/* add-float/2addr v1, v2 */
/* mul-float/2addr v0, v1 */
} // :cond_0
/* move v0, v1 */
/* move v1, p0 */
} // :cond_1
/* cmpg-float v0, p0, v2 */
/* if-gez v0, :cond_2 */
/* neg-float v0, p0 */
/* move v7, v1 */
/* move v1, v0 */
/* move v0, v7 */
} // :goto_3
/* move v3, v1 */
/* move v1, v2 */
/* move v2, p1 */
} // :cond_2
/* move v0, v6 */
/* move v1, p0 */
} // :cond_3
/* move v4, v2 */
} // .end method
public static Integer ceil ( Float p0 ) {
/* .locals 4 */
/* float-to-double v0, p0 */
/* sget-wide v2, Lcom/badlogic/gdx/math/MathUtils;->BIG_ENOUGH_CEIL:D */
/* add-double/2addr v0, v2 */
/* double-to-int v0, v0 */
/* const/16 v1, 0x4000 */
/* sub-int/2addr v0, v1 */
} // .end method
public static Integer ceilPositive ( Float p0 ) {
/* .locals 4 */
/* float-to-double v0, p0 */
/* const-wide v2, 0x3fefffffca501acbL # 0.9999999 */
/* add-double/2addr v0, v2 */
/* double-to-int v0, v0 */
} // .end method
public static final Float cos ( Float p0 ) {
/* .locals 2 */
v0 = com.badlogic.gdx.math.MathUtils.cos;
/* const v1, 0x44a2f983 */
/* mul-float/2addr v1, p0 */
/* float-to-int v1, v1 */
/* and-int/lit16 v1, v1, 0x1fff */
/* aget v0, v0, v1 */
} // .end method
public static final Float cosDeg ( Float p0 ) {
/* .locals 2 */
v0 = com.badlogic.gdx.math.MathUtils.cos;
/* const v1, 0x41b60b61 */
/* mul-float/2addr v1, p0 */
/* float-to-int v1, v1 */
/* and-int/lit16 v1, v1, 0x1fff */
/* aget v0, v0, v1 */
} // .end method
public static Integer floor ( Float p0 ) {
/* .locals 4 */
/* float-to-double v0, p0 */
/* const-wide/high16 v2, 0x40d0000000000000L # 16384.0 */
/* add-double/2addr v0, v2 */
/* double-to-int v0, v0 */
/* const/16 v1, 0x4000 */
/* sub-int/2addr v0, v1 */
} // .end method
public static Integer floorPositive ( Float p0 ) {
/* .locals 1 */
/* float-to-int v0, p0 */
} // .end method
public static Boolean isPowerOfTwo ( Integer p0 ) {
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
public static Integer nextPowerOfTwo ( Integer p0 ) {
/* .locals 2 */
/* if-nez p0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
/* add-int/lit8 v0, p0, -0x1 */
/* shr-int/lit8 v1, v0, 0x1 */
/* or-int/2addr v0, v1 */
/* shr-int/lit8 v1, v0, 0x2 */
/* or-int/2addr v0, v1 */
/* shr-int/lit8 v1, v0, 0x4 */
/* or-int/2addr v0, v1 */
/* shr-int/lit8 v1, v0, 0x8 */
/* or-int/2addr v0, v1 */
/* shr-int/lit8 v1, v0, 0x10 */
/* or-int/2addr v0, v1 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public static final Float random ( ) {
/* .locals 1 */
v0 = com.badlogic.gdx.math.MathUtils.random;
v0 = (( java.util.Random ) v0 ).nextFloat ( ); // invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F
} // .end method
public static final Float random ( Float p0 ) {
/* .locals 1 */
v0 = com.badlogic.gdx.math.MathUtils.random;
v0 = (( java.util.Random ) v0 ).nextFloat ( ); // invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F
/* mul-float/2addr v0, p0 */
} // .end method
public static final Float random ( Float p0, Float p1 ) {
/* .locals 2 */
v0 = com.badlogic.gdx.math.MathUtils.random;
v0 = (( java.util.Random ) v0 ).nextFloat ( ); // invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F
/* sub-float v1, p1, p0 */
/* mul-float/2addr v0, v1 */
/* add-float/2addr v0, p0 */
} // .end method
public static final Integer random ( Integer p0 ) {
/* .locals 2 */
v0 = com.badlogic.gdx.math.MathUtils.random;
/* add-int/lit8 v1, p0, 0x1 */
v0 = (( java.util.Random ) v0 ).nextInt ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I
} // .end method
public static final Integer random ( Integer p0, Integer p1 ) {
/* .locals 2 */
v0 = com.badlogic.gdx.math.MathUtils.random;
/* sub-int v1, p1, p0 */
/* add-int/lit8 v1, v1, 0x1 */
v0 = (( java.util.Random ) v0 ).nextInt ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I
/* add-int/2addr v0, p0 */
} // .end method
public static final Boolean randomBoolean ( ) {
/* .locals 1 */
v0 = com.badlogic.gdx.math.MathUtils.random;
v0 = (( java.util.Random ) v0 ).nextBoolean ( ); // invoke-virtual {v0}, Ljava/util/Random;->nextBoolean()Z
} // .end method
public static Integer round ( Float p0 ) {
/* .locals 4 */
/* float-to-double v0, p0 */
/* const-wide v2, 0x40d0002000000000L # 16384.5 */
/* add-double/2addr v0, v2 */
/* double-to-int v0, v0 */
/* const/16 v1, 0x4000 */
/* sub-int/2addr v0, v1 */
} // .end method
public static Integer roundPositive ( Float p0 ) {
/* .locals 1 */
/* const/high16 v0, 0x3f000000 # 0.5f */
/* add-float/2addr v0, p0 */
/* float-to-int v0, v0 */
} // .end method
public static final Float sin ( Float p0 ) {
/* .locals 2 */
v0 = com.badlogic.gdx.math.MathUtils.sin;
/* const v1, 0x44a2f983 */
/* mul-float/2addr v1, p0 */
/* float-to-int v1, v1 */
/* and-int/lit16 v1, v1, 0x1fff */
/* aget v0, v0, v1 */
} // .end method
public static final Float sinDeg ( Float p0 ) {
/* .locals 2 */
v0 = com.badlogic.gdx.math.MathUtils.sin;
/* const v1, 0x41b60b61 */
/* mul-float/2addr v1, p0 */
/* float-to-int v1, v1 */
/* and-int/lit16 v1, v1, 0x1fff */
/* aget v0, v0, v1 */
} // .end method

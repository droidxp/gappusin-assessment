public class com.wiyun.engine.types.WYPoint {
	 /* # static fields */
	 private static final Float FLT_EPSILON;
	 /* # instance fields */
	 public Float x;
	 public Float y;
	 /* # direct methods */
	 protected com.wiyun.engine.types.WYPoint ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0, v0}, Lcom/wiyun/engine/types/WYPoint;-><init>(FF)V */
		 return;
	 } // .end method
	 protected com.wiyun.engine.types.WYPoint ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* iput p2, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 return;
	 } // .end method
	 public static com.wiyun.engine.types.WYPoint add ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
		 /* .locals 3 */
		 /* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* add-float/2addr v0, v1 */
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* iget v2, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* add-float/2addr v1, v2 */
		 com.wiyun.engine.types.WYPoint .make ( v0,v1 );
	 } // .end method
	 public static Float cross ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
		 /* .locals 3 */
		 /* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* mul-float/2addr v0, v1 */
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* iget v2, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
	 } // .end method
	 public static com.wiyun.engine.types.WYPoint cross ( Float p0, com.wiyun.engine.types.WYPoint p1 ) {
		 /* .locals 2 */
		 /* neg-float v0, p0 */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* mul-float/2addr v0, v1 */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* mul-float/2addr v1, p0 */
		 com.wiyun.engine.types.WYPoint .make ( v0,v1 );
	 } // .end method
	 public static Float distance ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
		 /* .locals 1 */
		 com.wiyun.engine.types.WYPoint .sub ( p0,p1 );
		 v0 = 		 com.wiyun.engine.types.WYPoint .length ( v0 );
	 } // .end method
	 public static Float distancesq ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
		 /* .locals 1 */
		 com.wiyun.engine.types.WYPoint .sub ( p0,p1 );
		 v0 = 		 com.wiyun.engine.types.WYPoint .lengthsq ( v0 );
	 } // .end method
	 public static Float dot ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
		 /* .locals 3 */
		 /* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* mul-float/2addr v0, v1 */
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* iget v2, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
	 } // .end method
	 public static Boolean fuzzyEqual ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1, Float p2 ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* sub-float/2addr v0, p2 */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* cmpg-float v0, v0, v1 */
		 /* if-gtz v0, :cond_0 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* add-float/2addr v1, p2 */
		 /* cmpg-float v0, v0, v1 */
		 /* if-gtz v0, :cond_0 */
		 /* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* sub-float/2addr v0, p2 */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* cmpg-float v0, v0, v1 */
		 /* if-gtz v0, :cond_0 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* iget v1, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* add-float/2addr v1, p2 */
		 /* cmpg-float v0, v0, v1 */
		 /* if-gtz v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static Boolean isEqual ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
/* .locals 2 */
/* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_0 */
/* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static Float length ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
v0 = com.wiyun.engine.types.WYPoint .dot ( p0,p0 );
/* float-to-double v0, v0 */
java.lang.Math .sqrt ( v0,v1 );
/* move-result-wide v0 */
/* double-to-float v0, v0 */
} // .end method
public static Float lengthsq ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 1 */
v0 = com.wiyun.engine.types.WYPoint .dot ( p0,p0 );
} // .end method
public static com.wiyun.engine.types.WYPoint lerp ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1, Float p2 ) {
/* .locals 2 */
/* const/high16 v0, 0x3f800000 # 1.0f */
/* sub-float/2addr v0, p2 */
com.wiyun.engine.types.WYPoint .mul ( p0,v0 );
com.wiyun.engine.types.WYPoint .mul ( p1,p2 );
com.wiyun.engine.types.WYPoint .add ( v0,v1 );
} // .end method
public static Boolean lineIntersect ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1, com.wiyun.engine.types.WYPoint p2, com.wiyun.engine.types.WYPoint p3, Float[] p4 ) {
/* .locals 9 */
int v1 = 1; // const/4 v1, 0x1
/* const/high16 v8, 0x34000000 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.types.WYPoint .sub ( p0,p2 );
com.wiyun.engine.types.WYPoint .sub ( p3,p2 );
com.wiyun.engine.types.WYPoint .makeZero ( );
v5 = com.wiyun.engine.types.WYPoint .fuzzyEqual ( v3,v4,v8 );
if ( v5 != null) { // if-eqz v5, :cond_1
} // :cond_0
} // :goto_0
} // :cond_1
com.wiyun.engine.types.WYPoint .sub ( p1,p0 );
v4 = com.wiyun.engine.types.WYPoint .fuzzyEqual ( v5,v4,v8 );
/* if-nez v4, :cond_0 */
v4 = com.wiyun.engine.types.WYPoint .dot ( v2,v3 );
v6 = com.wiyun.engine.types.WYPoint .dot ( v3,v5 );
v2 = com.wiyun.engine.types.WYPoint .dot ( v2,v5 );
v3 = com.wiyun.engine.types.WYPoint .dot ( v3,v3 );
v5 = com.wiyun.engine.types.WYPoint .dot ( v5,v5 );
/* mul-float/2addr v5, v3 */
/* mul-float v7, v6, v6 */
/* sub-float/2addr v5, v7 */
v7 = java.lang.Math .abs ( v5 );
/* cmpg-float v7, v7, v8 */
/* if-ltz v7, :cond_0 */
/* mul-float v7, v4, v6 */
/* mul-float/2addr v2, v3 */
/* sub-float v2, v7, v2 */
/* div-float/2addr v2, v5 */
/* aput v2, p4, v0 */
/* aget v0, p4, v0 */
/* mul-float/2addr v0, v6 */
/* add-float/2addr v0, v4 */
/* div-float/2addr v0, v3 */
/* aput v0, p4, v1 */
/* move v0, v1 */
} // .end method
public static com.wiyun.engine.types.WYPoint make ( Float p0, Float p1 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/types/WYPoint;-><init>(FF)V */
} // .end method
public static com.wiyun.engine.types.WYPoint makeArray ( Integer p0 ) {
/* .locals 3 */
/* new-array v1, p0, [Lcom/wiyun/engine/types/WYPoint; */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-lt v0, p0, :cond_0 */
} // :cond_0
com.wiyun.engine.types.WYPoint .makeZero ( );
/* aput-object v2, v1, v0 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public static com.wiyun.engine.types.WYPoint makeByRadian ( Float p0 ) {
/* .locals 3 */
/* float-to-double v0, p0 */
java.lang.Math .cos ( v0,v1 );
/* move-result-wide v0 */
/* double-to-float v0, v0 */
/* float-to-double v1, p0 */
java.lang.Math .sin ( v1,v2 );
/* move-result-wide v1 */
/* double-to-float v1, v1 */
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public static com.wiyun.engine.types.WYPoint makeZero ( ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
/* new-instance v0, Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {v0, v1, v1}, Lcom/wiyun/engine/types/WYPoint;-><init>(FF)V */
} // .end method
public static com.wiyun.engine.types.WYPoint midpoint ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
/* .locals 2 */
com.wiyun.engine.types.WYPoint .add ( p0,p1 );
/* const/high16 v1, 0x3f000000 # 0.5f */
com.wiyun.engine.types.WYPoint .mul ( v0,v1 );
} // .end method
public static com.wiyun.engine.types.WYPoint mul ( com.wiyun.engine.types.WYPoint p0, Float p1 ) {
/* .locals 2 */
/* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* mul-float/2addr v0, p1 */
/* iget v1, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* mul-float/2addr v1, p1 */
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public static com.wiyun.engine.types.WYPoint mul ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
/* .locals 3 */
/* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* mul-float/2addr v0, v1 */
/* iget v1, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* iget v2, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* mul-float/2addr v1, v2 */
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public static Boolean near ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1, Float p2 ) {
/* .locals 2 */
v0 = com.wiyun.engine.types.WYPoint .distancesq ( p0,p1 );
/* mul-float v1, p2, p2 */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static com.wiyun.engine.types.WYPoint negate ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* neg-float v0, v0 */
/* iget v1, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* neg-float v1, v1 */
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public static com.wiyun.engine.types.WYPoint normalize ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* const/high16 v0, 0x3f800000 # 1.0f */
v1 = com.wiyun.engine.types.WYPoint .length ( p0 );
/* div-float/2addr v0, v1 */
com.wiyun.engine.types.WYPoint .mul ( p0,v0 );
} // .end method
public static com.wiyun.engine.types.WYPoint perp ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* neg-float v0, v0 */
/* iget v1, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public static com.wiyun.engine.types.WYPoint project ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
/* .locals 2 */
v0 = com.wiyun.engine.types.WYPoint .dot ( p0,p1 );
v1 = com.wiyun.engine.types.WYPoint .dot ( p1,p1 );
/* div-float/2addr v0, v1 */
com.wiyun.engine.types.WYPoint .mul ( p1,v0 );
} // .end method
public static com.wiyun.engine.types.WYPoint rotate ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
/* .locals 4 */
/* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* mul-float/2addr v0, v1 */
/* iget v1, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* iget v2, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* mul-float/2addr v1, v2 */
/* sub-float/2addr v0, v1 */
/* iget v1, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v2, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* mul-float/2addr v1, v2 */
/* iget v2, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* iget v3, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public static com.wiyun.engine.types.WYPoint rotateByAngle ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1, Float p2 ) {
/* .locals 6 */
com.wiyun.engine.types.WYPoint .sub ( p0,p1 );
/* iget v1, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* float-to-double v2, p2 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* double-to-float v2, v2 */
/* float-to-double v3, p2 */
java.lang.Math .sin ( v3,v4 );
/* move-result-wide v3 */
/* double-to-float v3, v3 */
/* mul-float v4, v1, v2 */
/* iget v5, v0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* mul-float/2addr v5, v3 */
/* sub-float/2addr v4, v5 */
/* iput v4, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* mul-float/2addr v1, v3 */
/* iget v3, v0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
/* iput v1, v0, Lcom/wiyun/engine/types/WYPoint;->y:F */
com.wiyun.engine.types.WYPoint .add ( v0,p1 );
} // .end method
public static com.wiyun.engine.types.WYPoint rperp ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* iget v1, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* neg-float v1, v1 */
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public static com.wiyun.engine.types.WYPoint slerp ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1, Float p2 ) {
/* .locals 5 */
/* const/high16 v3, 0x3f800000 # 1.0f */
v0 = com.wiyun.engine.types.WYPoint .dot ( p0,p1 );
/* float-to-double v0, v0 */
java.lang.Math .acos ( v0,v1 );
/* move-result-wide v0 */
/* double-to-float v0, v0 */
int v1 = 0; // const/4 v1, 0x0
/* cmpl-float v1, v0, v1 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* float-to-double v1, v0 */
java.lang.Math .sin ( v1,v2 );
/* move-result-wide v1 */
/* double-to-float v1, v1 */
/* div-float v1, v3, v1 */
/* sub-float v2, v3, p2 */
/* mul-float/2addr v2, v0 */
/* float-to-double v2, v2 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* double-to-float v2, v2 */
/* mul-float/2addr v2, v1 */
com.wiyun.engine.types.WYPoint .mul ( p0,v2 );
/* mul-float/2addr v0, p2 */
/* float-to-double v3, v0 */
java.lang.Math .sin ( v3,v4 );
/* move-result-wide v3 */
/* double-to-float v0, v3 */
/* mul-float/2addr v0, v1 */
com.wiyun.engine.types.WYPoint .mul ( p1,v0 );
com.wiyun.engine.types.WYPoint .add ( v2,v0 );
} // :cond_0
} // .end method
public static com.wiyun.engine.types.WYPoint sub ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
/* .locals 3 */
/* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* sub-float/2addr v0, v1 */
/* iget v1, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* iget v2, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* sub-float/2addr v1, v2 */
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public static com.wiyun.engine.types.WYPoint toAngle ( Float p0 ) {
/* .locals 3 */
/* float-to-double v0, p0 */
java.lang.Math .cos ( v0,v1 );
/* move-result-wide v0 */
/* double-to-float v0, v0 */
/* float-to-double v1, p0 */
java.lang.Math .sin ( v1,v2 );
/* move-result-wide v1 */
/* double-to-float v1, v1 */
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public static Float toRadian ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 4 */
/* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* float-to-double v0, v0 */
/* iget v2, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* float-to-double v2, v2 */
java.lang.Math .atan2 ( v0,v1,v2,v3 );
/* move-result-wide v0 */
/* double-to-float v0, v0 */
} // .end method
public static com.wiyun.engine.types.WYPoint unrotate ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
/* .locals 4 */
/* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* mul-float/2addr v0, v1 */
/* iget v1, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* iget v2, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* iget v1, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* iget v2, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* mul-float/2addr v1, v2 */
/* iget v2, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v3, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* mul-float/2addr v2, v3 */
/* sub-float/2addr v1, v2 */
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
/* # virtual methods */
public com.wiyun.engine.types.WYPoint applyTransform ( com.wiyun.engine.types.WYAffineTransform p0 ) {
/* .locals 1 */
(( com.wiyun.engine.types.WYAffineTransform ) p1 ).transform ( p0 ); // invoke-virtual {p1, p0}, Lcom/wiyun/engine/types/WYAffineTransform;->transform(Lcom/wiyun/engine/types/WYPoint;)Lcom/wiyun/engine/types/WYPoint;
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "("; // const-string v1, "("
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v1, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = ", "; // const-string v1, ", "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = ")"; // const-string v1, ")"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public void translate ( Float p0, Float p1 ) {
/* .locals 1 */
/* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* add-float/2addr v0, p1 */
/* iput v0, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* add-float/2addr v0, p2 */
/* iput v0, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
return;
} // .end method

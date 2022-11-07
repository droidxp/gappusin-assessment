public class com.wiyun.engine.types.WYPoint {
	 /* .source "WYPoint.java" */
	 /* # static fields */
	 private static final Float FLT_EPSILON;
	 /* # instance fields */
	 public Float x;
	 public Float y;
	 /* # direct methods */
	 protected com.wiyun.engine.types.WYPoint ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 43 */
		 /* invoke-direct {p0, v0, v0}, Lcom/wiyun/engine/types/WYPoint;-><init>(FF)V */
		 /* .line 44 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.types.WYPoint ( ) {
		 /* .locals 0 */
		 /* .param p1, "x" # F */
		 /* .param p2, "y" # F */
		 /* .prologue */
		 /* .line 46 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 47 */
		 /* iput p1, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* .line 48 */
		 /* iput p2, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* .line 49 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.types.WYPoint add ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
		 /* .locals 3 */
		 /* .param p0, "v1" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .param p1, "v2" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .prologue */
		 /* .line 99 */
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
		 /* .param p0, "v1" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .param p1, "v2" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .prologue */
		 /* .line 153 */
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
		 /* .param p0, "s" # F */
		 /* .param p1, "v" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .prologue */
		 /* .line 157 */
		 /* neg-float v0, p0 */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
		 /* mul-float/2addr v0, v1 */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
		 /* mul-float/2addr v1, p0 */
		 com.wiyun.engine.types.WYPoint .make ( v0,v1 );
	 } // .end method
	 public static Float distance ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
		 /* .locals 1 */
		 /* .param p0, "v1" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .param p1, "v2" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .prologue */
		 /* .line 301 */
		 com.wiyun.engine.types.WYPoint .sub ( p0,p1 );
		 v0 = 		 com.wiyun.engine.types.WYPoint .length ( v0 );
	 } // .end method
	 public static Float distancesq ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
		 /* .locals 1 */
		 /* .param p0, "v1" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .param p1, "v2" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .prologue */
		 /* .line 312 */
		 com.wiyun.engine.types.WYPoint .sub ( p0,p1 );
		 v0 = 		 com.wiyun.engine.types.WYPoint .lengthsq ( v0 );
	 } // .end method
	 public static Float dot ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
		 /* .locals 3 */
		 /* .param p0, "v1" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .param p1, "v2" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .prologue */
		 /* .line 144 */
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
		 /* .param p0, "a" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .param p1, "b" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .param p2, "var" # F */
		 /* .prologue */
		 /* .line 239 */
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
		 /* .line 240 */
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
		 /* .line 241 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 242 */
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static Boolean isEqual ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
/* .locals 2 */
/* .param p0, "p1" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p1, "p2" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 68 */
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
/* .param p0, "v" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 288 */
v0 = com.wiyun.engine.types.WYPoint .dot ( p0,p0 );
/* float-to-double v0, v0 */
java.lang.Math .sqrt ( v0,v1 );
/* move-result-wide v0 */
/* double-to-float v0, v0 */
} // .end method
public static Float lengthsq ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 1 */
/* .param p0, "v" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 292 */
v0 = com.wiyun.engine.types.WYPoint .dot ( p0,p0 );
} // .end method
public static com.wiyun.engine.types.WYPoint lerp ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1, Float p2 ) {
/* .locals 2 */
/* .param p0, "a" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p1, "b" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p2, "alpha" # F */
/* .prologue */
/* .line 224 */
/* const/high16 v0, 0x3f800000 # 1.0f */
/* sub-float/2addr v0, p2 */
com.wiyun.engine.types.WYPoint .mul ( p0,v0 );
com.wiyun.engine.types.WYPoint .mul ( p1,p2 );
com.wiyun.engine.types.WYPoint .add ( v0,v1 );
} // .end method
public static Boolean lineIntersect ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1, com.wiyun.engine.types.WYPoint p2, com.wiyun.engine.types.WYPoint p3, Float[] p4 ) {
/* .locals 15 */
/* .param p0, "p1" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p1, "p2" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p2, "p3" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p3, "p4" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p4, "st" # [F */
/* .prologue */
/* .line 250 */
/* move-object/from16 v0, p2 */
com.wiyun.engine.types.WYPoint .sub ( p0,v0 );
/* .line 251 */
/* .local v9, "p13":Lcom/wiyun/engine/types/WYPoint; */
/* move-object/from16 v0, p3 */
/* move-object/from16 v1, p2 */
com.wiyun.engine.types.WYPoint .sub ( v0,v1 );
/* .line 255 */
/* .local v11, "p43":Lcom/wiyun/engine/types/WYPoint; */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 256 */
/* .local v12, "zero":Lcom/wiyun/engine/types/WYPoint; */
/* const/high16 v13, 0x34000000 */
v13 = com.wiyun.engine.types.WYPoint .fuzzyEqual ( v11,v12,v13 );
if ( v13 != null) { // if-eqz v13, :cond_0
/* .line 257 */
int v13 = 0; // const/4 v13, 0x0
/* .line 279 */
} // :goto_0
/* .line 259 */
} // :cond_0
/* move-object/from16 v0, p1 */
com.wiyun.engine.types.WYPoint .sub ( v0,p0 );
/* .line 262 */
/* .local v10, "p21":Lcom/wiyun/engine/types/WYPoint; */
/* const/high16 v13, 0x34000000 */
v13 = com.wiyun.engine.types.WYPoint .fuzzyEqual ( v10,v12,v13 );
if ( v13 != null) { // if-eqz v13, :cond_1
/* .line 263 */
int v13 = 0; // const/4 v13, 0x0
/* .line 265 */
} // :cond_1
v3 = com.wiyun.engine.types.WYPoint .dot ( v9,v11 );
/* .line 266 */
/* .local v3, "d1343":F */
v5 = com.wiyun.engine.types.WYPoint .dot ( v11,v10 );
/* .line 267 */
/* .local v5, "d4321":F */
v2 = com.wiyun.engine.types.WYPoint .dot ( v9,v10 );
/* .line 268 */
/* .local v2, "d1321":F */
v6 = com.wiyun.engine.types.WYPoint .dot ( v11,v11 );
/* .line 269 */
/* .local v6, "d4343":F */
v4 = com.wiyun.engine.types.WYPoint .dot ( v10,v10 );
/* .line 271 */
/* .local v4, "d2121":F */
/* mul-float v13, v4, v6 */
/* mul-float v14, v5, v5 */
/* sub-float v7, v13, v14 */
/* .line 272 */
/* .local v7, "denom":F */
v13 = java.lang.Math .abs ( v7 );
/* const/high16 v14, 0x34000000 */
/* cmpg-float v13, v13, v14 */
/* if-gez v13, :cond_2 */
/* .line 273 */
int v13 = 0; // const/4 v13, 0x0
/* .line 274 */
} // :cond_2
/* mul-float v13, v3, v5 */
/* mul-float v14, v2, v6 */
/* sub-float v8, v13, v14 */
/* .line 276 */
/* .local v8, "numer":F */
int v13 = 0; // const/4 v13, 0x0
/* div-float v14, v8, v7 */
/* aput v14, p4, v13 */
/* .line 277 */
int v13 = 1; // const/4 v13, 0x1
int v14 = 0; // const/4 v14, 0x0
/* aget v14, p4, v14 */
/* mul-float/2addr v14, v5 */
/* add-float/2addr v14, v3 */
/* div-float/2addr v14, v6 */
/* aput v14, p4, v13 */
/* .line 279 */
int v13 = 1; // const/4 v13, 0x1
} // .end method
public static com.wiyun.engine.types.WYPoint make ( Float p0, Float p1 ) {
/* .locals 1 */
/* .param p0, "x" # F */
/* .param p1, "y" # F */
/* .prologue */
/* .line 81 */
/* new-instance v0, Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/types/WYPoint;-><init>(FF)V */
} // .end method
public static com.wiyun.engine.types.WYPoint makeArray ( Integer p0 ) {
/* .locals 3 */
/* .param p0, "size" # I */
/* .prologue */
/* .line 26 */
/* new-array v1, p0, [Lcom/wiyun/engine/types/WYPoint; */
/* .line 27 */
/* .local v1, "p":[Lcom/wiyun/engine/types/WYPoint; */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
/* if-lt v0, p0, :cond_0 */
/* .line 29 */
/* .line 28 */
} // :cond_0
com.wiyun.engine.types.WYPoint .makeZero ( );
/* aput-object v2, v1, v0 */
/* .line 27 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public static com.wiyun.engine.types.WYPoint makeByRadian ( Float p0 ) {
/* .locals 3 */
/* .param p0, "r" # F */
/* .prologue */
/* .line 39 */
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
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 16 */
/* new-instance v0, Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {v0, v1, v1}, Lcom/wiyun/engine/types/WYPoint;-><init>(FF)V */
} // .end method
public static com.wiyun.engine.types.WYPoint midpoint ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
/* .locals 2 */
/* .param p0, "v1" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p1, "v2" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 135 */
com.wiyun.engine.types.WYPoint .add ( p0,p1 );
/* const/high16 v1, 0x3f000000 # 0.5f */
com.wiyun.engine.types.WYPoint .mul ( v0,v1 );
} // .end method
public static com.wiyun.engine.types.WYPoint mul ( com.wiyun.engine.types.WYPoint p0, Float p1 ) {
/* .locals 2 */
/* .param p0, "v" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p1, "s" # F */
/* .prologue */
/* .line 117 */
/* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* mul-float/2addr v0, p1 */
/* iget v1, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* mul-float/2addr v1, p1 */
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public static com.wiyun.engine.types.WYPoint mul ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
/* .locals 3 */
/* .param p0, "v" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p1, "v2" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 126 */
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
/* .param p0, "v1" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p1, "v2" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p2, "distance" # F */
/* .prologue */
/* .line 324 */
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
/* .param p0, "v" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 90 */
/* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* neg-float v0, v0 */
/* iget v1, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* neg-float v1, v1 */
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public static com.wiyun.engine.types.WYPoint normalize ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p0, "v" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 333 */
/* const/high16 v0, 0x3f800000 # 1.0f */
v1 = com.wiyun.engine.types.WYPoint .length ( p0 );
/* div-float/2addr v0, v1 */
com.wiyun.engine.types.WYPoint .mul ( p0,v0 );
} // .end method
public static com.wiyun.engine.types.WYPoint perp ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p0, "v" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 166 */
/* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* neg-float v0, v0 */
/* iget v1, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public static com.wiyun.engine.types.WYPoint project ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
/* .locals 2 */
/* .param p0, "v1" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p1, "v2" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 184 */
v0 = com.wiyun.engine.types.WYPoint .dot ( p0,p1 );
v1 = com.wiyun.engine.types.WYPoint .dot ( p1,p1 );
/* div-float/2addr v0, v1 */
com.wiyun.engine.types.WYPoint .mul ( p1,v0 );
} // .end method
public static com.wiyun.engine.types.WYPoint rotate ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
/* .locals 4 */
/* .param p0, "v1" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p1, "v2" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 193 */
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
/* .param p0, "v" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p1, "pivot" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p2, "angle" # F */
/* .prologue */
/* .line 205 */
com.wiyun.engine.types.WYPoint .sub ( p0,p1 );
/* .line 206 */
/* .local v1, "r":Lcom/wiyun/engine/types/WYPoint; */
/* iget v3, v1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* .line 207 */
/* .local v3, "t":F */
/* float-to-double v4, p2 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* double-to-float v0, v4 */
/* .local v0, "cosa":F */
/* float-to-double v4, p2 */
java.lang.Math .sin ( v4,v5 );
/* move-result-wide v4 */
/* double-to-float v2, v4 */
/* .line 208 */
/* .local v2, "sina":F */
/* mul-float v4, v3, v0 */
/* iget v5, v1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* mul-float/2addr v5, v2 */
/* sub-float/2addr v4, v5 */
/* iput v4, v1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* .line 209 */
/* mul-float v4, v3, v2 */
/* iget v5, v1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* mul-float/2addr v5, v0 */
/* add-float/2addr v4, v5 */
/* iput v4, v1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* .line 210 */
com.wiyun.engine.types.WYPoint .add ( v1,p1 );
/* .line 211 */
} // .end method
public static com.wiyun.engine.types.WYPoint rperp ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p0, "v" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 175 */
/* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* iget v1, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* neg-float v1, v1 */
com.wiyun.engine.types.WYPoint .make ( v0,v1 );
} // .end method
public static com.wiyun.engine.types.WYPoint slerp ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1, Float p2 ) {
/* .locals 5 */
/* .param p0, "a" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p1, "b" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p2, "t" # F */
/* .prologue */
/* const/high16 v4, 0x3f800000 # 1.0f */
/* .line 228 */
v2 = com.wiyun.engine.types.WYPoint .dot ( p0,p1 );
/* float-to-double v2, v2 */
java.lang.Math .acos ( v2,v3 );
/* move-result-wide v2 */
/* double-to-float v1, v2 */
/* .line 230 */
/* .local v1, "omega":F */
int v2 = 0; // const/4 v2, 0x0
/* cmpl-float v2, v1, v2 */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 231 */
/* float-to-double v2, v1 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* double-to-float v2, v2 */
/* div-float v0, v4, v2 */
/* .line 232 */
/* .local v0, "denom":F */
/* sub-float v2, v4, p2 */
/* mul-float/2addr v2, v1 */
/* float-to-double v2, v2 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v2 */
/* double-to-float v2, v2 */
/* mul-float/2addr v2, v0 */
com.wiyun.engine.types.WYPoint .mul ( p0,v2 );
/* mul-float v3, p2, v1 */
/* float-to-double v3, v3 */
java.lang.Math .sin ( v3,v4 );
/* move-result-wide v3 */
/* double-to-float v3, v3 */
/* mul-float/2addr v3, v0 */
com.wiyun.engine.types.WYPoint .mul ( p1,v3 );
com.wiyun.engine.types.WYPoint .add ( v2,v3 );
/* .line 234 */
} // .end local v0 # "denom":F
} // .end local p0 # "a":Lcom/wiyun/engine/types/WYPoint;
} // :cond_0
} // .end method
public static com.wiyun.engine.types.WYPoint sub ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
/* .locals 3 */
/* .param p0, "v1" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p1, "v2" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 108 */
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
/* .param p0, "a" # F */
/* .prologue */
/* .line 342 */
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
/* .param p0, "v" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 351 */
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
/* .param p0, "v1" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p1, "v2" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 220 */
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
/* .param p1, "aTransform" # Lcom/wiyun/engine/types/WYAffineTransform; */
/* .prologue */
/* .line 72 */
(( com.wiyun.engine.types.WYAffineTransform ) p1 ).transform ( p0 ); // invoke-virtual {p1, p0}, Lcom/wiyun/engine/types/WYAffineTransform;->transform(Lcom/wiyun/engine/types/WYPoint;)Lcom/wiyun/engine/types/WYPoint;
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .prologue */
/* .line 64 */
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
/* .param p1, "dx" # F */
/* .param p2, "dy" # F */
/* .prologue */
/* .line 58 */
/* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* add-float/2addr v0, p1 */
/* iput v0, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* .line 59 */
/* iget v0, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* add-float/2addr v0, p2 */
/* iput v0, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* .line 60 */
return;
} // .end method

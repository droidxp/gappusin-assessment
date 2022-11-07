public class net.chobin.android.psdxylz.app.s {
	 /* # static fields */
	 public static final a;
	 public static final b;
	 /* # direct methods */
	 static net.chobin.android.psdxylz.app.s ( ) {
		 /* .locals 2 */
		 /* const/16 v1, 0x140 */
		 net.chobin.android.psdxylz.app.s .a ( v1 );
		 net.chobin.android.psdxylz.app.s .b ( v1 );
		 return;
	 } // .end method
	 public static Integer a ( Integer p0 ) {
		 /* .locals 0 */
		 /* if-gez p0, :cond_0 */
		 /* mul-int/lit8 p0, p0, -0x1 */
	 } // :cond_0
} // .end method
public static Integer a ( Integer p0, Integer p1 ) {
	 /* .locals 7 */
	 /* const v6, 0xf4240 */
	 int v2 = 1; // const/4 v2, 0x1
	 int v0 = 0; // const/4 v0, 0x0
	 /* if-nez p1, :cond_2 */
	 /* if-nez p0, :cond_0 */
} // :goto_0
} // :cond_0
/* if-lez p0, :cond_1 */
/* const/16 v0, 0x623 */
} // :cond_1
/* const/16 v0, -0x623 */
} // :cond_2
/* mul-int/lit16 v1, p0, 0x3e8 */
/* div-int/2addr v1, p1 */
/* const/16 v3, 0x3e8 */
/* if-le v1, v3, :cond_5 */
/* move v3, v2 */
} // :goto_1
/* const/16 v4, -0x3e8 */
/* if-ge v1, v4, :cond_3 */
/* move v0, v2 */
} // :cond_3
/* sub-int v4, v3, v0 */
if ( v4 != null) { // if-eqz v4, :cond_7
/* mul-int v0, v4, v6 */
/* div-int/2addr v0, v1 */
} // :goto_2
int v1 = 3; // const/4 v1, 0x3
/* move v2, v0 */
/* move v3, v0 */
} // :goto_3
/* neg-int v2, v2 */
/* mul-int/2addr v2, v0 */
/* mul-int/2addr v2, v0 */
/* div-int/2addr v2, v6 */
/* div-int v5, v2, v1 */
/* if-nez v5, :cond_6 */
if ( v4 != null) { // if-eqz v4, :cond_4
/* rsub-int v0, v3, 0x622 */
/* mul-int v3, v4, v0 */
} // :cond_4
/* move v0, v3 */
} // :cond_5
/* move v3, v0 */
} // :cond_6
/* add-int/2addr v3, v5 */
/* add-int/lit8 v1, v1, 0x2 */
} // :cond_7
/* move v0, v1 */
} // .end method
public static Integer a ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* add-int v0, p0, p1 */
/* add-int/2addr v0, p2 */
/* rem-int/2addr v0, p2 */
} // .end method
public static Integer a ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 4 */
/* sub-int v1, p2, p0 */
/* sub-int v2, p3, p1 */
/* if-nez v1, :cond_3 */
/* if-nez v2, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
} // :goto_0
} // :cond_1
/* if-lez v2, :cond_2 */
/* div-int/lit8 v0, p4, 0x4 */
} // :cond_2
/* if-gez v2, :cond_3 */
/* mul-int/lit8 v0, p4, 0x3 */
/* div-int/lit8 v0, v0, 0x4 */
} // :cond_3
v0 = net.chobin.android.psdxylz.app.s .a ( v2,v1 );
/* div-int/lit8 v3, p4, 0x2 */
/* mul-int/2addr v0, v3 */
/* div-int/lit16 v0, v0, 0xc46 */
/* if-gez v1, :cond_4 */
/* if-gez v2, :cond_5 */
} // :cond_4
/* if-gez v1, :cond_7 */
/* if-gtz v2, :cond_7 */
} // :cond_5
/* div-int/lit8 v1, p4, 0x2 */
/* add-int/2addr v0, v1 */
} // :cond_6
} // :goto_1
/* if-lt v0, p4, :cond_0 */
/* rem-int/2addr v0, p4 */
} // :cond_7
/* if-lez v1, :cond_6 */
/* if-gtz v2, :cond_6 */
/* add-int/2addr v0, p4 */
} // .end method
public static Integer a ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6, Integer p7, Integer p8 ) {
/* .locals 2 */
v0 = net.chobin.android.psdxylz.app.s .b ( p0,p1,p2,p3,p8 );
v1 = net.chobin.android.psdxylz.app.s .b ( p4,p5,p6,p7,p8 );
/* sub-int/2addr v0, v1 */
/* if-gez v0, :cond_0 */
/* add-int/2addr v0, p8 */
} // :cond_0
/* mul-int/lit8 v0, v0, 0x2 */
/* add-int/2addr v0, v1 */
/* add-int/2addr v0, p8 */
/* rem-int/2addr v0, p8 */
} // .end method
public static Long a ( Long p0, Long p1 ) {
/* .locals 4 */
/* long-to-double v0, p0 */
java.lang.Math .sqrt ( v0,v1 );
/* move-result-wide v0 */
/* long-to-double v2, p2 */
/* mul-double/2addr v0, v2 */
/* double-to-long v0, v0 */
/* return-wide v0 */
} // .end method
public static Long a ( Long p0, Long p1, Long p2, Long p3 ) {
/* .locals 6 */
/* sub-long v0, p0, p4 */
/* sub-long v2, p0, p4 */
/* mul-long/2addr v0, v2 */
/* sub-long v2, p2, p6 */
/* sub-long v4, p2, p6 */
/* mul-long/2addr v2, v4 */
/* add-long/2addr v0, v2 */
/* const-wide/16 v2, 0x1 */
net.chobin.android.psdxylz.app.s .a ( v0,v1,v2,v3 );
/* move-result-wide v0 */
/* return-wide v0 */
} // .end method
public static Boolean a ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5, Float p6, Float p7 ) {
/* .locals 1 */
/* add-float v0, p4, p6 */
/* cmpg-float v0, p0, v0 */
/* if-gez v0, :cond_0 */
/* add-float v0, p0, p2 */
/* cmpl-float v0, v0, p4 */
/* if-lez v0, :cond_0 */
/* add-float v0, p5, p7 */
/* cmpg-float v0, p1, v0 */
/* if-gez v0, :cond_0 */
/* add-float v0, p1, p3 */
/* cmpl-float v0, v0, p5 */
/* if-lez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static Boolean a ( Long p0, Long p1, Long p2, Long p3, Long p4, Long p5, Long p6, Long p7 ) {
/* .locals 8 */
/* sub-long v0, p0, p8 */
/* sub-long v2, p6, p10 */
/* mul-long/2addr v0, v2 */
/* sub-long v2, p2, p10 */
/* sub-long v4, p4, p8 */
/* mul-long/2addr v2, v4 */
/* sub-long/2addr v0, v2 */
/* sub-long v2, p0, p12 */
/* sub-long v4, p6, p14 */
/* mul-long/2addr v2, v4 */
/* sub-long v4, p2, p14 */
/* sub-long v6, p4, p12 */
/* mul-long/2addr v4, v6 */
/* sub-long/2addr v2, v4 */
/* and-long v4, v0, v2 */
/* const-wide/16 v6, 0x0 */
/* cmp-long v4, v4, v6 */
/* if-ltz v4, :cond_0 */
/* or-long/2addr v0, v2 */
/* const-wide/16 v2, 0x0 */
/* cmp-long v0, v0, v2 */
/* if-lez v0, :cond_1 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
} // .end method
public static a ( Integer p0 ) {
/* .locals 13 */
int v0 = 0; // const/4 v0, 0x0
/* const/16 v7, 0x64 */
/* const v8, 0x186a0 */
/* const v9, 0x4cb2f */
/* mul-int/lit8 v1, p0, 0x4 */
/* new-array v10, v1, [I */
/* move v6, v0 */
} // :goto_0
/* add-int/lit8 v1, p0, 0x1 */
/* if-lt v6, v1, :cond_0 */
/* move v1, v0 */
} // :goto_1
/* if-lt v1, p0, :cond_2 */
} // :goto_2
/* mul-int/lit8 v1, p0, 0x2 */
/* add-int/lit8 v1, v1, -0x1 */
/* if-lt v0, v1, :cond_3 */
} // :cond_0
/* mul-int/lit8 v1, p0, 0x2 */
/* div-int v1, v9, v1 */
/* mul-int/2addr v1, v6 */
/* int-to-long v4, v1 */
int v1 = 1; // const/4 v1, 0x1
/* move-wide v2, v4 */
} // :goto_3
/* const/16 v11, 0x14 */
/* if-lt v1, v11, :cond_1 */
/* add-int/lit8 v1, v6, 0x1 */
/* move v6, v1 */
} // :cond_1
/* aget v11, v10, v6 */
/* long-to-int v12, v2 */
/* div-int/2addr v12, v7 */
/* add-int/2addr v11, v12 */
/* aput v11, v10, v6 */
/* const-wide/16 v11, -0x1 */
/* mul-long/2addr v2, v11 */
/* mul-long/2addr v2, v4 */
/* int-to-long v11, v8 */
/* div-long/2addr v2, v11 */
/* mul-long/2addr v2, v4 */
/* int-to-long v11, v8 */
/* div-long/2addr v2, v11 */
/* mul-int/lit8 v11, v1, 0x2 */
/* add-int/lit8 v11, v11, 0x1 */
/* mul-int/2addr v11, v1 */
/* mul-int/lit8 v11, v11, 0x2 */
/* int-to-long v11, v11 */
/* div-long/2addr v2, v11 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
/* add-int v2, v1, p0 */
/* add-int/lit8 v2, v2, 0x1 */
/* add-int/lit8 v3, p0, -0x1 */
/* sub-int/2addr v3, v1 */
/* aget v3, v10, v3 */
/* aput v3, v10, v2 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_3
/* mul-int/lit8 v1, p0, 0x2 */
/* add-int/2addr v1, v0 */
/* add-int/lit8 v1, v1, 0x1 */
/* mul-int/lit8 v2, p0, 0x2 */
/* add-int/lit8 v2, v2, -0x1 */
/* sub-int/2addr v2, v0 */
/* aget v2, v10, v2 */
/* mul-int/lit8 v2, v2, -0x1 */
/* aput v2, v10, v1 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public static a ( Long p0, Long p1, Long p2, Long p3, Long p4, Long p5, Long p6, Long p7 ) {
/* .locals 12 */
/* sub-long v1, p4, p0 */
/* sub-long v3, p6, p2 */
/* sub-long v5, p12, p8 */
/* sub-long v7, p14, p10 */
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [J */
/* const-wide/16 v9, 0x0 */
/* cmp-long v9, v1, v9 */
/* if-nez v9, :cond_1 */
/* const-wide/16 v9, 0x0 */
/* cmp-long v9, v5, v9 */
/* if-nez v9, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
} // :goto_0
} // :cond_1
/* const-wide/16 v9, 0x0 */
/* cmp-long v9, v1, v9 */
/* if-nez v9, :cond_3 */
int v1 = 0; // const/4 v1, 0x0
/* aput-wide p0, v0, v1 */
/* const-wide/16 v1, 0x3e8 */
/* mul-long/2addr v1, v7 */
/* div-long/2addr v1, v5 */
int v3 = 1; // const/4 v3, 0x1
int v4 = 0; // const/4 v4, 0x0
/* aget-wide v4, v0, v4 */
/* sub-long v4, v4, p8 */
/* mul-long/2addr v1, v4 */
/* const-wide/16 v4, 0x3e8 */
/* div-long/2addr v1, v4 */
/* add-long v1, v1, p10 */
/* aput-wide v1, v0, v3 */
} // :goto_1
/* cmp-long v1, p0, p4 */
/* if-lez v1, :cond_6 */
int v1 = 0; // const/4 v1, 0x0
/* aget-wide v1, v0, v1 */
/* cmp-long v1, v1, p4 */
/* if-ltz v1, :cond_2 */
int v1 = 0; // const/4 v1, 0x0
/* aget-wide v1, v0, v1 */
/* cmp-long v1, v1, p0 */
/* if-lez v1, :cond_8 */
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // :cond_3
/* const-wide/16 v9, 0x0 */
/* cmp-long v9, v5, v9 */
/* if-nez v9, :cond_4 */
int v5 = 0; // const/4 v5, 0x0
/* aput-wide p8, v0, v5 */
/* const-wide/16 v5, 0x3e8 */
/* mul-long/2addr v3, v5 */
/* div-long v1, v3, v1 */
int v3 = 1; // const/4 v3, 0x1
int v4 = 0; // const/4 v4, 0x0
/* aget-wide v4, v0, v4 */
/* sub-long/2addr v4, p0 */
/* mul-long/2addr v1, v4 */
/* const-wide/16 v4, 0x3e8 */
/* div-long/2addr v1, v4 */
/* add-long/2addr v1, p2 */
/* aput-wide v1, v0, v3 */
} // :cond_4
/* const-wide/16 v9, 0x3e8 */
/* mul-long/2addr v3, v9 */
/* div-long v1, v3, v1 */
/* const-wide/16 v3, 0x3e8 */
/* mul-long/2addr v3, v7 */
/* div-long/2addr v3, v5 */
/* sub-long v5, v1, v3 */
/* const-wide/16 v7, 0x0 */
/* cmp-long v7, v5, v7 */
/* if-nez v7, :cond_5 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_5
int v7 = 0; // const/4 v7, 0x0
/* mul-long v8, v1, p0 */
/* const-wide/16 v10, 0x3e8 */
/* div-long/2addr v8, v10 */
/* sub-long/2addr v8, p2 */
/* mul-long v3, v3, p8 */
/* const-wide/16 v10, 0x3e8 */
/* div-long/2addr v3, v10 */
/* sub-long v3, v8, v3 */
/* add-long v3, v3, p10 */
/* const-wide/16 v8, 0x3e8 */
/* mul-long/2addr v3, v8 */
/* div-long/2addr v3, v5 */
/* aput-wide v3, v0, v7 */
int v3 = 1; // const/4 v3, 0x1
int v4 = 0; // const/4 v4, 0x0
/* aget-wide v4, v0, v4 */
/* sub-long/2addr v4, p0 */
/* mul-long/2addr v1, v4 */
/* const-wide/16 v4, 0x3e8 */
/* div-long/2addr v1, v4 */
/* add-long/2addr v1, p2 */
/* aput-wide v1, v0, v3 */
} // :cond_6
int v1 = 0; // const/4 v1, 0x0
/* aget-wide v1, v0, v1 */
/* cmp-long v1, v1, p0 */
/* if-ltz v1, :cond_7 */
int v1 = 0; // const/4 v1, 0x0
/* aget-wide v1, v0, v1 */
/* cmp-long v1, v1, p4 */
/* if-lez v1, :cond_8 */
} // :cond_7
int v0 = 0; // const/4 v0, 0x0
/* goto/16 :goto_0 */
} // :cond_8
/* cmp-long v1, p2, p6 */
/* if-lez v1, :cond_a */
int v1 = 1; // const/4 v1, 0x1
/* aget-wide v1, v0, v1 */
/* const-wide/16 v3, 0x1388 */
/* sub-long v3, p6, v3 */
/* cmp-long v1, v1, v3 */
/* if-ltz v1, :cond_9 */
int v1 = 1; // const/4 v1, 0x1
/* aget-wide v1, v0, v1 */
/* const-wide/16 v3, 0x1388 */
/* add-long/2addr v3, p2 */
/* cmp-long v1, v1, v3 */
/* if-lez v1, :cond_0 */
} // :cond_9
int v0 = 0; // const/4 v0, 0x0
/* goto/16 :goto_0 */
} // :cond_a
int v1 = 1; // const/4 v1, 0x1
/* aget-wide v1, v0, v1 */
/* const-wide/16 v3, 0x1388 */
/* sub-long v3, p2, v3 */
/* cmp-long v1, v1, v3 */
/* if-ltz v1, :cond_b */
int v1 = 1; // const/4 v1, 0x1
/* aget-wide v1, v0, v1 */
/* const-wide/16 v3, 0x1388 */
/* add-long v3, v3, p6 */
/* cmp-long v1, v1, v3 */
/* if-lez v1, :cond_0 */
} // :cond_b
int v0 = 0; // const/4 v0, 0x0
/* goto/16 :goto_0 */
} // .end method
public static Integer b ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 2 */
v0 = net.chobin.android.psdxylz.app.s .c ( p0,p1,p2 );
/* div-int/lit8 v1, p2, 0x2 */
/* if-gt v0, v1, :cond_0 */
} // :goto_0
} // :cond_0
/* sub-int v0, p2, v0 */
} // .end method
public static Integer b ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 1 */
v0 = net.chobin.android.psdxylz.app.s .a ( p0,p1,p2,p3,p4 );
} // .end method
public static Long b ( Long p0, Long p1, Long p2, Long p3 ) {
/* .locals 6 */
/* sub-long v0, p0, p4 */
/* sub-long v2, p0, p4 */
/* mul-long/2addr v0, v2 */
/* sub-long v2, p2, p6 */
/* sub-long v4, p2, p6 */
/* mul-long/2addr v2, v4 */
/* add-long/2addr v0, v2 */
/* return-wide v0 */
} // .end method
public static Boolean b ( Long p0, Long p1, Long p2, Long p3, Long p4, Long p5, Long p6, Long p7 ) {
/* .locals 12 */
/* sub-long v0, p4, p0 */
/* sub-long v2, p10, p2 */
/* mul-long/2addr v0, v2 */
/* sub-long v2, p6, p2 */
/* sub-long v4, p8, p0 */
/* mul-long/2addr v2, v4 */
/* sub-long/2addr v0, v2 */
/* sub-long v2, p0, p12 */
/* sub-long v4, p6, p14 */
/* mul-long/2addr v2, v4 */
/* sub-long v4, p2, p14 */
/* sub-long v6, p4, p12 */
/* mul-long/2addr v4, v6 */
/* sub-long/2addr v2, v4 */
/* sub-long v4, p4, p12 */
/* sub-long v6, p10, p14 */
/* mul-long/2addr v4, v6 */
/* sub-long v6, p6, p14 */
/* sub-long v8, p8, p12 */
/* mul-long/2addr v6, v8 */
/* sub-long/2addr v4, v6 */
/* sub-long v6, p8, p12 */
/* sub-long v8, p2, p14 */
/* mul-long/2addr v6, v8 */
/* sub-long v8, p10, p14 */
/* sub-long v10, p0, p12 */
/* mul-long/2addr v8, v10 */
/* sub-long/2addr v6, v8 */
/* const-wide/16 v8, 0x0 */
/* cmp-long v8, v0, v8 */
/* if-gtz v8, :cond_0 */
/* const-wide/16 v8, 0x0 */
/* cmp-long v8, v2, v8 */
/* if-gtz v8, :cond_0 */
/* const-wide/16 v8, 0x0 */
/* cmp-long v8, v4, v8 */
/* if-gtz v8, :cond_0 */
/* const-wide/16 v8, 0x0 */
/* cmp-long v8, v6, v8 */
/* if-lez v8, :cond_1 */
} // :cond_0
/* const-wide/16 v8, 0x0 */
/* cmp-long v0, v0, v8 */
/* if-ltz v0, :cond_2 */
/* const-wide/16 v0, 0x0 */
/* cmp-long v0, v2, v0 */
/* if-ltz v0, :cond_2 */
/* const-wide/16 v0, 0x0 */
/* cmp-long v0, v4, v0 */
/* if-ltz v0, :cond_2 */
/* const-wide/16 v0, 0x0 */
/* cmp-long v0, v6, v0 */
/* if-ltz v0, :cond_2 */
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static b ( Integer p0 ) {
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
net.chobin.android.psdxylz.app.s .a ( p0 );
/* new-array v1, p0, [I */
java.lang.System .arraycopy ( v0,v4,v1,v4,p0 );
/* array-length v2, v0 */
/* new-array v2, v2, [I */
/* mul-int/lit8 v3, p0, 0x3 */
java.lang.System .arraycopy ( v0,p0,v2,v4,v3 );
/* mul-int/lit8 v0, p0, 0x3 */
java.lang.System .arraycopy ( v1,v4,v2,v0,p0 );
} // .end method
public static Integer c ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* if-gt p0, p1, :cond_0 */
/* sub-int v0, p1, p0 */
/* add-int/2addr v0, p2 */
/* rem-int/2addr v0, p2 */
} // :goto_0
} // :cond_0
/* mul-int/lit8 v0, p2, 0x2 */
/* add-int/2addr v0, p1 */
/* sub-int/2addr v0, p0 */
/* rem-int/2addr v0, p2 */
} // .end method
public static Integer d ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 2 */
v0 = net.chobin.android.psdxylz.app.s .c ( p0,p1,p2 );
/* div-int/lit8 v1, p2, 0x2 */
/* if-gt v0, v1, :cond_0 */
} // :goto_0
} // :cond_0
/* sub-int/2addr v0, p2 */
} // .end method

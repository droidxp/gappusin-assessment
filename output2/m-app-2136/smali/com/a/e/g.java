public class com.a.e.g {
	 /* # static fields */
	 public static e;
	 public static f;
	 public static I g;
	 public static Integer h;
	 public static Integer i;
	 /* # instance fields */
	 public com.a.a.a a;
	 public com.a.c.d b;
	 public java.util.ArrayList c;
	 public com.a.c.d d;
	 /* # direct methods */
	 static com.a.e.g ( ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 int v1 = 5; // const/4 v1, 0x5
		 /* new-array v0, v1, [I */
		 /* new-array v0, v1, [I */
		 int v0 = 6; // const/4 v0, 0x6
		 /* filled-new-array {v1, v0}, [I */
		 v1 = java.lang.Integer.TYPE;
		 java.lang.reflect.Array .newInstance ( v1,v0 );
		 /* check-cast v0, [[I */
		 return;
	 } // .end method
	 public com.a.e.g ( ) {
		 /* .locals 13 */
		 /* const/high16 v12, 0x41400000 # 12.0f */
		 int v5 = 0; // const/4 v5, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.a = p1;
		 v0 = this.b;
		 v0 = this.e;
		 /* iput v0, p1, Lcom/a/a/a;->D:I */
		 v0 = com.a.e.g.e;
		 /* aget v0, v0, v5 */
		 /* if-nez v0, :cond_0 */
		 v0 = com.a.e.g.e;
		 int v1 = 1; // const/4 v1, 0x1
		 /* aput v1, v0, v5 */
	 } // :cond_0
	 /* new-instance v0, Ljava/util/ArrayList; */
	 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
	 this.c = v0;
	 /* new-instance v0, Lcom/a/c/d; */
	 /* const/high16 v1, 0x41200000 # 10.0f */
	 com.a.a.a .a ( v1 );
	 v1 = 	 (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
	 /* const/high16 v2, 0x41f00000 # 30.0f */
	 com.a.a.a .b ( v2 );
	 v2 = 	 (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
	 v3 = this.J;
	 /* const/high16 v4, 0x40e00000 # 7.0f */
	 v3 = 	 com.a.a.a .a ( v3,v4 );
	 v4 = this.J;
	 /* const/high16 v6, 0x41000000 # 8.0f */
	 v4 = 	 com.a.a.a .c ( v4,v6 );
	 /* invoke-direct/range {v0 ..v5}, Lcom/a/c/d;-><init>(FFFFI)V */
	 this.b = v0;
	 /* move v2, v5 */
} // :goto_0
int v0 = 2; // const/4 v0, 0x2
/* if-lt v2, v0, :cond_1 */
/* new-instance v0, Lcom/a/c/d; */
/* int-to-float v1, v1 */
v2 = this.ah;
v2 = com.a.a.a .a ( v2,v12 );
/* sub-float/2addr v1, v2 */
/* int-to-float v2, v2 */
v3 = this.ah;
v3 = com.a.a.a .b ( v3,v12 );
/* sub-float/2addr v2, v3 */
/* const/high16 v3, 0x42c80000 # 100.0f */
com.a.a.a .a ( v3 );
v3 = (( java.lang.Float ) v3 ).floatValue ( ); // invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F
/* const/high16 v4, 0x42480000 # 50.0f */
com.a.a.a .b ( v4 );
v4 = (( java.lang.Float ) v4 ).floatValue ( ); // invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F
/* const/16 v5, 0xa */
/* invoke-direct/range {v0 ..v5}, Lcom/a/c/d;-><init>(FFFFI)V */
this.d = v0;
return;
} // :cond_1
/* move v1, v5 */
} // :goto_1
int v0 = 3; // const/4 v0, 0x3
/* if-lt v1, v0, :cond_2 */
/* add-int/lit8 v0, v2, 0x1 */
/* move v2, v0 */
} // :cond_2
v3 = this.c;
/* new-instance v6, Lcom/a/c/d; */
/* mul-int/lit16 v0, v1, 0xb4 */
/* add-int/lit16 v0, v0, 0x8c */
/* int-to-float v0, v0 */
com.a.a.a .a ( v0 );
v7 = (( java.lang.Float ) v0 ).floatValue ( ); // invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
/* mul-int/lit16 v0, v2, 0xa0 */
/* add-int/lit8 v0, v0, 0x64 */
/* int-to-float v0, v0 */
com.a.a.a .b ( v0 );
v8 = (( java.lang.Float ) v0 ).floatValue ( ); // invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
v0 = this.O;
(( java.util.ArrayList ) v0 ).get ( v5 ); // invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* const/high16 v4, 0x40a00000 # 5.0f */
v9 = com.a.a.a .a ( v0,v4 );
v0 = this.O;
(( java.util.ArrayList ) v0 ).get ( v5 ); // invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* const/high16 v4, 0x40800000 # 4.0f */
v10 = com.a.a.a .c ( v0,v4 );
/* add-int/lit8 v0, v1, 0x1 */
/* mul-int/lit8 v4, v2, 0x2 */
/* add-int v11, v0, v4 */
/* invoke-direct/range {v6 ..v11}, Lcom/a/c/d;-><init>(FFFFI)V */
(( java.util.ArrayList ) v3 ).add ( v6 ); // invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 1 */
v0 = this.c;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
return;
} // .end method
public void a ( android.graphics.Canvas p0, android.graphics.Paint p1 ) {
/* .locals 10 */
v0 = this.a;
v0 = this.M;
int v1 = 2; // const/4 v1, 0x2
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
v2 = this.a;
v1 = this.a;
v1 = this.M;
int v3 = 2; // const/4 v3, 0x2
(( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
(( com.a.a.a ) v2 ).a ( v1, v3, v4 ); // invoke-virtual {v2, v1, v3, v4}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;II)Landroid/graphics/Matrix;
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, p2 ); // invoke-virtual {p1, v0, v1, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.a;
v0 = this.M;
int v1 = 0; // const/4 v1, 0x0
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
v0 = this.M;
int v1 = 0; // const/4 v1, 0x0
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
int v1 = 0; // const/4 v1, 0x0
/* int-to-float v3, v2 */
v2 = this.a;
v2 = this.M;
int v4 = 0; // const/4 v4, 0x0
(( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
/* const v4, 0x3fb33333 # 1.4f */
v2 = com.a.a.a .c ( v2,v4 );
/* sub-float v2, v3, v2 */
/* const/high16 v3, 0x40000000 # 2.0f */
/* div-float/2addr v2, v3 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x3f800000 # 1.0f */
/* const v6, 0x3fb33333 # 1.4f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->b(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.a;
v0 = this.M;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
v0 = this.M;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
int v1 = 0; // const/4 v1, 0x0
/* int-to-float v3, v2 */
v2 = this.a;
v2 = this.M;
int v4 = 1; // const/4 v4, 0x1
(( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
v2 = (( android.graphics.Bitmap ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I
/* int-to-float v4, v2 */
/* int-to-float v2, v2 */
/* const/high16 v5, 0x3f800000 # 1.0f */
/* div-float v5, v2, v5 */
v2 = this.a;
v2 = this.M;
int v6 = 1; // const/4 v6, 0x1
(( java.util.ArrayList ) v2 ).get ( v6 ); // invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* int-to-float v2, v2 */
/* div-float v2, v5, v2 */
/* mul-float/2addr v2, v4 */
/* sub-float v2, v3, v2 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x3f800000 # 1.0f */
/* const/high16 v6, 0x40800000 # 4.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.a;
v7 = this.ag;
v0 = this.a;
v0 = this.ag;
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x3f800000 # 1.0f */
/* const/high16 v6, 0x40c00000 # 6.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->b(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.a;
v7 = this.N;
v0 = this.a;
v0 = this.N;
/* int-to-float v1, v1 */
v2 = this.a;
v2 = this.N;
/* const/high16 v3, 0x40800000 # 4.0f */
v2 = com.a.a.a .a ( v2,v3 );
/* sub-float/2addr v1, v2 */
/* const/high16 v2, 0x40000000 # 2.0f */
/* div-float/2addr v1, v2 */
int v2 = 0; // const/4 v2, 0x0
com.a.a.a .b ( v2 );
v2 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x40800000 # 4.0f */
/* const/high16 v6, 0x40800000 # 4.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
int v1 = 1; // const/4 v1, 0x1
/* if-eq v0, v1, :cond_0 */
v0 = this.a;
v7 = this.J;
v0 = this.a;
v0 = this.J;
/* const/high16 v1, 0x41200000 # 10.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x41f00000 # 30.0f */
com.a.a.a .b ( v2 );
v2 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x40e00000 # 7.0f */
/* const/high16 v6, 0x41000000 # 8.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :goto_0
int v1 = 2; // const/4 v1, 0x2
/* if-eq v0, v1, :cond_1 */
v0 = this.a;
v7 = this.ah;
v0 = this.a;
v0 = this.ah;
/* int-to-float v1, v1 */
v2 = this.a;
v2 = this.ah;
/* const/high16 v3, 0x41400000 # 12.0f */
v2 = com.a.a.a .a ( v2,v3 );
/* sub-float/2addr v1, v2 */
/* int-to-float v2, v2 */
v3 = this.a;
v3 = this.ah;
/* const/high16 v4, 0x41400000 # 12.0f */
v3 = com.a.a.a .b ( v3,v4 );
/* sub-float/2addr v2, v3 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x41400000 # 12.0f */
/* const/high16 v6, 0x41000000 # 8.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :goto_1
/* const/16 v1, 0x46 */
/* if-ge v0, v1, :cond_2 */
/* add-int/lit8 v0, v0, 0x5 */
} // :goto_2
int v0 = 0; // const/4 v0, 0x0
/* move v9, v0 */
} // :goto_3
int v0 = 2; // const/4 v0, 0x2
/* if-lt v9, v0, :cond_3 */
(( com.a.e.g ) p0 ).c ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/a/e/g;->c(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
(( com.a.e.g ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/a/e/g;->b(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
return;
} // :cond_0
v0 = this.a;
v7 = this.J;
v0 = this.a;
v0 = this.J;
/* const/high16 v1, 0x41700000 # 15.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x42340000 # 45.0f */
com.a.a.a .b ( v2 );
v2 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x41000000 # 8.0f */
/* const/high16 v6, 0x41100000 # 9.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_1
v0 = this.a;
v7 = this.ah;
v0 = this.a;
v0 = this.ah;
/* int-to-float v1, v1 */
v2 = this.a;
v2 = this.ah;
/* const/high16 v3, 0x41500000 # 13.0f */
v2 = com.a.a.a .a ( v2,v3 );
/* sub-float/2addr v1, v2 */
/* int-to-float v2, v2 */
v3 = this.a;
v3 = this.ag;
/* const v4, 0x3f99999a # 1.2f */
v3 = com.a.a.a .b ( v3,v4 );
/* sub-float/2addr v2, v3 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x41500000 # 13.0f */
/* const/high16 v6, 0x41100000 # 9.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
/* move v8, v0 */
} // :goto_4
int v0 = 3; // const/4 v0, 0x3
/* if-lt v8, v0, :cond_4 */
/* add-int/lit8 v0, v9, 0x1 */
/* move v9, v0 */
} // :cond_4
v0 = this.a;
v0 = this.O;
int v1 = 0; // const/4 v1, 0x0
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
v0 = this.O;
int v1 = 0; // const/4 v1, 0x0
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* mul-int/lit16 v1, v8, 0xb4 */
/* add-int/lit16 v1, v1, 0x8c */
/* int-to-float v1, v1 */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* mul-int/lit16 v2, v9, 0xa0 */
/* add-int/lit8 v2, v2, 0x64 */
/* int-to-float v2, v2 */
com.a.a.a .b ( v2 );
v2 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x40a00000 # 5.0f */
/* const/high16 v6, 0x40800000 # 4.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.a;
v0 = this.ax;
int v1 = 3; // const/4 v1, 0x3
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* mul-int/lit16 v1, v8, 0xb4 */
/* add-int/lit16 v1, v1, 0xaa */
/* int-to-float v3, v1 */
/* mul-int/lit16 v1, v9, 0xa0 */
/* add-int/lit8 v1, v1, 0x78 */
/* int-to-float v4, v1 */
/* const/high16 v5, 0x40800000 # 4.0f */
/* const/high16 v6, 0x41500000 # 13.0f */
/* add-int/lit8 v1, v8, 0x1 */
/* mul-int/lit8 v2, v9, 0x3 */
/* add-int/2addr v1, v2 */
/* int-to-float v7, v1 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* invoke-static/range {v0 ..v7}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFFF)V */
(( android.graphics.Canvas ) p1 ).save ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
/* mul-int/lit16 v0, v8, 0xb4 */
/* add-int/lit16 v0, v0, 0x8c */
/* int-to-float v0, v0 */
com.a.a.a .a ( v0 );
v1 = (( java.lang.Float ) v0 ).floatValue ( ); // invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
/* mul-int/lit16 v0, v9, 0xa0 */
/* add-int/lit8 v0, v0, 0x69 */
/* int-to-float v0, v0 */
com.a.a.a .b ( v0 );
v2 = (( java.lang.Float ) v0 ).floatValue ( ); // invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
/* mul-int/lit16 v0, v8, 0xb4 */
/* add-int/lit16 v0, v0, 0x8c */
/* int-to-float v0, v0 */
com.a.a.a .a ( v0 );
v3 = (( java.lang.Float ) v0 ).floatValue ( ); // invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
v0 = this.a;
v0 = this.O;
int v4 = 0; // const/4 v4, 0x0
(( java.util.ArrayList ) v0 ).get ( v4 ); // invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* const/high16 v4, 0x40a00000 # 5.0f */
v0 = com.a.a.a .a ( v0,v4 );
/* add-float/2addr v0, v3 */
/* mul-int/lit16 v3, v9, 0xa0 */
/* add-int/lit8 v3, v3, 0x69 */
/* int-to-float v3, v3 */
com.a.a.a .b ( v3 );
v3 = (( java.lang.Float ) v3 ).floatValue ( ); // invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F
/* const/high16 v4, 0x42700000 # 60.0f */
com.a.a.a .b ( v4 );
v4 = (( java.lang.Float ) v4 ).floatValue ( ); // invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F
/* add-float/2addr v3, v4 */
(( android.graphics.Canvas ) p1 ).clipRect ( v1, v2, v0, v3 ); // invoke-virtual {p1, v1, v2, v0, v3}, Landroid/graphics/Canvas;->clipRect(FFFF)Z
v0 = this.a;
v0 = this.O;
int v1 = 2; // const/4 v1, 0x2
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
v0 = this.O;
int v1 = 2; // const/4 v1, 0x2
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* mul-int/lit16 v1, v8, 0xb4 */
/* add-int/lit16 v1, v1, 0x91 */
/* int-to-float v1, v1 */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* mul-int/lit16 v2, v9, 0xa0 */
/* add-int/lit8 v2, v2, 0x64 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
com.a.a.a .b ( v2 );
v2 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const v5, 0x40a66666 # 5.2f */
/* const/high16 v6, 0x40800000 # 4.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
(( android.graphics.Canvas ) p1 ).restore ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
/* add-int/lit8 v0, v8, 0x1 */
/* move v8, v0 */
/* goto/16 :goto_4 */
} // .end method
public void b ( android.graphics.Canvas p0, android.graphics.Paint p1 ) {
/* .locals 8 */
v0 = com.a.e.g.e;
/* aget v0, v0, v1 */
int v1 = 1; // const/4 v1, 0x1
/* if-ge v0, v1, :cond_0 */
v0 = this.a;
v0 = this.O;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
v0 = this.O;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* const/high16 v1, 0x430c0000 # 140.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x42c80000 # 100.0f */
com.a.a.a .b ( v2 );
v2 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x40a00000 # 5.0f */
/* const/high16 v6, 0x40800000 # 4.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.a;
v7 = this.K;
v0 = this.a;
v0 = this.K;
/* const/high16 v1, 0x430c0000 # 140.0f */
com.a.a.a .a ( v1 );
v2 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
v1 = this.a;
v1 = this.O;
int v3 = 1; // const/4 v3, 0x1
(( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
/* const/high16 v3, 0x40a00000 # 5.0f */
v1 = com.a.a.a .a ( v1,v3 );
/* const/high16 v3, 0x40000000 # 2.0f */
/* div-float/2addr v1, v3 */
v3 = this.a;
v3 = this.K;
/* const/high16 v4, 0x41200000 # 10.0f */
v3 = com.a.a.a .a ( v3,v4 );
/* const/high16 v4, 0x40000000 # 2.0f */
/* div-float/2addr v3, v4 */
/* sub-float/2addr v1, v3 */
/* add-float/2addr v1, v2 */
/* const/high16 v2, 0x42c80000 # 100.0f */
com.a.a.a .b ( v2 );
v3 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
v2 = this.a;
v2 = this.O;
int v4 = 1; // const/4 v4, 0x1
(( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
/* const/high16 v4, 0x40a00000 # 5.0f */
v2 = com.a.a.a .b ( v2,v4 );
/* const/high16 v4, 0x40000000 # 2.0f */
/* div-float/2addr v2, v4 */
v4 = this.a;
v4 = this.K;
/* const/high16 v5, 0x41200000 # 10.0f */
v4 = com.a.a.a .b ( v4,v5 );
/* const/high16 v5, 0x40000000 # 2.0f */
/* div-float/2addr v4, v5 */
/* sub-float/2addr v2, v4 */
/* add-float/2addr v2, v3 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x41200000 # 10.0f */
/* const/high16 v6, 0x40800000 # 4.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_0
v0 = com.a.e.g.e;
/* aget v0, v0, v1 */
int v1 = 2; // const/4 v1, 0x2
/* if-ge v0, v1, :cond_1 */
v0 = this.a;
v0 = this.O;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
v0 = this.O;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* const/high16 v1, 0x43a00000 # 320.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x42c80000 # 100.0f */
com.a.a.a .b ( v2 );
v2 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x40a00000 # 5.0f */
/* const/high16 v6, 0x40800000 # 4.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.a;
v7 = this.K;
v0 = this.a;
v0 = this.K;
/* const/high16 v1, 0x43a00000 # 320.0f */
com.a.a.a .a ( v1 );
v2 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
v1 = this.a;
v1 = this.O;
int v3 = 1; // const/4 v3, 0x1
(( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
/* const/high16 v3, 0x40a00000 # 5.0f */
v1 = com.a.a.a .a ( v1,v3 );
/* const/high16 v3, 0x40000000 # 2.0f */
/* div-float/2addr v1, v3 */
v3 = this.a;
v3 = this.K;
/* const/high16 v4, 0x41200000 # 10.0f */
v3 = com.a.a.a .a ( v3,v4 );
/* const/high16 v4, 0x40000000 # 2.0f */
/* div-float/2addr v3, v4 */
/* sub-float/2addr v1, v3 */
/* add-float/2addr v1, v2 */
/* const/high16 v2, 0x42c80000 # 100.0f */
com.a.a.a .b ( v2 );
v3 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
v2 = this.a;
v2 = this.O;
int v4 = 1; // const/4 v4, 0x1
(( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
/* const/high16 v4, 0x40a00000 # 5.0f */
v2 = com.a.a.a .b ( v2,v4 );
/* const/high16 v4, 0x40000000 # 2.0f */
/* div-float/2addr v2, v4 */
v4 = this.a;
v4 = this.K;
/* const/high16 v5, 0x41200000 # 10.0f */
v4 = com.a.a.a .b ( v4,v5 );
/* const/high16 v5, 0x40000000 # 2.0f */
/* div-float/2addr v4, v5 */
/* sub-float/2addr v2, v4 */
/* add-float/2addr v2, v3 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x41200000 # 10.0f */
/* const/high16 v6, 0x40800000 # 4.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_1
v0 = com.a.e.g.e;
/* aget v0, v0, v1 */
int v1 = 3; // const/4 v1, 0x3
/* if-ge v0, v1, :cond_2 */
v0 = this.a;
v0 = this.O;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
v0 = this.O;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* const/high16 v1, 0x43fa0000 # 500.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x42c80000 # 100.0f */
com.a.a.a .b ( v2 );
v2 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x40a00000 # 5.0f */
/* const/high16 v6, 0x40800000 # 4.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.a;
v7 = this.K;
v0 = this.a;
v0 = this.K;
/* const/high16 v1, 0x43fa0000 # 500.0f */
com.a.a.a .a ( v1 );
v2 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
v1 = this.a;
v1 = this.O;
int v3 = 1; // const/4 v3, 0x1
(( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
/* const/high16 v3, 0x40a00000 # 5.0f */
v1 = com.a.a.a .a ( v1,v3 );
/* const/high16 v3, 0x40000000 # 2.0f */
/* div-float/2addr v1, v3 */
v3 = this.a;
v3 = this.K;
/* const/high16 v4, 0x41200000 # 10.0f */
v3 = com.a.a.a .a ( v3,v4 );
/* const/high16 v4, 0x40000000 # 2.0f */
/* div-float/2addr v3, v4 */
/* sub-float/2addr v1, v3 */
/* add-float/2addr v1, v2 */
/* const/high16 v2, 0x42c80000 # 100.0f */
com.a.a.a .b ( v2 );
v3 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
v2 = this.a;
v2 = this.O;
int v4 = 1; // const/4 v4, 0x1
(( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
/* const/high16 v4, 0x40a00000 # 5.0f */
v2 = com.a.a.a .b ( v2,v4 );
/* const/high16 v4, 0x40000000 # 2.0f */
/* div-float/2addr v2, v4 */
v4 = this.a;
v4 = this.K;
/* const/high16 v5, 0x41200000 # 10.0f */
v4 = com.a.a.a .b ( v4,v5 );
/* const/high16 v5, 0x40000000 # 2.0f */
/* div-float/2addr v4, v5 */
/* sub-float/2addr v2, v4 */
/* add-float/2addr v2, v3 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x41200000 # 10.0f */
/* const/high16 v6, 0x40800000 # 4.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_2
v0 = com.a.e.g.e;
/* aget v0, v0, v1 */
int v1 = 4; // const/4 v1, 0x4
/* if-ge v0, v1, :cond_3 */
v0 = this.a;
v0 = this.O;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
v0 = this.O;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* const/high16 v1, 0x430c0000 # 140.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x43820000 # 260.0f */
com.a.a.a .b ( v2 );
v2 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x40a00000 # 5.0f */
/* const/high16 v6, 0x40800000 # 4.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.a;
v7 = this.K;
v0 = this.a;
v0 = this.K;
/* const/high16 v1, 0x430c0000 # 140.0f */
com.a.a.a .a ( v1 );
v2 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
v1 = this.a;
v1 = this.O;
int v3 = 1; // const/4 v3, 0x1
(( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
/* const/high16 v3, 0x40a00000 # 5.0f */
v1 = com.a.a.a .a ( v1,v3 );
/* const/high16 v3, 0x40000000 # 2.0f */
/* div-float/2addr v1, v3 */
v3 = this.a;
v3 = this.K;
/* const/high16 v4, 0x41200000 # 10.0f */
v3 = com.a.a.a .a ( v3,v4 );
/* const/high16 v4, 0x40000000 # 2.0f */
/* div-float/2addr v3, v4 */
/* sub-float/2addr v1, v3 */
/* add-float/2addr v1, v2 */
/* const/high16 v2, 0x43820000 # 260.0f */
com.a.a.a .b ( v2 );
v3 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
v2 = this.a;
v2 = this.O;
int v4 = 1; // const/4 v4, 0x1
(( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
/* const/high16 v4, 0x40a00000 # 5.0f */
v2 = com.a.a.a .b ( v2,v4 );
/* const/high16 v4, 0x40000000 # 2.0f */
/* div-float/2addr v2, v4 */
v4 = this.a;
v4 = this.K;
/* const/high16 v5, 0x41200000 # 10.0f */
v4 = com.a.a.a .b ( v4,v5 );
/* const/high16 v5, 0x40000000 # 2.0f */
/* div-float/2addr v4, v5 */
/* sub-float/2addr v2, v4 */
/* add-float/2addr v2, v3 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x41200000 # 10.0f */
/* const/high16 v6, 0x40800000 # 4.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_3
v0 = com.a.e.g.e;
/* aget v0, v0, v1 */
int v1 = 5; // const/4 v1, 0x5
/* if-ge v0, v1, :cond_4 */
v0 = this.a;
v0 = this.O;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
v0 = this.O;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* const/high16 v1, 0x43a00000 # 320.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x43820000 # 260.0f */
com.a.a.a .b ( v2 );
v2 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x40a00000 # 5.0f */
/* const/high16 v6, 0x40800000 # 4.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.a;
v7 = this.K;
v0 = this.a;
v0 = this.K;
/* const/high16 v1, 0x43a00000 # 320.0f */
com.a.a.a .a ( v1 );
v2 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
v1 = this.a;
v1 = this.O;
int v3 = 1; // const/4 v3, 0x1
(( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
/* const/high16 v3, 0x40a00000 # 5.0f */
v1 = com.a.a.a .a ( v1,v3 );
/* const/high16 v3, 0x40000000 # 2.0f */
/* div-float/2addr v1, v3 */
v3 = this.a;
v3 = this.K;
/* const/high16 v4, 0x41200000 # 10.0f */
v3 = com.a.a.a .a ( v3,v4 );
/* const/high16 v4, 0x40000000 # 2.0f */
/* div-float/2addr v3, v4 */
/* sub-float/2addr v1, v3 */
/* add-float/2addr v1, v2 */
/* const/high16 v2, 0x43820000 # 260.0f */
com.a.a.a .b ( v2 );
v3 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
v2 = this.a;
v2 = this.O;
int v4 = 1; // const/4 v4, 0x1
(( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
/* const/high16 v4, 0x40a00000 # 5.0f */
v2 = com.a.a.a .b ( v2,v4 );
/* const/high16 v4, 0x40000000 # 2.0f */
/* div-float/2addr v2, v4 */
v4 = this.a;
v4 = this.K;
/* const/high16 v5, 0x41200000 # 10.0f */
v4 = com.a.a.a .b ( v4,v5 );
/* const/high16 v5, 0x40000000 # 2.0f */
/* div-float/2addr v4, v5 */
/* sub-float/2addr v2, v4 */
/* add-float/2addr v2, v3 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x41200000 # 10.0f */
/* const/high16 v6, 0x40800000 # 4.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_4
v0 = com.a.e.g.e;
/* aget v0, v0, v1 */
int v1 = 6; // const/4 v1, 0x6
/* if-ge v0, v1, :cond_5 */
v0 = this.a;
v0 = this.O;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
v0 = this.O;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* const/high16 v1, 0x43fa0000 # 500.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x43820000 # 260.0f */
com.a.a.a .b ( v2 );
v2 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x40a00000 # 5.0f */
/* const/high16 v6, 0x40800000 # 4.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.a;
v7 = this.K;
v0 = this.a;
v0 = this.K;
/* const/high16 v1, 0x43fa0000 # 500.0f */
com.a.a.a .a ( v1 );
v2 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
v1 = this.a;
v1 = this.O;
int v3 = 1; // const/4 v3, 0x1
(( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
/* const/high16 v3, 0x40a00000 # 5.0f */
v1 = com.a.a.a .a ( v1,v3 );
/* const/high16 v3, 0x40000000 # 2.0f */
/* div-float/2addr v1, v3 */
v3 = this.a;
v3 = this.K;
/* const/high16 v4, 0x41200000 # 10.0f */
v3 = com.a.a.a .a ( v3,v4 );
/* const/high16 v4, 0x40000000 # 2.0f */
/* div-float/2addr v3, v4 */
/* sub-float/2addr v1, v3 */
/* add-float/2addr v1, v2 */
/* const/high16 v2, 0x43820000 # 260.0f */
com.a.a.a .b ( v2 );
v3 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
v2 = this.a;
v2 = this.O;
int v4 = 1; // const/4 v4, 0x1
(( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
/* const/high16 v4, 0x40a00000 # 5.0f */
v2 = com.a.a.a .b ( v2,v4 );
/* const/high16 v4, 0x40000000 # 2.0f */
/* div-float/2addr v2, v4 */
v4 = this.a;
v4 = this.K;
/* const/high16 v5, 0x41200000 # 10.0f */
v4 = com.a.a.a .b ( v4,v5 );
/* const/high16 v5, 0x40000000 # 2.0f */
/* div-float/2addr v4, v5 */
/* sub-float/2addr v2, v4 */
/* add-float/2addr v2, v3 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x41200000 # 10.0f */
/* const/high16 v6, 0x40800000 # 4.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_5
return;
} // .end method
public void c ( android.graphics.Canvas p0, android.graphics.Paint p1 ) {
/* .locals 11 */
/* const/high16 v10, 0x41600000 # 14.0f */
/* const/high16 v9, 0x40a00000 # 5.0f */
int v8 = 0; // const/4 v8, 0x0
/* const/high16 v6, 0x41000000 # 8.0f */
int v3 = 0; // const/4 v3, 0x0
v0 = com.a.e.g.g;
/* aget-object v0, v0, v1 */
/* aget v0, v0, v8 */
/* if-lez v0, :cond_0 */
v0 = this.a;
v7 = this.Q;
v0 = this.a;
v0 = this.Q;
/* const/high16 v1, 0x43270000 # 167.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x42c80000 # 100.0f */
com.a.a.a .b ( v2 );
v4 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
v2 = this.a;
v2 = this.O;
(( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
v2 = com.a.a.a .b ( v2,v9 );
/* div-float/2addr v2, v10 */
/* mul-float/2addr v2, v6 */
/* add-float/2addr v2, v4 */
/* const/high16 v5, 0x41b80000 # 23.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_0
v0 = com.a.e.g.g;
/* aget-object v0, v0, v1 */
/* aget v0, v0, v8 */
int v1 = 1; // const/4 v1, 0x1
/* if-le v0, v1, :cond_1 */
v0 = this.a;
v7 = this.Q;
v0 = this.a;
v0 = this.Q;
/* const/high16 v1, 0x434b0000 # 203.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x42c80000 # 100.0f */
com.a.a.a .b ( v2 );
v4 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
v2 = this.a;
v2 = this.O;
(( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
v2 = com.a.a.a .b ( v2,v9 );
/* div-float/2addr v2, v10 */
/* mul-float/2addr v2, v6 */
/* add-float/2addr v2, v4 */
/* const/high16 v5, 0x41b80000 # 23.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_1
v0 = com.a.e.g.g;
/* aget-object v0, v0, v1 */
/* aget v0, v0, v8 */
int v1 = 2; // const/4 v1, 0x2
/* if-le v0, v1, :cond_2 */
v0 = this.a;
v7 = this.Q;
v0 = this.a;
v0 = this.Q;
/* const/high16 v1, 0x436f0000 # 239.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x42c80000 # 100.0f */
com.a.a.a .b ( v2 );
v4 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
v2 = this.a;
v2 = this.O;
(( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
v2 = com.a.a.a .b ( v2,v9 );
/* div-float/2addr v2, v10 */
/* mul-float/2addr v2, v6 */
/* add-float/2addr v2, v4 */
/* const/high16 v5, 0x41b80000 # 23.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_2
v0 = com.a.e.g.g;
/* aget-object v0, v0, v1 */
int v1 = 1; // const/4 v1, 0x1
/* aget v0, v0, v1 */
/* if-lez v0, :cond_3 */
v0 = this.a;
v7 = this.Q;
v0 = this.a;
v0 = this.Q;
/* const v1, 0x43ad8000 # 347.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x42c80000 # 100.0f */
com.a.a.a .b ( v2 );
v4 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
v2 = this.a;
v2 = this.O;
(( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
v2 = com.a.a.a .b ( v2,v9 );
/* div-float/2addr v2, v10 */
/* mul-float/2addr v2, v6 */
/* add-float/2addr v2, v4 */
/* const/high16 v5, 0x41b80000 # 23.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_3
v0 = com.a.e.g.g;
/* aget-object v0, v0, v1 */
int v1 = 1; // const/4 v1, 0x1
/* aget v0, v0, v1 */
int v1 = 1; // const/4 v1, 0x1
/* if-le v0, v1, :cond_4 */
v0 = this.a;
v7 = this.Q;
v0 = this.a;
v0 = this.Q;
/* const v1, 0x43bf8000 # 383.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x42c80000 # 100.0f */
com.a.a.a .b ( v2 );
v4 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
v2 = this.a;
v2 = this.O;
(( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
v2 = com.a.a.a .b ( v2,v9 );
/* div-float/2addr v2, v10 */
/* mul-float/2addr v2, v6 */
/* add-float/2addr v2, v4 */
/* const/high16 v5, 0x41b80000 # 23.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_4
v0 = com.a.e.g.g;
/* aget-object v0, v0, v1 */
int v1 = 1; // const/4 v1, 0x1
/* aget v0, v0, v1 */
int v1 = 2; // const/4 v1, 0x2
/* if-le v0, v1, :cond_5 */
v0 = this.a;
v7 = this.Q;
v0 = this.a;
v0 = this.Q;
/* const v1, 0x43d18000 # 419.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x42c80000 # 100.0f */
com.a.a.a .b ( v2 );
v4 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
v2 = this.a;
v2 = this.O;
(( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
v2 = com.a.a.a .b ( v2,v9 );
/* div-float/2addr v2, v10 */
/* mul-float/2addr v2, v6 */
/* add-float/2addr v2, v4 */
/* const/high16 v5, 0x41b80000 # 23.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_5
v0 = com.a.e.g.g;
/* aget-object v0, v0, v1 */
int v1 = 2; // const/4 v1, 0x2
/* aget v0, v0, v1 */
/* if-lez v0, :cond_6 */
v0 = this.a;
v7 = this.Q;
v0 = this.a;
v0 = this.Q;
/* const v1, 0x4403c000 # 527.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x42c80000 # 100.0f */
com.a.a.a .b ( v2 );
v4 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
v2 = this.a;
v2 = this.O;
(( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
v2 = com.a.a.a .b ( v2,v9 );
/* div-float/2addr v2, v10 */
/* mul-float/2addr v2, v6 */
/* add-float/2addr v2, v4 */
/* const/high16 v5, 0x41b80000 # 23.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_6
v0 = com.a.e.g.g;
/* aget-object v0, v0, v1 */
int v1 = 2; // const/4 v1, 0x2
/* aget v0, v0, v1 */
int v1 = 1; // const/4 v1, 0x1
/* if-le v0, v1, :cond_7 */
v0 = this.a;
v7 = this.Q;
v0 = this.a;
v0 = this.Q;
/* const v1, 0x440cc000 # 563.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x42c80000 # 100.0f */
com.a.a.a .b ( v2 );
v4 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
v2 = this.a;
v2 = this.O;
(( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
v2 = com.a.a.a .b ( v2,v9 );
/* div-float/2addr v2, v10 */
/* mul-float/2addr v2, v6 */
/* add-float/2addr v2, v4 */
/* const/high16 v5, 0x41b80000 # 23.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_7
v0 = com.a.e.g.g;
/* aget-object v0, v0, v1 */
int v1 = 2; // const/4 v1, 0x2
/* aget v0, v0, v1 */
int v1 = 2; // const/4 v1, 0x2
/* if-le v0, v1, :cond_8 */
v0 = this.a;
v7 = this.Q;
v0 = this.a;
v0 = this.Q;
/* const v1, 0x4415c000 # 599.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x42c80000 # 100.0f */
com.a.a.a .b ( v2 );
v4 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
v2 = this.a;
v2 = this.O;
(( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
v2 = com.a.a.a .b ( v2,v9 );
/* div-float/2addr v2, v10 */
/* mul-float/2addr v2, v6 */
/* add-float/2addr v2, v4 */
/* const/high16 v5, 0x41b80000 # 23.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_8
v0 = com.a.e.g.g;
/* aget-object v0, v0, v1 */
int v1 = 3; // const/4 v1, 0x3
/* aget v0, v0, v1 */
/* if-lez v0, :cond_9 */
v0 = this.a;
v7 = this.Q;
v0 = this.a;
v0 = this.Q;
/* const/high16 v1, 0x43270000 # 167.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x43820000 # 260.0f */
com.a.a.a .b ( v2 );
v4 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
v2 = this.a;
v2 = this.O;
(( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
v2 = com.a.a.a .b ( v2,v9 );
/* div-float/2addr v2, v10 */
/* mul-float/2addr v2, v6 */
/* add-float/2addr v2, v4 */
/* const/high16 v5, 0x41b80000 # 23.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_9
v0 = com.a.e.g.g;
/* aget-object v0, v0, v1 */
int v1 = 3; // const/4 v1, 0x3
/* aget v0, v0, v1 */
int v1 = 1; // const/4 v1, 0x1
/* if-le v0, v1, :cond_a */
v0 = this.a;
v7 = this.Q;
v0 = this.a;
v0 = this.Q;
/* const/high16 v1, 0x434b0000 # 203.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x43820000 # 260.0f */
com.a.a.a .b ( v2 );
v4 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
v2 = this.a;
v2 = this.O;
(( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
v2 = com.a.a.a .b ( v2,v9 );
/* div-float/2addr v2, v10 */
/* mul-float/2addr v2, v6 */
/* add-float/2addr v2, v4 */
/* const/high16 v5, 0x41b80000 # 23.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_a
v0 = com.a.e.g.g;
v1 = this.a;
/* iget v1, v1, Lcom/a/a/a;->D:I */
/* aget-object v0, v0, v1 */
int v1 = 3; // const/4 v1, 0x3
/* aget v0, v0, v1 */
int v1 = 2; // const/4 v1, 0x2
/* if-le v0, v1, :cond_b */
v0 = this.a;
v7 = this.Q;
v0 = this.a;
v0 = this.Q;
/* const/high16 v1, 0x436f0000 # 239.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x43820000 # 260.0f */
com.a.a.a .b ( v2 );
v4 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
v2 = this.a;
v2 = this.O;
(( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
v2 = com.a.a.a .b ( v2,v9 );
/* div-float/2addr v2, v10 */
/* mul-float/2addr v2, v6 */
/* add-float/2addr v2, v4 */
/* const/high16 v5, 0x41b80000 # 23.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_b
v0 = com.a.e.g.g;
/* aget-object v0, v0, v1 */
int v1 = 4; // const/4 v1, 0x4
/* aget v0, v0, v1 */
/* if-lez v0, :cond_c */
v0 = this.a;
v7 = this.Q;
v0 = this.a;
v0 = this.Q;
/* const v1, 0x43ad8000 # 347.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x43820000 # 260.0f */
com.a.a.a .b ( v2 );
v4 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
v2 = this.a;
v2 = this.O;
(( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
v2 = com.a.a.a .b ( v2,v9 );
/* div-float/2addr v2, v10 */
/* mul-float/2addr v2, v6 */
/* add-float/2addr v2, v4 */
/* const/high16 v5, 0x41b80000 # 23.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_c
v0 = com.a.e.g.g;
/* aget-object v0, v0, v1 */
int v1 = 4; // const/4 v1, 0x4
/* aget v0, v0, v1 */
int v1 = 1; // const/4 v1, 0x1
/* if-le v0, v1, :cond_d */
v0 = this.a;
v7 = this.Q;
v0 = this.a;
v0 = this.Q;
/* const v1, 0x43bf8000 # 383.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x43820000 # 260.0f */
com.a.a.a .b ( v2 );
v4 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
v2 = this.a;
v2 = this.O;
(( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
v2 = com.a.a.a .b ( v2,v9 );
/* div-float/2addr v2, v10 */
/* mul-float/2addr v2, v6 */
/* add-float/2addr v2, v4 */
/* const/high16 v5, 0x41b80000 # 23.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_d
v0 = com.a.e.g.g;
/* aget-object v0, v0, v1 */
int v1 = 4; // const/4 v1, 0x4
/* aget v0, v0, v1 */
int v1 = 2; // const/4 v1, 0x2
/* if-le v0, v1, :cond_e */
v0 = this.a;
v7 = this.Q;
v0 = this.a;
v0 = this.Q;
/* const v1, 0x43d18000 # 419.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x43820000 # 260.0f */
com.a.a.a .b ( v2 );
v4 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
v2 = this.a;
v2 = this.O;
(( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
v2 = com.a.a.a .b ( v2,v9 );
/* div-float/2addr v2, v10 */
/* mul-float/2addr v2, v6 */
/* add-float/2addr v2, v4 */
/* const/high16 v5, 0x41b80000 # 23.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_e
v0 = com.a.e.g.g;
/* aget-object v0, v0, v1 */
int v1 = 5; // const/4 v1, 0x5
/* aget v0, v0, v1 */
/* if-lez v0, :cond_f */
v0 = this.a;
v7 = this.Q;
v0 = this.a;
v0 = this.Q;
/* const v1, 0x4403c000 # 527.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x43820000 # 260.0f */
com.a.a.a .b ( v2 );
v4 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
v2 = this.a;
v2 = this.O;
(( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
v2 = com.a.a.a .b ( v2,v9 );
/* div-float/2addr v2, v10 */
/* mul-float/2addr v2, v6 */
/* add-float/2addr v2, v4 */
/* const/high16 v5, 0x41b80000 # 23.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_f
v0 = com.a.e.g.g;
/* aget-object v0, v0, v1 */
int v1 = 5; // const/4 v1, 0x5
/* aget v0, v0, v1 */
int v1 = 1; // const/4 v1, 0x1
/* if-le v0, v1, :cond_10 */
v0 = this.a;
v7 = this.Q;
v0 = this.a;
v0 = this.Q;
/* const v1, 0x440cc000 # 563.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x43820000 # 260.0f */
com.a.a.a .b ( v2 );
v4 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
v2 = this.a;
v2 = this.O;
(( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
v2 = com.a.a.a .b ( v2,v9 );
/* div-float/2addr v2, v10 */
/* mul-float/2addr v2, v6 */
/* add-float/2addr v2, v4 */
/* const/high16 v5, 0x41b80000 # 23.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_10
v0 = com.a.e.g.g;
/* aget-object v0, v0, v1 */
int v1 = 5; // const/4 v1, 0x5
/* aget v0, v0, v1 */
int v1 = 2; // const/4 v1, 0x2
/* if-le v0, v1, :cond_11 */
v0 = this.a;
v7 = this.Q;
v0 = this.a;
v0 = this.Q;
/* const v1, 0x4415c000 # 599.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x43820000 # 260.0f */
com.a.a.a .b ( v2 );
v4 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
v2 = this.a;
v2 = this.O;
(( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
v2 = com.a.a.a .b ( v2,v9 );
/* div-float/2addr v2, v10 */
/* mul-float/2addr v2, v6 */
/* add-float/2addr v2, v4 */
/* const/high16 v5, 0x41b80000 # 23.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_11
return;
} // .end method

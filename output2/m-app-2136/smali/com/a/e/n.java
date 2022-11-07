public class com.a.e.n {
	 /* # static fields */
	 public static Boolean e;
	 public static Boolean f;
	 public static Integer h;
	 /* # instance fields */
	 com.a.a.a a;
	 com.a.e.i b;
	 com.a.c.d c;
	 com.a.c.d d;
	 public com.a.c.d g;
	 public com.a.b.a i;
	 android.graphics.Paint j;
	 public Boolean k;
	 /* # direct methods */
	 static com.a.e.n ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 com.a.e.n.e = (v0!= 0);
		 com.a.e.n.f = (v0!= 0);
		 return;
	 } // .end method
	 public com.a.e.n ( ) {
		 /* .locals 11 */
		 /* const/high16 v10, 0x43e10000 # 450.0f */
		 /* const/high16 v9, 0x41200000 # 10.0f */
		 /* const/high16 v8, 0x40000000 # 2.0f */
		 /* const/high16 v7, 0x3fc00000 # 1.5f */
		 int v6 = 0; // const/4 v6, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput-boolean v6, p0, Lcom/a/e/n;->k:Z */
		 this.a = p1;
		 this.b = p2;
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 this.j = v0;
		 v0 = this.j;
		 /* const v1, -0x777778 */
		 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
		 v0 = this.j;
		 /* int-to-float v1, v1 */
		 /* const/high16 v2, 0x41a00000 # 20.0f */
		 /* div-float/2addr v1, v2 */
		 (( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
		 v0 = this.j;
		 (( android.graphics.Paint ) v0 ).setStrokeWidth ( v9 ); // invoke-virtual {v0, v9}, Landroid/graphics/Paint;->setStrokeWidth(F)V
		 /* new-instance v0, Lcom/a/c/d; */
		 com.a.a.a .a ( v10 );
		 v1 = 		 (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
		 /* const/high16 v2, 0x43160000 # 150.0f */
		 com.a.a.a .b ( v2 );
		 v2 = 		 (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
		 /* div-int/lit8 v3, v3, 0x6 */
		 /* div-int/lit8 v4, v4, 0x8 */
		 int v5 = 1; // const/4 v5, 0x1
		 /* invoke-direct/range {v0 ..v5}, Lcom/a/c/d;-><init>(FFIII)V */
		 this.d = v0;
		 /* new-instance v0, Lcom/a/c/d; */
		 com.a.a.a .a ( v10 );
		 v1 = 		 (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
		 /* const/high16 v2, 0x43700000 # 240.0f */
		 com.a.a.a .b ( v2 );
		 v2 = 		 (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
		 /* div-int/lit8 v3, v3, 0x6 */
		 /* div-int/lit8 v4, v4, 0x8 */
		 int v5 = 2; // const/4 v5, 0x2
		 /* invoke-direct/range {v0 ..v5}, Lcom/a/c/d;-><init>(FFIII)V */
		 this.c = v0;
		 /* new-instance v0, Lcom/a/c/d; */
		 /* int-to-float v2, v1 */
		 v1 = this.a;
		 v1 = this.H;
		 (( java.util.ArrayList ) v1 ).get ( v6 ); // invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 v1 = 		 com.a.a.a .a ( v1,v7 );
		 /* add-float/2addr v1, v2 */
		 /* div-float/2addr v1, v8 */
		 v2 = this.a;
		 v2 = this.G;
		 v2 = 		 com.a.a.a .a ( v2,v9 );
		 /* sub-float/2addr v1, v2 */
		 /* int-to-float v3, v2 */
		 v2 = this.a;
		 v2 = this.H;
		 (( java.util.ArrayList ) v2 ).get ( v6 ); // invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v2, Landroid/graphics/Bitmap; */
		 v2 = 		 com.a.a.a .b ( v2,v7 );
		 /* sub-float v2, v3, v2 */
		 /* div-float/2addr v2, v8 */
		 /* div-int/lit8 v3, v3, 0xa */
		 /* div-int/lit8 v4, v4, 0x7 */
		 int v5 = 3; // const/4 v5, 0x3
		 /* invoke-direct/range {v0 ..v5}, Lcom/a/c/d;-><init>(FFIII)V */
		 this.g = v0;
		 /* sget-boolean v0, Lcom/a/d/a;->a:Z */
		 com.a.e.n.e = (v0!= 0);
		 v0 = this.b;
		 v0 = this.s;
		 /* iget-boolean v0, v0, Lcom/a/d/d;->a:Z */
		 com.a.e.n.f = (v0!= 0);
		 v0 = this.A;
		 this.i = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.graphics.Canvas p0, android.graphics.Paint p1 ) {
		 /* .locals 11 */
		 int v10 = 1; // const/4 v10, 0x1
		 /* const/high16 v9, 0x40000000 # 2.0f */
		 /* const/high16 v5, 0x3fc00000 # 1.5f */
		 int v8 = 0; // const/4 v8, 0x0
		 int v3 = 0; // const/4 v3, 0x0
		 v0 = this.a;
		 v0 = this.H;
		 (( java.util.ArrayList ) v0 ).get ( v8 ); // invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* move-object v7, v0 */
		 /* check-cast v7, Landroid/graphics/Bitmap; */
		 v0 = this.a;
		 v0 = this.H;
		 (( java.util.ArrayList ) v0 ).get ( v8 ); // invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 /* int-to-float v2, v1 */
		 v1 = this.a;
		 v1 = this.H;
		 (( java.util.ArrayList ) v1 ).get ( v8 ); // invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 v1 = 		 com.a.a.a .a ( v1,v5 );
		 /* sub-float v1, v2, v1 */
		 /* div-float/2addr v1, v9 */
		 /* int-to-float v4, v2 */
		 v2 = this.a;
		 v2 = this.H;
		 (( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v2, Landroid/graphics/Bitmap; */
		 v2 = 		 com.a.a.a .b ( v2,v5 );
		 /* sub-float v2, v4, v2 */
		 /* div-float/2addr v2, v9 */
		 /* const/high16 v6, 0x3f800000 # 1.0f */
		 /* move v4, v3 */
		 /* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
		 (( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
		 final String v0 = "\u80cc\u666f\u97f3\u4e50\uff1a"; // const-string v0, "\u80cc\u666f\u97f3\u4e50\uff1a"
		 /* const/high16 v1, 0x43340000 # 180.0f */
		 com.a.a.a .a ( v1 );
		 v1 = 		 (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
		 /* const/high16 v2, 0x43520000 # 210.0f */
		 com.a.a.a .b ( v2 );
		 v2 = 		 (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
		 v4 = this.j;
		 (( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v4 ); // invoke-virtual {p1, v0, v1, v2, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
		 final String v0 = "\u6e38\u620f\u97f3\u6548\uff1a"; // const-string v0, "\u6e38\u620f\u97f3\u6548\uff1a"
		 /* const/high16 v1, 0x43340000 # 180.0f */
		 com.a.a.a .a ( v1 );
		 v1 = 		 (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
		 /* const/high16 v2, 0x43960000 # 300.0f */
		 com.a.a.a .b ( v2 );
		 v2 = 		 (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
		 v4 = this.j;
		 (( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v4 ); // invoke-virtual {p1, v0, v1, v2, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
		 /* if-eq v0, v10, :cond_0 */
		 v0 = this.a;
		 v7 = this.G;
		 v0 = this.a;
		 v0 = this.G;
		 /* int-to-float v2, v1 */
		 v1 = this.a;
		 v1 = this.H;
		 (( java.util.ArrayList ) v1 ).get ( v8 ); // invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 v1 = 		 com.a.a.a .a ( v1,v5 );
		 /* add-float/2addr v1, v2 */
		 /* div-float/2addr v1, v9 */
		 v2 = this.a;
		 v2 = this.G;
		 /* const/high16 v4, 0x41200000 # 10.0f */
		 v2 = 		 com.a.a.a .a ( v2,v4 );
		 /* sub-float/2addr v1, v2 */
		 /* int-to-float v4, v2 */
		 v2 = this.a;
		 v2 = this.H;
		 (( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v2, Landroid/graphics/Bitmap; */
		 v2 = 		 com.a.a.a .b ( v2,v5 );
		 /* sub-float v2, v4, v2 */
		 /* div-float/2addr v2, v9 */
		 /* const/high16 v5, 0x41200000 # 10.0f */
		 /* const/high16 v6, 0x40e00000 # 7.0f */
		 /* move v4, v3 */
		 /* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
		 (( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
	 } // :goto_0
	 /* sget-boolean v0, Lcom/a/d/a;->a:Z */
	 /* if-nez v0, :cond_1 */
	 v0 = this.a;
	 v0 = this.H;
	 (( java.util.ArrayList ) v0 ).get ( v10 ); // invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* move-object v7, v0 */
	 /* check-cast v7, Landroid/graphics/Bitmap; */
	 v0 = this.a;
	 v0 = this.H;
	 (( java.util.ArrayList ) v0 ).get ( v10 ); // invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v0, Landroid/graphics/Bitmap; */
	 /* const/high16 v1, 0x43e10000 # 450.0f */
	 com.a.a.a .a ( v1 );
	 v1 = 	 (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
	 /* const/high16 v2, 0x432a0000 # 170.0f */
	 com.a.a.a .b ( v2 );
	 v2 = 	 (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
	 /* const/high16 v5, 0x40c00000 # 6.0f */
	 /* const/high16 v6, 0x41000000 # 8.0f */
	 /* move v4, v3 */
	 /* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->b(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
	 (( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :goto_1
v0 = this.b;
v0 = this.s;
/* iget-boolean v0, v0, Lcom/a/d/d;->a:Z */
/* if-nez v0, :cond_2 */
v0 = this.a;
v0 = this.H;
(( java.util.ArrayList ) v0 ).get ( v10 ); // invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
v0 = this.H;
(( java.util.ArrayList ) v0 ).get ( v10 ); // invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* const/high16 v1, 0x43e10000 # 450.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x43820000 # 260.0f */
com.a.a.a .b ( v2 );
v2 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
/* const/high16 v5, 0x40c00000 # 6.0f */
/* const/high16 v6, 0x41000000 # 8.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->b(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :goto_2
return;
} // :cond_0
v0 = this.a;
v7 = this.G;
v0 = this.a;
v0 = this.G;
/* int-to-float v2, v1 */
v1 = this.a;
v1 = this.H;
(( java.util.ArrayList ) v1 ).get ( v8 ); // invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
v1 = com.a.a.a .a ( v1,v5 );
/* add-float/2addr v1, v2 */
/* div-float/2addr v1, v9 */
v2 = this.a;
v2 = this.G;
/* const/high16 v4, 0x41200000 # 10.0f */
v2 = com.a.a.a .a ( v2,v4 );
/* sub-float/2addr v1, v2 */
/* const/high16 v2, 0x41200000 # 10.0f */
com.a.a.a .a ( v2 );
v2 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
/* sub-float/2addr v1, v2 */
/* int-to-float v4, v2 */
v2 = this.a;
v2 = this.H;
(( java.util.ArrayList ) v2 ).get ( v8 ); // invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
v2 = com.a.a.a .b ( v2,v5 );
/* sub-float v2, v4, v2 */
/* div-float/2addr v2, v9 */
/* const/high16 v4, 0x41200000 # 10.0f */
com.a.a.a .b ( v4 );
v4 = (( java.lang.Float ) v4 ).floatValue ( ); // invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F
/* add-float/2addr v2, v4 */
/* const/high16 v5, 0x41280000 # 10.5f */
/* const/high16 v6, 0x41000000 # 8.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
/* goto/16 :goto_0 */
} // :cond_1
v0 = this.a;
v0 = this.H;
int v1 = 2; // const/4 v1, 0x2
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
v0 = this.H;
(( java.util.ArrayList ) v0 ).get ( v10 ); // invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* const/high16 v1, 0x43e10000 # 450.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x432a0000 # 170.0f */
com.a.a.a .b ( v2 );
v2 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
/* const/high16 v5, 0x40c00000 # 6.0f */
/* const/high16 v6, 0x41000000 # 8.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->b(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
/* goto/16 :goto_1 */
} // :cond_2
v0 = this.a;
v0 = this.H;
int v1 = 2; // const/4 v1, 0x2
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
v0 = this.H;
int v1 = 2; // const/4 v1, 0x2
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* const/high16 v1, 0x43e10000 # 450.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x43820000 # 260.0f */
com.a.a.a .b ( v2 );
v2 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
/* const/high16 v5, 0x40c00000 # 6.0f */
/* const/high16 v6, 0x41000000 # 8.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->b(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
/* goto/16 :goto_2 */
} // .end method

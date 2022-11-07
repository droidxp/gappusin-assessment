public class com.a.c.b {
	 /* # static fields */
	 public static Float c;
	 public static Float d;
	 public static java.util.ArrayList f;
	 public static Float j;
	 public static Float k;
	 public static java.util.ArrayList s;
	 public static java.util.ArrayList t;
	 public static java.util.ArrayList u;
	 /* # instance fields */
	 public Float a;
	 public Float b;
	 public Float e;
	 public Float g;
	 public Integer h;
	 android.graphics.Bitmap i;
	 public Boolean l;
	 com.a.d.f m;
	 Boolean n;
	 com.a.c.a o;
	 Boolean p;
	 Integer q;
	 public Boolean r;
	 public Float v;
	 public Float w;
	 /* # direct methods */
	 public com.a.c.b ( ) {
		 /* .locals 5 */
		 int v3 = 1; // const/4 v3, 0x1
		 int v4 = 0; // const/4 v4, 0x0
		 /* const/high16 v1, 0x41c80000 # 25.0f */
		 /* const/high16 v2, 0x41700000 # 15.0f */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Lcom/a/d/f; */
		 /* invoke-direct {v0}, Lcom/a/d/f;-><init>()V */
		 this.m = v0;
		 /* iput-boolean v4, p0, Lcom/a/c/b;->n:Z */
		 /* iput v4, p0, Lcom/a/c/b;->q:I */
		 /* iput-boolean p7, p0, Lcom/a/c/b;->n:Z */
		 /* iput-boolean v3, p0, Lcom/a/c/b;->r:Z */
		 /* sget-boolean v0, Lcom/a/c/n;->H:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 v0 = this.f;
			 (( java.util.ArrayList ) v0 ).get ( p6 ); // invoke-virtual {v0, p6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
			 /* check-cast v0, Landroid/graphics/Bitmap; */
			 this.i = v0;
		 } // :goto_0
		 /* iput p8, p0, Lcom/a/c/b;->v:F */
		 /* iput p9, p0, Lcom/a/c/b;->w:F */
		 /* int-to-float v0, p5 */
		 com.a.a.a .a ( v0 );
		 v0 = 		 (( java.lang.Float ) v0 ).floatValue ( ); // invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
		 /* iput v0, p0, Lcom/a/c/b;->g:F */
		 int v0 = 0; // const/4 v0, 0x0
		 /* if-nez p6, :cond_3 */
		 /* move v0, v1 */
	 } // :cond_0
} // :goto_1
v1 = this.i;
v1 = com.a.a.a .a ( v1,v0 );
v1 = this.i;
v0 = com.a.a.a .b ( v1,v0 );
/* iput p2, p0, Lcom/a/c/b;->a:F */
/* iput p3, p0, Lcom/a/c/b;->b:F */
/* int-to-float v0, v0 */
/* sub-float/2addr v0, p3 */
/* iput p4, p0, Lcom/a/c/b;->e:F */
v0 = com.a.c.b.f;
java.lang.Float .valueOf ( p4 );
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* iput p6, p0, Lcom/a/c/b;->h:I */
/* iget v0, p0, Lcom/a/c/b;->e:F */
/* float-to-double v0, v0 */
/* const-wide v2, 0x3f91df46a2529d39L # 0.017453292519943295 */
/* mul-double/2addr v0, v2 */
java.lang.Math .cos ( v0,v1 );
/* move-result-wide v2 */
/* double-to-float v2, v2 */
java.lang.Math .sin ( v0,v1 );
/* move-result-wide v0 */
/* double-to-float v0, v0 */
if ( p7 != null) { // if-eqz p7, :cond_1
	 v0 = com.a.c.b.s;
	 java.lang.Float .valueOf ( v1 );
	 (( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
	 v0 = com.a.c.b.t;
	 java.lang.Float .valueOf ( v1 );
	 (( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
	 v0 = com.a.c.b.u;
	 /* iget v1, p0, Lcom/a/c/b;->e:F */
	 java.lang.Float .valueOf ( v1 );
	 (( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_1
/* iput-boolean v4, p0, Lcom/a/c/b;->l:Z */
return;
} // :cond_2
v0 = this.e;
(( java.util.ArrayList ) v0 ).get ( p6 ); // invoke-virtual {v0, p6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
this.i = v0;
/* goto/16 :goto_0 */
} // :cond_3
/* if-ne p6, v3, :cond_4 */
/* move v0, v1 */
} // :cond_4
int v3 = 2; // const/4 v3, 0x2
/* if-ne p6, v3, :cond_5 */
/* move v0, v2 */
} // :cond_5
int v3 = 3; // const/4 v3, 0x3
/* if-ne p6, v3, :cond_6 */
/* move v0, v2 */
} // :cond_6
int v3 = 4; // const/4 v3, 0x4
/* if-ne p6, v3, :cond_7 */
/* move v0, v2 */
/* goto/16 :goto_1 */
} // :cond_7
int v2 = 5; // const/4 v2, 0x5
/* if-ne p6, v2, :cond_0 */
/* move v0, v1 */
/* goto/16 :goto_1 */
} // .end method
public static Double a ( Float p0, Float p1 ) {
/* .locals 6 */
int v1 = 0; // const/4 v1, 0x0
/* const-wide v4, 0x4066800000000000L # 180.0 */
/* const-wide v2, 0x40091eb851eb851fL # 3.14 */
/* div-int/lit8 v0, v0, 0x2 */
/* int-to-float v0, v0 */
/* cmpg-float v0, p0, v0 */
/* if-gez v0, :cond_0 */
/* cmpl-float v0, p0, v1 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* div-int/lit8 v0, v0, 0x2 */
/* int-to-float v0, v0 */
/* sub-float/2addr v0, p0 */
/* int-to-float v1, v1 */
/* sub-float/2addr v1, p1 */
/* div-float/2addr v0, v1 */
/* float-to-double v0, v0 */
java.lang.Math .atan ( v0,v1 );
/* move-result-wide v0 */
/* div-double/2addr v0, v2 */
/* mul-double/2addr v0, v4 */
/* neg-double v0, v0 */
} // :goto_0
/* return-wide v0 */
} // :cond_0
/* div-int/lit8 v0, v0, 0x2 */
/* int-to-float v0, v0 */
/* cmpl-float v0, p0, v0 */
/* if-lez v0, :cond_1 */
/* cmpl-float v0, p0, v1 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* div-int/lit8 v0, v0, 0x2 */
/* int-to-float v0, v0 */
/* sub-float/2addr v0, p0 */
/* int-to-float v1, v1 */
/* sub-float/2addr v1, p1 */
/* div-float/2addr v0, v1 */
/* float-to-double v0, v0 */
java.lang.Math .atan ( v0,v1 );
/* move-result-wide v0 */
/* div-double/2addr v0, v2 */
/* mul-double/2addr v0, v4 */
/* neg-double v0, v0 */
} // :cond_1
/* const-wide/16 v0, 0x0 */
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 3 */
/* iget-boolean v0, p0, Lcom/a/c/b;->n:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, p0, Lcom/a/c/b;->h:I */
/* iget v0, p0, Lcom/a/c/b;->a:F */
/* iget v2, p0, Lcom/a/c/b;->g:F */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lcom/a/c/b;->a:F */
/* iget v0, p0, Lcom/a/c/b;->b:F */
/* iget v2, p0, Lcom/a/c/b;->g:F */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lcom/a/c/b;->b:F */
} // :goto_0
return;
} // :cond_0
/* iget v0, p0, Lcom/a/c/b;->a:F */
/* iget v2, p0, Lcom/a/c/b;->g:F */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lcom/a/c/b;->a:F */
/* iget v0, p0, Lcom/a/c/b;->b:F */
/* iget v2, p0, Lcom/a/c/b;->g:F */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lcom/a/c/b;->b:F */
} // .end method
public void a ( android.graphics.Canvas p0, android.graphics.Paint p1 ) {
/* .locals 7 */
/* const/high16 v4, 0x41a00000 # 20.0f */
/* const/high16 v0, 0x41900000 # 18.0f */
/* const/high16 v3, 0x41c80000 # 25.0f */
/* const/high16 v1, 0x41200000 # 10.0f */
int v2 = 0; // const/4 v2, 0x0
/* iget v5, p0, Lcom/a/c/b;->h:I */
/* packed-switch v5, :pswitch_data_0 */
} // :goto_0
return;
/* :pswitch_0 */
/* iget v5, p0, Lcom/a/c/b;->h:I */
/* if-nez v5, :cond_0 */
/* const/high16 v1, 0x41f00000 # 30.0f */
/* const/high16 v0, 0x41700000 # 15.0f */
} // :goto_1
v3 = this.i;
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* int-to-float v3, v3 */
v4 = this.i;
v4 = (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
/* int-to-float v4, v4 */
/* int-to-float v5, v5 */
/* int-to-float v6, v6 */
/* div-float v1, v5, v1 */
/* div-float/2addr v1, v3 */
/* div-float v0, v6, v0 */
/* div-float/2addr v0, v4 */
(( android.graphics.Canvas ) p1 ).save ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
/* int-to-float v0, v0 */
/* int-to-float v3, v3 */
/* const/high16 v4, 0x42480000 # 50.0f */
com.a.a.a .b ( v4 );
v4 = (( java.lang.Float ) v4 ).floatValue ( ); // invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F
/* sub-float/2addr v3, v4 */
(( android.graphics.Canvas ) p1 ).clipRect ( v2, v2, v0, v3 ); // invoke-virtual {p1, v2, v2, v0, v3}, Landroid/graphics/Canvas;->clipRect(FFFF)Z
/* new-instance v0, Landroid/graphics/Matrix; */
/* invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V */
(( android.graphics.Matrix ) v0 ).postScale ( v1, v1 ); // invoke-virtual {v0, v1, v1}, Landroid/graphics/Matrix;->postScale(FF)Z
/* iget v1, p0, Lcom/a/c/b;->e:F */
/* const/high16 v2, 0x42b40000 # 90.0f */
/* add-float/2addr v1, v2 */
/* iget v2, p0, Lcom/a/c/b;->v:F */
/* iget v3, p0, Lcom/a/c/b;->w:F */
(( android.graphics.Matrix ) v0 ).postRotate ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/graphics/Matrix;->postRotate(FFF)Z
/* iget v1, p0, Lcom/a/c/b;->a:F */
/* iget v2, p0, Lcom/a/c/b;->b:F */
(( android.graphics.Matrix ) v0 ).postTranslate ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z
v1 = this.i;
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v0, p2 ); // invoke-virtual {p1, v1, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
(( android.graphics.Canvas ) p1 ).restore ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
} // :cond_0
/* iget v5, p0, Lcom/a/c/b;->h:I */
int v6 = 1; // const/4 v6, 0x1
/* if-ne v5, v6, :cond_1 */
/* move v1, v3 */
} // :cond_1
/* iget v5, p0, Lcom/a/c/b;->h:I */
int v6 = 2; // const/4 v6, 0x2
/* if-ne v5, v6, :cond_2 */
/* move v0, v1 */
/* move v1, v3 */
} // :cond_2
/* iget v5, p0, Lcom/a/c/b;->h:I */
int v6 = 3; // const/4 v6, 0x3
/* if-ne v5, v6, :cond_3 */
/* move v0, v1 */
/* move v1, v4 */
} // :cond_3
/* iget v5, p0, Lcom/a/c/b;->h:I */
int v6 = 4; // const/4 v6, 0x4
/* if-ne v5, v6, :cond_4 */
/* move v0, v1 */
/* move v1, v4 */
} // :cond_4
/* iget v1, p0, Lcom/a/c/b;->h:I */
int v4 = 5; // const/4 v4, 0x5
/* if-ne v1, v4, :cond_5 */
/* move v1, v3 */
} // :cond_5
/* move v0, v2 */
/* move v1, v2 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public void a ( android.graphics.Canvas p0, android.graphics.Paint p1, Float p2, Float p3, Float p4 ) {
/* .locals 5 */
int v4 = 1; // const/4 v4, 0x1
int v3 = 0; // const/4 v3, 0x0
/* const/high16 v2, 0x41200000 # 10.0f */
/* iput p5, p0, Lcom/a/c/b;->e:F */
/* iget-boolean v0, p0, Lcom/a/c/b;->r:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
(( com.a.c.b ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/a/c/b;->a()V
} // :cond_0
/* iget-boolean v0, p0, Lcom/a/c/b;->n:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
(( com.a.c.b ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/a/c/b;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
} // :goto_0
/* iget v0, p0, Lcom/a/c/b;->a:F */
/* add-float/2addr v0, v1 */
/* add-float/2addr v0, v2 */
/* cmpg-float v0, v0, v3 */
/* if-ltz v0, :cond_1 */
/* iget v0, p0, Lcom/a/c/b;->b:F */
/* add-float/2addr v0, v1 */
/* add-float/2addr v0, v2 */
/* cmpg-float v0, v0, v3 */
/* if-ltz v0, :cond_1 */
/* iget v0, p0, Lcom/a/c/b;->a:F */
/* sub-float/2addr v0, v2 */
/* int-to-float v1, v1 */
/* cmpl-float v0, v0, v1 */
/* if-gtz v0, :cond_1 */
/* iget v0, p0, Lcom/a/c/b;->b:F */
/* sub-float/2addr v0, v2 */
/* int-to-float v1, v1 */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_2 */
} // :cond_1
/* iput-boolean v4, p0, Lcom/a/c/b;->l:Z */
} // :cond_2
return;
} // :cond_3
/* iget v0, p0, Lcom/a/c/b;->q:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lcom/a/c/b;->q:I */
/* iget-boolean v0, p0, Lcom/a/c/b;->p:Z */
/* if-nez v0, :cond_4 */
/* iget v0, p0, Lcom/a/c/b;->q:I */
/* rem-int/lit8 v0, v0, 0x6 */
/* if-nez v0, :cond_4 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/a/c/b;->q:I */
/* iget v0, p0, Lcom/a/c/b;->g:F */
/* const/high16 v1, 0x40a00000 # 5.0f */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lcom/a/c/b;->g:F */
/* iput-boolean v4, p0, Lcom/a/c/b;->p:Z */
} // :cond_4
(( com.a.c.b ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/a/c/b;->b(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
} // .end method
public void b ( android.graphics.Canvas p0, android.graphics.Paint p1 ) {
/* .locals 6 */
/* iget v0, p0, Lcom/a/c/b;->h:I */
/* packed-switch v0, :pswitch_data_0 */
} // :goto_0
return;
/* :pswitch_0 */
/* new-instance v0, Landroid/graphics/Matrix; */
/* invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V */
/* iget v1, p0, Lcom/a/c/b;->e:F */
v2 = this.i;
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v2, v2, 0x2 */
/* int-to-float v2, v2 */
v3 = this.i;
v3 = (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
/* div-int/lit8 v3, v3, 0x2 */
/* int-to-float v3, v3 */
(( android.graphics.Matrix ) v0 ).postRotate ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/graphics/Matrix;->postRotate(FFF)Z
/* iget v1, p0, Lcom/a/c/b;->a:F */
/* iget v2, p0, Lcom/a/c/b;->b:F */
(( android.graphics.Matrix ) v0 ).postTranslate ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z
v1 = this.i;
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v0, p2 ); // invoke-virtual {p1, v1, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
/* :pswitch_1 */
v0 = this.o;
/* iget v3, p0, Lcom/a/c/b;->a:F */
/* iget v4, p0, Lcom/a/c/b;->b:F */
/* iget v5, p0, Lcom/a/c/b;->e:F */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* invoke-virtual/range {v0 ..v5}, Lcom/a/c/a;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;FFF)V */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_1 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method

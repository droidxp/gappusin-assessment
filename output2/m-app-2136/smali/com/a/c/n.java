public class com.a.c.n {
	 /* # static fields */
	 public static Boolean A;
	 public static Integer B;
	 public static Integer C;
	 public static Integer D;
	 public static Integer E;
	 public static Integer F;
	 public static Integer G;
	 public static Boolean H;
	 public static I;
	 public static Float N;
	 public static a;
	 public static Integer v;
	 public static Boolean w;
	 public static Boolean x;
	 public static Boolean y;
	 public static Boolean z;
	 /* # instance fields */
	 public Boolean J;
	 com.a.c.g K;
	 java.util.Random L;
	 Integer M;
	 android.graphics.Paint b;
	 android.graphics.Paint c;
	 Integer d;
	 Integer e;
	 public Boolean f;
	 public Boolean g;
	 public Boolean h;
	 android.graphics.Bitmap i;
	 android.graphics.Bitmap j;
	 public com.a.d.b k;
	 public com.a.d.b l;
	 android.graphics.Paint m;
	 com.a.a.a n;
	 public Float o;
	 public Float p;
	 public Float q;
	 public Float r;
	 public Float s;
	 public Float t;
	 public Float u;
	 /* # direct methods */
	 static com.a.c.n ( ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 int v0 = 4; // const/4 v0, 0x4
		 /* new-array v0, v0, [I */
		 com.a.c.n.w = (v1!= 0);
		 com.a.c.n.x = (v1!= 0);
		 com.a.c.n.y = (v1!= 0);
		 com.a.c.n.z = (v1!= 0);
		 com.a.c.n.A = (v1!= 0);
		 com.a.c.n.H = (v1!= 0);
		 int v0 = 3; // const/4 v0, 0x3
		 /* new-array v0, v0, [I */
		 int v0 = 0; // const/4 v0, 0x0
		 return;
	 } // .end method
	 public com.a.c.n ( ) {
		 /* .locals 6 */
		 int v5 = 1; // const/4 v5, 0x1
		 int v4 = 0; // const/4 v4, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput v4, p0, Lcom/a/c/n;->d:I */
		 /* iput v4, p0, Lcom/a/c/n;->e:I */
		 /* iput-boolean v4, p0, Lcom/a/c/n;->J:Z */
		 /* new-instance v0, Ljava/util/Random; */
		 /* invoke-direct {v0}, Ljava/util/Random;-><init>()V */
		 this.L = v0;
		 /* iput v4, p0, Lcom/a/c/n;->M:I */
		 this.n = p1;
		 v0 = com.a.c.n.a;
		 /* aput p3, v0, p2 */
		 /* iput-boolean v4, p0, Lcom/a/c/n;->f:Z */
		 v0 = com.a.c.n.a;
		 /* aget v0, v0, v5 */
		 /* if-ne v0, v5, :cond_0 */
		 v0 = this.az;
		 (( java.util.ArrayList ) v0 ).get ( v4 ); // invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 this.i = v0;
		 com.a.c.n.w = (v4!= 0);
		 com.a.c.n.x = (v4!= 0);
		 com.a.c.n.y = (v4!= 0);
		 com.a.c.n.z = (v4!= 0);
		 com.a.c.n.A = (v4!= 0);
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/a/c/n;->o:F */
		 /* int-to-float v0, v0 */
		 v1 = this.i;
		 v1 = 		 (( android.graphics.Bitmap ) v1 ).getHeight ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I
		 /* int-to-float v1, v1 */
		 /* int-to-float v2, v2 */
		 /* const/high16 v3, 0x40c00000 # 6.0f */
		 /* div-float/2addr v2, v3 */
		 v3 = this.i;
		 v3 = 		 (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
		 /* int-to-float v3, v3 */
		 /* div-float/2addr v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 /* iput v0, p0, Lcom/a/c/n;->p:F */
	 } // :cond_0
	 v0 = com.a.c.n.a;
	 int v1 = 2; // const/4 v1, 0x2
	 /* aget v0, v0, v1 */
	 /* if-ne v0, v5, :cond_1 */
	 v0 = this.ay;
	 this.j = v0;
	 /* iput-boolean v5, p0, Lcom/a/c/n;->J:Z */
	 /* new-instance v0, Lcom/a/d/b; */
	 /* invoke-direct {v0, v1}, Lcom/a/d/b;-><init>(I)V */
	 this.l = v0;
	 /* new-instance v0, Landroid/graphics/Paint; */
	 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
	 this.m = v0;
	 v0 = this.m;
	 (( android.graphics.Paint ) v0 ).setAlpha ( v4 ); // invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setAlpha(I)V
	 /* iput-boolean v5, p0, Lcom/a/c/n;->f:Z */
} // :cond_1
v0 = com.a.c.n.a;
int v1 = 3; // const/4 v1, 0x3
/* aget v0, v0, v1 */
/* if-ne v0, v5, :cond_2 */
/* new-instance v0, Lcom/a/d/b; */
/* invoke-direct {v0, v1}, Lcom/a/d/b;-><init>(I)V */
this.k = v0;
com.a.c.n.H = (v5!= 0);
} // :cond_2
/* new-instance v0, Landroid/graphics/Paint; */
/* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
this.b = v0;
v0 = this.b;
int v1 = -1; // const/4 v1, -0x1
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
v0 = this.b;
/* const/16 v1, 0x32 */
(( android.graphics.Paint ) v0 ).setAlpha ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V
/* new-instance v0, Landroid/graphics/Paint; */
/* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
this.c = v0;
v0 = this.c;
/* const/high16 v1, -0x1000000 */
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* iput-boolean v5, p0, Lcom/a/c/n;->h:Z */
/* iput-boolean v4, p0, Lcom/a/c/n;->g:Z */
return;
} // .end method
/* # virtual methods */
public void a ( android.graphics.Canvas p0, android.graphics.Paint p1 ) {
/* .locals 9 */
int v3 = 0; // const/4 v3, 0x0
int v8 = 0; // const/4 v8, 0x0
int v1 = 5; // const/4 v1, 0x5
/* if-ge v0, v1, :cond_1 */
/* add-int/lit8 v0, v0, 0x1 */
} // :goto_0
v0 = this.k;
(( com.a.d.b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/a/d/b;->a()I
v0 = this.n;
v0 = this.aA;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.n;
v0 = this.aA;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* const/high16 v1, 0x43b40000 # 360.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x43aa0000 # 340.0f */
com.a.a.a .b ( v2 );
v2 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
/* const/high16 v5, 0x41200000 # 10.0f */
/* const/high16 v6, 0x40e00000 # 7.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.k;
v0 = (( com.a.d.b ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/a/d/b;->c()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = com.a.c.n.a;
int v1 = 3; // const/4 v1, 0x3
/* aput v8, v0, v1 */
com.a.c.n.H = (v8!= 0);
} // :cond_0
return;
} // :cond_1
} // .end method
public void a ( android.graphics.Canvas p0, android.graphics.Paint p1, Integer p2 ) {
/* .locals 12 */
int v11 = 4; // const/4 v11, 0x4
/* const/high16 v10, 0x40a00000 # 5.0f */
int v3 = 0; // const/4 v3, 0x0
int v9 = 0; // const/4 v9, 0x0
int v8 = 1; // const/4 v8, 0x1
/* if-ne p3, v8, :cond_1 */
v7 = this.i;
v0 = this.i;
/* iget v1, p0, Lcom/a/c/n;->o:F */
/* iget v2, p0, Lcom/a/c/n;->p:F */
/* const/high16 v5, 0x40c00000 # 6.0f */
/* const/high16 v6, 0x40800000 # 4.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
/* iput v9, p0, Lcom/a/c/n;->M:I */
} // :cond_0
} // :goto_0
return;
} // :cond_1
int v0 = 2; // const/4 v0, 0x2
/* if-ne p3, v0, :cond_0 */
/* iget v0, p0, Lcom/a/c/n;->M:I */
/* if-nez v0, :cond_2 */
v0 = this.n;
v0 = this.b;
v0 = this.s;
final String v1 = "skills_1"; // const-string v1, "skills_1"
(( com.a.d.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/a/d/d;->a(Ljava/lang/String;)V
/* iput v8, p0, Lcom/a/c/n;->M:I */
} // :cond_2
/* const/16 v1, 0xb */
/* if-ge v0, v1, :cond_e */
/* add-int/lit8 v0, v0, 0x1 */
/* if-ne v0, v8, :cond_b */
/* iget v0, p0, Lcom/a/c/n;->p:F */
/* const/high16 v1, 0x43c80000 # 400.0f */
/* sub-float/2addr v0, v1 */
/* iput v0, p0, Lcom/a/c/n;->q:F */
} // :cond_3
} // :goto_1
v0 = this.n;
v0 = this.az;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.n;
v0 = this.az;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* iget v2, p0, Lcom/a/c/n;->o:F */
v1 = this.n;
v1 = this.az;
(( java.util.ArrayList ) v1 ).get ( v4 ); // invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
v1 = (( android.graphics.Bitmap ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I
/* int-to-float v1, v1 */
/* div-float/2addr v1, v10 */
/* sub-float v1, v2, v1 */
/* iget v4, p0, Lcom/a/c/n;->q:F */
v2 = this.n;
v2 = this.az;
(( java.util.ArrayList ) v2 ).get ( v5 ); // invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
v2 = (( android.graphics.Bitmap ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I
/* int-to-float v2, v2 */
/* div-float/2addr v2, v10 */
/* sub-float v2, v4, v2 */
/* const/high16 v5, 0x40800000 # 4.0f */
/* const/high16 v6, 0x40400000 # 3.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.n;
v0 = this.b;
v0 = this.i;
v0 = com.a.e.d.M;
/* aget v0, v0, v9 */
/* if-lez v0, :cond_5 */
/* sget-boolean v0, Lcom/a/c/n;->w:Z */
if ( v0 != null) { // if-eqz v0, :cond_5
/* const/16 v1, 0xb */
/* if-ge v0, v1, :cond_12 */
/* add-int/lit8 v0, v0, 0x1 */
/* if-ne v0, v8, :cond_f */
/* iget v0, p0, Lcom/a/c/n;->p:F */
/* const/high16 v1, 0x43c80000 # 400.0f */
/* sub-float/2addr v0, v1 */
/* iput v0, p0, Lcom/a/c/n;->r:F */
} // :cond_4
} // :goto_2
v0 = this.n;
v0 = this.az;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.n;
v0 = this.az;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* iget v1, p0, Lcom/a/c/n;->o:F */
/* const/high16 v2, 0x42700000 # 60.0f */
com.a.a.a .a ( v2 );
v2 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
/* add-float/2addr v2, v1 */
v1 = this.n;
v1 = this.az;
(( java.util.ArrayList ) v1 ).get ( v4 ); // invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
v1 = (( android.graphics.Bitmap ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I
/* int-to-float v1, v1 */
/* div-float/2addr v1, v10 */
/* sub-float v1, v2, v1 */
/* iget v4, p0, Lcom/a/c/n;->r:F */
v2 = this.n;
v2 = this.az;
(( java.util.ArrayList ) v2 ).get ( v5 ); // invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
v2 = (( android.graphics.Bitmap ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I
/* int-to-float v2, v2 */
/* div-float/2addr v2, v10 */
/* sub-float v2, v4, v2 */
/* const/high16 v5, 0x40800000 # 4.0f */
/* const/high16 v6, 0x40400000 # 3.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_5
v0 = this.n;
v0 = this.b;
v0 = this.i;
v0 = com.a.e.d.M;
/* aget v0, v0, v9 */
/* if-le v0, v8, :cond_7 */
/* sget-boolean v0, Lcom/a/c/n;->x:Z */
if ( v0 != null) { // if-eqz v0, :cond_7
/* const/16 v1, 0xb */
/* if-ge v0, v1, :cond_16 */
/* add-int/lit8 v0, v0, 0x1 */
/* if-ne v0, v8, :cond_13 */
/* iget v0, p0, Lcom/a/c/n;->p:F */
/* const/high16 v1, 0x43c80000 # 400.0f */
/* sub-float/2addr v0, v1 */
/* iput v0, p0, Lcom/a/c/n;->s:F */
} // :cond_6
} // :goto_3
v0 = this.n;
v0 = this.az;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.n;
v0 = this.az;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* iget v2, p0, Lcom/a/c/n;->o:F */
v1 = this.n;
v1 = this.az;
(( java.util.ArrayList ) v1 ).get ( v4 ); // invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
v1 = (( android.graphics.Bitmap ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I
/* int-to-float v1, v1 */
/* div-float/2addr v1, v10 */
/* sub-float v1, v2, v1 */
/* iget v2, p0, Lcom/a/c/n;->s:F */
/* const/high16 v4, 0x42700000 # 60.0f */
com.a.a.a .b ( v4 );
v4 = (( java.lang.Float ) v4 ).floatValue ( ); // invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F
/* add-float/2addr v4, v2 */
v2 = this.n;
v2 = this.az;
(( java.util.ArrayList ) v2 ).get ( v5 ); // invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
v2 = (( android.graphics.Bitmap ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I
/* int-to-float v2, v2 */
/* div-float/2addr v2, v10 */
/* sub-float v2, v4, v2 */
/* const/high16 v5, 0x40800000 # 4.0f */
/* const/high16 v6, 0x40400000 # 3.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_7
v0 = this.n;
v0 = this.b;
v0 = this.i;
v0 = com.a.e.d.M;
/* aget v0, v0, v9 */
int v1 = 2; // const/4 v1, 0x2
/* if-le v0, v1, :cond_9 */
/* sget-boolean v0, Lcom/a/c/n;->y:Z */
if ( v0 != null) { // if-eqz v0, :cond_9
/* const/16 v1, 0xb */
/* if-ge v0, v1, :cond_1a */
/* add-int/lit8 v0, v0, 0x1 */
/* if-ne v0, v8, :cond_17 */
/* iget v0, p0, Lcom/a/c/n;->p:F */
/* const/high16 v1, 0x43c80000 # 400.0f */
/* sub-float/2addr v0, v1 */
/* iput v0, p0, Lcom/a/c/n;->t:F */
} // :cond_8
} // :goto_4
v0 = this.n;
v0 = this.az;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.n;
v0 = this.az;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* iget v1, p0, Lcom/a/c/n;->o:F */
/* const/high16 v2, 0x42700000 # 60.0f */
com.a.a.a .a ( v2 );
v2 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
/* sub-float v2, v1, v2 */
v1 = this.n;
v1 = this.az;
(( java.util.ArrayList ) v1 ).get ( v4 ); // invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
v1 = (( android.graphics.Bitmap ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I
/* int-to-float v1, v1 */
/* div-float/2addr v1, v10 */
/* sub-float v1, v2, v1 */
/* iget v4, p0, Lcom/a/c/n;->t:F */
v2 = this.n;
v2 = this.az;
(( java.util.ArrayList ) v2 ).get ( v5 ); // invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
v2 = (( android.graphics.Bitmap ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I
/* int-to-float v2, v2 */
/* div-float/2addr v2, v10 */
/* sub-float v2, v4, v2 */
/* const/high16 v5, 0x40800000 # 4.0f */
/* const/high16 v6, 0x40400000 # 3.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_9
v0 = this.n;
v0 = this.b;
v0 = this.i;
v0 = com.a.e.d.M;
/* aget v0, v0, v9 */
int v1 = 3; // const/4 v1, 0x3
/* if-le v0, v1, :cond_0 */
/* sget-boolean v0, Lcom/a/c/n;->z:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* const/16 v1, 0xb */
/* if-ge v0, v1, :cond_1e */
/* add-int/lit8 v0, v0, 0x1 */
/* if-ne v0, v8, :cond_1b */
/* iget v0, p0, Lcom/a/c/n;->p:F */
/* const/high16 v1, 0x43c80000 # 400.0f */
/* sub-float/2addr v0, v1 */
/* iput v0, p0, Lcom/a/c/n;->u:F */
} // :cond_a
} // :goto_5
v0 = this.n;
v0 = this.az;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.n;
v0 = this.az;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* iget v2, p0, Lcom/a/c/n;->o:F */
v1 = this.n;
v1 = this.az;
(( java.util.ArrayList ) v1 ).get ( v4 ); // invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
v1 = (( android.graphics.Bitmap ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I
/* int-to-float v1, v1 */
/* div-float/2addr v1, v10 */
/* sub-float v1, v2, v1 */
/* iget v2, p0, Lcom/a/c/n;->u:F */
/* const/high16 v4, 0x42700000 # 60.0f */
com.a.a.a .b ( v4 );
v4 = (( java.lang.Float ) v4 ).floatValue ( ); // invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F
/* sub-float v4, v2, v4 */
v2 = this.n;
v2 = this.az;
(( java.util.ArrayList ) v2 ).get ( v5 ); // invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
v2 = (( android.graphics.Bitmap ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I
/* int-to-float v2, v2 */
/* div-float/2addr v2, v10 */
/* sub-float v2, v4, v2 */
/* const/high16 v5, 0x40800000 # 4.0f */
/* const/high16 v6, 0x40400000 # 3.0f */
/* move v4, v3 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
/* goto/16 :goto_0 */
} // :cond_b
/* if-le v0, v8, :cond_d */
/* if-ge v0, v11, :cond_d */
/* iget v0, p0, Lcom/a/c/n;->q:F */
/* iget v1, p0, Lcom/a/c/n;->p:F */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_c */
/* iget v0, p0, Lcom/a/c/n;->q:F */
/* const/high16 v1, 0x41f00000 # 30.0f */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lcom/a/c/n;->q:F */
/* goto/16 :goto_1 */
} // :cond_c
/* iget v0, p0, Lcom/a/c/n;->q:F */
/* iget v1, p0, Lcom/a/c/n;->p:F */
/* cmpl-float v0, v0, v1 */
/* if-ltz v0, :cond_3 */
/* iget v0, p0, Lcom/a/c/n;->p:F */
/* iput v0, p0, Lcom/a/c/n;->q:F */
/* goto/16 :goto_1 */
} // :cond_d
int v1 = 3; // const/4 v1, 0x3
/* if-lt v0, v1, :cond_3 */
com.a.c.n.w = (v8!= 0);
/* iget v0, p0, Lcom/a/c/n;->p:F */
/* iput v0, p0, Lcom/a/c/n;->q:F */
/* goto/16 :goto_1 */
} // :cond_e
v0 = this.n;
v0 = this.b;
v0 = this.b;
/* iput v9, v0, Lcom/a/c/g;->h:I */
v0 = com.a.c.n.a;
/* aput v9, v0, v8 */
/* goto/16 :goto_1 */
} // :cond_f
/* if-le v0, v8, :cond_11 */
/* if-ge v0, v11, :cond_11 */
/* iget v0, p0, Lcom/a/c/n;->r:F */
/* iget v1, p0, Lcom/a/c/n;->p:F */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_10 */
/* iget v0, p0, Lcom/a/c/n;->r:F */
/* const/high16 v1, 0x42480000 # 50.0f */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lcom/a/c/n;->r:F */
/* goto/16 :goto_2 */
} // :cond_10
/* iget v0, p0, Lcom/a/c/n;->r:F */
/* iget v1, p0, Lcom/a/c/n;->p:F */
/* cmpl-float v0, v0, v1 */
/* if-ltz v0, :cond_4 */
/* iget v0, p0, Lcom/a/c/n;->p:F */
/* iput v0, p0, Lcom/a/c/n;->r:F */
/* goto/16 :goto_2 */
} // :cond_11
int v1 = 3; // const/4 v1, 0x3
/* if-lt v0, v1, :cond_4 */
/* iget v0, p0, Lcom/a/c/n;->p:F */
/* iput v0, p0, Lcom/a/c/n;->r:F */
com.a.c.n.x = (v8!= 0);
/* goto/16 :goto_2 */
} // :cond_12
v0 = this.n;
v0 = this.b;
v0 = this.i;
v0 = com.a.e.d.M;
/* aget v0, v0, v9 */
/* if-ne v0, v8, :cond_4 */
v0 = this.n;
v0 = this.b;
v0 = this.b;
/* iput v9, v0, Lcom/a/c/g;->h:I */
/* goto/16 :goto_2 */
} // :cond_13
/* if-le v0, v8, :cond_15 */
/* if-ge v0, v11, :cond_15 */
/* iget v0, p0, Lcom/a/c/n;->s:F */
/* iget v1, p0, Lcom/a/c/n;->p:F */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_14 */
/* iget v0, p0, Lcom/a/c/n;->s:F */
/* const/high16 v1, 0x42480000 # 50.0f */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lcom/a/c/n;->s:F */
/* goto/16 :goto_3 */
} // :cond_14
/* iget v0, p0, Lcom/a/c/n;->s:F */
/* iget v1, p0, Lcom/a/c/n;->p:F */
/* cmpl-float v0, v0, v1 */
/* if-ltz v0, :cond_6 */
/* iget v0, p0, Lcom/a/c/n;->p:F */
/* iput v0, p0, Lcom/a/c/n;->s:F */
/* goto/16 :goto_3 */
} // :cond_15
int v1 = 3; // const/4 v1, 0x3
/* if-lt v0, v1, :cond_6 */
/* iget v0, p0, Lcom/a/c/n;->p:F */
/* iput v0, p0, Lcom/a/c/n;->s:F */
com.a.c.n.y = (v8!= 0);
/* goto/16 :goto_3 */
} // :cond_16
v0 = this.n;
v0 = this.b;
v0 = this.i;
v0 = com.a.e.d.M;
/* aget v0, v0, v9 */
int v1 = 2; // const/4 v1, 0x2
/* if-ne v0, v1, :cond_6 */
v0 = this.n;
v0 = this.b;
v0 = this.b;
/* iput v9, v0, Lcom/a/c/g;->h:I */
/* goto/16 :goto_3 */
} // :cond_17
/* if-le v0, v8, :cond_19 */
/* if-ge v0, v11, :cond_19 */
/* iget v0, p0, Lcom/a/c/n;->t:F */
/* iget v1, p0, Lcom/a/c/n;->p:F */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_18 */
/* iget v0, p0, Lcom/a/c/n;->t:F */
/* const/high16 v1, 0x42480000 # 50.0f */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lcom/a/c/n;->t:F */
/* goto/16 :goto_4 */
} // :cond_18
/* iget v0, p0, Lcom/a/c/n;->t:F */
/* iget v1, p0, Lcom/a/c/n;->p:F */
/* cmpl-float v0, v0, v1 */
/* if-ltz v0, :cond_8 */
/* iget v0, p0, Lcom/a/c/n;->p:F */
/* iput v0, p0, Lcom/a/c/n;->t:F */
/* goto/16 :goto_4 */
} // :cond_19
int v1 = 3; // const/4 v1, 0x3
/* if-lt v0, v1, :cond_8 */
/* iget v0, p0, Lcom/a/c/n;->p:F */
/* iput v0, p0, Lcom/a/c/n;->t:F */
com.a.c.n.z = (v8!= 0);
/* goto/16 :goto_4 */
} // :cond_1a
v0 = this.n;
v0 = this.b;
v0 = this.i;
v0 = com.a.e.d.M;
/* aget v0, v0, v9 */
int v1 = 3; // const/4 v1, 0x3
/* if-ne v0, v1, :cond_8 */
v0 = this.K;
/* iput v9, v0, Lcom/a/c/g;->h:I */
/* goto/16 :goto_4 */
} // :cond_1b
/* if-le v0, v8, :cond_1d */
/* if-ge v0, v11, :cond_1d */
/* iget v0, p0, Lcom/a/c/n;->u:F */
/* iget v1, p0, Lcom/a/c/n;->p:F */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_1c */
/* iget v0, p0, Lcom/a/c/n;->u:F */
/* const/high16 v1, 0x42480000 # 50.0f */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lcom/a/c/n;->u:F */
/* goto/16 :goto_5 */
} // :cond_1c
/* iget v0, p0, Lcom/a/c/n;->u:F */
/* iget v1, p0, Lcom/a/c/n;->p:F */
/* cmpl-float v0, v0, v1 */
/* if-ltz v0, :cond_a */
/* iget v0, p0, Lcom/a/c/n;->p:F */
/* iput v0, p0, Lcom/a/c/n;->u:F */
/* goto/16 :goto_5 */
} // :cond_1d
int v1 = 3; // const/4 v1, 0x3
/* if-lt v0, v1, :cond_a */
/* iget v0, p0, Lcom/a/c/n;->p:F */
/* iput v0, p0, Lcom/a/c/n;->u:F */
com.a.c.n.z = (v8!= 0);
/* goto/16 :goto_5 */
} // :cond_1e
v0 = this.n;
v0 = this.b;
v0 = this.i;
v0 = com.a.e.d.M;
/* aget v0, v0, v9 */
/* if-ne v0, v11, :cond_a */
v0 = this.n;
v0 = this.b;
v0 = this.b;
/* iput v9, v0, Lcom/a/c/g;->h:I */
/* goto/16 :goto_5 */
} // .end method
public void b ( android.graphics.Canvas p0, android.graphics.Paint p1 ) {
/* .locals 10 */
/* const/16 v3, 0xfa */
int v9 = 1; // const/4 v9, 0x1
int v8 = 0; // const/4 v8, 0x0
int v1 = 0; // const/4 v1, 0x0
v0 = this.m;
v0 = (( android.graphics.Paint ) v0 ).getAlpha ( ); // invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I
/* if-gt v0, v3, :cond_0 */
/* add-int/lit8 v0, v0, 0x14 */
v2 = this.m;
(( android.graphics.Paint ) v2 ).setAlpha ( v0 ); // invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setAlpha(I)V
/* if-lt v0, v3, :cond_0 */
/* iput-boolean v8, p0, Lcom/a/c/n;->f:Z */
} // :cond_0
v7 = this.j;
v0 = this.j;
/* const/high16 v5, 0x3f800000 # 1.0f */
/* move v2, v1 */
/* move v3, v1 */
/* move v4, v1 */
/* move v6, v1 */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.l;
(( com.a.d.b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/a/d/b;->a()I
v0 = this.l;
v0 = (( com.a.d.b ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/a/d/b;->c()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* sget-boolean v0, Lcom/a/c/g;->o:Z */
/* if-nez v0, :cond_1 */
com.a.c.l.D = (v9!= 0);
com.a.c.j.T = (v9!= 0);
/* iput-boolean v8, p0, Lcom/a/c/n;->J:Z */
v0 = com.a.c.n.a;
int v1 = 2; // const/4 v1, 0x2
/* aput v8, v0, v1 */
} // :cond_1
return;
} // .end method

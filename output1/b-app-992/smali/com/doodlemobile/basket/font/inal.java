public class inal implements com.doodlemobile.basket.b.d {
	 /* # interfaces */
	 /* # static fields */
	 private static Integer f;
	 private static Integer g;
	 /* # instance fields */
	 public final Boolean a;
	 public final Boolean b;
	 public final Integer c;
	 public final java.lang.String d;
	 public final android.graphics.Typeface e;
	 private final android.util.SparseArray h;
	 private final java.util.ArrayList i;
	 private final java.util.ArrayList j;
	 private android.graphics.Paint k;
	 private final android.graphics.Paint l;
	 private android.graphics.Paint$FontMetrics m;
	 private Integer n;
	 private Integer o;
	 private Float p;
	 private Float q;
	 private android.graphics.Canvas r;
	 private Boolean s;
	 private Boolean t;
	 private android.graphics.Rect u;
	 private android.graphics.Rect v;
	 private w;
	 private android.graphics.Bitmap x;
	 private Integer y;
	 private Boolean z;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 1 */
		 /* const/16 v0, 0x100 */
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 5 */
		 int v4 = -1; // const/4 v4, -0x1
		 int v1 = 0; // const/4 v1, 0x0
		 int v3 = 1; // const/4 v3, 0x1
		 int v2 = 0; // const/4 v2, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Landroid/util/SparseArray; */
		 /* invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V */
		 this.h = v0;
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.i = v0;
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.j = v0;
		 /* iput v1, p0, Lcom/doodlemobile/basket/font/e;->p:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/font/e;->q:F */
		 /* new-instance v0, Landroid/graphics/Canvas; */
		 /* invoke-direct {v0}, Landroid/graphics/Canvas;-><init>()V */
		 this.r = v0;
		 /* iput-boolean v2, p0, Lcom/doodlemobile/basket/font/e;->s:Z */
		 /* iput-boolean v2, p0, Lcom/doodlemobile/basket/font/e;->t:Z */
		 /* new-instance v0, Landroid/graphics/Rect; */
		 /* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
		 this.u = v0;
		 /* new-instance v0, Landroid/graphics/Rect; */
		 /* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
		 this.v = v0;
		 /* new-array v0, v3, [F */
		 this.w = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 this.x = v0;
		 /* iput v4, p0, Lcom/doodlemobile/basket/font/e;->y:I */
		 /* iput-boolean v2, p0, Lcom/doodlemobile/basket/font/e;->z:Z */
		 this.e = p1;
		 /* iput p2, p0, Lcom/doodlemobile/basket/font/e;->c:I */
		 /* iput-boolean p3, p0, Lcom/doodlemobile/basket/font/e;->a:Z */
		 /* iput-boolean p4, p0, Lcom/doodlemobile/basket/font/e;->b:Z */
		 this.d = p5;
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 this.k = v0;
		 v0 = this.k;
		 (( android.graphics.Paint ) v0 ).setTypeface ( p1 ); // invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
		 v0 = this.k;
		 /* int-to-float v1, p2 */
		 (( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
		 /* iget-boolean v0, p0, Lcom/doodlemobile/basket/font/e;->a:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.k;
			 (( android.graphics.Paint ) v0 ).setFakeBoldText ( v3 ); // invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setFakeBoldText(Z)V
		 } // :cond_0
		 v0 = this.k;
		 (( android.graphics.Paint ) v0 ).setAntiAlias ( v3 ); // invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V
		 v0 = this.k;
		 (( android.graphics.Paint ) v0 ).setColor ( v4 ); // invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setColor(I)V
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 this.l = v0;
		 v0 = this.l;
		 (( android.graphics.Paint ) v0 ).setColor ( v2 ); // invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V
		 v0 = this.l;
		 v1 = android.graphics.Paint$Style.FILL;
		 (( android.graphics.Paint ) v0 ).setStyle ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
		 v0 = this.k;
		 (( android.graphics.Paint ) v0 ).getFontMetrics ( ); // invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;
		 this.m = v0;
		 v0 = this.m;
		 /* iget v0, v0, Landroid/graphics/Paint$FontMetrics;->ascent:F */
		 v0 = 		 java.lang.Math .abs ( v0 );
		 v1 = this.m;
		 /* iget v1, v1, Landroid/graphics/Paint$FontMetrics;->descent:F */
		 v1 = 		 java.lang.Math .abs ( v1 );
		 /* add-float/2addr v0, v1 */
		 v0 = 		 android.util.FloatMath .ceil ( v0 );
		 /* float-to-int v0, v0 */
		 /* add-int/lit8 v0, v0, 0x1 */
		 /* iput v0, p0, Lcom/doodlemobile/basket/font/e;->n:I */
		 v0 = this.m;
		 /* iget v0, v0, Landroid/graphics/Paint$FontMetrics;->leading:F */
		 v0 = 		 android.util.FloatMath .ceil ( v0 );
		 /* float-to-int v0, v0 */
		 /* iput v0, p0, Lcom/doodlemobile/basket/font/e;->o:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final com.doodlemobile.basket.font.b a ( Object p0 ) {
		 /* .locals 13 */
		 int v12 = 1; // const/4 v12, 0x1
		 int v11 = 0; // const/4 v11, 0x0
		 v9 = this.h;
		 (( android.util.SparseArray ) v9 ).get ( p1 ); // invoke-virtual {v9, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Lcom/doodlemobile/basket/font/b; */
		 /* if-nez v0, :cond_1 */
		 /* int-to-float v0, v0 */
		 /* int-to-float v1, v1 */
		 v2 = this.k;
		 java.lang.String .valueOf ( p1 );
		 v4 = this.v;
		 (( android.graphics.Paint ) v2 ).getTextBounds ( v3, v11, v12, v4 ); // invoke-virtual {v2, v3, v11, v12, v4}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V
		 v2 = this.v;
		 v2 = 		 (( android.graphics.Rect ) v2 ).width ( ); // invoke-virtual {v2}, Landroid/graphics/Rect;->width()I
		 /* add-int/lit8 v2, v2, 0xa */
		 /* int-to-float v10, v2 */
		 /* iget v2, p0, Lcom/doodlemobile/basket/font/e;->n:I */
		 /* int-to-float v4, v2 */
		 /* iget v2, p0, Lcom/doodlemobile/basket/font/e;->p:F */
		 /* add-float/2addr v2, v10 */
		 /* cmpl-float v2, v2, v0 */
		 /* if-ltz v2, :cond_0 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* iput v2, p0, Lcom/doodlemobile/basket/font/e;->p:F */
		 /* iget v2, p0, Lcom/doodlemobile/basket/font/e;->q:F */
		 /* iget v3, p0, Lcom/doodlemobile/basket/font/e;->o:I */
		 /* iget v5, p0, Lcom/doodlemobile/basket/font/e;->n:I */
		 /* add-int/2addr v3, v5 */
		 /* int-to-float v3, v3 */
		 /* add-float/2addr v2, v3 */
		 /* iput v2, p0, Lcom/doodlemobile/basket/font/e;->q:F */
	 } // :cond_0
	 /* iget v2, p0, Lcom/doodlemobile/basket/font/e;->p:F */
	 /* div-float v5, v2, v0 */
	 /* iget v2, p0, Lcom/doodlemobile/basket/font/e;->q:F */
	 /* div-float v6, v2, v1 */
	 /* div-float v7, v10, v0 */
	 /* div-float v8, v4, v1 */
	 /* new-instance v0, Lcom/doodlemobile/basket/font/b; */
	 v1 = this.k;
	 java.lang.String .valueOf ( p1 );
	 v3 = this.w;
	 (( android.graphics.Paint ) v1 ).getTextWidths ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/graphics/Paint;->getTextWidths(Ljava/lang/String;[F)I
	 v1 = this.w;
	 /* aget v1, v1, v11 */
	 v1 = 	 android.util.FloatMath .ceil ( v1 );
	 /* float-to-int v2, v1 */
	 /* float-to-int v3, v10 */
	 /* float-to-int v4, v4 */
	 /* move v1, p1 */
	 /* invoke-direct/range {v0 ..v8}, Lcom/doodlemobile/basket/font/b;-><init>(CIIIFFFF)V */
	 /* iget v1, p0, Lcom/doodlemobile/basket/font/e;->p:F */
	 /* add-float/2addr v1, v10 */
	 /* iput v1, p0, Lcom/doodlemobile/basket/font/e;->p:F */
	 (( android.util.SparseArray ) v9 ).put ( p1, v0 ); // invoke-virtual {v9, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
	 v1 = this.j;
	 (( java.util.ArrayList ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
	 v1 = this.i;
	 (( java.util.ArrayList ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
	 /* iput-boolean v12, p0, Lcom/doodlemobile/basket/font/e;->t:Z */
} // :cond_1
} // .end method
public final void a ( Object p0 ) {
/* .locals 19 */
/* const/high16 v18, 0x3f800000 # 1.0f */
int v6 = 0; // const/4 v6, 0x0
/* const/16 v17, 0x1 */
/* const/16 v16, 0xde1 */
int v15 = 0; // const/4 v15, 0x0
v5 = /* invoke-virtual/range {p0 ..p0}, Lcom/doodlemobile/basket/font/e;->a()Z */
if ( v5 != null) { // if-eqz v5, :cond_0
} // :goto_0
return;
} // :cond_0
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/e;->y:I */
/* move v5, v0 */
int v7 = -1; // const/4 v7, -0x1
/* if-eq v5, v7, :cond_1 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lcom/doodlemobile/basket/font/e;->s:Z */
/* move v5, v0 */
if ( v5 != null) { // if-eqz v5, :cond_3
} // :cond_1
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/e;->y:I */
/* move v5, v0 */
/* move-object/from16 v0, p1 */
/* move v1, v5 */
v5 = /* invoke-interface/range {p1 ..p1}, Lcom/doodlemobile/basket/opengl/m;->glGenTexture()I */
/* move v0, v5 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/doodlemobile/basket/font/e;->y:I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/e;->y:I */
/* move v5, v0 */
/* move-object/from16 v0, p1 */
/* move/from16 v1, v16 */
/* move v2, v5 */
/* const/16 v5, 0x2801 */
/* const v7, 0x46180400 # 9729.0f */
/* move-object/from16 v0, p1 */
/* move/from16 v1, v16 */
/* move v2, v5 */
/* move v3, v7 */
/* const/16 v5, 0x2800 */
/* const v7, 0x46180400 # 9729.0f */
/* move-object/from16 v0, p1 */
/* move/from16 v1, v16 */
/* move v2, v5 */
/* move v3, v7 */
/* const/16 v5, 0x2802 */
/* const v7, 0x47012f00 # 33071.0f */
/* move-object/from16 v0, p1 */
/* move/from16 v1, v16 */
/* move v2, v5 */
/* move v3, v7 */
/* const/16 v5, 0x2803 */
/* const v7, 0x47012f00 # 33071.0f */
/* move-object/from16 v0, p1 */
/* move/from16 v1, v16 */
/* move v2, v5 */
/* move v3, v7 */
/* move-object/from16 v0, p0 */
v0 = this.x;
/* move-object v5, v0 */
if ( v5 != null) { // if-eqz v5, :cond_2
/* move-object/from16 v0, p0 */
v0 = this.x;
/* move-object v5, v0 */
(( android.graphics.Bitmap ) v5 ).recycle ( ); // invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V
int v5 = 0; // const/4 v5, 0x0
/* move-object v0, v5 */
/* move-object/from16 v1, p0 */
this.x = v0;
} // :cond_2
v8 = android.graphics.Bitmap$Config.ARGB_8888;
android.graphics.Bitmap .createBitmap ( v5,v7,v8 );
/* move-object v0, v5 */
/* move-object/from16 v1, p0 */
this.x = v0;
/* move-object/from16 v0, p0 */
v0 = this.x;
/* move-object v5, v0 */
(( android.graphics.Bitmap ) v5 ).eraseColor ( v15 ); // invoke-virtual {v5, v15}, Landroid/graphics/Bitmap;->eraseColor(I)V
/* move-object/from16 v0, p0 */
v0 = this.x;
/* move-object v5, v0 */
/* move/from16 v0, v16 */
/* move v1, v15 */
/* move-object v2, v5 */
/* move v3, v15 */
android.opengl.GLUtils .texImage2D ( v0,v1,v2,v3 );
/* move-object/from16 v0, p0 */
v0 = this.x;
/* move-object v5, v0 */
(( android.graphics.Bitmap ) v5 ).recycle ( ); // invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V
int v5 = 0; // const/4 v5, 0x0
/* move-object v0, v5 */
/* move-object/from16 v1, p0 */
this.x = v0;
} // :cond_3
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/e;->y:I */
/* move v5, v0 */
/* move-object/from16 v0, p1 */
/* move/from16 v1, v16 */
/* move v2, v5 */
/* move-object/from16 v0, p0 */
v0 = this.j;
/* move-object v5, v0 */
v5 = (( java.util.ArrayList ) v5 ).size ( ); // invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
if ( v5 != null) { // if-eqz v5, :cond_6
/* move-object/from16 v0, p0 */
v0 = this.j;
/* move-object v5, v0 */
v5 = (( java.util.ArrayList ) v5 ).size ( ); // invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
/* sub-int v5, v5, v17 */
/* move v12, v5 */
} // :goto_1
/* if-ltz v12, :cond_5 */
/* move-object/from16 v0, p0 */
v0 = this.j;
/* move-object v5, v0 */
(( java.util.ArrayList ) v5 ).get ( v12 ); // invoke-virtual {v5, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v0, v5 */
/* check-cast v0, Lcom/doodlemobile/basket/font/b; */
/* move-object v11, v0 */
/* iget-char v5, v11, Lcom/doodlemobile/basket/font/b;->a:C */
/* move-object/from16 v0, p0 */
v0 = this.u;
/* move-object v7, v0 */
java.lang.String .valueOf ( v5 );
/* move-object/from16 v0, p0 */
v0 = this.k;
/* move-object v5, v0 */
/* move-object v0, v5 */
/* move-object v1, v13 */
/* move v2, v15 */
/* move/from16 v3, v17 */
/* move-object v4, v7 */
(( android.graphics.Paint ) v0 ).getTextBounds ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/e;->n:I */
/* move v9, v0 */
v5 = (( android.graphics.Rect ) v7 ).width ( ); // invoke-virtual {v7}, Landroid/graphics/Rect;->width()I
/* if-nez v5, :cond_4 */
/* move/from16 v5, v17 */
} // :goto_2
v8 = android.graphics.Bitmap$Config.ARGB_8888;
android.graphics.Bitmap .createBitmap ( v5,v9,v8 );
(( android.graphics.Bitmap ) v14 ).eraseColor ( v15 ); // invoke-virtual {v14, v15}, Landroid/graphics/Bitmap;->eraseColor(I)V
/* move-object/from16 v0, p0 */
v0 = this.r;
/* move-object v5, v0 */
(( android.graphics.Canvas ) v5 ).setBitmap ( v14 ); // invoke-virtual {v5, v14}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V
/* move-object/from16 v0, p0 */
v0 = this.r;
/* move-object v5, v0 */
v7 = (( android.graphics.Rect ) v7 ).width ( ); // invoke-virtual {v7}, Landroid/graphics/Rect;->width()I
/* add-int/lit8 v7, v7, 0xa */
/* int-to-float v8, v7 */
/* int-to-float v9, v9 */
/* move-object/from16 v0, p0 */
v0 = this.l;
/* move-object v10, v0 */
/* move v7, v6 */
/* invoke-virtual/range {v5 ..v10}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
/* move-object/from16 v0, p0 */
v0 = this.r;
/* move-object v5, v0 */
/* move-object/from16 v0, p0 */
v0 = this.m;
/* move-object v7, v0 */
/* iget v7, v7, Landroid/graphics/Paint$FontMetrics;->ascent:F */
/* neg-float v7, v7 */
/* add-float v7, v7, v18 */
/* move-object/from16 v0, p0 */
v0 = this.k;
/* move-object v8, v0 */
/* move-object v0, v5 */
/* move-object v1, v13 */
/* move/from16 v2, v18 */
/* move v3, v7 */
/* move-object v4, v8 */
(( android.graphics.Canvas ) v0 ).drawText ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* iget v5, v11, Lcom/doodlemobile/basket/font/b;->d:F */
/* int-to-float v7, v7 */
/* mul-float/2addr v5, v7 */
/* float-to-int v5, v5 */
/* iget v7, v11, Lcom/doodlemobile/basket/font/b;->e:F */
/* int-to-float v8, v8 */
/* mul-float/2addr v7, v8 */
/* float-to-int v7, v7 */
/* move/from16 v0, v16 */
/* move v1, v15 */
/* move v2, v5 */
/* move v3, v7 */
/* move-object v4, v14 */
android.opengl.GLUtils .texSubImage2D ( v0,v1,v2,v3,v4 );
(( android.graphics.Bitmap ) v14 ).recycle ( ); // invoke-virtual {v14}, Landroid/graphics/Bitmap;->recycle()V
/* add-int/lit8 v5, v12, -0x1 */
/* move v12, v5 */
/* goto/16 :goto_1 */
} // :cond_4
v5 = (( android.graphics.Rect ) v7 ).width ( ); // invoke-virtual {v7}, Landroid/graphics/Rect;->width()I
/* add-int/lit8 v5, v5, 0xa */
} // :cond_5
/* move-object/from16 v0, p0 */
v0 = this.j;
/* move-object v5, v0 */
(( java.util.ArrayList ) v5 ).clear ( ); // invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V
} // :cond_6
/* move v0, v15 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lcom/doodlemobile/basket/font/e;->t:Z */
/* move v0, v15 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lcom/doodlemobile/basket/font/e;->s:Z */
/* invoke-static/range {p0 ..p0}, Lcom/doodlemobile/basket/n;->a(Lcom/doodlemobile/basket/b/d;)V */
/* goto/16 :goto_0 */
} // .end method
public final Boolean a ( ) {
/* .locals 2 */
/* iget v0, p0, Lcom/doodlemobile/basket/font/e;->y:I */
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_0 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/font/e;->s:Z */
/* if-nez v0, :cond_0 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/font/e;->t:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final Integer b ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/font/e;->o:I */
} // .end method
public final void b ( Object p0 ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/font/e;->y:I */
/* iget v0, p0, Lcom/doodlemobile/basket/font/e;->y:I */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/doodlemobile/basket/font/e;->y:I */
} // :cond_0
return;
} // .end method
public final void c ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/doodlemobile/basket/font/e;->y:I */
return;
} // .end method
public final Boolean d ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/font/e;->z:Z */
} // .end method
public final void e ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/font/e;->z:Z */
return;
} // .end method
public final Boolean f ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final void g ( ) {
/* .locals 0 */
return;
} // .end method
public final void h ( ) {
/* .locals 0 */
return;
} // .end method
public final Integer i ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/font/e;->n:I */
} // .end method
public final void j ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/font/e;->z:Z */
/* if-nez v0, :cond_0 */
com.doodlemobile.basket.n .b ( p0 );
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/font/e;->z:Z */
} // :cond_0
return;
} // .end method
public final Integer k ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/font/e;->z:Z */
/* if-nez v0, :cond_0 */
(( com.doodlemobile.basket.font.e ) p0 ).j ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/font/e;->j()V
} // :cond_0
v0 = (( com.doodlemobile.basket.font.e ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/font/e;->a()Z
/* if-nez v0, :cond_1 */
v0 = com.doodlemobile.basket.r.a;
(( com.doodlemobile.basket.font.e ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/basket/font/e;->a(Lcom/doodlemobile/basket/opengl/m;)V
} // :cond_1
/* iget v0, p0, Lcom/doodlemobile/basket/font/e;->y:I */
} // .end method

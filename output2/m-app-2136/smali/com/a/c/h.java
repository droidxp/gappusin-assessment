public class com.a.c.h {
	 /* # static fields */
	 public static Float g;
	 public static android.graphics.Paint h;
	 public static android.graphics.Paint i;
	 public static com.a.c.d j;
	 public static com.a.c.d k;
	 public static java.lang.String l;
	 /* # instance fields */
	 public java.util.ArrayList a;
	 public java.util.ArrayList b;
	 com.a.a.a c;
	 Float d;
	 android.graphics.Paint e;
	 public Float f;
	 /* # direct methods */
	 static com.a.c.h ( ) {
		 /* .locals 3 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v0, v0, [Ljava/lang/String; */
		 int v1 = 0; // const/4 v1, 0x0
		 final String v2 = "\u4ec5\u97006\u5143\u5373\u53ef\u6c38\u4e45\u6fc0\u6d3b\u6e38\u620f"; // const-string v2, "\u4ec5\u97006\u5143\u5373\u53ef\u6c38\u4e45\u6fc0\u6d3b\u6e38\u620f"
		 /* aput-object v2, v0, v1 */
		 int v1 = 1; // const/4 v1, 0x1
		 final String v2 = ""; // const-string v2, ""
		 /* aput-object v2, v0, v1 */
		 return;
	 } // .end method
	 public com.a.c.h ( ) {
		 /* .locals 11 */
		 int v10 = 1; // const/4 v10, 0x1
		 /* const/high16 v9, 0x40800000 # 4.0f */
		 /* const/high16 v8, 0x40000000 # 2.0f */
		 int v7 = 0; // const/4 v7, 0x0
		 /* const/high16 v6, 0x3fc00000 # 1.5f */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/a/c/h;->f:F */
		 this.c = p1;
		 v0 = this.aE;
		 this.a = v0;
		 v0 = this.aF;
		 this.b = v0;
		 /* const v0, 0x418ccccd # 17.6f */
		 /* iput v0, p0, Lcom/a/c/h;->d:F */
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 v0 = com.a.c.h.h;
		 /* int-to-float v1, v1 */
		 /* const/high16 v2, 0x41a00000 # 20.0f */
		 /* div-float/2addr v1, v2 */
		 (( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
		 v0 = com.a.c.h.h;
		 int v1 = -1; // const/4 v1, -0x1
		 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 v0 = com.a.c.h.i;
		 /* int-to-float v1, v1 */
		 /* const/high16 v2, 0x41f00000 # 30.0f */
		 /* div-float/2addr v1, v2 */
		 (( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
		 v0 = com.a.c.h.i;
		 int v1 = -1; // const/4 v1, -0x1
		 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 this.e = v0;
		 v0 = this.e;
		 /* const/high16 v1, -0x10000 */
		 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
		 v0 = this.e;
		 /* int-to-float v1, v1 */
		 /* const/high16 v2, 0x420c0000 # 35.0f */
		 /* div-float/2addr v1, v2 */
		 (( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
		 v0 = this.e;
		 /* const/high16 v1, 0x40400000 # 3.0f */
		 (( android.graphics.Paint ) v0 ).setStrokeWidth ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V
		 v0 = this.e;
		 /* const/16 v1, 0x96 */
		 (( android.graphics.Paint ) v0 ).setAlpha ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V
		 /* int-to-float v0, v0 */
		 /* iput v0, p0, Lcom/a/c/h;->f:F */
		 /* new-instance v0, Lcom/a/c/d; */
		 /* int-to-float v2, v1 */
		 v1 = this.ad;
		 (( java.util.ArrayList ) v1 ).get ( v7 ); // invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 v1 = 		 com.a.a.a .a ( v1,v6 );
		 /* sub-float v1, v2, v1 */
		 /* div-float v2, v1, v8 */
		 v1 = this.ad;
		 (( java.util.ArrayList ) v1 ).get ( v7 ); // invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 v1 = 		 com.a.a.a .a ( v1,v6 );
		 /* const/high16 v3, 0x41700000 # 15.0f */
		 /* div-float/2addr v1, v3 */
		 /* add-float/2addr v1, v2 */
		 /* int-to-float v3, v2 */
		 v2 = this.ad;
		 (( java.util.ArrayList ) v2 ).get ( v7 ); // invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v2, Landroid/graphics/Bitmap; */
		 v2 = 		 com.a.a.a .b ( v2,v6 );
		 /* div-float/2addr v2, v8 */
		 /* add-float/2addr v2, v3 */
		 /* div-float v3, v2, v8 */
		 v2 = this.ad;
		 (( java.util.ArrayList ) v2 ).get ( v7 ); // invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v2, Landroid/graphics/Bitmap; */
		 v2 = 		 com.a.a.a .b ( v2,v6 );
		 /* const/high16 v4, 0x41a00000 # 20.0f */
		 /* div-float/2addr v2, v4 */
		 /* sub-float v2, v3, v2 */
		 v3 = this.ad;
		 (( java.util.ArrayList ) v3 ).get ( v10 ); // invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v3, Landroid/graphics/Bitmap; */
		 v3 = 		 com.a.a.a .a ( v3,v9 );
		 v4 = this.ad;
		 (( java.util.ArrayList ) v4 ).get ( v10 ); // invoke-virtual {v4, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v4, Landroid/graphics/Bitmap; */
		 v4 = 		 com.a.a.a .b ( v4,v9 );
		 /* const/16 v5, 0x12 */
		 /* invoke-direct/range {v0 ..v5}, Lcom/a/c/d;-><init>(FFFFI)V */
		 /* new-instance v0, Lcom/a/c/d; */
		 /* int-to-float v2, v1 */
		 v1 = this.ad;
		 (( java.util.ArrayList ) v1 ).get ( v7 ); // invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 v1 = 		 com.a.a.a .a ( v1,v6 );
		 /* add-float/2addr v1, v2 */
		 /* div-float v2, v1, v8 */
		 v1 = this.ad;
		 int v3 = 2; // const/4 v3, 0x2
		 (( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 v1 = 		 com.a.a.a .a ( v1,v9 );
		 /* sub-float/2addr v2, v1 */
		 v1 = this.ad;
		 (( java.util.ArrayList ) v1 ).get ( v7 ); // invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 v1 = 		 com.a.a.a .a ( v1,v6 );
		 /* const/high16 v3, 0x41700000 # 15.0f */
		 /* div-float/2addr v1, v3 */
		 /* sub-float v1, v2, v1 */
		 /* int-to-float v3, v2 */
		 v2 = this.ad;
		 (( java.util.ArrayList ) v2 ).get ( v7 ); // invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v2, Landroid/graphics/Bitmap; */
		 v2 = 		 com.a.a.a .b ( v2,v6 );
		 /* div-float/2addr v2, v8 */
		 /* add-float/2addr v2, v3 */
		 /* div-float v3, v2, v8 */
		 v2 = this.ad;
		 (( java.util.ArrayList ) v2 ).get ( v7 ); // invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v2, Landroid/graphics/Bitmap; */
		 v2 = 		 com.a.a.a .b ( v2,v6 );
		 /* const/high16 v4, 0x41a00000 # 20.0f */
		 /* div-float/2addr v2, v4 */
		 /* sub-float v2, v3, v2 */
		 v3 = this.ad;
		 (( java.util.ArrayList ) v3 ).get ( v10 ); // invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v3, Landroid/graphics/Bitmap; */
		 v3 = 		 com.a.a.a .a ( v3,v9 );
		 v4 = this.ad;
		 (( java.util.ArrayList ) v4 ).get ( v10 ); // invoke-virtual {v4, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v4, Landroid/graphics/Bitmap; */
		 v4 = 		 com.a.a.a .b ( v4,v9 );
		 /* const/16 v5, 0x13 */
		 /* invoke-direct/range {v0 ..v5}, Lcom/a/c/d;-><init>(FFFFI)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.graphics.Canvas p0, Integer p1, Float p2, android.graphics.Paint p3 ) {
		 /* .locals 11 */
		 /* const/high16 v7, 0x3f800000 # 1.0f */
		 /* const/high16 v5, 0x40400000 # 3.0f */
		 int v10 = 3; // const/4 v10, 0x3
		 int v9 = 0; // const/4 v9, 0x0
		 int v3 = 0; // const/4 v3, 0x0
		 v0 = this.c;
		 v0 = this.aF;
		 v1 = this.c;
		 v1 = this.b;
		 v1 = this.i;
		 v1 = com.a.e.d.M;
		 /* aget v1, v1, v10 */
		 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* move-object v8, v0 */
		 /* check-cast v8, Landroid/graphics/Bitmap; */
		 v0 = this.c;
		 v0 = this.aF;
		 v1 = this.c;
		 v1 = this.b;
		 v1 = this.i;
		 v1 = com.a.e.d.M;
		 /* aget v1, v1, v10 */
		 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 /* int-to-float v2, v1 */
		 v1 = this.c;
		 v1 = this.aF;
		 v4 = this.c;
		 v4 = this.b;
		 v4 = this.i;
		 v4 = com.a.e.d.M;
		 /* aget v4, v4, v10 */
		 (( java.util.ArrayList ) v1 ).get ( v4 ); // invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 v1 = 		 com.a.a.a .a ( v1,v5 );
		 /* sub-float v1, v2, v1 */
		 /* const/high16 v2, 0x40000000 # 2.0f */
		 /* div-float/2addr v1, v2 */
		 /* int-to-float v4, v2 */
		 v2 = this.c;
		 v2 = this.aF;
		 v6 = this.c;
		 v6 = this.b;
		 v6 = this.i;
		 v6 = com.a.e.d.M;
		 /* aget v6, v6, v10 */
		 (( java.util.ArrayList ) v2 ).get ( v6 ); // invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v2, Landroid/graphics/Bitmap; */
		 v2 = 		 com.a.a.a .b ( v2,v5 );
		 /* sub-float v2, v4, v2 */
		 /* const/high16 v6, 0x40a00000 # 5.0f */
		 /* move v4, v3 */
		 /* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
		 (( android.graphics.Canvas ) p1 ).drawBitmap ( v8, v0, p4 ); // invoke-virtual {p1, v8, v0, p4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
		 v0 = this.a;
		 (( java.util.ArrayList ) v0 ).get ( v9 ); // invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 v1 = this.a;
		 (( java.util.ArrayList ) v1 ).get ( v9 ); // invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v2, Landroid/graphics/Bitmap; */
		 /* int-to-float v4, v1 */
		 v1 = this.a;
		 (( java.util.ArrayList ) v1 ).get ( v9 ); // invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 v1 = 		 (( android.graphics.Bitmap ) v1 ).getHeight ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I
		 /* int-to-float v5, v1 */
		 /* int-to-float v1, v1 */
		 /* div-float v6, v1, v7 */
		 v1 = this.a;
		 (( java.util.ArrayList ) v1 ).get ( v9 ); // invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 v1 = 		 (( android.graphics.Bitmap ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I
		 /* int-to-float v1, v1 */
		 /* div-float v1, v6, v1 */
		 /* mul-float/2addr v1, v5 */
		 /* sub-float/2addr v4, v1 */
		 /* const/high16 v8, 0x40c00000 # 6.0f */
		 /* move v5, v3 */
		 /* move v6, v3 */
		 /* invoke-static/range {v2 ..v8}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
		 (( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, p4 ); // invoke-virtual {p1, v0, v1, p4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
		 return;
	 } // .end method
	 public void a ( android.graphics.Canvas p0, android.graphics.Paint p1 ) {
		 /* .locals 8 */
		 v0 = this.c;
		 v0 = this.ad;
		 int v1 = 0; // const/4 v1, 0x0
		 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* move-object v7, v0 */
		 /* check-cast v7, Landroid/graphics/Bitmap; */
		 v0 = this.c;
		 v0 = this.ad;
		 int v1 = 0; // const/4 v1, 0x0
		 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 /* int-to-float v2, v1 */
		 v1 = this.c;
		 v1 = this.ad;
		 int v3 = 0; // const/4 v3, 0x0
		 (( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 /* const/high16 v3, 0x3fc00000 # 1.5f */
		 v1 = 		 com.a.a.a .a ( v1,v3 );
		 /* sub-float v1, v2, v1 */
		 /* const/high16 v2, 0x40000000 # 2.0f */
		 /* div-float/2addr v1, v2 */
		 /* int-to-float v3, v2 */
		 v2 = this.c;
		 v2 = this.ad;
		 int v4 = 0; // const/4 v4, 0x0
		 (( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v2, Landroid/graphics/Bitmap; */
		 /* const/high16 v4, 0x3fc00000 # 1.5f */
		 v2 = 		 com.a.a.a .b ( v2,v4 );
		 /* sub-float v2, v3, v2 */
		 /* const/high16 v3, 0x40000000 # 2.0f */
		 /* div-float/2addr v2, v3 */
		 int v3 = 0; // const/4 v3, 0x0
		 int v4 = 0; // const/4 v4, 0x0
		 /* const/high16 v5, 0x3fc00000 # 1.5f */
		 /* const/high16 v6, 0x3fc00000 # 1.5f */
		 /* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
		 (( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
		 final String v1 = "\u6fc0\u6d3b\u6e38\u620f\uff1a"; // const-string v1, "\u6fc0\u6d3b\u6e38\u620f\uff1a"
		 /* div-int/lit8 v0, v0, 0x2 */
		 /* int-to-float v0, v0 */
		 /* int-to-float v2, v2 */
		 /* const/high16 v3, 0x41a00000 # 20.0f */
		 /* div-float/2addr v2, v3 */
		 /* const/high16 v3, 0x40000000 # 2.0f */
		 /* mul-float/2addr v2, v3 */
		 /* sub-float v2, v0, v2 */
		 /* int-to-float v3, v0 */
		 v0 = this.c;
		 v0 = this.ad;
		 int v4 = 0; // const/4 v4, 0x0
		 (( java.util.ArrayList ) v0 ).get ( v4 ); // invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 /* const/high16 v4, 0x3fc00000 # 1.5f */
		 v0 = 		 com.a.a.a .b ( v0,v4 );
		 /* const/high16 v4, 0x41200000 # 10.0f */
		 /* div-float/2addr v0, v4 */
		 /* const/high16 v4, 0x40a00000 # 5.0f */
		 /* mul-float/2addr v0, v4 */
		 /* sub-float v0, v3, v0 */
		 /* const/high16 v3, 0x40000000 # 2.0f */
		 /* div-float/2addr v0, v3 */
		 v3 = com.a.c.h.h;
		 (( android.graphics.Canvas ) p1 ).drawText ( v1, v2, v0, v3 ); // invoke-virtual {p1, v1, v2, v0, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
		 v0 = com.a.c.h.l;
		 int v1 = 0; // const/4 v1, 0x0
		 /* aget-object v1, v0, v1 */
		 /* div-int/lit8 v0, v0, 0x2 */
		 /* int-to-float v0, v0 */
		 /* int-to-float v2, v2 */
		 /* const/high16 v3, 0x41f00000 # 30.0f */
		 /* div-float/2addr v2, v3 */
		 v3 = com.a.c.h.l;
		 int v4 = 0; // const/4 v4, 0x0
		 /* aget-object v3, v3, v4 */
		 v3 = 		 (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
		 /* div-int/lit8 v3, v3, 0x2 */
		 /* int-to-float v3, v3 */
		 /* mul-float/2addr v2, v3 */
		 /* sub-float v2, v0, v2 */
		 /* int-to-float v3, v0 */
		 v0 = this.c;
		 v0 = this.ad;
		 int v4 = 0; // const/4 v4, 0x0
		 (( java.util.ArrayList ) v0 ).get ( v4 ); // invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 /* const/high16 v4, 0x3fc00000 # 1.5f */
		 v0 = 		 com.a.a.a .b ( v0,v4 );
		 /* const/high16 v4, 0x41200000 # 10.0f */
		 /* div-float/2addr v0, v4 */
		 /* sub-float v0, v3, v0 */
		 /* const/high16 v3, 0x40000000 # 2.0f */
		 /* div-float/2addr v0, v3 */
		 v3 = com.a.c.h.i;
		 (( android.graphics.Canvas ) p1 ).drawText ( v1, v2, v0, v3 ); // invoke-virtual {p1, v1, v2, v0, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
		 v0 = com.a.c.h.l;
		 int v1 = 1; // const/4 v1, 0x1
		 /* aget-object v1, v0, v1 */
		 /* div-int/lit8 v0, v0, 0x2 */
		 /* int-to-float v0, v0 */
		 /* int-to-float v2, v2 */
		 /* const/high16 v3, 0x41f00000 # 30.0f */
		 /* div-float/2addr v2, v3 */
		 v3 = com.a.c.h.l;
		 int v4 = 0; // const/4 v4, 0x0
		 /* aget-object v3, v3, v4 */
		 v3 = 		 (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
		 /* div-int/lit8 v3, v3, 0x2 */
		 /* int-to-float v3, v3 */
		 /* mul-float/2addr v2, v3 */
		 /* sub-float v2, v0, v2 */
		 /* int-to-float v3, v0 */
		 v0 = this.c;
		 v0 = this.ad;
		 int v4 = 0; // const/4 v4, 0x0
		 (( java.util.ArrayList ) v0 ).get ( v4 ); // invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 /* const/high16 v4, 0x3fc00000 # 1.5f */
		 v0 = 		 com.a.a.a .b ( v0,v4 );
		 /* const/high16 v4, 0x41200000 # 10.0f */
		 /* div-float/2addr v0, v4 */
		 /* sub-float v0, v3, v0 */
		 /* const/high16 v3, 0x40000000 # 2.0f */
		 /* div-float/2addr v0, v3 */
		 /* const/high16 v3, 0x42200000 # 40.0f */
		 com.a.a.a .b ( v3 );
		 v3 = 		 (( java.lang.Float ) v3 ).floatValue ( ); // invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F
		 /* add-float/2addr v0, v3 */
		 v3 = com.a.c.h.i;
		 (( android.graphics.Canvas ) p1 ).drawText ( v1, v2, v0, v3 ); // invoke-virtual {p1, v1, v2, v0, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
		 v0 = this.c;
		 v0 = this.ad;
		 int v1 = 1; // const/4 v1, 0x1
		 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* move-object v7, v0 */
		 /* check-cast v7, Landroid/graphics/Bitmap; */
		 v0 = this.c;
		 v0 = this.ad;
		 int v1 = 1; // const/4 v1, 0x1
		 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 /* int-to-float v2, v1 */
		 v1 = this.c;
		 v1 = this.ad;
		 int v3 = 0; // const/4 v3, 0x0
		 (( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 /* const/high16 v3, 0x3fc00000 # 1.5f */
		 v1 = 		 com.a.a.a .a ( v1,v3 );
		 /* sub-float v1, v2, v1 */
		 /* const/high16 v2, 0x40000000 # 2.0f */
		 /* div-float v2, v1, v2 */
		 v1 = this.c;
		 v1 = this.ad;
		 int v3 = 0; // const/4 v3, 0x0
		 (( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 /* const/high16 v3, 0x3fc00000 # 1.5f */
		 v1 = 		 com.a.a.a .a ( v1,v3 );
		 /* const/high16 v3, 0x41700000 # 15.0f */
		 /* div-float/2addr v1, v3 */
		 /* add-float/2addr v1, v2 */
		 /* int-to-float v3, v2 */
		 v2 = this.c;
		 v2 = this.ad;
		 int v4 = 0; // const/4 v4, 0x0
		 (( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v2, Landroid/graphics/Bitmap; */
		 /* const/high16 v4, 0x3fc00000 # 1.5f */
		 v2 = 		 com.a.a.a .b ( v2,v4 );
		 /* const/high16 v4, 0x40000000 # 2.0f */
		 /* div-float/2addr v2, v4 */
		 /* add-float/2addr v2, v3 */
		 /* const/high16 v3, 0x40000000 # 2.0f */
		 /* div-float v3, v2, v3 */
		 v2 = this.c;
		 v2 = this.ad;
		 int v4 = 0; // const/4 v4, 0x0
		 (( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v2, Landroid/graphics/Bitmap; */
		 /* const/high16 v4, 0x3fc00000 # 1.5f */
		 v2 = 		 com.a.a.a .b ( v2,v4 );
		 /* const/high16 v4, 0x41a00000 # 20.0f */
		 /* div-float/2addr v2, v4 */
		 /* sub-float v2, v3, v2 */
		 int v3 = 0; // const/4 v3, 0x0
		 int v4 = 0; // const/4 v4, 0x0
		 /* const/high16 v5, 0x40800000 # 4.0f */
		 /* const/high16 v6, 0x40800000 # 4.0f */
		 /* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
		 (( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
		 v0 = this.c;
		 v0 = this.ad;
		 int v1 = 2; // const/4 v1, 0x2
		 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* move-object v7, v0 */
		 /* check-cast v7, Landroid/graphics/Bitmap; */
		 v0 = this.c;
		 v0 = this.ad;
		 int v1 = 2; // const/4 v1, 0x2
		 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 /* int-to-float v2, v1 */
		 v1 = this.c;
		 v1 = this.ad;
		 int v3 = 0; // const/4 v3, 0x0
		 (( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 /* const/high16 v3, 0x3fc00000 # 1.5f */
		 v1 = 		 com.a.a.a .a ( v1,v3 );
		 /* add-float/2addr v1, v2 */
		 /* const/high16 v2, 0x40000000 # 2.0f */
		 /* div-float v2, v1, v2 */
		 v1 = this.c;
		 v1 = this.ad;
		 int v3 = 2; // const/4 v3, 0x2
		 (( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 /* const/high16 v3, 0x40800000 # 4.0f */
		 v1 = 		 com.a.a.a .a ( v1,v3 );
		 /* sub-float/2addr v2, v1 */
		 v1 = this.c;
		 v1 = this.ad;
		 int v3 = 0; // const/4 v3, 0x0
		 (( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 /* const/high16 v3, 0x3fc00000 # 1.5f */
		 v1 = 		 com.a.a.a .a ( v1,v3 );
		 /* const/high16 v3, 0x41700000 # 15.0f */
		 /* div-float/2addr v1, v3 */
		 /* sub-float v1, v2, v1 */
		 /* int-to-float v3, v2 */
		 v2 = this.c;
		 v2 = this.ad;
		 int v4 = 0; // const/4 v4, 0x0
		 (( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v2, Landroid/graphics/Bitmap; */
		 /* const/high16 v4, 0x3fc00000 # 1.5f */
		 v2 = 		 com.a.a.a .b ( v2,v4 );
		 /* const/high16 v4, 0x40000000 # 2.0f */
		 /* div-float/2addr v2, v4 */
		 /* add-float/2addr v2, v3 */
		 /* const/high16 v3, 0x40000000 # 2.0f */
		 /* div-float v3, v2, v3 */
		 v2 = this.c;
		 v2 = this.ad;
		 int v4 = 0; // const/4 v4, 0x0
		 (( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v2, Landroid/graphics/Bitmap; */
		 /* const/high16 v4, 0x3fc00000 # 1.5f */
		 v2 = 		 com.a.a.a .b ( v2,v4 );
		 /* const/high16 v4, 0x41a00000 # 20.0f */
		 /* div-float/2addr v2, v4 */
		 /* sub-float v2, v3, v2 */
		 int v3 = 0; // const/4 v3, 0x0
		 int v4 = 0; // const/4 v4, 0x0
		 /* const/high16 v5, 0x40800000 # 4.0f */
		 /* const/high16 v6, 0x40800000 # 4.0f */
		 /* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
		 (( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p2 ); // invoke-virtual {p1, v7, v0, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
		 return;
	 } // .end method
	 public void b ( android.graphics.Canvas p0, Integer p1, Float p2, android.graphics.Paint p3 ) {
		 /* .locals 8 */
		 v0 = this.c;
		 v7 = this.ag;
		 v0 = this.c;
		 v0 = this.ag;
		 int v1 = 0; // const/4 v1, 0x0
		 int v2 = 0; // const/4 v2, 0x0
		 int v3 = 0; // const/4 v3, 0x0
		 int v4 = 0; // const/4 v4, 0x0
		 /* const/high16 v5, 0x3f800000 # 1.0f */
		 /* const/high16 v6, 0x40c00000 # 6.0f */
		 /* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->b(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
		 (( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p4 ); // invoke-virtual {p1, v7, v0, p4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
		 v0 = this.c;
		 v0 = this.S;
		 int v1 = 0; // const/4 v1, 0x0
		 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* move-object v7, v0 */
		 /* check-cast v7, Landroid/graphics/Bitmap; */
		 v0 = this.c;
		 v0 = this.S;
		 int v1 = 0; // const/4 v1, 0x0
		 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* const/high16 v2, 0x41700000 # 15.0f */
		 com.a.a.a .b ( v2 );
		 v2 = 		 (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
		 int v3 = 0; // const/4 v3, 0x0
		 int v4 = 0; // const/4 v4, 0x0
		 /* const/high16 v5, 0x40600000 # 3.5f */
		 /* const/high16 v6, 0x40c00000 # 6.0f */
		 /* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
		 (( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p4 ); // invoke-virtual {p1, v7, v0, p4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
		 v0 = this.c;
		 v0 = this.S;
		 int v1 = 4; // const/4 v1, 0x4
		 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* move-object v7, v0 */
		 /* check-cast v7, Landroid/graphics/Bitmap; */
		 v0 = this.c;
		 v0 = this.S;
		 int v1 = 4; // const/4 v1, 0x4
		 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 /* const/high16 v1, 0x41200000 # 10.0f */
		 com.a.a.a .a ( v1 );
		 v1 = 		 (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
		 /* const/high16 v2, 0x41700000 # 15.0f */
		 com.a.a.a .b ( v2 );
		 v2 = 		 (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
		 int v3 = 0; // const/4 v3, 0x0
		 int v4 = 0; // const/4 v4, 0x0
		 /* const/high16 v5, 0x41400000 # 12.0f */
		 /* const/high16 v6, 0x40600000 # 3.5f */
		 /* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
		 (( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p4 ); // invoke-virtual {p1, v7, v0, p4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
		 (( android.graphics.Canvas ) p1 ).save ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
		 v0 = this.c;
		 v0 = this.S;
		 int v1 = 0; // const/4 v1, 0x0
		 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 /* const/high16 v1, 0x40600000 # 3.5f */
		 v0 = 		 com.a.a.a .a ( v0,v1 );
		 /* const/high16 v1, 0x41c00000 # 24.0f */
		 /* div-float/2addr v0, v1 */
		 /* const v1, 0x4104cccd # 8.3f */
		 /* mul-float/2addr v1, v0 */
		 /* const/high16 v0, 0x42200000 # 40.0f */
		 com.a.a.a .b ( v0 );
		 v2 = 		 (( java.lang.Float ) v0 ).floatValue ( ); // invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
		 v0 = this.c;
		 v0 = this.S;
		 int v3 = 0; // const/4 v3, 0x0
		 (( java.util.ArrayList ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 /* const/high16 v3, 0x40600000 # 3.5f */
		 v0 = 		 com.a.a.a .a ( v0,v3 );
		 /* const/high16 v3, 0x41c00000 # 24.0f */
		 /* div-float/2addr v0, v3 */
		 /* const v3, 0x4104cccd # 8.3f */
		 /* mul-float/2addr v3, v0 */
		 v0 = this.c;
		 v0 = this.S;
		 int v4 = 1; // const/4 v4, 0x1
		 (( java.util.ArrayList ) v0 ).get ( v4 ); // invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 /* const/high16 v4, 0x40c00000 # 6.0f */
		 v0 = 		 com.a.a.a .a ( v0,v4 );
		 /* iget v4, p0, Lcom/a/c/h;->f:F */
		 /* div-float/2addr v0, v4 */
		 /* int-to-float v4, v4 */
		 /* mul-float/2addr v0, v4 */
		 /* add-float/2addr v0, v3 */
		 /* const/high16 v3, 0x428c0000 # 70.0f */
		 com.a.a.a .b ( v3 );
		 v3 = 		 (( java.lang.Float ) v3 ).floatValue ( ); // invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F
		 (( android.graphics.Canvas ) p1 ).clipRect ( v1, v2, v0, v3 ); // invoke-virtual {p1, v1, v2, v0, v3}, Landroid/graphics/Canvas;->clipRect(FFFF)Z
		 v0 = this.c;
		 v0 = this.S;
		 int v1 = 1; // const/4 v1, 0x1
		 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* move-object v7, v0 */
		 /* check-cast v7, Landroid/graphics/Bitmap; */
		 v0 = this.c;
		 v0 = this.S;
		 int v1 = 1; // const/4 v1, 0x1
		 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 v1 = this.c;
		 v1 = this.S;
		 int v2 = 0; // const/4 v2, 0x0
		 (( java.util.ArrayList ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 /* const/high16 v2, 0x40600000 # 3.5f */
		 v1 = 		 com.a.a.a .a ( v1,v2 );
		 /* const/high16 v2, 0x41c00000 # 24.0f */
		 /* div-float/2addr v1, v2 */
		 /* const v2, 0x4104cccd # 8.3f */
		 /* mul-float/2addr v1, v2 */
		 /* const/high16 v2, 0x41700000 # 15.0f */
		 com.a.a.a .b ( v2 );
		 v3 = 		 (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
		 v2 = this.c;
		 v2 = this.S;
		 int v4 = 0; // const/4 v4, 0x0
		 (( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v2, Landroid/graphics/Bitmap; */
		 /* const/high16 v4, 0x40600000 # 3.5f */
		 v2 = 		 com.a.a.a .b ( v2,v4 );
		 /* const/high16 v4, 0x41a00000 # 20.0f */
		 /* div-float/2addr v2, v4 */
		 /* const v4, 0x40c66666 # 6.2f */
		 /* mul-float/2addr v2, v4 */
		 /* add-float/2addr v2, v3 */
		 int v3 = 0; // const/4 v3, 0x0
		 int v4 = 0; // const/4 v4, 0x0
		 /* const/high16 v5, 0x40c00000 # 6.0f */
		 /* const/high16 v6, 0x41900000 # 18.0f */
		 /* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
		 (( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p4 ); // invoke-virtual {p1, v7, v0, p4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
		 (( android.graphics.Canvas ) p1 ).restore ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
		 (( android.graphics.Canvas ) p1 ).save ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
		 v0 = this.c;
		 v0 = this.S;
		 int v1 = 0; // const/4 v1, 0x0
		 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 /* const/high16 v1, 0x40600000 # 3.5f */
		 v0 = 		 com.a.a.a .a ( v0,v1 );
		 /* const/high16 v1, 0x41c00000 # 24.0f */
		 /* div-float/2addr v0, v1 */
		 /* const v1, 0x4104cccd # 8.3f */
		 /* mul-float/2addr v1, v0 */
		 /* const/high16 v0, 0x41700000 # 15.0f */
		 com.a.a.a .b ( v0 );
		 v2 = 		 (( java.lang.Float ) v0 ).floatValue ( ); // invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
		 v0 = this.c;
		 v0 = this.S;
		 int v3 = 0; // const/4 v3, 0x0
		 (( java.util.ArrayList ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 /* const/high16 v3, 0x40600000 # 3.5f */
		 v0 = 		 com.a.a.a .b ( v0,v3 );
		 /* const/high16 v3, 0x41a00000 # 20.0f */
		 /* div-float/2addr v0, v3 */
		 /* const/high16 v3, 0x40c00000 # 6.0f */
		 /* mul-float/2addr v0, v3 */
		 /* add-float/2addr v2, v0 */
		 v0 = this.c;
		 v0 = this.S;
		 int v3 = 0; // const/4 v3, 0x0
		 (( java.util.ArrayList ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 /* const/high16 v3, 0x40600000 # 3.5f */
		 v0 = 		 com.a.a.a .a ( v0,v3 );
		 /* const/high16 v3, 0x41c00000 # 24.0f */
		 /* div-float/2addr v0, v3 */
		 /* const v3, 0x4104cccd # 8.3f */
		 /* mul-float/2addr v3, v0 */
		 v0 = this.c;
		 v0 = this.S;
		 int v4 = 1; // const/4 v4, 0x1
		 (( java.util.ArrayList ) v0 ).get ( v4 ); // invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 /* const/high16 v4, 0x40c00000 # 6.0f */
		 v0 = 		 com.a.a.a .a ( v0,v4 );
		 /* add-float/2addr v0, v3 */
		 /* const/high16 v3, 0x428c0000 # 70.0f */
		 com.a.a.a .b ( v3 );
		 v3 = 		 (( java.lang.Float ) v3 ).floatValue ( ); // invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F
		 (( android.graphics.Canvas ) p1 ).clipRect ( v1, v2, v0, v3 ); // invoke-virtual {p1, v1, v2, v0, v3}, Landroid/graphics/Canvas;->clipRect(FFFF)Z
		 /* iget v0, p0, Lcom/a/c/h;->f:F */
		 /* cmpg-float v0, p3, v0 */
		 /* if-gez v0, :cond_0 */
		 v0 = this.c;
		 v0 = this.W;
		 int v1 = 0; // const/4 v1, 0x0
		 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* move-object v7, v0 */
		 /* check-cast v7, Landroid/graphics/Bitmap; */
		 v0 = this.c;
		 v0 = this.W;
		 int v1 = 0; // const/4 v1, 0x0
		 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 v1 = this.c;
		 v1 = this.S;
		 int v2 = 0; // const/4 v2, 0x0
		 (( java.util.ArrayList ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 /* const/high16 v2, 0x40600000 # 3.5f */
		 v1 = 		 com.a.a.a .a ( v1,v2 );
		 /* const/high16 v2, 0x41c00000 # 24.0f */
		 /* div-float/2addr v1, v2 */
		 /* const v2, 0x4104cccd # 8.3f */
		 /* mul-float/2addr v2, v1 */
		 v1 = this.c;
		 v1 = this.S;
		 int v3 = 1; // const/4 v3, 0x1
		 (( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 /* const/high16 v3, 0x40c00000 # 6.0f */
		 v1 = 		 com.a.a.a .a ( v1,v3 );
		 /* iget v3, p0, Lcom/a/c/h;->f:F */
		 /* div-float/2addr v1, v3 */
		 /* int-to-float v3, v3 */
		 /* mul-float/2addr v1, v3 */
		 /* add-float/2addr v2, v1 */
		 v1 = this.c;
		 v1 = this.W;
		 int v3 = 0; // const/4 v3, 0x0
		 (( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v1, Landroid/graphics/Bitmap; */
		 /* const/high16 v3, 0x41a00000 # 20.0f */
		 v1 = 		 com.a.a.a .a ( v1,v3 );
		 /* const/high16 v3, 0x40000000 # 2.0f */
		 /* div-float/2addr v1, v3 */
		 /* sub-float v1, v2, v1 */
		 /* const/high16 v2, 0x41700000 # 15.0f */
		 com.a.a.a .b ( v2 );
		 v3 = 		 (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
		 v2 = this.c;
		 v2 = this.S;
		 int v4 = 0; // const/4 v4, 0x0
		 (( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v2, Landroid/graphics/Bitmap; */
		 /* const/high16 v4, 0x40600000 # 3.5f */
		 v2 = 		 com.a.a.a .b ( v2,v4 );
		 /* const/high16 v4, 0x41a00000 # 20.0f */
		 /* div-float/2addr v2, v4 */
		 /* const v4, 0x40c33333 # 6.1f */
		 /* mul-float/2addr v2, v4 */
		 /* add-float/2addr v2, v3 */
		 int v3 = 0; // const/4 v3, 0x0
		 int v4 = 0; // const/4 v4, 0x0
		 /* const/high16 v5, 0x41c80000 # 25.0f */
		 /* const/high16 v6, 0x41600000 # 14.0f */
		 /* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->b(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
		 (( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p4 ); // invoke-virtual {p1, v7, v0, p4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
	 } // :cond_0
	 (( android.graphics.Canvas ) p1 ).restore ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
	 v0 = this.c;
	 v0 = this.S;
	 int v1 = 0; // const/4 v1, 0x0
	 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* move-object v7, v0 */
	 /* check-cast v7, Landroid/graphics/Bitmap; */
	 v0 = this.c;
	 v0 = this.S;
	 int v1 = 0; // const/4 v1, 0x0
	 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v0, Landroid/graphics/Bitmap; */
	 /* const/high16 v1, 0x44480000 # 800.0f */
	 com.a.a.a .a ( v1 );
	 v1 = 	 (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
	 /* const/high16 v2, 0x41700000 # 15.0f */
	 com.a.a.a .b ( v2 );
	 v2 = 	 (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
	 int v3 = 0; // const/4 v3, 0x0
	 int v4 = 0; // const/4 v4, 0x0
	 /* const/high16 v5, 0x40600000 # 3.5f */
	 /* const/high16 v6, 0x40c00000 # 6.0f */
	 /* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->d(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
	 (( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p4 ); // invoke-virtual {p1, v7, v0, p4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
	 v0 = this.c;
	 v0 = this.S;
	 int v1 = 3; // const/4 v1, 0x3
	 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* move-object v7, v0 */
	 /* check-cast v7, Landroid/graphics/Bitmap; */
	 v0 = this.c;
	 v0 = this.S;
	 int v1 = 3; // const/4 v1, 0x3
	 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v0, Landroid/graphics/Bitmap; */
	 /* int-to-float v2, v1 */
	 v1 = this.c;
	 v1 = this.S;
	 int v3 = 0; // const/4 v3, 0x0
	 (( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v1, Landroid/graphics/Bitmap; */
	 /* const/high16 v3, 0x41200000 # 10.0f */
	 v1 = 	 com.a.a.a .a ( v1,v3 );
	 /* sub-float v1, v2, v1 */
	 /* const/high16 v2, 0x41700000 # 15.0f */
	 com.a.a.a .a ( v2 );
	 v2 = 	 (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
	 int v3 = 0; // const/4 v3, 0x0
	 int v4 = 0; // const/4 v4, 0x0
	 /* const/high16 v5, 0x41200000 # 10.0f */
	 /* const/high16 v6, 0x40600000 # 3.5f */
	 /* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
	 (( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p4 ); // invoke-virtual {p1, v7, v0, p4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
	 (( android.graphics.Canvas ) p1 ).save ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
	 /* const/high16 v0, 0x44480000 # 800.0f */
	 com.a.a.a .a ( v0 );
	 v1 = 	 (( java.lang.Float ) v0 ).floatValue ( ); // invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
	 v0 = this.c;
	 v0 = this.S;
	 int v2 = 0; // const/4 v2, 0x0
	 (( java.util.ArrayList ) v0 ).get ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v0, Landroid/graphics/Bitmap; */
	 /* const/high16 v2, 0x40600000 # 3.5f */
	 v0 = 	 com.a.a.a .a ( v0,v2 );
	 /* const/high16 v2, 0x41c00000 # 24.0f */
	 /* div-float/2addr v0, v2 */
	 /* const v2, 0x4104cccd # 8.3f */
	 /* mul-float/2addr v0, v2 */
	 /* sub-float/2addr v1, v0 */
	 v0 = this.c;
	 v0 = this.S;
	 int v2 = 2; // const/4 v2, 0x2
	 (( java.util.ArrayList ) v0 ).get ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v0, Landroid/graphics/Bitmap; */
	 /* const/high16 v2, 0x40c00000 # 6.0f */
	 v0 = 	 com.a.a.a .a ( v0,v2 );
	 /* div-float/2addr v0, v2 */
	 /* mul-float/2addr v0, v2 */
	 /* sub-float/2addr v1, v0 */
	 /* const/high16 v0, 0x41700000 # 15.0f */
	 com.a.a.a .b ( v0 );
	 v2 = 	 (( java.lang.Float ) v0 ).floatValue ( ); // invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
	 v0 = this.c;
	 v0 = this.S;
	 int v3 = 0; // const/4 v3, 0x0
	 (( java.util.ArrayList ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v0, Landroid/graphics/Bitmap; */
	 /* const/high16 v3, 0x40600000 # 3.5f */
	 v0 = 	 com.a.a.a .b ( v0,v3 );
	 /* const/high16 v3, 0x41a00000 # 20.0f */
	 /* div-float/2addr v0, v3 */
	 /* const v3, 0x40c66666 # 6.2f */
	 /* mul-float/2addr v0, v3 */
	 /* add-float/2addr v2, v0 */
	 /* const/high16 v0, 0x44480000 # 800.0f */
	 com.a.a.a .a ( v0 );
	 v3 = 	 (( java.lang.Float ) v0 ).floatValue ( ); // invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
	 v0 = this.c;
	 v0 = this.S;
	 int v4 = 0; // const/4 v4, 0x0
	 (( java.util.ArrayList ) v0 ).get ( v4 ); // invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v0, Landroid/graphics/Bitmap; */
	 /* const/high16 v4, 0x40600000 # 3.5f */
	 v0 = 	 com.a.a.a .a ( v0,v4 );
	 /* const/high16 v4, 0x41c00000 # 24.0f */
	 /* div-float/2addr v0, v4 */
	 /* const v4, 0x4104cccd # 8.3f */
	 /* mul-float/2addr v0, v4 */
	 /* sub-float v0, v3, v0 */
	 /* const/high16 v3, 0x42c80000 # 100.0f */
	 com.a.a.a .b ( v3 );
	 v3 = 	 (( java.lang.Float ) v3 ).floatValue ( ); // invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F
	 (( android.graphics.Canvas ) p1 ).clipRect ( v1, v2, v0, v3 ); // invoke-virtual {p1, v1, v2, v0, v3}, Landroid/graphics/Canvas;->clipRect(FFFF)Z
	 v0 = this.c;
	 v0 = this.S;
	 int v1 = 2; // const/4 v1, 0x2
	 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* move-object v7, v0 */
	 /* check-cast v7, Landroid/graphics/Bitmap; */
	 v0 = this.c;
	 v0 = this.S;
	 int v1 = 2; // const/4 v1, 0x2
	 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v0, Landroid/graphics/Bitmap; */
	 /* const/high16 v1, 0x44480000 # 800.0f */
	 com.a.a.a .a ( v1 );
	 v2 = 	 (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
	 v1 = this.c;
	 v1 = this.S;
	 int v3 = 0; // const/4 v3, 0x0
	 (( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v1, Landroid/graphics/Bitmap; */
	 /* const/high16 v3, 0x40600000 # 3.5f */
	 v1 = 	 com.a.a.a .a ( v1,v3 );
	 /* const/high16 v3, 0x41c00000 # 24.0f */
	 /* div-float/2addr v1, v3 */
	 /* const/high16 v3, 0x41080000 # 8.5f */
	 /* mul-float/2addr v1, v3 */
	 /* sub-float/2addr v2, v1 */
	 v1 = this.c;
	 v1 = this.S;
	 int v3 = 2; // const/4 v3, 0x2
	 (( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v1, Landroid/graphics/Bitmap; */
	 /* const/high16 v3, 0x40c00000 # 6.0f */
	 v1 = 	 com.a.a.a .a ( v1,v3 );
	 /* sub-float v1, v2, v1 */
	 /* const/high16 v2, 0x41700000 # 15.0f */
	 com.a.a.a .b ( v2 );
	 v3 = 	 (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
	 v2 = this.c;
	 v2 = this.S;
	 int v4 = 0; // const/4 v4, 0x0
	 (( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v2, Landroid/graphics/Bitmap; */
	 /* const/high16 v4, 0x40600000 # 3.5f */
	 v2 = 	 com.a.a.a .b ( v2,v4 );
	 /* const/high16 v4, 0x41a00000 # 20.0f */
	 /* div-float/2addr v2, v4 */
	 /* const v4, 0x40c66666 # 6.2f */
	 /* mul-float/2addr v2, v4 */
	 /* add-float/2addr v2, v3 */
	 int v3 = 0; // const/4 v3, 0x0
	 int v4 = 0; // const/4 v4, 0x0
	 /* const/high16 v5, 0x40c00000 # 6.0f */
	 /* const/high16 v6, 0x41900000 # 18.0f */
	 /* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->b(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
	 (( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p4 ); // invoke-virtual {p1, v7, v0, p4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
	 (( android.graphics.Canvas ) p1 ).restore ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
	 (( android.graphics.Canvas ) p1 ).save ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
	 /* const/high16 v0, 0x44480000 # 800.0f */
	 com.a.a.a .a ( v0 );
	 v1 = 	 (( java.lang.Float ) v0 ).floatValue ( ); // invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
	 v0 = this.c;
	 v0 = this.S;
	 int v2 = 0; // const/4 v2, 0x0
	 (( java.util.ArrayList ) v0 ).get ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v0, Landroid/graphics/Bitmap; */
	 /* const/high16 v2, 0x40600000 # 3.5f */
	 v0 = 	 com.a.a.a .a ( v0,v2 );
	 /* const/high16 v2, 0x41c00000 # 24.0f */
	 /* div-float/2addr v0, v2 */
	 /* const v2, 0x4104cccd # 8.3f */
	 /* mul-float/2addr v0, v2 */
	 /* sub-float/2addr v1, v0 */
	 v0 = this.c;
	 v0 = this.S;
	 int v2 = 2; // const/4 v2, 0x2
	 (( java.util.ArrayList ) v0 ).get ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v0, Landroid/graphics/Bitmap; */
	 /* const/high16 v2, 0x40c00000 # 6.0f */
	 v0 = 	 com.a.a.a .a ( v0,v2 );
	 /* sub-float/2addr v1, v0 */
	 v0 = this.c;
	 v0 = this.S;
	 int v2 = 2; // const/4 v2, 0x2
	 (( java.util.ArrayList ) v0 ).get ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v0, Landroid/graphics/Bitmap; */
	 /* const/high16 v2, 0x40c00000 # 6.0f */
	 v0 = 	 com.a.a.a .a ( v0,v2 );
	 /* add-float/2addr v1, v0 */
	 /* const/high16 v0, 0x41700000 # 15.0f */
	 com.a.a.a .b ( v0 );
	 v2 = 	 (( java.lang.Float ) v0 ).floatValue ( ); // invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
	 v0 = this.c;
	 v0 = this.S;
	 int v3 = 0; // const/4 v3, 0x0
	 (( java.util.ArrayList ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v0, Landroid/graphics/Bitmap; */
	 /* const/high16 v3, 0x40600000 # 3.5f */
	 v0 = 	 com.a.a.a .b ( v0,v3 );
	 /* const/high16 v3, 0x41a00000 # 20.0f */
	 /* div-float/2addr v0, v3 */
	 /* const v3, 0x40c66666 # 6.2f */
	 /* mul-float/2addr v0, v3 */
	 /* add-float/2addr v2, v0 */
	 /* const/high16 v0, 0x44480000 # 800.0f */
	 com.a.a.a .a ( v0 );
	 v3 = 	 (( java.lang.Float ) v0 ).floatValue ( ); // invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F
	 v0 = this.c;
	 v0 = this.S;
	 int v4 = 0; // const/4 v4, 0x0
	 (( java.util.ArrayList ) v0 ).get ( v4 ); // invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v0, Landroid/graphics/Bitmap; */
	 /* const/high16 v4, 0x40600000 # 3.5f */
	 v0 = 	 com.a.a.a .a ( v0,v4 );
	 /* const/high16 v4, 0x41c00000 # 24.0f */
	 /* div-float/2addr v0, v4 */
	 /* const v4, 0x4104cccd # 8.3f */
	 /* mul-float/2addr v0, v4 */
	 /* sub-float v0, v3, v0 */
	 /* const/high16 v3, 0x42c80000 # 100.0f */
	 com.a.a.a .b ( v3 );
	 v3 = 	 (( java.lang.Float ) v3 ).floatValue ( ); // invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F
	 (( android.graphics.Canvas ) p1 ).clipRect ( v1, v2, v0, v3 ); // invoke-virtual {p1, v1, v2, v0, v3}, Landroid/graphics/Canvas;->clipRect(FFFF)Z
	 /* cmpg-float v0, v0, v1 */
	 /* if-gez v0, :cond_1 */
	 v0 = this.c;
	 v0 = this.W;
	 int v1 = 1; // const/4 v1, 0x1
	 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* move-object v7, v0 */
	 /* check-cast v7, Landroid/graphics/Bitmap; */
	 v0 = this.c;
	 v0 = this.W;
	 int v1 = 1; // const/4 v1, 0x1
	 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v0, Landroid/graphics/Bitmap; */
	 /* const/high16 v1, 0x44480000 # 800.0f */
	 com.a.a.a .a ( v1 );
	 v2 = 	 (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
	 v1 = this.c;
	 v1 = this.S;
	 int v3 = 0; // const/4 v3, 0x0
	 (( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v1, Landroid/graphics/Bitmap; */
	 /* const/high16 v3, 0x40600000 # 3.5f */
	 v1 = 	 com.a.a.a .a ( v1,v3 );
	 /* const/high16 v3, 0x41c00000 # 24.0f */
	 /* div-float/2addr v1, v3 */
	 /* const v3, 0x4104cccd # 8.3f */
	 /* mul-float/2addr v1, v3 */
	 /* sub-float/2addr v2, v1 */
	 v1 = this.c;
	 v1 = this.S;
	 int v3 = 2; // const/4 v3, 0x2
	 (( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v1, Landroid/graphics/Bitmap; */
	 /* const/high16 v3, 0x40c00000 # 6.0f */
	 v1 = 	 com.a.a.a .a ( v1,v3 );
	 /* div-float/2addr v1, v3 */
	 /* mul-float/2addr v1, v3 */
	 /* add-float/2addr v2, v1 */
	 v1 = this.c;
	 v1 = this.W;
	 int v3 = 1; // const/4 v3, 0x1
	 (( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v1, Landroid/graphics/Bitmap; */
	 /* const/high16 v3, 0x41b80000 # 23.0f */
	 v1 = 	 com.a.a.a .a ( v1,v3 );
	 /* sub-float v1, v2, v1 */
	 /* const/high16 v2, 0x41700000 # 15.0f */
	 com.a.a.a .b ( v2 );
	 v3 = 	 (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
	 v2 = this.c;
	 v2 = this.S;
	 int v4 = 0; // const/4 v4, 0x0
	 (( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v2, Landroid/graphics/Bitmap; */
	 /* const/high16 v4, 0x40600000 # 3.5f */
	 v2 = 	 com.a.a.a .b ( v2,v4 );
	 /* const/high16 v4, 0x41a00000 # 20.0f */
	 /* div-float/2addr v2, v4 */
	 /* const v4, 0x40c66666 # 6.2f */
	 /* mul-float/2addr v2, v4 */
	 /* add-float/2addr v2, v3 */
	 int v3 = 0; // const/4 v3, 0x0
	 int v4 = 0; // const/4 v4, 0x0
	 /* const/high16 v5, 0x41b80000 # 23.0f */
	 /* const/high16 v6, 0x41600000 # 14.0f */
	 /* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->b(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
	 (( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p4 ); // invoke-virtual {p1, v7, v0, p4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
} // :cond_1
(( android.graphics.Canvas ) p1 ).restore ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
v0 = this.a;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.a;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
int v1 = 0; // const/4 v1, 0x0
/* const/high16 v2, 0x43af0000 # 350.0f */
com.a.a.a .b ( v2 );
v2 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x40a00000 # 5.0f */
/* const/high16 v6, 0x41100000 # 9.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p4 ); // invoke-virtual {p1, v7, v0, p4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.c;
v7 = this.V;
v0 = this.c;
v0 = this.V;
/* const/high16 v1, 0x42b40000 # 90.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const v2, 0x43b18000 # 355.0f */
com.a.a.a .b ( v2 );
v2 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x42340000 # 45.0f */
/* const/high16 v6, 0x41800000 # 16.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p4 ); // invoke-virtual {p1, v7, v0, p4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.c;
v0 = this.ax;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* const/high16 v3, 0x42960000 # 75.0f */
/* const/high16 v4, 0x43b40000 # 360.0f */
/* const/high16 v5, 0x40a00000 # 5.0f */
/* const/high16 v6, 0x41900000 # 18.0f */
/* int-to-float v7, v1 */
/* move-object v1, p1 */
/* move-object v2, p4 */
/* invoke-static/range {v0 ..v7}, Lcom/a/a/a;->b(Landroid/graphics/Bitmap;Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFFF)V */
v0 = this.c;
v0 = this.ax;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* const/high16 v3, 0x42a00000 # 80.0f */
/* const/high16 v4, 0x43b40000 # 360.0f */
/* const/high16 v5, 0x40a00000 # 5.0f */
/* const/high16 v6, 0x41900000 # 18.0f */
/* int-to-float v7, v1 */
/* move-object v1, p1 */
/* move-object v2, p4 */
/* invoke-static/range {v0 ..v7}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFFF)V */
v0 = this.c;
v7 = this.T;
v0 = this.c;
v0 = this.T;
/* const/high16 v1, 0x43960000 # 300.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x40a00000 # 5.0f */
com.a.a.a .b ( v2 );
v2 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x41700000 # 15.0f */
/* const/high16 v6, 0x41300000 # 11.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p4 ); // invoke-virtual {p1, v7, v0, p4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.c;
v0 = this.ax;
int v1 = 3; // const/4 v1, 0x3
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* const/high16 v3, 0x43a50000 # 330.0f */
/* const/high16 v4, 0x41900000 # 18.0f */
/* const/high16 v5, 0x40a00000 # 5.0f */
/* const/high16 v6, 0x41900000 # 18.0f */
/* int-to-float v7, v1 */
/* move-object v1, p1 */
/* move-object v2, p4 */
/* invoke-static/range {v0 ..v7}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFFF)V */
v0 = this.c;
v0 = this.ap;
int v1 = 0; // const/4 v1, 0x0
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.c;
v0 = this.ap;
int v1 = 0; // const/4 v1, 0x0
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* const/high16 v1, 0x439b0000 # 310.0f */
com.a.a.a .a ( v1 );
v1 = (( java.lang.Float ) v1 ).floatValue ( ); // invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F
/* const/high16 v2, 0x42880000 # 68.0f */
com.a.a.a .b ( v2 );
v2 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x41700000 # 15.0f */
/* const/high16 v6, 0x40c00000 # 6.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p4 ); // invoke-virtual {p1, v7, v0, p4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.c;
v0 = this.ax;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* const/high16 v3, 0x43aa0000 # 340.0f */
/* const/high16 v4, 0x42960000 # 75.0f */
/* const/high16 v5, 0x40a00000 # 5.0f */
/* const/high16 v6, 0x41900000 # 18.0f */
v1 = this.c;
/* iget v1, v1, Lcom/a/a/a;->D:I */
/* add-int/lit8 v1, v1, 0x1 */
/* int-to-float v7, v1 */
/* move-object v1, p1 */
/* move-object v2, p4 */
/* invoke-static/range {v0 ..v7}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFFF)V */
v0 = this.c;
v0 = this.ap;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* move-object v7, v0 */
/* check-cast v7, Landroid/graphics/Bitmap; */
v0 = this.c;
v0 = this.ap;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* int-to-float v2, v1 */
v1 = this.c;
v1 = this.ap;
int v3 = 1; // const/4 v3, 0x1
(( java.util.ArrayList ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/Bitmap; */
/* const/high16 v3, 0x41f00000 # 30.0f */
v1 = com.a.a.a .a ( v1,v3 );
/* sub-float v1, v2, v1 */
/* const/high16 v2, 0x40000000 # 2.0f */
/* div-float/2addr v1, v2 */
/* const/high16 v2, 0x42880000 # 68.0f */
com.a.a.a .b ( v2 );
v3 = (( java.lang.Float ) v2 ).floatValue ( ); // invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F
v2 = this.c;
v2 = this.ap;
int v4 = 1; // const/4 v4, 0x1
(( java.util.ArrayList ) v2 ).get ( v4 ); // invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
/* const/high16 v4, 0x41f00000 # 30.0f */
v2 = com.a.a.a .b ( v2,v4 );
/* const/high16 v4, 0x40000000 # 2.0f */
/* div-float/2addr v2, v4 */
/* add-float/2addr v2, v3 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* const/high16 v5, 0x41f00000 # 30.0f */
/* const/high16 v6, 0x40c00000 # 6.0f */
/* invoke-static/range {v0 ..v6}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v7, v0, p4 ); // invoke-virtual {p1, v7, v0, p4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.c;
v0 = this.ax;
int v1 = 1; // const/4 v1, 0x1
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
/* const/high16 v3, 0x43be0000 # 380.0f */
/* const/high16 v4, 0x42960000 # 75.0f */
/* const/high16 v5, 0x40a00000 # 5.0f */
/* const/high16 v6, 0x41900000 # 18.0f */
v1 = this.c;
/* iget v1, v1, Lcom/a/a/a;->E:I */
/* add-int/lit8 v1, v1, 0x1 */
/* int-to-float v7, v1 */
/* move-object v1, p1 */
/* move-object v2, p4 */
/* invoke-static/range {v0 ..v7}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;Landroid/graphics/Canvas;Landroid/graphics/Paint;FFFFF)V */
return;
} // .end method

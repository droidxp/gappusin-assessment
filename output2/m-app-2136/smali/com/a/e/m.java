public class com.a.e.m {
	 /* # instance fields */
	 android.graphics.Paint a;
	 android.graphics.Paint b;
	 com.a.a.a c;
	 com.a.e.i d;
	 Integer e;
	 public java.lang.String f;
	 Integer g;
	 Integer h;
	 /* # direct methods */
	 public com.a.e.m ( ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput v3, p0, Lcom/a/e/m;->e:I */
		 int v0 = 3; // const/4 v0, 0x3
		 /* new-array v0, v0, [Ljava/lang/String; */
		 final String v1 = "Loading."; // const-string v1, "Loading."
		 /* aput-object v1, v0, v3 */
		 int v1 = 1; // const/4 v1, 0x1
		 final String v2 = "Loading.."; // const-string v2, "Loading.."
		 /* aput-object v2, v0, v1 */
		 int v1 = 2; // const/4 v1, 0x2
		 final String v2 = "Loading..."; // const-string v2, "Loading..."
		 /* aput-object v2, v0, v1 */
		 this.f = v0;
		 /* iput v3, p0, Lcom/a/e/m;->g:I */
		 /* iput v3, p0, Lcom/a/e/m;->h:I */
		 this.c = p1;
		 this.d = p2;
		 /* iput v3, p0, Lcom/a/e/m;->e:I */
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 this.a = v0;
		 v0 = this.a;
		 int v1 = -1; // const/4 v1, -0x1
		 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
		 v0 = this.a;
		 /* int-to-float v1, v1 */
		 /* const/high16 v2, 0x41f00000 # 30.0f */
		 /* div-float/2addr v1, v2 */
		 (( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 this.b = v0;
		 v0 = this.b;
		 /* const/high16 v1, -0x1000000 */
		 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
		 v0 = this.b;
		 /* const/16 v1, 0x96 */
		 (( android.graphics.Paint ) v0 ).setAlpha ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.graphics.Canvas p0, android.graphics.Paint p1 ) {
		 /* .locals 9 */
		 int v4 = 2; // const/4 v4, 0x2
		 int v3 = 0; // const/4 v3, 0x0
		 /* const/high16 v8, 0x40000000 # 2.0f */
		 /* const/high16 v7, 0x40a00000 # 5.0f */
		 int v1 = 0; // const/4 v1, 0x0
		 /* iget v0, p0, Lcom/a/e/m;->g:I */
		 /* if-ge v0, v4, :cond_1 */
		 /* iget v0, p0, Lcom/a/e/m;->g:I */
		 /* add-int/lit8 v0, v0, 0x1 */
		 /* iput v0, p0, Lcom/a/e/m;->g:I */
	 } // :goto_0
	 /* iget v0, p0, Lcom/a/e/m;->h:I */
	 int v2 = 6; // const/4 v2, 0x6
	 /* if-ge v0, v2, :cond_2 */
	 /* iget v0, p0, Lcom/a/e/m;->h:I */
	 /* add-int/lit8 v0, v0, 0x1 */
	 /* iput v0, p0, Lcom/a/e/m;->h:I */
} // :goto_1
/* iget v0, p0, Lcom/a/e/m;->e:I */
/* add-int/lit8 v2, v0, 0x1 */
/* iput v2, p0, Lcom/a/e/m;->e:I */
/* if-ge v0, v4, :cond_0 */
/* int-to-float v3, v0 */
/* int-to-float v4, v0 */
v5 = this.b;
/* move-object v0, p1 */
/* move v2, v1 */
/* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
} // :cond_0
v0 = this.c;
v0 = this.B;
/* iget v2, p0, Lcom/a/e/m;->h:I */
/* div-int/lit8 v2, v2, 0x3 */
(( java.util.ArrayList ) v0 ).get ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/Bitmap; */
v2 = this.c;
v2 = this.B;
/* iget v3, p0, Lcom/a/e/m;->h:I */
/* div-int/lit8 v3, v3, 0x3 */
(( java.util.ArrayList ) v2 ).get ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Landroid/graphics/Bitmap; */
/* int-to-float v4, v3 */
v3 = this.c;
v3 = this.B;
/* iget v5, p0, Lcom/a/e/m;->h:I */
/* div-int/lit8 v5, v5, 0x3 */
(( java.util.ArrayList ) v3 ).get ( v5 ); // invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v3, Landroid/graphics/Bitmap; */
v3 = com.a.a.a .a ( v3,v7 );
/* sub-float v3, v4, v3 */
/* div-float/2addr v3, v8 */
/* int-to-float v5, v4 */
v4 = this.c;
v4 = this.B;
/* iget v6, p0, Lcom/a/e/m;->h:I */
/* div-int/lit8 v6, v6, 0x3 */
(( java.util.ArrayList ) v4 ).get ( v6 ); // invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v4, Landroid/graphics/Bitmap; */
v4 = com.a.a.a .b ( v4,v7 );
/* sub-float v4, v5, v4 */
/* div-float/2addr v4, v8 */
/* move v5, v1 */
/* move v6, v1 */
/* move v8, v7 */
/* invoke-static/range {v2 ..v8}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;FFFFFF)Landroid/graphics/Matrix; */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, p2 ); // invoke-virtual {p1, v0, v1, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
v0 = this.f;
/* iget v1, p0, Lcom/a/e/m;->g:I */
/* aget-object v0, v0, v1 */
/* int-to-float v1, v1 */
v2 = this.f;
/* array-length v2, v2 */
/* int-to-float v2, v2 */
/* int-to-float v3, v3 */
/* const/high16 v4, 0x41a00000 # 20.0f */
/* div-float/2addr v3, v4 */
/* mul-float/2addr v2, v3 */
/* sub-float/2addr v1, v2 */
/* int-to-float v2, v2 */
/* int-to-float v3, v3 */
/* const/high16 v4, 0x41f00000 # 30.0f */
/* div-float/2addr v3, v4 */
/* sub-float/2addr v2, v3 */
v3 = this.a;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
return;
} // :cond_1
/* iput v3, p0, Lcom/a/e/m;->g:I */
/* goto/16 :goto_0 */
} // :cond_2
/* iput v3, p0, Lcom/a/e/m;->h:I */
/* goto/16 :goto_1 */
} // .end method

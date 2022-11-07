public class inal extends com.doodlemobile.basket.graphics.e {
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/doodlemobile/basket/graphics/e;-><init>()V */
		 this.h = p1;
		 /* invoke-direct {p0}, Lcom/doodlemobile/basket/test/b;->q()V */
		 return;
	 } // .end method
	 private android.graphics.Bitmap a ( Integer p0, Integer p1 ) {
		 /* .locals 9 */
		 try { // :try_start_0
			 v0 = this.h;
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 v0 = this.h;
				 (( android.graphics.Bitmap ) v0 ).getNinePatchChunk ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getNinePatchChunk()[B
				 if ( v0 != null) { // if-eqz v0, :cond_1
					 int v0 = 1; // const/4 v0, 0x1
					 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/test/b;->l:Z */
				 } // :goto_0
				 /* iget-boolean v0, p0, Lcom/doodlemobile/basket/test/b;->l:Z */
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 v0 = this.h;
					 (( android.graphics.Bitmap ) v0 ).getNinePatchChunk ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getNinePatchChunk()[B
					 int v1 = 1; // const/4 v1, 0x1
					 /* aget-byte v1, v0, v1 */
					 /* const/16 v2, 0x20 */
					 /* aget-byte v2, v0, v2 */
					 /* iput v2, p0, Lcom/doodlemobile/basket/test/b;->m:I */
					 /* const/16 v2, 0x24 */
					 /* aget-byte v2, v0, v2 */
					 /* iput v2, p0, Lcom/doodlemobile/basket/test/b;->o:I */
					 /* mul-int/lit8 v2, v1, 0x4 */
					 /* add-int/lit8 v2, v2, 0x20 */
					 /* aget-byte v2, v0, v2 */
					 /* iput v2, p0, Lcom/doodlemobile/basket/test/b;->n:I */
					 /* mul-int/lit8 v1, v1, 0x4 */
					 /* add-int/lit8 v1, v1, 0x24 */
					 /* aget-byte v0, v0, v1 */
					 /* iput v0, p0, Lcom/doodlemobile/basket/test/b;->p:I */
					 /* iget v0, p0, Lcom/doodlemobile/basket/test/b;->o:I */
					 /* iget v1, p0, Lcom/doodlemobile/basket/test/b;->m:I */
					 /* sub-int/2addr v0, v1 */
					 /* iget v1, p0, Lcom/doodlemobile/basket/test/b;->p:I */
					 /* iget v2, p0, Lcom/doodlemobile/basket/test/b;->n:I */
					 /* sub-int/2addr v1, v2 */
					 v2 = 					 (( com.doodlemobile.basket.test.b ) p0 ).j ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/test/b;->j()I
					 /* iget v3, p0, Lcom/doodlemobile/basket/test/b;->o:I */
					 /* sub-int/2addr v2, v3 */
					 v3 = 					 (( com.doodlemobile.basket.test.b ) p0 ).k ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/test/b;->k()I
					 /* iget v4, p0, Lcom/doodlemobile/basket/test/b;->p:I */
					 /* sub-int/2addr v3, v4 */
					 /* const/16 v4, 0x9 */
					 /* new-array v4, v4, [[F */
					 int v5 = 0; // const/4 v5, 0x0
					 int v6 = 4; // const/4 v6, 0x4
					 /* new-array v6, v6, [F */
					 int v7 = 0; // const/4 v7, 0x0
					 int v8 = 0; // const/4 v8, 0x0
					 /* aput v8, v6, v7 */
					 int v7 = 1; // const/4 v7, 0x1
					 int v8 = 0; // const/4 v8, 0x0
					 /* aput v8, v6, v7 */
					 int v7 = 2; // const/4 v7, 0x2
					 /* iget v8, p0, Lcom/doodlemobile/basket/test/b;->m:I */
					 /* int-to-float v8, v8 */
					 /* aput v8, v6, v7 */
					 int v7 = 3; // const/4 v7, 0x3
					 /* iget v8, p0, Lcom/doodlemobile/basket/test/b;->n:I */
					 /* int-to-float v8, v8 */
					 /* aput v8, v6, v7 */
					 /* aput-object v6, v4, v5 */
					 int v5 = 1; // const/4 v5, 0x1
					 int v6 = 4; // const/4 v6, 0x4
					 /* new-array v6, v6, [F */
					 int v7 = 0; // const/4 v7, 0x0
					 /* iget v8, p0, Lcom/doodlemobile/basket/test/b;->m:I */
					 /* int-to-float v8, v8 */
					 /* aput v8, v6, v7 */
					 int v7 = 1; // const/4 v7, 0x1
					 int v8 = 0; // const/4 v8, 0x0
					 /* aput v8, v6, v7 */
					 int v7 = 2; // const/4 v7, 0x2
					 /* int-to-float v8, v0 */
					 /* aput v8, v6, v7 */
					 int v7 = 3; // const/4 v7, 0x3
					 /* iget v8, p0, Lcom/doodlemobile/basket/test/b;->n:I */
					 /* int-to-float v8, v8 */
					 /* aput v8, v6, v7 */
					 /* aput-object v6, v4, v5 */
					 int v5 = 2; // const/4 v5, 0x2
					 int v6 = 4; // const/4 v6, 0x4
					 /* new-array v6, v6, [F */
					 int v7 = 0; // const/4 v7, 0x0
					 /* iget v8, p0, Lcom/doodlemobile/basket/test/b;->o:I */
					 /* int-to-float v8, v8 */
					 /* aput v8, v6, v7 */
					 int v7 = 1; // const/4 v7, 0x1
					 int v8 = 0; // const/4 v8, 0x0
					 /* aput v8, v6, v7 */
					 int v7 = 2; // const/4 v7, 0x2
					 /* int-to-float v8, v2 */
					 /* aput v8, v6, v7 */
					 int v7 = 3; // const/4 v7, 0x3
					 /* iget v8, p0, Lcom/doodlemobile/basket/test/b;->n:I */
					 /* int-to-float v8, v8 */
					 /* aput v8, v6, v7 */
					 /* aput-object v6, v4, v5 */
					 int v5 = 3; // const/4 v5, 0x3
					 int v6 = 4; // const/4 v6, 0x4
					 /* new-array v6, v6, [F */
					 int v7 = 0; // const/4 v7, 0x0
					 int v8 = 0; // const/4 v8, 0x0
					 /* aput v8, v6, v7 */
					 int v7 = 1; // const/4 v7, 0x1
					 /* iget v8, p0, Lcom/doodlemobile/basket/test/b;->n:I */
					 /* int-to-float v8, v8 */
					 /* aput v8, v6, v7 */
					 int v7 = 2; // const/4 v7, 0x2
					 /* iget v8, p0, Lcom/doodlemobile/basket/test/b;->m:I */
					 /* int-to-float v8, v8 */
					 /* aput v8, v6, v7 */
					 int v7 = 3; // const/4 v7, 0x3
					 /* int-to-float v8, v1 */
					 /* aput v8, v6, v7 */
					 /* aput-object v6, v4, v5 */
					 int v5 = 4; // const/4 v5, 0x4
					 int v6 = 4; // const/4 v6, 0x4
					 /* new-array v6, v6, [F */
					 int v7 = 0; // const/4 v7, 0x0
					 /* iget v8, p0, Lcom/doodlemobile/basket/test/b;->m:I */
					 /* int-to-float v8, v8 */
					 /* aput v8, v6, v7 */
					 int v7 = 1; // const/4 v7, 0x1
					 /* iget v8, p0, Lcom/doodlemobile/basket/test/b;->n:I */
					 /* int-to-float v8, v8 */
					 /* aput v8, v6, v7 */
					 int v7 = 2; // const/4 v7, 0x2
					 /* int-to-float v8, v0 */
					 /* aput v8, v6, v7 */
					 int v7 = 3; // const/4 v7, 0x3
					 /* int-to-float v8, v1 */
					 /* aput v8, v6, v7 */
					 /* aput-object v6, v4, v5 */
					 int v5 = 5; // const/4 v5, 0x5
					 int v6 = 4; // const/4 v6, 0x4
					 /* new-array v6, v6, [F */
					 int v7 = 0; // const/4 v7, 0x0
					 /* iget v8, p0, Lcom/doodlemobile/basket/test/b;->o:I */
					 /* int-to-float v8, v8 */
					 /* aput v8, v6, v7 */
					 int v7 = 1; // const/4 v7, 0x1
					 /* iget v8, p0, Lcom/doodlemobile/basket/test/b;->n:I */
					 /* int-to-float v8, v8 */
					 /* aput v8, v6, v7 */
					 int v7 = 2; // const/4 v7, 0x2
					 /* int-to-float v8, v2 */
					 /* aput v8, v6, v7 */
					 int v7 = 3; // const/4 v7, 0x3
					 /* int-to-float v1, v1 */
					 /* aput v1, v6, v7 */
					 /* aput-object v6, v4, v5 */
					 int v1 = 6; // const/4 v1, 0x6
					 int v5 = 4; // const/4 v5, 0x4
					 /* new-array v5, v5, [F */
					 int v6 = 0; // const/4 v6, 0x0
					 int v7 = 0; // const/4 v7, 0x0
					 /* aput v7, v5, v6 */
					 int v6 = 1; // const/4 v6, 0x1
					 /* iget v7, p0, Lcom/doodlemobile/basket/test/b;->p:I */
					 /* int-to-float v7, v7 */
					 /* aput v7, v5, v6 */
					 int v6 = 2; // const/4 v6, 0x2
					 /* iget v7, p0, Lcom/doodlemobile/basket/test/b;->m:I */
					 /* int-to-float v7, v7 */
					 /* aput v7, v5, v6 */
					 int v6 = 3; // const/4 v6, 0x3
					 /* int-to-float v7, v3 */
					 /* aput v7, v5, v6 */
					 /* aput-object v5, v4, v1 */
					 int v1 = 7; // const/4 v1, 0x7
					 int v5 = 4; // const/4 v5, 0x4
					 /* new-array v5, v5, [F */
					 int v6 = 0; // const/4 v6, 0x0
					 /* iget v7, p0, Lcom/doodlemobile/basket/test/b;->m:I */
					 /* int-to-float v7, v7 */
					 /* aput v7, v5, v6 */
					 int v6 = 1; // const/4 v6, 0x1
					 /* iget v7, p0, Lcom/doodlemobile/basket/test/b;->p:I */
					 /* int-to-float v7, v7 */
					 /* aput v7, v5, v6 */
					 int v6 = 2; // const/4 v6, 0x2
					 /* int-to-float v0, v0 */
					 /* aput v0, v5, v6 */
					 int v0 = 3; // const/4 v0, 0x3
					 /* int-to-float v6, v3 */
					 /* aput v6, v5, v0 */
					 /* aput-object v5, v4, v1 */
					 /* const/16 v0, 0x8 */
					 int v1 = 4; // const/4 v1, 0x4
					 /* new-array v1, v1, [F */
					 int v5 = 0; // const/4 v5, 0x0
					 /* iget v6, p0, Lcom/doodlemobile/basket/test/b;->o:I */
					 /* int-to-float v6, v6 */
					 /* aput v6, v1, v5 */
					 int v5 = 1; // const/4 v5, 0x1
					 /* iget v6, p0, Lcom/doodlemobile/basket/test/b;->p:I */
					 /* int-to-float v6, v6 */
					 /* aput v6, v1, v5 */
					 int v5 = 2; // const/4 v5, 0x2
					 /* int-to-float v2, v2 */
					 /* aput v2, v1, v5 */
					 int v2 = 3; // const/4 v2, 0x3
					 /* int-to-float v3, v3 */
					 /* aput v3, v1, v2 */
					 /* aput-object v1, v4, v0 */
					 this.q = v4;
				 } // :cond_0
				 v0 = android.graphics.Bitmap$Config.ARGB_8888;
				 android.graphics.Bitmap .createBitmap ( p1,p2,v0 );
				 /* if-nez v0, :cond_2 */
				 int v0 = 0; // const/4 v0, 0x0
			 } // :goto_1
		 } // :cond_1
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/test/b;->l:Z */
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* goto/16 :goto_0 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
		 final String v0 = "Basket"; // const-string v0, "Basket"
		 final String v1 = "Texture.getBitmap() error, bad asset?"; // const-string v1, "Texture.getBitmap() error, bad asset?"
		 com.doodlemobile.basket.util.b .a ( v0,v1 );
		 int v0 = 0; // const/4 v0, 0x0
	 } // :cond_2
	 try { // :try_start_1
		 /* new-instance v1, Landroid/graphics/Canvas; */
		 /* invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V */
		 /* new-instance v2, Landroid/graphics/Paint; */
		 /* invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V */
		 int v3 = 1; // const/4 v3, 0x1
		 (( android.graphics.Paint ) v2 ).setDither ( v3 ); // invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setDither(Z)V
		 v3 = this.h;
		 int v4 = 0; // const/4 v4, 0x0
		 this.h = v4;
		 int v4 = 0; // const/4 v4, 0x0
		 int v5 = 0; // const/4 v5, 0x0
		 (( android.graphics.Canvas ) v1 ).drawBitmap ( v3, v4, v5, v2 ); // invoke-virtual {v1, v3, v4, v5, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
		 (( android.graphics.Bitmap ) v3 ).recycle ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V
		 java.lang.System .gc ( );
		 /* :try_end_1 */
		 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
	 } // .end method
	 private void q ( ) {
		 /* .locals 2 */
		 v0 = this.h;
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
		 /* iput v0, p0, Lcom/doodlemobile/basket/test/b;->d:I */
		 v0 = this.h;
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
		 /* iput v0, p0, Lcom/doodlemobile/basket/test/b;->e:I */
		 /* iget v0, p0, Lcom/doodlemobile/basket/test/b;->d:I */
		 v0 = 		 com.doodlemobile.basket.test.b .a ( v0 );
		 /* iput v0, p0, Lcom/doodlemobile/basket/test/b;->b:I */
		 /* iget v0, p0, Lcom/doodlemobile/basket/test/b;->e:I */
		 v0 = 		 com.doodlemobile.basket.test.b .a ( v0 );
		 /* iput v0, p0, Lcom/doodlemobile/basket/test/b;->c:I */
		 /* iget v0, p0, Lcom/doodlemobile/basket/test/b;->d:I */
		 /* int-to-float v0, v0 */
		 /* iget v1, p0, Lcom/doodlemobile/basket/test/b;->b:I */
		 /* int-to-float v1, v1 */
		 /* div-float/2addr v0, v1 */
		 /* iput v0, p0, Lcom/doodlemobile/basket/test/b;->f:F */
		 /* iget v0, p0, Lcom/doodlemobile/basket/test/b;->e:I */
		 /* int-to-float v0, v0 */
		 /* iget v1, p0, Lcom/doodlemobile/basket/test/b;->c:I */
		 /* int-to-float v1, v1 */
		 /* div-float/2addr v0, v1 */
		 /* iput v0, p0, Lcom/doodlemobile/basket/test/b;->g:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( android.graphics.Bitmap p0 ) {
		 /* .locals 1 */
		 v0 = this.h;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.h;
			 (( android.graphics.Bitmap ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
		 } // :cond_0
		 this.h = p1;
		 /* invoke-direct {p0}, Lcom/doodlemobile/basket/test/b;->q()V */
		 (( com.doodlemobile.basket.test.b ) p0 ).e ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/test/b;->e()V
		 return;
	 } // .end method
	 public final void a ( Object p0 ) {
		 /* .locals 5 */
		 /* const v4, 0x47012f00 # 33071.0f */
		 /* const v1, 0x46180400 # 9729.0f */
		 int v3 = 0; // const/4 v3, 0x0
		 /* const/16 v2, 0xde1 */
		 v0 = 		 (( com.doodlemobile.basket.test.b ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/test/b;->a()Z
		 if ( v0 != null) { // if-eqz v0, :cond_1
		 } // :cond_0
	 } // :goto_0
	 return;
} // :cond_1
/* iget v0, p0, Lcom/doodlemobile/basket/test/b;->b:I */
/* if-gez v0, :cond_2 */
/* invoke-direct {p0}, Lcom/doodlemobile/basket/test/b;->q()V */
/* iget v0, p0, Lcom/doodlemobile/basket/test/b;->b:I */
/* if-ltz v0, :cond_0 */
} // :cond_2
v0 = /* iget v0, p0, Lcom/doodlemobile/basket/test/b;->a:I */
/* iput v0, p0, Lcom/doodlemobile/basket/test/b;->a:I */
/* iget v0, p0, Lcom/doodlemobile/basket/test/b;->a:I */
/* const/16 v0, 0x2801 */
/* const/16 v0, 0x2800 */
/* const/16 v0, 0x2802 */
/* const/16 v0, 0x2803 */
v0 = this.i;
/* if-nez v0, :cond_3 */
/* iget v0, p0, Lcom/doodlemobile/basket/test/b;->b:I */
/* iget v1, p0, Lcom/doodlemobile/basket/test/b;->c:I */
/* invoke-direct {p0, v0, v1}, Lcom/doodlemobile/basket/test/b;->a(II)Landroid/graphics/Bitmap; */
} // :cond_3
/* if-nez v0, :cond_4 */
(( com.doodlemobile.basket.test.b ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lcom/doodlemobile/basket/test/b;->b(Lcom/doodlemobile/basket/opengl/m;)V
} // :cond_4
android.opengl.GLUtils .texImage2D ( v2,v3,v0,v3 );
int v1 = 0; // const/4 v1, 0x0
this.i = v1;
(( android.graphics.Bitmap ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
com.doodlemobile.basket.n .a ( p0 );
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/test/b;->j:Z */
/* iput-boolean v3, p0, Lcom/doodlemobile/basket/test/b;->k:Z */
} // .end method
public final void b ( Object p0 ) {
/* .locals 1 */
(( com.doodlemobile.basket.test.b ) p0 ).h ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/test/b;->h()V
/* iget v0, p0, Lcom/doodlemobile/basket/test/b;->a:I */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, p0, Lcom/doodlemobile/basket/test/b;->a:I */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/doodlemobile/basket/test/b;->a:I */
} // :cond_0
return;
} // .end method
public final void g ( ) {
/* .locals 0 */
return;
} // .end method

public class com.doodlemobile.basket.graphics.e implements com.doodlemobile.basket.b.d {
	 /* # interfaces */
	 /* # static fields */
	 private static Integer r;
	 /* # instance fields */
	 protected Integer a;
	 protected Integer b;
	 protected Integer c;
	 protected Integer d;
	 protected Integer e;
	 protected Float f;
	 protected Float g;
	 protected android.graphics.Bitmap h;
	 protected android.graphics.Bitmap i;
	 protected Boolean j;
	 protected Boolean k;
	 public Boolean l;
	 public Integer m;
	 public Integer n;
	 public Integer o;
	 public Integer p;
	 public F q;
	 private com.doodlemobile.basket.b.c s;
	 private Integer t;
	 /* # direct methods */
	 static com.doodlemobile.basket.graphics.e ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 return;
	 } // .end method
	 public com.doodlemobile.basket.graphics.e ( ) {
		 /* .locals 2 */
		 int v0 = 0; // const/4 v0, 0x0
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput v1, p0, Lcom/doodlemobile/basket/graphics/e;->a:I */
		 /* iput v0, p0, Lcom/doodlemobile/basket/graphics/e;->f:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/graphics/e;->g:F */
		 int v0 = 0; // const/4 v0, 0x0
		 this.h = v0;
		 /* iput-boolean v1, p0, Lcom/doodlemobile/basket/graphics/e;->j:Z */
		 /* iput-boolean v1, p0, Lcom/doodlemobile/basket/graphics/e;->k:Z */
		 /* iput-boolean v1, p0, Lcom/doodlemobile/basket/graphics/e;->l:Z */
		 return;
	 } // .end method
	 private com.doodlemobile.basket.graphics.e ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, v0}, Lcom/doodlemobile/basket/graphics/e;-><init>(Lcom/doodlemobile/basket/b/c;I)V */
		 return;
	 } // .end method
	 private com.doodlemobile.basket.graphics.e ( ) {
		 /* .locals 2 */
		 int v0 = 0; // const/4 v0, 0x0
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput v1, p0, Lcom/doodlemobile/basket/graphics/e;->a:I */
		 /* iput v0, p0, Lcom/doodlemobile/basket/graphics/e;->f:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/graphics/e;->g:F */
		 int v0 = 0; // const/4 v0, 0x0
		 this.h = v0;
		 /* iput-boolean v1, p0, Lcom/doodlemobile/basket/graphics/e;->j:Z */
		 /* iput-boolean v1, p0, Lcom/doodlemobile/basket/graphics/e;->k:Z */
		 /* iput-boolean v1, p0, Lcom/doodlemobile/basket/graphics/e;->l:Z */
		 this.s = p1;
		 /* iput p2, p0, Lcom/doodlemobile/basket/graphics/e;->t:I */
		 /* invoke-direct {p0}, Lcom/doodlemobile/basket/graphics/e;->q()V */
		 return;
	 } // .end method
	 public static Integer a ( Integer p0 ) {
		 /* .locals 3 */
		 int v2 = 1; // const/4 v2, 0x1
		 /* move v0, p0 */
	 } // :goto_0
	 /* sub-int v1, v0, v2 */
	 /* and-int/2addr v1, v0 */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* sub-int v1, v0, v2 */
		 /* and-int/2addr v0, v1 */
	 } // :cond_0
	 /* if-ge v0, p0, :cond_1 */
	 /* shl-int/lit8 v0, v0, 0x1 */
} // :cond_1
} // .end method
private android.graphics.Bitmap a ( java.io.InputStream p0, Integer p1, Integer p2 ) {
/* .locals 9 */
/* if-nez p1, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
try { // :try_start_0
v0 = this.h;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.h;
(( android.graphics.Bitmap ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
int v0 = 0; // const/4 v0, 0x0
this.h = v0;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
this.h = v0;
/* new-instance v0, Landroid/graphics/BitmapFactory$Options; */
/* invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V */
v1 = android.graphics.Bitmap$Config.ARGB_8888;
this.inPreferredConfig = v1;
/* new-instance v1, Landroid/graphics/Rect; */
/* invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V */
android.graphics.BitmapFactory .decodeStream ( p1,v1,v0 );
this.h = v0;
(( java.io.InputStream ) p1 ).close ( ); // invoke-virtual {p1}, Ljava/io/InputStream;->close()V
v0 = this.h;
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.h;
(( android.graphics.Bitmap ) v0 ).getNinePatchChunk ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getNinePatchChunk()[B
if ( v0 != null) { // if-eqz v0, :cond_3
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/graphics/e;->l:Z */
} // :goto_1
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/graphics/e;->l:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
	 v0 = this.h;
	 (( android.graphics.Bitmap ) v0 ).getNinePatchChunk ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getNinePatchChunk()[B
	 int v1 = 1; // const/4 v1, 0x1
	 /* aget-byte v1, v0, v1 */
	 /* const/16 v2, 0x20 */
	 /* aget-byte v2, v0, v2 */
	 /* iput v2, p0, Lcom/doodlemobile/basket/graphics/e;->m:I */
	 /* const/16 v2, 0x24 */
	 /* aget-byte v2, v0, v2 */
	 /* iput v2, p0, Lcom/doodlemobile/basket/graphics/e;->o:I */
	 /* mul-int/lit8 v2, v1, 0x4 */
	 /* add-int/lit8 v2, v2, 0x20 */
	 /* aget-byte v2, v0, v2 */
	 /* iput v2, p0, Lcom/doodlemobile/basket/graphics/e;->n:I */
	 /* mul-int/lit8 v1, v1, 0x4 */
	 /* add-int/lit8 v1, v1, 0x24 */
	 /* aget-byte v0, v0, v1 */
	 /* iput v0, p0, Lcom/doodlemobile/basket/graphics/e;->p:I */
	 /* iget v0, p0, Lcom/doodlemobile/basket/graphics/e;->o:I */
	 /* iget v1, p0, Lcom/doodlemobile/basket/graphics/e;->m:I */
	 /* sub-int/2addr v0, v1 */
	 /* iget v1, p0, Lcom/doodlemobile/basket/graphics/e;->p:I */
	 /* iget v2, p0, Lcom/doodlemobile/basket/graphics/e;->n:I */
	 /* sub-int/2addr v1, v2 */
	 /* iget v2, p0, Lcom/doodlemobile/basket/graphics/e;->d:I */
	 /* iget v3, p0, Lcom/doodlemobile/basket/graphics/e;->o:I */
	 /* sub-int/2addr v2, v3 */
	 /* iget v3, p0, Lcom/doodlemobile/basket/graphics/e;->e:I */
	 /* iget v4, p0, Lcom/doodlemobile/basket/graphics/e;->p:I */
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
	 /* iget v8, p0, Lcom/doodlemobile/basket/graphics/e;->m:I */
	 /* int-to-float v8, v8 */
	 /* aput v8, v6, v7 */
	 int v7 = 3; // const/4 v7, 0x3
	 /* iget v8, p0, Lcom/doodlemobile/basket/graphics/e;->n:I */
	 /* int-to-float v8, v8 */
	 /* aput v8, v6, v7 */
	 /* aput-object v6, v4, v5 */
	 int v5 = 1; // const/4 v5, 0x1
	 int v6 = 4; // const/4 v6, 0x4
	 /* new-array v6, v6, [F */
	 int v7 = 0; // const/4 v7, 0x0
	 /* iget v8, p0, Lcom/doodlemobile/basket/graphics/e;->m:I */
	 /* int-to-float v8, v8 */
	 /* aput v8, v6, v7 */
	 int v7 = 1; // const/4 v7, 0x1
	 int v8 = 0; // const/4 v8, 0x0
	 /* aput v8, v6, v7 */
	 int v7 = 2; // const/4 v7, 0x2
	 /* int-to-float v8, v0 */
	 /* aput v8, v6, v7 */
	 int v7 = 3; // const/4 v7, 0x3
	 /* iget v8, p0, Lcom/doodlemobile/basket/graphics/e;->n:I */
	 /* int-to-float v8, v8 */
	 /* aput v8, v6, v7 */
	 /* aput-object v6, v4, v5 */
	 int v5 = 2; // const/4 v5, 0x2
	 int v6 = 4; // const/4 v6, 0x4
	 /* new-array v6, v6, [F */
	 int v7 = 0; // const/4 v7, 0x0
	 /* iget v8, p0, Lcom/doodlemobile/basket/graphics/e;->o:I */
	 /* int-to-float v8, v8 */
	 /* aput v8, v6, v7 */
	 int v7 = 1; // const/4 v7, 0x1
	 int v8 = 0; // const/4 v8, 0x0
	 /* aput v8, v6, v7 */
	 int v7 = 2; // const/4 v7, 0x2
	 /* int-to-float v8, v2 */
	 /* aput v8, v6, v7 */
	 int v7 = 3; // const/4 v7, 0x3
	 /* iget v8, p0, Lcom/doodlemobile/basket/graphics/e;->n:I */
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
	 /* iget v8, p0, Lcom/doodlemobile/basket/graphics/e;->n:I */
	 /* int-to-float v8, v8 */
	 /* aput v8, v6, v7 */
	 int v7 = 2; // const/4 v7, 0x2
	 /* iget v8, p0, Lcom/doodlemobile/basket/graphics/e;->m:I */
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
	 /* iget v8, p0, Lcom/doodlemobile/basket/graphics/e;->m:I */
	 /* int-to-float v8, v8 */
	 /* aput v8, v6, v7 */
	 int v7 = 1; // const/4 v7, 0x1
	 /* iget v8, p0, Lcom/doodlemobile/basket/graphics/e;->n:I */
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
	 /* iget v8, p0, Lcom/doodlemobile/basket/graphics/e;->o:I */
	 /* int-to-float v8, v8 */
	 /* aput v8, v6, v7 */
	 int v7 = 1; // const/4 v7, 0x1
	 /* iget v8, p0, Lcom/doodlemobile/basket/graphics/e;->n:I */
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
	 /* iget v7, p0, Lcom/doodlemobile/basket/graphics/e;->p:I */
	 /* int-to-float v7, v7 */
	 /* aput v7, v5, v6 */
	 int v6 = 2; // const/4 v6, 0x2
	 /* iget v7, p0, Lcom/doodlemobile/basket/graphics/e;->m:I */
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
	 /* iget v7, p0, Lcom/doodlemobile/basket/graphics/e;->m:I */
	 /* int-to-float v7, v7 */
	 /* aput v7, v5, v6 */
	 int v6 = 1; // const/4 v6, 0x1
	 /* iget v7, p0, Lcom/doodlemobile/basket/graphics/e;->p:I */
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
	 /* iget v6, p0, Lcom/doodlemobile/basket/graphics/e;->o:I */
	 /* int-to-float v6, v6 */
	 /* aput v6, v1, v5 */
	 int v5 = 1; // const/4 v5, 0x1
	 /* iget v6, p0, Lcom/doodlemobile/basket/graphics/e;->p:I */
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
} // :cond_2
v0 = android.graphics.Bitmap$Config.ARGB_8888;
android.graphics.Bitmap .createBitmap ( p2,p3,v0 );
/* if-nez v0, :cond_4 */
int v0 = 0; // const/4 v0, 0x0
/* goto/16 :goto_0 */
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/graphics/e;->l:Z */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* goto/16 :goto_1 */
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
final String v0 = "Basket"; // const-string v0, "Basket"
final String v1 = "Texture.getBitmap() error, bad asset?"; // const-string v1, "Texture.getBitmap() error, bad asset?"
com.doodlemobile.basket.util.b .a ( v0,v1 );
int v0 = 0; // const/4 v0, 0x0
/* goto/16 :goto_0 */
} // :cond_4
try { // :try_start_1
v1 = this.h;
/* if-nez v1, :cond_5 */
int v0 = 0; // const/4 v0, 0x0
/* goto/16 :goto_0 */
} // :cond_5
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
/* goto/16 :goto_0 */
} // .end method
public static com.doodlemobile.basket.graphics.e a ( Object p0, Integer p1 ) {
/* .locals 4 */
/* check-cast v0, Lcom/doodlemobile/basket/graphics/e; */
/* if-nez v0, :cond_0 */
/* new-instance v0, Lcom/doodlemobile/basket/graphics/e; */
/* new-instance v1, Lcom/doodlemobile/basket/c; */
/* invoke-direct {v1, p0, p1}, Lcom/doodlemobile/basket/c;-><init>(Lcom/doodlemobile/basket/b/b;I)V */
/* invoke-direct {v0, v1}, Lcom/doodlemobile/basket/graphics/e;-><init>(Lcom/doodlemobile/basket/b/c;)V */
final String v1 = "Basket"; // const-string v1, "Basket"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "loadResource "; // const-string v3, "loadResource "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.doodlemobile.basket.util.b .c ( v1,v2 );
} // :cond_0
} // .end method
private void q ( ) {
/* .locals 3 */
/* new-instance v0, Landroid/graphics/BitmapFactory$Options; */
/* invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V */
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z */
v1 = this.s;
/* if-nez v1, :cond_0 */
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lcom/doodlemobile/basket/graphics/e;->c:I */
/* iput v0, p0, Lcom/doodlemobile/basket/graphics/e;->b:I */
} // :goto_0
return;
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
android.graphics.BitmapFactory .decodeStream ( v1,v2,v0 );
try { // :try_start_0
(( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_1
/* iget v1, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I */
/* iput v1, p0, Lcom/doodlemobile/basket/graphics/e;->d:I */
/* iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I */
/* iput v0, p0, Lcom/doodlemobile/basket/graphics/e;->e:I */
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/e;->d:I */
v0 = com.doodlemobile.basket.graphics.e .a ( v0 );
/* iput v0, p0, Lcom/doodlemobile/basket/graphics/e;->b:I */
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/e;->e:I */
v0 = com.doodlemobile.basket.graphics.e .a ( v0 );
/* iput v0, p0, Lcom/doodlemobile/basket/graphics/e;->c:I */
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/e;->d:I */
/* int-to-float v0, v0 */
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/e;->b:I */
/* int-to-float v1, v1 */
/* div-float/2addr v0, v1 */
/* iput v0, p0, Lcom/doodlemobile/basket/graphics/e;->f:F */
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/e;->e:I */
/* int-to-float v0, v0 */
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/e;->c:I */
/* int-to-float v1, v1 */
/* div-float/2addr v0, v1 */
/* iput v0, p0, Lcom/doodlemobile/basket/graphics/e;->g:F */
/* :catch_0 */
/* move-exception v1 */
} // .end method
/* # virtual methods */
public void a ( Object p0 ) {
/* .locals 6 */
int v1 = 1; // const/4 v1, 0x1
int v5 = 0; // const/4 v5, 0x0
final String v3 = "Basket"; // const-string v3, "Basket"
v0 = (( com.doodlemobile.basket.graphics.e ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/graphics/e;->a()Z
if ( v0 != null) { // if-eqz v0, :cond_0
} // :goto_0
return;
} // :cond_0
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/e;->b:I */
/* if-gez v0, :cond_1 */
/* invoke-direct {p0}, Lcom/doodlemobile/basket/graphics/e;->q()V */
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/e;->b:I */
/* if-gez v0, :cond_1 */
final String v0 = "Basket"; // const-string v0, "Basket"
final String v0 = "Texture load failed, %s "; // const-string v0, "Texture load failed, %s "
/* new-array v1, v1, [Ljava/lang/Object; */
v2 = this.s;
(( java.lang.Object ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* aput-object v2, v1, v5 */
java.lang.String .format ( v0,v1 );
com.doodlemobile.basket.util.b .a ( v3,v0 );
} // :cond_1
/* monitor-enter p0 */
try { // :try_start_0
v0 = /* iget v0, p0, Lcom/doodlemobile/basket/graphics/e;->a:I */
/* iput v0, p0, Lcom/doodlemobile/basket/graphics/e;->a:I */
/* const/16 v0, 0xde1 */
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/e;->a:I */
/* const/16 v0, 0xde1 */
/* const/16 v1, 0x2801 */
/* const v2, 0x46180400 # 9729.0f */
/* const/16 v0, 0xde1 */
/* const/16 v1, 0x2800 */
/* const v2, 0x46180400 # 9729.0f */
/* const/16 v0, 0xde1 */
/* const/16 v1, 0x2802 */
/* const v2, 0x47012f00 # 33071.0f */
/* const/16 v0, 0xde1 */
/* const/16 v1, 0x2803 */
/* const v2, 0x47012f00 # 33071.0f */
v0 = this.i;
/* if-nez v0, :cond_2 */
v0 = this.s;
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/e;->b:I */
/* iget v2, p0, Lcom/doodlemobile/basket/graphics/e;->c:I */
/* invoke-direct {p0, v0, v1, v2}, Lcom/doodlemobile/basket/graphics/e;->a(Ljava/io/InputStream;II)Landroid/graphics/Bitmap; */
} // :cond_2
/* if-nez v0, :cond_3 */
(( com.doodlemobile.basket.graphics.e ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lcom/doodlemobile/basket/graphics/e;->b(Lcom/doodlemobile/basket/opengl/m;)V
final String v0 = "Basket"; // const-string v0, "Basket"
final String v1 = "Texture load failed, %s "; // const-string v1, "Texture load failed, %s "
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
v4 = this.s;
(( java.lang.Object ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* aput-object v4, v2, v3 */
java.lang.String .format ( v1,v2 );
com.doodlemobile.basket.util.b .a ( v0,v1 );
/* monitor-exit p0 */
/* goto/16 :goto_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // :cond_3
/* const/16 v1, 0xde1 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
try { // :try_start_1
android.opengl.GLUtils .texImage2D ( v1,v2,v0,v3 );
int v1 = 0; // const/4 v1, 0x0
this.i = v1;
(( android.graphics.Bitmap ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
final String v0 = "Basket"; // const-string v0, "Basket"
final String v1 = "Texture loaded, %s (%d*%d)"; // const-string v1, "Texture loaded, %s (%d*%d)"
int v2 = 3; // const/4 v2, 0x3
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
v4 = this.s;
(( java.lang.Object ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* aput-object v4, v2, v3 */
int v3 = 1; // const/4 v3, 0x1
/* iget v4, p0, Lcom/doodlemobile/basket/graphics/e;->d:I */
java.lang.Integer .valueOf ( v4 );
/* aput-object v4, v2, v3 */
int v3 = 2; // const/4 v3, 0x2
/* iget v4, p0, Lcom/doodlemobile/basket/graphics/e;->e:I */
java.lang.Integer .valueOf ( v4 );
/* aput-object v4, v2, v3 */
java.lang.String .format ( v1,v2 );
com.doodlemobile.basket.util.b .a ( v0,v1 );
com.doodlemobile.basket.n .a ( p0 );
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/graphics/e;->j:Z */
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* iput-boolean v5, p0, Lcom/doodlemobile/basket/graphics/e;->k:Z */
/* goto/16 :goto_0 */
} // .end method
public final Boolean a ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/e;->a:I */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/graphics/e;->k:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final Integer b ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/e;->b:I */
} // .end method
public void b ( Object p0 ) {
/* .locals 5 */
/* monitor-enter p0 */
try { // :try_start_0
(( com.doodlemobile.basket.graphics.e ) p0 ).h ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/graphics/e;->h()V
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/e;->a:I */
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "Basket"; // const-string v0, "Basket"
final String v1 = "Unloading texture: %s"; // const-string v1, "Unloading texture: %s"
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
v4 = this.s;
(( java.lang.Object ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* aput-object v4, v2, v3 */
java.lang.String .format ( v1,v2 );
com.doodlemobile.basket.util.b .a ( v0,v1 );
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/e;->a:I */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/doodlemobile/basket/graphics/e;->a:I */
} // :cond_0
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public final void c ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/doodlemobile/basket/graphics/e;->a:I */
return;
} // .end method
public final Boolean d ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/graphics/e;->j:Z */
} // .end method
public final void e ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/graphics/e;->j:Z */
return;
} // .end method
public final Boolean f ( ) {
/* .locals 1 */
v0 = this.h;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void g ( ) {
/* .locals 3 */
v0 = this.i;
/* if-nez v0, :cond_0 */
v0 = this.s;
/* iget v1, p0, Lcom/doodlemobile/basket/graphics/e;->b:I */
/* iget v2, p0, Lcom/doodlemobile/basket/graphics/e;->c:I */
/* invoke-direct {p0, v0, v1, v2}, Lcom/doodlemobile/basket/graphics/e;->a(Ljava/io/InputStream;II)Landroid/graphics/Bitmap; */
this.i = v0;
} // :cond_0
return;
} // .end method
public final void h ( ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.i;
(( android.graphics.Bitmap ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
this.i = v1;
} // :cond_0
v0 = this.h;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.h;
(( android.graphics.Bitmap ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
this.h = v1;
} // :cond_1
return;
} // .end method
public final Integer i ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/e;->c:I */
} // .end method
public final Integer j ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/e;->d:I */
} // .end method
public final Integer k ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/e;->e:I */
} // .end method
public final Float l ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/e;->f:F */
} // .end method
public final Float m ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/e;->g:F */
} // .end method
public final void n ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/graphics/e;->j:Z */
/* if-nez v0, :cond_0 */
com.doodlemobile.basket.n .b ( p0 );
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/graphics/e;->j:Z */
} // :cond_0
return;
} // .end method
public final Integer o ( ) {
/* .locals 1 */
v0 = (( com.doodlemobile.basket.graphics.e ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/graphics/e;->a()Z
/* if-nez v0, :cond_0 */
v0 = com.doodlemobile.basket.r.a;
(( com.doodlemobile.basket.graphics.e ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/basket/graphics/e;->a(Lcom/doodlemobile/basket/opengl/m;)V
} // :cond_0
/* iget v0, p0, Lcom/doodlemobile/basket/graphics/e;->a:I */
} // .end method
public final void p ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/graphics/e;->k:Z */
return;
} // .end method

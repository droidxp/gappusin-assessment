public class com.a.c.f {
	 /* # instance fields */
	 public Integer a;
	 public Integer b;
	 public Integer c;
	 public Integer d;
	 public Integer e;
	 public Integer f;
	 public android.graphics.Bitmap g;
	 public Boolean h;
	 java.util.Random i;
	 public Integer j;
	 public Integer k;
	 public Integer l;
	 public Integer m;
	 android.graphics.Bitmap n;
	 public Boolean o;
	 com.a.a.a p;
	 /* # direct methods */
	 public com.a.c.f ( ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Ljava/util/Random; */
		 /* invoke-direct {v0}, Ljava/util/Random;-><init>()V */
		 this.i = v0;
		 /* iput v2, p0, Lcom/a/c/f;->j:I */
		 /* iput v2, p0, Lcom/a/c/f;->k:I */
		 /* iput v2, p0, Lcom/a/c/f;->l:I */
		 /* iput v2, p0, Lcom/a/c/f;->m:I */
		 this.p = p1;
		 /* iput v2, p0, Lcom/a/c/f;->a:I */
		 /* const/16 v0, -0x4b0 */
		 /* iput v0, p0, Lcom/a/c/f;->b:I */
		 /* iget v0, p0, Lcom/a/c/f;->a:I */
		 /* iput v0, p0, Lcom/a/c/f;->c:I */
		 /* iget v0, p0, Lcom/a/c/f;->b:I */
		 /* iput v0, p0, Lcom/a/c/f;->d:I */
		 v0 = this.c;
		 /* iget v1, p1, Lcom/a/a/a;->D:I */
		 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 this.g = v0;
		 v0 = this.c;
		 (( java.util.ArrayList ) v0 ).get ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 this.n = v0;
		 /* const/16 v0, 0x4650 */
		 /* iput v0, p0, Lcom/a/c/f;->e:I */
		 /* iput-boolean v2, p0, Lcom/a/c/f;->h:Z */
		 int v0 = 3; // const/4 v0, 0x3
		 /* iput v0, p0, Lcom/a/c/f;->f:I */
		 /* iput-boolean v2, p0, Lcom/a/c/f;->o:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.graphics.Canvas p0, android.graphics.Paint p1 ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* iget-boolean v0, p0, Lcom/a/c/f;->o:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* iget v0, p0, Lcom/a/c/f;->k:I */
			 /* packed-switch v0, :pswitch_data_0 */
		 } // :goto_0
		 /* iget v0, p0, Lcom/a/c/f;->l:I */
		 /* add-int/lit8 v0, v0, 0x1 */
		 /* iput v0, p0, Lcom/a/c/f;->l:I */
		 /* iget v0, p0, Lcom/a/c/f;->l:I */
		 /* const/16 v1, 0x19 */
		 /* if-lt v0, v1, :cond_0 */
		 /* iput v3, p0, Lcom/a/c/f;->l:I */
		 /* iput-boolean v3, p0, Lcom/a/c/f;->o:Z */
	 } // :cond_0
	 v0 = this.g;
	 v1 = this.p;
	 v2 = this.g;
	 (( com.a.a.a ) v1 ).a ( v2, v3, v3 ); // invoke-virtual {v1, v2, v3, v3}, Lcom/a/a/a;->a(Landroid/graphics/Bitmap;II)Landroid/graphics/Matrix;
	 (( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, p2 ); // invoke-virtual {p1, v0, v1, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
	 return;
	 /* :pswitch_0 */
	 /* iget v0, p0, Lcom/a/c/f;->a:I */
	 /* add-int/lit8 v0, v0, -0x6 */
	 /* iput v0, p0, Lcom/a/c/f;->a:I */
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput v0, p0, Lcom/a/c/f;->k:I */
	 /* :pswitch_1 */
	 /* iget v0, p0, Lcom/a/c/f;->a:I */
	 /* add-int/lit8 v0, v0, 0x6 */
	 /* iput v0, p0, Lcom/a/c/f;->a:I */
	 int v0 = 2; // const/4 v0, 0x2
	 /* iput v0, p0, Lcom/a/c/f;->k:I */
	 /* :pswitch_2 */
	 /* iget v0, p0, Lcom/a/c/f;->a:I */
	 /* add-int/lit8 v0, v0, 0x6 */
	 /* iput v0, p0, Lcom/a/c/f;->a:I */
	 int v0 = 3; // const/4 v0, 0x3
	 /* iput v0, p0, Lcom/a/c/f;->k:I */
	 /* :pswitch_3 */
	 /* iget v0, p0, Lcom/a/c/f;->a:I */
	 /* add-int/lit8 v0, v0, -0x6 */
	 /* iput v0, p0, Lcom/a/c/f;->a:I */
	 /* iput v3, p0, Lcom/a/c/f;->k:I */
	 /* nop */
	 /* :pswitch_data_0 */
	 /* .packed-switch 0x0 */
	 /* :pswitch_0 */
	 /* :pswitch_1 */
	 /* :pswitch_2 */
	 /* :pswitch_3 */
} // .end packed-switch
} // .end method

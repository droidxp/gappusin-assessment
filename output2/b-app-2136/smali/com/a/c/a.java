public class com.a.c.a {
	 /* # instance fields */
	 public Integer a;
	 public Boolean b;
	 private Long c;
	 private Integer d;
	 private java.util.ArrayList e;
	 private Boolean f;
	 private Integer g;
	 private Integer h;
	 private Integer i;
	 /* # direct methods */
	 public com.a.c.a ( ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* const-wide/16 v0, 0x0 */
		 /* iput-wide v0, p0, Lcom/a/c/a;->c:J */
		 /* iput v2, p0, Lcom/a/c/a;->a:I */
		 /* iput v2, p0, Lcom/a/c/a;->d:I */
		 int v0 = 0; // const/4 v0, 0x0
		 this.e = v0;
		 /* iput-boolean v2, p0, Lcom/a/c/a;->f:Z */
		 /* iput-boolean v2, p0, Lcom/a/c/a;->b:Z */
		 /* iput v2, p0, Lcom/a/c/a;->h:I */
		 /* iput p4, p0, Lcom/a/c/a;->d:I */
		 this.e = p1;
		 /* iput-boolean p2, p0, Lcom/a/c/a;->f:Z */
		 /* iput p3, p0, Lcom/a/c/a;->h:I */
		 /* iget v0, p0, Lcom/a/c/a;->h:I */
		 /* iput v0, p0, Lcom/a/c/a;->a:I */
		 /* iput p5, p0, Lcom/a/c/a;->i:I */
		 /* iput p6, p0, Lcom/a/c/a;->g:I */
		 return;
	 } // .end method
	 public com.a.c.a ( ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* const-wide/16 v0, 0x0 */
		 /* iput-wide v0, p0, Lcom/a/c/a;->c:J */
		 /* iput v2, p0, Lcom/a/c/a;->a:I */
		 /* iput v2, p0, Lcom/a/c/a;->d:I */
		 int v0 = 0; // const/4 v0, 0x0
		 this.e = v0;
		 /* iput-boolean v2, p0, Lcom/a/c/a;->f:Z */
		 /* iput-boolean v2, p0, Lcom/a/c/a;->b:Z */
		 /* iput v2, p0, Lcom/a/c/a;->h:I */
		 /* iput p5, p0, Lcom/a/c/a;->d:I */
		 this.e = p1;
		 /* iput-boolean p3, p0, Lcom/a/c/a;->f:Z */
		 /* iput p4, p0, Lcom/a/c/a;->h:I */
		 /* iget v0, p0, Lcom/a/c/a;->h:I */
		 /* iput v0, p0, Lcom/a/c/a;->a:I */
		 /* iput p6, p0, Lcom/a/c/a;->i:I */
		 /* iput p7, p0, Lcom/a/c/a;->g:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( android.graphics.Canvas p0, android.graphics.Paint p1, Float p2, Float p3, Float p4 ) {
		 /* .locals 6 */
		 /* iget-boolean v0, p0, Lcom/a/c/a;->b:Z */
		 /* if-nez v0, :cond_0 */
		 /* new-instance v1, Landroid/graphics/Matrix; */
		 /* invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V */
		 v0 = this.e;
		 /* iget v2, p0, Lcom/a/c/a;->a:I */
		 (( java.util.ArrayList ) v0 ).get ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
		 /* div-int/lit8 v0, v0, 0x2 */
		 /* int-to-float v2, v0 */
		 v0 = this.e;
		 /* iget v3, p0, Lcom/a/c/a;->a:I */
		 (( java.util.ArrayList ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
		 /* div-int/lit8 v0, v0, 0x2 */
		 /* int-to-float v0, v0 */
		 (( android.graphics.Matrix ) v1 ).postRotate ( p5, v2, v0 ); // invoke-virtual {v1, p5, v2, v0}, Landroid/graphics/Matrix;->postRotate(FFF)Z
		 (( android.graphics.Matrix ) v1 ).postTranslate ( p3, p4 ); // invoke-virtual {v1, p3, p4}, Landroid/graphics/Matrix;->postTranslate(FF)Z
		 v0 = this.e;
		 /* iget v2, p0, Lcom/a/c/a;->a:I */
		 (( java.util.ArrayList ) v0 ).get ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 (( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, p2 ); // invoke-virtual {p1, v0, v1, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
		 java.lang.System .currentTimeMillis ( );
		 /* move-result-wide v0 */
		 /* iget-wide v2, p0, Lcom/a/c/a;->c:J */
		 /* sub-long v2, v0, v2 */
		 /* iget v4, p0, Lcom/a/c/a;->g:I */
		 /* int-to-long v4, v4 */
		 /* cmp-long v2, v2, v4 */
		 /* if-lez v2, :cond_0 */
		 /* iget v2, p0, Lcom/a/c/a;->a:I */
		 /* add-int/lit8 v2, v2, 0x1 */
		 /* iput v2, p0, Lcom/a/c/a;->a:I */
		 /* iput-wide v0, p0, Lcom/a/c/a;->c:J */
		 /* iget v0, p0, Lcom/a/c/a;->a:I */
		 /* iget v1, p0, Lcom/a/c/a;->d:I */
		 /* iget v2, p0, Lcom/a/c/a;->i:I */
		 /* mul-int/2addr v1, v2 */
		 /* if-lt v0, v1, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lcom/a/c/a;->b:Z */
		 /* iget-boolean v0, p0, Lcom/a/c/a;->f:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v0 = 0; // const/4 v0, 0x0
			 /* iput-boolean v0, p0, Lcom/a/c/a;->b:Z */
			 /* iget v0, p0, Lcom/a/c/a;->h:I */
			 /* iput v0, p0, Lcom/a/c/a;->a:I */
		 } // :cond_0
		 return;
	 } // .end method
	 public void a ( android.graphics.Canvas p0, android.graphics.Paint p1, android.graphics.Matrix p2 ) {
		 /* .locals 6 */
		 /* iget-boolean v0, p0, Lcom/a/c/a;->b:Z */
		 /* if-nez v0, :cond_0 */
		 v0 = this.e;
		 /* iget v1, p0, Lcom/a/c/a;->a:I */
		 (( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 (( android.graphics.Canvas ) p1 ).drawBitmap ( v0, p3, p2 ); // invoke-virtual {p1, v0, p3, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
		 java.lang.System .currentTimeMillis ( );
		 /* move-result-wide v0 */
		 /* iget-wide v2, p0, Lcom/a/c/a;->c:J */
		 /* sub-long v2, v0, v2 */
		 /* iget v4, p0, Lcom/a/c/a;->g:I */
		 /* int-to-long v4, v4 */
		 /* cmp-long v2, v2, v4 */
		 /* if-lez v2, :cond_0 */
		 /* iget v2, p0, Lcom/a/c/a;->a:I */
		 /* add-int/lit8 v2, v2, 0x1 */
		 /* iput v2, p0, Lcom/a/c/a;->a:I */
		 /* iput-wide v0, p0, Lcom/a/c/a;->c:J */
		 /* iget v0, p0, Lcom/a/c/a;->a:I */
		 /* iget v1, p0, Lcom/a/c/a;->d:I */
		 /* iget v2, p0, Lcom/a/c/a;->i:I */
		 /* mul-int/2addr v1, v2 */
		 /* if-lt v0, v1, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lcom/a/c/a;->b:Z */
		 /* iget-boolean v0, p0, Lcom/a/c/a;->f:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v0 = 0; // const/4 v0, 0x0
			 /* iput-boolean v0, p0, Lcom/a/c/a;->b:Z */
			 /* iget v0, p0, Lcom/a/c/a;->h:I */
			 /* iput v0, p0, Lcom/a/c/a;->a:I */
		 } // :cond_0
		 return;
	 } // .end method
	 public void a ( android.graphics.Canvas p0, android.graphics.Paint p1, android.graphics.Matrix p2, Integer p3 ) {
		 /* .locals 1 */
		 v0 = this.e;
		 (( java.util.ArrayList ) v0 ).get ( p4 ); // invoke-virtual {v0, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
		 /* check-cast v0, Landroid/graphics/Bitmap; */
		 (( android.graphics.Canvas ) p1 ).drawBitmap ( v0, p3, p2 ); // invoke-virtual {p1, v0, p3, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
		 return;
	 } // .end method

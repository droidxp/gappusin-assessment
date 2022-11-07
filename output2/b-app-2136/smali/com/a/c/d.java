public class com.a.c.d {
	 /* # instance fields */
	 public Integer a;
	 private Float b;
	 private Float c;
	 private Integer d;
	 private Integer e;
	 /* # direct methods */
	 public com.a.c.d ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lcom/a/c/d;->b:F */
		 /* iput p2, p0, Lcom/a/c/d;->c:F */
		 /* float-to-int v0, p3 */
		 /* iput v0, p0, Lcom/a/c/d;->d:I */
		 /* float-to-int v0, p4 */
		 /* iput v0, p0, Lcom/a/c/d;->e:I */
		 /* iput p5, p0, Lcom/a/c/d;->a:I */
		 return;
	 } // .end method
	 public com.a.c.d ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lcom/a/c/d;->b:F */
		 /* iput p2, p0, Lcom/a/c/d;->c:F */
		 /* iput p3, p0, Lcom/a/c/d;->d:I */
		 /* iput p4, p0, Lcom/a/c/d;->e:I */
		 /* iput p5, p0, Lcom/a/c/d;->a:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean a ( Float p0, Float p1 ) {
		 /* .locals 6 */
		 /* new-instance v0, Landroid/graphics/Rect; */
		 /* iget v1, p0, Lcom/a/c/d;->b:F */
		 /* float-to-int v1, v1 */
		 /* iget v2, p0, Lcom/a/c/d;->c:F */
		 /* float-to-int v2, v2 */
		 /* iget v3, p0, Lcom/a/c/d;->b:F */
		 /* float-to-int v3, v3 */
		 /* iget v4, p0, Lcom/a/c/d;->d:I */
		 /* add-int/2addr v3, v4 */
		 /* iget v4, p0, Lcom/a/c/d;->c:F */
		 /* float-to-int v4, v4 */
		 /* iget v5, p0, Lcom/a/c/d;->e:I */
		 /* add-int/2addr v4, v5 */
		 /* invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V */
		 /* float-to-int v1, p1 */
		 /* float-to-int v2, p2 */
		 v0 = 		 (( android.graphics.Rect ) v0 ).contains ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Rect;->contains(II)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v0 = 1; // const/4 v0, 0x1
		 } // :goto_0
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // .end method

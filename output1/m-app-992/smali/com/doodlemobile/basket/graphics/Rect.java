public class com.doodlemobile.basket.graphics.Rect implements com.doodlemobile.basket.graphics.b {
	 /* # interfaces */
	 /* # instance fields */
	 private Float a;
	 private Float b;
	 private Float c;
	 private Float d;
	 private Float e;
	 private Float f;
	 private Float g;
	 private Float h;
	 /* # direct methods */
	 public com.doodlemobile.basket.graphics.Rect ( ) {
		 /* .locals 1 */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput v0, p0, Lcom/doodlemobile/basket/graphics/Rect;->e:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/graphics/Rect;->f:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/graphics/Rect;->g:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/graphics/Rect;->h:F */
		 return;
	 } // .end method
	 protected static native void nativeRender ( Long p0, Float p1, Float p2, Float p3, Float p4, Float p5, Float p6, Float p7, Float p8 ) {
	 } // .end method
	 /* # virtual methods */
	 public final void a ( com.doodlemobile.basket.math.MatrixStack p0, java.lang.Object p1 ) {
		 /* .locals 10 */
		 (( com.doodlemobile.basket.math.MatrixStack ) p1 ).d ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J
		 /* move-result-wide v0 */
		 /* iget v2, p0, Lcom/doodlemobile/basket/graphics/Rect;->c:F */
		 /* iget v3, p0, Lcom/doodlemobile/basket/graphics/Rect;->d:F */
		 /* iget v4, p0, Lcom/doodlemobile/basket/graphics/Rect;->a:F */
		 /* iget v5, p0, Lcom/doodlemobile/basket/graphics/Rect;->b:F */
		 /* iget v6, p0, Lcom/doodlemobile/basket/graphics/Rect;->e:F */
		 /* iget v7, p0, Lcom/doodlemobile/basket/graphics/Rect;->f:F */
		 /* iget v8, p0, Lcom/doodlemobile/basket/graphics/Rect;->g:F */
		 /* iget v9, p0, Lcom/doodlemobile/basket/graphics/Rect;->h:F */
		 /* invoke-static/range {v0 ..v9}, Lcom/doodlemobile/basket/graphics/Rect;->nativeRender(JFFFFFFFF)V */
		 return;
	 } // .end method

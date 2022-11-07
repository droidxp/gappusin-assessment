public class com.doodlemobile.basket.a.a implements com.doodlemobile.basket.graphics.b {
	 /* # interfaces */
	 /* # instance fields */
	 protected com.doodlemobile.basket.opengl.NativeBuffer a;
	 protected Integer b;
	 private Float c;
	 private Float d;
	 private Float e;
	 private Float f;
	 /* # direct methods */
	 public com.doodlemobile.basket.a.a ( ) {
		 /* .locals 1 */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput v0, p0, Lcom/doodlemobile/basket/a/a;->c:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/a/a;->d:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/a/a;->e:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/a/a;->f:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( com.doodlemobile.basket.math.MatrixStack p0, java.lang.Object p1 ) {
		 /* .locals 10 */
		 (( com.doodlemobile.basket.math.MatrixStack ) p1 ).d ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J
		 /* move-result-wide v0 */
		 v2 = this.a;
		 (( com.doodlemobile.basket.opengl.NativeBuffer ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/opengl/NativeBuffer;->b()J
		 /* move-result-wide v2 */
		 /* iget v4, p0, Lcom/doodlemobile/basket/a/a;->b:I */
		 /* iget v5, p0, Lcom/doodlemobile/basket/a/a;->c:F */
		 /* iget v6, p0, Lcom/doodlemobile/basket/a/a;->d:F */
		 /* iget v7, p0, Lcom/doodlemobile/basket/a/a;->e:F */
		 /* iget v8, p0, Lcom/doodlemobile/basket/a/a;->f:F */
		 /* const/high16 v9, 0x3f800000 # 1.0f */
		 /* invoke-static/range {v0 ..v9}, Lcom/doodlemobile/basket/util/Util;->nativeRenderPolygon(JJIFFFFF)V */
		 return;
	 } // .end method

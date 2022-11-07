public class inal implements com.doodlemobile.basket.b.e {
	 /* # interfaces */
	 /* # instance fields */
	 public com.doodlemobile.basket.graphics.b a;
	 public Float b;
	 public Float c;
	 public Float d;
	 public Float e;
	 public Float f;
	 public Float g;
	 public Float h;
	 public Float i;
	 public Float j;
	 public Integer k;
	 com.doodlemobile.basket.game2d.d l;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( ) {
		 /* .locals 0 */
		 com.doodlemobile.basket.game2d.a .a ( p0 );
		 return;
	 } // .end method
	 public final void b ( ) {
		 /* .locals 2 */
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/doodlemobile/basket/game2d/d;->d:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/game2d/d;->c:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/game2d/d;->b:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/game2d/d;->f:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/game2d/d;->e:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/game2d/d;->j:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/game2d/d;->i:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/game2d/d;->h:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/game2d/d;->g:F */
		 return;
	 } // .end method
	 public final void c ( Object p0, com.doodlemobile.basket.math.MatrixStack p1 ) {
		 /* .locals 4 */
		 /* const/high16 v3, 0x3f800000 # 1.0f */
		 int v2 = 0; // const/4 v2, 0x0
		 /* iget v0, p0, Lcom/doodlemobile/basket/game2d/d;->b:F */
		 /* cmpl-float v0, v0, v2 */
		 /* if-nez v0, :cond_0 */
		 /* iget v0, p0, Lcom/doodlemobile/basket/game2d/d;->c:F */
		 /* cmpl-float v0, v0, v2 */
		 /* if-nez v0, :cond_0 */
		 /* iget v0, p0, Lcom/doodlemobile/basket/game2d/d;->d:F */
		 /* cmpl-float v0, v0, v2 */
		 /* if-nez v0, :cond_0 */
		 /* iget v0, p0, Lcom/doodlemobile/basket/game2d/d;->e:F */
		 /* cmpl-float v0, v0, v3 */
		 /* if-nez v0, :cond_0 */
		 /* iget v0, p0, Lcom/doodlemobile/basket/game2d/d;->f:F */
		 /* cmpl-float v0, v0, v3 */
		 if ( v0 != null) { // if-eqz v0, :cond_6
		 } // :cond_0
		 (( com.doodlemobile.basket.math.MatrixStack ) p2 ).b ( ); // invoke-virtual {p2}, Lcom/doodlemobile/basket/math/MatrixStack;->b()V
		 /* iget v0, p0, Lcom/doodlemobile/basket/game2d/d;->b:F */
		 /* cmpl-float v0, v0, v2 */
		 /* if-nez v0, :cond_1 */
		 /* iget v0, p0, Lcom/doodlemobile/basket/game2d/d;->c:F */
		 /* cmpl-float v0, v0, v2 */
		 if ( v0 != null) { // if-eqz v0, :cond_2
		 } // :cond_1
		 /* iget v0, p0, Lcom/doodlemobile/basket/game2d/d;->b:F */
		 /* iget v1, p0, Lcom/doodlemobile/basket/game2d/d;->c:F */
		 (( com.doodlemobile.basket.math.MatrixStack ) p2 ).a ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Lcom/doodlemobile/basket/math/MatrixStack;->a(FF)V
	 } // :cond_2
	 /* iget v0, p0, Lcom/doodlemobile/basket/game2d/d;->d:F */
	 /* cmpl-float v0, v0, v2 */
	 if ( v0 != null) { // if-eqz v0, :cond_3
		 /* iget v0, p0, Lcom/doodlemobile/basket/game2d/d;->d:F */
		 (( com.doodlemobile.basket.math.MatrixStack ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Lcom/doodlemobile/basket/math/MatrixStack;->a(F)V
	 } // :cond_3
	 /* iget v0, p0, Lcom/doodlemobile/basket/game2d/d;->e:F */
	 /* cmpl-float v0, v0, v3 */
	 /* if-nez v0, :cond_4 */
	 /* iget v0, p0, Lcom/doodlemobile/basket/game2d/d;->f:F */
	 /* cmpl-float v0, v0, v3 */
	 if ( v0 != null) { // if-eqz v0, :cond_5
	 } // :cond_4
	 /* iget v0, p0, Lcom/doodlemobile/basket/game2d/d;->e:F */
	 /* iget v1, p0, Lcom/doodlemobile/basket/game2d/d;->f:F */
	 (( com.doodlemobile.basket.math.MatrixStack ) p2 ).b ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Lcom/doodlemobile/basket/math/MatrixStack;->b(FF)V
} // :cond_5
v0 = this.a;
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).c ( ); // invoke-virtual {p2}, Lcom/doodlemobile/basket/math/MatrixStack;->c()V
} // :goto_0
return;
} // :cond_6
v0 = this.a;
} // .end method

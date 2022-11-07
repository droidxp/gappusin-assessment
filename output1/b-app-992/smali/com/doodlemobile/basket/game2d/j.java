public class com.doodlemobile.basket.game2d.j extends com.doodlemobile.basket.game2d.a implements com.doodlemobile.basket.b {
	 /* # interfaces */
	 /* # instance fields */
	 private com.doodlemobile.basket.graphics.e i;
	 private Float j;
	 private Float k;
	 private Float l;
	 private Float m;
	 private com.doodlemobile.basket.graphics.StaticImageDrawable n;
	 /* # direct methods */
	 public com.doodlemobile.basket.game2d.j ( ) {
		 /* .locals 1 */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* invoke-direct {p0, p1}, Lcom/doodlemobile/basket/game2d/a;-><init>(Lcom/doodlemobile/basket/b/b;)V */
		 /* iput v0, p0, Lcom/doodlemobile/basket/game2d/j;->j:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/game2d/j;->k:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/game2d/j;->l:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/game2d/j;->m:F */
		 /* new-instance v0, Lcom/doodlemobile/basket/graphics/StaticImageDrawable; */
		 /* invoke-direct {v0, p2}, Lcom/doodlemobile/basket/graphics/StaticImageDrawable;-><init>(Lcom/doodlemobile/basket/graphics/e;)V */
		 this.n = v0;
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 v0 = 			 (( com.doodlemobile.basket.graphics.e ) p2 ).j ( ); // invoke-virtual {p2}, Lcom/doodlemobile/basket/graphics/e;->j()I
			 /* int-to-float v0, v0 */
			 /* iput v0, p0, Lcom/doodlemobile/basket/game2d/j;->f:F */
			 v0 = 			 (( com.doodlemobile.basket.graphics.e ) p2 ).k ( ); // invoke-virtual {p2}, Lcom/doodlemobile/basket/graphics/e;->k()I
			 /* int-to-float v0, v0 */
			 /* iput v0, p0, Lcom/doodlemobile/basket/game2d/j;->g:F */
		 } // :cond_0
		 this.i = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( Integer p0, Integer p1, java.lang.Object p2 ) {
		 /* .locals 1 */
		 v0 = this.n;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.n;
			 /* check-cast p3, Lcom/doodlemobile/basket/graphics/e; */
			 (( com.doodlemobile.basket.graphics.StaticImageDrawable ) v0 ).a ( p3 ); // invoke-virtual {v0, p3}, Lcom/doodlemobile/basket/graphics/StaticImageDrawable;->a(Lcom/doodlemobile/basket/graphics/e;)V
		 } // :cond_0
		 return;
	 } // .end method
	 public final void a ( Object p0 ) {
		 /* .locals 2 */
		 v0 = this.n;
		 /* if-nez v0, :cond_0 */
	 } // :goto_0
	 return;
} // :cond_0
com.doodlemobile.basket.game2d.j .d ( );
v1 = this.n;
this.a = v1;
/* iget v1, p0, Lcom/doodlemobile/basket/game2d/j;->b:F */
/* iput v1, v0, Lcom/doodlemobile/basket/game2d/d;->b:F */
/* iget v1, p0, Lcom/doodlemobile/basket/game2d/j;->c:F */
/* iput v1, v0, Lcom/doodlemobile/basket/game2d/d;->c:F */
/* iget v1, p0, Lcom/doodlemobile/basket/game2d/j;->e:F */
/* iput v1, v0, Lcom/doodlemobile/basket/game2d/d;->d:F */
/* iget v1, p0, Lcom/doodlemobile/basket/game2d/j;->f:F */
/* iput v1, v0, Lcom/doodlemobile/basket/game2d/d;->e:F */
/* iget v1, p0, Lcom/doodlemobile/basket/game2d/j;->g:F */
/* iput v1, v0, Lcom/doodlemobile/basket/game2d/d;->f:F */
/* iget v1, p0, Lcom/doodlemobile/basket/game2d/j;->j:F */
/* iput v1, v0, Lcom/doodlemobile/basket/game2d/d;->g:F */
/* iget v1, p0, Lcom/doodlemobile/basket/game2d/j;->k:F */
/* iput v1, v0, Lcom/doodlemobile/basket/game2d/d;->h:F */
/* iget v1, p0, Lcom/doodlemobile/basket/game2d/j;->l:F */
/* iput v1, v0, Lcom/doodlemobile/basket/game2d/d;->i:F */
/* iget v1, p0, Lcom/doodlemobile/basket/game2d/j;->m:F */
/* iput v1, v0, Lcom/doodlemobile/basket/game2d/d;->j:F */
(( com.doodlemobile.basket.p ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lcom/doodlemobile/basket/p;->a(Lcom/doodlemobile/basket/b/e;)V
} // .end method
public final void a ( Object p0, Float p1, Float p2 ) {
/* .locals 2 */
v0 = this.n;
/* if-nez v0, :cond_0 */
} // :goto_0
return;
} // :cond_0
com.doodlemobile.basket.game2d.j .d ( );
v1 = this.n;
this.a = v1;
/* iget v1, p0, Lcom/doodlemobile/basket/game2d/j;->b:F */
/* sub-float/2addr v1, p2 */
/* iput v1, v0, Lcom/doodlemobile/basket/game2d/d;->b:F */
/* iget v1, p0, Lcom/doodlemobile/basket/game2d/j;->c:F */
/* sub-float/2addr v1, p3 */
/* iput v1, v0, Lcom/doodlemobile/basket/game2d/d;->c:F */
/* iget v1, p0, Lcom/doodlemobile/basket/game2d/j;->e:F */
/* iput v1, v0, Lcom/doodlemobile/basket/game2d/d;->d:F */
/* iget v1, p0, Lcom/doodlemobile/basket/game2d/j;->f:F */
/* iput v1, v0, Lcom/doodlemobile/basket/game2d/d;->e:F */
/* iget v1, p0, Lcom/doodlemobile/basket/game2d/j;->g:F */
/* iput v1, v0, Lcom/doodlemobile/basket/game2d/d;->f:F */
/* iget v1, p0, Lcom/doodlemobile/basket/game2d/j;->j:F */
/* iput v1, v0, Lcom/doodlemobile/basket/game2d/d;->g:F */
/* iget v1, p0, Lcom/doodlemobile/basket/game2d/j;->k:F */
/* iput v1, v0, Lcom/doodlemobile/basket/game2d/d;->h:F */
/* iget v1, p0, Lcom/doodlemobile/basket/game2d/j;->l:F */
/* iput v1, v0, Lcom/doodlemobile/basket/game2d/d;->i:F */
/* iget v1, p0, Lcom/doodlemobile/basket/game2d/j;->m:F */
/* iput v1, v0, Lcom/doodlemobile/basket/game2d/d;->j:F */
(( com.doodlemobile.basket.p ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lcom/doodlemobile/basket/p;->a(Lcom/doodlemobile/basket/b/e;)V
} // .end method
public final void h ( ) {
/* .locals 1 */
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.i;
(( com.doodlemobile.basket.graphics.e ) v0 ).n ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/graphics/e;->n()V
} // :cond_0
return;
} // .end method
public final void j ( ) {
/* .locals 2 */
/* const/high16 v1, 0x3f800000 # 1.0f */
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.i;
v0 = (( com.doodlemobile.basket.graphics.e ) v0 ).j ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/graphics/e;->j()I
/* int-to-float v0, v0 */
/* mul-float/2addr v0, v1 */
/* iput v0, p0, Lcom/doodlemobile/basket/game2d/j;->f:F */
v0 = this.i;
v0 = (( com.doodlemobile.basket.graphics.e ) v0 ).k ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/graphics/e;->k()I
/* int-to-float v0, v0 */
/* mul-float/2addr v0, v1 */
/* iput v0, p0, Lcom/doodlemobile/basket/game2d/j;->g:F */
} // :cond_0
return;
} // .end method

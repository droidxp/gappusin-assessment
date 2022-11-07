public class com.doodlemobile.basket.game2d.b extends com.doodlemobile.basket.game2d.a implements com.doodlemobile.basket.b implements com.doodlemobile.basket.graphics.b implements com.doodlemobile.basket.ui.a.o {
	 /* # interfaces */
	 /* # instance fields */
	 private com.doodlemobile.basket.graphics.i i;
	 private com.doodlemobile.basket.graphics.Animation j;
	 private Float k;
	 private Float l;
	 private Float m;
	 private Float n;
	 private com.doodlemobile.basket.graphics.Animation o;
	 /* # direct methods */
	 public com.doodlemobile.basket.game2d.b ( ) {
		 /* .locals 1 */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* invoke-direct {p0, p1}, Lcom/doodlemobile/basket/game2d/a;-><init>(Lcom/doodlemobile/basket/b/b;)V */
		 /* iput v0, p0, Lcom/doodlemobile/basket/game2d/b;->k:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/game2d/b;->l:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/game2d/b;->m:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/game2d/b;->n:F */
		 com.doodlemobile.basket.graphics.Animation .a ( p1,p2 );
		 this.o = v0;
		 this.j = v0;
		 v0 = this.j;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.j;
			 (( com.doodlemobile.basket.graphics.Animation ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/graphics/Animation;->a()Lcom/doodlemobile/basket/graphics/i;
			 this.i = v0;
		 } // :cond_0
		 return;
	 } // .end method
	 public com.doodlemobile.basket.game2d.b ( ) {
		 /* .locals 1 */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* invoke-direct {p0, p1}, Lcom/doodlemobile/basket/game2d/a;-><init>(Lcom/doodlemobile/basket/b/b;)V */
		 /* iput v0, p0, Lcom/doodlemobile/basket/game2d/b;->k:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/game2d/b;->l:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/game2d/b;->m:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/game2d/b;->n:F */
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 this.o = p2;
			 this.j = p2;
			 (( com.doodlemobile.basket.graphics.Animation ) p2 ).a ( ); // invoke-virtual {p2}, Lcom/doodlemobile/basket/graphics/Animation;->a()Lcom/doodlemobile/basket/graphics/i;
			 this.i = v0;
		 } // :cond_0
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( Float p0, Float p1, Float p2 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lcom/doodlemobile/basket/game2d/b;->k:F */
		 /* iput p2, p0, Lcom/doodlemobile/basket/game2d/b;->l:F */
		 /* iput p3, p0, Lcom/doodlemobile/basket/game2d/b;->m:F */
		 return;
	 } // .end method
	 public final void a ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.i;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.i;
		 } // :cond_0
		 return;
	 } // .end method
	 public final void a ( Integer p0, Integer p1, java.lang.Object p2 ) {
		 /* .locals 0 */
		 /* check-cast p3, Lcom/doodlemobile/basket/graphics/Animation; */
		 this.o = p3;
		 return;
	 } // .end method
	 public void a ( Long p0 ) {
		 /* .locals 1 */
		 v0 = this.i;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.i;
		 } // :cond_0
		 /* invoke-super {p0, p1, p2}, Lcom/doodlemobile/basket/game2d/a;->a(J)V */
		 return;
	 } // .end method
	 public final void a ( com.doodlemobile.basket.math.MatrixStack p0, java.lang.Object p1 ) {
		 /* .locals 7 */
		 v0 = this.o;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* check-cast p2, Lcom/doodlemobile/basket/game2d/d; */
			 /* iget v1, p2, Lcom/doodlemobile/basket/game2d/d;->g:F */
			 /* iget v4, p2, Lcom/doodlemobile/basket/game2d/d;->h:F */
			 /* iget v5, p2, Lcom/doodlemobile/basket/game2d/d;->i:F */
			 /* iget v6, p2, Lcom/doodlemobile/basket/game2d/d;->j:F */
			 v0 = this.o;
			 /* iget v2, p2, Lcom/doodlemobile/basket/game2d/d;->k:I */
			 /* mul-float v3, v1, v6 */
			 /* mul-float/2addr v4, v6 */
			 /* mul-float/2addr v5, v6 */
			 /* move-object v1, p1 */
			 /* invoke-virtual/range {v0 ..v6}, Lcom/doodlemobile/basket/graphics/Animation;->a(Lcom/doodlemobile/basket/math/MatrixStack;IFFFF)V */
		 } // :cond_0
		 return;
	 } // .end method
	 public final void a ( Object p0 ) {
		 /* .locals 3 */
		 int v2 = -1; // const/4 v2, -0x1
		 v0 = this.i;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 v0 = 			 v0 = this.i;
		 } // :goto_0
		 v1 = this.i;
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* if-ne v0, v2, :cond_2 */
		 } // :cond_0
	 } // :goto_1
	 return;
} // :cond_1
/* move v0, v2 */
} // :cond_2
com.doodlemobile.basket.game2d.b .d ( );
this.a = p0;
/* iget v2, p0, Lcom/doodlemobile/basket/game2d/b;->b:F */
/* iput v2, v1, Lcom/doodlemobile/basket/game2d/d;->b:F */
/* iget v2, p0, Lcom/doodlemobile/basket/game2d/b;->b:F */
/* iput v2, v1, Lcom/doodlemobile/basket/game2d/d;->c:F */
/* iget v2, p0, Lcom/doodlemobile/basket/game2d/b;->e:F */
/* iput v2, v1, Lcom/doodlemobile/basket/game2d/d;->d:F */
/* iget v2, p0, Lcom/doodlemobile/basket/game2d/b;->f:F */
/* iput v2, v1, Lcom/doodlemobile/basket/game2d/d;->e:F */
/* iget v2, p0, Lcom/doodlemobile/basket/game2d/b;->g:F */
/* iput v2, v1, Lcom/doodlemobile/basket/game2d/d;->f:F */
/* iget v2, p0, Lcom/doodlemobile/basket/game2d/b;->k:F */
/* iput v2, v1, Lcom/doodlemobile/basket/game2d/d;->g:F */
/* iget v2, p0, Lcom/doodlemobile/basket/game2d/b;->l:F */
/* iput v2, v1, Lcom/doodlemobile/basket/game2d/d;->h:F */
/* iget v2, p0, Lcom/doodlemobile/basket/game2d/b;->m:F */
/* iput v2, v1, Lcom/doodlemobile/basket/game2d/d;->i:F */
/* iget v2, p0, Lcom/doodlemobile/basket/game2d/b;->n:F */
/* iput v2, v1, Lcom/doodlemobile/basket/game2d/d;->j:F */
/* iput v0, v1, Lcom/doodlemobile/basket/game2d/d;->k:I */
(( com.doodlemobile.basket.p ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Lcom/doodlemobile/basket/p;->a(Lcom/doodlemobile/basket/b/e;)V
} // .end method
public final void a ( Object p0, Float p1, Float p2 ) {
/* .locals 3 */
int v2 = -1; // const/4 v2, -0x1
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = v0 = this.i;
} // :goto_0
v1 = this.i;
if ( v1 != null) { // if-eqz v1, :cond_0
/* if-ne v0, v2, :cond_2 */
} // :cond_0
} // :goto_1
return;
} // :cond_1
/* move v0, v2 */
} // :cond_2
com.doodlemobile.basket.game2d.b .d ( );
this.a = p0;
/* iget v2, p0, Lcom/doodlemobile/basket/game2d/b;->b:F */
/* sub-float/2addr v2, p2 */
/* iput v2, v1, Lcom/doodlemobile/basket/game2d/d;->b:F */
/* iget v2, p0, Lcom/doodlemobile/basket/game2d/b;->c:F */
/* sub-float/2addr v2, p3 */
/* iput v2, v1, Lcom/doodlemobile/basket/game2d/d;->c:F */
/* iget v2, p0, Lcom/doodlemobile/basket/game2d/b;->e:F */
/* iput v2, v1, Lcom/doodlemobile/basket/game2d/d;->d:F */
/* iget v2, p0, Lcom/doodlemobile/basket/game2d/b;->f:F */
/* iput v2, v1, Lcom/doodlemobile/basket/game2d/d;->e:F */
/* iget v2, p0, Lcom/doodlemobile/basket/game2d/b;->g:F */
/* iput v2, v1, Lcom/doodlemobile/basket/game2d/d;->f:F */
/* iget v2, p0, Lcom/doodlemobile/basket/game2d/b;->k:F */
/* iput v2, v1, Lcom/doodlemobile/basket/game2d/d;->g:F */
/* iget v2, p0, Lcom/doodlemobile/basket/game2d/b;->l:F */
/* iput v2, v1, Lcom/doodlemobile/basket/game2d/d;->h:F */
/* iget v2, p0, Lcom/doodlemobile/basket/game2d/b;->m:F */
/* iput v2, v1, Lcom/doodlemobile/basket/game2d/d;->i:F */
/* iget v2, p0, Lcom/doodlemobile/basket/game2d/b;->n:F */
/* iput v2, v1, Lcom/doodlemobile/basket/game2d/d;->j:F */
/* iput v0, v1, Lcom/doodlemobile/basket/game2d/d;->k:I */
(( com.doodlemobile.basket.p ) p1 ).a ( v1 ); // invoke-virtual {p1, v1}, Lcom/doodlemobile/basket/p;->a(Lcom/doodlemobile/basket/b/e;)V
} // .end method
public final void c ( Float p0 ) {
/* .locals 0 */
/* iput p1, p0, Lcom/doodlemobile/basket/game2d/b;->n:F */
return;
} // .end method
public final void h ( ) {
/* .locals 1 */
v0 = this.j;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.j;
(( com.doodlemobile.basket.graphics.Animation ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/graphics/Animation;->b()V
} // :cond_0
return;
} // .end method
public final Integer k ( ) {
/* .locals 1 */
v0 = this.i;
/* if-nez v0, :cond_0 */
int v0 = -1; // const/4 v0, -0x1
} // :goto_0
} // :cond_0
v0 = v0 = this.i;
} // .end method
public final Float l ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/game2d/b;->k:F */
} // .end method
public final Float m ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/game2d/b;->l:F */
} // .end method
public final Float n ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/game2d/b;->m:F */
} // .end method
public final Float o ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method

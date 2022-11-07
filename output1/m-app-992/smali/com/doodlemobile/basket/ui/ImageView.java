public class com.doodlemobile.basket.ui.ImageView extends com.doodlemobile.basket.ui.e implements com.doodlemobile.basket.b.e implements com.doodlemobile.basket.ui.a.o {
	 /* # interfaces */
	 /* # instance fields */
	 private Float A;
	 private Float B;
	 private Float C;
	 private Float D;
	 private com.doodlemobile.basket.graphics.e a;
	 private Integer q;
	 private Float r;
	 private Float s;
	 private Float t;
	 private Float u;
	 private com.doodlemobile.basket.graphics.StaticImageDrawable v;
	 private Float w;
	 private Float x;
	 private Float y;
	 private Float z;
	 /* # direct methods */
	 public com.doodlemobile.basket.ui.ImageView ( ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 /* invoke-direct {p0, p1, p2}, Lcom/doodlemobile/basket/ui/e;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;)V */
		 int v0 = -1; // const/4 v0, -0x1
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/ImageView;->q:I */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/ImageView;->r:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/ImageView;->s:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/ImageView;->t:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/ImageView;->u:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/ImageView;->w:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/ImageView;->x:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/ImageView;->y:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/ImageView;->z:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/ImageView;->A:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/ImageView;->B:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/ImageView;->C:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/ImageView;->D:F */
		 final String v0 = "texture"; // const-string v0, "texture"
		 v0 = 		 int v1 = 0; // const/4 v1, 0x0
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 com.doodlemobile.basket.graphics.e .a ( p1,v0 );
			 this.a = v0;
			 v0 = this.a;
			 v0 = 			 (( com.doodlemobile.basket.graphics.e ) v0 ).j ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/graphics/e;->j()I
			 /* int-to-float v0, v0 */
			 /* iput v0, p0, Lcom/doodlemobile/basket/ui/ImageView;->w:F */
			 v0 = this.a;
			 v0 = 			 (( com.doodlemobile.basket.graphics.e ) v0 ).k ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/graphics/e;->k()I
			 /* int-to-float v0, v0 */
			 /* iput v0, p0, Lcom/doodlemobile/basket/ui/ImageView;->x:F */
		 } // :cond_0
		 final String v0 = "layout_width"; // const-string v0, "layout_width"
		 v0 = 		 /* iget v1, p0, Lcom/doodlemobile/basket/ui/ImageView;->w:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/ImageView;->w:F */
		 final String v0 = "layout_height"; // const-string v0, "layout_height"
		 v0 = 		 /* iget v1, p0, Lcom/doodlemobile/basket/ui/ImageView;->x:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/ImageView;->x:F */
		 final String v0 = "layout_sx"; // const-string v0, "layout_sx"
		 v0 = 		 /* iget v1, p0, Lcom/doodlemobile/basket/ui/ImageView;->y:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/ImageView;->y:F */
		 final String v0 = "layout_sy"; // const-string v0, "layout_sy"
		 v0 = 		 /* iget v1, p0, Lcom/doodlemobile/basket/ui/ImageView;->z:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/ImageView;->z:F */
		 /* new-instance v0, Lcom/doodlemobile/basket/graphics/StaticImageDrawable; */
		 v1 = this.a;
		 /* invoke-direct {v0, v1}, Lcom/doodlemobile/basket/graphics/StaticImageDrawable;-><init>(Lcom/doodlemobile/basket/graphics/e;)V */
		 this.v = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public final void a ( Float p0, Float p1, Float p2 ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* iput p1, p0, Lcom/doodlemobile/basket/ui/ImageView;->r:F */
		 /* iput p2, p0, Lcom/doodlemobile/basket/ui/ImageView;->s:F */
		 /* iput p3, p0, Lcom/doodlemobile/basket/ui/ImageView;->t:F */
		 v0 = this.i;
		 int v1 = 4; // const/4 v1, 0x4
		 v2 = 		 java.lang.Float .floatToIntBits ( p1 );
		 v0 = this.i;
		 int v1 = 5; // const/4 v1, 0x5
		 v2 = 		 java.lang.Float .floatToIntBits ( p2 );
		 v0 = this.i;
		 int v1 = 6; // const/4 v1, 0x6
		 v2 = 		 java.lang.Float .floatToIntBits ( p3 );
		 return;
	 } // .end method
	 public final void a ( Integer p0, Integer p1, java.lang.Object p2 ) {
		 /* .locals 1 */
		 /* packed-switch p1, :pswitch_data_0 */
		 /* invoke-super {p0, p1, p2, p3}, Lcom/doodlemobile/basket/ui/e;->a(IILjava/lang/Object;)V */
	 } // :cond_0
} // :goto_0
return;
/* :pswitch_0 */
v0 = this.v;
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.v;
	 /* check-cast p3, Lcom/doodlemobile/basket/graphics/e; */
	 (( com.doodlemobile.basket.graphics.StaticImageDrawable ) v0 ).a ( p3 ); // invoke-virtual {v0, p3}, Lcom/doodlemobile/basket/graphics/StaticImageDrawable;->a(Lcom/doodlemobile/basket/graphics/e;)V
	 /* :pswitch_1 */
	 v0 = 	 java.lang.Float .intBitsToFloat ( p2 );
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/ImageView;->A:F */
	 /* :pswitch_2 */
	 v0 = 	 java.lang.Float .intBitsToFloat ( p2 );
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/ImageView;->B:F */
	 /* :pswitch_3 */
	 v0 = 	 java.lang.Float .intBitsToFloat ( p2 );
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/ImageView;->C:F */
	 /* :pswitch_4 */
	 v0 = 	 java.lang.Float .intBitsToFloat ( p2 );
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/ImageView;->D:F */
	 /* :pswitch_5 */
	 v0 = 	 java.lang.Float .intBitsToFloat ( p2 );
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/ImageView;->y:F */
	 /* :pswitch_6 */
	 v0 = 	 java.lang.Float .intBitsToFloat ( p2 );
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/ImageView;->z:F */
	 /* :pswitch_7 */
	 v0 = 	 java.lang.Float .intBitsToFloat ( p2 );
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/ImageView;->w:F */
	 /* :pswitch_8 */
	 v0 = 	 java.lang.Float .intBitsToFloat ( p2 );
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/ImageView;->x:F */
	 /* nop */
	 /* :pswitch_data_0 */
	 /* .packed-switch 0x3 */
	 /* :pswitch_0 */
	 /* :pswitch_1 */
	 /* :pswitch_2 */
	 /* :pswitch_3 */
	 /* :pswitch_4 */
	 /* :pswitch_5 */
	 /* :pswitch_6 */
	 /* :pswitch_7 */
	 /* :pswitch_8 */
} // .end packed-switch
} // .end method
public final void a ( Object p0 ) {
/* .locals 3 */
v0 = this.a;
/* if-eq v0, p1, :cond_0 */
this.a = p1;
v0 = this.i;
int v1 = 3; // const/4 v1, 0x3
int v2 = 0; // const/4 v2, 0x0
} // :cond_0
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 1 */
v0 = this.a;
(( com.doodlemobile.basket.graphics.e ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/doodlemobile/basket/graphics/e;->a(Lcom/doodlemobile/basket/opengl/m;)V
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/ImageView;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
com.doodlemobile.basket.e .a ( p1,p0 );
/* invoke-super {p0, p1}, Lcom/doodlemobile/basket/ui/e;->a(Lcom/doodlemobile/basket/p;)V */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
	 (( com.doodlemobile.basket.p ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Lcom/doodlemobile/basket/p;->a(Lcom/doodlemobile/basket/b/e;)V
} // :cond_0
com.doodlemobile.basket.e .b ( p1,p0 );
} // :cond_1
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
/* invoke-super {p0, p1}, Lcom/doodlemobile/basket/ui/e;->a(Lcom/doodlemobile/basket/ui/b;)V */
v0 = this.i;
/* const/16 v1, 0x8 */
/* iget v2, p1, Lcom/doodlemobile/basket/ui/b;->e:F */
v2 = java.lang.Float .floatToIntBits ( v2 );
v0 = this.i;
/* const/16 v1, 0x9 */
/* iget v2, p1, Lcom/doodlemobile/basket/ui/b;->f:F */
v2 = java.lang.Float .floatToIntBits ( v2 );
v0 = this.i;
/* const/16 v1, 0xa */
/* iget v2, p1, Lcom/doodlemobile/basket/ui/b;->a:F */
v2 = java.lang.Float .floatToIntBits ( v2 );
v0 = this.i;
/* const/16 v1, 0xb */
/* iget v2, p1, Lcom/doodlemobile/basket/ui/b;->b:F */
v2 = java.lang.Float .floatToIntBits ( v2 );
return;
} // .end method
protected final void a ( Boolean p0, Float p1, Float p2, Float p3, Float p4 ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
/* invoke-super/range {p0 ..p5}, Lcom/doodlemobile/basket/ui/e;->a(ZFFFF)V */
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = this.i;
/* const/16 v1, 0x8 */
v2 = this.c;
/* iget v2, v2, Lcom/doodlemobile/basket/ui/b;->e:F */
v2 = java.lang.Float .floatToIntBits ( v2 );
v0 = this.i;
/* const/16 v1, 0x9 */
v2 = this.c;
/* iget v2, v2, Lcom/doodlemobile/basket/ui/b;->f:F */
v2 = java.lang.Float .floatToIntBits ( v2 );
} // :cond_0
return;
} // .end method
public final void b_ ( Float p0 ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
v0 = this.i;
/* const/16 v1, 0x8 */
v2 = java.lang.Float .floatToIntBits ( p1 );
v0 = this.i;
/* const/16 v1, 0x9 */
v2 = java.lang.Float .floatToIntBits ( p1 );
return;
} // .end method
public final void c ( ) {
/* .locals 1 */
/* invoke-super {p0}, Lcom/doodlemobile/basket/ui/e;->c()V */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
(( com.doodlemobile.basket.graphics.e ) v0 ).n ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/graphics/e;->n()V
} // :cond_0
return;
} // .end method
public final void c ( Float p0 ) {
/* .locals 4 */
/* iput p1, p0, Lcom/doodlemobile/basket/ui/ImageView;->u:F */
v0 = this.i;
int v1 = 7; // const/4 v1, 0x7
v2 = java.lang.Float .floatToIntBits ( p1 );
int v3 = 0; // const/4 v3, 0x0
return;
} // .end method
public final void c ( Object p0, com.doodlemobile.basket.math.MatrixStack p1 ) {
/* .locals 8 */
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).b ( ); // invoke-virtual {p2}, Lcom/doodlemobile/basket/math/MatrixStack;->b()V
/* iget v0, p0, Lcom/doodlemobile/basket/ui/ImageView;->w:F */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/ImageView;->x:F */
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).b ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Lcom/doodlemobile/basket/math/MatrixStack;->b(FF)V
/* iget v0, p0, Lcom/doodlemobile/basket/ui/ImageView;->y:F */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/ImageView;->z:F */
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).b ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Lcom/doodlemobile/basket/math/MatrixStack;->b(FF)V
v0 = this.v;
/* iget v2, p0, Lcom/doodlemobile/basket/ui/ImageView;->w:F */
/* iget v3, p0, Lcom/doodlemobile/basket/ui/ImageView;->x:F */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/ImageView;->A:F */
/* iget v4, p0, Lcom/doodlemobile/basket/ui/ImageView;->D:F */
/* mul-float/2addr v4, v1 */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/ImageView;->B:F */
/* iget v5, p0, Lcom/doodlemobile/basket/ui/ImageView;->D:F */
/* mul-float/2addr v5, v1 */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/ImageView;->C:F */
/* iget v6, p0, Lcom/doodlemobile/basket/ui/ImageView;->D:F */
/* mul-float/2addr v6, v1 */
/* iget v7, p0, Lcom/doodlemobile/basket/ui/ImageView;->D:F */
/* move-object v1, p2 */
/* invoke-virtual/range {v0 ..v7}, Lcom/doodlemobile/basket/graphics/StaticImageDrawable;->a(Lcom/doodlemobile/basket/math/MatrixStack;FFFFFF)V */
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).c ( ); // invoke-virtual {p2}, Lcom/doodlemobile/basket/math/MatrixStack;->c()V
return;
} // .end method
public final com.doodlemobile.basket.graphics.e d ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
public final Float l ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/ImageView;->r:F */
} // .end method
public final Float m ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/ImageView;->s:F */
} // .end method
public final Float n ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/ImageView;->t:F */
} // .end method
public final Float o ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/ImageView;->u:F */
} // .end method

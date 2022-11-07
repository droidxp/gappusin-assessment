public class com.doodlemobile.basket.ui.TextView extends com.doodlemobile.basket.ui.e implements com.doodlemobile.basket.b implements com.doodlemobile.basket.b.e implements com.doodlemobile.basket.ui.a.o {
	 /* # interfaces */
	 /* # instance fields */
	 private com.doodlemobile.basket.graphics.a A;
	 private Float B;
	 private Float C;
	 private Float D;
	 private Float E;
	 private Float F;
	 private Float G;
	 private Float H;
	 private Float I;
	 private Float J;
	 private Float K;
	 private Float L;
	 private Boolean M;
	 private java.lang.CharSequence N;
	 private Integer a;
	 private com.doodlemobile.basket.graphics.d q;
	 private com.doodlemobile.basket.b.b r;
	 private Boolean s;
	 private Float t;
	 private java.lang.CharSequence u;
	 private Float v;
	 private Float w;
	 private Float x;
	 private Float y;
	 private Float z;
	 /* # direct methods */
	 public com.doodlemobile.basket.ui.TextView ( ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 int v2 = 0; // const/4 v2, 0x0
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 /* invoke-direct {p0, p1, p2}, Lcom/doodlemobile/basket/ui/e;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;)V */
		 /* const/16 v0, 0xa */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/TextView;->a:I */
		 /* iput-boolean v3, p0, Lcom/doodlemobile/basket/ui/TextView;->s:Z */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/TextView;->w:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/TextView;->x:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/TextView;->y:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/TextView;->z:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/TextView;->H:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/TextView;->I:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/TextView;->J:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/TextView;->K:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/TextView;->L:F */
		 /* iput-boolean v3, p0, Lcom/doodlemobile/basket/ui/TextView;->M:Z */
		 this.r = p1;
		 v0 = 		 final String v0 = "font"; // const-string v0, "font"
		 com.doodlemobile.basket.graphics.d .a ( p1,v0 );
		 this.q = v0;
		 v0 = 		 final String v0 = "red"; // const-string v0, "red"
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/TextView;->I:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/TextView;->w:F */
		 v0 = 		 final String v0 = "green"; // const-string v0, "green"
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/TextView;->J:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/TextView;->x:F */
		 v0 = 		 final String v0 = "blue"; // const-string v0, "blue"
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/TextView;->K:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/TextView;->y:F */
		 v0 = 		 final String v0 = "alpha"; // const-string v0, "alpha"
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/TextView;->L:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/TextView;->z:F */
		 v0 = 		 final String v0 = "scale"; // const-string v0, "scale"
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/TextView;->H:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/TextView;->t:F */
		 final String v0 = "maxlen"; // const-string v0, "maxlen"
		 v0 = 		 /* iget v1, p0, Lcom/doodlemobile/basket/ui/TextView;->a:I */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/TextView;->a:I */
		 v0 = this.q;
		 /* iget v1, p0, Lcom/doodlemobile/basket/ui/TextView;->a:I */
		 (( com.doodlemobile.basket.graphics.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/graphics/d;->a(I)Lcom/doodlemobile/basket/graphics/a;
		 this.A = v0;
		 v0 = 		 final String v0 = "multiline"; // const-string v0, "multiline"
		 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/ui/TextView;->M:Z */
		 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/ui/TextView;->s:Z */
		 final String v0 = "text"; // const-string v0, "text"
		 this.u = v0;
		 v0 = this.c;
		 /* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->a:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/TextView;->D:F */
		 v0 = this.c;
		 /* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->b:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/TextView;->E:F */
		 final String v0 = "line_height"; // const-string v0, "line_height"
		 v0 = 		 int v1 = 0; // const/4 v1, 0x0
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/TextView;->G:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/TextView;->v:F */
		 v0 = this.u;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.u;
			 (( com.doodlemobile.basket.ui.TextView ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
		 } // :cond_0
		 return;
	 } // .end method
	 public com.doodlemobile.basket.ui.TextView ( ) {
		 /* .locals 4 */
		 int v3 = 3; // const/4 v3, 0x3
		 int v2 = 0; // const/4 v2, 0x0
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 /* invoke-direct {p0, p1}, Lcom/doodlemobile/basket/ui/e;-><init>(Lcom/doodlemobile/basket/b/b;)V */
		 /* const/16 v0, 0xa */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/TextView;->a:I */
		 /* iput-boolean v2, p0, Lcom/doodlemobile/basket/ui/TextView;->s:Z */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/TextView;->w:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/TextView;->x:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/TextView;->y:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/TextView;->z:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/TextView;->H:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/TextView;->I:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/TextView;->J:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/TextView;->K:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/TextView;->L:F */
		 /* iput-boolean v2, p0, Lcom/doodlemobile/basket/ui/TextView;->M:Z */
		 this.r = p1;
		 this.q = p2;
		 /* iput v3, p0, Lcom/doodlemobile/basket/ui/TextView;->a:I */
		 /* iget v0, p0, Lcom/doodlemobile/basket/ui/TextView;->f:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/TextView;->F:F */
		 (( com.doodlemobile.basket.graphics.d ) p2 ).a ( v3 ); // invoke-virtual {p2, v3}, Lcom/doodlemobile/basket/graphics/d;->a(I)Lcom/doodlemobile/basket/graphics/a;
		 this.A = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public final void a ( Float p0 ) {
		 /* .locals 4 */
		 /* iput p1, p0, Lcom/doodlemobile/basket/ui/TextView;->f:F */
		 v0 = this.r;
		 /* const/16 v1, 0x8 */
		 v2 = 		 java.lang.Float .floatToIntBits ( p1 );
		 int v3 = 0; // const/4 v3, 0x0
		 return;
	 } // .end method
	 public final void a ( Float p0, Float p1, Float p2 ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* iput p1, p0, Lcom/doodlemobile/basket/ui/TextView;->w:F */
		 /* iput p2, p0, Lcom/doodlemobile/basket/ui/TextView;->x:F */
		 /* iput p3, p0, Lcom/doodlemobile/basket/ui/TextView;->y:F */
		 v0 = this.r;
		 int v1 = 4; // const/4 v1, 0x4
		 v2 = 		 java.lang.Float .floatToIntBits ( p1 );
		 v0 = this.r;
		 int v1 = 5; // const/4 v1, 0x5
		 v2 = 		 java.lang.Float .floatToIntBits ( p2 );
		 v0 = this.r;
		 int v1 = 6; // const/4 v1, 0x6
		 v2 = 		 java.lang.Float .floatToIntBits ( p3 );
		 return;
	 } // .end method
	 public final void a ( Integer p0, Integer p1, java.lang.Object p2 ) {
		 /* .locals 4 */
		 /* packed-switch p1, :pswitch_data_0 */
	 } // :cond_0
} // :goto_0
/* :pswitch_0 */
return;
/* :pswitch_1 */
/* check-cast p3, Ljava/lang/CharSequence; */
this.N = p3;
/* :pswitch_2 */
v0 = this.N;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/TextView;->M:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 v0 = this.A;
		 v1 = this.N;
		 /* iget v2, p0, Lcom/doodlemobile/basket/ui/TextView;->D:F */
		 /* iget v3, p0, Lcom/doodlemobile/basket/ui/TextView;->G:F */
		 (( com.doodlemobile.basket.graphics.a ) v0 ).a ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/doodlemobile/basket/graphics/a;->a(Ljava/lang/CharSequence;FF)V
	 } // :cond_1
	 v0 = this.A;
	 v1 = this.N;
	 (( com.doodlemobile.basket.graphics.a ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/graphics/a;->a(Ljava/lang/CharSequence;)V
	 /* :pswitch_3 */
	 v0 = 	 java.lang.Float .intBitsToFloat ( p2 );
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/TextView;->B:F */
	 /* :pswitch_4 */
	 v0 = 	 java.lang.Float .intBitsToFloat ( p2 );
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/TextView;->C:F */
	 /* :pswitch_5 */
	 v0 = 	 java.lang.Float .intBitsToFloat ( p2 );
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/TextView;->D:F */
	 /* :pswitch_6 */
	 v0 = 	 java.lang.Float .intBitsToFloat ( p2 );
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/TextView;->E:F */
	 /* :pswitch_7 */
	 if ( p2 != null) { // if-eqz p2, :cond_2
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_1
	 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/ui/TextView;->M:Z */
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
/* :pswitch_8 */
v0 = java.lang.Float .intBitsToFloat ( p2 );
/* iput v0, p0, Lcom/doodlemobile/basket/ui/TextView;->I:F */
/* :pswitch_9 */
v0 = java.lang.Float .intBitsToFloat ( p2 );
/* iput v0, p0, Lcom/doodlemobile/basket/ui/TextView;->J:F */
/* :pswitch_a */
v0 = java.lang.Float .intBitsToFloat ( p2 );
/* iput v0, p0, Lcom/doodlemobile/basket/ui/TextView;->K:F */
/* :pswitch_b */
v0 = java.lang.Float .intBitsToFloat ( p2 );
/* iput v0, p0, Lcom/doodlemobile/basket/ui/TextView;->L:F */
/* :pswitch_c */
v0 = java.lang.Float .intBitsToFloat ( p2 );
/* iput v0, p0, Lcom/doodlemobile/basket/ui/TextView;->F:F */
/* :pswitch_d */
v0 = java.lang.Float .intBitsToFloat ( p2 );
/* iput v0, p0, Lcom/doodlemobile/basket/ui/TextView;->H:F */
/* :pswitch_e */
/* check-cast p3, Lcom/doodlemobile/basket/graphics/a; */
this.A = p3;
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_4 */
/* :pswitch_8 */
/* :pswitch_9 */
/* :pswitch_a */
/* :pswitch_b */
/* :pswitch_c */
/* :pswitch_5 */
/* :pswitch_6 */
/* :pswitch_7 */
/* :pswitch_0 */
/* :pswitch_d */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_e */
} // .end packed-switch
} // .end method
public final void a ( Object p0 ) {
/* .locals 4 */
this.q = p1;
v0 = this.r;
/* const/16 v1, 0x14 */
int v2 = 0; // const/4 v2, 0x0
/* iget v3, p0, Lcom/doodlemobile/basket/ui/TextView;->a:I */
(( com.doodlemobile.basket.graphics.d ) p1 ).a ( v3 ); // invoke-virtual {p1, v3}, Lcom/doodlemobile/basket/graphics/d;->a(I)Lcom/doodlemobile/basket/graphics/a;
v0 = this.u;
(( com.doodlemobile.basket.ui.TextView ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/basket/ui/TextView;->a(Ljava/lang/CharSequence;)V
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 1 */
v0 = this.q;
(( com.doodlemobile.basket.graphics.d ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/doodlemobile/basket/graphics/d;->a(Lcom/doodlemobile/basket/opengl/m;)V
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 1 */
/* invoke-super {p0, p1}, Lcom/doodlemobile/basket/ui/e;->a(Lcom/doodlemobile/basket/p;)V */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/TextView;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
(( com.doodlemobile.basket.p ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Lcom/doodlemobile/basket/p;->a(Lcom/doodlemobile/basket/b/e;)V
} // :cond_0
return;
} // .end method
public final void a ( java.lang.CharSequence p0 ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
this.u = p1;
v0 = this.r;
v0 = this.r;
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
(( com.doodlemobile.basket.ui.TextView ) p0 ).q ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/ui/TextView;->q()V
return;
} // .end method
protected final void a ( Boolean p0, Float p1, Float p2, Float p3, Float p4 ) {
/* .locals 5 */
/* const/high16 v2, 0x40000000 # 2.0f */
int v4 = 0; // const/4 v4, 0x0
/* invoke-super/range {p0 ..p5}, Lcom/doodlemobile/basket/ui/e;->a(ZFFFF)V */
if ( p1 != null) { // if-eqz p1, :cond_0
/* add-float v0, p2, p4 */
/* div-float/2addr v0, v2 */
v0 = java.lang.Math .round ( v0 );
/* int-to-float v0, v0 */
/* add-float v1, p3, p5 */
/* div-float/2addr v1, v2 */
v1 = java.lang.Math .round ( v1 );
/* int-to-float v1, v1 */
v2 = this.r;
int v3 = 2; // const/4 v3, 0x2
v0 = java.lang.Float .floatToIntBits ( v0 );
v0 = this.r;
int v2 = 3; // const/4 v2, 0x3
v1 = java.lang.Float .floatToIntBits ( v1 );
v0 = this.r;
/* const/16 v1, 0x9 */
/* sub-float v2, p4, p2 */
v2 = java.lang.Float .floatToIntBits ( v2 );
v0 = this.r;
/* const/16 v1, 0xa */
/* sub-float v2, p5, p3 */
v2 = java.lang.Float .floatToIntBits ( v2 );
v0 = this.r;
int v1 = 1; // const/4 v1, 0x1
int v2 = 0; // const/4 v2, 0x0
} // :cond_0
return;
} // .end method
public final void b ( ) {
/* .locals 4 */
v0 = this.u;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/TextView;->s:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
	 v0 = 	 (( com.doodlemobile.basket.ui.TextView ) p0 ).i ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/ui/TextView;->i()F
	 v1 = this.q;
	 v2 = this.u;
	 /* iget v3, p0, Lcom/doodlemobile/basket/ui/TextView;->v:F */
	 v1 = 	 (( com.doodlemobile.basket.graphics.d ) v1 ).a ( v2, v0, v3 ); // invoke-virtual {v1, v2, v0, v3}, Lcom/doodlemobile/basket/graphics/d;->a(Ljava/lang/CharSequence;FF)F
	 (( com.doodlemobile.basket.ui.TextView ) p0 ).f ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/doodlemobile/basket/ui/TextView;->f(FF)V
} // :cond_0
} // :goto_0
return;
} // :cond_1
v0 = this.q;
v1 = this.u;
v0 = (( com.doodlemobile.basket.graphics.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/graphics/d;->a(Ljava/lang/CharSequence;)F
v1 = this.q;
v2 = this.u;
v1 = (( com.doodlemobile.basket.graphics.d ) v1 ).b ( v2 ); // invoke-virtual {v1, v2}, Lcom/doodlemobile/basket/graphics/d;->b(Ljava/lang/CharSequence;)F
(( com.doodlemobile.basket.ui.TextView ) p0 ).f ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/doodlemobile/basket/ui/TextView;->f(FF)V
} // .end method
public final void b ( Float p0 ) {
/* .locals 4 */
/* iput p1, p0, Lcom/doodlemobile/basket/ui/TextView;->t:F */
v0 = this.r;
/* const/16 v1, 0xd */
v2 = java.lang.Float .floatToIntBits ( p1 );
int v3 = 0; // const/4 v3, 0x0
return;
} // .end method
public final void c ( ) {
/* .locals 1 */
/* invoke-super {p0}, Lcom/doodlemobile/basket/ui/e;->c()V */
v0 = this.q;
(( com.doodlemobile.basket.graphics.d ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/graphics/d;->a()V
return;
} // .end method
public final void c ( Float p0 ) {
/* .locals 4 */
/* iput p1, p0, Lcom/doodlemobile/basket/ui/TextView;->z:F */
v0 = this.r;
int v1 = 7; // const/4 v1, 0x7
v2 = java.lang.Float .floatToIntBits ( p1 );
int v3 = 0; // const/4 v3, 0x0
return;
} // .end method
public final void c ( Object p0, com.doodlemobile.basket.math.MatrixStack p1 ) {
/* .locals 6 */
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).b ( ); // invoke-virtual {p2}, Lcom/doodlemobile/basket/math/MatrixStack;->b()V
/* iget v0, p0, Lcom/doodlemobile/basket/ui/TextView;->B:F */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/TextView;->C:F */
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).a ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Lcom/doodlemobile/basket/math/MatrixStack;->a(FF)V
/* iget v0, p0, Lcom/doodlemobile/basket/ui/TextView;->H:F */
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).b ( v0 ); // invoke-virtual {p2, v0}, Lcom/doodlemobile/basket/math/MatrixStack;->b(F)V
/* iget v0, p0, Lcom/doodlemobile/basket/ui/TextView;->F:F */
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Lcom/doodlemobile/basket/math/MatrixStack;->a(F)V
v0 = this.A;
/* iget v1, p0, Lcom/doodlemobile/basket/ui/TextView;->I:F */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/TextView;->L:F */
/* mul-float/2addr v2, v1 */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/TextView;->J:F */
/* iget v3, p0, Lcom/doodlemobile/basket/ui/TextView;->L:F */
/* mul-float/2addr v3, v1 */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/TextView;->K:F */
/* iget v4, p0, Lcom/doodlemobile/basket/ui/TextView;->L:F */
/* mul-float/2addr v4, v1 */
/* iget v5, p0, Lcom/doodlemobile/basket/ui/TextView;->L:F */
/* move-object v1, p2 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodlemobile/basket/graphics/a;->a(Lcom/doodlemobile/basket/math/MatrixStack;FFFF)V */
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).c ( ); // invoke-virtual {p2}, Lcom/doodlemobile/basket/math/MatrixStack;->c()V
return;
} // .end method
public final Float l ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/TextView;->w:F */
} // .end method
public final Float m ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/TextView;->x:F */
} // .end method
public final Float n ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/TextView;->y:F */
} // .end method
public final Float o ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/TextView;->z:F */
} // .end method

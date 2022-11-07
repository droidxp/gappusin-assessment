public class com.doodlemobile.basket.ui.AnimationView extends com.doodlemobile.basket.ui.e implements com.doodlemobile.basket.b.e implements com.doodlemobile.basket.ui.a.o {
	 /* # interfaces */
	 /* # instance fields */
	 private Float A;
	 private Float B;
	 private Float C;
	 protected com.doodlemobile.basket.graphics.i a;
	 private Integer q;
	 private Float r;
	 private Float s;
	 private Float t;
	 private Float u;
	 private com.doodlemobile.basket.graphics.Animation v;
	 private Integer w;
	 private Float x;
	 private Float y;
	 private Float z;
	 /* # direct methods */
	 public com.doodlemobile.basket.ui.AnimationView ( ) {
		 /* .locals 4 */
		 int v1 = -1; // const/4 v1, -0x1
		 int v3 = 0; // const/4 v3, 0x0
		 /* const/high16 v2, 0x3f800000 # 1.0f */
		 /* invoke-direct {p0, p1, p2}, Lcom/doodlemobile/basket/ui/e;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;)V */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/AnimationView;->q:I */
		 /* iput v2, p0, Lcom/doodlemobile/basket/ui/AnimationView;->r:F */
		 /* iput v2, p0, Lcom/doodlemobile/basket/ui/AnimationView;->s:F */
		 /* iput v2, p0, Lcom/doodlemobile/basket/ui/AnimationView;->t:F */
		 /* iput v2, p0, Lcom/doodlemobile/basket/ui/AnimationView;->u:F */
		 /* iput v2, p0, Lcom/doodlemobile/basket/ui/AnimationView;->x:F */
		 /* iput v2, p0, Lcom/doodlemobile/basket/ui/AnimationView;->y:F */
		 /* iput v2, p0, Lcom/doodlemobile/basket/ui/AnimationView;->z:F */
		 /* iput v2, p0, Lcom/doodlemobile/basket/ui/AnimationView;->A:F */
		 /* iput v2, p0, Lcom/doodlemobile/basket/ui/AnimationView;->B:F */
		 /* iput v2, p0, Lcom/doodlemobile/basket/ui/AnimationView;->C:F */
		 v0 = 		 final String v0 = "animation"; // const-string v0, "animation"
		 /* if-eq v0, v1, :cond_0 */
		 com.doodlemobile.basket.graphics.Animation .a ( p1,v0 );
		 this.v = v0;
		 v0 = this.v;
		 (( com.doodlemobile.basket.graphics.Animation ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/graphics/Animation;->a()Lcom/doodlemobile/basket/graphics/i;
		 this.a = v0;
		 v0 = 		 final String v0 = "action"; // const-string v0, "action"
		 v1 = this.a;
	 } // :cond_0
	 v0 = 	 final String v0 = "red"; // const-string v0, "red"
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/AnimationView;->x:F */
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/AnimationView;->r:F */
	 v0 = 	 final String v0 = "green"; // const-string v0, "green"
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/AnimationView;->y:F */
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/AnimationView;->s:F */
	 v0 = 	 final String v0 = "blue"; // const-string v0, "blue"
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/AnimationView;->z:F */
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/AnimationView;->t:F */
	 v0 = 	 final String v0 = "alpha"; // const-string v0, "alpha"
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/AnimationView;->A:F */
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/AnimationView;->u:F */
	 return;
} // .end method
public com.doodlemobile.basket.ui.AnimationView ( ) {
	 /* .locals 2 */
	 /* const/high16 v1, 0x3f800000 # 1.0f */
	 /* invoke-direct {p0, p1}, Lcom/doodlemobile/basket/ui/e;-><init>(Lcom/doodlemobile/basket/b/b;)V */
	 int v0 = -1; // const/4 v0, -0x1
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/AnimationView;->q:I */
	 /* iput v1, p0, Lcom/doodlemobile/basket/ui/AnimationView;->r:F */
	 /* iput v1, p0, Lcom/doodlemobile/basket/ui/AnimationView;->s:F */
	 /* iput v1, p0, Lcom/doodlemobile/basket/ui/AnimationView;->t:F */
	 /* iput v1, p0, Lcom/doodlemobile/basket/ui/AnimationView;->u:F */
	 /* iput v1, p0, Lcom/doodlemobile/basket/ui/AnimationView;->x:F */
	 /* iput v1, p0, Lcom/doodlemobile/basket/ui/AnimationView;->y:F */
	 /* iput v1, p0, Lcom/doodlemobile/basket/ui/AnimationView;->z:F */
	 /* iput v1, p0, Lcom/doodlemobile/basket/ui/AnimationView;->A:F */
	 /* iput v1, p0, Lcom/doodlemobile/basket/ui/AnimationView;->B:F */
	 /* iput v1, p0, Lcom/doodlemobile/basket/ui/AnimationView;->C:F */
	 this.v = p2;
	 (( com.doodlemobile.basket.graphics.Animation ) p2 ).a ( ); // invoke-virtual {p2}, Lcom/doodlemobile/basket/graphics/Animation;->a()Lcom/doodlemobile/basket/graphics/i;
	 this.a = v0;
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
	 /* iput p1, p0, Lcom/doodlemobile/basket/ui/AnimationView;->r:F */
	 /* iput p2, p0, Lcom/doodlemobile/basket/ui/AnimationView;->s:F */
	 /* iput p3, p0, Lcom/doodlemobile/basket/ui/AnimationView;->t:F */
	 v0 = this.i;
	 int v1 = 4; // const/4 v1, 0x4
	 v2 = 	 java.lang.Float .floatToIntBits ( p1 );
	 v0 = this.i;
	 int v1 = 5; // const/4 v1, 0x5
	 v2 = 	 java.lang.Float .floatToIntBits ( p2 );
	 v0 = this.i;
	 int v1 = 6; // const/4 v1, 0x6
	 v2 = 	 java.lang.Float .floatToIntBits ( p3 );
	 return;
} // .end method
public void a ( Integer p0 ) {
	 /* .locals 1 */
	 v0 = this.a;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.a;
	 } // :cond_0
	 return;
} // .end method
public final void a ( Integer p0, Integer p1, java.lang.Object p2 ) {
	 /* .locals 1 */
	 /* packed-switch p1, :pswitch_data_0 */
	 /* invoke-super {p0, p1, p2, p3}, Lcom/doodlemobile/basket/ui/e;->a(IILjava/lang/Object;)V */
} // :goto_0
return;
/* :pswitch_0 */
/* check-cast p3, Lcom/doodlemobile/basket/graphics/Animation; */
this.v = p3;
/* :pswitch_1 */
/* iput p2, p0, Lcom/doodlemobile/basket/ui/AnimationView;->w:I */
/* :pswitch_2 */
v0 = java.lang.Float .intBitsToFloat ( p2 );
/* iput v0, p0, Lcom/doodlemobile/basket/ui/AnimationView;->x:F */
/* :pswitch_3 */
v0 = java.lang.Float .intBitsToFloat ( p2 );
/* iput v0, p0, Lcom/doodlemobile/basket/ui/AnimationView;->y:F */
/* :pswitch_4 */
v0 = java.lang.Float .intBitsToFloat ( p2 );
/* iput v0, p0, Lcom/doodlemobile/basket/ui/AnimationView;->z:F */
/* :pswitch_5 */
v0 = java.lang.Float .intBitsToFloat ( p2 );
/* iput v0, p0, Lcom/doodlemobile/basket/ui/AnimationView;->A:F */
/* :pswitch_6 */
v0 = java.lang.Float .intBitsToFloat ( p2 );
/* iput v0, p0, Lcom/doodlemobile/basket/ui/AnimationView;->B:F */
/* :pswitch_7 */
v0 = java.lang.Float .intBitsToFloat ( p2 );
/* iput v0, p0, Lcom/doodlemobile/basket/ui/AnimationView;->C:F */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x3 */
/* :pswitch_0 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_4 */
/* :pswitch_5 */
/* :pswitch_6 */
/* :pswitch_7 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public final void a ( Long p0 ) {
/* .locals 4 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
v0 = v0 = this.a;
/* iget v1, p0, Lcom/doodlemobile/basket/ui/AnimationView;->q:I */
/* if-eq v0, v1, :cond_0 */
/* iput v0, p0, Lcom/doodlemobile/basket/ui/AnimationView;->q:I */
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_0 */
v1 = this.i;
/* const/16 v2, 0xa */
int v3 = 0; // const/4 v3, 0x0
} // :cond_0
/* invoke-super {p0, p1, p2}, Lcom/doodlemobile/basket/ui/e;->a(J)V */
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 1 */
v0 = this.v;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.v;
(( com.doodlemobile.basket.graphics.Animation ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/doodlemobile/basket/graphics/Animation;->a(Lcom/doodlemobile/basket/opengl/m;)V
} // :cond_0
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 2 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/AnimationView;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
com.doodlemobile.basket.e .a ( p1,p0 );
/* invoke-super {p0, p1}, Lcom/doodlemobile/basket/ui/e;->a(Lcom/doodlemobile/basket/p;)V */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* iget v0, p0, Lcom/doodlemobile/basket/ui/AnimationView;->q:I */
	 int v1 = -1; // const/4 v1, -0x1
	 /* if-eq v0, v1, :cond_0 */
	 (( com.doodlemobile.basket.p ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Lcom/doodlemobile/basket/p;->a(Lcom/doodlemobile/basket/b/e;)V
} // :cond_0
com.doodlemobile.basket.e .b ( p1,p0 );
} // :cond_1
return;
} // .end method
protected final void a ( Boolean p0, Float p1, Float p2, Float p3, Float p4 ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
/* invoke-super/range {p0 ..p5}, Lcom/doodlemobile/basket/ui/e;->a(ZFFFF)V */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
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
public final void a_ ( Float p0 ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
v0 = this.c;
/* iput p1, v0, Lcom/doodlemobile/basket/ui/b;->e:F */
v0 = this.c;
/* iput p1, v0, Lcom/doodlemobile/basket/ui/b;->f:F */
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
v0 = this.v;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.v;
(( com.doodlemobile.basket.graphics.Animation ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/graphics/Animation;->b()V
} // :cond_0
return;
} // .end method
public final void c ( Float p0 ) {
/* .locals 4 */
/* iput p1, p0, Lcom/doodlemobile/basket/ui/AnimationView;->u:F */
v0 = this.i;
int v1 = 7; // const/4 v1, 0x7
v2 = java.lang.Float .floatToIntBits ( p1 );
int v3 = 0; // const/4 v3, 0x0
return;
} // .end method
public final void c ( Object p0, com.doodlemobile.basket.math.MatrixStack p1 ) {
/* .locals 7 */
v0 = this.v;
if ( v0 != null) { // if-eqz v0, :cond_0
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).b ( ); // invoke-virtual {p2}, Lcom/doodlemobile/basket/math/MatrixStack;->b()V
/* iget v0, p0, Lcom/doodlemobile/basket/ui/AnimationView;->B:F */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/AnimationView;->C:F */
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).b ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Lcom/doodlemobile/basket/math/MatrixStack;->b(FF)V
v0 = this.v;
/* iget v2, p0, Lcom/doodlemobile/basket/ui/AnimationView;->w:I */
/* iget v3, p0, Lcom/doodlemobile/basket/ui/AnimationView;->x:F */
/* iget v4, p0, Lcom/doodlemobile/basket/ui/AnimationView;->y:F */
/* iget v5, p0, Lcom/doodlemobile/basket/ui/AnimationView;->z:F */
/* iget v6, p0, Lcom/doodlemobile/basket/ui/AnimationView;->A:F */
/* move-object v1, p2 */
/* invoke-virtual/range {v0 ..v6}, Lcom/doodlemobile/basket/graphics/Animation;->a(Lcom/doodlemobile/basket/math/MatrixStack;IFFFF)V */
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).c ( ); // invoke-virtual {p2}, Lcom/doodlemobile/basket/math/MatrixStack;->c()V
} // :cond_0
return;
} // .end method
public final Integer d ( ) {
/* .locals 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
int v0 = -1; // const/4 v0, -0x1
} // :goto_0
} // :cond_0
v0 = v0 = this.a;
} // .end method
public final Float l ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/AnimationView;->r:F */
} // .end method
public final Float m ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/AnimationView;->s:F */
} // .end method
public final Float n ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/AnimationView;->t:F */
} // .end method
public final Float o ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/AnimationView;->u:F */
} // .end method

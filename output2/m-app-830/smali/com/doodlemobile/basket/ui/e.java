public class com.doodlemobile.basket.ui.e implements com.doodlemobile.basket.b implements com.doodlemobile.basket.l {
	 /* # interfaces */
	 /* # instance fields */
	 private Integer a;
	 protected com.doodlemobile.basket.ui.UIViewGroup b;
	 protected com.doodlemobile.basket.ui.b c;
	 protected Boolean d;
	 protected Boolean e;
	 protected Float f;
	 protected Float g;
	 protected Float h;
	 protected com.doodlemobile.basket.b.b i;
	 protected Float j;
	 protected Float k;
	 protected Float l;
	 protected Float m;
	 protected Float n;
	 protected Float o;
	 protected Float p;
	 private com.doodlemobile.basket.graphics.e q;
	 private Boolean r;
	 private Float s;
	 private Float t;
	 private Boolean u;
	 private com.doodlemobile.basket.ui.d v;
	 private com.doodlemobile.basket.graphics.StaticImageDrawable w;
	 /* # direct methods */
	 public com.doodlemobile.basket.ui.e ( ) {
		 /* .locals 2 */
		 int v0 = 1; // const/4 v0, 0x1
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/ui/e;->d:Z */
		 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/ui/e;->e:Z */
		 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/ui/e;->r:Z */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/ui/e;->u:Z */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/e;->n:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/e;->o:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/e;->p:F */
		 this.i = p1;
		 return;
	 } // .end method
	 public com.doodlemobile.basket.ui.e ( ) {
		 /* .locals 4 */
		 int v3 = 1; // const/4 v3, 0x1
		 int v2 = 0; // const/4 v2, 0x0
		 /* invoke-direct {p0, p1}, Lcom/doodlemobile/basket/ui/e;-><init>(Lcom/doodlemobile/basket/b/b;)V */
		 v0 = 		 int v0 = -1; // const/4 v0, -0x1
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/e;->a:I */
		 v0 = 		 final String v0 = "visible"; // const-string v0, "visible"
		 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/ui/e;->d:Z */
		 final String v0 = "rotation"; // const-string v0, "rotation"
		 v0 = 		 int v1 = 0; // const/4 v1, 0x0
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/e;->f:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/e;->p:F */
		 /* new-instance v0, Lcom/doodlemobile/basket/ui/b; */
		 /* invoke-direct {v0, p2}, Lcom/doodlemobile/basket/ui/b;-><init>(Landroid/util/AttributeSet;)V */
		 this.c = v0;
		 v0 = 		 final String v0 = "mode"; // const-string v0, "mode"
		 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/ui/e;->r:Z */
		 final String v0 = "background"; // const-string v0, "background"
		 v0 = 		 int v1 = 0; // const/4 v1, 0x0
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 com.doodlemobile.basket.graphics.e .a ( p1,v0 );
			 this.q = v0;
			 /* new-instance v0, Lcom/doodlemobile/basket/graphics/StaticImageDrawable; */
			 v1 = this.q;
			 /* invoke-direct {v0, v1}, Lcom/doodlemobile/basket/graphics/StaticImageDrawable;-><init>(Lcom/doodlemobile/basket/graphics/e;)V */
			 this.w = v0;
		 } // :cond_0
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected Float a ( Float p0, Float p1 ) {
		 /* .locals 4 */
		 /* const/high16 v3, 0x40000000 # 2.0f */
		 /* iget v0, p0, Lcom/doodlemobile/basket/ui/e;->j:F */
		 /* iget v1, p0, Lcom/doodlemobile/basket/ui/e;->l:F */
		 /* add-float/2addr v0, v1 */
		 /* div-float/2addr v0, v3 */
		 /* sub-float v0, p1, v0 */
		 /* iget v1, p0, Lcom/doodlemobile/basket/ui/e;->k:F */
		 /* iget v2, p0, Lcom/doodlemobile/basket/ui/e;->m:F */
		 /* add-float/2addr v1, v2 */
		 /* div-float/2addr v1, v3 */
		 /* sub-float v1, p2, v1 */
		 /* iget v2, p0, Lcom/doodlemobile/basket/ui/e;->f:F */
		 v2 = 		 com.doodlemobile.basket.math.MathUtil .cos ( v2 );
		 /* mul-float/2addr v0, v2 */
		 /* iget v2, p0, Lcom/doodlemobile/basket/ui/e;->f:F */
		 v2 = 		 com.doodlemobile.basket.math.MathUtil .sin ( v2 );
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
	 } // .end method
	 public void a ( Float p0 ) {
		 /* .locals 4 */
		 /* iput p1, p0, Lcom/doodlemobile/basket/ui/e;->f:F */
		 v0 = this.i;
		 int v1 = 2; // const/4 v1, 0x2
		 /* iget v2, p0, Lcom/doodlemobile/basket/ui/e;->f:F */
		 v2 = 		 java.lang.Float .floatToIntBits ( v2 );
		 int v3 = 0; // const/4 v3, 0x0
		 return;
	 } // .end method
	 public void a ( Float p0, Float p1, Float p2, Float p3 ) {
		 /* .locals 7 */
		 int v4 = 0; // const/4 v4, 0x0
		 int v3 = 1; // const/4 v3, 0x1
		 /* const/high16 v2, 0x40000000 # 2.0f */
		 int v6 = 0; // const/4 v6, 0x0
		 /* iget v0, p0, Lcom/doodlemobile/basket/ui/e;->j:F */
		 /* cmpl-float v0, v0, p1 */
		 /* if-nez v0, :cond_0 */
		 /* iget v0, p0, Lcom/doodlemobile/basket/ui/e;->l:F */
		 /* cmpl-float v0, v0, p3 */
		 /* if-nez v0, :cond_0 */
		 /* iget v0, p0, Lcom/doodlemobile/basket/ui/e;->k:F */
		 /* cmpl-float v0, v0, p2 */
		 /* if-nez v0, :cond_0 */
		 /* iget v0, p0, Lcom/doodlemobile/basket/ui/e;->m:F */
		 /* cmpl-float v0, v0, p4 */
		 if ( v0 != null) { // if-eqz v0, :cond_3
		 } // :cond_0
		 /* iput p1, p0, Lcom/doodlemobile/basket/ui/e;->j:F */
		 /* iput p3, p0, Lcom/doodlemobile/basket/ui/e;->l:F */
		 /* iput p2, p0, Lcom/doodlemobile/basket/ui/e;->k:F */
		 /* iput p4, p0, Lcom/doodlemobile/basket/ui/e;->m:F */
		 /* move v1, v3 */
	 } // :goto_0
	 /* if-nez v1, :cond_1 */
	 /* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/e;->e:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_2
	 } // :cond_1
	 /* add-float v0, p1, p3 */
	 /* div-float/2addr v0, v2 */
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/e;->g:F */
	 /* add-float v0, p2, p4 */
	 /* div-float/2addr v0, v2 */
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/e;->h:F */
	 v0 = this.i;
	 /* iget v2, p0, Lcom/doodlemobile/basket/ui/e;->g:F */
	 v2 = 	 java.lang.Float .floatToIntBits ( v2 );
	 v0 = this.i;
	 /* iget v2, p0, Lcom/doodlemobile/basket/ui/e;->h:F */
	 v2 = 	 java.lang.Float .floatToIntBits ( v2 );
	 /* move-object v0, p0 */
	 /* move v2, p1 */
	 /* move v3, p2 */
	 /* move v4, p3 */
	 /* move v5, p4 */
	 /* invoke-virtual/range {v0 ..v5}, Lcom/doodlemobile/basket/ui/e;->a(ZFFFF)V */
} // :cond_2
/* iput-boolean v6, p0, Lcom/doodlemobile/basket/ui/e;->e:Z */
return;
} // :cond_3
/* move v1, v6 */
} // .end method
public void a ( Integer p0, Integer p1 ) {
/* .locals 0 */
return;
} // .end method
public void a ( Integer p0, Integer p1, java.lang.Object p2 ) {
/* .locals 1 */
/* packed-switch p1, :pswitch_data_0 */
} // :goto_0
return;
/* :pswitch_0 */
v0 = java.lang.Float .intBitsToFloat ( p2 );
/* iput v0, p0, Lcom/doodlemobile/basket/ui/e;->n:F */
/* :pswitch_1 */
v0 = java.lang.Float .intBitsToFloat ( p2 );
/* iput v0, p0, Lcom/doodlemobile/basket/ui/e;->o:F */
/* :pswitch_2 */
v0 = java.lang.Float .intBitsToFloat ( p2 );
/* iput v0, p0, Lcom/doodlemobile/basket/ui/e;->p:F */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public void a ( Long p0 ) {
/* .locals 0 */
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 0 */
return;
} // .end method
public void a ( Object p0, com.doodlemobile.basket.math.MatrixStack p1 ) {
/* .locals 2 */
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).b ( ); // invoke-virtual {p2}, Lcom/doodlemobile/basket/math/MatrixStack;->b()V
/* iget v0, p0, Lcom/doodlemobile/basket/ui/e;->n:F */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/e;->o:F */
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).a ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Lcom/doodlemobile/basket/math/MatrixStack;->a(FF)V
/* iget v0, p0, Lcom/doodlemobile/basket/ui/e;->p:F */
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Lcom/doodlemobile/basket/math/MatrixStack;->a(F)V
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
/* const/high16 v2, 0x3f800000 # 1.0f */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/e;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.w;
if ( v0 != null) { // if-eqz v0, :cond_0
com.doodlemobile.basket.game2d.a .d ( );
v1 = this.w;
this.a = v1;
/* iput v3, v0, Lcom/doodlemobile/basket/game2d/d;->b:F */
/* iput v3, v0, Lcom/doodlemobile/basket/game2d/d;->c:F */
/* iput v3, v0, Lcom/doodlemobile/basket/game2d/d;->d:F */
/* iput v2, v0, Lcom/doodlemobile/basket/game2d/d;->g:F */
/* iput v2, v0, Lcom/doodlemobile/basket/game2d/d;->h:F */
/* iput v2, v0, Lcom/doodlemobile/basket/game2d/d;->i:F */
/* iput v2, v0, Lcom/doodlemobile/basket/game2d/d;->j:F */
/* iget-boolean v1, p0, Lcom/doodlemobile/basket/ui/e;->r:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
v1 = this.c;
/* iget v1, v1, Lcom/doodlemobile/basket/ui/b;->a:F */
/* iput v1, v0, Lcom/doodlemobile/basket/game2d/d;->e:F */
v1 = this.c;
/* iget v1, v1, Lcom/doodlemobile/basket/ui/b;->b:F */
/* iput v1, v0, Lcom/doodlemobile/basket/game2d/d;->f:F */
} // :goto_0
(( com.doodlemobile.basket.p ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lcom/doodlemobile/basket/p;->a(Lcom/doodlemobile/basket/b/e;)V
} // :cond_0
return;
} // :cond_1
v1 = this.q;
v1 = (( com.doodlemobile.basket.graphics.e ) v1 ).j ( ); // invoke-virtual {v1}, Lcom/doodlemobile/basket/graphics/e;->j()I
/* int-to-float v1, v1 */
/* iput v1, v0, Lcom/doodlemobile/basket/game2d/d;->e:F */
v1 = this.q;
v1 = (( com.doodlemobile.basket.graphics.e ) v1 ).k ( ); // invoke-virtual {v1}, Lcom/doodlemobile/basket/graphics/e;->k()I
/* int-to-float v1, v1 */
/* iput v1, v0, Lcom/doodlemobile/basket/game2d/d;->f:F */
} // .end method
protected final void a ( com.doodlemobile.basket.ui.UIViewGroup p0 ) {
/* .locals 3 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* if-nez p1, :cond_1 */
} // :cond_0
this.b = p1;
return;
} // :cond_1
/* new-instance v0, Ljava/lang/RuntimeException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "view "; // const-string v2, "view "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = " being added, but"; // const-string v2, " being added, but"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " it already has a parent"; // const-string v2, " it already has a parent"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public void a ( Object p0 ) {
/* .locals 0 */
this.c = p1;
(( com.doodlemobile.basket.ui.e ) p0 ).q ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/ui/e;->q()V
return;
} // .end method
public final void a ( Boolean p0 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/e;->d:Z */
/* if-eq v0, p1, :cond_0 */
/* iput-boolean p1, p0, Lcom/doodlemobile/basket/ui/e;->d:Z */
(( com.doodlemobile.basket.ui.e ) p0 ).q ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/ui/e;->q()V
} // :cond_0
return;
} // .end method
protected void a ( Boolean p0, Float p1, Float p2, Float p3, Float p4 ) {
/* .locals 0 */
return;
} // .end method
public Boolean a ( Object p0 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/e;->d:Z */
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
v0 = (( com.doodlemobile.basket.ui.e ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lcom/doodlemobile/basket/ui/e;->c(Lcom/doodlemobile/basket/util/e;)Z
} // .end method
protected Float b ( Float p0, Float p1 ) {
/* .locals 4 */
/* const/high16 v3, 0x40000000 # 2.0f */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/e;->j:F */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/e;->l:F */
/* add-float/2addr v0, v1 */
/* div-float/2addr v0, v3 */
/* sub-float v0, p1, v0 */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/e;->k:F */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/e;->m:F */
/* add-float/2addr v1, v2 */
/* div-float/2addr v1, v3 */
/* sub-float v1, p2, v1 */
/* neg-float v0, v0 */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/e;->f:F */
v2 = com.doodlemobile.basket.math.MathUtil .sin ( v2 );
/* mul-float/2addr v0, v2 */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/e;->f:F */
v2 = com.doodlemobile.basket.math.MathUtil .cos ( v2 );
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
} // .end method
public final com.doodlemobile.basket.ui.e b ( Integer p0 ) {
/* .locals 1 */
/* if-gez p1, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
/* iget v0, p0, Lcom/doodlemobile/basket/ui/e;->a:I */
/* if-ne p1, v0, :cond_1 */
/* move-object v0, p0 */
} // :cond_1
(( com.doodlemobile.basket.ui.e ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lcom/doodlemobile/basket/ui/e;->c(I)Lcom/doodlemobile/basket/ui/e;
} // .end method
public void b ( ) {
/* .locals 2 */
v0 = (( com.doodlemobile.basket.ui.e ) p0 ).i ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/ui/e;->i()F
v1 = (( com.doodlemobile.basket.ui.e ) p0 ).j ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/ui/e;->j()F
(( com.doodlemobile.basket.ui.e ) p0 ).f ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/doodlemobile/basket/ui/e;->f(FF)V
return;
} // .end method
public void b ( Object p0, com.doodlemobile.basket.math.MatrixStack p1 ) {
/* .locals 0 */
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).c ( ); // invoke-virtual {p2}, Lcom/doodlemobile/basket/math/MatrixStack;->c()V
return;
} // .end method
protected void b ( Object p0 ) {
/* .locals 4 */
/* const/high16 v3, -0x40000000 # -2.0f */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/e;->j:F */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/e;->l:F */
/* add-float/2addr v0, v1 */
/* div-float/2addr v0, v3 */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/e;->k:F */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/e;->m:F */
/* add-float/2addr v1, v2 */
/* div-float/2addr v1, v3 */
(( com.doodlemobile.basket.util.e ) p1 ).b ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lcom/doodlemobile/basket/util/e;->b(FF)V
return;
} // .end method
public Float c ( Float p0, Float p1 ) {
/* .locals 4 */
/* const/high16 v3, 0x40000000 # 2.0f */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/e;->j:F */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/e;->l:F */
/* add-float/2addr v0, v1 */
/* div-float/2addr v0, v3 */
/* add-float/2addr v0, p1 */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/e;->k:F */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/e;->m:F */
/* add-float/2addr v1, v2 */
/* div-float/2addr v1, v3 */
/* add-float/2addr v1, p2 */
v2 = this.b;
/* if-nez v2, :cond_0 */
} // :goto_0
} // :cond_0
v2 = this.b;
v0 = (( com.doodlemobile.basket.ui.UIViewGroup ) v2 ).c ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Lcom/doodlemobile/basket/ui/UIViewGroup;->c(FF)F
} // .end method
protected com.doodlemobile.basket.ui.e c ( Integer p0 ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/e;->a:I */
/* if-ne p1, v0, :cond_0 */
/* move-object v0, p0 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void c ( ) {
/* .locals 1 */
v0 = this.q;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.q;
(( com.doodlemobile.basket.graphics.e ) v0 ).n ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/graphics/e;->n()V
} // :cond_0
return;
} // .end method
public Boolean c ( Object p0 ) {
/* .locals 4 */
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
v0 = this.v;
/* if-nez v0, :cond_1 */
/* move v0, v2 */
} // :cond_0
} // :goto_0
} // :cond_1
v0 = (( com.doodlemobile.basket.util.e ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->a()F
v1 = (( com.doodlemobile.basket.util.e ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->b()F
v0 = (( com.doodlemobile.basket.ui.e ) p0 ).e ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/doodlemobile/basket/ui/e;->e(FF)Z
v1 = (( com.doodlemobile.basket.util.e ) p1 ).d ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->d()I
/* packed-switch v1, :pswitch_data_0 */
/* :pswitch_0 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iput-boolean v3, p0, Lcom/doodlemobile/basket/ui/e;->u:Z */
/* :pswitch_1 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* iput-boolean v3, p0, Lcom/doodlemobile/basket/ui/e;->u:Z */
/* :pswitch_2 */
/* iput-boolean v2, p0, Lcom/doodlemobile/basket/ui/e;->u:Z */
} // :cond_2
/* :pswitch_3 */
/* iput-boolean v2, p0, Lcom/doodlemobile/basket/ui/e;->u:Z */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_3 */
} // .end packed-switch
} // .end method
public Float d ( Float p0, Float p1 ) {
/* .locals 4 */
/* const/high16 v3, 0x40000000 # 2.0f */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/e;->j:F */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/e;->l:F */
/* add-float/2addr v0, v1 */
/* div-float/2addr v0, v3 */
/* add-float/2addr v0, p1 */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/e;->k:F */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/e;->m:F */
/* add-float/2addr v1, v2 */
/* div-float/2addr v1, v3 */
/* add-float/2addr v1, p2 */
v2 = this.b;
/* if-nez v2, :cond_0 */
} // :goto_0
} // :cond_0
v2 = this.b;
v0 = (( com.doodlemobile.basket.ui.UIViewGroup ) v2 ).d ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Lcom/doodlemobile/basket/ui/UIViewGroup;->d(FF)F
} // .end method
public final void d ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Lcom/doodlemobile/basket/ui/e;->a:I */
return;
} // .end method
public Boolean e ( Float p0, Float p1 ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/e;->d:Z */
/* if-nez v0, :cond_0 */
/* move v0, v3 */
} // :goto_0
} // :cond_0
/* iget v0, p0, Lcom/doodlemobile/basket/ui/e;->f:F */
int v1 = 0; // const/4 v1, 0x0
/* cmpl-float v0, v0, v1 */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( com.doodlemobile.basket.ui.e ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/doodlemobile/basket/ui/e;->a(FF)F
v1 = (( com.doodlemobile.basket.ui.e ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/doodlemobile/basket/ui/e;->a(FF)F
} // :goto_1
/* iget v2, p0, Lcom/doodlemobile/basket/ui/e;->j:F */
/* cmpl-float v2, v0, v2 */
/* if-ltz v2, :cond_2 */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/e;->l:F */
/* cmpg-float v0, v0, v2 */
/* if-gtz v0, :cond_2 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/e;->k:F */
/* cmpl-float v0, v1, v0 */
/* if-ltz v0, :cond_2 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/e;->m:F */
/* cmpg-float v0, v1, v0 */
/* if-gtz v0, :cond_2 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
/* move v0, p1 */
/* move v1, p2 */
} // :cond_2
/* move v0, v3 */
} // .end method
public final Float f ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/e;->f:F */
} // .end method
protected final void f ( Float p0, Float p1 ) {
/* .locals 0 */
/* iput p1, p0, Lcom/doodlemobile/basket/ui/e;->s:F */
/* iput p2, p0, Lcom/doodlemobile/basket/ui/e;->t:F */
return;
} // .end method
public final Integer g ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/e;->a:I */
} // .end method
public final Boolean g ( Float p0, Float p1 ) {
/* .locals 4 */
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
v0 = this.b;
/* if-nez v0, :cond_0 */
/* move v0, v3 */
} // :goto_0
} // :cond_0
/* iget v0, p0, Lcom/doodlemobile/basket/ui/e;->j:F */
/* add-float/2addr v0, p1 */
v1 = this.b;
/* iget v1, v1, Lcom/doodlemobile/basket/ui/UIViewGroup;->l:F */
/* cmpl-float v0, v0, v1 */
/* if-gtz v0, :cond_1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/e;->l:F */
/* add-float/2addr v0, p1 */
v1 = this.b;
/* iget v1, v1, Lcom/doodlemobile/basket/ui/UIViewGroup;->j:F */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_2 */
} // :cond_1
/* move v0, v2 */
} // :cond_2
/* iget v0, p0, Lcom/doodlemobile/basket/ui/e;->k:F */
/* add-float/2addr v0, p2 */
v1 = this.b;
/* iget v1, v1, Lcom/doodlemobile/basket/ui/UIViewGroup;->m:F */
/* cmpl-float v0, v0, v1 */
/* if-gtz v0, :cond_3 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/e;->m:F */
/* add-float/2addr v0, p2 */
v1 = this.b;
/* iget v1, v1, Lcom/doodlemobile/basket/ui/UIViewGroup;->k:F */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_4 */
} // :cond_3
/* move v0, v2 */
} // :cond_4
/* move v0, v3 */
} // .end method
public final Boolean h ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/e;->d:Z */
} // .end method
protected final Float i ( ) {
/* .locals 1 */
v0 = this.c;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
v0 = this.c;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->a:F */
} // .end method
protected final Float j ( ) {
/* .locals 1 */
v0 = this.c;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
v0 = this.c;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->b:F */
} // .end method
public final Float k ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/e;->s:F */
} // .end method
public final Float p ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/e;->t:F */
} // .end method
public final void q ( ) {
/* .locals 2 */
/* move-object v0, p0 */
} // :goto_0
/* iget-boolean v1, v0, Lcom/doodlemobile/basket/ui/e;->e:Z */
/* if-nez v1, :cond_0 */
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, v0, Lcom/doodlemobile/basket/ui/e;->e:Z */
v1 = this.b;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.b;
/* iget-boolean v1, v1, Lcom/doodlemobile/basket/ui/e;->e:Z */
/* if-nez v1, :cond_0 */
v0 = this.b;
} // :cond_0
return;
} // .end method
public final Boolean r ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/e;->e:Z */
} // .end method
public final com.doodlemobile.basket.ui.b s ( ) {
/* .locals 1 */
v0 = this.c;
} // .end method

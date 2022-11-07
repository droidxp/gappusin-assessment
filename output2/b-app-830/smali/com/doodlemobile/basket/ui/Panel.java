public class com.doodlemobile.basket.ui.Panel extends com.doodlemobile.basket.ui.UIViewGroup {
	 /* # instance fields */
	 private Boolean t;
	 private Float u;
	 private Float v;
	 /* # direct methods */
	 public com.doodlemobile.basket.ui.Panel ( ) {
		 /* .locals 1 */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* invoke-direct {p0, p1}, Lcom/doodlemobile/basket/ui/UIViewGroup;-><init>(Lcom/doodlemobile/basket/b/b;)V */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/Panel;->u:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/Panel;->v:F */
		 return;
	 } // .end method
	 public com.doodlemobile.basket.ui.Panel ( ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 /* invoke-direct {p0, p1, p2}, Lcom/doodlemobile/basket/ui/UIViewGroup;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;)V */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/Panel;->u:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/Panel;->v:F */
		 v0 = 		 final String v0 = "layout_sx"; // const-string v0, "layout_sx"
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/Panel;->u:F */
		 v0 = 		 final String v0 = "layout_sy"; // const-string v0, "layout_sy"
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/Panel;->v:F */
		 final String v0 = "touch_mask"; // const-string v0, "touch_mask"
		 v0 = 		 int v1 = 0; // const/4 v1, 0x0
		 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/ui/Panel;->t:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Integer p0, Integer p1, java.lang.Object p2 ) {
		 /* .locals 1 */
		 /* packed-switch p1, :pswitch_data_0 */
		 /* invoke-super {p0, p1, p2, p3}, Lcom/doodlemobile/basket/ui/UIViewGroup;->a(IILjava/lang/Object;)V */
	 } // :goto_0
	 return;
	 /* :pswitch_0 */
	 v0 = 	 java.lang.Float .intBitsToFloat ( p2 );
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/Panel;->u:F */
	 /* :pswitch_1 */
	 v0 = 	 java.lang.Float .intBitsToFloat ( p2 );
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/Panel;->v:F */
	 /* nop */
	 /* :pswitch_data_0 */
	 /* .packed-switch 0x8 */
	 /* :pswitch_0 */
	 /* :pswitch_1 */
} // .end packed-switch
} // .end method
public void a ( Object p0, com.doodlemobile.basket.math.MatrixStack p1 ) {
/* .locals 2 */
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).b ( ); // invoke-virtual {p2}, Lcom/doodlemobile/basket/math/MatrixStack;->b()V
/* iget v0, p0, Lcom/doodlemobile/basket/ui/Panel;->n:F */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/Panel;->o:F */
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).a ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Lcom/doodlemobile/basket/math/MatrixStack;->a(FF)V
/* iget v0, p0, Lcom/doodlemobile/basket/ui/Panel;->p:F */
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Lcom/doodlemobile/basket/math/MatrixStack;->a(F)V
/* iget v0, p0, Lcom/doodlemobile/basket/ui/Panel;->u:F */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/Panel;->v:F */
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).b ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Lcom/doodlemobile/basket/math/MatrixStack;->b(FF)V
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/Panel;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 com.doodlemobile.basket.e .a ( p1,p0 );
	 /* invoke-super {p0, p1}, Lcom/doodlemobile/basket/ui/UIViewGroup;->a(Lcom/doodlemobile/basket/p;)V */
	 com.doodlemobile.basket.e .b ( p1,p0 );
} // :cond_0
return;
} // .end method
protected void a ( Boolean p0, Float p1, Float p2, Float p3, Float p4 ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
/* invoke-super/range {p0 ..p5}, Lcom/doodlemobile/basket/ui/UIViewGroup;->a(ZFFFF)V */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.i;
	 /* const/16 v1, 0x8 */
	 v2 = this.c;
	 /* iget v2, v2, Lcom/doodlemobile/basket/ui/b;->e:F */
	 v2 = 	 java.lang.Float .floatToIntBits ( v2 );
	 v0 = this.i;
	 /* const/16 v1, 0x9 */
	 v2 = this.c;
	 /* iget v2, v2, Lcom/doodlemobile/basket/ui/b;->f:F */
	 v2 = 	 java.lang.Float .floatToIntBits ( v2 );
} // :cond_0
return;
} // .end method
public final void b ( ) {
/* .locals 8 */
v0 = this.a;
/* iget v1, p0, Lcom/doodlemobile/basket/ui/Panel;->q:I */
v2 = (( com.doodlemobile.basket.ui.Panel ) p0 ).i ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/ui/Panel;->i()F
v3 = (( com.doodlemobile.basket.ui.Panel ) p0 ).j ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/ui/Panel;->j()F
int v4 = 0; // const/4 v4, 0x0
/* move v7, v4 */
/* move v4, v2 */
/* move v2, v7 */
} // :goto_0
/* if-ge v2, v1, :cond_0 */
/* aget-object v5, v0, v2 */
(( com.doodlemobile.basket.ui.e ) v5 ).b ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/ui/e;->b()V
v6 = (( com.doodlemobile.basket.ui.e ) v5 ).k ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/ui/e;->k()F
v4 = java.lang.Math .max ( v4,v6 );
v5 = (( com.doodlemobile.basket.ui.e ) v5 ).p ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/ui/e;->p()F
v3 = java.lang.Math .max ( v3,v5 );
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_0
(( com.doodlemobile.basket.ui.Panel ) p0 ).f ( v4, v3 ); // invoke-virtual {p0, v4, v3}, Lcom/doodlemobile/basket/ui/Panel;->f(FF)V
return;
} // .end method
public Boolean c ( Object p0 ) {
/* .locals 1 */
v0 = /* invoke-super {p0, p1}, Lcom/doodlemobile/basket/ui/UIViewGroup;->c(Lcom/doodlemobile/basket/util/e;)Z */
/* if-nez v0, :cond_0 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/Panel;->t:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method

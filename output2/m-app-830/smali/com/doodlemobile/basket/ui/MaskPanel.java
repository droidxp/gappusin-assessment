public class com.doodlemobile.basket.ui.MaskPanel extends com.doodlemobile.basket.ui.Panel implements com.doodlemobile.basket.b.e implements com.doodlemobile.basket.ui.a.o {
	 /* # interfaces */
	 /* # instance fields */
	 private Float A;
	 private Float B;
	 private Float C;
	 private Float D;
	 private Float E;
	 private Float F;
	 private Float t;
	 private Float u;
	 private Float v;
	 private Float w;
	 private Boolean x;
	 private Float y;
	 private Float z;
	 /* # direct methods */
	 public com.doodlemobile.basket.ui.MaskPanel ( ) {
		 /* .locals 5 */
		 int v4 = 0; // const/4 v4, 0x0
		 /* const/high16 v3, 0x3f000000 # 0.5f */
		 int v2 = 0; // const/4 v2, 0x0
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0, p1, p2}, Lcom/doodlemobile/basket/ui/Panel;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;)V */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->t:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->u:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->v:F */
		 /* iput v3, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->w:F */
		 /* iput-boolean v4, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->x:Z */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->y:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->z:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->A:F */
		 /* iput v3, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->B:F */
		 v0 = 		 final String v0 = "red"; // const-string v0, "red"
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->y:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->t:F */
		 v0 = 		 final String v0 = "green"; // const-string v0, "green"
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->z:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->v:F */
		 v0 = 		 final String v0 = "blue"; // const-string v0, "blue"
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->A:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->u:F */
		 v0 = 		 final String v0 = "alpha"; // const-string v0, "alpha"
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->B:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->w:F */
		 v0 = 		 final String v0 = "fill_screen"; // const-string v0, "fill_screen"
		 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->x:Z */
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
		 /* iput p1, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->t:F */
		 /* iput p2, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->v:F */
		 /* iput p3, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->u:F */
		 v0 = this.i;
		 /* const/16 v1, 0x14 */
		 v2 = 		 java.lang.Float .floatToIntBits ( p1 );
		 v0 = this.i;
		 /* const/16 v1, 0x15 */
		 v2 = 		 java.lang.Float .floatToIntBits ( p2 );
		 v0 = this.i;
		 /* const/16 v1, 0x16 */
		 v2 = 		 java.lang.Float .floatToIntBits ( p3 );
		 return;
	 } // .end method
	 public final void a ( Integer p0, Integer p1, java.lang.Object p2 ) {
		 /* .locals 1 */
		 /* packed-switch p1, :pswitch_data_0 */
		 /* invoke-super {p0, p1, p2, p3}, Lcom/doodlemobile/basket/ui/Panel;->a(IILjava/lang/Object;)V */
	 } // :goto_0
	 return;
	 /* :pswitch_0 */
	 v0 = 	 java.lang.Float .intBitsToFloat ( p2 );
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->C:F */
	 /* :pswitch_1 */
	 v0 = 	 java.lang.Float .intBitsToFloat ( p2 );
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->E:F */
	 /* :pswitch_2 */
	 v0 = 	 java.lang.Float .intBitsToFloat ( p2 );
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->D:F */
	 /* :pswitch_3 */
	 v0 = 	 java.lang.Float .intBitsToFloat ( p2 );
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->F:F */
	 /* :pswitch_4 */
	 v0 = 	 java.lang.Float .intBitsToFloat ( p2 );
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->y:F */
	 /* :pswitch_5 */
	 v0 = 	 java.lang.Float .intBitsToFloat ( p2 );
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->z:F */
	 /* :pswitch_6 */
	 v0 = 	 java.lang.Float .intBitsToFloat ( p2 );
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->A:F */
	 /* :pswitch_7 */
	 v0 = 	 java.lang.Float .intBitsToFloat ( p2 );
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->B:F */
	 /* nop */
	 /* :pswitch_data_0 */
	 /* .packed-switch 0x10 */
	 /* :pswitch_0 */
	 /* :pswitch_1 */
	 /* :pswitch_2 */
	 /* :pswitch_3 */
	 /* :pswitch_4 */
	 /* :pswitch_5 */
	 /* :pswitch_6 */
	 /* :pswitch_7 */
} // .end packed-switch
} // .end method
public final void a ( Object p0 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 (( com.doodlemobile.basket.p ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Lcom/doodlemobile/basket/p;->a(Lcom/doodlemobile/basket/b/e;)V
} // :cond_0
/* invoke-super {p0, p1}, Lcom/doodlemobile/basket/ui/Panel;->a(Lcom/doodlemobile/basket/p;)V */
return;
} // .end method
protected final void a ( Boolean p0, Float p1, Float p2, Float p3, Float p4 ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
/* invoke-super/range {p0 ..p5}, Lcom/doodlemobile/basket/ui/Panel;->a(ZFFFF)V */
if ( p1 != null) { // if-eqz p1, :cond_0
	 v0 = this.i;
	 /* const/16 v1, 0x10 */
	 v2 = 	 java.lang.Float .floatToIntBits ( p2 );
	 v0 = this.i;
	 /* const/16 v1, 0x11 */
	 v2 = 	 java.lang.Float .floatToIntBits ( p3 );
	 v0 = this.i;
	 /* const/16 v1, 0x12 */
	 v2 = 	 java.lang.Float .floatToIntBits ( p4 );
	 v0 = this.i;
	 /* const/16 v1, 0x13 */
	 v2 = 	 java.lang.Float .floatToIntBits ( p5 );
} // :cond_0
return;
} // .end method
public final void c ( Float p0 ) {
/* .locals 4 */
/* iput p1, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->w:F */
v0 = this.i;
/* const/16 v1, 0x17 */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->w:F */
v2 = java.lang.Float .floatToIntBits ( v2 );
int v3 = 0; // const/4 v3, 0x0
return;
} // .end method
public final void c ( Object p0, com.doodlemobile.basket.math.MatrixStack p1 ) {
/* .locals 10 */
/* const/high16 v4, 0x3f800000 # 1.0f */
/* const/high16 v2, -0x40800000 # -1.0f */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->x:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* const-wide/16 v0, 0x0 */
	 /* iget v6, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->y:F */
	 /* iget v7, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->z:F */
	 /* iget v8, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->A:F */
	 /* iget v9, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->B:F */
	 /* move v3, v2 */
	 /* move v5, v4 */
	 /* invoke-static/range {v0 ..v9}, Lcom/doodlemobile/basket/util/Util;->nativeRenderRect(JFFFFFFFF)V */
} // :goto_0
return;
} // :cond_0
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).d ( ); // invoke-virtual {p2}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J
/* move-result-wide v0 */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->C:F */
/* iget v3, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->E:F */
/* iget v4, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->D:F */
/* iget v5, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->F:F */
/* iget v6, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->y:F */
/* iget v7, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->z:F */
/* iget v8, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->A:F */
/* iget v9, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->B:F */
/* invoke-static/range {v0 ..v9}, Lcom/doodlemobile/basket/util/Util;->nativeRenderRect(JFFFFFFFF)V */
} // .end method
public final Boolean e ( Float p0, Float p1 ) {
/* .locals 3 */
int v2 = 1; // const/4 v2, 0x1
int v1 = 0; // const/4 v1, 0x0
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->d:Z */
/* if-nez v0, :cond_0 */
/* move v0, v1 */
} // :goto_0
} // :cond_0
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->x:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* move v0, v2 */
} // :cond_1
/* iget v0, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->j:F */
/* cmpl-float v0, p1, v0 */
/* if-ltz v0, :cond_2 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->l:F */
/* cmpg-float v0, p1, v0 */
/* if-gtz v0, :cond_2 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->k:F */
/* cmpl-float v0, p2, v0 */
/* if-ltz v0, :cond_2 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->m:F */
/* cmpg-float v0, p2, v0 */
/* if-gtz v0, :cond_2 */
/* move v0, v2 */
} // :cond_2
/* move v0, v1 */
} // .end method
public final Float l ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->t:F */
} // .end method
public final Float m ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->v:F */
} // .end method
public final Float n ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/MaskPanel;->u:F */
} // .end method
public final Float o ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method

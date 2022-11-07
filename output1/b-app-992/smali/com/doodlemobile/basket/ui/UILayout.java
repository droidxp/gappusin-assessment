public class com.doodlemobile.basket.ui.UILayout extends com.doodlemobile.basket.ui.UIViewGroup implements com.doodlemobile.basket.l {
	 /* # interfaces */
	 /* # instance fields */
	 private Float A;
	 private Integer B;
	 private Integer C;
	 private Integer D;
	 private Integer E;
	 private com.doodlemobile.basket.util.a F;
	 private Boolean t;
	 private Integer u;
	 private Float v;
	 private Float w;
	 private Float x;
	 private Float y;
	 private Float z;
	 /* # direct methods */
	 public com.doodlemobile.basket.ui.UILayout ( ) {
		 /* .locals 4 */
		 int v1 = 0; // const/4 v1, 0x0
		 int v3 = 0; // const/4 v3, 0x0
		 int v2 = 0; // const/4 v2, 0x0
		 /* invoke-direct {p0, p1, p2}, Lcom/doodlemobile/basket/ui/UIViewGroup;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;)V */
		 /* iput-boolean v1, p0, Lcom/doodlemobile/basket/ui/UILayout;->t:Z */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/UILayout;->u:I */
		 /* iput v2, p0, Lcom/doodlemobile/basket/ui/UILayout;->v:F */
		 /* iput v2, p0, Lcom/doodlemobile/basket/ui/UILayout;->w:F */
		 /* iput v2, p0, Lcom/doodlemobile/basket/ui/UILayout;->x:F */
		 /* iput v2, p0, Lcom/doodlemobile/basket/ui/UILayout;->y:F */
		 /* new-instance v0, Lcom/doodlemobile/basket/util/a; */
		 /* invoke-direct {v0}, Lcom/doodlemobile/basket/util/a;-><init>()V */
		 this.F = v0;
		 v0 = 		 final String v0 = "clip"; // const-string v0, "clip"
		 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/ui/UILayout;->t:Z */
		 final String v0 = "style"; // const-string v0, "style"
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 final String v1 = "static"; // const-string v1, "static"
			 v1 = 			 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 if ( v1 != null) { // if-eqz v1, :cond_1
				 int v0 = 1; // const/4 v0, 0x1
				 /* iput v0, p0, Lcom/doodlemobile/basket/ui/UILayout;->u:I */
			 } // :cond_0
		 } // :goto_0
		 v0 = 		 final String v0 = "width"; // const-string v0, "width"
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/UILayout;->z:F */
		 v0 = 		 final String v0 = "height"; // const-string v0, "height"
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/UILayout;->A:F */
		 return;
	 } // :cond_1
	 final String v1 = "dynamic"; // const-string v1, "dynamic"
	 v0 = 	 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int v0 = 2; // const/4 v0, 0x2
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/UILayout;->u:I */
	 } // .end method
	 /* # virtual methods */
	 public final Float a ( Float p0, Float p1 ) {
		 /* .locals 2 */
		 v0 = 		 v0 = this.i;
		 /* int-to-float v0, v0 */
		 /* div-float v0, p1, v0 */
		 /* const/high16 v1, 0x3f000000 # 0.5f */
		 /* sub-float/2addr v0, v1 */
		 /* iget v1, p0, Lcom/doodlemobile/basket/ui/UILayout;->v:F */
		 /* mul-float/2addr v0, v1 */
	 } // .end method
	 public final void a ( Float p0, Float p1, Float p2, Float p3 ) {
		 /* .locals 4 */
		 /* const/high16 v2, 0x3f000000 # 0.5f */
		 /* iget v0, p0, Lcom/doodlemobile/basket/ui/UILayout;->x:F */
		 /* mul-float/2addr v0, v2 */
		 /* iget v1, p0, Lcom/doodlemobile/basket/ui/UILayout;->y:F */
		 /* mul-float/2addr v1, v2 */
		 /* neg-float v2, v0 */
		 /* neg-float v3, v1 */
		 /* invoke-super {p0, v2, v3, v0, v1}, Lcom/doodlemobile/basket/ui/UIViewGroup;->a(FFFF)V */
		 return;
	 } // .end method
	 public final void a ( Integer p0, Integer p1 ) {
		 /* .locals 0 */
		 /* invoke-super {p0, p1, p2}, Lcom/doodlemobile/basket/ui/UIViewGroup;->a(II)V */
		 (( com.doodlemobile.basket.ui.UILayout ) p0 ).q ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/ui/UILayout;->q()V
		 return;
	 } // .end method
	 public final void a ( Long p0 ) {
		 /* .locals 7 */
		 int v6 = 0; // const/4 v6, 0x0
		 int v5 = 0; // const/4 v5, 0x0
		 /* invoke-super {p0, p1, p2}, Lcom/doodlemobile/basket/ui/UIViewGroup;->a(J)V */
		 v0 = 		 (( com.doodlemobile.basket.ui.UILayout ) p0 ).r ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/ui/UILayout;->r()Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = 			 v0 = this.i;
			 v1 = 			 v1 = this.i;
			 /* iget v2, p0, Lcom/doodlemobile/basket/ui/UILayout;->u:I */
			 /* packed-switch v2, :pswitch_data_0 */
		 } // :goto_0
		 v0 = this.F;
		 /* iget v1, p0, Lcom/doodlemobile/basket/ui/UILayout;->B:I */
		 /* iput v1, v0, Lcom/doodlemobile/basket/util/a;->a:I */
		 v0 = this.F;
		 /* iget v1, p0, Lcom/doodlemobile/basket/ui/UILayout;->C:I */
		 /* iput v1, v0, Lcom/doodlemobile/basket/util/a;->b:I */
		 v0 = this.F;
		 /* iget v1, p0, Lcom/doodlemobile/basket/ui/UILayout;->D:I */
		 /* iput v1, v0, Lcom/doodlemobile/basket/util/a;->c:I */
		 v0 = this.F;
		 /* iget v1, p0, Lcom/doodlemobile/basket/ui/UILayout;->E:I */
		 /* iput v1, v0, Lcom/doodlemobile/basket/util/a;->d:I */
		 (( com.doodlemobile.basket.ui.UILayout ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/ui/UILayout;->b()V
		 (( com.doodlemobile.basket.ui.UILayout ) p0 ).a ( v5, v5, v5, v5 ); // invoke-virtual {p0, v5, v5, v5, v5}, Lcom/doodlemobile/basket/ui/UILayout;->a(FFFF)V
	 } // :cond_0
	 return;
	 /* :pswitch_0 */
	 /* int-to-float v2, v0 */
	 /* iput v2, p0, Lcom/doodlemobile/basket/ui/UILayout;->v:F */
	 /* iput v2, p0, Lcom/doodlemobile/basket/ui/UILayout;->x:F */
	 /* int-to-float v2, v1 */
	 /* iput v2, p0, Lcom/doodlemobile/basket/ui/UILayout;->w:F */
	 /* iput v2, p0, Lcom/doodlemobile/basket/ui/UILayout;->y:F */
	 /* iput v6, p0, Lcom/doodlemobile/basket/ui/UILayout;->C:I */
	 /* iput v6, p0, Lcom/doodlemobile/basket/ui/UILayout;->B:I */
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/UILayout;->D:I */
	 /* iput v1, p0, Lcom/doodlemobile/basket/ui/UILayout;->E:I */
	 /* :pswitch_1 */
	 /* iput v6, p0, Lcom/doodlemobile/basket/ui/UILayout;->C:I */
	 /* iput v6, p0, Lcom/doodlemobile/basket/ui/UILayout;->B:I */
	 /* int-to-float v2, v0 */
	 /* iget v3, p0, Lcom/doodlemobile/basket/ui/UILayout;->A:F */
	 /* mul-float/2addr v2, v3 */
	 /* int-to-float v3, v1 */
	 /* iget v4, p0, Lcom/doodlemobile/basket/ui/UILayout;->z:F */
	 /* mul-float/2addr v3, v4 */
	 /* cmpl-float v2, v2, v3 */
	 /* if-lez v2, :cond_1 */
	 /* iget v2, p0, Lcom/doodlemobile/basket/ui/UILayout;->A:F */
	 /* iput v2, p0, Lcom/doodlemobile/basket/ui/UILayout;->w:F */
	 /* iget v2, p0, Lcom/doodlemobile/basket/ui/UILayout;->A:F */
	 /* int-to-float v3, v1 */
	 /* div-float/2addr v2, v3 */
	 /* int-to-float v3, v0 */
	 /* mul-float/2addr v2, v3 */
	 /* iput v2, p0, Lcom/doodlemobile/basket/ui/UILayout;->v:F */
	 /* iput v1, p0, Lcom/doodlemobile/basket/ui/UILayout;->E:I */
	 /* int-to-float v1, v0 */
	 /* iget v2, p0, Lcom/doodlemobile/basket/ui/UILayout;->v:F */
	 /* div-float/2addr v1, v2 */
	 /* iget v2, p0, Lcom/doodlemobile/basket/ui/UILayout;->z:F */
	 /* mul-float/2addr v1, v2 */
	 /* float-to-int v1, v1 */
	 /* iput v1, p0, Lcom/doodlemobile/basket/ui/UILayout;->D:I */
	 /* iget v1, p0, Lcom/doodlemobile/basket/ui/UILayout;->D:I */
	 /* sub-int/2addr v0, v1 */
	 /* div-int/lit8 v0, v0, 0x2 */
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/UILayout;->B:I */
} // :goto_1
/* iget v0, p0, Lcom/doodlemobile/basket/ui/UILayout;->z:F */
/* iput v0, p0, Lcom/doodlemobile/basket/ui/UILayout;->x:F */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/UILayout;->A:F */
/* iput v0, p0, Lcom/doodlemobile/basket/ui/UILayout;->y:F */
} // :cond_1
/* iget v2, p0, Lcom/doodlemobile/basket/ui/UILayout;->z:F */
/* iput v2, p0, Lcom/doodlemobile/basket/ui/UILayout;->v:F */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/UILayout;->z:F */
/* int-to-float v3, v0 */
/* div-float/2addr v2, v3 */
/* int-to-float v3, v1 */
/* mul-float/2addr v2, v3 */
/* iput v2, p0, Lcom/doodlemobile/basket/ui/UILayout;->w:F */
/* iput v0, p0, Lcom/doodlemobile/basket/ui/UILayout;->D:I */
/* int-to-float v0, v1 */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/UILayout;->w:F */
/* div-float/2addr v0, v2 */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/UILayout;->A:F */
/* mul-float/2addr v0, v2 */
/* float-to-int v0, v0 */
/* iput v0, p0, Lcom/doodlemobile/basket/ui/UILayout;->E:I */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/UILayout;->E:I */
/* sub-int v0, v1, v0 */
/* div-int/lit8 v0, v0, 0x2 */
/* iput v0, p0, Lcom/doodlemobile/basket/ui/UILayout;->C:I */
/* :pswitch_2 */
/* const/high16 v2, 0x3f800000 # 1.0f */
/* iget v3, p0, Lcom/doodlemobile/basket/ui/UILayout;->z:F */
/* int-to-float v4, v0 */
/* div-float/2addr v3, v4 */
v2 = java.lang.Math .max ( v2,v3 );
/* iget v3, p0, Lcom/doodlemobile/basket/ui/UILayout;->A:F */
/* int-to-float v4, v1 */
/* div-float/2addr v3, v4 */
v2 = java.lang.Math .max ( v2,v3 );
/* int-to-float v3, v0 */
/* mul-float/2addr v3, v2 */
/* iput v3, p0, Lcom/doodlemobile/basket/ui/UILayout;->v:F */
/* iput v3, p0, Lcom/doodlemobile/basket/ui/UILayout;->x:F */
/* int-to-float v3, v1 */
/* mul-float/2addr v2, v3 */
/* iput v2, p0, Lcom/doodlemobile/basket/ui/UILayout;->w:F */
/* iput v2, p0, Lcom/doodlemobile/basket/ui/UILayout;->y:F */
/* iput v6, p0, Lcom/doodlemobile/basket/ui/UILayout;->C:I */
/* iput v6, p0, Lcom/doodlemobile/basket/ui/UILayout;->B:I */
/* iput v0, p0, Lcom/doodlemobile/basket/ui/UILayout;->D:I */
/* iput v1, p0, Lcom/doodlemobile/basket/ui/UILayout;->E:I */
/* goto/16 :goto_0 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public final void a ( Object p0, com.doodlemobile.basket.math.MatrixStack p1 ) {
/* .locals 2 */
/* invoke-super {p0, p1, p2}, Lcom/doodlemobile/basket/ui/UIViewGroup;->a(Lcom/doodlemobile/basket/opengl/m;Lcom/doodlemobile/basket/math/MatrixStack;)V */
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).b ( ); // invoke-virtual {p2}, Lcom/doodlemobile/basket/math/MatrixStack;->b()V
/* iget v0, p0, Lcom/doodlemobile/basket/ui/UILayout;->v:F */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/UILayout;->w:F */
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).c ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Lcom/doodlemobile/basket/math/MatrixStack;->c(FF)V
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/UILayout;->t:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.F;
com.doodlemobile.basket.graphics.c .a ( v0 );
} // :cond_0
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 0 */
com.doodlemobile.basket.e .a ( p1,p0 );
/* invoke-super {p0, p1}, Lcom/doodlemobile/basket/ui/UIViewGroup;->a(Lcom/doodlemobile/basket/p;)V */
com.doodlemobile.basket.e .b ( p1,p0 );
return;
} // .end method
public final Boolean a ( Object p0 ) {
/* .locals 3 */
v0 = (( com.doodlemobile.basket.util.e ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->a()F
v1 = (( com.doodlemobile.basket.util.e ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->b()F
(( com.doodlemobile.basket.util.e ) p1 ).e ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->e()V
v2 = /* invoke-super {p0, p1}, Lcom/doodlemobile/basket/ui/UIViewGroup;->a(Lcom/doodlemobile/basket/util/e;)Z */
if ( v2 != null) { // if-eqz v2, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
(( com.doodlemobile.basket.util.e ) p1 ).a ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lcom/doodlemobile/basket/util/e;->a(FF)V
int v0 = 0; // const/4 v0, 0x0
} // .end method
public final Float b ( Float p0, Float p1 ) {
/* .locals 2 */
v0 = v0 = this.i;
/* int-to-float v0, v0 */
/* div-float v0, p2, v0 */
/* const/high16 v1, 0x3f000000 # 0.5f */
/* sub-float/2addr v0, v1 */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/UILayout;->w:F */
/* mul-float/2addr v0, v1 */
} // .end method
public final void b ( Object p0, com.doodlemobile.basket.math.MatrixStack p1 ) {
/* .locals 1 */
/* invoke-super {p0, p1, p2}, Lcom/doodlemobile/basket/ui/UIViewGroup;->b(Lcom/doodlemobile/basket/opengl/m;Lcom/doodlemobile/basket/math/MatrixStack;)V */
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).c ( ); // invoke-virtual {p2}, Lcom/doodlemobile/basket/math/MatrixStack;->c()V
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/UILayout;->t:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
com.doodlemobile.basket.graphics.c .a ( );
} // :cond_0
return;
} // .end method
protected final void b ( Object p0 ) {
/* .locals 4 */
/* const/high16 v3, -0x41000000 # -0.5f */
v0 = v0 = this.i;
/* int-to-float v0, v0 */
v1 = v1 = this.i;
/* int-to-float v1, v1 */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/UILayout;->v:F */
/* div-float v0, v2, v0 */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/UILayout;->w:F */
/* div-float v1, v2, v1 */
(( com.doodlemobile.basket.util.e ) p1 ).c ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lcom/doodlemobile/basket/util/e;->c(FF)V
/* iget v0, p0, Lcom/doodlemobile/basket/ui/UILayout;->v:F */
/* mul-float/2addr v0, v3 */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/UILayout;->w:F */
/* mul-float/2addr v1, v3 */
(( com.doodlemobile.basket.util.e ) p1 ).b ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lcom/doodlemobile/basket/util/e;->b(FF)V
return;
} // .end method
public final Float c ( Float p0, Float p1 ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/UILayout;->v:F */
/* div-float v0, p1, v0 */
} // .end method
public final Float d ( Float p0, Float p1 ) {
/* .locals 2 */
/* neg-float v0, p2 */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/UILayout;->w:F */
/* div-float/2addr v0, v1 */
} // .end method

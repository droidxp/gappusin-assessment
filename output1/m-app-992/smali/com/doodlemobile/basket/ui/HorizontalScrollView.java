public class com.doodlemobile.basket.ui.HorizontalScrollView extends com.doodlemobile.basket.ui.Panel {
	 /* # instance fields */
	 private Float A;
	 private Float B;
	 private Float C;
	 private com.doodlemobile.basket.util.a D;
	 private Float t;
	 private Float u;
	 private Float v;
	 private Long w;
	 private Boolean x;
	 private Float y;
	 private Float z;
	 /* # direct methods */
	 public com.doodlemobile.basket.ui.HorizontalScrollView ( ) {
		 /* .locals 3 */
		 /* const/high16 v2, 0x40000000 # 2.0f */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0, p1, p2}, Lcom/doodlemobile/basket/ui/Panel;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;)V */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->t:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->u:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->v:F */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->x:Z */
		 /* iput v1, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->y:F */
		 /* iput v2, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->z:F */
		 /* iput v2, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->A:F */
		 /* new-instance v0, Lcom/doodlemobile/basket/util/a; */
		 /* invoke-direct {v0}, Lcom/doodlemobile/basket/util/a;-><init>()V */
		 this.D = v0;
		 return;
	 } // .end method
	 private void a ( ) {
		 /* .locals 4 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* iget v0, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->t:F */
		 /* iget v1, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->y:F */
		 /* cmpl-float v0, v0, v1 */
		 /* if-lez v0, :cond_0 */
		 /* iget v0, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->y:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->t:F */
	 } // :cond_0
	 /* iget v0, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->t:F */
	 /* cmpg-float v0, v0, v2 */
	 /* if-gez v0, :cond_1 */
	 /* iput v2, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->t:F */
} // :cond_1
/* iget v0, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->j:F */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->t:F */
/* sub-float/2addr v0, v1 */
/* iput v0, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->g:F */
v0 = this.i;
int v1 = 0; // const/4 v1, 0x0
/* iget v2, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->j:F */
/* iget v3, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->t:F */
/* sub-float/2addr v2, v3 */
v2 = java.lang.Float .floatToIntBits ( v2 );
int v3 = 0; // const/4 v3, 0x0
return;
} // .end method
private void d ( Object p0 ) {
/* .locals 5 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->v:F */
v1 = (( com.doodlemobile.basket.util.e ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->a()F
/* sub-float/2addr v0, v1 */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->t:F */
/* sub-float/2addr v0, v1 */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->v:F */
v2 = (( com.doodlemobile.basket.util.e ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->a()F
/* sub-float/2addr v1, v2 */
/* iput v1, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->t:F */
(( com.doodlemobile.basket.util.e ) p1 ).c ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->c()J
/* move-result-wide v1 */
/* iget-wide v3, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->w:J */
/* sub-long/2addr v1, v3 */
/* const-wide/16 v3, 0x0 */
/* cmp-long v3, v1, v3 */
if ( v3 != null) { // if-eqz v3, :cond_0
	 /* iget v3, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->u:F */
	 /* const v4, 0x3f19999a # 0.6f */
	 /* mul-float/2addr v3, v4 */
	 /* long-to-float v1, v1 */
	 /* div-float/2addr v0, v1 */
	 /* const v1, 0x3ecccccd # 0.4f */
	 /* mul-float/2addr v0, v1 */
	 /* add-float/2addr v0, v3 */
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->u:F */
} // :cond_0
(( com.doodlemobile.basket.util.e ) p1 ).c ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->c()J
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->w:J */
/* invoke-direct {p0}, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->a()V */
return;
} // .end method
/* # virtual methods */
protected final Float a ( Float p0, Float p1 ) {
/* .locals 3 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->j:F */
/* sub-float v0, p1, v0 */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->t:F */
/* add-float/2addr v0, v1 */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->k:F */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->m:F */
/* add-float/2addr v1, v2 */
/* const/high16 v2, 0x40000000 # 2.0f */
/* div-float/2addr v1, v2 */
/* sub-float v1, p2, v1 */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->f:F */
v2 = com.doodlemobile.basket.math.MathUtil .cos ( v2 );
/* mul-float/2addr v0, v2 */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->f:F */
v2 = com.doodlemobile.basket.math.MathUtil .sin ( v2 );
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
} // .end method
public final void a ( Integer p0, Integer p1, java.lang.Object p2 ) {
/* .locals 4 */
/* const/high16 v3, 0x3f000000 # 0.5f */
/* packed-switch p1, :pswitch_data_0 */
/* invoke-super {p0, p1, p2, p3}, Lcom/doodlemobile/basket/ui/Panel;->a(IILjava/lang/Object;)V */
} // :goto_0
return;
/* :pswitch_0 */
v0 = this.D;
/* neg-float v1, v1 */
v2 = java.lang.Float .intBitsToFloat ( p2 );
/* add-float/2addr v2, v3 */
v3 = v3 = this.i;
/* int-to-float v3, v3 */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
/* div-float/2addr v1, v2 */
/* float-to-int v1, v1 */
/* iput v1, v0, Lcom/doodlemobile/basket/util/a;->a:I */
/* :pswitch_1 */
v0 = this.D;
/* neg-float v1, v1 */
v2 = java.lang.Float .intBitsToFloat ( p2 );
/* add-float/2addr v2, v3 */
v3 = v3 = this.i;
/* int-to-float v3, v3 */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
/* div-float/2addr v1, v2 */
/* float-to-int v1, v1 */
/* iput v1, v0, Lcom/doodlemobile/basket/util/a;->b:I */
/* :pswitch_2 */
v0 = this.D;
v1 = java.lang.Float .intBitsToFloat ( p2 );
v2 = v2 = this.i;
/* int-to-float v2, v2 */
/* mul-float/2addr v1, v2 */
/* div-float/2addr v1, v2 */
/* float-to-int v1, v1 */
/* iput v1, v0, Lcom/doodlemobile/basket/util/a;->c:I */
/* :pswitch_3 */
v0 = this.D;
v1 = java.lang.Float .intBitsToFloat ( p2 );
v2 = v2 = this.i;
/* int-to-float v2, v2 */
/* mul-float/2addr v1, v2 */
/* div-float/2addr v1, v2 */
/* float-to-int v1, v1 */
/* iput v1, v0, Lcom/doodlemobile/basket/util/a;->d:I */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x3 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
} // .end packed-switch
} // .end method
public final void a ( Long p0 ) {
/* .locals 8 */
int v3 = 0; // const/4 v3, 0x0
int v7 = 0; // const/4 v7, 0x0
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->x:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* long-to-float v0, p1 */
/* const v1, 0x3a83126f # 0.001f */
/* mul-float/2addr v0, v1 */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->u:F */
/* cmpg-float v1, v1, v3 */
/* if-gez v1, :cond_2 */
/* const/high16 v1, 0x40400000 # 3.0f */
} // :goto_0
/* iget v2, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->u:F */
/* mul-float/2addr v0, v1 */
/* add-float/2addr v0, v2 */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->u:F */
/* mul-float/2addr v1, v0 */
/* cmpg-float v1, v1, v3 */
/* if-gtz v1, :cond_0 */
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->x:Z */
} // :cond_0
/* iget v1, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->t:F */
/* long-to-float v2, p1 */
/* mul-float/2addr v2, v0 */
/* add-float/2addr v1, v2 */
/* iput v1, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->t:F */
/* iput v0, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->u:F */
/* invoke-direct {p0}, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->a()V */
} // :cond_1
v0 = this.b;
/* iget v1, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->j:F */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->k:F */
v0 = (( com.doodlemobile.basket.ui.UIViewGroup ) v0 ).c ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/doodlemobile/basket/ui/UIViewGroup;->c(FF)F
v1 = this.b;
/* iget v2, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->j:F */
/* iget v3, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->k:F */
v1 = (( com.doodlemobile.basket.ui.UIViewGroup ) v1 ).d ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/doodlemobile/basket/ui/UIViewGroup;->d(FF)F
v2 = this.b;
/* iget v3, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->l:F */
/* iget v4, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->m:F */
v2 = (( com.doodlemobile.basket.ui.UIViewGroup ) v2 ).c ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lcom/doodlemobile/basket/ui/UIViewGroup;->c(FF)F
v3 = this.b;
/* iget v4, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->l:F */
/* iget v5, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->m:F */
v3 = (( com.doodlemobile.basket.ui.UIViewGroup ) v3 ).d ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Lcom/doodlemobile/basket/ui/UIViewGroup;->d(FF)F
v4 = this.i;
int v5 = 3; // const/4 v5, 0x3
v6 = java.lang.Float .floatToIntBits ( v0 );
v4 = this.i;
int v5 = 4; // const/4 v5, 0x4
v6 = java.lang.Float .floatToIntBits ( v3 );
v4 = this.i;
int v5 = 5; // const/4 v5, 0x5
/* sub-float v0, v2, v0 */
v0 = java.lang.Float .floatToIntBits ( v0 );
v0 = this.i;
int v2 = 6; // const/4 v2, 0x6
/* sub-float/2addr v1, v3 */
v1 = java.lang.Float .floatToIntBits ( v1 );
/* invoke-super {p0, p1, p2}, Lcom/doodlemobile/basket/ui/Panel;->a(J)V */
return;
} // :cond_2
/* const/high16 v1, -0x3fc00000 # -3.0f */
} // .end method
public final void a ( Object p0, com.doodlemobile.basket.math.MatrixStack p1 ) {
/* .locals 1 */
v0 = this.D;
com.doodlemobile.basket.graphics.c .a ( v0 );
/* invoke-super {p0, p1, p2}, Lcom/doodlemobile/basket/ui/Panel;->a(Lcom/doodlemobile/basket/opengl/m;Lcom/doodlemobile/basket/math/MatrixStack;)V */
return;
} // .end method
protected final void a ( Boolean p0, Float p1, Float p2, Float p3, Float p4 ) {
/* .locals 14 */
/* if-nez p1, :cond_0 */
/* iget-boolean v3, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->e:Z */
if ( v3 != null) { // if-eqz v3, :cond_2
} // :cond_0
/* add-float v3, p3, p5 */
/* const/high16 v4, 0x40000000 # 2.0f */
/* div-float/2addr v3, v4 */
v4 = this.i;
int v5 = 0; // const/4 v5, 0x0
/* iget v6, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->t:F */
/* sub-float v6, p2, v6 */
v6 = java.lang.Float .floatToIntBits ( v6 );
int v7 = 0; // const/4 v7, 0x0
v4 = this.i;
int v5 = 1; // const/4 v5, 0x1
v3 = java.lang.Float .floatToIntBits ( v3 );
int v6 = 0; // const/4 v6, 0x0
v3 = this.b;
/* move-object v0, v3 */
/* move/from16 v1, p2 */
/* move/from16 v2, p3 */
v3 = (( com.doodlemobile.basket.ui.UIViewGroup ) v0 ).c ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/doodlemobile/basket/ui/UIViewGroup;->c(FF)F
v4 = this.b;
/* move-object v0, v4 */
/* move/from16 v1, p2 */
/* move/from16 v2, p3 */
v4 = (( com.doodlemobile.basket.ui.UIViewGroup ) v0 ).d ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/doodlemobile/basket/ui/UIViewGroup;->d(FF)F
v5 = this.b;
/* move-object v0, v5 */
/* move/from16 v1, p4 */
/* move/from16 v2, p5 */
v5 = (( com.doodlemobile.basket.ui.UIViewGroup ) v0 ).c ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/doodlemobile/basket/ui/UIViewGroup;->c(FF)F
v6 = this.b;
/* move-object v0, v6 */
/* move/from16 v1, p4 */
/* move/from16 v2, p5 */
v6 = (( com.doodlemobile.basket.ui.UIViewGroup ) v0 ).d ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/doodlemobile/basket/ui/UIViewGroup;->d(FF)F
v7 = this.i;
int v8 = 3; // const/4 v8, 0x3
v9 = java.lang.Float .floatToIntBits ( v3 );
int v10 = 0; // const/4 v10, 0x0
v7 = this.i;
int v8 = 4; // const/4 v8, 0x4
v9 = java.lang.Float .floatToIntBits ( v6 );
int v10 = 0; // const/4 v10, 0x0
v7 = this.i;
int v8 = 5; // const/4 v8, 0x5
/* sub-float v9, v5, v3 */
v9 = java.lang.Float .floatToIntBits ( v9 );
int v10 = 0; // const/4 v10, 0x0
v7 = this.i;
int v8 = 6; // const/4 v8, 0x6
/* sub-float v9, v4, v6 */
v9 = java.lang.Float .floatToIntBits ( v9 );
int v10 = 0; // const/4 v10, 0x0
final String v7 = "tag"; // const-string v7, "tag"
/* new-instance v8, Ljava/lang/StringBuilder; */
/* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
final String v9 = "--------Horizontalscrollview----------- "; // const-string v9, "--------Horizontalscrollview----------- "
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).append ( v3 ); // invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v9 = " "; // const-string v9, " "
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).append ( v4 ); // invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v9 = " "; // const-string v9, " "
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* sub-float v3, v5, v3 */
(( java.lang.StringBuilder ) v8 ).append ( v3 ); // invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v5 = " "; // const-string v5, " "
(( java.lang.StringBuilder ) v3 ).append ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* sub-float/2addr v4, v6 */
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v7,v3 );
v3 = this.a;
/* iget v4, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->q:I */
int v5 = 0; // const/4 v5, 0x0
/* sub-float v6, p5, p3 */
int v7 = 0; // const/4 v7, 0x0
} // :goto_0
/* if-ge v7, v4, :cond_1 */
/* aget-object v8, v3, v7 */
(( com.doodlemobile.basket.ui.e ) v8 ).s ( ); // invoke-virtual {v8}, Lcom/doodlemobile/basket/ui/e;->s()Lcom/doodlemobile/basket/ui/b;
/* iget v10, v9, Lcom/doodlemobile/basket/ui/b;->j:F */
/* mul-float/2addr v10, v6 */
/* iget v11, v9, Lcom/doodlemobile/basket/ui/b;->d:F */
/* add-float/2addr v10, v11 */
v11 = (( com.doodlemobile.basket.ui.e ) v8 ).p ( ); // invoke-virtual {v8}, Lcom/doodlemobile/basket/ui/e;->p()F
/* iget v12, v9, Lcom/doodlemobile/basket/ui/b;->a:F */
/* add-float/2addr v12, v5 */
/* const/high16 v13, -0x41000000 # -0.5f */
/* iget v9, v9, Lcom/doodlemobile/basket/ui/b;->h:F */
/* sub-float v9, v13, v9 */
/* mul-float/2addr v9, v11 */
/* add-float/2addr v9, v10 */
/* add-float v10, v9, v11 */
(( com.doodlemobile.basket.ui.e ) v8 ).a ( v5, v9, v12, v10 ); // invoke-virtual {v8, v5, v9, v12, v10}, Lcom/doodlemobile/basket/ui/e;->a(FFFF)V
/* add-int/lit8 v5, v7, 0x1 */
/* move v7, v5 */
/* move v5, v12 */
} // :cond_1
/* if-lez v4, :cond_2 */
(( com.doodlemobile.basket.ui.HorizontalScrollView ) p0 ).s ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->s()Lcom/doodlemobile/basket/ui/b;
/* iget v3, v3, Lcom/doodlemobile/basket/ui/b;->a:F */
/* sub-float v3, v5, v3 */
int v4 = 0; // const/4 v4, 0x0
v3 = java.lang.Math .max ( v3,v4 );
/* iput v3, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->y:F */
} // :cond_2
return;
} // .end method
public final Boolean a ( Object p0 ) {
/* .locals 7 */
int v6 = 5; // const/4 v6, 0x5
int v5 = 3; // const/4 v5, 0x3
int v4 = 0; // const/4 v4, 0x0
v0 = (( com.doodlemobile.basket.util.e ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->a()F
v1 = (( com.doodlemobile.basket.util.e ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->b()F
v2 = (( com.doodlemobile.basket.util.e ) p1 ).d ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->d()I
/* if-nez v2, :cond_0 */
/* iput v0, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->B:F */
/* iput v1, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->C:F */
} // :cond_0
v2 = this.r;
if ( v2 != null) { // if-eqz v2, :cond_2
v2 = (( com.doodlemobile.basket.util.e ) p1 ).d ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->d()I
int v3 = 2; // const/4 v3, 0x2
/* if-ne v2, v3, :cond_2 */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->B:F */
/* sub-float v2, v0, v2 */
v2 = java.lang.Math .abs ( v2 );
/* iget v3, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->z:F */
/* cmpl-float v2, v2, v3 */
/* if-gtz v2, :cond_1 */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->C:F */
/* sub-float v2, v1, v2 */
v2 = java.lang.Math .abs ( v2 );
/* iget v3, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->A:F */
/* cmpl-float v2, v2, v3 */
/* if-lez v2, :cond_2 */
} // :cond_1
(( com.doodlemobile.basket.util.e ) p1 ).a ( v5 ); // invoke-virtual {p1, v5}, Lcom/doodlemobile/basket/util/e;->a(I)V
/* invoke-super {p0, p1}, Lcom/doodlemobile/basket/ui/Panel;->a(Lcom/doodlemobile/basket/util/e;)Z */
(( com.doodlemobile.basket.util.e ) p1 ).a ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lcom/doodlemobile/basket/util/e;->a(FF)V
(( com.doodlemobile.basket.util.e ) p1 ).a ( v4 ); // invoke-virtual {p1, v4}, Lcom/doodlemobile/basket/util/e;->a(I)V
v0 = (( com.doodlemobile.basket.ui.HorizontalScrollView ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->c(Lcom/doodlemobile/basket/util/e;)Z
} // :goto_0
} // :cond_2
v0 = this.r;
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = (( com.doodlemobile.basket.util.e ) p1 ).d ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->d()I
/* if-ne v0, v6, :cond_3 */
(( com.doodlemobile.basket.util.e ) p1 ).a ( v5 ); // invoke-virtual {p1, v5}, Lcom/doodlemobile/basket/util/e;->a(I)V
/* invoke-super {p0, p1}, Lcom/doodlemobile/basket/ui/Panel;->a(Lcom/doodlemobile/basket/util/e;)Z */
(( com.doodlemobile.basket.util.e ) p1 ).a ( v4 ); // invoke-virtual {p1, v4}, Lcom/doodlemobile/basket/util/e;->a(I)V
(( com.doodlemobile.basket.ui.HorizontalScrollView ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->c(Lcom/doodlemobile/basket/util/e;)Z
(( com.doodlemobile.basket.util.e ) p1 ).a ( v6 ); // invoke-virtual {p1, v6}, Lcom/doodlemobile/basket/util/e;->a(I)V
(( com.doodlemobile.basket.ui.HorizontalScrollView ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->c(Lcom/doodlemobile/basket/util/e;)Z
int v0 = 1; // const/4 v0, 0x1
} // :cond_3
v0 = /* invoke-super {p0, p1}, Lcom/doodlemobile/basket/ui/Panel;->a(Lcom/doodlemobile/basket/util/e;)Z */
} // .end method
public final void b ( Object p0, com.doodlemobile.basket.math.MatrixStack p1 ) {
/* .locals 0 */
com.doodlemobile.basket.graphics.c .a ( );
/* invoke-super {p0, p1, p2}, Lcom/doodlemobile/basket/ui/Panel;->b(Lcom/doodlemobile/basket/opengl/m;Lcom/doodlemobile/basket/math/MatrixStack;)V */
return;
} // .end method
protected final void b ( Object p0 ) {
/* .locals 3 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->j:F */
/* neg-float v0, v0 */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->t:F */
/* add-float/2addr v0, v1 */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->k:F */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->m:F */
/* add-float/2addr v1, v2 */
/* const/high16 v2, -0x40000000 # -2.0f */
/* div-float/2addr v1, v2 */
(( com.doodlemobile.basket.util.e ) p1 ).b ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lcom/doodlemobile/basket/util/e;->b(FF)V
return;
} // .end method
public final Boolean c ( Object p0 ) {
/* .locals 3 */
int v2 = 1; // const/4 v2, 0x1
v0 = (( com.doodlemobile.basket.util.e ) p1 ).d ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->d()I
/* packed-switch v0, :pswitch_data_0 */
} // :goto_0
/* :pswitch_0 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->x:Z */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->t:F */
v1 = (( com.doodlemobile.basket.util.e ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->a()F
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->v:F */
(( com.doodlemobile.basket.util.e ) p1 ).c ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->c()J
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->w:J */
/* :pswitch_1 */
/* invoke-direct {p0, p1}, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->d(Lcom/doodlemobile/basket/util/e;)V */
/* :pswitch_2 */
/* invoke-direct {p0, p1}, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->d(Lcom/doodlemobile/basket/util/e;)V */
/* iput-boolean v2, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->x:Z */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_2 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public final Boolean e ( Float p0, Float p1 ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->d:Z */
/* if-nez v0, :cond_0 */
/* move v0, v1 */
} // :goto_0
} // :cond_0
/* iget v0, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->j:F */
/* cmpl-float v0, p1, v0 */
/* if-ltz v0, :cond_1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->l:F */
/* cmpg-float v0, p1, v0 */
/* if-gtz v0, :cond_1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->k:F */
/* cmpl-float v0, p2, v0 */
/* if-ltz v0, :cond_1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/HorizontalScrollView;->m:F */
/* cmpg-float v0, p2, v0 */
/* if-gtz v0, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
/* move v0, v1 */
} // .end method

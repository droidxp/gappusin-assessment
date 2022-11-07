public class com.doodlemobile.basket.ui.VerticalScrollView extends com.doodlemobile.basket.ui.Panel {
	 /* # instance fields */
	 private Float A;
	 private Float B;
	 private Float C;
	 private Integer D;
	 private Integer E;
	 private Integer F;
	 private Integer G;
	 private Float t;
	 private Float u;
	 private Float v;
	 private Long w;
	 private Boolean x;
	 private Float y;
	 private Float z;
	 /* # direct methods */
	 private void a ( ) {
		 /* .locals 4 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* iget v0, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->t:F */
		 /* iget v1, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->y:F */
		 /* cmpl-float v0, v0, v1 */
		 /* if-lez v0, :cond_0 */
		 /* iget v0, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->y:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->t:F */
	 } // :cond_0
	 /* iget v0, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->t:F */
	 /* cmpg-float v0, v0, v2 */
	 /* if-gez v0, :cond_1 */
	 /* iput v2, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->t:F */
} // :cond_1
final String v0 = "tag"; // const-string v0, "tag"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "------forceScroolBound------ "; // const-string v2, "------forceScroolBound------ "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->k:F */
/* iget v3, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->t:F */
/* sub-float/2addr v2, v3 */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v0,v1 );
v0 = this.i;
int v1 = 1; // const/4 v1, 0x1
/* iget v2, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->k:F */
/* iget v3, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->t:F */
/* sub-float/2addr v2, v3 */
v2 = java.lang.Float .floatToIntBits ( v2 );
int v3 = 0; // const/4 v3, 0x0
return;
} // .end method
private void d ( Object p0 ) {
/* .locals 5 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->v:F */
v1 = (( com.doodlemobile.basket.util.e ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->b()F
/* sub-float/2addr v0, v1 */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->t:F */
/* sub-float/2addr v0, v1 */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->v:F */
v2 = (( com.doodlemobile.basket.util.e ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->b()F
/* sub-float/2addr v1, v2 */
/* iput v1, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->t:F */
(( com.doodlemobile.basket.util.e ) p1 ).c ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->c()J
/* move-result-wide v1 */
/* iget-wide v3, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->w:J */
/* sub-long/2addr v1, v3 */
/* const-wide/16 v3, 0x0 */
/* cmp-long v3, v1, v3 */
if ( v3 != null) { // if-eqz v3, :cond_0
	 /* iget v3, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->u:F */
	 /* const v4, 0x3f19999a # 0.6f */
	 /* mul-float/2addr v3, v4 */
	 /* long-to-float v1, v1 */
	 /* div-float/2addr v0, v1 */
	 /* const v1, 0x3ecccccd # 0.4f */
	 /* mul-float/2addr v0, v1 */
	 /* add-float/2addr v0, v3 */
	 /* iput v0, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->u:F */
} // :cond_0
(( com.doodlemobile.basket.util.e ) p1 ).c ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->c()J
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->w:J */
/* invoke-direct {p0}, Lcom/doodlemobile/basket/ui/VerticalScrollView;->a()V */
return;
} // .end method
/* # virtual methods */
public final void a ( Integer p0, Integer p1, java.lang.Object p2 ) {
/* .locals 4 */
/* const/high16 v2, 0x3f000000 # 0.5f */
/* packed-switch p1, :pswitch_data_0 */
/* invoke-super {p0, p1, p2, p3}, Lcom/doodlemobile/basket/ui/Panel;->a(IILjava/lang/Object;)V */
} // :goto_0
return;
/* :pswitch_0 */
/* neg-float v0, v0 */
v1 = java.lang.Float .intBitsToFloat ( p2 );
/* add-float/2addr v1, v2 */
v2 = v2 = this.i;
/* int-to-float v2, v2 */
/* div-float/2addr v2, v3 */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* float-to-int v0, v0 */
/* iput v0, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->D:I */
/* :pswitch_1 */
/* neg-float v0, v0 */
v1 = java.lang.Float .intBitsToFloat ( p2 );
/* add-float/2addr v1, v2 */
v2 = v2 = this.i;
/* int-to-float v2, v2 */
/* div-float/2addr v2, v3 */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* float-to-int v0, v0 */
/* iput v0, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->E:I */
/* :pswitch_2 */
v0 = java.lang.Float .intBitsToFloat ( p2 );
v1 = v1 = this.i;
/* int-to-float v1, v1 */
/* mul-float/2addr v0, v1 */
/* div-float/2addr v0, v1 */
/* float-to-int v0, v0 */
/* iput v0, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->F:I */
/* :pswitch_3 */
v0 = java.lang.Float .intBitsToFloat ( p2 );
v1 = v1 = this.i;
/* int-to-float v1, v1 */
/* mul-float/2addr v0, v1 */
/* div-float/2addr v0, v1 */
/* float-to-int v0, v0 */
/* iput v0, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->G:I */
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
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->x:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* long-to-float v0, p1 */
/* const v1, 0x3a83126f # 0.001f */
/* mul-float/2addr v0, v1 */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->u:F */
/* cmpg-float v1, v1, v3 */
/* if-gez v1, :cond_2 */
/* const/high16 v1, 0x40400000 # 3.0f */
} // :goto_0
/* iget v2, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->u:F */
/* mul-float/2addr v0, v1 */
/* add-float/2addr v0, v2 */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->u:F */
/* mul-float/2addr v1, v0 */
/* cmpg-float v1, v1, v3 */
/* if-gtz v1, :cond_0 */
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->x:Z */
} // :cond_0
/* iget v1, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->t:F */
/* long-to-float v2, p1 */
/* mul-float/2addr v2, v0 */
/* add-float/2addr v1, v2 */
/* iput v1, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->t:F */
/* iput v0, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->u:F */
/* invoke-direct {p0}, Lcom/doodlemobile/basket/ui/VerticalScrollView;->a()V */
} // :cond_1
/* invoke-super {p0, p1, p2}, Lcom/doodlemobile/basket/ui/Panel;->a(J)V */
return;
} // :cond_2
/* const/high16 v1, -0x3fc00000 # -3.0f */
} // .end method
public final void a ( Object p0, com.doodlemobile.basket.math.MatrixStack p1 ) {
/* .locals 6 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->D:I */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->E:I */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->F:I */
/* iget v3, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->G:I */
v4 = com.doodlemobile.basket.r.a;
/* const/16 v5, 0xc11 */
v4 = com.doodlemobile.basket.r.a;
/* invoke-super {p0, p1, p2}, Lcom/doodlemobile/basket/ui/Panel;->a(Lcom/doodlemobile/basket/opengl/m;Lcom/doodlemobile/basket/math/MatrixStack;)V */
return;
} // .end method
protected final void a ( Boolean p0, Float p1, Float p2, Float p3, Float p4 ) {
/* .locals 14 */
/* if-nez p1, :cond_0 */
/* iget-boolean v3, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->e:Z */
if ( v3 != null) { // if-eqz v3, :cond_2
} // :cond_0
/* add-float v3, p4, p2 */
/* const/high16 v4, 0x40000000 # 2.0f */
/* div-float/2addr v3, v4 */
v4 = this.i;
int v5 = 0; // const/4 v5, 0x0
v3 = java.lang.Float .floatToIntBits ( v3 );
int v6 = 0; // const/4 v6, 0x0
v3 = this.i;
int v4 = 1; // const/4 v4, 0x1
/* iget v5, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->t:F */
/* sub-float v5, p3, v5 */
v5 = java.lang.Float .floatToIntBits ( v5 );
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
final String v9 = "--------verticalscrollview----------- "; // const-string v9, "--------verticalscrollview----------- "
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
/* iget v4, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->q:I */
/* sub-float v5, p4, p2 */
int v6 = 0; // const/4 v6, 0x0
int v7 = 0; // const/4 v7, 0x0
} // :goto_0
/* if-ge v7, v4, :cond_1 */
/* aget-object v8, v3, v7 */
(( com.doodlemobile.basket.ui.e ) v8 ).s ( ); // invoke-virtual {v8}, Lcom/doodlemobile/basket/ui/e;->s()Lcom/doodlemobile/basket/ui/b;
/* iget v10, v9, Lcom/doodlemobile/basket/ui/b;->i:F */
/* mul-float/2addr v10, v5 */
v11 = (( com.doodlemobile.basket.ui.e ) v8 ).k ( ); // invoke-virtual {v8}, Lcom/doodlemobile/basket/ui/e;->k()F
/* const/high16 v12, -0x41000000 # -0.5f */
/* iget v13, v9, Lcom/doodlemobile/basket/ui/b;->g:F */
/* sub-float/2addr v12, v13 */
/* mul-float/2addr v12, v11 */
/* add-float/2addr v10, v12 */
/* add-float/2addr v11, v10 */
/* iget v9, v9, Lcom/doodlemobile/basket/ui/b;->b:F */
/* add-float/2addr v9, v6 */
(( com.doodlemobile.basket.ui.e ) v8 ).a ( v10, v6, v11, v9 ); // invoke-virtual {v8, v10, v6, v11, v9}, Lcom/doodlemobile/basket/ui/e;->a(FFFF)V
/* add-int/lit8 v6, v7, 0x1 */
/* move v7, v6 */
/* move v6, v9 */
} // :cond_1
/* if-lez v4, :cond_2 */
(( com.doodlemobile.basket.ui.VerticalScrollView ) p0 ).s ( ); // invoke-virtual {p0}, Lcom/doodlemobile/basket/ui/VerticalScrollView;->s()Lcom/doodlemobile/basket/ui/b;
/* iget v3, v3, Lcom/doodlemobile/basket/ui/b;->b:F */
/* sub-float v3, v6, v3 */
int v4 = 0; // const/4 v4, 0x0
v3 = java.lang.Math .max ( v3,v4 );
/* iput v3, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->y:F */
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
/* iput v0, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->B:F */
/* iput v1, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->C:F */
} // :cond_0
v2 = this.r;
if ( v2 != null) { // if-eqz v2, :cond_2
v2 = (( com.doodlemobile.basket.util.e ) p1 ).d ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->d()I
int v3 = 2; // const/4 v3, 0x2
/* if-ne v2, v3, :cond_2 */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->B:F */
/* sub-float v2, v0, v2 */
v2 = java.lang.Math .abs ( v2 );
/* iget v3, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->z:F */
/* cmpl-float v2, v2, v3 */
/* if-gtz v2, :cond_1 */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->C:F */
/* sub-float v2, v1, v2 */
v2 = java.lang.Math .abs ( v2 );
/* iget v3, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->A:F */
/* cmpl-float v2, v2, v3 */
/* if-lez v2, :cond_2 */
} // :cond_1
(( com.doodlemobile.basket.util.e ) p1 ).a ( v5 ); // invoke-virtual {p1, v5}, Lcom/doodlemobile/basket/util/e;->a(I)V
/* invoke-super {p0, p1}, Lcom/doodlemobile/basket/ui/Panel;->a(Lcom/doodlemobile/basket/util/e;)Z */
(( com.doodlemobile.basket.util.e ) p1 ).a ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lcom/doodlemobile/basket/util/e;->a(FF)V
(( com.doodlemobile.basket.util.e ) p1 ).a ( v4 ); // invoke-virtual {p1, v4}, Lcom/doodlemobile/basket/util/e;->a(I)V
v0 = (( com.doodlemobile.basket.ui.VerticalScrollView ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lcom/doodlemobile/basket/ui/VerticalScrollView;->c(Lcom/doodlemobile/basket/util/e;)Z
} // :goto_0
} // :cond_2
v0 = this.r;
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = (( com.doodlemobile.basket.util.e ) p1 ).d ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->d()I
/* if-ne v0, v6, :cond_3 */
(( com.doodlemobile.basket.util.e ) p1 ).a ( v5 ); // invoke-virtual {p1, v5}, Lcom/doodlemobile/basket/util/e;->a(I)V
/* invoke-super {p0, p1}, Lcom/doodlemobile/basket/ui/Panel;->a(Lcom/doodlemobile/basket/util/e;)Z */
(( com.doodlemobile.basket.util.e ) p1 ).a ( v4 ); // invoke-virtual {p1, v4}, Lcom/doodlemobile/basket/util/e;->a(I)V
(( com.doodlemobile.basket.ui.VerticalScrollView ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lcom/doodlemobile/basket/ui/VerticalScrollView;->c(Lcom/doodlemobile/basket/util/e;)Z
(( com.doodlemobile.basket.util.e ) p1 ).a ( v6 ); // invoke-virtual {p1, v6}, Lcom/doodlemobile/basket/util/e;->a(I)V
(( com.doodlemobile.basket.ui.VerticalScrollView ) p0 ).c ( p1 ); // invoke-virtual {p0, p1}, Lcom/doodlemobile/basket/ui/VerticalScrollView;->c(Lcom/doodlemobile/basket/util/e;)Z
int v0 = 1; // const/4 v0, 0x1
} // :cond_3
v0 = /* invoke-super {p0, p1}, Lcom/doodlemobile/basket/ui/Panel;->a(Lcom/doodlemobile/basket/util/e;)Z */
} // .end method
protected final Float b ( Float p0, Float p1 ) {
/* .locals 3 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->j:F */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->l:F */
/* add-float/2addr v0, v1 */
/* const/high16 v1, 0x40000000 # 2.0f */
/* div-float/2addr v0, v1 */
/* sub-float v0, p1, v0 */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->k:F */
/* sub-float v1, p2, v1 */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->t:F */
/* add-float/2addr v1, v2 */
/* neg-float v0, v0 */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->f:F */
v2 = com.doodlemobile.basket.math.MathUtil .sin ( v2 );
/* mul-float/2addr v0, v2 */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->f:F */
v2 = com.doodlemobile.basket.math.MathUtil .cos ( v2 );
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
} // .end method
public final void b ( Object p0, com.doodlemobile.basket.math.MatrixStack p1 ) {
/* .locals 2 */
v0 = com.doodlemobile.basket.r.a;
/* const/16 v1, 0xc11 */
/* invoke-super {p0, p1, p2}, Lcom/doodlemobile/basket/ui/Panel;->b(Lcom/doodlemobile/basket/opengl/m;Lcom/doodlemobile/basket/math/MatrixStack;)V */
return;
} // .end method
protected final void b ( Object p0 ) {
/* .locals 3 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->j:F */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->l:F */
/* add-float/2addr v0, v1 */
/* const/high16 v1, -0x40000000 # -2.0f */
/* div-float/2addr v0, v1 */
/* iget v1, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->k:F */
/* neg-float v1, v1 */
/* iget v2, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->t:F */
/* add-float/2addr v1, v2 */
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
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->x:Z */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->t:F */
v1 = (( com.doodlemobile.basket.util.e ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->b()F
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->v:F */
(( com.doodlemobile.basket.util.e ) p1 ).c ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/util/e;->c()J
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->w:J */
/* :pswitch_1 */
/* invoke-direct {p0, p1}, Lcom/doodlemobile/basket/ui/VerticalScrollView;->d(Lcom/doodlemobile/basket/util/e;)V */
/* :pswitch_2 */
/* invoke-direct {p0, p1}, Lcom/doodlemobile/basket/ui/VerticalScrollView;->d(Lcom/doodlemobile/basket/util/e;)V */
/* iput-boolean v2, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->x:Z */
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
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->d:Z */
/* if-nez v0, :cond_0 */
/* move v0, v1 */
} // :goto_0
} // :cond_0
/* iget v0, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->j:F */
/* cmpl-float v0, p1, v0 */
/* if-ltz v0, :cond_1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->l:F */
/* cmpg-float v0, p1, v0 */
/* if-gtz v0, :cond_1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->k:F */
/* cmpl-float v0, p2, v0 */
/* if-ltz v0, :cond_1 */
/* iget v0, p0, Lcom/doodlemobile/basket/ui/VerticalScrollView;->m:F */
/* cmpg-float v0, p2, v0 */
/* if-gtz v0, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
/* move v0, v1 */
} // .end method

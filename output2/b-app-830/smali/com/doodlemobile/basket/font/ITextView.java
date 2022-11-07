public class com.doodlemobile.basket.font.ITextView extends com.doodlemobile.basket.ui.e implements com.doodlemobile.basket.b.e implements com.doodlemobile.basket.ui.a.o {
	 /* # interfaces */
	 /* # instance fields */
	 private Float A;
	 private Float B;
	 private Float C;
	 private Float D;
	 private com.doodlemobile.basket.font.c E;
	 private Float F;
	 private Float G;
	 private Float H;
	 private Float I;
	 private Float J;
	 private Float K;
	 private Float L;
	 private Float M;
	 private java.lang.String N;
	 private Boolean O;
	 private Boolean P;
	 private Float Q;
	 private Boolean R;
	 private Boolean S;
	 private com.doodlemobile.basket.util.a T;
	 private com.doodlemobile.basket.font.e a;
	 private Integer q;
	 private Integer r;
	 private Boolean s;
	 private Boolean t;
	 private Boolean u;
	 private com.doodlemobile.basket.font.a v;
	 private Float w;
	 private java.lang.String x;
	 private Float y;
	 private Long z;
	 /* # direct methods */
	 public com.doodlemobile.basket.font.ITextView ( ) {
		 /* .locals 9 */
		 int v8 = -1; // const/4 v8, -0x1
		 /* const/high16 v7, 0x437f0000 # 255.0f */
		 int v5 = 0; // const/4 v5, 0x0
		 /* const/high16 v4, 0x3f800000 # 1.0f */
		 int v6 = 0; // const/4 v6, 0x0
		 /* invoke-direct {p0, p1, p2}, Lcom/doodlemobile/basket/ui/e;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;)V */
		 /* iput-boolean v5, p0, Lcom/doodlemobile/basket/font/ITextView;->s:Z */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->y:F */
		 /* const-wide/16 v0, 0x0 */
		 /* iput-wide v0, p0, Lcom/doodlemobile/basket/font/ITextView;->z:J */
		 /* iput v4, p0, Lcom/doodlemobile/basket/font/ITextView;->A:F */
		 /* iput v4, p0, Lcom/doodlemobile/basket/font/ITextView;->B:F */
		 /* iput v4, p0, Lcom/doodlemobile/basket/font/ITextView;->C:F */
		 /* iput v4, p0, Lcom/doodlemobile/basket/font/ITextView;->D:F */
		 /* iput v4, p0, Lcom/doodlemobile/basket/font/ITextView;->H:F */
		 /* iput v4, p0, Lcom/doodlemobile/basket/font/ITextView;->J:F */
		 /* iput v4, p0, Lcom/doodlemobile/basket/font/ITextView;->K:F */
		 /* iput v4, p0, Lcom/doodlemobile/basket/font/ITextView;->L:F */
		 /* iput v4, p0, Lcom/doodlemobile/basket/font/ITextView;->M:F */
		 /* iput-boolean v5, p0, Lcom/doodlemobile/basket/font/ITextView;->O:Z */
		 /* iput-boolean v5, p0, Lcom/doodlemobile/basket/font/ITextView;->P:Z */
		 /* iput-boolean v5, p0, Lcom/doodlemobile/basket/font/ITextView;->R:Z */
		 /* iput-boolean v5, p0, Lcom/doodlemobile/basket/font/ITextView;->S:Z */
		 /* new-instance v0, Lcom/doodlemobile/basket/util/a; */
		 /* invoke-direct {v0}, Lcom/doodlemobile/basket/util/a;-><init>()V */
		 this.T = v0;
		 v0 = 		 final String v0 = "scale"; // const-string v0, "scale"
		 /* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->H:F */
		 /* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->w:F */
		 final String v0 = "text"; // const-string v0, "text"
		 this.x = v0;
		 v0 = 		 final String v0 = "text"; // const-string v0, "text"
		 /* if-eq v0, v8, :cond_0 */
		 this.x = v0;
	 } // :cond_0
	 final String v0 = "textSize"; // const-string v0, "textSize"
	 v0 = 	 /* const/16 v1, 0x12 */
	 /* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->q:I */
	 final String v0 = "textColor"; // const-string v0, "textColor"
	 v0 = 	 /* const/high16 v1, -0x1000000 */
	 /* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->r:I */
	 /* iget v0, p0, Lcom/doodlemobile/basket/font/ITextView;->r:I */
	 /* const/high16 v1, -0x1000000 */
	 /* and-int/2addr v1, v0 */
	 /* shr-int/lit8 v1, v1, 0x18 */
	 /* const/high16 v2, 0xff0000 */
	 /* and-int/2addr v2, v0 */
	 /* shr-int/lit8 v2, v2, 0x10 */
	 /* const v3, 0xff00 */
	 /* and-int/2addr v3, v0 */
	 /* shr-int/lit8 v3, v3, 0x8 */
	 /* and-int/lit16 v0, v0, 0xff */
	 /* if-ne v1, v8, :cond_1 */
	 /* const/16 v1, 0xff */
} // :cond_1
/* int-to-float v2, v2 */
/* mul-float/2addr v2, v4 */
/* div-float/2addr v2, v7 */
/* iput v2, p0, Lcom/doodlemobile/basket/font/ITextView;->A:F */
/* int-to-float v2, v3 */
/* mul-float/2addr v2, v4 */
/* div-float/2addr v2, v7 */
/* iput v2, p0, Lcom/doodlemobile/basket/font/ITextView;->B:F */
/* int-to-float v0, v0 */
/* mul-float/2addr v0, v4 */
/* div-float/2addr v0, v7 */
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->C:F */
/* int-to-float v0, v1 */
/* mul-float/2addr v0, v4 */
/* div-float/2addr v0, v7 */
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->D:F */
final String v0 = "red"; // const-string v0, "red"
v0 = /* iget v1, p0, Lcom/doodlemobile/basket/font/ITextView;->A:F */
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->J:F */
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->A:F */
final String v0 = "green"; // const-string v0, "green"
v0 = /* iget v1, p0, Lcom/doodlemobile/basket/font/ITextView;->B:F */
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->K:F */
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->B:F */
final String v0 = "blue"; // const-string v0, "blue"
v0 = /* iget v1, p0, Lcom/doodlemobile/basket/font/ITextView;->C:F */
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->L:F */
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->C:F */
final String v0 = "alpha"; // const-string v0, "alpha"
v0 = /* iget v1, p0, Lcom/doodlemobile/basket/font/ITextView;->D:F */
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->M:F */
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->D:F */
v0 = final String v0 = "marquee"; // const-string v0, "marquee"
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/font/ITextView;->O:Z */
v0 = final String v0 = "singleLine"; // const-string v0, "singleLine"
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/font/ITextView;->R:Z */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/font/ITextView;->O:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/font/ITextView;->R:Z */
} // :cond_2
v0 = final String v0 = "alignment"; // const-string v0, "alignment"
/* if-ne v0, v8, :cond_4 */
v0 = com.doodlemobile.basket.font.a.a;
this.v = v0;
} // :goto_0
v0 = final String v0 = "bold"; // const-string v0, "bold"
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/font/ITextView;->P:Z */
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/font/ITextView;->s:Z */
v0 = this.c;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->a:F */
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->F:F */
v0 = this.c;
/* iget v0, v0, Lcom/doodlemobile/basket/ui/b;->b:F */
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->G:F */
final String v0 = "fontPath"; // const-string v0, "fontPath"
/* iget v1, p0, Lcom/doodlemobile/basket/font/ITextView;->q:I */
/* iget-boolean v2, p0, Lcom/doodlemobile/basket/font/ITextView;->P:Z */
com.doodlemobile.basket.font.d .a ( p1,v1,v2,v0 );
this.a = v0;
v0 = this.x;
if ( v0 != null) { // if-eqz v0, :cond_7
/* iget v0, p0, Lcom/doodlemobile/basket/font/ITextView;->F:F */
int v1 = 0; // const/4 v1, 0x0
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_6 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/font/ITextView;->O:Z */
/* if-nez v0, :cond_6 */
/* new-instance v0, Lcom/doodlemobile/basket/font/c; */
v1 = this.x;
v2 = this.a;
v3 = this.v;
/* iget-boolean v4, p0, Lcom/doodlemobile/basket/font/ITextView;->R:Z */
/* invoke-direct {v0, v1, v2, v3, v4}, Lcom/doodlemobile/basket/font/c;-><init>(Ljava/lang/String;Lcom/doodlemobile/basket/font/e;Lcom/doodlemobile/basket/font/a;Z)V */
this.E = v0;
} // :goto_1
v0 = this.E;
v0 = (( com.doodlemobile.basket.font.c ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/font/c;->a()F
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->I:F */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/font/ITextView;->O:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
/* iget v0, p0, Lcom/doodlemobile/basket/font/ITextView;->I:F */
/* iget v1, p0, Lcom/doodlemobile/basket/font/ITextView;->F:F */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_3 */
v0 = com.doodlemobile.basket.font.a.a;
this.v = v0;
v0 = this.E;
v1 = this.v;
(( com.doodlemobile.basket.font.c ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/font/c;->a(Lcom/doodlemobile/basket/font/a;)V
} // :cond_3
final String v0 = "clip"; // const-string v0, "clip"
v0 = /* iget-boolean v1, p0, Lcom/doodlemobile/basket/font/ITextView;->O:Z */
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/font/ITextView;->S:Z */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/font/ITextView;->O:Z */
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/font/ITextView;->t:Z */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/font/ITextView;->R:Z */
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/font/ITextView;->u:Z */
return;
} // :cond_4
/* if-nez v0, :cond_5 */
v0 = com.doodlemobile.basket.font.a.b;
this.v = v0;
} // :cond_5
v0 = com.doodlemobile.basket.font.a.c;
this.v = v0;
/* goto/16 :goto_0 */
} // :cond_6
/* new-instance v0, Lcom/doodlemobile/basket/font/c; */
v1 = this.x;
v2 = this.a;
/* iget v3, p0, Lcom/doodlemobile/basket/font/ITextView;->F:F */
v4 = this.v;
/* iget-boolean v5, p0, Lcom/doodlemobile/basket/font/ITextView;->R:Z */
/* invoke-direct/range {v0 ..v5}, Lcom/doodlemobile/basket/font/c;-><init>(Ljava/lang/String;Lcom/doodlemobile/basket/font/e;FLcom/doodlemobile/basket/font/a;Z)V */
this.E = v0;
} // :cond_7
/* new-instance v0, Lcom/doodlemobile/basket/font/c; */
final String v1 = ""; // const-string v1, ""
v2 = this.a;
v3 = this.v;
/* invoke-direct {v0, v1, v2, v3}, Lcom/doodlemobile/basket/font/c;-><init>(Ljava/lang/String;Lcom/doodlemobile/basket/font/e;Lcom/doodlemobile/basket/font/a;)V */
this.E = v0;
v0 = this.E;
/* iget-boolean v1, p0, Lcom/doodlemobile/basket/font/ITextView;->R:Z */
(( com.doodlemobile.basket.font.c ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/font/c;->a(Z)V
} // .end method
private void d ( ) {
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
/* iget v0, p0, Lcom/doodlemobile/basket/font/ITextView;->y:F */
/* iget v1, p0, Lcom/doodlemobile/basket/font/ITextView;->I:F */
/* neg-float v1, v1 */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_0 */
/* iget v0, p0, Lcom/doodlemobile/basket/font/ITextView;->y:F */
/* iget v1, p0, Lcom/doodlemobile/basket/font/ITextView;->I:F */
/* const/high16 v2, 0x41f00000 # 30.0f */
/* iget v3, p0, Lcom/doodlemobile/basket/font/ITextView;->w:F */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->y:F */
} // :cond_0
v0 = this.i;
/* iget v1, p0, Lcom/doodlemobile/basket/font/ITextView;->y:F */
v1 = java.lang.Float .floatToIntBits ( v1 );
/* new-array v2, v4, [Ljava/lang/Byte; */
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
/* iput p1, p0, Lcom/doodlemobile/basket/font/ITextView;->A:F */
/* iput p2, p0, Lcom/doodlemobile/basket/font/ITextView;->B:F */
/* iput p3, p0, Lcom/doodlemobile/basket/font/ITextView;->C:F */
v0 = this.i;
int v1 = 4; // const/4 v1, 0x4
v2 = java.lang.Float .floatToIntBits ( p1 );
v0 = this.i;
int v1 = 5; // const/4 v1, 0x5
v2 = java.lang.Float .floatToIntBits ( p2 );
v0 = this.i;
int v1 = 6; // const/4 v1, 0x6
v2 = java.lang.Float .floatToIntBits ( p3 );
return;
} // .end method
public final void a ( Integer p0, Integer p1, java.lang.Object p2 ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
/* const/high16 v3, 0x3f000000 # 0.5f */
int v2 = 1; // const/4 v2, 0x1
/* packed-switch p1, :pswitch_data_0 */
/* :pswitch_0 */
/* invoke-super {p0, p1, p2, p3}, Lcom/doodlemobile/basket/ui/e;->a(IILjava/lang/Object;)V */
} // :cond_0
} // :goto_0
return;
/* :pswitch_1 */
if ( p3 != null) { // if-eqz p3, :cond_1
/* iget v0, p0, Lcom/doodlemobile/basket/font/ITextView;->Q:F */
v1 = java.lang.Float .intBitsToFloat ( p2 );
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->n:F */
} // :cond_1
/* invoke-super {p0, p1, p2, p3}, Lcom/doodlemobile/basket/ui/e;->a(IILjava/lang/Object;)V */
/* :pswitch_2 */
v0 = java.lang.Float .intBitsToFloat ( p2 );
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->J:F */
/* :pswitch_3 */
v0 = java.lang.Float .intBitsToFloat ( p2 );
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->K:F */
/* :pswitch_4 */
v0 = java.lang.Float .intBitsToFloat ( p2 );
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->L:F */
/* :pswitch_5 */
v0 = java.lang.Float .intBitsToFloat ( p2 );
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->M:F */
/* :pswitch_6 */
/* check-cast p3, Ljava/lang/String; */
this.N = p3;
v0 = this.N;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.E;
v1 = this.N;
(( com.doodlemobile.basket.font.c ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/font/c;->a(Ljava/lang/String;)V
v0 = this.E;
v0 = (( com.doodlemobile.basket.font.c ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/font/c;->a()F
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->I:F */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/font/ITextView;->O:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, p0, Lcom/doodlemobile/basket/font/ITextView;->I:F */
/* iget v1, p0, Lcom/doodlemobile/basket/font/ITextView;->F:F */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_0 */
v0 = com.doodlemobile.basket.font.a.b;
this.v = v0;
v0 = this.E;
v1 = com.doodlemobile.basket.font.a.b;
(( com.doodlemobile.basket.font.c ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/font/c;->a(Lcom/doodlemobile/basket/font/a;)V
/* :pswitch_7 */
v0 = java.lang.Float .intBitsToFloat ( p2 );
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->F:F */
/* iget v0, p0, Lcom/doodlemobile/basket/font/ITextView;->F:F */
int v1 = 0; // const/4 v1, 0x0
/* cmpl-float v0, v0, v1 */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.E;
/* iget v1, p0, Lcom/doodlemobile/basket/font/ITextView;->F:F */
(( com.doodlemobile.basket.font.c ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/font/c;->a(F)V
/* :pswitch_8 */
v0 = java.lang.Float .intBitsToFloat ( p2 );
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->G:F */
/* :pswitch_9 */
v0 = java.lang.Float .intBitsToFloat ( p2 );
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->Q:F */
/* :pswitch_a */
/* check-cast p3, [Z */
/* aget-boolean v0, p3, v0 */
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/font/ITextView;->R:Z */
v0 = this.E;
/* iget-boolean v1, p0, Lcom/doodlemobile/basket/font/ITextView;->R:Z */
(( com.doodlemobile.basket.font.c ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/font/c;->a(Z)V
v0 = this.E;
v0 = (( com.doodlemobile.basket.font.c ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/font/c;->a()F
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->I:F */
/* goto/16 :goto_0 */
/* :pswitch_b */
v0 = java.lang.Float .intBitsToFloat ( p2 );
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->H:F */
/* goto/16 :goto_0 */
/* :pswitch_c */
/* check-cast p3, [Z */
/* aget-boolean v0, p3, v0 */
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/font/ITextView;->O:Z */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/font/ITextView;->O:Z */
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/font/ITextView;->S:Z */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/font/ITextView;->O:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* iput-boolean v2, p0, Lcom/doodlemobile/basket/font/ITextView;->R:Z */
v0 = this.E;
(( com.doodlemobile.basket.font.c ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Lcom/doodlemobile/basket/font/c;->a(Z)V
} // :cond_2
v0 = this.E;
v0 = (( com.doodlemobile.basket.font.c ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/font/c;->a()F
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->I:F */
/* goto/16 :goto_0 */
/* :pswitch_d */
v0 = this.E;
/* check-cast p3, Lcom/doodlemobile/basket/font/a; */
(( com.doodlemobile.basket.font.c ) v0 ).a ( p3 ); // invoke-virtual {v0, p3}, Lcom/doodlemobile/basket/font/c;->a(Lcom/doodlemobile/basket/font/a;)V
/* goto/16 :goto_0 */
/* :pswitch_e */
v0 = this.E;
(( com.doodlemobile.basket.font.c ) v0 ).a ( p2 ); // invoke-virtual {v0, p2}, Lcom/doodlemobile/basket/font/c;->a(I)V
v0 = this.E;
v0 = (( com.doodlemobile.basket.font.c ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/font/c;->a()F
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->I:F */
/* goto/16 :goto_0 */
/* :pswitch_f */
v0 = this.E;
/* check-cast p3, Lcom/doodlemobile/basket/font/e; */
v1 = this.a;
/* if-eq v1, p3, :cond_0 */
this.a = p3;
/* iput-boolean v2, v0, Lcom/doodlemobile/basket/font/c;->b:Z */
/* goto/16 :goto_0 */
/* :pswitch_10 */
v0 = this.T;
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
/* goto/16 :goto_0 */
/* :pswitch_11 */
v0 = this.T;
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
/* goto/16 :goto_0 */
/* :pswitch_12 */
v0 = this.T;
v1 = java.lang.Float .intBitsToFloat ( p2 );
v2 = v2 = this.i;
/* int-to-float v2, v2 */
/* mul-float/2addr v1, v2 */
/* div-float/2addr v1, v2 */
/* float-to-int v1, v1 */
/* iput v1, v0, Lcom/doodlemobile/basket/util/a;->c:I */
/* goto/16 :goto_0 */
/* :pswitch_13 */
v0 = this.T;
v1 = java.lang.Float .intBitsToFloat ( p2 );
v2 = v2 = this.i;
/* int-to-float v2, v2 */
/* mul-float/2addr v1, v2 */
/* div-float/2addr v1, v2 */
/* float-to-int v1, v1 */
/* iput v1, v0, Lcom/doodlemobile/basket/util/a;->d:I */
/* goto/16 :goto_0 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_4 */
/* :pswitch_5 */
/* :pswitch_6 */
/* :pswitch_7 */
/* :pswitch_8 */
/* :pswitch_9 */
/* :pswitch_a */
/* :pswitch_b */
/* :pswitch_c */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_d */
/* :pswitch_0 */
/* :pswitch_e */
/* :pswitch_f */
/* :pswitch_10 */
/* :pswitch_11 */
/* :pswitch_12 */
/* :pswitch_13 */
} // .end packed-switch
} // .end method
public final void a ( Long p0 ) {
/* .locals 8 */
int v7 = 0; // const/4 v7, 0x0
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/font/ITextView;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/font/ITextView;->t:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, p0, Lcom/doodlemobile/basket/font/ITextView;->I:F */
/* iget v1, p0, Lcom/doodlemobile/basket/font/ITextView;->F:F */
/* cmpg-float v0, v0, v1 */
/* if-gtz v0, :cond_1 */
} // :cond_0
} // :goto_0
return;
} // :cond_1
/* invoke-super {p0, p1, p2}, Lcom/doodlemobile/basket/ui/e;->a(J)V */
/* iget-wide v0, p0, Lcom/doodlemobile/basket/font/ITextView;->z:J */
/* add-long/2addr v0, p1 */
/* iput-wide v0, p0, Lcom/doodlemobile/basket/font/ITextView;->z:J */
/* iget-wide v0, p0, Lcom/doodlemobile/basket/font/ITextView;->z:J */
/* const-wide/32 v2, 0x7a120 */
/* cmp-long v0, v0, v2 */
/* if-lez v0, :cond_2 */
/* iget-wide v0, p0, Lcom/doodlemobile/basket/font/ITextView;->z:J */
/* const-wide/32 v2, 0x75300 */
/* sub-long/2addr v0, v2 */
/* iput-wide v0, p0, Lcom/doodlemobile/basket/font/ITextView;->z:J */
} // :cond_2
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/font/ITextView;->t:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
/* iget-wide v0, p0, Lcom/doodlemobile/basket/font/ITextView;->z:J */
/* const-wide/16 v2, 0x7d0 */
/* cmp-long v0, v0, v2 */
/* if-lez v0, :cond_3 */
/* iget v0, p0, Lcom/doodlemobile/basket/font/ITextView;->y:F */
/* const/high16 v1, 0x3f000000 # 0.5f */
/* sub-float/2addr v0, v1 */
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->y:F */
/* invoke-direct {p0}, Lcom/doodlemobile/basket/font/ITextView;->d()V */
} // :cond_3
v0 = this.b;
/* iget v1, p0, Lcom/doodlemobile/basket/font/ITextView;->j:F */
/* iget v2, p0, Lcom/doodlemobile/basket/font/ITextView;->k:F */
v0 = (( com.doodlemobile.basket.ui.UIViewGroup ) v0 ).c ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/doodlemobile/basket/ui/UIViewGroup;->c(FF)F
v1 = this.b;
/* iget v2, p0, Lcom/doodlemobile/basket/font/ITextView;->j:F */
/* iget v3, p0, Lcom/doodlemobile/basket/font/ITextView;->k:F */
v1 = (( com.doodlemobile.basket.ui.UIViewGroup ) v1 ).d ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/doodlemobile/basket/ui/UIViewGroup;->d(FF)F
v2 = this.b;
/* iget v3, p0, Lcom/doodlemobile/basket/font/ITextView;->l:F */
/* iget v4, p0, Lcom/doodlemobile/basket/font/ITextView;->m:F */
v2 = (( com.doodlemobile.basket.ui.UIViewGroup ) v2 ).c ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lcom/doodlemobile/basket/ui/UIViewGroup;->c(FF)F
v3 = this.b;
/* iget v4, p0, Lcom/doodlemobile/basket/font/ITextView;->l:F */
/* iget v5, p0, Lcom/doodlemobile/basket/font/ITextView;->m:F */
v3 = (( com.doodlemobile.basket.ui.UIViewGroup ) v3 ).d ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Lcom/doodlemobile/basket/ui/UIViewGroup;->d(FF)F
v4 = this.i;
/* const/16 v5, 0x15 */
v6 = java.lang.Float .floatToIntBits ( v0 );
v4 = this.i;
/* const/16 v5, 0x16 */
v6 = java.lang.Float .floatToIntBits ( v3 );
v4 = this.i;
/* const/16 v5, 0x17 */
/* sub-float v0, v2, v0 */
v0 = java.lang.Float .floatToIntBits ( v0 );
v0 = this.i;
/* const/16 v2, 0x18 */
/* sub-float/2addr v1, v3 */
v1 = java.lang.Float .floatToIntBits ( v1 );
/* goto/16 :goto_0 */
} // .end method
public final void a ( Object p0 ) {
/* .locals 1 */
v0 = this.a;
(( com.doodlemobile.basket.font.e ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/doodlemobile/basket/font/e;->a(Lcom/doodlemobile/basket/opengl/m;)V
return;
} // .end method
public final void a ( Object p0, com.doodlemobile.basket.math.MatrixStack p1 ) {
/* .locals 2 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/font/ITextView;->O:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, p0, Lcom/doodlemobile/basket/font/ITextView;->I:F */
/* iget v1, p0, Lcom/doodlemobile/basket/font/ITextView;->F:F */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_0 */
v0 = this.T;
com.doodlemobile.basket.graphics.c .a ( v0 );
} // :cond_0
/* invoke-super {p0, p1, p2}, Lcom/doodlemobile/basket/ui/e;->a(Lcom/doodlemobile/basket/opengl/m;Lcom/doodlemobile/basket/math/MatrixStack;)V */
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/font/ITextView;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
com.doodlemobile.basket.e .a ( p1,p0 );
/* invoke-super {p0, p1}, Lcom/doodlemobile/basket/ui/e;->a(Lcom/doodlemobile/basket/p;)V */
(( com.doodlemobile.basket.p ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Lcom/doodlemobile/basket/p;->a(Lcom/doodlemobile/basket/b/e;)V
com.doodlemobile.basket.e .b ( p1,p0 );
} // :cond_0
return;
} // .end method
protected final void a ( Boolean p0, Float p1, Float p2, Float p3, Float p4 ) {
/* .locals 9 */
/* const/high16 v2, 0x40000000 # 2.0f */
int v8 = 0; // const/4 v8, 0x0
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
/* sub-float v2, p4, p2 */
/* iput v2, p0, Lcom/doodlemobile/basket/font/ITextView;->F:F */
v2 = this.i;
int v3 = 0; // const/4 v3, 0x0
v4 = java.lang.Float .floatToIntBits ( v0 );
v2 = this.i;
int v3 = 1; // const/4 v3, 0x1
v1 = java.lang.Float .floatToIntBits ( v1 );
v1 = this.i;
/* const/16 v2, 0x9 */
/* sub-float v3, p4, p2 */
v3 = java.lang.Float .floatToIntBits ( v3 );
v1 = this.i;
/* const/16 v2, 0xa */
/* sub-float v3, p5, p3 */
v3 = java.lang.Float .floatToIntBits ( v3 );
v1 = this.b;
v1 = (( com.doodlemobile.basket.ui.UIViewGroup ) v1 ).c ( p2, p3 ); // invoke-virtual {v1, p2, p3}, Lcom/doodlemobile/basket/ui/UIViewGroup;->c(FF)F
v2 = this.b;
v2 = (( com.doodlemobile.basket.ui.UIViewGroup ) v2 ).d ( p2, p3 ); // invoke-virtual {v2, p2, p3}, Lcom/doodlemobile/basket/ui/UIViewGroup;->d(FF)F
v3 = this.b;
v3 = (( com.doodlemobile.basket.ui.UIViewGroup ) v3 ).c ( p4, p5 ); // invoke-virtual {v3, p4, p5}, Lcom/doodlemobile/basket/ui/UIViewGroup;->c(FF)F
v4 = this.b;
v4 = (( com.doodlemobile.basket.ui.UIViewGroup ) v4 ).d ( p4, p5 ); // invoke-virtual {v4, p4, p5}, Lcom/doodlemobile/basket/ui/UIViewGroup;->d(FF)F
v5 = this.i;
/* const/16 v6, 0x15 */
v7 = java.lang.Float .floatToIntBits ( v1 );
v5 = this.i;
/* const/16 v6, 0x16 */
v7 = java.lang.Float .floatToIntBits ( v4 );
v5 = this.i;
/* const/16 v6, 0x17 */
/* sub-float v1, v3, v1 */
v1 = java.lang.Float .floatToIntBits ( v1 );
v1 = this.i;
/* const/16 v3, 0x18 */
/* sub-float/2addr v2, v4 */
v2 = java.lang.Float .floatToIntBits ( v2 );
v1 = this.i;
/* const/16 v2, 0xb */
v0 = java.lang.Float .floatToIntBits ( v0 );
} // :cond_0
return;
} // .end method
public final void b ( Object p0, com.doodlemobile.basket.math.MatrixStack p1 ) {
/* .locals 2 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/font/ITextView;->O:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, p0, Lcom/doodlemobile/basket/font/ITextView;->I:F */
/* iget v1, p0, Lcom/doodlemobile/basket/font/ITextView;->F:F */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_0 */
com.doodlemobile.basket.graphics.c .a ( );
} // :cond_0
/* invoke-super {p0, p1, p2}, Lcom/doodlemobile/basket/ui/e;->b(Lcom/doodlemobile/basket/opengl/m;Lcom/doodlemobile/basket/math/MatrixStack;)V */
return;
} // .end method
public final void b ( java.lang.String p0 ) {
/* .locals 3 */
this.x = p1;
v0 = this.i;
/* const/16 v1, 0x8 */
int v2 = 0; // const/4 v2, 0x0
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/doodlemobile/basket/font/ITextView;->y:F */
/* invoke-direct {p0}, Lcom/doodlemobile/basket/font/ITextView;->d()V */
return;
} // .end method
public final void c ( ) {
/* .locals 1 */
/* invoke-super {p0}, Lcom/doodlemobile/basket/ui/e;->c()V */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
(( com.doodlemobile.basket.font.e ) v0 ).j ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/font/e;->j()V
} // :cond_0
return;
} // .end method
public final void c ( Float p0 ) {
/* .locals 4 */
/* iput p1, p0, Lcom/doodlemobile/basket/font/ITextView;->D:F */
v0 = this.i;
int v1 = 7; // const/4 v1, 0x7
v2 = java.lang.Float .floatToIntBits ( p1 );
int v3 = 0; // const/4 v3, 0x0
return;
} // .end method
public final void c ( Object p0, com.doodlemobile.basket.math.MatrixStack p1 ) {
/* .locals 6 */
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).b ( ); // invoke-virtual {p2}, Lcom/doodlemobile/basket/math/MatrixStack;->b()V
/* iget v0, p0, Lcom/doodlemobile/basket/font/ITextView;->H:F */
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).b ( v0 ); // invoke-virtual {p2, v0}, Lcom/doodlemobile/basket/math/MatrixStack;->b(F)V
v0 = this.E;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.E;
/* iget v1, p0, Lcom/doodlemobile/basket/font/ITextView;->J:F */
/* iget v2, p0, Lcom/doodlemobile/basket/font/ITextView;->M:F */
/* mul-float/2addr v2, v1 */
/* iget v1, p0, Lcom/doodlemobile/basket/font/ITextView;->K:F */
/* iget v3, p0, Lcom/doodlemobile/basket/font/ITextView;->M:F */
/* mul-float/2addr v3, v1 */
/* iget v1, p0, Lcom/doodlemobile/basket/font/ITextView;->L:F */
/* iget v4, p0, Lcom/doodlemobile/basket/font/ITextView;->M:F */
/* mul-float/2addr v4, v1 */
/* iget v5, p0, Lcom/doodlemobile/basket/font/ITextView;->M:F */
/* move-object v1, p2 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodlemobile/basket/font/c;->a(Lcom/doodlemobile/basket/math/MatrixStack;FFFF)V */
} // :cond_0
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/font/ITextView;->O:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* iget v0, p0, Lcom/doodlemobile/basket/font/ITextView;->I:F */
/* iget v1, p0, Lcom/doodlemobile/basket/font/ITextView;->F:F */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_1 */
/* iget v0, p0, Lcom/doodlemobile/basket/font/ITextView;->I:F */
/* const/high16 v1, 0x41f00000 # 30.0f */
/* iget v2, p0, Lcom/doodlemobile/basket/font/ITextView;->H:F */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
int v1 = 0; // const/4 v1, 0x0
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).a ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Lcom/doodlemobile/basket/math/MatrixStack;->a(FF)V
v0 = this.E;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.E;
/* iget v1, p0, Lcom/doodlemobile/basket/font/ITextView;->J:F */
/* iget v2, p0, Lcom/doodlemobile/basket/font/ITextView;->M:F */
/* mul-float/2addr v2, v1 */
/* iget v1, p0, Lcom/doodlemobile/basket/font/ITextView;->K:F */
/* iget v3, p0, Lcom/doodlemobile/basket/font/ITextView;->M:F */
/* mul-float/2addr v3, v1 */
/* iget v1, p0, Lcom/doodlemobile/basket/font/ITextView;->L:F */
/* iget v4, p0, Lcom/doodlemobile/basket/font/ITextView;->M:F */
/* mul-float/2addr v4, v1 */
/* iget v5, p0, Lcom/doodlemobile/basket/font/ITextView;->M:F */
/* move-object v1, p2 */
/* invoke-virtual/range {v0 ..v5}, Lcom/doodlemobile/basket/font/c;->a(Lcom/doodlemobile/basket/math/MatrixStack;FFFF)V */
} // :cond_1
(( com.doodlemobile.basket.math.MatrixStack ) p2 ).c ( ); // invoke-virtual {p2}, Lcom/doodlemobile/basket/math/MatrixStack;->c()V
return;
} // .end method
public final Float l ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/font/ITextView;->A:F */
} // .end method
public final Float m ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/font/ITextView;->B:F */
} // .end method
public final Float n ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/font/ITextView;->C:F */
} // .end method
public final Float o ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/font/ITextView;->D:F */
} // .end method

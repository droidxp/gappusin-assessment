public class com.doodlemobile.basket.ui.ProgressBarView extends com.doodlemobile.basket.ui.e implements com.doodlemobile.basket.b.e {
	 /* # interfaces */
	 /* # instance fields */
	 private com.doodlemobile.basket.graphics.e a;
	 private com.doodlemobile.basket.graphics.e q;
	 private com.doodlemobile.basket.graphics.e r;
	 private com.doodlemobile.basket.b.b s;
	 private Integer t;
	 private Integer u;
	 /* # direct methods */
	 public com.doodlemobile.basket.ui.ProgressBarView ( ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 int v1 = -1; // const/4 v1, -0x1
		 /* invoke-direct {p0, p1, p2}, Lcom/doodlemobile/basket/ui/e;-><init>(Lcom/doodlemobile/basket/b/b;Landroid/util/AttributeSet;)V */
		 /* const/16 v0, 0x32 */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/ProgressBarView;->t:I */
		 /* const/16 v0, 0x64 */
		 /* iput v0, p0, Lcom/doodlemobile/basket/ui/ProgressBarView;->u:I */
		 this.s = p1;
		 v0 = 		 final String v0 = "background_one"; // const-string v0, "background_one"
		 /* if-eq v0, v1, :cond_0 */
		 com.doodlemobile.basket.graphics.e .a ( p1,v0 );
		 this.a = v0;
	 } // :cond_0
	 v0 = 	 final String v0 = "background_two"; // const-string v0, "background_two"
	 /* if-eq v0, v1, :cond_1 */
	 com.doodlemobile.basket.graphics.e .a ( p1,v0 );
	 this.q = v0;
} // :cond_1
v0 = final String v0 = "background_three"; // const-string v0, "background_three"
/* if-eq v0, v1, :cond_2 */
com.doodlemobile.basket.graphics.e .a ( p1,v0 );
this.r = v0;
} // :cond_2
return;
} // .end method
/* # virtual methods */
public final void a ( ) {
/* .locals 0 */
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/ui/ProgressBarView;->d:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
com.doodlemobile.basket.e .a ( p1,p0 );
/* invoke-super {p0, p1}, Lcom/doodlemobile/basket/ui/e;->a(Lcom/doodlemobile/basket/p;)V */
(( com.doodlemobile.basket.p ) p1 ).a ( p0 ); // invoke-virtual {p1, p0}, Lcom/doodlemobile/basket/p;->a(Lcom/doodlemobile/basket/b/e;)V
com.doodlemobile.basket.e .b ( p1,p0 );
} // :cond_0
return;
} // .end method
public final void c ( Object p0, com.doodlemobile.basket.math.MatrixStack p1 ) {
/* .locals 15 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* invoke-virtual/range {p2 ..p2}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J */
/* move-result-wide v0 */
v2 = this.a;
v2 = (( com.doodlemobile.basket.graphics.e ) v2 ).o ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/graphics/e;->o()I
/* const/high16 v3, 0x3f800000 # 1.0f */
/* const/high16 v4, 0x3f800000 # 1.0f */
/* const/high16 v5, 0x3f800000 # 1.0f */
/* const/high16 v6, 0x3f800000 # 1.0f */
/* const/high16 v7, -0x41000000 # -0.5f */
v8 = this.a;
v8 = (( com.doodlemobile.basket.graphics.e ) v8 ).j ( ); // invoke-virtual {v8}, Lcom/doodlemobile/basket/graphics/e;->j()I
/* int-to-float v8, v8 */
/* mul-float/2addr v7, v8 */
/* const/high16 v8, -0x41000000 # -0.5f */
v9 = this.a;
v9 = (( com.doodlemobile.basket.graphics.e ) v9 ).k ( ); // invoke-virtual {v9}, Lcom/doodlemobile/basket/graphics/e;->k()I
/* int-to-float v9, v9 */
/* mul-float/2addr v8, v9 */
v9 = this.a;
v9 = (( com.doodlemobile.basket.graphics.e ) v9 ).j ( ); // invoke-virtual {v9}, Lcom/doodlemobile/basket/graphics/e;->j()I
/* int-to-float v9, v9 */
v10 = this.a;
v10 = (( com.doodlemobile.basket.graphics.e ) v10 ).k ( ); // invoke-virtual {v10}, Lcom/doodlemobile/basket/graphics/e;->k()I
/* int-to-float v10, v10 */
int v11 = 0; // const/4 v11, 0x0
int v12 = 0; // const/4 v12, 0x0
v13 = this.a;
v13 = (( com.doodlemobile.basket.graphics.e ) v13 ).l ( ); // invoke-virtual {v13}, Lcom/doodlemobile/basket/graphics/e;->l()F
v14 = this.a;
v14 = (( com.doodlemobile.basket.graphics.e ) v14 ).m ( ); // invoke-virtual {v14}, Lcom/doodlemobile/basket/graphics/e;->m()F
/* invoke-static/range {v0 ..v14}, Lcom/doodlemobile/basket/util/Util;->nativeRenderRect1(JIFFFFFFFFFFFF)V */
} // :cond_0
/* invoke-virtual/range {p2 ..p2}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J */
/* move-result-wide v0 */
v2 = this.q;
v2 = (( com.doodlemobile.basket.graphics.e ) v2 ).o ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/graphics/e;->o()I
/* const/high16 v3, 0x3f800000 # 1.0f */
/* const/high16 v4, 0x3f800000 # 1.0f */
/* const/high16 v5, 0x3f800000 # 1.0f */
/* const/high16 v6, 0x3f800000 # 1.0f */
/* const/high16 v7, -0x41000000 # -0.5f */
v8 = this.q;
v8 = (( com.doodlemobile.basket.graphics.e ) v8 ).j ( ); // invoke-virtual {v8}, Lcom/doodlemobile/basket/graphics/e;->j()I
/* int-to-float v8, v8 */
/* mul-float/2addr v7, v8 */
/* const/high16 v8, -0x41000000 # -0.5f */
v9 = this.q;
v9 = (( com.doodlemobile.basket.graphics.e ) v9 ).k ( ); // invoke-virtual {v9}, Lcom/doodlemobile/basket/graphics/e;->k()I
/* int-to-float v9, v9 */
/* mul-float/2addr v8, v9 */
v9 = this.q;
v9 = (( com.doodlemobile.basket.graphics.e ) v9 ).j ( ); // invoke-virtual {v9}, Lcom/doodlemobile/basket/graphics/e;->j()I
/* int-to-float v9, v9 */
v10 = this.q;
v10 = (( com.doodlemobile.basket.graphics.e ) v10 ).k ( ); // invoke-virtual {v10}, Lcom/doodlemobile/basket/graphics/e;->k()I
/* int-to-float v10, v10 */
int v11 = 0; // const/4 v11, 0x0
int v12 = 0; // const/4 v12, 0x0
v13 = this.q;
v13 = (( com.doodlemobile.basket.graphics.e ) v13 ).l ( ); // invoke-virtual {v13}, Lcom/doodlemobile/basket/graphics/e;->l()F
v14 = this.q;
v14 = (( com.doodlemobile.basket.graphics.e ) v14 ).m ( ); // invoke-virtual {v14}, Lcom/doodlemobile/basket/graphics/e;->m()F
/* invoke-static/range {v0 ..v14}, Lcom/doodlemobile/basket/util/Util;->nativeRenderRect1(JIFFFFFFFFFFFF)V */
/* invoke-virtual/range {p2 ..p2}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J */
/* move-result-wide v0 */
v2 = this.r;
v2 = (( com.doodlemobile.basket.graphics.e ) v2 ).o ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/graphics/e;->o()I
/* const/high16 v3, 0x3f800000 # 1.0f */
/* const/high16 v4, 0x3f800000 # 1.0f */
/* const/high16 v5, 0x3f800000 # 1.0f */
/* const/high16 v6, 0x3f800000 # 1.0f */
/* const/high16 v7, -0x41000000 # -0.5f */
v8 = this.q;
v8 = (( com.doodlemobile.basket.graphics.e ) v8 ).j ( ); // invoke-virtual {v8}, Lcom/doodlemobile/basket/graphics/e;->j()I
/* int-to-float v8, v8 */
/* mul-float/2addr v7, v8 */
/* const/high16 v8, -0x41000000 # -0.5f */
v9 = this.q;
v9 = (( com.doodlemobile.basket.graphics.e ) v9 ).k ( ); // invoke-virtual {v9}, Lcom/doodlemobile/basket/graphics/e;->k()I
/* int-to-float v9, v9 */
/* mul-float/2addr v8, v9 */
v9 = this.r;
v9 = (( com.doodlemobile.basket.graphics.e ) v9 ).j ( ); // invoke-virtual {v9}, Lcom/doodlemobile/basket/graphics/e;->j()I
/* mul-int/lit8 v9, v9, 0xa */
/* int-to-float v9, v9 */
v10 = this.q;
v10 = (( com.doodlemobile.basket.graphics.e ) v10 ).k ( ); // invoke-virtual {v10}, Lcom/doodlemobile/basket/graphics/e;->k()I
/* int-to-float v10, v10 */
int v11 = 0; // const/4 v11, 0x0
int v12 = 0; // const/4 v12, 0x0
v13 = this.r;
v13 = (( com.doodlemobile.basket.graphics.e ) v13 ).l ( ); // invoke-virtual {v13}, Lcom/doodlemobile/basket/graphics/e;->l()F
v14 = this.r;
v14 = (( com.doodlemobile.basket.graphics.e ) v14 ).m ( ); // invoke-virtual {v14}, Lcom/doodlemobile/basket/graphics/e;->m()F
/* invoke-static/range {v0 ..v14}, Lcom/doodlemobile/basket/util/Util;->nativeRenderRect1(JIFFFFFFFFFFFF)V */
return;
} // .end method

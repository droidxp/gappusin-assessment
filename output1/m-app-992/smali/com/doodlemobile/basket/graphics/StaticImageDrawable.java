public class com.doodlemobile.basket.graphics.StaticImageDrawable implements com.doodlemobile.basket.graphics.b {
	 /* # interfaces */
	 /* # instance fields */
	 private com.doodlemobile.basket.graphics.e a;
	 /* # direct methods */
	 public com.doodlemobile.basket.graphics.StaticImageDrawable ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public com.doodlemobile.basket.graphics.StaticImageDrawable ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.a = p1;
		 return;
	 } // .end method
	 protected static native void nativeRender ( Integer p0, Long p1, Float p2, Float p3, Float p4, Float p5 ) {
	 } // .end method
	 /* # virtual methods */
	 public final void a ( Object p0 ) {
		 /* .locals 0 */
		 this.a = p1;
		 return;
	 } // .end method
	 public final void a ( com.doodlemobile.basket.math.MatrixStack p0, Float p1, Float p2, Float p3, Float p4, Float p5, Float p6 ) {
		 /* .locals 18 */
		 /* move-object/from16 v0, p0 */
		 v0 = this.a;
		 /* move-object v1, v0 */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* move-object/from16 v0, p0 */
			 v0 = this.a;
			 /* move-object v1, v0 */
			 /* iget-boolean v1, v1, Lcom/doodlemobile/basket/graphics/e;->l:Z */
			 /* if-nez v1, :cond_1 */
			 /* invoke-virtual/range {p1 ..p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J */
			 /* move-result-wide v1 */
			 /* move-object/from16 v0, p0 */
			 v0 = this.a;
			 /* move-object v3, v0 */
			 v3 = 			 (( com.doodlemobile.basket.graphics.e ) v3 ).o ( ); // invoke-virtual {v3}, Lcom/doodlemobile/basket/graphics/e;->o()I
			 /* const/high16 v8, -0x41000000 # -0.5f */
			 /* const/high16 v9, -0x41000000 # -0.5f */
			 /* const/high16 v10, 0x3f800000 # 1.0f */
			 /* const/high16 v11, 0x3f800000 # 1.0f */
			 int v12 = 0; // const/4 v12, 0x0
			 int v13 = 0; // const/4 v13, 0x0
			 /* move-object/from16 v0, p0 */
			 v0 = this.a;
			 /* move-object v4, v0 */
			 v14 = 			 (( com.doodlemobile.basket.graphics.e ) v4 ).l ( ); // invoke-virtual {v4}, Lcom/doodlemobile/basket/graphics/e;->l()F
			 /* move-object/from16 v0, p0 */
			 v0 = this.a;
			 /* move-object v4, v0 */
			 v15 = 			 (( com.doodlemobile.basket.graphics.e ) v4 ).m ( ); // invoke-virtual {v4}, Lcom/doodlemobile/basket/graphics/e;->m()F
			 /* move/from16 v4, p4 */
			 /* move/from16 v5, p5 */
			 /* move/from16 v6, p6 */
			 /* move/from16 v7, p7 */
			 /* invoke-static/range {v1 ..v15}, Lcom/doodlemobile/basket/util/Util;->nativeRenderRect1(JIFFFFFFFFFFFF)V */
		 } // :cond_0
	 } // :goto_0
	 return;
} // :cond_1
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v1, v0 */
v1 = this.q;
int v2 = 0; // const/4 v2, 0x0
/* aget-object v1, v1, v2 */
int v2 = 2; // const/4 v2, 0x2
/* aget v1, v1, v2 */
/* sub-float v1, p2, v1 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v2, v0 */
v2 = this.q;
int v3 = 2; // const/4 v3, 0x2
/* aget-object v2, v2, v3 */
int v3 = 2; // const/4 v3, 0x2
/* aget v2, v2, v3 */
/* sub-float v16, v1, v2 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v1, v0 */
v1 = this.q;
int v2 = 0; // const/4 v2, 0x0
/* aget-object v1, v1, v2 */
int v2 = 3; // const/4 v2, 0x3
/* aget v1, v1, v2 */
/* sub-float v1, p3, v1 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v2, v0 */
v2 = this.q;
/* const/16 v3, 0x8 */
/* aget-object v2, v2, v3 */
int v3 = 3; // const/4 v3, 0x3
/* aget v2, v2, v3 */
/* sub-float v17, v1, v2 */
/* invoke-virtual/range {p1 ..p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J */
/* move-result-wide v1 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v3, v0 */
v3 = (( com.doodlemobile.basket.graphics.e ) v3 ).o ( ); // invoke-virtual {v3}, Lcom/doodlemobile/basket/graphics/e;->o()I
/* const/high16 v8, -0x41000000 # -0.5f */
/* const/high16 v9, -0x41000000 # -0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 0; // const/4 v5, 0x0
/* aget-object v4, v4, v5 */
int v5 = 2; // const/4 v5, 0x2
/* aget v4, v4, v5 */
/* div-float v10, v4, p2 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 0; // const/4 v5, 0x0
/* aget-object v4, v4, v5 */
int v5 = 3; // const/4 v5, 0x3
/* aget v4, v4, v5 */
/* div-float v11, v4, p3 */
int v12 = 0; // const/4 v12, 0x0
int v13 = 0; // const/4 v13, 0x0
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 0; // const/4 v5, 0x0
/* aget-object v4, v4, v5 */
int v5 = 2; // const/4 v5, 0x2
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).b ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v5, v5 */
/* div-float v14, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 0; // const/4 v5, 0x0
/* aget-object v4, v4, v5 */
int v5 = 3; // const/4 v5, 0x3
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).i ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->i()I
/* int-to-float v5, v5 */
/* div-float v15, v4, v5 */
/* move/from16 v4, p4 */
/* move/from16 v5, p5 */
/* move/from16 v6, p6 */
/* move/from16 v7, p7 */
/* invoke-static/range {v1 ..v15}, Lcom/doodlemobile/basket/util/Util;->nativeRenderRect1(JIFFFFFFFFFFFF)V */
/* invoke-virtual/range {p1 ..p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J */
/* move-result-wide v1 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v3, v0 */
v3 = (( com.doodlemobile.basket.graphics.e ) v3 ).o ( ); // invoke-virtual {v3}, Lcom/doodlemobile/basket/graphics/e;->o()I
/* const/high16 v4, -0x41000000 # -0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = this.q;
int v6 = 1; // const/4 v6, 0x1
/* aget-object v5, v5, v6 */
int v6 = 0; // const/4 v6, 0x0
/* aget v5, v5, v6 */
/* div-float v5, v5, p2 */
/* add-float v8, v4, v5 */
/* const/high16 v9, -0x41000000 # -0.5f */
/* div-float v10, v16, p2 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 1; // const/4 v5, 0x1
/* aget-object v4, v4, v5 */
int v5 = 3; // const/4 v5, 0x3
/* aget v4, v4, v5 */
/* div-float v11, v4, p3 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 1; // const/4 v5, 0x1
/* aget-object v4, v4, v5 */
int v5 = 0; // const/4 v5, 0x0
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).b ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v5, v5 */
/* div-float v12, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 1; // const/4 v5, 0x1
/* aget-object v4, v4, v5 */
int v5 = 1; // const/4 v5, 0x1
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).i ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->i()I
/* int-to-float v5, v5 */
/* div-float v13, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 1; // const/4 v5, 0x1
/* aget-object v4, v4, v5 */
int v5 = 2; // const/4 v5, 0x2
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).b ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v5, v5 */
/* div-float v14, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 1; // const/4 v5, 0x1
/* aget-object v4, v4, v5 */
int v5 = 3; // const/4 v5, 0x3
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).i ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->i()I
/* int-to-float v5, v5 */
/* div-float v15, v4, v5 */
/* move/from16 v4, p4 */
/* move/from16 v5, p5 */
/* move/from16 v6, p6 */
/* move/from16 v7, p7 */
/* invoke-static/range {v1 ..v15}, Lcom/doodlemobile/basket/util/Util;->nativeRenderRect1(JIFFFFFFFFFFFF)V */
/* invoke-virtual/range {p1 ..p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J */
/* move-result-wide v1 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v3, v0 */
v3 = (( com.doodlemobile.basket.graphics.e ) v3 ).o ( ); // invoke-virtual {v3}, Lcom/doodlemobile/basket/graphics/e;->o()I
/* const/high16 v4, -0x41000000 # -0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = this.q;
int v6 = 0; // const/4 v6, 0x0
/* aget-object v5, v5, v6 */
int v6 = 2; // const/4 v6, 0x2
/* aget v5, v5, v6 */
/* add-float v5, v5, v16 */
/* div-float v5, v5, p2 */
/* add-float v8, v4, v5 */
/* const/high16 v9, -0x41000000 # -0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 2; // const/4 v5, 0x2
/* aget-object v4, v4, v5 */
int v5 = 2; // const/4 v5, 0x2
/* aget v4, v4, v5 */
/* div-float v10, v4, p2 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 2; // const/4 v5, 0x2
/* aget-object v4, v4, v5 */
int v5 = 3; // const/4 v5, 0x3
/* aget v4, v4, v5 */
/* div-float v11, v4, p3 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 2; // const/4 v5, 0x2
/* aget-object v4, v4, v5 */
int v5 = 0; // const/4 v5, 0x0
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).b ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v5, v5 */
/* div-float v12, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 2; // const/4 v5, 0x2
/* aget-object v4, v4, v5 */
int v5 = 1; // const/4 v5, 0x1
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).i ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->i()I
/* int-to-float v5, v5 */
/* div-float v13, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 2; // const/4 v5, 0x2
/* aget-object v4, v4, v5 */
int v5 = 2; // const/4 v5, 0x2
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).b ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v5, v5 */
/* div-float v14, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 2; // const/4 v5, 0x2
/* aget-object v4, v4, v5 */
int v5 = 3; // const/4 v5, 0x3
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).i ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->i()I
/* int-to-float v5, v5 */
/* div-float v15, v4, v5 */
/* move/from16 v4, p4 */
/* move/from16 v5, p5 */
/* move/from16 v6, p6 */
/* move/from16 v7, p7 */
/* invoke-static/range {v1 ..v15}, Lcom/doodlemobile/basket/util/Util;->nativeRenderRect1(JIFFFFFFFFFFFF)V */
/* invoke-virtual/range {p1 ..p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J */
/* move-result-wide v1 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v3, v0 */
v3 = (( com.doodlemobile.basket.graphics.e ) v3 ).o ( ); // invoke-virtual {v3}, Lcom/doodlemobile/basket/graphics/e;->o()I
/* const/high16 v8, -0x41000000 # -0.5f */
/* const/high16 v4, -0x41000000 # -0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = this.q;
int v6 = 0; // const/4 v6, 0x0
/* aget-object v5, v5, v6 */
int v6 = 3; // const/4 v6, 0x3
/* aget v5, v5, v6 */
/* div-float v5, v5, p3 */
/* add-float v9, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 3; // const/4 v5, 0x3
/* aget-object v4, v4, v5 */
int v5 = 2; // const/4 v5, 0x2
/* aget v4, v4, v5 */
/* div-float v10, v4, p2 */
/* div-float v11, v17, p3 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 3; // const/4 v5, 0x3
/* aget-object v4, v4, v5 */
int v5 = 0; // const/4 v5, 0x0
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).b ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v5, v5 */
/* div-float v12, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 3; // const/4 v5, 0x3
/* aget-object v4, v4, v5 */
int v5 = 1; // const/4 v5, 0x1
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).i ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->i()I
/* int-to-float v5, v5 */
/* div-float v13, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 3; // const/4 v5, 0x3
/* aget-object v4, v4, v5 */
int v5 = 2; // const/4 v5, 0x2
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).b ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v5, v5 */
/* div-float v14, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 3; // const/4 v5, 0x3
/* aget-object v4, v4, v5 */
int v5 = 3; // const/4 v5, 0x3
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).i ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->i()I
/* int-to-float v5, v5 */
/* div-float v15, v4, v5 */
/* move/from16 v4, p4 */
/* move/from16 v5, p5 */
/* move/from16 v6, p6 */
/* move/from16 v7, p7 */
/* invoke-static/range {v1 ..v15}, Lcom/doodlemobile/basket/util/Util;->nativeRenderRect1(JIFFFFFFFFFFFF)V */
/* invoke-virtual/range {p1 ..p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J */
/* move-result-wide v1 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v3, v0 */
v3 = (( com.doodlemobile.basket.graphics.e ) v3 ).o ( ); // invoke-virtual {v3}, Lcom/doodlemobile/basket/graphics/e;->o()I
/* const/high16 v4, -0x41000000 # -0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = this.q;
int v6 = 1; // const/4 v6, 0x1
/* aget-object v5, v5, v6 */
int v6 = 0; // const/4 v6, 0x0
/* aget v5, v5, v6 */
/* div-float v5, v5, p2 */
/* add-float v8, v4, v5 */
/* const/high16 v4, -0x41000000 # -0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = this.q;
int v6 = 0; // const/4 v6, 0x0
/* aget-object v5, v5, v6 */
int v6 = 3; // const/4 v6, 0x3
/* aget v5, v5, v6 */
/* div-float v5, v5, p3 */
/* add-float v9, v4, v5 */
/* div-float v10, v16, p2 */
/* div-float v11, v17, p3 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 4; // const/4 v5, 0x4
/* aget-object v4, v4, v5 */
int v5 = 0; // const/4 v5, 0x0
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).b ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v5, v5 */
/* div-float v12, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 4; // const/4 v5, 0x4
/* aget-object v4, v4, v5 */
int v5 = 1; // const/4 v5, 0x1
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).i ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->i()I
/* int-to-float v5, v5 */
/* div-float v13, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 4; // const/4 v5, 0x4
/* aget-object v4, v4, v5 */
int v5 = 2; // const/4 v5, 0x2
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).b ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v5, v5 */
/* div-float v14, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 4; // const/4 v5, 0x4
/* aget-object v4, v4, v5 */
int v5 = 3; // const/4 v5, 0x3
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).i ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->i()I
/* int-to-float v5, v5 */
/* div-float v15, v4, v5 */
/* move/from16 v4, p4 */
/* move/from16 v5, p5 */
/* move/from16 v6, p6 */
/* move/from16 v7, p7 */
/* invoke-static/range {v1 ..v15}, Lcom/doodlemobile/basket/util/Util;->nativeRenderRect1(JIFFFFFFFFFFFF)V */
/* invoke-virtual/range {p1 ..p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J */
/* move-result-wide v1 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v3, v0 */
v3 = (( com.doodlemobile.basket.graphics.e ) v3 ).o ( ); // invoke-virtual {v3}, Lcom/doodlemobile/basket/graphics/e;->o()I
/* const/high16 v4, -0x41000000 # -0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = this.q;
int v6 = 0; // const/4 v6, 0x0
/* aget-object v5, v5, v6 */
int v6 = 2; // const/4 v6, 0x2
/* aget v5, v5, v6 */
/* add-float v5, v5, v16 */
/* div-float v5, v5, p2 */
/* add-float v8, v4, v5 */
/* const/high16 v4, -0x41000000 # -0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = this.q;
int v6 = 0; // const/4 v6, 0x0
/* aget-object v5, v5, v6 */
int v6 = 3; // const/4 v6, 0x3
/* aget v5, v5, v6 */
/* div-float v5, v5, p3 */
/* add-float v9, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 5; // const/4 v5, 0x5
/* aget-object v4, v4, v5 */
int v5 = 2; // const/4 v5, 0x2
/* aget v4, v4, v5 */
/* div-float v10, v4, p2 */
/* div-float v11, v17, p3 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 5; // const/4 v5, 0x5
/* aget-object v4, v4, v5 */
int v5 = 0; // const/4 v5, 0x0
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).b ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v5, v5 */
/* div-float v12, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 5; // const/4 v5, 0x5
/* aget-object v4, v4, v5 */
int v5 = 1; // const/4 v5, 0x1
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).i ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->i()I
/* int-to-float v5, v5 */
/* div-float v13, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 5; // const/4 v5, 0x5
/* aget-object v4, v4, v5 */
int v5 = 2; // const/4 v5, 0x2
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).b ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v5, v5 */
/* div-float v14, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 5; // const/4 v5, 0x5
/* aget-object v4, v4, v5 */
int v5 = 3; // const/4 v5, 0x3
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).i ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->i()I
/* int-to-float v5, v5 */
/* div-float v15, v4, v5 */
/* move/from16 v4, p4 */
/* move/from16 v5, p5 */
/* move/from16 v6, p6 */
/* move/from16 v7, p7 */
/* invoke-static/range {v1 ..v15}, Lcom/doodlemobile/basket/util/Util;->nativeRenderRect1(JIFFFFFFFFFFFF)V */
/* invoke-virtual/range {p1 ..p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J */
/* move-result-wide v1 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v3, v0 */
v3 = (( com.doodlemobile.basket.graphics.e ) v3 ).o ( ); // invoke-virtual {v3}, Lcom/doodlemobile/basket/graphics/e;->o()I
/* const/high16 v8, -0x41000000 # -0.5f */
/* const/high16 v4, -0x41000000 # -0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = this.q;
int v6 = 0; // const/4 v6, 0x0
/* aget-object v5, v5, v6 */
int v6 = 3; // const/4 v6, 0x3
/* aget v5, v5, v6 */
/* add-float v5, v5, v17 */
/* div-float v5, v5, p3 */
/* add-float v9, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 6; // const/4 v5, 0x6
/* aget-object v4, v4, v5 */
int v5 = 2; // const/4 v5, 0x2
/* aget v4, v4, v5 */
/* div-float v10, v4, p2 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 6; // const/4 v5, 0x6
/* aget-object v4, v4, v5 */
int v5 = 3; // const/4 v5, 0x3
/* aget v4, v4, v5 */
/* div-float v11, v4, p3 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 6; // const/4 v5, 0x6
/* aget-object v4, v4, v5 */
int v5 = 0; // const/4 v5, 0x0
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).b ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v5, v5 */
/* div-float v12, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 6; // const/4 v5, 0x6
/* aget-object v4, v4, v5 */
int v5 = 1; // const/4 v5, 0x1
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).i ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->i()I
/* int-to-float v5, v5 */
/* div-float v13, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 6; // const/4 v5, 0x6
/* aget-object v4, v4, v5 */
int v5 = 2; // const/4 v5, 0x2
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).b ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v5, v5 */
/* div-float v14, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 6; // const/4 v5, 0x6
/* aget-object v4, v4, v5 */
int v5 = 3; // const/4 v5, 0x3
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).i ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->i()I
/* int-to-float v5, v5 */
/* div-float v15, v4, v5 */
/* move/from16 v4, p4 */
/* move/from16 v5, p5 */
/* move/from16 v6, p6 */
/* move/from16 v7, p7 */
/* invoke-static/range {v1 ..v15}, Lcom/doodlemobile/basket/util/Util;->nativeRenderRect1(JIFFFFFFFFFFFF)V */
/* invoke-virtual/range {p1 ..p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J */
/* move-result-wide v1 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v3, v0 */
v3 = (( com.doodlemobile.basket.graphics.e ) v3 ).o ( ); // invoke-virtual {v3}, Lcom/doodlemobile/basket/graphics/e;->o()I
/* const/high16 v4, -0x41000000 # -0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = this.q;
int v6 = 1; // const/4 v6, 0x1
/* aget-object v5, v5, v6 */
int v6 = 0; // const/4 v6, 0x0
/* aget v5, v5, v6 */
/* div-float v5, v5, p2 */
/* add-float v8, v4, v5 */
/* const/high16 v4, -0x41000000 # -0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = this.q;
int v6 = 0; // const/4 v6, 0x0
/* aget-object v5, v5, v6 */
int v6 = 3; // const/4 v6, 0x3
/* aget v5, v5, v6 */
/* add-float v5, v5, v17 */
/* div-float v5, v5, p3 */
/* add-float v9, v4, v5 */
/* div-float v10, v16, p2 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 7; // const/4 v5, 0x7
/* aget-object v4, v4, v5 */
int v5 = 3; // const/4 v5, 0x3
/* aget v4, v4, v5 */
/* div-float v11, v4, p3 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 7; // const/4 v5, 0x7
/* aget-object v4, v4, v5 */
int v5 = 0; // const/4 v5, 0x0
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).b ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v5, v5 */
/* div-float v12, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 7; // const/4 v5, 0x7
/* aget-object v4, v4, v5 */
int v5 = 1; // const/4 v5, 0x1
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).i ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->i()I
/* int-to-float v5, v5 */
/* div-float v13, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 7; // const/4 v5, 0x7
/* aget-object v4, v4, v5 */
int v5 = 2; // const/4 v5, 0x2
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).b ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v5, v5 */
/* div-float v14, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
int v5 = 7; // const/4 v5, 0x7
/* aget-object v4, v4, v5 */
int v5 = 3; // const/4 v5, 0x3
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).i ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->i()I
/* int-to-float v5, v5 */
/* div-float v15, v4, v5 */
/* move/from16 v4, p4 */
/* move/from16 v5, p5 */
/* move/from16 v6, p6 */
/* move/from16 v7, p7 */
/* invoke-static/range {v1 ..v15}, Lcom/doodlemobile/basket/util/Util;->nativeRenderRect1(JIFFFFFFFFFFFF)V */
/* invoke-virtual/range {p1 ..p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J */
/* move-result-wide v1 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v3, v0 */
v3 = (( com.doodlemobile.basket.graphics.e ) v3 ).o ( ); // invoke-virtual {v3}, Lcom/doodlemobile/basket/graphics/e;->o()I
/* const/high16 v4, -0x41000000 # -0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = this.q;
int v6 = 0; // const/4 v6, 0x0
/* aget-object v5, v5, v6 */
int v6 = 2; // const/4 v6, 0x2
/* aget v5, v5, v6 */
/* add-float v5, v5, v16 */
/* div-float v5, v5, p2 */
/* add-float v8, v4, v5 */
/* const/high16 v4, -0x41000000 # -0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = this.q;
int v6 = 0; // const/4 v6, 0x0
/* aget-object v5, v5, v6 */
int v6 = 3; // const/4 v6, 0x3
/* aget v5, v5, v6 */
/* add-float v5, v5, v17 */
/* div-float v5, v5, p3 */
/* add-float v9, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
/* const/16 v5, 0x8 */
/* aget-object v4, v4, v5 */
int v5 = 2; // const/4 v5, 0x2
/* aget v4, v4, v5 */
/* div-float v10, v4, p2 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
/* const/16 v5, 0x8 */
/* aget-object v4, v4, v5 */
int v5 = 3; // const/4 v5, 0x3
/* aget v4, v4, v5 */
/* div-float v11, v4, p3 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
/* const/16 v5, 0x8 */
/* aget-object v4, v4, v5 */
int v5 = 0; // const/4 v5, 0x0
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).b ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v5, v5 */
/* div-float v12, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
/* const/16 v5, 0x8 */
/* aget-object v4, v4, v5 */
int v5 = 1; // const/4 v5, 0x1
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).i ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->i()I
/* int-to-float v5, v5 */
/* div-float v13, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
/* const/16 v5, 0x8 */
/* aget-object v4, v4, v5 */
int v5 = 2; // const/4 v5, 0x2
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).b ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v5, v5 */
/* div-float v14, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = this.q;
/* const/16 v5, 0x8 */
/* aget-object v4, v4, v5 */
int v5 = 3; // const/4 v5, 0x3
/* aget v4, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
v5 = (( com.doodlemobile.basket.graphics.e ) v5 ).i ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->i()I
/* int-to-float v5, v5 */
/* div-float v15, v4, v5 */
/* move/from16 v4, p4 */
/* move/from16 v5, p5 */
/* move/from16 v6, p6 */
/* move/from16 v7, p7 */
/* invoke-static/range {v1 ..v15}, Lcom/doodlemobile/basket/util/Util;->nativeRenderRect1(JIFFFFFFFFFFFF)V */
/* goto/16 :goto_0 */
} // .end method
public final void a ( com.doodlemobile.basket.math.MatrixStack p0, java.lang.Object p1 ) {
/* .locals 19 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v1, v0 */
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* check-cast p2, Lcom/doodlemobile/basket/game2d/d; */
	 /* if-nez p2, :cond_1 */
	 /* move-object/from16 v0, p0 */
	 v0 = this.a;
	 /* move-object v1, v0 */
	 v1 = 	 (( com.doodlemobile.basket.graphics.e ) v1 ).o ( ); // invoke-virtual {v1}, Lcom/doodlemobile/basket/graphics/e;->o()I
	 /* invoke-virtual/range {p1 ..p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J */
	 /* move-result-wide v2 */
	 int v4 = 0; // const/4 v4, 0x0
	 int v5 = 0; // const/4 v5, 0x0
	 /* move-object/from16 v0, p0 */
	 v0 = this.a;
	 /* move-object v6, v0 */
	 v6 = 	 (( com.doodlemobile.basket.graphics.e ) v6 ).l ( ); // invoke-virtual {v6}, Lcom/doodlemobile/basket/graphics/e;->l()F
	 /* move-object/from16 v0, p0 */
	 v0 = this.a;
	 /* move-object v7, v0 */
	 v7 = 	 (( com.doodlemobile.basket.graphics.e ) v7 ).m ( ); // invoke-virtual {v7}, Lcom/doodlemobile/basket/graphics/e;->m()F
	 /* invoke-static/range {v1 ..v7}, Lcom/doodlemobile/basket/graphics/StaticImageDrawable;->nativeRender(IJFFFF)V */
} // :cond_0
} // :goto_0
return;
} // :cond_1
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v1, v0 */
/* iget-boolean v1, v1, Lcom/doodlemobile/basket/graphics/e;->l:Z */
/* if-nez v1, :cond_2 */
/* invoke-virtual/range {p1 ..p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J */
/* move-result-wide v1 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v3, v0 */
v3 = (( com.doodlemobile.basket.graphics.e ) v3 ).o ( ); // invoke-virtual {v3}, Lcom/doodlemobile/basket/graphics/e;->o()I
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->g:F */
/* move v4, v0 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->j:F */
/* move v5, v0 */
/* mul-float/2addr v4, v5 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->h:F */
/* move v5, v0 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->j:F */
/* move v6, v0 */
/* mul-float/2addr v5, v6 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->i:F */
/* move v6, v0 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->j:F */
/* move v7, v0 */
/* mul-float/2addr v6, v7 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->j:F */
/* move v7, v0 */
/* const/high16 v8, -0x41000000 # -0.5f */
/* const/high16 v9, -0x41000000 # -0.5f */
/* const/high16 v10, 0x3f800000 # 1.0f */
/* const/high16 v11, 0x3f800000 # 1.0f */
int v12 = 0; // const/4 v12, 0x0
int v13 = 0; // const/4 v13, 0x0
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v14, v0 */
v14 = (( com.doodlemobile.basket.graphics.e ) v14 ).l ( ); // invoke-virtual {v14}, Lcom/doodlemobile/basket/graphics/e;->l()F
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v15, v0 */
v15 = (( com.doodlemobile.basket.graphics.e ) v15 ).m ( ); // invoke-virtual {v15}, Lcom/doodlemobile/basket/graphics/e;->m()F
/* invoke-static/range {v1 ..v15}, Lcom/doodlemobile/basket/util/Util;->nativeRenderRect1(JIFFFFFFFFFFFF)V */
} // :cond_2
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->e:F */
/* move v1, v0 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v2, v0 */
v2 = this.q;
int v3 = 0; // const/4 v3, 0x0
/* aget-object v2, v2, v3 */
int v3 = 2; // const/4 v3, 0x2
/* aget v2, v2, v3 */
/* sub-float/2addr v1, v2 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v2, v0 */
v2 = this.q;
int v3 = 2; // const/4 v3, 0x2
/* aget-object v2, v2, v3 */
int v3 = 2; // const/4 v3, 0x2
/* aget v2, v2, v3 */
/* sub-float v16, v1, v2 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->f:F */
/* move v1, v0 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v2, v0 */
v2 = this.q;
int v3 = 0; // const/4 v3, 0x0
/* aget-object v2, v2, v3 */
int v3 = 3; // const/4 v3, 0x3
/* aget v2, v2, v3 */
/* sub-float/2addr v1, v2 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v2, v0 */
v2 = this.q;
/* const/16 v3, 0x8 */
/* aget-object v2, v2, v3 */
int v3 = 3; // const/4 v3, 0x3
/* aget v2, v2, v3 */
/* sub-float v17, v1, v2 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->g:F */
/* move v1, v0 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->j:F */
/* move v2, v0 */
/* mul-float v4, v1, v2 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->i:F */
/* move v1, v0 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->j:F */
/* move v2, v0 */
/* mul-float v6, v1, v2 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->h:F */
/* move v1, v0 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->j:F */
/* move v2, v0 */
/* mul-float v5, v1, v2 */
/* invoke-virtual/range {p1 ..p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J */
/* move-result-wide v1 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v3, v0 */
v3 = (( com.doodlemobile.basket.graphics.e ) v3 ).o ( ); // invoke-virtual {v3}, Lcom/doodlemobile/basket/graphics/e;->o()I
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->j:F */
/* move v7, v0 */
/* const/high16 v8, -0x41000000 # -0.5f */
/* const/high16 v9, -0x41000000 # -0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v10, v0 */
v10 = this.q;
int v11 = 0; // const/4 v11, 0x0
/* aget-object v10, v10, v11 */
int v11 = 2; // const/4 v11, 0x2
/* aget v10, v10, v11 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->e:F */
/* move v11, v0 */
/* div-float/2addr v10, v11 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v11, v0 */
v11 = this.q;
int v12 = 0; // const/4 v12, 0x0
/* aget-object v11, v11, v12 */
int v12 = 3; // const/4 v12, 0x3
/* aget v11, v11, v12 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->f:F */
/* move v12, v0 */
/* div-float/2addr v11, v12 */
int v12 = 0; // const/4 v12, 0x0
int v13 = 0; // const/4 v13, 0x0
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v14, v0 */
v14 = this.q;
int v15 = 0; // const/4 v15, 0x0
/* aget-object v14, v14, v15 */
int v15 = 2; // const/4 v15, 0x2
/* aget v14, v14, v15 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v15, v0 */
v15 = (( com.doodlemobile.basket.graphics.e ) v15 ).b ( ); // invoke-virtual {v15}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v15, v15 */
/* div-float/2addr v14, v15 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v15, v0 */
v15 = this.q;
/* const/16 v18, 0x0 */
/* aget-object v15, v15, v18 */
/* const/16 v18, 0x3 */
/* aget v15, v15, v18 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object/from16 v18, v0 */
v18 = /* invoke-virtual/range {v18 ..v18}, Lcom/doodlemobile/basket/graphics/e;->i()I */
/* move/from16 v0, v18 */
/* int-to-float v0, v0 */
/* move/from16 v18, v0 */
/* div-float v15, v15, v18 */
/* invoke-static/range {v1 ..v15}, Lcom/doodlemobile/basket/util/Util;->nativeRenderRect1(JIFFFFFFFFFFFF)V */
/* invoke-virtual/range {p1 ..p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J */
/* move-result-wide v1 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v3, v0 */
v3 = (( com.doodlemobile.basket.graphics.e ) v3 ).o ( ); // invoke-virtual {v3}, Lcom/doodlemobile/basket/graphics/e;->o()I
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->j:F */
/* move v7, v0 */
/* const/high16 v8, -0x41000000 # -0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v9, v0 */
v9 = this.q;
int v10 = 1; // const/4 v10, 0x1
/* aget-object v9, v9, v10 */
int v10 = 0; // const/4 v10, 0x0
/* aget v9, v9, v10 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->e:F */
/* move v10, v0 */
/* div-float/2addr v9, v10 */
/* add-float/2addr v8, v9 */
/* const/high16 v9, -0x41000000 # -0.5f */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->e:F */
/* move v10, v0 */
/* div-float v10, v16, v10 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v11, v0 */
v11 = this.q;
int v12 = 1; // const/4 v12, 0x1
/* aget-object v11, v11, v12 */
int v12 = 3; // const/4 v12, 0x3
/* aget v11, v11, v12 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->f:F */
/* move v12, v0 */
/* div-float/2addr v11, v12 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v12, v0 */
v12 = this.q;
int v13 = 1; // const/4 v13, 0x1
/* aget-object v12, v12, v13 */
int v13 = 0; // const/4 v13, 0x0
/* aget v12, v12, v13 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v13, v0 */
v13 = (( com.doodlemobile.basket.graphics.e ) v13 ).b ( ); // invoke-virtual {v13}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v13, v13 */
/* div-float/2addr v12, v13 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v13, v0 */
v13 = this.q;
int v14 = 1; // const/4 v14, 0x1
/* aget-object v13, v13, v14 */
int v14 = 1; // const/4 v14, 0x1
/* aget v13, v13, v14 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v14, v0 */
v14 = (( com.doodlemobile.basket.graphics.e ) v14 ).i ( ); // invoke-virtual {v14}, Lcom/doodlemobile/basket/graphics/e;->i()I
/* int-to-float v14, v14 */
/* div-float/2addr v13, v14 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v14, v0 */
v14 = this.q;
int v15 = 1; // const/4 v15, 0x1
/* aget-object v14, v14, v15 */
int v15 = 2; // const/4 v15, 0x2
/* aget v14, v14, v15 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v15, v0 */
v15 = (( com.doodlemobile.basket.graphics.e ) v15 ).b ( ); // invoke-virtual {v15}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v15, v15 */
/* div-float/2addr v14, v15 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v15, v0 */
v15 = this.q;
/* const/16 v18, 0x1 */
/* aget-object v15, v15, v18 */
/* const/16 v18, 0x3 */
/* aget v15, v15, v18 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object/from16 v18, v0 */
v18 = /* invoke-virtual/range {v18 ..v18}, Lcom/doodlemobile/basket/graphics/e;->i()I */
/* move/from16 v0, v18 */
/* int-to-float v0, v0 */
/* move/from16 v18, v0 */
/* div-float v15, v15, v18 */
/* invoke-static/range {v1 ..v15}, Lcom/doodlemobile/basket/util/Util;->nativeRenderRect1(JIFFFFFFFFFFFF)V */
/* invoke-virtual/range {p1 ..p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J */
/* move-result-wide v1 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v3, v0 */
v3 = (( com.doodlemobile.basket.graphics.e ) v3 ).o ( ); // invoke-virtual {v3}, Lcom/doodlemobile/basket/graphics/e;->o()I
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->j:F */
/* move v7, v0 */
/* const/high16 v8, -0x41000000 # -0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v9, v0 */
v9 = this.q;
int v10 = 0; // const/4 v10, 0x0
/* aget-object v9, v9, v10 */
int v10 = 2; // const/4 v10, 0x2
/* aget v9, v9, v10 */
/* add-float v9, v9, v16 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->e:F */
/* move v10, v0 */
/* div-float/2addr v9, v10 */
/* add-float/2addr v8, v9 */
/* const/high16 v9, -0x41000000 # -0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v10, v0 */
v10 = this.q;
int v11 = 2; // const/4 v11, 0x2
/* aget-object v10, v10, v11 */
int v11 = 2; // const/4 v11, 0x2
/* aget v10, v10, v11 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->e:F */
/* move v11, v0 */
/* div-float/2addr v10, v11 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v11, v0 */
v11 = this.q;
int v12 = 2; // const/4 v12, 0x2
/* aget-object v11, v11, v12 */
int v12 = 3; // const/4 v12, 0x3
/* aget v11, v11, v12 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->f:F */
/* move v12, v0 */
/* div-float/2addr v11, v12 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v12, v0 */
v12 = this.q;
int v13 = 2; // const/4 v13, 0x2
/* aget-object v12, v12, v13 */
int v13 = 0; // const/4 v13, 0x0
/* aget v12, v12, v13 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v13, v0 */
v13 = (( com.doodlemobile.basket.graphics.e ) v13 ).b ( ); // invoke-virtual {v13}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v13, v13 */
/* div-float/2addr v12, v13 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v13, v0 */
v13 = this.q;
int v14 = 2; // const/4 v14, 0x2
/* aget-object v13, v13, v14 */
int v14 = 1; // const/4 v14, 0x1
/* aget v13, v13, v14 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v14, v0 */
v14 = (( com.doodlemobile.basket.graphics.e ) v14 ).i ( ); // invoke-virtual {v14}, Lcom/doodlemobile/basket/graphics/e;->i()I
/* int-to-float v14, v14 */
/* div-float/2addr v13, v14 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v14, v0 */
v14 = this.q;
int v15 = 2; // const/4 v15, 0x2
/* aget-object v14, v14, v15 */
int v15 = 2; // const/4 v15, 0x2
/* aget v14, v14, v15 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v15, v0 */
v15 = (( com.doodlemobile.basket.graphics.e ) v15 ).b ( ); // invoke-virtual {v15}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v15, v15 */
/* div-float/2addr v14, v15 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v15, v0 */
v15 = this.q;
/* const/16 v18, 0x2 */
/* aget-object v15, v15, v18 */
/* const/16 v18, 0x3 */
/* aget v15, v15, v18 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object/from16 v18, v0 */
v18 = /* invoke-virtual/range {v18 ..v18}, Lcom/doodlemobile/basket/graphics/e;->i()I */
/* move/from16 v0, v18 */
/* int-to-float v0, v0 */
/* move/from16 v18, v0 */
/* div-float v15, v15, v18 */
/* invoke-static/range {v1 ..v15}, Lcom/doodlemobile/basket/util/Util;->nativeRenderRect1(JIFFFFFFFFFFFF)V */
/* invoke-virtual/range {p1 ..p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J */
/* move-result-wide v1 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v3, v0 */
v3 = (( com.doodlemobile.basket.graphics.e ) v3 ).o ( ); // invoke-virtual {v3}, Lcom/doodlemobile/basket/graphics/e;->o()I
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->j:F */
/* move v7, v0 */
/* const/high16 v8, -0x41000000 # -0.5f */
/* const/high16 v9, -0x41000000 # -0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v10, v0 */
v10 = this.q;
int v11 = 0; // const/4 v11, 0x0
/* aget-object v10, v10, v11 */
int v11 = 3; // const/4 v11, 0x3
/* aget v10, v10, v11 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->f:F */
/* move v11, v0 */
/* div-float/2addr v10, v11 */
/* add-float/2addr v9, v10 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v10, v0 */
v10 = this.q;
int v11 = 3; // const/4 v11, 0x3
/* aget-object v10, v10, v11 */
int v11 = 2; // const/4 v11, 0x2
/* aget v10, v10, v11 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->e:F */
/* move v11, v0 */
/* div-float/2addr v10, v11 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->f:F */
/* move v11, v0 */
/* div-float v11, v17, v11 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v12, v0 */
v12 = this.q;
int v13 = 3; // const/4 v13, 0x3
/* aget-object v12, v12, v13 */
int v13 = 0; // const/4 v13, 0x0
/* aget v12, v12, v13 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v13, v0 */
v13 = (( com.doodlemobile.basket.graphics.e ) v13 ).b ( ); // invoke-virtual {v13}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v13, v13 */
/* div-float/2addr v12, v13 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v13, v0 */
v13 = this.q;
int v14 = 3; // const/4 v14, 0x3
/* aget-object v13, v13, v14 */
int v14 = 1; // const/4 v14, 0x1
/* aget v13, v13, v14 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v14, v0 */
v14 = (( com.doodlemobile.basket.graphics.e ) v14 ).i ( ); // invoke-virtual {v14}, Lcom/doodlemobile/basket/graphics/e;->i()I
/* int-to-float v14, v14 */
/* div-float/2addr v13, v14 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v14, v0 */
v14 = this.q;
int v15 = 3; // const/4 v15, 0x3
/* aget-object v14, v14, v15 */
int v15 = 2; // const/4 v15, 0x2
/* aget v14, v14, v15 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v15, v0 */
v15 = (( com.doodlemobile.basket.graphics.e ) v15 ).b ( ); // invoke-virtual {v15}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v15, v15 */
/* div-float/2addr v14, v15 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v15, v0 */
v15 = this.q;
/* const/16 v18, 0x3 */
/* aget-object v15, v15, v18 */
/* const/16 v18, 0x3 */
/* aget v15, v15, v18 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object/from16 v18, v0 */
v18 = /* invoke-virtual/range {v18 ..v18}, Lcom/doodlemobile/basket/graphics/e;->i()I */
/* move/from16 v0, v18 */
/* int-to-float v0, v0 */
/* move/from16 v18, v0 */
/* div-float v15, v15, v18 */
/* invoke-static/range {v1 ..v15}, Lcom/doodlemobile/basket/util/Util;->nativeRenderRect1(JIFFFFFFFFFFFF)V */
/* invoke-virtual/range {p1 ..p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J */
/* move-result-wide v1 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v3, v0 */
v3 = (( com.doodlemobile.basket.graphics.e ) v3 ).o ( ); // invoke-virtual {v3}, Lcom/doodlemobile/basket/graphics/e;->o()I
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->j:F */
/* move v7, v0 */
/* const/high16 v8, -0x41000000 # -0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v9, v0 */
v9 = this.q;
int v10 = 1; // const/4 v10, 0x1
/* aget-object v9, v9, v10 */
int v10 = 0; // const/4 v10, 0x0
/* aget v9, v9, v10 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->e:F */
/* move v10, v0 */
/* div-float/2addr v9, v10 */
/* add-float/2addr v8, v9 */
/* const/high16 v9, -0x41000000 # -0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v10, v0 */
v10 = this.q;
int v11 = 0; // const/4 v11, 0x0
/* aget-object v10, v10, v11 */
int v11 = 3; // const/4 v11, 0x3
/* aget v10, v10, v11 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->f:F */
/* move v11, v0 */
/* div-float/2addr v10, v11 */
/* add-float/2addr v9, v10 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->e:F */
/* move v10, v0 */
/* div-float v10, v16, v10 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->f:F */
/* move v11, v0 */
/* div-float v11, v17, v11 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v12, v0 */
v12 = this.q;
int v13 = 4; // const/4 v13, 0x4
/* aget-object v12, v12, v13 */
int v13 = 0; // const/4 v13, 0x0
/* aget v12, v12, v13 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v13, v0 */
v13 = (( com.doodlemobile.basket.graphics.e ) v13 ).b ( ); // invoke-virtual {v13}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v13, v13 */
/* div-float/2addr v12, v13 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v13, v0 */
v13 = this.q;
int v14 = 4; // const/4 v14, 0x4
/* aget-object v13, v13, v14 */
int v14 = 1; // const/4 v14, 0x1
/* aget v13, v13, v14 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v14, v0 */
v14 = (( com.doodlemobile.basket.graphics.e ) v14 ).i ( ); // invoke-virtual {v14}, Lcom/doodlemobile/basket/graphics/e;->i()I
/* int-to-float v14, v14 */
/* div-float/2addr v13, v14 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v14, v0 */
v14 = this.q;
int v15 = 4; // const/4 v15, 0x4
/* aget-object v14, v14, v15 */
int v15 = 2; // const/4 v15, 0x2
/* aget v14, v14, v15 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v15, v0 */
v15 = (( com.doodlemobile.basket.graphics.e ) v15 ).b ( ); // invoke-virtual {v15}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v15, v15 */
/* div-float/2addr v14, v15 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v15, v0 */
v15 = this.q;
/* const/16 v18, 0x4 */
/* aget-object v15, v15, v18 */
/* const/16 v18, 0x3 */
/* aget v15, v15, v18 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object/from16 v18, v0 */
v18 = /* invoke-virtual/range {v18 ..v18}, Lcom/doodlemobile/basket/graphics/e;->i()I */
/* move/from16 v0, v18 */
/* int-to-float v0, v0 */
/* move/from16 v18, v0 */
/* div-float v15, v15, v18 */
/* invoke-static/range {v1 ..v15}, Lcom/doodlemobile/basket/util/Util;->nativeRenderRect1(JIFFFFFFFFFFFF)V */
/* invoke-virtual/range {p1 ..p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J */
/* move-result-wide v1 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v3, v0 */
v3 = (( com.doodlemobile.basket.graphics.e ) v3 ).o ( ); // invoke-virtual {v3}, Lcom/doodlemobile/basket/graphics/e;->o()I
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->j:F */
/* move v7, v0 */
/* const/high16 v8, -0x41000000 # -0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v9, v0 */
v9 = this.q;
int v10 = 0; // const/4 v10, 0x0
/* aget-object v9, v9, v10 */
int v10 = 2; // const/4 v10, 0x2
/* aget v9, v9, v10 */
/* add-float v9, v9, v16 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->e:F */
/* move v10, v0 */
/* div-float/2addr v9, v10 */
/* add-float/2addr v8, v9 */
/* const/high16 v9, -0x41000000 # -0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v10, v0 */
v10 = this.q;
int v11 = 0; // const/4 v11, 0x0
/* aget-object v10, v10, v11 */
int v11 = 3; // const/4 v11, 0x3
/* aget v10, v10, v11 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->f:F */
/* move v11, v0 */
/* div-float/2addr v10, v11 */
/* add-float/2addr v9, v10 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v10, v0 */
v10 = this.q;
int v11 = 5; // const/4 v11, 0x5
/* aget-object v10, v10, v11 */
int v11 = 2; // const/4 v11, 0x2
/* aget v10, v10, v11 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->e:F */
/* move v11, v0 */
/* div-float/2addr v10, v11 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->f:F */
/* move v11, v0 */
/* div-float v11, v17, v11 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v12, v0 */
v12 = this.q;
int v13 = 5; // const/4 v13, 0x5
/* aget-object v12, v12, v13 */
int v13 = 0; // const/4 v13, 0x0
/* aget v12, v12, v13 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v13, v0 */
v13 = (( com.doodlemobile.basket.graphics.e ) v13 ).b ( ); // invoke-virtual {v13}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v13, v13 */
/* div-float/2addr v12, v13 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v13, v0 */
v13 = this.q;
int v14 = 5; // const/4 v14, 0x5
/* aget-object v13, v13, v14 */
int v14 = 1; // const/4 v14, 0x1
/* aget v13, v13, v14 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v14, v0 */
v14 = (( com.doodlemobile.basket.graphics.e ) v14 ).i ( ); // invoke-virtual {v14}, Lcom/doodlemobile/basket/graphics/e;->i()I
/* int-to-float v14, v14 */
/* div-float/2addr v13, v14 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v14, v0 */
v14 = this.q;
int v15 = 5; // const/4 v15, 0x5
/* aget-object v14, v14, v15 */
int v15 = 2; // const/4 v15, 0x2
/* aget v14, v14, v15 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v15, v0 */
v15 = (( com.doodlemobile.basket.graphics.e ) v15 ).b ( ); // invoke-virtual {v15}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v15, v15 */
/* div-float/2addr v14, v15 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v15, v0 */
v15 = this.q;
/* const/16 v18, 0x5 */
/* aget-object v15, v15, v18 */
/* const/16 v18, 0x3 */
/* aget v15, v15, v18 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object/from16 v18, v0 */
v18 = /* invoke-virtual/range {v18 ..v18}, Lcom/doodlemobile/basket/graphics/e;->i()I */
/* move/from16 v0, v18 */
/* int-to-float v0, v0 */
/* move/from16 v18, v0 */
/* div-float v15, v15, v18 */
/* invoke-static/range {v1 ..v15}, Lcom/doodlemobile/basket/util/Util;->nativeRenderRect1(JIFFFFFFFFFFFF)V */
/* invoke-virtual/range {p1 ..p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J */
/* move-result-wide v1 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v3, v0 */
v3 = (( com.doodlemobile.basket.graphics.e ) v3 ).o ( ); // invoke-virtual {v3}, Lcom/doodlemobile/basket/graphics/e;->o()I
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->j:F */
/* move v7, v0 */
/* const/high16 v8, -0x41000000 # -0.5f */
/* const/high16 v9, -0x41000000 # -0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v10, v0 */
v10 = this.q;
int v11 = 0; // const/4 v11, 0x0
/* aget-object v10, v10, v11 */
int v11 = 3; // const/4 v11, 0x3
/* aget v10, v10, v11 */
/* add-float v10, v10, v17 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->f:F */
/* move v11, v0 */
/* div-float/2addr v10, v11 */
/* add-float/2addr v9, v10 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v10, v0 */
v10 = this.q;
int v11 = 6; // const/4 v11, 0x6
/* aget-object v10, v10, v11 */
int v11 = 2; // const/4 v11, 0x2
/* aget v10, v10, v11 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->e:F */
/* move v11, v0 */
/* div-float/2addr v10, v11 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v11, v0 */
v11 = this.q;
int v12 = 6; // const/4 v12, 0x6
/* aget-object v11, v11, v12 */
int v12 = 3; // const/4 v12, 0x3
/* aget v11, v11, v12 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->f:F */
/* move v12, v0 */
/* div-float/2addr v11, v12 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v12, v0 */
v12 = this.q;
int v13 = 6; // const/4 v13, 0x6
/* aget-object v12, v12, v13 */
int v13 = 0; // const/4 v13, 0x0
/* aget v12, v12, v13 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v13, v0 */
v13 = (( com.doodlemobile.basket.graphics.e ) v13 ).b ( ); // invoke-virtual {v13}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v13, v13 */
/* div-float/2addr v12, v13 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v13, v0 */
v13 = this.q;
int v14 = 6; // const/4 v14, 0x6
/* aget-object v13, v13, v14 */
int v14 = 1; // const/4 v14, 0x1
/* aget v13, v13, v14 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v14, v0 */
v14 = (( com.doodlemobile.basket.graphics.e ) v14 ).i ( ); // invoke-virtual {v14}, Lcom/doodlemobile/basket/graphics/e;->i()I
/* int-to-float v14, v14 */
/* div-float/2addr v13, v14 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v14, v0 */
v14 = this.q;
int v15 = 6; // const/4 v15, 0x6
/* aget-object v14, v14, v15 */
int v15 = 2; // const/4 v15, 0x2
/* aget v14, v14, v15 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v15, v0 */
v15 = (( com.doodlemobile.basket.graphics.e ) v15 ).b ( ); // invoke-virtual {v15}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v15, v15 */
/* div-float/2addr v14, v15 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v15, v0 */
v15 = this.q;
/* const/16 v18, 0x6 */
/* aget-object v15, v15, v18 */
/* const/16 v18, 0x3 */
/* aget v15, v15, v18 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object/from16 v18, v0 */
v18 = /* invoke-virtual/range {v18 ..v18}, Lcom/doodlemobile/basket/graphics/e;->i()I */
/* move/from16 v0, v18 */
/* int-to-float v0, v0 */
/* move/from16 v18, v0 */
/* div-float v15, v15, v18 */
/* invoke-static/range {v1 ..v15}, Lcom/doodlemobile/basket/util/Util;->nativeRenderRect1(JIFFFFFFFFFFFF)V */
/* invoke-virtual/range {p1 ..p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J */
/* move-result-wide v1 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v3, v0 */
v3 = (( com.doodlemobile.basket.graphics.e ) v3 ).o ( ); // invoke-virtual {v3}, Lcom/doodlemobile/basket/graphics/e;->o()I
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->j:F */
/* move v7, v0 */
/* const/high16 v8, -0x41000000 # -0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v9, v0 */
v9 = this.q;
int v10 = 1; // const/4 v10, 0x1
/* aget-object v9, v9, v10 */
int v10 = 0; // const/4 v10, 0x0
/* aget v9, v9, v10 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->e:F */
/* move v10, v0 */
/* div-float/2addr v9, v10 */
/* add-float/2addr v8, v9 */
/* const/high16 v9, -0x41000000 # -0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v10, v0 */
v10 = this.q;
int v11 = 0; // const/4 v11, 0x0
/* aget-object v10, v10, v11 */
int v11 = 3; // const/4 v11, 0x3
/* aget v10, v10, v11 */
/* add-float v10, v10, v17 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->f:F */
/* move v11, v0 */
/* div-float/2addr v10, v11 */
/* add-float/2addr v9, v10 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->e:F */
/* move v10, v0 */
/* div-float v10, v16, v10 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v11, v0 */
v11 = this.q;
int v12 = 7; // const/4 v12, 0x7
/* aget-object v11, v11, v12 */
int v12 = 3; // const/4 v12, 0x3
/* aget v11, v11, v12 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->f:F */
/* move v12, v0 */
/* div-float/2addr v11, v12 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v12, v0 */
v12 = this.q;
int v13 = 7; // const/4 v13, 0x7
/* aget-object v12, v12, v13 */
int v13 = 0; // const/4 v13, 0x0
/* aget v12, v12, v13 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v13, v0 */
v13 = (( com.doodlemobile.basket.graphics.e ) v13 ).b ( ); // invoke-virtual {v13}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v13, v13 */
/* div-float/2addr v12, v13 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v13, v0 */
v13 = this.q;
int v14 = 7; // const/4 v14, 0x7
/* aget-object v13, v13, v14 */
int v14 = 1; // const/4 v14, 0x1
/* aget v13, v13, v14 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v14, v0 */
v14 = (( com.doodlemobile.basket.graphics.e ) v14 ).i ( ); // invoke-virtual {v14}, Lcom/doodlemobile/basket/graphics/e;->i()I
/* int-to-float v14, v14 */
/* div-float/2addr v13, v14 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v14, v0 */
v14 = this.q;
int v15 = 7; // const/4 v15, 0x7
/* aget-object v14, v14, v15 */
int v15 = 2; // const/4 v15, 0x2
/* aget v14, v14, v15 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v15, v0 */
v15 = (( com.doodlemobile.basket.graphics.e ) v15 ).b ( ); // invoke-virtual {v15}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v15, v15 */
/* div-float/2addr v14, v15 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v15, v0 */
v15 = this.q;
/* const/16 v18, 0x7 */
/* aget-object v15, v15, v18 */
/* const/16 v18, 0x3 */
/* aget v15, v15, v18 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object/from16 v18, v0 */
v18 = /* invoke-virtual/range {v18 ..v18}, Lcom/doodlemobile/basket/graphics/e;->i()I */
/* move/from16 v0, v18 */
/* int-to-float v0, v0 */
/* move/from16 v18, v0 */
/* div-float v15, v15, v18 */
/* invoke-static/range {v1 ..v15}, Lcom/doodlemobile/basket/util/Util;->nativeRenderRect1(JIFFFFFFFFFFFF)V */
/* invoke-virtual/range {p1 ..p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J */
/* move-result-wide v1 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v3, v0 */
v3 = (( com.doodlemobile.basket.graphics.e ) v3 ).o ( ); // invoke-virtual {v3}, Lcom/doodlemobile/basket/graphics/e;->o()I
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->j:F */
/* move v7, v0 */
/* const/high16 v8, -0x41000000 # -0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v9, v0 */
v9 = this.q;
int v10 = 0; // const/4 v10, 0x0
/* aget-object v9, v9, v10 */
int v10 = 2; // const/4 v10, 0x2
/* aget v9, v9, v10 */
/* add-float v9, v9, v16 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->e:F */
/* move v10, v0 */
/* div-float/2addr v9, v10 */
/* add-float/2addr v8, v9 */
/* const/high16 v9, -0x41000000 # -0.5f */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v10, v0 */
v10 = this.q;
int v11 = 0; // const/4 v11, 0x0
/* aget-object v10, v10, v11 */
int v11 = 3; // const/4 v11, 0x3
/* aget v10, v10, v11 */
/* add-float v10, v10, v17 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->f:F */
/* move v11, v0 */
/* div-float/2addr v10, v11 */
/* add-float/2addr v9, v10 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v10, v0 */
v10 = this.q;
/* const/16 v11, 0x8 */
/* aget-object v10, v10, v11 */
int v11 = 2; // const/4 v11, 0x2
/* aget v10, v10, v11 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->e:F */
/* move v11, v0 */
/* div-float/2addr v10, v11 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v11, v0 */
v11 = this.q;
/* const/16 v12, 0x8 */
/* aget-object v11, v11, v12 */
int v12 = 3; // const/4 v12, 0x3
/* aget v11, v11, v12 */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/d;->f:F */
/* move v12, v0 */
/* div-float/2addr v11, v12 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v12, v0 */
v12 = this.q;
/* const/16 v13, 0x8 */
/* aget-object v12, v12, v13 */
int v13 = 0; // const/4 v13, 0x0
/* aget v12, v12, v13 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v13, v0 */
v13 = (( com.doodlemobile.basket.graphics.e ) v13 ).b ( ); // invoke-virtual {v13}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v13, v13 */
/* div-float/2addr v12, v13 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v13, v0 */
v13 = this.q;
/* const/16 v14, 0x8 */
/* aget-object v13, v13, v14 */
int v14 = 1; // const/4 v14, 0x1
/* aget v13, v13, v14 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v14, v0 */
v14 = (( com.doodlemobile.basket.graphics.e ) v14 ).i ( ); // invoke-virtual {v14}, Lcom/doodlemobile/basket/graphics/e;->i()I
/* int-to-float v14, v14 */
/* div-float/2addr v13, v14 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v14, v0 */
v14 = this.q;
/* const/16 v15, 0x8 */
/* aget-object v14, v14, v15 */
int v15 = 2; // const/4 v15, 0x2
/* aget v14, v14, v15 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v15, v0 */
v15 = (( com.doodlemobile.basket.graphics.e ) v15 ).b ( ); // invoke-virtual {v15}, Lcom/doodlemobile/basket/graphics/e;->b()I
/* int-to-float v15, v15 */
/* div-float/2addr v14, v15 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v15, v0 */
v15 = this.q;
/* const/16 v16, 0x8 */
/* aget-object v15, v15, v16 */
/* const/16 v16, 0x3 */
/* aget v15, v15, v16 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object/from16 v16, v0 */
v16 = /* invoke-virtual/range {v16 ..v16}, Lcom/doodlemobile/basket/graphics/e;->i()I */
/* move/from16 v0, v16 */
/* int-to-float v0, v0 */
/* move/from16 v16, v0 */
/* div-float v15, v15, v16 */
/* invoke-static/range {v1 ..v15}, Lcom/doodlemobile/basket/util/Util;->nativeRenderRect1(JIFFFFFFFFFFFF)V */
/* goto/16 :goto_0 */
} // .end method

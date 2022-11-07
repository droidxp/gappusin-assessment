public class inal implements com.doodlemobile.basket.graphics.b {
	 /* # interfaces */
	 /* # instance fields */
	 private Integer a;
	 private com.doodlemobile.basket.opengl.NativeBuffer b;
	 private com.doodlemobile.basket.opengl.NativeBuffer c;
	 private Integer d;
	 private Float e;
	 private Float f;
	 private com.doodlemobile.basket.graphics.d g; //synthetic
	 /* # direct methods */
	 inal ( ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 this.g = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/doodlemobile/basket/graphics/a;->d:I */
		 /* iput v1, p0, Lcom/doodlemobile/basket/graphics/a;->e:F */
		 /* iput v1, p0, Lcom/doodlemobile/basket/graphics/a;->f:F */
		 /* iput p2, p0, Lcom/doodlemobile/basket/graphics/a;->a:I */
		 /* mul-int/lit8 v0, p2, 0x20 */
		 /* int-to-long v0, v0 */
		 com.doodlemobile.basket.opengl.NativeBuffer .a ( v0,v1 );
		 this.b = v0;
		 /* mul-int/lit8 v0, p2, 0x20 */
		 /* int-to-long v0, v0 */
		 com.doodlemobile.basket.opengl.NativeBuffer .a ( v0,v1 );
		 this.c = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void a ( com.doodlemobile.basket.math.MatrixStack p0, Float p1, Float p2, Float p3, Float p4 ) {
		 /* .locals 12 */
		 (( com.doodlemobile.basket.math.MatrixStack ) p1 ).d ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J
		 /* move-result-wide v0 */
		 v2 = this.b;
		 (( com.doodlemobile.basket.opengl.NativeBuffer ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/opengl/NativeBuffer;->b()J
		 /* move-result-wide v2 */
		 v4 = this.c;
		 (( com.doodlemobile.basket.opengl.NativeBuffer ) v4 ).b ( ); // invoke-virtual {v4}, Lcom/doodlemobile/basket/opengl/NativeBuffer;->b()J
		 /* move-result-wide v4 */
		 v6 = this.g;
		 v6 = this.c;
		 v6 = 		 (( com.doodlemobile.basket.graphics.e ) v6 ).o ( ); // invoke-virtual {v6}, Lcom/doodlemobile/basket/graphics/e;->o()I
		 /* iget v7, p0, Lcom/doodlemobile/basket/graphics/a;->d:I */
		 /* move v8, p2 */
		 /* move v9, p3 */
		 /* move/from16 v10, p4 */
		 /* move/from16 v11, p5 */
		 /* invoke-static/range {v0 ..v11}, Lcom/doodlemobile/basket/util/Util;->nativeRenderRects(JJJIIFFFF)V */
		 return;
	 } // .end method
	 public final void a ( com.doodlemobile.basket.math.MatrixStack p0, java.lang.Object p1 ) {
		 /* .locals 12 */
		 /* const/high16 v8, 0x3f800000 # 1.0f */
		 (( com.doodlemobile.basket.math.MatrixStack ) p1 ).d ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J
		 /* move-result-wide v0 */
		 v2 = this.b;
		 (( com.doodlemobile.basket.opengl.NativeBuffer ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/opengl/NativeBuffer;->b()J
		 /* move-result-wide v2 */
		 v4 = this.c;
		 (( com.doodlemobile.basket.opengl.NativeBuffer ) v4 ).b ( ); // invoke-virtual {v4}, Lcom/doodlemobile/basket/opengl/NativeBuffer;->b()J
		 /* move-result-wide v4 */
		 v6 = this.g;
		 v6 = this.c;
		 v6 = 		 (( com.doodlemobile.basket.graphics.e ) v6 ).o ( ); // invoke-virtual {v6}, Lcom/doodlemobile/basket/graphics/e;->o()I
		 /* iget v7, p0, Lcom/doodlemobile/basket/graphics/a;->d:I */
		 /* move v9, v8 */
		 /* move v10, v8 */
		 /* move v11, v8 */
		 /* invoke-static/range {v0 ..v11}, Lcom/doodlemobile/basket/util/Util;->nativeRenderRects(JJJIIFFFF)V */
		 return;
	 } // .end method
	 public final void a ( java.lang.CharSequence p0 ) {
		 /* .locals 22 */
		 /* move-object/from16 v0, p0 */
		 v0 = this.b;
		 /* move-object v2, v0 */
		 /* move-object/from16 v0, p0 */
		 v0 = this.c;
		 /* move-object v10, v0 */
		 /* move-object/from16 v0, p0 */
		 v0 = this.g;
		 /* move-object v3, v0 */
		 /* move-object v0, v3 */
		 /* move-object/from16 v1, p1 */
		 v3 = 		 (( com.doodlemobile.basket.graphics.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/graphics/d;->a(Ljava/lang/CharSequence;)F
		 /* neg-float v3, v3 */
		 /* const/high16 v4, 0x40000000 # 2.0f */
		 /* div-float/2addr v3, v4 */
		 /* move-object/from16 v0, p0 */
		 v0 = this.g;
		 /* move-object v4, v0 */
		 /* move-object v0, v4 */
		 /* move-object/from16 v1, p1 */
		 v4 = 		 (( com.doodlemobile.basket.graphics.d ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/graphics/d;->b(Ljava/lang/CharSequence;)F
		 /* neg-float v4, v4 */
		 /* const/high16 v5, 0x40000000 # 2.0f */
		 /* div-float v11, v4, v5 */
		 v4 = 		 /* invoke-interface/range {p1 ..p1}, Ljava/lang/CharSequence;->length()I */
		 /* move-object/from16 v0, p0 */
		 /* iget v0, v0, Lcom/doodlemobile/basket/graphics/a;->a:I */
		 /* move v5, v0 */
		 v4 = 		 java.lang.Math .min ( v4,v5 );
		 /* move v0, v4 */
		 /* move-object/from16 v1, p0 */
		 /* iput v0, v1, Lcom/doodlemobile/basket/graphics/a;->d:I */
		 int v4 = 0; // const/4 v4, 0x0
		 int v5 = 0; // const/4 v5, 0x0
		 /* const/high16 v6, 0x3f800000 # 1.0f */
		 /* move-object/from16 v0, p0 */
		 v0 = this.g;
		 /* move-object v7, v0 */
		 v7 = this.c;
		 /* iget v7, v7, Lcom/doodlemobile/basket/graphics/e;->b:I */
		 /* int-to-float v7, v7 */
		 /* div-float v12, v6, v7 */
		 /* const/high16 v6, 0x3f800000 # 1.0f */
		 /* move-object/from16 v0, p0 */
		 v0 = this.g;
		 /* move-object v7, v0 */
		 v7 = this.c;
		 /* iget v7, v7, Lcom/doodlemobile/basket/graphics/e;->c:I */
		 /* int-to-float v7, v7 */
		 /* div-float v13, v6, v7 */
		 int v6 = 0; // const/4 v6, 0x0
		 /* move v0, v6 */
		 /* move-object/from16 v1, p0 */
		 /* iput v0, v1, Lcom/doodlemobile/basket/graphics/a;->f:F */
		 int v6 = 0; // const/4 v6, 0x0
		 /* move v14, v6 */
		 /* move v15, v5 */
		 /* move/from16 v21, v4 */
		 /* move v4, v3 */
		 /* move/from16 v3, v21 */
	 } // :goto_0
	 /* move-object/from16 v0, p0 */
	 /* iget v0, v0, Lcom/doodlemobile/basket/graphics/a;->d:I */
	 /* move v5, v0 */
	 /* if-ge v14, v5, :cond_1 */
	 /* move-object/from16 v0, p0 */
	 v0 = this.g;
	 /* move-object v5, v0 */
	 v5 = this.a;
	 /* move-object/from16 v0, p1 */
	 v6 = 	 /* move v1, v14 */
	 v5 = 	 (( java.lang.String ) v5 ).indexOf ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->indexOf(I)I
	 /* if-gez v5, :cond_0 */
	 /* add-int/lit8 v5, v15, 0x1 */
	 /* move/from16 v21, v5 */
	 /* move v5, v4 */
	 /* move v4, v3 */
	 /* move/from16 v3, v21 */
} // :goto_1
/* add-int/lit8 v6, v14, 0x1 */
/* move v14, v6 */
/* move v15, v3 */
/* move v3, v4 */
/* move v4, v5 */
} // :cond_0
/* mul-int/lit8 v5, v5, 0x8 */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object v6, v0 */
v6 = this.b;
/* add-int/lit8 v7, v5, 0x1 */
/* aget v8, v6, v5 */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object v5, v0 */
v5 = this.b;
/* add-int/lit8 v6, v7, 0x1 */
/* aget v9, v5, v7 */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object v5, v0 */
v5 = this.b;
/* add-int/lit8 v7, v6, 0x1 */
/* aget v16, v5, v6 */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object v5, v0 */
v5 = this.b;
/* add-int/lit8 v6, v7, 0x1 */
/* aget v17, v5, v7 */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object v5, v0 */
v5 = this.b;
/* add-int/lit8 v7, v6, 0x1 */
/* aget v5, v5, v6 */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object v6, v0 */
v6 = this.b;
/* add-int/lit8 v18, v7, 0x1 */
/* aget v19, v6, v7 */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object v6, v0 */
v6 = this.b;
/* aget v7, v6, v18 */
/* int-to-float v5, v5 */
/* add-float v18, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object v4, v0 */
/* iget v4, v4, Lcom/doodlemobile/basket/graphics/d;->d:F */
/* mul-float v4, v4, v18 */
/* int-to-float v5, v7 */
/* add-float/2addr v5, v11 */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object v6, v0 */
/* iget v6, v6, Lcom/doodlemobile/basket/graphics/d;->d:F */
/* mul-float/2addr v5, v6 */
/* move/from16 v0, v16 */
/* int-to-float v0, v0 */
/* move v6, v0 */
/* add-float v6, v6, v18 */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object/from16 v20, v0 */
/* move-object/from16 v0, v20 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/d;->d:F */
/* move/from16 v20, v0 */
/* mul-float v6, v6, v20 */
/* add-int v7, v7, v17 */
/* int-to-float v7, v7 */
/* add-float/2addr v7, v11 */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object/from16 v20, v0 */
/* move-object/from16 v0, v20 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/d;->d:F */
/* move/from16 v20, v0 */
/* mul-float v7, v7, v20 */
/* invoke-virtual/range {v2 ..v7}, Lcom/doodlemobile/basket/opengl/NativeBuffer;->a(IFFFF)V */
/* move/from16 v0, v16 */
/* int-to-float v0, v0 */
/* move v4, v0 */
/* add-float v18, v18, v4 */
/* int-to-float v4, v8 */
/* mul-float v6, v4, v12 */
/* int-to-float v4, v9 */
/* mul-float v7, v4, v13 */
/* add-int v4, v8, v16 */
/* int-to-float v4, v4 */
/* mul-float v8, v4, v12 */
/* add-int v4, v9, v17 */
/* int-to-float v4, v4 */
/* mul-float v9, v4, v13 */
/* move-object v4, v10 */
/* move v5, v3 */
/* invoke-virtual/range {v4 ..v9}, Lcom/doodlemobile/basket/opengl/NativeBuffer;->a(IFFFF)V */
/* move/from16 v0, v19 */
/* int-to-float v0, v0 */
/* move v4, v0 */
/* add-float v4, v4, v18 */
/* add-int/lit8 v3, v3, 0x8 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/a;->f:F */
/* move v5, v0 */
/* move/from16 v0, v17 */
/* int-to-float v0, v0 */
/* move v6, v0 */
v5 = java.lang.Math .max ( v5,v6 );
/* move v0, v5 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/doodlemobile/basket/graphics/a;->f:F */
/* move v5, v4 */
/* move v4, v3 */
/* move v3, v15 */
/* goto/16 :goto_1 */
} // :cond_1
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object v2, v0 */
/* iget v2, v2, Lcom/doodlemobile/basket/graphics/d;->d:F */
/* mul-float/2addr v2, v4 */
/* move v0, v2 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/doodlemobile/basket/graphics/a;->e:F */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/a;->f:F */
/* move v2, v0 */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object v3, v0 */
/* iget v3, v3, Lcom/doodlemobile/basket/graphics/d;->d:F */
/* mul-float/2addr v2, v3 */
/* move v0, v2 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/doodlemobile/basket/graphics/a;->f:F */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/a;->d:I */
/* move v2, v0 */
/* sub-int/2addr v2, v15 */
/* move v0, v2 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/doodlemobile/basket/graphics/a;->d:I */
return;
} // .end method
public final void a ( java.lang.CharSequence p0, Float p1, Float p2 ) {
/* .locals 24 */
/* move-object/from16 v0, p0 */
v0 = this.b;
/* move-object v4, v0 */
/* move-object/from16 v0, p0 */
v0 = this.c;
/* move-object v12, v0 */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object v5, v0 */
/* move-object v0, v5 */
/* move-object/from16 v1, p1 */
v5 = (( com.doodlemobile.basket.graphics.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/basket/graphics/d;->a(Ljava/lang/CharSequence;)F
/* neg-float v5, v5 */
/* const/high16 v6, 0x40000000 # 2.0f */
/* div-float/2addr v5, v6 */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object v6, v0 */
/* move-object v0, v6 */
/* move-object/from16 v1, p1 */
/* move/from16 v2, p2 */
/* move/from16 v3, p3 */
v6 = (( com.doodlemobile.basket.graphics.d ) v0 ).a ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/doodlemobile/basket/graphics/d;->a(Ljava/lang/CharSequence;FF)F
/* neg-float v6, v6 */
/* const/high16 v7, 0x40000000 # 2.0f */
/* div-float/2addr v6, v7 */
v7 = /* invoke-interface/range {p1 ..p1}, Ljava/lang/CharSequence;->length()I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/a;->a:I */
/* move v8, v0 */
v7 = java.lang.Math .min ( v7,v8 );
/* move v0, v7 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/doodlemobile/basket/graphics/a;->d:I */
int v7 = 0; // const/4 v7, 0x0
int v8 = 0; // const/4 v8, 0x0
/* const/high16 v9, 0x3f800000 # 1.0f */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object v10, v0 */
v10 = this.c;
/* iget v10, v10, Lcom/doodlemobile/basket/graphics/e;->b:I */
/* int-to-float v10, v10 */
/* div-float v13, v9, v10 */
/* const/high16 v9, 0x3f800000 # 1.0f */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object v10, v0 */
v10 = this.c;
/* iget v10, v10, Lcom/doodlemobile/basket/graphics/e;->c:I */
/* int-to-float v10, v10 */
/* div-float v14, v9, v10 */
int v9 = 0; // const/4 v9, 0x0
/* move v0, v9 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/doodlemobile/basket/graphics/a;->e:F */
int v9 = 0; // const/4 v9, 0x0
/* move v15, v9 */
/* move/from16 v16, v8 */
/* move/from16 v23, v7 */
/* move v7, v5 */
/* move/from16 v5, v23 */
} // :goto_0
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/a;->d:I */
/* move v8, v0 */
/* if-ge v15, v8, :cond_2 */
/* move-object/from16 v0, p1 */
v8 = /* move v1, v15 */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object v9, v0 */
v9 = this.a;
v9 = (( java.lang.String ) v9 ).indexOf ( v8 ); // invoke-virtual {v9, v8}, Ljava/lang/String;->indexOf(I)I
/* if-gez v9, :cond_1 */
/* const/16 v9, 0xa */
/* if-ne v8, v9, :cond_0 */
/* add-float v6, v6, p3 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/a;->e:F */
/* move v8, v0 */
v7 = java.lang.Math .max ( v8,v7 );
/* move v0, v7 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/doodlemobile/basket/graphics/a;->e:F */
int v7 = 0; // const/4 v7, 0x0
} // :cond_0
/* add-int/lit8 v8, v16, 0x1 */
/* move/from16 v23, v8 */
/* move v8, v7 */
/* move v7, v6 */
/* move v6, v5 */
/* move/from16 v5, v23 */
} // :goto_1
/* add-int/lit8 v9, v15, 0x1 */
/* move v15, v9 */
/* move/from16 v16, v5 */
/* move v5, v6 */
/* move v6, v7 */
/* move v7, v8 */
} // :cond_1
/* mul-int/lit8 v8, v9, 0x8 */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object v9, v0 */
v9 = this.b;
/* add-int/lit8 v10, v8, 0x1 */
/* aget v11, v9, v8 */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object v8, v0 */
v8 = this.b;
/* add-int/lit8 v9, v10, 0x1 */
/* aget v17, v8, v10 */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object v8, v0 */
v8 = this.b;
/* add-int/lit8 v10, v9, 0x1 */
/* aget v18, v8, v9 */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object v8, v0 */
v8 = this.b;
/* add-int/lit8 v9, v10, 0x1 */
/* aget v19, v8, v10 */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object v8, v0 */
v8 = this.b;
/* add-int/lit8 v10, v9, 0x1 */
/* aget v8, v8, v9 */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object v9, v0 */
v9 = this.b;
/* add-int/lit8 v20, v10, 0x1 */
/* aget v21, v9, v10 */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object v9, v0 */
v9 = this.b;
/* aget v9, v9, v20 */
/* int-to-float v10, v8 */
/* add-float/2addr v10, v7 */
/* move/from16 v0, v18 */
/* int-to-float v0, v0 */
/* move/from16 v20, v0 */
/* add-float v10, v10, v20 */
/* move/from16 v0, v21 */
/* int-to-float v0, v0 */
/* move/from16 v20, v0 */
/* add-float v10, v10, v20 */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object/from16 v20, v0 */
/* move-object/from16 v0, v20 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/d;->d:F */
/* move/from16 v20, v0 */
/* mul-float v10, v10, v20 */
/* cmpl-float v10, v10, p2 */
/* if-lez v10, :cond_4 */
/* add-float v6, v6, p3 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/a;->e:F */
/* move v10, v0 */
v7 = java.lang.Math .max ( v10,v7 );
/* move v0, v7 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/doodlemobile/basket/graphics/a;->e:F */
int v7 = 0; // const/4 v7, 0x0
/* move/from16 v20, v6 */
/* move v6, v7 */
} // :goto_2
/* int-to-float v7, v8 */
/* add-float v10, v6, v7 */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object v6, v0 */
/* iget v6, v6, Lcom/doodlemobile/basket/graphics/d;->d:F */
/* mul-float/2addr v6, v10 */
/* int-to-float v7, v9 */
/* add-float v7, v7, v20 */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object v8, v0 */
/* iget v8, v8, Lcom/doodlemobile/basket/graphics/d;->d:F */
/* mul-float/2addr v7, v8 */
/* move/from16 v0, v18 */
/* int-to-float v0, v0 */
/* move v8, v0 */
/* add-float/2addr v8, v10 */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object/from16 v22, v0 */
/* move-object/from16 v0, v22 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/d;->d:F */
/* move/from16 v22, v0 */
/* mul-float v8, v8, v22 */
/* int-to-float v9, v9 */
/* add-float v9, v9, v20 */
/* move/from16 v0, v19 */
/* int-to-float v0, v0 */
/* move/from16 v22, v0 */
/* add-float v9, v9, v22 */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object/from16 v22, v0 */
/* move-object/from16 v0, v22 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/d;->d:F */
/* move/from16 v22, v0 */
/* mul-float v9, v9, v22 */
/* invoke-virtual/range {v4 ..v9}, Lcom/doodlemobile/basket/opengl/NativeBuffer;->a(IFFFF)V */
/* move/from16 v0, v18 */
/* int-to-float v0, v0 */
/* move v6, v0 */
/* add-float v22, v10, v6 */
/* int-to-float v6, v11 */
/* mul-float v8, v6, v13 */
/* move/from16 v0, v17 */
/* int-to-float v0, v0 */
/* move v6, v0 */
/* mul-float v9, v6, v14 */
/* add-int v6, v11, v18 */
/* int-to-float v6, v6 */
/* mul-float v10, v6, v13 */
/* add-int v6, v17, v19 */
/* int-to-float v6, v6 */
/* mul-float v11, v6, v14 */
/* move-object v6, v12 */
/* move v7, v5 */
/* invoke-virtual/range {v6 ..v11}, Lcom/doodlemobile/basket/opengl/NativeBuffer;->a(IFFFF)V */
/* move/from16 v0, v21 */
/* int-to-float v0, v0 */
/* move v6, v0 */
/* add-float v6, v6, v22 */
/* add-int/lit8 v5, v5, 0x8 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/a;->f:F */
/* move v7, v0 */
/* move/from16 v0, v19 */
/* int-to-float v0, v0 */
/* move v8, v0 */
v7 = java.lang.Math .max ( v7,v8 );
/* move v0, v7 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/doodlemobile/basket/graphics/a;->f:F */
/* move/from16 v7, v20 */
/* move v8, v6 */
/* move v6, v5 */
/* move/from16 v5, v16 */
/* goto/16 :goto_1 */
} // :cond_2
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/a;->e:F */
/* move v4, v0 */
v4 = java.lang.Math .max ( v4,v7 );
/* move v0, v4 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/doodlemobile/basket/graphics/a;->e:F */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/a;->e:F */
/* move v4, v0 */
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object v5, v0 */
/* iget v5, v5, Lcom/doodlemobile/basket/graphics/d;->d:F */
/* mul-float/2addr v4, v5 */
/* move v0, v4 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/doodlemobile/basket/graphics/a;->e:F */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/a;->d:I */
/* move v4, v0 */
if ( v4 != null) { // if-eqz v4, :cond_3
/* add-float v4, v6, p3 */
} // :goto_3
/* move-object/from16 v0, p0 */
v0 = this.g;
/* move-object v5, v0 */
/* iget v5, v5, Lcom/doodlemobile/basket/graphics/d;->d:F */
/* mul-float/2addr v4, v5 */
/* move v0, v4 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/doodlemobile/basket/graphics/a;->f:F */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/graphics/a;->d:I */
/* move v4, v0 */
/* sub-int v4, v4, v16 */
/* move v0, v4 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/doodlemobile/basket/graphics/a;->d:I */
return;
} // :cond_3
/* move v4, v6 */
} // :cond_4
/* move/from16 v20, v6 */
/* move v6, v7 */
/* goto/16 :goto_2 */
} // .end method

public class inal implements com.doodlemobile.basket.graphics.b {
	 /* # interfaces */
	 /* # instance fields */
	 public com.doodlemobile.basket.font.e a;
	 public Boolean b;
	 private java.lang.String c;
	 private d;
	 private Float e;
	 private Float f;
	 private Float g;
	 private Integer h;
	 private Integer i;
	 private Boolean j;
	 private Boolean k;
	 private Boolean l;
	 private com.doodlemobile.basket.font.a m;
	 private Boolean n;
	 private com.doodlemobile.basket.opengl.NativeBuffer o;
	 private com.doodlemobile.basket.opengl.NativeBuffer p;
	 private Integer q;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 3 */
		 int v2 = 1; // const/4 v2, 0x1
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput-boolean v1, p0, Lcom/doodlemobile/basket/font/c;->l:Z */
		 v0 = com.doodlemobile.basket.font.a.b;
		 this.m = v0;
		 /* iput-boolean v1, p0, Lcom/doodlemobile/basket/font/c;->n:Z */
		 /* iput-boolean v1, p0, Lcom/doodlemobile/basket/font/c;->b:Z */
		 this.c = p1;
		 this.a = p2;
		 /* iput p3, p0, Lcom/doodlemobile/basket/font/c;->g:F */
		 this.m = p4;
		 /* iput-boolean p5, p0, Lcom/doodlemobile/basket/font/c;->l:Z */
		 /* iget v0, p2, Lcom/doodlemobile/basket/font/e;->c:I */
		 /* iput v0, p0, Lcom/doodlemobile/basket/font/c;->i:I */
		 /* iget-boolean v0, p2, Lcom/doodlemobile/basket/font/e;->a:Z */
		 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/font/c;->j:Z */
		 /* iget-boolean v0, p2, Lcom/doodlemobile/basket/font/e;->b:Z */
		 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/font/c;->k:Z */
		 /* iput-boolean v2, p0, Lcom/doodlemobile/basket/font/c;->n:Z */
		 /* invoke-direct {p0}, Lcom/doodlemobile/basket/font/c;->c()V */
		 /* iput-boolean v2, p0, Lcom/doodlemobile/basket/font/c;->b:Z */
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, p2, p3, v0}, Lcom/doodlemobile/basket/font/c;-><init>(Ljava/lang/String;Lcom/doodlemobile/basket/font/e;Lcom/doodlemobile/basket/font/a;Z)V */
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput-boolean v1, p0, Lcom/doodlemobile/basket/font/c;->l:Z */
		 v0 = com.doodlemobile.basket.font.a.b;
		 this.m = v0;
		 /* iput-boolean v1, p0, Lcom/doodlemobile/basket/font/c;->n:Z */
		 /* iput-boolean v1, p0, Lcom/doodlemobile/basket/font/c;->b:Z */
		 this.c = p1;
		 this.a = p2;
		 this.m = p3;
		 /* iput-boolean p4, p0, Lcom/doodlemobile/basket/font/c;->l:Z */
		 /* iget v0, p2, Lcom/doodlemobile/basket/font/e;->c:I */
		 /* iput v0, p0, Lcom/doodlemobile/basket/font/c;->i:I */
		 /* iget-boolean v0, p2, Lcom/doodlemobile/basket/font/e;->a:Z */
		 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/font/c;->j:Z */
		 /* iget-boolean v0, p2, Lcom/doodlemobile/basket/font/e;->b:Z */
		 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/font/c;->k:Z */
		 /* iput-boolean v1, p0, Lcom/doodlemobile/basket/font/c;->n:Z */
		 /* invoke-direct {p0}, Lcom/doodlemobile/basket/font/c;->c()V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lcom/doodlemobile/basket/font/c;->b:Z */
		 return;
	 } // .end method
	 private void b ( ) {
		 /* .locals 19 */
		 /* move-object/from16 v0, p0 */
		 v0 = this.a;
		 /* move-object v2, v0 */
		 /* if-nez v2, :cond_4 */
		 /* move-object/from16 v0, p0 */
		 /* iget v0, v0, Lcom/doodlemobile/basket/font/c;->i:I */
		 /* move v2, v0 */
		 com.doodlemobile.basket.font.d .a ( v2 );
		 /* move-object v0, v2 */
		 /* move-object/from16 v1, p0 */
		 this.a = v0;
		 /* invoke-direct/range {p0 ..p0}, Lcom/doodlemobile/basket/font/c;->c()V */
	 } // :cond_0
} // :goto_0
/* move-object/from16 v0, p0 */
v0 = this.c;
/* move-object v2, v0 */
v8 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* move-object/from16 v0, p0 */
v0 = this.p;
/* move-object v2, v0 */
if ( v2 != null) { // if-eqz v2, :cond_1
	 /* move-object/from16 v0, p0 */
	 v0 = this.p;
	 /* move-object v2, v0 */
	 (( com.doodlemobile.basket.opengl.NativeBuffer ) v2 ).a ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/opengl/NativeBuffer;->a()J
	 /* move-result-wide v2 */
	 /* mul-int/lit8 v4, v8, 0x20 */
	 /* int-to-long v4, v4 */
	 /* cmp-long v2, v2, v4 */
	 /* if-gez v2, :cond_2 */
} // :cond_1
/* mul-int/lit8 v2, v8, 0x20 */
/* int-to-long v2, v2 */
com.doodlemobile.basket.opengl.NativeBuffer .a ( v2,v3 );
/* move-object v0, v2 */
/* move-object/from16 v1, p0 */
this.p = v0;
/* mul-int/lit8 v2, v8, 0x20 */
/* int-to-long v2, v2 */
com.doodlemobile.basket.opengl.NativeBuffer .a ( v2,v3 );
/* move-object v0, v2 */
/* move-object/from16 v1, p0 */
this.o = v0;
} // :cond_2
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v2, v0 */
v9 = (( com.doodlemobile.basket.font.e ) v2 ).i ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/font/e;->i()I
/* move-object/from16 v0, p0 */
v0 = this.c;
/* move-object v2, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->g:F */
/* move v3, v0 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lcom/doodlemobile/basket/font/c;->l:Z */
/* move v4, v0 */
if ( v4 != null) { // if-eqz v4, :cond_6
int v2 = 1; // const/4 v2, 0x1
} // :goto_1
/* move v0, v2 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/doodlemobile/basket/font/c;->h:I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->h:I */
/* move v2, v0 */
/* add-int/lit8 v2, v2, 0x1 */
/* new-array v2, v2, [F */
/* move-object v0, v2 */
/* move-object/from16 v1, p0 */
this.d = v0;
int v2 = 0; // const/4 v2, 0x0
/* move v0, v2 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/doodlemobile/basket/font/c;->h:I */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
/* move/from16 v18, v3 */
/* move v3, v2 */
/* move/from16 v2, v18 */
} // :goto_2
/* if-ge v2, v8, :cond_c */
/* move-object/from16 v0, p0 */
v0 = this.c;
/* move-object v4, v0 */
v4 = (( java.lang.String ) v4 ).charAt ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
(( com.doodlemobile.basket.font.e ) v5 ).a ( v4 ); // invoke-virtual {v5, v4}, Lcom/doodlemobile/basket/font/e;->a(C)Lcom/doodlemobile/basket/font/b;
/* const/16 v6, 0xa */
/* if-ne v4, v6, :cond_a */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lcom/doodlemobile/basket/font/c;->l:Z */
/* move v4, v0 */
/* if-nez v4, :cond_3 */
/* move-object/from16 v0, p0 */
v0 = this.d;
/* move-object v4, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->h:I */
/* move v5, v0 */
/* aput v3, v4, v5 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->h:I */
/* move v3, v0 */
/* add-int/lit8 v3, v3, 0x1 */
/* move v0, v3 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/doodlemobile/basket/font/c;->h:I */
int v3 = 0; // const/4 v3, 0x0
} // :cond_3
} // :goto_3
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_4
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v2, v0 */
/* iget v2, v2, Lcom/doodlemobile/basket/font/e;->c:I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->i:I */
/* move v3, v0 */
/* if-ne v2, v3, :cond_5 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lcom/doodlemobile/basket/font/c;->j:Z */
/* move v2, v0 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v3, v0 */
/* iget-boolean v3, v3, Lcom/doodlemobile/basket/font/e;->a:Z */
/* if-ne v2, v3, :cond_5 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lcom/doodlemobile/basket/font/c;->k:Z */
/* move v2, v0 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v3, v0 */
/* iget-boolean v3, v3, Lcom/doodlemobile/basket/font/e;->b:Z */
/* if-eq v2, v3, :cond_0 */
} // :cond_5
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v2, v0 */
v2 = this.e;
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->i:I */
/* move v3, v0 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
/* iget-boolean v4, v4, Lcom/doodlemobile/basket/font/e;->a:Z */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
/* iget-boolean v5, v5, Lcom/doodlemobile/basket/font/e;->b:Z */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v6, v0 */
v6 = this.d;
com.doodlemobile.basket.font.d .a ( v2,v3,v4,v5,v6 );
/* move-object v0, v2 */
/* move-object/from16 v1, p0 */
this.a = v0;
/* invoke-direct/range {p0 ..p0}, Lcom/doodlemobile/basket/font/c;->c()V */
/* goto/16 :goto_0 */
} // :cond_6
v4 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
int v5 = 0; // const/4 v5, 0x0
int v6 = 1; // const/4 v6, 0x1
/* move v0, v6 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/doodlemobile/basket/font/c;->h:I */
int v6 = 0; // const/4 v6, 0x0
/* move/from16 v18, v6 */
/* move v6, v5 */
/* move/from16 v5, v18 */
} // :goto_4
/* if-ge v5, v4, :cond_9 */
v7 = (( java.lang.String ) v2 ).charAt ( v5 ); // invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v10, v0 */
(( com.doodlemobile.basket.font.e ) v10 ).a ( v7 ); // invoke-virtual {v10, v7}, Lcom/doodlemobile/basket/font/e;->a(C)Lcom/doodlemobile/basket/font/b;
/* const/16 v11, 0xa */
/* if-ne v7, v11, :cond_7 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->h:I */
/* move v6, v0 */
/* add-int/lit8 v6, v6, 0x1 */
/* move v0, v6 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/doodlemobile/basket/font/c;->h:I */
int v6 = 0; // const/4 v6, 0x0
} // :goto_5
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_7
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lcom/doodlemobile/basket/font/c;->n:Z */
/* move v7, v0 */
if ( v7 != null) { // if-eqz v7, :cond_8
/* iget v7, v10, Lcom/doodlemobile/basket/font/b;->b:I */
/* int-to-float v7, v7 */
/* add-float/2addr v7, v6 */
/* cmpl-float v7, v7, v3 */
/* if-lez v7, :cond_8 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->h:I */
/* move v6, v0 */
/* add-int/lit8 v6, v6, 0x1 */
/* move v0, v6 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/doodlemobile/basket/font/c;->h:I */
int v6 = 0; // const/4 v6, 0x0
} // :cond_8
/* iget v7, v10, Lcom/doodlemobile/basket/font/b;->b:I */
/* add-int/lit8 v7, v7, 0x1 */
/* int-to-float v7, v7 */
/* add-float/2addr v6, v7 */
} // :cond_9
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->h:I */
/* move v2, v0 */
/* goto/16 :goto_1 */
} // :cond_a
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lcom/doodlemobile/basket/font/c;->n:Z */
/* move v4, v0 */
if ( v4 != null) { // if-eqz v4, :cond_b
/* iget v4, v5, Lcom/doodlemobile/basket/font/b;->b:I */
/* int-to-float v4, v4 */
/* add-float/2addr v4, v3 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->g:F */
/* move v6, v0 */
/* cmpl-float v4, v4, v6 */
/* if-lez v4, :cond_b */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lcom/doodlemobile/basket/font/c;->l:Z */
/* move v4, v0 */
/* if-nez v4, :cond_b */
/* move-object/from16 v0, p0 */
v0 = this.d;
/* move-object v4, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->h:I */
/* move v6, v0 */
/* aput v3, v4, v6 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->h:I */
/* move v3, v0 */
/* add-int/lit8 v3, v3, 0x1 */
/* move v0, v3 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/doodlemobile/basket/font/c;->h:I */
int v3 = 0; // const/4 v3, 0x0
} // :cond_b
/* iget v4, v5, Lcom/doodlemobile/basket/font/b;->b:I */
/* add-int/lit8 v4, v4, 0x1 */
/* int-to-float v4, v4 */
/* add-float/2addr v3, v4 */
/* goto/16 :goto_3 */
} // :cond_c
/* move-object/from16 v0, p0 */
v0 = this.d;
/* move-object v2, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->h:I */
/* move v4, v0 */
/* aput v3, v2, v4 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->h:I */
/* move v2, v0 */
/* add-int/lit8 v2, v2, 0x1 */
/* move v0, v2 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/doodlemobile/basket/font/c;->h:I */
int v2 = 0; // const/4 v2, 0x0
/* move v0, v2 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/doodlemobile/basket/font/c;->e:F */
int v2 = 0; // const/4 v2, 0x0
} // :goto_6
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->h:I */
/* move v3, v0 */
/* if-ge v2, v3, :cond_e */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->e:F */
/* move v3, v0 */
/* move-object/from16 v0, p0 */
v0 = this.d;
/* move-object v4, v0 */
/* aget v4, v4, v2 */
/* cmpg-float v3, v3, v4 */
/* if-gez v3, :cond_d */
/* move-object/from16 v0, p0 */
v0 = this.d;
/* move-object v3, v0 */
/* aget v3, v3, v2 */
/* move v0, v3 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/doodlemobile/basket/font/c;->e:F */
} // :cond_d
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_e
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->h:I */
/* move v2, v0 */
/* mul-int/2addr v2, v9 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->h:I */
/* move v3, v0 */
int v4 = 1; // const/4 v4, 0x1
/* sub-int/2addr v3, v4 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = (( com.doodlemobile.basket.font.e ) v4 ).b ( ); // invoke-virtual {v4}, Lcom/doodlemobile/basket/font/e;->b()I
/* mul-int/2addr v3, v4 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* move v0, v2 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/doodlemobile/basket/font/c;->f:F */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lcom/doodlemobile/basket/font/c;->n:Z */
/* move v2, v0 */
/* if-nez v2, :cond_f */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lcom/doodlemobile/basket/font/c;->l:Z */
/* move v2, v0 */
if ( v2 != null) { // if-eqz v2, :cond_10
} // :cond_f
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->g:F */
/* move v2, v0 */
/* neg-float v2, v2 */
/* const/high16 v3, 0x40000000 # 2.0f */
/* div-float/2addr v2, v3 */
/* move v10, v2 */
} // :goto_7
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->f:F */
/* move v2, v0 */
/* neg-float v2, v2 */
/* const/high16 v3, 0x40000000 # 2.0f */
/* div-float v11, v2, v3 */
int v2 = 0; // const/4 v2, 0x0
/* move v0, v2 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/doodlemobile/basket/font/c;->h:I */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v4 = 1; // const/4 v4, 0x1
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
int v7 = 0; // const/4 v7, 0x0
/* move v12, v7 */
/* move v13, v6 */
/* move v14, v3 */
/* move v3, v5 */
/* move/from16 v18, v4 */
/* move v4, v2 */
/* move/from16 v2, v18 */
} // :goto_8
/* if-ge v12, v8, :cond_17 */
/* move-object/from16 v0, p0 */
v0 = this.c;
/* move-object v5, v0 */
v5 = (( java.lang.String ) v5 ).charAt ( v12 ); // invoke-virtual {v5, v12}, Ljava/lang/String;->charAt(I)C
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v6, v0 */
(( com.doodlemobile.basket.font.e ) v6 ).a ( v5 ); // invoke-virtual {v6, v5}, Lcom/doodlemobile/basket/font/e;->a(C)Lcom/doodlemobile/basket/font/b;
if ( v2 != null) { // if-eqz v2, :cond_19
/* move-object/from16 v0, p0 */
v0 = this.m;
/* move-object v2, v0 */
v4 = com.doodlemobile.basket.font.a.a;
/* if-ne v2, v4, :cond_11 */
int v2 = 0; // const/4 v2, 0x0
} // :goto_9
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->h:I */
/* move v4, v0 */
/* add-int/lit8 v4, v4, 0x1 */
/* move v0, v4 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/doodlemobile/basket/font/c;->h:I */
int v4 = 0; // const/4 v4, 0x0
/* move/from16 v16, v4 */
/* move/from16 v17, v2 */
} // :goto_a
/* const/16 v2, 0xa */
/* if-ne v5, v2, :cond_15 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lcom/doodlemobile/basket/font/c;->l:Z */
/* move v2, v0 */
/* if-nez v2, :cond_18 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v2, v0 */
v2 = (( com.doodlemobile.basket.font.e ) v2 ).i ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/font/e;->i()I
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = (( com.doodlemobile.basket.font.e ) v4 ).b ( ); // invoke-virtual {v4}, Lcom/doodlemobile/basket/font/e;->b()I
/* add-int/2addr v2, v4 */
/* int-to-float v2, v2 */
/* add-float/2addr v2, v14 */
int v4 = 1; // const/4 v4, 0x1
/* add-int/lit8 v5, v13, 0x1 */
/* move v6, v2 */
/* move/from16 v7, v17 */
/* move v2, v12 */
/* move/from16 v18, v4 */
/* move v4, v3 */
/* move v3, v5 */
/* move/from16 v5, v18 */
} // :goto_b
/* add-int/lit8 v2, v2, 0x1 */
/* move v12, v2 */
/* move v13, v3 */
/* move v14, v6 */
/* move v2, v5 */
/* move v3, v4 */
/* move v4, v7 */
} // :cond_10
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->e:F */
/* move v2, v0 */
/* neg-float v2, v2 */
/* const/high16 v3, 0x40000000 # 2.0f */
/* div-float/2addr v2, v3 */
/* move v10, v2 */
/* goto/16 :goto_7 */
} // :cond_11
/* move-object/from16 v0, p0 */
v0 = this.m;
/* move-object v2, v0 */
v4 = com.doodlemobile.basket.font.a.b;
/* if-ne v2, v4, :cond_13 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lcom/doodlemobile/basket/font/c;->n:Z */
/* move v2, v0 */
if ( v2 != null) { // if-eqz v2, :cond_12
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->g:F */
/* move v2, v0 */
/* move-object/from16 v0, p0 */
v0 = this.d;
/* move-object v4, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->h:I */
/* move v6, v0 */
/* aget v4, v4, v6 */
/* sub-float/2addr v2, v4 */
/* const/high16 v4, 0x40000000 # 2.0f */
/* div-float/2addr v2, v4 */
} // :cond_12
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->e:F */
/* move v2, v0 */
/* move-object/from16 v0, p0 */
v0 = this.d;
/* move-object v4, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->h:I */
/* move v6, v0 */
/* aget v4, v4, v6 */
/* sub-float/2addr v2, v4 */
/* const/high16 v4, 0x40000000 # 2.0f */
/* div-float/2addr v2, v4 */
/* goto/16 :goto_9 */
} // :cond_13
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lcom/doodlemobile/basket/font/c;->n:Z */
/* move v2, v0 */
if ( v2 != null) { // if-eqz v2, :cond_14
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->g:F */
/* move v2, v0 */
/* move-object/from16 v0, p0 */
v0 = this.d;
/* move-object v4, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->h:I */
/* move v6, v0 */
/* aget v4, v4, v6 */
/* sub-float/2addr v2, v4 */
/* goto/16 :goto_9 */
} // :cond_14
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->e:F */
/* move v2, v0 */
/* move-object/from16 v0, p0 */
v0 = this.d;
/* move-object v4, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->h:I */
/* move v6, v0 */
/* aget v4, v4, v6 */
/* sub-float/2addr v2, v4 */
/* goto/16 :goto_9 */
} // :cond_15
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lcom/doodlemobile/basket/font/c;->l:Z */
/* move v2, v0 */
/* if-nez v2, :cond_16 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lcom/doodlemobile/basket/font/c;->n:Z */
/* move v2, v0 */
if ( v2 != null) { // if-eqz v2, :cond_16
/* iget v2, v15, Lcom/doodlemobile/basket/font/b;->b:I */
/* int-to-float v2, v2 */
/* add-float v2, v2, v17 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/font/c;->g:F */
/* move v4, v0 */
/* cmpl-float v2, v2, v4 */
/* if-lez v2, :cond_16 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v2, v0 */
v2 = (( com.doodlemobile.basket.font.e ) v2 ).i ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/font/e;->i()I
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v4, v0 */
v4 = (( com.doodlemobile.basket.font.e ) v4 ).b ( ); // invoke-virtual {v4}, Lcom/doodlemobile/basket/font/e;->b()I
/* add-int/2addr v2, v4 */
/* int-to-float v2, v2 */
/* add-float/2addr v2, v14 */
int v4 = 1; // const/4 v4, 0x1
/* add-int/lit8 v5, v12, -0x1 */
/* move v6, v2 */
/* move/from16 v7, v17 */
/* move v2, v5 */
/* move v5, v4 */
/* move v4, v3 */
/* move v3, v13 */
/* goto/16 :goto_b */
} // :cond_16
/* iget v2, v15, Lcom/doodlemobile/basket/font/b;->c:I */
/* int-to-float v2, v2 */
/* add-float v6, v17, v2 */
/* int-to-float v2, v9 */
/* add-float v7, v14, v2 */
/* move-object/from16 v0, p0 */
v0 = this.p;
/* move-object v2, v0 */
/* add-float v4, v17, v10 */
/* add-float v5, v14, v11 */
/* add-float/2addr v6, v10 */
/* add-float/2addr v7, v11 */
/* invoke-virtual/range {v2 ..v7}, Lcom/doodlemobile/basket/opengl/NativeBuffer;->a(IFFFF)V */
/* iget v2, v15, Lcom/doodlemobile/basket/font/b;->d:F */
/* iget v4, v15, Lcom/doodlemobile/basket/font/b;->g:F */
/* add-float v6, v2, v4 */
/* iget v2, v15, Lcom/doodlemobile/basket/font/b;->e:F */
/* iget v4, v15, Lcom/doodlemobile/basket/font/b;->f:F */
/* add-float v7, v2, v4 */
/* move-object/from16 v0, p0 */
v0 = this.o;
/* move-object v2, v0 */
/* iget v4, v15, Lcom/doodlemobile/basket/font/b;->d:F */
/* iget v5, v15, Lcom/doodlemobile/basket/font/b;->e:F */
/* invoke-virtual/range {v2 ..v7}, Lcom/doodlemobile/basket/opengl/NativeBuffer;->a(IFFFF)V */
/* add-int/lit8 v2, v3, 0x8 */
/* iget v3, v15, Lcom/doodlemobile/basket/font/b;->b:I */
/* add-int/lit8 v3, v3, 0x1 */
/* int-to-float v3, v3 */
/* add-float v3, v3, v17 */
/* move v4, v2 */
/* move/from16 v5, v16 */
/* move v6, v14 */
/* move v7, v3 */
/* move v2, v12 */
/* move v3, v13 */
/* goto/16 :goto_b */
} // :cond_17
/* sub-int v2, v8, v13 */
/* move v0, v2 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/doodlemobile/basket/font/c;->q:I */
int v2 = 0; // const/4 v2, 0x0
/* move v0, v2 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lcom/doodlemobile/basket/font/c;->b:Z */
return;
} // :cond_18
/* move v2, v12 */
/* move v4, v3 */
/* move/from16 v5, v16 */
/* move v6, v14 */
/* move/from16 v7, v17 */
/* move v3, v13 */
/* goto/16 :goto_b */
} // :cond_19
/* move/from16 v16, v2 */
/* move/from16 v17, v4 */
/* goto/16 :goto_a */
} // .end method
private void c ( ) {
/* .locals 4 */
v0 = this.c;
v0 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_0 */
v2 = this.c;
v2 = (( java.lang.String ) v2 ).charAt ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C
v3 = this.a;
(( com.doodlemobile.basket.font.e ) v3 ).a ( v2 ); // invoke-virtual {v3, v2}, Lcom/doodlemobile/basket/font/e;->a(C)Lcom/doodlemobile/basket/font/b;
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
return;
} // .end method
/* # virtual methods */
public final Float a ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/font/c;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* invoke-direct {p0}, Lcom/doodlemobile/basket/font/c;->b()V */
} // :cond_0
/* iget v0, p0, Lcom/doodlemobile/basket/font/c;->e:F */
} // .end method
public final void a ( Float p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput p1, p0, Lcom/doodlemobile/basket/font/c;->g:F */
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/font/c;->n:Z */
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/font/c;->b:Z */
return;
} // .end method
public final void a ( Integer p0 ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/font/c;->i:I */
/* if-eq v0, p1, :cond_0 */
/* iput p1, p0, Lcom/doodlemobile/basket/font/c;->i:I */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/font/c;->b:Z */
} // :cond_0
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 1 */
v0 = this.m;
/* if-eq v0, p1, :cond_0 */
this.m = p1;
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/font/c;->b:Z */
} // :cond_0
return;
} // .end method
public final void a ( com.doodlemobile.basket.math.MatrixStack p0, Float p1, Float p2, Float p3, Float p4 ) {
/* .locals 12 */
v0 = this.a;
v6 = (( com.doodlemobile.basket.font.e ) v0 ).k ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/font/e;->k()I
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/font/c;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* invoke-direct {p0}, Lcom/doodlemobile/basket/font/c;->b()V */
} // :cond_0
(( com.doodlemobile.basket.math.MatrixStack ) p1 ).d ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J
/* move-result-wide v0 */
v2 = this.p;
(( com.doodlemobile.basket.opengl.NativeBuffer ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/opengl/NativeBuffer;->b()J
/* move-result-wide v2 */
v4 = this.o;
(( com.doodlemobile.basket.opengl.NativeBuffer ) v4 ).b ( ); // invoke-virtual {v4}, Lcom/doodlemobile/basket/opengl/NativeBuffer;->b()J
/* move-result-wide v4 */
/* iget v7, p0, Lcom/doodlemobile/basket/font/c;->q:I */
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
v0 = this.a;
v6 = (( com.doodlemobile.basket.font.e ) v0 ).k ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/font/e;->k()I
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/font/c;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* invoke-direct {p0}, Lcom/doodlemobile/basket/font/c;->b()V */
} // :cond_0
(( com.doodlemobile.basket.math.MatrixStack ) p1 ).d ( ); // invoke-virtual {p1}, Lcom/doodlemobile/basket/math/MatrixStack;->d()J
/* move-result-wide v0 */
v2 = this.p;
(( com.doodlemobile.basket.opengl.NativeBuffer ) v2 ).b ( ); // invoke-virtual {v2}, Lcom/doodlemobile/basket/opengl/NativeBuffer;->b()J
/* move-result-wide v2 */
v4 = this.o;
(( com.doodlemobile.basket.opengl.NativeBuffer ) v4 ).b ( ); // invoke-virtual {v4}, Lcom/doodlemobile/basket/opengl/NativeBuffer;->b()J
/* move-result-wide v4 */
/* iget v7, p0, Lcom/doodlemobile/basket/font/c;->q:I */
/* move v9, v8 */
/* move v10, v8 */
/* move v11, v8 */
/* invoke-static/range {v0 ..v11}, Lcom/doodlemobile/basket/util/Util;->nativeRenderRects(JJJIIFFFF)V */
return;
} // .end method
public final void a ( java.lang.String p0 ) {
/* .locals 1 */
v0 = this.c;
/* if-eq v0, p1, :cond_0 */
this.c = p1;
/* invoke-direct {p0}, Lcom/doodlemobile/basket/font/c;->c()V */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/font/c;->b:Z */
} // :cond_0
return;
} // .end method
public final void a ( Boolean p0 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/font/c;->l:Z */
/* if-eq v0, p1, :cond_0 */
/* iput-boolean p1, p0, Lcom/doodlemobile/basket/font/c;->l:Z */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/font/c;->b:Z */
} // :cond_0
return;
} // .end method

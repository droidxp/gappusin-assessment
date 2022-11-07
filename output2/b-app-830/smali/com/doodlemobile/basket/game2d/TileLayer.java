public class com.doodlemobile.basket.game2d.TileLayer extends com.doodlemobile.basket.game2d.h implements com.doodlemobile.basket.b.d {
	 /* # interfaces */
	 /* # instance fields */
	 com.doodlemobile.basket.graphics.e h;
	 private i;
	 private Integer j;
	 private Integer k;
	 private Integer l;
	 private Integer m;
	 private Integer n;
	 private Integer o;
	 private Boolean p;
	 private Boolean q;
	 private Integer r;
	 private Integer s;
	 private com.doodlemobile.basket.game2d.f t;
	 private Boolean u;
	 private Boolean v;
	 /* # direct methods */
	 static void a ( Long p0, Integer p1, Long p2 ) { //synthethic
		 /* .locals 0 */
		 com.doodlemobile.basket.game2d.TileLayer .nativeRender ( p0,p1,p2,p3,p4 );
		 return;
	 } // .end method
	 static void b ( Long p0 ) { //synthethic
		 /* .locals 0 */
		 com.doodlemobile.basket.game2d.TileLayer .releaseNativeObject ( p0,p1 );
		 return;
	 } // .end method
	 private static native Long createNativeObject ( Float p0, Float p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6, Integer p7, Integer[] p8 ) {
	 } // .end method
	 private static native void nativeRender ( Long p0, Integer p1, Long p2 ) {
	 } // .end method
	 private static native void ondevicelost ( Long p0 ) {
	 } // .end method
	 private static native void preparehwresource ( Long p0 ) {
	 } // .end method
	 private static native void releaseNativeObject ( Long p0 ) {
	 } // .end method
	 /* # virtual methods */
	 public final void a ( Object p0 ) {
		 /* .locals 20 */
		 /* move-object/from16 v0, p0 */
		 v0 = this.h;
		 /* move-object v4, v0 */
		 if ( v4 != null) { // if-eqz v4, :cond_9
			 int v6 = 0; // const/4 v6, 0x0
			 /* const/16 v4, 0x2ee */
			 /* new-array v12, v4, [I */
			 /* move-object/from16 v0, p0 */
			 /* iget v0, v0, Lcom/doodlemobile/basket/game2d/TileLayer;->j:I */
			 /* move v4, v0 */
			 /* int-to-float v4, v4 */
			 /* move-object/from16 v0, p0 */
			 v0 = this.h;
			 /* move-object v5, v0 */
			 v5 = 			 (( com.doodlemobile.basket.graphics.e ) v5 ).b ( ); // invoke-virtual {v5}, Lcom/doodlemobile/basket/graphics/e;->b()I
			 /* int-to-float v5, v5 */
			 /* div-float/2addr v4, v5 */
			 /* move-object/from16 v0, p0 */
			 /* iget v0, v0, Lcom/doodlemobile/basket/game2d/TileLayer;->k:I */
			 /* move v5, v0 */
			 /* int-to-float v5, v5 */
			 /* move-object/from16 v0, p0 */
			 v0 = this.h;
			 /* move-object v7, v0 */
			 v7 = 			 (( com.doodlemobile.basket.graphics.e ) v7 ).i ( ); // invoke-virtual {v7}, Lcom/doodlemobile/basket/graphics/e;->i()I
			 /* int-to-float v7, v7 */
			 /* div-float/2addr v5, v7 */
			 int v7 = 0; // const/4 v7, 0x0
			 /* move v13, v7 */
		 } // :goto_0
		 /* move-object/from16 v0, p0 */
		 /* iget v0, v0, Lcom/doodlemobile/basket/game2d/TileLayer;->s:I */
		 /* move v7, v0 */
		 /* if-ge v13, v7, :cond_9 */
		 int v7 = 0; // const/4 v7, 0x0
		 /* move v14, v6 */
		 /* move v15, v7 */
	 } // :goto_1
	 /* move-object/from16 v0, p0 */
	 /* iget v0, v0, Lcom/doodlemobile/basket/game2d/TileLayer;->r:I */
	 /* move v6, v0 */
	 /* if-ge v15, v6, :cond_8 */
	 /* move-object/from16 v0, p0 */
	 v0 = this.t;
	 /* move-object v6, v0 */
	 /* aget-object v6, v6, v14 */
	 /* if-nez v6, :cond_5 */
	 /* mul-int/lit8 v6, v15, 0x1e */
	 /* mul-int/lit8 v7, v13, 0x19 */
	 int v8 = 0; // const/4 v8, 0x0
	 int v9 = 0; // const/4 v9, 0x0
	 int v10 = 0; // const/4 v10, 0x0
	 /* move/from16 v19, v10 */
	 /* move v10, v8 */
	 /* move/from16 v8, v19 */
} // :goto_2
/* const/16 v11, 0x19 */
/* if-ge v8, v11, :cond_4 */
/* add-int v11, v8, v7 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/TileLayer;->l:I */
/* move/from16 v16, v0 */
/* mul-int v11, v11, v16 */
/* add-int/2addr v11, v6 */
/* const/16 v16, 0x0 */
/* move/from16 v19, v16 */
/* move/from16 v16, v11 */
/* move v11, v10 */
/* move v10, v9 */
/* move/from16 v9, v19 */
} // :goto_3
/* const/16 v17, 0x1e */
/* move v0, v9 */
/* move/from16 v1, v17 */
/* if-ge v0, v1, :cond_3 */
/* add-int v17, v9, v6 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/TileLayer;->l:I */
/* move/from16 v18, v0 */
/* move/from16 v0, v17 */
/* move/from16 v1, v18 */
/* if-ge v0, v1, :cond_0 */
/* add-int v17, v8, v7 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/TileLayer;->m:I */
/* move/from16 v18, v0 */
/* move/from16 v0, v17 */
/* move/from16 v1, v18 */
/* if-lt v0, v1, :cond_2 */
} // :cond_0
/* const/16 v17, -0x1 */
/* aput v17, v12, v10 */
} // :goto_4
/* aget v17, v12, v10 */
/* const/16 v18, -0x1 */
/* move/from16 v0, v17 */
/* move/from16 v1, v18 */
/* if-eq v0, v1, :cond_1 */
/* add-int/lit8 v11, v11, 0x1 */
} // :cond_1
/* add-int/lit8 v9, v9, 0x1 */
/* add-int/lit8 v16, v16, 0x1 */
/* add-int/lit8 v10, v10, 0x1 */
} // :cond_2
/* move-object/from16 v0, p0 */
v0 = this.i;
/* move-object/from16 v17, v0 */
/* aget v17, v17, v16 */
/* aput v17, v12, v10 */
} // :cond_3
/* add-int/lit8 v8, v8, 0x1 */
/* move v9, v10 */
/* move v10, v11 */
} // :cond_4
/* if-lez v10, :cond_7 */
/* move-object/from16 v0, p0 */
v0 = this.t;
/* move-object/from16 v16, v0 */
/* new-instance v17, Lcom/doodlemobile/basket/game2d/f; */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/TileLayer;->n:I */
/* move v6, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/TileLayer;->o:I */
/* move v7, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/TileLayer;->j:I */
/* move v8, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/doodlemobile/basket/game2d/TileLayer;->k:I */
/* move v9, v0 */
/* const/16 v10, 0x1e */
/* const/16 v11, 0x19 */
/* invoke-static/range {v4 ..v12}, Lcom/doodlemobile/basket/game2d/TileLayer;->createNativeObject(FFIIIIII[I)J */
/* move-result-wide v6 */
/* move-object/from16 v0, v17 */
/* move-object/from16 v1, p0 */
/* move-wide v2, v6 */
/* invoke-direct {v0, v1, v2, v3}, Lcom/doodlemobile/basket/game2d/f;-><init>(Lcom/doodlemobile/basket/game2d/TileLayer;J)V */
/* aput-object v17, v16, v14 */
} // :cond_5
} // :goto_5
/* move-object/from16 v0, p0 */
v0 = this.t;
/* move-object v6, v0 */
/* aget-object v6, v6, v14 */
/* iget-wide v6, v6, Lcom/doodlemobile/basket/game2d/f;->a:J */
/* const-wide/16 v8, 0x0 */
/* cmp-long v6, v6, v8 */
if ( v6 != null) { // if-eqz v6, :cond_6
/* move-object/from16 v0, p0 */
v0 = this.t;
/* move-object v6, v0 */
/* aget-object v6, v6, v14 */
/* iget-wide v6, v6, Lcom/doodlemobile/basket/game2d/f;->a:J */
com.doodlemobile.basket.game2d.TileLayer .preparehwresource ( v6,v7 );
} // :cond_6
/* add-int/lit8 v6, v15, 0x1 */
/* add-int/lit8 v7, v14, 0x1 */
/* move v14, v7 */
/* move v15, v6 */
/* goto/16 :goto_1 */
} // :cond_7
/* move-object/from16 v0, p0 */
v0 = this.t;
/* move-object v6, v0 */
/* new-instance v7, Lcom/doodlemobile/basket/game2d/f; */
/* const-wide/16 v8, 0x0 */
/* move-object v0, v7 */
/* move-object/from16 v1, p0 */
/* move-wide v2, v8 */
/* invoke-direct {v0, v1, v2, v3}, Lcom/doodlemobile/basket/game2d/f;-><init>(Lcom/doodlemobile/basket/game2d/TileLayer;J)V */
/* aput-object v7, v6, v14 */
} // :cond_8
/* add-int/lit8 v6, v13, 0x1 */
/* move v13, v6 */
/* move v6, v14 */
/* goto/16 :goto_0 */
} // :cond_9
int v4 = 1; // const/4 v4, 0x1
/* move v0, v4 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lcom/doodlemobile/basket/game2d/TileLayer;->u:Z */
/* invoke-static/range {p0 ..p0}, Lcom/doodlemobile/basket/n;->a(Lcom/doodlemobile/basket/b/d;)V */
return;
} // .end method
public final void a ( Object p0 ) {
/* .locals 0 */
(( com.doodlemobile.basket.game2d.TileLayer ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lcom/doodlemobile/basket/game2d/TileLayer;->b(Lcom/doodlemobile/basket/p;)V
return;
} // .end method
public final Boolean a ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->u:Z */
} // .end method
public final void b ( ) {
/* .locals 1 */
v0 = this.h;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.h;
(( com.doodlemobile.basket.graphics.e ) v0 ).n ( ); // invoke-virtual {v0}, Lcom/doodlemobile/basket/graphics/e;->n()V
} // :cond_0
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->v:Z */
/* if-nez v0, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->v:Z */
com.doodlemobile.basket.n .b ( p0 );
} // :cond_1
return;
} // .end method
public final void b ( Object p0 ) {
/* .locals 6 */
/* const-wide/16 v4, 0x0 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->u:Z */
} // :goto_0
v1 = this.t;
/* array-length v1, v1 */
/* if-ge v0, v1, :cond_1 */
v1 = this.t;
/* aget-object v1, v1, v0 */
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.t;
/* aget-object v1, v1, v0 */
/* iget-wide v2, v1, Lcom/doodlemobile/basket/game2d/f;->a:J */
/* cmp-long v2, v2, v4 */
if ( v2 != null) { // if-eqz v2, :cond_0
/* iget-wide v2, v1, Lcom/doodlemobile/basket/game2d/f;->a:J */
com.doodlemobile.basket.game2d.TileLayer .releaseNativeObject ( v2,v3 );
/* iput-wide v4, v1, Lcom/doodlemobile/basket/game2d/f;->a:J */
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
return;
} // .end method
public final void b ( Object p0 ) {
/* .locals 14 */
int v12 = 1; // const/4 v12, 0x1
int v11 = 0; // const/4 v11, 0x0
/* const/high16 v6, 0x3f000000 # 0.5f */
int v13 = 0; // const/4 v13, 0x0
v0 = this.h;
/* if-nez v0, :cond_1 */
} // :cond_0
return;
} // :cond_1
v0 = this.b;
/* iget v1, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->j:I */
/* mul-int/lit8 v1, v1, 0x1e */
/* iget v2, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->k:I */
/* mul-int/lit8 v2, v2, 0x19 */
v3 = this.a;
/* iget v3, v3, Lcom/doodlemobile/basket/game2d/i;->b:F */
/* mul-float/2addr v3, v6 */
/* neg-float v4, v3 */
/* int-to-float v5, v1 */
/* sub-float/2addr v4, v5 */
v5 = this.a;
/* iget v5, v5, Lcom/doodlemobile/basket/game2d/i;->c:F */
/* mul-float/2addr v5, v6 */
/* neg-float v6, v5 */
/* int-to-float v7, v2 */
/* sub-float/2addr v6, v7 */
if ( v0 != null) { // if-eqz v0, :cond_14
/* iget v7, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->c:F */
/* iget v8, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->e:F */
v7 = (( com.doodlemobile.basket.game2d.g ) v0 ).a ( v7, v8 ); // invoke-virtual {v0, v7, v8}, Lcom/doodlemobile/basket/game2d/g;->a(FF)F
/* iget v8, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->d:F */
/* iget v9, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->f:F */
v0 = (( com.doodlemobile.basket.game2d.g ) v0 ).b ( v8, v9 ); // invoke-virtual {v0, v8, v9}, Lcom/doodlemobile/basket/game2d/g;->b(FF)F
} // :goto_0
/* int-to-float v8, v1 */
/* div-float v8, v7, v8 */
v8 = java.lang.Math .round ( v8 );
/* int-to-float v9, v2 */
/* div-float v9, v0, v9 */
v9 = java.lang.Math .round ( v9 );
/* iget-boolean v10, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->p:Z */
/* if-nez v10, :cond_3 */
/* if-gez v8, :cond_2 */
/* move v8, v11 */
} // :cond_2
/* iget v10, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->r:I */
/* if-lt v8, v10, :cond_3 */
/* iget v8, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->r:I */
/* sub-int/2addr v8, v12 */
} // :cond_3
/* iget-boolean v10, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->q:Z */
/* if-nez v10, :cond_5 */
/* if-gez v9, :cond_4 */
/* move v9, v11 */
} // :cond_4
/* iget v10, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->s:I */
/* if-lt v9, v10, :cond_5 */
/* iget v9, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->s:I */
/* sub-int/2addr v9, v12 */
} // :cond_5
/* move v10, v8 */
} // :cond_6
/* add-int/lit8 v10, v10, -0x1 */
/* mul-int v11, v10, v1 */
/* int-to-float v11, v11 */
/* sub-float/2addr v11, v7 */
/* iget-boolean v12, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->p:Z */
/* if-nez v12, :cond_7 */
/* if-ltz v10, :cond_8 */
} // :cond_7
/* cmpg-float v11, v11, v4 */
/* if-gez v11, :cond_6 */
} // :cond_8
/* add-int/lit8 v4, v10, 0x1 */
} // :goto_1
/* iget-boolean v10, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->p:Z */
/* if-nez v10, :cond_9 */
/* iget v10, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->r:I */
/* if-ge v8, v10, :cond_a */
} // :cond_9
/* mul-int v10, v8, v1 */
/* int-to-float v10, v10 */
/* sub-float/2addr v10, v7 */
/* cmpl-float v10, v10, v3 */
/* if-gtz v10, :cond_a */
/* add-int/lit8 v8, v8, 0x1 */
} // :cond_a
/* move v3, v9 */
} // :cond_b
/* add-int/lit8 v3, v3, -0x1 */
/* mul-int v10, v3, v2 */
/* int-to-float v10, v10 */
/* sub-float/2addr v10, v0 */
/* iget-boolean v11, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->q:Z */
/* if-nez v11, :cond_c */
/* if-ltz v3, :cond_d */
} // :cond_c
/* cmpg-float v10, v10, v6 */
/* if-gez v10, :cond_b */
} // :cond_d
/* add-int/lit8 v3, v3, 0x1 */
/* move v6, v9 */
} // :goto_2
/* iget-boolean v9, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->q:Z */
/* if-nez v9, :cond_e */
/* iget v9, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->s:I */
/* if-ge v6, v9, :cond_10 */
} // :cond_e
/* mul-int v9, v6, v2 */
/* int-to-float v9, v9 */
/* sub-float/2addr v9, v0 */
/* cmpl-float v9, v9, v5 */
/* if-gtz v9, :cond_10 */
/* add-int/lit8 v6, v6, 0x1 */
} // :cond_f
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_10
/* if-ge v4, v8, :cond_0 */
/* move v5, v3 */
} // :goto_3
/* if-ge v5, v6, :cond_f */
/* iget-boolean v9, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->p:Z */
if ( v9 != null) { // if-eqz v9, :cond_13
/* iget v9, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->r:I */
/* rem-int v9, v4, v9 */
/* iget v10, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->r:I */
/* add-int/2addr v9, v10 */
/* iget v10, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->r:I */
/* rem-int/2addr v9, v10 */
} // :goto_4
/* iget-boolean v10, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->q:Z */
if ( v10 != null) { // if-eqz v10, :cond_12
/* rem-int v10, v5, v2 */
/* add-int/2addr v10, v2 */
/* rem-int/2addr v10, v2 */
} // :goto_5
/* iget v11, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->r:I */
/* mul-int/2addr v10, v11 */
/* add-int/2addr v9, v10 */
/* mul-int v10, v4, v1 */
/* mul-int v11, v5, v2 */
/* int-to-float v10, v10 */
/* sub-float/2addr v10, v7 */
/* float-to-int v10, v10 */
/* int-to-float v11, v11 */
/* sub-float/2addr v11, v0 */
/* float-to-int v11, v11 */
/* int-to-float v10, v10 */
/* add-float/2addr v10, v13 */
/* int-to-float v11, v11 */
/* add-float/2addr v11, v13 */
v12 = this.t;
/* aget-object v9, v12, v9 */
if ( v9 != null) { // if-eqz v9, :cond_11
com.doodlemobile.basket.game2d.a .d ( );
(( com.doodlemobile.basket.game2d.d ) v12 ).b ( ); // invoke-virtual {v12}, Lcom/doodlemobile/basket/game2d/d;->b()V
this.a = v9;
/* iput v10, v12, Lcom/doodlemobile/basket/game2d/d;->b:F */
/* iput v11, v12, Lcom/doodlemobile/basket/game2d/d;->c:F */
(( com.doodlemobile.basket.p ) p1 ).a ( v12 ); // invoke-virtual {p1, v12}, Lcom/doodlemobile/basket/p;->a(Lcom/doodlemobile/basket/b/e;)V
} // :cond_11
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_12
/* move v10, v5 */
} // :cond_13
/* move v9, v4 */
} // :cond_14
/* move v0, v13 */
/* move v7, v13 */
/* goto/16 :goto_0 */
} // .end method
public final void c ( ) {
/* .locals 8 */
int v2 = 0; // const/4 v2, 0x0
/* iput-boolean v2, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->u:Z */
v0 = this.t;
/* array-length v1, v0 */
} // :goto_0
/* if-ge v2, v1, :cond_1 */
/* aget-object v3, v0, v2 */
if ( v3 != null) { // if-eqz v3, :cond_0
/* iget-wide v4, v3, Lcom/doodlemobile/basket/game2d/f;->a:J */
/* const-wide/16 v6, 0x0 */
/* cmp-long v4, v4, v6 */
if ( v4 != null) { // if-eqz v4, :cond_0
/* iget-wide v3, v3, Lcom/doodlemobile/basket/game2d/f;->a:J */
com.doodlemobile.basket.game2d.TileLayer .ondevicelost ( v3,v4 );
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
return;
} // .end method
public final Boolean d ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->v:Z */
} // .end method
public final void e ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/doodlemobile/basket/game2d/TileLayer;->v:Z */
return;
} // .end method
public final Boolean f ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public final void g ( ) {
/* .locals 0 */
return;
} // .end method
public final void h ( ) {
/* .locals 0 */
return;
} // .end method

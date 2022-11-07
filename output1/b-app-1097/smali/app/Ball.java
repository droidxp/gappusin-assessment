public class app.Ball extends v.Vphob {
	 /* .source "Ball.java" */
	 /* # static fields */
	 static final Integer BALLDIA;
	 static final Integer BALLDIASQ;
	 static final Integer BALLRAD;
	 static final Integer BALLRADSQ;
	 static final Integer BALLY;
	 static final Integer CFR_POCKET;
	 static final Integer CFR_RAIL;
	 static final Integer CFR_SLATE;
	 static final Integer FRICTION_RAIL;
	 static final Integer FRICTION_SLATE;
	 static final Integer HOLEFALL;
	 static final Integer HOLERAD;
	 static final Integer HX;
	 static final Integer HZ;
	 static final Boolean NOF;
	 static final Integer PX;
	 static final Integer PX0;
	 static final Integer PX1;
	 static final Integer PX1A;
	 static final Integer PXA;
	 static final Integer PXB;
	 static final Integer PXHOLE;
	 static final Integer PXHOLEC;
	 static final Integer PZ;
	 static final Integer PZ0;
	 static final Integer PZ1;
	 static final Integer PZA;
	 static final Integer PZB;
	 static final Integer PZH;
	 static final Integer PZHOLE;
	 static final Integer SAFE_SEP;
	 static final Integer SQRT2I;
	 static final Boolean TRACE;
	 static Integer m_distu;
	 static Integer m_distx;
	 static Integer m_disty;
	 static v.V3dMaterial m_material;
	 static final m_perimeter;
	 static m_pnormal;
	 /* # instance fields */
	 Boolean m_bounced;
	 m_rgb;
	 v.Vsprite m_shadow;
	 /* # direct methods */
	 static app.Ball ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 153 */
		 /* const/16 v0, 0x30 */
		 /* new-array v0, v0, [I */
		 /* fill-array-data v0, :array_0 */
		 /* .line 10 */
		 return;
		 /* .line 153 */
		 /* :array_0 */
		 /* .array-data 4 */
		 /* -0xa4ccc */
		 /* 0x177000 */
		 /* 0xa4ccc */
		 /* 0x177000 */
		 /* 0xc8000 */
		 /* 0x197000 */
		 /* 0xdf000 */
		 /* 0x188000 */
		 /* 0xb7000 */
		 /* 0x163333 */
		 /* 0xb7000 */
		 /* 0x17000 */
		 /* 0xe1000 */
		 /* 0x9000 */
		 /* 0xe1200 */
		 /* -0x9000 */
		 /* 0xb7000 */
		 /* -0x17000 */
		 /* 0xb7000 */
		 /* -0x163333 */
		 /* 0xdf000 */
		 /* -0x188000 */
		 /* 0xc8000 */
		 /* -0x197000 */
		 /* 0xa4ccc */
		 /* -0x177000 */
		 /* -0xa4ccc */
		 /* -0x177000 */
		 /* -0xc8000 */
		 /* -0x197000 */
		 /* -0xdf000 */
		 /* -0x188000 */
		 /* -0xb7000 */
		 /* -0x163333 */
		 /* -0xb7000 */
		 /* -0x17000 */
		 /* -0xe1000 */
		 /* -0x9000 */
		 /* -0xe1200 */
		 /* 0x9000 */
		 /* -0xb7000 */
		 /* 0x17000 */
		 /* -0xb7000 */
		 /* 0x163333 */
		 /* -0xdf000 */
		 /* 0x188000 */
		 /* -0xc8000 */
		 /* 0x197000 */
	 } // .end array-data
} // .end method
public app.Ball ( ) {
	 /* .locals 11 */
	 /* .prologue */
	 /* const v10, 0x9000 */
	 /* .line 197 */
	 /* invoke-direct {p0}, Lv/Vphob;-><init>()V */
	 /* .line 198 */
	 /* iput v10, p0, Lapp/Ball;->m_radius:I */
	 /* .line 200 */
	 /* const/high16 v8, 0x40000000 # 2.0f */
	 /* const v9, 0x3243e */
	 v9 = 	 app.Ball .fmul ( v9,v10 );
	 /* div-int/2addr v8, v9 */
	 /* iput v8, p0, Lapp/Ball;->m_inverseCircumference:I */
	 /* .line 202 */
	 v8 = app.Ball.m_pnormal;
	 /* if-nez v8, :cond_0 */
	 /* .line 207 */
	 v8 = app.Ball.m_perimeter;
	 /* array-length v3, v8 */
	 /* .line 210 */
	 /* .local v3, "n":I */
	 /* new-array v8, v3, [I */
	 /* .line 212 */
	 v8 = app.Ball.m_perimeter;
	 int v9 = 2; // const/4 v9, 0x2
	 /* sub-int v9, v3, v9 */
	 /* aget v4, v8, v9 */
	 /* .line 213 */
	 /* .local v4, "px0":I */
	 v8 = app.Ball.m_perimeter;
	 int v9 = 1; // const/4 v9, 0x1
	 /* sub-int v9, v3, v9 */
	 /* aget v6, v8, v9 */
	 /* .line 215 */
	 /* .local v6, "pz0":I */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .local v1, "i":I */
	 /* move v2, v1 */
	 /* .line 216 */
} // .end local v1 # "i":I
/* .local v2, "i":I */
} // :goto_0
/* if-lt v2, v3, :cond_1 */
/* .line 232 */
} // .end local v2 # "i":I
} // .end local v3 # "n":I
} // .end local v4 # "px0":I
} // .end local v6 # "pz0":I
} // :cond_0
return;
/* .line 217 */
/* .restart local v2 # "i":I */
/* .restart local v3 # "n":I */
/* .restart local v4 # "px0":I */
/* .restart local v6 # "pz0":I */
} // :cond_1
v8 = app.Ball.m_perimeter;
/* aget v5, v8, v2 */
/* .line 218 */
/* .local v5, "px1":I */
v8 = app.Ball.m_perimeter;
/* add-int/lit8 v9, v2, 0x1 */
/* aget v7, v8, v9 */
/* .line 221 */
/* .local v7, "pz1":I */
/* sub-int v8, v7, v6 */
/* sub-int v9, v5, v4 */
v0 = (( app.Ball ) p0 ).fatan2 ( v8, v9 ); // invoke-virtual {p0, v8, v9}, Lapp/Ball;->fatan2(II)I
/* .line 225 */
/* .local v0, "angle":I */
v8 = app.Ball.m_pnormal;
/* add-int/lit8 v1, v2, 0x1 */
} // .end local v2 # "i":I
/* .restart local v1 # "i":I */
v9 = app.Ball .fsin ( v0 );
/* aput v9, v8, v2 */
/* .line 226 */
v8 = app.Ball.m_pnormal;
/* add-int/lit8 v2, v1, 0x1 */
} // .end local v1 # "i":I
/* .restart local v2 # "i":I */
v9 = app.Ball .fcos ( v0 );
/* neg-int v9, v9 */
/* aput v9, v8, v1 */
/* .line 228 */
/* move v4, v5 */
/* .line 229 */
/* move v6, v7 */
} // .end method
static Integer distanceSquaredToLine ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5 ) {
/* .locals 10 */
/* .param p0, "xp" # I */
/* .param p1, "yp" # I */
/* .param p2, "x0" # I */
/* .param p3, "y0" # I */
/* .param p4, "x1" # I */
/* .param p5, "y1" # I */
/* .prologue */
/* const v9, 0x7fffffff */
/* .line 827 */
/* sub-int v2, p4, p2 */
/* .line 828 */
/* .local v2, "dx":I */
/* sub-int v3, p5, p3 */
/* .line 829 */
/* .local v3, "dy":I */
v7 = app.Ball .fmul ( v2,v2 );
v8 = app.Ball .fmul ( v3,v3 );
/* add-int v0, v7, v8 */
/* .line 831 */
/* .local v0, "denom":I */
/* if-nez v0, :cond_0 */
/* move v7, v9 */
/* .line 855 */
} // :goto_0
/* .line 834 */
} // :cond_0
v1 = app.Ball .finv ( v0 );
/* .line 836 */
/* .local v1, "denomi":I */
/* sub-int v7, p0, p2 */
v7 = app.Ball .fmul ( v7,v2 );
/* sub-int v8, p1, p3 */
v8 = app.Ball .fmul ( v8,v3 );
/* add-int/2addr v7, v8 */
v4 = app.Ball .fmul ( v7,v1 );
/* .line 838 */
/* .local v4, "u":I */
/* if-ltz v4, :cond_1 */
/* const v7, 0x8000 */
/* if-gt v4, v7, :cond_1 */
/* .line 840 */
/* .line 842 */
v7 = app.Ball .fmul ( v4,v2 );
/* add-int v5, p2, v7 */
/* .line 843 */
/* .local v5, "x":I */
v7 = app.Ball .fmul ( v4,v3 );
/* add-int v6, p3, v7 */
/* .line 846 */
/* .local v6, "y":I */
/* sub-int v2, v5, p0 */
/* .line 847 */
/* sub-int v3, v6, p1 */
/* .line 849 */
/* .line 850 */
/* .line 852 */
v7 = app.Ball .fmul ( v2,v2 );
v8 = app.Ball .fmul ( v3,v3 );
/* add-int/2addr v7, v8 */
} // .end local v5 # "x":I
} // .end local v6 # "y":I
} // :cond_1
/* move v7, v9 */
/* .line 855 */
} // .end method
/* # virtual methods */
public Integer collisionCheckEnvironment ( Integer p0 ) {
/* .locals 35 */
/* .param p1, "t" # I */
/* .prologue */
/* .line 259 */
/* const/16 v22, 0x0 */
/* .line 260 */
/* .local v22, "collide":Z */
/* const/16 v26, 0x0 */
/* .line 263 */
/* .local v26, "hole":Z */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Ball;->m_wx:I */
/* move/from16 v33, v0 */
/* .line 264 */
/* .local v33, "x":I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Ball;->m_wz:I */
/* move/from16 v34, v0 */
/* .line 266 */
/* .local v34, "z":I */
/* const v2, -0xb7000 */
/* move/from16 v0, v33 */
/* move v1, v2 */
/* if-lt v0, v1, :cond_0 */
/* const v2, 0xb7000 */
/* move/from16 v0, v33 */
/* move v1, v2 */
/* if-gt v0, v1, :cond_0 */
/* const v2, -0x177000 */
/* move/from16 v0, v34 */
/* move v1, v2 */
/* if-lt v0, v1, :cond_0 */
/* const v2, 0x177000 */
/* move/from16 v0, v34 */
/* move v1, v2 */
/* if-le v0, v1, :cond_6 */
/* .line 268 */
} // :cond_0
/* move-object/from16 v0, p0 */
v0 = this.m_position0;
/* move-object v2, v0 */
/* iget v3, v2, Lv/Vector;->m_x:I */
/* .line 269 */
/* .local v3, "x0":I */
/* move-object/from16 v0, p0 */
v0 = this.m_position0;
/* move-object v2, v0 */
/* iget v4, v2, Lv/Vector;->m_z:I */
/* .line 270 */
/* .local v4, "z0":I */
/* move/from16 v5, v33 */
/* .line 271 */
/* .local v5, "x1":I */
/* move/from16 v6, v34 */
/* .line 273 */
/* .local v6, "z1":I */
/* sub-int v23, v5, v3 */
/* .line 274 */
/* .local v23, "dx":I */
/* sub-int v25, v6, v4 */
/* .line 278 */
/* .local v25, "dz":I */
v29 = app.Ball.m_perimeter;
/* .line 280 */
/* .local v29, "pt":[I */
/* move-object/from16 v0, v29 */
/* array-length v0, v0 */
/* move/from16 v28, v0 */
/* .line 285 */
/* .local v28, "pn":I */
int v2 = 2; // const/4 v2, 0x2
/* sub-int v2, v28, v2 */
/* aget v7, v29, v2 */
/* .line 286 */
/* .local v7, "px0":I */
int v2 = 1; // const/4 v2, 0x1
/* sub-int v2, v28, v2 */
/* aget v8, v29, v2 */
/* .line 288 */
/* .local v8, "pz0":I */
/* const/16 v27, 0x0 */
/* .line 289 */
/* .local v27, "i":I */
} // :goto_0
/* move/from16 v0, v27 */
/* move/from16 v1, v28 */
/* if-lt v0, v1, :cond_8 */
/* .line 389 */
/* const v2, -0xc7000 */
/* move/from16 v0, v33 */
/* move v1, v2 */
/* if-lt v0, v1, :cond_1 */
/* const v2, 0xc7000 */
/* move/from16 v0, v33 */
/* move v1, v2 */
/* if-gt v0, v1, :cond_1 */
/* const v2, 0x187000 */
/* move/from16 v0, v34 */
/* move v1, v2 */
/* if-gt v0, v1, :cond_1 */
/* const v2, -0x187000 */
/* move/from16 v0, v34 */
/* move v1, v2 */
/* if-ge v0, v1, :cond_2 */
/* .line 392 */
} // :cond_1
/* const/16 v26, 0x1 */
/* .line 414 */
} // :cond_2
/* if-nez v26, :cond_6 */
/* if-nez v22, :cond_6 */
/* .line 417 */
/* const v2, -0xa4ccc */
/* move/from16 v0, v33 */
/* move v1, v2 */
/* if-le v0, v1, :cond_3 */
/* const v2, 0xa4ccc */
/* move/from16 v0, v33 */
/* move v1, v2 */
/* if-ge v0, v1, :cond_3 */
/* const v2, -0x187000 */
/* move/from16 v0, v34 */
/* move v1, v2 */
/* if-lt v0, v1, :cond_5 */
/* const v2, 0x187000 */
/* move/from16 v0, v34 */
/* move v1, v2 */
/* if-gt v0, v1, :cond_5 */
/* .line 418 */
} // :cond_3
/* const v2, 0x163333 */
/* move/from16 v0, v34 */
/* move v1, v2 */
/* if-ge v0, v1, :cond_4 */
/* const v2, 0x17000 */
/* move/from16 v0, v34 */
/* move v1, v2 */
/* if-le v0, v1, :cond_4 */
/* const v2, -0xc7000 */
/* move/from16 v0, v33 */
/* move v1, v2 */
/* if-lt v0, v1, :cond_5 */
/* const v2, 0xc7000 */
/* move/from16 v0, v33 */
/* move v1, v2 */
/* if-gt v0, v1, :cond_5 */
/* .line 419 */
} // :cond_4
/* const v2, -0x163333 */
/* move/from16 v0, v34 */
/* move v1, v2 */
/* if-le v0, v1, :cond_6 */
/* const v2, -0x17000 */
/* move/from16 v0, v34 */
/* move v1, v2 */
/* if-ge v0, v1, :cond_6 */
/* const v2, -0xc7000 */
/* move/from16 v0, v33 */
/* move v1, v2 */
/* if-lt v0, v1, :cond_5 */
/* const v2, 0xc7000 */
/* move/from16 v0, v33 */
/* move v1, v2 */
/* if-le v0, v1, :cond_6 */
/* .line 422 */
} // :cond_5
/* const/16 v26, 0x1 */
/* .line 449 */
} // .end local v3 # "x0":I
} // .end local v4 # "z0":I
} // .end local v5 # "x1":I
} // .end local v6 # "z1":I
} // .end local v7 # "px0":I
} // .end local v8 # "pz0":I
} // .end local v23 # "dx":I
} // .end local v25 # "dz":I
} // .end local v27 # "i":I
} // .end local v28 # "pn":I
} // .end local v29 # "pt":[I
} // :cond_6
/* const v2, 0xb000 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Ball;->m_wy:I */
/* move v3, v0 */
/* sub-int v24, v2, v3 */
/* .line 451 */
/* .local v24, "dy":I */
/* if-nez v26, :cond_7 */
/* if-lez v24, :cond_7 */
/* .line 453 */
/* const/16 v17, 0x0 */
/* const v18, 0x8000 */
/* const/16 v19, 0x0 */
/* const/16 v20, 0x6666 */
/* const/16 v21, 0x147 */
/* move-object/from16 v16, p0 */
v2 = /* invoke-virtual/range {v16 ..v21}, Lapp/Ball;->collision(IIIII)Z */
if ( v2 != null) { // if-eqz v2, :cond_7
/* .line 463 */
/* const/16 v2, 0x2000 */
/* move/from16 v0, v24 */
/* move v1, v2 */
/* if-gt v0, v1, :cond_e */
/* move-object/from16 v0, p0 */
v0 = this.m_velocity;
/* move-object v2, v0 */
/* iget v2, v2, Lv/Vector;->m_y:I */
/* const/high16 v3, 0x30000 */
/* if-ge v2, v3, :cond_e */
/* .line 464 */
/* const v2, 0xafff */
/* move v0, v2 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Ball;->m_wy:I */
/* .line 465 */
/* move-object/from16 v0, p0 */
v0 = this.m_velocity;
/* move-object v2, v0 */
int v3 = -1; // const/4 v3, -0x1
/* iput v3, v2, Lv/Vector;->m_y:I */
} // :cond_7
} // :goto_1
/* move/from16 v2, p1 */
/* .line 488 */
} // .end local v24 # "dy":I
} // :goto_2
/* .line 291 */
/* .restart local v3 # "x0":I */
/* .restart local v4 # "z0":I */
/* .restart local v5 # "x1":I */
/* .restart local v6 # "z1":I */
/* .restart local v7 # "px0":I */
/* .restart local v8 # "pz0":I */
/* .restart local v23 # "dx":I */
/* .restart local v25 # "dz":I */
/* .restart local v27 # "i":I */
/* .restart local v28 # "pn":I */
/* .restart local v29 # "pt":[I */
} // :cond_8
/* aget v9, v29, v27 */
/* .line 292 */
/* .local v9, "px1":I */
/* add-int/lit8 v2, v27, 0x1 */
/* aget v10, v29, v2 */
/* .local v10, "pz1":I */
/* move-object/from16 v2, p0 */
/* .line 297 */
v32 = /* invoke-virtual/range {v2 ..v10}, Lapp/Ball;->lineIntersect(IIIIIIII)I */
/* .line 300 */
/* .local v32, "u":I */
/* if-ltz v32, :cond_d */
/* const v2, 0x8000 */
/* move/from16 v0, v32 */
/* move v1, v2 */
/* if-gt v0, v1, :cond_d */
/* .line 317 */
v2 = app.Ball.m_pnormal;
/* aget v12, v2, v27 */
/* .line 318 */
/* .local v12, "nx":I */
v2 = app.Ball.m_pnormal;
/* add-int/lit8 v7, v27, 0x1 */
/* aget v14, v2, v7 */
/* .line 322 */
} // .end local v7 # "px0":I
/* .local v14, "nz":I */
/* const/16 v15, 0x6ccc */
/* .line 324 */
/* .local v15, "cfr":I */
if ( v12 != null) { // if-eqz v12, :cond_9
if ( v14 != null) { // if-eqz v14, :cond_9
/* .line 325 */
/* const/16 v15, 0x1999 */
/* .line 333 */
} // :cond_9
int v13 = 0; // const/4 v13, 0x0
/* const/16 v16, 0xa3 */
/* move-object/from16 v11, p0 */
v2 = /* invoke-virtual/range {v11 ..v16}, Lapp/Ball;->collision(IIIII)Z */
if ( v2 != null) { // if-eqz v2, :cond_d
/* .line 341 */
/* const/16 v22, 0x1 */
/* .line 343 */
/* const/16 v2, 0x6ccc */
/* if-ne v15, v2, :cond_a */
/* .line 344 */
int v2 = 1; // const/4 v2, 0x1
/* move v0, v2 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lapp/Ball;->m_bounced:Z */
/* .line 350 */
} // :cond_a
/* const v2, 0x8000 */
/* sub-int v2, v2, v32 */
/* move v0, v2 */
/* move/from16 v1, v23 */
v23 = app.Ball .fmul ( v0,v1 );
/* .line 351 */
/* const v2, 0x8000 */
/* sub-int v2, v2, v32 */
/* move v0, v2 */
/* move/from16 v1, v25 */
v25 = app.Ball .fmul ( v0,v1 );
/* .line 353 */
/* move/from16 v0, v23 */
/* move/from16 v1, v23 */
v2 = app.Ball .fmul ( v0,v1 );
/* move/from16 v0, v25 */
/* move/from16 v1, v25 */
v7 = app.Ball .fmul ( v0,v1 );
/* add-int/2addr v2, v7 */
/* const/16 v7, 0x800 */
/* if-le v2, v7, :cond_c */
/* .line 354 */
/* move/from16 v0, v32 */
/* move/from16 v1, p1 */
v30 = app.Ball .fmul ( v0,v1 );
/* .line 357 */
/* .local v30, "t0":I */
/* if-nez v30, :cond_b */
/* .line 358 */
/* const/16 v30, 0x1 */
/* .line 360 */
} // :cond_b
/* move/from16 v0, v30 */
/* move/from16 v1, p1 */
/* if-ge v0, v1, :cond_c */
/* move/from16 v2, v30 */
/* .line 361 */
/* goto/16 :goto_2 */
/* .line 366 */
} // .end local v30 # "t0":I
} // :cond_c
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Ball;->m_wx:I */
/* move v2, v0 */
/* sub-int v2, v2, v23 */
/* move v0, v2 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Ball;->m_wx:I */
/* .line 367 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Ball;->m_wz:I */
/* move v2, v0 */
/* sub-int v2, v2, v25 */
/* move v0, v2 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Ball;->m_wz:I */
/* .line 375 */
} // .end local v12 # "nx":I
} // .end local v14 # "nz":I
} // .end local v15 # "cfr":I
} // :cond_d
/* move v7, v9 */
/* .line 376 */
/* .restart local v7 # "px0":I */
/* move v8, v10 */
/* .line 377 */
/* add-int/lit8 v27, v27, 0x2 */
/* goto/16 :goto_0 */
/* .line 474 */
} // .end local v3 # "x0":I
} // .end local v4 # "z0":I
} // .end local v5 # "x1":I
} // .end local v6 # "z1":I
} // .end local v7 # "px0":I
} // .end local v8 # "pz0":I
} // .end local v9 # "px1":I
} // .end local v10 # "pz1":I
} // .end local v23 # "dx":I
} // .end local v25 # "dz":I
} // .end local v27 # "i":I
} // .end local v28 # "pn":I
} // .end local v29 # "pt":[I
} // .end local v32 # "u":I
/* .restart local v24 # "dy":I */
} // :cond_e
/* move-object/from16 v0, p0 */
v0 = this.m_position0;
/* move-object v2, v0 */
/* iget v2, v2, Lv/Vector;->m_y:I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Ball;->m_wy:I */
/* move v3, v0 */
/* sub-int v31, v2, v3 */
/* .line 475 */
/* .local v31, "ty":I */
/* move/from16 v0, v31 */
/* move/from16 v1, v24 */
/* if-le v0, v1, :cond_f */
/* .line 476 */
/* sub-int v2, v31, v24 */
/* move/from16 v0, p1 */
/* move v1, v2 */
v2 = app.Ball .fmul ( v0,v1 );
/* move v0, v2 */
/* move/from16 v1, v31 */
v2 = app.Ball .fdiv ( v0,v1 );
/* goto/16 :goto_2 */
/* .line 481 */
} // :cond_f
/* const v2, 0xafff */
/* move v0, v2 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lapp/Ball;->m_wy:I */
/* .line 482 */
/* move-object/from16 v0, p0 */
v0 = this.m_velocity;
/* move-object v2, v0 */
int v3 = -1; // const/4 v3, -0x1
/* iput v3, v2, Lv/Vector;->m_y:I */
/* goto/16 :goto_1 */
} // .end method
public Integer collisionCheckObject ( v.Vphob p0, Integer p1 ) {
/* .locals 30 */
/* .param p1, "p" # Lv/Vphob; */
/* .param p2, "t" # I */
/* .prologue */
/* .line 526 */
/* move-object/from16 v0, p0 */
v0 = this.m_position0;
/* move-object/from16 v21, v0 */
/* .line 527 */
/* .local v21, "u":Lv/Vector; */
/* move-object/from16 v0, p1 */
v0 = this.m_position0;
/* move-object/from16 v22, v0 */
/* .line 529 */
/* .local v22, "v":Lv/Vector; */
/* move-object/from16 v0, v21 */
/* iget v0, v0, Lv/Vector;->m_x:I */
/* move/from16 v24, v0 */
/* move-object/from16 v0, v22 */
/* iget v0, v0, Lv/Vector;->m_x:I */
/* move/from16 v25, v0 */
/* sub-int v12, v24, v25 */
/* .line 530 */
/* .local v12, "dx":I */
/* move-object/from16 v0, v21 */
/* iget v0, v0, Lv/Vector;->m_z:I */
/* move/from16 v24, v0 */
/* move-object/from16 v0, v22 */
/* iget v0, v0, Lv/Vector;->m_z:I */
/* move/from16 v25, v0 */
/* sub-int v14, v24, v25 */
/* .line 544 */
/* .local v14, "dz":I */
/* move-object/from16 v0, v21 */
/* iget v0, v0, Lv/Vector;->m_y:I */
/* move/from16 v24, v0 */
/* move-object/from16 v0, v22 */
/* iget v0, v0, Lv/Vector;->m_y:I */
/* move/from16 v25, v0 */
/* sub-int v13, v24, v25 */
/* .line 546 */
/* .local v13, "dy":I */
/* move-object/from16 v0, p0 */
v0 = this.m_u;
/* move-object/from16 v21, v0 */
/* .line 550 */
/* move-object/from16 v0, v21 */
/* move v1, v12 */
/* move v2, v13 */
/* move v3, v14 */
(( v.Vector ) v0 ).set ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lv/Vector;->set(III)V
/* .line 552 */
/* move-object/from16 v0, p0 */
v0 = this.m_v;
/* move-object/from16 v22, v0 */
/* .line 553 */
/* move-object/from16 v0, p0 */
v0 = this.m_velocity;
/* move-object/from16 v24, v0 */
/* move-object/from16 v0, v22 */
/* move-object/from16 v1, v24 */
(( v.Vector ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lv/Vector;->set(Lv/Vector;)V
/* .line 554 */
/* move-object/from16 v0, p1 */
v0 = this.m_velocity;
/* move-object/from16 v24, v0 */
/* move-object/from16 v0, v22 */
/* move-object/from16 v1, v24 */
(( v.Vector ) v0 ).sub ( v1 ); // invoke-virtual {v0, v1}, Lv/Vector;->sub(Lv/Vector;)V
/* .line 556 */
/* move-object/from16 v0, v22 */
/* move-object/from16 v1, v22 */
(( v.Vector ) v0 ).dotProductLong ( v1 ); // invoke-virtual {v0, v1}, Lv/Vector;->dotProductLong(Lv/Vector;)J
/* move-result-wide v4 */
/* .line 557 */
/* .local v4, "a":J */
/* const-wide/16 v24, 0x0 */
/* cmp-long v24, v4, v24 */
/* if-nez v24, :cond_0 */
/* move/from16 v24, p2 */
/* .line 691 */
} // :goto_0
/* .line 560 */
} // :cond_0
/* invoke-virtual/range {v21 ..v22}, Lv/Vector;->dotProductLong(Lv/Vector;)J */
/* move-result-wide v24 */
/* const/16 v26, 0x1 */
/* shl-long v6, v24, v26 */
/* .line 562 */
/* .local v6, "b":J */
/* move-object/from16 v0, v21 */
/* move-object/from16 v1, v21 */
(( v.Vector ) v0 ).dotProductLong ( v1 ); // invoke-virtual {v0, v1}, Lv/Vector;->dotProductLong(Lv/Vector;)J
/* move-result-wide v8 */
/* .line 568 */
/* .local v8, "c":J */
/* mul-long v24, v6, v6 */
/* const/16 v26, 0x2 */
/* shl-long v26, v4, v26 */
/* const-wide/32 v28, 0x28800 */
/* sub-long v28, v8, v28 */
/* mul-long v26, v26, v28 */
/* sub-long v24, v24, v26 */
/* const/16 v26, 0xf */
/* shr-long v16, v24, v26 */
/* .line 570 */
/* .local v16, "sq":J */
/* const-wide/16 v24, 0x0 */
/* cmp-long v24, v16, v24 */
/* if-gez v24, :cond_1 */
/* move/from16 v24, p2 */
/* .line 572 */
/* .line 587 */
} // :cond_1
/* const/16 v24, 0xe */
/* shr-long v4, v4, v24 */
/* .line 588 */
/* const-wide/16 v24, 0x0 */
/* cmp-long v24, v4, v24 */
/* if-nez v24, :cond_2 */
/* move/from16 v24, p2 */
/* .line 589 */
/* .line 591 */
} // :cond_2
v18 = /* invoke-static/range {v16 ..v17}, Lapp/Ball;->fsqrtl(J)I */
/* .line 593 */
/* .local v18, "sqrt":I */
/* move-wide v0, v6 */
/* neg-long v0, v0 */
/* move-wide/from16 v24, v0 */
/* move/from16 v0, v18 */
/* int-to-long v0, v0 */
/* move-wide/from16 v26, v0 */
/* sub-long v24, v24, v26 */
/* div-long v24, v24, v4 */
v19 = /* invoke-static/range {v24 ..v25}, Lapp/Ball;->fl2i(J)I */
/* .line 597 */
/* .local v19, "tc0":I */
/* move/from16 v0, v19 */
/* move/from16 v1, p2 */
/* if-le v0, v1, :cond_3 */
/* move/from16 v24, p2 */
/* .line 598 */
/* .line 601 */
} // :cond_3
/* if-gez v19, :cond_4 */
/* .line 603 */
/* move-wide v0, v6 */
/* neg-long v0, v0 */
/* move-wide/from16 v24, v0 */
/* move/from16 v0, v18 */
/* int-to-long v0, v0 */
/* move-wide/from16 v26, v0 */
/* add-long v24, v24, v26 */
/* div-long v24, v24, v4 */
v20 = /* invoke-static/range {v24 ..v25}, Lapp/Ball;->fl2i(J)I */
/* .line 604 */
/* .local v20, "tc1":I */
/* if-gez v20, :cond_5 */
/* move/from16 v24, p2 */
/* .line 605 */
/* .line 613 */
} // .end local v20 # "tc1":I
} // :cond_4
if ( v19 != null) { // if-eqz v19, :cond_5
/* .line 614 */
/* move/from16 v0, v19 */
/* move/from16 v1, p2 */
/* if-ge v0, v1, :cond_5 */
/* .line 615 */
/* const/16 v24, 0x1 */
/* sub-int v24, p2, v24 */
/* move/from16 v0, v19 */
/* move/from16 v1, v24 */
/* if-eq v0, v1, :cond_5 */
/* .line 616 */
/* const/16 v24, 0x2 */
/* sub-int v24, p2, v24 */
/* move/from16 v0, v19 */
/* move/from16 v1, v24 */
/* if-eq v0, v1, :cond_5 */
/* move/from16 v24, v19 */
/* .line 618 */
/* goto/16 :goto_0 */
/* .line 621 */
} // :cond_5
/* move-object/from16 v0, p0 */
v0 = this.m_collisionNormal;
/* move-object/from16 v24, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Ball;->m_wx:I */
/* move/from16 v25, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vphob;->m_wx:I */
/* move/from16 v26, v0 */
/* sub-int v25, v25, v26 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Ball;->m_wy:I */
/* move/from16 v26, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vphob;->m_wy:I */
/* move/from16 v27, v0 */
/* sub-int v26, v26, v27 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lapp/Ball;->m_wz:I */
/* move/from16 v27, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vphob;->m_wz:I */
/* move/from16 v28, v0 */
/* sub-int v27, v27, v28 */
/* invoke-virtual/range {v24 ..v27}, Lv/Vector;->set(III)V */
/* .line 628 */
/* move-object/from16 v0, p0 */
v0 = this.m_collisionNormal;
/* move-object/from16 v24, v0 */
v11 = /* invoke-virtual/range {v24 ..v24}, Lv/Vector;->magnitude()I */
/* .line 630 */
/* .local v11, "d":I */
/* const v24, 0x14000 */
/* move v0, v11 */
/* move/from16 v1, v24 */
/* if-le v0, v1, :cond_6 */
/* move/from16 v24, p2 */
/* .line 632 */
/* goto/16 :goto_0 */
/* .line 638 */
} // :cond_6
/* move-object/from16 v0, p0 */
v0 = this.m_collisionNormal;
/* move-object/from16 v24, v0 */
/* invoke-virtual/range {v24 ..v24}, Lv/Vector;->normalize()V */
/* .line 660 */
/* move-object/from16 v0, p0 */
v0 = this.m_collisionNormal;
/* move-object/from16 v24, v0 */
/* move-object/from16 v0, v22 */
/* move-object/from16 v1, v24 */
v23 = (( v.Vector ) v0 ).dotProduct ( v1 ); // invoke-virtual {v0, v1}, Lv/Vector;->dotProduct(Lv/Vector;)I
/* .line 662 */
/* .local v23, "vrn":I */
/* if-gez v23, :cond_7 */
/* .line 666 */
/* const/16 v24, 0x1 */
/* move/from16 v0, v24 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lapp/Ball;->m_collided:Z */
/* .line 669 */
/* const/16 v24, 0x1 */
/* move/from16 v0, v24 */
/* move-object/from16 v1, p1 */
/* iput-boolean v0, v1, Lv/Vphob;->m_collided:Z */
/* .line 672 */
/* const v10, 0x8000 */
/* .line 674 */
/* .local v10, "cfr":I */
/* const v24, 0x8000 */
/* add-int v24, v24, v10 */
/* move/from16 v0, v24 */
/* move/from16 v1, v23 */
v24 = app.Ball .fmul ( v0,v1 );
/* move/from16 v0, v24 */
/* neg-int v0, v0 */
/* move/from16 v24, v0 */
/* shr-int/lit8 v15, v24, 0x1 */
/* .line 677 */
/* .local v15, "j":I */
/* move-object/from16 v0, p0 */
v0 = this.m_u;
/* move-object/from16 v24, v0 */
/* move-object/from16 v0, p0 */
v0 = this.m_collisionNormal;
/* move-object/from16 v25, v0 */
/* invoke-virtual/range {v24 ..v25}, Lv/Vector;->set(Lv/Vector;)V */
/* .line 678 */
/* move-object/from16 v0, p0 */
v0 = this.m_u;
/* move-object/from16 v24, v0 */
/* move-object/from16 v0, v24 */
/* move v1, v15 */
(( v.Vector ) v0 ).multiply ( v1 ); // invoke-virtual {v0, v1}, Lv/Vector;->multiply(I)V
/* .line 687 */
/* move-object/from16 v0, p0 */
v0 = this.m_velocity;
/* move-object/from16 v24, v0 */
/* move-object/from16 v0, p0 */
v0 = this.m_u;
/* move-object/from16 v25, v0 */
/* invoke-virtual/range {v24 ..v25}, Lv/Vector;->add(Lv/Vector;)V */
/* .line 688 */
/* move-object/from16 v0, p1 */
v0 = this.m_velocity;
/* move-object/from16 v24, v0 */
/* move-object/from16 v0, p0 */
v0 = this.m_u;
/* move-object/from16 v25, v0 */
/* invoke-virtual/range {v24 ..v25}, Lv/Vector;->sub(Lv/Vector;)V */
} // .end local v10 # "cfr":I
} // .end local v15 # "j":I
} // :cond_7
/* move/from16 v24, p2 */
/* .line 691 */
/* goto/16 :goto_0 */
} // .end method
protected void draw ( Integer[] p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6 ) {
/* .locals 3 */
/* .param p1, "rgb" # [I */
/* .param p2, "width" # I */
/* .param p3, "height" # I */
/* .param p4, "x0" # I */
/* .param p5, "y0" # I */
/* .param p6, "x1" # I */
/* .param p7, "y1" # I */
/* .prologue */
/* .line 862 */
v0 = app.Ball.m_material;
/* .line 864 */
/* .local v0, "m":Lv/V3dMaterial; */
/* if-nez v0, :cond_0 */
/* .line 865 */
final String v1 = "poolball9"; // const-string v1, "poolball9"
v.V3dModel .lookupMaterial ( v1 );
/* .line 866 */
/* .line 869 */
} // :cond_0
v1 = this.m_texture;
v2 = this.m_rgb;
this.m_rgb = v2;
/* .line 871 */
/* invoke-super/range {p0 ..p7}, Lv/Vphob;->draw([IIIIIII)V */
/* .line 872 */
return;
} // .end method
Integer lineIntersect ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6, Integer p7 ) {
/* .locals 7 */
/* .param p1, "x1" # I */
/* .param p2, "y1" # I */
/* .param p3, "x2" # I */
/* .param p4, "y2" # I */
/* .param p5, "x3" # I */
/* .param p6, "y3" # I */
/* .param p7, "x4" # I */
/* .param p8, "y4" # I */
/* .prologue */
/* const v6, -0x7fffffff */
/* .line 942 */
/* sub-int v3, p8, p6 */
/* sub-int v4, p3, p1 */
v3 = app.Ball .fmul ( v3,v4 );
/* sub-int v4, p7, p5 */
/* sub-int v5, p4, p2 */
v4 = app.Ball .fmul ( v4,v5 );
/* sub-int v0, v3, v4 */
/* .line 943 */
/* .local v0, "denom":I */
/* if-nez v0, :cond_0 */
/* move v3, v6 */
/* .line 959 */
} // :goto_0
/* .line 946 */
} // :cond_0
/* sub-int v3, p7, p5 */
/* sub-int v4, p2, p6 */
v3 = app.Ball .fmul ( v3,v4 );
/* sub-int v4, p8, p6 */
/* sub-int v5, p1, p5 */
v4 = app.Ball .fmul ( v4,v5 );
/* sub-int v1, v3, v4 */
/* .line 948 */
/* .local v1, "ua":I */
/* sub-int v3, p3, p1 */
/* sub-int v4, p2, p6 */
v3 = app.Ball .fmul ( v3,v4 );
/* sub-int v4, p4, p2 */
/* sub-int v5, p1, p5 */
v4 = app.Ball .fmul ( v4,v5 );
/* sub-int v2, v3, v4 */
/* .line 950 */
/* .local v2, "ub":I */
/* if-nez v1, :cond_1 */
/* if-nez v2, :cond_1 */
/* move v3, v6 */
/* .line 951 */
/* .line 953 */
} // :cond_1
v2 = app.Ball .fdiv ( v2,v0 );
/* .line 956 */
/* if-ltz v2, :cond_2 */
/* const v3, 0x8000 */
/* if-le v2, v3, :cond_3 */
} // :cond_2
/* move v3, v6 */
/* .line 957 */
/* .line 959 */
} // :cond_3
v3 = app.Ball .fdiv ( v1,v0 );
} // .end method
public Boolean setExtent ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .param p1, "x0" # I */
/* .param p2, "y0" # I */
/* .param p3, "x1" # I */
/* .param p4, "y1" # I */
/* .prologue */
/* .line 964 */
/* sub-int v0, p4, p2 */
/* shr-int/lit8 v0, v0, 0x3 */
/* add-int/2addr v0, p4 */
v0 = /* invoke-super {p0, p1, p2, p3, v0}, Lv/Vphob;->setExtent(IIII)Z */
} // .end method
Boolean sunk ( ) {
/* .locals 2 */
/* .prologue */
/* .line 970 */
v0 = this.m_parent;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, p0, Lapp/Ball;->m_wy:I */
/* const v1, -0x19000 */
/* if-ge v0, v1, :cond_0 */
/* .line 971 */
(( app.Ball ) p0 ).off ( ); // invoke-virtual {p0}, Lapp/Ball;->off()V
/* .line 972 */
int v0 = 1; // const/4 v0, 0x1
/* .line 974 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method

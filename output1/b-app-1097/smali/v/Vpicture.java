public class v.Vpicture extends v.V {
	 /* .source "Vpicture.java" */
	 /* # static fields */
	 public static final Integer ALPHABITS;
	 public static final Integer ALPHABITSMASK;
	 public static final Integer ALPHAOPAQUE;
	 public static final Integer ALPHARUNMAX;
	 public static final Integer ALPHASHIFT;
	 static final Integer OT1;
	 public static final Integer RLEALPHA;
	 public static final Integer RLEALPHAMAX;
	 public static final Integer RLEPAL;
	 public static final Integer RLEPALSIZE;
	 public static final Integer RLESKIP;
	 public static final Integer RLESKIPMAX;
	 public static m_pal;
	 /* # instance fields */
	 Object m_height;
	 Boolean m_opaque;
	 public m_rgb;
	 Object m_type;
	 Boolean m_used;
	 Object m_width;
	 Object m_xcenter;
	 Object m_ycenter;
	 /* # direct methods */
	 public v.Vpicture ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 786 */
		 /* invoke-direct {p0}, Lv/V;-><init>()V */
		 /* .line 787 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 Integer draw ( Integer[] p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6, Integer p7, Integer p8, Integer p9, Integer p10, Integer p11 ) {
		 /* .locals 33 */
		 /* .param p1, "drgb" # [I */
		 /* .param p2, "dwidth" # I */
		 /* .param p3, "dheight" # I */
		 /* .param p4, "x0" # I */
		 /* .param p5, "y0" # I */
		 /* .param p6, "x1" # I */
		 /* .param p7, "y1" # I */
		 /* .param p8, "sx0" # I */
		 /* .param p9, "sy0" # I */
		 /* .param p10, "scale" # I */
		 /* .param p11, "z" # I */
		 /* .param p12, "alpha" # I */
		 /* .prologue */
		 /* .line 54 */
		 /* if-nez p10, :cond_0 */
		 /* .line 55 */
		 /* const/16 v30, 0x1 */
		 /* .line 297 */
	 } // :goto_0
	 /* .line 57 */
} // :cond_0
/* mul-int v9, p5, p2 */
/* .line 58 */
/* .local v9, "di":I */
/* move-object/from16 v0, p0 */
v0 = this.m_rgb;
/* move-object/from16 v23, v0 */
/* .line 59 */
/* .local v23, "srgb":[I */
/* move-object/from16 v0, p0 */
/* iget-short v0, v0, Lv/Vpicture;->m_width:S */
/* move/from16 v24, v0 */
/* .line 61 */
/* .local v24, "sw":I */
/* const v30, 0x8000 */
/* move/from16 v0, p10 */
/* move/from16 v1, v30 */
/* if-ne v0, v1, :cond_7 */
/* const v30, 0x8000 */
/* move/from16 v0, p12 */
/* move/from16 v1, v30 */
/* if-ne v0, v1, :cond_7 */
/* .line 63 */
/* add-int v9, v9, p4 */
/* .line 64 */
/* sub-int v10, p6, p4 */
/* .line 65 */
/* .local v10, "dw":I */
/* shr-int/lit8 v30, p9, 0xf */
/* sub-int v30, p5, v30 */
/* mul-int v30, v30, v24 */
/* shr-int/lit8 v31, p8, 0xf */
/* sub-int v31, p4, v31 */
/* add-int v22, v30, v31 */
/* .line 67 */
/* .local v22, "si":I */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lv/Vpicture;->m_opaque:Z */
/* move/from16 v30, v0 */
if ( v30 != null) { // if-eqz v30, :cond_3
	 /* .line 68 */
} // :goto_1
/* move/from16 v0, p5 */
/* move/from16 v1, p7 */
/* if-lt v0, v1, :cond_2 */
/* .line 161 */
} // :cond_1
/* const/16 v30, 0x0 */
/* .line 69 */
} // :cond_2
/* move-object/from16 v0, v23 */
/* move/from16 v1, v22 */
/* move-object/from16 v2, p1 */
/* move v3, v9 */
/* move v4, v10 */
java.lang.System .arraycopy ( v0,v1,v2,v3,v4 );
/* .line 70 */
/* add-int v22, v22, v24 */
/* .line 71 */
/* add-int v9, v9, p2 */
/* .line 72 */
/* add-int/lit8 p5, p5, 0x1 */
/* .line 76 */
} // :cond_3
/* const/16 v18, 0x0 */
/* .line 79 */
/* .local v18, "n":I */
/* sub-int v24, v24, v10 */
/* .line 80 */
/* sub-int p2, p2, v10 */
/* .line 82 */
} // :goto_2
/* move/from16 v0, p5 */
/* move/from16 v1, p7 */
/* if-ge v0, v1, :cond_1 */
/* .line 83 */
/* move/from16 v26, v10 */
/* .line 84 */
/* .local v26, "w":I */
} // :goto_3
/* if-gtz v26, :cond_4 */
/* .line 156 */
/* add-int v22, v22, v24 */
/* .line 157 */
/* add-int v9, v9, p2 */
/* .line 158 */
/* add-int/lit8 p5, p5, 0x1 */
/* .line 85 */
} // :cond_4
/* aget v7, v23, v22 */
/* .line 88 */
/* .local v7, "c0":I */
/* ushr-int/lit8 v30, v7, 0x1d */
/* packed-switch v30, :pswitch_data_0 */
/* .line 95 */
/* :pswitch_0 */
/* shr-int/lit8 v30, v7, 0x18 */
/* add-int/lit8 v18, v30, 0x1 */
/* .line 96 */
/* move/from16 v0, v18 */
/* move/from16 v1, v26 */
/* if-le v0, v1, :cond_5 */
/* .line 97 */
/* move/from16 v18, v26 */
/* .line 98 */
} // :cond_5
/* sub-int v26, v26, v18 */
/* .line 99 */
/* add-int v22, v22, v18 */
/* .line 100 */
/* add-int v9, v9, v18 */
/* .line 101 */
/* .line 105 */
/* :pswitch_1 */
/* aget v8, p1, v9 */
/* .line 110 */
/* .local v8, "c1":I */
/* shr-int/lit8 v30, v8, 0x3 */
/* const v31, 0x1f1f1f */
/* and-int v30, v30, v31 */
/* sub-int v30, v8, v30 */
/* add-int v30, v30, v7 */
/* aput v30, p1, v9 */
/* .line 112 */
/* add-int/lit8 v26, v26, -0x1 */
/* .line 113 */
/* add-int/lit8 v22, v22, 0x1 */
/* .line 114 */
/* add-int/lit8 v9, v9, 0x1 */
/* .line 115 */
/* .line 119 */
} // .end local v8 # "c1":I
/* :pswitch_2 */
/* aget v30, p1, v9 */
/* shr-int/lit8 v30, v30, 0x2 */
/* const v31, 0x3f3f3f */
/* and-int v8, v30, v31 */
/* .line 120 */
/* .restart local v8 # "c1":I */
/* add-int v30, v7, v8 */
/* add-int v30, v30, v8 */
/* add-int v30, v30, v8 */
/* aput v30, p1, v9 */
/* .line 121 */
/* add-int/lit8 v26, v26, -0x1 */
/* .line 122 */
/* add-int/lit8 v22, v22, 0x1 */
/* .line 123 */
/* add-int/lit8 v9, v9, 0x1 */
/* .line 124 */
/* .line 129 */
} // .end local v8 # "c1":I
/* :pswitch_3 */
/* aget v30, p1, v9 */
/* shr-int/lit8 v30, v30, 0x1 */
/* const v31, 0x7f7f7f */
/* and-int v30, v30, v31 */
/* add-int v30, v30, v7 */
/* aput v30, p1, v9 */
/* .line 130 */
/* add-int/lit8 v26, v26, -0x1 */
/* .line 131 */
/* add-int/lit8 v22, v22, 0x1 */
/* .line 132 */
/* add-int/lit8 v9, v9, 0x1 */
/* .line 133 */
/* .line 138 */
/* :pswitch_4 */
/* aget v30, p1, v9 */
/* shr-int/lit8 v30, v30, 0x2 */
/* const v31, 0x3f3f3f */
/* and-int v30, v30, v31 */
/* add-int v30, v30, v7 */
/* aput v30, p1, v9 */
/* .line 139 */
/* add-int/lit8 v26, v26, -0x1 */
/* .line 140 */
/* add-int/lit8 v22, v22, 0x1 */
/* .line 141 */
/* add-int/lit8 v9, v9, 0x1 */
/* .line 142 */
/* .line 146 */
/* :pswitch_5 */
/* shr-int/lit8 v30, v7, 0x18 */
/* and-int/lit8 v30, v30, 0x1f */
/* add-int/lit8 v18, v30, 0x1 */
/* .line 147 */
/* move/from16 v0, v18 */
/* move/from16 v1, v26 */
/* if-le v0, v1, :cond_6 */
/* .line 148 */
/* move/from16 v18, v26 */
/* .line 149 */
} // :cond_6
/* move-object/from16 v0, v23 */
/* move/from16 v1, v22 */
/* move-object/from16 v2, p1 */
/* move v3, v9 */
/* move/from16 v4, v18 */
java.lang.System .arraycopy ( v0,v1,v2,v3,v4 );
/* .line 150 */
/* sub-int v26, v26, v18 */
/* .line 151 */
/* add-int v22, v22, v18 */
/* .line 152 */
/* add-int v9, v9, v18 */
/* goto/16 :goto_3 */
/* .line 164 */
} // .end local v7 # "c0":I
} // .end local v10 # "dw":I
} // .end local v18 # "n":I
} // .end local v22 # "si":I
} // .end local v26 # "w":I
} // :cond_7
/* const/16 v29, 0x0 */
/* .line 173 */
/* .local v29, "zclipped":I */
/* const/high16 v30, 0x40000000 # 2.0f */
/* div-int v21, v30, p10 */
/* .line 178 */
/* .local v21, "scalei":I */
/* shr-int/lit8 v30, p8, 0xf */
/* sub-int v30, p4, v30 */
/* mul-int v16, v30, p10 */
/* .line 179 */
/* .local v16, "ix0":I */
/* shr-int/lit8 v30, p9, 0xf */
/* sub-int v30, p5, v30 */
/* mul-int v17, v30, p10 */
/* .line 181 */
/* .local v17, "iy":I */
/* shl-int/lit8 v28, p11, 0x18 */
/* .line 183 */
/* .local v28, "z0":I */
} // :goto_4
/* move/from16 v0, p5 */
/* move/from16 v1, p7 */
/* if-lt v0, v1, :cond_8 */
/* move/from16 v30, v29 */
/* .line 297 */
/* goto/16 :goto_0 */
/* .line 185 */
} // :cond_8
/* shr-int/lit8 v30, v17, 0xf */
/* mul-int v22, v30, v24 */
/* .line 186 */
/* .restart local v22 # "si":I */
/* add-int v17, v17, p10 */
/* .line 188 */
/* move/from16 v15, v16 */
/* .line 190 */
/* .local v15, "ix":I */
/* move/from16 v27, p4 */
/* .local v27, "x":I */
} // :goto_5
/* move/from16 v0, v27 */
/* move/from16 v1, p6 */
/* if-lt v0, v1, :cond_9 */
/* .line 294 */
/* add-int v9, v9, p2 */
/* .line 295 */
/* add-int/lit8 p5, p5, 0x1 */
/* .line 193 */
} // :cond_9
/* shr-int/lit8 v30, v15, 0xf */
/* add-int v30, v30, v22 */
/* aget v7, v23, v30 */
/* .line 194 */
/* .restart local v7 # "c0":I */
/* add-int v15, v15, p10 */
/* .line 197 */
/* ushr-int/lit8 v25, v7, 0x1d */
/* .line 200 */
/* .local v25, "t":I */
if ( v25 != null) { // if-eqz v25, :cond_f
/* .line 201 */
/* add-int v14, v9, v27 */
/* .line 203 */
/* .local v14, "i":I */
/* aget v8, p1, v14 */
/* .line 218 */
/* .restart local v8 # "c1":I */
/* const v30, 0x8000 */
/* move/from16 v0, p12 */
/* move/from16 v1, v30 */
/* if-eq v0, v1, :cond_b */
/* .line 224 */
/* shr-int/lit8 v30, v7, 0x10 */
/* move/from16 v0, v30 */
/* and-int/lit16 v0, v0, 0xff */
/* move/from16 v30, v0 */
/* mul-int v19, v30, p12 */
/* .line 225 */
/* .local v19, "r0":I */
/* shr-int/lit8 v30, v7, 0x8 */
/* move/from16 v0, v30 */
/* and-int/lit16 v0, v0, 0xff */
/* move/from16 v30, v0 */
/* mul-int v12, v30, p12 */
/* .line 226 */
/* .local v12, "g0":I */
/* move v0, v7 */
/* and-int/lit16 v0, v0, 0xff */
/* move/from16 v30, v0 */
/* mul-int v5, v30, p12 */
/* .line 231 */
/* .local v5, "b0":I */
/* const/16 v30, 0x7 */
/* move/from16 v0, v25 */
/* move/from16 v1, v30 */
/* if-ne v0, v1, :cond_a */
/* .line 232 */
/* const v30, 0x8000 */
/* sub-int v11, v30, p12 */
/* .line 236 */
/* .local v11, "frac":I */
} // :goto_6
/* shr-int/lit8 v30, v8, 0x10 */
/* move/from16 v0, v30 */
/* and-int/lit16 v0, v0, 0xff */
/* move/from16 v30, v0 */
/* mul-int v20, v30, v11 */
/* .line 237 */
/* .local v20, "r1":I */
/* shr-int/lit8 v30, v8, 0x8 */
/* move/from16 v0, v30 */
/* and-int/lit16 v0, v0, 0xff */
/* move/from16 v30, v0 */
/* mul-int v13, v30, v11 */
/* .line 238 */
/* .local v13, "g1":I */
/* move v0, v8 */
/* and-int/lit16 v0, v0, 0xff */
/* move/from16 v30, v0 */
/* mul-int v6, v30, v11 */
/* .line 240 */
/* .local v6, "b1":I */
/* add-int v30, v19, v20 */
/* shr-int/lit8 v19, v30, 0xf */
/* .line 241 */
/* add-int v30, v12, v13 */
/* shr-int/lit8 v12, v30, 0xf */
/* .line 242 */
/* add-int v30, v5, v6 */
/* shr-int/lit8 v5, v30, 0xf */
/* .line 244 */
/* shl-int/lit8 v30, v19, 0x10 */
/* shl-int/lit8 v31, v12, 0x8 */
/* add-int v30, v30, v31 */
/* add-int v30, v30, v5 */
/* aput v30, p1, v14 */
/* .line 190 */
} // .end local v5 # "b0":I
} // .end local v6 # "b1":I
} // .end local v8 # "c1":I
} // .end local v11 # "frac":I
} // .end local v12 # "g0":I
} // .end local v13 # "g1":I
} // .end local v14 # "i":I
} // .end local v19 # "r0":I
} // .end local v20 # "r1":I
} // :goto_7
/* add-int/lit8 v27, v27, 0x1 */
/* .line 234 */
/* .restart local v5 # "b0":I */
/* .restart local v8 # "c1":I */
/* .restart local v12 # "g0":I */
/* .restart local v14 # "i":I */
/* .restart local v19 # "r0":I */
} // :cond_a
/* const v30, 0x8000 */
/* mul-int v31, v25, p12 */
/* shr-int/lit8 v31, v31, 0x3 */
/* sub-int v11, v30, v31 */
/* .restart local v11 # "frac":I */
/* .line 267 */
} // .end local v5 # "b0":I
} // .end local v11 # "frac":I
} // .end local v12 # "g0":I
} // .end local v19 # "r0":I
} // :cond_b
/* const/16 v30, 0x7 */
/* move/from16 v0, v25 */
/* move/from16 v1, v30 */
/* if-ne v0, v1, :cond_c */
/* .line 269 */
/* aput v7, p1, v14 */
/* .line 271 */
} // :cond_c
/* const/16 v30, 0x2 */
/* move/from16 v0, v25 */
/* move/from16 v1, v30 */
/* if-gt v0, v1, :cond_d */
/* .line 273 */
/* shr-int/lit8 v30, v8, 0x1 */
/* const v31, 0x7f7f7f */
/* and-int v30, v30, v31 */
/* add-int v30, v30, v7 */
/* shr-int/lit8 v31, v8, 0x2 */
/* const v32, 0x3f3f3f */
/* and-int v31, v31, v32 */
/* add-int v30, v30, v31 */
/* aput v30, p1, v14 */
/* .line 275 */
} // :cond_d
/* const/16 v30, 0x4 */
/* move/from16 v0, v25 */
/* move/from16 v1, v30 */
/* if-gt v0, v1, :cond_e */
/* .line 277 */
/* shr-int/lit8 v30, v8, 0x1 */
/* const v31, 0x7f7f7f */
/* and-int v30, v30, v31 */
/* add-int v30, v30, v7 */
/* aput v30, p1, v14 */
/* .line 281 */
} // :cond_e
/* shr-int/lit8 v30, v8, 0x2 */
/* const v31, 0x3f3f3f */
/* and-int v30, v30, v31 */
/* add-int v30, v30, v7 */
/* aput v30, p1, v14 */
/* .line 287 */
} // .end local v8 # "c1":I
} // .end local v14 # "i":I
} // :cond_f
/* shr-int/lit8 v18, v7, 0x18 */
/* .line 288 */
/* .restart local v18 # "n":I */
/* mul-int v30, v18, v21 */
/* shr-int/lit8 v18, v30, 0xf */
/* .line 289 */
/* add-int v27, v27, v18 */
/* .line 290 */
/* mul-int v30, p10, v18 */
/* add-int v15, v15, v30 */
/* .line 88 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_3 */
/* :pswitch_4 */
/* :pswitch_4 */
/* :pswitch_5 */
} // .end packed-switch
} // .end method
final void drawRle ( Integer[] p0, Object[] p1, Integer p2, Integer p3 ) {
/* .locals 18 */
/* .param p1, "rgb" # [I */
/* .param p2, "ps" # [B */
/* .param p3, "si" # I */
/* .param p4, "sn" # I */
/* .prologue */
/* .line 308 */
int v2 = 0; // const/4 v2, 0x0
/* .line 316 */
/* .local v2, "a":I */
int v5 = 0; // const/4 v5, 0x0
/* .line 318 */
/* .local v5, "di":I */
v10 = v.Vpicture.m_pal;
/* .line 319 */
/* .local v10, "pal":[I */
/* if-nez v10, :cond_1 */
/* .line 320 */
/* const/16 v14, 0x6a */
/* new-array v10, v14, [I */
/* .line 321 */
/* .line 328 */
} // :cond_0
int v11 = 0; // const/4 v11, 0x0
/* .line 333 */
/* .local v11, "pali":I */
int v8 = 0; // const/4 v8, 0x0
/* .line 336 */
/* .local v8, "otdi":I */
} // :goto_0
/* add-int/lit8 v13, p3, 0x1 */
} // .end local p3 # "si":I
/* .local v13, "si":I */
/* aget-byte v14, p2, p3 */
/* and-int/lit16 v3, v14, 0xff */
/* .line 338 */
/* .local v3, "c":I */
/* const/16 v14, 0x96 */
/* if-lt v3, v14, :cond_2 */
/* .line 340 */
/* add-int/lit8 v6, v5, 0x1 */
} // .end local v5 # "di":I
/* .local v6, "di":I */
/* const/16 v14, 0x96 */
/* sub-int v14, v3, v14 */
/* aget v14, v10, v14 */
/* aput v14, p1, v5 */
/* move v5, v6 */
} // .end local v6 # "di":I
/* .restart local v5 # "di":I */
/* move/from16 p3, v13 */
} // .end local v13 # "si":I
/* .restart local p3 # "si":I */
/* .line 324 */
} // .end local v3 # "c":I
} // .end local v8 # "otdi":I
} // .end local v11 # "pali":I
} // :cond_1
int v7 = 0; // const/4 v7, 0x0
/* .local v7, "i":I */
} // :goto_1
/* const/16 v14, 0x6a */
/* if-ge v7, v14, :cond_0 */
/* .line 325 */
int v14 = 0; // const/4 v14, 0x0
/* aput v14, v10, v7 */
/* .line 324 */
/* add-int/lit8 v7, v7, 0x1 */
/* .line 342 */
} // .end local v7 # "i":I
} // .end local p3 # "si":I
/* .restart local v3 # "c":I */
/* .restart local v8 # "otdi":I */
/* .restart local v11 # "pali":I */
/* .restart local v13 # "si":I */
} // :cond_2
/* const/16 v14, 0x80 */
/* if-ge v3, v14, :cond_3 */
/* .line 344 */
/* shl-int/lit8 v14, v3, 0x8 */
/* add-int/lit8 p3, v13, 0x1 */
} // .end local v13 # "si":I
/* .restart local p3 # "si":I */
/* aget-byte v15, p2, v13 */
/* and-int/lit16 v15, v15, 0xff */
/* or-int v3, v14, v15 */
/* .line 345 */
/* and-int/lit16 v14, v3, 0x7c00 */
/* shl-int/lit8 v14, v14, 0x9 */
/* and-int/lit16 v15, v3, 0x3e0 */
/* shl-int/lit8 v15, v15, 0x6 */
/* or-int/2addr v14, v15 */
/* and-int/lit8 v15, v3, 0x1f */
/* shl-int/lit8 v15, v15, 0x3 */
/* or-int v3, v14, v15 */
/* .line 347 */
/* add-int/lit8 v12, v11, 0x1 */
} // .end local v11 # "pali":I
/* .local v12, "pali":I */
/* aput v3, v10, v11 */
/* .line 348 */
/* const/16 v14, 0x6a */
/* if-ne v12, v14, :cond_12 */
/* .line 349 */
int v11 = 0; // const/4 v11, 0x0
/* .line 350 */
} // .end local v12 # "pali":I
/* .restart local v11 # "pali":I */
} // :goto_2
/* add-int/lit8 v6, v5, 0x1 */
} // .end local v5 # "di":I
/* .restart local v6 # "di":I */
/* aput v3, p1, v5 */
/* move v5, v6 */
} // .end local v6 # "di":I
/* .restart local v5 # "di":I */
/* .line 354 */
} // .end local p3 # "si":I
/* .restart local v13 # "si":I */
} // :cond_3
/* sub-int v9, v5, v8 */
/* .line 355 */
/* .local v9, "otn":I */
} // :goto_3
/* const/16 v14, 0x20 */
/* if-ge v9, v14, :cond_5 */
/* .line 360 */
} // :goto_4
/* if-nez v9, :cond_6 */
/* .line 365 */
} // :goto_5
/* const/16 v14, 0x86 */
/* if-ge v3, v14, :cond_7 */
/* move v6, v5 */
/* .line 395 */
} // .end local v5 # "di":I
/* .restart local v6 # "di":I */
} // :goto_6
/* const/16 v14, 0x80 */
/* if-lt v3, v14, :cond_4 */
/* const/16 v14, 0x86 */
/* if-ge v3, v14, :cond_4 */
/* .line 396 */
/* const/16 v14, 0x7f */
/* sub-int v2, v3, v14 */
/* .line 397 */
/* add-int/lit8 p3, v13, 0x1 */
} // .end local v13 # "si":I
/* .restart local p3 # "si":I */
/* aget-byte v14, p2, v13 */
/* and-int/lit16 v3, v14, 0xff */
/* move/from16 v13, p3 */
/* .line 401 */
} // .end local p3 # "si":I
/* .restart local v13 # "si":I */
} // :cond_4
/* const/16 v14, 0x96 */
/* if-lt v3, v14, :cond_c */
/* .line 402 */
/* const/16 v14, 0x96 */
/* sub-int v14, v3, v14 */
/* aget v3, v10, v14 */
/* move/from16 p3, v13 */
/* .line 417 */
} // .end local v13 # "si":I
/* .restart local p3 # "si":I */
} // :goto_7
int v14 = 2; // const/4 v14, 0x2
/* if-gt v2, v14, :cond_e */
/* .line 418 */
int v14 = 1; // const/4 v14, 0x1
/* if-ne v2, v14, :cond_d */
/* .line 419 */
/* shr-int/lit8 v14, v3, 0x3 */
/* const v15, 0x1f1f1f */
/* and-int v3, v14, v15 */
/* .line 429 */
} // :goto_8
/* add-int/lit8 v5, v6, 0x1 */
} // .end local v6 # "di":I
/* .restart local v5 # "di":I */
/* shl-int/lit8 v14, v2, 0x1d */
/* or-int/2addr v14, v3 */
/* aput v14, p1, v6 */
/* .line 430 */
/* move v8, v5 */
/* .line 335 */
/* goto/16 :goto_0 */
/* .line 356 */
} // .end local p3 # "si":I
/* .restart local v13 # "si":I */
} // :cond_5
/* sub-int v14, v5, v9 */
/* aget v15, p1, v14 */
/* const/high16 v16, -0x1000000 */
/* or-int v15, v15, v16 */
/* aput v15, p1, v14 */
/* .line 357 */
/* add-int/lit8 v9, v9, -0x1 */
/* .line 361 */
} // :cond_6
/* sub-int v14, v5, v9 */
/* aget v15, p1, v14 */
/* const/high16 v16, -0x20000000 */
/* const/16 v17, 0x1 */
/* sub-int v17, v9, v17 */
/* shl-int/lit8 v17, v17, 0x18 */
/* or-int v16, v16, v17 */
/* or-int v15, v15, v16 */
/* aput v15, p1, v14 */
/* .line 362 */
/* add-int/lit8 v9, v9, -0x1 */
/* .line 366 */
} // :cond_7
/* add-int/lit16 v3, v3, -0x86 */
/* .line 367 */
/* if-nez v3, :cond_a */
/* .line 369 */
/* move v0, v13 */
/* move/from16 v1, p4 */
/* if-ne v0, v1, :cond_8 */
/* .line 371 */
return;
/* .line 374 */
} // :cond_8
/* add-int/lit8 p3, v13, 0x1 */
} // .end local v13 # "si":I
/* .restart local p3 # "si":I */
/* aget-byte v14, p2, v13 */
/* and-int/lit16 v3, v14, 0xff */
/* .line 375 */
/* and-int/lit8 v2, v3, 0x7 */
/* .line 376 */
/* shr-int/lit8 v3, v3, 0x3 */
/* .line 377 */
/* add-int/lit8 v3, v3, 0x10 */
/* move v6, v5 */
} // .end local v5 # "di":I
/* .restart local v6 # "di":I */
/* move/from16 v13, p3 */
/* .line 381 */
} // .end local p3 # "si":I
/* .restart local v13 # "si":I */
} // :goto_9
/* const/16 v14, 0x20 */
/* if-ge v3, v14, :cond_9 */
/* move v4, v3 */
/* .line 386 */
} // .end local v3 # "c":I
/* .local v4, "c":I */
} // :goto_a
/* add-int/lit8 v3, v4, -0x1 */
} // .end local v4 # "c":I
/* .restart local v3 # "c":I */
/* if-gtz v4, :cond_b */
/* .line 389 */
/* add-int/lit8 p3, v13, 0x1 */
} // .end local v13 # "si":I
/* .restart local p3 # "si":I */
/* aget-byte v14, p2, v13 */
/* and-int/lit16 v3, v14, 0xff */
/* .line 391 */
/* const/16 v14, 0x96 */
/* if-lt v3, v14, :cond_11 */
/* move/from16 v13, p3 */
/* .line 392 */
} // .end local p3 # "si":I
/* .restart local v13 # "si":I */
/* goto/16 :goto_6 */
/* .line 382 */
} // :cond_9
/* add-int/lit8 v3, v3, -0x1 */
/* .line 383 */
/* add-int/lit8 v5, v6, 0x1 */
} // .end local v6 # "di":I
/* .restart local v5 # "di":I */
/* const/high16 v14, 0x1f000000 */
/* aput v14, p1, v6 */
} // :cond_a
/* move v6, v5 */
} // .end local v5 # "di":I
/* .restart local v6 # "di":I */
/* .line 387 */
} // :cond_b
/* add-int/lit8 v5, v6, 0x1 */
} // .end local v6 # "di":I
/* .restart local v5 # "di":I */
/* shl-int/lit8 v14, v3, 0x18 */
/* aput v14, p1, v6 */
/* move v4, v3 */
} // .end local v3 # "c":I
/* .restart local v4 # "c":I */
/* move v6, v5 */
} // .end local v5 # "di":I
/* .restart local v6 # "di":I */
/* .line 406 */
} // .end local v4 # "c":I
/* .restart local v3 # "c":I */
} // :cond_c
/* shl-int/lit8 v14, v3, 0x8 */
/* add-int/lit8 p3, v13, 0x1 */
} // .end local v13 # "si":I
/* .restart local p3 # "si":I */
/* aget-byte v15, p2, v13 */
/* and-int/lit16 v15, v15, 0xff */
/* or-int v3, v14, v15 */
/* .line 407 */
/* and-int/lit16 v14, v3, 0x7c00 */
/* shl-int/lit8 v14, v14, 0x9 */
/* and-int/lit16 v15, v3, 0x3e0 */
/* shl-int/lit8 v15, v15, 0x6 */
/* or-int/2addr v14, v15 */
/* and-int/lit8 v15, v3, 0x1f */
/* shl-int/lit8 v15, v15, 0x3 */
/* or-int v3, v14, v15 */
/* .line 409 */
/* add-int/lit8 v12, v11, 0x1 */
} // .end local v11 # "pali":I
/* .restart local v12 # "pali":I */
/* aput v3, v10, v11 */
/* .line 410 */
/* const/16 v14, 0x6a */
/* if-ne v12, v14, :cond_10 */
/* .line 411 */
int v11 = 0; // const/4 v11, 0x0
} // .end local v12 # "pali":I
/* .restart local v11 # "pali":I */
/* goto/16 :goto_7 */
/* .line 421 */
} // :cond_d
/* shr-int/lit8 v14, v3, 0x2 */
/* const v15, 0x3f3f3f */
/* and-int v3, v14, v15 */
/* goto/16 :goto_8 */
/* .line 423 */
} // :cond_e
int v14 = 4; // const/4 v14, 0x4
/* if-gt v2, v14, :cond_f */
/* .line 424 */
/* shr-int/lit8 v14, v3, 0x1 */
/* const v15, 0x7f7f7f */
/* and-int v3, v14, v15 */
/* goto/16 :goto_8 */
/* .line 427 */
} // :cond_f
/* shr-int/lit8 v14, v3, 0x1 */
/* const v15, 0x7f7f7f */
/* and-int/2addr v14, v15 */
/* shr-int/lit8 v15, v3, 0x2 */
/* const v16, 0x3f3f3f */
/* and-int v15, v15, v16 */
/* add-int v3, v14, v15 */
/* goto/16 :goto_8 */
} // .end local v11 # "pali":I
/* .restart local v12 # "pali":I */
} // :cond_10
/* move v11, v12 */
} // .end local v12 # "pali":I
/* .restart local v11 # "pali":I */
/* goto/16 :goto_7 */
} // :cond_11
/* move v5, v6 */
} // .end local v6 # "di":I
/* .restart local v5 # "di":I */
/* move/from16 v13, p3 */
} // .end local p3 # "si":I
/* .restart local v13 # "si":I */
/* goto/16 :goto_5 */
} // .end local v9 # "otn":I
} // .end local v11 # "pali":I
} // .end local v13 # "si":I
/* .restart local v12 # "pali":I */
/* .restart local p3 # "si":I */
} // :cond_12
/* move v11, v12 */
} // .end local v12 # "pali":I
/* .restart local v11 # "pali":I */
/* goto/16 :goto_2 */
} // .end method

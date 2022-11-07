public class v.V3dView extends v.Viewport {
	 /* .source "V3dView.java" */
	 /* # static fields */
	 static final Integer AFFINEX;
	 static final Boolean BARYCENTRIC;
	 static final Integer BF;
	 static final Boolean DECAL;
	 static final Integer SHBITS;
	 static final Integer SHEXTRA;
	 static final Boolean SUBDIVIDE;
	 static final Integer UFBITS;
	 static final Integer UFMASK;
	 static final Integer UFXTRA;
	 public static final Boolean USE3DS;
	 static final Integer UWBITS;
	 static final Boolean WIREFRAME;
	 static final Integer ZEMIN;
	 static final Integer ZEMIND;
	 static final Integer ZEMIND0;
	 static final Integer m_D0;
	 static m_vback;
	 static m_xe;
	 static m_xt;
	 static m_ye;
	 static m_yt;
	 static m_ze;
	 static m_zt;
	 /* # instance fields */
	 public Integer m_D;
	 public Boolean m_changed;
	 v.Vector m_half;
	 public Integer m_heading;
	 Integer m_height2;
	 public Integer m_horizon;
	 v.Vector m_light;
	 v.V3dMaterial m_matc;
	 public v.V3dView m_optcop;
	 public Integer m_pitch;
	 public Integer m_sox0;
	 public Integer m_soy0;
	 public Boolean m_static;
	 public v.Vector m_tv;
	 Integer m_width2;
	 Integer m_x0;
	 Integer m_x1;
	 Integer m_y0;
	 Integer m_y1;
	 public m_zbuf;
	 /* # direct methods */
	 public v.V3dView ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 2247 */
		 /* invoke-direct {p0}, Lv/Viewport;-><init>()V */
		 /* .line 2248 */
		 /* new-instance v0, Lv/Vector; */
		 /* invoke-direct {v0}, Lv/Vector;-><init>()V */
		 this.m_half = v0;
		 /* .line 2249 */
		 /* const/16 v0, 0x4000 */
		 /* iput v0, p0, Lv/V3dView;->m_horizon:I */
		 /* .line 2250 */
		 /* new-instance v0, Lv/Vector; */
		 /* invoke-direct {v0}, Lv/Vector;-><init>()V */
		 this.m_light = v0;
		 /* .line 2251 */
		 /* new-instance v0, Lv/Vmat; */
		 /* invoke-direct {v0}, Lv/Vmat;-><init>()V */
		 this.m_mt = v0;
		 /* .line 2252 */
		 /* new-instance v0, Lv/Vector; */
		 /* invoke-direct {v0}, Lv/Vector;-><init>()V */
		 this.m_tv = v0;
		 /* .line 2253 */
		 return;
	 } // .end method
	 private final void subedge ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6, Integer p7, Integer p8, Integer p9, Integer p10, Integer p11, Integer p12, Integer p13, Integer p14, Integer p15, Integer p16, Integer p17 ) {
		 /* .locals 76 */
		 /* .param p1, "x0" # I */
		 /* .param p2, "y0" # I */
		 /* .param p3, "z0" # I */
		 /* .param p4, "u0" # I */
		 /* .param p5, "v0" # I */
		 /* .param p6, "i0" # I */
		 /* .param p7, "x1" # I */
		 /* .param p8, "y1" # I */
		 /* .param p9, "z1" # I */
		 /* .param p10, "u1" # I */
		 /* .param p11, "v1" # I */
		 /* .param p12, "i1" # I */
		 /* .param p13, "x2" # I */
		 /* .param p14, "y2" # I */
		 /* .param p15, "z2" # I */
		 /* .param p16, "u2" # I */
		 /* .param p17, "v2" # I */
		 /* .param p18, "i2" # I */
		 /* .prologue */
		 /* .line 852 */
		 /* shr-int/lit8 v61, p2, 0xf */
		 /* .line 853 */
		 /* .local v61, "y":I */
		 /* move/from16 v0, p2 */
		 /* and-int/lit16 v0, v0, 0x7fff */
		 /* move/from16 v66, v0 */
		 /* .line 855 */
		 /* .local v66, "yfrac":I */
		 if ( v66 != null) { // if-eqz v66, :cond_0
			 /* .line 856 */
			 /* const v72, 0x8000 */
			 /* sub-int v66, v72, v66 */
			 /* .line 857 */
			 /* add-int/lit8 v61, v61, 0x1 */
			 /* .line 860 */
		 } // :cond_0
		 /* move-object/from16 v0, p0 */
		 /* iget v0, v0, Lv/V3dView;->m_y0:I */
		 /* move/from16 v64, v0 */
		 /* .line 861 */
		 /* .local v64, "yclip0":I */
		 /* move/from16 v0, v61 */
		 /* move/from16 v1, v64 */
		 /* if-ge v0, v1, :cond_1 */
		 /* .line 863 */
		 /* sub-int v72, v64, v61 */
		 /* shl-int/lit8 v72, v72, 0xf */
		 /* add-int v66, v66, v72 */
		 /* .line 864 */
		 /* move/from16 v61, v64 */
		 /* .line 867 */
	 } // :cond_1
	 /* const v72, 0x8000 */
	 /* add-int v72, v72, p8 */
	 /* const/16 v73, 0x1 */
	 /* sub-int v72, v72, v73 */
	 /* shr-int/lit8 v62, v72, 0xf */
	 /* .line 869 */
	 /* .local v62, "yL":I */
	 /* move-object/from16 v0, p0 */
	 /* iget v0, v0, Lv/V3dView;->m_y1:I */
	 /* move/from16 v65, v0 */
	 /* .line 870 */
	 /* .local v65, "yclip1":I */
	 /* move/from16 v0, v62 */
	 /* move/from16 v1, v65 */
	 /* if-le v0, v1, :cond_2 */
	 /* .line 871 */
	 /* move/from16 v62, v65 */
	 /* .line 873 */
} // :cond_2
/* const v72, 0x8000 */
/* add-int v72, v72, p14 */
/* const/16 v73, 0x1 */
/* sub-int v72, v72, v73 */
/* shr-int/lit8 v63, v72, 0xf */
/* .line 874 */
/* .local v63, "yR":I */
/* move/from16 v0, v63 */
/* move/from16 v1, v65 */
/* if-le v0, v1, :cond_3 */
/* .line 875 */
/* move/from16 v63, v65 */
/* .line 877 */
} // :cond_3
/* move/from16 v54, p1 */
/* .local v54, "xL":I */
/* move/from16 v68, p3 */
/* .local v68, "zL":I */
/* move/from16 v45, p4 */
/* .local v45, "uL":I */
/* move/from16 v50, p5 */
/* .local v50, "vL":I */
/* move/from16 v29, p6 */
/* .line 879 */
/* .local v29, "iL":I */
/* move/from16 v0, v61 */
/* move/from16 v1, v62 */
/* if-lt v0, v1, :cond_c */
/* .line 881 */
/* move/from16 v0, v61 */
/* move/from16 v1, v63 */
/* if-lt v0, v1, :cond_5 */
/* .line 1171 */
} // :cond_4
return;
/* .line 887 */
} // :cond_5
int v6 = 0; // const/4 v6, 0x0
/* .local v6, "diL":I */
int v10 = 0; // const/4 v10, 0x0
/* .local v10, "duL":I */
int v13 = 0; // const/4 v13, 0x0
/* .local v13, "dvL":I */
/* const/16 v24, 0x0 */
/* .line 889 */
/* .local v24, "dzL":I */
/* const/16 v17, 0x0 */
/* .line 948 */
/* .local v17, "dxL":I */
} // :goto_0
/* move/from16 v55, p1 */
/* .local v55, "xR":I */
/* move/from16 v69, p3 */
/* .local v69, "zR":I */
/* move/from16 v46, p4 */
/* .local v46, "uR":I */
/* move/from16 v51, p5 */
/* .local v51, "vR":I */
/* move/from16 v30, p6 */
/* .line 950 */
/* .local v30, "iR":I */
/* move/from16 v0, v61 */
/* move/from16 v1, v63 */
/* if-lt v0, v1, :cond_e */
/* .line 954 */
int v7 = 0; // const/4 v7, 0x0
/* .local v7, "diR":I */
int v11 = 0; // const/4 v11, 0x0
/* .local v11, "duR":I */
int v14 = 0; // const/4 v14, 0x0
/* .local v14, "dvR":I */
/* const/16 v25, 0x0 */
/* .line 956 */
/* .local v25, "dzR":I */
/* const/16 v18, 0x0 */
/* .line 1056 */
/* .local v18, "dxR":I */
} // :goto_1
/* move-object/from16 v0, p0 */
v0 = this.m_matc;
/* move-object/from16 v33, v0 */
/* .line 1057 */
/* .local v33, "matc":Lv/V3dMaterial; */
/* move-object/from16 v0, v33 */
v0 = this.m_texture;
/* move-object/from16 v37, v0 */
/* .line 1067 */
/* .local v37, "texture":Lv/V3dTexture; */
/* if-nez v37, :cond_10 */
/* .line 1069 */
/* const/16 v35, 0x0 */
/* check-cast v35, [I */
/* .line 1070 */
/* .local v35, "rgb":[I */
/* const/16 v40, 0x0 */
/* .line 1071 */
/* .local v40, "tpow2":I */
/* const/16 v43, 0x0 */
/* .line 1072 */
/* .local v43, "tw":I */
/* const/16 v38, 0x0 */
/* .line 1073 */
/* .local v38, "th":I */
/* move-object/from16 v0, v33 */
/* iget v0, v0, Lv/V3dMaterial;->m_diffuse:I */
/* move v4, v0 */
/* .line 1074 */
/* .local v4, "color":I */
/* shr-int/lit8 v72, v4, 0x10 */
/* move/from16 v0, v72 */
/* and-int/lit16 v0, v0, 0xff */
/* move/from16 v34, v0 */
/* .line 1075 */
/* .local v34, "r":I */
/* shr-int/lit8 v72, v4, 0x8 */
/* move/from16 v0, v72 */
/* and-int/lit16 v0, v0, 0xff */
/* move/from16 v27, v0 */
/* .line 1076 */
/* .local v27, "g":I */
/* and-int/lit16 v2, v4, 0xff */
/* .line 1077 */
/* .local v2, "b":I */
/* const/16 v41, 0x0 */
/* .line 1078 */
/* .local v41, "trans":Z */
/* const/16 v42, 0x0 */
/* .line 1079 */
/* .local v42, "tshift":I */
/* const/16 v39, 0x0 */
/* .line 1101 */
} // .end local v4 # "color":I
/* .local v39, "tmask":I */
} // :goto_2
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_width:I */
/* move/from16 v16, v0 */
/* .line 1102 */
/* .local v16, "dwidth":I */
/* mul-int v5, v61, v16 */
/* .line 1103 */
/* .local v5, "di":I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_x0:I */
/* move/from16 v56, v0 */
/* .line 1104 */
/* .local v56, "xclip0":I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_x1:I */
/* move/from16 v57, v0 */
/* .line 1105 */
/* .local v57, "xclip1":I */
/* move-object/from16 v0, p0 */
v0 = this.m_rgb;
/* move-object v9, v0 */
/* .line 1106 */
/* .local v9, "drgb":[I */
/* move-object/from16 v0, p0 */
v0 = this.m_zbuf;
/* move-object/from16 v70, v0 */
/* .line 1111 */
/* .local v70, "zbuf":[I */
} // :goto_3
/* move/from16 v0, v61 */
/* move/from16 v1, v62 */
/* if-lt v0, v1, :cond_12 */
/* .line 1113 */
/* move/from16 v0, v61 */
/* move/from16 v1, v63 */
/* if-ge v0, v1, :cond_4 */
/* .line 1117 */
/* move/from16 v62, v63 */
/* .line 1120 */
/* sub-int v22, p14, p8 */
/* .line 1122 */
/* .local v22, "dyL":I */
/* const v72, 0x8000 */
/* move/from16 v0, v22 */
/* move/from16 v1, v72 */
/* if-ge v0, v1, :cond_11 */
/* .line 1123 */
if ( v22 != null) { // if-eqz v22, :cond_4
/* .line 1127 */
v22 = /* invoke-static/range {v22 ..v22}, Lv/V3dView;->finv(I)I */
/* .line 1128 */
/* sub-int v72, p13, p7 */
/* move/from16 v0, v72 */
/* move/from16 v1, v22 */
v17 = v.V3dView .fmul ( v0,v1 );
/* .line 1130 */
/* sub-int v72, p16, p10 */
/* move/from16 v0, v72 */
/* move/from16 v1, v22 */
v10 = v.V3dView .fmul ( v0,v1 );
/* .line 1131 */
/* sub-int v72, p17, p11 */
/* move/from16 v0, v72 */
/* move/from16 v1, v22 */
v13 = v.V3dView .fmul ( v0,v1 );
/* .line 1132 */
/* sub-int v72, p15, p9 */
/* move/from16 v0, v72 */
/* move/from16 v1, v22 */
v24 = v.V3dView .fmul ( v0,v1 );
/* .line 1133 */
/* sub-int v72, p18, p12 */
/* move/from16 v0, v72 */
/* move/from16 v1, v22 */
v6 = v.V3dView .fmul ( v0,v1 );
/* .line 1144 */
} // :goto_4
/* shl-int/lit8 v72, v61, 0xf */
/* sub-int v66, v72, p8 */
/* .line 1154 */
/* move/from16 v0, v66 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* move/from16 v0, v17 */
/* int-to-long v0, v0 */
/* move-wide/from16 v74, v0 */
/* mul-long v72, v72, v74 */
/* const/16 v74, 0xf */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move/from16 v72, v0 */
/* add-int v54, p7, v72 */
/* .line 1155 */
/* move/from16 v0, v66 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* move v0, v10 */
/* int-to-long v0, v0 */
/* move-wide/from16 v74, v0 */
/* mul-long v72, v72, v74 */
/* const/16 v74, 0xf */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move/from16 v72, v0 */
/* add-int v45, p10, v72 */
/* .line 1156 */
/* move/from16 v0, v66 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* move v0, v13 */
/* int-to-long v0, v0 */
/* move-wide/from16 v74, v0 */
/* mul-long v72, v72, v74 */
/* const/16 v74, 0xf */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move/from16 v72, v0 */
/* add-int v50, p11, v72 */
/* .line 1157 */
/* move/from16 v0, v66 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* move/from16 v0, v24 */
/* int-to-long v0, v0 */
/* move-wide/from16 v74, v0 */
/* mul-long v72, v72, v74 */
/* const/16 v74, 0xf */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move/from16 v72, v0 */
/* add-int v68, p9, v72 */
/* .line 1158 */
/* move/from16 v0, v66 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* move v0, v6 */
/* int-to-long v0, v0 */
/* move-wide/from16 v74, v0 */
/* mul-long v72, v72, v74 */
/* const/16 v74, 0xf */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move/from16 v72, v0 */
/* add-int v29, p12, v72 */
/* .line 1211 */
} // .end local v22 # "dyL":I
} // :cond_6
} // :goto_5
/* shr-int/lit8 v59, v54, 0xf */
/* .line 1212 */
/* .local v59, "xiL":I */
/* move/from16 v0, v54 */
/* and-int/lit16 v0, v0, 0x7fff */
/* move/from16 v58, v0 */
/* .line 1213 */
/* .local v58, "xfrac":I */
if ( v58 != null) { // if-eqz v58, :cond_7
/* .line 1214 */
/* const v72, 0x8000 */
/* sub-int v58, v72, v58 */
/* .line 1215 */
/* add-int/lit8 v59, v59, 0x1 */
/* .line 1218 */
} // :cond_7
/* move/from16 v0, v59 */
/* move/from16 v1, v56 */
/* if-ge v0, v1, :cond_8 */
/* .line 1219 */
/* sub-int v72, v56, v59 */
/* shl-int/lit8 v72, v72, 0xf */
/* add-int v58, v58, v72 */
/* .line 1220 */
/* move/from16 v59, v56 */
/* .line 1223 */
} // :cond_8
/* const v72, 0x8000 */
/* add-int v72, v72, v55 */
/* const/16 v73, 0x1 */
/* sub-int v72, v72, v73 */
/* shr-int/lit8 v60, v72, 0xf */
/* .line 1225 */
/* .local v60, "xiR":I */
/* move/from16 v0, v60 */
/* move/from16 v1, v57 */
/* if-le v0, v1, :cond_9 */
/* .line 1226 */
/* move/from16 v60, v57 */
/* .line 1228 */
} // :cond_9
/* move/from16 v0, v59 */
/* move/from16 v1, v60 */
/* if-ge v0, v1, :cond_b */
/* .line 1230 */
/* add-int v28, v5, v59 */
/* .line 1231 */
/* .local v28, "i":I */
/* add-int v32, v5, v60 */
/* .line 1234 */
/* .local v32, "irt":I */
/* aget v72, v70, v28 */
/* move/from16 v0, v68 */
/* move/from16 v1, v72 */
/* if-gt v0, v1, :cond_a */
/* const/16 v72, 0x1 */
/* sub-int v72, v32, v72 */
/* aget v72, v70, v72 */
/* move/from16 v0, v69 */
/* move/from16 v1, v72 */
/* if-gt v0, v1, :cond_a */
/* add-int v72, v68, v69 */
/* shr-int/lit8 v72, v72, 0x1 */
/* add-int v73, v28, v32 */
/* shr-int/lit8 v73, v73, 0x1 */
/* aget v73, v70, v73 */
/* move/from16 v0, v72 */
/* move/from16 v1, v73 */
/* if-le v0, v1, :cond_b */
/* .line 1238 */
} // :cond_a
/* sub-int v72, v55, v54 */
v19 = /* invoke-static/range {v72 ..v72}, Lv/V3dView;->finv(I)I */
/* .line 1240 */
/* .local v19, "dxi":I */
/* sub-int v72, v69, v68 */
/* move/from16 v0, v72 */
/* move/from16 v1, v19 */
v26 = v.V3dView .fmul ( v0,v1 );
/* .line 1241 */
/* .local v26, "dzx":I */
/* move/from16 v0, v58 */
/* move/from16 v1, v26 */
v72 = v.V3dView .fmul ( v0,v1 );
/* add-int v67, v68, v72 */
/* .line 1243 */
/* .local v67, "z":I */
/* sub-int v72, v30, v29 */
/* move/from16 v0, v72 */
/* move/from16 v1, v19 */
v8 = v.V3dView .fmul ( v0,v1 );
/* .line 1244 */
/* .local v8, "dix":I */
/* move/from16 v0, v58 */
/* move v1, v8 */
v72 = v.V3dView .fmul ( v0,v1 );
/* add-int v31, v29, v72 */
/* .line 1246 */
/* .local v31, "intensity":I */
/* if-nez v35, :cond_19 */
/* .line 1248 */
/* if-nez v8, :cond_18 */
/* .line 1251 */
/* mul-int v72, v34, v31 */
/* shr-int/lit8 v72, v72, 0x17 */
/* add-int v72, v72, v34 */
/* shl-int/lit8 v72, v72, 0x10 */
/* .line 1252 */
/* mul-int v73, v27, v31 */
/* shr-int/lit8 v73, v73, 0x17 */
/* add-int v73, v73, v27 */
/* shl-int/lit8 v73, v73, 0x8 */
/* .line 1251 */
/* add-int v72, v72, v73 */
/* .line 1253 */
/* mul-int v73, v2, v31 */
/* shr-int/lit8 v73, v73, 0x17 */
/* add-int v73, v73, v2 */
/* .line 1251 */
/* add-int v3, v72, v73 */
/* .line 1255 */
/* .local v3, "co":I */
} // :goto_6
/* move/from16 v0, v28 */
/* move/from16 v1, v32 */
/* if-lt v0, v1, :cond_14 */
/* .line 1552 */
} // .end local v3 # "co":I
} // .end local v8 # "dix":I
} // .end local v19 # "dxi":I
} // .end local v26 # "dzx":I
} // .end local v28 # "i":I
} // .end local v31 # "intensity":I
} // .end local v32 # "irt":I
} // .end local v67 # "z":I
} // :cond_b
} // :goto_7
/* add-int/lit8 v61, v61, 0x1 */
/* .line 1553 */
/* add-int v5, v5, v16 */
/* .line 1555 */
/* add-int v54, v54, v17 */
/* .line 1556 */
/* add-int v45, v45, v10 */
/* .line 1557 */
/* add-int v50, v50, v13 */
/* .line 1558 */
/* add-int v68, v68, v24 */
/* .line 1559 */
/* add-int v29, v29, v6 */
/* .line 1561 */
/* add-int v55, v55, v18 */
/* .line 1562 */
/* add-int v46, v46, v11 */
/* .line 1563 */
/* add-int v51, v51, v14 */
/* .line 1564 */
/* add-int v69, v69, v25 */
/* .line 1565 */
/* add-int v30, v30, v7 */
/* .line 1108 */
/* goto/16 :goto_3 */
/* .line 906 */
} // .end local v2 # "b":I
} // .end local v5 # "di":I
} // .end local v6 # "diL":I
} // .end local v7 # "diR":I
} // .end local v9 # "drgb":[I
} // .end local v10 # "duL":I
} // .end local v11 # "duR":I
} // .end local v13 # "dvL":I
} // .end local v14 # "dvR":I
} // .end local v16 # "dwidth":I
} // .end local v17 # "dxL":I
} // .end local v18 # "dxR":I
} // .end local v24 # "dzL":I
} // .end local v25 # "dzR":I
} // .end local v27 # "g":I
} // .end local v30 # "iR":I
} // .end local v33 # "matc":Lv/V3dMaterial;
} // .end local v34 # "r":I
} // .end local v35 # "rgb":[I
} // .end local v37 # "texture":Lv/V3dTexture;
} // .end local v38 # "th":I
} // .end local v39 # "tmask":I
} // .end local v40 # "tpow2":I
} // .end local v41 # "trans":Z
} // .end local v42 # "tshift":I
} // .end local v43 # "tw":I
} // .end local v46 # "uR":I
} // .end local v51 # "vR":I
} // .end local v55 # "xR":I
} // .end local v56 # "xclip0":I
} // .end local v57 # "xclip1":I
} // .end local v58 # "xfrac":I
} // .end local v59 # "xiL":I
} // .end local v60 # "xiR":I
} // .end local v69 # "zR":I
} // .end local v70 # "zbuf":[I
} // :cond_c
/* sub-int v22, p8, p2 */
/* .line 908 */
/* .restart local v22 # "dyL":I */
/* const v72, 0x8000 */
/* move/from16 v0, v22 */
/* move/from16 v1, v72 */
/* if-ge v0, v1, :cond_d */
/* .line 909 */
v22 = /* invoke-static/range {v22 ..v22}, Lv/V3dView;->finv(I)I */
/* .line 910 */
/* sub-int v72, p7, p1 */
/* move/from16 v0, v72 */
/* move/from16 v1, v22 */
v17 = v.V3dView .fmul ( v0,v1 );
/* .line 913 */
/* .restart local v17 # "dxL":I */
/* sub-int v72, p10, p4 */
/* move/from16 v0, v72 */
/* move/from16 v1, v22 */
v10 = v.V3dView .fmul ( v0,v1 );
/* .line 914 */
/* .restart local v10 # "duL":I */
/* sub-int v72, p11, p5 */
/* move/from16 v0, v72 */
/* move/from16 v1, v22 */
v13 = v.V3dView .fmul ( v0,v1 );
/* .line 915 */
/* .restart local v13 # "dvL":I */
/* sub-int v72, p9, p3 */
/* move/from16 v0, v72 */
/* move/from16 v1, v22 */
v24 = v.V3dView .fmul ( v0,v1 );
/* .line 916 */
/* .restart local v24 # "dzL":I */
/* sub-int v72, p12, p6 */
/* move/from16 v0, v72 */
/* move/from16 v1, v22 */
v6 = v.V3dView .fmul ( v0,v1 );
/* .line 940 */
/* .restart local v6 # "diL":I */
} // :goto_8
/* move/from16 v0, v66 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* move/from16 v0, v17 */
/* int-to-long v0, v0 */
/* move-wide/from16 v74, v0 */
/* mul-long v72, v72, v74 */
/* const/16 v74, 0xf */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move/from16 v72, v0 */
/* add-int v54, v54, v72 */
/* .line 941 */
/* move/from16 v0, v66 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* move v0, v10 */
/* int-to-long v0, v0 */
/* move-wide/from16 v74, v0 */
/* mul-long v72, v72, v74 */
/* const/16 v74, 0xf */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move/from16 v72, v0 */
/* add-int v45, v45, v72 */
/* .line 942 */
/* move/from16 v0, v66 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* move v0, v13 */
/* int-to-long v0, v0 */
/* move-wide/from16 v74, v0 */
/* mul-long v72, v72, v74 */
/* const/16 v74, 0xf */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move/from16 v72, v0 */
/* add-int v50, v50, v72 */
/* .line 943 */
/* move/from16 v0, v66 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* move/from16 v0, v24 */
/* int-to-long v0, v0 */
/* move-wide/from16 v74, v0 */
/* mul-long v72, v72, v74 */
/* const/16 v74, 0xf */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move/from16 v72, v0 */
/* add-int v68, v68, v72 */
/* .line 944 */
/* move/from16 v0, v66 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* move v0, v6 */
/* int-to-long v0, v0 */
/* move-wide/from16 v74, v0 */
/* mul-long v72, v72, v74 */
/* const/16 v74, 0xf */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move/from16 v72, v0 */
/* add-int v29, v29, v72 */
/* goto/16 :goto_0 */
/* .line 921 */
} // .end local v6 # "diL":I
} // .end local v10 # "duL":I
} // .end local v13 # "dvL":I
} // .end local v17 # "dxL":I
} // .end local v24 # "dzL":I
} // :cond_d
v72 = /* invoke-static/range {v22 ..v22}, Lv/V3dView;->finvd(I)I */
/* move/from16 v0, v72 */
/* int-to-long v0, v0 */
/* move-wide/from16 v20, v0 */
/* .line 922 */
/* .local v20, "dy":J */
/* sub-int v72, p7, p1 */
/* move/from16 v0, v72 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* mul-long v72, v72, v20 */
/* const/16 v74, 0x1e */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move/from16 v17, v0 */
/* .line 925 */
/* .restart local v17 # "dxL":I */
/* sub-int v72, p10, p4 */
/* move/from16 v0, v72 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* mul-long v72, v72, v20 */
/* const/16 v74, 0x1e */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move v10, v0 */
/* .line 926 */
/* .restart local v10 # "duL":I */
/* sub-int v72, p11, p5 */
/* move/from16 v0, v72 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* mul-long v72, v72, v20 */
/* const/16 v74, 0x1e */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move v13, v0 */
/* .line 927 */
/* .restart local v13 # "dvL":I */
/* sub-int v72, p9, p3 */
/* move/from16 v0, v72 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* mul-long v72, v72, v20 */
/* const/16 v74, 0x1e */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move/from16 v24, v0 */
/* .line 928 */
/* .restart local v24 # "dzL":I */
/* sub-int v72, p12, p6 */
/* move/from16 v0, v72 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* mul-long v72, v72, v20 */
/* const/16 v74, 0x1e */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move v6, v0 */
/* .restart local v6 # "diL":I */
/* goto/16 :goto_8 */
/* .line 968 */
} // .end local v20 # "dy":J
} // .end local v22 # "dyL":I
/* .restart local v30 # "iR":I */
/* .restart local v46 # "uR":I */
/* .restart local v51 # "vR":I */
/* .restart local v55 # "xR":I */
/* .restart local v69 # "zR":I */
} // :cond_e
/* sub-int v23, p14, p2 */
/* .line 970 */
/* .local v23, "dyR":I */
/* const v72, 0x8000 */
/* move/from16 v0, v23 */
/* move/from16 v1, v72 */
/* if-ge v0, v1, :cond_f */
/* .line 971 */
v23 = /* invoke-static/range {v23 ..v23}, Lv/V3dView;->finv(I)I */
/* .line 972 */
/* sub-int v72, p13, p1 */
/* move/from16 v0, v72 */
/* move/from16 v1, v23 */
v18 = v.V3dView .fmul ( v0,v1 );
/* .line 975 */
/* .restart local v18 # "dxR":I */
/* sub-int v72, p16, p4 */
/* move/from16 v0, v72 */
/* move/from16 v1, v23 */
v11 = v.V3dView .fmul ( v0,v1 );
/* .line 976 */
/* .restart local v11 # "duR":I */
/* sub-int v72, p17, p5 */
/* move/from16 v0, v72 */
/* move/from16 v1, v23 */
v14 = v.V3dView .fmul ( v0,v1 );
/* .line 977 */
/* .restart local v14 # "dvR":I */
/* sub-int v72, p15, p3 */
/* move/from16 v0, v72 */
/* move/from16 v1, v23 */
v25 = v.V3dView .fmul ( v0,v1 );
/* .line 978 */
/* .restart local v25 # "dzR":I */
/* sub-int v72, p18, p6 */
/* move/from16 v0, v72 */
/* move/from16 v1, v23 */
v7 = v.V3dView .fmul ( v0,v1 );
/* .line 998 */
/* .restart local v7 # "diR":I */
} // :goto_9
/* move/from16 v0, v66 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* move/from16 v0, v18 */
/* int-to-long v0, v0 */
/* move-wide/from16 v74, v0 */
/* mul-long v72, v72, v74 */
/* const/16 v74, 0xf */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move/from16 v72, v0 */
/* add-int v55, v55, v72 */
/* .line 999 */
/* move/from16 v0, v66 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* move v0, v11 */
/* int-to-long v0, v0 */
/* move-wide/from16 v74, v0 */
/* mul-long v72, v72, v74 */
/* const/16 v74, 0xf */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move/from16 v72, v0 */
/* add-int v46, v46, v72 */
/* .line 1000 */
/* move/from16 v0, v66 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* move v0, v14 */
/* int-to-long v0, v0 */
/* move-wide/from16 v74, v0 */
/* mul-long v72, v72, v74 */
/* const/16 v74, 0xf */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move/from16 v72, v0 */
/* add-int v51, v51, v72 */
/* .line 1001 */
/* move/from16 v0, v66 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* move/from16 v0, v25 */
/* int-to-long v0, v0 */
/* move-wide/from16 v74, v0 */
/* mul-long v72, v72, v74 */
/* const/16 v74, 0xf */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move/from16 v72, v0 */
/* add-int v69, v69, v72 */
/* .line 1002 */
/* move/from16 v0, v66 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* move v0, v7 */
/* int-to-long v0, v0 */
/* move-wide/from16 v74, v0 */
/* mul-long v72, v72, v74 */
/* const/16 v74, 0xf */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move/from16 v72, v0 */
/* add-int v30, v30, v72 */
/* goto/16 :goto_1 */
/* .line 981 */
} // .end local v7 # "diR":I
} // .end local v11 # "duR":I
} // .end local v14 # "dvR":I
} // .end local v18 # "dxR":I
} // .end local v25 # "dzR":I
} // :cond_f
v72 = /* invoke-static/range {v23 ..v23}, Lv/V3dView;->finvd(I)I */
/* move/from16 v0, v72 */
/* int-to-long v0, v0 */
/* move-wide/from16 v20, v0 */
/* .line 982 */
/* .restart local v20 # "dy":J */
/* sub-int v72, p13, p1 */
/* move/from16 v0, v72 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* mul-long v72, v72, v20 */
/* const/16 v74, 0x1e */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move/from16 v18, v0 */
/* .line 983 */
/* .restart local v18 # "dxR":I */
/* sub-int v72, p16, p4 */
/* move/from16 v0, v72 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* mul-long v72, v72, v20 */
/* const/16 v74, 0x1e */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move v11, v0 */
/* .line 984 */
/* .restart local v11 # "duR":I */
/* sub-int v72, p17, p5 */
/* move/from16 v0, v72 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* mul-long v72, v72, v20 */
/* const/16 v74, 0x1e */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move v14, v0 */
/* .line 985 */
/* .restart local v14 # "dvR":I */
/* sub-int v72, p15, p3 */
/* move/from16 v0, v72 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* mul-long v72, v72, v20 */
/* const/16 v74, 0x1e */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move/from16 v25, v0 */
/* .line 986 */
/* .restart local v25 # "dzR":I */
/* sub-int v72, p18, p6 */
/* move/from16 v0, v72 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* mul-long v72, v72, v20 */
/* const/16 v74, 0x1e */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move v7, v0 */
/* .restart local v7 # "diR":I */
/* goto/16 :goto_9 */
/* .line 1082 */
} // .end local v20 # "dy":J
} // .end local v23 # "dyR":I
/* .restart local v33 # "matc":Lv/V3dMaterial; */
/* .restart local v37 # "texture":Lv/V3dTexture; */
} // :cond_10
/* move-object/from16 v0, v37 */
v0 = this.m_rgb;
/* move-object/from16 v35, v0 */
/* .line 1083 */
/* .restart local v35 # "rgb":[I */
/* move-object/from16 v0, v37 */
/* iget v0, v0, Lv/V3dTexture;->m_pow2:I */
/* move/from16 v40, v0 */
/* .line 1085 */
/* .restart local v40 # "tpow2":I */
/* const/16 v72, 0x1 */
/* shl-int v72, v72, v40 */
/* const/16 v73, 0x1 */
/* sub-int v39, v72, v73 */
/* .line 1089 */
/* .restart local v39 # "tmask":I */
/* const/16 v72, 0x18 */
/* sub-int v72, v72, v40 */
/* move-object/from16 v0, v37 */
/* iget v0, v0, Lv/V3dTexture;->m_scaleBits:I */
/* move/from16 v73, v0 */
/* sub-int v42, v72, v73 */
/* .line 1091 */
/* .restart local v42 # "tshift":I */
/* move-object/from16 v0, v37 */
/* iget v0, v0, Lv/V3dTexture;->m_width:I */
/* move/from16 v43, v0 */
/* .line 1092 */
/* .restart local v43 # "tw":I */
/* move-object/from16 v0, v37 */
/* iget v0, v0, Lv/V3dTexture;->m_height:I */
/* move/from16 v38, v0 */
/* .line 1094 */
/* .restart local v38 # "th":I */
/* const/16 v34, 0xff */
/* .line 1095 */
/* .restart local v34 # "r":I */
/* const/16 v27, 0xff */
/* .line 1096 */
/* .restart local v27 # "g":I */
/* const/16 v2, 0xff */
/* .line 1097 */
/* .restart local v2 # "b":I */
/* move-object/from16 v0, v37 */
/* iget-boolean v0, v0, Lv/V3dTexture;->m_trans:Z */
/* move/from16 v41, v0 */
/* .restart local v41 # "trans":Z */
/* goto/16 :goto_2 */
/* .line 1136 */
/* .restart local v5 # "di":I */
/* .restart local v9 # "drgb":[I */
/* .restart local v16 # "dwidth":I */
/* .restart local v22 # "dyL":I */
/* .restart local v56 # "xclip0":I */
/* .restart local v57 # "xclip1":I */
/* .restart local v70 # "zbuf":[I */
} // :cond_11
v72 = /* invoke-static/range {v22 ..v22}, Lv/V3dView;->finvd(I)I */
/* move/from16 v0, v72 */
/* int-to-long v0, v0 */
/* move-wide/from16 v20, v0 */
/* .line 1137 */
/* .restart local v20 # "dy":J */
/* sub-int v72, p13, p7 */
/* move/from16 v0, v72 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* mul-long v72, v72, v20 */
/* const/16 v74, 0x1e */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move/from16 v17, v0 */
/* .line 1138 */
/* sub-int v72, p16, p10 */
/* move/from16 v0, v72 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* mul-long v72, v72, v20 */
/* const/16 v74, 0x1e */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move v10, v0 */
/* .line 1139 */
/* sub-int v72, p17, p11 */
/* move/from16 v0, v72 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* mul-long v72, v72, v20 */
/* const/16 v74, 0x1e */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move v13, v0 */
/* .line 1140 */
/* sub-int v72, p15, p9 */
/* move/from16 v0, v72 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* mul-long v72, v72, v20 */
/* const/16 v74, 0x1e */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move/from16 v24, v0 */
/* .line 1141 */
/* sub-int v72, p18, p12 */
/* move/from16 v0, v72 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* mul-long v72, v72, v20 */
/* const/16 v74, 0x1e */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move v6, v0 */
/* goto/16 :goto_4 */
/* .line 1161 */
} // .end local v20 # "dy":J
} // .end local v22 # "dyL":I
} // :cond_12
/* move/from16 v0, v61 */
/* move/from16 v1, v63 */
/* if-lt v0, v1, :cond_6 */
/* .line 1165 */
/* move/from16 v63, v62 */
/* .line 1167 */
/* sub-int v23, p8, p14 */
/* .line 1169 */
/* .restart local v23 # "dyR":I */
/* const v72, 0x8000 */
/* move/from16 v0, v23 */
/* move/from16 v1, v72 */
/* if-ge v0, v1, :cond_13 */
/* .line 1170 */
if ( v23 != null) { // if-eqz v23, :cond_4
/* .line 1174 */
v23 = /* invoke-static/range {v23 ..v23}, Lv/V3dView;->finv(I)I */
/* .line 1175 */
/* sub-int v72, p7, p13 */
/* move/from16 v0, v72 */
/* move/from16 v1, v23 */
v18 = v.V3dView .fmul ( v0,v1 );
/* .line 1177 */
/* sub-int v72, p10, p16 */
/* move/from16 v0, v72 */
/* move/from16 v1, v23 */
v11 = v.V3dView .fmul ( v0,v1 );
/* .line 1178 */
/* sub-int v72, p11, p17 */
/* move/from16 v0, v72 */
/* move/from16 v1, v23 */
v14 = v.V3dView .fmul ( v0,v1 );
/* .line 1179 */
/* sub-int v72, p9, p15 */
/* move/from16 v0, v72 */
/* move/from16 v1, v23 */
v25 = v.V3dView .fmul ( v0,v1 );
/* .line 1180 */
/* sub-int v72, p12, p18 */
/* move/from16 v0, v72 */
/* move/from16 v1, v23 */
v7 = v.V3dView .fmul ( v0,v1 );
/* .line 1191 */
} // :goto_a
/* shl-int/lit8 v72, v61, 0xf */
/* sub-int v66, v72, p14 */
/* .line 1201 */
/* move/from16 v0, v66 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* move/from16 v0, v18 */
/* int-to-long v0, v0 */
/* move-wide/from16 v74, v0 */
/* mul-long v72, v72, v74 */
/* const/16 v74, 0xf */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move/from16 v72, v0 */
/* add-int v55, p13, v72 */
/* .line 1202 */
/* move/from16 v0, v66 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* move v0, v11 */
/* int-to-long v0, v0 */
/* move-wide/from16 v74, v0 */
/* mul-long v72, v72, v74 */
/* const/16 v74, 0xf */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move/from16 v72, v0 */
/* add-int v46, p16, v72 */
/* .line 1203 */
/* move/from16 v0, v66 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* move v0, v14 */
/* int-to-long v0, v0 */
/* move-wide/from16 v74, v0 */
/* mul-long v72, v72, v74 */
/* const/16 v74, 0xf */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move/from16 v72, v0 */
/* add-int v51, p17, v72 */
/* .line 1204 */
/* move/from16 v0, v66 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* move/from16 v0, v25 */
/* int-to-long v0, v0 */
/* move-wide/from16 v74, v0 */
/* mul-long v72, v72, v74 */
/* const/16 v74, 0xf */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move/from16 v72, v0 */
/* add-int v69, p15, v72 */
/* .line 1205 */
/* move/from16 v0, v66 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* move v0, v7 */
/* int-to-long v0, v0 */
/* move-wide/from16 v74, v0 */
/* mul-long v72, v72, v74 */
/* const/16 v74, 0xf */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move/from16 v72, v0 */
/* add-int v30, p18, v72 */
/* goto/16 :goto_5 */
/* .line 1183 */
} // :cond_13
v72 = /* invoke-static/range {v23 ..v23}, Lv/V3dView;->finvd(I)I */
/* move/from16 v0, v72 */
/* int-to-long v0, v0 */
/* move-wide/from16 v20, v0 */
/* .line 1184 */
/* .restart local v20 # "dy":J */
/* sub-int v72, p7, p13 */
/* move/from16 v0, v72 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* mul-long v72, v72, v20 */
/* const/16 v74, 0x1e */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move/from16 v18, v0 */
/* .line 1185 */
/* sub-int v72, p10, p16 */
/* move/from16 v0, v72 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* mul-long v72, v72, v20 */
/* const/16 v74, 0x1e */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move v11, v0 */
/* .line 1186 */
/* sub-int v72, p11, p17 */
/* move/from16 v0, v72 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* mul-long v72, v72, v20 */
/* const/16 v74, 0x1e */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move v14, v0 */
/* .line 1187 */
/* sub-int v72, p9, p15 */
/* move/from16 v0, v72 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* mul-long v72, v72, v20 */
/* const/16 v74, 0x1e */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move/from16 v25, v0 */
/* .line 1188 */
/* sub-int v72, p12, p18 */
/* move/from16 v0, v72 */
/* int-to-long v0, v0 */
/* move-wide/from16 v72, v0 */
/* mul-long v72, v72, v20 */
/* const/16 v74, 0x1e */
/* shr-long v72, v72, v74 */
/* move-wide/from16 v0, v72 */
/* long-to-int v0, v0 */
/* move v7, v0 */
/* goto/16 :goto_a */
/* .line 1257 */
} // .end local v20 # "dy":J
} // .end local v23 # "dyR":I
/* .restart local v3 # "co":I */
/* .restart local v8 # "dix":I */
/* .restart local v19 # "dxi":I */
/* .restart local v26 # "dzx":I */
/* .restart local v28 # "i":I */
/* .restart local v31 # "intensity":I */
/* .restart local v32 # "irt":I */
/* .restart local v58 # "xfrac":I */
/* .restart local v59 # "xiL":I */
/* .restart local v60 # "xiR":I */
/* .restart local v67 # "z":I */
} // :cond_14
/* aget v72, v70, v28 */
/* move/from16 v0, v67 */
/* move/from16 v1, v72 */
/* if-le v0, v1, :cond_15 */
/* .line 1258 */
/* aput v67, v70, v28 */
/* .line 1260 */
/* aput v3, v9, v28 */
/* .line 1262 */
} // :cond_15
/* add-int/lit8 v28, v28, 0x1 */
/* .line 1263 */
/* add-int v67, v67, v26 */
/* goto/16 :goto_6 */
/* .line 1270 */
} // .end local v3 # "co":I
} // :cond_16
/* aget v72, v70, v28 */
/* move/from16 v0, v67 */
/* move/from16 v1, v72 */
/* if-le v0, v1, :cond_17 */
/* .line 1271 */
/* aput v67, v70, v28 */
/* .line 1279 */
/* mul-int v72, v34, v31 */
/* shr-int/lit8 v72, v72, 0x17 */
/* add-int v72, v72, v34 */
/* shl-int/lit8 v72, v72, 0x10 */
/* .line 1280 */
/* mul-int v73, v27, v31 */
/* shr-int/lit8 v73, v73, 0x17 */
/* add-int v73, v73, v27 */
/* shl-int/lit8 v73, v73, 0x8 */
/* .line 1279 */
/* add-int v72, v72, v73 */
/* .line 1281 */
/* mul-int v73, v2, v31 */
/* shr-int/lit8 v73, v73, 0x17 */
/* add-int v73, v73, v2 */
/* .line 1279 */
/* add-int v72, v72, v73 */
/* .line 1278 */
/* aput v72, v9, v28 */
/* .line 1283 */
} // :cond_17
/* add-int/lit8 v28, v28, 0x1 */
/* .line 1284 */
/* add-int v31, v31, v8 */
/* .line 1285 */
/* add-int v67, v67, v26 */
/* .line 1268 */
} // :cond_18
/* move/from16 v0, v28 */
/* move/from16 v1, v32 */
/* if-lt v0, v1, :cond_16 */
/* goto/16 :goto_7 */
/* .line 1306 */
} // :cond_19
v71 = /* invoke-static/range {v68 ..v68}, Lv/V3dView;->finvd(I)I */
/* .line 1307 */
/* .local v71, "zi":I */
/* move/from16 v0, v45 */
/* move/from16 v1, v71 */
v44 = v.V3dView .fmul ( v0,v1 );
/* .line 1308 */
/* .local v44, "u":I */
/* move/from16 v0, v50 */
/* move/from16 v1, v71 */
v49 = v.V3dView .fmul ( v0,v1 );
/* .line 1310 */
/* .local v49, "v":I */
v71 = /* invoke-static/range {v69 ..v69}, Lv/V3dView;->finvd(I)I */
/* .line 1311 */
/* move/from16 v0, v46 */
/* move/from16 v1, v71 */
v48 = v.V3dView .fmul ( v0,v1 );
/* .line 1312 */
/* .local v48, "uxR":I */
/* move/from16 v0, v51 */
/* move/from16 v1, v71 */
v53 = v.V3dView .fmul ( v0,v1 );
/* .line 1314 */
/* .local v53, "vxR":I */
/* sub-int v72, v48, v44 */
/* move/from16 v0, v72 */
/* move/from16 v1, v19 */
v12 = v.V3dView .fmul ( v0,v1 );
/* .line 1315 */
/* .local v12, "dux":I */
/* sub-int v72, v53, v49 */
/* move/from16 v0, v72 */
/* move/from16 v1, v19 */
v15 = v.V3dView .fmul ( v0,v1 );
/* .line 1317 */
/* .local v15, "dvx":I */
/* move/from16 v0, v58 */
/* move v1, v12 */
v72 = v.V3dView .fmul ( v0,v1 );
/* add-int v44, v44, v72 */
/* .line 1318 */
/* move/from16 v0, v58 */
/* move v1, v15 */
v72 = v.V3dView .fmul ( v0,v1 );
/* add-int v49, v49, v72 */
/* .line 1323 */
/* const/16 v72, -0x200 */
/* move/from16 v0, v31 */
/* move/from16 v1, v72 */
/* if-lt v0, v1, :cond_21 */
/* if-nez v8, :cond_21 */
/* .line 1326 */
if ( v41 != null) { // if-eqz v41, :cond_1d
/* .line 1329 */
} // :goto_b
/* move/from16 v0, v28 */
/* move/from16 v1, v32 */
/* if-ge v0, v1, :cond_b */
/* .line 1330 */
/* aget v72, v70, v28 */
/* move/from16 v0, v67 */
/* move/from16 v1, v72 */
/* if-le v0, v1, :cond_1a */
/* .line 1337 */
/* shr-int v72, v44, v42 */
/* and-int v47, v72, v39 */
/* .line 1338 */
/* .local v47, "ui":I */
/* xor-int/lit8 v72, v49, -0x1 */
/* shr-int v72, v72, v42 */
/* and-int v52, v72, v39 */
/* .line 1339 */
/* .local v52, "vi":I */
/* shl-int v72, v52, v40 */
/* add-int v72, v72, v47 */
/* aget v3, v35, v72 */
/* .line 1353 */
/* .restart local v3 # "co":I */
/* shr-int/lit8 v72, v3, 0x18 */
/* move/from16 v0, v72 */
/* and-int/lit16 v0, v0, 0xff */
/* move/from16 v36, v0 */
/* .line 1358 */
/* .local v36, "t":I */
if ( v36 != null) { // if-eqz v36, :cond_1a
/* .line 1359 */
/* aput v67, v70, v28 */
/* .line 1362 */
/* aget v3, v9, v28 */
/* .line 1363 */
/* shr-int/lit8 v72, v3, 0x10 */
/* move/from16 v0, v72 */
/* and-int/lit16 v0, v0, 0xff */
/* move/from16 v34, v0 */
/* .line 1364 */
/* shr-int/lit8 v72, v3, 0x8 */
/* move/from16 v0, v72 */
/* and-int/lit16 v0, v0, 0xff */
/* move/from16 v27, v0 */
/* .line 1365 */
/* and-int/lit16 v2, v3, 0xff */
/* .line 1366 */
/* const/16 v72, 0xff */
/* sub-int v36, v72, v36 */
/* .line 1367 */
/* mul-int v72, v34, v36 */
/* shr-int/lit8 v72, v72, 0x8 */
/* shl-int/lit8 v72, v72, 0x10 */
/* mul-int v73, v27, v36 */
/* const v74, 0xff00 */
/* and-int v73, v73, v74 */
/* add-int v72, v72, v73 */
/* mul-int v73, v2, v36 */
/* shr-int/lit8 v73, v73, 0x8 */
/* add-int v72, v72, v73 */
/* aput v72, v9, v28 */
/* .line 1377 */
} // .end local v3 # "co":I
} // .end local v36 # "t":I
} // .end local v47 # "ui":I
} // .end local v52 # "vi":I
} // :cond_1a
/* add-int v44, v44, v12 */
/* .line 1378 */
/* add-int v49, v49, v15 */
/* .line 1379 */
/* add-int v67, v67, v26 */
/* .line 1384 */
/* add-int/lit8 v28, v28, 0x1 */
/* .line 1390 */
} // :cond_1b
/* aget v72, v70, v28 */
/* move/from16 v0, v67 */
/* move/from16 v1, v72 */
/* if-le v0, v1, :cond_1c */
/* .line 1391 */
/* aput v67, v70, v28 */
/* .line 1396 */
if ( v40 != null) { // if-eqz v40, :cond_1e
/* .line 1397 */
/* shr-int v72, v44, v42 */
/* and-int v47, v72, v39 */
/* .line 1398 */
/* .restart local v47 # "ui":I */
/* xor-int/lit8 v72, v49, -0x1 */
/* shr-int v72, v72, v42 */
/* and-int v52, v72, v39 */
/* .line 1399 */
/* .restart local v52 # "vi":I */
/* shl-int v72, v52, v40 */
/* add-int v72, v72, v47 */
/* aget v72, v35, v72 */
/* aput v72, v9, v28 */
/* .line 1415 */
} // .end local v47 # "ui":I
} // .end local v52 # "vi":I
} // :cond_1c
} // :goto_c
/* add-int v44, v44, v12 */
/* .line 1416 */
/* add-int v49, v49, v15 */
/* .line 1417 */
/* add-int v67, v67, v26 */
/* .line 1419 */
/* add-int/lit8 v28, v28, 0x1 */
/* .line 1389 */
} // :cond_1d
/* move/from16 v0, v28 */
/* move/from16 v1, v32 */
/* if-lt v0, v1, :cond_1b */
/* goto/16 :goto_7 */
/* .line 1405 */
} // :cond_1e
/* shr-int/lit8 v72, v44, 0xf */
/* move/from16 v0, v72 */
/* and-int/lit16 v0, v0, 0x1ff */
/* move/from16 v72, v0 */
/* mul-int v72, v72, v43 */
/* shr-int/lit8 v47, v72, 0x9 */
/* .line 1406 */
/* .restart local v47 # "ui":I */
/* xor-int/lit8 v72, v49, -0x1 */
/* shr-int/lit8 v72, v72, 0xf */
/* move/from16 v0, v72 */
/* and-int/lit16 v0, v0, 0x1ff */
/* move/from16 v72, v0 */
/* mul-int v72, v72, v38 */
/* shr-int/lit8 v52, v72, 0x9 */
/* .line 1411 */
/* .restart local v52 # "vi":I */
/* mul-int v72, v52, v43 */
/* add-int v72, v72, v47 */
/* aget v72, v35, v72 */
/* aput v72, v9, v28 */
/* .line 1430 */
} // .end local v47 # "ui":I
} // .end local v52 # "vi":I
} // :cond_1f
/* aget v72, v70, v28 */
/* move/from16 v0, v67 */
/* move/from16 v1, v72 */
/* if-le v0, v1, :cond_20 */
/* .line 1431 */
/* aput v67, v70, v28 */
/* .line 1435 */
/* shr-int v72, v44, v42 */
/* and-int v47, v72, v39 */
/* .line 1436 */
/* .restart local v47 # "ui":I */
/* xor-int/lit8 v72, v49, -0x1 */
/* shr-int v72, v72, v42 */
/* and-int v52, v72, v39 */
/* .line 1437 */
/* .restart local v52 # "vi":I */
/* shl-int v72, v52, v40 */
/* add-int v72, v72, v47 */
/* aget v3, v35, v72 */
/* .line 1449 */
/* .restart local v3 # "co":I */
/* shr-int/lit8 v72, v3, 0x10 */
/* move/from16 v0, v72 */
/* and-int/lit16 v0, v0, 0xff */
/* move/from16 v34, v0 */
/* .line 1450 */
/* shr-int/lit8 v72, v3, 0x8 */
/* move/from16 v0, v72 */
/* and-int/lit16 v0, v0, 0xff */
/* move/from16 v27, v0 */
/* .line 1451 */
/* and-int/lit16 v2, v3, 0xff */
/* .line 1474 */
/* mul-int v72, v34, v31 */
/* shr-int/lit8 v72, v72, 0x17 */
/* add-int v72, v72, v34 */
/* shl-int/lit8 v72, v72, 0x10 */
/* .line 1475 */
/* mul-int v73, v27, v31 */
/* shr-int/lit8 v73, v73, 0x17 */
/* add-int v73, v73, v27 */
/* shl-int/lit8 v73, v73, 0x8 */
/* .line 1474 */
/* add-int v72, v72, v73 */
/* .line 1476 */
/* mul-int v73, v2, v31 */
/* shr-int/lit8 v73, v73, 0x17 */
/* add-int v73, v73, v2 */
/* .line 1474 */
/* add-int v72, v72, v73 */
/* .line 1473 */
/* aput v72, v9, v28 */
/* .line 1481 */
} // .end local v3 # "co":I
} // .end local v47 # "ui":I
} // .end local v52 # "vi":I
} // :cond_20
/* add-int v44, v44, v12 */
/* .line 1482 */
/* add-int v49, v49, v15 */
/* .line 1483 */
/* add-int v67, v67, v26 */
/* .line 1484 */
/* add-int v31, v31, v8 */
/* .line 1485 */
/* add-int/lit8 v28, v28, 0x1 */
/* .line 1429 */
} // :cond_21
/* move/from16 v0, v28 */
/* move/from16 v1, v32 */
/* if-lt v0, v1, :cond_1f */
/* goto/16 :goto_7 */
} // .end method
private final void subeye ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6, Integer p7, Integer p8, Integer p9, Integer p10, Integer p11, Integer p12, Integer p13, Integer p14, Integer p15, Integer p16, Integer p17, Integer p18, Integer p19, Integer p20, Integer p21, Integer p22, Integer p23, Integer p24, Integer p25, Integer p26 ) {
/* .locals 96 */
/* .param p1, "x0" # I */
/* .param p2, "y0" # I */
/* .param p3, "z0" # I */
/* .param p4, "u0" # I */
/* .param p5, "v0" # I */
/* .param p6, "sx0" # I */
/* .param p7, "sy0" # I */
/* .param p8, "w0" # I */
/* .param p9, "i0" # I */
/* .param p10, "x1" # I */
/* .param p11, "y1" # I */
/* .param p12, "z1" # I */
/* .param p13, "u1" # I */
/* .param p14, "v1" # I */
/* .param p15, "sx1" # I */
/* .param p16, "sy1" # I */
/* .param p17, "w1" # I */
/* .param p18, "i1" # I */
/* .param p19, "x2" # I */
/* .param p20, "y2" # I */
/* .param p21, "z2" # I */
/* .param p22, "u2" # I */
/* .param p23, "v2" # I */
/* .param p24, "sx2" # I */
/* .param p25, "sy2" # I */
/* .param p26, "w2" # I */
/* .param p27, "i2" # I */
/* .prologue */
/* .line 1578 */
/* const/high16 v2, 0x8000000 */
/* move/from16 v0, p8 */
/* move v1, v2 */
/* if-eq v0, v1, :cond_b */
/* const/high16 v2, 0x8000000 */
/* move/from16 v0, p17 */
/* move v1, v2 */
/* if-eq v0, v1, :cond_b */
/* const/high16 v2, 0x8000000 */
/* move/from16 v0, p26 */
/* move v1, v2 */
/* if-eq v0, v1, :cond_b */
/* .line 1588 */
/* sub-int v2, p6, p15 */
/* move v0, v2 */
/* int-to-long v0, v0 */
/* move-wide/from16 v82, v0 */
/* .line 1589 */
/* .local v82, "ux":J */
/* sub-int v2, p24, p15 */
/* move v0, v2 */
/* int-to-long v0, v0 */
/* move-wide/from16 v86, v0 */
/* .line 1590 */
/* .local v86, "vx":J */
/* sub-int v2, p7, p16 */
/* move v0, v2 */
/* int-to-long v0, v0 */
/* move-wide/from16 v84, v0 */
/* .line 1591 */
/* .local v84, "uy":J */
/* sub-int v2, p25, p16 */
/* move v0, v2 */
/* int-to-long v0, v0 */
/* move-wide/from16 v88, v0 */
/* .line 1593 */
/* .local v88, "vy":J */
/* mul-long v2, v82, v88 */
/* mul-long v4, v84, v86 */
/* sub-long/2addr v2, v4 */
/* const-wide/16 v4, 0x0 */
/* cmp-long v2, v2, v4 */
/* if-gtz v2, :cond_1 */
/* .line 1969 */
} // .end local v82 # "ux":J
} // .end local v84 # "uy":J
} // .end local v86 # "vx":J
} // .end local v88 # "vy":J
} // :cond_0
} // :goto_0
return;
/* .line 1606 */
/* .restart local v82 # "ux":J */
/* .restart local v84 # "uy":J */
/* .restart local v86 # "vx":J */
/* .restart local v88 # "vy":J */
} // :cond_1
/* move/from16 v92, p6 */
/* .line 1607 */
/* .local v92, "xmin":I */
/* move/from16 v90, p6 */
/* .line 1609 */
/* .local v90, "xmax":I */
/* move/from16 v0, p15 */
/* move/from16 v1, v92 */
/* if-ge v0, v1, :cond_2 */
/* .line 1610 */
/* move/from16 v92, p15 */
/* .line 1611 */
} // :cond_2
/* move/from16 v0, p15 */
/* move/from16 v1, v90 */
/* if-le v0, v1, :cond_3 */
/* .line 1612 */
/* move/from16 v90, p15 */
/* .line 1614 */
} // :cond_3
/* move/from16 v0, p24 */
/* move/from16 v1, v92 */
/* if-ge v0, v1, :cond_4 */
/* .line 1615 */
/* move/from16 v92, p24 */
/* .line 1616 */
} // :cond_4
/* move/from16 v0, p24 */
/* move/from16 v1, v90 */
/* if-le v0, v1, :cond_5 */
/* .line 1617 */
/* move/from16 v90, p24 */
/* .line 1619 */
} // :cond_5
/* const v2, 0x8000 */
/* add-int v2, v2, v92 */
int v3 = 1; // const/4 v3, 0x1
/* sub-int/2addr v2, v3 */
/* shr-int/lit8 v93, v2, 0xf */
/* .line 1620 */
/* .local v93, "xmini":I */
/* const v2, 0x8000 */
/* add-int v2, v2, v90 */
int v3 = 1; // const/4 v3, 0x1
/* sub-int/2addr v2, v3 */
/* shr-int/lit8 v91, v2, 0xf */
/* .line 1621 */
/* .local v91, "xmaxi":I */
/* sub-int v76, v91, v93 */
/* .line 1624 */
/* .local v76, "dx":I */
if ( v76 != null) { // if-eqz v76, :cond_0
/* .line 1625 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_x0:I */
/* move v2, v0 */
/* move/from16 v0, v91 */
/* move v1, v2 */
/* if-lt v0, v1, :cond_0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_x1:I */
/* move v2, v0 */
/* move/from16 v0, v93 */
/* move v1, v2 */
/* if-ge v0, v1, :cond_0 */
/* .line 1758 */
/* const/16 v2, 0x40 */
/* move/from16 v0, v76 */
/* move v1, v2 */
/* if-le v0, v1, :cond_d */
/* move-object/from16 v0, p0 */
v0 = this.m_matc;
/* move-object v2, v0 */
v2 = this.m_texture;
/* if-nez v2, :cond_6 */
/* const/16 v2, 0x800 */
/* move/from16 v0, v76 */
/* move v1, v2 */
/* if-le v0, v1, :cond_d */
/* .line 1763 */
} // :cond_6
/* move/from16 v95, p7 */
/* .line 1764 */
/* .local v95, "ymin":I */
/* move/from16 v94, p7 */
/* .line 1766 */
/* .local v94, "ymax":I */
/* move/from16 v0, p16 */
/* move/from16 v1, v95 */
/* if-ge v0, v1, :cond_7 */
/* .line 1767 */
/* move/from16 v95, p16 */
/* .line 1768 */
} // :cond_7
/* move/from16 v0, p16 */
/* move/from16 v1, v94 */
/* if-le v0, v1, :cond_8 */
/* .line 1769 */
/* move/from16 v94, p16 */
/* .line 1771 */
} // :cond_8
/* move/from16 v0, p25 */
/* move/from16 v1, v95 */
/* if-ge v0, v1, :cond_9 */
/* .line 1772 */
/* move/from16 v95, p25 */
/* .line 1773 */
} // :cond_9
/* move/from16 v0, p25 */
/* move/from16 v1, v94 */
/* if-le v0, v1, :cond_a */
/* .line 1774 */
/* move/from16 v94, p25 */
/* .line 1776 */
} // :cond_a
/* const v2, 0x8000 */
/* add-int v2, v2, v95 */
int v3 = 1; // const/4 v3, 0x1
/* sub-int/2addr v2, v3 */
/* shr-int/lit8 v95, v2, 0xf */
/* .line 1777 */
/* const v2, 0x8000 */
/* add-int v2, v2, v94 */
int v3 = 1; // const/4 v3, 0x1
/* sub-int/2addr v2, v3 */
/* shr-int/lit8 v94, v2, 0xf */
/* .line 1779 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_y0:I */
/* move v2, v0 */
/* move/from16 v0, v94 */
/* move v1, v2 */
/* if-lt v0, v1, :cond_0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_y1:I */
/* move v2, v0 */
/* move/from16 v0, v95 */
/* move v1, v2 */
/* if-ge v0, v1, :cond_0 */
/* .line 1852 */
} // .end local v76 # "dx":I
} // .end local v82 # "ux":J
} // .end local v84 # "uy":J
} // .end local v86 # "vx":J
} // .end local v88 # "vy":J
} // .end local v90 # "xmax":I
} // .end local v91 # "xmaxi":I
} // .end local v92 # "xmin":I
} // .end local v93 # "xmini":I
} // .end local v94 # "ymax":I
} // .end local v95 # "ymin":I
} // :cond_b
/* const v2, 0x6666666 */
/* move/from16 v0, p8 */
/* move v1, v2 */
/* if-lt v0, v1, :cond_c */
/* const v2, 0x6666666 */
/* move/from16 v0, p17 */
/* move v1, v2 */
/* if-lt v0, v1, :cond_c */
/* const v2, 0x6666666 */
/* move/from16 v0, p26 */
/* move v1, v2 */
/* if-ge v0, v1, :cond_0 */
/* .line 1864 */
} // :cond_c
/* add-int v2, p1, p10 */
/* shr-int/lit8 v12, v2, 0x1 */
/* .line 1865 */
/* .local v12, "x01":I */
/* add-int v2, p2, p11 */
/* shr-int/lit8 v13, v2, 0x1 */
/* .line 1866 */
/* .local v13, "y01":I */
/* add-int v2, p3, p12 */
/* shr-int/lit8 v14, v2, 0x1 */
/* .line 1867 */
/* .local v14, "z01":I */
/* add-int v2, p4, p13 */
/* shr-int/lit8 v15, v2, 0x1 */
/* .line 1868 */
/* .local v15, "u01":I */
/* add-int v2, p5, p14 */
/* shr-int/lit8 v16, v2, 0x1 */
/* .line 1869 */
/* .local v16, "v01":I */
/* add-int v2, p9, p18 */
/* shr-int/lit8 v20, v2, 0x1 */
/* .line 1871 */
/* .local v20, "i01":I */
/* add-int v2, p1, p19 */
/* shr-int/lit8 v21, v2, 0x1 */
/* .line 1872 */
/* .local v21, "x02":I */
/* add-int v2, p2, p20 */
/* shr-int/lit8 v22, v2, 0x1 */
/* .line 1873 */
/* .local v22, "y02":I */
/* add-int v2, p3, p21 */
/* shr-int/lit8 v23, v2, 0x1 */
/* .line 1874 */
/* .local v23, "z02":I */
/* add-int v2, p4, p22 */
/* shr-int/lit8 v24, v2, 0x1 */
/* .line 1875 */
/* .local v24, "u02":I */
/* add-int v2, p5, p23 */
/* shr-int/lit8 v25, v2, 0x1 */
/* .line 1876 */
/* .local v25, "v02":I */
/* add-int v2, p9, p27 */
/* shr-int/lit8 v29, v2, 0x1 */
/* .line 1878 */
/* .local v29, "i02":I */
/* add-int v2, p10, p19 */
/* shr-int/lit8 v49, v2, 0x1 */
/* .line 1879 */
/* .local v49, "x12":I */
/* add-int v2, p11, p20 */
/* shr-int/lit8 v50, v2, 0x1 */
/* .line 1880 */
/* .local v50, "y12":I */
/* add-int v2, p12, p21 */
/* shr-int/lit8 v51, v2, 0x1 */
/* .line 1881 */
/* .local v51, "z12":I */
/* add-int v2, p13, p22 */
/* shr-int/lit8 v52, v2, 0x1 */
/* .line 1882 */
/* .local v52, "u12":I */
/* add-int v2, p14, p23 */
/* shr-int/lit8 v53, v2, 0x1 */
/* .line 1883 */
/* .local v53, "v12":I */
/* add-int v2, p18, p27 */
/* shr-int/lit8 v57, v2, 0x1 */
/* .line 1889 */
/* .local v57, "i12":I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_D:I */
/* move/from16 v79, v0 */
/* .line 1890 */
/* .local v79, "sd":I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_sox0:I */
/* move/from16 v80, v0 */
/* .line 1891 */
/* .local v80, "sx":I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_soy0:I */
/* move/from16 v81, v0 */
/* .line 1894 */
/* .local v81, "sy":I */
/* const/high16 v2, 0x40000 */
/* if-lt v14, v2, :cond_14 */
/* .line 1895 */
v19 = v.V3dView .finvd ( v14 );
/* .line 1896 */
/* .local v19, "w01":I */
/* move/from16 v0, v79 */
/* int-to-long v0, v0 */
/* move-wide v2, v0 */
/* move/from16 v0, v19 */
/* int-to-long v0, v0 */
/* move-wide v4, v0 */
/* mul-long v77, v2, v4 */
/* .line 1897 */
/* .local v77, "dz":J */
/* int-to-long v2, v12 */
/* mul-long v2, v2, v77 */
/* const/16 v4, 0x1e */
/* shr-long/2addr v2, v4 */
v2 = v.V3dView .fl2i ( v2,v3 );
/* add-int v17, v80, v2 */
/* .line 1898 */
/* .local v17, "sx01":I */
/* int-to-long v2, v13 */
/* mul-long v2, v2, v77 */
/* const/16 v4, 0x1e */
/* shr-long/2addr v2, v4 */
v2 = v.V3dView .fl2i ( v2,v3 );
/* sub-int v18, v81, v2 */
/* .line 1906 */
} // .end local v77 # "dz":J
/* .local v18, "sy01":I */
} // :goto_1
/* const/high16 v2, 0x40000 */
/* move/from16 v0, v23 */
/* move v1, v2 */
/* if-lt v0, v1, :cond_15 */
/* .line 1907 */
v28 = /* invoke-static/range {v23 ..v23}, Lv/V3dView;->finvd(I)I */
/* .line 1908 */
/* .local v28, "w02":I */
/* move/from16 v0, v79 */
/* int-to-long v0, v0 */
/* move-wide v2, v0 */
/* move/from16 v0, v28 */
/* int-to-long v0, v0 */
/* move-wide v4, v0 */
/* mul-long v77, v2, v4 */
/* .line 1909 */
/* .restart local v77 # "dz":J */
/* move/from16 v0, v21 */
/* int-to-long v0, v0 */
/* move-wide v2, v0 */
/* mul-long v2, v2, v77 */
/* const/16 v4, 0x1e */
/* shr-long/2addr v2, v4 */
v2 = v.V3dView .fl2i ( v2,v3 );
/* add-int v26, v80, v2 */
/* .line 1910 */
/* .local v26, "sx02":I */
/* move/from16 v0, v22 */
/* int-to-long v0, v0 */
/* move-wide v2, v0 */
/* mul-long v2, v2, v77 */
/* const/16 v4, 0x1e */
/* shr-long/2addr v2, v4 */
v2 = v.V3dView .fl2i ( v2,v3 );
/* sub-int v27, v81, v2 */
/* .line 1918 */
} // .end local v77 # "dz":J
/* .local v27, "sy02":I */
} // :goto_2
/* const/high16 v2, 0x40000 */
/* move/from16 v0, v51 */
/* move v1, v2 */
/* if-lt v0, v1, :cond_16 */
/* .line 1919 */
v56 = /* invoke-static/range {v51 ..v51}, Lv/V3dView;->finvd(I)I */
/* .line 1920 */
/* .local v56, "w12":I */
/* move/from16 v0, v79 */
/* int-to-long v0, v0 */
/* move-wide v2, v0 */
/* move/from16 v0, v56 */
/* int-to-long v0, v0 */
/* move-wide v4, v0 */
/* mul-long v77, v2, v4 */
/* .line 1921 */
/* .restart local v77 # "dz":J */
/* move/from16 v0, v49 */
/* int-to-long v0, v0 */
/* move-wide v2, v0 */
/* mul-long v2, v2, v77 */
/* const/16 v4, 0x1e */
/* shr-long/2addr v2, v4 */
v2 = v.V3dView .fl2i ( v2,v3 );
/* add-int v54, v80, v2 */
/* .line 1922 */
/* .local v54, "sx12":I */
/* move/from16 v0, v50 */
/* int-to-long v0, v0 */
/* move-wide v2, v0 */
/* mul-long v2, v2, v77 */
/* const/16 v4, 0x1e */
/* shr-long/2addr v2, v4 */
v2 = v.V3dView .fl2i ( v2,v3 );
/* sub-int v55, v81, v2 */
} // .end local v77 # "dz":J
/* .local v55, "sy12":I */
} // :goto_3
/* move-object/from16 v2, p0 */
/* move/from16 v3, p1 */
/* move/from16 v4, p2 */
/* move/from16 v5, p3 */
/* move/from16 v6, p4 */
/* move/from16 v7, p5 */
/* move/from16 v8, p6 */
/* move/from16 v9, p7 */
/* move/from16 v10, p8 */
/* move/from16 v11, p9 */
/* .line 1940 */
/* invoke-direct/range {v2 ..v29}, Lv/V3dView;->subeye(IIIIIIIIIIIIIIIIIIIIIIIIIII)V */
/* move-object/from16 v30, p0 */
/* move/from16 v31, v12 */
/* move/from16 v32, v13 */
/* move/from16 v33, v14 */
/* move/from16 v34, v15 */
/* move/from16 v35, v16 */
/* move/from16 v36, v17 */
/* move/from16 v37, v18 */
/* move/from16 v38, v19 */
/* move/from16 v39, v20 */
/* move/from16 v40, p10 */
/* move/from16 v41, p11 */
/* move/from16 v42, p12 */
/* move/from16 v43, p13 */
/* move/from16 v44, p14 */
/* move/from16 v45, p15 */
/* move/from16 v46, p16 */
/* move/from16 v47, p17 */
/* move/from16 v48, p18 */
/* .line 1948 */
/* invoke-direct/range {v30 ..v57}, Lv/V3dView;->subeye(IIIIIIIIIIIIIIIIIIIIIIIIIII)V */
/* move-object/from16 v39, p0 */
/* move/from16 v40, v21 */
/* move/from16 v41, v22 */
/* move/from16 v42, v23 */
/* move/from16 v43, v24 */
/* move/from16 v44, v25 */
/* move/from16 v45, v26 */
/* move/from16 v46, v27 */
/* move/from16 v47, v28 */
/* move/from16 v48, v29 */
/* move/from16 v58, p19 */
/* move/from16 v59, p20 */
/* move/from16 v60, p21 */
/* move/from16 v61, p22 */
/* move/from16 v62, p23 */
/* move/from16 v63, p24 */
/* move/from16 v64, p25 */
/* move/from16 v65, p26 */
/* move/from16 v66, p27 */
/* .line 1956 */
/* invoke-direct/range {v39 ..v66}, Lv/V3dView;->subeye(IIIIIIIIIIIIIIIIIIIIIIIIIII)V */
/* move-object/from16 v48, p0 */
/* move/from16 v58, v21 */
/* move/from16 v59, v22 */
/* move/from16 v60, v23 */
/* move/from16 v61, v24 */
/* move/from16 v62, v25 */
/* move/from16 v63, v26 */
/* move/from16 v64, v27 */
/* move/from16 v65, v28 */
/* move/from16 v66, v29 */
/* move/from16 v67, v12 */
/* move/from16 v68, v13 */
/* move/from16 v69, v14 */
/* move/from16 v70, v15 */
/* move/from16 v71, v16 */
/* move/from16 v72, v17 */
/* move/from16 v73, v18 */
/* move/from16 v74, v19 */
/* move/from16 v75, v20 */
/* .line 1964 */
/* invoke-direct/range {v48 ..v75}, Lv/V3dView;->subeye(IIIIIIIIIIIIIIIIIIIIIIIIIII)V */
/* goto/16 :goto_0 */
/* .line 1791 */
} // .end local v12 # "x01":I
} // .end local v13 # "y01":I
} // .end local v14 # "z01":I
} // .end local v15 # "u01":I
} // .end local v16 # "v01":I
} // .end local v17 # "sx01":I
} // .end local v18 # "sy01":I
} // .end local v19 # "w01":I
} // .end local v20 # "i01":I
} // .end local v21 # "x02":I
} // .end local v22 # "y02":I
} // .end local v23 # "z02":I
} // .end local v24 # "u02":I
} // .end local v25 # "v02":I
} // .end local v26 # "sx02":I
} // .end local v27 # "sy02":I
} // .end local v28 # "w02":I
} // .end local v29 # "i02":I
} // .end local v49 # "x12":I
} // .end local v50 # "y12":I
} // .end local v51 # "z12":I
} // .end local v52 # "u12":I
} // .end local v53 # "v12":I
} // .end local v54 # "sx12":I
} // .end local v55 # "sy12":I
} // .end local v56 # "w12":I
} // .end local v57 # "i12":I
} // .end local v79 # "sd":I
} // .end local v80 # "sx":I
} // .end local v81 # "sy":I
/* .restart local v76 # "dx":I */
/* .restart local v82 # "ux":J */
/* .restart local v84 # "uy":J */
/* .restart local v86 # "vx":J */
/* .restart local v88 # "vy":J */
/* .restart local v90 # "xmax":I */
/* .restart local v91 # "xmaxi":I */
/* .restart local v92 # "xmin":I */
/* .restart local v93 # "xmini":I */
} // :cond_d
/* move/from16 v0, p8 */
/* int-to-long v0, v0 */
/* move-wide v2, v0 */
/* move/from16 v0, p4 */
/* int-to-long v0, v0 */
/* move-wide v4, v0 */
/* mul-long/2addr v2, v4 */
/* const/16 v4, 0x1e */
/* shr-long/2addr v2, v4 */
/* move-wide v0, v2 */
/* long-to-int v0, v0 */
/* move/from16 p4, v0 */
/* .line 1792 */
/* move/from16 v0, p8 */
/* int-to-long v0, v0 */
/* move-wide v2, v0 */
/* move/from16 v0, p5 */
/* int-to-long v0, v0 */
/* move-wide v4, v0 */
/* mul-long/2addr v2, v4 */
/* const/16 v4, 0x1e */
/* shr-long/2addr v2, v4 */
/* move-wide v0, v2 */
/* long-to-int v0, v0 */
/* move/from16 p5, v0 */
/* .line 1794 */
/* move/from16 v0, p17 */
/* int-to-long v0, v0 */
/* move-wide v2, v0 */
/* move/from16 v0, p13 */
/* int-to-long v0, v0 */
/* move-wide v4, v0 */
/* mul-long/2addr v2, v4 */
/* const/16 v4, 0x1e */
/* shr-long/2addr v2, v4 */
/* move-wide v0, v2 */
/* long-to-int v0, v0 */
/* move/from16 p13, v0 */
/* .line 1795 */
/* move/from16 v0, p17 */
/* int-to-long v0, v0 */
/* move-wide v2, v0 */
/* move/from16 v0, p14 */
/* int-to-long v0, v0 */
/* move-wide v4, v0 */
/* mul-long/2addr v2, v4 */
/* const/16 v4, 0x1e */
/* shr-long/2addr v2, v4 */
/* move-wide v0, v2 */
/* long-to-int v0, v0 */
/* move/from16 p14, v0 */
/* .line 1797 */
/* move/from16 v0, p26 */
/* int-to-long v0, v0 */
/* move-wide v2, v0 */
/* move/from16 v0, p22 */
/* int-to-long v0, v0 */
/* move-wide v4, v0 */
/* mul-long/2addr v2, v4 */
/* const/16 v4, 0x1e */
/* shr-long/2addr v2, v4 */
/* move-wide v0, v2 */
/* long-to-int v0, v0 */
/* move/from16 p22, v0 */
/* .line 1798 */
/* move/from16 v0, p26 */
/* int-to-long v0, v0 */
/* move-wide v2, v0 */
/* move/from16 v0, p23 */
/* int-to-long v0, v0 */
/* move-wide v4, v0 */
/* mul-long/2addr v2, v4 */
/* const/16 v4, 0x1e */
/* shr-long/2addr v2, v4 */
/* move-wide v0, v2 */
/* long-to-int v0, v0 */
/* move/from16 p23, v0 */
/* .line 1814 */
/* move/from16 v0, p7 */
/* move/from16 v1, p16 */
/* if-lt v0, v1, :cond_e */
/* move/from16 v0, p7 */
/* move/from16 v1, p16 */
/* if-ne v0, v1, :cond_10 */
/* move/from16 v0, p6 */
/* move/from16 v1, p15 */
/* if-ge v0, v1, :cond_10 */
} // :cond_e
/* move/from16 v0, p7 */
/* move/from16 v1, p25 */
/* if-lt v0, v1, :cond_f */
/* move/from16 v0, p7 */
/* move/from16 v1, p25 */
/* if-ne v0, v1, :cond_10 */
/* move/from16 v0, p6 */
/* move/from16 v1, p24 */
/* if-ge v0, v1, :cond_10 */
} // :cond_f
/* move-object/from16 v2, p0 */
/* move/from16 v3, p6 */
/* move/from16 v4, p7 */
/* move/from16 v5, p8 */
/* move/from16 v6, p4 */
/* move/from16 v7, p5 */
/* move/from16 v8, p9 */
/* move/from16 v9, p15 */
/* move/from16 v10, p16 */
/* move/from16 v11, p17 */
/* move/from16 v12, p13 */
/* move/from16 v13, p14 */
/* move/from16 v14, p18 */
/* move/from16 v15, p24 */
/* move/from16 v16, p25 */
/* move/from16 v17, p26 */
/* move/from16 v18, p22 */
/* move/from16 v19, p23 */
/* move/from16 v20, p27 */
/* .line 1818 */
/* invoke-direct/range {v2 ..v20}, Lv/V3dView;->subedge(IIIIIIIIIIIIIIIIII)V */
/* goto/16 :goto_0 */
/* .line 1823 */
} // :cond_10
/* move/from16 v0, p25 */
/* move/from16 v1, p16 */
/* if-lt v0, v1, :cond_11 */
/* move/from16 v0, p25 */
/* move/from16 v1, p16 */
/* if-ne v0, v1, :cond_13 */
/* move/from16 v0, p24 */
/* move/from16 v1, p15 */
/* if-ge v0, v1, :cond_13 */
} // :cond_11
/* move/from16 v0, p25 */
/* move/from16 v1, p7 */
/* if-lt v0, v1, :cond_12 */
/* move/from16 v0, p25 */
/* move/from16 v1, p7 */
/* if-ne v0, v1, :cond_13 */
/* move/from16 v0, p24 */
/* move/from16 v1, p6 */
/* if-ge v0, v1, :cond_13 */
} // :cond_12
/* move-object/from16 v2, p0 */
/* move/from16 v3, p24 */
/* move/from16 v4, p25 */
/* move/from16 v5, p26 */
/* move/from16 v6, p22 */
/* move/from16 v7, p23 */
/* move/from16 v8, p27 */
/* move/from16 v9, p6 */
/* move/from16 v10, p7 */
/* move/from16 v11, p8 */
/* move/from16 v12, p4 */
/* move/from16 v13, p5 */
/* move/from16 v14, p9 */
/* move/from16 v15, p15 */
/* move/from16 v16, p16 */
/* move/from16 v17, p17 */
/* move/from16 v18, p13 */
/* move/from16 v19, p14 */
/* move/from16 v20, p18 */
/* .line 1827 */
/* invoke-direct/range {v2 ..v20}, Lv/V3dView;->subedge(IIIIIIIIIIIIIIIIII)V */
/* goto/16 :goto_0 */
} // :cond_13
/* move-object/from16 v2, p0 */
/* move/from16 v3, p15 */
/* move/from16 v4, p16 */
/* move/from16 v5, p17 */
/* move/from16 v6, p13 */
/* move/from16 v7, p14 */
/* move/from16 v8, p18 */
/* move/from16 v9, p24 */
/* move/from16 v10, p25 */
/* move/from16 v11, p26 */
/* move/from16 v12, p22 */
/* move/from16 v13, p23 */
/* move/from16 v14, p27 */
/* move/from16 v15, p6 */
/* move/from16 v16, p7 */
/* move/from16 v17, p8 */
/* move/from16 v18, p4 */
/* move/from16 v19, p5 */
/* move/from16 v20, p9 */
/* .line 1836 */
/* invoke-direct/range {v2 ..v20}, Lv/V3dView;->subedge(IIIIIIIIIIIIIIIIII)V */
/* goto/16 :goto_0 */
/* .line 1901 */
} // .end local v76 # "dx":I
} // .end local v82 # "ux":J
} // .end local v84 # "uy":J
} // .end local v86 # "vx":J
} // .end local v88 # "vy":J
} // .end local v90 # "xmax":I
} // .end local v91 # "xmaxi":I
} // .end local v92 # "xmin":I
} // .end local v93 # "xmini":I
/* .restart local v12 # "x01":I */
/* .restart local v13 # "y01":I */
/* .restart local v14 # "z01":I */
/* .restart local v15 # "u01":I */
/* .restart local v16 # "v01":I */
/* .restart local v20 # "i01":I */
/* .restart local v21 # "x02":I */
/* .restart local v22 # "y02":I */
/* .restart local v23 # "z02":I */
/* .restart local v24 # "u02":I */
/* .restart local v25 # "v02":I */
/* .restart local v29 # "i02":I */
/* .restart local v49 # "x12":I */
/* .restart local v50 # "y12":I */
/* .restart local v51 # "z12":I */
/* .restart local v52 # "u12":I */
/* .restart local v53 # "v12":I */
/* .restart local v57 # "i12":I */
/* .restart local v79 # "sd":I */
/* .restart local v80 # "sx":I */
/* .restart local v81 # "sy":I */
} // :cond_14
/* const/16 v17, 0x0 */
/* .line 1902 */
/* .restart local v17 # "sx01":I */
/* const/16 v18, 0x0 */
/* .line 1903 */
/* .restart local v18 # "sy01":I */
/* const/high16 v19, 0x8000000 */
/* .restart local v19 # "w01":I */
/* goto/16 :goto_1 */
/* .line 1913 */
} // :cond_15
/* const/16 v26, 0x0 */
/* .line 1914 */
/* .restart local v26 # "sx02":I */
/* const/16 v27, 0x0 */
/* .line 1915 */
/* .restart local v27 # "sy02":I */
/* const/high16 v28, 0x8000000 */
/* .restart local v28 # "w02":I */
/* goto/16 :goto_2 */
/* .line 1925 */
} // :cond_16
/* const/16 v54, 0x0 */
/* .line 1926 */
/* .restart local v54 # "sx12":I */
/* const/16 v55, 0x0 */
/* .line 1927 */
/* .restart local v55 # "sy12":I */
/* const/high16 v56, 0x8000000 */
/* .restart local v56 # "w12":I */
/* goto/16 :goto_3 */
} // .end method
/* # virtual methods */
public void destroy ( ) {
/* .locals 1 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 123 */
/* invoke-super {p0}, Lv/Viewport;->destroy()V */
/* .line 125 */
this.m_optcop = v0;
/* .line 126 */
/* .line 128 */
/* .line 129 */
/* .line 130 */
/* .line 132 */
/* .line 133 */
/* .line 134 */
/* .line 136 */
this.m_zbuf = v0;
/* .line 137 */
return;
} // .end method
void drawModel ( v.Vsprite p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 56 */
/* .param p1, "ps" # Lv/Vsprite; */
/* .param p2, "clipx0" # I */
/* .param p3, "clipy0" # I */
/* .param p4, "clipx1" # I */
/* .param p5, "clipy1" # I */
/* .prologue */
/* .line 141 */
/* move/from16 v0, p2 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lv/V3dView;->m_x0:I */
/* .line 142 */
/* move/from16 v0, p3 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lv/V3dView;->m_y0:I */
/* .line 143 */
/* move/from16 v0, p4 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lv/V3dView;->m_x1:I */
/* .line 144 */
/* move/from16 v0, p5 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lv/V3dView;->m_y1:I */
/* .line 146 */
/* move-object/from16 v0, p1 */
v0 = this.m_3dmodel;
/* move-object/from16 v43, v0 */
/* .line 151 */
/* .local v43, "m":Lv/V3dModel; */
/* move-object/from16 v0, v43 */
/* iget v0, v0, Lv/V3dModel;->m_nv:I */
/* move/from16 v46, v0 */
/* .line 153 */
/* .local v46, "nv":I */
/* move-object/from16 v0, p1 */
v0 = this.m_mt;
/* move-object v5, v0 */
int v6 = 0; // const/4 v6, 0x0
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v43 */
/* move-object v2, v5 */
/* move v3, v6 */
/* move/from16 v4, v46 */
(( v.V3dView ) v0 ).transform ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lv/V3dView;->transform(Lv/V3dModel;Lv/Vmat;II)V
/* .line 155 */
v44 = v.V3dModel.m_material;
/* .line 157 */
/* .local v44, "ma":[Lv/V3dMaterial; */
/* move-object/from16 v0, v43 */
v0 = this.m_a;
/* move-object/from16 v36, v0 */
/* .line 158 */
/* .local v36, "fa":[S */
/* move-object/from16 v0, v43 */
v0 = this.m_b;
/* move-object/from16 v37, v0 */
/* .line 159 */
/* .local v37, "fb":[S */
/* move-object/from16 v0, v43 */
v0 = this.m_c;
/* move-object/from16 v38, v0 */
/* .line 161 */
/* .local v38, "fc":[S */
/* move-object/from16 v0, v43 */
v0 = this.m_mati;
/* move-object/from16 v40, v0 */
/* .line 163 */
/* .local v40, "fm":[B */
/* move-object/from16 v0, v43 */
v0 = this.m_nmap;
/* move-object/from16 v45, v0 */
/* .line 165 */
/* .local v45, "nmap":[S */
/* move-object/from16 v0, v43 */
v0 = this.m_shade;
/* move-object/from16 v47, v0 */
/* .line 166 */
/* .local v47, "shadea":[S */
/* move-object/from16 v0, v43 */
v0 = this.m_u;
/* move-object/from16 v48, v0 */
/* .line 167 */
/* .local v48, "uw":[S */
/* move-object/from16 v0, v43 */
v0 = this.m_v;
/* move-object/from16 v49, v0 */
/* .line 169 */
/* .local v49, "vw":[S */
v50 = v.V3dView.m_xe;
/* .line 170 */
/* .local v50, "xe":[I */
v52 = v.V3dView.m_ye;
/* .line 171 */
/* .local v52, "ye":[I */
v54 = v.V3dView.m_ze;
/* .line 173 */
/* .local v54, "ze":[I */
v51 = v.V3dView.m_xt;
/* .line 174 */
/* .local v51, "xt":[I */
v53 = v.V3dView.m_yt;
/* .line 175 */
/* .local v53, "yt":[I */
v55 = v.V3dView.m_zt;
/* .line 177 */
/* .local v55, "zt":[I */
/* move-object/from16 v0, v36 */
/* array-length v0, v0 */
/* move/from16 v42, v0 */
/* .line 183 */
/* .local v42, "fn":I */
int v5 = 1; // const/4 v5, 0x1
/* sub-int v39, v42, v5 */
/* .local v39, "fi":I */
} // :goto_0
/* if-gez v39, :cond_0 */
/* .line 221 */
return;
/* .line 185 */
} // :cond_0
/* aget-short v33, v36, v39 */
/* .line 186 */
/* .local v33, "a":I */
/* aget-short v34, v37, v39 */
/* .line 187 */
/* .local v34, "b":I */
/* aget-short v35, v38, v39 */
/* .line 191 */
/* .local v35, "c":I */
/* aget-short v5, v47, v33 */
/* shl-int/lit8 v14, v5, 0x8 */
/* .line 192 */
/* .local v14, "sa":I */
/* move/from16 v0, v33 */
/* move/from16 v1, v46 */
/* if-lt v0, v1, :cond_1 */
/* .line 193 */
/* sub-int v5, v33, v46 */
/* aget-short v33, v45, v5 */
/* .line 195 */
} // :cond_1
/* aget-short v5, v47, v34 */
/* shl-int/lit8 v23, v5, 0x8 */
/* .line 196 */
/* .local v23, "sb":I */
/* move/from16 v0, v34 */
/* move/from16 v1, v46 */
/* if-lt v0, v1, :cond_2 */
/* .line 197 */
/* sub-int v5, v34, v46 */
/* aget-short v34, v45, v5 */
/* .line 199 */
} // :cond_2
/* aget-short v5, v47, v35 */
/* shl-int/lit8 v32, v5, 0x8 */
/* .line 200 */
/* .local v32, "sc":I */
/* move/from16 v0, v35 */
/* move/from16 v1, v46 */
/* if-lt v0, v1, :cond_3 */
/* .line 201 */
/* sub-int v5, v35, v46 */
/* aget-short v35, v45, v5 */
/* .line 203 */
} // :cond_3
/* aget-byte v41, v40, v39 */
/* .line 204 */
/* .local v41, "fma":I */
/* aget-object v5, v44, v41 */
/* move-object v0, v5 */
/* move-object/from16 v1, p0 */
this.m_matc = v0;
/* .line 216 */
/* aget v6, v50, v33 */
/* aget v7, v52, v33 */
/* aget v8, v54, v33 */
/* aget-short v5, v48, v33 */
/* shl-int/lit8 v9, v5, 0xf */
/* aget-short v5, v49, v33 */
/* shl-int/lit8 v10, v5, 0xf */
/* aget v11, v51, v33 */
/* aget v12, v53, v33 */
/* aget v13, v55, v33 */
/* .line 217 */
/* aget v15, v50, v34 */
/* aget v16, v52, v34 */
/* aget v17, v54, v34 */
/* aget-short v5, v48, v34 */
/* shl-int/lit8 v18, v5, 0xf */
/* aget-short v5, v49, v34 */
/* shl-int/lit8 v19, v5, 0xf */
/* aget v20, v51, v34 */
/* aget v21, v53, v34 */
/* aget v22, v55, v34 */
/* .line 218 */
/* aget v24, v50, v35 */
/* aget v25, v52, v35 */
/* aget v26, v54, v35 */
/* aget-short v5, v48, v35 */
/* shl-int/lit8 v27, v5, 0xf */
/* aget-short v5, v49, v35 */
/* shl-int/lit8 v28, v5, 0xf */
/* aget v29, v51, v35 */
/* aget v30, v53, v35 */
/* aget v31, v55, v35 */
/* move-object/from16 v5, p0 */
/* .line 214 */
/* invoke-direct/range {v5 ..v32}, Lv/V3dView;->subeye(IIIIIIIIIIIIIIIIIIIIIIIIIII)V */
/* .line 183 */
/* add-int/lit8 v39, v39, -0x1 */
} // .end method
public v.Vsprite loadModel ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 224 */
/* new-instance v0, Lv/Vsprite; */
/* invoke-direct {v0}, Lv/Vsprite;-><init>()V */
/* .line 225 */
/* .local v0, "p":Lv/Vsprite; */
(( v.V3dView ) p0 ).loadModel ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lv/V3dView;->loadModel(Ljava/lang/String;Lv/Vsprite;)V
/* .line 226 */
} // .end method
public void loadModel ( java.lang.String p0, v.Vsprite p1 ) {
/* .locals 1 */
/* .param p1, "name0" # Ljava/lang/String; */
/* .param p2, "p" # Lv/Vsprite; */
/* .prologue */
/* .line 270 */
v.V3dModel .lookupModel ( p1 );
this.m_3dmodel = v0;
/* .line 272 */
return;
} // .end method
public void lookAt ( Integer p0 ) {
/* .locals 13 */
/* .param p1, "zoom" # I */
/* .prologue */
int v12 = 0; // const/4 v12, 0x0
/* .line 278 */
/* iput v12, p0, Lv/V3dView;->m_upn:I */
/* .line 280 */
v3 = this.m_tv;
/* .line 289 */
/* .local v3, "v":Lv/Vector; */
/* const/high16 v10, -0x1f40000 */
(( v.Vector ) v3 ).set ( v12, v12, v10 ); // invoke-virtual {v3, v12, v12, v10}, Lv/Vector;->set(III)V
/* .line 291 */
/* move-object v1, p0 */
/* .line 303 */
/* .local v1, "m":Lv/Vmat; */
/* iget v10, v3, Lv/Vector;->m_x:I */
/* iput v10, p0, Lv/V3dView;->m_wx:I */
/* .line 304 */
/* iget v10, v3, Lv/Vector;->m_y:I */
/* iput v10, p0, Lv/V3dView;->m_wy:I */
/* .line 305 */
/* iget v10, v3, Lv/Vector;->m_z:I */
/* iput v10, p0, Lv/V3dView;->m_wz:I */
/* .line 307 */
/* const v10, 0x8000 */
(( v.V3dView ) p0 ).renderChangeDetect ( v12, v12, v10 ); // invoke-virtual {p0, v12, v12, v10}, Lv/V3dView;->renderChangeDetect(III)V
/* .line 309 */
/* iget v10, p0, Lv/V3dView;->m_upn:I */
int v11 = 4; // const/4 v11, 0x4
/* if-lt v10, v11, :cond_7 */
/* .line 310 */
v10 = this.m_up;
/* aget v5, v10, v12 */
/* .line 311 */
/* .local v5, "x0":I */
v10 = this.m_up;
int v11 = 1; // const/4 v11, 0x1
/* aget v7, v10, v11 */
/* .line 312 */
/* .local v7, "y0":I */
v10 = this.m_up;
int v11 = 2; // const/4 v11, 0x2
/* aget v6, v10, v11 */
/* .line 313 */
/* .local v6, "x1":I */
v10 = this.m_up;
int v11 = 3; // const/4 v11, 0x3
/* aget v8, v10, v11 */
/* .line 317 */
/* .local v8, "y1":I */
/* iget v10, p0, Lv/V3dView;->m_width:I */
/* shr-int/lit8 v10, v10, 0x1 */
/* sub-int/2addr v5, v10 */
/* .line 318 */
/* iget v10, p0, Lv/V3dView;->m_width:I */
/* shr-int/lit8 v10, v10, 0x1 */
/* sub-int/2addr v6, v10 */
/* .line 320 */
/* if-gez v5, :cond_0 */
/* .line 321 */
/* neg-int v5, v5 */
/* .line 322 */
} // :cond_0
/* if-gez v6, :cond_1 */
/* .line 323 */
/* neg-int v6, v5 */
/* .line 324 */
} // :cond_1
/* if-ge v5, v6, :cond_2 */
/* .line 325 */
/* move v5, v6 */
/* .line 326 */
} // :cond_2
/* shl-int/lit8 v4, v5, 0x1 */
/* .line 328 */
/* .local v4, "w":I */
/* iget v10, p0, Lv/V3dView;->m_height:I */
/* shr-int/lit8 v10, v10, 0x1 */
/* sub-int/2addr v7, v10 */
/* .line 329 */
/* iget v10, p0, Lv/V3dView;->m_height:I */
/* shr-int/lit8 v10, v10, 0x1 */
/* sub-int/2addr v8, v10 */
/* .line 331 */
/* if-gez v7, :cond_3 */
/* .line 332 */
/* neg-int v7, v7 */
/* .line 333 */
} // :cond_3
/* if-gez v8, :cond_4 */
/* .line 334 */
/* neg-int v8, v8 */
/* .line 335 */
} // :cond_4
/* if-ge v7, v8, :cond_5 */
/* .line 336 */
/* move v7, v8 */
/* .line 337 */
} // :cond_5
/* shl-int/lit8 v0, v7, 0x1 */
/* .line 339 */
/* .local v0, "h":I */
/* shl-int/lit8 v10, v4, 0xf */
/* iget v11, p0, Lv/V3dView;->m_width:I */
/* div-int v2, v10, v11 */
/* .line 340 */
/* .local v2, "scale":I */
/* shl-int/lit8 v10, v0, 0xf */
/* iget v11, p0, Lv/V3dView;->m_height:I */
/* div-int v9, v10, v11 */
/* .line 341 */
/* .local v9, "yscale":I */
/* if-ge v2, v9, :cond_6 */
/* .line 342 */
/* move v2, v9 */
/* .line 344 */
} // :cond_6
(( v.Vector ) v3 ).multiply ( v2 ); // invoke-virtual {v3, v2}, Lv/Vector;->multiply(I)V
/* .line 345 */
(( v.Vector ) v3 ).divide ( p1 ); // invoke-virtual {v3, p1}, Lv/Vector;->divide(I)V
/* .line 347 */
/* iget v10, v3, Lv/Vector;->m_x:I */
/* iput v10, p0, Lv/V3dView;->m_wx:I */
/* .line 348 */
/* iget v10, v3, Lv/Vector;->m_y:I */
/* iput v10, p0, Lv/V3dView;->m_wy:I */
/* .line 349 */
/* iget v10, v3, Lv/Vector;->m_z:I */
/* iput v10, p0, Lv/V3dView;->m_wz:I */
/* .line 352 */
} // .end local v0 # "h":I
} // .end local v2 # "scale":I
} // .end local v4 # "w":I
} // .end local v5 # "x0":I
} // .end local v6 # "x1":I
} // .end local v7 # "y0":I
} // .end local v8 # "y1":I
} // .end local v9 # "yscale":I
} // :cond_7
/* iput v12, p0, Lv/V3dView;->m_upn:I */
/* .line 353 */
/* iget v10, p0, Lv/V3dView;->m_width:I */
/* iget v11, p0, Lv/V3dView;->m_height:I */
(( v.V3dView ) p0 ).redraw ( v12, v12, v10, v11 ); // invoke-virtual {p0, v12, v12, v10, v11}, Lv/V3dView;->redraw(IIII)V
/* .line 355 */
return;
} // .end method
void renderChangeDetect ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 25 */
/* .param p1, "x" # I */
/* .param p2, "y" # I */
/* .param p3, "scale" # I */
/* .prologue */
/* .line 360 */
int v5 = 0; // const/4 v5, 0x0
/* move v0, v5 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lv/V3dView;->m_offscreen:Z */
/* .line 385 */
/* move-object/from16 v0, p0 */
v0 = this.m_mt;
/* move-object/from16 v17, v0 */
/* .line 386 */
/* .local v17, "m":Lv/Vmat; */
/* invoke-virtual/range {v17 ..v17}, Lv/Vmat;->identity()V */
/* .line 387 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_wx:I */
/* move v5, v0 */
/* neg-int v5, v5 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_wy:I */
/* move v6, v0 */
/* neg-int v6, v6 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_wz:I */
/* move v7, v0 */
/* neg-int v7, v7 */
/* move-object/from16 v0, v17 */
/* move v1, v5 */
/* move v2, v6 */
/* move v3, v7 */
(( v.Vmat ) v0 ).translate ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lv/Vmat;->translate(III)V
/* .line 389 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_heading:I */
/* move v5, v0 */
/* move-object/from16 v0, v17 */
/* move v1, v5 */
(( v.Vmat ) v0 ).rotateY ( v1 ); // invoke-virtual {v0, v1}, Lv/Vmat;->rotateY(I)V
/* .line 390 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_pitch:I */
/* move v5, v0 */
/* move-object/from16 v0, v17 */
/* move v1, v5 */
(( v.Vmat ) v0 ).rotateX ( v1 ); // invoke-virtual {v0, v1}, Lv/Vmat;->rotateX(I)V
/* .line 393 */
int v5 = 0; // const/4 v5, 0x0
/* move v0, v5 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lv/V3dView;->m_changed:Z */
/* .line 395 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lv/V3dView;->m_static:Z */
/* move v5, v0 */
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 397 */
v5 = /* invoke-virtual/range {v17 ..v17}, Lv/Vmat;->checksumMatrix()I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_width:I */
/* move v6, v0 */
/* add-int/2addr v5, v6 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_height:I */
/* move v6, v0 */
/* add-int/2addr v5, v6 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_soy0:I */
/* move v6, v0 */
/* add-int v15, v5, v6 */
/* .line 398 */
/* .local v15, "csum":I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_csum:I */
/* move v5, v0 */
/* if-ne v15, v5, :cond_1 */
/* .line 461 */
} // .end local v15 # "csum":I
} // :cond_0
return;
/* .line 403 */
/* .restart local v15 # "csum":I */
} // :cond_1
/* move v0, v15 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lv/V3dView;->m_csum:I */
/* .line 406 */
} // .end local v15 # "csum":I
} // :cond_2
/* move-object/from16 v0, p0 */
v0 = this.m_light;
/* move-object v5, v0 */
int v6 = 0; // const/4 v6, 0x0
/* const/16 v7, -0x8000 */
int v8 = 0; // const/4 v8, 0x0
(( v.Vector ) v5 ).set ( v6, v7, v8 ); // invoke-virtual {v5, v6, v7, v8}, Lv/Vector;->set(III)V
/* .line 407 */
/* move-object/from16 v0, p0 */
v0 = this.m_light;
/* move-object v5, v0 */
/* move-object/from16 v0, v17 */
/* move-object v1, v5 */
(( v.Vmat ) v0 ).rotate ( v1 ); // invoke-virtual {v0, v1}, Lv/Vmat;->rotate(Lv/Vector;)V
/* .line 409 */
/* move-object/from16 v0, p0 */
v0 = this.m_child;
/* move-object v5, v0 */
/* move-object/from16 v0, p0 */
/* move-object v1, v5 */
/* move-object/from16 v2, v17 */
(( v.V3dView ) v0 ).renderChangeDetect ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lv/V3dView;->renderChangeDetect(Lv/Vsprite;Lv/Vmat;)V
/* .line 411 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_upn:I */
/* move v5, v0 */
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 413 */
/* move-object/from16 v0, p0 */
v0 = this.m_zbuf;
/* move-object v6, v0 */
/* .line 414 */
/* .local v6, "zbuf":[I */
if ( v6 != null) { // if-eqz v6, :cond_3
/* array-length v5, v6 */
/* move-object/from16 v0, p0 */
v0 = this.m_rgb;
/* move-object v7, v0 */
/* array-length v7, v7 */
/* if-ge v5, v7, :cond_4 */
/* .line 415 */
} // :cond_3
/* move-object/from16 v0, p0 */
v0 = this.m_rgb;
/* move-object v5, v0 */
/* move-object v0, v5 */
/* array-length v0, v0 */
/* move/from16 v18, v0 */
/* .line 416 */
/* .local v18, "rl":I */
/* move/from16 v0, v18 */
/* new-array v0, v0, [I */
/* move-object v6, v0 */
/* .line 417 */
/* move-object v0, v6 */
/* move-object/from16 v1, p0 */
this.m_zbuf = v0;
/* .line 421 */
} // .end local v18 # "rl":I
} // :cond_4
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_upn:I */
/* move/from16 v21, v0 */
/* .line 422 */
/* .local v21, "un":I */
/* const/16 v19, 0x0 */
/* .line 423 */
/* .local v19, "ui":I */
/* move-object/from16 v0, p0 */
v0 = this.m_up;
/* move-object/from16 v22, v0 */
/* .line 425 */
/* .local v22, "up":[I */
/* const/16 v24, 0x0 */
/* check-cast v24, [I */
/* .line 426 */
/* .local v24, "zbuf0":[I */
/* move-object/from16 v0, p0 */
v0 = this.m_child;
/* move-object v5, v0 */
/* move-object/from16 v0, p0 */
v0 = this.m_optcop;
/* move-object v7, v0 */
/* if-ne v5, v7, :cond_5 */
/* move-object/from16 v0, p0 */
v0 = this.m_child;
/* move-object v5, v0 */
if ( v5 != null) { // if-eqz v5, :cond_5
/* .line 434 */
/* move-object/from16 v0, p0 */
v0 = this.m_optcop;
/* move-object v5, v0 */
/* move-object v0, v5 */
v0 = this.m_zbuf;
/* move-object/from16 v24, v0 */
/* .line 437 */
} // :cond_5
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_width:I */
/* move v7, v0 */
/* .local v7, "width":I */
/* move/from16 v20, v19 */
/* .line 439 */
} // .end local v19 # "ui":I
/* .local v20, "ui":I */
} // :cond_6
} // :goto_0
/* move/from16 v0, v20 */
/* move/from16 v1, v21 */
/* if-ge v0, v1, :cond_0 */
/* .line 441 */
/* add-int/lit8 v19, v20, 0x1 */
} // .end local v20 # "ui":I
/* .restart local v19 # "ui":I */
/* aget v9, v22, v20 */
/* .line 442 */
/* .local v9, "x0":I */
/* add-int/lit8 v20, v19, 0x1 */
} // .end local v19 # "ui":I
/* .restart local v20 # "ui":I */
/* aget v10, v22, v19 */
/* .line 443 */
/* .local v10, "y0":I */
/* add-int/lit8 v19, v20, 0x1 */
} // .end local v20 # "ui":I
/* .restart local v19 # "ui":I */
/* aget v11, v22, v20 */
/* .line 444 */
/* .local v11, "x1":I */
/* add-int/lit8 v20, v19, 0x1 */
} // .end local v19 # "ui":I
/* .restart local v20 # "ui":I */
/* aget v12, v22, v19 */
/* .line 448 */
/* .local v12, "y1":I */
if ( v24 != null) { // if-eqz v24, :cond_7
/* .line 450 */
/* sub-int v23, v11, v9 */
/* .line 451 */
/* .local v23, "w":I */
/* mul-int v5, v10, v7 */
/* add-int v16, v5, v9 */
/* .line 452 */
/* .local v16, "i":I */
/* move/from16 p2, v10 */
} // :goto_1
/* move/from16 v0, p2 */
/* move v1, v12 */
/* if-ge v0, v1, :cond_6 */
/* .line 453 */
/* move-object/from16 v0, v24 */
/* move/from16 v1, v16 */
/* move-object v2, v6 */
/* move/from16 v3, v16 */
/* move/from16 v4, v23 */
java.lang.System .arraycopy ( v0,v1,v2,v3,v4 );
/* .line 454 */
/* add-int v16, v16, v7 */
/* .line 452 */
/* add-int/lit8 p2, p2, 0x1 */
/* .line 458 */
} // .end local v16 # "i":I
} // .end local v23 # "w":I
} // :cond_7
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_height:I */
/* move v8, v0 */
int v13 = 0; // const/4 v13, 0x0
/* const/16 v14, 0xff */
/* move-object/from16 v5, p0 */
/* invoke-virtual/range {v5 ..v14}, Lv/V3dView;->drawRect([IIIIIIIII)V */
} // .end method
void renderChangeDetect ( v.Vsprite p0, v.Vmat p1 ) {
/* .locals 35 */
/* .param p1, "child" # Lv/Vsprite; */
/* .param p2, "m0" # Lv/Vmat; */
/* .prologue */
/* .line 464 */
} // :goto_0
/* if-nez p1, :cond_0 */
/* .line 700 */
return;
/* .line 466 */
} // :cond_0
/* move-object/from16 v0, p1 */
v0 = this.m_3dmodel;
/* move-object v13, v0 */
/* .line 468 */
/* .local v13, "p":Lv/V3dModel; */
/* if-nez v13, :cond_3 */
/* move-object/from16 v0, p1 */
v0 = this.m_child;
/* move-object/from16 v31, v0 */
if ( v31 != null) { // if-eqz v31, :cond_1
/* move-object/from16 v0, p1 */
v0 = this.m_child;
/* move-object/from16 v31, v0 */
/* move-object/from16 v0, v31 */
v0 = this.m_3dmodel;
/* move-object/from16 v31, v0 */
/* if-nez v31, :cond_3 */
} // :cond_1
/* move-object/from16 v0, p0 */
v0 = this.m_optcop;
/* move-object/from16 v31, v0 */
/* move-object/from16 v0, p1 */
/* move-object/from16 v1, v31 */
/* if-eq v0, v1, :cond_3 */
/* .line 470 */
/* const/16 v31, 0x0 */
/* const/16 v32, 0x0 */
/* const v33, 0x8000 */
/* move-object/from16 v0, p1 */
/* move/from16 v1, v31 */
/* move/from16 v2, v32 */
/* move/from16 v3, v33 */
(( v.Vsprite ) v0 ).renderChangeDetect ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lv/Vsprite;->renderChangeDetect(III)V
/* .line 698 */
} // :cond_2
} // :goto_1
/* move-object/from16 v0, p1 */
v0 = this.m_sibling;
/* move-object/from16 p1, v0 */
/* .line 475 */
} // :cond_3
/* move-object/from16 v0, p1 */
v0 = this.m_mt;
/* move-object v10, v0 */
/* .line 476 */
/* .local v10, "m":Lv/Vmat; */
/* if-nez v10, :cond_4 */
/* .line 480 */
/* new-instance v10, Lv/Vmat; */
} // .end local v10 # "m":Lv/Vmat;
/* invoke-direct {v10}, Lv/Vmat;-><init>()V */
/* .line 481 */
/* .restart local v10 # "m":Lv/Vmat; */
/* move-object v0, v10 */
/* move-object/from16 v1, p1 */
this.m_mt = v0;
/* .line 484 */
} // :cond_4
if ( v13 != null) { // if-eqz v13, :cond_7
/* move-object v0, v13 */
/* iget-boolean v0, v0, Lv/V3dModel;->m_decal:Z */
/* move/from16 v31, v0 */
if ( v31 != null) { // if-eqz v31, :cond_7
/* .line 488 */
(( v.Vmat ) v10 ).identity ( ); // invoke-virtual {v10}, Lv/Vmat;->identity()V
/* .line 490 */
/* move-object/from16 v0, p1 */
v0 = this.m_parent;
/* move-object v14, v0 */
/* .line 491 */
/* .local v14, "pa":Lv/Vsprite; */
/* move-object v0, v14 */
/* iget v0, v0, Lv/Vsprite;->m_wx:I */
/* move/from16 v31, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vsprite;->m_wx:I */
/* move/from16 v32, v0 */
/* add-int v31, v31, v32 */
/* move-object v0, v14 */
/* iget v0, v0, Lv/Vsprite;->m_wy:I */
/* move/from16 v32, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vsprite;->m_wy:I */
/* move/from16 v33, v0 */
/* add-int v32, v32, v33 */
/* move-object v0, v14 */
/* iget v0, v0, Lv/Vsprite;->m_wz:I */
/* move/from16 v33, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vsprite;->m_wz:I */
/* move/from16 v34, v0 */
/* add-int v33, v33, v34 */
/* move-object v0, v10 */
/* move/from16 v1, v31 */
/* move/from16 v2, v32 */
/* move/from16 v3, v33 */
(( v.Vmat ) v0 ).translate ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lv/Vmat;->translate(III)V
/* .line 493 */
/* move-object/from16 v0, p0 */
v0 = this.m_mt;
/* move-object/from16 v31, v0 */
/* move-object v0, v10 */
/* move-object/from16 v1, v31 */
(( v.Vmat ) v0 ).multiply ( v1 ); // invoke-virtual {v0, v1}, Lv/Vmat;->multiply(Lv/Vmat;)V
/* .line 502 */
} // .end local v14 # "pa":Lv/Vsprite;
} // :goto_2
if ( v13 != null) { // if-eqz v13, :cond_12
/* .line 503 */
v31 = (( v.Vmat ) v10 ).checksumMatrix ( ); // invoke-virtual {v10}, Lv/Vmat;->checksumMatrix()I
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_width:I */
/* move/from16 v32, v0 */
/* add-int v31, v31, v32 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_height:I */
/* move/from16 v32, v0 */
/* add-int v31, v31, v32 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_soy0:I */
/* move/from16 v32, v0 */
/* add-int v5, v31, v32 */
/* .line 505 */
/* .local v5, "csum":I */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vsprite;->m_csum:I */
/* move/from16 v31, v0 */
/* move v0, v5 */
/* move/from16 v1, v31 */
/* if-eq v0, v1, :cond_5 */
/* .line 507 */
/* const/16 v31, 0x1 */
/* move/from16 v0, v31 */
/* move-object/from16 v1, p0 */
/* iput-boolean v0, v1, Lv/V3dView;->m_changed:Z */
/* .line 511 */
/* move v0, v5 */
/* move-object/from16 v1, p1 */
/* iput v0, v1, Lv/Vsprite;->m_csum:I */
/* .line 517 */
/* iget v15, v13, Lv/V3dModel;->m_extentRadius:I */
/* .line 519 */
/* .local v15, "r":I */
if ( v15 != null) { // if-eqz v15, :cond_9
/* .line 524 */
/* move-object v0, v10 */
/* iget v0, v0, Lv/Vmat;->m_43:I */
/* move/from16 v30, v0 */
/* .line 526 */
/* .local v30, "ze":I */
/* const/high16 v31, 0x40000 */
/* move/from16 v0, v30 */
/* move/from16 v1, v31 */
/* if-lt v0, v1, :cond_8 */
/* .line 529 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_D:I */
/* move/from16 v31, v0 */
/* move/from16 v0, v31 */
/* int-to-long v0, v0 */
/* move-wide/from16 v31, v0 */
v33 = /* invoke-static/range {v30 ..v30}, Lv/V3dView;->finvd(I)I */
/* move/from16 v0, v33 */
/* int-to-long v0, v0 */
/* move-wide/from16 v33, v0 */
/* mul-long v6, v31, v33 */
/* .line 531 */
/* .local v6, "dz":J */
/* move-object v0, v10 */
/* iget v0, v0, Lv/Vmat;->m_41:I */
/* move/from16 v20, v0 */
/* .line 532 */
/* .local v20, "xe":I */
/* move-object v0, v10 */
/* iget v0, v0, Lv/Vmat;->m_42:I */
/* move/from16 v26, v0 */
/* .line 535 */
/* .local v26, "ye":I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_sox0:I */
/* move/from16 v31, v0 */
/* move/from16 v0, v20 */
/* int-to-long v0, v0 */
/* move-wide/from16 v32, v0 */
/* mul-long v32, v32, v6 */
/* const/16 v34, 0x1e */
/* shr-long v32, v32, v34 */
v32 = /* invoke-static/range {v32 ..v33}, Lv/V3dView;->fl2i(J)I */
/* add-int v21, v31, v32 */
/* .line 536 */
/* .local v21, "xs":I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_soy0:I */
/* move/from16 v31, v0 */
/* move/from16 v0, v26 */
/* int-to-long v0, v0 */
/* move-wide/from16 v32, v0 */
/* mul-long v32, v32, v6 */
/* const/16 v34, 0x1e */
/* shr-long v32, v32, v34 */
v32 = /* invoke-static/range {v32 ..v33}, Lv/V3dView;->fl2i(J)I */
/* sub-int v27, v31, v32 */
/* .line 539 */
/* .local v27, "ys":I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_soy0:I */
/* move/from16 v31, v0 */
/* add-int v32, v26, v15 */
/* move/from16 v0, v32 */
/* int-to-long v0, v0 */
/* move-wide/from16 v32, v0 */
/* mul-long v32, v32, v6 */
/* const/16 v34, 0x1e */
/* shr-long v32, v32, v34 */
v32 = /* invoke-static/range {v32 ..v33}, Lv/V3dView;->fl2i(J)I */
/* sub-int v28, v31, v32 */
/* .line 541 */
/* .local v28, "ys1":I */
/* sub-int v15, v27, v28 */
/* .line 544 */
/* sub-int v31, v21, v15 */
/* shr-int/lit8 v31, v31, 0xf */
/* .line 545 */
/* sub-int v32, v27, v15 */
/* shr-int/lit8 v32, v32, 0xf */
/* .line 546 */
/* add-int v33, v21, v15 */
/* move/from16 v0, v33 */
/* add-int/lit16 v0, v0, 0x7fff */
/* move/from16 v33, v0 */
/* shr-int/lit8 v33, v33, 0xf */
/* .line 547 */
/* add-int v34, v27, v15 */
/* move/from16 v0, v34 */
/* add-int/lit16 v0, v0, 0x7fff */
/* move/from16 v34, v0 */
/* shr-int/lit8 v34, v34, 0xf */
/* .line 543 */
/* move-object/from16 v0, p1 */
/* move/from16 v1, v31 */
/* move/from16 v2, v32 */
/* move/from16 v3, v33 */
/* move/from16 v4, v34 */
v31 = (( v.Vsprite ) v0 ).setExtent ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lv/Vsprite;->setExtent(IIII)Z
/* if-nez v31, :cond_5 */
/* .line 556 */
/* invoke-virtual/range {p1 ..p1}, Lv/Vsprite;->redraw()V */
/* .line 673 */
} // .end local v5 # "csum":I
} // .end local v6 # "dz":J
} // .end local v15 # "r":I
} // .end local v20 # "xe":I
} // .end local v21 # "xs":I
} // .end local v26 # "ye":I
} // .end local v27 # "ys":I
} // .end local v28 # "ys1":I
} // .end local v30 # "ze":I
} // :cond_5
} // :goto_3
/* move-object/from16 v0, p1 */
v0 = this.m_child;
/* move-object/from16 v31, v0 */
if ( v31 != null) { // if-eqz v31, :cond_2
/* .line 676 */
/* if-nez v13, :cond_6 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vsprite;->m_width:I */
/* move/from16 v31, v0 */
/* if-nez v31, :cond_2 */
/* .line 693 */
} // :cond_6
/* move-object/from16 v0, p1 */
v0 = this.m_child;
/* move-object/from16 v31, v0 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v31 */
/* move-object v2, v10 */
(( v.V3dView ) v0 ).renderChangeDetect ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lv/V3dView;->renderChangeDetect(Lv/Vsprite;Lv/Vmat;)V
/* goto/16 :goto_1 */
/* .line 497 */
} // :cond_7
/* move-object v0, v10 */
/* move-object/from16 v1, p1 */
(( v.Vmat ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lv/Vmat;->set(Lv/Vmat;)V
/* .line 498 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vsprite;->m_wx:I */
/* move/from16 v31, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vsprite;->m_wy:I */
/* move/from16 v32, v0 */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/Vsprite;->m_wz:I */
/* move/from16 v33, v0 */
/* move-object v0, v10 */
/* move/from16 v1, v31 */
/* move/from16 v2, v32 */
/* move/from16 v3, v33 */
(( v.Vmat ) v0 ).translate ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lv/Vmat;->translate(III)V
/* .line 499 */
/* move-object v0, v10 */
/* move-object/from16 v1, p2 */
(( v.Vmat ) v0 ).multiply ( v1 ); // invoke-virtual {v0, v1}, Lv/Vmat;->multiply(Lv/Vmat;)V
/* goto/16 :goto_2 */
/* .line 561 */
/* .restart local v5 # "csum":I */
/* .restart local v15 # "r":I */
/* .restart local v30 # "ze":I */
} // :cond_8
/* const/16 v31, 0x0 */
/* const/16 v32, 0x0 */
/* const/16 v33, 0x0 */
/* const/16 v34, 0x0 */
/* move-object/from16 v0, p1 */
/* move/from16 v1, v31 */
/* move/from16 v2, v32 */
/* move/from16 v3, v33 */
/* move/from16 v4, v34 */
(( v.Vsprite ) v0 ).setExtent ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lv/Vsprite;->setExtent(IIII)Z
/* .line 566 */
} // .end local v30 # "ze":I
} // :cond_9
/* move-object v0, v13 */
v0 = this.m_x;
/* move-object/from16 v31, v0 */
/* move-object/from16 v0, v31 */
/* array-length v0, v0 */
/* move v12, v0 */
/* .line 567 */
/* .local v12, "nv":I */
/* const/16 v31, 0x8 */
/* sub-int v9, v12, v31 */
/* .line 569 */
/* .local v9, "i0":I */
/* move-object/from16 v0, p0 */
/* move-object v1, v13 */
/* move-object v2, v10 */
/* move v3, v9 */
/* move v4, v12 */
(( v.V3dView ) v0 ).transform ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lv/V3dView;->transform(Lv/V3dModel;Lv/Vmat;II)V
/* .line 571 */
/* const v18, 0x7fffffff */
/* .line 572 */
/* .local v18, "x0":I */
/* const/high16 v19, -0x80000000 */
/* .line 573 */
/* .local v19, "x1":I */
/* const v24, 0x7fffffff */
/* .line 574 */
/* .local v24, "y0":I */
/* const/high16 v25, -0x80000000 */
/* .line 576 */
/* .local v25, "y1":I */
v22 = v.V3dView.m_xt;
/* .line 577 */
/* .local v22, "xt":[I */
v29 = v.V3dView.m_yt;
/* .line 579 */
/* .local v29, "yt":[I */
int v11 = 0; // const/4 v11, 0x0
/* .line 581 */
/* .local v11, "nbehind":I */
/* move v8, v9 */
/* .local v8, "i":I */
} // :goto_4
/* if-lt v8, v12, :cond_a */
/* .line 630 */
/* move/from16 v0, v18 */
/* move/from16 v1, v19 */
/* if-ge v0, v1, :cond_11 */
/* move/from16 v0, v24 */
/* move/from16 v1, v25 */
/* if-ge v0, v1, :cond_11 */
/* const/16 v31, 0x8 */
/* move v0, v11 */
/* move/from16 v1, v31 */
/* if-ge v0, v1, :cond_11 */
/* .line 637 */
/* shr-int/lit8 v31, v18, 0xf */
/* .line 638 */
/* shr-int/lit8 v32, v24, 0xf */
/* .line 639 */
/* move/from16 v0, v19 */
/* add-int/lit16 v0, v0, 0x7fff */
/* move/from16 v33, v0 */
/* shr-int/lit8 v33, v33, 0xf */
/* .line 640 */
/* move/from16 v0, v25 */
/* add-int/lit16 v0, v0, 0x7fff */
/* move/from16 v34, v0 */
/* shr-int/lit8 v34, v34, 0xf */
/* .line 636 */
/* move-object/from16 v0, p1 */
/* move/from16 v1, v31 */
/* move/from16 v2, v32 */
/* move/from16 v3, v33 */
/* move/from16 v4, v34 */
v31 = (( v.Vsprite ) v0 ).setExtent ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lv/Vsprite;->setExtent(IIII)Z
/* if-nez v31, :cond_5 */
/* .line 646 */
/* invoke-virtual/range {p1 ..p1}, Lv/Vsprite;->redraw()V */
/* goto/16 :goto_3 */
/* .line 582 */
} // :cond_a
v31 = v.V3dView.m_ze;
/* aget v31, v31, v8 */
/* const/high16 v32, 0x40000 */
/* move/from16 v0, v31 */
/* move/from16 v1, v32 */
/* if-lt v0, v1, :cond_f */
/* .line 584 */
/* aget v17, v22, v8 */
/* .line 585 */
/* .local v17, "x":I */
/* move/from16 v0, v17 */
/* move/from16 v1, v18 */
/* if-ge v0, v1, :cond_b */
/* .line 586 */
/* move/from16 v18, v17 */
/* .line 587 */
} // :cond_b
/* move/from16 v0, v17 */
/* move/from16 v1, v19 */
/* if-le v0, v1, :cond_c */
/* .line 588 */
/* move/from16 v19, v17 */
/* .line 590 */
} // :cond_c
/* aget v23, v29, v8 */
/* .line 591 */
/* .local v23, "y":I */
/* move/from16 v0, v23 */
/* move/from16 v1, v24 */
/* if-ge v0, v1, :cond_d */
/* .line 592 */
/* move/from16 v24, v23 */
/* .line 593 */
} // :cond_d
/* move/from16 v0, v23 */
/* move/from16 v1, v25 */
/* if-le v0, v1, :cond_e */
/* .line 594 */
/* move/from16 v25, v23 */
/* .line 581 */
} // .end local v17 # "x":I
} // .end local v23 # "y":I
} // :cond_e
} // :goto_5
/* add-int/lit8 v8, v8, 0x1 */
/* .line 603 */
} // :cond_f
/* add-int/lit8 v11, v11, 0x1 */
/* .line 616 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_height:I */
/* move/from16 v31, v0 */
/* shl-int/lit8 v16, v31, 0xf */
/* .line 617 */
/* .local v16, "u":I */
/* move/from16 v0, v25 */
/* move/from16 v1, v16 */
/* if-ge v0, v1, :cond_10 */
/* .line 618 */
/* move/from16 v25, v16 */
/* .line 619 */
} // :cond_10
/* const/16 v18, 0x0 */
/* .line 620 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_width:I */
/* move/from16 v31, v0 */
/* shl-int/lit8 v19, v31, 0xf */
/* .line 650 */
} // .end local v16 # "u":I
} // :cond_11
/* const/16 v31, 0x0 */
/* const/16 v32, 0x0 */
/* const/16 v33, 0x0 */
/* const/16 v34, 0x0 */
/* move-object/from16 v0, p1 */
/* move/from16 v1, v31 */
/* move/from16 v2, v32 */
/* move/from16 v3, v33 */
/* move/from16 v4, v34 */
(( v.Vsprite ) v0 ).setExtent ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lv/Vsprite;->setExtent(IIII)Z
/* goto/16 :goto_3 */
/* .line 655 */
} // .end local v5 # "csum":I
} // .end local v8 # "i":I
} // .end local v9 # "i0":I
} // .end local v11 # "nbehind":I
} // .end local v12 # "nv":I
} // .end local v15 # "r":I
} // .end local v18 # "x0":I
} // .end local v19 # "x1":I
} // .end local v22 # "xt":[I
} // .end local v24 # "y0":I
} // .end local v25 # "y1":I
} // .end local v29 # "yt":[I
} // :cond_12
/* move-object/from16 v0, p0 */
v0 = this.m_optcop;
/* move-object/from16 v31, v0 */
/* move-object/from16 v0, p1 */
/* move-object/from16 v1, v31 */
/* if-ne v0, v1, :cond_5 */
/* .line 659 */
/* move-object/from16 v0, p0 */
v0 = this.m_optcop;
/* move-object/from16 v31, v0 */
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v31 */
(( v.V3dView ) v0 ).viewCopy ( v1 ); // invoke-virtual {v0, v1}, Lv/V3dView;->viewCopy(Lv/V3dView;)V
/* .line 660 */
/* invoke-virtual/range {p1 ..p1}, Lv/Vsprite;->render()V */
/* goto/16 :goto_3 */
} // .end method
public Boolean screenResize ( ) {
/* .locals 3 */
/* .prologue */
/* .line 703 */
int v0 = 0; // const/4 v0, 0x0
/* .line 707 */
/* .local v0, "result":Z */
} // :goto_0
/* iget v1, p0, Lv/V3dView;->m_width2:I */
/* iget v2, p0, Lv/V3dView;->m_width:I */
/* if-ne v1, v2, :cond_0 */
/* iget v1, p0, Lv/V3dView;->m_height2:I */
/* iget v2, p0, Lv/V3dView;->m_height:I */
/* if-eq v1, v2, :cond_1 */
/* .line 708 */
} // :cond_0
/* iget v1, p0, Lv/V3dView;->m_width2:I */
/* iget v2, p0, Lv/V3dView;->m_height2:I */
/* invoke-super {p0, v1, v2}, Lv/Viewport;->setWidthHeight(II)V */
/* .line 710 */
int v0 = 1; // const/4 v0, 0x1
/* .line 715 */
/* iget v1, p0, Lv/V3dView;->m_width:I */
/* shr-int/lit8 v1, v1, 0x1 */
/* const/high16 v2, 0x20000 */
/* mul-int/2addr v1, v2 */
/* shr-int/lit8 v1, v1, 0xf */
/* iput v1, p0, Lv/V3dView;->m_D:I */
/* .line 719 */
/* iget v1, p0, Lv/V3dView;->m_width:I */
/* shl-int/lit8 v1, v1, 0xe */
/* iput v1, p0, Lv/V3dView;->m_sox0:I */
/* .line 720 */
/* iget v1, p0, Lv/V3dView;->m_height:I */
/* iget v2, p0, Lv/V3dView;->m_horizon:I */
/* mul-int/2addr v1, v2 */
/* iput v1, p0, Lv/V3dView;->m_soy0:I */
/* .line 723 */
} // :cond_1
/* iget-boolean v1, p0, Lv/V3dView;->m_pause:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
v1 = (( v.V3dView ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lv/V3dView;->isRunning()Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 724 */
(( v.V3dView ) p0 ).renderWait ( ); // invoke-virtual {p0}, Lv/V3dView;->renderWait()V
/* .line 728 */
} // :cond_2
} // .end method
public void setHorizon ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "frac" # I */
/* .prologue */
/* .line 733 */
/* iput p1, p0, Lv/V3dView;->m_horizon:I */
/* .line 734 */
/* iget v0, p0, Lv/V3dView;->m_height:I */
/* mul-int/2addr v0, p1 */
/* iput v0, p0, Lv/V3dView;->m_soy0:I */
/* .line 738 */
return;
} // .end method
public void setWidthHeight ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .param p1, "width" # I */
/* .param p2, "height" # I */
/* .prologue */
/* .line 742 */
/* iget v0, p0, Lv/V3dView;->m_width:I */
/* if-ne p1, v0, :cond_1 */
/* iget v0, p0, Lv/V3dView;->m_height:I */
/* if-ne p2, v0, :cond_1 */
/* .line 753 */
} // :cond_0
} // :goto_0
return;
/* .line 745 */
} // :cond_1
/* iput p1, p0, Lv/V3dView;->m_width2:I */
/* .line 746 */
/* iput p2, p0, Lv/V3dView;->m_height2:I */
/* .line 749 */
/* iget v0, p0, Lv/V3dView;->m_width:I */
/* if-nez v0, :cond_0 */
/* .line 750 */
(( v.V3dView ) p0 ).screenResize ( ); // invoke-virtual {p0}, Lv/V3dView;->screenResize()Z
} // .end method
void transform ( v.V3dModel p0, v.Vmat p1, Integer p2, Integer p3 ) {
/* .locals 64 */
/* .param p1, "m" # Lv/V3dModel; */
/* .param p2, "mat" # Lv/Vmat; */
/* .param p3, "i0" # I */
/* .param p4, "nv" # I */
/* .prologue */
/* .line 1975 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_D:I */
/* move v8, v0 */
/* .line 1976 */
/* .local v8, "ds":I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_sox0:I */
/* move/from16 v40, v0 */
/* .line 1977 */
/* .local v40, "sx0":I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/V3dView;->m_soy0:I */
/* move/from16 v41, v0 */
/* .line 1979 */
/* .local v41, "sy0":I */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lv/Vmat;->m_11:I */
/* move v4, v0 */
/* .line 1980 */
/* .local v4, "a":I */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lv/Vmat;->m_21:I */
/* move v5, v0 */
/* .line 1981 */
/* .local v5, "b":I */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lv/Vmat;->m_31:I */
/* move v6, v0 */
/* .line 1982 */
/* .local v6, "c":I */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lv/Vmat;->m_41:I */
/* move v7, v0 */
/* .line 1984 */
/* .local v7, "d":I */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lv/Vmat;->m_12:I */
/* move v13, v0 */
/* .line 1985 */
/* .local v13, "e":I */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lv/Vmat;->m_22:I */
/* move v14, v0 */
/* .line 1986 */
/* .local v14, "f":I */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lv/Vmat;->m_32:I */
/* move v15, v0 */
/* .line 1987 */
/* .local v15, "g":I */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lv/Vmat;->m_42:I */
/* move/from16 v16, v0 */
/* .line 1989 */
/* .local v16, "h":I */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lv/Vmat;->m_13:I */
/* move/from16 v20, v0 */
/* .line 1990 */
/* .local v20, "i":I */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lv/Vmat;->m_23:I */
/* move/from16 v21, v0 */
/* .line 1991 */
/* .local v21, "j":I */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lv/Vmat;->m_33:I */
/* move/from16 v22, v0 */
/* .line 1992 */
/* .local v22, "k":I */
/* move-object/from16 v0, p2 */
/* iget v0, v0, Lv/Vmat;->m_43:I */
/* move/from16 v23, v0 */
/* .line 1994 */
/* .local v23, "l":I */
/* move-object/from16 v0, p1 */
v0 = this.m_x;
/* move-object/from16 v48, v0 */
/* .line 1995 */
/* .local v48, "xw":[S */
/* move-object/from16 v0, p1 */
v0 = this.m_y;
/* move-object/from16 v53, v0 */
/* .line 1996 */
/* .local v53, "yw":[S */
/* move-object/from16 v0, p1 */
v0 = this.m_z;
/* move-object/from16 v59, v0 */
/* .line 1998 */
/* .local v59, "zw":[S */
v46 = v.V3dView.m_xe;
/* .line 2000 */
/* .local v46, "xea":[I */
if ( v46 != null) { // if-eqz v46, :cond_0
/* move-object/from16 v0, v46 */
/* array-length v0, v0 */
/* move/from16 v60, v0 */
/* move/from16 v0, v60 */
/* move/from16 v1, p4 */
/* if-ge v0, v1, :cond_1 */
/* .line 2002 */
} // :cond_0
/* move/from16 v0, p4 */
/* new-array v0, v0, [I */
/* move-object/from16 v46, v0 */
/* .line 2003 */
/* .line 2005 */
/* move/from16 v0, p4 */
/* new-array v0, v0, [I */
/* move-object/from16 v60, v0 */
/* .line 2006 */
/* move/from16 v0, p4 */
/* new-array v0, v0, [I */
/* move-object/from16 v60, v0 */
/* .line 2008 */
/* move/from16 v0, p4 */
/* new-array v0, v0, [I */
/* move-object/from16 v60, v0 */
/* .line 2009 */
/* move/from16 v0, p4 */
/* new-array v0, v0, [I */
/* move-object/from16 v60, v0 */
/* .line 2010 */
/* move/from16 v0, p4 */
/* new-array v0, v0, [I */
/* move-object/from16 v60, v0 */
/* .line 2016 */
} // :cond_1
v51 = v.V3dView.m_ye;
/* .line 2017 */
/* .local v51, "yea":[I */
v56 = v.V3dView.m_ze;
/* .line 2019 */
/* .local v56, "zea":[I */
v47 = v.V3dView.m_xt;
/* .line 2020 */
/* .local v47, "xt":[I */
v52 = v.V3dView.m_yt;
/* .line 2021 */
/* .local v52, "yt":[I */
v58 = v.V3dView.m_zt;
/* .line 2039 */
/* .local v58, "zt":[I */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/V3dModel;->m_vscale:I */
/* move/from16 v60, v0 */
/* move/from16 v0, v60 */
/* int-to-long v0, v0 */
/* move-wide/from16 v34, v0 */
/* .line 2041 */
/* .local v34, "scale":J */
/* move/from16 v43, p3 */
/* .local v43, "vi":I */
} // :goto_0
/* move/from16 v0, v43 */
/* move/from16 v1, p4 */
/* if-lt v0, v1, :cond_9 */
/* .line 2083 */
/* if-nez p3, :cond_8 */
/* .line 2088 */
/* move-object/from16 v0, p1 */
v0 = this.m_nx;
/* move-object/from16 v28, v0 */
/* .line 2089 */
/* .local v28, "nxa":[S */
/* if-nez v28, :cond_2 */
/* .line 2091 */
/* invoke-virtual/range {p1 ..p1}, Lv/V3dModel;->normals()V */
/* .line 2092 */
/* move-object/from16 v0, p1 */
v0 = this.m_nx;
/* move-object/from16 v28, v0 */
/* .line 2095 */
} // :cond_2
/* move-object/from16 v0, p1 */
v0 = this.m_ny;
/* move-object/from16 v30, v0 */
/* .line 2096 */
/* .local v30, "nya":[S */
/* move-object/from16 v0, p1 */
v0 = this.m_nz;
/* move-object/from16 v32, v0 */
/* .line 2097 */
/* .local v32, "nza":[S */
/* move-object/from16 v0, p1 */
v0 = this.m_shade;
/* move-object/from16 v37, v0 */
/* .line 2100 */
/* .local v37, "shadea":[S */
/* move-object/from16 v0, p0 */
v0 = this.m_tv;
/* move-object/from16 v42, v0 */
/* .line 2101 */
/* .local v42, "v":Lv/Vector; */
/* move-object/from16 v0, p0 */
v0 = this.m_light;
/* move-object/from16 v60, v0 */
/* move-object/from16 v0, p2 */
/* move-object/from16 v1, v42 */
/* move-object/from16 v2, v60 */
(( v.Vmat ) v0 ).rotateInverse ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lv/Vmat;->rotateInverse(Lv/Vector;Lv/Vector;)V
/* .line 2102 */
/* move-object/from16 v0, v42 */
/* iget v0, v0, Lv/Vector;->m_x:I */
/* move/from16 v24, v0 */
/* .line 2103 */
/* .local v24, "lightx":I */
/* move-object/from16 v0, v42 */
/* iget v0, v0, Lv/Vector;->m_y:I */
/* move/from16 v25, v0 */
/* .line 2104 */
/* .local v25, "lighty":I */
/* move-object/from16 v0, v42 */
/* iget v0, v0, Lv/Vector;->m_z:I */
/* move/from16 v26, v0 */
/* .line 2107 */
/* .local v26, "lightz":I */
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/V3dModel;->m_lightx:I */
/* move/from16 v60, v0 */
/* sub-int v9, v24, v60 */
/* .line 2108 */
/* .local v9, "dx":I */
/* if-gez v9, :cond_3 */
/* neg-int v9, v9 */
/* .line 2109 */
} // :cond_3
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/V3dModel;->m_lighty:I */
/* move/from16 v60, v0 */
/* sub-int v10, v25, v60 */
/* .line 2110 */
/* .local v10, "dy":I */
/* if-gez v10, :cond_4 */
/* neg-int v10, v10 */
/* .line 2111 */
} // :cond_4
/* move-object/from16 v0, p1 */
/* iget v0, v0, Lv/V3dModel;->m_lightz:I */
/* move/from16 v60, v0 */
/* sub-int v11, v26, v60 */
/* .line 2112 */
/* .local v11, "dz":I */
/* if-gez v11, :cond_5 */
/* neg-int v11, v11 */
/* .line 2116 */
} // :cond_5
/* move-object/from16 v0, p1 */
/* iget-boolean v0, v0, Lv/V3dModel;->m_specular:Z */
/* move/from16 v39, v0 */
/* .line 2119 */
/* .local v39, "specularp":Z */
/* if-nez v39, :cond_6 */
/* .line 2120 */
/* add-int v60, v9, v10 */
/* add-int v60, v60, v11 */
/* const/16 v61, 0x200 */
/* move/from16 v0, v60 */
/* move/from16 v1, v61 */
/* if-le v0, v1, :cond_8 */
/* .line 2121 */
} // :cond_6
/* move/from16 v0, v24 */
/* move-object/from16 v1, p1 */
/* iput v0, v1, Lv/V3dModel;->m_lightx:I */
/* .line 2122 */
/* move/from16 v0, v25 */
/* move-object/from16 v1, p1 */
/* iput v0, v1, Lv/V3dModel;->m_lighty:I */
/* .line 2123 */
/* move/from16 v0, v26 */
/* move-object/from16 v1, p1 */
/* iput v0, v1, Lv/V3dModel;->m_lightz:I */
/* .line 2130 */
if ( v39 != null) { // if-eqz v39, :cond_7
/* .line 2132 */
/* move-object/from16 v0, v42 */
/* move v1, v7 */
/* move/from16 v2, v16 */
/* move/from16 v3, v23 */
(( v.Vector ) v0 ).set ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lv/Vector;->set(III)V
/* .line 2133 */
/* move-object/from16 v0, p2 */
/* move-object/from16 v1, v42 */
/* move-object/from16 v2, v42 */
(( v.Vmat ) v0 ).rotateInverse ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lv/Vmat;->rotateInverse(Lv/Vector;Lv/Vector;)V
/* .line 2134 */
/* invoke-virtual/range {v42 ..v42}, Lv/Vector;->normalize()V */
/* .line 2135 */
/* move-object/from16 v0, v42 */
/* move/from16 v1, v24 */
/* move/from16 v2, v25 */
/* move/from16 v3, v26 */
(( v.Vector ) v0 ).add ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lv/Vector;->add(III)V
/* .line 2140 */
/* invoke-virtual/range {v42 ..v42}, Lv/Vector;->normalize()V */
/* .line 2143 */
} // :cond_7
/* move-object/from16 v0, v42 */
/* iget v0, v0, Lv/Vector;->m_x:I */
/* move/from16 v17, v0 */
/* .line 2144 */
/* .local v17, "halfx":I */
/* move-object/from16 v0, v42 */
/* iget v0, v0, Lv/Vector;->m_y:I */
/* move/from16 v18, v0 */
/* .line 2145 */
/* .local v18, "halfy":I */
/* move-object/from16 v0, v42 */
/* iget v0, v0, Lv/Vector;->m_z:I */
/* move/from16 v19, v0 */
/* .line 2147 */
/* .local v19, "halfz":I */
/* move-object/from16 v0, v28 */
/* array-length v0, v0 */
/* move/from16 v60, v0 */
/* const/16 v61, 0x1 */
/* sub-int v43, v60, v61 */
} // :goto_1
/* if-gez v43, :cond_b */
/* .line 2244 */
} // .end local v9 # "dx":I
} // .end local v10 # "dy":I
} // .end local v11 # "dz":I
} // .end local v17 # "halfx":I
} // .end local v18 # "halfy":I
} // .end local v19 # "halfz":I
} // .end local v24 # "lightx":I
} // .end local v25 # "lighty":I
} // .end local v26 # "lightz":I
} // .end local v28 # "nxa":[S
} // .end local v30 # "nya":[S
} // .end local v32 # "nza":[S
} // .end local v37 # "shadea":[S
} // .end local v39 # "specularp":Z
} // .end local v42 # "v":Lv/Vector;
} // :cond_8
return;
/* .line 2042 */
} // :cond_9
/* aget-short v44, v48, v43 */
/* .line 2043 */
/* .local v44, "x":I */
/* aget-short v49, v53, v43 */
/* .line 2044 */
/* .local v49, "y":I */
/* aget-short v54, v59, v43 */
/* .line 2048 */
/* .local v54, "z":I */
/* mul-int v60, v4, v44 */
/* mul-int v61, v5, v49 */
/* add-int v60, v60, v61 */
/* mul-int v61, v6, v54 */
/* add-int v60, v60, v61 */
/* move/from16 v0, v60 */
/* int-to-long v0, v0 */
/* move-wide/from16 v60, v0 */
/* mul-long v60, v60, v34 */
/* const/16 v62, 0x1e */
/* shr-long v60, v60, v62 */
/* move-wide/from16 v0, v60 */
/* long-to-int v0, v0 */
/* move/from16 v60, v0 */
/* add-int v45, v60, v7 */
/* .line 2049 */
/* .local v45, "xe":I */
/* mul-int v60, v13, v44 */
/* mul-int v61, v14, v49 */
/* add-int v60, v60, v61 */
/* mul-int v61, v15, v54 */
/* add-int v60, v60, v61 */
/* move/from16 v0, v60 */
/* int-to-long v0, v0 */
/* move-wide/from16 v60, v0 */
/* mul-long v60, v60, v34 */
/* const/16 v62, 0x1e */
/* shr-long v60, v60, v62 */
/* move-wide/from16 v0, v60 */
/* long-to-int v0, v0 */
/* move/from16 v60, v0 */
/* add-int v50, v60, v16 */
/* .line 2050 */
/* .local v50, "ye":I */
/* mul-int v60, v20, v44 */
/* mul-int v61, v21, v49 */
/* add-int v60, v60, v61 */
/* mul-int v61, v22, v54 */
/* add-int v60, v60, v61 */
/* move/from16 v0, v60 */
/* int-to-long v0, v0 */
/* move-wide/from16 v60, v0 */
/* mul-long v60, v60, v34 */
/* const/16 v62, 0x1e */
/* shr-long v60, v60, v62 */
/* move-wide/from16 v0, v60 */
/* long-to-int v0, v0 */
/* move/from16 v60, v0 */
/* add-int v55, v60, v23 */
/* .line 2052 */
/* .local v55, "ze":I */
/* aput v45, v46, v43 */
/* .line 2053 */
/* aput v50, v51, v43 */
/* .line 2054 */
/* aput v55, v56, v43 */
/* .line 2056 */
/* const/high16 v60, 0x40000 */
/* move/from16 v0, v55 */
/* move/from16 v1, v60 */
/* if-lt v0, v1, :cond_a */
/* .line 2058 */
v57 = /* invoke-static/range {v55 ..v55}, Lv/V3dView;->finvd(I)I */
/* .line 2060 */
/* .local v57, "zi":I */
/* aput v57, v58, v43 */
/* .line 2062 */
/* move v0, v8 */
/* int-to-long v0, v0 */
/* move-wide/from16 v60, v0 */
/* move/from16 v0, v57 */
/* int-to-long v0, v0 */
/* move-wide/from16 v62, v0 */
/* mul-long v11, v60, v62 */
/* .line 2072 */
/* .local v11, "dz":J */
/* move/from16 v0, v45 */
/* int-to-long v0, v0 */
/* move-wide/from16 v60, v0 */
/* mul-long v60, v60, v11 */
/* const/16 v62, 0x1e */
/* shr-long v60, v60, v62 */
/* move-wide/from16 v0, v60 */
/* long-to-int v0, v0 */
/* move/from16 v60, v0 */
/* add-int v60, v60, v40 */
/* aput v60, v47, v43 */
/* .line 2073 */
/* move/from16 v0, v50 */
/* int-to-long v0, v0 */
/* move-wide/from16 v60, v0 */
/* mul-long v60, v60, v11 */
/* const/16 v62, 0x1e */
/* shr-long v60, v60, v62 */
/* move-wide/from16 v0, v60 */
/* long-to-int v0, v0 */
/* move/from16 v60, v0 */
/* sub-int v60, v41, v60 */
/* aput v60, v52, v43 */
/* .line 2041 */
} // .end local v11 # "dz":J
} // .end local v57 # "zi":I
} // :goto_2
/* add-int/lit8 v43, v43, 0x1 */
/* goto/16 :goto_0 */
/* .line 2078 */
} // :cond_a
/* const/high16 v60, 0x8000000 */
/* aput v60, v58, v43 */
/* .line 2149 */
} // .end local v44 # "x":I
} // .end local v45 # "xe":I
} // .end local v49 # "y":I
} // .end local v50 # "ye":I
} // .end local v54 # "z":I
} // .end local v55 # "ze":I
/* .restart local v9 # "dx":I */
/* .restart local v10 # "dy":I */
/* .local v11, "dz":I */
/* .restart local v17 # "halfx":I */
/* .restart local v18 # "halfy":I */
/* .restart local v19 # "halfz":I */
/* .restart local v24 # "lightx":I */
/* .restart local v25 # "lighty":I */
/* .restart local v26 # "lightz":I */
/* .restart local v28 # "nxa":[S */
/* .restart local v30 # "nya":[S */
/* .restart local v32 # "nza":[S */
/* .restart local v37 # "shadea":[S */
/* .restart local v39 # "specularp":Z */
/* .restart local v42 # "v":Lv/Vector; */
} // :cond_b
/* aget-short v27, v28, v43 */
/* .line 2150 */
/* .local v27, "nx":I */
/* aget-short v29, v30, v43 */
/* .line 2151 */
/* .local v29, "ny":I */
/* aget-short v31, v32, v43 */
/* .line 2158 */
/* .local v31, "nz":I */
/* mul-int v60, v27, v24 */
/* mul-int v61, v29, v25 */
/* add-int v60, v60, v61 */
/* mul-int v61, v31, v26 */
/* add-int v60, v60, v61 */
/* shr-int/lit8 v36, v60, 0xf */
/* .line 2160 */
/* .local v36, "shade":I */
if ( v39 != null) { // if-eqz v39, :cond_c
/* .line 2164 */
/* mul-int v60, v27, v17 */
/* mul-int v61, v29, v18 */
/* add-int v60, v60, v61 */
/* mul-int v61, v31, v19 */
/* add-int v60, v60, v61 */
/* shr-int/lit8 v38, v60, 0xf */
/* .line 2166 */
/* .local v38, "specular":I */
/* if-gez v38, :cond_c */
/* .line 2171 */
/* mul-int v60, v38, v38 */
/* shr-int/lit8 v33, v60, 0xf */
/* .line 2172 */
/* .local v33, "s2":I */
/* mul-int v60, v33, v33 */
/* shr-int/lit8 v60, v60, 0xf */
/* mul-int v60, v60, v38 */
/* shr-int/lit8 v38, v60, 0xf */
/* .line 2175 */
/* add-int v60, v36, v38 */
/* shr-int/lit8 v36, v60, 0x1 */
/* .line 2187 */
} // .end local v33 # "s2":I
} // .end local v38 # "specular":I
} // :cond_c
/* shr-int/lit8 v60, v36, 0x1 */
/* move/from16 v0, v60 */
/* neg-int v0, v0 */
/* move/from16 v60, v0 */
/* const/16 v61, 0x4000 */
/* sub-int v36, v60, v61 */
/* .line 2189 */
/* move/from16 v0, v36 */
/* int-to-short v0, v0 */
/* move/from16 v60, v0 */
/* aput-short v60, v37, v43 */
/* .line 2147 */
/* add-int/lit8 v43, v43, -0x1 */
/* goto/16 :goto_1 */
} // .end method
public void viewCopy ( v.V3dView p0 ) {
/* .locals 1 */
/* .param p1, "v" # Lv/V3dView; */
/* .prologue */
/* .line 2257 */
/* iget v0, p0, Lv/V3dView;->m_wx:I */
/* iput v0, p1, Lv/V3dView;->m_wx:I */
/* .line 2258 */
/* iget v0, p0, Lv/V3dView;->m_wy:I */
/* iput v0, p1, Lv/V3dView;->m_wy:I */
/* .line 2259 */
/* iget v0, p0, Lv/V3dView;->m_wz:I */
/* iput v0, p1, Lv/V3dView;->m_wz:I */
/* .line 2260 */
/* iget v0, p0, Lv/V3dView;->m_pitch:I */
/* iput v0, p1, Lv/V3dView;->m_pitch:I */
/* .line 2261 */
/* iget v0, p0, Lv/V3dView;->m_heading:I */
/* iput v0, p1, Lv/V3dView;->m_heading:I */
/* .line 2262 */
/* iget v0, p0, Lv/V3dView;->m_horizon:I */
/* iput v0, p1, Lv/V3dView;->m_horizon:I */
/* .line 2263 */
/* iget v0, p0, Lv/V3dView;->m_soy0:I */
/* iput v0, p1, Lv/V3dView;->m_soy0:I */
/* .line 2264 */
/* iget v0, p0, Lv/V3dView;->m_width:I */
/* iput v0, p1, Lv/V3dView;->m_width2:I */
/* .line 2265 */
/* iget v0, p0, Lv/V3dView;->m_height:I */
/* iput v0, p1, Lv/V3dView;->m_height2:I */
/* .line 2266 */
(( v.V3dView ) p1 ).screenResize ( ); // invoke-virtual {p1}, Lv/V3dView;->screenResize()Z
/* .line 2267 */
return;
} // .end method
public void viewer ( java.lang.String p0 ) {
/* .locals 8 */
/* .param p1, "fn" # Ljava/lang/String; */
/* .prologue */
int v5 = 0; // const/4 v5, 0x0
/* const v7, 0x8000 */
/* .line 2271 */
/* const/high16 v0, 0x60000 */
/* .line 2272 */
/* .local v0, "MOVE":I */
/* const/16 v1, 0x1c7 */
/* .line 2274 */
/* .local v1, "ROT":I */
(( v.V3dView ) p0 ).removeAll ( ); // invoke-virtual {p0}, Lv/V3dView;->removeAll()V
/* .line 2276 */
/* const v4, -0x7f7f80 */
(( v.V3dView ) p0 ).setColor ( v4 ); // invoke-virtual {p0, v4}, Lv/V3dView;->setColor(I)V
/* .line 2278 */
(( v.V3dView ) p0 ).identity ( ); // invoke-virtual {p0}, Lv/V3dView;->identity()V
/* .line 2280 */
/* iput v5, p0, Lv/V3dView;->m_pitch:I */
/* .line 2281 */
/* iput v5, p0, Lv/V3dView;->m_heading:I */
/* .line 2283 */
(( v.V3dView ) p0 ).loadModel ( p1 ); // invoke-virtual {p0, p1}, Lv/V3dView;->loadModel(Ljava/lang/String;)Lv/Vsprite;
/* .line 2284 */
/* .local v3, "p":Lv/Vsprite; */
(( v.V3dView ) p0 ).add ( v3 ); // invoke-virtual {p0, v3}, Lv/V3dView;->add(Lv/Vsprite;)V
/* .line 2286 */
(( v.V3dView ) p0 ).lookAt ( v7 ); // invoke-virtual {p0, v7}, Lv/V3dView;->lookAt(I)V
/* .line 2288 */
} // :goto_0
v4 = (( v.V3dView ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lv/V3dView;->isRunning()Z
/* if-nez v4, :cond_1 */
/* .line 2346 */
} // :cond_0
(( v.Vsprite ) v3 ).off ( ); // invoke-virtual {v3}, Lv/Vsprite;->off()V
/* .line 2347 */
(( v.Vsprite ) v3 ).removeAll ( ); // invoke-virtual {v3}, Lv/Vsprite;->removeAll()V
/* .line 2348 */
return;
/* .line 2289 */
} // :cond_1
(( v.V3dView ) p0 ).screenResize ( ); // invoke-virtual {p0}, Lv/V3dView;->screenResize()Z
/* .line 2291 */
v2 = (( v.V3dView ) p0 ).keyGet ( ); // invoke-virtual {p0}, Lv/V3dView;->keyGet()C
/* .line 2292 */
/* .local v2, "key":C */
int v4 = 6; // const/4 v4, 0x6
/* if-eq v2, v4, :cond_0 */
/* .line 2295 */
/* sparse-switch v2, :sswitch_data_0 */
/* .line 2343 */
} // :goto_1
(( v.V3dView ) p0 ).renderWait ( ); // invoke-virtual {p0}, Lv/V3dView;->renderWait()V
/* .line 2299 */
/* :sswitch_0 */
/* neg-int v4, v1 */
(( v.Vsprite ) v3 ).rotateY ( v4 ); // invoke-virtual {v3, v4}, Lv/Vsprite;->rotateY(I)V
/* .line 2304 */
/* :sswitch_1 */
(( v.Vsprite ) v3 ).rotateY ( v1 ); // invoke-virtual {v3, v1}, Lv/Vsprite;->rotateY(I)V
/* .line 2309 */
/* :sswitch_2 */
(( v.Vsprite ) v3 ).rotateX ( v1 ); // invoke-virtual {v3, v1}, Lv/Vsprite;->rotateX(I)V
/* .line 2314 */
/* :sswitch_3 */
/* neg-int v4, v1 */
(( v.Vsprite ) v3 ).rotateX ( v4 ); // invoke-virtual {v3, v4}, Lv/Vsprite;->rotateX(I)V
/* .line 2320 */
/* :sswitch_4 */
v4 = this.m_3dmodel;
/* iget v5, v4, Lv/V3dModel;->m_vscale:I */
/* shl-int/lit8 v5, v5, 0x1 */
/* iput v5, v4, Lv/V3dModel;->m_vscale:I */
/* .line 2321 */
/* iget v4, p0, Lv/V3dView;->m_wx:I */
/* iget v5, p0, Lv/V3dView;->m_wy:I */
/* const v6, 0x13ed06 */
/* sub-int/2addr v5, v6 */
/* iget v6, p0, Lv/V3dView;->m_wz:I */
(( v.Vsprite ) v3 ).setWxyz ( v4, v5, v6 ); // invoke-virtual {v3, v4, v5, v6}, Lv/Vsprite;->setWxyz(III)V
/* .line 2326 */
/* :sswitch_5 */
/* iget v4, p0, Lv/V3dView;->m_wz:I */
/* add-int/2addr v4, v0 */
/* iput v4, p0, Lv/V3dView;->m_wz:I */
/* .line 2330 */
/* :sswitch_6 */
/* iget v4, p0, Lv/V3dView;->m_wz:I */
/* sub-int/2addr v4, v0 */
/* iput v4, p0, Lv/V3dView;->m_wz:I */
/* .line 2334 */
/* :sswitch_7 */
/* iget v4, p0, Lv/V3dView;->m_wy:I */
/* add-int/2addr v4, v7 */
/* iput v4, p0, Lv/V3dView;->m_wy:I */
/* .line 2338 */
/* :sswitch_8 */
/* iget v4, p0, Lv/V3dView;->m_wy:I */
/* sub-int/2addr v4, v7 */
/* iput v4, p0, Lv/V3dView;->m_wy:I */
/* .line 2295 */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x1 -> :sswitch_0 */
/* 0x2 -> :sswitch_1 */
/* 0x3 -> :sswitch_2 */
/* 0x4 -> :sswitch_3 */
/* 0x2b -> :sswitch_5 */
/* 0x2d -> :sswitch_6 */
/* 0x64 -> :sswitch_8 */
/* 0x73 -> :sswitch_4 */
/* 0x75 -> :sswitch_7 */
} // .end sparse-switch
} // .end method
void wire ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6, Integer p7, Integer p8, Integer p9, Integer p10, Integer p11 ) {
/* .locals 11 */
/* .param p1, "a" # I */
/* .param p2, "b" # I */
/* .param p3, "c" # I */
/* .param p4, "x0" # I */
/* .param p5, "y0" # I */
/* .param p6, "z0" # I */
/* .param p7, "x1" # I */
/* .param p8, "y1" # I */
/* .param p9, "z1" # I */
/* .param p10, "x2" # I */
/* .param p11, "y2" # I */
/* .param p12, "z2" # I */
/* .prologue */
/* .line 2355 */
/* const/high16 v5, 0x8000000 */
/* move/from16 v0, p6 */
/* move v1, v5 */
/* if-eq v0, v1, :cond_0 */
/* const/high16 v5, 0x8000000 */
/* move/from16 v0, p9 */
/* move v1, v5 */
/* if-eq v0, v1, :cond_0 */
/* const/high16 v5, 0x8000000 */
/* move/from16 v0, p12 */
/* move v1, v5 */
/* if-eq v0, v1, :cond_0 */
/* .line 2360 */
/* sub-int v5, p4, p7 */
/* int-to-long v5, v5 */
/* sub-int v7, p11, p8 */
/* int-to-long v7, v7 */
/* mul-long/2addr v5, v7 */
/* .line 2361 */
/* sub-int v7, p5, p8 */
/* int-to-long v7, v7 */
/* sub-int v9, p10, p7 */
/* int-to-long v9, v9 */
/* mul-long/2addr v7, v9 */
/* .line 2359 */
/* sub-long/2addr v5, v7 */
/* .line 2362 */
/* const-wide/16 v7, 0x0 */
/* cmp-long v5, v5, v7 */
/* if-gtz v5, :cond_1 */
/* .line 2392 */
} // :cond_0
} // :goto_0
return;
/* .line 2384 */
} // :cond_1
/* move-object v0, p0 */
/* move v1, p4 */
/* move/from16 v2, p5 */
/* move/from16 v3, p7 */
/* move/from16 v4, p8 */
(( v.V3dView ) v0 ).wire2 ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lv/V3dView;->wire2(IIII)V
/* .line 2387 */
/* move-object v0, p0 */
/* move/from16 v1, p7 */
/* move/from16 v2, p8 */
/* move/from16 v3, p10 */
/* move/from16 v4, p11 */
(( v.V3dView ) v0 ).wire2 ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lv/V3dView;->wire2(IIII)V
/* .line 2390 */
/* move-object v0, p0 */
/* move/from16 v1, p10 */
/* move/from16 v2, p11 */
/* move v3, p4 */
/* move/from16 v4, p5 */
(( v.V3dView ) v0 ).wire2 ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lv/V3dView;->wire2(IIII)V
} // .end method
void wire2 ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 10 */
/* .param p1, "x0" # I */
/* .param p2, "y0" # I */
/* .param p3, "x1" # I */
/* .param p4, "y1" # I */
/* .prologue */
/* .line 2398 */
/* sub-int v2, p3, p1 */
/* .line 2399 */
/* .local v2, "dx":I */
/* sub-int v3, p4, p2 */
/* .line 2401 */
/* .local v3, "dy":I */
/* move v0, v2 */
/* .line 2402 */
/* .local v0, "adx":I */
/* if-gez v0, :cond_0 */
/* .line 2403 */
/* neg-int v0, v0 */
/* .line 2405 */
} // :cond_0
/* move v1, v3 */
/* .line 2406 */
/* .local v1, "ady":I */
/* if-gez v1, :cond_1 */
/* .line 2407 */
/* neg-int v1, v1 */
/* .line 2409 */
} // :cond_1
/* if-le v1, v0, :cond_2 */
/* .line 2410 */
/* move v0, v1 */
/* .line 2412 */
} // :cond_2
v0 = v.V3dView .finv ( v0 );
/* .line 2414 */
v2 = v.V3dView .fmul ( v2,v0 );
/* .line 2415 */
v3 = v.V3dView .fmul ( v3,v0 );
/* .line 2417 */
/* if-nez v2, :cond_4 */
/* if-nez v3, :cond_4 */
/* .line 2465 */
} // :cond_3
} // :goto_0
return;
/* .line 2423 */
} // :cond_4
/* shr-int/lit8 p3, p3, 0xf */
/* .line 2425 */
/* iget v7, p0, Lv/V3dView;->m_x1:I */
/* if-le p3, v7, :cond_5 */
/* .line 2426 */
/* shr-int/lit8 v7, p1, 0xf */
/* iget v8, p0, Lv/V3dView;->m_x1:I */
/* if-ge v7, v8, :cond_3 */
/* .line 2428 */
/* iget p3, p0, Lv/V3dView;->m_x1:I */
/* .line 2431 */
} // :cond_5
/* shr-int/lit8 p4, p4, 0xf */
/* .line 2432 */
/* iget v7, p0, Lv/V3dView;->m_y1:I */
/* if-le p4, v7, :cond_6 */
/* .line 2433 */
/* shr-int/lit8 v7, p2, 0xf */
/* iget v8, p0, Lv/V3dView;->m_y1:I */
/* if-ge v7, v8, :cond_3 */
/* .line 2435 */
/* iget p4, p0, Lv/V3dView;->m_y1:I */
/* .line 2439 */
} // :cond_6
} // :goto_1
/* shr-int/lit8 v5, p1, 0xf */
/* .line 2440 */
/* .local v5, "x":I */
/* shr-int/lit8 v6, p2, 0xf */
/* .line 2442 */
/* .local v6, "y":I */
/* if-gez v2, :cond_a */
/* .line 2443 */
/* if-lt v5, p3, :cond_3 */
/* .line 2450 */
} // :cond_7
/* if-gez v3, :cond_b */
/* .line 2451 */
/* if-lt v6, p4, :cond_3 */
/* .line 2457 */
} // :cond_8
/* iget v7, p0, Lv/V3dView;->m_x0:I */
/* if-lt v5, v7, :cond_9 */
/* iget v7, p0, Lv/V3dView;->m_x1:I */
/* if-ge v5, v7, :cond_9 */
/* iget v7, p0, Lv/V3dView;->m_y0:I */
/* if-lt v6, v7, :cond_9 */
/* iget v7, p0, Lv/V3dView;->m_y1:I */
/* if-ge v6, v7, :cond_9 */
/* .line 2458 */
/* iget v7, p0, Lv/V3dView;->m_width:I */
/* mul-int/2addr v7, v6 */
/* add-int v4, v7, v5 */
/* .line 2459 */
/* .local v4, "i":I */
v7 = this.m_rgb;
/* aget v8, v7, v4 */
v9 = this.m_rgb;
/* aget v9, v9, v4 */
/* xor-int/2addr v8, v9 */
/* aput v8, v7, v4 */
/* .line 2462 */
} // .end local v4 # "i":I
} // :cond_9
/* add-int/2addr p1, v2 */
/* .line 2463 */
/* add-int/2addr p2, v3 */
/* .line 2438 */
/* .line 2446 */
} // :cond_a
/* if-le v5, p3, :cond_7 */
/* .line 2454 */
} // :cond_b
/* if-le v6, p4, :cond_8 */
} // .end method

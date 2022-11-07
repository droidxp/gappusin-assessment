public class v.Vilib extends v.V {
	 /* .source "Vilib.java" */
	 /* # static fields */
	 public static final Integer JPEGHEADERSIZE;
	 static final Integer PAGEBITS;
	 static final Integer PAGEOFFMASK;
	 static final Integer PAGESIZE;
	 /* # instance fields */
	 java.lang.String m_filename;
	 java.lang.StringBuffer m_filenamebuf;
	 java.io.InputStream m_in;
	 Integer m_inpage;
	 Integer m_inpos;
	 m_jpeg;
	 public Boolean m_lowmem;
	 Integer m_lru;
	 Integer m_n;
	 java.lang.String m_name;
	 m_off;
	 v.Vpicture m_pic;
	 v.Vdisplay m_sys;
	 /* # direct methods */
	 public v.Vilib ( ) {
		 /* .locals 0 */
		 /* .param p1, "sys" # Lv/Vdisplay; */
		 /* .param p2, "name" # Ljava/lang/String; */
		 /* .param p3, "size" # I */
		 /* .prologue */
		 /* .line 589 */
		 /* invoke-direct {p0}, Lv/V;-><init>()V */
		 /* .line 590 */
		 this.m_sys = p1;
		 /* .line 591 */
		 (( v.Vilib ) p0 ).open ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Lv/Vilib;->open(Ljava/lang/String;I)V
		 /* .line 592 */
		 return;
	 } // .end method
	 private final void openPage ( Integer p0 ) {
		 /* .locals 4 */
		 /* .param p1, "page" # I */
		 /* .prologue */
		 /* .line 260 */
		 v2 = this.m_filenamebuf;
		 /* .line 261 */
		 /* .local v2, "sb":Ljava/lang/StringBuffer; */
		 int v3 = 0; // const/4 v3, 0x0
		 (( java.lang.StringBuffer ) v2 ).setLength ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->setLength(I)V
		 /* .line 263 */
		 /* const/16 v3, 0x2f */
		 (( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
		 /* .line 264 */
		 v3 = this.m_filename;
		 (( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 /* .line 265 */
		 (( java.lang.StringBuffer ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
		 /* .line 266 */
		 final String v3 = ".bin"; // const-string v3, ".bin"
		 (( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 /* .line 268 */
		 (( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
		 /* .line 271 */
		 /* .local v1, "name":Ljava/lang/String; */
		 try { // :try_start_0
			 v3 = this.m_in;
			 if ( v3 != null) { // if-eqz v3, :cond_0
				 /* .line 272 */
				 v3 = this.m_in;
				 (( java.io.InputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/InputStream;->close()V
				 /* .line 275 */
			 } // :cond_0
			 v3 = this.m_sys;
			 this.m_in = v3;
			 /* :try_end_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 284 */
		 } // :goto_0
		 /* shl-int/lit8 v3, p1, 0xf */
		 /* iput v3, p0, Lv/Vilib;->m_inpos:I */
		 /* .line 285 */
		 /* iput p1, p0, Lv/Vilib;->m_inpage:I */
		 /* .line 286 */
		 return;
		 /* .line 277 */
		 /* :catch_0 */
		 /* move-exception v3 */
		 /* move-object v0, v3 */
		 /* .line 278 */
		 /* .local v0, "e":Ljava/io/IOException; */
		 int v3 = 0; // const/4 v3, 0x0
		 this.m_in = v3;
	 } // .end method
	 private final void readPicture ( Integer p0 ) {
		 /* .locals 31 */
		 /* .param p1, "pi" # I */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 300 */
	 /* move-object/from16 v0, p0 */
	 v0 = this.m_off;
	 /* move-object v5, v0 */
	 /* aget v19, v5, p1 */
	 /* .line 301 */
	 /* .local v19, "fpos":I */
	 /* move-object/from16 v0, p0 */
	 /* move/from16 v1, v19 */
	 (( v.Vilib ) v0 ).seek ( v1 ); // invoke-virtual {v0, v1}, Lv/Vilib;->seek(I)V
	 /* .line 303 */
	 /* new-instance v26, Lv/Vpicture; */
	 /* invoke-direct/range {v26 ..v26}, Lv/Vpicture;-><init>()V */
	 /* .line 305 */
	 /* .local v26, "p":Lv/Vpicture; */
	 v5 = 	 /* invoke-virtual/range {p0 ..p0}, Lv/Vilib;->rv()I */
	 /* int-to-byte v5, v5 */
	 /* move v0, v5 */
	 /* move-object/from16 v1, v26 */
	 /* iput-byte v0, v1, Lv/Vpicture;->m_type:B */
	 /* .line 307 */
	 v9 = 	 /* invoke-virtual/range {p0 ..p0}, Lv/Vilib;->rv()I */
	 /* .line 308 */
	 /* .local v9, "w":I */
	 /* int-to-short v5, v9 */
	 /* move v0, v5 */
	 /* move-object/from16 v1, v26 */
	 /* iput-short v0, v1, Lv/Vpicture;->m_width:S */
	 /* .line 310 */
	 v10 = 	 /* invoke-virtual/range {p0 ..p0}, Lv/Vilib;->rv()I */
	 /* .line 311 */
	 /* .local v10, "h":I */
	 /* int-to-short v5, v10 */
	 /* move v0, v5 */
	 /* move-object/from16 v1, v26 */
	 /* iput-short v0, v1, Lv/Vpicture;->m_height:S */
	 /* .line 313 */
	 v5 = 	 /* invoke-virtual/range {p0 ..p0}, Lv/Vilib;->rv()I */
	 /* int-to-short v5, v5 */
	 /* move v0, v5 */
	 /* move-object/from16 v1, v26 */
	 /* iput-short v0, v1, Lv/Vpicture;->m_xcenter:S */
	 /* .line 314 */
	 v5 = 	 /* invoke-virtual/range {p0 ..p0}, Lv/Vilib;->rv()I */
	 /* int-to-short v5, v5 */
	 /* move v0, v5 */
	 /* move-object/from16 v1, v26 */
	 /* iput-short v0, v1, Lv/Vpicture;->m_ycenter:S */
	 /* .line 316 */
	 /* move-object/from16 v0, p0 */
	 /* iget v0, v0, Lv/Vilib;->m_inpos:I */
	 /* move/from16 v28, v0 */
	 /* .line 317 */
	 /* .local v28, "pos":I */
	 /* move-object/from16 v0, p0 */
	 v0 = this.m_off;
	 /* move-object v5, v0 */
	 /* add-int/lit8 v6, p1, 0x1 */
	 /* aget v5, v5, v6 */
	 /* sub-int v24, v5, v28 */
	 /* .line 319 */
	 /* .local v24, "nb":I */
	 /* move/from16 v8, v24 */
	 /* .line 322 */
	 /* .local v8, "jpegn":I */
	 /* if-nez p1, :cond_2 */
	 /* .line 323 */
	 /* const/16 v25, 0x0 */
	 /* .line 329 */
	 /* .local v25, "off":I */
} // :goto_0
int v14 = 0; // const/4 v14, 0x0
/* .line 331 */
/* .local v14, "an":I */
/* move-object/from16 v0, v26 */
/* iget-byte v0, v0, Lv/Vpicture;->m_type:B */
/* move v5, v0 */
/* const/16 v6, 0x6a */
/* if-ne v5, v6, :cond_4 */
/* .line 333 */
v14 = /* invoke-virtual/range {p0 ..p0}, Lv/Vilib;->rv()I */
/* .line 335 */
/* if-nez v14, :cond_3 */
/* .line 336 */
int v5 = 1; // const/4 v5, 0x1
/* move v0, v5 */
/* move-object/from16 v1, v26 */
/* iput-boolean v0, v1, Lv/Vpicture;->m_opaque:Z */
/* .line 337 */
/* add-int/lit8 v8, v8, -0x1 */
/* .line 338 */
/* add-int/lit8 v24, v24, -0x1 */
/* .line 359 */
} // :cond_0
} // :goto_1
/* move/from16 v22, v24 */
/* .line 360 */
/* .local v22, "n":I */
} // :goto_2
/* if-gtz v22, :cond_5 */
/* .line 374 */
/* mul-int v29, v9, v10 */
/* .line 379 */
/* .local v29, "sz":I */
} // :cond_1
try { // :try_start_0
/* invoke-static/range {v29 ..v29}, Lv/Vilib;->allocInt(I)[I */
/* :try_end_0 */
/* .catch Ljava/lang/OutOfMemoryError; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 389 */
/* .local v11, "rgb":[I */
} // :goto_3
/* if-nez v11, :cond_8 */
/* .line 390 */
/* shl-int/lit8 v5, v29, 0x2 */
/* move-object/from16 v0, p0 */
/* move v1, v5 */
v5 = (( v.Vilib ) v0 ).free ( v1 ); // invoke-virtual {v0, v1}, Lv/Vilib;->free(I)Z
/* if-nez v5, :cond_7 */
/* .line 491 */
} // .end local v8 # "jpegn":I
} // :goto_4
return;
/* .line 325 */
} // .end local v11 # "rgb":[I
} // .end local v14 # "an":I
} // .end local v22 # "n":I
} // .end local v25 # "off":I
} // .end local v29 # "sz":I
/* .restart local v8 # "jpegn":I */
} // :cond_2
/* add-int/lit16 v8, v8, 0x26f */
/* .line 326 */
/* const/16 v25, 0x26f */
/* .restart local v25 # "off":I */
/* .line 341 */
/* .restart local v14 # "an":I */
} // :cond_3
/* sub-int/2addr v8, v14 */
/* .line 344 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vilib;->m_inpos:I */
/* move v5, v0 */
/* sub-int v5, v5, v28 */
/* sub-int/2addr v8, v5 */
/* .line 345 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vilib;->m_inpos:I */
/* move v5, v0 */
/* sub-int v5, v5, v28 */
/* sub-int v24, v24, v5 */
/* .line 352 */
} // :cond_4
/* move-object/from16 v0, v26 */
/* iget-byte v0, v0, Lv/Vpicture;->m_type:B */
/* move v5, v0 */
/* const/16 v6, 0x6f */
/* if-ne v5, v6, :cond_0 */
/* .line 354 */
int v5 = 1; // const/4 v5, 0x1
/* move v0, v5 */
/* move-object/from16 v1, v26 */
/* iput-boolean v0, v1, Lv/Vpicture;->m_opaque:Z */
/* .line 355 */
/* const/16 v5, 0x72 */
/* move v0, v5 */
/* move-object/from16 v1, v26 */
/* iput-byte v0, v1, Lv/Vpicture;->m_type:B */
/* .line 361 */
/* .restart local v22 # "n":I */
} // :cond_5
/* move-object/from16 v0, p0 */
v0 = this.m_in;
/* move-object v5, v0 */
/* move-object/from16 v0, p0 */
v0 = this.m_jpeg;
/* move-object v6, v0 */
/* move-object v0, v5 */
/* move-object v1, v6 */
/* move/from16 v2, v25 */
/* move/from16 v3, v22 */
v27 = (( java.io.InputStream ) v0 ).read ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Ljava/io/InputStream;->read([BII)I
/* .line 362 */
/* .local v27, "pn":I */
int v5 = -1; // const/4 v5, -0x1
/* move/from16 v0, v27 */
/* move v1, v5 */
/* if-ne v0, v1, :cond_6 */
/* .line 365 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vilib;->m_inpos:I */
/* move v5, v0 */
/* move-object/from16 v0, p0 */
/* move v1, v5 */
(( v.Vilib ) v0 ).seek ( v1 ); // invoke-virtual {v0, v1}, Lv/Vilib;->seek(I)V
/* .line 368 */
} // :cond_6
/* sub-int v22, v22, v27 */
/* .line 369 */
/* add-int v25, v25, v27 */
/* .line 370 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lv/Vilib;->m_inpos:I */
/* move v5, v0 */
/* add-int v5, v5, v27 */
/* move v0, v5 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lv/Vilib;->m_inpos:I */
/* .line 381 */
} // .end local v27 # "pn":I
/* .restart local v29 # "sz":I */
/* :catch_0 */
/* move-exception v18 */
/* .line 382 */
/* .local v18, "e":Ljava/lang/OutOfMemoryError; */
int v11 = 0; // const/4 v11, 0x0
/* check-cast v11, [I */
/* .restart local v11 # "rgb":[I */
/* .line 392 */
} // .end local v18 # "e":Ljava/lang/OutOfMemoryError;
} // :cond_7
int v11 = 0; // const/4 v11, 0x0
/* check-cast v11, [I */
/* .line 395 */
} // :cond_8
if ( v11 != null) { // if-eqz v11, :cond_1
/* .line 397 */
/* move-object v0, v11 */
/* move-object/from16 v1, v26 */
this.m_rgb = v0;
/* .line 399 */
/* move-object/from16 v0, p0 */
v0 = this.m_jpeg;
/* move-object v6, v0 */
/* .line 401 */
/* .local v6, "buf":[B */
/* move-object/from16 v0, v26 */
/* iget-byte v0, v0, Lv/Vpicture;->m_type:B */
/* move v5, v0 */
/* sparse-switch v5, :sswitch_data_0 */
/* .line 490 */
} // .end local v8 # "jpegn":I
} // :cond_9
} // :goto_5
/* move-object/from16 v0, p0 */
v0 = this.m_pic;
/* move-object v5, v0 */
/* aput-object v26, v5, p1 */
/* goto/16 :goto_4 */
/* .line 406 */
/* .restart local v8 # "jpegn":I */
/* :sswitch_0 */
/* const/16 v5, 0xa3 */
/* shr-int/lit8 v7, v10, 0x8 */
/* int-to-byte v7, v7 */
/* aput-byte v7, v6, v5 */
/* .line 407 */
/* const/16 v5, 0xa4 */
/* int-to-byte v7, v10 */
/* aput-byte v7, v6, v5 */
/* .line 408 */
/* const/16 v5, 0xa5 */
/* shr-int/lit8 v7, v9, 0x8 */
/* int-to-byte v7, v7 */
/* aput-byte v7, v6, v5 */
/* .line 409 */
/* const/16 v5, 0xa6 */
/* int-to-byte v7, v9 */
/* aput-byte v7, v6, v5 */
/* .line 412 */
/* move-object/from16 v0, p0 */
v0 = this.m_sys;
/* move-object v5, v0 */
int v7 = 0; // const/4 v7, 0x0
/* .line 414 */
int v12 = 0; // const/4 v12, 0x0
/* .line 412 */
/* invoke-interface/range {v5 ..v12}, Lv/Vdisplay;->getImage([BIIII[II)Z */
/* .line 416 */
if ( v14 != null) { // if-eqz v14, :cond_9
/* .line 419 */
/* move/from16 v20, v8 */
/* .line 420 */
/* .local v20, "i":I */
/* const/16 v16, 0x0 */
/* .local v16, "di":I */
/* move/from16 v21, v20 */
/* .line 421 */
} // .end local v8 # "jpegn":I
} // .end local v20 # "i":I
/* .local v21, "i":I */
} // :goto_6
if ( v29 != null) { // if-eqz v29, :cond_9
/* .line 422 */
/* add-int/lit8 v20, v21, 0x1 */
} // .end local v21 # "i":I
/* .restart local v20 # "i":I */
/* aget-byte v5, v6, v21 */
/* and-int/lit16 v13, v5, 0xff */
/* .line 424 */
/* .local v13, "a":I */
/* shr-int/lit8 v22, v13, 0x3 */
/* .line 425 */
/* if-nez v22, :cond_a */
/* .line 426 */
/* const/16 v22, 0x20 */
/* .line 429 */
} // :cond_a
/* and-int/lit8 v30, v13, 0x7 */
/* .line 430 */
/* .local v30, "t":I */
/* shl-int/lit8 v13, v13, 0x1d */
/* .line 431 */
/* sub-int v29, v29, v22 */
/* .line 444 */
/* if-nez v13, :cond_c */
/* move/from16 v17, v16 */
} // .end local v16 # "di":I
/* .local v17, "di":I */
/* move/from16 v23, v22 */
/* .line 445 */
} // .end local v22 # "n":I
/* .local v23, "n":I */
} // :goto_7
/* add-int/lit8 v22, v23, -0x1 */
} // .end local v23 # "n":I
/* .restart local v22 # "n":I */
/* if-nez v23, :cond_b */
/* move/from16 v16, v17 */
} // .end local v17 # "di":I
/* .restart local v16 # "di":I */
/* move/from16 v21, v20 */
} // .end local v20 # "i":I
/* .restart local v21 # "i":I */
/* .line 446 */
} // .end local v16 # "di":I
} // .end local v21 # "i":I
/* .restart local v17 # "di":I */
/* .restart local v20 # "i":I */
} // :cond_b
/* add-int/lit8 v16, v17, 0x1 */
} // .end local v17 # "di":I
/* .restart local v16 # "di":I */
/* shl-int/lit8 v5, v22, 0x18 */
/* aput v5, v11, v17 */
/* move/from16 v17, v16 */
} // .end local v16 # "di":I
/* .restart local v17 # "di":I */
/* move/from16 v23, v22 */
} // .end local v22 # "n":I
/* .restart local v23 # "n":I */
/* .line 448 */
} // .end local v17 # "di":I
} // .end local v23 # "n":I
/* .restart local v16 # "di":I */
/* .restart local v22 # "n":I */
} // :cond_c
int v5 = 7; // const/4 v5, 0x7
/* move/from16 v0, v30 */
/* move v1, v5 */
/* if-ne v0, v1, :cond_12 */
/* move/from16 v23, v22 */
/* .line 449 */
} // .end local v22 # "n":I
/* .restart local v23 # "n":I */
} // :goto_8
/* add-int/lit8 v22, v23, -0x1 */
} // .end local v23 # "n":I
/* .restart local v22 # "n":I */
/* if-nez v23, :cond_d */
/* move/from16 v21, v20 */
} // .end local v20 # "i":I
/* .restart local v21 # "i":I */
/* .line 451 */
} // .end local v21 # "i":I
/* .restart local v20 # "i":I */
} // :cond_d
/* shl-int/lit8 v5, v22, 0x18 */
/* or-int/2addr v5, v13 */
/* .line 452 */
/* aget v7, v11, v16 */
/* const v8, 0xffffff */
/* and-int/2addr v7, v8 */
/* or-int/2addr v5, v7 */
/* .line 450 */
/* aput v5, v11, v16 */
/* .line 453 */
/* add-int/lit8 v16, v16, 0x1 */
/* move/from16 v23, v22 */
} // .end local v22 # "n":I
/* .restart local v23 # "n":I */
/* .line 460 */
} // .end local v23 # "n":I
/* .restart local v22 # "n":I */
} // :cond_e
/* aget v15, v11, v16 */
/* .line 461 */
/* .local v15, "co":I */
int v5 = 2; // const/4 v5, 0x2
/* move/from16 v0, v30 */
/* move v1, v5 */
/* if-gt v0, v1, :cond_10 */
/* .line 462 */
int v5 = 1; // const/4 v5, 0x1
/* move/from16 v0, v30 */
/* move v1, v5 */
/* if-ne v0, v1, :cond_f */
/* .line 463 */
/* shr-int/lit8 v5, v15, 0x3 */
/* const v7, 0x1f1f1f */
/* and-int v15, v5, v7 */
/* .line 475 */
} // :goto_9
/* shl-int/lit8 v5, v22, 0x18 */
/* or-int/2addr v5, v13 */
/* .line 476 */
/* or-int/2addr v5, v15 */
/* .line 474 */
/* aput v5, v11, v16 */
/* .line 477 */
/* add-int/lit8 v16, v16, 0x1 */
/* move/from16 v23, v22 */
/* .line 459 */
} // .end local v15 # "co":I
} // .end local v22 # "n":I
/* .restart local v23 # "n":I */
} // :goto_a
/* add-int/lit8 v22, v23, -0x1 */
} // .end local v23 # "n":I
/* .restart local v22 # "n":I */
/* if-nez v23, :cond_e */
/* move/from16 v21, v20 */
} // .end local v20 # "i":I
/* .restart local v21 # "i":I */
/* .line 465 */
} // .end local v21 # "i":I
/* .restart local v15 # "co":I */
/* .restart local v20 # "i":I */
} // :cond_f
/* shr-int/lit8 v5, v15, 0x2 */
/* const v7, 0x3f3f3f */
/* and-int v15, v5, v7 */
/* .line 467 */
} // :cond_10
int v5 = 4; // const/4 v5, 0x4
/* move/from16 v0, v30 */
/* move v1, v5 */
/* if-gt v0, v1, :cond_11 */
/* .line 468 */
/* shr-int/lit8 v5, v15, 0x1 */
/* const v7, 0x7f7f7f */
/* and-int v15, v5, v7 */
/* .line 471 */
} // :cond_11
/* shr-int/lit8 v5, v15, 0x1 */
/* const v7, 0x7f7f7f */
/* and-int/2addr v5, v7 */
/* shr-int/lit8 v7, v15, 0x2 */
/* const v8, 0x3f3f3f */
/* and-int/2addr v7, v8 */
/* add-int v15, v5, v7 */
/* .line 487 */
} // .end local v13 # "a":I
} // .end local v15 # "co":I
} // .end local v16 # "di":I
} // .end local v20 # "i":I
} // .end local v30 # "t":I
/* .restart local v8 # "jpegn":I */
/* :sswitch_1 */
/* const/16 v5, 0x26f */
/* move-object/from16 v0, v26 */
/* move-object v1, v11 */
/* move-object v2, v6 */
/* move v3, v5 */
/* move/from16 v4, v24 */
(( v.Vpicture ) v0 ).drawRle ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lv/Vpicture;->drawRle([I[BII)V
/* goto/16 :goto_5 */
} // .end local v8 # "jpegn":I
/* .restart local v13 # "a":I */
/* .restart local v16 # "di":I */
/* .restart local v20 # "i":I */
/* .restart local v30 # "t":I */
} // :cond_12
/* move/from16 v23, v22 */
} // .end local v22 # "n":I
/* .restart local v23 # "n":I */
/* .line 401 */
/* nop */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x6a -> :sswitch_0 */
/* 0x72 -> :sswitch_1 */
} // .end sparse-switch
} // .end method
/* # virtual methods */
public void close ( ) {
/* .locals 1 */
/* .prologue */
/* .line 39 */
v0 = this.m_in;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 41 */
try { // :try_start_0
v0 = this.m_in;
(( java.io.InputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->close()V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 45 */
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
this.m_in = v0;
/* .line 46 */
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lv/Vilib;->m_inpage:I */
/* .line 48 */
} // :cond_0
return;
/* .line 43 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
public void deletePicture ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "idx" # I */
/* .prologue */
/* .line 52 */
v1 = this.m_pic;
/* aget-object v0, v1, p1 */
/* .line 53 */
/* .local v0, "p":Lv/Vpicture; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 54 */
v1 = this.m_rgb;
v.Vilib .deleteInt ( v1 );
/* .line 55 */
v1 = this.m_pic;
int v2 = 0; // const/4 v2, 0x0
/* aput-object v2, v1, p1 */
/* .line 57 */
} // :cond_0
return;
} // .end method
public Integer drawPicture ( Integer p0, Integer[] p1, Integer p2, Integer p3, Integer p4, Integer p5, Integer p6, Integer p7, Integer p8, Integer p9, Integer p10, Integer p11, Integer p12 ) {
/* .locals 13 */
/* .param p1, "idx" # I */
/* .param p2, "drgb" # [I */
/* .param p3, "dwidth" # I */
/* .param p4, "dheight" # I */
/* .param p5, "x0" # I */
/* .param p6, "y0" # I */
/* .param p7, "x1" # I */
/* .param p8, "y1" # I */
/* .param p9, "sx0" # I */
/* .param p10, "sy0" # I */
/* .param p11, "scale" # I */
/* .param p12, "z" # I */
/* .param p13, "alpha" # I */
/* .prologue */
/* .line 63 */
(( v.Vilib ) p0 ).loadPicture ( p1 ); // invoke-virtual {p0, p1}, Lv/Vilib;->loadPicture(I)Lv/Vpicture;
/* .local v0, "p":Lv/Vpicture; */
/* move-object v1, p2 */
/* move/from16 v2, p3 */
/* move/from16 v3, p4 */
/* move/from16 v4, p5 */
/* move/from16 v5, p6 */
/* move/from16 v6, p7 */
/* move/from16 v7, p8 */
/* move/from16 v8, p9 */
/* move/from16 v9, p10 */
/* move/from16 v10, p11 */
/* move/from16 v11, p12 */
/* move/from16 v12, p13 */
/* .line 65 */
v1 = /* invoke-virtual/range {v0 ..v12}, Lv/Vpicture;->draw([IIIIIIIIIIII)I */
} // .end method
public Boolean free ( Integer p0 ) {
/* .locals 7 */
/* .param p1, "nbytes" # I */
/* .prologue */
int v6 = 0; // const/4 v6, 0x0
int v5 = 1; // const/4 v5, 0x1
int v4 = 0; // const/4 v4, 0x0
/* .line 94 */
/* iput-boolean v5, p0, Lv/Vilib;->m_lowmem:Z */
/* .line 98 */
/* iget v3, p0, Lv/Vilib;->m_n:I */
/* shl-int/lit8 v1, v3, 0x1 */
/* .line 99 */
/* .local v1, "ntries":I */
/* iget v0, p0, Lv/Vilib;->m_lru:I */
/* .line 100 */
/* .local v0, "i":I */
} // :goto_0
/* if-nez v1, :cond_0 */
/* .line 130 */
/* iput v0, p0, Lv/Vilib;->m_lru:I */
/* move v3, v4 */
/* .line 131 */
} // :goto_1
/* .line 101 */
} // :cond_0
v3 = this.m_pic;
/* aget-object v2, v3, v0 */
/* .line 104 */
/* .local v2, "p":Lv/Vpicture; */
if ( v2 != null) { // if-eqz v2, :cond_1
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 105 */
/* iget-boolean v3, v2, Lv/Vpicture;->m_used:Z */
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 106 */
/* iput-boolean v4, v2, Lv/Vpicture;->m_used:Z */
/* .line 121 */
} // :cond_1
/* add-int/lit8 v0, v0, 0x1 */
/* .line 122 */
/* iget v3, p0, Lv/Vilib;->m_n:I */
/* if-ne v0, v3, :cond_2 */
/* .line 123 */
int v0 = 0; // const/4 v0, 0x0
/* .line 124 */
} // :cond_2
/* add-int/lit8 v1, v1, -0x1 */
/* .line 107 */
} // :cond_3
v3 = this.m_rgb;
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 111 */
v3 = this.m_rgb;
/* array-length v3, v3 */
/* shl-int/lit8 v3, v3, 0x2 */
/* sub-int/2addr p1, v3 */
/* .line 112 */
v3 = this.m_rgb;
v.Vilib .deleteInt ( v3 );
/* .line 113 */
this.m_rgb = v6;
/* .line 114 */
v3 = this.m_pic;
/* aput-object v6, v3, v0 */
/* .line 115 */
/* if-gtz p1, :cond_1 */
/* .line 116 */
/* iput v0, p0, Lv/Vilib;->m_lru:I */
/* move v3, v5 */
/* .line 117 */
} // .end method
public void freePicture ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "idx" # I */
/* .prologue */
/* .line 135 */
v0 = this.m_pic;
int v1 = 0; // const/4 v1, 0x0
/* aput-object v1, v0, p1 */
/* .line 136 */
return;
} // .end method
public v.Vpicture loadPicture ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "idx" # I */
/* .prologue */
/* .line 145 */
v1 = this.m_pic;
/* aget-object v0, v1, p1 */
/* .line 146 */
/* .local v0, "p":Lv/Vpicture; */
/* if-nez v0, :cond_0 */
/* .line 148 */
try { // :try_start_0
/* invoke-direct {p0, p1}, Lv/Vilib;->readPicture(I)V */
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 154 */
} // :goto_0
v1 = this.m_pic;
/* aget-object v0, v1, p1 */
/* .line 156 */
} // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 157 */
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, v0, Lv/Vpicture;->m_used:Z */
/* .line 158 */
} // :cond_1
/* .line 150 */
/* :catch_0 */
/* move-exception v1 */
} // .end method
public Integer lookup ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 162 */
v2 = this.m_name;
/* array-length v1, v2 */
/* .line 189 */
/* .local v1, "n":I */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
/* if-lt v0, v1, :cond_0 */
/* .line 194 */
int v2 = -1; // const/4 v2, -0x1
} // :goto_1
/* .line 190 */
} // :cond_0
v2 = this.m_name;
/* aget-object v2, v2, v0 */
v2 = (( java.lang.String ) p1 ).equals ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* move v2, v0 */
/* .line 191 */
/* .line 189 */
} // :cond_1
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
void open ( java.lang.String p0, Integer p1 ) {
/* .locals 12 */
/* .param p1, "name" # Ljava/lang/String; */
/* .param p2, "bufsize" # I */
/* .prologue */
int v11 = 1; // const/4 v11, 0x1
int v8 = 0; // const/4 v8, 0x0
/* .line 209 */
this.m_filename = p1;
/* .line 210 */
/* new-instance v7, Ljava/lang/StringBuffer; */
/* invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V */
this.m_filenamebuf = v7;
/* .line 211 */
/* iput v8, p0, Lv/Vilib;->m_inpos:I */
/* .line 213 */
/* invoke-direct {p0, v8}, Lv/Vilib;->openPage(I)V */
/* .line 215 */
int v7 = 0; // const/4 v7, 0x0
try { // :try_start_0
/* iput v7, p0, Lv/Vilib;->m_inpos:I */
/* .line 217 */
v5 = (( v.Vilib ) p0 ).rv ( ); // invoke-virtual {p0}, Lv/Vilib;->rv()I
/* .line 218 */
/* .local v5, "ne":I */
/* iput v5, p0, Lv/Vilib;->m_n:I */
/* .line 219 */
/* new-array v7, v5, [Lv/Vpicture; */
this.m_pic = v7;
/* .line 220 */
/* new-array v7, v5, [Ljava/lang/String; */
this.m_name = v7;
/* .line 222 */
/* add-int/lit8 v4, v5, 0x1 */
/* .line 223 */
/* .local v4, "n":I */
/* new-array v7, v4, [I */
this.m_off = v7;
/* .line 225 */
v2 = (( v.Vilib ) p0 ).rv ( ); // invoke-virtual {p0}, Lv/Vilib;->rv()I
/* .line 227 */
/* .local v2, "jpegmaxsize":I */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 228 */
/* new-array v7, v2, [B */
this.m_jpeg = v7;
/* .line 231 */
} // :cond_0
/* new-instance v6, Ljava/lang/StringBuffer; */
/* invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V */
/* .line 232 */
/* .local v6, "sb":Ljava/lang/StringBuffer; */
int v0 = 1; // const/4 v0, 0x1
/* .local v0, "i":I */
} // :goto_0
/* if-le v0, v5, :cond_1 */
/* .line 245 */
v7 = this.m_off;
int v8 = 0; // const/4 v8, 0x0
/* iget v9, p0, Lv/Vilib;->m_inpos:I */
/* aput v9, v7, v8 */
/* .line 246 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
/* if-le v0, v5, :cond_3 */
/* .line 249 */
int v7 = 0; // const/4 v7, 0x0
/* invoke-direct {p0, v7}, Lv/Vilib;->readPicture(I)V */
/* .line 254 */
} // .end local v0 # "i":I
} // .end local v2 # "jpegmaxsize":I
} // .end local v4 # "n":I
} // .end local v5 # "ne":I
} // .end local v6 # "sb":Ljava/lang/StringBuffer;
} // :goto_2
return;
/* .line 233 */
/* .restart local v0 # "i":I */
/* .restart local v2 # "jpegmaxsize":I */
/* .restart local v4 # "n":I */
/* .restart local v5 # "ne":I */
/* .restart local v6 # "sb":Ljava/lang/StringBuffer; */
} // :cond_1
v7 = this.m_off;
v8 = (( v.Vilib ) p0 ).rv ( ); // invoke-virtual {p0}, Lv/Vilib;->rv()I
/* aput v8, v7, v0 */
/* .line 236 */
v7 = this.m_in;
v3 = (( java.io.InputStream ) v7 ).read ( ); // invoke-virtual {v7}, Ljava/io/InputStream;->read()I
/* .line 237 */
/* .local v3, "k":I */
(( java.lang.StringBuffer ) v6 ).setLength ( v3 ); // invoke-virtual {v6, v3}, Ljava/lang/StringBuffer;->setLength(I)V
/* .line 238 */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "j":I */
} // :goto_3
/* if-lt v1, v3, :cond_2 */
/* .line 240 */
v7 = this.m_name;
/* sub-int v8, v0, v11 */
(( java.lang.StringBuffer ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* aput-object v9, v7, v8 */
/* .line 241 */
/* iget v7, p0, Lv/Vilib;->m_inpos:I */
/* add-int/lit8 v8, v3, 0x1 */
/* add-int/2addr v7, v8 */
/* iput v7, p0, Lv/Vilib;->m_inpos:I */
/* .line 232 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 239 */
} // :cond_2
v7 = this.m_in;
v7 = (( java.io.InputStream ) v7 ).read ( ); // invoke-virtual {v7}, Ljava/io/InputStream;->read()I
/* int-to-char v7, v7 */
(( java.lang.StringBuffer ) v6 ).setCharAt ( v1, v7 ); // invoke-virtual {v6, v1, v7}, Ljava/lang/StringBuffer;->setCharAt(IC)V
/* .line 238 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 247 */
} // .end local v1 # "j":I
} // .end local v3 # "k":I
} // :cond_3
v7 = this.m_off;
/* aget v8, v7, v0 */
v9 = this.m_off;
/* sub-int v10, v0, v11 */
/* aget v9, v9, v10 */
/* add-int/2addr v8, v9 */
/* aput v8, v7, v0 */
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 246 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 251 */
} // .end local v0 # "i":I
} // .end local v2 # "jpegmaxsize":I
} // .end local v4 # "n":I
} // .end local v5 # "ne":I
} // .end local v6 # "sb":Ljava/lang/StringBuffer;
/* :catch_0 */
/* move-exception v7 */
} // .end method
public void preload ( Integer p0, Integer p1 ) {
/* .locals 2 */
/* .param p1, "im1" # I */
/* .param p2, "im2" # I */
/* .prologue */
/* .line 289 */
/* move v0, p1 */
/* .local v0, "i":I */
} // :goto_0
/* if-gt v0, p2, :cond_0 */
/* iget-boolean v1, p0, Lv/Vilib;->m_lowmem:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 292 */
} // :cond_0
return;
/* .line 290 */
} // :cond_1
(( v.Vilib ) p0 ).loadPicture ( v0 ); // invoke-virtual {p0, v0}, Lv/Vilib;->loadPicture(I)Lv/Vpicture;
/* .line 289 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
Integer rv ( ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* const/16 v5, 0x80 */
int v4 = -1; // const/4 v4, -0x1
/* .line 495 */
v2 = this.m_in;
v1 = (( java.io.InputStream ) v2 ).read ( ); // invoke-virtual {v2}, Ljava/io/InputStream;->read()I
/* .line 496 */
/* .local v1, "n":I */
/* if-ne v1, v4, :cond_0 */
/* .line 497 */
/* iget v2, p0, Lv/Vilib;->m_inpos:I */
(( v.Vilib ) p0 ).seek ( v2 ); // invoke-virtual {p0, v2}, Lv/Vilib;->seek(I)V
/* .line 498 */
v2 = this.m_in;
v1 = (( java.io.InputStream ) v2 ).read ( ); // invoke-virtual {v2}, Ljava/io/InputStream;->read()I
/* .line 500 */
} // :cond_0
/* iget v2, p0, Lv/Vilib;->m_inpos:I */
/* add-int/lit8 v2, v2, 0x1 */
/* iput v2, p0, Lv/Vilib;->m_inpos:I */
/* .line 506 */
/* if-lt v1, v5, :cond_3 */
/* .line 508 */
/* and-int/lit8 v1, v1, 0x7f */
/* .line 510 */
} // :cond_1
v2 = this.m_in;
v0 = (( java.io.InputStream ) v2 ).read ( ); // invoke-virtual {v2}, Ljava/io/InputStream;->read()I
/* .line 511 */
/* .local v0, "b":I */
/* if-ne v0, v4, :cond_2 */
/* .line 512 */
/* iget v2, p0, Lv/Vilib;->m_inpos:I */
(( v.Vilib ) p0 ).seek ( v2 ); // invoke-virtual {p0, v2}, Lv/Vilib;->seek(I)V
/* .line 513 */
v2 = this.m_in;
v0 = (( java.io.InputStream ) v2 ).read ( ); // invoke-virtual {v2}, Ljava/io/InputStream;->read()I
/* .line 515 */
} // :cond_2
/* iget v2, p0, Lv/Vilib;->m_inpos:I */
/* add-int/lit8 v2, v2, 0x1 */
/* iput v2, p0, Lv/Vilib;->m_inpos:I */
/* .line 522 */
/* shl-int/lit8 v2, v1, 0x7 */
/* and-int/lit8 v3, v0, 0x7f */
/* or-int v1, v2, v3 */
/* .line 524 */
/* if-ge v0, v5, :cond_1 */
/* .line 526 */
} // .end local v0 # "b":I
} // :cond_3
} // .end method
final void seek ( Integer p0 ) {
/* .locals 6 */
/* .param p1, "pos" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* const/16 v5, 0x26f */
/* .line 531 */
/* shr-int/lit8 v2, p1, 0xf */
/* .line 533 */
/* .local v2, "pg":I */
/* iget v3, p0, Lv/Vilib;->m_inpage:I */
/* if-ne v2, v3, :cond_0 */
/* iget v3, p0, Lv/Vilib;->m_inpos:I */
/* if-ge p1, v3, :cond_1 */
/* .line 534 */
} // :cond_0
/* invoke-direct {p0, v2}, Lv/Vilib;->openPage(I)V */
/* .line 536 */
} // :cond_1
v3 = this.m_jpeg;
/* array-length v3, v3 */
/* sub-int v0, v3, v5 */
/* .line 543 */
/* .local v0, "bn":I */
} // :goto_0
/* iget v3, p0, Lv/Vilib;->m_inpos:I */
/* sub-int v1, p1, v3 */
/* .line 544 */
/* .local v1, "n":I */
/* if-nez v1, :cond_3 */
/* .line 556 */
} // :cond_2
return;
/* .line 546 */
} // :cond_3
/* if-le v1, v0, :cond_4 */
/* .line 547 */
/* move v1, v0 */
/* .line 548 */
} // :cond_4
v3 = this.m_in;
v4 = this.m_jpeg;
v1 = (( java.io.InputStream ) v3 ).read ( v4, v5, v1 ); // invoke-virtual {v3, v4, v5, v1}, Ljava/io/InputStream;->read([BII)I
/* .line 549 */
int v3 = -1; // const/4 v3, -0x1
/* if-eq v1, v3, :cond_2 */
/* .line 554 */
/* iget v3, p0, Lv/Vilib;->m_inpos:I */
/* add-int/2addr v3, v1 */
/* iput v3, p0, Lv/Vilib;->m_inpos:I */
} // .end method
public void unload ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .param p1, "im1" # I */
/* .param p2, "im2" # I */
/* .prologue */
/* .line 584 */
/* move v0, p1 */
/* .local v0, "i":I */
} // :goto_0
/* if-le v0, p2, :cond_0 */
/* .line 587 */
return;
/* .line 585 */
} // :cond_0
(( v.Vilib ) p0 ).deletePicture ( v0 ); // invoke-virtual {p0, v0}, Lv/Vilib;->deletePicture(I)V
/* .line 584 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method

public class org.anddev.andengine.opengl.vertex.TextVertexBuffer extends org.anddev.andengine.opengl.vertex.VertexBuffer {
	 /* # static fields */
	 private static $SWITCH_TABLE$org$anddev$andengine$util$HorizontalAlign; //synthetic
	 public static final Integer VERTICES_PER_CHARACTER;
	 /* # instance fields */
	 private final org.anddev.andengine.util.HorizontalAlign mHorizontalAlign;
	 /* # direct methods */
	 static $SWITCH_TABLE$org$anddev$andengine$util$HorizontalAlign ( ) { //synthethic
		 /* .locals 3 */
		 v0 = org.anddev.andengine.opengl.vertex.TextVertexBuffer.$SWITCH_TABLE$org$anddev$andengine$util$HorizontalAlign;
		 if ( v0 != null) { // if-eqz v0, :cond_0
		 } // :goto_0
	 } // :cond_0
	 org.anddev.andengine.util.HorizontalAlign .values ( );
	 /* array-length v0, v0 */
	 /* new-array v0, v0, [I */
	 try { // :try_start_0
		 v1 = org.anddev.andengine.util.HorizontalAlign.CENTER;
		 v1 = 		 (( org.anddev.andengine.util.HorizontalAlign ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/util/HorizontalAlign;->ordinal()I
		 int v2 = 2; // const/4 v2, 0x2
		 /* aput v2, v0, v1 */
		 /* :try_end_0 */
		 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_0 ..:try_end_0} :catch_2 */
	 } // :goto_1
	 try { // :try_start_1
		 v1 = org.anddev.andengine.util.HorizontalAlign.LEFT;
		 v1 = 		 (( org.anddev.andengine.util.HorizontalAlign ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/util/HorizontalAlign;->ordinal()I
		 int v2 = 1; // const/4 v2, 0x1
		 /* aput v2, v0, v1 */
		 /* :try_end_1 */
		 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_1 ..:try_end_1} :catch_1 */
	 } // :goto_2
	 try { // :try_start_2
		 v1 = org.anddev.andengine.util.HorizontalAlign.RIGHT;
		 v1 = 		 (( org.anddev.andengine.util.HorizontalAlign ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/util/HorizontalAlign;->ordinal()I
		 int v2 = 3; // const/4 v2, 0x3
		 /* aput v2, v0, v1 */
		 /* :try_end_2 */
		 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_2 ..:try_end_2} :catch_0 */
	 } // :goto_3
	 /* :catch_0 */
	 /* move-exception v1 */
	 /* :catch_1 */
	 /* move-exception v1 */
	 /* :catch_2 */
	 /* move-exception v1 */
} // .end method
public org.anddev.andengine.opengl.vertex.TextVertexBuffer ( ) {
	 /* .locals 1 */
	 /* mul-int/lit8 v0, p1, 0xc */
	 /* invoke-direct {p0, v0, p3, p4}, Lorg/anddev/andengine/opengl/vertex/VertexBuffer;-><init>(IIZ)V */
	 this.mHorizontalAlign = p2;
	 return;
} // .end method
/* # virtual methods */
public synchronized void update ( org.anddev.andengine.opengl.font.Font p0, Integer p1, Integer[] p2, java.lang.String[] p3 ) {
	 /* .locals 19 */
	 /* monitor-enter p0 */
	 try { // :try_start_0
		 /* move-object/from16 v0, p0 */
		 v0 = this.mBufferData;
		 /* move-object v2, v0 */
		 int v3 = 0; // const/4 v3, 0x0
		 v4 = 		 /* invoke-virtual/range {p1 ..p1}, Lorg/anddev/andengine/opengl/font/Font;->getLineHeight()I */
		 /* move-object/from16 v0, p4 */
		 /* array-length v0, v0 */
		 /* move v5, v0 */
		 int v6 = 0; // const/4 v6, 0x0
		 /* move/from16 v18, v6 */
		 /* move v6, v3 */
		 /* move/from16 v3, v18 */
	 } // :goto_0
	 /* if-lt v3, v5, :cond_0 */
	 /* move-object/from16 v0, p0 */
	 v0 = this.mFloatBuffer;
	 /* move-object v3, v0 */
	 int v4 = 0; // const/4 v4, 0x0
	 (( org.anddev.andengine.opengl.util.FastFloatBuffer ) v3 ).position ( v4 ); // invoke-virtual {v3, v4}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->position(I)V
	 (( org.anddev.andengine.opengl.util.FastFloatBuffer ) v3 ).put ( v2 ); // invoke-virtual {v3, v2}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->put([I)V
	 int v2 = 0; // const/4 v2, 0x0
	 (( org.anddev.andengine.opengl.util.FastFloatBuffer ) v3 ).position ( v2 ); // invoke-virtual {v3, v2}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->position(I)V
	 /* invoke-super/range {p0 ..p0}, Lorg/anddev/andengine/opengl/vertex/VertexBuffer;->setHardwareBufferNeedsUpdate()V */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* monitor-exit p0 */
	 return;
} // :cond_0
try { // :try_start_1
	 /* aget-object v7, p4, v3 */
	 org.anddev.andengine.opengl.vertex.TextVertexBuffer .$SWITCH_TABLE$org$anddev$andengine$util$HorizontalAlign ( );
	 /* move-object/from16 v0, p0 */
	 v0 = this.mHorizontalAlign;
	 /* move-object v9, v0 */
	 v9 = 	 (( org.anddev.andengine.util.HorizontalAlign ) v9 ).ordinal ( ); // invoke-virtual {v9}, Lorg/anddev/andengine/util/HorizontalAlign;->ordinal()I
	 /* aget v8, v8, v9 */
	 /* packed-switch v8, :pswitch_data_0 */
	 int v8 = 0; // const/4 v8, 0x0
} // :goto_1
v9 = /* invoke-virtual/range {p1 ..p1}, Lorg/anddev/andengine/opengl/font/Font;->getLineHeight()I */
v10 = /* invoke-virtual/range {p1 ..p1}, Lorg/anddev/andengine/opengl/font/Font;->getLineGap()I */
/* add-int/2addr v9, v10 */
/* mul-int/2addr v9, v3 */
/* int-to-float v10, v9 */
v10 = java.lang.Float .floatToRawIntBits ( v10 );
v11 = (( java.lang.String ) v7 ).length ( ); // invoke-virtual {v7}, Ljava/lang/String;->length()I
int v12 = 0; // const/4 v12, 0x0
/* move/from16 v18, v12 */
/* move v12, v6 */
/* move/from16 v6, v18 */
} // :goto_2
/* if-lt v6, v11, :cond_1 */
/* add-int/lit8 v3, v3, 0x1 */
/* move v6, v12 */
/* :pswitch_0 */
/* aget v8, p3, v3 */
/* sub-int v8, p2, v8 */
/* :pswitch_1 */
/* aget v8, p3, v3 */
/* sub-int v8, p2, v8 */
/* shr-int/lit8 v8, v8, 0x1 */
} // :cond_1
v13 = (( java.lang.String ) v7 ).charAt ( v6 ); // invoke-virtual {v7, v6}, Ljava/lang/String;->charAt(I)C
/* move-object/from16 v0, p1 */
/* move v1, v13 */
(( org.anddev.andengine.opengl.font.Font ) v0 ).getLetter ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/opengl/font/Font;->getLetter(C)Lorg/anddev/andengine/opengl/font/Letter;
/* add-int v14, v9, v4 */
/* iget v15, v13, Lorg/anddev/andengine/opengl/font/Letter;->mWidth:I */
/* add-int/2addr v15, v8 */
/* move v0, v8 */
/* int-to-float v0, v0 */
/* move/from16 v16, v0 */
v16 = /* invoke-static/range {v16 ..v16}, Ljava/lang/Float;->floatToRawIntBits(F)I */
/* int-to-float v15, v15 */
v15 = java.lang.Float .floatToRawIntBits ( v15 );
/* int-to-float v14, v14 */
v14 = java.lang.Float .floatToRawIntBits ( v14 );
/* add-int/lit8 v17, v12, 0x1 */
/* aput v16, v2, v12 */
/* add-int/lit8 v12, v17, 0x1 */
/* aput v10, v2, v17 */
/* add-int/lit8 v17, v12, 0x1 */
/* aput v16, v2, v12 */
/* add-int/lit8 v12, v17, 0x1 */
/* aput v14, v2, v17 */
/* add-int/lit8 v17, v12, 0x1 */
/* aput v15, v2, v12 */
/* add-int/lit8 v12, v17, 0x1 */
/* aput v14, v2, v17 */
/* add-int/lit8 v17, v12, 0x1 */
/* aput v15, v2, v12 */
/* add-int/lit8 v12, v17, 0x1 */
/* aput v14, v2, v17 */
/* add-int/lit8 v14, v12, 0x1 */
/* aput v15, v2, v12 */
/* add-int/lit8 v12, v14, 0x1 */
/* aput v10, v2, v14 */
/* add-int/lit8 v14, v12, 0x1 */
/* aput v16, v2, v12 */
/* add-int/lit8 v12, v14, 0x1 */
/* aput v10, v2, v14 */
/* iget v13, v13, Lorg/anddev/andengine/opengl/font/Letter;->mAdvance:I */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* add-int/2addr v8, v13 */
/* add-int/lit8 v6, v6, 0x1 */
/* :catchall_0 */
/* move-exception v2 */
/* monitor-exit p0 */
/* throw v2 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x2 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method

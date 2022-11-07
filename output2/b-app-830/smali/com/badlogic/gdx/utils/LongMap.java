public class com.badlogic.gdx.utils.LongMap {
	 /* # static fields */
	 private static final Integer EMPTY;
	 private static final Integer PRIME1;
	 private static final Integer PRIME2;
	 private static final Integer PRIME3;
	 /* # instance fields */
	 Integer capacity;
	 private com.badlogic.gdx.utils.LongMap$Entries entries;
	 Boolean hasZeroValue;
	 private Integer hashShift;
	 keyTable;
	 private com.badlogic.gdx.utils.LongMap$Keys keys;
	 private Float loadFactor;
	 private Integer mask;
	 private Integer pushIterations;
	 public Integer size;
	 private Integer stashCapacity;
	 Integer stashSize;
	 private Integer threshold;
	 java.lang.Object valueTable;
	 private com.badlogic.gdx.utils.LongMap$Values values;
	 java.lang.Object zeroValue;
	 /* # direct methods */
	 public com.badlogic.gdx.utils.LongMap ( ) {
		 /* .locals 2 */
		 /* const/16 v0, 0x20 */
		 /* const v1, 0x3f4ccccd # 0.8f */
		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/utils/LongMap;-><init>(IF)V */
		 return;
	 } // .end method
	 public com.badlogic.gdx.utils.LongMap ( ) {
		 /* .locals 1 */
		 /* const v0, 0x3f4ccccd # 0.8f */
		 /* invoke-direct {p0, p1, v0}, Lcom/badlogic/gdx/utils/LongMap;-><init>(IF)V */
		 return;
	 } // .end method
	 public com.badlogic.gdx.utils.LongMap ( ) {
		 /* .locals 3 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* if-gez p1, :cond_0 */
		 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "initialCapacity must be >= 0: "; // const-string v2, "initialCapacity must be >= 0: "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // :cond_0
	 /* iget v0, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
	 /* const/high16 v1, 0x40000000 # 2.0f */
	 /* if-le v0, v1, :cond_1 */
	 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v2 = "initialCapacity is too large: "; // const-string v2, "initialCapacity is too large: "
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // :cond_1
v0 = com.badlogic.gdx.math.MathUtils .nextPowerOfTwo ( p1 );
/* iput v0, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
int v0 = 0; // const/4 v0, 0x0
/* cmpg-float v0, p2, v0 */
/* if-gtz v0, :cond_2 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "loadFactor must be > 0: "; // const-string v2, "loadFactor must be > 0: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_2
/* iput p2, p0, Lcom/badlogic/gdx/utils/LongMap;->loadFactor:F */
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* int-to-float v0, v0 */
/* mul-float/2addr v0, p2 */
/* float-to-int v0, v0 */
/* iput v0, p0, Lcom/badlogic/gdx/utils/LongMap;->threshold:I */
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
/* iput v0, p0, Lcom/badlogic/gdx/utils/LongMap;->mask:I */
/* const/16 v0, 0x1f */
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
v1 = java.lang.Integer .numberOfTrailingZeros ( v1 );
/* sub-int/2addr v0, v1 */
/* iput v0, p0, Lcom/badlogic/gdx/utils/LongMap;->hashShift:I */
int v0 = 3; // const/4 v0, 0x3
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* int-to-double v1, v1 */
java.lang.Math .log ( v1,v2 );
/* move-result-wide v1 */
java.lang.Math .ceil ( v1,v2 );
/* move-result-wide v1 */
/* double-to-int v1, v1 */
/* add-int/lit8 v1, v1, 0x1 */
v0 = java.lang.Math .max ( v0,v1 );
/* iput v0, p0, Lcom/badlogic/gdx/utils/LongMap;->stashCapacity:I */
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* const/16 v1, 0x20 */
v0 = java.lang.Math .min ( v0,v1 );
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* int-to-double v1, v1 */
java.lang.Math .sqrt ( v1,v2 );
/* move-result-wide v1 */
/* double-to-int v1, v1 */
/* div-int/lit8 v1, v1, 0x4 */
v0 = java.lang.Math .max ( v0,v1 );
/* iput v0, p0, Lcom/badlogic/gdx/utils/LongMap;->pushIterations:I */
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongMap;->stashCapacity:I */
/* add-int/2addr v0, v1 */
/* new-array v0, v0, [J */
this.keyTable = v0;
v0 = this.keyTable;
/* array-length v0, v0 */
/* new-array v0, v0, [Ljava/lang/Object; */
/* check-cast v0, [Ljava/lang/Object; */
this.valueTable = v0;
return;
} // .end method
private Boolean containsKeyStash ( Long p0 ) {
/* .locals 5 */
v0 = this.keyTable;
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->stashSize:I */
/* add-int/2addr v2, v1 */
} // :goto_0
/* if-ge v1, v2, :cond_1 */
/* aget-wide v3, v0, v1 */
/* cmp-long v3, v3, p1 */
/* if-nez v3, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
private java.lang.Object getStash ( Long p0 ) {
/* .locals 5 */
v0 = this.keyTable;
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->stashSize:I */
/* add-int/2addr v2, v1 */
} // :goto_0
/* if-ge v1, v2, :cond_1 */
/* aget-wide v3, v0, v1 */
/* cmp-long v3, v3, p1 */
/* if-nez v3, :cond_0 */
v0 = this.valueTable;
/* aget-object v0, v0, v1 */
} // :goto_1
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
private Integer hash2 ( Long p0 ) {
/* .locals 4 */
/* const-wide/32 v0, -0x4b47d1c7 */
/* mul-long/2addr v0, p1 */
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->hashShift:I */
/* ushr-long v2, v0, v2 */
/* xor-long/2addr v0, v2 */
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->mask:I */
/* int-to-long v2, v2 */
/* and-long/2addr v0, v2 */
/* long-to-int v0, v0 */
} // .end method
private Integer hash3 ( Long p0 ) {
/* .locals 4 */
/* const-wide/32 v0, -0x312e3dbf */
/* mul-long/2addr v0, p1 */
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->hashShift:I */
/* ushr-long v2, v0, v2 */
/* xor-long/2addr v0, v2 */
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->mask:I */
/* int-to-long v2, v2 */
/* and-long/2addr v0, v2 */
/* long-to-int v0, v0 */
} // .end method
private void push ( Long p0, java.lang.Object p1, Integer p2, Long p3, Integer p4, Long p5, Integer p6, Long p7 ) {
/* .locals 28 */
/* move-object/from16 v0, p0 */
v0 = this.keyTable;
/* move-object v4, v0 */
/* move-object/from16 v0, p0 */
v0 = this.valueTable;
/* move-object v5, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/badlogic/gdx/utils/LongMap;->mask:I */
/* move v6, v0 */
int v7 = 0; // const/4 v7, 0x0
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/badlogic/gdx/utils/LongMap;->pushIterations:I */
/* move v8, v0 */
/* move-wide/from16 v9, p11 */
/* move/from16 v11, p10 */
/* move-wide/from16 v12, p8 */
/* move/from16 v14, p7 */
/* move-wide/from16 v15, p5 */
/* move/from16 v17, p4 */
/* move-object/from16 v18, p3 */
/* move-wide/from16 v19, p1 */
} // :goto_0
/* const/16 v21, 0x2 */
v21 = /* invoke-static/range {v21 ..v21}, Lcom/badlogic/gdx/math/MathUtils;->random(I)I */
/* packed-switch v21, :pswitch_data_0 */
/* aget-object v12, v5, v11 */
/* aput-wide v19, v4, v11 */
/* aput-object v18, v5, v11 */
/* move-wide/from16 v23, v9 */
/* move-wide/from16 v10, v23 */
/* move-object v9, v12 */
} // :goto_1
/* int-to-long v12, v6 */
/* and-long/2addr v12, v10 */
/* long-to-int v12, v12 */
/* aget-wide v13, v4, v12 */
/* const-wide/16 v15, 0x0 */
/* cmp-long v15, v13, v15 */
/* if-nez v15, :cond_1 */
/* aput-wide v10, v4, v12 */
/* aput-object v9, v5, v12 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* move v4, v0 */
/* add-int/lit8 v5, v4, 0x1 */
/* move v0, v5 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/badlogic/gdx/utils/LongMap;->threshold:I */
/* move v5, v0 */
/* if-lt v4, v5, :cond_0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* move v4, v0 */
/* shl-int/lit8 v4, v4, 0x1 */
/* move-object/from16 v0, p0 */
/* move v1, v4 */
/* invoke-direct {v0, v1}, Lcom/badlogic/gdx/utils/LongMap;->resize(I)V */
} // :cond_0
} // :goto_2
return;
/* :pswitch_0 */
/* aget-object v9, v5, v17 */
/* aput-wide v19, v4, v17 */
/* aput-object v18, v5, v17 */
/* move-wide v10, v15 */
/* :pswitch_1 */
/* aget-object v9, v5, v14 */
/* aput-wide v19, v4, v14 */
/* aput-object v18, v5, v14 */
/* move-wide v10, v12 */
} // :cond_1
/* move-object/from16 v0, p0 */
/* move-wide v1, v10 */
v15 = /* invoke-direct {v0, v1, v2}, Lcom/badlogic/gdx/utils/LongMap;->hash2(J)I */
/* aget-wide v16, v4, v15 */
/* const-wide/16 v18, 0x0 */
/* cmp-long v18, v16, v18 */
/* if-nez v18, :cond_2 */
/* aput-wide v10, v4, v15 */
/* aput-object v9, v5, v15 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* move v4, v0 */
/* add-int/lit8 v5, v4, 0x1 */
/* move v0, v5 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/badlogic/gdx/utils/LongMap;->threshold:I */
/* move v5, v0 */
/* if-lt v4, v5, :cond_0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* move v4, v0 */
/* shl-int/lit8 v4, v4, 0x1 */
/* move-object/from16 v0, p0 */
/* move v1, v4 */
/* invoke-direct {v0, v1}, Lcom/badlogic/gdx/utils/LongMap;->resize(I)V */
} // :cond_2
/* move-object/from16 v0, p0 */
/* move-wide v1, v10 */
v18 = /* invoke-direct {v0, v1, v2}, Lcom/badlogic/gdx/utils/LongMap;->hash3(J)I */
/* aget-wide v19, v4, v18 */
/* const-wide/16 v21, 0x0 */
/* cmp-long v21, v19, v21 */
/* if-nez v21, :cond_3 */
/* aput-wide v10, v4, v18 */
/* aput-object v9, v5, v18 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* move v4, v0 */
/* add-int/lit8 v5, v4, 0x1 */
/* move v0, v5 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/badlogic/gdx/utils/LongMap;->threshold:I */
/* move v5, v0 */
/* if-lt v4, v5, :cond_0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* move v4, v0 */
/* shl-int/lit8 v4, v4, 0x1 */
/* move-object/from16 v0, p0 */
/* move v1, v4 */
/* invoke-direct {v0, v1}, Lcom/badlogic/gdx/utils/LongMap;->resize(I)V */
} // :cond_3
/* add-int/lit8 v7, v7, 0x1 */
/* if-eq v7, v8, :cond_4 */
/* move-wide/from16 v23, v19 */
/* move-wide/from16 v19, v10 */
/* move/from16 v11, v18 */
/* move-object/from16 v18, v9 */
/* move-wide/from16 v9, v23 */
/* move-wide/from16 v25, v13 */
/* move v14, v15 */
/* move/from16 v27, v12 */
/* move-wide/from16 v12, v16 */
/* move/from16 v17, v27 */
/* move-wide/from16 v15, v25 */
/* goto/16 :goto_0 */
} // :cond_4
/* move-object/from16 v0, p0 */
/* move-wide v1, v10 */
/* move-object v3, v9 */
/* invoke-direct {v0, v1, v2, v3}, Lcom/badlogic/gdx/utils/LongMap;->putStash(JLjava/lang/Object;)V */
/* goto/16 :goto_2 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
private void putResize ( Long p0, java.lang.Object p1 ) {
/* .locals 15 */
/* const-wide/16 v2, 0x0 */
/* cmp-long v2, p1, v2 */
/* if-nez v2, :cond_1 */
/* move-object/from16 v0, p3 */
/* move-object v1, p0 */
this.zeroValue = v0;
int v2 = 1; // const/4 v2, 0x1
/* iput-boolean v2, p0, Lcom/badlogic/gdx/utils/LongMap;->hasZeroValue:Z */
} // :cond_0
} // :goto_0
return;
} // :cond_1
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->mask:I */
/* int-to-long v2, v2 */
/* and-long v2, v2, p1 */
/* long-to-int v6, v2 */
v2 = this.keyTable;
/* aget-wide v7, v2, v6 */
/* const-wide/16 v2, 0x0 */
/* cmp-long v2, v7, v2 */
/* if-nez v2, :cond_2 */
v2 = this.keyTable;
/* aput-wide p1, v2, v6 */
v2 = this.valueTable;
/* aput-object p3, v2, v6 */
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* add-int/lit8 v3, v2, 0x1 */
/* iput v3, p0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* iget v3, p0, Lcom/badlogic/gdx/utils/LongMap;->threshold:I */
/* if-lt v2, v3, :cond_0 */
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* shl-int/lit8 v2, v2, 0x1 */
/* invoke-direct {p0, v2}, Lcom/badlogic/gdx/utils/LongMap;->resize(I)V */
} // :cond_2
v9 = /* invoke-direct/range {p0 ..p2}, Lcom/badlogic/gdx/utils/LongMap;->hash2(J)I */
v2 = this.keyTable;
/* aget-wide v10, v2, v9 */
/* const-wide/16 v2, 0x0 */
/* cmp-long v2, v10, v2 */
/* if-nez v2, :cond_3 */
v2 = this.keyTable;
/* aput-wide p1, v2, v9 */
v2 = this.valueTable;
/* aput-object p3, v2, v9 */
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* add-int/lit8 v3, v2, 0x1 */
/* iput v3, p0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* iget v3, p0, Lcom/badlogic/gdx/utils/LongMap;->threshold:I */
/* if-lt v2, v3, :cond_0 */
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* shl-int/lit8 v2, v2, 0x1 */
/* invoke-direct {p0, v2}, Lcom/badlogic/gdx/utils/LongMap;->resize(I)V */
} // :cond_3
v12 = /* invoke-direct/range {p0 ..p2}, Lcom/badlogic/gdx/utils/LongMap;->hash3(J)I */
v2 = this.keyTable;
/* aget-wide v13, v2, v12 */
/* const-wide/16 v2, 0x0 */
/* cmp-long v2, v13, v2 */
/* if-nez v2, :cond_4 */
v2 = this.keyTable;
/* aput-wide p1, v2, v12 */
v2 = this.valueTable;
/* aput-object p3, v2, v12 */
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* add-int/lit8 v3, v2, 0x1 */
/* iput v3, p0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* iget v3, p0, Lcom/badlogic/gdx/utils/LongMap;->threshold:I */
/* if-lt v2, v3, :cond_0 */
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* shl-int/lit8 v2, v2, 0x1 */
/* invoke-direct {p0, v2}, Lcom/badlogic/gdx/utils/LongMap;->resize(I)V */
} // :cond_4
/* move-object v2, p0 */
/* move-wide/from16 v3, p1 */
/* move-object/from16 v5, p3 */
/* invoke-direct/range {v2 ..v14}, Lcom/badlogic/gdx/utils/LongMap;->push(JLjava/lang/Object;IJIJIJ)V */
/* goto/16 :goto_0 */
} // .end method
private void putStash ( Long p0, java.lang.Object p1 ) {
/* .locals 5 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongMap;->stashSize:I */
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongMap;->stashCapacity:I */
/* if-ne v0, v1, :cond_0 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* shl-int/lit8 v0, v0, 0x1 */
/* invoke-direct {p0, v0}, Lcom/badlogic/gdx/utils/LongMap;->resize(I)V */
(( com.badlogic.gdx.utils.LongMap ) p0 ).put ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/badlogic/gdx/utils/LongMap;->put(JLjava/lang/Object;)Ljava/lang/Object;
} // :goto_0
return;
} // :cond_0
v0 = this.keyTable;
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->stashSize:I */
/* add-int/2addr v2, v1 */
} // :goto_1
/* if-ge v1, v2, :cond_2 */
/* aget-wide v3, v0, v1 */
/* cmp-long v3, v3, p1 */
/* if-nez v3, :cond_1 */
v0 = this.valueTable;
/* aput-object p3, v0, v1 */
} // :cond_1
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_2
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->stashSize:I */
/* add-int/2addr v1, v2 */
/* aput-wide p1, v0, v1 */
v0 = this.valueTable;
/* aput-object p3, v0, v1 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongMap;->stashSize:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lcom/badlogic/gdx/utils/LongMap;->stashSize:I */
} // .end method
private void resize ( Integer p0 ) {
/* .locals 8 */
int v5 = 1; // const/4 v5, 0x1
int v4 = 0; // const/4 v4, 0x0
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongMap;->stashSize:I */
/* add-int/2addr v1, v0 */
/* iput p1, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* int-to-float v0, p1 */
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->loadFactor:F */
/* mul-float/2addr v0, v2 */
/* float-to-int v0, v0 */
/* iput v0, p0, Lcom/badlogic/gdx/utils/LongMap;->threshold:I */
/* sub-int v0, p1, v5 */
/* iput v0, p0, Lcom/badlogic/gdx/utils/LongMap;->mask:I */
/* const/16 v0, 0x1f */
v2 = java.lang.Integer .numberOfTrailingZeros ( p1 );
/* sub-int/2addr v0, v2 */
/* iput v0, p0, Lcom/badlogic/gdx/utils/LongMap;->hashShift:I */
int v0 = 3; // const/4 v0, 0x3
/* int-to-double v2, p1 */
java.lang.Math .log ( v2,v3 );
/* move-result-wide v2 */
java.lang.Math .ceil ( v2,v3 );
/* move-result-wide v2 */
/* double-to-int v2, v2 */
v0 = java.lang.Math .max ( v0,v2 );
/* iput v0, p0, Lcom/badlogic/gdx/utils/LongMap;->stashCapacity:I */
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* const/16 v2, 0x20 */
v0 = java.lang.Math .min ( v0,v2 );
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* int-to-double v2, v2 */
java.lang.Math .sqrt ( v2,v3 );
/* move-result-wide v2 */
/* double-to-int v2, v2 */
/* div-int/lit8 v2, v2, 0x4 */
v0 = java.lang.Math .max ( v0,v2 );
/* iput v0, p0, Lcom/badlogic/gdx/utils/LongMap;->pushIterations:I */
v2 = this.keyTable;
v3 = this.valueTable;
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongMap;->stashCapacity:I */
/* add-int/2addr v0, p1 */
/* new-array v0, v0, [J */
this.keyTable = v0;
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongMap;->stashCapacity:I */
/* add-int/2addr v0, p1 */
/* new-array v0, v0, [Ljava/lang/Object; */
/* check-cast v0, [Ljava/lang/Object; */
this.valueTable = v0;
/* iget-boolean v0, p0, Lcom/badlogic/gdx/utils/LongMap;->hasZeroValue:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* move v0, v5 */
} // :goto_0
/* iput v0, p0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* iput v4, p0, Lcom/badlogic/gdx/utils/LongMap;->stashSize:I */
/* move v0, v4 */
} // :goto_1
/* if-ge v0, v1, :cond_2 */
/* aget-wide v4, v2, v0 */
/* const-wide/16 v6, 0x0 */
/* cmp-long v6, v4, v6 */
if ( v6 != null) { // if-eqz v6, :cond_0
/* aget-object v6, v3, v0 */
/* invoke-direct {p0, v4, v5, v6}, Lcom/badlogic/gdx/utils/LongMap;->putResize(JLjava/lang/Object;)V */
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
/* move v0, v4 */
} // :cond_2
return;
} // .end method
/* # virtual methods */
public void clear ( ) {
/* .locals 8 */
int v7 = 0; // const/4 v7, 0x0
int v6 = 0; // const/4 v6, 0x0
v0 = this.keyTable;
v1 = this.valueTable;
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* iget v3, p0, Lcom/badlogic/gdx/utils/LongMap;->stashSize:I */
/* add-int/2addr v2, v3 */
} // :goto_0
/* add-int/lit8 v3, v2, -0x1 */
/* if-lez v2, :cond_0 */
/* const-wide/16 v4, 0x0 */
/* aput-wide v4, v0, v3 */
/* aput-object v7, v1, v3 */
/* move v2, v3 */
} // :cond_0
/* iput v6, p0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* iput v6, p0, Lcom/badlogic/gdx/utils/LongMap;->stashSize:I */
this.zeroValue = v7;
/* iput-boolean v6, p0, Lcom/badlogic/gdx/utils/LongMap;->hasZeroValue:Z */
return;
} // .end method
public Boolean containsKey ( Long p0 ) {
/* .locals 2 */
/* const-wide/16 v0, 0x0 */
/* cmp-long v0, p1, v0 */
/* if-nez v0, :cond_0 */
/* iget-boolean v0, p0, Lcom/badlogic/gdx/utils/LongMap;->hasZeroValue:Z */
} // :goto_0
} // :cond_0
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongMap;->mask:I */
/* int-to-long v0, v0 */
/* and-long/2addr v0, p1 */
/* long-to-int v0, v0 */
v1 = this.keyTable;
/* aget-wide v0, v1, v0 */
/* cmp-long v0, v0, p1 */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = /* invoke-direct {p0, p1, p2}, Lcom/badlogic/gdx/utils/LongMap;->hash2(J)I */
v1 = this.keyTable;
/* aget-wide v0, v1, v0 */
/* cmp-long v0, v0, p1 */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = /* invoke-direct {p0, p1, p2}, Lcom/badlogic/gdx/utils/LongMap;->hash3(J)I */
v1 = this.keyTable;
/* aget-wide v0, v1, v0 */
/* cmp-long v0, v0, p1 */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = /* invoke-direct {p0, p1, p2}, Lcom/badlogic/gdx/utils/LongMap;->containsKeyStash(J)Z */
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean containsValue ( java.lang.Object p0, Boolean p1 ) {
/* .locals 9 */
int v8 = 1; // const/4 v8, 0x1
v0 = this.valueTable;
/* if-nez p1, :cond_1 */
/* iget-boolean v1, p0, Lcom/badlogic/gdx/utils/LongMap;->hasZeroValue:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.zeroValue;
/* if-nez v1, :cond_0 */
/* move v0, v8 */
} // :goto_0
} // :cond_0
v1 = this.keyTable;
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* iget v3, p0, Lcom/badlogic/gdx/utils/LongMap;->stashSize:I */
/* add-int/2addr v2, v3 */
} // :goto_1
/* add-int/lit8 v3, v2, -0x1 */
/* if-lez v2, :cond_5 */
/* aget-wide v4, v1, v3 */
/* const-wide/16 v6, 0x0 */
/* cmp-long v2, v4, v6 */
if ( v2 != null) { // if-eqz v2, :cond_8
/* aget-object v2, v0, v3 */
/* if-nez v2, :cond_8 */
/* move v0, v8 */
} // :cond_1
if ( p2 != null) { // if-eqz p2, :cond_3
v1 = this.zeroValue;
/* if-ne p1, v1, :cond_2 */
/* move v0, v8 */
} // :cond_2
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->stashSize:I */
/* add-int/2addr v1, v2 */
} // :goto_2
/* add-int/lit8 v2, v1, -0x1 */
/* if-lez v1, :cond_5 */
/* aget-object v1, v0, v2 */
/* if-ne v1, p1, :cond_7 */
/* move v0, v8 */
} // :cond_3
/* iget-boolean v1, p0, Lcom/badlogic/gdx/utils/LongMap;->hasZeroValue:Z */
if ( v1 != null) { // if-eqz v1, :cond_4
v1 = this.zeroValue;
v1 = (( java.lang.Object ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_4
/* move v0, v8 */
} // :cond_4
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->stashSize:I */
/* add-int/2addr v1, v2 */
} // :goto_3
/* add-int/lit8 v2, v1, -0x1 */
/* if-lez v1, :cond_5 */
/* aget-object v1, v0, v2 */
v1 = (( java.lang.Object ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_6
/* move v0, v8 */
} // :cond_5
int v0 = 0; // const/4 v0, 0x0
} // :cond_6
/* move v1, v2 */
} // :cond_7
/* move v1, v2 */
} // :cond_8
/* move v2, v3 */
} // .end method
public void ensureCapacity ( Integer p0 ) {
/* .locals 2 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* add-int/2addr v0, p1 */
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongMap;->threshold:I */
/* if-lt v0, v1, :cond_0 */
/* int-to-float v0, v0 */
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongMap;->loadFactor:F */
/* div-float/2addr v0, v1 */
/* float-to-int v0, v0 */
v0 = com.badlogic.gdx.math.MathUtils .nextPowerOfTwo ( v0 );
/* invoke-direct {p0, v0}, Lcom/badlogic/gdx/utils/LongMap;->resize(I)V */
} // :cond_0
return;
} // .end method
public com.badlogic.gdx.utils.LongMap$Entries entries ( ) {
/* .locals 1 */
v0 = this.entries;
/* if-nez v0, :cond_0 */
/* new-instance v0, Lcom/badlogic/gdx/utils/LongMap$Entries; */
/* invoke-direct {v0, p0}, Lcom/badlogic/gdx/utils/LongMap$Entries;-><init>(Lcom/badlogic/gdx/utils/LongMap;)V */
this.entries = v0;
} // :goto_0
v0 = this.entries;
} // :cond_0
v0 = this.entries;
(( com.badlogic.gdx.utils.LongMap$Entries ) v0 ).reset ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/utils/LongMap$Entries;->reset()V
} // .end method
public java.lang.Object get ( Long p0 ) {
/* .locals 3 */
/* const-wide/16 v0, 0x0 */
/* cmp-long v0, p1, v0 */
/* if-nez v0, :cond_0 */
v0 = this.zeroValue;
} // :goto_0
} // :cond_0
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongMap;->mask:I */
/* int-to-long v0, v0 */
/* and-long/2addr v0, p1 */
/* long-to-int v0, v0 */
v1 = this.keyTable;
/* aget-wide v1, v1, v0 */
/* cmp-long v1, v1, p1 */
if ( v1 != null) { // if-eqz v1, :cond_1
v0 = /* invoke-direct {p0, p1, p2}, Lcom/badlogic/gdx/utils/LongMap;->hash2(J)I */
v1 = this.keyTable;
/* aget-wide v1, v1, v0 */
/* cmp-long v1, v1, p1 */
if ( v1 != null) { // if-eqz v1, :cond_1
v0 = /* invoke-direct {p0, p1, p2}, Lcom/badlogic/gdx/utils/LongMap;->hash3(J)I */
v1 = this.keyTable;
/* aget-wide v1, v1, v0 */
/* cmp-long v1, v1, p1 */
if ( v1 != null) { // if-eqz v1, :cond_1
/* invoke-direct {p0, p1, p2}, Lcom/badlogic/gdx/utils/LongMap;->getStash(J)Ljava/lang/Object; */
} // :cond_1
v1 = this.valueTable;
/* aget-object v0, v1, v0 */
} // .end method
public com.badlogic.gdx.utils.LongMap$Keys keys ( ) {
/* .locals 1 */
v0 = this.keys;
/* if-nez v0, :cond_0 */
/* new-instance v0, Lcom/badlogic/gdx/utils/LongMap$Keys; */
/* invoke-direct {v0, p0}, Lcom/badlogic/gdx/utils/LongMap$Keys;-><init>(Lcom/badlogic/gdx/utils/LongMap;)V */
this.keys = v0;
} // :goto_0
v0 = this.keys;
} // :cond_0
v0 = this.keys;
(( com.badlogic.gdx.utils.LongMap$Keys ) v0 ).reset ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/utils/LongMap$Keys;->reset()V
} // .end method
public java.lang.Object put ( Long p0, java.lang.Object p1 ) {
/* .locals 15 */
/* const-wide/16 v2, 0x0 */
/* cmp-long v2, p1, v2 */
/* if-nez v2, :cond_0 */
v2 = this.zeroValue;
/* move-object/from16 v0, p3 */
/* move-object v1, p0 */
this.zeroValue = v0;
int v3 = 1; // const/4 v3, 0x1
/* iput-boolean v3, p0, Lcom/badlogic/gdx/utils/LongMap;->hasZeroValue:Z */
/* iget v3, p0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* add-int/lit8 v3, v3, 0x1 */
/* iput v3, p0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
} // :goto_0
} // :cond_0
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->mask:I */
/* int-to-long v2, v2 */
/* and-long v2, v2, p1 */
/* long-to-int v6, v2 */
v2 = this.keyTable;
/* aget-wide v7, v2, v6 */
/* cmp-long v2, v7, p1 */
/* if-nez v2, :cond_1 */
v2 = this.valueTable;
/* aget-object v2, v2, v6 */
v3 = this.valueTable;
/* aput-object p3, v3, v6 */
} // :cond_1
v9 = /* invoke-direct/range {p0 ..p2}, Lcom/badlogic/gdx/utils/LongMap;->hash2(J)I */
v2 = this.keyTable;
/* aget-wide v10, v2, v9 */
/* cmp-long v2, v10, p1 */
/* if-nez v2, :cond_2 */
v2 = this.valueTable;
/* aget-object v2, v2, v9 */
v3 = this.valueTable;
/* aput-object p3, v3, v9 */
} // :cond_2
v12 = /* invoke-direct/range {p0 ..p2}, Lcom/badlogic/gdx/utils/LongMap;->hash3(J)I */
v2 = this.keyTable;
/* aget-wide v13, v2, v12 */
/* cmp-long v2, v13, p1 */
/* if-nez v2, :cond_3 */
v2 = this.valueTable;
/* aget-object v2, v2, v12 */
v3 = this.valueTable;
/* aput-object p3, v3, v12 */
} // :cond_3
/* const-wide/16 v2, 0x0 */
/* cmp-long v2, v7, v2 */
/* if-nez v2, :cond_5 */
v2 = this.keyTable;
/* aput-wide p1, v2, v6 */
v2 = this.valueTable;
/* aput-object p3, v2, v6 */
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* add-int/lit8 v3, v2, 0x1 */
/* iput v3, p0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* iget v3, p0, Lcom/badlogic/gdx/utils/LongMap;->threshold:I */
/* if-lt v2, v3, :cond_4 */
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* shl-int/lit8 v2, v2, 0x1 */
/* invoke-direct {p0, v2}, Lcom/badlogic/gdx/utils/LongMap;->resize(I)V */
} // :cond_4
int v2 = 0; // const/4 v2, 0x0
} // :cond_5
/* const-wide/16 v2, 0x0 */
/* cmp-long v2, v10, v2 */
/* if-nez v2, :cond_7 */
v2 = this.keyTable;
/* aput-wide p1, v2, v9 */
v2 = this.valueTable;
/* aput-object p3, v2, v9 */
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* add-int/lit8 v3, v2, 0x1 */
/* iput v3, p0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* iget v3, p0, Lcom/badlogic/gdx/utils/LongMap;->threshold:I */
/* if-lt v2, v3, :cond_6 */
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* shl-int/lit8 v2, v2, 0x1 */
/* invoke-direct {p0, v2}, Lcom/badlogic/gdx/utils/LongMap;->resize(I)V */
} // :cond_6
int v2 = 0; // const/4 v2, 0x0
/* goto/16 :goto_0 */
} // :cond_7
/* const-wide/16 v2, 0x0 */
/* cmp-long v2, v13, v2 */
/* if-nez v2, :cond_9 */
v2 = this.keyTable;
/* aput-wide p1, v2, v12 */
v2 = this.valueTable;
/* aput-object p3, v2, v12 */
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* add-int/lit8 v3, v2, 0x1 */
/* iput v3, p0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* iget v3, p0, Lcom/badlogic/gdx/utils/LongMap;->threshold:I */
/* if-lt v2, v3, :cond_8 */
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* shl-int/lit8 v2, v2, 0x1 */
/* invoke-direct {p0, v2}, Lcom/badlogic/gdx/utils/LongMap;->resize(I)V */
} // :cond_8
int v2 = 0; // const/4 v2, 0x0
/* goto/16 :goto_0 */
} // :cond_9
/* move-object v2, p0 */
/* move-wide/from16 v3, p1 */
/* move-object/from16 v5, p3 */
/* invoke-direct/range {v2 ..v14}, Lcom/badlogic/gdx/utils/LongMap;->push(JLjava/lang/Object;IJIJIJ)V */
int v2 = 0; // const/4 v2, 0x0
/* goto/16 :goto_0 */
} // .end method
public void putAll ( com.badlogic.gdx.utils.LongMap p0 ) {
/* .locals 4 */
(( com.badlogic.gdx.utils.LongMap ) p1 ).entries ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/utils/LongMap;->entries()Lcom/badlogic/gdx/utils/LongMap$Entries;
(( com.badlogic.gdx.utils.LongMap$Entries ) v0 ).iterator ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/utils/LongMap$Entries;->iterator()Ljava/util/Iterator;
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Lcom/badlogic/gdx/utils/LongMap$Entry; */
/* iget-wide v2, v0, Lcom/badlogic/gdx/utils/LongMap$Entry;->key:J */
v0 = this.value;
(( com.badlogic.gdx.utils.LongMap ) p0 ).put ( v2, v3, v0 ); // invoke-virtual {p0, v2, v3, v0}, Lcom/badlogic/gdx/utils/LongMap;->put(JLjava/lang/Object;)Ljava/lang/Object;
} // :cond_0
return;
} // .end method
public java.lang.Object remove ( Long p0 ) {
/* .locals 7 */
/* const-wide/16 v5, 0x0 */
int v4 = 1; // const/4 v4, 0x1
int v3 = 0; // const/4 v3, 0x0
/* cmp-long v0, p1, v5 */
/* if-nez v0, :cond_1 */
/* iget-boolean v0, p0, Lcom/badlogic/gdx/utils/LongMap;->hasZeroValue:Z */
/* if-nez v0, :cond_0 */
/* move-object v0, v3 */
} // :goto_0
} // :cond_0
v0 = this.zeroValue;
this.zeroValue = v3;
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lcom/badlogic/gdx/utils/LongMap;->hasZeroValue:Z */
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* sub-int/2addr v1, v4 */
/* iput v1, p0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
} // :cond_1
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongMap;->mask:I */
/* int-to-long v0, v0 */
/* and-long/2addr v0, p1 */
/* long-to-int v0, v0 */
v1 = this.keyTable;
/* aget-wide v1, v1, v0 */
/* cmp-long v1, v1, p1 */
/* if-nez v1, :cond_2 */
v1 = this.keyTable;
/* aput-wide v5, v1, v0 */
v1 = this.valueTable;
/* aget-object v1, v1, v0 */
v2 = this.valueTable;
/* aput-object v3, v2, v0 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* sub-int/2addr v0, v4 */
/* iput v0, p0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* move-object v0, v1 */
} // :cond_2
v0 = /* invoke-direct {p0, p1, p2}, Lcom/badlogic/gdx/utils/LongMap;->hash2(J)I */
v1 = this.keyTable;
/* aget-wide v1, v1, v0 */
/* cmp-long v1, v1, p1 */
/* if-nez v1, :cond_3 */
v1 = this.keyTable;
/* aput-wide v5, v1, v0 */
v1 = this.valueTable;
/* aget-object v1, v1, v0 */
v2 = this.valueTable;
/* aput-object v3, v2, v0 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* sub-int/2addr v0, v4 */
/* iput v0, p0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* move-object v0, v1 */
} // :cond_3
v0 = /* invoke-direct {p0, p1, p2}, Lcom/badlogic/gdx/utils/LongMap;->hash3(J)I */
v1 = this.keyTable;
/* aget-wide v1, v1, v0 */
/* cmp-long v1, v1, p1 */
/* if-nez v1, :cond_4 */
v1 = this.keyTable;
/* aput-wide v5, v1, v0 */
v1 = this.valueTable;
/* aget-object v1, v1, v0 */
v2 = this.valueTable;
/* aput-object v3, v2, v0 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* sub-int/2addr v0, v4 */
/* iput v0, p0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* move-object v0, v1 */
} // :cond_4
(( com.badlogic.gdx.utils.LongMap ) p0 ).removeStash ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/badlogic/gdx/utils/LongMap;->removeStash(J)Ljava/lang/Object;
} // .end method
java.lang.Object removeStash ( Long p0 ) {
/* .locals 5 */
v0 = this.keyTable;
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* iget v2, p0, Lcom/badlogic/gdx/utils/LongMap;->stashSize:I */
/* add-int/2addr v2, v1 */
} // :goto_0
/* if-ge v1, v2, :cond_1 */
/* aget-wide v3, v0, v1 */
/* cmp-long v3, v3, p1 */
/* if-nez v3, :cond_0 */
v0 = this.valueTable;
/* aget-object v0, v0, v1 */
(( com.badlogic.gdx.utils.LongMap ) p0 ).removeStashIndex ( v1 ); // invoke-virtual {p0, v1}, Lcom/badlogic/gdx/utils/LongMap;->removeStashIndex(I)V
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
/* iput v1, p0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
} // :goto_1
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
void removeStashIndex ( Integer p0 ) {
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongMap;->stashSize:I */
int v1 = 1; // const/4 v1, 0x1
/* sub-int/2addr v0, v1 */
/* iput v0, p0, Lcom/badlogic/gdx/utils/LongMap;->stashSize:I */
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongMap;->capacity:I */
/* iget v1, p0, Lcom/badlogic/gdx/utils/LongMap;->stashSize:I */
/* add-int/2addr v0, v1 */
/* if-ge p1, v0, :cond_0 */
v1 = this.keyTable;
v2 = this.keyTable;
/* aget-wide v2, v2, v0 */
/* aput-wide v2, v1, p1 */
v1 = this.valueTable;
v2 = this.valueTable;
/* aget-object v2, v2, v0 */
/* aput-object v2, v1, p1 */
v1 = this.valueTable;
/* aput-object v4, v1, v0 */
} // :goto_0
return;
} // :cond_0
v0 = this.valueTable;
/* aput-object v4, v0, p1 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 10 */
/* const-wide/16 v8, 0x0 */
/* const/16 v7, 0x3d */
/* iget v0, p0, Lcom/badlogic/gdx/utils/LongMap;->size:I */
/* if-nez v0, :cond_0 */
final String v0 = "[]"; // const-string v0, "[]"
} // :goto_0
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* const/16 v1, 0x20 */
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V */
/* const/16 v1, 0x5b */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
v1 = this.keyTable;
v2 = this.valueTable;
/* array-length v3, v1 */
} // :goto_1
/* add-int/lit8 v4, v3, -0x1 */
/* if-lez v3, :cond_1 */
/* aget-wide v5, v1, v4 */
/* cmp-long v3, v5, v8 */
if ( v3 != null) { // if-eqz v3, :cond_3
(( java.lang.StringBuilder ) v0 ).append ( v5, v6 ); // invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v7 ); // invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* aget-object v3, v2, v4 */
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
} // :cond_1
/* move v3, v4 */
} // :goto_2
/* add-int/lit8 v4, v3, -0x1 */
/* if-lez v3, :cond_2 */
/* aget-wide v5, v1, v4 */
/* cmp-long v3, v5, v8 */
if ( v3 != null) { // if-eqz v3, :cond_1
final String v3 = ", "; // const-string v3, ", "
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v5, v6 ); // invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v7 ); // invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* aget-object v3, v2, v4 */
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* move v3, v4 */
} // :cond_2
/* const/16 v1, 0x5d */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_3
/* move v3, v4 */
} // .end method
public com.badlogic.gdx.utils.LongMap$Values values ( ) {
/* .locals 1 */
v0 = this.values;
/* if-nez v0, :cond_0 */
/* new-instance v0, Lcom/badlogic/gdx/utils/LongMap$Values; */
/* invoke-direct {v0, p0}, Lcom/badlogic/gdx/utils/LongMap$Values;-><init>(Lcom/badlogic/gdx/utils/LongMap;)V */
this.values = v0;
} // :goto_0
v0 = this.values;
} // :cond_0
v0 = this.values;
(( com.badlogic.gdx.utils.LongMap$Values ) v0 ).reset ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/utils/LongMap$Values;->reset()V
} // .end method

class com.badlogic.gdx.utils.TimSort {
	 /* # static fields */
	 private static final Boolean DEBUG;
	 private static final Integer INITIAL_TMP_STORAGE_LENGTH;
	 private static final Integer MIN_GALLOP;
	 private static final Integer MIN_MERGE;
	 /* # instance fields */
	 private java.lang.Object a;
	 private java.util.Comparator c;
	 private Integer minGallop;
	 private final runBase;
	 private final runLen;
	 private Integer stackSize;
	 private java.lang.Object tmp;
	 /* # direct methods */
	 com.badlogic.gdx.utils.TimSort ( ) {
		 /* .locals 2 */
		 /* const/16 v1, 0x28 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 7; // const/4 v0, 0x7
		 /* iput v0, p0, Lcom/badlogic/gdx/utils/TimSort;->minGallop:I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/badlogic/gdx/utils/TimSort;->stackSize:I */
		 /* const/16 v0, 0x100 */
		 /* new-array v0, v0, [Ljava/lang/Object; */
		 /* check-cast v0, [Ljava/lang/Object; */
		 this.tmp = v0;
		 /* new-array v0, v1, [I */
		 this.runBase = v0;
		 /* new-array v0, v1, [I */
		 this.runLen = v0;
		 return;
	 } // .end method
	 private com.badlogic.gdx.utils.TimSort ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 7; // const/4 v0, 0x7
		 /* iput v0, p0, Lcom/badlogic/gdx/utils/TimSort;->minGallop:I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/badlogic/gdx/utils/TimSort;->stackSize:I */
		 this.a = p1;
		 this.c = p2;
		 /* array-length v1, p1 */
		 /* const/16 v0, 0x200 */
		 /* if-ge v1, v0, :cond_0 */
		 /* ushr-int/lit8 v0, v1, 0x1 */
	 } // :goto_0
	 /* new-array v0, v0, [Ljava/lang/Object; */
	 /* check-cast v0, [Ljava/lang/Object; */
	 this.tmp = v0;
	 /* const/16 v0, 0x78 */
	 /* if-ge v1, v0, :cond_1 */
	 int v0 = 5; // const/4 v0, 0x5
} // :goto_1
/* new-array v1, v0, [I */
this.runBase = v1;
/* new-array v0, v0, [I */
this.runLen = v0;
return;
} // :cond_0
/* const/16 v0, 0x100 */
} // :cond_1
/* const/16 v0, 0x606 */
/* if-ge v1, v0, :cond_2 */
/* const/16 v0, 0xa */
} // :cond_2
/* const v0, 0x1d16f */
/* if-ge v1, v0, :cond_3 */
/* const/16 v0, 0x13 */
} // :cond_3
/* const/16 v0, 0x28 */
} // .end method
private static void binarySort ( java.lang.Object[] p0, Integer p1, Integer p2, Integer p3, java.util.Comparator p4 ) {
/* .locals 6 */
/* if-ne p3, p1, :cond_3 */
/* add-int/lit8 v0, p3, 0x1 */
} // :goto_0
/* if-ge v0, p2, :cond_2 */
/* aget-object v1, p0, v0 */
/* move v2, v0 */
/* move v3, p1 */
} // :goto_1
/* if-ge v3, v2, :cond_1 */
/* add-int v4, v3, v2 */
/* ushr-int/lit8 v4, v4, 0x1 */
v5 = /* aget-object v5, p0, v4 */
/* if-gez v5, :cond_0 */
/* move v2, v4 */
} // :cond_0
/* add-int/lit8 v3, v4, 0x1 */
} // :cond_1
/* sub-int v2, v0, v3 */
/* packed-switch v2, :pswitch_data_0 */
/* add-int/lit8 v4, v3, 0x1 */
java.lang.System .arraycopy ( p0,v3,p0,v4,v2 );
} // :goto_2
/* aput-object v1, p0, v3 */
/* add-int/lit8 v0, v0, 0x1 */
/* :pswitch_0 */
/* add-int/lit8 v2, v3, 0x2 */
/* add-int/lit8 v4, v3, 0x1 */
/* aget-object v4, p0, v4 */
/* aput-object v4, p0, v2 */
/* :pswitch_1 */
/* add-int/lit8 v2, v3, 0x1 */
/* aget-object v4, p0, v3 */
/* aput-object v4, p0, v2 */
} // :cond_2
return;
} // :cond_3
/* move v0, p3 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
private static Integer countRunAndMakeAscending ( java.lang.Object[] p0, Integer p1, Integer p2, java.util.Comparator p3 ) {
/* .locals 4 */
int v3 = 1; // const/4 v3, 0x1
/* add-int/lit8 v0, p1, 0x1 */
/* if-ne v0, p2, :cond_0 */
/* move v0, v3 */
} // :goto_0
} // :cond_0
/* add-int/lit8 v1, v0, 0x1 */
/* aget-object v0, p0, v0 */
v0 = /* aget-object v2, p0, p1 */
/* if-gez v0, :cond_3 */
/* move v0, v1 */
} // :goto_1
/* if-ge v0, p2, :cond_1 */
/* aget-object v1, p0, v0 */
/* sub-int v2, v0, v3 */
v1 = /* aget-object v2, p0, v2 */
/* if-gez v1, :cond_1 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
com.badlogic.gdx.utils.TimSort .reverseRange ( p0,p1,v0 );
} // :cond_2
/* sub-int/2addr v0, p1 */
} // :goto_2
/* if-ge v0, p2, :cond_2 */
/* aget-object v1, p0, v0 */
/* sub-int v2, v0, v3 */
v1 = /* aget-object v2, p0, v2 */
/* if-ltz v1, :cond_2 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_3
/* move v0, v1 */
} // .end method
private java.lang.Object ensureCapacity ( Integer p0 ) {
/* .locals 2 */
v0 = this.tmp;
/* array-length v0, v0 */
/* if-ge v0, p1, :cond_0 */
/* shr-int/lit8 v0, p1, 0x1 */
/* or-int/2addr v0, p1 */
/* shr-int/lit8 v1, v0, 0x2 */
/* or-int/2addr v0, v1 */
/* shr-int/lit8 v1, v0, 0x4 */
/* or-int/2addr v0, v1 */
/* shr-int/lit8 v1, v0, 0x8 */
/* or-int/2addr v0, v1 */
/* shr-int/lit8 v1, v0, 0x10 */
/* or-int/2addr v0, v1 */
/* add-int/lit8 v0, v0, 0x1 */
/* if-gez v0, :cond_1 */
/* move v0, p1 */
} // :goto_0
/* new-array v0, v0, [Ljava/lang/Object; */
/* check-cast v0, [Ljava/lang/Object; */
this.tmp = v0;
} // :cond_0
v0 = this.tmp;
} // :cond_1
v1 = this.a;
/* array-length v1, v1 */
/* ushr-int/lit8 v1, v1, 0x1 */
v0 = java.lang.Math .min ( v0,v1 );
} // .end method
private static Integer gallopLeft ( java.lang.Object p0, java.lang.Object[] p1, Integer p2, Integer p3, Integer p4, java.util.Comparator p5 ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 1; // const/4 v1, 0x1
/* add-int v2, p2, p4 */
v2 = /* aget-object v2, p1, v2 */
/* if-lez v2, :cond_2 */
/* sub-int v2, p3, p4 */
/* move v4, v1 */
/* move v1, v0 */
/* move v0, v4 */
} // :goto_0
/* if-ge v0, v2, :cond_0 */
/* add-int v3, p2, p4 */
/* add-int/2addr v3, v0 */
v3 = /* aget-object v3, p1, v3 */
/* if-lez v3, :cond_0 */
/* shl-int/lit8 v1, v0, 0x1 */
/* add-int/lit8 v1, v1, 0x1 */
/* if-gtz v1, :cond_8 */
/* move v1, v0 */
/* move v0, v2 */
} // :cond_0
/* if-le v0, v2, :cond_1 */
/* move v0, v2 */
} // :cond_1
/* add-int/2addr v1, p4 */
/* add-int/2addr v0, p4 */
} // :goto_1
/* add-int/lit8 v1, v1, 0x1 */
} // :goto_2
/* if-ge v1, v0, :cond_6 */
/* sub-int v2, v0, v1 */
/* ushr-int/lit8 v2, v2, 0x1 */
/* add-int/2addr v2, v1 */
/* add-int v3, p2, v2 */
v3 = /* aget-object v3, p1, v3 */
/* if-lez v3, :cond_5 */
/* add-int/lit8 v1, v2, 0x1 */
} // :cond_2
/* add-int/lit8 v2, p4, 0x1 */
/* move v4, v1 */
/* move v1, v0 */
/* move v0, v4 */
} // :goto_3
/* if-ge v0, v2, :cond_3 */
/* add-int v3, p2, p4 */
/* sub-int/2addr v3, v0 */
v3 = /* aget-object v3, p1, v3 */
/* if-gtz v3, :cond_3 */
/* shl-int/lit8 v1, v0, 0x1 */
/* add-int/lit8 v1, v1, 0x1 */
/* if-gtz v1, :cond_7 */
/* move v1, v0 */
/* move v0, v2 */
} // :cond_3
/* if-le v0, v2, :cond_4 */
/* move v0, v2 */
} // :cond_4
/* sub-int v0, p4, v0 */
/* sub-int v1, p4, v1 */
/* move v4, v1 */
/* move v1, v0 */
/* move v0, v4 */
} // :cond_5
/* move v0, v2 */
} // :cond_6
} // :cond_7
/* move v4, v1 */
/* move v1, v0 */
/* move v0, v4 */
} // :cond_8
/* move v4, v1 */
/* move v1, v0 */
/* move v0, v4 */
} // .end method
private static Integer gallopRight ( java.lang.Object p0, java.lang.Object[] p1, Integer p2, Integer p3, Integer p4, java.util.Comparator p5 ) {
/* .locals 5 */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
/* add-int v2, p2, p4 */
v2 = /* aget-object v2, p1, v2 */
/* if-gez v2, :cond_2 */
/* add-int/lit8 v2, p4, 0x1 */
/* move v4, v1 */
/* move v1, v0 */
/* move v0, v4 */
} // :goto_0
/* if-ge v1, v2, :cond_0 */
/* add-int v3, p2, p4 */
/* sub-int/2addr v3, v1 */
v3 = /* aget-object v3, p1, v3 */
/* if-gez v3, :cond_0 */
/* shl-int/lit8 v0, v1, 0x1 */
/* add-int/lit8 v0, v0, 0x1 */
/* if-gtz v0, :cond_8 */
/* move v0, v1 */
/* move v1, v2 */
} // :cond_0
/* if-le v1, v2, :cond_1 */
/* move v1, v2 */
} // :cond_1
/* sub-int v1, p4, v1 */
/* sub-int v0, p4, v0 */
/* move v4, v1 */
/* move v1, v0 */
/* move v0, v4 */
} // :goto_1
/* add-int/lit8 v0, v0, 0x1 */
} // :goto_2
/* if-ge v0, v1, :cond_6 */
/* sub-int v2, v1, v0 */
/* ushr-int/lit8 v2, v2, 0x1 */
/* add-int/2addr v2, v0 */
/* add-int v3, p2, v2 */
v3 = /* aget-object v3, p1, v3 */
/* if-gez v3, :cond_5 */
/* move v1, v2 */
} // :cond_2
/* sub-int v2, p3, p4 */
/* move v4, v1 */
/* move v1, v0 */
/* move v0, v4 */
} // :goto_3
/* if-ge v1, v2, :cond_3 */
/* add-int v3, p2, p4 */
/* add-int/2addr v3, v1 */
v3 = /* aget-object v3, p1, v3 */
/* if-ltz v3, :cond_3 */
/* shl-int/lit8 v0, v1, 0x1 */
/* add-int/lit8 v0, v0, 0x1 */
/* if-gtz v0, :cond_7 */
/* move v0, v1 */
/* move v1, v2 */
} // :cond_3
/* if-le v1, v2, :cond_4 */
/* move v1, v2 */
} // :cond_4
/* add-int/2addr v0, p4 */
/* add-int/2addr v1, p4 */
} // :cond_5
/* add-int/lit8 v0, v2, 0x1 */
} // :cond_6
} // :cond_7
/* move v4, v1 */
/* move v1, v0 */
/* move v0, v4 */
} // :cond_8
/* move v4, v1 */
/* move v1, v0 */
/* move v0, v4 */
} // .end method
private void mergeAt ( Integer p0 ) {
/* .locals 11 */
int v10 = 1; // const/4 v10, 0x1
v0 = this.runBase;
/* aget v2, v0, p1 */
v0 = this.runLen;
/* aget v3, v0, p1 */
v0 = this.runBase;
/* add-int/lit8 v1, p1, 0x1 */
/* aget v6, v0, v1 */
v0 = this.runLen;
/* add-int/lit8 v1, p1, 0x1 */
/* aget v7, v0, v1 */
v0 = this.runLen;
/* add-int v1, v3, v7 */
/* aput v1, v0, p1 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/TimSort;->stackSize:I */
int v1 = 3; // const/4 v1, 0x3
/* sub-int/2addr v0, v1 */
/* if-ne p1, v0, :cond_0 */
v0 = this.runBase;
/* add-int/lit8 v1, p1, 0x1 */
v4 = this.runBase;
/* add-int/lit8 v5, p1, 0x2 */
/* aget v4, v4, v5 */
/* aput v4, v0, v1 */
v0 = this.runLen;
/* add-int/lit8 v1, p1, 0x1 */
v4 = this.runLen;
/* add-int/lit8 v5, p1, 0x2 */
/* aget v4, v4, v5 */
/* aput v4, v0, v1 */
} // :cond_0
/* iget v0, p0, Lcom/badlogic/gdx/utils/TimSort;->stackSize:I */
/* sub-int/2addr v0, v10 */
/* iput v0, p0, Lcom/badlogic/gdx/utils/TimSort;->stackSize:I */
v0 = this.a;
/* aget-object v0, v0, v6 */
v1 = this.a;
int v4 = 0; // const/4 v4, 0x0
v5 = this.c;
v0 = /* invoke-static/range {v0 ..v5}, Lcom/badlogic/gdx/utils/TimSort;->gallopRight(Ljava/lang/Object;[Ljava/lang/Object;IIILjava/util/Comparator;)I */
/* add-int v8, v2, v0 */
/* sub-int v9, v3, v0 */
/* if-nez v9, :cond_2 */
} // :cond_1
} // :goto_0
return;
} // :cond_2
v0 = this.a;
/* add-int v1, v8, v9 */
/* sub-int/2addr v1, v10 */
/* aget-object v0, v0, v1 */
v1 = this.a;
/* sub-int v4, v7, v10 */
v5 = this.c;
/* move v2, v6 */
/* move v3, v7 */
v0 = /* invoke-static/range {v0 ..v5}, Lcom/badlogic/gdx/utils/TimSort;->gallopLeft(Ljava/lang/Object;[Ljava/lang/Object;IIILjava/util/Comparator;)I */
if ( v0 != null) { // if-eqz v0, :cond_1
/* if-gt v9, v0, :cond_3 */
/* invoke-direct {p0, v8, v9, v6, v0}, Lcom/badlogic/gdx/utils/TimSort;->mergeLo(IIII)V */
} // :cond_3
/* invoke-direct {p0, v8, v9, v6, v0}, Lcom/badlogic/gdx/utils/TimSort;->mergeHi(IIII)V */
} // .end method
private void mergeCollapse ( ) {
/* .locals 6 */
int v5 = 1; // const/4 v5, 0x1
} // :goto_0
/* iget v0, p0, Lcom/badlogic/gdx/utils/TimSort;->stackSize:I */
/* if-le v0, v5, :cond_2 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/TimSort;->stackSize:I */
int v1 = 2; // const/4 v1, 0x2
/* sub-int/2addr v0, v1 */
/* if-lez v0, :cond_1 */
v1 = this.runLen;
/* sub-int v2, v0, v5 */
/* aget v1, v1, v2 */
v2 = this.runLen;
/* aget v2, v2, v0 */
v3 = this.runLen;
/* add-int/lit8 v4, v0, 0x1 */
/* aget v3, v3, v4 */
/* add-int/2addr v2, v3 */
/* if-gt v1, v2, :cond_1 */
v1 = this.runLen;
/* sub-int v2, v0, v5 */
/* aget v1, v1, v2 */
v2 = this.runLen;
/* add-int/lit8 v3, v0, 0x1 */
/* aget v2, v2, v3 */
/* if-ge v1, v2, :cond_0 */
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_0
/* invoke-direct {p0, v0}, Lcom/badlogic/gdx/utils/TimSort;->mergeAt(I)V */
} // :cond_1
v1 = this.runLen;
/* aget v1, v1, v0 */
v2 = this.runLen;
/* add-int/lit8 v3, v0, 0x1 */
/* aget v2, v2, v3 */
/* if-gt v1, v2, :cond_2 */
/* invoke-direct {p0, v0}, Lcom/badlogic/gdx/utils/TimSort;->mergeAt(I)V */
} // :cond_2
return;
} // .end method
private void mergeForceCollapse ( ) {
/* .locals 5 */
int v4 = 1; // const/4 v4, 0x1
} // :goto_0
/* iget v0, p0, Lcom/badlogic/gdx/utils/TimSort;->stackSize:I */
/* if-le v0, v4, :cond_1 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/TimSort;->stackSize:I */
int v1 = 2; // const/4 v1, 0x2
/* sub-int/2addr v0, v1 */
/* if-lez v0, :cond_0 */
v1 = this.runLen;
/* sub-int v2, v0, v4 */
/* aget v1, v1, v2 */
v2 = this.runLen;
/* add-int/lit8 v3, v0, 0x1 */
/* aget v2, v2, v3 */
/* if-ge v1, v2, :cond_0 */
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_0
/* invoke-direct {p0, v0}, Lcom/badlogic/gdx/utils/TimSort;->mergeAt(I)V */
} // :cond_1
return;
} // .end method
private void mergeHi ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 22 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v6, v0 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, p4 */
/* invoke-direct {v0, v1}, Lcom/badlogic/gdx/utils/TimSort;->ensureCapacity(I)[Ljava/lang/Object; */
int v5 = 0; // const/4 v5, 0x0
/* move-object v0, v6 */
/* move/from16 v1, p3 */
/* move-object v2, v12 */
/* move v3, v5 */
/* move/from16 v4, p4 */
java.lang.System .arraycopy ( v0,v1,v2,v3,v4 );
/* add-int v5, p1, p2 */
int v7 = 1; // const/4 v7, 0x1
/* sub-int/2addr v5, v7 */
int v7 = 1; // const/4 v7, 0x1
/* sub-int v7, p4, v7 */
/* add-int v8, p3, p4 */
int v9 = 1; // const/4 v9, 0x1
/* sub-int/2addr v8, v9 */
/* add-int/lit8 v9, v8, -0x1 */
/* add-int/lit8 v11, v5, -0x1 */
/* aget-object v5, v6, v5 */
/* aput-object v5, v6, v8 */
/* add-int/lit8 v5, p2, -0x1 */
/* if-nez v5, :cond_0 */
int v5 = 0; // const/4 v5, 0x0
/* sub-int v7, v9, v7 */
/* move-object v0, v12 */
/* move v1, v5 */
/* move-object v2, v6 */
/* move v3, v7 */
/* move/from16 v4, p4 */
java.lang.System .arraycopy ( v0,v1,v2,v3,v4 );
} // :goto_0
return;
} // :cond_0
int v8 = 1; // const/4 v8, 0x1
/* move/from16 v0, p4 */
/* move v1, v8 */
/* if-ne v0, v1, :cond_1 */
/* sub-int v8, v9, v5 */
/* sub-int v9, v11, v5 */
/* add-int/lit8 v9, v9, 0x1 */
/* add-int/lit8 v10, v8, 0x1 */
java.lang.System .arraycopy ( v6,v9,v6,v10,v5 );
/* aget-object v5, v12, v7 */
/* aput-object v5, v6, v8 */
} // :cond_1
/* move-object/from16 v0, p0 */
v0 = this.c;
/* move-object v10, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/badlogic/gdx/utils/TimSort;->minGallop:I */
/* move v8, v0 */
/* move v13, v5 */
/* move v5, v8 */
/* move v8, v11 */
/* move v11, v9 */
/* move/from16 v9, p4 */
} // :goto_1
int v14 = 0; // const/4 v14, 0x0
int v15 = 0; // const/4 v15, 0x0
/* move/from16 v20, v15 */
/* move v15, v13 */
/* move v13, v9 */
/* move v9, v7 */
/* move/from16 v7, v20 */
/* move/from16 v21, v14 */
/* move v14, v11 */
/* move v11, v8 */
/* move/from16 v8, v21 */
} // :cond_2
/* aget-object v16, v12, v9 */
/* aget-object v17, v6, v11 */
/* move-object v0, v10 */
/* move-object/from16 v1, v16 */
v16 = /* move-object/from16 v2, v17 */
/* if-gez v16, :cond_4 */
/* add-int/lit8 v7, v14, -0x1 */
/* add-int/lit8 v16, v11, -0x1 */
/* aget-object v11, v6, v11 */
/* aput-object v11, v6, v14 */
/* add-int/lit8 v8, v8, 0x1 */
int v11 = 0; // const/4 v11, 0x0
/* add-int/lit8 v14, v15, -0x1 */
/* if-nez v14, :cond_12 */
/* move/from16 v8, v16 */
/* move v10, v7 */
/* move v11, v14 */
/* move v7, v9 */
/* move v9, v13 */
} // :goto_2
/* if-gtz v5, :cond_3 */
int v5 = 1; // const/4 v5, 0x1
} // :cond_3
/* move v0, v5 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/badlogic/gdx/utils/TimSort;->minGallop:I */
int v5 = 1; // const/4 v5, 0x1
/* if-ne v9, v5, :cond_7 */
/* sub-int v5, v10, v11 */
/* sub-int/2addr v8, v11 */
/* add-int/lit8 v8, v8, 0x1 */
/* add-int/lit8 v9, v5, 0x1 */
java.lang.System .arraycopy ( v6,v8,v6,v9,v11 );
/* aget-object v7, v12, v7 */
/* aput-object v7, v6, v5 */
} // :cond_4
/* add-int/lit8 v8, v14, -0x1 */
/* add-int/lit8 v16, v9, -0x1 */
/* aget-object v9, v12, v9 */
/* aput-object v9, v6, v14 */
/* add-int/lit8 v7, v7, 0x1 */
int v9 = 0; // const/4 v9, 0x0
/* add-int/lit8 v13, v13, -0x1 */
int v14 = 1; // const/4 v14, 0x1
/* if-eq v13, v14, :cond_11 */
/* move v14, v8 */
/* move v8, v9 */
/* move/from16 v9, v16 */
} // :goto_3
/* or-int v16, v8, v7 */
/* move/from16 v0, v16 */
/* move v1, v5 */
/* if-lt v0, v1, :cond_2 */
/* move/from16 v17, v5 */
/* move v8, v15 */
/* move v15, v14 */
/* move v14, v13 */
/* move v13, v11 */
/* move v11, v9 */
} // :goto_4
/* aget-object v5, v12, v11 */
int v7 = 1; // const/4 v7, 0x1
/* sub-int v9, v8, v7 */
/* move/from16 v7, p1 */
v5 = /* invoke-static/range {v5 ..v10}, Lcom/badlogic/gdx/utils/TimSort;->gallopRight(Ljava/lang/Object;[Ljava/lang/Object;IIILjava/util/Comparator;)I */
/* sub-int v5, v8, v5 */
if ( v5 != null) { // if-eqz v5, :cond_10
/* sub-int v7, v15, v5 */
/* sub-int v9, v13, v5 */
/* sub-int/2addr v8, v5 */
/* add-int/lit8 v13, v9, 0x1 */
/* add-int/lit8 v15, v7, 0x1 */
java.lang.System .arraycopy ( v6,v13,v6,v15,v5 );
if ( v8 != null) { // if-eqz v8, :cond_f
/* move/from16 v20, v9 */
/* move v9, v8 */
/* move v8, v7 */
/* move/from16 v7, v20 */
} // :goto_5
/* add-int/lit8 v18, v8, -0x1 */
/* add-int/lit8 v19, v11, -0x1 */
/* aget-object v11, v12, v11 */
/* aput-object v11, v6, v8 */
/* add-int/lit8 v14, v14, -0x1 */
int v8 = 1; // const/4 v8, 0x1
/* if-eq v14, v8, :cond_e */
/* aget-object v11, v6, v7 */
int v13 = 0; // const/4 v13, 0x0
int v8 = 1; // const/4 v8, 0x1
/* sub-int v15, v14, v8 */
/* move-object/from16 v16, v10 */
v8 = /* invoke-static/range {v11 ..v16}, Lcom/badlogic/gdx/utils/TimSort;->gallopLeft(Ljava/lang/Object;[Ljava/lang/Object;IIILjava/util/Comparator;)I */
/* sub-int v8, v14, v8 */
if ( v8 != null) { // if-eqz v8, :cond_d
/* sub-int v11, v18, v8 */
/* sub-int v13, v19, v8 */
/* sub-int/2addr v14, v8 */
/* add-int/lit8 v15, v13, 0x1 */
/* add-int/lit8 v16, v11, 0x1 */
/* move-object v0, v12 */
/* move v1, v15 */
/* move-object v2, v6 */
/* move/from16 v3, v16 */
/* move v4, v8 */
java.lang.System .arraycopy ( v0,v1,v2,v3,v4 );
int v15 = 1; // const/4 v15, 0x1
/* if-le v14, v15, :cond_c */
/* move/from16 v20, v13 */
/* move v13, v14 */
/* move v14, v11 */
/* move/from16 v11, v20 */
} // :goto_6
/* add-int/lit8 v15, v14, -0x1 */
/* add-int/lit8 v16, v7, -0x1 */
/* aget-object v7, v6, v7 */
/* aput-object v7, v6, v14 */
/* add-int/lit8 v7, v9, -0x1 */
if ( v7 != null) { // if-eqz v7, :cond_b
/* add-int/lit8 v9, v17, -0x1 */
int v14 = 7; // const/4 v14, 0x7
/* if-lt v5, v14, :cond_5 */
int v5 = 1; // const/4 v5, 0x1
} // :goto_7
int v14 = 7; // const/4 v14, 0x7
/* if-lt v8, v14, :cond_6 */
int v8 = 1; // const/4 v8, 0x1
} // :goto_8
/* or-int/2addr v5, v8 */
/* if-nez v5, :cond_a */
/* if-gez v9, :cond_9 */
int v5 = 0; // const/4 v5, 0x0
} // :goto_9
/* add-int/lit8 v5, v5, 0x2 */
/* move/from16 v8, v16 */
/* move v9, v13 */
/* move v13, v7 */
/* move v7, v11 */
/* move v11, v15 */
/* goto/16 :goto_1 */
} // :cond_5
int v5 = 0; // const/4 v5, 0x0
} // :cond_6
int v8 = 0; // const/4 v8, 0x0
} // :cond_7
/* if-nez v9, :cond_8 */
/* new-instance v5, Ljava/lang/IllegalArgumentException; */
final String v6 = "Comparison method violates its general contract!"; // const-string v6, "Comparison method violates its general contract!"
/* invoke-direct {v5, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v5 */
} // :cond_8
int v5 = 0; // const/4 v5, 0x0
int v7 = 1; // const/4 v7, 0x1
/* sub-int v7, v9, v7 */
/* sub-int v7, v10, v7 */
java.lang.System .arraycopy ( v12,v5,v6,v7,v9 );
/* goto/16 :goto_0 */
} // :cond_9
/* move v5, v9 */
} // :cond_a
/* move/from16 v17, v9 */
/* move v14, v13 */
/* move v8, v7 */
/* move/from16 v13, v16 */
/* goto/16 :goto_4 */
} // :cond_b
/* move/from16 v5, v17 */
/* move/from16 v8, v16 */
/* move v9, v13 */
/* move v10, v15 */
/* move/from16 v20, v11 */
/* move v11, v7 */
/* move/from16 v7, v20 */
/* goto/16 :goto_2 */
} // :cond_c
/* move/from16 v5, v17 */
/* move v8, v7 */
/* move v10, v11 */
/* move v7, v13 */
/* move v11, v9 */
/* move v9, v14 */
/* goto/16 :goto_2 */
} // :cond_d
/* move/from16 v11, v19 */
/* move v13, v14 */
/* move/from16 v14, v18 */
} // :cond_e
/* move/from16 v5, v17 */
/* move v8, v7 */
/* move/from16 v10, v18 */
/* move v11, v9 */
/* move/from16 v7, v19 */
/* move v9, v14 */
/* goto/16 :goto_2 */
} // :cond_f
/* move/from16 v5, v17 */
/* move v10, v7 */
/* move v7, v11 */
/* move v11, v8 */
/* move v8, v9 */
/* move v9, v14 */
/* goto/16 :goto_2 */
} // :cond_10
/* move v7, v13 */
/* move v9, v8 */
/* move v8, v15 */
/* goto/16 :goto_5 */
} // :cond_11
/* move/from16 v7, v16 */
/* move v9, v13 */
/* move v10, v8 */
/* move v8, v11 */
/* move v11, v15 */
/* goto/16 :goto_2 */
} // :cond_12
/* move v15, v14 */
/* move v14, v7 */
/* move v7, v11 */
/* move/from16 v11, v16 */
/* goto/16 :goto_3 */
} // .end method
private void mergeLo ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 21 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v12, v0 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, p2 */
/* invoke-direct {v0, v1}, Lcom/badlogic/gdx/utils/TimSort;->ensureCapacity(I)[Ljava/lang/Object; */
int v5 = 0; // const/4 v5, 0x0
/* move-object v0, v12 */
/* move/from16 v1, p1 */
/* move-object v2, v6 */
/* move v3, v5 */
/* move/from16 v4, p2 */
java.lang.System .arraycopy ( v0,v1,v2,v3,v4 );
int v5 = 0; // const/4 v5, 0x0
/* add-int/lit8 v7, p1, 0x1 */
/* add-int/lit8 v8, p3, 0x1 */
/* aget-object v9, v12, p3 */
/* aput-object v9, v12, p1 */
/* add-int/lit8 v9, p4, -0x1 */
/* if-nez v9, :cond_0 */
int v5 = 0; // const/4 v5, 0x0
/* move-object v0, v6 */
/* move v1, v5 */
/* move-object v2, v12 */
/* move v3, v7 */
/* move/from16 v4, p2 */
java.lang.System .arraycopy ( v0,v1,v2,v3,v4 );
} // :goto_0
return;
} // :cond_0
int v10 = 1; // const/4 v10, 0x1
/* move/from16 v0, p2 */
/* move v1, v10 */
/* if-ne v0, v1, :cond_1 */
java.lang.System .arraycopy ( v12,v8,v12,v7,v9 );
/* add-int v5, v7, v9 */
int v7 = 0; // const/4 v7, 0x0
/* aget-object v6, v6, v7 */
/* aput-object v6, v12, v5 */
} // :cond_1
/* move-object/from16 v0, p0 */
v0 = this.c;
/* move-object v10, v0 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/badlogic/gdx/utils/TimSort;->minGallop:I */
/* move v11, v0 */
/* move/from16 v13, p2 */
/* move/from16 v19, v8 */
/* move v8, v5 */
/* move v5, v7 */
/* move/from16 v7, v19 */
} // :goto_1
int v14 = 0; // const/4 v14, 0x0
int v15 = 0; // const/4 v15, 0x0
/* move/from16 v19, v15 */
/* move v15, v13 */
/* move v13, v8 */
/* move v8, v5 */
/* move/from16 v5, v19 */
/* move/from16 v20, v14 */
/* move v14, v9 */
/* move v9, v7 */
/* move/from16 v7, v20 */
} // :cond_2
/* aget-object v16, v12, v9 */
/* aget-object v17, v6, v13 */
/* move-object v0, v10 */
/* move-object/from16 v1, v16 */
v16 = /* move-object/from16 v2, v17 */
/* if-gez v16, :cond_4 */
/* add-int/lit8 v7, v8, 0x1 */
/* add-int/lit8 v16, v9, 0x1 */
/* aget-object v9, v12, v9 */
/* aput-object v9, v12, v8 */
/* add-int/lit8 v5, v5, 0x1 */
int v8 = 0; // const/4 v8, 0x0
/* add-int/lit8 v9, v14, -0x1 */
/* if-nez v9, :cond_12 */
/* move v5, v7 */
/* move v8, v13 */
/* move v10, v11 */
/* move/from16 v7, v16 */
/* move v11, v15 */
} // :goto_2
/* if-gtz v10, :cond_3 */
int v10 = 1; // const/4 v10, 0x1
} // :cond_3
/* move v0, v10 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/badlogic/gdx/utils/TimSort;->minGallop:I */
int v10 = 1; // const/4 v10, 0x1
/* if-ne v11, v10, :cond_7 */
java.lang.System .arraycopy ( v12,v7,v12,v5,v9 );
/* add-int/2addr v5, v9 */
/* aget-object v6, v6, v8 */
/* aput-object v6, v12, v5 */
} // :cond_4
/* add-int/lit8 v5, v8, 0x1 */
/* add-int/lit8 v16, v13, 0x1 */
/* aget-object v13, v6, v13 */
/* aput-object v13, v12, v8 */
/* add-int/lit8 v7, v7, 0x1 */
int v8 = 0; // const/4 v8, 0x0
/* add-int/lit8 v13, v15, -0x1 */
int v15 = 1; // const/4 v15, 0x1
/* if-eq v13, v15, :cond_11 */
/* move v15, v13 */
/* move/from16 v13, v16 */
/* move/from16 v19, v5 */
/* move v5, v8 */
/* move/from16 v8, v19 */
} // :goto_3
/* or-int v16, v7, v5 */
/* move/from16 v0, v16 */
/* move v1, v11 */
/* if-lt v0, v1, :cond_2 */
/* move v7, v13 */
/* move/from16 v17, v11 */
/* move v11, v8 */
/* move v8, v15 */
/* move v15, v14 */
/* move v14, v9 */
} // :goto_4
/* aget-object v5, v12, v14 */
int v9 = 0; // const/4 v9, 0x0
v5 = /* invoke-static/range {v5 ..v10}, Lcom/badlogic/gdx/utils/TimSort;->gallopRight(Ljava/lang/Object;[Ljava/lang/Object;IIILjava/util/Comparator;)I */
if ( v5 != null) { // if-eqz v5, :cond_10
java.lang.System .arraycopy ( v6,v7,v12,v11,v5 );
/* add-int v9, v11, v5 */
/* add-int/2addr v7, v5 */
/* sub-int/2addr v8, v5 */
int v11 = 1; // const/4 v11, 0x1
/* if-le v8, v11, :cond_f */
/* move/from16 v19, v9 */
/* move v9, v8 */
/* move v8, v7 */
/* move/from16 v7, v19 */
} // :goto_5
/* add-int/lit8 v18, v7, 0x1 */
/* add-int/lit8 v13, v14, 0x1 */
/* aget-object v11, v12, v14 */
/* aput-object v11, v12, v7 */
/* add-int/lit8 v14, v15, -0x1 */
if ( v14 != null) { // if-eqz v14, :cond_e
/* aget-object v11, v6, v8 */
int v15 = 0; // const/4 v15, 0x0
/* move-object/from16 v16, v10 */
v7 = /* invoke-static/range {v11 ..v16}, Lcom/badlogic/gdx/utils/TimSort;->gallopLeft(Ljava/lang/Object;[Ljava/lang/Object;IIILjava/util/Comparator;)I */
if ( v7 != null) { // if-eqz v7, :cond_d
/* move-object v0, v12 */
/* move v1, v13 */
/* move-object v2, v12 */
/* move/from16 v3, v18 */
/* move v4, v7 */
java.lang.System .arraycopy ( v0,v1,v2,v3,v4 );
/* add-int v11, v18, v7 */
/* add-int/2addr v13, v7 */
/* sub-int/2addr v14, v7 */
if ( v14 != null) { // if-eqz v14, :cond_c
} // :goto_6
/* add-int/lit8 v15, v11, 0x1 */
/* add-int/lit8 v16, v8, 0x1 */
/* aget-object v8, v6, v8 */
/* aput-object v8, v12, v11 */
/* add-int/lit8 v8, v9, -0x1 */
int v9 = 1; // const/4 v9, 0x1
/* if-eq v8, v9, :cond_b */
/* add-int/lit8 v9, v17, -0x1 */
int v11 = 7; // const/4 v11, 0x7
/* if-lt v5, v11, :cond_5 */
int v5 = 1; // const/4 v5, 0x1
} // :goto_7
int v11 = 7; // const/4 v11, 0x7
/* if-lt v7, v11, :cond_6 */
int v7 = 1; // const/4 v7, 0x1
} // :goto_8
/* or-int/2addr v5, v7 */
/* if-nez v5, :cond_a */
/* if-gez v9, :cond_9 */
int v5 = 0; // const/4 v5, 0x0
} // :goto_9
/* add-int/lit8 v5, v5, 0x2 */
/* move v7, v13 */
/* move v9, v14 */
/* move v11, v5 */
/* move v5, v15 */
/* move v13, v8 */
/* move/from16 v8, v16 */
/* goto/16 :goto_1 */
} // :cond_5
int v5 = 0; // const/4 v5, 0x0
} // :cond_6
int v7 = 0; // const/4 v7, 0x0
} // :cond_7
/* if-nez v11, :cond_8 */
/* new-instance v5, Ljava/lang/IllegalArgumentException; */
final String v6 = "Comparison method violates its general contract!"; // const-string v6, "Comparison method violates its general contract!"
/* invoke-direct {v5, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v5 */
} // :cond_8
java.lang.System .arraycopy ( v6,v8,v12,v5,v11 );
/* goto/16 :goto_0 */
} // :cond_9
/* move v5, v9 */
} // :cond_a
/* move v11, v15 */
/* move/from16 v7, v16 */
/* move/from16 v17, v9 */
/* move v15, v14 */
/* move v14, v13 */
/* goto/16 :goto_4 */
} // :cond_b
/* move v5, v15 */
/* move v7, v13 */
/* move v9, v14 */
/* move/from16 v10, v17 */
/* move v11, v8 */
/* move/from16 v8, v16 */
/* goto/16 :goto_2 */
} // :cond_c
/* move v5, v11 */
/* move v7, v13 */
/* move/from16 v10, v17 */
/* move v11, v9 */
/* move v9, v14 */
/* goto/16 :goto_2 */
} // :cond_d
/* move/from16 v11, v18 */
} // :cond_e
/* move/from16 v5, v18 */
/* move v7, v13 */
/* move/from16 v10, v17 */
/* move v11, v9 */
/* move v9, v14 */
/* goto/16 :goto_2 */
} // :cond_f
/* move v5, v9 */
/* move/from16 v10, v17 */
/* move v11, v8 */
/* move v9, v15 */
/* move v8, v7 */
/* move v7, v14 */
/* goto/16 :goto_2 */
} // :cond_10
/* move v9, v8 */
/* move v8, v7 */
/* move v7, v11 */
/* goto/16 :goto_5 */
} // :cond_11
/* move v7, v9 */
/* move/from16 v8, v16 */
/* move v10, v11 */
/* move v9, v14 */
/* move v11, v13 */
/* goto/16 :goto_2 */
} // :cond_12
/* move v14, v9 */
/* move/from16 v9, v16 */
/* move/from16 v19, v7 */
/* move v7, v8 */
/* move/from16 v8, v19 */
/* goto/16 :goto_3 */
} // .end method
private static Integer minRunLength ( Integer p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* move v1, p0 */
} // :goto_0
/* const/16 v2, 0x20 */
/* if-lt v1, v2, :cond_0 */
/* and-int/lit8 v2, v1, 0x1 */
/* or-int/2addr v0, v2 */
/* shr-int/lit8 v1, v1, 0x1 */
} // :cond_0
/* add-int/2addr v0, v1 */
} // .end method
private void pushRun ( Integer p0, Integer p1 ) {
/* .locals 2 */
v0 = this.runBase;
/* iget v1, p0, Lcom/badlogic/gdx/utils/TimSort;->stackSize:I */
/* aput p1, v0, v1 */
v0 = this.runLen;
/* iget v1, p0, Lcom/badlogic/gdx/utils/TimSort;->stackSize:I */
/* aput p2, v0, v1 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/TimSort;->stackSize:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lcom/badlogic/gdx/utils/TimSort;->stackSize:I */
return;
} // .end method
private static void rangeCheck ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 3 */
/* if-le p1, p2, :cond_0 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "fromIndex("; // const-string v2, "fromIndex("
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = ") > toIndex("; // const-string v2, ") > toIndex("
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = ")"; // const-string v2, ")"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
/* if-gez p1, :cond_1 */
/* new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException; */
/* invoke-direct {v0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(I)V */
/* throw v0 */
} // :cond_1
/* if-le p2, p0, :cond_2 */
/* new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException; */
/* invoke-direct {v0, p2}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(I)V */
/* throw v0 */
} // :cond_2
return;
} // .end method
private static void reverseRange ( java.lang.Object[] p0, Integer p1, Integer p2 ) {
/* .locals 5 */
/* add-int/lit8 v0, p2, -0x1 */
/* move v1, p1 */
} // :goto_0
/* if-ge v1, v0, :cond_0 */
/* aget-object v2, p0, v1 */
/* add-int/lit8 v3, v1, 0x1 */
/* aget-object v4, p0, v0 */
/* aput-object v4, p0, v1 */
/* add-int/lit8 v1, v0, -0x1 */
/* aput-object v2, p0, v0 */
/* move v0, v1 */
/* move v1, v3 */
} // :cond_0
return;
} // .end method
static void sort ( java.lang.Object[] p0, Integer p1, Integer p2, java.util.Comparator p3 ) {
/* .locals 7 */
/* if-nez p3, :cond_1 */
java.util.Arrays .sort ( p0,p1,p2 );
} // :cond_0
} // :goto_0
return;
} // :cond_1
/* array-length v0, p0 */
com.badlogic.gdx.utils.TimSort .rangeCheck ( v0,p1,p2 );
/* sub-int v0, p2, p1 */
int v1 = 2; // const/4 v1, 0x2
/* if-lt v0, v1, :cond_0 */
/* const/16 v1, 0x20 */
/* if-ge v0, v1, :cond_2 */
v0 = com.badlogic.gdx.utils.TimSort .countRunAndMakeAscending ( p0,p1,p2,p3 );
/* add-int/2addr v0, p1 */
com.badlogic.gdx.utils.TimSort .binarySort ( p0,p1,p2,v0,p3 );
} // :cond_2
/* new-instance v1, Lcom/badlogic/gdx/utils/TimSort; */
/* invoke-direct {v1, p0, p3}, Lcom/badlogic/gdx/utils/TimSort;-><init>([Ljava/lang/Object;Ljava/util/Comparator;)V */
v2 = com.badlogic.gdx.utils.TimSort .minRunLength ( v0 );
/* move v3, p1 */
} // :cond_3
v4 = com.badlogic.gdx.utils.TimSort .countRunAndMakeAscending ( p0,v3,p2,p3 );
/* if-ge v4, v2, :cond_4 */
/* if-gt v0, v2, :cond_5 */
/* move v5, v0 */
} // :goto_1
/* add-int v6, v3, v5 */
/* add-int/2addr v4, v3 */
com.badlogic.gdx.utils.TimSort .binarySort ( p0,v3,v6,v4,p3 );
/* move v4, v5 */
} // :cond_4
/* invoke-direct {v1, v3, v4}, Lcom/badlogic/gdx/utils/TimSort;->pushRun(II)V */
/* invoke-direct {v1}, Lcom/badlogic/gdx/utils/TimSort;->mergeCollapse()V */
/* add-int/2addr v3, v4 */
/* sub-int/2addr v0, v4 */
/* if-nez v0, :cond_3 */
/* invoke-direct {v1}, Lcom/badlogic/gdx/utils/TimSort;->mergeForceCollapse()V */
} // :cond_5
/* move v5, v2 */
} // .end method
static void sort ( java.lang.Object[] p0, java.util.Comparator p1 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* array-length v1, p0 */
com.badlogic.gdx.utils.TimSort .sort ( p0,v0,v1,p1 );
return;
} // .end method
/* # virtual methods */
public void doSort ( java.lang.Object[] p0, java.util.Comparator p1, Integer p2, Integer p3 ) {
/* .locals 6 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/badlogic/gdx/utils/TimSort;->stackSize:I */
/* array-length v0, p1 */
com.badlogic.gdx.utils.TimSort .rangeCheck ( v0,p3,p4 );
/* sub-int v0, p4, p3 */
int v1 = 2; // const/4 v1, 0x2
/* if-ge v0, v1, :cond_0 */
} // :goto_0
return;
} // :cond_0
/* const/16 v1, 0x20 */
/* if-ge v0, v1, :cond_1 */
v0 = com.badlogic.gdx.utils.TimSort .countRunAndMakeAscending ( p1,p3,p4,p2 );
/* add-int/2addr v0, p3 */
com.badlogic.gdx.utils.TimSort .binarySort ( p1,p3,p4,v0,p2 );
} // :cond_1
this.a = p1;
this.c = p2;
v1 = com.badlogic.gdx.utils.TimSort .minRunLength ( v0 );
/* move v2, p3 */
} // :cond_2
v3 = com.badlogic.gdx.utils.TimSort .countRunAndMakeAscending ( p1,v2,p4,p2 );
/* if-ge v3, v1, :cond_3 */
/* if-gt v0, v1, :cond_4 */
/* move v4, v0 */
} // :goto_1
/* add-int v5, v2, v4 */
/* add-int/2addr v3, v2 */
com.badlogic.gdx.utils.TimSort .binarySort ( p1,v2,v5,v3,p2 );
/* move v3, v4 */
} // :cond_3
/* invoke-direct {p0, v2, v3}, Lcom/badlogic/gdx/utils/TimSort;->pushRun(II)V */
/* invoke-direct {p0}, Lcom/badlogic/gdx/utils/TimSort;->mergeCollapse()V */
/* add-int/2addr v2, v3 */
/* sub-int/2addr v0, v3 */
/* if-nez v0, :cond_2 */
/* invoke-direct {p0}, Lcom/badlogic/gdx/utils/TimSort;->mergeForceCollapse()V */
} // :cond_4
/* move v4, v1 */
} // .end method

class com.badlogic.gdx.utils.ComparableTimSort {
	 /* # static fields */
	 private static final Boolean DEBUG;
	 private static final Integer INITIAL_TMP_STORAGE_LENGTH;
	 private static final Integer MIN_GALLOP;
	 private static final Integer MIN_MERGE;
	 /* # instance fields */
	 private java.lang.Object a;
	 private Integer minGallop;
	 private final runBase;
	 private final runLen;
	 private Integer stackSize;
	 private java.lang.Object tmp;
	 /* # direct methods */
	 com.badlogic.gdx.utils.ComparableTimSort ( ) {
		 /* .locals 2 */
		 /* const/16 v1, 0x28 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 7; // const/4 v0, 0x7
		 /* iput v0, p0, Lcom/badlogic/gdx/utils/ComparableTimSort;->minGallop:I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/badlogic/gdx/utils/ComparableTimSort;->stackSize:I */
		 /* const/16 v0, 0x100 */
		 /* new-array v0, v0, [Ljava/lang/Object; */
		 this.tmp = v0;
		 /* new-array v0, v1, [I */
		 this.runBase = v0;
		 /* new-array v0, v1, [I */
		 this.runLen = v0;
		 return;
	 } // .end method
	 private com.badlogic.gdx.utils.ComparableTimSort ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 7; // const/4 v0, 0x7
		 /* iput v0, p0, Lcom/badlogic/gdx/utils/ComparableTimSort;->minGallop:I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/badlogic/gdx/utils/ComparableTimSort;->stackSize:I */
		 this.a = p1;
		 /* array-length v0, p1 */
		 /* const/16 v1, 0x200 */
		 /* if-ge v0, v1, :cond_0 */
		 /* ushr-int/lit8 v1, v0, 0x1 */
	 } // :goto_0
	 /* new-array v1, v1, [Ljava/lang/Object; */
	 this.tmp = v1;
	 /* const/16 v1, 0x78 */
	 /* if-ge v0, v1, :cond_1 */
	 int v0 = 5; // const/4 v0, 0x5
} // :goto_1
/* new-array v1, v0, [I */
this.runBase = v1;
/* new-array v0, v0, [I */
this.runLen = v0;
return;
} // :cond_0
/* const/16 v1, 0x100 */
} // :cond_1
/* const/16 v1, 0x606 */
/* if-ge v0, v1, :cond_2 */
/* const/16 v0, 0xa */
} // :cond_2
/* const v1, 0x1d16f */
/* if-ge v0, v1, :cond_3 */
/* const/16 v0, 0x13 */
} // :cond_3
/* const/16 v0, 0x28 */
} // .end method
private static void binarySort ( java.lang.Object[] p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 6 */
/* if-ne p3, p1, :cond_3 */
/* add-int/lit8 v0, p3, 0x1 */
/* move v1, v0 */
} // :goto_0
/* if-ge v1, p2, :cond_2 */
/* aget-object v0, p0, v1 */
/* check-cast v0, Ljava/lang/Comparable; */
/* move v2, v1 */
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
/* sub-int v2, v1, v3 */
/* packed-switch v2, :pswitch_data_0 */
/* add-int/lit8 v4, v3, 0x1 */
java.lang.System .arraycopy ( p0,v3,p0,v4,v2 );
} // :goto_2
/* aput-object v0, p0, v3 */
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
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
/* move v1, p3 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
private static Integer countRunAndMakeAscending ( java.lang.Object[] p0, Integer p1, Integer p2 ) {
/* .locals 4 */
int v3 = 1; // const/4 v3, 0x1
/* add-int/lit8 v0, p1, 0x1 */
/* if-ne v0, p2, :cond_0 */
/* move v0, v3 */
} // :goto_0
} // :cond_0
/* add-int/lit8 v1, v0, 0x1 */
/* aget-object v0, p0, v0 */
/* check-cast v0, Ljava/lang/Comparable; */
v0 = /* aget-object v2, p0, p1 */
/* if-gez v0, :cond_2 */
} // :goto_1
/* if-ge v1, p2, :cond_1 */
/* aget-object v0, p0, v1 */
/* check-cast v0, Ljava/lang/Comparable; */
/* sub-int v2, v1, v3 */
v0 = /* aget-object v2, p0, v2 */
/* if-gez v0, :cond_1 */
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
} // :cond_1
com.badlogic.gdx.utils.ComparableTimSort .reverseRange ( p0,p1,v1 );
/* move v0, v1 */
} // :goto_2
/* sub-int/2addr v0, p1 */
} // :cond_2
} // :goto_3
/* if-ge v1, p2, :cond_3 */
/* aget-object v0, p0, v1 */
/* check-cast v0, Ljava/lang/Comparable; */
/* sub-int v2, v1, v3 */
v0 = /* aget-object v2, p0, v2 */
/* if-ltz v0, :cond_3 */
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
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
this.tmp = v0;
} // :cond_0
v0 = this.tmp;
} // :cond_1
v1 = this.a;
/* array-length v1, v1 */
/* ushr-int/lit8 v1, v1, 0x1 */
v0 = java.lang.Math .min ( v0,v1 );
} // .end method
private static Integer gallopLeft ( java.lang.Comparable p0, java.lang.Object[] p1, Integer p2, Integer p3, Integer p4 ) {
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
private static Integer gallopRight ( java.lang.Comparable p0, java.lang.Object[] p1, Integer p2, Integer p3, Integer p4 ) {
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
/* .locals 9 */
int v8 = 1; // const/4 v8, 0x1
v0 = this.runBase;
/* aget v1, v0, p1 */
v0 = this.runLen;
/* aget v2, v0, p1 */
v0 = this.runBase;
/* add-int/lit8 v3, p1, 0x1 */
/* aget v3, v0, v3 */
v0 = this.runLen;
/* add-int/lit8 v4, p1, 0x1 */
/* aget v4, v0, v4 */
v0 = this.runLen;
/* add-int v5, v2, v4 */
/* aput v5, v0, p1 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/ComparableTimSort;->stackSize:I */
int v5 = 3; // const/4 v5, 0x3
/* sub-int/2addr v0, v5 */
/* if-ne p1, v0, :cond_0 */
v0 = this.runBase;
/* add-int/lit8 v5, p1, 0x1 */
v6 = this.runBase;
/* add-int/lit8 v7, p1, 0x2 */
/* aget v6, v6, v7 */
/* aput v6, v0, v5 */
v0 = this.runLen;
/* add-int/lit8 v5, p1, 0x1 */
v6 = this.runLen;
/* add-int/lit8 v7, p1, 0x2 */
/* aget v6, v6, v7 */
/* aput v6, v0, v5 */
} // :cond_0
/* iget v0, p0, Lcom/badlogic/gdx/utils/ComparableTimSort;->stackSize:I */
/* sub-int/2addr v0, v8 */
/* iput v0, p0, Lcom/badlogic/gdx/utils/ComparableTimSort;->stackSize:I */
v0 = this.a;
/* aget-object v0, v0, v3 */
/* check-cast v0, Ljava/lang/Comparable; */
v5 = this.a;
int v6 = 0; // const/4 v6, 0x0
v0 = com.badlogic.gdx.utils.ComparableTimSort .gallopRight ( v0,v5,v1,v2,v6 );
/* add-int/2addr v1, v0 */
/* sub-int/2addr v2, v0 */
/* if-nez v2, :cond_2 */
} // :cond_1
} // :goto_0
return;
} // :cond_2
v0 = this.a;
/* add-int v5, v1, v2 */
/* sub-int/2addr v5, v8 */
/* aget-object v0, v0, v5 */
/* check-cast v0, Ljava/lang/Comparable; */
v5 = this.a;
/* sub-int v6, v4, v8 */
v0 = com.badlogic.gdx.utils.ComparableTimSort .gallopLeft ( v0,v5,v3,v4,v6 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* if-gt v2, v0, :cond_3 */
/* invoke-direct {p0, v1, v2, v3, v0}, Lcom/badlogic/gdx/utils/ComparableTimSort;->mergeLo(IIII)V */
} // :cond_3
/* invoke-direct {p0, v1, v2, v3, v0}, Lcom/badlogic/gdx/utils/ComparableTimSort;->mergeHi(IIII)V */
} // .end method
private void mergeCollapse ( ) {
/* .locals 6 */
int v5 = 1; // const/4 v5, 0x1
} // :goto_0
/* iget v0, p0, Lcom/badlogic/gdx/utils/ComparableTimSort;->stackSize:I */
/* if-le v0, v5, :cond_2 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/ComparableTimSort;->stackSize:I */
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
/* invoke-direct {p0, v0}, Lcom/badlogic/gdx/utils/ComparableTimSort;->mergeAt(I)V */
} // :cond_1
v1 = this.runLen;
/* aget v1, v1, v0 */
v2 = this.runLen;
/* add-int/lit8 v3, v0, 0x1 */
/* aget v2, v2, v3 */
/* if-gt v1, v2, :cond_2 */
/* invoke-direct {p0, v0}, Lcom/badlogic/gdx/utils/ComparableTimSort;->mergeAt(I)V */
} // :cond_2
return;
} // .end method
private void mergeForceCollapse ( ) {
/* .locals 5 */
int v4 = 1; // const/4 v4, 0x1
} // :goto_0
/* iget v0, p0, Lcom/badlogic/gdx/utils/ComparableTimSort;->stackSize:I */
/* if-le v0, v4, :cond_1 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/ComparableTimSort;->stackSize:I */
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
/* invoke-direct {p0, v0}, Lcom/badlogic/gdx/utils/ComparableTimSort;->mergeAt(I)V */
} // :cond_1
return;
} // .end method
private void mergeHi ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 19 */
/* move-object/from16 v0, p0 */
v0 = this.a;
/* move-object v5, v0 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, p4 */
/* invoke-direct {v0, v1}, Lcom/badlogic/gdx/utils/ComparableTimSort;->ensureCapacity(I)[Ljava/lang/Object; */
int v7 = 0; // const/4 v7, 0x0
/* move-object v0, v5 */
/* move/from16 v1, p3 */
/* move-object v2, v6 */
/* move v3, v7 */
/* move/from16 v4, p4 */
java.lang.System .arraycopy ( v0,v1,v2,v3,v4 );
/* add-int v7, p1, p2 */
int v8 = 1; // const/4 v8, 0x1
/* sub-int/2addr v7, v8 */
int v8 = 1; // const/4 v8, 0x1
/* sub-int v8, p4, v8 */
/* add-int v9, p3, p4 */
int v10 = 1; // const/4 v10, 0x1
/* sub-int/2addr v9, v10 */
/* add-int/lit8 v10, v9, -0x1 */
/* add-int/lit8 v11, v7, -0x1 */
/* aget-object v7, v5, v7 */
/* aput-object v7, v5, v9 */
/* add-int/lit8 v7, p2, -0x1 */
/* if-nez v7, :cond_0 */
int v7 = 0; // const/4 v7, 0x0
/* sub-int v8, v10, v8 */
/* move-object v0, v6 */
/* move v1, v7 */
/* move-object v2, v5 */
/* move v3, v8 */
/* move/from16 v4, p4 */
java.lang.System .arraycopy ( v0,v1,v2,v3,v4 );
} // :goto_0
return;
} // :cond_0
int v9 = 1; // const/4 v9, 0x1
/* move/from16 v0, p4 */
/* move v1, v9 */
/* if-ne v0, v1, :cond_1 */
/* sub-int v9, v10, v7 */
/* sub-int v10, v11, v7 */
/* add-int/lit8 v10, v10, 0x1 */
/* add-int/lit8 v11, v9, 0x1 */
java.lang.System .arraycopy ( v5,v10,v5,v11,v7 );
/* aget-object v6, v6, v8 */
/* aput-object v6, v5, v9 */
} // :cond_1
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lcom/badlogic/gdx/utils/ComparableTimSort;->minGallop:I */
/* move v9, v0 */
/* move v12, v7 */
/* move v7, v9 */
/* move v9, v11 */
/* move v11, v10 */
/* move/from16 v10, p4 */
} // :goto_1
int v13 = 0; // const/4 v13, 0x0
int v14 = 0; // const/4 v14, 0x0
/* move/from16 v17, v14 */
/* move v14, v12 */
/* move v12, v10 */
/* move v10, v8 */
/* move/from16 v8, v17 */
/* move/from16 v18, v13 */
/* move v13, v11 */
/* move v11, v9 */
/* move/from16 v9, v18 */
} // :cond_2
/* aget-object p2, v6, v10 */
/* check-cast p2, Ljava/lang/Comparable; */
/* aget-object v15, v5, v11 */
/* move-object/from16 v0, p2 */
v15 = /* move-object v1, v15 */
/* if-gez v15, :cond_5 */
/* add-int/lit8 v8, v13, -0x1 */
/* add-int/lit8 v15, v11, -0x1 */
/* aget-object v11, v5, v11 */
/* aput-object v11, v5, v13 */
/* add-int/lit8 v9, v9, 0x1 */
int v11 = 0; // const/4 v11, 0x0
/* add-int/lit8 v13, v14, -0x1 */
/* if-nez v13, :cond_12 */
/* move v9, v15 */
/* move v11, v8 */
/* move v8, v10 */
/* move v10, v12 */
/* move v12, v13 */
} // :cond_3
} // :goto_2
/* if-gtz v7, :cond_4 */
int v7 = 1; // const/4 v7, 0x1
} // :cond_4
/* move v0, v7 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/badlogic/gdx/utils/ComparableTimSort;->minGallop:I */
int v7 = 1; // const/4 v7, 0x1
/* if-ne v10, v7, :cond_a */
/* sub-int v7, v11, v12 */
/* sub-int/2addr v9, v12 */
/* add-int/lit8 v9, v9, 0x1 */
/* add-int/lit8 v10, v7, 0x1 */
java.lang.System .arraycopy ( v5,v9,v5,v10,v12 );
/* aget-object v6, v6, v8 */
/* aput-object v6, v5, v7 */
} // :cond_5
/* add-int/lit8 v9, v13, -0x1 */
/* add-int/lit8 v15, v10, -0x1 */
/* aget-object v10, v6, v10 */
/* aput-object v10, v5, v13 */
/* add-int/lit8 v8, v8, 0x1 */
int v10 = 0; // const/4 v10, 0x0
/* add-int/lit8 v12, v12, -0x1 */
int v13 = 1; // const/4 v13, 0x1
/* if-eq v12, v13, :cond_11 */
/* move v13, v9 */
/* move v9, v10 */
/* move v10, v15 */
} // :goto_3
/* or-int v15, v9, v8 */
/* if-lt v15, v7, :cond_2 */
/* move v8, v10 */
/* move v9, v11 */
/* move v10, v12 */
/* move v11, v13 */
/* move v12, v14 */
} // :goto_4
/* aget-object p2, v6, v8 */
/* check-cast p2, Ljava/lang/Comparable; */
int v13 = 1; // const/4 v13, 0x1
/* sub-int v13, v12, v13 */
/* move-object/from16 v0, p2 */
/* move-object v1, v5 */
/* move/from16 v2, p1 */
/* move v3, v12 */
/* move v4, v13 */
v13 = com.badlogic.gdx.utils.ComparableTimSort .gallopRight ( v0,v1,v2,v3,v4 );
/* sub-int v13, v12, v13 */
if ( v13 != null) { // if-eqz v13, :cond_6
/* sub-int/2addr v11, v13 */
/* sub-int/2addr v9, v13 */
/* sub-int/2addr v12, v13 */
/* add-int/lit8 v14, v9, 0x1 */
/* add-int/lit8 v15, v11, 0x1 */
java.lang.System .arraycopy ( v5,v14,v5,v15,v13 );
if ( v12 != null) { // if-eqz v12, :cond_3
} // :cond_6
/* add-int/lit8 v14, v11, -0x1 */
/* add-int/lit8 v15, v8, -0x1 */
/* aget-object v8, v6, v8 */
/* aput-object v8, v5, v11 */
/* add-int/lit8 v8, v10, -0x1 */
int v10 = 1; // const/4 v10, 0x1
/* if-eq v8, v10, :cond_10 */
/* aget-object p2, v5, v9 */
/* check-cast p2, Ljava/lang/Comparable; */
int v10 = 0; // const/4 v10, 0x0
int v11 = 1; // const/4 v11, 0x1
/* sub-int v11, v8, v11 */
/* move-object/from16 v0, p2 */
/* move-object v1, v6 */
/* move v2, v10 */
/* move v3, v8 */
/* move v4, v11 */
v10 = com.badlogic.gdx.utils.ComparableTimSort .gallopLeft ( v0,v1,v2,v3,v4 );
/* sub-int v10, v8, v10 */
if ( v10 != null) { // if-eqz v10, :cond_f
/* sub-int v11, v14, v10 */
/* sub-int v14, v15, v10 */
/* sub-int/2addr v8, v10 */
/* add-int/lit8 v15, v14, 0x1 */
/* add-int/lit8 v16, v11, 0x1 */
/* move-object v0, v6 */
/* move v1, v15 */
/* move-object v2, v5 */
/* move/from16 v3, v16 */
/* move v4, v10 */
java.lang.System .arraycopy ( v0,v1,v2,v3,v4 );
int v15 = 1; // const/4 v15, 0x1
/* if-le v8, v15, :cond_e */
/* move/from16 v17, v14 */
/* move v14, v11 */
/* move v11, v8 */
/* move/from16 v8, v17 */
} // :goto_5
/* add-int/lit8 v15, v14, -0x1 */
/* add-int/lit8 v16, v9, -0x1 */
/* aget-object v9, v5, v9 */
/* aput-object v9, v5, v14 */
/* add-int/lit8 v9, v12, -0x1 */
if ( v9 != null) { // if-eqz v9, :cond_d
/* add-int/lit8 v7, v7, -0x1 */
int v12 = 7; // const/4 v12, 0x7
/* if-lt v13, v12, :cond_8 */
int v12 = 1; // const/4 v12, 0x1
} // :goto_6
int v13 = 7; // const/4 v13, 0x7
/* if-lt v10, v13, :cond_9 */
int v10 = 1; // const/4 v10, 0x1
} // :goto_7
/* or-int/2addr v10, v12 */
/* if-nez v10, :cond_c */
/* if-gez v7, :cond_7 */
int v7 = 0; // const/4 v7, 0x0
} // :cond_7
/* add-int/lit8 v7, v7, 0x2 */
/* move v10, v11 */
/* move v12, v9 */
/* move v11, v15 */
/* move/from16 v9, v16 */
/* goto/16 :goto_1 */
} // :cond_8
int v12 = 0; // const/4 v12, 0x0
} // :cond_9
int v10 = 0; // const/4 v10, 0x0
} // :cond_a
/* if-nez v10, :cond_b */
/* new-instance v5, Ljava/lang/IllegalArgumentException; */
final String v6 = "Comparison method violates its general contract!"; // const-string v6, "Comparison method violates its general contract!"
/* invoke-direct {v5, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v5 */
} // :cond_b
int v7 = 0; // const/4 v7, 0x0
int v8 = 1; // const/4 v8, 0x1
/* sub-int v8, v10, v8 */
/* sub-int v8, v11, v8 */
java.lang.System .arraycopy ( v6,v7,v5,v8,v10 );
/* goto/16 :goto_0 */
} // :cond_c
/* move v10, v11 */
/* move v12, v9 */
/* move v11, v15 */
/* move/from16 v9, v16 */
/* goto/16 :goto_4 */
} // :cond_d
/* move v10, v11 */
/* move v12, v9 */
/* move v11, v15 */
/* move/from16 v9, v16 */
/* goto/16 :goto_2 */
} // :cond_e
/* move v10, v8 */
/* move v8, v14 */
/* goto/16 :goto_2 */
} // :cond_f
/* move v11, v8 */
/* move v8, v15 */
} // :cond_10
/* move v10, v8 */
/* move v11, v14 */
/* move v8, v15 */
/* goto/16 :goto_2 */
} // :cond_11
/* move v8, v15 */
/* move v10, v12 */
/* move v12, v14 */
/* move/from16 v17, v9 */
/* move v9, v11 */
/* move/from16 v11, v17 */
/* goto/16 :goto_2 */
} // :cond_12
/* move v14, v13 */
/* move v13, v8 */
/* move v8, v11 */
/* move v11, v15 */
/* goto/16 :goto_3 */
} // .end method
private void mergeLo ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 13 */
v0 = this.a;
/* invoke-direct {p0, p2}, Lcom/badlogic/gdx/utils/ComparableTimSort;->ensureCapacity(I)[Ljava/lang/Object; */
int v2 = 0; // const/4 v2, 0x0
java.lang.System .arraycopy ( v0,p1,v1,v2,p2 );
int v2 = 0; // const/4 v2, 0x0
/* add-int/lit8 v3, p1, 0x1 */
/* add-int/lit8 v4, p3, 0x1 */
/* aget-object v5, v0, p3 */
/* aput-object v5, v0, p1 */
/* add-int/lit8 v5, p4, -0x1 */
/* if-nez v5, :cond_0 */
int v2 = 0; // const/4 v2, 0x0
java.lang.System .arraycopy ( v1,v2,v0,v3,p2 );
} // :goto_0
return;
} // :cond_0
int v6 = 1; // const/4 v6, 0x1
/* if-ne p2, v6, :cond_1 */
java.lang.System .arraycopy ( v0,v4,v0,v3,v5 );
/* add-int v2, v3, v5 */
int v3 = 0; // const/4 v3, 0x0
/* aget-object v1, v1, v3 */
/* aput-object v1, v0, v2 */
} // :cond_1
/* iget v6, p0, Lcom/badlogic/gdx/utils/ComparableTimSort;->minGallop:I */
/* move v7, v6 */
/* move v6, p2 */
/* move v12, v2 */
/* move v2, v3 */
/* move v3, v4 */
/* move v4, v12 */
} // :goto_1
int v8 = 0; // const/4 v8, 0x0
int v9 = 0; // const/4 v9, 0x0
/* move v12, v9 */
/* move v9, v6 */
/* move v6, v5 */
/* move v5, v4 */
/* move v4, v3 */
/* move v3, v2 */
/* move v2, v12 */
} // :cond_2
/* aget-object p1, v0, v4 */
/* check-cast p1, Ljava/lang/Comparable; */
v10 = /* aget-object v10, v1, v5 */
/* if-gez v10, :cond_5 */
/* add-int/lit8 v8, v3, 0x1 */
/* add-int/lit8 v10, v4, 0x1 */
/* aget-object v4, v0, v4 */
/* aput-object v4, v0, v3 */
/* add-int/lit8 v2, v2, 0x1 */
int v3 = 0; // const/4 v3, 0x0
/* add-int/lit8 v4, v6, -0x1 */
/* if-nez v4, :cond_12 */
/* move v2, v8 */
/* move v3, v10 */
/* move v6, v9 */
/* move v12, v4 */
/* move v4, v5 */
/* move v5, v12 */
} // :cond_3
} // :goto_2
/* if-gtz v7, :cond_4 */
int v7 = 1; // const/4 v7, 0x1
} // :cond_4
/* iput v7, p0, Lcom/badlogic/gdx/utils/ComparableTimSort;->minGallop:I */
int v7 = 1; // const/4 v7, 0x1
/* if-ne v6, v7, :cond_9 */
java.lang.System .arraycopy ( v0,v3,v0,v2,v5 );
/* add-int/2addr v2, v5 */
/* aget-object v1, v1, v4 */
/* aput-object v1, v0, v2 */
} // :cond_5
/* add-int/lit8 v2, v3, 0x1 */
/* add-int/lit8 v10, v5, 0x1 */
/* aget-object v5, v1, v5 */
/* aput-object v5, v0, v3 */
/* add-int/lit8 v3, v8, 0x1 */
int v5 = 0; // const/4 v5, 0x0
/* add-int/lit8 v8, v9, -0x1 */
int v9 = 1; // const/4 v9, 0x1
/* if-eq v8, v9, :cond_11 */
/* move v9, v8 */
/* move v8, v3 */
/* move v3, v2 */
/* move v2, v5 */
/* move v5, v10 */
} // :goto_3
/* or-int v10, v8, v2 */
/* if-lt v10, v7, :cond_2 */
/* move v2, v3 */
/* move v3, v4 */
/* move v4, v5 */
/* move v5, v6 */
/* move v6, v9 */
} // :goto_4
/* aget-object p1, v0, v3 */
/* check-cast p1, Ljava/lang/Comparable; */
int v8 = 0; // const/4 v8, 0x0
v8 = com.badlogic.gdx.utils.ComparableTimSort .gallopRight ( p1,v1,v4,v6,v8 );
if ( v8 != null) { // if-eqz v8, :cond_6
java.lang.System .arraycopy ( v1,v4,v0,v2,v8 );
/* add-int/2addr v2, v8 */
/* add-int/2addr v4, v8 */
/* sub-int/2addr v6, v8 */
int v9 = 1; // const/4 v9, 0x1
/* if-le v6, v9, :cond_3 */
} // :cond_6
/* add-int/lit8 v9, v2, 0x1 */
/* add-int/lit8 v10, v3, 0x1 */
/* aget-object v3, v0, v3 */
/* aput-object v3, v0, v2 */
/* add-int/lit8 v2, v5, -0x1 */
if ( v2 != null) { // if-eqz v2, :cond_10
/* aget-object p1, v1, v4 */
/* check-cast p1, Ljava/lang/Comparable; */
int v3 = 0; // const/4 v3, 0x0
v3 = com.badlogic.gdx.utils.ComparableTimSort .gallopLeft ( p1,v0,v10,v2,v3 );
if ( v3 != null) { // if-eqz v3, :cond_f
java.lang.System .arraycopy ( v0,v10,v0,v9,v3 );
/* add-int v5, v9, v3 */
/* add-int v9, v10, v3 */
/* sub-int/2addr v2, v3 */
if ( v2 != null) { // if-eqz v2, :cond_e
/* move v12, v5 */
/* move v5, v9 */
/* move v9, v2 */
/* move v2, v12 */
} // :goto_5
/* add-int/lit8 v10, v2, 0x1 */
/* add-int/lit8 v11, v4, 0x1 */
/* aget-object v4, v1, v4 */
/* aput-object v4, v0, v2 */
/* add-int/lit8 v2, v6, -0x1 */
int v4 = 1; // const/4 v4, 0x1
/* if-eq v2, v4, :cond_d */
/* add-int/lit8 v4, v7, -0x1 */
int v6 = 7; // const/4 v6, 0x7
/* if-lt v8, v6, :cond_7 */
int v6 = 1; // const/4 v6, 0x1
} // :goto_6
int v7 = 7; // const/4 v7, 0x7
/* if-lt v3, v7, :cond_8 */
int v3 = 1; // const/4 v3, 0x1
} // :goto_7
/* or-int/2addr v3, v6 */
/* if-nez v3, :cond_c */
/* if-gez v4, :cond_b */
int v3 = 0; // const/4 v3, 0x0
} // :goto_8
/* add-int/lit8 v3, v3, 0x2 */
/* move v4, v11 */
/* move v6, v2 */
/* move v7, v3 */
/* move v3, v5 */
/* move v2, v10 */
/* move v5, v9 */
/* goto/16 :goto_1 */
} // :cond_7
int v6 = 0; // const/4 v6, 0x0
} // :cond_8
int v3 = 0; // const/4 v3, 0x0
} // :cond_9
/* if-nez v6, :cond_a */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "Comparison method violates its general contract!"; // const-string v1, "Comparison method violates its general contract!"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_a
java.lang.System .arraycopy ( v1,v4,v0,v2,v6 );
/* goto/16 :goto_0 */
} // :cond_b
/* move v3, v4 */
} // :cond_c
/* move v3, v5 */
/* move v6, v2 */
/* move v7, v4 */
/* move v5, v9 */
/* move v2, v10 */
/* move v4, v11 */
} // :cond_d
/* move v3, v5 */
/* move v4, v11 */
/* move v6, v2 */
/* move v5, v9 */
/* move v2, v10 */
/* goto/16 :goto_2 */
} // :cond_e
/* move v3, v9 */
/* move v12, v5 */
/* move v5, v2 */
/* move v2, v12 */
/* goto/16 :goto_2 */
} // :cond_f
/* move v5, v10 */
/* move v12, v9 */
/* move v9, v2 */
/* move v2, v12 */
} // :cond_10
/* move v3, v10 */
/* move v5, v2 */
/* move v2, v9 */
/* goto/16 :goto_2 */
} // :cond_11
/* move v3, v4 */
/* move v5, v6 */
/* move v4, v10 */
/* move v6, v8 */
/* goto/16 :goto_2 */
} // :cond_12
/* move v6, v4 */
/* move v4, v10 */
/* move v12, v8 */
/* move v8, v3 */
/* move v3, v12 */
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
/* iget v1, p0, Lcom/badlogic/gdx/utils/ComparableTimSort;->stackSize:I */
/* aput p1, v0, v1 */
v0 = this.runLen;
/* iget v1, p0, Lcom/badlogic/gdx/utils/ComparableTimSort;->stackSize:I */
/* aput p2, v0, v1 */
/* iget v0, p0, Lcom/badlogic/gdx/utils/ComparableTimSort;->stackSize:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lcom/badlogic/gdx/utils/ComparableTimSort;->stackSize:I */
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
static void sort ( java.lang.Object[] p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* array-length v1, p0 */
com.badlogic.gdx.utils.ComparableTimSort .sort ( p0,v0,v1 );
return;
} // .end method
static void sort ( java.lang.Object[] p0, Integer p1, Integer p2 ) {
/* .locals 7 */
/* array-length v0, p0 */
com.badlogic.gdx.utils.ComparableTimSort .rangeCheck ( v0,p1,p2 );
/* sub-int v0, p2, p1 */
int v1 = 2; // const/4 v1, 0x2
/* if-ge v0, v1, :cond_0 */
} // :goto_0
return;
} // :cond_0
/* const/16 v1, 0x20 */
/* if-ge v0, v1, :cond_1 */
v0 = com.badlogic.gdx.utils.ComparableTimSort .countRunAndMakeAscending ( p0,p1,p2 );
/* add-int/2addr v0, p1 */
com.badlogic.gdx.utils.ComparableTimSort .binarySort ( p0,p1,p2,v0 );
} // :cond_1
/* new-instance v1, Lcom/badlogic/gdx/utils/ComparableTimSort; */
/* invoke-direct {v1, p0}, Lcom/badlogic/gdx/utils/ComparableTimSort;-><init>([Ljava/lang/Object;)V */
v2 = com.badlogic.gdx.utils.ComparableTimSort .minRunLength ( v0 );
/* move v3, p1 */
} // :cond_2
v4 = com.badlogic.gdx.utils.ComparableTimSort .countRunAndMakeAscending ( p0,v3,p2 );
/* if-ge v4, v2, :cond_3 */
/* if-gt v0, v2, :cond_4 */
/* move v5, v0 */
} // :goto_1
/* add-int v6, v3, v5 */
/* add-int/2addr v4, v3 */
com.badlogic.gdx.utils.ComparableTimSort .binarySort ( p0,v3,v6,v4 );
/* move v4, v5 */
} // :cond_3
/* invoke-direct {v1, v3, v4}, Lcom/badlogic/gdx/utils/ComparableTimSort;->pushRun(II)V */
/* invoke-direct {v1}, Lcom/badlogic/gdx/utils/ComparableTimSort;->mergeCollapse()V */
/* add-int/2addr v3, v4 */
/* sub-int/2addr v0, v4 */
/* if-nez v0, :cond_2 */
/* invoke-direct {v1}, Lcom/badlogic/gdx/utils/ComparableTimSort;->mergeForceCollapse()V */
} // :cond_4
/* move v5, v2 */
} // .end method
/* # virtual methods */
public void doSort ( java.lang.Object[] p0, Integer p1, Integer p2 ) {
/* .locals 6 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/badlogic/gdx/utils/ComparableTimSort;->stackSize:I */
/* array-length v0, p1 */
com.badlogic.gdx.utils.ComparableTimSort .rangeCheck ( v0,p2,p3 );
/* sub-int v0, p3, p2 */
int v1 = 2; // const/4 v1, 0x2
/* if-ge v0, v1, :cond_0 */
} // :goto_0
return;
} // :cond_0
/* const/16 v1, 0x20 */
/* if-ge v0, v1, :cond_1 */
v0 = com.badlogic.gdx.utils.ComparableTimSort .countRunAndMakeAscending ( p1,p2,p3 );
/* add-int/2addr v0, p2 */
com.badlogic.gdx.utils.ComparableTimSort .binarySort ( p1,p2,p3,v0 );
} // :cond_1
this.a = p1;
v1 = com.badlogic.gdx.utils.ComparableTimSort .minRunLength ( v0 );
/* move v2, p2 */
} // :cond_2
v3 = com.badlogic.gdx.utils.ComparableTimSort .countRunAndMakeAscending ( p1,v2,p3 );
/* if-ge v3, v1, :cond_3 */
/* if-gt v0, v1, :cond_4 */
/* move v4, v0 */
} // :goto_1
/* add-int v5, v2, v4 */
/* add-int/2addr v3, v2 */
com.badlogic.gdx.utils.ComparableTimSort .binarySort ( p1,v2,v5,v3 );
/* move v3, v4 */
} // :cond_3
/* invoke-direct {p0, v2, v3}, Lcom/badlogic/gdx/utils/ComparableTimSort;->pushRun(II)V */
/* invoke-direct {p0}, Lcom/badlogic/gdx/utils/ComparableTimSort;->mergeCollapse()V */
/* add-int/2addr v2, v3 */
/* sub-int/2addr v0, v3 */
/* if-nez v0, :cond_2 */
/* invoke-direct {p0}, Lcom/badlogic/gdx/utils/ComparableTimSort;->mergeForceCollapse()V */
} // :cond_4
/* move v4, v1 */
} // .end method

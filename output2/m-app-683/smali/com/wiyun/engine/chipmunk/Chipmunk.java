public class com.wiyun.engine.chipmunk.Chipmunk extends com.wiyun.engine.nodes.Node {
	 /* .source "Chipmunk.java" */
	 /* # static fields */
	 public static final Integer CP_ALL_LAYERS;
	 public static final Integer CP_NO_GROUP;
	 public static final Integer GRABABLE_MASK_BIT;
	 public static final Integer NOT_GRABABLE_MASK;
	 /* # direct methods */
	 protected com.wiyun.engine.chipmunk.Chipmunk ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 33 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* .line 34 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/chipmunk/Chipmunk;->nativeInit()V */
		 /* .line 35 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.chipmunk.Chipmunk ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 48 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
		 /* .line 49 */
		 return;
	 } // .end method
	 public static native void applyDampedSpring ( com.wiyun.engine.chipmunk.Body p0, com.wiyun.engine.chipmunk.Body p1, com.wiyun.engine.types.WYPoint p2, com.wiyun.engine.types.WYPoint p3, Float p4, Float p5, Float p6, Float p7 ) {
	 } // .end method
	 public static Float calculateMomentForCircle ( Float p0, Float p1, Float p2, com.wiyun.engine.types.WYPoint p3 ) {
		 /* .locals 3 */
		 /* .param p0, "mass" # F */
		 /* .param p1, "radiusInner" # F */
		 /* .param p2, "radiusOuter" # F */
		 /* .param p3, "offset" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .prologue */
		 /* .line 107 */
		 /* const/high16 v0, 0x3f000000 # 0.5f */
		 /* mul-float/2addr v0, p0 */
		 /* mul-float v1, p1, p1 */
		 /* mul-float v2, p2, p2 */
		 /* add-float/2addr v1, v2 */
		 /* mul-float/2addr v0, v1 */
		 v1 = 		 com.wiyun.engine.types.WYPoint .dot ( p3,p3 );
		 /* mul-float/2addr v1, p0 */
		 /* add-float/2addr v0, v1 */
	 } // .end method
	 public static Float calculateMomentForPoly ( Float p0, com.wiyun.engine.types.WYPoint[] p1, com.wiyun.engine.types.WYPoint p2 ) {
		 /* .locals 11 */
		 /* .param p0, "mass" # F */
		 /* .param p1, "verts" # [Lcom/wiyun/engine/types/WYPoint; */
		 /* .param p2, "offset" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .prologue */
		 /* .line 75 */
		 /* array-length v3, p1 */
		 /* .line 76 */
		 /* .local v3, "numVerts":I */
		 /* new-array v6, v3, [Lcom/wiyun/engine/types/WYPoint; */
		 /* .line 77 */
		 /* .local v6, "tVerts":[Lcom/wiyun/engine/types/WYPoint; */
		 int v2 = 0; // const/4 v2, 0x0
		 /* .local v2, "i":I */
	 } // :goto_0
	 /* if-lt v2, v3, :cond_0 */
	 /* .line 80 */
	 int v4 = 0; // const/4 v4, 0x0
	 /* .line 81 */
	 /* .local v4, "sum1":F */
	 int v5 = 0; // const/4 v5, 0x0
	 /* .line 82 */
	 /* .local v5, "sum2":F */
	 int v2 = 0; // const/4 v2, 0x0
} // :goto_1
/* if-lt v2, v3, :cond_1 */
/* .line 93 */
int v6 = 0; // const/4 v6, 0x0
/* check-cast v6, [Lcom/wiyun/engine/types/WYPoint; */
/* .line 94 */
/* mul-float v9, p0, v4 */
/* const/high16 v10, 0x40c00000 # 6.0f */
/* mul-float/2addr v10, v5 */
/* div-float/2addr v9, v10 */
/* .line 78 */
} // .end local v4 # "sum1":F
} // .end local v5 # "sum2":F
} // :cond_0
/* aget-object v9, p1, v2 */
com.wiyun.engine.types.WYPoint .add ( v9,p2 );
/* aput-object v9, v6, v2 */
/* .line 77 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 83 */
/* .restart local v4 # "sum1":F */
/* .restart local v5 # "sum2":F */
} // :cond_1
/* aget-object v7, v6, v2 */
/* .line 84 */
/* .local v7, "v1":Lcom/wiyun/engine/types/WYPoint; */
/* add-int/lit8 v9, v2, 0x1 */
/* rem-int/2addr v9, v3 */
/* aget-object v8, v6, v9 */
/* .line 86 */
/* .local v8, "v2":Lcom/wiyun/engine/types/WYPoint; */
v0 = com.wiyun.engine.types.WYPoint .cross ( v8,v7 );
/* .line 87 */
/* .local v0, "a":F */
v9 = com.wiyun.engine.types.WYPoint .dot ( v7,v7 );
v10 = com.wiyun.engine.types.WYPoint .dot ( v7,v8 );
/* add-float/2addr v9, v10 */
v10 = com.wiyun.engine.types.WYPoint .dot ( v8,v8 );
/* add-float v1, v9, v10 */
/* .line 89 */
/* .local v1, "b":F */
/* mul-float v9, v0, v1 */
/* add-float/2addr v4, v9 */
/* .line 90 */
/* add-float/2addr v5, v0 */
/* .line 82 */
/* add-int/lit8 v2, v2, 0x1 */
} // .end method
public static Float calculateMomentForSegment ( Float p0, com.wiyun.engine.types.WYPoint p1, com.wiyun.engine.types.WYPoint p2 ) {
/* .locals 4 */
/* .param p0, "mass" # F */
/* .param p1, "a" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p2, "b" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 119 */
com.wiyun.engine.types.WYPoint .sub ( p2,p1 );
v0 = com.wiyun.engine.types.WYPoint .length ( v2 );
/* .line 120 */
/* .local v0, "length":F */
com.wiyun.engine.types.WYPoint .add ( p1,p2 );
/* const/high16 v3, 0x3f000000 # 0.5f */
com.wiyun.engine.types.WYPoint .mul ( v2,v3 );
/* .line 122 */
/* .local v1, "offset":Lcom/wiyun/engine/types/WYPoint; */
/* mul-float v2, p0, v0 */
/* mul-float/2addr v2, v0 */
/* const/high16 v3, 0x41400000 # 12.0f */
/* div-float/2addr v2, v3 */
v3 = com.wiyun.engine.types.WYPoint .dot ( v1,v1 );
/* mul-float/2addr v3, p0 */
/* add-float/2addr v2, v3 */
} // .end method
public static com.wiyun.engine.chipmunk.Chipmunk from ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "pointer" # I */
/* .prologue */
/* .line 44 */
/* if-nez p0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/chipmunk/Chipmunk; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/chipmunk/Chipmunk;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.chipmunk.Chipmunk .from ( p0 );
} // .end method
public static com.wiyun.engine.chipmunk.Chipmunk make ( ) {
/* .locals 1 */
/* .prologue */
/* .line 27 */
/* new-instance v0, Lcom/wiyun/engine/chipmunk/Chipmunk; */
/* invoke-direct {v0}, Lcom/wiyun/engine/chipmunk/Chipmunk;-><init>()V */
} // .end method
private native Integer nativeGetSpace ( ) {
} // .end method
private native void nativeInit ( ) {
} // .end method
public static Float querySegmentHitDistance ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1, com.wiyun.engine.chipmunk.Space$SegmentQueryInfo p2 ) {
/* .locals 2 */
/* .param p0, "start" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p1, "end" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p2, "info" # Lcom/wiyun/engine/chipmunk/Space$SegmentQueryInfo; */
/* .prologue */
/* .line 138 */
v0 = com.wiyun.engine.types.WYPoint .distance ( p0,p1 );
/* iget v1, p2, Lcom/wiyun/engine/chipmunk/Space$SegmentQueryInfo;->distance:F */
/* mul-float/2addr v0, v1 */
} // .end method
public static com.wiyun.engine.types.WYPoint querySegmentHitPoint ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1, com.wiyun.engine.chipmunk.Space$SegmentQueryInfo p2 ) {
/* .locals 1 */
/* .param p0, "start" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p1, "end" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p2, "info" # Lcom/wiyun/engine/chipmunk/Space$SegmentQueryInfo; */
/* .prologue */
/* .line 134 */
/* iget v0, p2, Lcom/wiyun/engine/chipmunk/Space$SegmentQueryInfo;->distance:F */
com.wiyun.engine.types.WYPoint .lerp ( p0,p1,v0 );
} // .end method
/* # virtual methods */
protected void doNativeInit ( ) {
/* .locals 0 */
/* .prologue */
/* .line 53 */
return;
} // .end method
public com.wiyun.engine.chipmunk.Space getSpace ( ) {
/* .locals 1 */
/* .prologue */
/* .line 56 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/chipmunk/Chipmunk;->nativeGetSpace()I */
com.wiyun.engine.chipmunk.Space .from ( v0 );
} // .end method
public native void setDebugDraw ( Boolean p0 ) {
} // .end method

public class com.wiyun.engine.actions.grid.Lens3D extends com.wiyun.engine.actions.grid.Grid3DAction {
	 /* # direct methods */
	 private com.wiyun.engine.actions.grid.Lens3D ( ) {
		 /* .locals 11 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/grid/Grid3DAction;-><init>()V */
		 /* iget v2, p2, Lcom/wiyun/engine/types/WYGridSize;->x:I */
		 /* iget v3, p2, Lcom/wiyun/engine/types/WYGridSize;->y:I */
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v4, p3 */
		 /* move v5, p4 */
		 /* move/from16 v6, p5 */
		 /* move/from16 v7, p6 */
		 /* move/from16 v8, p7 */
		 /* move/from16 v9, p8 */
		 /* move/from16 v10, p9 */
		 /* invoke-direct/range {v0 ..v10}, Lcom/wiyun/engine/actions/grid/Lens3D;->nativeInit(FIIFFFFFFF)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.actions.grid.Lens3D ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/grid/Grid3DAction;-><init>(I)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.actions.grid.Lens3D .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.grid.Lens3D from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/grid/Lens3D; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/grid/Lens3D;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.grid.Lens3D make ( Float p0, com.wiyun.engine.types.WYGridSize p1, Float p2, Float p3, Float p4, Float p5 ) {
/* .locals 9 */
int v4 = 0; // const/4 v4, 0x0
/* move v0, p0 */
/* move-object v1, p1 */
/* move v2, p2 */
/* move v3, p3 */
/* move v5, v4 */
/* move v6, p4 */
/* move v7, v4 */
/* move v8, p5 */
/* invoke-static/range {v0 ..v8}, Lcom/wiyun/engine/actions/grid/Lens3D;->make(FLcom/wiyun/engine/types/WYGridSize;FFFFFFF)Lcom/wiyun/engine/actions/grid/Lens3D; */
} // .end method
public static com.wiyun.engine.actions.grid.Lens3D make ( Float p0, com.wiyun.engine.types.WYGridSize p1, Float p2, Float p3, Float p4, Float p5, Float p6, Float p7, Float p8 ) {
/* .locals 10 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/Lens3D; */
/* move v1, p0 */
/* move-object v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* move v6, p5 */
/* move/from16 v7, p6 */
/* move/from16 v8, p7 */
/* move/from16 v9, p8 */
/* invoke-direct/range {v0 ..v9}, Lcom/wiyun/engine/actions/grid/Lens3D;-><init>(FLcom/wiyun/engine/types/WYGridSize;FFFFFFF)V */
} // .end method
public static com.wiyun.engine.actions.grid.Lens3D make ( Float p0, com.wiyun.engine.types.WYGridSize p1, com.wiyun.engine.types.WYPoint p2, Float p3, Float p4 ) {
/* .locals 6 */
/* iget v2, p2, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v3, p2, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* move v0, p0 */
/* move-object v1, p1 */
/* move v4, p3 */
/* move v5, p4 */
/* invoke-static/range {v0 ..v5}, Lcom/wiyun/engine/actions/grid/Lens3D;->make(FLcom/wiyun/engine/types/WYGridSize;FFFF)Lcom/wiyun/engine/actions/grid/Lens3D; */
} // .end method
private native void nativeInit ( Float p0, Integer p1, Integer p2, Float p3, Float p4, Float p5, Float p6, Float p7, Float p8, Float p9 ) {
} // .end method
/* # virtual methods */
public final com.wiyun.engine.actions.grid.Grid3DAction a ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/Lens3D; */
v1 = (( com.wiyun.engine.actions.grid.Lens3D ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/Lens3D;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/grid/Lens3D;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //synthethic
/* .locals 1 */
(( com.wiyun.engine.actions.grid.Lens3D ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/Lens3D;->a()Lcom/wiyun/engine/actions/grid/Grid3DAction;
} // .end method

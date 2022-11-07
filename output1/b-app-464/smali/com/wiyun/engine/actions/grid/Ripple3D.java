public class com.wiyun.engine.actions.grid.Ripple3D extends com.wiyun.engine.actions.grid.Grid3DAction {
	 /* # direct methods */
	 private com.wiyun.engine.actions.grid.Ripple3D ( ) {
		 /* .locals 13 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/grid/Grid3DAction;-><init>()V */
		 /* iget v2, p2, Lcom/wiyun/engine/types/WYGridSize;->x:I */
		 /* iget v3, p2, Lcom/wiyun/engine/types/WYGridSize;->y:I */
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move/from16 v4, p3 */
		 /* move/from16 v5, p4 */
		 /* move/from16 v6, p5 */
		 /* move/from16 v7, p6 */
		 /* move/from16 v8, p7 */
		 /* move/from16 v9, p8 */
		 /* move/from16 v10, p9 */
		 /* move/from16 v11, p10 */
		 /* move/from16 v12, p11 */
		 /* invoke-direct/range {v0 ..v12}, Lcom/wiyun/engine/actions/grid/Ripple3D;->nativeInit(FIIFFFFFFFFF)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.actions.grid.Ripple3D ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/grid/Grid3DAction;-><init>(I)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.actions.grid.Ripple3D .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.grid.Ripple3D from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/grid/Ripple3D; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/grid/Ripple3D;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.grid.Ripple3D make ( Float p0, com.wiyun.engine.types.WYGridSize p1, Float p2, Float p3, Float p4, Float p5, Float p6 ) {
/* .locals 12 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/Ripple3D; */
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
int v8 = 0; // const/4 v8, 0x0
int v10 = 0; // const/4 v10, 0x0
/* move v1, p0 */
/* move-object v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move/from16 v7, p4 */
/* move/from16 v9, p5 */
/* move/from16 v11, p6 */
/* invoke-direct/range {v0 ..v11}, Lcom/wiyun/engine/actions/grid/Ripple3D;-><init>(FLcom/wiyun/engine/types/WYGridSize;FFFFFFFFF)V */
} // .end method
public static com.wiyun.engine.actions.grid.Ripple3D make ( Float p0, com.wiyun.engine.types.WYGridSize p1, Float p2, Float p3, Float p4, Float p5, Float p6, Float p7, Float p8, Float p9, Float p10 ) {
/* .locals 12 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/Ripple3D; */
/* move v1, p0 */
/* move-object v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move/from16 v5, p4 */
/* move/from16 v6, p5 */
/* move/from16 v7, p6 */
/* move/from16 v8, p7 */
/* move/from16 v9, p8 */
/* move/from16 v10, p9 */
/* move/from16 v11, p10 */
/* invoke-direct/range {v0 ..v11}, Lcom/wiyun/engine/actions/grid/Ripple3D;-><init>(FLcom/wiyun/engine/types/WYGridSize;FFFFFFFFF)V */
} // .end method
public static com.wiyun.engine.actions.grid.Ripple3D make ( Float p0, com.wiyun.engine.types.WYGridSize p1, com.wiyun.engine.types.WYPoint p2, Float p3, Float p4, Float p5 ) {
/* .locals 7 */
/* iget v2, p2, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v3, p2, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* move v0, p0 */
/* move-object v1, p1 */
/* move v4, p3 */
/* move v5, p4 */
/* move v6, p5 */
/* invoke-static/range {v0 ..v6}, Lcom/wiyun/engine/actions/grid/Ripple3D;->make(FLcom/wiyun/engine/types/WYGridSize;FFFFF)Lcom/wiyun/engine/actions/grid/Ripple3D; */
} // .end method
private native void nativeInit ( Float p0, Integer p1, Integer p2, Float p3, Float p4, Float p5, Float p6, Float p7, Float p8, Float p9, Float p10, Float p11 ) {
} // .end method
/* # virtual methods */
public final com.wiyun.engine.actions.grid.Grid3DAction a ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/Ripple3D; */
v1 = (( com.wiyun.engine.actions.grid.Ripple3D ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/Ripple3D;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/grid/Ripple3D;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //synthethic
/* .locals 1 */
(( com.wiyun.engine.actions.grid.Ripple3D ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/Ripple3D;->a()Lcom/wiyun/engine/actions/grid/Grid3DAction;
} // .end method

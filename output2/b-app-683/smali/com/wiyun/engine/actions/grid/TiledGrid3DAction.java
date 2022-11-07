public abstract class com.wiyun.engine.actions.grid.TiledGrid3DAction extends com.wiyun.engine.actions.grid.GridAction {
	 /* .source "TiledGrid3DAction.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.grid.TiledGrid3DAction ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 13 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/grid/GridAction;-><init>()V */
		 /* .line 14 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.grid.TiledGrid3DAction ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "gSize" # Lcom/wiyun/engine/types/WYGridSize; */
		 /* .prologue */
		 /* .line 10 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/grid/GridAction;-><init>()V */
		 /* .line 11 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.grid.TiledGrid3DAction ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 17 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/grid/GridAction;-><init>(I)V */
		 /* .line 18 */
		 return;
	 } // .end method
	 private native void getOriginalTile ( Integer p0, Integer p1, com.wiyun.engine.types.WYQuad3D p2 ) {
	 } // .end method
	 private native void getTile ( Integer p0, Integer p1, com.wiyun.engine.types.WYQuad3D p2 ) {
	 } // .end method
	 private native void setTile ( Integer p0, Integer p1, Float p2, Float p3, Float p4, Float p5, Float p6, Float p7, Float p8, Float p9, Float p10, Float p11, Float p12, Float p13 ) {
	 } // .end method
	 /* # virtual methods */
	 public com.wiyun.engine.actions.IntervalAction copy ( ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 (( com.wiyun.engine.actions.grid.TiledGrid3DAction ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/TiledGrid3DAction;->copy()Lcom/wiyun/engine/actions/grid/TiledGrid3DAction;
	 } // .end method
	 public abstract com.wiyun.engine.actions.grid.TiledGrid3DAction copy ( ) {
	 } // .end method
	 public java.lang.Object copy ( ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 (( com.wiyun.engine.actions.grid.TiledGrid3DAction ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/TiledGrid3DAction;->copy()Lcom/wiyun/engine/actions/grid/TiledGrid3DAction;
	 } // .end method
	 public com.wiyun.engine.types.WYQuad3D getOriginalTile ( com.wiyun.engine.types.WYGridSize p0 ) {
		 /* .locals 3 */
		 /* .param p1, "pos" # Lcom/wiyun/engine/types/WYGridSize; */
		 /* .prologue */
		 /* .line 32 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYQuad3D; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/types/WYQuad3D;-><init>()V */
		 /* .line 33 */
		 /* .local v0, "tile":Lcom/wiyun/engine/types/WYQuad3D; */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYGridSize;->x:I */
		 /* iget v2, p1, Lcom/wiyun/engine/types/WYGridSize;->y:I */
		 /* invoke-direct {p0, v1, v2, v0}, Lcom/wiyun/engine/actions/grid/TiledGrid3DAction;->getOriginalTile(IILcom/wiyun/engine/types/WYQuad3D;)V */
		 /* .line 34 */
	 } // .end method
	 public com.wiyun.engine.types.WYQuad3D getTile ( com.wiyun.engine.types.WYGridSize p0 ) {
		 /* .locals 3 */
		 /* .param p1, "pos" # Lcom/wiyun/engine/types/WYGridSize; */
		 /* .prologue */
		 /* .line 24 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYQuad3D; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/types/WYQuad3D;-><init>()V */
		 /* .line 25 */
		 /* .local v0, "tile":Lcom/wiyun/engine/types/WYQuad3D; */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYGridSize;->x:I */
		 /* iget v2, p1, Lcom/wiyun/engine/types/WYGridSize;->y:I */
		 /* invoke-direct {p0, v1, v2, v0}, Lcom/wiyun/engine/actions/grid/TiledGrid3DAction;->getTile(IILcom/wiyun/engine/types/WYQuad3D;)V */
		 /* .line 26 */
	 } // .end method
	 public void setTile ( com.wiyun.engine.types.WYGridSize p0, com.wiyun.engine.types.WYQuad3D p1 ) {
		 /* .locals 16 */
		 /* .param p1, "pos" # Lcom/wiyun/engine/types/WYGridSize; */
		 /* .param p2, "coords" # Lcom/wiyun/engine/types/WYQuad3D; */
		 /* .prologue */
		 /* .line 40 */
		 /* move-object/from16 v0, p1 */
		 /* iget v2, v0, Lcom/wiyun/engine/types/WYGridSize;->x:I */
		 /* move-object/from16 v0, p1 */
		 /* iget v3, v0, Lcom/wiyun/engine/types/WYGridSize;->y:I */
		 /* .line 41 */
		 /* move-object/from16 v0, p2 */
		 /* iget v4, v0, Lcom/wiyun/engine/types/WYQuad3D;->bl_x:F */
		 /* move-object/from16 v0, p2 */
		 /* iget v5, v0, Lcom/wiyun/engine/types/WYQuad3D;->bl_y:F */
		 /* move-object/from16 v0, p2 */
		 /* iget v6, v0, Lcom/wiyun/engine/types/WYQuad3D;->bl_z:F */
		 /* .line 42 */
		 /* move-object/from16 v0, p2 */
		 /* iget v7, v0, Lcom/wiyun/engine/types/WYQuad3D;->br_x:F */
		 /* move-object/from16 v0, p2 */
		 /* iget v8, v0, Lcom/wiyun/engine/types/WYQuad3D;->br_y:F */
		 /* move-object/from16 v0, p2 */
		 /* iget v9, v0, Lcom/wiyun/engine/types/WYQuad3D;->br_z:F */
		 /* .line 43 */
		 /* move-object/from16 v0, p2 */
		 /* iget v10, v0, Lcom/wiyun/engine/types/WYQuad3D;->tl_x:F */
		 /* move-object/from16 v0, p2 */
		 /* iget v11, v0, Lcom/wiyun/engine/types/WYQuad3D;->tl_y:F */
		 /* move-object/from16 v0, p2 */
		 /* iget v12, v0, Lcom/wiyun/engine/types/WYQuad3D;->tl_z:F */
		 /* .line 44 */
		 /* move-object/from16 v0, p2 */
		 /* iget v13, v0, Lcom/wiyun/engine/types/WYQuad3D;->tr_x:F */
		 /* move-object/from16 v0, p2 */
		 /* iget v14, v0, Lcom/wiyun/engine/types/WYQuad3D;->tr_y:F */
		 /* move-object/from16 v0, p2 */
		 /* iget v15, v0, Lcom/wiyun/engine/types/WYQuad3D;->tr_z:F */
		 /* move-object/from16 v1, p0 */
		 /* .line 40 */
		 /* invoke-direct/range {v1 ..v15}, Lcom/wiyun/engine/actions/grid/TiledGrid3DAction;->setTile(IIFFFFFFFFFFFF)V */
		 /* .line 45 */
		 return;
	 } // .end method

public class com.wiyun.engine.grid.TiledGrid3D extends com.wiyun.engine.grid.BaseGrid {
	 /* .source "TiledGrid3D.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.grid.TiledGrid3D ( ) {
		 /* .locals 0 */
		 /* .param p1, "w" # F */
		 /* .param p2, "h" # F */
		 /* .param p3, "c" # I */
		 /* .param p4, "r" # I */
		 /* .prologue */
		 /* .line 33 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/grid/BaseGrid;-><init>()V */
		 /* .line 34 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lcom/wiyun/engine/grid/TiledGrid3D;->nativeInit(FFII)V */
		 /* .line 35 */
		 return;
	 } // .end method
	 public com.wiyun.engine.grid.TiledGrid3D ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 38 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/grid/BaseGrid;-><init>(I)V */
		 /* .line 39 */
		 return;
	 } // .end method
	 private native void getOriginalTile ( Integer p0, Integer p1, com.wiyun.engine.types.WYQuad3D p2 ) {
	 } // .end method
	 private native void getTile ( Integer p0, Integer p1, com.wiyun.engine.types.WYQuad3D p2 ) {
	 } // .end method
	 public static com.wiyun.engine.grid.TiledGrid3D make ( Float p0, Float p1, Integer p2, Integer p3 ) {
		 /* .locals 1 */
		 /* .param p0, "w" # F */
		 /* .param p1, "h" # F */
		 /* .param p2, "c" # I */
		 /* .param p3, "r" # I */
		 /* .prologue */
		 /* .line 30 */
		 /* new-instance v0, Lcom/wiyun/engine/grid/TiledGrid3D; */
		 /* invoke-direct {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/grid/TiledGrid3D;-><init>(FFII)V */
	 } // .end method
	 private native void nativeInit ( Float p0, Float p1, Integer p2, Integer p3 ) {
	 } // .end method
	 private native void setTile ( Integer p0, Integer p1, Float p2, Float p3, Float p4, Float p5, Float p6, Float p7, Float p8, Float p9, Float p10, Float p11, Float p12, Float p13 ) {
	 } // .end method
	 /* # virtual methods */
	 public com.wiyun.engine.types.WYQuad3D getOriginalTile ( com.wiyun.engine.types.WYGridSize p0 ) {
		 /* .locals 3 */
		 /* .param p1, "pos" # Lcom/wiyun/engine/types/WYGridSize; */
		 /* .prologue */
		 /* .line 67 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYQuad3D; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/types/WYQuad3D;-><init>()V */
		 /* .line 68 */
		 /* .local v0, "tile":Lcom/wiyun/engine/types/WYQuad3D; */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYGridSize;->x:I */
		 /* iget v2, p1, Lcom/wiyun/engine/types/WYGridSize;->y:I */
		 /* invoke-direct {p0, v1, v2, v0}, Lcom/wiyun/engine/grid/TiledGrid3D;->getOriginalTile(IILcom/wiyun/engine/types/WYQuad3D;)V */
		 /* .line 69 */
	 } // .end method
	 public com.wiyun.engine.types.WYQuad3D getTile ( com.wiyun.engine.types.WYGridSize p0 ) {
		 /* .locals 3 */
		 /* .param p1, "pos" # Lcom/wiyun/engine/types/WYGridSize; */
		 /* .prologue */
		 /* .line 81 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYQuad3D; */
		 /* invoke-direct {v0}, Lcom/wiyun/engine/types/WYQuad3D;-><init>()V */
		 /* .line 82 */
		 /* .local v0, "tile":Lcom/wiyun/engine/types/WYQuad3D; */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYGridSize;->x:I */
		 /* iget v2, p1, Lcom/wiyun/engine/types/WYGridSize;->y:I */
		 /* invoke-direct {p0, v1, v2, v0}, Lcom/wiyun/engine/grid/TiledGrid3D;->getTile(IILcom/wiyun/engine/types/WYQuad3D;)V */
		 /* .line 83 */
	 } // .end method
	 public void setTile ( com.wiyun.engine.types.WYGridSize p0, com.wiyun.engine.types.WYQuad3D p1 ) {
		 /* .locals 16 */
		 /* .param p1, "pos" # Lcom/wiyun/engine/types/WYGridSize; */
		 /* .param p2, "coords" # Lcom/wiyun/engine/types/WYQuad3D; */
		 /* .prologue */
		 /* .line 50 */
		 /* move-object/from16 v0, p1 */
		 /* iget v2, v0, Lcom/wiyun/engine/types/WYGridSize;->x:I */
		 /* move-object/from16 v0, p1 */
		 /* iget v3, v0, Lcom/wiyun/engine/types/WYGridSize;->y:I */
		 /* .line 51 */
		 /* move-object/from16 v0, p2 */
		 /* iget v4, v0, Lcom/wiyun/engine/types/WYQuad3D;->bl_x:F */
		 /* move-object/from16 v0, p2 */
		 /* iget v5, v0, Lcom/wiyun/engine/types/WYQuad3D;->bl_y:F */
		 /* move-object/from16 v0, p2 */
		 /* iget v6, v0, Lcom/wiyun/engine/types/WYQuad3D;->bl_z:F */
		 /* .line 52 */
		 /* move-object/from16 v0, p2 */
		 /* iget v7, v0, Lcom/wiyun/engine/types/WYQuad3D;->br_x:F */
		 /* move-object/from16 v0, p2 */
		 /* iget v8, v0, Lcom/wiyun/engine/types/WYQuad3D;->br_y:F */
		 /* move-object/from16 v0, p2 */
		 /* iget v9, v0, Lcom/wiyun/engine/types/WYQuad3D;->br_z:F */
		 /* .line 53 */
		 /* move-object/from16 v0, p2 */
		 /* iget v10, v0, Lcom/wiyun/engine/types/WYQuad3D;->tl_x:F */
		 /* move-object/from16 v0, p2 */
		 /* iget v11, v0, Lcom/wiyun/engine/types/WYQuad3D;->tl_y:F */
		 /* move-object/from16 v0, p2 */
		 /* iget v12, v0, Lcom/wiyun/engine/types/WYQuad3D;->tl_z:F */
		 /* .line 54 */
		 /* move-object/from16 v0, p2 */
		 /* iget v13, v0, Lcom/wiyun/engine/types/WYQuad3D;->tr_x:F */
		 /* move-object/from16 v0, p2 */
		 /* iget v14, v0, Lcom/wiyun/engine/types/WYQuad3D;->tr_y:F */
		 /* move-object/from16 v0, p2 */
		 /* iget v15, v0, Lcom/wiyun/engine/types/WYQuad3D;->tr_z:F */
		 /* move-object/from16 v1, p0 */
		 /* .line 50 */
		 /* invoke-direct/range {v1 ..v15}, Lcom/wiyun/engine/grid/TiledGrid3D;->setTile(IIFFFFFFFFFFFF)V */
		 /* .line 55 */
		 return;
	 } // .end method

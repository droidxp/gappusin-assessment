public class com.wiyun.engine.grid.Grid3D extends com.wiyun.engine.grid.BaseGrid {
	 /* .source "Grid3D.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.grid.Grid3D ( ) {
		 /* .locals 0 */
		 /* .param p1, "w" # F */
		 /* .param p2, "h" # F */
		 /* .param p3, "c" # I */
		 /* .param p4, "r" # I */
		 /* .prologue */
		 /* .line 33 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/grid/BaseGrid;-><init>()V */
		 /* .line 34 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lcom/wiyun/engine/grid/Grid3D;->nativeInit(FFII)V */
		 /* .line 35 */
		 return;
	 } // .end method
	 public com.wiyun.engine.grid.Grid3D ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 38 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/grid/BaseGrid;-><init>(I)V */
		 /* .line 39 */
		 return;
	 } // .end method
	 private native void getOriginalVertex ( Integer p0, Integer p1, com.wiyun.engine.types.WYVertex3D p2 ) {
	 } // .end method
	 private native void getVertex ( Integer p0, Integer p1, com.wiyun.engine.types.WYVertex3D p2 ) {
	 } // .end method
	 public static com.wiyun.engine.grid.Grid3D make ( Float p0, Float p1, Integer p2, Integer p3 ) {
		 /* .locals 1 */
		 /* .param p0, "w" # F */
		 /* .param p1, "h" # F */
		 /* .param p2, "c" # I */
		 /* .param p3, "r" # I */
		 /* .prologue */
		 /* .line 30 */
		 /* new-instance v0, Lcom/wiyun/engine/grid/Grid3D; */
		 /* invoke-direct {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/grid/Grid3D;-><init>(FFII)V */
	 } // .end method
	 private native void nativeInit ( Float p0, Float p1, Integer p2, Integer p3 ) {
	 } // .end method
	 private native void setVertex ( Integer p0, Integer p1, Float p2, Float p3, Float p4 ) {
	 } // .end method
	 /* # virtual methods */
	 public com.wiyun.engine.types.WYVertex3D getOriginalVertex ( com.wiyun.engine.types.WYGridSize p0 ) {
		 /* .locals 3 */
		 /* .param p1, "pos" # Lcom/wiyun/engine/types/WYGridSize; */
		 /* .prologue */
		 /* .line 64 */
		 com.wiyun.engine.types.WYVertex3D .makeZero ( );
		 /* .line 65 */
		 /* .local v0, "vertex":Lcom/wiyun/engine/types/WYVertex3D; */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYGridSize;->x:I */
		 /* iget v2, p1, Lcom/wiyun/engine/types/WYGridSize;->y:I */
		 /* invoke-direct {p0, v1, v2, v0}, Lcom/wiyun/engine/grid/Grid3D;->getOriginalVertex(IILcom/wiyun/engine/types/WYVertex3D;)V */
		 /* .line 66 */
	 } // .end method
	 public com.wiyun.engine.types.WYVertex3D getVertex ( com.wiyun.engine.types.WYGridSize p0 ) {
		 /* .locals 3 */
		 /* .param p1, "pos" # Lcom/wiyun/engine/types/WYGridSize; */
		 /* .prologue */
		 /* .line 50 */
		 com.wiyun.engine.types.WYVertex3D .makeZero ( );
		 /* .line 51 */
		 /* .local v0, "vertex":Lcom/wiyun/engine/types/WYVertex3D; */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYGridSize;->x:I */
		 /* iget v2, p1, Lcom/wiyun/engine/types/WYGridSize;->y:I */
		 /* invoke-direct {p0, v1, v2, v0}, Lcom/wiyun/engine/grid/Grid3D;->getVertex(IILcom/wiyun/engine/types/WYVertex3D;)V */
		 /* .line 52 */
	 } // .end method
	 public void setVertex ( com.wiyun.engine.types.WYGridSize p0, com.wiyun.engine.types.WYVertex3D p1 ) {
		 /* .locals 6 */
		 /* .param p1, "pos" # Lcom/wiyun/engine/types/WYGridSize; */
		 /* .param p2, "vertex" # Lcom/wiyun/engine/types/WYVertex3D; */
		 /* .prologue */
		 /* .line 78 */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYGridSize;->x:I */
		 /* iget v2, p1, Lcom/wiyun/engine/types/WYGridSize;->y:I */
		 /* iget v3, p2, Lcom/wiyun/engine/types/WYVertex3D;->x:F */
		 /* iget v4, p2, Lcom/wiyun/engine/types/WYVertex3D;->y:F */
		 /* iget v5, p2, Lcom/wiyun/engine/types/WYVertex3D;->z:F */
		 /* move-object v0, p0 */
		 /* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/grid/Grid3D;->setVertex(IIFFF)V */
		 /* .line 79 */
		 return;
	 } // .end method

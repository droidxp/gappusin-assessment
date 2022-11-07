public abstract class com.wiyun.engine.actions.grid.Grid3DAction extends com.wiyun.engine.actions.grid.GridAction {
	 /* .source "Grid3DAction.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.grid.Grid3DAction ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 19 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/grid/GridAction;-><init>()V */
		 /* .line 20 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.grid.Grid3DAction ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "gSize" # Lcom/wiyun/engine/types/WYGridSize; */
		 /* .prologue */
		 /* .line 16 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/grid/GridAction;-><init>()V */
		 /* .line 17 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.grid.Grid3DAction ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 23 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/grid/GridAction;-><init>(I)V */
		 /* .line 24 */
		 return;
	 } // .end method
	 private native void getOriginalVertex ( Integer p0, Integer p1, com.wiyun.engine.types.WYVertex3D p2 ) {
	 } // .end method
	 private native void getVertex ( Integer p0, Integer p1, com.wiyun.engine.types.WYVertex3D p2 ) {
	 } // .end method
	 private native void setVertex ( Integer p0, Integer p1, Float p2, Float p3, Float p4 ) {
	 } // .end method
	 /* # virtual methods */
	 public com.wiyun.engine.actions.IntervalAction copy ( ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 (( com.wiyun.engine.actions.grid.Grid3DAction ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/Grid3DAction;->copy()Lcom/wiyun/engine/actions/grid/Grid3DAction;
	 } // .end method
	 public abstract com.wiyun.engine.actions.grid.Grid3DAction copy ( ) {
	 } // .end method
	 public java.lang.Object copy ( ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 (( com.wiyun.engine.actions.grid.Grid3DAction ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/Grid3DAction;->copy()Lcom/wiyun/engine/actions/grid/Grid3DAction;
	 } // .end method
	 public com.wiyun.engine.types.WYVertex3D getOriginalVertex ( com.wiyun.engine.types.WYGridSize p0 ) {
		 /* .locals 3 */
		 /* .param p1, "pos" # Lcom/wiyun/engine/types/WYGridSize; */
		 /* .prologue */
		 /* .line 47 */
		 com.wiyun.engine.types.WYVertex3D .makeZero ( );
		 /* .line 48 */
		 /* .local v0, "vertex":Lcom/wiyun/engine/types/WYVertex3D; */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYGridSize;->x:I */
		 /* iget v2, p1, Lcom/wiyun/engine/types/WYGridSize;->y:I */
		 /* invoke-direct {p0, v1, v2, v0}, Lcom/wiyun/engine/actions/grid/Grid3DAction;->getOriginalVertex(IILcom/wiyun/engine/types/WYVertex3D;)V */
		 /* .line 49 */
	 } // .end method
	 public com.wiyun.engine.types.WYVertex3D getVertex ( com.wiyun.engine.types.WYGridSize p0 ) {
		 /* .locals 3 */
		 /* .param p1, "pos" # Lcom/wiyun/engine/types/WYGridSize; */
		 /* .prologue */
		 /* .line 33 */
		 com.wiyun.engine.types.WYVertex3D .makeZero ( );
		 /* .line 34 */
		 /* .local v0, "vertex":Lcom/wiyun/engine/types/WYVertex3D; */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYGridSize;->x:I */
		 /* iget v2, p1, Lcom/wiyun/engine/types/WYGridSize;->y:I */
		 /* invoke-direct {p0, v1, v2, v0}, Lcom/wiyun/engine/actions/grid/Grid3DAction;->getVertex(IILcom/wiyun/engine/types/WYVertex3D;)V */
		 /* .line 35 */
	 } // .end method
	 public void setVertex ( com.wiyun.engine.types.WYGridSize p0, com.wiyun.engine.types.WYVertex3D p1 ) {
		 /* .locals 6 */
		 /* .param p1, "pos" # Lcom/wiyun/engine/types/WYGridSize; */
		 /* .param p2, "vertex" # Lcom/wiyun/engine/types/WYVertex3D; */
		 /* .prologue */
		 /* .line 61 */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYGridSize;->x:I */
		 /* iget v2, p1, Lcom/wiyun/engine/types/WYGridSize;->y:I */
		 /* iget v3, p2, Lcom/wiyun/engine/types/WYVertex3D;->x:F */
		 /* iget v4, p2, Lcom/wiyun/engine/types/WYVertex3D;->y:F */
		 /* iget v5, p2, Lcom/wiyun/engine/types/WYVertex3D;->z:F */
		 /* move-object v0, p0 */
		 /* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/actions/grid/Grid3DAction;->setVertex(IIFFF)V */
		 /* .line 62 */
		 return;
	 } // .end method

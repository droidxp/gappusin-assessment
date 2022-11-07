public class com.wiyun.engine.actions.grid.WavesTiles3D extends com.wiyun.engine.actions.grid.TiledGrid3DAction {
	 /* .source "WavesTiles3D.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.grid.WavesTiles3D ( ) {
		 /* .locals 6 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "gridSize" # Lcom/wiyun/engine/types/WYGridSize; */
		 /* .param p3, "amplitude" # F */
		 /* .param p4, "waves" # I */
		 /* .prologue */
		 /* .line 30 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/grid/TiledGrid3DAction;-><init>()V */
		 /* .line 31 */
		 /* iget v2, p2, Lcom/wiyun/engine/types/WYGridSize;->x:I */
		 /* iget v3, p2, Lcom/wiyun/engine/types/WYGridSize;->y:I */
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v4, p3 */
		 /* move v5, p4 */
		 /* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/actions/grid/WavesTiles3D;->nativeInit(FIIFI)V */
		 /* .line 32 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.grid.WavesTiles3D ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 45 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/grid/TiledGrid3DAction;-><init>(I)V */
		 /* .line 46 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.grid.WavesTiles3D .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.grid.WavesTiles3D from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 41 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/grid/WavesTiles3D; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/grid/WavesTiles3D;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.grid.WavesTiles3D make ( Float p0, com.wiyun.engine.types.WYGridSize p1, Float p2, Integer p3 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "gridSize" # Lcom/wiyun/engine/types/WYGridSize; */
/* .param p2, "amplitude" # F */
/* .param p3, "waves" # I */
/* .prologue */
/* .line 19 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/WavesTiles3D; */
/* invoke-direct {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/actions/grid/WavesTiles3D;-><init>(FLcom/wiyun/engine/types/WYGridSize;FI)V */
} // .end method
private native void nativeInit ( Float p0, Integer p1, Integer p2, Float p3, Integer p4 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.grid.TiledGrid3DAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 52 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/WavesTiles3D; */
v1 = (( com.wiyun.engine.actions.grid.WavesTiles3D ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/WavesTiles3D;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/grid/WavesTiles3D;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.grid.WavesTiles3D ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/WavesTiles3D;->copy()Lcom/wiyun/engine/actions/grid/TiledGrid3DAction;
} // .end method

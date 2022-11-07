public class com.wiyun.engine.actions.grid.ShakyTiles3D extends com.wiyun.engine.actions.grid.TiledGrid3DAction {
	 /* .source "ShakyTiles3D.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.grid.ShakyTiles3D ( ) {
		 /* .locals 7 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "gridSize" # Lcom/wiyun/engine/types/WYGridSize; */
		 /* .param p3, "range" # I */
		 /* .param p4, "deltaRange" # I */
		 /* .param p5, "shakeZ" # Z */
		 /* .prologue */
		 /* .line 45 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/grid/TiledGrid3DAction;-><init>()V */
		 /* .line 46 */
		 /* iget v2, p2, Lcom/wiyun/engine/types/WYGridSize;->x:I */
		 /* iget v3, p2, Lcom/wiyun/engine/types/WYGridSize;->y:I */
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v4, p3 */
		 /* move v5, p4 */
		 /* move v6, p5 */
		 /* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/actions/grid/ShakyTiles3D;->nativeInit(FIIIIZ)V */
		 /* .line 47 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.grid.ShakyTiles3D ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 60 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/grid/TiledGrid3DAction;-><init>(I)V */
		 /* .line 61 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.grid.ShakyTiles3D .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.grid.ShakyTiles3D from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 56 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/grid/ShakyTiles3D; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/grid/ShakyTiles3D;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.grid.ShakyTiles3D make ( Float p0, com.wiyun.engine.types.WYGridSize p1, Integer p2, Integer p3, Boolean p4 ) {
/* .locals 6 */
/* .param p0, "duration" # F */
/* .param p1, "gridSize" # Lcom/wiyun/engine/types/WYGridSize; */
/* .param p2, "range" # I */
/* .param p3, "deltaRange" # I */
/* .param p4, "shakeZ" # Z */
/* .prologue */
/* .line 33 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/ShakyTiles3D; */
/* move v1, p0 */
/* move-object v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/actions/grid/ShakyTiles3D;-><init>(FLcom/wiyun/engine/types/WYGridSize;IIZ)V */
} // .end method
public static com.wiyun.engine.actions.grid.ShakyTiles3D make ( Float p0, com.wiyun.engine.types.WYGridSize p1, Integer p2, Boolean p3 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "gridSize" # Lcom/wiyun/engine/types/WYGridSize; */
/* .param p2, "range" # I */
/* .param p3, "shakeZ" # Z */
/* .prologue */
/* .line 19 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.actions.grid.ShakyTiles3D .make ( p0,p1,p2,v0,p3 );
} // .end method
private native void nativeInit ( Float p0, Integer p1, Integer p2, Integer p3, Integer p4, Boolean p5 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.grid.TiledGrid3DAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 67 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/ShakyTiles3D; */
v1 = (( com.wiyun.engine.actions.grid.ShakyTiles3D ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/ShakyTiles3D;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/grid/ShakyTiles3D;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.grid.ShakyTiles3D ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/ShakyTiles3D;->copy()Lcom/wiyun/engine/actions/grid/TiledGrid3DAction;
} // .end method

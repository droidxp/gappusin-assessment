public class com.wiyun.engine.actions.grid.ShakyTiles3D extends com.wiyun.engine.actions.grid.TiledGrid3DAction {
	 /* # direct methods */
	 private com.wiyun.engine.actions.grid.ShakyTiles3D ( ) {
		 /* .locals 7 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/grid/TiledGrid3DAction;-><init>()V */
		 /* iget v2, p2, Lcom/wiyun/engine/types/WYGridSize;->x:I */
		 /* iget v3, p2, Lcom/wiyun/engine/types/WYGridSize;->y:I */
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v4, p3 */
		 /* move v5, p4 */
		 /* move v6, p5 */
		 /* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/actions/grid/ShakyTiles3D;->nativeInit(FIIIIZ)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.actions.grid.ShakyTiles3D ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/grid/TiledGrid3DAction;-><init>(I)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.actions.grid.ShakyTiles3D .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.grid.ShakyTiles3D from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/grid/ShakyTiles3D; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/grid/ShakyTiles3D;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.grid.ShakyTiles3D make ( Float p0, com.wiyun.engine.types.WYGridSize p1, Integer p2, Integer p3, Boolean p4 ) {
/* .locals 6 */
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
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.actions.grid.ShakyTiles3D .make ( p0,p1,p2,v0,p3 );
} // .end method
private native void nativeInit ( Float p0, Integer p1, Integer p2, Integer p3, Integer p4, Boolean p5 ) {
} // .end method
/* # virtual methods */
public final com.wiyun.engine.actions.grid.TiledGrid3DAction a ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/ShakyTiles3D; */
v1 = (( com.wiyun.engine.actions.grid.ShakyTiles3D ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/ShakyTiles3D;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/grid/ShakyTiles3D;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //synthethic
/* .locals 1 */
(( com.wiyun.engine.actions.grid.ShakyTiles3D ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/ShakyTiles3D;->a()Lcom/wiyun/engine/actions/grid/TiledGrid3DAction;
} // .end method

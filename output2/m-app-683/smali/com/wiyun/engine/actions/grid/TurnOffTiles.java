public class com.wiyun.engine.actions.grid.TurnOffTiles extends com.wiyun.engine.actions.grid.TiledGrid3DAction {
	 /* .source "TurnOffTiles.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.grid.TurnOffTiles ( ) {
		 /* .locals 2 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "gSize" # Lcom/wiyun/engine/types/WYGridSize; */
		 /* .prologue */
		 /* .line 26 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/grid/TiledGrid3DAction;-><init>()V */
		 /* .line 27 */
		 /* iget v0, p2, Lcom/wiyun/engine/types/WYGridSize;->x:I */
		 /* iget v1, p2, Lcom/wiyun/engine/types/WYGridSize;->y:I */
		 /* invoke-direct {p0, p1, v0, v1}, Lcom/wiyun/engine/actions/grid/TurnOffTiles;->nativeInit(FII)V */
		 /* .line 28 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.grid.TurnOffTiles ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 41 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/grid/TiledGrid3DAction;-><init>(I)V */
		 /* .line 42 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.grid.TurnOffTiles .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.grid.TurnOffTiles from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 37 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/grid/TurnOffTiles; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/grid/TurnOffTiles;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.grid.TurnOffTiles make ( Float p0, com.wiyun.engine.types.WYGridSize p1 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "gSize" # Lcom/wiyun/engine/types/WYGridSize; */
/* .prologue */
/* .line 17 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/TurnOffTiles; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/actions/grid/TurnOffTiles;-><init>(FLcom/wiyun/engine/types/WYGridSize;)V */
} // .end method
private native void nativeInit ( Float p0, Integer p1, Integer p2 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.grid.TiledGrid3DAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 48 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/TurnOffTiles; */
v1 = (( com.wiyun.engine.actions.grid.TurnOffTiles ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/TurnOffTiles;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/grid/TurnOffTiles;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.grid.TurnOffTiles ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/TurnOffTiles;->copy()Lcom/wiyun/engine/actions/grid/TiledGrid3DAction;
} // .end method

public class com.wiyun.engine.actions.grid.Waves extends com.wiyun.engine.actions.grid.Grid3DAction {
	 /* .source "Waves.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.grid.Waves ( ) {
		 /* .locals 8 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "gridSize" # Lcom/wiyun/engine/types/WYGridSize; */
		 /* .param p3, "amplitude" # F */
		 /* .param p4, "waves" # I */
		 /* .param p5, "vertical" # Z */
		 /* .param p6, "horizontal" # Z */
		 /* .prologue */
		 /* .line 34 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/grid/Grid3DAction;-><init>()V */
		 /* .line 35 */
		 /* iget v2, p2, Lcom/wiyun/engine/types/WYGridSize;->x:I */
		 /* iget v3, p2, Lcom/wiyun/engine/types/WYGridSize;->y:I */
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v4, p3 */
		 /* move v5, p4 */
		 /* move v6, p5 */
		 /* move v7, p6 */
		 /* invoke-direct/range {v0 ..v7}, Lcom/wiyun/engine/actions/grid/Waves;->nativeInit(FIIFIZZ)V */
		 /* .line 36 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.grid.Waves ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 49 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/grid/Grid3DAction;-><init>(I)V */
		 /* .line 50 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.grid.Waves .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.grid.Waves from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 45 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/grid/Waves; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/grid/Waves;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.grid.Waves make ( Float p0, com.wiyun.engine.types.WYGridSize p1, Float p2, Integer p3, Boolean p4, Boolean p5 ) {
/* .locals 7 */
/* .param p0, "duration" # F */
/* .param p1, "gridSize" # Lcom/wiyun/engine/types/WYGridSize; */
/* .param p2, "amplitude" # F */
/* .param p3, "waves" # I */
/* .param p4, "vertical" # Z */
/* .param p5, "horizontal" # Z */
/* .prologue */
/* .line 21 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/Waves; */
/* move v1, p0 */
/* move-object v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* move v6, p5 */
/* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/actions/grid/Waves;-><init>(FLcom/wiyun/engine/types/WYGridSize;FIZZ)V */
} // .end method
private native void nativeInit ( Float p0, Integer p1, Integer p2, Float p3, Integer p4, Boolean p5, Boolean p6 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.grid.Grid3DAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 56 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/Waves; */
v1 = (( com.wiyun.engine.actions.grid.Waves ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/Waves;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/grid/Waves;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.grid.Waves ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/Waves;->copy()Lcom/wiyun/engine/actions/grid/Grid3DAction;
} // .end method

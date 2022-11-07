public class com.wiyun.engine.actions.grid.Liquid extends com.wiyun.engine.actions.grid.Grid3DAction {
	 /* .source "Liquid.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.grid.Liquid ( ) {
		 /* .locals 7 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "gridSize" # Lcom/wiyun/engine/types/WYGridSize; */
		 /* .param p3, "amplitude" # F */
		 /* .param p4, "deltaAmplitude" # F */
		 /* .param p5, "waves" # F */
		 /* .prologue */
		 /* .line 45 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/grid/Grid3DAction;-><init>()V */
		 /* .line 46 */
		 /* iget v2, p2, Lcom/wiyun/engine/types/WYGridSize;->x:I */
		 /* iget v3, p2, Lcom/wiyun/engine/types/WYGridSize;->y:I */
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v4, p3 */
		 /* move v5, p4 */
		 /* move v6, p5 */
		 /* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/actions/grid/Liquid;->nativeInit(FIIFFF)V */
		 /* .line 47 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.grid.Liquid ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 60 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/grid/Grid3DAction;-><init>(I)V */
		 /* .line 61 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.grid.Liquid .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.grid.Liquid from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 56 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/grid/Liquid; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/grid/Liquid;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.grid.Liquid make ( Float p0, com.wiyun.engine.types.WYGridSize p1, Float p2, Float p3 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "gridSize" # Lcom/wiyun/engine/types/WYGridSize; */
/* .param p2, "amplitude" # F */
/* .param p3, "waves" # F */
/* .prologue */
/* .line 19 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.actions.grid.Liquid .make ( p0,p1,p2,v0,p3 );
} // .end method
public static com.wiyun.engine.actions.grid.Liquid make ( Float p0, com.wiyun.engine.types.WYGridSize p1, Float p2, Float p3, Float p4 ) {
/* .locals 6 */
/* .param p0, "duration" # F */
/* .param p1, "gridSize" # Lcom/wiyun/engine/types/WYGridSize; */
/* .param p2, "amplitude" # F */
/* .param p3, "deltaAmplitude" # F */
/* .param p4, "waves" # F */
/* .prologue */
/* .line 33 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/Liquid; */
/* move v1, p0 */
/* move-object v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/actions/grid/Liquid;-><init>(FLcom/wiyun/engine/types/WYGridSize;FFF)V */
} // .end method
private native void nativeInit ( Float p0, Integer p1, Integer p2, Float p3, Float p4, Float p5 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.grid.Grid3DAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 67 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/Liquid; */
v1 = (( com.wiyun.engine.actions.grid.Liquid ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/Liquid;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/grid/Liquid;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.grid.Liquid ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/Liquid;->copy()Lcom/wiyun/engine/actions/grid/Grid3DAction;
} // .end method

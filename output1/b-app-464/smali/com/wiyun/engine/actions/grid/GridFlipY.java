public class com.wiyun.engine.actions.grid.GridFlipY extends com.wiyun.engine.actions.grid.Grid3DAction {
	 /* # direct methods */
	 private com.wiyun.engine.actions.grid.GridFlipY ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/grid/Grid3DAction;-><init>()V */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/grid/GridFlipY;->nativeInit(F)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.actions.grid.GridFlipY ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/grid/Grid3DAction;-><init>(I)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.actions.grid.GridFlipY .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.grid.GridFlipY from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/grid/GridFlipY; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/grid/GridFlipY;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.grid.GridFlipY make ( Float p0 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/GridFlipY; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/grid/GridFlipY;-><init>(F)V */
} // .end method
private native void nativeInit ( Float p0 ) {
} // .end method
/* # virtual methods */
public final com.wiyun.engine.actions.grid.Grid3DAction a ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/GridFlipY; */
v1 = (( com.wiyun.engine.actions.grid.GridFlipY ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/GridFlipY;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/grid/GridFlipY;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //synthethic
/* .locals 1 */
(( com.wiyun.engine.actions.grid.GridFlipY ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/GridFlipY;->a()Lcom/wiyun/engine/actions/grid/Grid3DAction;
} // .end method

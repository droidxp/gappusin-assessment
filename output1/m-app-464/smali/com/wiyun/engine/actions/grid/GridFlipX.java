public class com.wiyun.engine.actions.grid.GridFlipX extends com.wiyun.engine.actions.grid.Grid3DAction {
	 /* # direct methods */
	 private com.wiyun.engine.actions.grid.GridFlipX ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/grid/Grid3DAction;-><init>()V */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/grid/GridFlipX;->nativeInit(F)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.actions.grid.GridFlipX ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/grid/Grid3DAction;-><init>(I)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.actions.grid.GridFlipX .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.grid.GridFlipX from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/grid/GridFlipX; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/grid/GridFlipX;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.grid.GridFlipX make ( Float p0 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/GridFlipX; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/grid/GridFlipX;-><init>(F)V */
} // .end method
private native void nativeInit ( Float p0 ) {
} // .end method
/* # virtual methods */
public final com.wiyun.engine.actions.grid.Grid3DAction a ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/GridFlipX; */
v1 = (( com.wiyun.engine.actions.grid.GridFlipX ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/GridFlipX;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/grid/GridFlipX;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //synthethic
/* .locals 1 */
(( com.wiyun.engine.actions.grid.GridFlipX ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/GridFlipX;->a()Lcom/wiyun/engine/actions/grid/Grid3DAction;
} // .end method

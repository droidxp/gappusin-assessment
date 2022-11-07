public class com.wiyun.engine.actions.grid.GridFlipX extends com.wiyun.engine.actions.grid.Grid3DAction {
	 /* .source "GridFlipX.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.grid.GridFlipX ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .prologue */
		 /* .line 24 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/grid/Grid3DAction;-><init>()V */
		 /* .line 25 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/grid/GridFlipX;->nativeInit(F)V */
		 /* .line 26 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.grid.GridFlipX ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 39 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/grid/Grid3DAction;-><init>(I)V */
		 /* .line 40 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.grid.GridFlipX .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.grid.GridFlipX from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 35 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/grid/GridFlipX; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/grid/GridFlipX;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.grid.GridFlipX make ( Float p0 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .prologue */
/* .line 16 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/GridFlipX; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/grid/GridFlipX;-><init>(F)V */
} // .end method
private native void nativeInit ( Float p0 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.grid.Grid3DAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 46 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/GridFlipX; */
v1 = (( com.wiyun.engine.actions.grid.GridFlipX ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/GridFlipX;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/grid/GridFlipX;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.grid.GridFlipX ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/GridFlipX;->copy()Lcom/wiyun/engine/actions/grid/Grid3DAction;
} // .end method

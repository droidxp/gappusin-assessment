public class com.wiyun.engine.actions.grid.GridFlipY extends com.wiyun.engine.actions.grid.Grid3DAction {
	 /* .source "GridFlipY.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.grid.GridFlipY ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .prologue */
		 /* .line 23 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/grid/Grid3DAction;-><init>()V */
		 /* .line 24 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/grid/GridFlipY;->nativeInit(F)V */
		 /* .line 25 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.grid.GridFlipY ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 38 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/grid/Grid3DAction;-><init>(I)V */
		 /* .line 39 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.grid.GridFlipY .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.grid.GridFlipY from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 34 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/grid/GridFlipY; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/grid/GridFlipY;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.grid.GridFlipY make ( Float p0 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .prologue */
/* .line 15 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/GridFlipY; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/grid/GridFlipY;-><init>(F)V */
} // .end method
private native void nativeInit ( Float p0 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.grid.Grid3DAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 45 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/GridFlipY; */
v1 = (( com.wiyun.engine.actions.grid.GridFlipY ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/GridFlipY;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/grid/GridFlipY;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.grid.GridFlipY ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/GridFlipY;->copy()Lcom/wiyun/engine/actions/grid/Grid3DAction;
} // .end method

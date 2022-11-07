public class com.wiyun.engine.actions.grid.ReuseGrid extends com.wiyun.engine.actions.InstantAction {
	 /* .source "ReuseGrid.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.grid.ReuseGrid ( ) {
		 /* .locals 0 */
		 /* .param p1, "times" # I */
		 /* .prologue */
		 /* .line 26 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/InstantAction;-><init>()V */
		 /* .line 27 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/grid/ReuseGrid;->nativeInit(I)V */
		 /* .line 28 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.grid.ReuseGrid ( ) {
		 /* .locals 0 */
		 /* .param p1, "dummy" # I */
		 /* .param p2, "pointer" # I */
		 /* .prologue */
		 /* .line 41 */
		 /* invoke-direct {p0, p2}, Lcom/wiyun/engine/actions/InstantAction;-><init>(I)V */
		 /* .line 42 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.grid.ReuseGrid .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.grid.ReuseGrid from ( Integer p0 ) {
		 /* .locals 2 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 37 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/grid/ReuseGrid; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, v1, p0}, Lcom/wiyun/engine/actions/grid/ReuseGrid;-><init>(II)V */
} // .end method
public static com.wiyun.engine.actions.grid.ReuseGrid make ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "times" # I */
/* .prologue */
/* .line 18 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/ReuseGrid; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/grid/ReuseGrid;-><init>(I)V */
} // .end method
private native void nativeInit ( Integer p0 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.InstantAction copy ( ) {
/* .locals 3 */
/* .prologue */
/* .line 48 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/ReuseGrid; */
int v1 = 0; // const/4 v1, 0x0
v2 = (( com.wiyun.engine.actions.grid.ReuseGrid ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/ReuseGrid;->nativeCopy()I
/* invoke-direct {v0, v1, v2}, Lcom/wiyun/engine/actions/grid/ReuseGrid;-><init>(II)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.grid.ReuseGrid ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/ReuseGrid;->copy()Lcom/wiyun/engine/actions/InstantAction;
} // .end method
public com.wiyun.engine.actions.InstantAction reverse ( ) {
/* .locals 3 */
/* .prologue */
/* .line 53 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/ReuseGrid; */
int v1 = 0; // const/4 v1, 0x0
v2 = (( com.wiyun.engine.actions.grid.ReuseGrid ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/ReuseGrid;->nativeReverse()I
/* invoke-direct {v0, v1, v2}, Lcom/wiyun/engine/actions/grid/ReuseGrid;-><init>(II)V */
} // .end method

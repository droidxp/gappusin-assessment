public class com.wiyun.engine.actions.grid.ReuseGrid extends com.wiyun.engine.actions.InstantAction {
	 /* # direct methods */
	 private com.wiyun.engine.actions.grid.ReuseGrid ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/InstantAction;-><init>()V */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/grid/ReuseGrid;->nativeInit(I)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.actions.grid.ReuseGrid ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/InstantAction;-><init>(I)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.actions.grid.ReuseGrid .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.grid.ReuseGrid from ( Integer p0 ) {
		 /* .locals 2 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/grid/ReuseGrid; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1}, Lcom/wiyun/engine/actions/grid/ReuseGrid;-><init>(IB)V */
} // .end method
public static com.wiyun.engine.actions.grid.ReuseGrid make ( Integer p0 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/ReuseGrid; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/grid/ReuseGrid;-><init>(I)V */
} // .end method
private native void nativeInit ( Integer p0 ) {
} // .end method
/* # virtual methods */
public final com.wiyun.engine.actions.InstantAction a ( ) {
/* .locals 3 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/ReuseGrid; */
v1 = (( com.wiyun.engine.actions.grid.ReuseGrid ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/ReuseGrid;->nativeReverse()I
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v0, v1, v2}, Lcom/wiyun/engine/actions/grid/ReuseGrid;-><init>(IB)V */
} // .end method
public final com.wiyun.engine.actions.InstantAction b ( ) {
/* .locals 3 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/ReuseGrid; */
v1 = (( com.wiyun.engine.actions.grid.ReuseGrid ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/ReuseGrid;->nativeCopy()I
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v0, v1, v2}, Lcom/wiyun/engine/actions/grid/ReuseGrid;-><init>(IB)V */
} // .end method
public java.lang.Object copy ( ) { //synthethic
/* .locals 1 */
(( com.wiyun.engine.actions.grid.ReuseGrid ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/ReuseGrid;->b()Lcom/wiyun/engine/actions/InstantAction;
} // .end method

public class com.wiyun.engine.actions.grid.StopGrid extends com.wiyun.engine.actions.InstantAction {
	 /* .source "StopGrid.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.grid.StopGrid ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 19 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/InstantAction;-><init>()V */
		 /* .line 20 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/grid/StopGrid;->nativeInit()V */
		 /* .line 21 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.grid.StopGrid ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 34 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/InstantAction;-><init>(I)V */
		 /* .line 35 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.grid.StopGrid .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.grid.StopGrid from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 30 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/grid/StopGrid; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/grid/StopGrid;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.grid.StopGrid make ( ) {
/* .locals 1 */
/* .prologue */
/* .line 16 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/StopGrid; */
/* invoke-direct {v0}, Lcom/wiyun/engine/actions/grid/StopGrid;-><init>()V */
} // .end method
private native void nativeInit ( ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.InstantAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 41 */
/* new-instance v0, Lcom/wiyun/engine/actions/grid/StopGrid; */
v1 = (( com.wiyun.engine.actions.grid.StopGrid ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/StopGrid;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/grid/StopGrid;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.grid.StopGrid ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/StopGrid;->copy()Lcom/wiyun/engine/actions/InstantAction;
} // .end method
public com.wiyun.engine.actions.InstantAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 46 */
/* new-instance v0, Ljava/lang/UnsupportedOperationException; */
final String v1 = "StopGrid doesn\'t have reverse action"; // const-string v1, "StopGrid doesn\'t have reverse action"
/* invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method

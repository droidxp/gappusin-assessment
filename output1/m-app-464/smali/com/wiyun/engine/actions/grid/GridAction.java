public abstract class com.wiyun.engine.actions.grid.GridAction extends com.wiyun.engine.actions.IntervalAction {
	 /* # direct methods */
	 protected com.wiyun.engine.actions.grid.GridAction ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.grid.GridAction ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public com.wiyun.engine.actions.IntervalAction reverse ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Lcom/wiyun/engine/actions/ReverseTime; */
		 v1 = 		 (( com.wiyun.engine.actions.grid.GridAction ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/GridAction;->nativeReverse()I
		 /* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ReverseTime;-><init>(I)V */
	 } // .end method

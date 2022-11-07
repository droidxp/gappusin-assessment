public abstract class com.wiyun.engine.actions.grid.GridAction extends com.wiyun.engine.actions.IntervalAction {
	 /* .source "GridAction.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.grid.GridAction ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 40 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* .line 41 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.grid.GridAction ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "gSize" # Lcom/wiyun/engine/types/WYGridSize; */
		 /* .prologue */
		 /* .line 53 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* .line 54 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.grid.GridAction ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 44 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 /* .line 45 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public native Float getAmplitude ( ) {
	 } // .end method
	 public native Float getAmplitudeRate ( ) {
	 } // .end method
	 protected native Integer getGridHeight ( ) {
	 } // .end method
	 protected com.wiyun.engine.types.WYGridSize getGridSize ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 57 */
		 v0 = 		 (( com.wiyun.engine.actions.grid.GridAction ) p0 ).getGridWidth ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/GridAction;->getGridWidth()I
		 v1 = 		 (( com.wiyun.engine.actions.grid.GridAction ) p0 ).getGridHeight ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/GridAction;->getGridHeight()I
		 com.wiyun.engine.types.WYGridSize .make ( v0,v1 );
	 } // .end method
	 protected native Integer getGridWidth ( ) {
	 } // .end method
	 public native com.wiyun.engine.grid.BaseGrid makeGrid ( ) {
	 } // .end method
	 public com.wiyun.engine.actions.IntervalAction reverse ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 72 */
		 /* new-instance v0, Lcom/wiyun/engine/actions/ReverseTime; */
		 v1 = 		 (( com.wiyun.engine.actions.grid.GridAction ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/grid/GridAction;->nativeReverse()I
		 /* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ReverseTime;-><init>(I)V */
	 } // .end method
	 public native void setAmplitude ( Float p0 ) {
	 } // .end method
	 public native void setAmplitudeRate ( Float p0 ) {
	 } // .end method

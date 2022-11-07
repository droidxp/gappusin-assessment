public abstract class com.wiyun.engine.actions.CameraAction extends com.wiyun.engine.actions.IntervalAction {
	 /* .source "CameraAction.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.CameraAction ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 15 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* .line 16 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.CameraAction ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .prologue */
		 /* .line 12 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* .line 13 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.CameraAction ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 19 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 /* .line 20 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public com.wiyun.engine.actions.IntervalAction reverse ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 24 */
		 /* new-instance v0, Lcom/wiyun/engine/actions/ReverseTime; */
		 v1 = 		 (( com.wiyun.engine.actions.CameraAction ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/CameraAction;->nativeReverse()I
		 /* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ReverseTime;-><init>(I)V */
	 } // .end method

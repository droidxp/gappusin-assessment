class com.wiyun.engine.nodes.Director$1 extends android.os.Handler {
	 /* # instance fields */
	 final com.wiyun.engine.nodes.Director this$0; //synthetic
	 /* # direct methods */
	 com.wiyun.engine.nodes.Director$1 ( ) {
		 /* .locals 0 */
		 this.this$0 = p1;
		 /* invoke-direct {p0}, Landroid/os/Handler;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void handleMessage ( android.os.Message p0 ) {
		 /* .locals 2 */
		 /* iget v0, p1, Landroid/os/Message;->what:I */
		 /* packed-switch v0, :pswitch_data_0 */
		 /* invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V */
	 } // :goto_0
	 return;
	 /* :pswitch_0 */
	 v0 = this.obj;
	 /* check-cast v0, Landroid/view/View; */
	 int v1 = 0; // const/4 v1, 0x0
	 (( android.view.View ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
	 /* :pswitch_1 */
	 v0 = this.obj;
	 /* check-cast v0, Landroid/view/View; */
	 int v1 = 4; // const/4 v1, 0x4
	 (( android.view.View ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
	 /* nop */
	 /* :pswitch_data_0 */
	 /* .packed-switch 0x4 */
	 /* :pswitch_0 */
	 /* :pswitch_1 */
} // .end packed-switch
} // .end method

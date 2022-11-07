class com.wiyun.engine.nodes.Director$1 extends android.os.Handler {
	 /* .source "Director.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/wiyun/engine/nodes/Director; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.wiyun.engine.nodes.Director this$0; //synthetic
/* # direct methods */
 com.wiyun.engine.nodes.Director$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 193 */
/* invoke-direct {p0}, Landroid/os/Handler;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void handleMessage ( android.os.Message p0 ) {
/* .locals 2 */
/* .param p1, "msg" # Landroid/os/Message; */
/* .prologue */
/* .line 196 */
/* iget v0, p1, Landroid/os/Message;->what:I */
/* packed-switch v0, :pswitch_data_0 */
/* .line 204 */
/* invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V */
/* .line 207 */
} // :goto_0
return;
/* .line 198 */
/* :pswitch_0 */
v0 = this.obj;
/* check-cast v0, Landroid/view/View; */
int v1 = 0; // const/4 v1, 0x0
(( android.view.View ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
/* .line 201 */
/* :pswitch_1 */
v0 = this.obj;
/* check-cast v0, Landroid/view/View; */
int v1 = 4; // const/4 v1, 0x4
(( android.view.View ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V
/* .line 196 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x4 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method

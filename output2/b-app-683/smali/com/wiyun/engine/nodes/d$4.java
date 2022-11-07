class com.wiyun.engine.nodes.d$4 extends android.os.Handler {
	 /* .source "_A.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/wiyun/engine/nodes/d;->a()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # direct methods */
 com.wiyun.engine.nodes.d$4 ( ) {
/* .locals 0 */
/* .param p1, "$anonymous0" # Landroid/os/Looper; */
/* .prologue */
/* .line 2036 */
/* invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
/* .line 1 */
return;
} // .end method
/* # virtual methods */
public void handleMessage ( android.os.Message p0 ) {
/* .locals 1 */
/* .param p1, "msg" # Landroid/os/Message; */
/* .prologue */
/* .line 2038 */
/* iget v0, p1, Landroid/os/Message;->what:I */
/* packed-switch v0, :pswitch_data_0 */
/* .line 2049 */
} // :goto_0
return;
/* .line 2041 */
/* :pswitch_0 */
try { // :try_start_0
v0 = this.obj;
/* check-cast v0, Lcom/wiyun/engine/nodes/d$b; */
com.wiyun.engine.nodes.d .a ( v0 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 2042 */
/* :catch_0 */
/* move-exception v0 */
/* .line 2046 */
/* :pswitch_1 */
v0 = this.obj;
/* check-cast v0, Landroid/content/Intent; */
com.wiyun.engine.nodes.d .b ( v0 );
/* .line 2038 */
/* :pswitch_data_0 */
/* .packed-switch 0x6f */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method

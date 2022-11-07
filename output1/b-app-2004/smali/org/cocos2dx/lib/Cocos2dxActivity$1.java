class org.cocos2dx.lib.Cocos2dxActivity$1 extends android.os.Handler {
	 /* .source "Cocos2dxActivity.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lorg/cocos2dx/lib/Cocos2dxActivity;->onCreate(Landroid/os/Bundle;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final org.cocos2dx.lib.Cocos2dxActivity this$0; //synthetic
/* # direct methods */
 org.cocos2dx.lib.Cocos2dxActivity$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 67 */
/* invoke-direct {p0}, Landroid/os/Handler;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void handleMessage ( android.os.Message p0 ) {
/* .locals 3 */
/* .param p1, "msg" # Landroid/os/Message; */
/* .prologue */
/* .line 69 */
/* iget v0, p1, Landroid/os/Message;->what:I */
/* packed-switch v0, :pswitch_data_0 */
/* .line 74 */
} // :goto_0
return;
/* .line 71 */
/* :pswitch_0 */
v1 = this.this$0;
v0 = this.obj;
/* check-cast v0, Lorg/cocos2dx/lib/DialogMessage; */
v2 = this.title;
v0 = this.obj;
/* check-cast v0, Lorg/cocos2dx/lib/DialogMessage; */
v0 = this.message;
org.cocos2dx.lib.Cocos2dxActivity .access$0 ( v1,v2,v0 );
/* .line 69 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method

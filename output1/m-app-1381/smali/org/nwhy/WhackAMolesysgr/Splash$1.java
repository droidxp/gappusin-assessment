class org.nwhy.WhackAMolesysgr.Splash$1 extends android.os.Handler {
	 /* .source "Splash.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/nwhy/WhackAMolesysgr/Splash; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final org.nwhy.WhackAMolesysgr.Splash this$0; //synthetic
/* # direct methods */
 org.nwhy.WhackAMolesysgr.Splash$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 21 */
/* invoke-direct {p0}, Landroid/os/Handler;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void handleMessage ( android.os.Message p0 ) {
/* .locals 3 */
/* .param p1, "msg" # Landroid/os/Message; */
/* .prologue */
/* .line 23 */
/* invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V */
/* .line 24 */
/* iget v1, p1, Landroid/os/Message;->what:I */
/* packed-switch v1, :pswitch_data_0 */
/* .line 31 */
} // :goto_0
return;
/* .line 26 */
/* :pswitch_0 */
/* new-instance v0, Landroid/content/Intent; */
v1 = this.this$0;
/* const-class v2, Lorg/nwhy/WhackAMolesysgr/WhackAMole; */
/* invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* .line 27 */
/* .local v0, "intent":Landroid/content/Intent; */
v1 = this.this$0;
(( org.nwhy.WhackAMolesysgr.Splash ) v1 ).startActivity ( v0 ); // invoke-virtual {v1, v0}, Lorg/nwhy/WhackAMolesysgr/Splash;->startActivity(Landroid/content/Intent;)V
/* .line 28 */
v1 = this.this$0;
(( org.nwhy.WhackAMolesysgr.Splash ) v1 ).finish ( ); // invoke-virtual {v1}, Lorg/nwhy/WhackAMolesysgr/Splash;->finish()V
/* .line 24 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method

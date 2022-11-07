class org.nwhy.WhackAMolesysgr.Splash$2 extends java.util.TimerTask {
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
 org.nwhy.WhackAMolesysgr.Splash$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 34 */
/* invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 36 */
/* new-instance v0, Landroid/os/Message; */
/* invoke-direct {v0}, Landroid/os/Message;-><init>()V */
/* .line 37 */
/* .local v0, "msg":Landroid/os/Message; */
int v1 = 0; // const/4 v1, 0x0
/* iput v1, v0, Landroid/os/Message;->what:I */
/* .line 38 */
v1 = this.this$0;
v1 = this.upHandler;
(( android.os.Handler ) v1 ).sendMessage ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
/* .line 39 */
return;
} // .end method

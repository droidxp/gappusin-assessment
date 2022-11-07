class de.nurogames.android.ticb.base.views.TinyBeeView$RefreshHandler extends android.os.Handler {
	 /* .source "TinyBeeView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lde/nurogames/android/ticb/base/views/TinyBeeView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "RefreshHandler" */
} // .end annotation
/* # instance fields */
final de.nurogames.android.ticb.base.views.TinyBeeView this$0; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.views.TinyBeeView$RefreshHandler ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1538 */
this.this$0 = p1;
/* invoke-direct {p0}, Landroid/os/Handler;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void handleMessage ( android.os.Message p0 ) {
/* .locals 1 */
/* .param p1, "msg" # Landroid/os/Message; */
/* .prologue */
/* .line 1542 */
v0 = this.this$0;
v0 = this.updateThread;
(( java.lang.Thread ) v0 ).run ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->run()V
/* .line 1543 */
v0 = this.this$0;
(( de.nurogames.android.ticb.base.views.TinyBeeView ) v0 ).invalidate ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/views/TinyBeeView;->invalidate()V
/* .line 1544 */
return;
} // .end method
public void sleep ( Long p0 ) {
/* .locals 1 */
/* .param p1, "delayMillis" # J */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 1547 */
(( de.nurogames.android.ticb.base.views.TinyBeeView$RefreshHandler ) p0 ).removeMessages ( v0 ); // invoke-virtual {p0, v0}, Lde/nurogames/android/ticb/base/views/TinyBeeView$RefreshHandler;->removeMessages(I)V
/* .line 1548 */
(( de.nurogames.android.ticb.base.views.TinyBeeView$RefreshHandler ) p0 ).sendEmptyMessageDelayed ( v0, p1, p2 ); // invoke-virtual {p0, v0, p1, p2}, Lde/nurogames/android/ticb/base/views/TinyBeeView$RefreshHandler;->sendEmptyMessageDelayed(IJ)Z
/* .line 1549 */
return;
} // .end method

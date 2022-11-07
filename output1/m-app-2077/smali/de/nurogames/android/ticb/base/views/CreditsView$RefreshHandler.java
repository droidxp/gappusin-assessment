class de.nurogames.android.ticb.base.views.CreditsView$RefreshHandler extends android.os.Handler {
	 /* .source "CreditsView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lde/nurogames/android/ticb/base/views/CreditsView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "RefreshHandler" */
} // .end annotation
/* # instance fields */
final de.nurogames.android.ticb.base.views.CreditsView this$0; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.views.CreditsView$RefreshHandler ( ) {
/* .locals 0 */
/* .prologue */
/* .line 371 */
this.this$0 = p1;
/* invoke-direct {p0}, Landroid/os/Handler;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void handleMessage ( android.os.Message p0 ) {
/* .locals 1 */
/* .param p1, "msg" # Landroid/os/Message; */
/* .prologue */
/* .line 375 */
v0 = this.this$0;
(( de.nurogames.android.ticb.base.views.CreditsView ) v0 ).update ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/views/CreditsView;->update()V
/* .line 376 */
v0 = this.this$0;
(( de.nurogames.android.ticb.base.views.CreditsView ) v0 ).invalidate ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/views/CreditsView;->invalidate()V
/* .line 377 */
return;
} // .end method
public void sleep ( Long p0 ) {
/* .locals 1 */
/* .param p1, "delayMillis" # J */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 380 */
(( de.nurogames.android.ticb.base.views.CreditsView$RefreshHandler ) p0 ).removeMessages ( v0 ); // invoke-virtual {p0, v0}, Lde/nurogames/android/ticb/base/views/CreditsView$RefreshHandler;->removeMessages(I)V
/* .line 381 */
(( de.nurogames.android.ticb.base.views.CreditsView$RefreshHandler ) p0 ).obtainMessage ( v0 ); // invoke-virtual {p0, v0}, Lde/nurogames/android/ticb/base/views/CreditsView$RefreshHandler;->obtainMessage(I)Landroid/os/Message;
(( de.nurogames.android.ticb.base.views.CreditsView$RefreshHandler ) p0 ).sendMessageDelayed ( v0, p1, p2 ); // invoke-virtual {p0, v0, p1, p2}, Lde/nurogames/android/ticb/base/views/CreditsView$RefreshHandler;->sendMessageDelayed(Landroid/os/Message;J)Z
/* .line 382 */
return;
} // .end method

class de.nurogames.android.ticb.base.views.InAppPurchaseView$RefreshHandler extends android.os.Handler {
	 /* .source "InAppPurchaseView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lde/nurogames/android/ticb/base/views/InAppPurchaseView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "RefreshHandler" */
} // .end annotation
/* # instance fields */
final de.nurogames.android.ticb.base.views.InAppPurchaseView this$0; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.views.InAppPurchaseView$RefreshHandler ( ) {
/* .locals 0 */
/* .prologue */
/* .line 401 */
this.this$0 = p1;
/* invoke-direct {p0}, Landroid/os/Handler;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void handleMessage ( android.os.Message p0 ) {
/* .locals 1 */
/* .param p1, "msg" # Landroid/os/Message; */
/* .prologue */
/* .line 405 */
v0 = this.this$0;
(( de.nurogames.android.ticb.base.views.InAppPurchaseView ) v0 ).update ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->update()V
/* .line 406 */
v0 = this.this$0;
(( de.nurogames.android.ticb.base.views.InAppPurchaseView ) v0 ).invalidate ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->invalidate()V
/* .line 407 */
return;
} // .end method
public void sleep ( Long p0 ) {
/* .locals 1 */
/* .param p1, "delayMillis" # J */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 410 */
(( de.nurogames.android.ticb.base.views.InAppPurchaseView$RefreshHandler ) p0 ).removeMessages ( v0 ); // invoke-virtual {p0, v0}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$RefreshHandler;->removeMessages(I)V
/* .line 411 */
(( de.nurogames.android.ticb.base.views.InAppPurchaseView$RefreshHandler ) p0 ).obtainMessage ( v0 ); // invoke-virtual {p0, v0}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$RefreshHandler;->obtainMessage(I)Landroid/os/Message;
(( de.nurogames.android.ticb.base.views.InAppPurchaseView$RefreshHandler ) p0 ).sendMessageDelayed ( v0, p1, p2 ); // invoke-virtual {p0, v0, p1, p2}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$RefreshHandler;->sendMessageDelayed(Landroid/os/Message;J)Z
/* .line 412 */
return;
} // .end method

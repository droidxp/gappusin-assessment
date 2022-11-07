class de.nurogames.android.ticb.base.views.TinyBeeView$7 extends com.chartboost.sdk.ChartBoostDelegate {
	 /* .source "TinyBeeView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lde/nurogames/android/ticb/base/views/TinyBeeView;->showAdBannerEndExitToMenu()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final de.nurogames.android.ticb.base.views.TinyBeeView this$0; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.views.TinyBeeView$7 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 1497 */
/* invoke-direct {p0}, Lcom/chartboost/sdk/ChartBoostDelegate;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void didClickInterstitial ( android.view.View p0 ) {
/* .locals 2 */
/* .param p1, "interstitialView" # Landroid/view/View; */
/* .prologue */
/* .line 1515 */
v0 = java.lang.System.out;
final String v1 = "CHARTBOOST INTERSTITIAL click!!!"; // const-string v1, "CHARTBOOST INTERSTITIAL click!!!"
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 1516 */
return;
} // .end method
public void didCloseInterstitial ( android.view.View p0 ) {
/* .locals 2 */
/* .param p1, "interstitialView" # Landroid/view/View; */
/* .prologue */
/* .line 1505 */
v0 = java.lang.System.out;
final String v1 = "CHARTBOOST INTERSTITIAL close!!!"; // const-string v1, "CHARTBOOST INTERSTITIAL close!!!"
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 1506 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
(( de.nurogames.android.ticb.base.objects.objBee ) v0 ).init ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/objects/objBee;->init()V
/* .line 1507 */
int v0 = 1; // const/4 v0, 0x1
de.nurogames.android.ticb.base.tinysanta .flipView ( v0 );
/* .line 1508 */
return;
} // .end method
public void didDismissInterstitial ( android.view.View p0 ) {
/* .locals 2 */
/* .param p1, "interstitialView" # Landroid/view/View; */
/* .prologue */
/* .line 1510 */
v0 = java.lang.System.out;
final String v1 = "CHARTBOOST INTERSTITIAL dismiss!!!"; // const-string v1, "CHARTBOOST INTERSTITIAL dismiss!!!"
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 1511 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
(( de.nurogames.android.ticb.base.objects.objBee ) v0 ).init ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/objects/objBee;->init()V
/* .line 1512 */
int v0 = 1; // const/4 v0, 0x1
de.nurogames.android.ticb.base.tinysanta .flipView ( v0 );
/* .line 1513 */
return;
} // .end method
public void didFailToLoadInterstitial ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1500 */
v0 = java.lang.System.out;
final String v1 = "CHARTBOOST INTERSTITIAL failed!!!"; // const-string v1, "CHARTBOOST INTERSTITIAL failed!!!"
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 1501 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
(( de.nurogames.android.ticb.base.objects.objBee ) v0 ).init ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/objects/objBee;->init()V
/* .line 1502 */
int v0 = 1; // const/4 v0, 0x1
de.nurogames.android.ticb.base.tinysanta .flipView ( v0 );
/* .line 1503 */
return;
} // .end method

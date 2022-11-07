public class de.nurogames.android.ticb.tbActivity extends android.app.Activity {
	 /* .source "tbActivity.java" */
	 /* # static fields */
	 public static android.app.Activity mAct;
	 /* # instance fields */
	 android.os.PowerManager$WakeLock wl;
	 /* # direct methods */
	 public de.nurogames.android.ticb.tbActivity ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 14 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 6 */
		 /* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
		 /* .prologue */
		 int v5 = 1; // const/4 v5, 0x1
		 int v4 = 0; // const/4 v4, 0x0
		 /* .line 24 */
		 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
		 /* .line 25 */
		 v2 = java.lang.System.out;
		 final String v3 = "TinySanta->Demo->Activity created!"; // const-string v3, "TinySanta->Demo->Activity created!"
		 (( java.io.PrintStream ) v2 ).println ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
		 /* .line 27 */
		 /* .line 29 */
		 final String v2 = "power"; // const-string v2, "power"
		 (( de.nurogames.android.ticb.tbActivity ) p0 ).getSystemService ( v2 ); // invoke-virtual {p0, v2}, Lde/nurogames/android/ticb/tbActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v1, Landroid/os/PowerManager; */
		 /* .line 30 */
		 /* .local v1, "pm":Landroid/os/PowerManager; */
		 /* const/16 v2, 0x1a */
		 final String v3 = "DoNjfdhotDimScreen"; // const-string v3, "DoNjfdhotDimScreen"
		 (( android.os.PowerManager ) v1 ).newWakeLock ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
		 this.wl = v2;
		 /* .line 41 */
		 de.nurogames.android.ticb.base.core.AppResources.use_hellowin = (v5!= 0);
		 /* .line 42 */
		 final String v2 = "PLEASE_ENTER_APP_ID"; // const-string v2, "PLEASE_ENTER_APP_ID"
		 /* .line 44 */
		 de.nurogames.android.ticb.base.core.AppResources.use_flurry = (v4!= 0);
		 /* .line 45 */
		 final String v2 = ""; // const-string v2, ""
		 /* .line 47 */
		 de.nurogames.android.ticb.base.core.AppResources.use_facebook = (v4!= 0);
		 /* .line 48 */
		 final String v2 = ""; // const-string v2, ""
		 /* .line 50 */
		 de.nurogames.android.ticb.base.core.AppResources.use_pocketchange = (v4!= 0);
		 /* .line 51 */
		 final String v2 = ""; // const-string v2, ""
		 /* .line 53 */
		 de.nurogames.android.ticb.base.core.AppResources.use_chartboost = (v5!= 0);
		 /* .line 54 */
		 final String v2 = "526123bd16ba474437000001"; // const-string v2, "526123bd16ba474437000001"
		 /* .line 55 */
		 final String v2 = "12052f871c71dd54b8a52d7e41f37b1d82fc6ba0"; // const-string v2, "12052f871c71dd54b8a52d7e41f37b1d82fc6ba0"
		 /* .line 57 */
		 de.nurogames.android.ticb.base.core.AppResources.use_mobclix = (v4!= 0);
		 /* .line 58 */
		 final String v2 = ""; // const-string v2, ""
		 /* .line 60 */
		 de.nurogames.android.ticb.base.core.AppResources.use_openfeint = (v4!= 0);
		 /* .line 61 */
		 final String v2 = "Tiny Santa"; // const-string v2, "Tiny Santa"
		 /* .line 62 */
		 final String v2 = ""; // const-string v2, ""
		 /* .line 63 */
		 final String v2 = ""; // const-string v2, ""
		 /* .line 64 */
		 final String v2 = ""; // const-string v2, ""
		 /* .line 67 */
		 de.nurogames.android.ticb.base.core.AppResources.use_wasabi_sdk = (v4!= 0);
		 /* .line 70 */
		 de.nurogames.android.ticb.base.core.AppResources.use_inapp_market = (v4!= 0);
		 /* .line 73 */
		 de.nurogames.android.ticb.base.core.AppResources.use_crosspromo_shop = (v5!= 0);
		 /* .line 76 */
		 de.nurogames.android.ticb.base.core.AppResources.AMAZON_BUILD = (v4!= 0);
		 /* .line 79 */
		 de.nurogames.android.ticb.base.core.AppResources.TELEKOM_BUILD = (v4!= 0);
		 /* .line 82 */
		 /* .line 84 */
		 /* new-instance v0, Landroid/content/Intent; */
		 /* const-class v2, Lde/nurogames/android/ticb/base/tinysanta; */
		 /* invoke-direct {v0, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
		 /* .line 85 */
		 /* .local v0, "intent":Landroid/content/Intent; */
		 /* const/high16 v2, 0x20000000 */
		 (( android.content.Intent ) v0 ).addFlags ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
		 /* .line 86 */
		 (( de.nurogames.android.ticb.tbActivity ) p0 ).startActivity ( v0 ); // invoke-virtual {p0, v0}, Lde/nurogames/android/ticb/tbActivity;->startActivity(Landroid/content/Intent;)V
		 /* .line 88 */
		 (( de.nurogames.android.ticb.tbActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/tbActivity;->finish()V
		 /* .line 90 */
		 return;
	 } // .end method
	 protected void onDestroy ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 125 */
		 /* invoke-super {p0}, Landroid/app/Activity;->onDestroy()V */
		 /* .line 126 */
		 v0 = java.lang.System.out;
		 final String v1 = "TinySanta->Demo->Activity destroyed!"; // const-string v1, "TinySanta->Demo->Activity destroyed!"
		 (( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
		 /* .line 127 */
		 (( de.nurogames.android.ticb.tbActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/tbActivity;->finish()V
		 /* .line 128 */
		 return;
	 } // .end method
	 protected void onPause ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 100 */
		 v0 = java.lang.System.out;
		 final String v1 = "TinySanta->Demo->Activity paused!"; // const-string v1, "TinySanta->Demo->Activity paused!"
		 (( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
		 /* .line 101 */
		 /* invoke-super {p0}, Landroid/app/Activity;->onPause()V */
		 /* .line 103 */
		 v0 = this.wl;
		 (( android.os.PowerManager$WakeLock ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V
		 /* .line 105 */
		 return;
	 } // .end method
	 protected void onResume ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 109 */
		 v0 = java.lang.System.out;
		 final String v1 = "TinySanta->Demo->Activity resumed!"; // const-string v1, "TinySanta->Demo->Activity resumed!"
		 (( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
		 /* .line 110 */
		 /* invoke-super {p0}, Landroid/app/Activity;->onResume()V */
		 /* .line 112 */
		 v0 = this.wl;
		 (( android.os.PowerManager$WakeLock ) v0 ).acquire ( ); // invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V
		 /* .line 114 */
		 return;
	 } // .end method
	 protected void onStart ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 94 */
		 v0 = java.lang.System.out;
		 final String v1 = "TinySanta->Demo->Activity started!"; // const-string v1, "TinySanta->Demo->Activity started!"
		 (( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
		 /* .line 95 */
		 /* invoke-super {p0}, Landroid/app/Activity;->onStart()V */
		 /* .line 96 */
		 return;
	 } // .end method
	 protected void onStop ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 118 */
		 /* invoke-super {p0}, Landroid/app/Activity;->onStop()V */
		 /* .line 119 */
		 v0 = java.lang.System.out;
		 final String v1 = "TinySanta->Demo->Activity stopped!"; // const-string v1, "TinySanta->Demo->Activity stopped!"
		 (( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
		 /* .line 120 */
		 (( de.nurogames.android.ticb.tbActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/tbActivity;->finish()V
		 /* .line 121 */
		 return;
	 } // .end method

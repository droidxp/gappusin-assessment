class de.nurogames.android.ticb.base.core.FlurryAnalyticsManager$1 implements java.lang.Runnable {
	 /* .source "FlurryAnalyticsManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lde/nurogames/android/ticb/base/core/FlurryAnalyticsManager;->logEvent(Ljava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
private final java.lang.String val$eventId; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.core.FlurryAnalyticsManager$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.val$eventId = p1;
/* .line 43 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 1 */
/* .prologue */
/* .line 45 */
v0 = this.val$eventId;
com.flurry.android.FlurryAgent .logEvent ( v0 );
/* .line 46 */
return;
} // .end method

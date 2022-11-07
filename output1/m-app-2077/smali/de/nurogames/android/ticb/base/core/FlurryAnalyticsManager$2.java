class de.nurogames.android.ticb.base.core.FlurryAnalyticsManager$2 implements java.lang.Runnable {
	 /* .source "FlurryAnalyticsManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lde/nurogames/android/ticb/base/core/FlurryAnalyticsManager;->logEvent(Ljava/lang/String;Z)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
private final java.lang.String val$eventId; //synthetic
private final Boolean val$timed; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.core.FlurryAnalyticsManager$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.val$eventId = p1;
/* iput-boolean p2, p0, Lde/nurogames/android/ticb/base/core/FlurryAnalyticsManager$2;->val$timed:Z */
/* .line 54 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 56 */
v0 = this.val$eventId;
/* iget-boolean v1, p0, Lde/nurogames/android/ticb/base/core/FlurryAnalyticsManager$2;->val$timed:Z */
com.flurry.android.FlurryAgent .logEvent ( v0,v1 );
/* .line 57 */
return;
} // .end method

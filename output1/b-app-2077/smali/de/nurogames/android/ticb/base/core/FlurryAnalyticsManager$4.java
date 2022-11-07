class de.nurogames.android.ticb.base.core.FlurryAnalyticsManager$4 implements java.lang.Runnable {
	 /* .source "FlurryAnalyticsManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lde/nurogames/android/ticb/base/core/FlurryAnalyticsManager;->logEvent(Ljava/lang/String;Ljava/util/Map;Z)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
private final java.lang.String val$eventId; //synthetic
private final java.util.Map val$parameters; //synthetic
private final Boolean val$timed; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.core.FlurryAnalyticsManager$4 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.val$eventId = p1;
this.val$parameters = p2;
/* iput-boolean p3, p0, Lde/nurogames/android/ticb/base/core/FlurryAnalyticsManager$4;->val$timed:Z */
/* .line 76 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 78 */
v0 = this.val$eventId;
v1 = this.val$parameters;
/* iget-boolean v2, p0, Lde/nurogames/android/ticb/base/core/FlurryAnalyticsManager$4;->val$timed:Z */
com.flurry.android.FlurryAgent .logEvent ( v0,v1,v2 );
/* .line 79 */
return;
} // .end method

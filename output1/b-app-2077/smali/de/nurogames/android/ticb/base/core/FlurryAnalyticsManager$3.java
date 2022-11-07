class de.nurogames.android.ticb.base.core.FlurryAnalyticsManager$3 implements java.lang.Runnable {
	 /* .source "FlurryAnalyticsManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lde/nurogames/android/ticb/base/core/FlurryAnalyticsManager;->logEvent(Ljava/lang/String;Ljava/util/Map;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
private final java.lang.String val$eventId; //synthetic
private final java.util.Map val$parameters; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.core.FlurryAnalyticsManager$3 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.val$eventId = p1;
this.val$parameters = p2;
/* .line 65 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 67 */
v0 = this.val$eventId;
v1 = this.val$parameters;
com.flurry.android.FlurryAgent .logEvent ( v0,v1 );
/* .line 68 */
return;
} // .end method

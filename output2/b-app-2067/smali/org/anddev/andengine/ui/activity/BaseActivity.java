public abstract class org.anddev.andengine.ui.activity.BaseActivity extends android.app.Activity {
	 /* # direct methods */
	 public org.anddev.andengine.ui.activity.BaseActivity ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void doAsync ( Integer p0, Integer p1, java.util.concurrent.Callable p2, org.anddev.andengine.util.Callback p3 ) {
		 /* .locals 6 */
		 int v5 = 0; // const/4 v5, 0x0
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v2, p2 */
		 /* move-object v3, p3 */
		 /* move-object v4, p4 */
		 /* invoke-virtual/range {v0 ..v5}, Lorg/anddev/andengine/ui/activity/BaseActivity;->doAsync(IILjava/util/concurrent/Callable;Lorg/anddev/andengine/util/Callback;Lorg/anddev/andengine/util/Callback;)V */
		 return;
	 } // .end method
	 protected void doAsync ( Integer p0, Integer p1, java.util.concurrent.Callable p2, org.anddev.andengine.util.Callback p3, org.anddev.andengine.util.Callback p4 ) {
		 /* .locals 0 */
		 /* invoke-static/range {p0 ..p5}, Lorg/anddev/andengine/util/ActivityUtils;->doAsync(Landroid/content/Context;IILjava/util/concurrent/Callable;Lorg/anddev/andengine/util/Callback;Lorg/anddev/andengine/util/Callback;)V */
		 return;
	 } // .end method
	 protected void doAsync ( Integer p0, Integer p1, org.anddev.andengine.util.AsyncCallable p2, org.anddev.andengine.util.Callback p3, org.anddev.andengine.util.Callback p4 ) {
		 /* .locals 0 */
		 /* invoke-static/range {p0 ..p5}, Lorg/anddev/andengine/util/ActivityUtils;->doAsync(Landroid/content/Context;IILorg/anddev/andengine/util/AsyncCallable;Lorg/anddev/andengine/util/Callback;Lorg/anddev/andengine/util/Callback;)V */
		 return;
	 } // .end method
	 protected void doProgressAsync ( Integer p0, org.anddev.andengine.util.progress.ProgressCallable p1, org.anddev.andengine.util.Callback p2 ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 (( org.anddev.andengine.ui.activity.BaseActivity ) p0 ).doProgressAsync ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Lorg/anddev/andengine/ui/activity/BaseActivity;->doProgressAsync(ILorg/anddev/andengine/util/progress/ProgressCallable;Lorg/anddev/andengine/util/Callback;Lorg/anddev/andengine/util/Callback;)V
		 return;
	 } // .end method
	 protected void doProgressAsync ( Integer p0, org.anddev.andengine.util.progress.ProgressCallable p1, org.anddev.andengine.util.Callback p2, org.anddev.andengine.util.Callback p3 ) {
		 /* .locals 0 */
		 org.anddev.andengine.util.ActivityUtils .doProgressAsync ( p0,p1,p2,p3,p4 );
		 return;
	 } // .end method

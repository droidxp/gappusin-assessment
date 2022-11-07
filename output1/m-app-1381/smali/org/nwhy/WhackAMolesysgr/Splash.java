public class org.nwhy.WhackAMolesysgr.Splash extends android.app.Activity {
	 /* .source "Splash.java" */
	 /* # instance fields */
	 private final Integer SPLASH_OK;
	 java.util.TimerTask task;
	 java.util.Timer timer;
	 android.os.Handler upHandler;
	 /* # direct methods */
	 public org.nwhy.WhackAMolesysgr.Splash ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 19 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 /* .line 20 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lorg/nwhy/WhackAMolesysgr/Splash;->SPLASH_OK:I */
		 /* .line 21 */
		 /* new-instance v0, Lorg/nwhy/WhackAMolesysgr/Splash$1; */
		 /* invoke-direct {v0, p0}, Lorg/nwhy/WhackAMolesysgr/Splash$1;-><init>(Lorg/nwhy/WhackAMolesysgr/Splash;)V */
		 this.upHandler = v0;
		 /* .line 33 */
		 /* new-instance v0, Ljava/util/Timer; */
		 /* invoke-direct {v0}, Ljava/util/Timer;-><init>()V */
		 this.timer = v0;
		 /* .line 34 */
		 /* new-instance v0, Lorg/nwhy/WhackAMolesysgr/Splash$2; */
		 /* invoke-direct {v0, p0}, Lorg/nwhy/WhackAMolesysgr/Splash$2;-><init>(Lorg/nwhy/WhackAMolesysgr/Splash;)V */
		 this.task = v0;
		 /* .line 19 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 4 */
		 /* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
		 /* .prologue */
		 /* .line 45 */
		 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
		 /* .line 46 */
		 org.nwhy.WhackAMolesysgr.ActivityUtil .noNotificationBar ( p0 );
		 /* .line 47 */
		 org.nwhy.WhackAMolesysgr.ActivityUtil .noTitleBar ( p0 );
		 /* .line 48 */
		 /* const/high16 v0, 0x7f030000 */
		 (( org.nwhy.WhackAMolesysgr.Splash ) p0 ).setContentView ( v0 ); // invoke-virtual {p0, v0}, Lorg/nwhy/WhackAMolesysgr/Splash;->setContentView(I)V
		 /* .line 49 */
		 v0 = this.timer;
		 v1 = this.task;
		 /* const-wide/16 v2, 0x9c4 */
		 (( java.util.Timer ) v0 ).schedule ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
		 /* .line 50 */
		 return;
	 } // .end method
	 public void onStop ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 54 */
		 /* invoke-super {p0}, Landroid/app/Activity;->onStop()V */
		 /* .line 55 */
		 v0 = this.timer;
		 (( java.util.Timer ) v0 ).cancel ( ); // invoke-virtual {v0}, Ljava/util/Timer;->cancel()V
		 /* .line 56 */
		 return;
	 } // .end method

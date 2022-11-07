class org.anddev.andengine.ui.activity.BaseSplashActivity$1 implements org.anddev.andengine.engine.handler.timer.ITimerCallback {
	 /* # interfaces */
	 /* # instance fields */
	 final org.anddev.andengine.ui.activity.BaseSplashActivity this$0; //synthetic
	 /* # direct methods */
	 org.anddev.andengine.ui.activity.BaseSplashActivity$1 ( ) {
		 /* .locals 0 */
		 this.this$0 = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onTimePassed ( org.anddev.andengine.engine.handler.timer.TimerHandler p0 ) {
		 /* .locals 4 */
		 v0 = this.this$0;
		 /* new-instance v1, Landroid/content/Intent; */
		 v2 = this.this$0;
		 v3 = this.this$0;
		 (( org.anddev.andengine.ui.activity.BaseSplashActivity ) v3 ).getFollowUpActivity ( ); // invoke-virtual {v3}, Lorg/anddev/andengine/ui/activity/BaseSplashActivity;->getFollowUpActivity()Ljava/lang/Class;
		 /* invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
		 (( org.anddev.andengine.ui.activity.BaseSplashActivity ) v0 ).startActivity ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/ui/activity/BaseSplashActivity;->startActivity(Landroid/content/Intent;)V
		 v0 = this.this$0;
		 (( org.anddev.andengine.ui.activity.BaseSplashActivity ) v0 ).finish ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/ui/activity/BaseSplashActivity;->finish()V
		 return;
	 } // .end method

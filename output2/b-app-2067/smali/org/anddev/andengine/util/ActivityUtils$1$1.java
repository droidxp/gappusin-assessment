class org.anddev.andengine.util.ActivityUtils$1$1 implements android.content.DialogInterface$OnCancelListener {
	 /* # interfaces */
	 /* # instance fields */
	 final org.anddev.andengine.util.ActivityUtils$1 this$1; //synthetic
	 private final org.anddev.andengine.util.Callback val$pExceptionCallback; //synthetic
	 /* # direct methods */
	 org.anddev.andengine.util.ActivityUtils$1$1 ( ) {
		 /* .locals 0 */
		 this.this$1 = p1;
		 this.val$pExceptionCallback = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onCancel ( android.content.DialogInterface p0 ) {
		 /* .locals 2 */
		 v0 = this.val$pExceptionCallback;
		 /* new-instance v1, Lorg/anddev/andengine/ui/activity/BaseActivity$CancelledException; */
		 /* invoke-direct {v1}, Lorg/anddev/andengine/ui/activity/BaseActivity$CancelledException;-><init>()V */
		 return;
	 } // .end method

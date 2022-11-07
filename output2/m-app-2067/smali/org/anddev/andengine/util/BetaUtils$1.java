class org.anddev.andengine.util.BetaUtils$1 implements android.content.DialogInterface$OnClickListener {
	 /* # interfaces */
	 /* # instance fields */
	 private final android.app.Activity val$pActivity; //synthetic
	 private final android.content.Intent val$pOkIntent; //synthetic
	 /* # direct methods */
	 org.anddev.andengine.util.BetaUtils$1 ( ) {
		 /* .locals 0 */
		 this.val$pOkIntent = p1;
		 this.val$pActivity = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
		 /* .locals 2 */
		 v0 = this.val$pOkIntent;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.val$pActivity;
			 v1 = this.val$pOkIntent;
			 (( android.app.Activity ) v0 ).startActivity ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
		 } // :cond_0
		 v0 = this.val$pActivity;
		 (( android.app.Activity ) v0 ).finish ( ); // invoke-virtual {v0}, Landroid/app/Activity;->finish()V
		 return;
	 } // .end method

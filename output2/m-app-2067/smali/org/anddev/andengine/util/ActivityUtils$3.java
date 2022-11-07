class org.anddev.andengine.util.ActivityUtils$3 implements org.anddev.andengine.util.Callback {
	 /* # interfaces */
	 /* # instance fields */
	 private final org.anddev.andengine.util.Callback val$pCallback; //synthetic
	 private final android.app.ProgressDialog val$pd; //synthetic
	 /* # direct methods */
	 org.anddev.andengine.util.ActivityUtils$3 ( ) {
		 /* .locals 0 */
		 this.val$pd = p1;
		 this.val$pCallback = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onCallback ( java.lang.Object p0 ) {
		 /* .locals 2 */
		 try { // :try_start_0
			 v0 = this.val$pd;
			 (( android.app.ProgressDialog ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 v0 = this.val$pCallback;
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 final String v1 = "Error"; // const-string v1, "Error"
		 org.anddev.andengine.util.Debug .e ( v1,v0 );
	 } // .end method

class org.anddev.andengine.util.ActivityUtils$1 extends android.os.AsyncTask {
	 /* # instance fields */
	 private java.lang.Exception mException;
	 private android.app.ProgressDialog mPD;
	 private final java.util.concurrent.Callable val$pCallable; //synthetic
	 private final org.anddev.andengine.util.Callback val$pCallback; //synthetic
	 private final Boolean val$pCancelable; //synthetic
	 private final android.content.Context val$pContext; //synthetic
	 private final org.anddev.andengine.util.Callback val$pExceptionCallback; //synthetic
	 private final java.lang.CharSequence val$pMessage; //synthetic
	 private final java.lang.CharSequence val$pTitle; //synthetic
	 /* # direct methods */
	 org.anddev.andengine.util.ActivityUtils$1 ( ) {
		 /* .locals 1 */
		 this.val$pContext = p1;
		 this.val$pTitle = p2;
		 this.val$pMessage = p3;
		 /* iput-boolean p4, p0, Lorg/anddev/andengine/util/ActivityUtils$1;->val$pCancelable:Z */
		 this.val$pCallable = p5;
		 this.val$pCallback = p6;
		 this.val$pExceptionCallback = p7;
		 /* invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 this.mException = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object doInBackground ( java.lang.Object...p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* check-cast p1, [Ljava/lang/Void; */
		 (( org.anddev.andengine.util.ActivityUtils$1 ) p0 ).doInBackground ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/util/ActivityUtils$1;->doInBackground([Ljava/lang/Void;)Ljava/lang/Object;
	 } // .end method
	 public java.lang.Object doInBackground ( java.lang.Void...p0 ) {
		 /* .locals 1 */
		 try { // :try_start_0
			 v0 = this.val$pCallable;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 /* :catch_0 */
		 /* move-exception v0 */
		 this.mException = v0;
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public void onPostExecute ( java.lang.Object p0 ) {
		 /* .locals 2 */
		 try { // :try_start_0
			 v0 = this.mPD;
			 (( android.app.ProgressDialog ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 v0 = 		 (( org.anddev.andengine.util.ActivityUtils$1 ) p0 ).isCancelled ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/ActivityUtils$1;->isCancelled()Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* new-instance v0, Lorg/anddev/andengine/ui/activity/BaseActivity$CancelledException; */
			 /* invoke-direct {v0}, Lorg/anddev/andengine/ui/activity/BaseActivity$CancelledException;-><init>()V */
			 this.mException = v0;
		 } // :cond_0
		 v0 = this.mException;
		 /* if-nez v0, :cond_1 */
		 v0 = this.val$pCallback;
	 } // :goto_1
	 /* invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V */
	 return;
	 /* :catch_0 */
	 /* move-exception v0 */
	 final String v1 = "Error"; // const-string v1, "Error"
	 org.anddev.andengine.util.Debug .e ( v1,v0 );
} // :cond_1
v0 = this.val$pExceptionCallback;
/* if-nez v0, :cond_2 */
final String v0 = "Error"; // const-string v0, "Error"
v1 = this.mException;
org.anddev.andengine.util.Debug .e ( v0,v1 );
} // :cond_2
v0 = this.val$pExceptionCallback;
v1 = this.mException;
} // .end method
public void onPreExecute ( ) {
/* .locals 5 */
v0 = this.val$pContext;
v1 = this.val$pTitle;
v2 = this.val$pMessage;
int v3 = 1; // const/4 v3, 0x1
/* iget-boolean v4, p0, Lorg/anddev/andengine/util/ActivityUtils$1;->val$pCancelable:Z */
android.app.ProgressDialog .show ( v0,v1,v2,v3,v4 );
this.mPD = v0;
/* iget-boolean v0, p0, Lorg/anddev/andengine/util/ActivityUtils$1;->val$pCancelable:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mPD;
/* new-instance v1, Lorg/anddev/andengine/util/ActivityUtils$1$1; */
v2 = this.val$pExceptionCallback;
/* invoke-direct {v1, p0, v2}, Lorg/anddev/andengine/util/ActivityUtils$1$1;-><init>(Lorg/anddev/andengine/util/ActivityUtils$1;Lorg/anddev/andengine/util/Callback;)V */
(( android.app.ProgressDialog ) v0 ).setOnCancelListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V
} // :cond_0
/* invoke-super {p0}, Landroid/os/AsyncTask;->onPreExecute()V */
return;
} // .end method

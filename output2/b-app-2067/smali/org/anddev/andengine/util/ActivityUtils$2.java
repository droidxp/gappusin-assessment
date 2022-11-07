class org.anddev.andengine.util.ActivityUtils$2 extends android.os.AsyncTask {
	 /* # instance fields */
	 private java.lang.Exception mException;
	 private android.app.ProgressDialog mPD;
	 private final org.anddev.andengine.util.progress.ProgressCallable val$pCallable; //synthetic
	 private final org.anddev.andengine.util.Callback val$pCallback; //synthetic
	 private final android.content.Context val$pContext; //synthetic
	 private final org.anddev.andengine.util.Callback val$pExceptionCallback; //synthetic
	 private final Integer val$pTitleResID; //synthetic
	 /* # direct methods */
	 org.anddev.andengine.util.ActivityUtils$2 ( ) {
		 /* .locals 1 */
		 this.val$pContext = p1;
		 /* iput p2, p0, Lorg/anddev/andengine/util/ActivityUtils$2;->val$pTitleResID:I */
		 this.val$pCallable = p3;
		 this.val$pCallback = p4;
		 this.val$pExceptionCallback = p5;
		 /* invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 this.mException = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object doInBackground ( java.lang.Object...p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* check-cast p1, [Ljava/lang/Void; */
		 (( org.anddev.andengine.util.ActivityUtils$2 ) p0 ).doInBackground ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/util/ActivityUtils$2;->doInBackground([Ljava/lang/Void;)Ljava/lang/Object;
	 } // .end method
	 public java.lang.Object doInBackground ( java.lang.Void...p0 ) {
		 /* .locals 2 */
		 try { // :try_start_0
			 v0 = this.val$pCallable;
			 /* new-instance v1, Lorg/anddev/andengine/util/ActivityUtils$2$1; */
			 /* invoke-direct {v1, p0}, Lorg/anddev/andengine/util/ActivityUtils$2$1;-><init>(Lorg/anddev/andengine/util/ActivityUtils$2;)V */
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
		 v0 = 		 (( org.anddev.andengine.util.ActivityUtils$2 ) p0 ).isCancelled ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/util/ActivityUtils$2;->isCancelled()Z
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
/* .locals 2 */
/* new-instance v0, Landroid/app/ProgressDialog; */
v1 = this.val$pContext;
/* invoke-direct {v0, v1}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V */
this.mPD = v0;
v0 = this.mPD;
/* iget v1, p0, Lorg/anddev/andengine/util/ActivityUtils$2;->val$pTitleResID:I */
(( android.app.ProgressDialog ) v0 ).setTitle ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setTitle(I)V
v0 = this.mPD;
/* const v1, 0x108004e */
(( android.app.ProgressDialog ) v0 ).setIcon ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setIcon(I)V
v0 = this.mPD;
int v1 = 0; // const/4 v1, 0x0
(( android.app.ProgressDialog ) v0 ).setIndeterminate ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V
v0 = this.mPD;
int v1 = 1; // const/4 v1, 0x1
(( android.app.ProgressDialog ) v0 ).setProgressStyle ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setProgressStyle(I)V
v0 = this.mPD;
(( android.app.ProgressDialog ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V
/* invoke-super {p0}, Landroid/os/AsyncTask;->onPreExecute()V */
return;
} // .end method
public void onProgressUpdate ( java.lang.Integer...p0 ) {
/* .locals 2 */
v0 = this.mPD;
int v1 = 0; // const/4 v1, 0x0
/* aget-object v1, p1, v1 */
v1 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
(( android.app.ProgressDialog ) v0 ).setProgress ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setProgress(I)V
return;
} // .end method
public void onProgressUpdate ( java.lang.Object...p0 ) { //bridge//synthethic
/* .locals 0 */
/* check-cast p1, [Ljava/lang/Integer; */
(( org.anddev.andengine.util.ActivityUtils$2 ) p0 ).onProgressUpdate ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/util/ActivityUtils$2;->onProgressUpdate([Ljava/lang/Integer;)V
return;
} // .end method

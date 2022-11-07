class de.nurogames.android.ticb.base.core.UpdateMngr$2 implements android.view.View$OnClickListener {
	 /* .source "UpdateMngr.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lde/nurogames/android/ticb/base/core/UpdateMngr;->checkUpdateIsNewer()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final de.nurogames.android.ticb.base.core.UpdateMngr this$0; //synthetic
private final android.app.Dialog val$dialog; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.core.UpdateMngr$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
this.val$dialog = p2;
/* .line 119 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 6 */
/* .param p1, "v" # Landroid/view/View; */
/* .prologue */
int v5 = 1; // const/4 v5, 0x1
int v4 = 0; // const/4 v4, 0x0
/* .line 123 */
v1 = this.this$0;
v1 = this.mProgressDialog;
v2 = this.this$0;
de.nurogames.android.ticb.base.core.UpdateMngr .access$0 ( v2 );
(( android.app.Activity ) v2 ).getResources ( ); // invoke-virtual {v2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getStringArray ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v2, v2, v3 */
(( android.app.ProgressDialog ) v1 ).setMessage ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V
/* .line 125 */
v1 = this.this$0;
v1 = this.mProgressDialog;
(( android.app.ProgressDialog ) v1 ).setIndeterminate ( v4 ); // invoke-virtual {v1, v4}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V
/* .line 126 */
v1 = this.this$0;
v1 = this.mProgressDialog;
/* const/16 v2, 0x64 */
(( android.app.ProgressDialog ) v1 ).setMax ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/ProgressDialog;->setMax(I)V
/* .line 127 */
v1 = this.this$0;
v1 = this.mProgressDialog;
(( android.app.ProgressDialog ) v1 ).setProgressStyle ( v5 ); // invoke-virtual {v1, v5}, Landroid/app/ProgressDialog;->setProgressStyle(I)V
/* .line 128 */
/* new-instance v0, Lde/nurogames/android/ticb/base/core/UpdateMngr$DownloadFile; */
v1 = this.this$0;
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v0, v1, v2}, Lde/nurogames/android/ticb/base/core/UpdateMngr$DownloadFile;-><init>(Lde/nurogames/android/ticb/base/core/UpdateMngr;Lde/nurogames/android/ticb/base/core/UpdateMngr$DownloadFile;)V */
/* .line 129 */
/* .local v0, "downloadFile":Lde/nurogames/android/ticb/base/core/UpdateMngr$DownloadFile; */
/* new-array v1, v5, [Ljava/lang/String; */
/* new-instance v2, Ljava/lang/StringBuilder; */
v3 = this.this$0;
de.nurogames.android.ticb.base.core.UpdateMngr .access$1 ( v3 );
java.lang.String .valueOf ( v3 );
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v3 = "/"; // const-string v3, "/"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = de.nurogames.android.ticb.base.core.AppResources.APP_PACKAGE;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* aput-object v2, v1, v4 */
(( de.nurogames.android.ticb.base.core.UpdateMngr$DownloadFile ) v0 ).execute ( v1 ); // invoke-virtual {v0, v1}, Lde/nurogames/android/ticb/base/core/UpdateMngr$DownloadFile;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
/* .line 131 */
v1 = this.this$0;
v1 = this.mProgressDialog;
(( android.app.ProgressDialog ) v1 ).show ( ); // invoke-virtual {v1}, Landroid/app/ProgressDialog;->show()V
/* .line 133 */
v1 = this.val$dialog;
(( android.app.Dialog ) v1 ).dismiss ( ); // invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V
/* .line 135 */
return;
} // .end method

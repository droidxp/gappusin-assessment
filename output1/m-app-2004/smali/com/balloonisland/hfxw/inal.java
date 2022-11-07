class inal implements com.facebook.android.Facebook$DialogListener {
	 /* .source "StarGems.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/balloonisland/hfxw/StarGems; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x12 */
/* name = "LoginDialogListener" */
} // .end annotation
/* # instance fields */
final com.balloonisland.hfxw.StarGems this$0; //synthetic
/* # direct methods */
private inal ( ) {
/* .locals 0 */
/* .prologue */
/* .line 496 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 inal ( ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 496 */
/* invoke-direct {p0, p1}, Lcom/balloonisland/hfxw/StarGems$LoginDialogListener;-><init>(Lcom/balloonisland/hfxw/StarGems;)V */
return;
} // .end method
/* # virtual methods */
public void onCancel ( ) {
/* .locals 2 */
/* .prologue */
/* .line 517 */
final String v0 = "LoginDialogListener"; // const-string v0, "LoginDialogListener"
final String v1 = "onCancel"; // const-string v1, "onCancel"
android.util.Log .i ( v0,v1 );
/* .line 518 */
final String v0 = "Action Canceled"; // const-string v0, "Action Canceled"
com.balloonisland.hfxw.SessionEvents .onLoginError ( v0 );
/* .line 519 */
return;
} // .end method
public void onComplete ( android.os.Bundle p0 ) {
/* .locals 2 */
/* .param p1, "values" # Landroid/os/Bundle; */
/* .prologue */
/* .line 499 */
final String v0 = "LoginDialogListener"; // const-string v0, "LoginDialogListener"
final String v1 = "onComplete"; // const-string v1, "onComplete"
android.util.Log .i ( v0,v1 );
/* .line 500 */
com.balloonisland.hfxw.SessionEvents .onLoginSuccess ( );
/* .line 501 */
return;
} // .end method
public void onError ( com.facebook.android.DialogError p0 ) {
/* .locals 2 */
/* .param p1, "error" # Lcom/facebook/android/DialogError; */
/* .prologue */
/* .line 511 */
final String v0 = "LoginDialogListener"; // const-string v0, "LoginDialogListener"
final String v1 = "onError"; // const-string v1, "onError"
android.util.Log .i ( v0,v1 );
/* .line 512 */
(( com.facebook.android.DialogError ) p1 ).getMessage ( ); // invoke-virtual {p1}, Lcom/facebook/android/DialogError;->getMessage()Ljava/lang/String;
com.balloonisland.hfxw.SessionEvents .onLoginError ( v0 );
/* .line 513 */
return;
} // .end method
public void onFacebookError ( com.facebook.android.FacebookError p0 ) {
/* .locals 2 */
/* .param p1, "error" # Lcom/facebook/android/FacebookError; */
/* .prologue */
/* .line 505 */
final String v0 = "LoginDialogListener"; // const-string v0, "LoginDialogListener"
final String v1 = "onFacebookError"; // const-string v1, "onFacebookError"
android.util.Log .i ( v0,v1 );
/* .line 506 */
(( com.facebook.android.FacebookError ) p1 ).getMessage ( ); // invoke-virtual {p1}, Lcom/facebook/android/FacebookError;->getMessage()Ljava/lang/String;
com.balloonisland.hfxw.SessionEvents .onLoginError ( v0 );
/* .line 507 */
return;
} // .end method

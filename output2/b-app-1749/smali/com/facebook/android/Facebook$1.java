class com.facebook.android.Facebook$1 implements com.facebook.android.Facebook$DialogListener {
	 /* .source "Facebook.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/facebook/android/Facebook;->startDialogAuth(Landroid/app/Activity;[Ljava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.facebook.android.Facebook this$0; //synthetic
/* # direct methods */
 com.facebook.android.Facebook$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 297 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onCancel ( ) {
/* .locals 2 */
/* .prologue */
/* .line 326 */
final String v0 = "Facebook-authorize"; // const-string v0, "Facebook-authorize"
final String v1 = "Login canceled"; // const-string v1, "Login canceled"
android.util.Log .d ( v0,v1 );
/* .line 327 */
v0 = this.this$0;
com.facebook.android.Facebook .access$000 ( v0 );
/* .line 328 */
return;
} // .end method
public void onComplete ( android.os.Bundle p0 ) {
/* .locals 4 */
/* .param p1, "values" # Landroid/os/Bundle; */
/* .prologue */
/* .line 301 */
android.webkit.CookieSyncManager .getInstance ( );
(( android.webkit.CookieSyncManager ) v0 ).sync ( ); // invoke-virtual {v0}, Landroid/webkit/CookieSyncManager;->sync()V
/* .line 302 */
v0 = this.this$0;
final String v1 = "access_token"; // const-string v1, "access_token"
(( android.os.Bundle ) p1 ).getString ( v1 ); // invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
(( com.facebook.android.Facebook ) v0 ).setAccessToken ( v1 ); // invoke-virtual {v0, v1}, Lcom/facebook/android/Facebook;->setAccessToken(Ljava/lang/String;)V
/* .line 303 */
v0 = this.this$0;
final String v1 = "expires_in"; // const-string v1, "expires_in"
(( android.os.Bundle ) p1 ).getString ( v1 ); // invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
(( com.facebook.android.Facebook ) v0 ).setAccessExpiresIn ( v1 ); // invoke-virtual {v0, v1}, Lcom/facebook/android/Facebook;->setAccessExpiresIn(Ljava/lang/String;)V
/* .line 304 */
v0 = this.this$0;
v0 = (( com.facebook.android.Facebook ) v0 ).isSessionValid ( ); // invoke-virtual {v0}, Lcom/facebook/android/Facebook;->isSessionValid()Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 305 */
	 final String v0 = "Facebook-authorize"; // const-string v0, "Facebook-authorize"
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v2 = "Login Success! access_token="; // const-string v2, "Login Success! access_token="
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v2 = this.this$0;
	 (( com.facebook.android.Facebook ) v2 ).getAccessToken ( ); // invoke-virtual {v2}, Lcom/facebook/android/Facebook;->getAccessToken()Ljava/lang/String;
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v2 = " expires="; // const-string v2, " expires="
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v2 = this.this$0;
	 (( com.facebook.android.Facebook ) v2 ).getAccessExpires ( ); // invoke-virtual {v2}, Lcom/facebook/android/Facebook;->getAccessExpires()J
	 /* move-result-wide v2 */
	 (( java.lang.StringBuilder ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .d ( v0,v1 );
	 /* .line 308 */
	 v0 = this.this$0;
	 com.facebook.android.Facebook .access$000 ( v0 );
	 /* .line 313 */
} // :goto_0
return;
/* .line 310 */
} // :cond_0
v0 = this.this$0;
com.facebook.android.Facebook .access$000 ( v0 );
/* new-instance v1, Lcom/facebook/android/FacebookError; */
final String v2 = "Failed to receive access token."; // const-string v2, "Failed to receive access token."
/* invoke-direct {v1, v2}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;)V */
} // .end method
public void onError ( com.facebook.android.DialogError p0 ) {
/* .locals 3 */
/* .param p1, "error" # Lcom/facebook/android/DialogError; */
/* .prologue */
/* .line 316 */
final String v0 = "Facebook-authorize"; // const-string v0, "Facebook-authorize"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Login failed: "; // const-string v2, "Login failed: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* .line 317 */
v0 = this.this$0;
com.facebook.android.Facebook .access$000 ( v0 );
/* .line 318 */
return;
} // .end method
public void onFacebookError ( com.facebook.android.FacebookError p0 ) {
/* .locals 3 */
/* .param p1, "error" # Lcom/facebook/android/FacebookError; */
/* .prologue */
/* .line 321 */
final String v0 = "Facebook-authorize"; // const-string v0, "Facebook-authorize"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Login failed: "; // const-string v2, "Login failed: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* .line 322 */
v0 = this.this$0;
com.facebook.android.Facebook .access$000 ( v0 );
/* .line 323 */
return;
} // .end method

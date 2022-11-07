class com.facebook.android.Facebook$TokenRefreshServiceConnection$1 extends android.os.Handler {
	 /* .source "Facebook.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/facebook/android/Facebook$TokenRefreshServiceConnection; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.facebook.android.Facebook$TokenRefreshServiceConnection this$1; //synthetic
/* # direct methods */
 com.facebook.android.Facebook$TokenRefreshServiceConnection$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$1 = p1;
/* .line 528 */
/* invoke-direct {p0}, Landroid/os/Handler;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void handleMessage ( android.os.Message p0 ) {
/* .locals 10 */
/* .param p1, "msg" # Landroid/os/Message; */
/* .prologue */
/* .line 531 */
(( android.os.Message ) p1 ).getData ( ); // invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
final String v7 = "access_token"; // const-string v7, "access_token"
(( android.os.Bundle ) v6 ).getString ( v7 ); // invoke-virtual {v6, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 532 */
/* .local v5, "token":Ljava/lang/String; */
(( android.os.Message ) p1 ).getData ( ); // invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
final String v7 = "expires_in"; // const-string v7, "expires_in"
(( android.os.Bundle ) v6 ).getLong ( v7 ); // invoke-virtual {v6, v7}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J
/* move-result-wide v6 */
/* const-wide/16 v8, 0x3e8 */
/* mul-long v2, v6, v8 */
/* .line 537 */
/* .local v2, "expiresAt":J */
(( android.os.Message ) p1 ).getData ( ); // invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
(( android.os.Bundle ) v6 ).clone ( ); // invoke-virtual {v6}, Landroid/os/Bundle;->clone()Ljava/lang/Object;
/* check-cast v4, Landroid/os/Bundle; */
/* .line 538 */
/* .local v4, "resultBundle":Landroid/os/Bundle; */
final String v6 = "expires_in"; // const-string v6, "expires_in"
(( android.os.Bundle ) v4 ).putLong ( v6, v2, v3 ); // invoke-virtual {v4, v6, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
/* .line 540 */
if ( v5 != null) { // if-eqz v5, :cond_1
	 /* .line 541 */
	 v6 = this.this$1;
	 com.facebook.android.Facebook$TokenRefreshServiceConnection .access$0 ( v6 );
	 (( com.facebook.android.Facebook ) v6 ).setAccessToken ( v5 ); // invoke-virtual {v6, v5}, Lcom/facebook/android/Facebook;->setAccessToken(Ljava/lang/String;)V
	 /* .line 542 */
	 v6 = this.this$1;
	 com.facebook.android.Facebook$TokenRefreshServiceConnection .access$0 ( v6 );
	 (( com.facebook.android.Facebook ) v6 ).setAccessExpires ( v2, v3 ); // invoke-virtual {v6, v2, v3}, Lcom/facebook/android/Facebook;->setAccessExpires(J)V
	 /* .line 543 */
	 v6 = this.this$1;
	 v6 = this.serviceListener;
	 if ( v6 != null) { // if-eqz v6, :cond_0
		 /* .line 544 */
		 v6 = this.this$1;
		 v6 = this.serviceListener;
		 /* .line 559 */
	 } // :cond_0
} // :goto_0
v6 = this.this$1;
v6 = this.applicationsContext;
v7 = this.this$1;
(( android.content.Context ) v6 ).unbindService ( v7 ); // invoke-virtual {v6, v7}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
/* .line 560 */
return;
/* .line 546 */
} // :cond_1
v6 = this.this$1;
v6 = this.serviceListener;
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 547 */
(( android.os.Message ) p1 ).getData ( ); // invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
final String v7 = "error"; // const-string v7, "error"
(( android.os.Bundle ) v6 ).getString ( v7 ); // invoke-virtual {v6, v7}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 548 */
/* .local v0, "error":Ljava/lang/String; */
(( android.os.Message ) p1 ).getData ( ); // invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
final String v7 = "error_code"; // const-string v7, "error_code"
v6 = (( android.os.Bundle ) v6 ).containsKey ( v7 ); // invoke-virtual {v6, v7}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
if ( v6 != null) { // if-eqz v6, :cond_2
	 /* .line 549 */
	 (( android.os.Message ) p1 ).getData ( ); // invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
	 final String v7 = "error_code"; // const-string v7, "error_code"
	 v1 = 	 (( android.os.Bundle ) v6 ).getInt ( v7 ); // invoke-virtual {v6, v7}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
	 /* .line 550 */
	 /* .local v1, "errorCode":I */
	 v6 = this.this$1;
	 v6 = this.serviceListener;
	 /* new-instance v7, Lcom/facebook/android/FacebookError; */
	 int v8 = 0; // const/4 v8, 0x0
	 /* invoke-direct {v7, v0, v8, v1}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;Ljava/lang/String;I)V */
	 /* .line 552 */
} // .end local v1 # "errorCode":I
} // :cond_2
v6 = this.this$1;
v6 = this.serviceListener;
/* new-instance v7, Ljava/lang/Error; */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 553 */
} // .end local v0 # "error":Ljava/lang/String;
} // :goto_1
/* invoke-direct {v7, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V */
/* .line 552 */
/* .line 553 */
/* .restart local v0 # "error":Ljava/lang/String; */
} // :cond_3
final String v0 = "Unknown service error"; // const-string v0, "Unknown service error"
} // .end method

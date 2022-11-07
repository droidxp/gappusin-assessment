class com.facebook.android.FbDialog$FbWebViewClient extends android.webkit.WebViewClient {
	 /* .source "FbDialog.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/facebook/android/FbDialog; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "FbWebViewClient" */
} // .end annotation
/* # instance fields */
final com.facebook.android.FbDialog this$0; //synthetic
/* # direct methods */
private com.facebook.android.FbDialog$FbWebViewClient ( ) {
/* .locals 0 */
/* .prologue */
/* .line 130 */
this.this$0 = p1;
/* invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V */
return;
} // .end method
 com.facebook.android.FbDialog$FbWebViewClient ( ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 130 */
/* invoke-direct {p0, p1}, Lcom/facebook/android/FbDialog$FbWebViewClient;-><init>(Lcom/facebook/android/FbDialog;)V */
return;
} // .end method
/* # virtual methods */
public void onPageFinished ( android.webkit.WebView p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 185 */
/* invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V */
/* .line 186 */
v0 = this.this$0;
com.facebook.android.FbDialog .access$1 ( v0 );
(( android.app.ProgressDialog ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
/* .line 191 */
v0 = this.this$0;
com.facebook.android.FbDialog .access$2 ( v0 );
(( android.widget.FrameLayout ) v0 ).setBackgroundColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V
/* .line 192 */
v0 = this.this$0;
com.facebook.android.FbDialog .access$3 ( v0 );
(( android.webkit.WebView ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V
/* .line 193 */
v0 = this.this$0;
com.facebook.android.FbDialog .access$4 ( v0 );
(( android.widget.ImageView ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 194 */
return;
} // .end method
public void onPageStarted ( android.webkit.WebView p0, java.lang.String p1, android.graphics.Bitmap p2 ) {
/* .locals 3 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .param p3, "favicon" # Landroid/graphics/Bitmap; */
/* .prologue */
/* .line 178 */
final String v0 = "Facebook-WebView"; // const-string v0, "Facebook-WebView"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Webview loading URL: "; // const-string v2, "Webview loading URL: "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.facebook.android.Util .logd ( v0,v1 );
/* .line 179 */
/* invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V */
/* .line 180 */
v0 = this.this$0;
com.facebook.android.FbDialog .access$1 ( v0 );
(( android.app.ProgressDialog ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V
/* .line 181 */
return;
} // .end method
public void onReceivedError ( android.webkit.WebView p0, Integer p1, java.lang.String p2, java.lang.String p3 ) {
/* .locals 2 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "errorCode" # I */
/* .param p3, "description" # Ljava/lang/String; */
/* .param p4, "failingUrl" # Ljava/lang/String; */
/* .prologue */
/* .line 170 */
/* invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V */
/* .line 171 */
v0 = this.this$0;
com.facebook.android.FbDialog .access$0 ( v0 );
/* .line 172 */
/* new-instance v1, Lcom/facebook/android/DialogError; */
/* invoke-direct {v1, p3, p2, p4}, Lcom/facebook/android/DialogError;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
/* .line 171 */
/* .line 173 */
v0 = this.this$0;
(( com.facebook.android.FbDialog ) v0 ).dismiss ( ); // invoke-virtual {v0}, Lcom/facebook/android/FbDialog;->dismiss()V
/* .line 174 */
return;
} // .end method
public Boolean shouldOverrideUrlLoading ( android.webkit.WebView p0, java.lang.String p1 ) {
/* .locals 7 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
/* .line 134 */
final String v3 = "Facebook-WebView"; // const-string v3, "Facebook-WebView"
/* new-instance v4, Ljava/lang/StringBuilder; */
final String v5 = "Redirect URL: "; // const-string v5, "Redirect URL: "
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v4 ).append ( p2 ); // invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.facebook.android.Util .logd ( v3,v4 );
/* .line 135 */
final String v3 = "fbconnect://success"; // const-string v3, "fbconnect://success"
v3 = (( java.lang.String ) p2 ).startsWith ( v3 ); // invoke-virtual {p2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_4
	 /* .line 136 */
	 com.facebook.android.Util .parseUrl ( p2 );
	 /* .line 138 */
	 /* .local v1, "values":Landroid/os/Bundle; */
	 final String v3 = "error"; // const-string v3, "error"
	 (( android.os.Bundle ) v1 ).getString ( v3 ); // invoke-virtual {v1, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
	 /* .line 139 */
	 /* .local v0, "error":Ljava/lang/String; */
	 /* if-nez v0, :cond_0 */
	 /* .line 140 */
	 final String v3 = "error_type"; // const-string v3, "error_type"
	 (( android.os.Bundle ) v1 ).getString ( v3 ); // invoke-virtual {v1, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
	 /* .line 143 */
} // :cond_0
/* if-nez v0, :cond_1 */
/* .line 144 */
v3 = this.this$0;
com.facebook.android.FbDialog .access$0 ( v3 );
/* .line 152 */
} // :goto_0
v3 = this.this$0;
(( com.facebook.android.FbDialog ) v3 ).dismiss ( ); // invoke-virtual {v3}, Lcom/facebook/android/FbDialog;->dismiss()V
/* .line 164 */
} // .end local v0 # "error":Ljava/lang/String;
} // .end local v1 # "values":Landroid/os/Bundle;
} // :goto_1
/* .line 145 */
/* .restart local v0 # "error":Ljava/lang/String; */
/* .restart local v1 # "values":Landroid/os/Bundle; */
} // :cond_1
final String v3 = "access_denied"; // const-string v3, "access_denied"
v3 = (( java.lang.String ) v0 ).equals ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_2 */
/* .line 146 */
final String v3 = "OAuthAccessDeniedException"; // const-string v3, "OAuthAccessDeniedException"
v3 = (( java.lang.String ) v0 ).equals ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 147 */
} // :cond_2
v3 = this.this$0;
com.facebook.android.FbDialog .access$0 ( v3 );
/* .line 149 */
} // :cond_3
v3 = this.this$0;
com.facebook.android.FbDialog .access$0 ( v3 );
/* new-instance v4, Lcom/facebook/android/FacebookError; */
/* invoke-direct {v4, v0}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;)V */
/* .line 154 */
} // .end local v0 # "error":Ljava/lang/String;
} // .end local v1 # "values":Landroid/os/Bundle;
} // :cond_4
final String v3 = "fbconnect://cancel"; // const-string v3, "fbconnect://cancel"
v3 = (( java.lang.String ) p2 ).startsWith ( v3 ); // invoke-virtual {p2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_5
/* .line 155 */
v3 = this.this$0;
com.facebook.android.FbDialog .access$0 ( v3 );
/* .line 156 */
v3 = this.this$0;
(( com.facebook.android.FbDialog ) v3 ).dismiss ( ); // invoke-virtual {v3}, Lcom/facebook/android/FbDialog;->dismiss()V
/* .line 158 */
} // :cond_5
final String v3 = "touch"; // const-string v3, "touch"
v3 = (( java.lang.String ) p2 ).contains ( v3 ); // invoke-virtual {p2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
if ( v3 != null) { // if-eqz v3, :cond_6
/* .line 159 */
int v2 = 0; // const/4 v2, 0x0
/* .line 162 */
} // :cond_6
v3 = this.this$0;
(( com.facebook.android.FbDialog ) v3 ).getContext ( ); // invoke-virtual {v3}, Lcom/facebook/android/FbDialog;->getContext()Landroid/content/Context;
/* .line 163 */
/* new-instance v4, Landroid/content/Intent; */
final String v5 = "android.intent.action.VIEW"; // const-string v5, "android.intent.action.VIEW"
android.net.Uri .parse ( p2 );
/* invoke-direct {v4, v5, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
/* .line 162 */
(( android.content.Context ) v3 ).startActivity ( v4 ); // invoke-virtual {v3, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
} // .end method

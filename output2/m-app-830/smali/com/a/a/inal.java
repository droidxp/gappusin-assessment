class inal extends android.webkit.WebViewClient {
	 /* # instance fields */
	 private com.a.a.a a; //synthetic
	 /* # direct methods */
	 inal ( ) { //synthethic
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, v0}, Lcom/a/a/l;-><init>(Lcom/a/a/a;B)V */
		 return;
	 } // .end method
	 private inal ( ) {
		 /* .locals 0 */
		 this.a = p1;
		 /* invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void onPageFinished ( android.webkit.WebView p0, java.lang.String p1 ) {
		 /* .locals 2 */
		 /* invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V */
		 v0 = this.a;
		 com.a.a.a .c ( v0 );
		 (( android.webkit.WebView ) v0 ).getTitle ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v1 = 			 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
			 /* if-lez v1, :cond_0 */
			 v1 = this.a;
			 com.a.a.a .d ( v1 );
			 (( android.widget.TextView ) v1 ).setText ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
		 } // :cond_0
		 v0 = this.a;
		 com.a.a.a .b ( v0 );
		 (( android.app.ProgressDialog ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
		 return;
	 } // .end method
	 public final void onPageStarted ( android.webkit.WebView p0, java.lang.String p1, android.graphics.Bitmap p2 ) {
		 /* .locals 3 */
		 final String v0 = "Facebook-WebView"; // const-string v0, "Facebook-WebView"
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "Webview loading URL: "; // const-string v2, "Webview loading URL: "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .d ( v0,v1 );
		 /* invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V */
		 v0 = this.a;
		 com.a.a.a .b ( v0 );
		 (( android.app.ProgressDialog ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V
		 return;
	 } // .end method
	 public final void onReceivedError ( android.webkit.WebView p0, Integer p1, java.lang.String p2, java.lang.String p3 ) {
		 /* .locals 2 */
		 /* invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V */
		 v0 = this.a;
		 com.a.a.a .a ( v0 );
		 /* new-instance v1, Lcom/a/a/b; */
		 /* invoke-direct {v1, p3, p2, p4}, Lcom/a/a/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
		 v0 = this.a;
		 (( com.a.a.a ) v0 ).dismiss ( ); // invoke-virtual {v0}, Lcom/a/a/a;->dismiss()V
		 return;
	 } // .end method
	 public final Boolean shouldOverrideUrlLoading ( android.webkit.WebView p0, java.lang.String p1 ) {
		 /* .locals 5 */
		 int v4 = 1; // const/4 v4, 0x1
		 final String v0 = "Facebook-WebView"; // const-string v0, "Facebook-WebView"
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "Redirect URL: "; // const-string v2, "Redirect URL: "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .d ( v0,v1 );
		 final String v0 = "fbconnect://success"; // const-string v0, "fbconnect://success"
		 v0 = 		 (( java.lang.String ) p2 ).startsWith ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_4
			 com.a.a.i .a ( p2 );
			 final String v1 = "error"; // const-string v1, "error"
			 (( android.os.Bundle ) v0 ).getString ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
			 /* if-nez v1, :cond_0 */
			 final String v1 = "error_type"; // const-string v1, "error_type"
			 (( android.os.Bundle ) v0 ).getString ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
		 } // :cond_0
		 /* if-nez v1, :cond_1 */
		 v1 = this.a;
		 com.a.a.a .a ( v1 );
	 } // :goto_0
	 v0 = this.a;
	 (( com.a.a.a ) v0 ).dismiss ( ); // invoke-virtual {v0}, Lcom/a/a/a;->dismiss()V
	 /* move v0, v4 */
} // :goto_1
} // :cond_1
final String v0 = "access_denied"; // const-string v0, "access_denied"
v0 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_2 */
final String v0 = "OAuthAccessDeniedException"; // const-string v0, "OAuthAccessDeniedException"
v0 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
} // :cond_2
v0 = this.a;
com.a.a.a .a ( v0 );
} // :cond_3
v0 = this.a;
com.a.a.a .a ( v0 );
/* new-instance v2, Lcom/a/a/d; */
/* invoke-direct {v2, v1}, Lcom/a/a/d;-><init>(Ljava/lang/String;)V */
} // :cond_4
final String v0 = "fbconnect://cancel"; // const-string v0, "fbconnect://cancel"
v0 = (( java.lang.String ) p2 ).startsWith ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_5
v0 = this.a;
com.a.a.a .a ( v0 );
v0 = this.a;
(( com.a.a.a ) v0 ).dismiss ( ); // invoke-virtual {v0}, Lcom/a/a/a;->dismiss()V
/* move v0, v4 */
} // :cond_5
final String v0 = "touch"; // const-string v0, "touch"
v0 = (( java.lang.String ) p2 ).contains ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
if ( v0 != null) { // if-eqz v0, :cond_6
int v0 = 0; // const/4 v0, 0x0
} // :cond_6
v0 = this.a;
(( com.a.a.a ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/a/a/a;->getContext()Landroid/content/Context;
/* new-instance v1, Landroid/content/Intent; */
final String v2 = "android.intent.action.VIEW"; // const-string v2, "android.intent.action.VIEW"
android.net.Uri .parse ( p2 );
/* invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
(( android.content.Context ) v0 ).startActivity ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* move v0, v4 */
} // .end method

public class com.mobfox.sdk.InAppWebView extends android.app.Activity {
	 /* .source "InAppWebView.java" */
	 /* # direct methods */
	 public com.mobfox.sdk.InAppWebView ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 11 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 6 */
		 /* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
		 /* .prologue */
		 /* .line 15 */
		 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
		 /* .line 17 */
		 (( com.mobfox.sdk.InAppWebView ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/mobfox/sdk/InAppWebView;->getIntent()Landroid/content/Intent;
		 /* .line 18 */
		 /* .local v1, "intent":Landroid/content/Intent; */
		 (( android.content.Intent ) v1 ).getExtras ( ); // invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
		 /* .line 19 */
		 /* .local v0, "bundle":Landroid/os/Bundle; */
		 final String v4 = "REDIRECT_URI"; // const-string v4, "REDIRECT_URI"
		 (( android.os.Bundle ) v0 ).get ( v4 ); // invoke-virtual {v0, v4}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v2, Ljava/lang/String; */
		 /* .line 20 */
		 /* .local v2, "url":Ljava/lang/String; */
		 /* if-nez v2, :cond_1 */
		 /* .line 21 */
		 final String v4 = "MOBFOX"; // const-string v4, "MOBFOX"
		 int v5 = 3; // const/4 v5, 0x3
		 v4 = 		 android.util.Log .isLoggable ( v4,v5 );
		 if ( v4 != null) { // if-eqz v4, :cond_0
			 /* .line 22 */
			 final String v4 = "MOBFOX"; // const-string v4, "MOBFOX"
			 final String v5 = "url is null so do not load anything"; // const-string v5, "url is null so do not load anything"
			 android.util.Log .d ( v4,v5 );
			 /* .line 38 */
		 } // :cond_0
	 } // :goto_0
	 return;
	 /* .line 27 */
} // :cond_1
/* new-instance v3, Landroid/webkit/WebView; */
/* invoke-direct {v3, p0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
/* .line 29 */
/* .local v3, "webView":Landroid/webkit/WebView; */
/* new-instance v4, Lcom/mobfox/sdk/InAppWebView$1; */
/* invoke-direct {v4, p0}, Lcom/mobfox/sdk/InAppWebView$1;-><init>(Lcom/mobfox/sdk/InAppWebView;)V */
(( android.webkit.WebView ) v3 ).setWebViewClient ( v4 ); // invoke-virtual {v3, v4}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
/* .line 36 */
(( android.webkit.WebView ) v3 ).loadUrl ( v2 ); // invoke-virtual {v3, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
/* .line 37 */
(( com.mobfox.sdk.InAppWebView ) p0 ).setContentView ( v3 ); // invoke-virtual {p0, v3}, Lcom/mobfox/sdk/InAppWebView;->setContentView(Landroid/view/View;)V
} // .end method

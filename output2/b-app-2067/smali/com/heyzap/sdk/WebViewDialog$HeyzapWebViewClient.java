class com.heyzap.sdk.WebViewDialog$HeyzapWebViewClient extends android.webkit.WebViewClient {
	 /* # instance fields */
	 final com.heyzap.sdk.WebViewDialog this$0; //synthetic
	 /* # direct methods */
	 private com.heyzap.sdk.WebViewDialog$HeyzapWebViewClient ( ) {
		 /* .locals 0 */
		 this.this$0 = p1;
		 /* invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V */
		 return;
	 } // .end method
	 com.heyzap.sdk.WebViewDialog$HeyzapWebViewClient ( ) { //synthethic
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/heyzap/sdk/WebViewDialog$HeyzapWebViewClient;-><init>(Lcom/heyzap/sdk/WebViewDialog;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onReceivedError ( android.webkit.WebView p0, Integer p1, java.lang.String p2, java.lang.String p3 ) {
		 /* .locals 2 */
		 v0 = this.this$0;
		 int v1 = 1; // const/4 v1, 0x1
		 com.heyzap.sdk.WebViewDialog .access$202 ( v0,v1 );
		 v0 = this.this$0;
		 (( com.heyzap.sdk.WebViewDialog ) v0 ).hide ( ); // invoke-virtual {v0}, Lcom/heyzap/sdk/WebViewDialog;->hide()V
		 return;
	 } // .end method
	 public Boolean shouldOverrideUrlLoading ( android.webkit.WebView p0, java.lang.String p1 ) {
		 /* .locals 2 */
		 try { // :try_start_0
			 /* new-instance v0, Ljava/net/URL; */
			 /* invoke-direct {v0, p2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
			 (( java.net.URL ) v0 ).getHost ( ); // invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;
			 final String v1 = "heyzap.com"; // const-string v1, "heyzap.com"
			 v0 = 			 (( java.lang.String ) v0 ).endsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 (( android.webkit.WebView ) p1 ).loadUrl ( p2 ); // invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
				 /* :try_end_0 */
				 /* .catch Ljava/net/MalformedURLException; {:try_start_0 ..:try_end_0} :catch_0 */
			 } // :cond_0
		 } // :goto_0
		 int v0 = 1; // const/4 v0, 0x1
		 /* :catch_0 */
		 /* move-exception v0 */
	 } // .end method

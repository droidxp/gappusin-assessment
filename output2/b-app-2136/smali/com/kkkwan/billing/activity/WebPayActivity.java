public class com.kkkwan.billing.activity.WebPayActivity extends android.app.Activity {
	 /* # instance fields */
	 private android.webkit.WebView a;
	 private android.app.ProgressDialog b;
	 private java.lang.String c;
	 private java.lang.String d;
	 private Long e;
	 private java.util.Timer f;
	 private android.os.Handler g;
	 /* # direct methods */
	 public com.kkkwan.billing.activity.WebPayActivity ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 final String v0 = "file:///android_asset/kkkwan_error_page/kkkwan_error.html"; // const-string v0, "file:///android_asset/kkkwan_error_page/kkkwan_error.html"
		 this.c = v0;
		 /* const-wide/32 v0, 0xea60 */
		 /* iput-wide v0, p0, Lcom/kkkwan/billing/activity/WebPayActivity;->e:J */
		 /* new-instance v0, Lcom/kkkwan/billing/activity/a; */
		 /* invoke-direct {v0, p0}, Lcom/kkkwan/billing/activity/a;-><init>(Lcom/kkkwan/billing/activity/WebPayActivity;)V */
		 this.g = v0;
		 return;
	 } // .end method
	 static android.app.ProgressDialog a ( com.kkkwan.billing.activity.WebPayActivity p0, android.app.ProgressDialog p1 ) { //synthethic
		 /* .locals 0 */
		 this.b = p1;
	 } // .end method
	 static android.webkit.WebView a ( com.kkkwan.billing.activity.WebPayActivity p0, android.webkit.WebView p1 ) { //synthethic
		 /* .locals 0 */
		 this.a = p1;
	 } // .end method
	 static java.lang.String a ( com.kkkwan.billing.activity.WebPayActivity p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.d;
	 } // .end method
	 static java.lang.String a ( com.kkkwan.billing.activity.WebPayActivity p0, java.lang.String p1 ) { //synthethic
		 /* .locals 0 */
		 this.d = p1;
	 } // .end method
	 static java.util.Timer a ( com.kkkwan.billing.activity.WebPayActivity p0, java.util.Timer p1 ) { //synthethic
		 /* .locals 0 */
		 this.f = p1;
	 } // .end method
	 private void a ( ) {
		 /* .locals 4 */
		 try { // :try_start_0
			 /* new-instance v0, Lcom/kkkwan/billing/h/g; */
			 /* invoke-direct {v0}, Lcom/kkkwan/billing/h/g;-><init>()V */
			 (( com.kkkwan.billing.activity.WebPayActivity ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Lcom/kkkwan/billing/activity/WebPayActivity;->getApplicationContext()Landroid/content/Context;
			 (( com.kkkwan.billing.h.g ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Lcom/kkkwan/billing/h/g;->c(Landroid/content/Context;)Ljava/lang/String;
			 final String v1 = "quick_pay"; // const-string v1, "quick_pay"
			 v2 = this.d;
			 v1 = 			 (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 if ( v1 != null) { // if-eqz v1, :cond_1
				 com.kkkwan.billing.f.a .a ( );
				 final String v2 = "2"; // const-string v2, "2"
				 final String v3 = "0"; // const-string v3, "0"
				 (( com.kkkwan.billing.f.a ) v1 ).c ( v2, v3, v0 ); // invoke-virtual {v1, v2, v3, v0}, Lcom/kkkwan/billing/f/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
			 } // :cond_0
		 } // :goto_0
		 return;
	 } // :cond_1
	 final String v1 = "quota_pay"; // const-string v1, "quota_pay"
	 v2 = this.d;
	 v1 = 	 (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v1 != null) { // if-eqz v1, :cond_2
		 com.kkkwan.billing.f.a .a ( );
		 final String v2 = "2"; // const-string v2, "2"
		 final String v3 = "0"; // const-string v3, "0"
		 (( com.kkkwan.billing.f.a ) v1 ).a ( v2, v3, v0 ); // invoke-virtual {v1, v2, v3, v0}, Lcom/kkkwan/billing/f/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
	 } // :cond_2
	 try { // :try_start_1
		 final String v1 = "no_quota_pay"; // const-string v1, "no_quota_pay"
		 v2 = this.d;
		 v1 = 		 (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 com.kkkwan.billing.f.a .a ( );
			 final String v2 = "2"; // const-string v2, "2"
			 final String v3 = "0"; // const-string v3, "0"
			 (( com.kkkwan.billing.f.a ) v1 ).b ( v2, v3, v0 ); // invoke-virtual {v1, v2, v3, v0}, Lcom/kkkwan/billing/f/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
			 /* :try_end_1 */
			 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
		 } // .end method
		 static java.lang.String b ( com.kkkwan.billing.activity.WebPayActivity p0 ) { //synthethic
			 /* .locals 1 */
			 v0 = this.c;
		 } // .end method
		 static java.lang.String b ( com.kkkwan.billing.activity.WebPayActivity p0, java.lang.String p1 ) { //synthethic
			 /* .locals 0 */
			 this.c = p1;
		 } // .end method
		 static android.webkit.WebView c ( com.kkkwan.billing.activity.WebPayActivity p0 ) { //synthethic
			 /* .locals 1 */
			 v0 = this.a;
		 } // .end method
		 static android.app.ProgressDialog d ( com.kkkwan.billing.activity.WebPayActivity p0 ) { //synthethic
			 /* .locals 1 */
			 v0 = this.b;
		 } // .end method
		 static void e ( com.kkkwan.billing.activity.WebPayActivity p0 ) { //synthethic
			 /* .locals 3 */
			 try { // :try_start_0
				 v0 = this.a;
				 (( android.webkit.WebView ) v0 ).getSettings ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
				 int v1 = 1; // const/4 v1, 0x1
				 (( android.webkit.WebSettings ) v0 ).setSaveFormData ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V
				 v0 = this.a;
				 (( android.webkit.WebView ) v0 ).getSettings ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
				 int v1 = 1; // const/4 v1, 0x1
				 (( android.webkit.WebSettings ) v0 ).setSavePassword ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSavePassword(Z)V
				 v0 = this.a;
				 (( android.webkit.WebView ) v0 ).getSettings ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
				 int v1 = 1; // const/4 v1, 0x1
				 (( android.webkit.WebSettings ) v0 ).setSupportMultipleWindows ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V
				 v0 = this.a;
				 int v1 = 0; // const/4 v1, 0x0
				 (( android.webkit.WebView ) v0 ).setScrollBarStyle ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setScrollBarStyle(I)V
				 v0 = this.a;
				 (( android.webkit.WebView ) v0 ).getSettings ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
				 int v1 = 1; // const/4 v1, 0x1
				 (( android.webkit.WebSettings ) v0 ).setJavaScriptEnabled ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
				 v0 = this.a;
				 /* new-instance v1, Lcom/kkkwan/billing/activity/f; */
				 /* invoke-direct {v1, p0}, Lcom/kkkwan/billing/activity/f;-><init>(Lcom/kkkwan/billing/activity/WebPayActivity;)V */
				 final String v2 = "javaObject"; // const-string v2, "javaObject"
				 (( android.webkit.WebView ) v0 ).addJavascriptInterface ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
				 v0 = this.a;
				 /* new-instance v1, Lcom/kkkwan/billing/activity/c; */
				 int v2 = 0; // const/4 v2, 0x0
				 /* invoke-direct {v1, p0, v2}, Lcom/kkkwan/billing/activity/c;-><init>(Lcom/kkkwan/billing/activity/WebPayActivity;B)V */
				 (( android.webkit.WebView ) v0 ).setWebViewClient ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
				 v0 = this.a;
				 /* new-instance v1, Lcom/kkkwan/billing/activity/b; */
				 int v2 = 0; // const/4 v2, 0x0
				 /* invoke-direct {v1, p0, v2}, Lcom/kkkwan/billing/activity/b;-><init>(Lcom/kkkwan/billing/activity/WebPayActivity;B)V */
				 (( android.webkit.WebView ) v0 ).setWebChromeClient ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
				 final String v0 = "WebPayActivity"; // const-string v0, "WebPayActivity"
				 /* new-instance v1, Ljava/lang/StringBuilder; */
				 final String v2 = "url="; // const-string v2, "url="
				 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
				 v2 = this.c;
				 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 com.kkkwan.billing.h.f .a ( v0,v1 );
				 v0 = this.a;
				 v1 = this.c;
				 (( android.webkit.WebView ) v0 ).loadUrl ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
				 v0 = this.a;
				 (( android.webkit.WebView ) v0 ).reload ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->reload()V
				 /* :try_end_0 */
				 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 } // :goto_0
			 return;
			 /* :catch_0 */
			 /* move-exception v0 */
			 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
		 } // .end method
		 static java.util.Timer f ( com.kkkwan.billing.activity.WebPayActivity p0 ) { //synthethic
			 /* .locals 1 */
			 v0 = this.f;
		 } // .end method
		 static android.os.Handler g ( com.kkkwan.billing.activity.WebPayActivity p0 ) { //synthethic
			 /* .locals 1 */
			 v0 = this.g;
		 } // .end method
		 static Long h ( com.kkkwan.billing.activity.WebPayActivity p0 ) { //synthethic
			 /* .locals 2 */
			 /* iget-wide v0, p0, Lcom/kkkwan/billing/activity/WebPayActivity;->e:J */
			 /* return-wide v0 */
		 } // .end method
		 /* # virtual methods */
		 protected void onDestroy ( ) {
			 /* .locals 2 */
			 try { // :try_start_0
				 final String v0 = "WebPayActivity"; // const-string v0, "WebPayActivity"
				 final String v1 = "WebViewActivity onDestroy"; // const-string v1, "WebViewActivity onDestroy"
				 com.kkkwan.billing.h.f .a ( v0,v1 );
				 v0 = this.b;
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 v0 = this.b;
					 (( android.app.ProgressDialog ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
					 int v0 = 0; // const/4 v0, 0x0
					 this.b = v0;
				 } // :cond_0
				 v0 = this.a;
				 if ( v0 != null) { // if-eqz v0, :cond_1
					 v0 = this.a;
					 (( android.webkit.WebView ) v0 ).clearHistory ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->clearHistory()V
					 v0 = this.a;
					 int v1 = 1; // const/4 v1, 0x1
					 (( android.webkit.WebView ) v0 ).clearCache ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->clearCache(Z)V
					 v0 = this.a;
					 (( android.webkit.WebView ) v0 ).clearFormData ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->clearFormData()V
					 v0 = this.a;
					 (( android.webkit.WebView ) v0 ).clearView ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->clearView()V
					 /* :try_end_0 */
					 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
				 } // :cond_1
			 } // :goto_0
			 /* invoke-super {p0}, Landroid/app/Activity;->onDestroy()V */
			 return;
			 /* :catch_0 */
			 /* move-exception v0 */
			 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
		 } // .end method
		 public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
			 /* .locals 1 */
			 int v0 = 4; // const/4 v0, 0x4
			 /* if-ne p1, v0, :cond_0 */
			 /* invoke-direct {p0}, Lcom/kkkwan/billing/activity/WebPayActivity;->a()V */
			 (( com.kkkwan.billing.activity.WebPayActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/kkkwan/billing/activity/WebPayActivity;->finish()V
			 int v0 = 1; // const/4 v0, 0x1
		 } // :goto_0
	 } // :cond_0
	 v0 = 	 /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
protected void onStart ( ) {
	 /* .locals 2 */
	 try { // :try_start_0
		 final String v0 = "WebPayActivity"; // const-string v0, "WebPayActivity"
		 final String v1 = "onStart"; // const-string v1, "onStart"
		 com.kkkwan.billing.h.f .a ( v0,v1 );
		 /* new-instance v0, Lcom/kkkwan/billing/activity/e; */
		 /* invoke-direct {v0, p0}, Lcom/kkkwan/billing/activity/e;-><init>(Lcom/kkkwan/billing/activity/WebPayActivity;)V */
		 int v1 = 0; // const/4 v1, 0x0
		 /* new-array v1, v1, [Ljava/lang/Integer; */
		 (( com.kkkwan.billing.activity.e ) v0 ).execute ( v1 ); // invoke-virtual {v0, v1}, Lcom/kkkwan/billing/activity/e;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 } // :goto_0
	 /* invoke-super {p0}, Landroid/app/Activity;->onStart()V */
	 return;
	 /* :catch_0 */
	 /* move-exception v0 */
	 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method

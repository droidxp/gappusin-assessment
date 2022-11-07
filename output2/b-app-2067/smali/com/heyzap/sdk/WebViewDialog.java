public class com.heyzap.sdk.WebViewDialog extends com.heyzap.sdk.ClickableToast {
	 /* # static fields */
	 private static final java.lang.String ENDPOINT_PRE_MARKET;
	 /* # instance fields */
	 private final java.lang.String LOG_TAG;
	 private Boolean dead;
	 private android.view.View dialogView;
	 private com.heyzap.sdk.WebViewDialog$HeyzapJavascriptBindings heyzapJavascriptBindings;
	 private Boolean maybeOffline;
	 private android.webkit.WebView webView;
	 /* # direct methods */
	 public com.heyzap.sdk.WebViewDialog ( ) {
		 /* .locals 3 */
		 int v2 = -1; // const/4 v2, -0x1
		 /* invoke-direct {p0, p1}, Lcom/heyzap/sdk/ClickableToast;-><init>(Landroid/content/Context;)V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/heyzap/sdk/WebViewDialog;->maybeOffline:Z */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lcom/heyzap/sdk/WebViewDialog;->dead:Z */
		 final String v0 = "HeyzapSDK"; // const-string v0, "HeyzapSDK"
		 this.LOG_TAG = v0;
		 /* new-instance v0, Lcom/heyzap/sdk/WebViewDialog$HeyzapJavascriptBindings; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {v0, p0, v1}, Lcom/heyzap/sdk/WebViewDialog$HeyzapJavascriptBindings;-><init>(Lcom/heyzap/sdk/WebViewDialog;Lcom/heyzap/sdk/WebViewDialog$1;)V */
		 this.heyzapJavascriptBindings = v0;
		 /* invoke-direct {p0}, Lcom/heyzap/sdk/WebViewDialog;->setupWebView()V */
		 (( com.heyzap.sdk.WebViewDialog ) p0 ).buildContentView ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/WebViewDialog;->buildContentView()Landroid/view/View;
		 this.dialogView = v0;
		 v0 = this.dialogView;
		 /* new-instance v1, Landroid/view/ViewGroup$LayoutParams; */
		 /* invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
		 (( com.heyzap.sdk.WebViewDialog ) p0 ).addView ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/heyzap/sdk/WebViewDialog;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
		 return;
	 } // .end method
	 static Boolean access$200 ( com.heyzap.sdk.WebViewDialog p0 ) { //synthethic
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lcom/heyzap/sdk/WebViewDialog;->maybeOffline:Z */
	 } // .end method
	 static Boolean access$202 ( com.heyzap.sdk.WebViewDialog p0, Boolean p1 ) { //synthethic
		 /* .locals 0 */
		 /* iput-boolean p1, p0, Lcom/heyzap/sdk/WebViewDialog;->maybeOffline:Z */
	 } // .end method
	 static Boolean access$302 ( com.heyzap.sdk.WebViewDialog p0, Boolean p1 ) { //synthethic
		 /* .locals 0 */
		 /* iput-boolean p1, p0, Lcom/heyzap/sdk/WebViewDialog;->dead:Z */
	 } // .end method
	 private void setupWebView ( ) {
		 /* .locals 3 */
		 /* new-instance v0, Landroid/webkit/WebView; */
		 (( com.heyzap.sdk.WebViewDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/WebViewDialog;->getContext()Landroid/content/Context;
		 /* invoke-direct {v0, v1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
		 this.webView = v0;
		 v0 = this.webView;
		 /* new-instance v1, Lcom/heyzap/sdk/WebViewDialog$HeyzapWebViewClient; */
		 int v2 = 0; // const/4 v2, 0x0
		 /* invoke-direct {v1, p0, v2}, Lcom/heyzap/sdk/WebViewDialog$HeyzapWebViewClient;-><init>(Lcom/heyzap/sdk/WebViewDialog;Lcom/heyzap/sdk/WebViewDialog$1;)V */
		 (( android.webkit.WebView ) v0 ).setWebViewClient ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
		 v0 = this.webView;
		 (( android.webkit.WebView ) v0 ).getSettings ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
		 int v1 = 1; // const/4 v1, 0x1
		 (( android.webkit.WebSettings ) v0 ).setJavaScriptEnabled ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
		 v0 = this.webView;
		 /* const/high16 v1, 0x2000000 */
		 (( android.webkit.WebView ) v0 ).setScrollBarStyle ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setScrollBarStyle(I)V
		 v0 = this.webView;
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "http://sdkstatic.heyzap.com/mobile_web_views/sdk/prompt_heyzap_install/android/"; // const-string v2, "http://sdkstatic.heyzap.com/mobile_web_views/sdk/prompt_heyzap_install/android/"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( com.heyzap.sdk.WebViewDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/WebViewDialog;->getContext()Landroid/content/Context;
		 (( android.content.Context ) v2 ).getPackageName ( ); // invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 (( android.webkit.WebView ) v0 ).loadUrl ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
		 v0 = this.webView;
		 v1 = this.heyzapJavascriptBindings;
		 final String v2 = "Hz"; // const-string v2, "Hz"
		 (( android.webkit.WebView ) v0 ).addJavascriptInterface ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.view.View buildContentView ( ) {
		 /* .locals 5 */
		 int v4 = -1; // const/4 v4, -0x1
		 /* new-instance v0, Landroid/widget/RelativeLayout; */
		 (( com.heyzap.sdk.WebViewDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/WebViewDialog;->getContext()Landroid/content/Context;
		 /* invoke-direct {v0, v1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V */
		 /* const v1, 0xbdbebd */
		 (( android.widget.RelativeLayout ) v0 ).setBackgroundColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V
		 /* new-instance v1, Landroid/widget/RelativeLayout$LayoutParams; */
		 v2 = this.windowManager;
		 v2 = 		 (( android.view.Display ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/view/Display;->getWidth()I
		 v3 = this.windowManager;
		 v3 = 		 (( android.view.Display ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/view/Display;->getHeight()I
		 /* invoke-direct {v1, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
		 int v2 = 1; // const/4 v2, 0x1
		 (( android.widget.RelativeLayout ) v0 ).setGravity ( v2 ); // invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setGravity(I)V
		 (( android.widget.RelativeLayout ) v0 ).setLayoutParams ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
		 /* new-instance v1, Landroid/widget/RelativeLayout$LayoutParams; */
		 /* invoke-direct {v1, v4, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
		 /* const/16 v2, 0xa */
		 (( android.widget.RelativeLayout$LayoutParams ) v1 ).addRule ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
		 v2 = this.webView;
		 (( android.webkit.WebView ) v2 ).setLayoutParams ( v1 ); // invoke-virtual {v2, v1}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
		 v1 = this.webView;
		 (( android.widget.RelativeLayout ) v0 ).addView ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
	 } // .end method
	 public android.view.WindowManager$LayoutParams getWmParams ( ) {
		 /* .locals 3 */
		 int v2 = -1; // const/4 v2, -0x1
		 /* invoke-super {p0}, Lcom/heyzap/sdk/ClickableToast;->getWmParams()Landroid/view/WindowManager$LayoutParams; */
		 /* const v1, 0x40020 */
		 /* iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I */
		 int v1 = 2; // const/4 v1, 0x2
		 /* iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I */
		 /* iput v2, v0, Landroid/view/WindowManager$LayoutParams;->width:I */
		 /* iput v2, v0, Landroid/view/WindowManager$LayoutParams;->height:I */
		 /* const v1, 0x1030002 */
		 /* iput v1, v0, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I */
		 /* const/high16 v1, 0x3f000000 # 0.5f */
		 /* iput v1, v0, Landroid/view/WindowManager$LayoutParams;->dimAmount:F */
	 } // .end method
	 public void hide ( ) { //bridge//synthethic
		 /* .locals 0 */
		 /* invoke-super {p0}, Lcom/heyzap/sdk/ClickableToast;->hide()V */
		 return;
	 } // .end method
	 public void init ( ) { //bridge//synthethic
		 /* .locals 0 */
		 /* invoke-super {p0}, Lcom/heyzap/sdk/ClickableToast;->init()V */
		 return;
	 } // .end method
	 public Boolean isDead ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lcom/heyzap/sdk/WebViewDialog;->dead:Z */
	 } // .end method
	 public Boolean isVertical ( ) { //bridge//synthethic
		 /* .locals 1 */
		 v0 = 		 /* invoke-super {p0}, Lcom/heyzap/sdk/ClickableToast;->isVertical()Z */
	 } // .end method
	 public void onAttachedToWindow ( ) { //bridge//synthethic
		 /* .locals 0 */
		 /* invoke-super {p0}, Lcom/heyzap/sdk/ClickableToast;->onAttachedToWindow()V */
		 return;
	 } // .end method
	 public void onDraw ( android.graphics.Canvas p0 ) { //bridge//synthethic
		 /* .locals 0 */
		 /* invoke-super {p0, p1}, Lcom/heyzap/sdk/ClickableToast;->onDraw(Landroid/graphics/Canvas;)V */
		 return;
	 } // .end method
	 public void show ( ) {
		 /* .locals 2 */
		 /* invoke-super {p0}, Lcom/heyzap/sdk/ClickableToast;->show()V */
		 v0 = this.webView;
		 int v1 = 0; // const/4 v1, 0x0
		 (( android.webkit.WebView ) v0 ).setBackgroundColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setBackgroundColor(I)V
		 return;
	 } // .end method
	 public void show ( Integer p0 ) { //bridge//synthethic
		 /* .locals 0 */
		 /* invoke-super {p0, p1}, Lcom/heyzap/sdk/ClickableToast;->show(I)V */
		 return;
	 } // .end method

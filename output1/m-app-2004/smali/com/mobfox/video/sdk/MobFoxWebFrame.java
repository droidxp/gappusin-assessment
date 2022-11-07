public class com.mobfox.video.sdk.MobFoxWebFrame extends android.widget.FrameLayout implements com.mobfox.video.sdk.MobFoxInterstitialController$BrowserControl {
	 /* .source "MobFoxWebFrame.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/mobfox/video/sdk/MobFoxWebFrame$LoadUrlTask; */
	 /* } */
} // .end annotation
/* # instance fields */
private Boolean enableZoom;
private android.app.Activity mActivity;
private com.mobfox.video.sdk.MobFoxInterstitialController mController;
private android.widget.ImageView mExitButton;
private android.webkit.WebView mWebView;
private com.mobfox.video.sdk.MobFoxWebViewClient mWebViewClient;
/* # direct methods */
public com.mobfox.video.sdk.MobFoxWebFrame ( ) {
	 /* .locals 12 */
	 /* .param p1, "context" # Landroid/app/Activity; */
	 /* .param p2, "allowNavigation" # Z */
	 /* .param p3, "scroll" # Z */
	 /* .param p4, "showExit" # Z */
	 /* .param p5, "resourceManager" # Lcom/mobfox/video/sdk/ResourceManager; */
	 /* .prologue */
	 /* .line 44 */
	 /* invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V */
	 /* .line 40 */
	 int v7 = 1; // const/4 v7, 0x1
	 /* iput-boolean v7, p0, Lcom/mobfox/video/sdk/MobFoxWebFrame;->enableZoom:Z */
	 /* .line 45 */
	 this.mActivity = p1;
	 /* .line 46 */
	 /* new-instance v7, Landroid/webkit/WebView; */
	 /* invoke-direct {v7, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
	 this.mWebView = v7;
	 /* .line 47 */
	 v7 = this.mWebView;
	 (( android.webkit.WebView ) v7 ).setVerticalScrollBarEnabled ( p3 ); // invoke-virtual {v7, p3}, Landroid/webkit/WebView;->setVerticalScrollBarEnabled(Z)V
	 /* .line 48 */
	 v7 = this.mWebView;
	 (( android.webkit.WebView ) v7 ).setHorizontalScrollBarEnabled ( p3 ); // invoke-virtual {v7, p3}, Landroid/webkit/WebView;->setHorizontalScrollBarEnabled(Z)V
	 /* .line 49 */
	 v7 = this.mWebView;
	 (( android.webkit.WebView ) v7 ).getSettings ( ); // invoke-virtual {v7}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
	 /* .line 50 */
	 /* .local v6, "webSettings":Landroid/webkit/WebSettings; */
	 int v7 = 0; // const/4 v7, 0x0
	 (( android.webkit.WebSettings ) v6 ).setSavePassword ( v7 ); // invoke-virtual {v6, v7}, Landroid/webkit/WebSettings;->setSavePassword(Z)V
	 /* .line 51 */
	 int v7 = 0; // const/4 v7, 0x0
	 (( android.webkit.WebSettings ) v6 ).setSaveFormData ( v7 ); // invoke-virtual {v6, v7}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V
	 /* .line 52 */
	 int v7 = 1; // const/4 v7, 0x1
	 (( android.webkit.WebSettings ) v6 ).setJavaScriptEnabled ( v7 ); // invoke-virtual {v6, v7}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
	 /* .line 53 */
	 int v7 = 1; // const/4 v7, 0x1
	 (( android.webkit.WebSettings ) v6 ).setPluginsEnabled ( v7 ); // invoke-virtual {v6, v7}, Landroid/webkit/WebSettings;->setPluginsEnabled(Z)V
	 /* .line 54 */
	 /* iget-boolean v7, p0, Lcom/mobfox/video/sdk/MobFoxWebFrame;->enableZoom:Z */
	 (( android.webkit.WebSettings ) v6 ).setSupportZoom ( v7 ); // invoke-virtual {v6, v7}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V
	 /* .line 55 */
	 /* iget-boolean v7, p0, Lcom/mobfox/video/sdk/MobFoxWebFrame;->enableZoom:Z */
	 (( android.webkit.WebSettings ) v6 ).setBuiltInZoomControls ( v7 ); // invoke-virtual {v6, v7}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V
	 /* .line 58 */
	 /* new-instance v7, Lcom/mobfox/video/sdk/MobFoxWebViewClient; */
	 v8 = this.mActivity;
	 /* invoke-direct {v7, v8, p2}, Lcom/mobfox/video/sdk/MobFoxWebViewClient;-><init>(Landroid/app/Activity;Z)V */
	 this.mWebViewClient = v7;
	 /* .line 59 */
	 v7 = this.mWebView;
	 v8 = this.mWebViewClient;
	 (( android.webkit.WebView ) v7 ).setWebViewClient ( v8 ); // invoke-virtual {v7, v8}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
	 /* .line 60 */
	 v7 = this.mWebView;
	 /* new-instance v8, Lcom/mobfox/video/sdk/MobFoxWebChromeClient; */
	 v9 = this.mActivity;
	 /* invoke-direct {v8, v9}, Lcom/mobfox/video/sdk/MobFoxWebChromeClient;-><init>(Landroid/app/Activity;)V */
	 (( android.webkit.WebView ) v7 ).setWebChromeClient ( v8 ); // invoke-virtual {v7, v8}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
	 /* .line 63 */
	 /* move-object v3, p1 */
	 /* .line 64 */
	 /* .local v3, "localContext":Landroid/app/Activity; */
	 if ( p4 != null) { // if-eqz p4, :cond_0
		 /* .line 65 */
		 /* new-instance v1, Landroid/widget/ImageView; */
		 /* invoke-direct {v1, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V */
		 /* .line 66 */
		 /* .local v1, "bg":Landroid/widget/ImageView; */
		 int v7 = -1; // const/4 v7, -0x1
		 (( android.widget.ImageView ) v1 ).setBackgroundColor ( v7 ); // invoke-virtual {v1, v7}, Landroid/widget/ImageView;->setBackgroundColor(I)V
		 /* .line 67 */
		 /* new-instance v7, Landroid/widget/FrameLayout$LayoutParams; */
		 /* .line 68 */
		 int v8 = -1; // const/4 v8, -0x1
		 /* .line 69 */
		 int v9 = -1; // const/4 v9, -0x1
		 /* const/16 v10, 0x11 */
		 /* invoke-direct {v7, v8, v9, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V */
		 /* .line 67 */
		 (( com.mobfox.video.sdk.MobFoxWebFrame ) p0 ).addView ( v1, v7 ); // invoke-virtual {p0, v1, v7}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
		 /* .line 70 */
		 v7 = this.mWebView;
		 /* new-instance v8, Landroid/widget/FrameLayout$LayoutParams; */
		 /* .line 71 */
		 int v9 = -1; // const/4 v9, -0x1
		 /* .line 72 */
		 int v10 = -1; // const/4 v10, -0x1
		 /* const/16 v11, 0x11 */
		 /* invoke-direct {v8, v9, v10, v11}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V */
		 /* .line 70 */
		 (( com.mobfox.video.sdk.MobFoxWebFrame ) p0 ).addView ( v7, v8 ); // invoke-virtual {p0, v7, v8}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
		 /* .line 73 */
		 /* new-instance v7, Landroid/widget/ImageView; */
		 /* invoke-direct {v7, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V */
		 this.mExitButton = v7;
		 /* .line 74 */
		 v7 = this.mExitButton;
		 int v8 = 0; // const/4 v8, 0x0
		 (( android.widget.ImageView ) v7 ).setAdjustViewBounds ( v8 ); // invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setAdjustViewBounds(Z)V
		 /* .line 75 */
		 v7 = this.mExitButton;
		 /* new-instance v8, Lcom/mobfox/video/sdk/MobFoxWebFrame$1; */
		 /* invoke-direct {v8, p0, v3}, Lcom/mobfox/video/sdk/MobFoxWebFrame$1;-><init>(Lcom/mobfox/video/sdk/MobFoxWebFrame;Landroid/app/Activity;)V */
		 (( android.widget.ImageView ) v7 ).setOnClickListener ( v8 ); // invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 /* .line 84 */
		 int v7 = 1; // const/4 v7, 0x1
		 /* const/high16 v8, 0x420c0000 # 35.0f */
		 (( com.mobfox.video.sdk.MobFoxWebFrame ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->getResources()Landroid/content/res/Resources;
		 /* .line 85 */
		 (( android.content.res.Resources ) v9 ).getDisplayMetrics ( ); // invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
		 /* .line 83 */
		 v7 = 		 android.util.TypedValue .applyDimension ( v7,v8,v9 );
		 /* float-to-int v2, v7 */
		 /* .line 87 */
		 /* .local v2, "buttonSize":I */
		 v7 = this.mExitButton;
		 /* .line 88 */
		 /* const/16 v8, -0x12 */
		 /* move-object/from16 v0, p5 */
		 (( com.mobfox.video.sdk.ResourceManager ) v0 ).getResource ( v8 ); // invoke-virtual {v0, v8}, Lcom/mobfox/video/sdk/ResourceManager;->getResource(I)Landroid/graphics/drawable/Drawable;
		 /* .line 87 */
		 (( android.widget.ImageView ) v7 ).setImageDrawable ( v8 ); // invoke-virtual {v7, v8}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
		 /* .line 89 */
		 /* new-instance v5, Landroid/widget/FrameLayout$LayoutParams; */
		 /* .line 91 */
		 /* const/16 v7, 0x35 */
		 /* .line 89 */
		 /* invoke-direct {v5, v2, v2, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V */
		 /* .line 94 */
		 /* .local v5, "params":Landroid/widget/FrameLayout$LayoutParams; */
		 int v7 = 1; // const/4 v7, 0x1
		 /* const/high16 v8, 0x40c00000 # 6.0f */
		 (( com.mobfox.video.sdk.MobFoxWebFrame ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->getResources()Landroid/content/res/Resources;
		 /* .line 95 */
		 (( android.content.res.Resources ) v9 ).getDisplayMetrics ( ); // invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
		 /* .line 93 */
		 v7 = 		 android.util.TypedValue .applyDimension ( v7,v8,v9 );
		 /* float-to-int v4, v7 */
		 /* .line 96 */
		 /* .local v4, "margin":I */
		 /* iput v4, v5, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I */
		 /* .line 97 */
		 /* iput v4, v5, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I */
		 /* .line 98 */
		 v7 = this.mExitButton;
		 (( com.mobfox.video.sdk.MobFoxWebFrame ) p0 ).addView ( v7, v5 ); // invoke-virtual {p0, v7, v5}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
		 /* .line 107 */
	 } // .end local v1 # "bg":Landroid/widget/ImageView;
} // .end local v2 # "buttonSize":I
} // .end local v4 # "margin":I
} // .end local v5 # "params":Landroid/widget/FrameLayout$LayoutParams;
} // :goto_0
return;
/* .line 101 */
} // :cond_0
v7 = this.mWebView;
/* new-instance v8, Landroid/widget/FrameLayout$LayoutParams; */
/* .line 102 */
int v9 = -1; // const/4 v9, -0x1
/* .line 103 */
int v10 = -1; // const/4 v10, -0x1
/* const/16 v11, 0x11 */
/* invoke-direct {v8, v9, v10, v11}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V */
/* .line 101 */
(( com.mobfox.video.sdk.MobFoxWebFrame ) p0 ).addView ( v7, v8 ); // invoke-virtual {p0, v7, v8}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
} // .end method
static java.lang.String access$0 ( com.mobfox.video.sdk.MobFoxWebFrame p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 198 */
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->getUserAgentString()Ljava/lang/String; */
} // .end method
static com.mobfox.video.sdk.MobFoxWebViewClient access$1 ( com.mobfox.video.sdk.MobFoxWebFrame p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 36 */
v0 = this.mWebViewClient;
} // .end method
static android.webkit.WebView access$2 ( com.mobfox.video.sdk.MobFoxWebFrame p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 35 */
v0 = this.mWebView;
} // .end method
private void attachController ( ) {
/* .locals 1 */
/* .prologue */
/* .line 247 */
v0 = this.mController;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 248 */
v0 = this.mController;
(( com.mobfox.video.sdk.MobFoxInterstitialController ) v0 ).setBrowser ( p0 ); // invoke-virtual {v0, p0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->setBrowser(Lcom/mobfox/video/sdk/MobFoxInterstitialController$BrowserControl;)V
/* .line 250 */
} // :cond_0
return;
} // .end method
private java.lang.String getUserAgentString ( ) {
/* .locals 1 */
/* .prologue */
/* .line 199 */
v0 = this.mWebView;
(( android.webkit.WebView ) v0 ).getSettings ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
(( android.webkit.WebSettings ) v0 ).getUserAgentString ( ); // invoke-virtual {v0}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;
} // .end method
/* # virtual methods */
public Boolean canGoBack ( ) {
/* .locals 1 */
/* .prologue */
/* .line 219 */
v0 = this.mWebView;
v0 = (( android.webkit.WebView ) v0 ).canGoBack ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z
} // .end method
public Boolean canGoForward ( ) {
/* .locals 1 */
/* .prologue */
/* .line 227 */
v0 = this.mWebView;
v0 = (( android.webkit.WebView ) v0 ).canGoForward ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->canGoForward()Z
} // .end method
public java.lang.String getPageTitle ( ) {
/* .locals 1 */
/* .prologue */
/* .line 275 */
v0 = this.mWebView;
(( android.webkit.WebView ) v0 ).getTitle ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;
} // .end method
public Integer getTime ( ) {
/* .locals 5 */
/* .prologue */
/* .line 254 */
int v2 = 0; // const/4 v2, 0x0
/* .line 255 */
/* .local v2, "time":I */
v3 = this.mWebViewClient;
(( com.mobfox.video.sdk.MobFoxWebViewClient ) v3 ).getFinishedLoadingTime ( ); // invoke-virtual {v3}, Lcom/mobfox/video/sdk/MobFoxWebViewClient;->getFinishedLoadingTime()J
/* move-result-wide v0 */
/* .line 256 */
/* .local v0, "finishedLoadedTime":J */
/* const-wide/16 v3, 0x0 */
/* cmp-long v3, v0, v3 */
/* if-lez v3, :cond_0 */
/* .line 257 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v3 */
/* sub-long/2addr v3, v0 */
/* long-to-int v2, v3 */
/* .line 259 */
} // .end local v2 # "time":I
} // :cond_0
} // .end method
public android.webkit.WebView getWebView ( ) {
/* .locals 1 */
/* .prologue */
/* .line 203 */
v0 = this.mWebView;
} // .end method
public void goBack ( ) {
/* .locals 1 */
/* .prologue */
/* .line 223 */
v0 = this.mWebView;
(( android.webkit.WebView ) v0 ).goBack ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V
/* .line 224 */
return;
} // .end method
public void goForward ( ) {
/* .locals 1 */
/* .prologue */
/* .line 231 */
v0 = this.mWebView;
(( android.webkit.WebView ) v0 ).goForward ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->goForward()V
/* .line 232 */
return;
} // .end method
public Boolean isEnableZoom ( ) {
/* .locals 1 */
/* .prologue */
/* .line 283 */
/* iget-boolean v0, p0, Lcom/mobfox/video/sdk/MobFoxWebFrame;->enableZoom:Z */
} // .end method
public void launchExternalBrowser ( ) {
/* .locals 4 */
/* .prologue */
/* .line 265 */
v2 = this.mWebViewClient;
(( com.mobfox.video.sdk.MobFoxWebViewClient ) v2 ).getAllowedUrl ( ); // invoke-virtual {v2}, Lcom/mobfox/video/sdk/MobFoxWebViewClient;->getAllowedUrl()Ljava/lang/String;
/* .line 266 */
/* .local v1, "url":Ljava/lang/String; */
if ( v1 != null) { // if-eqz v1, :cond_0
v2 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* if-nez v2, :cond_1 */
/* .line 267 */
} // :cond_0
final String v1 = "about:blank"; // const-string v1, "about:blank"
/* .line 269 */
} // :cond_1
/* new-instance v0, Landroid/content/Intent; */
final String v2 = "android.intent.action.VIEW"; // const-string v2, "android.intent.action.VIEW"
android.net.Uri .parse ( v1 );
/* invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
/* .line 270 */
/* .local v0, "intent":Landroid/content/Intent; */
v2 = this.mActivity;
(( android.app.Activity ) v2 ).startActivity ( v0 ); // invoke-virtual {v2, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
/* .line 271 */
return;
} // .end method
public void loadUrl ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 110 */
/* new-instance v0, Lcom/mobfox/video/sdk/MobFoxWebFrame$LoadUrlTask; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1}, Lcom/mobfox/video/sdk/MobFoxWebFrame$LoadUrlTask;-><init>(Lcom/mobfox/video/sdk/MobFoxWebFrame;Lcom/mobfox/video/sdk/MobFoxWebFrame$LoadUrlTask;)V */
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [Ljava/lang/String; */
int v2 = 0; // const/4 v2, 0x0
/* aput-object p1, v1, v2 */
(( com.mobfox.video.sdk.MobFoxWebFrame$LoadUrlTask ) v0 ).execute ( v1 ); // invoke-virtual {v0, v1}, Lcom/mobfox/video/sdk/MobFoxWebFrame$LoadUrlTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
/* .line 111 */
return;
} // .end method
public Boolean onInterceptTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 1 */
/* .param p1, "ev" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 208 */
(( com.mobfox.video.sdk.MobFoxWebFrame ) p0 ).onTouchEvent ( p1 ); // invoke-virtual {p0, p1}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->onTouchEvent(Landroid/view/MotionEvent;)Z
/* .line 209 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 1 */
/* .param p1, "event" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 214 */
/* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z */
/* .line 215 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void reload ( ) {
/* .locals 1 */
/* .prologue */
/* .line 235 */
v0 = this.mWebView;
(( android.webkit.WebView ) v0 ).reload ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->reload()V
/* .line 236 */
return;
} // .end method
public void setBackgroundColor ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "color" # I */
/* .prologue */
/* .line 121 */
/* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V */
/* .line 122 */
v0 = this.mWebView;
(( android.webkit.WebView ) v0 ).setBackgroundColor ( p1 ); // invoke-virtual {v0, p1}, Landroid/webkit/WebView;->setBackgroundColor(I)V
/* .line 123 */
return;
} // .end method
public void setBrowserController ( com.mobfox.video.sdk.MobFoxInterstitialController p0 ) {
/* .locals 1 */
/* .param p1, "controller" # Lcom/mobfox/video/sdk/MobFoxInterstitialController; */
/* .prologue */
/* .line 239 */
v0 = this.mController;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 240 */
v0 = this.mController;
(( com.mobfox.video.sdk.MobFoxInterstitialController ) v0 ).hide ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->hide()V
/* .line 242 */
} // :cond_0
this.mController = p1;
/* .line 243 */
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxWebFrame;->attachController()V */
/* .line 244 */
return;
} // .end method
public void setEnableZoom ( Boolean p0 ) {
/* .locals 2 */
/* .param p1, "enableZoom" # Z */
/* .prologue */
/* .line 287 */
/* iput-boolean p1, p0, Lcom/mobfox/video/sdk/MobFoxWebFrame;->enableZoom:Z */
/* .line 288 */
v1 = this.mWebView;
(( android.webkit.WebView ) v1 ).getSettings ( ); // invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
/* .line 289 */
/* .local v0, "webSettings":Landroid/webkit/WebSettings; */
(( android.webkit.WebSettings ) v0 ).setSupportZoom ( p1 ); // invoke-virtual {v0, p1}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V
/* .line 290 */
(( android.webkit.WebSettings ) v0 ).setBuiltInZoomControls ( p1 ); // invoke-virtual {v0, p1}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V
/* .line 291 */
return;
} // .end method
public void setMarkup ( java.lang.String p0 ) {
/* .locals 4 */
/* .param p1, "htmlMarkup" # Ljava/lang/String; */
/* .prologue */
/* .line 114 */
android.net.Uri .encode ( p1 );
/* .line 115 */
/* .local v0, "data":Ljava/lang/String; */
v1 = this.mWebViewClient;
int v2 = 0; // const/4 v2, 0x0
(( com.mobfox.video.sdk.MobFoxWebViewClient ) v1 ).setAllowedUrl ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/video/sdk/MobFoxWebViewClient;->setAllowedUrl(Ljava/lang/String;)V
/* .line 116 */
v1 = this.mWebView;
final String v2 = "text/html"; // const-string v2, "text/html"
final String v3 = "UTF-8"; // const-string v3, "UTF-8"
(( android.webkit.WebView ) v1 ).loadData ( v0, v2, v3 ); // invoke-virtual {v1, v0, v2, v3}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
/* .line 117 */
return;
} // .end method
public void setOnPageLoadedListener ( com.mobfox.video.sdk.MobFoxWebViewClient$OnPageLoadedListener p0 ) {
/* .locals 1 */
/* .param p1, "l" # Lcom/mobfox/video/sdk/MobFoxWebViewClient$OnPageLoadedListener; */
/* .prologue */
/* .line 279 */
v0 = this.mWebViewClient;
(( com.mobfox.video.sdk.MobFoxWebViewClient ) v0 ).setOnPageLoadedListener ( p1 ); // invoke-virtual {v0, p1}, Lcom/mobfox/video/sdk/MobFoxWebViewClient;->setOnPageLoadedListener(Lcom/mobfox/video/sdk/MobFoxWebViewClient$OnPageLoadedListener;)V
/* .line 280 */
return;
} // .end method

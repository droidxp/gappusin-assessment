public class com.jumptap.adtag.JtAdView extends android.widget.RelativeLayout implements com.jumptap.adtag.listeners.JtAdViewInnerListener {
	 /* .source "JtAdView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/jumptap/adtag/JtAdView$PerformActionHandler;, */
	 /* Lcom/jumptap/adtag/JtAdView$JtAdWebViewClient;, */
	 /* Lcom/jumptap/adtag/JtAdView$JtAdListener; */
	 /* } */
} // .end annotation
/* # static fields */
private static final Integer DISMISS_BTN_HIEGHT;
private static final Integer DISMISS_BTN_ID;
private static final Integer DISMISS_BTN_TEXT_SIZE;
protected static final Integer MILLIS_IN_SEC;
/* # instance fields */
protected Integer ACTIVE_WEBVIEW_INDEX;
protected Integer INACTIVE_WEBVIEW_INDEX;
private com.jumptap.adtag.utils.JtAccelerator accel;
private java.lang.String adRequestId;
private java.lang.String adRequestUrl;
private com.jumptap.adtag.utils.JtAdUrlBuilder adUrlBuilder;
protected com.jumptap.adtag.JtAdViewListener adViewListener;
protected android.content.Context context;
protected android.widget.TextView dismiss;
private com.jumptap.adtag.callbacks.EmptyBodyChecker emptyBodyChecker;
protected com.jumptap.adtag.events.EventManager eventManager;
private com.jumptap.adtag.utils.JtAdFetcher fetcher;
private android.widget.ImageView imgView;
private Boolean isOnReceivedErrorCalled;
private Boolean isWindowVisible;
private Boolean launchedActivity;
private java.lang.Runnable loadUrlRunnable;
private android.app.ProgressDialog progressDialog;
private Boolean refreshIsImmediate;
private java.lang.String responseContent;
protected android.webkit.WebView webViewArr;
protected com.jumptap.adtag.JtAdWidgetSettings widgetSettings;
/* # direct methods */
public com.jumptap.adtag.JtAdView ( ) {
	 /* .locals 3 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lcom/jumptap/adtag/utils/JtException; */
	 /* } */
} // .end annotation
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
int v1 = 0; // const/4 v1, 0x0
/* .line 86 */
/* invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V */
/* .line 48 */
/* iput v1, p0, Lcom/jumptap/adtag/JtAdView;->ACTIVE_WEBVIEW_INDEX:I */
/* .line 49 */
int v0 = 1; // const/4 v0, 0x1
/* iput v0, p0, Lcom/jumptap/adtag/JtAdView;->INACTIVE_WEBVIEW_INDEX:I */
/* .line 53 */
this.widgetSettings = v2;
/* .line 67 */
/* iput-boolean v1, p0, Lcom/jumptap/adtag/JtAdView;->refreshIsImmediate:Z */
/* .line 71 */
/* iput-boolean v1, p0, Lcom/jumptap/adtag/JtAdView;->isWindowVisible:Z */
/* .line 72 */
/* iput-boolean v1, p0, Lcom/jumptap/adtag/JtAdView;->isOnReceivedErrorCalled:Z */
/* .line 74 */
final String v0 = ""; // const-string v0, ""
this.responseContent = v0;
/* .line 75 */
final String v0 = ""; // const-string v0, ""
this.adRequestUrl = v0;
/* .line 76 */
final String v0 = ""; // const-string v0, ""
this.adRequestId = v0;
/* .line 78 */
/* iput-boolean v1, p0, Lcom/jumptap/adtag/JtAdView;->launchedActivity:Z */
/* .line 87 */
final String v0 = "JtAd"; // const-string v0, "JtAd"
final String v1 = "JtAdView(Context context)"; // const-string v1, "JtAdView(Context context)"
android.util.Log .d ( v0,v1 );
/* .line 89 */
/* invoke-direct {p0, p1, v2}, Lcom/jumptap/adtag/JtAdView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V */
/* .line 90 */
return;
} // .end method
public com.jumptap.adtag.JtAdView ( ) {
/* .locals 2 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "attrs" # Landroid/util/AttributeSet; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/jumptap/adtag/utils/JtException; */
/* } */
} // .end annotation
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 114 */
/* invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
/* .line 48 */
/* iput v1, p0, Lcom/jumptap/adtag/JtAdView;->ACTIVE_WEBVIEW_INDEX:I */
/* .line 49 */
int v0 = 1; // const/4 v0, 0x1
/* iput v0, p0, Lcom/jumptap/adtag/JtAdView;->INACTIVE_WEBVIEW_INDEX:I */
/* .line 53 */
int v0 = 0; // const/4 v0, 0x0
this.widgetSettings = v0;
/* .line 67 */
/* iput-boolean v1, p0, Lcom/jumptap/adtag/JtAdView;->refreshIsImmediate:Z */
/* .line 71 */
/* iput-boolean v1, p0, Lcom/jumptap/adtag/JtAdView;->isWindowVisible:Z */
/* .line 72 */
/* iput-boolean v1, p0, Lcom/jumptap/adtag/JtAdView;->isOnReceivedErrorCalled:Z */
/* .line 74 */
final String v0 = ""; // const-string v0, ""
this.responseContent = v0;
/* .line 75 */
final String v0 = ""; // const-string v0, ""
this.adRequestUrl = v0;
/* .line 76 */
final String v0 = ""; // const-string v0, ""
this.adRequestId = v0;
/* .line 78 */
/* iput-boolean v1, p0, Lcom/jumptap/adtag/JtAdView;->launchedActivity:Z */
/* .line 115 */
final String v0 = "JtAd"; // const-string v0, "JtAd"
final String v1 = "JtAdView(Context context, AttributeSet attrs)"; // const-string v1, "JtAdView(Context context, AttributeSet attrs)"
android.util.Log .d ( v0,v1 );
/* .line 117 */
/* invoke-direct {p0, p1, p2}, Lcom/jumptap/adtag/JtAdView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V */
/* .line 118 */
return;
} // .end method
public com.jumptap.adtag.JtAdView ( ) {
/* .locals 2 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "attrs" # Landroid/util/AttributeSet; */
/* .param p3, "defStyle" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/jumptap/adtag/utils/JtException; */
/* } */
} // .end annotation
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 128 */
/* invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
/* .line 48 */
/* iput v1, p0, Lcom/jumptap/adtag/JtAdView;->ACTIVE_WEBVIEW_INDEX:I */
/* .line 49 */
int v0 = 1; // const/4 v0, 0x1
/* iput v0, p0, Lcom/jumptap/adtag/JtAdView;->INACTIVE_WEBVIEW_INDEX:I */
/* .line 53 */
int v0 = 0; // const/4 v0, 0x0
this.widgetSettings = v0;
/* .line 67 */
/* iput-boolean v1, p0, Lcom/jumptap/adtag/JtAdView;->refreshIsImmediate:Z */
/* .line 71 */
/* iput-boolean v1, p0, Lcom/jumptap/adtag/JtAdView;->isWindowVisible:Z */
/* .line 72 */
/* iput-boolean v1, p0, Lcom/jumptap/adtag/JtAdView;->isOnReceivedErrorCalled:Z */
/* .line 74 */
final String v0 = ""; // const-string v0, ""
this.responseContent = v0;
/* .line 75 */
final String v0 = ""; // const-string v0, ""
this.adRequestUrl = v0;
/* .line 76 */
final String v0 = ""; // const-string v0, ""
this.adRequestId = v0;
/* .line 78 */
/* iput-boolean v1, p0, Lcom/jumptap/adtag/JtAdView;->launchedActivity:Z */
/* .line 129 */
final String v0 = "JtAd"; // const-string v0, "JtAd"
final String v1 = "JtAdView(Context context, AttributeSet attrs, int defStyle)"; // const-string v1, "JtAdView(Context context, AttributeSet attrs, int defStyle)"
android.util.Log .d ( v0,v1 );
/* .line 131 */
/* invoke-direct {p0, p1, p2}, Lcom/jumptap/adtag/JtAdView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V */
/* .line 132 */
return;
} // .end method
public com.jumptap.adtag.JtAdView ( ) {
/* .locals 3 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "widgetSettings" # Lcom/jumptap/adtag/JtAdWidgetSettings; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/jumptap/adtag/utils/JtException; */
/* } */
} // .end annotation
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
int v1 = 0; // const/4 v1, 0x0
/* .line 99 */
/* invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V */
/* .line 48 */
/* iput v1, p0, Lcom/jumptap/adtag/JtAdView;->ACTIVE_WEBVIEW_INDEX:I */
/* .line 49 */
int v0 = 1; // const/4 v0, 0x1
/* iput v0, p0, Lcom/jumptap/adtag/JtAdView;->INACTIVE_WEBVIEW_INDEX:I */
/* .line 53 */
this.widgetSettings = v2;
/* .line 67 */
/* iput-boolean v1, p0, Lcom/jumptap/adtag/JtAdView;->refreshIsImmediate:Z */
/* .line 71 */
/* iput-boolean v1, p0, Lcom/jumptap/adtag/JtAdView;->isWindowVisible:Z */
/* .line 72 */
/* iput-boolean v1, p0, Lcom/jumptap/adtag/JtAdView;->isOnReceivedErrorCalled:Z */
/* .line 74 */
final String v0 = ""; // const-string v0, ""
this.responseContent = v0;
/* .line 75 */
final String v0 = ""; // const-string v0, ""
this.adRequestUrl = v0;
/* .line 76 */
final String v0 = ""; // const-string v0, ""
this.adRequestId = v0;
/* .line 78 */
/* iput-boolean v1, p0, Lcom/jumptap/adtag/JtAdView;->launchedActivity:Z */
/* .line 100 */
this.widgetSettings = p2;
/* .line 102 */
final String v0 = "JtAd"; // const-string v0, "JtAd"
final String v1 = "JtAdView(Context context, JtAdWidgetSettings widgetSettings)"; // const-string v1, "JtAdView(Context context, JtAdWidgetSettings widgetSettings)"
android.util.Log .d ( v0,v1 );
/* .line 104 */
/* invoke-direct {p0, p1, v2}, Lcom/jumptap/adtag/JtAdView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V */
/* .line 105 */
return;
} // .end method
static void access$000 ( com.jumptap.adtag.JtAdView p0 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/jumptap/adtag/JtAdView; */
/* .prologue */
/* .line 39 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/JtAdView;->loadUrlIfVisible()V */
return;
} // .end method
static void access$200 ( com.jumptap.adtag.JtAdView p0, Integer p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/jumptap/adtag/JtAdView; */
/* .param p1, "x1" # I */
/* .prologue */
/* .line 39 */
/* invoke-direct {p0, p1}, Lcom/jumptap/adtag/JtAdView;->refreshAd(I)V */
return;
} // .end method
static java.lang.Runnable access$300 ( com.jumptap.adtag.JtAdView p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/jumptap/adtag/JtAdView; */
/* .prologue */
/* .line 39 */
v0 = this.loadUrlRunnable;
} // .end method
static Boolean access$400 ( com.jumptap.adtag.JtAdView p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/jumptap/adtag/JtAdView; */
/* .prologue */
/* .line 39 */
/* iget-boolean v0, p0, Lcom/jumptap/adtag/JtAdView;->isOnReceivedErrorCalled:Z */
} // .end method
static Boolean access$402 ( com.jumptap.adtag.JtAdView p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/jumptap/adtag/JtAdView; */
/* .param p1, "x1" # Z */
/* .prologue */
/* .line 39 */
/* iput-boolean p1, p0, Lcom/jumptap/adtag/JtAdView;->isOnReceivedErrorCalled:Z */
} // .end method
static android.widget.ImageView access$500 ( com.jumptap.adtag.JtAdView p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/jumptap/adtag/JtAdView; */
/* .prologue */
/* .line 39 */
v0 = this.imgView;
} // .end method
static void access$600 ( com.jumptap.adtag.JtAdView p0 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/jumptap/adtag/JtAdView; */
/* .prologue */
/* .line 39 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/JtAdView;->dismissProgressDialog()V */
return;
} // .end method
private void binderBrowser ( android.webkit.WebView p0 ) {
/* .locals 2 */
/* .param p1, "webView" # Landroid/webkit/WebView; */
/* .prologue */
/* .line 552 */
/* new-instance v0, Lcom/jumptap/adtag/callbacks/JtWebviewCb; */
v1 = this.context;
/* invoke-direct {v0, v1, p0}, Lcom/jumptap/adtag/callbacks/JtWebviewCb;-><init>(Landroid/content/Context;Lcom/jumptap/adtag/listeners/JtAdViewInnerListener;)V */
final String v1 = "JtVwCb"; // const-string v1, "JtVwCb"
(( android.webkit.WebView ) p1 ).addJavascriptInterface ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
/* .line 554 */
/* new-instance v0, Lcom/jumptap/adtag/utils/JtAccelerator; */
v1 = this.context;
/* invoke-direct {v0, v1, p1}, Lcom/jumptap/adtag/utils/JtAccelerator;-><init>(Landroid/content/Context;Landroid/webkit/WebView;)V */
this.accel = v0;
/* .line 555 */
v0 = this.accel;
final String v1 = "Accel"; // const-string v1, "Accel"
(( android.webkit.WebView ) p1 ).addJavascriptInterface ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
/* .line 556 */
v0 = this.eventManager;
final String v1 = "Tracking"; // const-string v1, "Tracking"
(( android.webkit.WebView ) p1 ).addJavascriptInterface ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
/* .line 557 */
v0 = this.emptyBodyChecker;
final String v1 = "EmptyBodyChecker"; // const-string v1, "EmptyBodyChecker"
(( android.webkit.WebView ) p1 ).addJavascriptInterface ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
/* .line 558 */
return;
} // .end method
private void dismissProgressDialog ( ) {
/* .locals 1 */
/* .prologue */
/* .line 607 */
v0 = this.progressDialog;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 608 */
v0 = this.progressDialog;
(( android.app.ProgressDialog ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
/* .line 609 */
int v0 = 0; // const/4 v0, 0x0
this.progressDialog = v0;
/* .line 611 */
} // :cond_0
return;
} // .end method
private Float getDensity ( ) {
/* .locals 1 */
/* .prologue */
/* .line 400 */
(( com.jumptap.adtag.JtAdView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/JtAdView;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget v0, v0, Landroid/util/DisplayMetrics;->density:F */
} // .end method
private void getUrlFromNetwork ( ) {
/* .locals 2 */
/* .prologue */
/* .line 513 */
v0 = this.fetcher;
v1 = this.adRequestUrl;
(( com.jumptap.adtag.utils.JtAdFetcher ) v0 ).kickOffUrlFetch ( v1 ); // invoke-virtual {v0, v1}, Lcom/jumptap/adtag/utils/JtAdFetcher;->kickOffUrlFetch(Ljava/lang/String;)V
/* .line 514 */
return;
} // .end method
private void init ( android.content.Context p0, android.util.AttributeSet p1 ) {
/* .locals 5 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "attrs" # Landroid/util/AttributeSet; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/jumptap/adtag/utils/JtException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 306 */
final String v3 = "JtAd"; // const-string v3, "JtAd"
final String v4 = "getting into init()"; // const-string v4, "getting into init()"
android.util.Log .d ( v3,v4 );
/* .line 308 */
this.context = p1;
/* .line 313 */
/* new-instance v3, Lcom/jumptap/adtag/JtAdView$5; */
/* invoke-direct {v3, p0}, Lcom/jumptap/adtag/JtAdView$5;-><init>(Lcom/jumptap/adtag/JtAdView;)V */
this.loadUrlRunnable = v3;
/* .line 323 */
try { // :try_start_0
/* invoke-direct {p0, p2}, Lcom/jumptap/adtag/JtAdView;->initWidgetSettings(Landroid/util/AttributeSet;)V */
/* .line 325 */
v3 = (( com.jumptap.adtag.JtAdView ) p0 ).getWidthSize ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/JtAdView;->getWidthSize()I
(( com.jumptap.adtag.JtAdView ) p0 ).setMinimumWidth ( v3 ); // invoke-virtual {p0, v3}, Lcom/jumptap/adtag/JtAdView;->setMinimumWidth(I)V
/* .line 326 */
v3 = (( com.jumptap.adtag.JtAdView ) p0 ).getHeightSize ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/JtAdView;->getHeightSize()I
(( com.jumptap.adtag.JtAdView ) p0 ).setMinimumHeight ( v3 ); // invoke-virtual {p0, v3}, Lcom/jumptap/adtag/JtAdView;->setMinimumHeight(I)V
/* .line 329 */
/* new-instance v3, Lcom/jumptap/adtag/utils/JtAdUrlBuilder; */
v4 = this.widgetSettings;
/* invoke-direct {v3, v4, p1}, Lcom/jumptap/adtag/utils/JtAdUrlBuilder;-><init>(Lcom/jumptap/adtag/JtAdWidgetSettings;Landroid/content/Context;)V */
this.adUrlBuilder = v3;
/* .line 332 */
/* new-instance v3, Lcom/jumptap/adtag/events/EventManager; */
/* invoke-direct {v3, p1, p0}, Lcom/jumptap/adtag/events/EventManager;-><init>(Landroid/content/Context;Lcom/jumptap/adtag/listeners/JtAdViewInnerListener;)V */
this.eventManager = v3;
/* .line 335 */
/* new-instance v3, Lcom/jumptap/adtag/callbacks/EmptyBodyChecker; */
v4 = this.eventManager;
/* invoke-direct {v3, p0, v4}, Lcom/jumptap/adtag/callbacks/EmptyBodyChecker;-><init>(Lcom/jumptap/adtag/listeners/JtAdViewInnerListener;Lcom/jumptap/adtag/events/EventManager;)V */
this.emptyBodyChecker = v3;
/* .line 337 */
int v3 = 0; // const/4 v3, 0x0
(( com.jumptap.adtag.JtAdView ) p0 ).setVerticalScrollBarEnabled ( v3 ); // invoke-virtual {p0, v3}, Lcom/jumptap/adtag/JtAdView;->setVerticalScrollBarEnabled(Z)V
/* .line 338 */
int v3 = 0; // const/4 v3, 0x0
(( com.jumptap.adtag.JtAdView ) p0 ).setHorizontalScrollBarEnabled ( v3 ); // invoke-virtual {p0, v3}, Lcom/jumptap/adtag/JtAdView;->setHorizontalScrollBarEnabled(Z)V
/* .line 341 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/JtAdView;->initAlternativeImgView()V */
/* .line 344 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/JtAdView;->initWebViewArray()V */
/* .line 348 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/JtAdView;->initDismissButton()V */
/* .line 350 */
/* new-instance v0, Landroid/widget/RelativeLayout$LayoutParams; */
v3 = (( com.jumptap.adtag.JtAdView ) p0 ).getWidthSize ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/JtAdView;->getWidthSize()I
v4 = (( com.jumptap.adtag.JtAdView ) p0 ).getDismissBtnHeight ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/JtAdView;->getDismissBtnHeight()I
/* invoke-direct {v0, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
/* .line 351 */
/* .local v0, "dismissBtnRlp":Landroid/widget/RelativeLayout$LayoutParams; */
v3 = this.dismiss;
(( com.jumptap.adtag.JtAdView ) p0 ).addView ( v3, v0 ); // invoke-virtual {p0, v3, v0}, Lcom/jumptap/adtag/JtAdView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 353 */
/* new-instance v2, Landroid/widget/RelativeLayout$LayoutParams; */
v3 = (( com.jumptap.adtag.JtAdView ) p0 ).getWidthSize ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/JtAdView;->getWidthSize()I
v4 = (( com.jumptap.adtag.JtAdView ) p0 ).getHeightSize ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/JtAdView;->getHeightSize()I
/* invoke-direct {v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
/* .line 354 */
/* .local v2, "viewsRlp":Landroid/widget/RelativeLayout$LayoutParams; */
int v3 = 3; // const/4 v3, 0x3
/* const v4, 0xf423f */
(( android.widget.RelativeLayout$LayoutParams ) v2 ).addRule ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V
/* .line 355 */
/* const/16 v3, 0xe */
(( android.widget.RelativeLayout$LayoutParams ) v2 ).addRule ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
/* .line 356 */
v3 = this.webViewArr;
/* iget v4, p0, Lcom/jumptap/adtag/JtAdView;->INACTIVE_WEBVIEW_INDEX:I */
/* aget-object v3, v3, v4 */
(( com.jumptap.adtag.JtAdView ) p0 ).addView ( v3, v2 ); // invoke-virtual {p0, v3, v2}, Lcom/jumptap/adtag/JtAdView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 357 */
v3 = this.webViewArr;
/* iget v4, p0, Lcom/jumptap/adtag/JtAdView;->ACTIVE_WEBVIEW_INDEX:I */
/* aget-object v3, v3, v4 */
(( com.jumptap.adtag.JtAdView ) p0 ).addView ( v3, v2 ); // invoke-virtual {p0, v3, v2}, Lcom/jumptap/adtag/JtAdView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 358 */
v3 = this.imgView;
(( com.jumptap.adtag.JtAdView ) p0 ).addView ( v3, v2 ); // invoke-virtual {p0, v3, v2}, Lcom/jumptap/adtag/JtAdView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 361 */
/* new-instance v3, Lcom/jumptap/adtag/utils/JtAdFetcher; */
/* invoke-direct {v3, p1, p0}, Lcom/jumptap/adtag/utils/JtAdFetcher;-><init>(Landroid/content/Context;Lcom/jumptap/adtag/listeners/JtAdViewInnerListener;)V */
this.fetcher = v3;
/* .line 362 */
v3 = this.fetcher;
v4 = this.widgetSettings;
v4 = (( com.jumptap.adtag.JtAdWidgetSettings ) v4 ).getShouldDebugNetworkTraffic ( ); // invoke-virtual {v4}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getShouldDebugNetworkTraffic()Z
(( com.jumptap.adtag.utils.JtAdFetcher ) v3 ).setShouldDebugNetworkTraffic ( v4 ); // invoke-virtual {v3, v4}, Lcom/jumptap/adtag/utils/JtAdFetcher;->setShouldDebugNetworkTraffic(Z)V
/* :try_end_0 */
/* .catch Lcom/jumptap/adtag/utils/JtException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 369 */
return;
/* .line 364 */
} // .end local v0 # "dismissBtnRlp":Landroid/widget/RelativeLayout$LayoutParams;
} // .end local v2 # "viewsRlp":Landroid/widget/RelativeLayout$LayoutParams;
/* :catch_0 */
/* move-exception v1 */
/* .line 365 */
/* .local v1, "e":Lcom/jumptap/adtag/utils/JtException; */
final String v3 = "JtAd"; // const-string v3, "JtAd"
(( com.jumptap.adtag.utils.JtException ) v1 ).getMessage ( ); // invoke-virtual {v1}, Lcom/jumptap/adtag/utils/JtException;->getMessage()Ljava/lang/String;
android.util.Log .e ( v3,v4 );
/* .line 367 */
/* throw v1 */
} // .end method
private void initAlternativeImgView ( ) {
/* .locals 2 */
/* .prologue */
/* .line 561 */
/* new-instance v0, Landroid/widget/ImageView; */
v1 = this.context;
/* invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V */
this.imgView = v0;
/* .line 567 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/JtAdView;->setBgAndImg()V */
/* .line 568 */
return;
} // .end method
private void initDismissButton ( ) {
/* .locals 2 */
/* .prologue */
/* .line 372 */
/* new-instance v0, Landroid/widget/TextView; */
v1 = this.context;
/* invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V */
this.dismiss = v0;
/* .line 373 */
v0 = this.dismiss;
/* const v1, 0xf423f */
(( android.widget.TextView ) v0 ).setId ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setId(I)V
/* .line 374 */
v0 = this.dismiss;
v1 = this.widgetSettings;
(( com.jumptap.adtag.JtAdWidgetSettings ) v1 ).getDismissButtonLabel ( ); // invoke-virtual {v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getDismissButtonLabel()Ljava/lang/String;
(( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 375 */
v0 = this.dismiss;
/* const/16 v1, 0x8 */
(( android.widget.TextView ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
/* .line 376 */
v0 = this.dismiss;
int v1 = 1; // const/4 v1, 0x1
(( android.widget.TextView ) v0 ).setClickable ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setClickable(Z)V
/* .line 377 */
v0 = this.dismiss;
/* const/high16 v1, -0x1000000 */
(( android.widget.TextView ) v0 ).setTextColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
/* .line 378 */
v0 = this.dismiss;
/* const/high16 v1, 0x41a00000 # 20.0f */
(( android.widget.TextView ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V
/* .line 379 */
v0 = this.dismiss;
/* const v1, -0x777778 */
(( android.widget.TextView ) v0 ).setBackgroundColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundColor(I)V
/* .line 380 */
return;
} // .end method
private void initWebView ( android.webkit.WebView p0 ) {
/* .locals 3 */
/* .param p1, "webView" # Landroid/webkit/WebView; */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 530 */
(( android.webkit.WebView ) p1 ).setVerticalScrollBarEnabled ( v1 ); // invoke-virtual {p1, v1}, Landroid/webkit/WebView;->setVerticalScrollBarEnabled(Z)V
/* .line 531 */
(( android.webkit.WebView ) p1 ).setHorizontalScrollBarEnabled ( v1 ); // invoke-virtual {p1, v1}, Landroid/webkit/WebView;->setHorizontalScrollBarEnabled(Z)V
/* .line 532 */
(( android.webkit.WebView ) p1 ).getSettings ( ); // invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
int v2 = 1; // const/4 v2, 0x1
(( android.webkit.WebSettings ) v1 ).setJavaScriptEnabled ( v2 ); // invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
/* .line 533 */
int v1 = 4; // const/4 v1, 0x4
(( android.webkit.WebView ) p1 ).setVisibility ( v1 ); // invoke-virtual {p1, v1}, Landroid/webkit/WebView;->setVisibility(I)V
/* .line 539 */
v1 = this.widgetSettings;
v1 = (( com.jumptap.adtag.JtAdWidgetSettings ) v1 ).getBackgroundColor ( ); // invoke-virtual {v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getBackgroundColor()I
(( android.webkit.WebView ) p1 ).setBackgroundColor ( v1 ); // invoke-virtual {p1, v1}, Landroid/webkit/WebView;->setBackgroundColor(I)V
/* .line 541 */
/* invoke-direct {p0, p1}, Lcom/jumptap/adtag/JtAdView;->binderBrowser(Landroid/webkit/WebView;)V */
/* .line 543 */
/* new-instance v1, Lcom/jumptap/adtag/JtAdView$JtAdWebViewClient; */
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v1, p0, v2}, Lcom/jumptap/adtag/JtAdView$JtAdWebViewClient;-><init>(Lcom/jumptap/adtag/JtAdView;Lcom/jumptap/adtag/JtAdView$1;)V */
(( android.webkit.WebView ) p1 ).setWebViewClient ( v1 ); // invoke-virtual {p1, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
/* .line 544 */
/* new-instance v0, Lcom/jumptap/adtag/JtAdView$JtAdListener; */
v1 = (( com.jumptap.adtag.JtAdView ) p0 ).getId ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/JtAdView;->getId()I
/* invoke-direct {v0, p0, p0, v1}, Lcom/jumptap/adtag/JtAdView$JtAdListener;-><init>(Lcom/jumptap/adtag/JtAdView;Lcom/jumptap/adtag/JtAdView;I)V */
/* .line 545 */
/* .local v0, "jtAdListener":Lcom/jumptap/adtag/JtAdView$JtAdListener; */
(( android.webkit.WebView ) p1 ).setOnTouchListener ( v0 ); // invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
/* .line 546 */
(( android.webkit.WebView ) p1 ).setOnFocusChangeListener ( v0 ); // invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V
/* .line 547 */
(( android.webkit.WebView ) p1 ).setOnClickListener ( v0 ); // invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 548 */
(( android.webkit.WebView ) p1 ).setOnLongClickListener ( v0 ); // invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
/* .line 549 */
return;
} // .end method
private void initWebViewArray ( ) {
/* .locals 4 */
/* .prologue */
/* .line 517 */
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [Landroid/webkit/WebView; */
this.webViewArr = v0;
/* .line 518 */
v0 = this.webViewArr;
/* iget v1, p0, Lcom/jumptap/adtag/JtAdView;->ACTIVE_WEBVIEW_INDEX:I */
/* new-instance v2, Landroid/webkit/WebView; */
v3 = this.context;
/* invoke-direct {v2, v3}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
/* aput-object v2, v0, v1 */
/* .line 519 */
v0 = this.webViewArr;
/* iget v1, p0, Lcom/jumptap/adtag/JtAdView;->ACTIVE_WEBVIEW_INDEX:I */
/* aget-object v0, v0, v1 */
/* invoke-direct {p0, v0}, Lcom/jumptap/adtag/JtAdView;->initWebView(Landroid/webkit/WebView;)V */
/* .line 520 */
v0 = this.webViewArr;
/* iget v1, p0, Lcom/jumptap/adtag/JtAdView;->INACTIVE_WEBVIEW_INDEX:I */
/* new-instance v2, Landroid/webkit/WebView; */
v3 = this.context;
/* invoke-direct {v2, v3}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
/* aput-object v2, v0, v1 */
/* .line 521 */
v0 = this.webViewArr;
/* iget v1, p0, Lcom/jumptap/adtag/JtAdView;->INACTIVE_WEBVIEW_INDEX:I */
/* aget-object v0, v0, v1 */
/* invoke-direct {p0, v0}, Lcom/jumptap/adtag/JtAdView;->initWebView(Landroid/webkit/WebView;)V */
/* .line 522 */
return;
} // .end method
private void initWidgetSettings ( android.util.AttributeSet p0 ) {
/* .locals 2 */
/* .param p1, "attributes" # Landroid/util/AttributeSet; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/jumptap/adtag/utils/JtException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 587 */
v0 = this.widgetSettings;
/* if-nez v0, :cond_0 */
/* .line 588 */
com.jumptap.adtag.JtAdWidgetSettingsFactory .createWidgetSettings ( );
this.widgetSettings = v0;
/* .line 591 */
} // :cond_0
v0 = this.widgetSettings;
v1 = this.context;
com.jumptap.adtag.utils.JtSettingsParameters .populateSettings ( v0,p1,v1 );
/* .line 593 */
v0 = this.widgetSettings;
(( com.jumptap.adtag.JtAdWidgetSettings ) v0 ).getPublisherId ( ); // invoke-virtual {v0}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getPublisherId()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_1
final String v0 = ""; // const-string v0, ""
v1 = this.widgetSettings;
(( com.jumptap.adtag.JtAdWidgetSettings ) v1 ).getPublisherId ( ); // invoke-virtual {v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getPublisherId()Ljava/lang/String;
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 594 */
} // :cond_1
/* new-instance v0, Lcom/jumptap/adtag/utils/JtException; */
final String v1 = "Publisher id was not set.Please set it and try again"; // const-string v1, "Publisher id was not set.Please set it and try again"
/* invoke-direct {v0, v1}, Lcom/jumptap/adtag/utils/JtException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 597 */
} // :cond_2
v0 = this.widgetSettings;
(( com.jumptap.adtag.JtAdWidgetSettings ) v0 ).getApplicationId ( ); // invoke-virtual {v0}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getApplicationId()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_3
final String v0 = ""; // const-string v0, ""
v1 = this.widgetSettings;
(( com.jumptap.adtag.JtAdWidgetSettings ) v1 ).getApplicationId ( ); // invoke-virtual {v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getApplicationId()Ljava/lang/String;
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 598 */
} // :cond_3
final String v0 = "JtAd"; // const-string v0, "JtAd"
final String v1 = "Application id was not set.empty application id will be sent to Jumptap servers"; // const-string v1, "Application id was not set.empty application id will be sent to Jumptap servers"
android.util.Log .e ( v0,v1 );
/* .line 601 */
} // :cond_4
v0 = this.widgetSettings;
(( com.jumptap.adtag.JtAdWidgetSettings ) v0 ).getApplicationVersion ( ); // invoke-virtual {v0}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getApplicationVersion()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_5
final String v0 = ""; // const-string v0, ""
v1 = this.widgetSettings;
(( com.jumptap.adtag.JtAdWidgetSettings ) v1 ).getApplicationVersion ( ); // invoke-virtual {v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getApplicationVersion()Ljava/lang/String;
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 602 */
} // :cond_5
final String v0 = "JtAd"; // const-string v0, "JtAd"
final String v1 = "Application version was not set.empty application version will be sent to Jumptap servers"; // const-string v1, "Application version was not set.empty application version will be sent to Jumptap servers"
android.util.Log .e ( v0,v1 );
/* .line 604 */
} // :cond_6
return;
} // .end method
private void loadUrlIfVisible ( ) {
/* .locals 5 */
/* .prologue */
/* .line 485 */
v1 = (( com.jumptap.adtag.JtAdView ) p0 ).getVisibility ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/JtAdView;->getVisibility()I
/* .line 486 */
/* .local v1, "viewVisibility":I */
int v1 = 0; // const/4 v1, 0x0
/* .line 491 */
/* iget-boolean v2, p0, Lcom/jumptap/adtag/JtAdView;->refreshIsImmediate:Z */
/* if-nez v2, :cond_0 */
/* iget-boolean v2, p0, Lcom/jumptap/adtag/JtAdView;->isWindowVisible:Z */
if ( v2 != null) { // if-eqz v2, :cond_2
/* if-nez v1, :cond_2 */
/* .line 492 */
} // :cond_0
v2 = this.context;
final String v3 = "android.permission.INTERNET"; // const-string v3, "android.permission.INTERNET"
v0 = (( android.content.Context ) v2 ).checkCallingOrSelfPermission ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* .line 493 */
/* .local v0, "isInternatePermissionGranted":I */
/* if-nez v0, :cond_3 */
/* .line 494 */
v2 = this.adUrlBuilder;
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 495 */
v2 = this.adUrlBuilder;
v3 = this.webViewArr;
/* iget v4, p0, Lcom/jumptap/adtag/JtAdView;->INACTIVE_WEBVIEW_INDEX:I */
/* aget-object v3, v3, v4 */
(( com.jumptap.adtag.utils.JtAdUrlBuilder ) v2 ).getAdUrl ( v3 ); // invoke-virtual {v2, v3}, Lcom/jumptap/adtag/utils/JtAdUrlBuilder;->getAdUrl(Landroid/webkit/WebView;)Ljava/lang/String;
this.adRequestUrl = v2;
/* .line 496 */
v2 = this.widgetSettings;
v2 = (( com.jumptap.adtag.JtAdWidgetSettings ) v2 ).getShouldDebugNetworkTraffic ( ); // invoke-virtual {v2}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getShouldDebugNetworkTraffic()Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 497 */
final String v2 = "JtAd"; // const-string v2, "JtAd"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Base url : "; // const-string v4, "Base url : "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.adRequestUrl;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v2,v3 );
/* .line 499 */
} // :cond_1
/* invoke-direct {p0}, Lcom/jumptap/adtag/JtAdView;->getUrlFromNetwork()V */
/* .line 507 */
} // .end local v0 # "isInternatePermissionGranted":I
} // :cond_2
} // :goto_0
return;
/* .line 503 */
/* .restart local v0 # "isInternatePermissionGranted":I */
} // :cond_3
final String v2 = "JtAd"; // const-string v2, "JtAd"
final String v3 = "JtAdView: Requires INTERNET permission"; // const-string v3, "JtAdView: Requires INTERNET permission"
android.util.Log .e ( v2,v3 );
/* .line 504 */
int v2 = -1; // const/4 v2, -0x1
(( com.jumptap.adtag.JtAdView ) p0 ).onAdError ( v2 ); // invoke-virtual {p0, v2}, Lcom/jumptap/adtag/JtAdView;->onAdError(I)V
} // .end method
private void refreshAd ( Integer p0 ) {
/* .locals 4 */
/* .param p1, "refreshPeriod" # I */
/* .prologue */
/* .line 184 */
/* if-nez p1, :cond_0 */
/* .line 185 */
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, p0, Lcom/jumptap/adtag/JtAdView;->refreshIsImmediate:Z */
/* .line 190 */
} // :goto_0
v1 = this.loadUrlRunnable;
(( com.jumptap.adtag.JtAdView ) p0 ).removeCallbacks ( v1 ); // invoke-virtual {p0, v1}, Lcom/jumptap/adtag/JtAdView;->removeCallbacks(Ljava/lang/Runnable;)Z
/* .line 191 */
/* new-instance v0, Landroid/os/Handler; */
android.os.Looper .getMainLooper ( );
/* invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
/* .line 192 */
/* .local v0, "handler":Landroid/os/Handler; */
/* iget-boolean v1, p0, Lcom/jumptap/adtag/JtAdView;->refreshIsImmediate:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 193 */
v1 = this.loadUrlRunnable;
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 197 */
} // :goto_1
return;
/* .line 187 */
} // .end local v0 # "handler":Landroid/os/Handler;
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lcom/jumptap/adtag/JtAdView;->refreshIsImmediate:Z */
/* .line 195 */
/* .restart local v0 # "handler":Landroid/os/Handler; */
} // :cond_1
v1 = this.loadUrlRunnable;
/* mul-int/lit16 v2, p1, 0x3e8 */
/* int-to-long v2, v2 */
(( android.os.Handler ) v0 ).postDelayed ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
} // .end method
private void setBgAndImg ( ) {
/* .locals 4 */
/* .prologue */
/* .line 573 */
v2 = this.widgetSettings;
v0 = (( com.jumptap.adtag.JtAdWidgetSettings ) v2 ).getBackgroundColor ( ); // invoke-virtual {v2}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getBackgroundColor()I
/* .line 574 */
/* .local v0, "backgroundColor":I */
int v2 = -1; // const/4 v2, -0x1
/* if-eq v0, v2, :cond_0 */
/* .line 575 */
v2 = this.imgView;
(( android.widget.ImageView ) v2 ).setBackgroundColor ( v0 ); // invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setBackgroundColor(I)V
/* .line 579 */
} // :cond_0
v2 = this.widgetSettings;
(( com.jumptap.adtag.JtAdWidgetSettings ) v2 ).getAlternateImage ( ); // invoke-virtual {v2}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getAlternateImage()Landroid/graphics/Bitmap;
/* .line 580 */
/* .local v1, "bm":Landroid/graphics/Bitmap; */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 581 */
final String v2 = "JtAd"; // const-string v2, "JtAd"
final String v3 = "Loading user\'s alternate image"; // const-string v3, "Loading user\'s alternate image"
android.util.Log .d ( v2,v3 );
/* .line 582 */
v2 = this.imgView;
(( android.widget.ImageView ) v2 ).setImageBitmap ( v1 ); // invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
/* .line 584 */
} // :cond_1
return;
} // .end method
/* # virtual methods */
public java.lang.String getAdRequestId ( ) {
/* .locals 1 */
/* .prologue */
/* .line 301 */
v0 = this.adRequestId;
} // .end method
public java.lang.String getAdRequestUrl ( ) {
/* .locals 1 */
/* .prologue */
/* .line 169 */
v0 = this.adRequestUrl;
} // .end method
protected Integer getDismissBtnHeight ( ) {
/* .locals 2 */
/* .prologue */
/* .line 395 */
v0 = /* invoke-direct {p0}, Lcom/jumptap/adtag/JtAdView;->getDensity()F */
/* .line 396 */
/* .local v0, "density":F */
/* const/high16 v1, 0x41f00000 # 30.0f */
/* mul-float/2addr v1, v0 */
/* float-to-int v1, v1 */
} // .end method
protected Integer getHeightSize ( ) {
/* .locals 3 */
/* .prologue */
/* .line 383 */
v0 = /* invoke-direct {p0}, Lcom/jumptap/adtag/JtAdView;->getDensity()F */
/* .line 384 */
/* .local v0, "density":F */
v2 = this.widgetSettings;
v1 = (( com.jumptap.adtag.JtAdWidgetSettings ) v2 ).getHeight ( ); // invoke-virtual {v2}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getHeight()I
/* .line 385 */
/* .local v1, "height":I */
/* int-to-float v2, v1 */
/* mul-float/2addr v2, v0 */
/* float-to-int v2, v2 */
} // .end method
public com.jumptap.adtag.JtAdWidgetSettings getWidgetSettings ( ) {
/* .locals 1 */
/* .prologue */
/* .line 139 */
v0 = this.widgetSettings;
} // .end method
protected Integer getWidthSize ( ) {
/* .locals 3 */
/* .prologue */
/* .line 389 */
v0 = /* invoke-direct {p0}, Lcom/jumptap/adtag/JtAdView;->getDensity()F */
/* .line 390 */
/* .local v0, "density":F */
v2 = this.widgetSettings;
v1 = (( com.jumptap.adtag.JtAdWidgetSettings ) v2 ).getWidth ( ); // invoke-virtual {v2}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getWidth()I
/* .line 391 */
/* .local v1, "width":I */
/* int-to-float v2, v1 */
/* mul-float/2addr v2, v0 */
/* float-to-int v2, v2 */
} // .end method
public void handleClicks ( java.lang.String p0 ) {
/* .locals 6 */
/* .param p1, "url" # Ljava/lang/String; */
/* .prologue */
int v5 = 1; // const/4 v5, 0x1
/* .line 701 */
v2 = this.context;
final String v3 = ""; // const-string v3, ""
final String v4 = ""; // const-string v4, ""
android.app.ProgressDialog .show ( v2,v3,v4,v5,v5 );
this.progressDialog = v2;
/* .line 704 */
/* new-instance v0, Lcom/jumptap/adtag/JtAdView$PerformActionHandler; */
/* invoke-direct {v0, p0, p1, p0}, Lcom/jumptap/adtag/JtAdView$PerformActionHandler;-><init>(Lcom/jumptap/adtag/JtAdView;Ljava/lang/String;Lcom/jumptap/adtag/JtAdView;)V */
/* .line 705 */
/* .local v0, "performActionRunnable":Ljava/lang/Runnable; */
/* new-instance v1, Ljava/lang/Thread; */
/* invoke-direct {v1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
/* .line 706 */
/* .local v1, "th":Ljava/lang/Thread; */
(( java.lang.Thread ) v1 ).start ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->start()V
/* .line 707 */
return;
} // .end method
public void hide ( ) {
/* .locals 2 */
/* .prologue */
/* .line 275 */
/* new-instance v0, Lcom/jumptap/adtag/JtAdView$3; */
/* invoke-direct {v0, p0}, Lcom/jumptap/adtag/JtAdView$3;-><init>(Lcom/jumptap/adtag/JtAdView;)V */
(( com.jumptap.adtag.JtAdView ) p0 ).post ( v0 ); // invoke-virtual {p0, v0}, Lcom/jumptap/adtag/JtAdView;->post(Ljava/lang/Runnable;)Z
/* .line 281 */
v0 = this.adViewListener;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 282 */
v0 = this.adViewListener;
v1 = (( com.jumptap.adtag.JtAdView ) p0 ).getId ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/JtAdView;->getId()I
/* .line 284 */
} // :cond_0
return;
} // .end method
public void notifyAdClicked ( ) {
/* .locals 2 */
/* .prologue */
/* .line 679 */
v0 = this.adViewListener;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 680 */
v0 = this.adViewListener;
v1 = (( com.jumptap.adtag.JtAdView ) p0 ).getId ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/JtAdView;->getId()I
/* .line 682 */
} // :cond_0
return;
} // .end method
public void notifyContract ( ) {
/* .locals 2 */
/* .prologue */
/* .line 673 */
v0 = this.adViewListener;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 674 */
v0 = this.adViewListener;
v1 = (( com.jumptap.adtag.JtAdView ) p0 ).getId ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/JtAdView;->getId()I
/* .line 676 */
} // :cond_0
return;
} // .end method
public void notifyExpand ( ) {
/* .locals 2 */
/* .prologue */
/* .line 667 */
v0 = this.adViewListener;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 668 */
v0 = this.adViewListener;
v1 = (( com.jumptap.adtag.JtAdView ) p0 ).getId ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/JtAdView;->getId()I
/* .line 670 */
} // :cond_0
return;
} // .end method
public void notifyLaunchActivity ( ) {
/* .locals 2 */
/* .prologue */
/* .line 685 */
v0 = this.adViewListener;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 686 */
v0 = this.adViewListener;
v1 = (( com.jumptap.adtag.JtAdView ) p0 ).getId ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/JtAdView;->getId()I
/* .line 688 */
} // :cond_0
return;
} // .end method
public void notifyReturnFromActivity ( ) {
/* .locals 2 */
/* .prologue */
/* .line 691 */
v0 = this.adViewListener;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 692 */
v0 = this.adViewListener;
v1 = (( com.jumptap.adtag.JtAdView ) p0 ).getId ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/JtAdView;->getId()I
/* .line 694 */
} // :cond_0
return;
} // .end method
public void onAdError ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "errorCode" # I */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 619 */
int v0 = 1; // const/4 v0, 0x1
(( com.jumptap.adtag.JtAdView ) p0 ).resize ( v2, v2, v0 ); // invoke-virtual {p0, v2, v2, v0}, Lcom/jumptap/adtag/JtAdView;->resize(IIZ)V
/* .line 620 */
v0 = this.adViewListener;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 621 */
v0 = this.adViewListener;
v1 = (( com.jumptap.adtag.JtAdView ) p0 ).getId ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/JtAdView;->getId()I
/* .line 623 */
} // :cond_0
(( com.jumptap.adtag.JtAdView ) p0 ).startTimers ( v2 ); // invoke-virtual {p0, v2}, Lcom/jumptap/adtag/JtAdView;->startTimers(Z)V
/* .line 624 */
return;
} // .end method
public void onBeginAdInteraction ( ) {
/* .locals 2 */
/* .prologue */
/* .line 654 */
v0 = this.adViewListener;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 655 */
v0 = this.adViewListener;
v1 = (( com.jumptap.adtag.JtAdView ) p0 ).getId ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/JtAdView;->getId()I
/* .line 657 */
} // :cond_0
return;
} // .end method
public void onEndAdInteraction ( ) {
/* .locals 2 */
/* .prologue */
/* .line 661 */
v0 = this.adViewListener;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 662 */
v0 = this.adViewListener;
v1 = (( com.jumptap.adtag.JtAdView ) p0 ).getId ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/JtAdView;->getId()I
/* .line 664 */
} // :cond_0
return;
} // .end method
public void onInterstitialDismissed ( ) {
/* .locals 2 */
/* .prologue */
/* .line 640 */
v0 = this.adViewListener;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 641 */
v0 = this.adViewListener;
v1 = (( com.jumptap.adtag.JtAdView ) p0 ).getId ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/JtAdView;->getId()I
/* .line 643 */
} // :cond_0
return;
} // .end method
public void onNewAd ( ) {
/* .locals 3 */
/* .prologue */
/* .line 647 */
v0 = this.adViewListener;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 648 */
v0 = this.adViewListener;
v1 = (( com.jumptap.adtag.JtAdView ) p0 ).getId ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/JtAdView;->getId()I
v2 = this.responseContent;
/* .line 650 */
} // :cond_0
return;
} // .end method
public void onNoAdFound ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 632 */
int v0 = 1; // const/4 v0, 0x1
(( com.jumptap.adtag.JtAdView ) p0 ).resize ( v1, v1, v0 ); // invoke-virtual {p0, v1, v1, v0}, Lcom/jumptap/adtag/JtAdView;->resize(IIZ)V
/* .line 633 */
v0 = this.adViewListener;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 634 */
v0 = this.adViewListener;
v1 = (( com.jumptap.adtag.JtAdView ) p0 ).getId ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/JtAdView;->getId()I
/* .line 636 */
} // :cond_0
return;
} // .end method
protected void onWindowVisibilityChanged ( Integer p0 ) {
/* .locals 4 */
/* .param p1, "visibility" # I */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 408 */
final String v0 = "JtAd"; // const-string v0, "JtAd"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "visibility="; // const-string v2, "visibility="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* .line 409 */
/* invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->onWindowVisibilityChanged(I)V */
/* .line 413 */
/* sparse-switch p1, :sswitch_data_0 */
/* .line 478 */
/* iput-boolean v3, p0, Lcom/jumptap/adtag/JtAdView;->isWindowVisible:Z */
/* .line 482 */
} // :cond_0
} // :goto_0
return;
/* .line 419 */
/* :sswitch_0 */
v0 = this.webViewArr;
/* iget v1, p0, Lcom/jumptap/adtag/JtAdView;->ACTIVE_WEBVIEW_INDEX:I */
/* aget-object v0, v0, v1 */
v0 = (( android.webkit.WebView ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->getVisibility()I
/* if-nez v0, :cond_1 */
/* .line 420 */
v0 = this.webViewArr;
/* iget v1, p0, Lcom/jumptap/adtag/JtAdView;->ACTIVE_WEBVIEW_INDEX:I */
/* aget-object v0, v0, v1 */
(( android.webkit.WebView ) v0 ).bringToFront ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->bringToFront()V
/* .line 423 */
} // :cond_1
/* iget-boolean v0, p0, Lcom/jumptap/adtag/JtAdView;->launchedActivity:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 424 */
(( com.jumptap.adtag.JtAdView ) p0 ).setLaunchedActivity ( v3 ); // invoke-virtual {p0, v3}, Lcom/jumptap/adtag/JtAdView;->setLaunchedActivity(Z)V
/* .line 425 */
(( com.jumptap.adtag.JtAdView ) p0 ).notifyReturnFromActivity ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/JtAdView;->notifyReturnFromActivity()V
/* .line 428 */
} // :cond_2
/* iget-boolean v0, p0, Lcom/jumptap/adtag/JtAdView;->isWindowVisible:Z */
/* if-nez v0, :cond_0 */
/* .line 429 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/jumptap/adtag/JtAdView;->isWindowVisible:Z */
/* .line 430 */
v0 = this.imgView;
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 431 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/JtAdView;->setBgAndImg()V */
/* .line 432 */
v0 = this.imgView;
(( android.widget.ImageView ) v0 ).setVisibility ( v3 ); // invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 459 */
} // :cond_3
(( com.jumptap.adtag.JtAdView ) p0 ).getWidgetSettings ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/JtAdView;->getWidgetSettings()Lcom/jumptap/adtag/JtAdWidgetSettings;
v0 = (( com.jumptap.adtag.JtAdWidgetSettings ) v0 ).getRefreshPeriod ( ); // invoke-virtual {v0}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getRefreshPeriod()I
/* if-lez v0, :cond_0 */
/* .line 460 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/JtAdView;->loadUrlIfVisible()V */
/* .line 469 */
/* :sswitch_1 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/JtAdView;->dismissProgressDialog()V */
/* .line 470 */
/* iput-boolean v3, p0, Lcom/jumptap/adtag/JtAdView;->isWindowVisible:Z */
/* .line 471 */
v0 = this.eventManager;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 413 */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x0 -> :sswitch_0 */
/* 0x4 -> :sswitch_1 */
/* 0x8 -> :sswitch_1 */
} // .end sparse-switch
} // .end method
public void refreshAd ( ) {
/* .locals 1 */
/* .prologue */
/* .line 162 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, v0}, Lcom/jumptap/adtag/JtAdView;->refreshAd(I)V */
/* .line 163 */
return;
} // .end method
public void resize ( Integer p0, Integer p1, Boolean p2 ) {
/* .locals 1 */
/* .param p1, "width" # I */
/* .param p2, "height" # I */
/* .param p3, "shouldExpand" # Z */
/* .prologue */
/* .line 238 */
/* new-instance v0, Lcom/jumptap/adtag/JtAdView$2; */
/* invoke-direct {v0, p0, p3, p1, p2}, Lcom/jumptap/adtag/JtAdView$2;-><init>(Lcom/jumptap/adtag/JtAdView;ZII)V */
(( com.jumptap.adtag.JtAdView ) p0 ).post ( v0 ); // invoke-virtual {p0, v0}, Lcom/jumptap/adtag/JtAdView;->post(Ljava/lang/Runnable;)Z
/* .line 271 */
return;
} // .end method
public void resizeWithCallback ( Boolean p0, Integer p1, Integer p2, java.lang.String p3, Integer p4, java.lang.String p5 ) {
/* .locals 3 */
/* .param p1, "shouldExpand" # Z */
/* .param p2, "width" # I */
/* .param p3, "height" # I */
/* .param p4, "callback" # Ljava/lang/String; */
/* .param p5, "transition" # I */
/* .param p6, "options" # Ljava/lang/String; */
/* .prologue */
/* .line 288 */
final String v0 = "JtAd"; // const-string v0, "JtAd"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "JtAdView::resizeWithCallback ("; // const-string v2, "JtAdView::resizeWithCallback ("
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p4 ); // invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ")"; // const-string v2, ")"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* .line 289 */
(( com.jumptap.adtag.JtAdView ) p0 ).resize ( p2, p3, p1 ); // invoke-virtual {p0, p2, p3, p1}, Lcom/jumptap/adtag/JtAdView;->resize(IIZ)V
/* .line 291 */
/* new-instance v0, Lcom/jumptap/adtag/JtAdView$4; */
/* invoke-direct {v0, p0, p4}, Lcom/jumptap/adtag/JtAdView$4;-><init>(Lcom/jumptap/adtag/JtAdView;Ljava/lang/String;)V */
(( com.jumptap.adtag.JtAdView ) p0 ).post ( v0 ); // invoke-virtual {p0, v0}, Lcom/jumptap/adtag/JtAdView;->post(Ljava/lang/Runnable;)Z
/* .line 298 */
return;
} // .end method
public void setAdViewListener ( com.jumptap.adtag.JtAdViewListener p0 ) {
/* .locals 0 */
/* .param p1, "adViewListener" # Lcom/jumptap/adtag/JtAdViewListener; */
/* .prologue */
/* .line 155 */
this.adViewListener = p1;
/* .line 156 */
return;
} // .end method
public void setContent ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 4 */
/* .param p1, "adContent" # Ljava/lang/String; */
/* .param p2, "adRequestId" # Ljava/lang/String; */
/* .prologue */
/* .line 215 */
this.responseContent = p1;
/* .line 216 */
this.adRequestId = p2;
/* .line 219 */
/* if-nez p1, :cond_0 */
/* .line 220 */
int v2 = -1; // const/4 v2, -0x1
(( com.jumptap.adtag.JtAdView ) p0 ).onAdError ( v2 ); // invoke-virtual {p0, v2}, Lcom/jumptap/adtag/JtAdView;->onAdError(I)V
/* .line 234 */
} // :goto_0
return;
/* .line 224 */
} // :cond_0
android.os.Looper .getMainLooper ( );
/* .line 225 */
/* .local v1, "l":Landroid/os/Looper; */
/* new-instance v0, Landroid/os/Handler; */
/* invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V */
/* .line 226 */
/* .local v0, "handler":Landroid/os/Handler; */
/* new-instance v2, Lcom/jumptap/adtag/JtAdView$1; */
/* invoke-direct {v2, p0, p1}, Lcom/jumptap/adtag/JtAdView$1;-><init>(Lcom/jumptap/adtag/JtAdView;Ljava/lang/String;)V */
(( android.os.Handler ) v0 ).post ( v2 ); // invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 232 */
final String v2 = "JtAd"; // const-string v2, "JtAd"
final String v3 = "called load data"; // const-string v3, "called load data"
android.util.Log .d ( v2,v3 );
} // .end method
public void setLaunchedActivity ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "launchedActivity" # Z */
/* .prologue */
/* .line 710 */
/* iput-boolean p1, p0, Lcom/jumptap/adtag/JtAdView;->launchedActivity:Z */
/* .line 711 */
return;
} // .end method
public void setVisibility ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "visibility" # I */
/* .prologue */
/* .line 204 */
/* invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->setVisibility(I)V */
/* .line 208 */
/* if-nez p1, :cond_0 */
/* .line 209 */
v0 = this.webViewArr;
/* iget v1, p0, Lcom/jumptap/adtag/JtAdView;->ACTIVE_WEBVIEW_INDEX:I */
/* aget-object v0, v0, v1 */
final String v1 = "javascript:if(typeof ORMMAReady == \'function\') { if (!ormma.ready) { ormma.ready = true; ORMMAReady(); } else {console.log(\"not ready\");} } else {console.log(\"no ormmaready\");}"; // const-string v1, "javascript:if(typeof ORMMAReady == \'function\') { if (!ormma.ready) { ormma.ready = true; ORMMAReady(); } else {console.log(\"not ready\");} } else {console.log(\"no ormmaready\");}"
(( android.webkit.WebView ) v0 ).loadUrl ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
/* .line 211 */
} // :cond_0
return;
} // .end method
public void setWidgetSettings ( com.jumptap.adtag.JtAdWidgetSettings p0 ) {
/* .locals 0 */
/* .param p1, "widgetSettings" # Lcom/jumptap/adtag/JtAdWidgetSettings; */
/* .prologue */
/* .line 147 */
this.widgetSettings = p1;
/* .line 148 */
return;
} // .end method
protected void startTimers ( Boolean p0 ) {
/* .locals 2 */
/* .param p1, "shouldRefreshAd" # Z */
/* .prologue */
/* .line 174 */
v1 = this.widgetSettings;
v0 = (( com.jumptap.adtag.JtAdWidgetSettings ) v1 ).getRefreshPeriod ( ); // invoke-virtual {v1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getRefreshPeriod()I
/* .line 175 */
/* .local v0, "refreshPeriod":I */
/* if-lez v0, :cond_0 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 176 */
/* invoke-direct {p0, v0}, Lcom/jumptap/adtag/JtAdView;->refreshAd(I)V */
/* .line 178 */
} // :cond_0
return;
} // .end method

public class com.jumptap.adtag.JtAdInterstitial extends com.jumptap.adtag.JtAdView {
	 /* .source "JtAdInterstitial.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/jumptap/adtag/JtAdInterstitial$DismissTimer;, */
	 /* Lcom/jumptap/adtag/JtAdInterstitial$InterstitialOnTouchListener; */
	 /* } */
} // .end annotation
/* # instance fields */
private com.jumptap.adtag.JtAdInterstitial$DismissTimer dismissTask;
private Boolean isPopupShown;
private android.widget.PopupWindow popup;
/* # direct methods */
public com.jumptap.adtag.JtAdInterstitial ( ) {
	 /* .locals 1 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lcom/jumptap/adtag/utils/JtException; */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 35 */
/* invoke-direct {p0, p1}, Lcom/jumptap/adtag/JtAdView;-><init>(Landroid/content/Context;)V */
/* .line 25 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/jumptap/adtag/JtAdInterstitial;->isPopupShown:Z */
/* .line 36 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/JtAdInterstitial;->init()V */
/* .line 37 */
return;
} // .end method
public com.jumptap.adtag.JtAdInterstitial ( ) {
/* .locals 1 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "attrs" # Landroid/util/AttributeSet; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/jumptap/adtag/utils/JtException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 57 */
/* invoke-direct {p0, p1, p2}, Lcom/jumptap/adtag/JtAdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
/* .line 25 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/jumptap/adtag/JtAdInterstitial;->isPopupShown:Z */
/* .line 58 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/JtAdInterstitial;->init()V */
/* .line 59 */
return;
} // .end method
public com.jumptap.adtag.JtAdInterstitial ( ) {
/* .locals 1 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "attrs" # Landroid/util/AttributeSet; */
/* .param p3, "defStyle" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/jumptap/adtag/utils/JtException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 69 */
/* invoke-direct {p0, p1, p2, p3}, Lcom/jumptap/adtag/JtAdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
/* .line 25 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/jumptap/adtag/JtAdInterstitial;->isPopupShown:Z */
/* .line 70 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/JtAdInterstitial;->init()V */
/* .line 71 */
return;
} // .end method
public com.jumptap.adtag.JtAdInterstitial ( ) {
/* .locals 1 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "widgetSettings" # Lcom/jumptap/adtag/JtAdWidgetSettings; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/jumptap/adtag/utils/JtException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 46 */
/* invoke-direct {p0, p1, p2}, Lcom/jumptap/adtag/JtAdView;-><init>(Landroid/content/Context;Lcom/jumptap/adtag/JtAdWidgetSettings;)V */
/* .line 25 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/jumptap/adtag/JtAdInterstitial;->isPopupShown:Z */
/* .line 47 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/JtAdInterstitial;->init()V */
/* .line 48 */
return;
} // .end method
static void access$000 ( com.jumptap.adtag.JtAdInterstitial p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/jumptap/adtag/JtAdInterstitial; */
/* .param p1, "x1" # Z */
/* .prologue */
/* .line 23 */
/* invoke-direct {p0, p1}, Lcom/jumptap/adtag/JtAdInterstitial;->dismiss(Z)V */
return;
} // .end method
static void access$100 ( com.jumptap.adtag.JtAdInterstitial p0 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/jumptap/adtag/JtAdInterstitial; */
/* .prologue */
/* .line 23 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/JtAdInterstitial;->restartTimer()V */
return;
} // .end method
private void configDismissButton ( ) {
/* .locals 2 */
/* .prologue */
/* .line 166 */
v0 = this.dismiss;
int v1 = 0; // const/4 v1, 0x0
(( android.widget.TextView ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V
/* .line 169 */
v0 = this.dismiss;
/* new-instance v1, Lcom/jumptap/adtag/JtAdInterstitial$1; */
/* invoke-direct {v1, p0}, Lcom/jumptap/adtag/JtAdInterstitial$1;-><init>(Lcom/jumptap/adtag/JtAdInterstitial;)V */
(( android.widget.TextView ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 175 */
return;
} // .end method
private void dismiss ( Boolean p0 ) {
/* .locals 1 */
/* .param p1, "isManuallyClosed" # Z */
/* .prologue */
/* .line 111 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/JtAdInterstitial;->stopTimer()V */
/* .line 112 */
/* iget-boolean v0, p0, Lcom/jumptap/adtag/JtAdInterstitial;->isPopupShown:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 113 */
v0 = this.popup;
(( android.widget.PopupWindow ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V
/* .line 114 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/jumptap/adtag/JtAdInterstitial;->isPopupShown:Z */
/* .line 117 */
} // :cond_0
(( com.jumptap.adtag.JtAdInterstitial ) p0 ).onInterstitialDismissed ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/JtAdInterstitial;->onInterstitialDismissed()V
/* .line 118 */
return;
} // .end method
private void init ( ) {
/* .locals 4 */
/* .prologue */
/* .line 151 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/JtAdInterstitial;->configDismissButton()V */
/* .line 155 */
/* new-instance v0, Landroid/widget/PopupWindow; */
v1 = (( com.jumptap.adtag.JtAdInterstitial ) p0 ).getWidthSize ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/JtAdInterstitial;->getWidthSize()I
v2 = (( com.jumptap.adtag.JtAdInterstitial ) p0 ).getHeightSize ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/JtAdInterstitial;->getHeightSize()I
int v3 = 1; // const/4 v3, 0x1
/* invoke-direct {v0, p0, v1, v2, v3}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V */
this.popup = v0;
/* .line 157 */
v0 = this.webViewArr;
/* iget v1, p0, Lcom/jumptap/adtag/JtAdInterstitial;->ACTIVE_WEBVIEW_INDEX:I */
/* aget-object v0, v0, v1 */
/* new-instance v1, Lcom/jumptap/adtag/JtAdInterstitial$InterstitialOnTouchListener; */
v2 = (( com.jumptap.adtag.JtAdInterstitial ) p0 ).getId ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/JtAdInterstitial;->getId()I
/* invoke-direct {v1, p0, p0, v2}, Lcom/jumptap/adtag/JtAdInterstitial$InterstitialOnTouchListener;-><init>(Lcom/jumptap/adtag/JtAdInterstitial;Lcom/jumptap/adtag/JtAdView;I)V */
(( android.webkit.WebView ) v0 ).setOnTouchListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
/* .line 158 */
v0 = this.webViewArr;
/* iget v1, p0, Lcom/jumptap/adtag/JtAdInterstitial;->INACTIVE_WEBVIEW_INDEX:I */
/* aget-object v0, v0, v1 */
/* new-instance v1, Lcom/jumptap/adtag/JtAdInterstitial$InterstitialOnTouchListener; */
v2 = (( com.jumptap.adtag.JtAdInterstitial ) p0 ).getId ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/JtAdInterstitial;->getId()I
/* invoke-direct {v1, p0, p0, v2}, Lcom/jumptap/adtag/JtAdInterstitial$InterstitialOnTouchListener;-><init>(Lcom/jumptap/adtag/JtAdInterstitial;Lcom/jumptap/adtag/JtAdView;I)V */
(( android.webkit.WebView ) v0 ).setOnTouchListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
/* .line 161 */
return;
} // .end method
private void restartTimer ( ) {
/* .locals 0 */
/* .prologue */
/* .line 198 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/JtAdInterstitial;->stopTimer()V */
/* .line 199 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/JtAdInterstitial;->startTimer()V */
/* .line 200 */
return;
} // .end method
private void startTimer ( ) {
/* .locals 5 */
/* .prologue */
/* .line 178 */
v2 = this.widgetSettings;
v0 = (( com.jumptap.adtag.JtAdWidgetSettings ) v2 ).getInterstitialshowTime ( ); // invoke-virtual {v2}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getInterstitialshowTime()I
/* .line 180 */
/* .local v0, "interShowTime":I */
final String v2 = "JtAd"; // const-string v2, "JtAd"
final String v3 = "Starting interstitial timer"; // const-string v3, "Starting interstitial timer"
android.util.Log .i ( v2,v3 );
/* .line 181 */
/* new-instance v1, Ljava/util/Timer; */
final String v2 = "DismisTask"; // const-string v2, "DismisTask"
/* invoke-direct {v1, v2}, Ljava/util/Timer;-><init>(Ljava/lang/String;)V */
/* .line 182 */
/* .local v1, "timer":Ljava/util/Timer; */
v2 = this.dismissTask;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 183 */
v2 = this.dismissTask;
(( com.jumptap.adtag.JtAdInterstitial$DismissTimer ) v2 ).cancel ( ); // invoke-virtual {v2}, Lcom/jumptap/adtag/JtAdInterstitial$DismissTimer;->cancel()Z
/* .line 185 */
} // :cond_0
/* new-instance v2, Lcom/jumptap/adtag/JtAdInterstitial$DismissTimer; */
/* invoke-direct {v2, p0}, Lcom/jumptap/adtag/JtAdInterstitial$DismissTimer;-><init>(Lcom/jumptap/adtag/JtAdInterstitial;)V */
this.dismissTask = v2;
/* .line 186 */
v2 = this.dismissTask;
/* mul-int/lit16 v3, v0, 0x3e8 */
/* int-to-long v3, v3 */
(( java.util.Timer ) v1 ).schedule ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
/* .line 188 */
return;
} // .end method
private void stopTimer ( ) {
/* .locals 2 */
/* .prologue */
/* .line 191 */
final String v0 = "JtAd"; // const-string v0, "JtAd"
final String v1 = "stopping interstitial timer"; // const-string v1, "stopping interstitial timer"
android.util.Log .i ( v0,v1 );
/* .line 192 */
v0 = this.dismissTask;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 193 */
v0 = this.dismissTask;
(( com.jumptap.adtag.JtAdInterstitial$DismissTimer ) v0 ).cancel ( ); // invoke-virtual {v0}, Lcom/jumptap/adtag/JtAdInterstitial$DismissTimer;->cancel()Z
/* .line 195 */
} // :cond_0
return;
} // .end method
/* # virtual methods */
public void dismiss ( ) {
/* .locals 1 */
/* .prologue */
/* .line 94 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, v0}, Lcom/jumptap/adtag/JtAdInterstitial;->dismiss(Z)V */
/* .line 95 */
return;
} // .end method
protected Integer getHeightSize ( ) {
/* .locals 1 */
/* .prologue */
/* .line 137 */
int v0 = -1; // const/4 v0, -0x1
} // .end method
protected Integer getWidthSize ( ) {
/* .locals 1 */
/* .prologue */
/* .line 141 */
int v0 = -1; // const/4 v0, -0x1
} // .end method
public void onAdError ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "errorCode" # I */
/* .prologue */
/* .line 122 */
/* invoke-super {p0, p1}, Lcom/jumptap/adtag/JtAdView;->onAdError(I)V */
/* .line 123 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, v0}, Lcom/jumptap/adtag/JtAdInterstitial;->dismiss(Z)V */
/* .line 124 */
return;
} // .end method
public void onNoAdFound ( ) {
/* .locals 1 */
/* .prologue */
/* .line 128 */
/* invoke-super {p0}, Lcom/jumptap/adtag/JtAdView;->onNoAdFound()V */
/* .line 129 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, v0}, Lcom/jumptap/adtag/JtAdInterstitial;->dismiss(Z)V */
/* .line 130 */
return;
} // .end method
public void resize ( Integer p0, Integer p1, Boolean p2 ) {
/* .locals 0 */
/* .param p1, "width" # I */
/* .param p2, "height" # I */
/* .param p3, "shouldExpand" # Z */
/* .prologue */
/* .line 134 */
return;
} // .end method
public void show ( ) {
/* .locals 0 */
/* .prologue */
/* .line 78 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/JtAdInterstitial;->startTimer()V */
/* .line 79 */
return;
} // .end method
public void showAsPopup ( ) {
/* .locals 3 */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 86 */
v0 = this.popup;
/* const/16 v1, 0x30 */
(( android.widget.PopupWindow ) v0 ).showAtLocation ( p0, v1, v2, v2 ); // invoke-virtual {v0, p0, v1, v2, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V
/* .line 87 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/jumptap/adtag/JtAdInterstitial;->isPopupShown:Z */
/* .line 88 */
return;
} // .end method
protected void startTimers ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "shouldRefreshAd" # Z */
/* .prologue */
/* .line 145 */
/* invoke-super {p0, p1}, Lcom/jumptap/adtag/JtAdView;->startTimers(Z)V */
/* .line 146 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/JtAdInterstitial;->startTimer()V */
/* .line 147 */
return;
} // .end method

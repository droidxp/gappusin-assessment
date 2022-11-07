class com.google.ads.GoogleAdView$AdWebViewClient extends android.webkit.WebViewClient {
	 /* .source "GoogleAdView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/ads/GoogleAdView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "AdWebViewClient" */
} // .end annotation
/* # instance fields */
private Boolean mStartedAdFetch;
final com.google.ads.GoogleAdView this$0; //synthetic
/* # direct methods */
private com.google.ads.GoogleAdView$AdWebViewClient ( ) {
/* .locals 0 */
/* .prologue */
/* .line 259 */
this.this$0 = p1;
/* invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V */
return;
} // .end method
 com.google.ads.GoogleAdView$AdWebViewClient ( ) { //synthethic
/* .locals 0 */
/* .param p1, "x0" # Lcom/google/ads/GoogleAdView; */
/* .param p2, "x1" # Lcom/google/ads/GoogleAdView$1; */
/* .prologue */
/* .line 259 */
/* invoke-direct {p0, p1}, Lcom/google/ads/GoogleAdView$AdWebViewClient;-><init>(Lcom/google/ads/GoogleAdView;)V */
return;
} // .end method
static void access$100 ( com.google.ads.GoogleAdView$AdWebViewClient p0 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/google/ads/GoogleAdView$AdWebViewClient; */
/* .prologue */
/* .line 259 */
/* invoke-direct {p0}, Lcom/google/ads/GoogleAdView$AdWebViewClient;->reset()V */
return;
} // .end method
private Boolean isRedirect ( android.net.Uri p0 ) {
/* .locals 4 */
/* .param p1, "uri" # Landroid/net/Uri; */
/* .prologue */
int v3 = 1; // const/4 v3, 0x1
/* .line 308 */
(( android.net.Uri ) p1 ).getHost ( ); // invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;
/* .line 309 */
/* .local v0, "host":Ljava/lang/String; */
com.google.ads.GoogleAdView .access$300 ( );
/* array-length v2, v2 */
/* sub-int v1, v2, v3 */
/* .local v1, "i":I */
} // :goto_0
/* if-ltz v1, :cond_1 */
/* .line 310 */
com.google.ads.GoogleAdView .access$300 ( );
/* aget-object v2, v2, v1 */
v2 = (( java.lang.String ) v0 ).endsWith ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* move v2, v3 */
/* .line 314 */
} // :goto_1
/* .line 309 */
} // :cond_0
/* add-int/lit8 v1, v1, -0x1 */
/* .line 314 */
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
} // .end method
private void reset ( ) {
/* .locals 1 */
/* .prologue */
/* .line 318 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/google/ads/GoogleAdView$AdWebViewClient;->mStartedAdFetch:Z */
/* .line 319 */
return;
} // .end method
/* # virtual methods */
public void onPageFinished ( android.webkit.WebView p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 278 */
/* invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V */
/* .line 279 */
/* iget-boolean v0, p0, Lcom/google/ads/GoogleAdView$AdWebViewClient;->mStartedAdFetch:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = android.webkit.URLUtil .isDataUrl ( p2 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 280 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/google/ads/GoogleAdView$AdWebViewClient;->mStartedAdFetch:Z */
/* .line 281 */
v0 = this.this$0;
int v1 = 1; // const/4 v1, 0x1
(( com.google.ads.GoogleAdView ) v0 ).setDisplayedChild ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/GoogleAdView;->setDisplayedChild(I)V
/* .line 282 */
v0 = this.this$0;
com.google.ads.GoogleAdView .access$200 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 283 */
v0 = this.this$0;
com.google.ads.GoogleAdView .access$200 ( v0 );
/* .line 286 */
} // :cond_0
return;
} // .end method
public void onPageStarted ( android.webkit.WebView p0, java.lang.String p1, android.graphics.Bitmap p2 ) {
/* .locals 2 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .param p3, "favicon" # Landroid/graphics/Bitmap; */
/* .prologue */
/* .line 266 */
/* invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V */
/* .line 267 */
v0 = android.webkit.URLUtil .isDataUrl ( p2 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 268 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/ads/GoogleAdView$AdWebViewClient;->mStartedAdFetch:Z */
/* .line 269 */
v0 = this.this$0;
int v1 = 0; // const/4 v1, 0x0
(( com.google.ads.GoogleAdView ) v0 ).setDisplayedChild ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/GoogleAdView;->setDisplayedChild(I)V
/* .line 270 */
v0 = this.this$0;
com.google.ads.GoogleAdView .access$200 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 271 */
	 v0 = this.this$0;
	 com.google.ads.GoogleAdView .access$200 ( v0 );
	 /* .line 274 */
} // :cond_0
return;
} // .end method
public Boolean shouldOverrideUrlLoading ( android.webkit.WebView p0, java.lang.String p1 ) {
/* .locals 3 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 290 */
android.net.Uri .parse ( p2 );
/* .line 296 */
/* .local v1, "uri":Landroid/net/Uri; */
v2 = this.this$0;
com.google.ads.GoogleAdView .access$200 ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_0
	 /* .line 297 */
	 v2 = this.this$0;
	 com.google.ads.GoogleAdView .access$200 ( v2 );
	 /* .line 300 */
} // :cond_0
/* new-instance v0, Landroid/content/Intent; */
final String v2 = "android.intent.action.VIEW"; // const-string v2, "android.intent.action.VIEW"
/* invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
/* .line 301 */
/* .local v0, "intent":Landroid/content/Intent; */
final String v2 = "android.intent.category.BROWSABLE"; // const-string v2, "android.intent.category.BROWSABLE"
(( android.content.Intent ) v0 ).addCategory ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;
/* .line 302 */
v2 = this.this$0;
(( com.google.ads.GoogleAdView ) v2 ).getContext ( ); // invoke-virtual {v2}, Lcom/google/ads/GoogleAdView;->getContext()Landroid/content/Context;
(( android.content.Context ) v2 ).startActivity ( v0 ); // invoke-virtual {v2, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* .line 303 */
int v2 = 1; // const/4 v2, 0x1
} // .end method

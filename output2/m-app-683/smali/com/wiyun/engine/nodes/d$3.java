class com.wiyun.engine.nodes.d$3 extends android.webkit.WebViewClient {
	 /* .source "_A.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/wiyun/engine/nodes/d;->a(Landroid/view/WindowManager;Landroid/content/Context;Landroid/content/Intent;)Landroid/view/View; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
private final android.widget.ProgressBar a; //synthetic
private final android.webkit.WebView b; //synthetic
/* # direct methods */
 com.wiyun.engine.nodes.d$3 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.a = p1;
this.b = p2;
/* .line 2004 */
/* invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onPageFinished ( android.webkit.WebView p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 2007 */
/* invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V */
/* .line 2008 */
v0 = this.a;
int v1 = 4; // const/4 v1, 0x4
(( android.widget.ProgressBar ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V
/* .line 2009 */
return;
} // .end method
public void onPageStarted ( android.webkit.WebView p0, java.lang.String p1, android.graphics.Bitmap p2 ) {
/* .locals 2 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .param p3, "favicon" # Landroid/graphics/Bitmap; */
/* .prologue */
/* .line 2013 */
/* invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V */
/* .line 2014 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
(( android.widget.ProgressBar ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V
/* .line 2015 */
return;
} // .end method
public Boolean shouldOverrideUrlLoading ( android.webkit.WebView p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 2019 */
v0 = this.b;
(( android.webkit.WebView ) v0 ).stopLoading ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V
/* .line 2020 */
v0 = /* invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z */
} // .end method

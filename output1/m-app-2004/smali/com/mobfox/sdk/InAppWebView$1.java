class com.mobfox.sdk.InAppWebView$1 extends android.webkit.WebViewClient {
	 /* .source "InAppWebView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/mobfox/sdk/InAppWebView;->onCreate(Landroid/os/Bundle;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.sdk.InAppWebView this$0; //synthetic
/* # direct methods */
 com.mobfox.sdk.InAppWebView$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 29 */
this.this$0 = p1;
/* invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Boolean shouldOverrideUrlLoading ( android.webkit.WebView p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 31 */
(( android.webkit.WebView ) p1 ).loadUrl ( p2 ); // invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
/* .line 32 */
int v0 = 0; // const/4 v0, 0x0
} // .end method

public class com.admob.android.ads.view.AdMobWebView extends android.webkit.WebView {
	 /* .source "AdMobWebView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/admob/android/ads/view/AdMobWebView$a; */
	 /* } */
} // .end annotation
/* # instance fields */
java.lang.String a;
public java.lang.String b;
Boolean c;
private android.widget.RelativeLayout d;
/* # direct methods */
public com.admob.android.ads.view.AdMobWebView ( ) {
	 /* .locals 3 */
	 /* .prologue */
	 int v1 = 0; // const/4 v1, 0x0
	 int v2 = 1; // const/4 v2, 0x1
	 /* .line 35 */
	 /* invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
	 /* .line 36 */
	 this.d = p2;
	 /* .line 38 */
	 (( com.admob.android.ads.view.AdMobWebView ) p0 ).getSettings ( ); // invoke-virtual {p0}, Lcom/admob/android/ads/view/AdMobWebView;->getSettings()Landroid/webkit/WebSettings;
	 /* .line 39 */
	 (( android.webkit.WebSettings ) v0 ).setLoadsImagesAutomatically ( v2 ); // invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setLoadsImagesAutomatically(Z)V
	 /* .line 40 */
	 (( android.webkit.WebSettings ) v0 ).setPluginsEnabled ( v2 ); // invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setPluginsEnabled(Z)V
	 /* .line 41 */
	 (( android.webkit.WebSettings ) v0 ).setJavaScriptEnabled ( v2 ); // invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
	 /* .line 42 */
	 (( android.webkit.WebSettings ) v0 ).setJavaScriptCanOpenWindowsAutomatically ( v2 ); // invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V
	 /* .line 43 */
	 (( android.webkit.WebSettings ) v0 ).setSaveFormData ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V
	 /* .line 44 */
	 (( android.webkit.WebSettings ) v0 ).setSavePassword ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSavePassword(Z)V
	 /* .line 45 */
	 com.admob.android.ads.r .c ( );
	 (( android.webkit.WebSettings ) v0 ).setUserAgentString ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V
	 /* .line 47 */
	 /* new-instance v0, Lcom/admob/android/ads/view/AdMobWebView$a; */
	 /* invoke-direct {v0, p0, p0}, Lcom/admob/android/ads/view/AdMobWebView$a;-><init>(Lcom/admob/android/ads/view/AdMobWebView;Lcom/admob/android/ads/view/AdMobWebView;)V */
	 (( com.admob.android.ads.view.AdMobWebView ) p0 ).setWebViewClient ( v0 ); // invoke-virtual {p0, v0}, Lcom/admob/android/ads/view/AdMobWebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
	 /* .line 49 */
	 /* iput-boolean v2, p0, Lcom/admob/android/ads/view/AdMobWebView;->c:Z */
	 /* .line 50 */
	 this.a = p3;
	 /* .line 51 */
	 return;
} // .end method
static void a ( com.admob.android.ads.view.AdMobWebView p0 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 19 */
	 /* invoke-direct {p0}, Lcom/admob/android/ads/view/AdMobWebView;->removeSelf()V */
	 return;
} // .end method
private void removeSelf ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 59 */
	 (( com.admob.android.ads.view.AdMobWebView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/admob/android/ads/view/AdMobWebView;->getContext()Landroid/content/Context;
	 final String v1 = "window"; // const-string v1, "window"
	 (( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
	 /* check-cast v0, Landroid/view/WindowManager; */
	 /* .line 60 */
	 v1 = this.d;
	 /* .line 61 */
	 return;
} // .end method
/* # virtual methods */
protected void onFocusChanged ( Boolean p0, Integer p1, android.graphics.Rect p2 ) {
	 /* .locals 3 */
	 /* .prologue */
	 /* .line 93 */
	 final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v2 = "onFocusChanged("; // const-string v2, "onFocusChanged("
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
	 final String v2 = ")"; // const-string v2, ")"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .d ( v0,v1 );
	 /* .line 94 */
	 /* invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebView;->onFocusChanged(ZILandroid/graphics/Rect;)V */
	 /* .line 95 */
	 return;
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 74 */
	 int v0 = 4; // const/4 v0, 0x4
	 /* if-ne p1, v0, :cond_0 */
	 /* .line 76 */
	 /* invoke-direct {p0}, Lcom/admob/android/ads/view/AdMobWebView;->removeSelf()V */
	 /* .line 77 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* .line 80 */
} // :goto_0
} // :cond_0
v0 = /* invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
protected android.os.Parcelable onSaveInstanceState ( ) {
/* .locals 2 */
/* .prologue */
/* .line 106 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
final String v1 = "onSaveInstanceState()"; // const-string v1, "onSaveInstanceState()"
android.util.Log .d ( v0,v1 );
/* .line 107 */
/* invoke-super {p0}, Landroid/webkit/WebView;->onSaveInstanceState()Landroid/os/Parcelable; */
} // .end method
protected void onWindowVisibilityChanged ( Integer p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 119 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "onWindowVisibilityChanged("; // const-string v2, "onWindowVisibilityChanged("
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = ")"; // const-string v2, ")"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* .line 120 */
/* invoke-super {p0, p1}, Landroid/webkit/WebView;->onWindowVisibilityChanged(I)V */
/* .line 121 */
return;
} // .end method

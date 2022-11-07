public class com.umeng.analytics.MobclickAgentJSInterface {
	 /* .source "MobclickAgentJSInterface.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/umeng/analytics/MobclickAgentJSInterface$a; */
	 /* } */
} // .end annotation
/* # instance fields */
private android.content.Context a;
/* # direct methods */
public com.umeng.analytics.MobclickAgentJSInterface ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 23 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 24 */
	 this.a = p1;
	 /* .line 25 */
	 (( android.webkit.WebView ) p2 ).getSettings ( ); // invoke-virtual {p2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
	 int v1 = 1; // const/4 v1, 0x1
	 (( android.webkit.WebSettings ) v0 ).setJavaScriptEnabled ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
	 /* .line 26 */
	 /* new-instance v0, Lcom/umeng/analytics/MobclickAgentJSInterface$a; */
	 int v1 = 0; // const/4 v1, 0x0
	 /* invoke-direct {v0, p0, v1}, Lcom/umeng/analytics/MobclickAgentJSInterface$a;-><init>(Lcom/umeng/analytics/MobclickAgentJSInterface;Landroid/webkit/WebChromeClient;)V */
	 (( android.webkit.WebView ) p2 ).setWebChromeClient ( v0 ); // invoke-virtual {p2, v0}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
	 /* .line 28 */
	 return;
} // .end method
public com.umeng.analytics.MobclickAgentJSInterface ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 30 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 31 */
	 this.a = p1;
	 /* .line 32 */
	 (( android.webkit.WebView ) p2 ).getSettings ( ); // invoke-virtual {p2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
	 int v1 = 1; // const/4 v1, 0x1
	 (( android.webkit.WebSettings ) v0 ).setJavaScriptEnabled ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
	 /* .line 33 */
	 /* new-instance v0, Lcom/umeng/analytics/MobclickAgentJSInterface$a; */
	 /* invoke-direct {v0, p0, p3}, Lcom/umeng/analytics/MobclickAgentJSInterface$a;-><init>(Lcom/umeng/analytics/MobclickAgentJSInterface;Landroid/webkit/WebChromeClient;)V */
	 (( android.webkit.WebView ) p2 ).setWebChromeClient ( v0 ); // invoke-virtual {p2, v0}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
	 /* .line 34 */
	 return;
} // .end method
static android.content.Context a ( com.umeng.analytics.MobclickAgentJSInterface p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 21 */
	 v0 = this.a;
} // .end method

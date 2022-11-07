public class com.adknowledge.superrewards.ui.activities.SRWebViewActivity extends android.app.Activity {
	 /* .source "SRWebViewActivity.java" */
	 /* # static fields */
	 public static final java.lang.String URL;
	 /* # instance fields */
	 private android.webkit.WebView browser;
	 /* # direct methods */
	 public com.adknowledge.superrewards.ui.activities.SRWebViewActivity ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 7 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 3 */
		 /* .param p1, "icicle" # Landroid/os/Bundle; */
		 /* .prologue */
		 int v1 = 1; // const/4 v1, 0x1
		 /* .line 14 */
		 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
		 /* .line 16 */
		 /* new-instance v0, Landroid/webkit/WebView; */
		 /* invoke-direct {v0, p0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
		 this.browser = v0;
		 /* .line 17 */
		 v0 = this.browser;
		 (( com.adknowledge.superrewards.ui.activities.SRWebViewActivity ) p0 ).setContentView ( v0 ); // invoke-virtual {p0, v0}, Lcom/adknowledge/superrewards/ui/activities/SRWebViewActivity;->setContentView(Landroid/view/View;)V
		 /* .line 19 */
		 v0 = this.browser;
		 (( android.webkit.WebView ) v0 ).getSettings ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
		 (( android.webkit.WebSettings ) v0 ).setJavaScriptEnabled ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
		 /* .line 20 */
		 v0 = this.browser;
		 (( android.webkit.WebView ) v0 ).getSettings ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
		 (( android.webkit.WebSettings ) v0 ).setSupportZoom ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V
		 /* .line 21 */
		 v0 = this.browser;
		 (( android.webkit.WebView ) v0 ).getSettings ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
		 (( android.webkit.WebSettings ) v0 ).setBuiltInZoomControls ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V
		 /* .line 22 */
		 v0 = this.browser;
		 (( android.webkit.WebView ) v0 ).setInitialScale ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setInitialScale(I)V
		 /* .line 23 */
		 v0 = this.browser;
		 (( com.adknowledge.superrewards.ui.activities.SRWebViewActivity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/adknowledge/superrewards/ui/activities/SRWebViewActivity;->getIntent()Landroid/content/Intent;
		 final String v2 = "http://www.srpoints.com"; // const-string v2, "http://www.srpoints.com"
		 (( android.content.Intent ) v1 ).getStringExtra ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
		 (( android.webkit.WebView ) v0 ).loadUrl ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
		 /* .line 24 */
		 return;
	 } // .end method

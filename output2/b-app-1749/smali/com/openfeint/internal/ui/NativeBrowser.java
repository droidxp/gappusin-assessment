public class com.openfeint.internal.ui.NativeBrowser extends com.openfeint.internal.ui.NestedWindow {
	 /* .source "NativeBrowser.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/openfeint/internal/ui/NativeBrowser$JSInterface; */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.String INTENT_ARG_PREFIX;
/* # instance fields */
private java.util.concurrent.atomic.AtomicBoolean mFinished;
private android.os.Handler mHandler;
private java.lang.Runnable mTimeoutWatchdog;
/* # direct methods */
public com.openfeint.internal.ui.NativeBrowser ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 13 */
	 /* invoke-direct {p0}, Lcom/openfeint/internal/ui/NestedWindow;-><init>()V */
	 /* .line 19 */
	 /* new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean; */
	 int v1 = 0; // const/4 v1, 0x0
	 /* invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V */
	 this.mFinished = v0;
	 /* .line 13 */
	 return;
} // .end method
static java.util.concurrent.atomic.AtomicBoolean access$000 ( com.openfeint.internal.ui.NativeBrowser p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Lcom/openfeint/internal/ui/NativeBrowser; */
	 /* .prologue */
	 /* .line 13 */
	 v0 = this.mFinished;
} // .end method
static android.os.Handler access$100 ( com.openfeint.internal.ui.NativeBrowser p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Lcom/openfeint/internal/ui/NativeBrowser; */
	 /* .prologue */
	 /* .line 13 */
	 v0 = this.mHandler;
} // .end method
static android.os.Handler access$102 ( com.openfeint.internal.ui.NativeBrowser p0, android.os.Handler p1 ) { //synthethic
	 /* .locals 0 */
	 /* .param p0, "x0" # Lcom/openfeint/internal/ui/NativeBrowser; */
	 /* .param p1, "x1" # Landroid/os/Handler; */
	 /* .prologue */
	 /* .line 13 */
	 this.mHandler = p1;
} // .end method
static java.lang.Runnable access$200 ( com.openfeint.internal.ui.NativeBrowser p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Lcom/openfeint/internal/ui/NativeBrowser; */
	 /* .prologue */
	 /* .line 13 */
	 v0 = this.mTimeoutWatchdog;
} // .end method
static java.lang.Runnable access$202 ( com.openfeint.internal.ui.NativeBrowser p0, java.lang.Runnable p1 ) { //synthethic
	 /* .locals 0 */
	 /* .param p0, "x0" # Lcom/openfeint/internal/ui/NativeBrowser; */
	 /* .param p1, "x1" # Ljava/lang/Runnable; */
	 /* .prologue */
	 /* .line 13 */
	 this.mTimeoutWatchdog = p1;
} // .end method
/* # virtual methods */
public void onCreate ( android.os.Bundle p0 ) {
	 /* .locals 8 */
	 /* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
	 /* .prologue */
	 int v7 = 1; // const/4 v7, 0x1
	 /* .line 39 */
	 /* invoke-super {p0, p1}, Lcom/openfeint/internal/ui/NestedWindow;->onCreate(Landroid/os/Bundle;)V */
	 /* .line 41 */
	 (( com.openfeint.internal.ui.NativeBrowser ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/ui/NativeBrowser;->getIntent()Landroid/content/Intent;
	 (( android.content.Intent ) v3 ).getExtras ( ); // invoke-virtual {v3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
	 /* .line 43 */
	 /* .local v0, "extras":Landroid/os/Bundle; */
	 final String v3 = "com.openfeint.internal.ui.NativeBrowser.argument.src"; // const-string v3, "com.openfeint.internal.ui.NativeBrowser.argument.src"
	 (( android.os.Bundle ) v0 ).getString ( v3 ); // invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
	 /* .line 44 */
	 /* .local v1, "src":Ljava/lang/String; */
	 final String v3 = "com.openfeint.internal.ui.NativeBrowser.argument.timeout"; // const-string v3, "com.openfeint.internal.ui.NativeBrowser.argument.timeout"
	 (( android.os.Bundle ) v0 ).getString ( v3 ); // invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
	 /* .line 47 */
	 /* .local v2, "timeout":Ljava/lang/String; */
	 v3 = this.mWebView;
	 (( android.webkit.WebView ) v3 ).getSettings ( ); // invoke-virtual {v3}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
	 (( android.webkit.WebSettings ) v3 ).setJavaScriptEnabled ( v7 ); // invoke-virtual {v3, v7}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
	 /* .line 48 */
	 v3 = this.mWebView;
	 /* new-instance v4, Lcom/openfeint/internal/ui/NativeBrowser$JSInterface; */
	 /* invoke-direct {v4, p0}, Lcom/openfeint/internal/ui/NativeBrowser$JSInterface;-><init>(Lcom/openfeint/internal/ui/NativeBrowser;)V */
	 final String v5 = "NativeBrowser"; // const-string v5, "NativeBrowser"
	 (( android.webkit.WebView ) v3 ).addJavascriptInterface ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
	 /* .line 50 */
	 v3 = this.mWebView;
	 /* new-instance v4, Lcom/openfeint/internal/ui/NativeBrowser$1; */
	 /* invoke-direct {v4, p0}, Lcom/openfeint/internal/ui/NativeBrowser$1;-><init>(Lcom/openfeint/internal/ui/NativeBrowser;)V */
	 (( android.webkit.WebView ) v3 ).setWebViewClient ( v4 ); // invoke-virtual {v3, v4}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
	 /* .line 74 */
	 v3 = this.mWebView;
	 /* new-instance v4, Landroid/webkit/WebChromeClient; */
	 /* invoke-direct {v4}, Landroid/webkit/WebChromeClient;-><init>()V */
	 (( android.webkit.WebView ) v3 ).setWebChromeClient ( v4 ); // invoke-virtual {v3, v4}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
	 /* .line 76 */
	 v3 = this.mWebView;
	 (( android.webkit.WebView ) v3 ).loadUrl ( v1 ); // invoke-virtual {v3, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
	 /* .line 78 */
	 if ( v2 != null) { // if-eqz v2, :cond_0
		 /* .line 79 */
		 /* new-instance v3, Landroid/os/Handler; */
		 /* invoke-direct {v3}, Landroid/os/Handler;-><init>()V */
		 this.mHandler = v3;
		 /* .line 80 */
		 /* new-instance v3, Lcom/openfeint/internal/ui/NativeBrowser$2; */
		 /* invoke-direct {v3, p0}, Lcom/openfeint/internal/ui/NativeBrowser$2;-><init>(Lcom/openfeint/internal/ui/NativeBrowser;)V */
		 this.mTimeoutWatchdog = v3;
		 /* .line 92 */
		 v3 = this.mHandler;
		 v4 = this.mTimeoutWatchdog;
		 v5 = 		 java.lang.Integer .parseInt ( v2 );
		 /* int-to-long v5, v5 */
		 (( android.os.Handler ) v3 ).postDelayed ( v4, v5, v6 ); // invoke-virtual {v3, v4, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
		 /* .line 95 */
	 } // :cond_0
	 (( com.openfeint.internal.ui.NativeBrowser ) p0 ).fade ( v7 ); // invoke-virtual {p0, v7}, Lcom/openfeint/internal/ui/NativeBrowser;->fade(Z)V
	 /* .line 96 */
	 return;
} // .end method

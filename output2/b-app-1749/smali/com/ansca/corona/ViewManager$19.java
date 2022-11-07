class com.ansca.corona.ViewManager$19 implements java.lang.Runnable {
	 /* .source "ViewManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/ViewManager;->showWebView(ILjava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.ViewManager this$0; //synthetic
final java.lang.String val$url; //synthetic
/* # direct methods */
 com.ansca.corona.ViewManager$19 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 589 */
this.this$0 = p1;
this.val$url = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
/* .line 592 */
v1 = this.this$0;
com.ansca.corona.ViewManager .access$600 ( v1 );
/* if-nez v1, :cond_0 */
/* .line 626 */
} // :goto_0
return;
/* .line 597 */
} // :cond_0
v1 = this.this$0;
com.ansca.corona.ViewManager .access$600 ( v1 );
(( com.ansca.corona.CoronaWebView ) v1 ).getSettings ( ); // invoke-virtual {v1}, Lcom/ansca/corona/CoronaWebView;->getSettings()Landroid/webkit/WebSettings;
/* .line 598 */
/* .local v0, "settings":Landroid/webkit/WebSettings; */
(( android.webkit.WebSettings ) v0 ).setJavaScriptEnabled ( v2 ); // invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
/* .line 599 */
(( android.webkit.WebSettings ) v0 ).setSupportZoom ( v2 ); // invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V
/* .line 600 */
(( android.webkit.WebSettings ) v0 ).setBuiltInZoomControls ( v2 ); // invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V
/* .line 601 */
(( android.webkit.WebSettings ) v0 ).setLoadWithOverviewMode ( v2 ); // invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V
/* .line 602 */
(( android.webkit.WebSettings ) v0 ).setUseWideViewPort ( v2 ); // invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V
/* .line 603 */
v1 = android.webkit.WebSettings$PluginState.ON;
(( android.webkit.WebSettings ) v0 ).setPluginState ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setPluginState(Landroid/webkit/WebSettings$PluginState;)V
/* .line 604 */
(( android.webkit.WebSettings ) v0 ).setDomStorageEnabled ( v2 ); // invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V
/* .line 607 */
v1 = this.this$0;
com.ansca.corona.ViewManager .access$600 ( v1 );
v2 = this.val$url;
(( com.ansca.corona.CoronaWebView ) v1 ).requestLoadUrl ( v2 ); // invoke-virtual {v1, v2}, Lcom/ansca/corona/CoronaWebView;->requestLoadUrl(Ljava/lang/String;)V
/* .line 611 */
v1 = this.this$0;
com.ansca.corona.ViewManager .access$600 ( v1 );
/* const/16 v2, 0x82 */
(( com.ansca.corona.CoronaWebView ) v1 ).requestFocus ( v2 ); // invoke-virtual {v1, v2}, Lcom/ansca/corona/CoronaWebView;->requestFocus(I)Z
/* .line 612 */
v1 = this.this$0;
com.ansca.corona.ViewManager .access$600 ( v1 );
/* new-instance v2, Lcom/ansca/corona/ViewManager$19$1; */
/* invoke-direct {v2, p0}, Lcom/ansca/corona/ViewManager$19$1;-><init>(Lcom/ansca/corona/ViewManager$19;)V */
(( com.ansca.corona.CoronaWebView ) v1 ).setOnTouchListener ( v2 ); // invoke-virtual {v1, v2}, Lcom/ansca/corona/CoronaWebView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
} // .end method

class com.ansca.corona.CoronaWebView$CoronaWebViewClient extends android.webkit.WebViewClient {
	 /* .source "CoronaWebView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/ansca/corona/CoronaWebView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "CoronaWebViewClient" */
} // .end annotation
/* # instance fields */
final com.ansca.corona.CoronaWebView this$0; //synthetic
/* # direct methods */
private com.ansca.corona.CoronaWebView$CoronaWebViewClient ( ) {
/* .locals 0 */
/* .prologue */
/* .line 17 */
this.this$0 = p1;
/* invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V */
return;
} // .end method
 com.ansca.corona.CoronaWebView$CoronaWebViewClient ( ) { //synthethic
/* .locals 0 */
/* .param p1, "x0" # Lcom/ansca/corona/CoronaWebView; */
/* .param p2, "x1" # Lcom/ansca/corona/CoronaWebView$1; */
/* .prologue */
/* .line 17 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/CoronaWebView$CoronaWebViewClient;-><init>(Lcom/ansca/corona/CoronaWebView;)V */
return;
} // .end method
/* # virtual methods */
public void onPageStarted ( android.webkit.WebView p0, java.lang.String p1, android.graphics.Bitmap p2 ) {
/* .locals 3 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .param p3, "favicon" # Landroid/graphics/Bitmap; */
/* .prologue */
/* .line 25 */
/* invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V */
/* .line 26 */
/* monitor-enter p0 */
/* .line 27 */
try { // :try_start_0
	 v0 = 	 com.ansca.corona.Controller .isValid ( );
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 28 */
		 com.ansca.corona.Controller .getEventManager ( );
		 v1 = this.this$0;
		 v1 = 		 com.ansca.corona.CoronaWebView .access$000 ( v1 );
		 v2 = this.this$0;
		 com.ansca.corona.CoronaWebView .access$100 ( v2 );
		 (( com.ansca.corona.events.EventManager ) v0 ).shouldLoadUrlEvent ( v1, p1, v2, p2 ); // invoke-virtual {v0, v1, p1, v2, p2}, Lcom/ansca/corona/events/EventManager;->shouldLoadUrlEvent(ILandroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 30 */
	 } // :cond_0
	 /* monitor-exit p0 */
	 /* .line 31 */
	 return;
	 /* .line 30 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v0 */
} // .end method
public void onReceivedError ( android.webkit.WebView p0, Integer p1, java.lang.String p2, java.lang.String p3 ) {
	 /* .locals 2 */
	 /* .param p1, "view" # Landroid/webkit/WebView; */
	 /* .param p2, "errorCode" # I */
	 /* .param p3, "description" # Ljava/lang/String; */
	 /* .param p4, "failingUrl" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 38 */
	 /* monitor-enter p0 */
	 /* .line 39 */
	 try { // :try_start_0
		 v0 = 		 com.ansca.corona.Controller .isValid ( );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 40 */
			 com.ansca.corona.Controller .getEventManager ( );
			 v1 = this.this$0;
			 v1 = 			 com.ansca.corona.CoronaWebView .access$000 ( v1 );
			 (( com.ansca.corona.events.EventManager ) v0 ).didFailLoadUrlEvent ( v1, p4, p3, p2 ); // invoke-virtual {v0, v1, p4, p3, p2}, Lcom/ansca/corona/events/EventManager;->didFailLoadUrlEvent(ILjava/lang/String;Ljava/lang/String;I)V
			 /* .line 42 */
		 } // :cond_0
		 /* monitor-exit p0 */
		 /* .line 43 */
		 return;
		 /* .line 42 */
		 /* :catchall_0 */
		 /* move-exception v0 */
		 /* monitor-exit p0 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* throw v0 */
	 } // .end method

public class com.ansca.corona.events.ShouldLoadUrlEvent extends com.ansca.corona.events.Event {
	 /* .source "ShouldLoadUrlEvent.java" */
	 /* # instance fields */
	 Integer myId;
	 java.lang.String myOriginalUrl;
	 java.lang.String myUrl;
	 android.webkit.WebView myWebView;
	 /* # direct methods */
	 com.ansca.corona.events.ShouldLoadUrlEvent ( ) {
		 /* .locals 0 */
		 /* .param p1, "id" # I */
		 /* .param p2, "webView" # Landroid/webkit/WebView; */
		 /* .param p3, "originalUrl" # Ljava/lang/String; */
		 /* .param p4, "url" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 14 */
		 /* invoke-direct {p0}, Lcom/ansca/corona/events/Event;-><init>()V */
		 /* .line 15 */
		 /* iput p1, p0, Lcom/ansca/corona/events/ShouldLoadUrlEvent;->myId:I */
		 /* .line 16 */
		 this.myOriginalUrl = p3;
		 /* .line 17 */
		 this.myWebView = p2;
		 /* .line 18 */
		 this.myUrl = p4;
		 /* .line 19 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void Send ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 24 */
		 com.ansca.corona.ViewManager .getViewManager ( );
		 v1 = 		 (( com.ansca.corona.ViewManager ) v1 ).isWebViewShown ( ); // invoke-virtual {v1}, Lcom/ansca/corona/ViewManager;->isWebViewShown()Z
		 /* if-nez v1, :cond_1 */
		 /* .line 36 */
	 } // :cond_0
} // :goto_0
return;
/* .line 29 */
} // :cond_1
/* iget v1, p0, Lcom/ansca/corona/events/ShouldLoadUrlEvent;->myId:I */
v2 = this.myUrl;
v0 = com.ansca.corona.JavaToNativeShim .webPopupShouldLoadUrl ( v1,v2 );
/* .line 30 */
/* .local v0, "result":Z */
/* if-nez v0, :cond_0 */
} // .end method

public class com.ansca.corona.CoronaWebView extends android.webkit.WebView {
	 /* .source "CoronaWebView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/ansca/corona/CoronaWebView$1;, */
	 /* Lcom/ansca/corona/CoronaWebView$CoronaWebViewClient; */
	 /* } */
} // .end annotation
/* # instance fields */
private Boolean myAutoCloseEnabled;
private Integer myId;
private java.lang.String myOriginalUrl;
/* # direct methods */
public com.ansca.corona.CoronaWebView ( ) {
	 /* .locals 6 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .param p2, "id" # I */
	 /* .param p3, "background" # Z */
	 /* .prologue */
	 int v3 = 0; // const/4 v3, 0x0
	 int v2 = 1; // const/4 v2, 0x1
	 /* .line 53 */
	 /* invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
	 /* .line 13 */
	 final String v1 = ""; // const-string v1, ""
	 this.myOriginalUrl = v1;
	 /* .line 14 */
	 /* iput-boolean v2, p0, Lcom/ansca/corona/CoronaWebView;->myAutoCloseEnabled:Z */
	 /* .line 56 */
	 /* iput p2, p0, Lcom/ansca/corona/CoronaWebView;->myId:I */
	 /* .line 57 */
	 (( com.ansca.corona.CoronaWebView ) p0 ).setBackgroundOpaque ( p3 ); // invoke-virtual {p0, p3}, Lcom/ansca/corona/CoronaWebView;->setBackgroundOpaque(Z)V
	 /* .line 58 */
	 /* new-instance v1, Lcom/ansca/corona/CoronaWebView$CoronaWebViewClient; */
	 /* invoke-direct {v1, p0, v3}, Lcom/ansca/corona/CoronaWebView$CoronaWebViewClient;-><init>(Lcom/ansca/corona/CoronaWebView;Lcom/ansca/corona/CoronaWebView$1;)V */
	 (( com.ansca.corona.CoronaWebView ) p0 ).setWebViewClient ( v1 ); // invoke-virtual {p0, v1}, Lcom/ansca/corona/CoronaWebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
	 /* .line 62 */
	 /* const/16 v2, 0xb */
	 /* if-lt v1, v2, :cond_0 */
	 /* .line 64 */
	 try { // :try_start_0
		 /* const-class v1, Landroid/view/ViewGroup; */
		 final String v2 = "setLayerType"; // const-string v2, "setLayerType"
		 int v3 = 2; // const/4 v3, 0x2
		 /* new-array v3, v3, [Ljava/lang/Class; */
		 int v4 = 0; // const/4 v4, 0x0
		 v5 = java.lang.Integer.TYPE;
		 /* aput-object v5, v3, v4 */
		 int v4 = 1; // const/4 v4, 0x1
		 /* const-class v5, Landroid/graphics/Paint; */
		 /* aput-object v5, v3, v4 */
		 (( java.lang.Class ) v1 ).getMethod ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
		 /* .line 66 */
		 /* .local v0, "setLayerTypeMethod":Ljava/lang/reflect/Method; */
		 int v1 = 2; // const/4 v1, 0x2
		 /* new-array v1, v1, [Ljava/lang/Object; */
		 int v2 = 0; // const/4 v2, 0x0
		 int v3 = 1; // const/4 v3, 0x1
		 java.lang.Integer .valueOf ( v3 );
		 /* aput-object v3, v1, v2 */
		 int v2 = 1; // const/4 v2, 0x1
		 int v3 = 0; // const/4 v3, 0x0
		 /* aput-object v3, v1, v2 */
		 (( java.lang.reflect.Method ) v0 ).invoke ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 70 */
	 } // .end local v0 # "setLayerTypeMethod":Ljava/lang/reflect/Method;
} // :cond_0
} // :goto_0
return;
/* .line 68 */
/* :catch_0 */
/* move-exception v1 */
} // .end method
static Integer access$000 ( com.ansca.corona.CoronaWebView p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/CoronaWebView; */
/* .prologue */
/* .line 11 */
/* iget v0, p0, Lcom/ansca/corona/CoronaWebView;->myId:I */
} // .end method
static java.lang.String access$100 ( com.ansca.corona.CoronaWebView p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/CoronaWebView; */
/* .prologue */
/* .line 11 */
v0 = this.myOriginalUrl;
} // .end method
/* # virtual methods */
public void goBack ( ) {
/* .locals 4 */
/* .prologue */
/* .line 78 */
v0 = (( com.ansca.corona.CoronaWebView ) p0 ).canGoBack ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaWebView;->canGoBack()Z
/* if-nez v0, :cond_2 */
/* .line 79 */
/* iget-boolean v0, p0, Lcom/ansca/corona/CoronaWebView;->myAutoCloseEnabled:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 81 */
com.ansca.corona.ViewManager .getViewManager ( );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 82 */
	 com.ansca.corona.ViewManager .getViewManager ( );
	 /* iget v1, p0, Lcom/ansca/corona/CoronaWebView;->myId:I */
	 (( com.ansca.corona.ViewManager ) v0 ).closeWebView ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/ViewManager;->closeWebView(I)Z
	 /* .line 98 */
} // :cond_0
} // :goto_0
return;
/* .line 88 */
} // :cond_1
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 89 */
com.ansca.corona.Controller .getEventManager ( );
/* iget v1, p0, Lcom/ansca/corona/CoronaWebView;->myId:I */
v2 = this.myOriginalUrl;
final String v3 = ""; // const-string v3, ""
(( com.ansca.corona.events.EventManager ) v0 ).shouldLoadUrlEvent ( v1, p0, v2, v3 ); // invoke-virtual {v0, v1, p0, v2, v3}, Lcom/ansca/corona/events/EventManager;->shouldLoadUrlEvent(ILandroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)V
/* .line 96 */
} // :cond_2
(( com.ansca.corona.CoronaWebView ) p0 ).stopLoading ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaWebView;->stopLoading()V
/* .line 97 */
/* invoke-super {p0}, Landroid/webkit/WebView;->goBack()V */
} // .end method
public Boolean isAutoCloseEnabled ( ) {
/* .locals 1 */
/* .prologue */
/* .line 143 */
/* iget-boolean v0, p0, Lcom/ansca/corona/CoronaWebView;->myAutoCloseEnabled:Z */
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 2 */
/* .param p1, "keyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
/* .line 157 */
int v1 = 4; // const/4 v1, 0x4
/* if-ne p1, v1, :cond_1 */
/* .line 159 */
(( com.ansca.corona.CoronaWebView ) p0 ).goBack ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaWebView;->goBack()V
/* .line 162 */
v1 = (( com.ansca.corona.CoronaWebView ) p0 ).canGoBack ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaWebView;->canGoBack()Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 167 */
} // :goto_0
/* .line 162 */
} // :cond_0
/* iget-boolean v0, p0, Lcom/ansca/corona/CoronaWebView;->myAutoCloseEnabled:Z */
/* .line 167 */
} // :cond_1
v0 = /* invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
public void requestLoadUrl ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 107 */
/* if-nez p1, :cond_0 */
/* .line 108 */
final String p1 = ""; // const-string p1, ""
/* .line 112 */
} // :cond_0
(( com.ansca.corona.CoronaWebView ) p0 ).stopLoading ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaWebView;->stopLoading()V
/* .line 113 */
this.myOriginalUrl = p1;
/* .line 114 */
(( com.ansca.corona.CoronaWebView ) p0 ).loadUrl ( p1 ); // invoke-virtual {p0, p1}, Lcom/ansca/corona/CoronaWebView;->loadUrl(Ljava/lang/String;)V
/* .line 115 */
return;
} // .end method
public void setAutoCloseEnabled ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "enabled" # Z */
/* .prologue */
/* .line 135 */
/* iput-boolean p1, p0, Lcom/ansca/corona/CoronaWebView;->myAutoCloseEnabled:Z */
/* .line 136 */
return;
} // .end method
public void setBackgroundOpaque ( Boolean p0 ) {
/* .locals 1 */
/* .param p1, "bg" # Z */
/* .prologue */
/* .line 122 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 123 */
int v0 = -1; // const/4 v0, -0x1
(( com.ansca.corona.CoronaWebView ) p0 ).setBackgroundColor ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/CoronaWebView;->setBackgroundColor(I)V
/* .line 127 */
} // :goto_0
return;
/* .line 125 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
(( com.ansca.corona.CoronaWebView ) p0 ).setBackgroundColor ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/CoronaWebView;->setBackgroundColor(I)V
} // .end method

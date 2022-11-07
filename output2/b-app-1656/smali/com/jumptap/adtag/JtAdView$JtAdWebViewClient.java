class com.jumptap.adtag.JtAdView$JtAdWebViewClient extends android.webkit.WebViewClient {
	 /* .source "JtAdView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/jumptap/adtag/JtAdView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "JtAdWebViewClient" */
} // .end annotation
/* # instance fields */
final com.jumptap.adtag.JtAdView this$0; //synthetic
/* # direct methods */
private com.jumptap.adtag.JtAdView$JtAdWebViewClient ( ) {
/* .locals 0 */
/* .prologue */
/* .line 774 */
this.this$0 = p1;
/* invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V */
return;
} // .end method
 com.jumptap.adtag.JtAdView$JtAdWebViewClient ( ) { //synthethic
/* .locals 0 */
/* .param p1, "x0" # Lcom/jumptap/adtag/JtAdView; */
/* .param p2, "x1" # Lcom/jumptap/adtag/JtAdView$1; */
/* .prologue */
/* .line 774 */
/* invoke-direct {p0, p1}, Lcom/jumptap/adtag/JtAdView$JtAdWebViewClient;-><init>(Lcom/jumptap/adtag/JtAdView;)V */
return;
} // .end method
private void switchActiveAndInactiveIndex ( ) {
/* .locals 2 */
/* .prologue */
/* .line 849 */
v0 = this.this$0;
v1 = this.this$0;
/* iget v1, v1, Lcom/jumptap/adtag/JtAdView;->INACTIVE_WEBVIEW_INDEX:I */
/* add-int/lit8 v1, v1, 0x1 */
/* rem-int/lit8 v1, v1, 0x2 */
/* iput v1, v0, Lcom/jumptap/adtag/JtAdView;->INACTIVE_WEBVIEW_INDEX:I */
/* .line 850 */
v0 = this.this$0;
v1 = this.this$0;
/* iget v1, v1, Lcom/jumptap/adtag/JtAdView;->ACTIVE_WEBVIEW_INDEX:I */
/* add-int/lit8 v1, v1, 0x1 */
/* rem-int/lit8 v1, v1, 0x2 */
/* iput v1, v0, Lcom/jumptap/adtag/JtAdView;->ACTIVE_WEBVIEW_INDEX:I */
/* .line 851 */
return;
} // .end method
/* # virtual methods */
public void onPageFinished ( android.webkit.WebView p0, java.lang.String p1 ) {
/* .locals 5 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .prologue */
int v4 = 4; // const/4 v4, 0x4
int v3 = 0; // const/4 v3, 0x0
/* .line 778 */
/* invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V */
/* .line 779 */
final String v0 = "JtAd"; // const-string v0, "JtAd"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "onPageFinished="; // const-string v2, "onPageFinished="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* .line 784 */
v0 = this.this$0;
v1 = this.this$0;
v1 = (( com.jumptap.adtag.JtAdView ) v1 ).getWidthSize ( ); // invoke-virtual {v1}, Lcom/jumptap/adtag/JtAdView;->getWidthSize()I
v2 = this.this$0;
v2 = (( com.jumptap.adtag.JtAdView ) v2 ).getHeightSize ( ); // invoke-virtual {v2}, Lcom/jumptap/adtag/JtAdView;->getHeightSize()I
(( com.jumptap.adtag.JtAdView ) v0 ).resize ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/jumptap/adtag/JtAdView;->resize(IIZ)V
/* .line 787 */
final String v0 = "javascript:EmptyBodyChecker.checkBody(document.getElementsByTagName(\"body\")[0].innerHTML)"; // const-string v0, "javascript:EmptyBodyChecker.checkBody(document.getElementsByTagName(\"body\")[0].innerHTML)"
(( android.webkit.WebView ) p1 ).loadUrl ( v0 ); // invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
/* .line 790 */
v0 = this.this$0;
v0 = com.jumptap.adtag.JtAdView .access$400 ( v0 );
/* if-nez v0, :cond_0 */
/* .line 791 */
v0 = this.this$0;
com.jumptap.adtag.JtAdView .access$500 ( v0 );
(( android.widget.ImageView ) v0 ).setVisibility ( v4 ); // invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V
/* .line 793 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/JtAdView$JtAdWebViewClient;->switchActiveAndInactiveIndex()V */
/* .line 795 */
v0 = this.this$0;
v0 = this.webViewArr;
v1 = this.this$0;
/* iget v1, v1, Lcom/jumptap/adtag/JtAdView;->INACTIVE_WEBVIEW_INDEX:I */
/* aget-object v0, v0, v1 */
(( android.webkit.WebView ) v0 ).setVisibility ( v4 ); // invoke-virtual {v0, v4}, Landroid/webkit/WebView;->setVisibility(I)V
/* .line 796 */
v0 = this.this$0;
v0 = this.webViewArr;
v1 = this.this$0;
/* iget v1, v1, Lcom/jumptap/adtag/JtAdView;->ACTIVE_WEBVIEW_INDEX:I */
/* aget-object v0, v0, v1 */
(( android.webkit.WebView ) v0 ).setVisibility ( v3 ); // invoke-virtual {v0, v3}, Landroid/webkit/WebView;->setVisibility(I)V
/* .line 798 */
v0 = this.this$0;
v0 = this.adViewListener;
/* if-nez v0, :cond_0 */
/* .line 803 */
v0 = this.this$0;
v0 = this.eventManager;
(( com.jumptap.adtag.events.EventManager ) v0 ).forceSendingInteractEvent ( ); // invoke-virtual {v0}, Lcom/jumptap/adtag/events/EventManager;->forceSendingInteractEvent()V
/* .line 804 */
v0 = this.this$0;
v0 = this.eventManager;
v1 = com.jumptap.adtag.events.EventType.impression;
(( com.jumptap.adtag.events.EventManager ) v0 ).sendReport ( v1 ); // invoke-virtual {v0, v1}, Lcom/jumptap/adtag/events/EventManager;->sendReport(Lcom/jumptap/adtag/events/EventType;)V
/* .line 808 */
} // :cond_0
v0 = this.this$0;
com.jumptap.adtag.JtAdView .access$402 ( v0,v3 );
/* .line 810 */
v0 = this.this$0;
int v1 = 1; // const/4 v1, 0x1
(( com.jumptap.adtag.JtAdView ) v0 ).startTimers ( v1 ); // invoke-virtual {v0, v1}, Lcom/jumptap/adtag/JtAdView;->startTimers(Z)V
/* .line 815 */
v0 = this.this$0;
v0 = (( com.jumptap.adtag.JtAdView ) v0 ).getVisibility ( ); // invoke-virtual {v0}, Lcom/jumptap/adtag/JtAdView;->getVisibility()I
/* if-nez v0, :cond_1 */
/* .line 816 */
final String v0 = "javascript:if(typeof ORMMAReady == \'function\') { if (!ormma.ready) { ormma.ready = true; ORMMAReady(); } else {console.log(\"not ready\");} } else {console.log(\"no ormmaready\");}"; // const-string v0, "javascript:if(typeof ORMMAReady == \'function\') { if (!ormma.ready) { ormma.ready = true; ORMMAReady(); } else {console.log(\"not ready\");} } else {console.log(\"no ormmaready\");}"
(( android.webkit.WebView ) p1 ).loadUrl ( v0 ); // invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
/* .line 819 */
} // :cond_1
return;
} // .end method
public void onReceivedError ( android.webkit.WebView p0, Integer p1, java.lang.String p2, java.lang.String p3 ) {
/* .locals 3 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "errorCode" # I */
/* .param p3, "description" # Ljava/lang/String; */
/* .param p4, "failingUrl" # Ljava/lang/String; */
/* .prologue */
/* .line 825 */
/* invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V */
/* .line 826 */
final String v0 = "JtAd"; // const-string v0, "JtAd"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "errorcode="; // const-string v2, "errorcode="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " desc="; // const-string v2, " desc="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v0,v1 );
/* .line 827 */
v0 = this.this$0;
int v1 = 1; // const/4 v1, 0x1
com.jumptap.adtag.JtAdView .access$402 ( v0,v1 );
/* .line 829 */
v0 = this.this$0;
(( com.jumptap.adtag.JtAdView ) v0 ).onAdError ( p2 ); // invoke-virtual {v0, p2}, Lcom/jumptap/adtag/JtAdView;->onAdError(I)V
/* .line 831 */
return;
} // .end method
public Boolean shouldOverrideUrlLoading ( android.webkit.WebView p0, java.lang.String p1 ) {
/* .locals 4 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 836 */
int v0 = 0; // const/4 v0, 0x0
/* .line 837 */
/* .local v0, "shouldOverrideUrlLoading":Z */
v1 = this.this$0;
v1 = this.webViewArr;
v2 = this.this$0;
/* iget v2, v2, Lcom/jumptap/adtag/JtAdView;->ACTIVE_WEBVIEW_INDEX:I */
/* aget-object v1, v1, v2 */
v1 = (( java.lang.Object ) p1 ).equals ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 838 */
v1 = this.this$0;
(( com.jumptap.adtag.JtAdView ) v1 ).handleClicks ( p2 ); // invoke-virtual {v1, p2}, Lcom/jumptap/adtag/JtAdView;->handleClicks(Ljava/lang/String;)V
/* .line 839 */
int v0 = 1; // const/4 v0, 0x1
/* .line 844 */
} // :goto_0
final String v1 = "JtAd"; // const-string v1, "JtAd"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "shouldOverrideUrlLoading="; // const-string v3, "shouldOverrideUrlLoading="
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v1,v2 );
/* .line 845 */
/* .line 842 */
} // :cond_0
final String v1 = "JtAd"; // const-string v1, "JtAd"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "shouldOverrideUrlLoading cannot override url: "; // const-string v3, "shouldOverrideUrlLoading cannot override url: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v1,v2 );
} // .end method

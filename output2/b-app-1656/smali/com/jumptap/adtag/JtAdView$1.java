class com.jumptap.adtag.JtAdView$1 implements java.lang.Runnable {
	 /* .source "JtAdView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/jumptap/adtag/JtAdView;->setContent(Ljava/lang/String;Ljava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.jumptap.adtag.JtAdView this$0; //synthetic
final java.lang.String val$adContent; //synthetic
/* # direct methods */
 com.jumptap.adtag.JtAdView$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 226 */
this.this$0 = p1;
this.val$adContent = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 6 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 229 */
v0 = this.this$0;
v0 = this.webViewArr;
v2 = this.this$0;
/* iget v2, v2, Lcom/jumptap/adtag/JtAdView;->INACTIVE_WEBVIEW_INDEX:I */
/* aget-object v0, v0, v2 */
v2 = this.val$adContent;
final String v3 = "text/html"; // const-string v3, "text/html"
final String v4 = "utf-8"; // const-string v4, "utf-8"
/* move-object v5, v1 */
/* invoke-virtual/range {v0 ..v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 230 */
return;
} // .end method

class com.openfeint.internal.ui.WebNav$WebNavChromeClient$2 implements android.content.DialogInterface$OnClickListener {
	 /* .source "WebNav.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/ui/WebNav$WebNavChromeClient;->onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.WebNav$WebNavChromeClient this$1; //synthetic
final android.webkit.JsResult val$result; //synthetic
/* # direct methods */
 com.openfeint.internal.ui.WebNav$WebNavChromeClient$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 505 */
this.this$1 = p1;
this.val$result = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
/* .locals 1 */
/* .param p1, "dialog" # Landroid/content/DialogInterface; */
/* .param p2, "which" # I */
/* .prologue */
/* .line 508 */
v0 = this.val$result;
(( android.webkit.JsResult ) v0 ).cancel ( ); // invoke-virtual {v0}, Landroid/webkit/JsResult;->cancel()V
/* .line 509 */
return;
} // .end method

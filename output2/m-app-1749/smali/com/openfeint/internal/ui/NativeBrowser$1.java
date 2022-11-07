class com.openfeint.internal.ui.NativeBrowser$1 extends android.webkit.WebViewClient {
	 /* .source "NativeBrowser.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/ui/NativeBrowser;->onCreate(Landroid/os/Bundle;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.NativeBrowser this$0; //synthetic
/* # direct methods */
 com.openfeint.internal.ui.NativeBrowser$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 50 */
this.this$0 = p1;
/* invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V */
return;
} // .end method
private void clearTimeout ( ) {
/* .locals 3 */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 52 */
v0 = this.this$0;
com.openfeint.internal.ui.NativeBrowser .access$100 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.this$0;
	 com.openfeint.internal.ui.NativeBrowser .access$200 ( v0 );
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 53 */
		 v0 = this.this$0;
		 com.openfeint.internal.ui.NativeBrowser .access$100 ( v0 );
		 v1 = this.this$0;
		 com.openfeint.internal.ui.NativeBrowser .access$200 ( v1 );
		 (( android.os.Handler ) v0 ).removeCallbacks ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
		 /* .line 54 */
		 v0 = this.this$0;
		 com.openfeint.internal.ui.NativeBrowser .access$102 ( v0,v2 );
		 /* .line 55 */
		 v0 = this.this$0;
		 com.openfeint.internal.ui.NativeBrowser .access$202 ( v0,v2 );
		 /* .line 57 */
	 } // :cond_0
	 return;
} // .end method
/* # virtual methods */
public void onPageFinished ( android.webkit.WebView p0, java.lang.String p1 ) {
	 /* .locals 0 */
	 /* .param p1, "view" # Landroid/webkit/WebView; */
	 /* .param p2, "url" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 59 */
	 /* invoke-direct {p0}, Lcom/openfeint/internal/ui/NativeBrowser$1;->clearTimeout()V */
	 /* .line 60 */
	 /* invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V */
	 /* .line 61 */
	 return;
} // .end method
public void onReceivedError ( android.webkit.WebView p0, Integer p1, java.lang.String p2, java.lang.String p3 ) {
	 /* .locals 3 */
	 /* .param p1, "view" # Landroid/webkit/WebView; */
	 /* .param p2, "errorCode" # I */
	 /* .param p3, "description" # Ljava/lang/String; */
	 /* .param p4, "failingUrl" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 63 */
	 /* invoke-direct {p0}, Lcom/openfeint/internal/ui/NativeBrowser$1;->clearTimeout()V */
	 /* .line 64 */
	 /* invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V */
	 /* .line 66 */
	 /* new-instance v0, Landroid/content/Intent; */
	 /* invoke-direct {v0}, Landroid/content/Intent;-><init>()V */
	 /* .line 67 */
	 /* .local v0, "returnIntent":Landroid/content/Intent; */
	 final String v1 = "com.openfeint.internal.ui.NativeBrowser.argument.failed"; // const-string v1, "com.openfeint.internal.ui.NativeBrowser.argument.failed"
	 int v2 = 1; // const/4 v2, 0x1
	 (( android.content.Intent ) v0 ).putExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
	 /* .line 68 */
	 final String v1 = "com.openfeint.internal.ui.NativeBrowser.argument.failure_code"; // const-string v1, "com.openfeint.internal.ui.NativeBrowser.argument.failure_code"
	 (( android.content.Intent ) v0 ).putExtra ( v1, p2 ); // invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
	 /* .line 69 */
	 final String v1 = "com.openfeint.internal.ui.NativeBrowser.argument.failure_desc"; // const-string v1, "com.openfeint.internal.ui.NativeBrowser.argument.failure_desc"
	 (( android.content.Intent ) v0 ).putExtra ( v1, p3 ); // invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
	 /* .line 70 */
	 v1 = this.this$0;
	 int v2 = -1; // const/4 v2, -0x1
	 (( com.openfeint.internal.ui.NativeBrowser ) v1 ).setResult ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Lcom/openfeint/internal/ui/NativeBrowser;->setResult(ILandroid/content/Intent;)V
	 /* .line 71 */
	 v1 = this.this$0;
	 (( com.openfeint.internal.ui.NativeBrowser ) v1 ).finish ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/ui/NativeBrowser;->finish()V
	 /* .line 72 */
	 return;
} // .end method

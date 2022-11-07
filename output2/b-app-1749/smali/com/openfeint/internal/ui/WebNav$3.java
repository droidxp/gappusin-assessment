class com.openfeint.internal.ui.WebNav$3 extends com.openfeint.internal.ui.WebViewCacheCallback {
	 /* .source "WebNav.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/ui/WebNav;->load(Z)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.WebNav this$0; //synthetic
final Boolean val$reload; //synthetic
/* # direct methods */
 com.openfeint.internal.ui.WebNav$3 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 162 */
this.this$0 = p1;
/* iput-boolean p2, p0, Lcom/openfeint/internal/ui/WebNav$3;->val$reload:Z */
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebViewCacheCallback;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void failLoaded ( ) {
/* .locals 1 */
/* .prologue */
/* .line 177 */
v0 = this.this$0;
com.openfeint.internal.ui.WebNav .access$100 ( v0 );
/* .line 178 */
return;
} // .end method
public void pathLoaded ( java.lang.String p0 ) {
/* .locals 4 */
/* .param p1, "itemPath" # Ljava/lang/String; */
/* .prologue */
/* .line 165 */
v1 = this.this$0;
v1 = this.mWebView;
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 166 */
	 com.openfeint.internal.ui.WebViewCache .getItemUri ( p1 );
	 /* .line 167 */
	 /* .local v0, "url":Ljava/lang/String; */
	 final String v1 = "WebUI"; // const-string v1, "WebUI"
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v3 = "Loading URL: "; // const-string v3, "Loading URL: "
	 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 com.openfeint.internal.OpenFeintInternal .log ( v1,v2 );
	 /* .line 168 */
	 /* iget-boolean v1, p0, Lcom/openfeint/internal/ui/WebNav$3;->val$reload:Z */
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* .line 169 */
		 v1 = this.this$0;
		 v1 = this.mWebView;
		 (( android.webkit.WebView ) v1 ).reload ( ); // invoke-virtual {v1}, Landroid/webkit/WebView;->reload()V
		 /* .line 174 */
	 } // .end local v0 # "url":Ljava/lang/String;
} // :cond_0
} // :goto_0
return;
/* .line 171 */
/* .restart local v0 # "url":Ljava/lang/String; */
} // :cond_1
v1 = this.this$0;
v1 = this.mWebView;
(( android.webkit.WebView ) v1 ).loadUrl ( v0 ); // invoke-virtual {v1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
} // .end method

class com.openfeint.internal.ui.WebNav$ActionHandler$2 extends com.openfeint.internal.ui.WebViewCacheCallback {
	 /* .source "WebNav.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/ui/WebNav$ActionHandler;->startLoading(Ljava/util/Map;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.WebNav$ActionHandler this$1; //synthetic
/* # direct methods */
 com.openfeint.internal.ui.WebNav$ActionHandler$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 742 */
this.this$1 = p1;
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebViewCacheCallback;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void failLoaded ( ) {
/* .locals 1 */
/* .prologue */
/* .line 750 */
v0 = this.this$1;
v0 = this.this$0;
com.openfeint.internal.ui.WebNav .access$100 ( v0 );
/* .line 751 */
return;
} // .end method
public void onTrackingNeeded ( ) {
/* .locals 1 */
/* .prologue */
/* .line 755 */
v0 = this.this$1;
v0 = this.this$0;
com.openfeint.internal.ui.WebNav .access$300 ( v0 );
/* .line 756 */
return;
} // .end method
public void pathLoaded ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "itemPath" # Ljava/lang/String; */
/* .prologue */
/* .line 745 */
v0 = this.this$1;
v0 = this.this$0;
final String v1 = "OF.navigateToUrlCallback()"; // const-string v1, "OF.navigateToUrlCallback()"
(( com.openfeint.internal.ui.WebNav ) v0 ).executeJavascript ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/internal/ui/WebNav;->executeJavascript(Ljava/lang/String;)V
/* .line 746 */
return;
} // .end method

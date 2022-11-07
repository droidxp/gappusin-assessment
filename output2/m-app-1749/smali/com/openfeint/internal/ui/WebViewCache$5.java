class com.openfeint.internal.ui.WebViewCache$5 extends com.openfeint.internal.request.BaseRequest {
	 /* .source "WebViewCache.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/ui/WebViewCache;->batchRequest(Ljava/util/Set;I)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.WebViewCache this$0; //synthetic
final Integer val$numRetries; //synthetic
final java.util.Set val$paths; //synthetic
/* # direct methods */
 com.openfeint.internal.ui.WebViewCache$5 ( ) {
/* .locals 0 */
/* .param p2, "x0" # Lcom/openfeint/internal/request/OrderedArgList; */
/* .prologue */
/* .line 859 */
this.this$0 = p1;
/* iput p3, p0, Lcom/openfeint/internal/ui/WebViewCache$5;->val$numRetries:I */
this.val$paths = p4;
/* invoke-direct {p0, p2}, Lcom/openfeint/internal/request/BaseRequest;-><init>(Lcom/openfeint/internal/request/OrderedArgList;)V */
return;
} // .end method
/* # virtual methods */
public java.lang.String method ( ) {
/* .locals 1 */
/* .prologue */
/* .line 861 */
final String v0 = "POST"; // const-string v0, "POST"
} // .end method
public void onResponse ( Integer p0, Object[] p1 ) {
/* .locals 0 */
/* .param p1, "responseCode" # I */
/* .param p2, "body" # [B */
/* .prologue */
/* .line 866 */
return;
} // .end method
protected void onResponseOffMainThread ( Integer p0, Object[] p1 ) {
/* .locals 7 */
/* .param p1, "responseCode" # I */
/* .param p2, "body" # [B */
/* .prologue */
/* .line 864 */
v0 = this.this$0;
(( com.openfeint.internal.ui.WebViewCache$5 ) p0 ).url ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/ui/WebViewCache$5;->url()Ljava/lang/String;
(( com.openfeint.internal.ui.WebViewCache$5 ) p0 ).currentURL ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/ui/WebViewCache$5;->currentURL()Ljava/lang/String;
/* iget v5, p0, Lcom/openfeint/internal/ui/WebViewCache$5;->val$numRetries:I */
v6 = this.val$paths;
/* move v1, p1 */
/* move-object v2, p2 */
/* invoke-static/range {v0 ..v6}, Lcom/openfeint/internal/ui/WebViewCache;->access$1200(Lcom/openfeint/internal/ui/WebViewCache;I[BLjava/lang/String;Ljava/lang/String;ILjava/util/Set;)V */
/* .line 865 */
return;
} // .end method
public java.lang.String path ( ) {
/* .locals 1 */
/* .prologue */
/* .line 862 */
final String v0 = "/webui/assets"; // const-string v0, "/webui/assets"
} // .end method
public Boolean signed ( ) {
/* .locals 1 */
/* .prologue */
/* .line 860 */
int v0 = 0; // const/4 v0, 0x0
} // .end method

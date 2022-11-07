class com.openfeint.internal.ui.WebViewCache$4 extends com.openfeint.internal.request.BaseRequest {
	 /* .source "WebViewCache.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/ui/WebViewCache;->batchFetch(Ljava/lang/String;Ljava/lang/String;ILjava/util/Set;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.WebViewCache this$0; //synthetic
final java.lang.String val$currentUrl; //synthetic
final java.lang.String val$originalUrl; //synthetic
final java.util.Set val$paths; //synthetic
final Integer val$retriesLeft; //synthetic
/* # direct methods */
 com.openfeint.internal.ui.WebViewCache$4 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 832 */
this.this$0 = p1;
this.val$originalUrl = p2;
this.val$currentUrl = p3;
/* iput p4, p0, Lcom/openfeint/internal/ui/WebViewCache$4;->val$retriesLeft:I */
this.val$paths = p5;
/* invoke-direct {p0}, Lcom/openfeint/internal/request/BaseRequest;-><init>()V */
return;
} // .end method
/* # virtual methods */
public java.lang.String method ( ) {
/* .locals 1 */
/* .prologue */
/* .line 834 */
final String v0 = "GET"; // const-string v0, "GET"
} // .end method
public void onResponse ( Integer p0, Object[] p1 ) {
/* .locals 0 */
/* .param p1, "responseCode" # I */
/* .param p2, "body" # [B */
/* .prologue */
/* .line 837 */
return;
} // .end method
public void onResponseOffMainThread ( Integer p0, Object[] p1 ) {
/* .locals 7 */
/* .param p1, "responseCode" # I */
/* .param p2, "body" # [B */
/* .prologue */
/* .line 839 */
v0 = this.this$0;
v3 = this.val$originalUrl;
v4 = this.val$currentUrl;
/* iget v5, p0, Lcom/openfeint/internal/ui/WebViewCache$4;->val$retriesLeft:I */
v6 = this.val$paths;
/* move v1, p1 */
/* move-object v2, p2 */
/* invoke-static/range {v0 ..v6}, Lcom/openfeint/internal/ui/WebViewCache;->access$1200(Lcom/openfeint/internal/ui/WebViewCache;I[BLjava/lang/String;Ljava/lang/String;ILjava/util/Set;)V */
/* .line 840 */
return;
} // .end method
public java.lang.String path ( ) {
/* .locals 1 */
/* .prologue */
/* .line 835 */
final String v0 = ""; // const-string v0, ""
} // .end method
public Boolean signed ( ) {
/* .locals 1 */
/* .prologue */
/* .line 833 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.String url ( ) {
/* .locals 1 */
/* .prologue */
/* .line 836 */
v0 = this.val$originalUrl;
} // .end method

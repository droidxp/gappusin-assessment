class com.openfeint.internal.ui.WebViewCache$ManifestRequest$1 extends com.openfeint.internal.request.BaseRequest {
	 /* .source "WebViewCache.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/ui/WebViewCache$ManifestRequest;->onResponseOffMainThread(I[B)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.WebViewCache$ManifestRequest this$1; //synthetic
/* # direct methods */
 com.openfeint.internal.ui.WebViewCache$ManifestRequest$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 496 */
this.this$1 = p1;
/* invoke-direct {p0}, Lcom/openfeint/internal/request/BaseRequest;-><init>()V */
return;
} // .end method
/* # virtual methods */
public java.lang.String method ( ) {
/* .locals 1 */
/* .prologue */
/* .line 497 */
final String v0 = "GET"; // const-string v0, "GET"
} // .end method
public void onResponse ( Integer p0, Object[] p1 ) {
/* .locals 0 */
/* .param p1, "responseCode" # I */
/* .param p2, "body" # [B */
/* .prologue */
/* .line 499 */
return;
} // .end method
public void onResponseOffMainThread ( Integer p0, Object[] p1 ) {
/* .locals 3 */
/* .param p1, "responseCode" # I */
/* .param p2, "body" # [B */
/* .prologue */
/* .line 501 */
/* const/16 v0, 0xc8 */
/* if-ne v0, p1, :cond_0 */
/* .line 503 */
try { // :try_start_0
	 v0 = this.this$1;
	 /* new-instance v1, Lcom/openfeint/internal/ui/WebViewCache$ManifestData; */
	 /* invoke-direct {v1, p2}, Lcom/openfeint/internal/ui/WebViewCache$ManifestData;-><init>([B)V */
	 com.openfeint.internal.ui.WebViewCache$ManifestRequest .access$702 ( v0,v1 );
	 /* .line 505 */
	 v0 = this.this$1;
	 com.openfeint.internal.ui.WebViewCache$ManifestRequest .access$800 ( v0 );
	 /* .line 506 */
	 v0 = this.this$1;
	 (( com.openfeint.internal.ui.WebViewCache$ManifestRequest$1 ) p0 ).getResponse ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/ui/WebViewCache$ManifestRequest$1;->getResponse()Lorg/apache/http/HttpResponse;
	 com.openfeint.internal.ui.WebViewCache$ManifestRequest .access$900 ( v0,v1 );
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 513 */
} // :goto_0
return;
/* .line 509 */
} // :cond_0
v0 = com.openfeint.internal.ui.WebViewCache$ManifestRequest$1.TAG;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "finishWithoutLoading "; // const-string v2, "finishWithoutLoading "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v0,v1 );
/* .line 511 */
v0 = this.this$1;
v0 = this.this$0;
com.openfeint.internal.ui.WebViewCache .access$1000 ( v0 );
/* .line 507 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
public java.lang.String path ( ) {
/* .locals 1 */
/* .prologue */
/* .line 498 */
v0 = this.this$1;
(( com.openfeint.internal.ui.WebViewCache$ManifestRequest ) v0 ).path ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/ui/WebViewCache$ManifestRequest;->path()Ljava/lang/String;
} // .end method

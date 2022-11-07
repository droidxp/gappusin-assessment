class com.openfeint.api.resource.Score$2 extends com.openfeint.internal.request.CompressedBlobDownloadRequest {
	 /* .source "Score.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/api/resource/Score;->downloadBlob(Lcom/openfeint/api/resource/Score$DownloadBlobCB;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.api.resource.Score this$0; //synthetic
final com.openfeint.api.resource.Score$DownloadBlobCB val$cb; //synthetic
/* # direct methods */
 com.openfeint.api.resource.Score$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 272 */
this.this$0 = p1;
this.val$cb = p2;
/* invoke-direct {p0}, Lcom/openfeint/internal/request/CompressedBlobDownloadRequest;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onFailure ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "exceptionMessage" # Ljava/lang/String; */
/* .prologue */
/* .line 281 */
/* invoke-super {p0, p1}, Lcom/openfeint/internal/request/CompressedBlobDownloadRequest;->onFailure(Ljava/lang/String;)V */
/* .line 282 */
v0 = this.val$cb;
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.val$cb;
	 (( com.openfeint.api.resource.Score$DownloadBlobCB ) v0 ).onFailure ( p1 ); // invoke-virtual {v0, p1}, Lcom/openfeint/api/resource/Score$DownloadBlobCB;->onFailure(Ljava/lang/String;)V
	 /* .line 283 */
} // :cond_0
return;
} // .end method
protected void onSuccessDecompress ( Object[] p0 ) {
/* .locals 1 */
/* .param p1, "bodyData" # [B */
/* .prologue */
/* .line 277 */
v0 = this.this$0;
this.blob = p1;
/* .line 278 */
v0 = this.val$cb;
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.val$cb;
	 (( com.openfeint.api.resource.Score$DownloadBlobCB ) v0 ).onSuccess ( ); // invoke-virtual {v0}, Lcom/openfeint/api/resource/Score$DownloadBlobCB;->onSuccess()V
	 /* .line 279 */
} // :cond_0
return;
} // .end method
public java.lang.String path ( ) {
/* .locals 1 */
/* .prologue */
/* .line 275 */
final String v0 = ""; // const-string v0, ""
} // .end method
public Boolean signed ( ) {
/* .locals 1 */
/* .prologue */
/* .line 273 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public java.lang.String url ( ) {
/* .locals 1 */
/* .prologue */
/* .line 274 */
v0 = this.this$0;
com.openfeint.api.resource.Score .access$100 ( v0 );
} // .end method

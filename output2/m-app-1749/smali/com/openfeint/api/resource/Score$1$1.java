class com.openfeint.api.resource.Score$1$1 implements com.openfeint.internal.request.IRawRequestDelegate {
	 /* .source "Score.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/api/resource/Score$1;->perhapsUploadBlob(ZLjava/lang/Object;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.api.resource.Score$1 this$1; //synthetic
/* # direct methods */
 com.openfeint.api.resource.Score$1$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 233 */
this.this$1 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onResponse ( Integer p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p1, "responseCode" # I */
/* .param p2, "responseBody" # Ljava/lang/String; */
/* .prologue */
/* .line 235 */
/* const/16 v0, 0xc8 */
/* if-gt v0, p1, :cond_0 */
/* const/16 v0, 0x12c */
/* if-ge p1, v0, :cond_0 */
/* .line 236 */
v0 = this.this$1;
v0 = this.val$cb;
(( com.openfeint.api.resource.Score$SubmitToCB ) v0 ).onBlobUploadSuccess ( ); // invoke-virtual {v0}, Lcom/openfeint/api/resource/Score$SubmitToCB;->onBlobUploadSuccess()V
/* .line 240 */
} // :goto_0
return;
/* .line 238 */
} // :cond_0
v0 = this.this$1;
v0 = this.val$cb;
(( com.openfeint.api.resource.Score$SubmitToCB ) v0 ).onBlobUploadFailure ( p2 ); // invoke-virtual {v0, p2}, Lcom/openfeint/api/resource/Score$SubmitToCB;->onBlobUploadFailure(Ljava/lang/String;)V
} // .end method

class inal extends com.openfeint.api.resource.Score$SubmitToCB {
	 /* .source "OfflineSupport.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/offline/OfflineSupport;->uploadScoresWithBlobs()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x8 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.offline.OfflineSupport$OfflineScore val$os; //synthetic
/* # direct methods */
 inal ( ) {
/* .locals 0 */
/* .prologue */
/* .line 380 */
this.val$os = p1;
/* invoke-direct {p0}, Lcom/openfeint/api/resource/Score$SubmitToCB;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onFailure ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "failureMessage" # Ljava/lang/String; */
/* .prologue */
/* .line 387 */
com.openfeint.internal.offline.OfflineSupport .access$200 ( );
int v1 = 0; // const/4 v1, 0x0
(( java.util.concurrent.atomic.AtomicBoolean ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
/* .line 388 */
return;
} // .end method
public void onSuccess ( Boolean p0 ) {
/* .locals 1 */
/* .param p1, "newHighScore" # Z */
/* .prologue */
/* .line 383 */
v0 = this.val$os;
com.openfeint.internal.offline.OfflineSupport .removeAndUploadNext ( v0 );
/* .line 384 */
return;
} // .end method

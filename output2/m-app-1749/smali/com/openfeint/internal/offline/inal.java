class inal extends com.openfeint.internal.request.BaseRequest {
	 /* .source "OfflineSupport.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/offline/OfflineSupport;->updateToServer()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x8 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.offline.OfflineSupport$DB val$clonedDB; //synthetic
final java.lang.String val$path; //synthetic
/* # direct methods */
 inal ( ) {
/* .locals 0 */
/* .param p1, "x0" # Lcom/openfeint/internal/request/OrderedArgList; */
/* .prologue */
/* .line 444 */
this.val$path = p2;
this.val$clonedDB = p3;
/* invoke-direct {p0, p1}, Lcom/openfeint/internal/request/BaseRequest;-><init>(Lcom/openfeint/internal/request/OrderedArgList;)V */
return;
} // .end method
/* # virtual methods */
public java.lang.String method ( ) {
/* .locals 1 */
/* .prologue */
/* .line 445 */
final String v0 = "POST"; // const-string v0, "POST"
} // .end method
public void onResponse ( Integer p0, Object[] p1 ) {
/* .locals 0 */
/* .param p1, "responseCode" # I */
/* .param p2, "body" # [B */
/* .prologue */
/* .line 447 */
return;
} // .end method
public void onResponseOffMainThread ( Integer p0, Object[] p1 ) {
/* .locals 2 */
/* .param p1, "responseCode" # I */
/* .param p2, "body" # [B */
/* .prologue */
/* .line 449 */
/* const/16 v0, 0xc8 */
/* if-gt v0, p1, :cond_0 */
/* const/16 v0, 0x12c */
/* if-ge p1, v0, :cond_0 */
/* .line 451 */
com.openfeint.internal.offline.OfflineSupport .access$300 ( );
v1 = this.val$clonedDB;
(( com.openfeint.internal.offline.OfflineSupport$DB ) v0 ).updateOnUpload ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/internal/offline/OfflineSupport$DB;->updateOnUpload(Lcom/openfeint/internal/offline/OfflineSupport$DB;)V
/* .line 452 */
com.openfeint.internal.offline.OfflineSupport .access$400 ( );
/* .line 455 */
com.openfeint.internal.offline.OfflineSupport .access$500 ( );
/* .line 468 */
} // :goto_0
return;
/* .line 457 */
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_1
/* const/16 v0, 0x1f4 */
/* if-gt v0, p1, :cond_2 */
/* .line 466 */
} // :cond_1
} // :goto_1
com.openfeint.internal.offline.OfflineSupport .access$200 ( );
int v1 = 0; // const/4 v1, 0x0
(( java.util.concurrent.atomic.AtomicBoolean ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
/* .line 461 */
} // :cond_2
com.openfeint.internal.offline.OfflineSupport .access$300 ( );
(( com.openfeint.internal.offline.OfflineSupport$DB ) v0 ).removeReferencedBlobs ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/offline/OfflineSupport$DB;->removeReferencedBlobs()V
/* .line 462 */
com.openfeint.internal.offline.OfflineSupport .access$300 ( );
(( com.openfeint.internal.offline.OfflineSupport$DB ) v0 ).clear ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/offline/OfflineSupport$DB;->clear()V
/* .line 463 */
com.openfeint.internal.offline.OfflineSupport .access$400 ( );
} // .end method
public java.lang.String path ( ) {
/* .locals 1 */
/* .prologue */
/* .line 446 */
v0 = this.val$path;
} // .end method

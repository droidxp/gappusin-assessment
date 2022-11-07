class com.openfeint.internal.OpenFeintInternal$4 extends com.openfeint.internal.request.RawRequest {
	 /* .source "OpenFeintInternal.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/OpenFeintInternal;->loginUser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/openfeint/internal/request/IRawRequestDelegate;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.OpenFeintInternal this$0; //synthetic
final Boolean val$finalToast; //synthetic
/* # direct methods */
 com.openfeint.internal.OpenFeintInternal$4 ( ) {
/* .locals 0 */
/* .param p2, "x0" # Lcom/openfeint/internal/request/OrderedArgList; */
/* .prologue */
/* .line 437 */
this.this$0 = p1;
/* iput-boolean p3, p0, Lcom/openfeint/internal/OpenFeintInternal$4;->val$finalToast:Z */
/* invoke-direct {p0, p2}, Lcom/openfeint/internal/request/RawRequest;-><init>(Lcom/openfeint/internal/request/OrderedArgList;)V */
return;
} // .end method
/* # virtual methods */
public java.lang.String method ( ) {
/* .locals 1 */
/* .prologue */
/* .line 438 */
final String v0 = "POST"; // const-string v0, "POST"
} // .end method
public void onResponse ( Integer p0, java.lang.Object p1 ) {
/* .locals 5 */
/* .param p1, "responseCode" # I */
/* .param p2, "responseBody" # Ljava/lang/Object; */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 441 */
v2 = this.this$0;
int v3 = 0; // const/4 v3, 0x0
com.openfeint.internal.OpenFeintInternal .access$702 ( v2,v3 );
/* .line 443 */
/* const/16 v2, 0xc8 */
/* if-gt v2, p1, :cond_1 */
/* const/16 v2, 0x12c */
/* if-ge p1, v2, :cond_1 */
/* .line 444 */
v2 = this.this$0;
/* check-cast p2, Lcom/openfeint/api/resource/User; */
} // .end local p2 # "responseBody":Ljava/lang/Object;
com.openfeint.internal.OpenFeintInternal .access$000 ( v2,p2 );
/* .line 447 */
v2 = this.this$0;
com.openfeint.internal.OpenFeintInternal .access$400 ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 448 */
v2 = com.openfeint.internal.OpenFeintInternal$4.TAG;
final String v3 = "Launching post-login runnable now."; // const-string v3, "Launching post-login runnable now."
com.openfeint.internal.OpenFeintInternal .log ( v2,v3 );
/* .line 449 */
v2 = this.this$0;
v2 = this.mMainThreadHandler;
v3 = this.this$0;
com.openfeint.internal.OpenFeintInternal .access$400 ( v3 );
(( android.os.Handler ) v2 ).post ( v3 ); // invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 458 */
} // :cond_0
} // :goto_0
v2 = this.this$0;
com.openfeint.internal.OpenFeintInternal .access$800 ( v2 );
if ( v2 != null) { // if-eqz v2, :cond_2
v2 = this.this$0;
com.openfeint.internal.OpenFeintInternal .access$800 ( v2 );
/* .local v0, "i$":Ljava/util/Iterator; */
v2 = } // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_2
/* check-cast v1, Ljava/lang/Runnable; */
/* .line 459 */
/* .local v1, "r":Ljava/lang/Runnable; */
v2 = this.this$0;
v2 = this.mMainThreadHandler;
(( android.os.Handler ) v2 ).post ( v1 ); // invoke-virtual {v2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 452 */
} // .end local v0 # "i$":Ljava/util/Iterator;
} // .end local v1 # "r":Ljava/lang/Runnable;
/* .restart local p2 # "responseBody":Ljava/lang/Object; */
} // :cond_1
/* iget-boolean v2, p0, Lcom/openfeint/internal/OpenFeintInternal$4;->val$finalToast:Z */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 453 */
v2 = this.this$0;
com.openfeint.internal.OpenFeintInternal .access$500 ( v2,p1,p2 );
/* .line 461 */
} // .end local p2 # "responseBody":Ljava/lang/Object;
} // :cond_2
v2 = this.this$0;
com.openfeint.internal.OpenFeintInternal .access$402 ( v2,v4 );
/* .line 462 */
v2 = this.this$0;
com.openfeint.internal.OpenFeintInternal .access$802 ( v2,v4 );
/* .line 463 */
return;
} // .end method
public java.lang.String path ( ) {
/* .locals 1 */
/* .prologue */
/* .line 439 */
final String v0 = "/xp/sessions.json"; // const-string v0, "/xp/sessions.json"
} // .end method

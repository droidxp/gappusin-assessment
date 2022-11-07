class com.openfeint.api.resource.CurrentUser$1 extends com.openfeint.internal.request.JSONRequest {
	 /* .source "CurrentUser.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/api/resource/CurrentUser;->befriend(Lcom/openfeint/api/resource/User;Lcom/openfeint/api/resource/CurrentUser$BefriendCB;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.api.resource.CurrentUser this$0; //synthetic
final com.openfeint.api.resource.CurrentUser$BefriendCB val$cb; //synthetic
/* # direct methods */
 com.openfeint.api.resource.CurrentUser$1 ( ) {
/* .locals 0 */
/* .param p2, "x0" # Lcom/openfeint/internal/request/OrderedArgList; */
/* .prologue */
/* .line 34 */
this.this$0 = p1;
this.val$cb = p3;
/* invoke-direct {p0, p2}, Lcom/openfeint/internal/request/JSONRequest;-><init>(Lcom/openfeint/internal/request/OrderedArgList;)V */
return;
} // .end method
/* # virtual methods */
public java.lang.String method ( ) {
/* .locals 1 */
/* .prologue */
/* .line 36 */
final String v0 = "POST"; // const-string v0, "POST"
} // .end method
public void onFailure ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "exceptionMessage" # Ljava/lang/String; */
/* .prologue */
/* .line 45 */
/* invoke-super {p0, p1}, Lcom/openfeint/internal/request/JSONRequest;->onFailure(Ljava/lang/String;)V */
/* .line 46 */
v0 = this.val$cb;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 47 */
	 v0 = this.val$cb;
	 (( com.openfeint.api.resource.CurrentUser$BefriendCB ) v0 ).onFailure ( p1 ); // invoke-virtual {v0, p1}, Lcom/openfeint/api/resource/CurrentUser$BefriendCB;->onFailure(Ljava/lang/String;)V
	 /* .line 49 */
} // :cond_0
return;
} // .end method
public void onSuccess ( java.lang.Object p0 ) {
/* .locals 1 */
/* .param p1, "responseBody" # Ljava/lang/Object; */
/* .prologue */
/* .line 39 */
v0 = this.val$cb;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 40 */
	 v0 = this.val$cb;
	 (( com.openfeint.api.resource.CurrentUser$BefriendCB ) v0 ).onSuccess ( ); // invoke-virtual {v0}, Lcom/openfeint/api/resource/CurrentUser$BefriendCB;->onSuccess()V
	 /* .line 42 */
} // :cond_0
return;
} // .end method
public java.lang.String path ( ) {
/* .locals 1 */
/* .prologue */
/* .line 37 */
final String v0 = "/xp/friend_requests"; // const-string v0, "/xp/friend_requests"
} // .end method
public Boolean wantsLogin ( ) {
/* .locals 1 */
/* .prologue */
/* .line 35 */
int v0 = 1; // const/4 v0, 0x1
} // .end method

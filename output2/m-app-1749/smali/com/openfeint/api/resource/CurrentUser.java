public class com.openfeint.api.resource.CurrentUser extends com.openfeint.api.resource.User {
	 /* .source "CurrentUser.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/openfeint/api/resource/CurrentUser$BefriendCB; */
	 /* } */
} // .end annotation
/* # direct methods */
public com.openfeint.api.resource.CurrentUser ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 60 */
	 /* invoke-direct {p0}, Lcom/openfeint/api/resource/User;-><init>()V */
	 /* .line 61 */
	 return;
} // .end method
public static com.openfeint.internal.resource.ResourceClass getResourceClass ( ) {
	 /* .locals 3 */
	 /* .prologue */
	 /* .line 67 */
	 /* new-instance v0, Lcom/openfeint/api/resource/CurrentUser$2; */
	 /* const-class v1, Lcom/openfeint/api/resource/CurrentUser; */
	 final String v2 = "current_user"; // const-string v2, "current_user"
	 /* invoke-direct {v0, v1, v2}, Lcom/openfeint/api/resource/CurrentUser$2;-><init>(Ljava/lang/Class;Ljava/lang/String;)V */
} // .end method
/* # virtual methods */
public void befriend ( com.openfeint.api.resource.User p0, com.openfeint.api.resource.CurrentUser$BefriendCB p1 ) {
	 /* .locals 4 */
	 /* .param p1, "userToBefriend" # Lcom/openfeint/api/resource/User; */
	 /* .param p2, "cb" # Lcom/openfeint/api/resource/CurrentUser$BefriendCB; */
	 /* .prologue */
	 /* .line 32 */
	 /* new-instance v0, Lcom/openfeint/internal/request/OrderedArgList; */
	 /* invoke-direct {v0}, Lcom/openfeint/internal/request/OrderedArgList;-><init>()V */
	 /* .line 33 */
	 /* .local v0, "args":Lcom/openfeint/internal/request/OrderedArgList; */
	 final String v2 = "friend_id"; // const-string v2, "friend_id"
	 (( com.openfeint.api.resource.User ) p1 ).resourceID ( ); // invoke-virtual {p1}, Lcom/openfeint/api/resource/User;->resourceID()Ljava/lang/String;
	 (( com.openfeint.internal.request.OrderedArgList ) v0 ).put ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
	 /* .line 34 */
	 /* new-instance v1, Lcom/openfeint/api/resource/CurrentUser$1; */
	 /* invoke-direct {v1, p0, v0, p2}, Lcom/openfeint/api/resource/CurrentUser$1;-><init>(Lcom/openfeint/api/resource/CurrentUser;Lcom/openfeint/internal/request/OrderedArgList;Lcom/openfeint/api/resource/CurrentUser$BefriendCB;)V */
	 /* .line 52 */
	 /* .local v1, "req":Lcom/openfeint/internal/request/JSONRequest; */
	 (( com.openfeint.internal.request.JSONRequest ) v1 ).launch ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/request/JSONRequest;->launch()V
	 /* .line 53 */
	 return;
} // .end method

class com.openfeint.api.resource.User$4 extends com.openfeint.internal.request.JSONRequest {
	 /* .source "User.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/api/resource/User;->getFriends(Lcom/openfeint/api/resource/User$GetFriendsCB;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.api.resource.User this$0; //synthetic
final com.openfeint.api.resource.User$GetFriendsCB val$cb; //synthetic
/* # direct methods */
 com.openfeint.api.resource.User$4 ( ) {
/* .locals 0 */
/* .param p2, "x0" # Lcom/openfeint/internal/request/OrderedArgList; */
/* .prologue */
/* .line 207 */
this.this$0 = p1;
this.val$cb = p3;
/* invoke-direct {p0, p2}, Lcom/openfeint/internal/request/JSONRequest;-><init>(Lcom/openfeint/internal/request/OrderedArgList;)V */
return;
} // .end method
/* # virtual methods */
public java.lang.String method ( ) {
/* .locals 1 */
/* .prologue */
/* .line 209 */
final String v0 = "GET"; // const-string v0, "GET"
} // .end method
public void onFailure ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "exceptionMessage" # Ljava/lang/String; */
/* .prologue */
/* .line 223 */
/* invoke-super {p0, p1}, Lcom/openfeint/internal/request/JSONRequest;->onFailure(Ljava/lang/String;)V */
/* .line 224 */
v0 = this.val$cb;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 225 */
	 v0 = this.val$cb;
	 (( com.openfeint.api.resource.User$GetFriendsCB ) v0 ).onFailure ( p1 ); // invoke-virtual {v0, p1}, Lcom/openfeint/api/resource/User$GetFriendsCB;->onFailure(Ljava/lang/String;)V
	 /* .line 227 */
} // :cond_0
return;
} // .end method
public void onSuccess ( java.lang.Object p0 ) {
/* .locals 4 */
/* .param p1, "responseBody" # Ljava/lang/Object; */
/* .prologue */
/* .line 212 */
v3 = this.val$cb;
if ( v3 != null) { // if-eqz v3, :cond_0
	 /* .line 214 */
	 try { // :try_start_0
		 /* move-object v0, p1 */
		 /* check-cast v0, Ljava/util/List; */
		 /* move-object v2, v0 */
		 /* .line 215 */
		 /* .local v2, "friends":Ljava/util/List;, "Ljava/util/List<Lcom/openfeint/api/resource/User;>;" */
		 v3 = this.val$cb;
		 (( com.openfeint.api.resource.User$GetFriendsCB ) v3 ).onSuccess ( v2 ); // invoke-virtual {v3, v2}, Lcom/openfeint/api/resource/User$GetFriendsCB;->onSuccess(Ljava/util/List;)V
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 220 */
	 } // .end local v2 # "friends":Ljava/util/List;, "Ljava/util/List<Lcom/openfeint/api/resource/User;>;"
} // :cond_0
} // :goto_0
return;
/* .line 216 */
/* :catch_0 */
/* move-exception v1 */
/* .line 217 */
/* .local v1, "e":Ljava/lang/Exception; */
com.openfeint.internal.OpenFeintInternal .getRString ( v3 );
(( com.openfeint.api.resource.User$4 ) p0 ).onFailure ( v3 ); // invoke-virtual {p0, v3}, Lcom/openfeint/api/resource/User$4;->onFailure(Ljava/lang/String;)V
} // .end method
public java.lang.String path ( ) {
/* .locals 1 */
/* .prologue */
/* .line 210 */
final String v0 = "/xp/friends"; // const-string v0, "/xp/friends"
} // .end method
public Boolean wantsLogin ( ) {
/* .locals 1 */
/* .prologue */
/* .line 208 */
int v0 = 1; // const/4 v0, 0x1
} // .end method

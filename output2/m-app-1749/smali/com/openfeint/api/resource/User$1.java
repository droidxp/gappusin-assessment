class com.openfeint.api.resource.User$1 extends com.openfeint.internal.request.JSONRequest {
	 /* .source "User.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/api/resource/User;->load(Lcom/openfeint/api/resource/User$LoadCB;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.api.resource.User this$0; //synthetic
final com.openfeint.api.resource.User$LoadCB val$cb; //synthetic
/* # direct methods */
 com.openfeint.api.resource.User$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 99 */
this.this$0 = p1;
this.val$cb = p2;
/* invoke-direct {p0}, Lcom/openfeint/internal/request/JSONRequest;-><init>()V */
return;
} // .end method
/* # virtual methods */
public java.lang.String method ( ) {
/* .locals 1 */
/* .prologue */
/* .line 100 */
final String v0 = "GET"; // const-string v0, "GET"
} // .end method
public void onFailure ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "exceptionMessage" # Ljava/lang/String; */
/* .prologue */
/* .line 112 */
/* invoke-super {p0, p1}, Lcom/openfeint/internal/request/JSONRequest;->onFailure(Ljava/lang/String;)V */
/* .line 113 */
v0 = this.val$cb;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 114 */
	 v0 = this.val$cb;
	 (( com.openfeint.api.resource.User$LoadCB ) v0 ).onFailure ( p1 ); // invoke-virtual {v0, p1}, Lcom/openfeint/api/resource/User$LoadCB;->onFailure(Ljava/lang/String;)V
	 /* .line 116 */
} // :cond_0
return;
} // .end method
public void onSuccess ( java.lang.Object p0 ) {
/* .locals 1 */
/* .param p1, "responseBody" # Ljava/lang/Object; */
/* .prologue */
/* .line 104 */
v0 = this.this$0;
/* check-cast p1, Lcom/openfeint/api/resource/User; */
} // .end local p1 # "responseBody":Ljava/lang/Object;
(( com.openfeint.api.resource.User ) v0 ).shallowCopyAncestorType ( p1 ); // invoke-virtual {v0, p1}, Lcom/openfeint/api/resource/User;->shallowCopyAncestorType(Lcom/openfeint/internal/resource/Resource;)V
/* .line 106 */
v0 = this.val$cb;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 107 */
v0 = this.val$cb;
(( com.openfeint.api.resource.User$LoadCB ) v0 ).onSuccess ( ); // invoke-virtual {v0}, Lcom/openfeint/api/resource/User$LoadCB;->onSuccess()V
/* .line 109 */
} // :cond_0
return;
} // .end method
public java.lang.String path ( ) {
/* .locals 2 */
/* .prologue */
/* .line 101 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "/xp/users/"; // const-string v1, "/xp/users/"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.this$0;
(( com.openfeint.api.resource.User ) v1 ).resourceID ( ); // invoke-virtual {v1}, Lcom/openfeint/api/resource/User;->resourceID()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method

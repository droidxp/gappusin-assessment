class com.openfeint.internal.OpenFeintInternal$1 extends com.openfeint.internal.request.RawRequest {
	 /* .source "OpenFeintInternal.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/OpenFeintInternal;->createUser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/openfeint/internal/request/IRawRequestDelegate;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.OpenFeintInternal this$0; //synthetic
/* # direct methods */
 com.openfeint.internal.OpenFeintInternal$1 ( ) {
/* .locals 0 */
/* .param p2, "x0" # Lcom/openfeint/internal/request/OrderedArgList; */
/* .prologue */
/* .line 270 */
this.this$0 = p1;
/* invoke-direct {p0, p2}, Lcom/openfeint/internal/request/RawRequest;-><init>(Lcom/openfeint/internal/request/OrderedArgList;)V */
return;
} // .end method
/* # virtual methods */
public java.lang.String method ( ) {
/* .locals 1 */
/* .prologue */
/* .line 271 */
final String v0 = "POST"; // const-string v0, "POST"
} // .end method
public void onSuccess ( java.lang.Object p0 ) {
/* .locals 1 */
/* .param p1, "responseBody" # Ljava/lang/Object; */
/* .prologue */
/* .line 274 */
v0 = this.this$0;
/* check-cast p1, Lcom/openfeint/api/resource/User; */
} // .end local p1 # "responseBody":Ljava/lang/Object;
com.openfeint.internal.OpenFeintInternal .access$000 ( v0,p1 );
/* .line 275 */
return;
} // .end method
public java.lang.String path ( ) {
/* .locals 1 */
/* .prologue */
/* .line 272 */
final String v0 = "/xp/users.json"; // const-string v0, "/xp/users.json"
} // .end method

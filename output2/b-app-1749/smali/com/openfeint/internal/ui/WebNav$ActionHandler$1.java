class com.openfeint.internal.ui.WebNav$ActionHandler$1 implements com.openfeint.internal.request.IRawRequestDelegate {
	 /* .source "WebNav.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/ui/WebNav$ActionHandler;->apiRequest(Ljava/util/Map;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.WebNav$ActionHandler this$1; //synthetic
final java.lang.String val$requestID; //synthetic
/* # direct methods */
 com.openfeint.internal.ui.WebNav$ActionHandler$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 713 */
this.this$1 = p1;
this.val$requestID = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onResponse ( Integer p0, java.lang.String p1 ) {
/* .locals 6 */
/* .param p1, "statusCode" # I */
/* .param p2, "responseBody" # Ljava/lang/String; */
/* .prologue */
/* .line 716 */
(( java.lang.String ) p2 ).trim ( ); // invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 717 */
/* .local v1, "response":Ljava/lang/String; */
v2 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* if-nez v2, :cond_0 */
final String v1 = "{}"; // const-string v1, "{}"
/* .line 718 */
} // :cond_0
final String v2 = "OF.api.completeRequest(\"%s\", \"%d\", %s)"; // const-string v2, "OF.api.completeRequest(\"%s\", \"%d\", %s)"
int v3 = 3; // const/4 v3, 0x3
/* new-array v3, v3, [Ljava/lang/Object; */
int v4 = 0; // const/4 v4, 0x0
v5 = this.val$requestID;
/* aput-object v5, v3, v4 */
int v4 = 1; // const/4 v4, 0x1
java.lang.Integer .valueOf ( p1 );
/* aput-object v5, v3, v4 */
int v4 = 2; // const/4 v4, 0x2
/* aput-object v1, v3, v4 */
java.lang.String .format ( v2,v3 );
/* .line 721 */
/* .local v0, "js":Ljava/lang/String; */
v2 = this.this$1;
v2 = this.mWebNav;
(( com.openfeint.internal.ui.WebNav ) v2 ).executeJavascript ( v0 ); // invoke-virtual {v2, v0}, Lcom/openfeint/internal/ui/WebNav;->executeJavascript(Ljava/lang/String;)V
/* .line 722 */
return;
} // .end method

class com.openfeint.internal.ui.IntroFlow$IntroFlowActionHandler$1 implements com.openfeint.internal.request.IRawRequestDelegate {
	 /* .source "IntroFlow.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/ui/IntroFlow$IntroFlowActionHandler;->createUser(Ljava/util/Map;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.IntroFlow$IntroFlowActionHandler this$1; //synthetic
final java.util.Map val$options; //synthetic
/* # direct methods */
 com.openfeint.internal.ui.IntroFlow$IntroFlowActionHandler$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 65 */
this.this$1 = p1;
this.val$options = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onResponse ( Integer p0, java.lang.String p1 ) {
/* .locals 6 */
/* .param p1, "status" # I */
/* .param p2, "response" # Ljava/lang/String; */
/* .prologue */
/* .line 68 */
final String v1 = "%s(\'%d\', %s)"; // const-string v1, "%s(\'%d\', %s)"
int v2 = 3; // const/4 v2, 0x3
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
v4 = this.val$options;
final String v5 = "callback"; // const-string v5, "callback"
/* aput-object v4, v2, v3 */
int v3 = 1; // const/4 v3, 0x1
java.lang.Integer .valueOf ( p1 );
/* aput-object v4, v2, v3 */
int v3 = 2; // const/4 v3, 0x2
(( java.lang.String ) p2 ).trim ( ); // invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;
/* aput-object v4, v2, v3 */
java.lang.String .format ( v1,v2 );
/* .line 69 */
/* .local v0, "js":Ljava/lang/String; */
v1 = this.this$1;
v1 = this.mWebNav;
(( com.openfeint.internal.ui.WebNav ) v1 ).executeJavascript ( v0 ); // invoke-virtual {v1, v0}, Lcom/openfeint/internal/ui/WebNav;->executeJavascript(Ljava/lang/String;)V
/* .line 70 */
return;
} // .end method

class com.openfeint.internal.ui.WebNav$ActionHandler$3 extends com.openfeint.api.resource.Score$DownloadBlobCB {
	 /* .source "WebNav.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/ui/WebNav$ActionHandler;->downloadBlob(Ljava/util/Map;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.WebNav$ActionHandler this$1; //synthetic
final java.lang.String val$onError; //synthetic
final java.lang.String val$onSuccess; //synthetic
final com.openfeint.api.resource.Score val$score; //synthetic
/* # direct methods */
 com.openfeint.internal.ui.WebNav$ActionHandler$3 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 873 */
this.this$1 = p1;
this.val$onSuccess = p2;
this.val$score = p3;
this.val$onError = p4;
/* invoke-direct {p0}, Lcom/openfeint/api/resource/Score$DownloadBlobCB;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onFailure ( java.lang.String p0 ) {
/* .locals 5 */
/* .param p1, "exceptionMessage" # Ljava/lang/String; */
/* .prologue */
/* .line 881 */
v0 = this.val$onError;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 882 */
	 v0 = this.this$1;
	 v0 = this.this$0;
	 final String v1 = "%s(%s)"; // const-string v1, "%s(%s)"
	 int v2 = 2; // const/4 v2, 0x2
	 /* new-array v2, v2, [Ljava/lang/Object; */
	 int v3 = 0; // const/4 v3, 0x0
	 v4 = this.val$onError;
	 /* aput-object v4, v2, v3 */
	 int v3 = 1; // const/4 v3, 0x1
	 /* aput-object p1, v2, v3 */
	 java.lang.String .format ( v1,v2 );
	 (( com.openfeint.internal.ui.WebNav ) v0 ).executeJavascript ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/internal/ui/WebNav;->executeJavascript(Ljava/lang/String;)V
	 /* .line 884 */
} // :cond_0
return;
} // .end method
public void onSuccess ( ) {
/* .locals 5 */
/* .prologue */
/* .line 875 */
v0 = this.val$onSuccess;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 876 */
	 v0 = this.this$1;
	 v0 = this.this$0;
	 final String v1 = "%s()"; // const-string v1, "%s()"
	 int v2 = 1; // const/4 v2, 0x1
	 /* new-array v2, v2, [Ljava/lang/Object; */
	 int v3 = 0; // const/4 v3, 0x0
	 v4 = this.val$onSuccess;
	 /* aput-object v4, v2, v3 */
	 java.lang.String .format ( v1,v2 );
	 (( com.openfeint.internal.ui.WebNav ) v0 ).executeJavascript ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/internal/ui/WebNav;->executeJavascript(Ljava/lang/String;)V
	 /* .line 878 */
} // :cond_0
v0 = this.val$score;
com.openfeint.internal.resource.ScoreBlobDelegate .notifyBlobDownloaded ( v0 );
/* .line 879 */
return;
} // .end method

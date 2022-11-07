class com.openfeint.api.resource.Leaderboard$1 extends com.openfeint.internal.request.JSONRequest {
	 /* .source "Leaderboard.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/api/resource/Leaderboard;->getScores(ZLcom/openfeint/api/resource/Leaderboard$GetScoresCB;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.api.resource.Leaderboard this$0; //synthetic
final com.openfeint.api.resource.Leaderboard$GetScoresCB val$cb; //synthetic
final Boolean val$friends; //synthetic
final java.lang.String val$path; //synthetic
/* # direct methods */
 com.openfeint.api.resource.Leaderboard$1 ( ) {
/* .locals 0 */
/* .param p2, "x0" # Lcom/openfeint/internal/request/OrderedArgList; */
/* .prologue */
/* .line 99 */
this.this$0 = p1;
/* iput-boolean p3, p0, Lcom/openfeint/api/resource/Leaderboard$1;->val$friends:Z */
this.val$path = p4;
this.val$cb = p5;
/* invoke-direct {p0, p2}, Lcom/openfeint/internal/request/JSONRequest;-><init>(Lcom/openfeint/internal/request/OrderedArgList;)V */
return;
} // .end method
/* # virtual methods */
public java.lang.String method ( ) {
/* .locals 1 */
/* .prologue */
/* .line 101 */
final String v0 = "GET"; // const-string v0, "GET"
} // .end method
public void onFailure ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "exceptionMessage" # Ljava/lang/String; */
/* .prologue */
/* .line 113 */
/* invoke-super {p0, p1}, Lcom/openfeint/internal/request/JSONRequest;->onFailure(Ljava/lang/String;)V */
/* .line 114 */
v0 = this.val$cb;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 115 */
	 v0 = this.val$cb;
	 (( com.openfeint.api.resource.Leaderboard$GetScoresCB ) v0 ).onFailure ( p1 ); // invoke-virtual {v0, p1}, Lcom/openfeint/api/resource/Leaderboard$GetScoresCB;->onFailure(Ljava/lang/String;)V
	 /* .line 117 */
} // :cond_0
return;
} // .end method
public void onSuccess ( java.lang.Object p0 ) {
/* .locals 2 */
/* .param p1, "responseBody" # Ljava/lang/Object; */
/* .prologue */
/* .line 106 */
v1 = this.val$cb;
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* move-object v0, p1 */
	 /* .line 107 */
	 /* check-cast v0, Ljava/util/List; */
	 /* .line 108 */
	 /* .local v0, "scores":Ljava/util/List;, "Ljava/util/List<Lcom/openfeint/api/resource/Score;>;" */
	 v1 = this.val$cb;
	 (( com.openfeint.api.resource.Leaderboard$GetScoresCB ) v1 ).onSuccess ( v0 ); // invoke-virtual {v1, v0}, Lcom/openfeint/api/resource/Leaderboard$GetScoresCB;->onSuccess(Ljava/util/List;)V
	 /* .line 110 */
} // .end local v0 # "scores":Ljava/util/List;, "Ljava/util/List<Lcom/openfeint/api/resource/Score;>;"
} // :cond_0
return;
} // .end method
public java.lang.String path ( ) {
/* .locals 1 */
/* .prologue */
/* .line 102 */
v0 = this.val$path;
} // .end method
public Boolean wantsLogin ( ) {
/* .locals 1 */
/* .prologue */
/* .line 100 */
/* iget-boolean v0, p0, Lcom/openfeint/api/resource/Leaderboard$1;->val$friends:Z */
} // .end method

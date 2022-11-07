class com.openfeint.api.resource.Leaderboard$2 extends com.openfeint.internal.request.JSONRequest {
	 /* .source "Leaderboard.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/api/resource/Leaderboard;->getUserScore(Lcom/openfeint/api/resource/User;Lcom/openfeint/api/resource/Leaderboard$GetUserScoreCB;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.api.resource.Leaderboard this$0; //synthetic
final com.openfeint.api.resource.Leaderboard$GetUserScoreCB val$cb; //synthetic
final java.lang.String val$path; //synthetic
/* # direct methods */
 com.openfeint.api.resource.Leaderboard$2 ( ) {
/* .locals 0 */
/* .param p2, "x0" # Lcom/openfeint/internal/request/OrderedArgList; */
/* .prologue */
/* .line 151 */
this.this$0 = p1;
this.val$path = p3;
this.val$cb = p4;
/* invoke-direct {p0, p2}, Lcom/openfeint/internal/request/JSONRequest;-><init>(Lcom/openfeint/internal/request/OrderedArgList;)V */
return;
} // .end method
/* # virtual methods */
public java.lang.String method ( ) {
/* .locals 1 */
/* .prologue */
/* .line 152 */
final String v0 = "GET"; // const-string v0, "GET"
} // .end method
public void onFailure ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "exceptionMessage" # Ljava/lang/String; */
/* .prologue */
/* .line 170 */
/* invoke-super {p0, p1}, Lcom/openfeint/internal/request/JSONRequest;->onFailure(Ljava/lang/String;)V */
/* .line 171 */
v0 = this.val$cb;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 172 */
	 v0 = this.val$cb;
	 (( com.openfeint.api.resource.Leaderboard$GetUserScoreCB ) v0 ).onFailure ( p1 ); // invoke-virtual {v0, p1}, Lcom/openfeint/api/resource/Leaderboard$GetUserScoreCB;->onFailure(Ljava/lang/String;)V
	 /* .line 174 */
} // :cond_0
return;
} // .end method
public void onResponse ( Integer p0, java.lang.Object p1 ) {
/* .locals 2 */
/* .param p1, "responseCode" # I */
/* .param p2, "responseBody" # Ljava/lang/Object; */
/* .prologue */
/* .line 156 */
v0 = this.val$cb;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 157 */
	 /* const/16 v0, 0xc8 */
	 /* if-gt v0, p1, :cond_1 */
	 /* const/16 v0, 0x12c */
	 /* if-ge p1, v0, :cond_1 */
	 /* .line 158 */
	 v0 = this.val$cb;
	 /* check-cast p2, Lcom/openfeint/api/resource/Score; */
} // .end local p2 # "responseBody":Ljava/lang/Object;
(( com.openfeint.api.resource.Leaderboard$GetUserScoreCB ) v0 ).onSuccess ( p2 ); // invoke-virtual {v0, p2}, Lcom/openfeint/api/resource/Leaderboard$GetUserScoreCB;->onSuccess(Lcom/openfeint/api/resource/Score;)V
/* .line 167 */
} // :cond_0
} // :goto_0
return;
/* .line 159 */
/* .restart local p2 # "responseBody":Ljava/lang/Object; */
} // :cond_1
/* const/16 v0, 0x194 */
/* if-ne v0, p1, :cond_2 */
/* .line 160 */
v0 = this.val$cb;
int v1 = 0; // const/4 v1, 0x0
(( com.openfeint.api.resource.Leaderboard$GetUserScoreCB ) v0 ).onSuccess ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/api/resource/Leaderboard$GetUserScoreCB;->onSuccess(Lcom/openfeint/api/resource/Score;)V
/* .line 161 */
} // :cond_2
/* instance-of v0, p2, Lcom/openfeint/internal/resource/ServerException; */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 162 */
/* check-cast p2, Lcom/openfeint/internal/resource/ServerException; */
} // .end local p2 # "responseBody":Ljava/lang/Object;
v0 = this.message;
(( com.openfeint.api.resource.Leaderboard$2 ) p0 ).onFailure ( v0 ); // invoke-virtual {p0, v0}, Lcom/openfeint/api/resource/Leaderboard$2;->onFailure(Ljava/lang/String;)V
/* .line 164 */
/* .restart local p2 # "responseBody":Ljava/lang/Object; */
} // :cond_3
com.openfeint.internal.OpenFeintInternal .getRString ( v0 );
(( com.openfeint.api.resource.Leaderboard$2 ) p0 ).onFailure ( v0 ); // invoke-virtual {p0, v0}, Lcom/openfeint/api/resource/Leaderboard$2;->onFailure(Ljava/lang/String;)V
} // .end method
public java.lang.String path ( ) {
/* .locals 1 */
/* .prologue */
/* .line 153 */
v0 = this.val$path;
} // .end method

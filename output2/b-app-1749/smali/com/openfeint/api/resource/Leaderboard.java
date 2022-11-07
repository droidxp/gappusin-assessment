public class com.openfeint.api.resource.Leaderboard extends com.openfeint.internal.resource.Resource {
	 /* .source "Leaderboard.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/openfeint/api/resource/Leaderboard$ListCB;, */
	 /* Lcom/openfeint/api/resource/Leaderboard$GetUserScoreCB;, */
	 /* Lcom/openfeint/api/resource/Leaderboard$GetScoresCB; */
	 /* } */
} // .end annotation
/* # instance fields */
public Boolean allowsWorseScores;
public Boolean descendingSortOrder;
public java.util.List highScores;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/openfeint/api/resource/Score;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public com.openfeint.api.resource.Score localUserScore;
public java.lang.String name;
/* # direct methods */
public com.openfeint.api.resource.Leaderboard ( ) {
/* .locals 1 */
/* .prologue */
/* .line 270 */
/* invoke-direct {p0}, Lcom/openfeint/internal/resource/Resource;-><init>()V */
/* .line 52 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/openfeint/api/resource/Leaderboard;->descendingSortOrder:Z */
/* .line 270 */
return;
} // .end method
public com.openfeint.api.resource.Leaderboard ( ) {
/* .locals 1 */
/* .param p1, "resourceID" # Ljava/lang/String; */
/* .prologue */
/* .line 37 */
/* invoke-direct {p0}, Lcom/openfeint/internal/resource/Resource;-><init>()V */
/* .line 52 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/openfeint/api/resource/Leaderboard;->descendingSortOrder:Z */
/* .line 37 */
(( com.openfeint.api.resource.Leaderboard ) p0 ).setResourceID ( p1 ); // invoke-virtual {p0, p1}, Lcom/openfeint/api/resource/Leaderboard;->setResourceID(Ljava/lang/String;)V
return;
} // .end method
public static com.openfeint.internal.resource.ResourceClass getResourceClass ( ) {
/* .locals 5 */
/* .prologue */
/* .line 276 */
/* new-instance v0, Lcom/openfeint/api/resource/Leaderboard$4; */
/* const-class v1, Lcom/openfeint/api/resource/Leaderboard; */
final String v2 = "leaderboard"; // const-string v2, "leaderboard"
/* invoke-direct {v0, v1, v2}, Lcom/openfeint/api/resource/Leaderboard$4;-><init>(Ljava/lang/Class;Ljava/lang/String;)V */
/* .line 278 */
/* .local v0, "klass":Lcom/openfeint/internal/resource/ResourceClass; */
v1 = this.mProperties;
final String v2 = "name"; // const-string v2, "name"
/* new-instance v3, Lcom/openfeint/api/resource/Leaderboard$5; */
/* invoke-direct {v3}, Lcom/openfeint/api/resource/Leaderboard$5;-><init>()V */
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 279 */
v1 = this.mProperties;
final String v2 = "current_user_high_score"; // const-string v2, "current_user_high_score"
/* new-instance v3, Lcom/openfeint/api/resource/Leaderboard$6; */
/* const-class v4, Lcom/openfeint/api/resource/Score; */
/* invoke-direct {v3, v4}, Lcom/openfeint/api/resource/Leaderboard$6;-><init>(Ljava/lang/Class;)V */
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 280 */
v1 = this.mProperties;
final String v2 = "descending_sort_order"; // const-string v2, "descending_sort_order"
/* new-instance v3, Lcom/openfeint/api/resource/Leaderboard$7; */
/* invoke-direct {v3}, Lcom/openfeint/api/resource/Leaderboard$7;-><init>()V */
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 281 */
v1 = this.mProperties;
final String v2 = "allow_posting_lower_scores"; // const-string v2, "allow_posting_lower_scores"
/* new-instance v3, Lcom/openfeint/api/resource/Leaderboard$8; */
/* invoke-direct {v3}, Lcom/openfeint/api/resource/Leaderboard$8;-><init>()V */
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 282 */
v1 = this.mProperties;
final String v2 = "high_scores"; // const-string v2, "high_scores"
/* new-instance v3, Lcom/openfeint/api/resource/Leaderboard$9; */
/* const-class v4, Lcom/openfeint/api/resource/Score; */
/* invoke-direct {v3, v4}, Lcom/openfeint/api/resource/Leaderboard$9;-><init>(Ljava/lang/Class;)V */
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 284 */
} // .end method
private void getScores ( Boolean p0, com.openfeint.api.resource.Leaderboard$GetScoresCB p1 ) {
/* .locals 6 */
/* .param p1, "friends" # Z */
/* .param p2, "cb" # Lcom/openfeint/api/resource/Leaderboard$GetScoresCB; */
/* .prologue */
/* .line 94 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "/xp/games/"; // const-string v3, "/xp/games/"
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v3 ).getAppID ( ); // invoke-virtual {v3}, Lcom/openfeint/internal/OpenFeintInternal;->getAppID()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "/leaderboards/"; // const-string v3, "/leaderboards/"
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.openfeint.api.resource.Leaderboard ) p0 ).resourceID ( ); // invoke-virtual {p0}, Lcom/openfeint/api/resource/Leaderboard;->resourceID()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "/high_scores"; // const-string v3, "/high_scores"
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 95 */
/* .local v4, "path":Ljava/lang/String; */
/* new-instance v2, Lcom/openfeint/internal/request/OrderedArgList; */
/* invoke-direct {v2}, Lcom/openfeint/internal/request/OrderedArgList;-><init>()V */
/* .line 96 */
/* .local v2, "args":Lcom/openfeint/internal/request/OrderedArgList; */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 97 */
final String v1 = "friends_leaderboard"; // const-string v1, "friends_leaderboard"
final String v3 = "true"; // const-string v3, "true"
(( com.openfeint.internal.request.OrderedArgList ) v2 ).put ( v1, v3 ); // invoke-virtual {v2, v1, v3}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 99 */
} // :cond_0
/* new-instance v0, Lcom/openfeint/api/resource/Leaderboard$1; */
/* move-object v1, p0 */
/* move v3, p1 */
/* move-object v5, p2 */
/* invoke-direct/range {v0 ..v5}, Lcom/openfeint/api/resource/Leaderboard$1;-><init>(Lcom/openfeint/api/resource/Leaderboard;Lcom/openfeint/internal/request/OrderedArgList;ZLjava/lang/String;Lcom/openfeint/api/resource/Leaderboard$GetScoresCB;)V */
/* .line 120 */
/* .local v0, "req":Lcom/openfeint/internal/request/JSONRequest; */
(( com.openfeint.internal.request.JSONRequest ) v0 ).launch ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/request/JSONRequest;->launch()V
/* .line 121 */
return;
} // .end method
public static void list ( com.openfeint.api.resource.Leaderboard$ListCB p0 ) {
/* .locals 4 */
/* .param p0, "cb" # Lcom/openfeint/api/resource/Leaderboard$ListCB; */
/* .prologue */
/* .line 200 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "/xp/games/"; // const-string v3, "/xp/games/"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v3 ).getAppID ( ); // invoke-virtual {v3}, Lcom/openfeint/internal/OpenFeintInternal;->getAppID()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "/leaderboards"; // const-string v3, "/leaderboards"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 201 */
/* .local v0, "path":Ljava/lang/String; */
/* new-instance v1, Lcom/openfeint/api/resource/Leaderboard$3; */
/* invoke-direct {v1, v0, p0}, Lcom/openfeint/api/resource/Leaderboard$3;-><init>(Ljava/lang/String;Lcom/openfeint/api/resource/Leaderboard$ListCB;)V */
/* .line 224 */
/* .local v1, "req":Lcom/openfeint/internal/request/JSONRequest; */
(( com.openfeint.internal.request.JSONRequest ) v1 ).launch ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/request/JSONRequest;->launch()V
/* .line 225 */
return;
} // .end method
/* # virtual methods */
public void getFriendScores ( com.openfeint.api.resource.Leaderboard$GetScoresCB p0 ) {
/* .locals 1 */
/* .param p1, "cb" # Lcom/openfeint/api/resource/Leaderboard$GetScoresCB; */
/* .prologue */
/* .line 90 */
int v0 = 1; // const/4 v0, 0x1
/* invoke-direct {p0, v0, p1}, Lcom/openfeint/api/resource/Leaderboard;->getScores(ZLcom/openfeint/api/resource/Leaderboard$GetScoresCB;)V */
/* .line 91 */
return;
} // .end method
public void getScores ( com.openfeint.api.resource.Leaderboard$GetScoresCB p0 ) {
/* .locals 1 */
/* .param p1, "cb" # Lcom/openfeint/api/resource/Leaderboard$GetScoresCB; */
/* .prologue */
/* .line 83 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, v0, p1}, Lcom/openfeint/api/resource/Leaderboard;->getScores(ZLcom/openfeint/api/resource/Leaderboard$GetScoresCB;)V */
/* .line 84 */
return;
} // .end method
public void getUserScore ( com.openfeint.api.resource.User p0, com.openfeint.api.resource.Leaderboard$GetUserScoreCB p1 ) {
/* .locals 5 */
/* .param p1, "forUser" # Lcom/openfeint/api/resource/User; */
/* .param p2, "cb" # Lcom/openfeint/api/resource/Leaderboard$GetUserScoreCB; */
/* .prologue */
/* .line 148 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "/xp/users/"; // const-string v4, "/xp/users/"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.openfeint.api.resource.User ) p1 ).resourceID ( ); // invoke-virtual {p1}, Lcom/openfeint/api/resource/User;->resourceID()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "/games/"; // const-string v4, "/games/"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v4 ).getAppID ( ); // invoke-virtual {v4}, Lcom/openfeint/internal/OpenFeintInternal;->getAppID()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "/leaderboards/"; // const-string v4, "/leaderboards/"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.openfeint.api.resource.Leaderboard ) p0 ).resourceID ( ); // invoke-virtual {p0}, Lcom/openfeint/api/resource/Leaderboard;->resourceID()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "/current_score"; // const-string v4, "/current_score"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 149 */
/* .local v1, "path":Ljava/lang/String; */
/* new-instance v0, Lcom/openfeint/internal/request/OrderedArgList; */
/* invoke-direct {v0}, Lcom/openfeint/internal/request/OrderedArgList;-><init>()V */
/* .line 151 */
/* .local v0, "args":Lcom/openfeint/internal/request/OrderedArgList; */
/* new-instance v2, Lcom/openfeint/api/resource/Leaderboard$2; */
/* invoke-direct {v2, p0, v0, v1, p2}, Lcom/openfeint/api/resource/Leaderboard$2;-><init>(Lcom/openfeint/api/resource/Leaderboard;Lcom/openfeint/internal/request/OrderedArgList;Ljava/lang/String;Lcom/openfeint/api/resource/Leaderboard$GetUserScoreCB;)V */
/* .line 177 */
/* .local v2, "req":Lcom/openfeint/internal/request/JSONRequest; */
(( com.openfeint.internal.request.JSONRequest ) v2 ).launch ( ); // invoke-virtual {v2}, Lcom/openfeint/internal/request/JSONRequest;->launch()V
/* .line 178 */
return;
} // .end method

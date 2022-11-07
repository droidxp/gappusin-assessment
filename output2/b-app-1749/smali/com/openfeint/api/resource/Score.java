public class com.openfeint.api.resource.Score extends com.openfeint.internal.resource.Resource {
	 /* .source "Score.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/openfeint/api/resource/Score$BlobDownloadedDelegate;, */
	 /* Lcom/openfeint/api/resource/Score$DownloadBlobCB;, */
	 /* Lcom/openfeint/api/resource/Score$SubmitToCB; */
	 /* } */
} // .end annotation
/* # instance fields */
public blob;
private com.openfeint.internal.resource.BlobUploadParameters blobUploadParameters;
private java.lang.String blobUrl;
public java.lang.String customData;
public java.lang.String displayText;
public Double latitude;
public Integer leaderboardId;
public Double longitude;
public Integer rank;
public Long score;
public com.openfeint.api.resource.User user;
/* # direct methods */
public com.openfeint.api.resource.Score ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 319 */
	 /* invoke-direct {p0}, Lcom/openfeint/internal/resource/Resource;-><init>()V */
	 return;
} // .end method
public com.openfeint.api.resource.Score ( ) {
	 /* .locals 0 */
	 /* .param p1, "score" # J */
	 /* .prologue */
	 /* .line 43 */
	 /* invoke-direct {p0}, Lcom/openfeint/internal/resource/Resource;-><init>()V */
	 /* iput-wide p1, p0, Lcom/openfeint/api/resource/Score;->score:J */
	 return;
} // .end method
public com.openfeint.api.resource.Score ( ) {
	 /* .locals 0 */
	 /* .param p1, "score" # J */
	 /* .param p3, "displayText" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 52 */
	 /* invoke-direct {p0}, Lcom/openfeint/internal/resource/Resource;-><init>()V */
	 /* iput-wide p1, p0, Lcom/openfeint/api/resource/Score;->score:J */
	 this.displayText = p3;
	 return;
} // .end method
static com.openfeint.internal.resource.BlobUploadParameters access$000 ( com.openfeint.api.resource.Score p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Lcom/openfeint/api/resource/Score; */
	 /* .prologue */
	 /* .line 36 */
	 v0 = this.blobUploadParameters;
} // .end method
static com.openfeint.internal.resource.BlobUploadParameters access$002 ( com.openfeint.api.resource.Score p0, com.openfeint.internal.resource.BlobUploadParameters p1 ) { //synthethic
	 /* .locals 0 */
	 /* .param p0, "x0" # Lcom/openfeint/api/resource/Score; */
	 /* .param p1, "x1" # Lcom/openfeint/internal/resource/BlobUploadParameters; */
	 /* .prologue */
	 /* .line 36 */
	 this.blobUploadParameters = p1;
} // .end method
static java.lang.String access$100 ( com.openfeint.api.resource.Score p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Lcom/openfeint/api/resource/Score; */
	 /* .prologue */
	 /* .line 36 */
	 v0 = this.blobUrl;
} // .end method
static java.lang.String access$102 ( com.openfeint.api.resource.Score p0, java.lang.String p1 ) { //synthethic
	 /* .locals 0 */
	 /* .param p0, "x0" # Lcom/openfeint/api/resource/Score; */
	 /* .param p1, "x1" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 36 */
	 this.blobUrl = p1;
} // .end method
public static com.openfeint.internal.resource.ResourceClass getResourceClass ( ) {
	 /* .locals 5 */
	 /* .prologue */
	 /* .line 325 */
	 /* new-instance v0, Lcom/openfeint/api/resource/Score$3; */
	 /* const-class v1, Lcom/openfeint/api/resource/Score; */
	 final String v2 = "high_score"; // const-string v2, "high_score"
	 /* invoke-direct {v0, v1, v2}, Lcom/openfeint/api/resource/Score$3;-><init>(Ljava/lang/Class;Ljava/lang/String;)V */
	 /* .line 327 */
	 /* .local v0, "klass":Lcom/openfeint/internal/resource/ResourceClass; */
	 v1 = this.mProperties;
	 final String v2 = "score"; // const-string v2, "score"
	 /* new-instance v3, Lcom/openfeint/api/resource/Score$4; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/Score$4;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 328 */
	 v1 = this.mProperties;
	 final String v2 = "rank"; // const-string v2, "rank"
	 /* new-instance v3, Lcom/openfeint/api/resource/Score$5; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/Score$5;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 329 */
	 v1 = this.mProperties;
	 final String v2 = "leaderboard_id"; // const-string v2, "leaderboard_id"
	 /* new-instance v3, Lcom/openfeint/api/resource/Score$6; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/Score$6;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 330 */
	 v1 = this.mProperties;
	 final String v2 = "display_text"; // const-string v2, "display_text"
	 /* new-instance v3, Lcom/openfeint/api/resource/Score$7; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/Score$7;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 331 */
	 v1 = this.mProperties;
	 final String v2 = "custom_data"; // const-string v2, "custom_data"
	 /* new-instance v3, Lcom/openfeint/api/resource/Score$8; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/Score$8;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 332 */
	 v1 = this.mProperties;
	 final String v2 = "lat"; // const-string v2, "lat"
	 /* new-instance v3, Lcom/openfeint/api/resource/Score$9; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/Score$9;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 333 */
	 v1 = this.mProperties;
	 final String v2 = "lng"; // const-string v2, "lng"
	 /* new-instance v3, Lcom/openfeint/api/resource/Score$10; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/Score$10;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 334 */
	 v1 = this.mProperties;
	 final String v2 = "user"; // const-string v2, "user"
	 /* new-instance v3, Lcom/openfeint/api/resource/Score$11; */
	 /* const-class v4, Lcom/openfeint/api/resource/User; */
	 /* invoke-direct {v3, v4}, Lcom/openfeint/api/resource/Score$11;-><init>(Ljava/lang/Class;)V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 335 */
	 v1 = this.mProperties;
	 final String v2 = "blob_url"; // const-string v2, "blob_url"
	 /* new-instance v3, Lcom/openfeint/api/resource/Score$12; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/Score$12;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 336 */
	 v1 = this.mProperties;
	 final String v2 = "blob_upload_parameters"; // const-string v2, "blob_upload_parameters"
	 /* new-instance v3, Lcom/openfeint/api/resource/Score$13; */
	 /* const-class v4, Lcom/openfeint/internal/resource/BlobUploadParameters; */
	 /* invoke-direct {v3, v4}, Lcom/openfeint/api/resource/Score$13;-><init>(Ljava/lang/Class;)V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 338 */
} // .end method
public static void setBlobDownloadedDelegate ( com.openfeint.api.resource.Score$BlobDownloadedDelegate p0 ) {
	 /* .locals 0 */
	 /* .param p0, "delegate" # Lcom/openfeint/api/resource/Score$BlobDownloadedDelegate; */
	 /* .prologue */
	 /* .line 313 */
	 /* .line 314 */
	 return;
} // .end method
private void submitToInternal ( com.openfeint.api.resource.Leaderboard p0, java.lang.String p1, com.openfeint.api.resource.Score$SubmitToCB p2, Boolean p3 ) {
	 /* .locals 9 */
	 /* .param p1, "leaderboard" # Lcom/openfeint/api/resource/Leaderboard; */
	 /* .param p2, "timestamp" # Ljava/lang/String; */
	 /* .param p3, "cb" # Lcom/openfeint/api/resource/Score$SubmitToCB; */
	 /* .param p4, "fromOffline" # Z */
	 /* .prologue */
	 int v6 = 0; // const/4 v6, 0x0
	 /* .line 169 */
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 (( com.openfeint.api.resource.Leaderboard ) p1 ).resourceID ( ); // invoke-virtual {p1}, Lcom/openfeint/api/resource/Leaderboard;->resourceID()Ljava/lang/String;
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 (( com.openfeint.api.resource.Leaderboard ) p1 ).resourceID ( ); // invoke-virtual {p1}, Lcom/openfeint/api/resource/Leaderboard;->resourceID()Ljava/lang/String;
			 v1 = 			 (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
			 /* if-nez v1, :cond_2 */
			 /* .line 170 */
		 } // :cond_0
		 if ( p3 != null) { // if-eqz p3, :cond_1
			 /* .line 171 */
			 final String v1 = "No leaderboard ID provided.Please provide a leaderboard ID from the Dev Dashboard."; // const-string v1, "No leaderboard ID provided.Please provide a leaderboard ID from the Dev Dashboard."
			 (( com.openfeint.api.resource.Score$SubmitToCB ) p3 ).onFailure ( v1 ); // invoke-virtual {p3, v1}, Lcom/openfeint/api/resource/Score$SubmitToCB;->onFailure(Ljava/lang/String;)V
			 /* .line 256 */
		 } // :cond_1
	 } // :goto_0
	 return;
	 /* .line 176 */
} // :cond_2
com.openfeint.internal.OpenFeintInternal .getInstance ( );
v1 = (( com.openfeint.internal.OpenFeintInternal ) v1 ).isUserLoggedIn ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/OpenFeintInternal;->isUserLoggedIn()Z
/* if-nez v1, :cond_3 */
/* .line 178 */
com.openfeint.internal.offline.OfflineSupport .postOfflineScore ( p0,p1 );
/* .line 179 */
if ( p3 != null) { // if-eqz p3, :cond_1
	 /* .line 180 */
	 (( com.openfeint.api.resource.Score$SubmitToCB ) p3 ).onSuccess ( v6 ); // invoke-virtual {p3, v6}, Lcom/openfeint/api/resource/Score$SubmitToCB;->onSuccess(Z)V
	 /* .line 185 */
} // :cond_3
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "/xp/games/"; // const-string v4, "/xp/games/"
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v4 ).getAppID ( ); // invoke-virtual {v4}, Lcom/openfeint/internal/OpenFeintInternal;->getAppID()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "/leaderboards/"; // const-string v4, "/leaderboards/"
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.openfeint.api.resource.Leaderboard ) p1 ).resourceID ( ); // invoke-virtual {p1}, Lcom/openfeint/api/resource/Leaderboard;->resourceID()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "/high_scores"; // const-string v4, "/high_scores"
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 187 */
/* .local v3, "path":Ljava/lang/String; */
/* new-instance v2, Lcom/openfeint/internal/request/OrderedArgList; */
/* invoke-direct {v2}, Lcom/openfeint/internal/request/OrderedArgList;-><init>()V */
/* .line 189 */
/* .local v2, "args":Lcom/openfeint/internal/request/OrderedArgList; */
final String v1 = "high_score[score]"; // const-string v1, "high_score[score]"
/* new-instance v4, Ljava/lang/Long; */
/* iget-wide v7, p0, Lcom/openfeint/api/resource/Score;->score:J */
/* invoke-direct {v4, v7, v8}, Ljava/lang/Long;-><init>(J)V */
(( java.lang.Long ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/Long;->toString()Ljava/lang/String;
(( com.openfeint.internal.request.OrderedArgList ) v2 ).put ( v1, v4 ); // invoke-virtual {v2, v1, v4}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 190 */
v1 = this.displayText;
if ( v1 != null) { // if-eqz v1, :cond_4
	 /* .line 191 */
	 final String v1 = "high_score[display_text]"; // const-string v1, "high_score[display_text]"
	 v4 = this.displayText;
	 (( com.openfeint.internal.request.OrderedArgList ) v2 ).put ( v1, v4 ); // invoke-virtual {v2, v1, v4}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
	 /* .line 193 */
} // :cond_4
v1 = this.blob;
if ( v1 != null) { // if-eqz v1, :cond_5
	 int v6 = 1; // const/4 v6, 0x1
	 /* .line 194 */
	 /* .local v6, "uploadBlob":Z */
} // :cond_5
final String v4 = "high_score[has_blob]"; // const-string v4, "high_score[has_blob]"
if ( v6 != null) { // if-eqz v6, :cond_7
	 final String v1 = "1"; // const-string v1, "1"
} // :goto_1
(( com.openfeint.internal.request.OrderedArgList ) v2 ).put ( v4, v1 ); // invoke-virtual {v2, v4, v1}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 196 */
if ( p2 != null) { // if-eqz p2, :cond_6
	 /* .line 197 */
	 final String v1 = "high_score[timestamp]"; // const-string v1, "high_score[timestamp]"
	 (( com.openfeint.internal.request.OrderedArgList ) v2 ).put ( v1, p2 ); // invoke-virtual {v2, v1, p2}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
	 /* .line 200 */
} // :cond_6
/* new-instance v0, Lcom/openfeint/api/resource/Score$1; */
/* move-object v1, p0 */
/* move v4, p4 */
/* move-object v5, p3 */
/* move-object v7, p1 */
/* invoke-direct/range {v0 ..v7}, Lcom/openfeint/api/resource/Score$1;-><init>(Lcom/openfeint/api/resource/Score;Lcom/openfeint/internal/request/OrderedArgList;Ljava/lang/String;ZLcom/openfeint/api/resource/Score$SubmitToCB;ZLcom/openfeint/api/resource/Leaderboard;)V */
/* .line 255 */
/* .local v0, "req":Lcom/openfeint/internal/request/JSONRequest; */
(( com.openfeint.internal.request.JSONRequest ) v0 ).launch ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/request/JSONRequest;->launch()V
/* goto/16 :goto_0 */
/* .line 194 */
} // .end local v0 # "req":Lcom/openfeint/internal/request/JSONRequest;
} // :cond_7
final String v1 = "0"; // const-string v1, "0"
} // .end method
/* # virtual methods */
public void downloadBlob ( com.openfeint.api.resource.Score$DownloadBlobCB p0 ) {
/* .locals 2 */
/* .param p1, "cb" # Lcom/openfeint/api/resource/Score$DownloadBlobCB; */
/* .prologue */
/* .line 271 */
v1 = (( com.openfeint.api.resource.Score ) p0 ).hasBlob ( ); // invoke-virtual {p0}, Lcom/openfeint/api/resource/Score;->hasBlob()Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 272 */
/* new-instance v0, Lcom/openfeint/api/resource/Score$2; */
/* invoke-direct {v0, p0, p1}, Lcom/openfeint/api/resource/Score$2;-><init>(Lcom/openfeint/api/resource/Score;Lcom/openfeint/api/resource/Score$DownloadBlobCB;)V */
/* .line 285 */
/* .local v0, "req":Lcom/openfeint/internal/request/DownloadRequest; */
(( com.openfeint.internal.request.DownloadRequest ) v0 ).launch ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/request/DownloadRequest;->launch()V
/* .line 289 */
} // .end local v0 # "req":Lcom/openfeint/internal/request/DownloadRequest;
} // :cond_0
} // :goto_0
return;
/* .line 286 */
} // :cond_1
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 287 */
com.openfeint.internal.OpenFeintInternal .getRString ( v1 );
(( com.openfeint.api.resource.Score$DownloadBlobCB ) p1 ).onFailure ( v1 ); // invoke-virtual {p1, v1}, Lcom/openfeint/api/resource/Score$DownloadBlobCB;->onFailure(Ljava/lang/String;)V
} // .end method
public Boolean hasBlob ( ) {
/* .locals 1 */
/* .prologue */
/* .line 122 */
v0 = this.blobUrl;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void submitTo ( com.openfeint.api.resource.Leaderboard p0, com.openfeint.api.resource.Score$SubmitToCB p1 ) {
/* .locals 2 */
/* .param p1, "leaderboard" # Lcom/openfeint/api/resource/Leaderboard; */
/* .param p2, "cb" # Lcom/openfeint/api/resource/Score$SubmitToCB; */
/* .prologue */
/* .line 158 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {p0, p1, v0, p2, v1}, Lcom/openfeint/api/resource/Score;->submitToInternal(Lcom/openfeint/api/resource/Leaderboard;Ljava/lang/String;Lcom/openfeint/api/resource/Score$SubmitToCB;Z)V */
/* .line 159 */
return;
} // .end method
public void submitToFromOffline ( com.openfeint.api.resource.Leaderboard p0, java.lang.String p1, com.openfeint.api.resource.Score$SubmitToCB p2 ) {
/* .locals 1 */
/* .param p1, "leaderboard" # Lcom/openfeint/api/resource/Leaderboard; */
/* .param p2, "timestamp" # Ljava/lang/String; */
/* .param p3, "cb" # Lcom/openfeint/api/resource/Score$SubmitToCB; */
/* .prologue */
/* .line 164 */
int v0 = 1; // const/4 v0, 0x1
/* invoke-direct {p0, p1, p2, p3, v0}, Lcom/openfeint/api/resource/Score;->submitToInternal(Lcom/openfeint/api/resource/Leaderboard;Ljava/lang/String;Lcom/openfeint/api/resource/Score$SubmitToCB;Z)V */
/* .line 165 */
return;
} // .end method

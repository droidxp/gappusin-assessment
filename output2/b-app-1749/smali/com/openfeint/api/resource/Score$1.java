class com.openfeint.api.resource.Score$1 extends com.openfeint.internal.request.JSONRequest {
	 /* .source "Score.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/api/resource/Score;->submitToInternal(Lcom/openfeint/api/resource/Leaderboard;Ljava/lang/String;Lcom/openfeint/api/resource/Score$SubmitToCB;Z)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.api.resource.Score this$0; //synthetic
final com.openfeint.api.resource.Score$SubmitToCB val$cb; //synthetic
final Boolean val$fromOffline; //synthetic
final com.openfeint.api.resource.Leaderboard val$leaderboard; //synthetic
final java.lang.String val$path; //synthetic
final Boolean val$uploadBlob; //synthetic
/* # direct methods */
 com.openfeint.api.resource.Score$1 ( ) {
/* .locals 0 */
/* .param p2, "x0" # Lcom/openfeint/internal/request/OrderedArgList; */
/* .prologue */
/* .line 200 */
this.this$0 = p1;
this.val$path = p3;
/* iput-boolean p4, p0, Lcom/openfeint/api/resource/Score$1;->val$fromOffline:Z */
this.val$cb = p5;
/* iput-boolean p6, p0, Lcom/openfeint/api/resource/Score$1;->val$uploadBlob:Z */
this.val$leaderboard = p7;
/* invoke-direct {p0, p2}, Lcom/openfeint/internal/request/JSONRequest;-><init>(Lcom/openfeint/internal/request/OrderedArgList;)V */
return;
} // .end method
private final void perhapsUploadBlob ( Boolean p0, java.lang.Object p1 ) {
/* .locals 8 */
/* .param p1, "uploadBlob" # Z */
/* .param p2, "responseBody" # Ljava/lang/Object; */
/* .prologue */
int v7 = 0; // const/4 v7, 0x0
/* .line 227 */
if ( p1 != null) { // if-eqz p1, :cond_1
	 /* instance-of v3, p2, Ljava/util/List; */
	 if ( v3 != null) { // if-eqz v3, :cond_1
		 /* move-object v2, p2 */
		 /* .line 228 */
		 /* check-cast v2, Ljava/util/List; */
		 /* .line 229 */
		 /* .local v2, "scores":Ljava/util/List;, "Ljava/util/List<Lcom/openfeint/api/resource/Score;>;" */
		 /* check-cast v1, Lcom/openfeint/api/resource/Score; */
		 /* .line 231 */
		 /* .local v1, "s":Lcom/openfeint/api/resource/Score; */
		 /* new-instance v0, Lcom/openfeint/internal/request/CompressedBlobPostRequest; */
		 com.openfeint.api.resource.Score .access$000 ( v1 );
		 final String v4 = "blob.%s.bin"; // const-string v4, "blob.%s.bin"
		 int v5 = 1; // const/4 v5, 0x1
		 /* new-array v5, v5, [Ljava/lang/Object; */
		 (( com.openfeint.api.resource.Score ) v1 ).resourceID ( ); // invoke-virtual {v1}, Lcom/openfeint/api/resource/Score;->resourceID()Ljava/lang/String;
		 /* aput-object v6, v5, v7 */
		 java.lang.String .format ( v4,v5 );
		 v5 = this.this$0;
		 v5 = this.blob;
		 /* invoke-direct {v0, v3, v4, v5}, Lcom/openfeint/internal/request/CompressedBlobPostRequest;-><init>(Lcom/openfeint/internal/resource/BlobUploadParameters;Ljava/lang/String;[B)V */
		 /* .line 232 */
		 /* .local v0, "postRequest":Lcom/openfeint/internal/request/BlobPostRequest; */
		 v3 = this.val$cb;
		 if ( v3 != null) { // if-eqz v3, :cond_0
			 /* .line 233 */
			 /* new-instance v3, Lcom/openfeint/api/resource/Score$1$1; */
			 /* invoke-direct {v3, p0}, Lcom/openfeint/api/resource/Score$1$1;-><init>(Lcom/openfeint/api/resource/Score$1;)V */
			 (( com.openfeint.internal.request.BlobPostRequest ) v0 ).setDelegate ( v3 ); // invoke-virtual {v0, v3}, Lcom/openfeint/internal/request/BlobPostRequest;->setDelegate(Lcom/openfeint/internal/request/IRawRequestDelegate;)V
			 /* .line 243 */
		 } // :cond_0
		 (( com.openfeint.internal.request.BlobPostRequest ) v0 ).launch ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/request/BlobPostRequest;->launch()V
		 /* .line 245 */
	 } // .end local v0 # "postRequest":Lcom/openfeint/internal/request/BlobPostRequest;
} // .end local v1 # "s":Lcom/openfeint/api/resource/Score;
} // .end local v2 # "scores":Ljava/util/List;, "Ljava/util/List<Lcom/openfeint/api/resource/Score;>;"
} // :cond_1
return;
} // .end method
/* # virtual methods */
public java.lang.String method ( ) {
/* .locals 1 */
/* .prologue */
/* .line 201 */
final String v0 = "POST"; // const-string v0, "POST"
} // .end method
public void onFailure ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "exceptionMessage" # Ljava/lang/String; */
/* .prologue */
/* .line 248 */
/* invoke-super {p0, p1}, Lcom/openfeint/internal/request/JSONRequest;->onFailure(Ljava/lang/String;)V */
/* .line 249 */
v0 = this.val$cb;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 250 */
v0 = this.val$cb;
(( com.openfeint.api.resource.Score$SubmitToCB ) v0 ).onFailure ( p1 ); // invoke-virtual {v0, p1}, Lcom/openfeint/api/resource/Score$SubmitToCB;->onFailure(Ljava/lang/String;)V
/* .line 252 */
} // :cond_0
return;
} // .end method
protected void onResponse ( Integer p0, java.lang.Object p1 ) {
/* .locals 5 */
/* .param p1, "responseCode" # I */
/* .param p2, "responseBody" # Ljava/lang/Object; */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 205 */
/* const/16 v1, 0xc9 */
/* if-ne v1, p1, :cond_3 */
/* .line 206 */
/* iget-boolean v1, p0, Lcom/openfeint/api/resource/Score$1;->val$fromOffline:Z */
/* if-nez v1, :cond_0 */
/* .line 207 */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v1 ).getContext ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
(( android.content.Context ) v1 ).getResources ( ); // invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 208 */
/* .local v0, "r":Landroid/content/res/Resources; */
(( android.content.res.Resources ) v0 ).getString ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
final String v2 = "@drawable/of_icon_highscore_notification"; // const-string v2, "@drawable/of_icon_highscore_notification"
v3 = com.openfeint.api.Notification$Category.HighScore;
v4 = com.openfeint.api.Notification$Type.Success;
com.openfeint.internal.notifications.SimpleNotification .show ( v1,v2,v3,v4 );
/* .line 210 */
} // .end local v0 # "r":Landroid/content/res/Resources;
} // :cond_0
v1 = this.val$cb;
if ( v1 != null) { // if-eqz v1, :cond_1
v1 = this.val$cb;
int v2 = 1; // const/4 v2, 0x1
(( com.openfeint.api.resource.Score$SubmitToCB ) v1 ).onSuccess ( v2 ); // invoke-virtual {v1, v2}, Lcom/openfeint/api/resource/Score$SubmitToCB;->onSuccess(Z)V
/* .line 211 */
} // :cond_1
/* iget-boolean v1, p0, Lcom/openfeint/api/resource/Score$1;->val$uploadBlob:Z */
/* invoke-direct {p0, v1, p2}, Lcom/openfeint/api/resource/Score$1;->perhapsUploadBlob(ZLjava/lang/Object;)V */
/* .line 222 */
} // :cond_2
} // :goto_0
return;
/* .line 212 */
} // :cond_3
/* const/16 v1, 0xc8 */
/* if-gt v1, p1, :cond_4 */
/* const/16 v1, 0x12c */
/* if-ge p1, v1, :cond_4 */
/* .line 213 */
v1 = this.val$cb;
if ( v1 != null) { // if-eqz v1, :cond_2
v1 = this.val$cb;
(( com.openfeint.api.resource.Score$SubmitToCB ) v1 ).onSuccess ( v3 ); // invoke-virtual {v1, v3}, Lcom/openfeint/api/resource/Score$SubmitToCB;->onSuccess(Z)V
/* .line 214 */
} // :cond_4
if ( p1 != null) { // if-eqz p1, :cond_5
/* const/16 v1, 0x1f4 */
/* if-gt v1, p1, :cond_6 */
} // :cond_5
/* iget-boolean v1, p0, Lcom/openfeint/api/resource/Score$1;->val$fromOffline:Z */
/* if-nez v1, :cond_6 */
/* .line 216 */
v1 = this.this$0;
v2 = this.val$leaderboard;
com.openfeint.internal.offline.OfflineSupport .postOfflineScore ( v1,v2 );
/* .line 217 */
v1 = this.val$cb;
if ( v1 != null) { // if-eqz v1, :cond_2
v1 = this.val$cb;
(( com.openfeint.api.resource.Score$SubmitToCB ) v1 ).onSuccess ( v3 ); // invoke-virtual {v1, v3}, Lcom/openfeint/api/resource/Score$SubmitToCB;->onSuccess(Z)V
/* .line 220 */
} // :cond_6
(( com.openfeint.api.resource.Score$1 ) p0 ).onFailure ( p2 ); // invoke-virtual {p0, p2}, Lcom/openfeint/api/resource/Score$1;->onFailure(Ljava/lang/Object;)V
} // .end method
public java.lang.String path ( ) {
/* .locals 1 */
/* .prologue */
/* .line 202 */
v0 = this.val$path;
} // .end method

class com.openfeint.api.resource.Achievement$4 extends com.openfeint.internal.request.JSONRequest {
	 /* .source "Achievement.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/api/resource/Achievement;->updateProgression(FLcom/openfeint/api/resource/Achievement$UpdateProgressionCB;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.api.resource.Achievement this$0; //synthetic
final com.openfeint.api.resource.Achievement$UpdateProgressionCB val$cb; //synthetic
final Float val$clampedPctComplete; //synthetic
final java.lang.String val$path; //synthetic
final java.lang.String val$resID; //synthetic
/* # direct methods */
 com.openfeint.api.resource.Achievement$4 ( ) {
/* .locals 0 */
/* .param p2, "x0" # Lcom/openfeint/internal/request/OrderedArgList; */
/* .prologue */
/* .line 275 */
this.this$0 = p1;
this.val$path = p3;
this.val$resID = p4;
this.val$cb = p5;
/* iput p6, p0, Lcom/openfeint/api/resource/Achievement$4;->val$clampedPctComplete:F */
/* invoke-direct {p0, p2}, Lcom/openfeint/internal/request/JSONRequest;-><init>(Lcom/openfeint/internal/request/OrderedArgList;)V */
return;
} // .end method
/* # virtual methods */
public java.lang.String method ( ) {
/* .locals 1 */
/* .prologue */
/* .line 276 */
final String v0 = "PUT"; // const-string v0, "PUT"
} // .end method
public void onFailure ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "exceptionMessage" # Ljava/lang/String; */
/* .prologue */
/* .line 314 */
/* invoke-super {p0, p1}, Lcom/openfeint/internal/request/JSONRequest;->onFailure(Ljava/lang/String;)V */
/* .line 315 */
v0 = this.val$cb;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 316 */
	 v0 = this.val$cb;
	 (( com.openfeint.api.resource.Achievement$UpdateProgressionCB ) v0 ).onFailure ( p1 ); // invoke-virtual {v0, p1}, Lcom/openfeint/api/resource/Achievement$UpdateProgressionCB;->onFailure(Ljava/lang/String;)V
	 /* .line 318 */
} // :cond_0
return;
} // .end method
protected void onResponse ( Integer p0, java.lang.Object p1 ) {
/* .locals 7 */
/* .param p1, "responseCode" # I */
/* .param p2, "responseBody" # Ljava/lang/Object; */
/* .prologue */
/* const/16 v6, 0xc9 */
int v3 = 1; // const/4 v3, 0x1
int v4 = 0; // const/4 v4, 0x0
/* .line 279 */
/* const/16 v5, 0xc8 */
/* if-lt p1, v5, :cond_4 */
/* const/16 v5, 0x12c */
/* if-ge p1, v5, :cond_4 */
/* move-object v0, p2 */
/* .line 280 */
/* check-cast v0, Lcom/openfeint/api/resource/Achievement; */
/* .line 282 */
/* .local v0, "achievement":Lcom/openfeint/api/resource/Achievement; */
v5 = this.this$0;
/* iget v2, v5, Lcom/openfeint/api/resource/Achievement;->percentComplete:F */
/* .line 283 */
/* .local v2, "oldPercentComplete":F */
v5 = this.this$0;
(( com.openfeint.api.resource.Achievement ) v5 ).shallowCopy ( v0 ); // invoke-virtual {v5, v0}, Lcom/openfeint/api/resource/Achievement;->shallowCopy(Lcom/openfeint/internal/resource/Resource;)V
/* .line 284 */
v5 = this.this$0;
/* iget v1, v5, Lcom/openfeint/api/resource/Achievement;->percentComplete:F */
/* .line 285 */
/* .local v1, "newPercentComplete":F */
v5 = this.val$resID;
com.openfeint.internal.offline.OfflineSupport .updateServerCompletionPercentage ( v5,v1 );
/* .line 287 */
/* if-eq v6, p1, :cond_0 */
/* cmpl-float v5, v1, v2 */
/* if-lez v5, :cond_1 */
/* .line 288 */
} // :cond_0
com.openfeint.internal.notifications.AchievementNotification .showStatus ( v0 );
/* .line 291 */
} // :cond_1
v5 = this.val$cb;
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 292 */
v5 = this.val$cb;
/* if-ne v6, p1, :cond_3 */
} // :goto_0
(( com.openfeint.api.resource.Achievement$UpdateProgressionCB ) v5 ).onSuccess ( v3 ); // invoke-virtual {v5, v3}, Lcom/openfeint/api/resource/Achievement$UpdateProgressionCB;->onSuccess(Z)V
/* .line 311 */
} // .end local v0 # "achievement":Lcom/openfeint/api/resource/Achievement;
} // .end local v1 # "newPercentComplete":F
} // .end local v2 # "oldPercentComplete":F
} // :cond_2
} // :goto_1
return;
/* .restart local v0 # "achievement":Lcom/openfeint/api/resource/Achievement; */
/* .restart local v1 # "newPercentComplete":F */
/* .restart local v2 # "oldPercentComplete":F */
} // :cond_3
/* move v3, v4 */
/* .line 292 */
/* .line 294 */
} // .end local v0 # "achievement":Lcom/openfeint/api/resource/Achievement;
} // .end local v1 # "newPercentComplete":F
} // .end local v2 # "oldPercentComplete":F
} // :cond_4
/* const/16 v5, 0x190 */
/* if-gt v5, p1, :cond_5 */
/* const/16 v5, 0x1f4 */
/* if-ge p1, v5, :cond_5 */
/* .line 297 */
(( com.openfeint.api.resource.Achievement$4 ) p0 ).onFailure ( p2 ); // invoke-virtual {p0, p2}, Lcom/openfeint/api/resource/Achievement$4;->onFailure(Ljava/lang/Object;)V
/* .line 301 */
} // :cond_5
/* const/high16 v5, 0x42c80000 # 100.0f */
/* iget v6, p0, Lcom/openfeint/api/resource/Achievement$4;->val$clampedPctComplete:F */
/* cmpl-float v5, v5, v6 */
/* if-nez v5, :cond_6 */
/* .line 303 */
v5 = this.this$0;
/* iget v6, p0, Lcom/openfeint/api/resource/Achievement$4;->val$clampedPctComplete:F */
/* iput v6, v5, Lcom/openfeint/api/resource/Achievement;->percentComplete:F */
/* .line 304 */
v5 = this.this$0;
/* iput-boolean v3, v5, Lcom/openfeint/api/resource/Achievement;->isUnlocked:Z */
/* .line 305 */
v3 = this.this$0;
com.openfeint.internal.notifications.AchievementNotification .showStatus ( v3 );
/* .line 307 */
} // :cond_6
v3 = this.val$cb;
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 308 */
v3 = this.val$cb;
(( com.openfeint.api.resource.Achievement$UpdateProgressionCB ) v3 ).onSuccess ( v4 ); // invoke-virtual {v3, v4}, Lcom/openfeint/api/resource/Achievement$UpdateProgressionCB;->onSuccess(Z)V
} // .end method
public java.lang.String path ( ) {
/* .locals 1 */
/* .prologue */
/* .line 277 */
v0 = this.val$path;
} // .end method

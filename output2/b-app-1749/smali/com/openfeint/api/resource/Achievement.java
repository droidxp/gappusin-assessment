public class com.openfeint.api.resource.Achievement extends com.openfeint.internal.resource.Resource {
	 /* .source "Achievement.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/openfeint/api/resource/Achievement$LoadCB;, */
	 /* Lcom/openfeint/api/resource/Achievement$UpdateProgressionCB;, */
	 /* Lcom/openfeint/api/resource/Achievement$UnlockCB;, */
	 /* Lcom/openfeint/api/resource/Achievement$DownloadIconCB;, */
	 /* Lcom/openfeint/api/resource/Achievement$ListCB; */
	 /* } */
} // .end annotation
/* # instance fields */
public java.lang.String description;
public java.lang.String endVersion;
public Integer gamerscore;
public java.lang.String iconUrl;
public Boolean isSecret;
public Boolean isUnlocked;
public Float percentComplete;
public Integer position;
public java.lang.String startVersion;
public java.lang.String title;
public java.util.Date unlockDate;
/* # direct methods */
public com.openfeint.api.resource.Achievement ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 377 */
	 /* invoke-direct {p0}, Lcom/openfeint/internal/resource/Resource;-><init>()V */
	 return;
} // .end method
public com.openfeint.api.resource.Achievement ( ) {
	 /* .locals 0 */
	 /* .param p1, "resourceID" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 43 */
	 /* invoke-direct {p0}, Lcom/openfeint/internal/resource/Resource;-><init>()V */
	 (( com.openfeint.api.resource.Achievement ) p0 ).setResourceID ( p1 ); // invoke-virtual {p0, p1}, Lcom/openfeint/api/resource/Achievement;->setResourceID(Ljava/lang/String;)V
	 return;
} // .end method
public static com.openfeint.internal.resource.ResourceClass getResourceClass ( ) {
	 /* .locals 4 */
	 /* .prologue */
	 /* .line 383 */
	 /* new-instance v0, Lcom/openfeint/api/resource/Achievement$6; */
	 /* const-class v1, Lcom/openfeint/api/resource/Achievement; */
	 final String v2 = "achievement"; // const-string v2, "achievement"
	 /* invoke-direct {v0, v1, v2}, Lcom/openfeint/api/resource/Achievement$6;-><init>(Ljava/lang/Class;Ljava/lang/String;)V */
	 /* .line 385 */
	 /* .local v0, "klass":Lcom/openfeint/internal/resource/ResourceClass; */
	 v1 = this.mProperties;
	 final String v2 = "title"; // const-string v2, "title"
	 /* new-instance v3, Lcom/openfeint/api/resource/Achievement$7; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/Achievement$7;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 386 */
	 v1 = this.mProperties;
	 final String v2 = "description"; // const-string v2, "description"
	 /* new-instance v3, Lcom/openfeint/api/resource/Achievement$8; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/Achievement$8;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 387 */
	 v1 = this.mProperties;
	 final String v2 = "gamerscore"; // const-string v2, "gamerscore"
	 /* new-instance v3, Lcom/openfeint/api/resource/Achievement$9; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/Achievement$9;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 388 */
	 v1 = this.mProperties;
	 final String v2 = "icon_url"; // const-string v2, "icon_url"
	 /* new-instance v3, Lcom/openfeint/api/resource/Achievement$10; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/Achievement$10;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 389 */
	 v1 = this.mProperties;
	 final String v2 = "is_secret"; // const-string v2, "is_secret"
	 /* new-instance v3, Lcom/openfeint/api/resource/Achievement$11; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/Achievement$11;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 390 */
	 v1 = this.mProperties;
	 final String v2 = "is_unlocked"; // const-string v2, "is_unlocked"
	 /* new-instance v3, Lcom/openfeint/api/resource/Achievement$12; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/Achievement$12;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 391 */
	 v1 = this.mProperties;
	 final String v2 = "percent_complete"; // const-string v2, "percent_complete"
	 /* new-instance v3, Lcom/openfeint/api/resource/Achievement$13; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/Achievement$13;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 392 */
	 v1 = this.mProperties;
	 final String v2 = "unlocked_at"; // const-string v2, "unlocked_at"
	 /* new-instance v3, Lcom/openfeint/api/resource/Achievement$14; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/Achievement$14;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 393 */
	 v1 = this.mProperties;
	 final String v2 = "position"; // const-string v2, "position"
	 /* new-instance v3, Lcom/openfeint/api/resource/Achievement$15; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/Achievement$15;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 394 */
	 v1 = this.mProperties;
	 final String v2 = "end_version"; // const-string v2, "end_version"
	 /* new-instance v3, Lcom/openfeint/api/resource/Achievement$16; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/Achievement$16;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 395 */
	 v1 = this.mProperties;
	 final String v2 = "start_version"; // const-string v2, "start_version"
	 /* new-instance v3, Lcom/openfeint/api/resource/Achievement$17; */
	 /* invoke-direct {v3}, Lcom/openfeint/api/resource/Achievement$17;-><init>()V */
	 (( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 397 */
} // .end method
public static void list ( com.openfeint.api.resource.Achievement$ListCB p0 ) {
	 /* .locals 4 */
	 /* .param p0, "cb" # Lcom/openfeint/api/resource/Achievement$ListCB; */
	 /* .prologue */
	 /* .line 111 */
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v3 = "/xp/games/"; // const-string v3, "/xp/games/"
	 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 com.openfeint.internal.OpenFeintInternal .getInstance ( );
	 (( com.openfeint.internal.OpenFeintInternal ) v3 ).getAppID ( ); // invoke-virtual {v3}, Lcom/openfeint/internal/OpenFeintInternal;->getAppID()Ljava/lang/String;
	 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v3 = "/achievements"; // const-string v3, "/achievements"
	 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 112 */
	 /* .local v0, "path":Ljava/lang/String; */
	 /* new-instance v1, Lcom/openfeint/api/resource/Achievement$1; */
	 /* invoke-direct {v1, v0, p0}, Lcom/openfeint/api/resource/Achievement$1;-><init>(Ljava/lang/String;Lcom/openfeint/api/resource/Achievement$ListCB;)V */
	 /* .line 135 */
	 /* .local v1, "req":Lcom/openfeint/internal/request/JSONRequest; */
	 (( com.openfeint.internal.request.JSONRequest ) v1 ).launch ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/request/JSONRequest;->launch()V
	 /* .line 136 */
	 return;
} // .end method
/* # virtual methods */
public void downloadIcon ( com.openfeint.api.resource.Achievement$DownloadIconCB p0 ) {
	 /* .locals 2 */
	 /* .param p1, "cb" # Lcom/openfeint/api/resource/Achievement$DownloadIconCB; */
	 /* .prologue */
	 /* .line 155 */
	 v1 = this.iconUrl;
	 /* if-nez v1, :cond_1 */
	 /* .line 156 */
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 /* .line 157 */
		 com.openfeint.internal.OpenFeintInternal .getRString ( v1 );
		 (( com.openfeint.api.resource.Achievement$DownloadIconCB ) p1 ).onFailure ( v1 ); // invoke-virtual {p1, v1}, Lcom/openfeint/api/resource/Achievement$DownloadIconCB;->onFailure(Ljava/lang/String;)V
		 /* .line 182 */
	 } // :cond_0
} // :goto_0
return;
/* .line 162 */
} // :cond_1
/* new-instance v0, Lcom/openfeint/api/resource/Achievement$2; */
/* invoke-direct {v0, p0, p1}, Lcom/openfeint/api/resource/Achievement$2;-><init>(Lcom/openfeint/api/resource/Achievement;Lcom/openfeint/api/resource/Achievement$DownloadIconCB;)V */
/* .line 181 */
/* .local v0, "req":Lcom/openfeint/internal/request/BitmapRequest; */
(( com.openfeint.internal.request.BitmapRequest ) v0 ).launch ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/request/BitmapRequest;->launch()V
} // .end method
public void load ( com.openfeint.api.resource.Achievement$LoadCB p0 ) {
/* .locals 5 */
/* .param p1, "cb" # Lcom/openfeint/api/resource/Achievement$LoadCB; */
/* .prologue */
/* .line 343 */
(( com.openfeint.api.resource.Achievement ) p0 ).resourceID ( ); // invoke-virtual {p0}, Lcom/openfeint/api/resource/Achievement;->resourceID()Ljava/lang/String;
/* .line 344 */
/* .local v2, "resID":Ljava/lang/String; */
/* if-nez v2, :cond_1 */
/* .line 345 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 346 */
com.openfeint.internal.OpenFeintInternal .getRString ( v3 );
(( com.openfeint.api.resource.Achievement$LoadCB ) p1 ).onFailure ( v3 ); // invoke-virtual {p1, v3}, Lcom/openfeint/api/resource/Achievement$LoadCB;->onFailure(Ljava/lang/String;)V
/* .line 372 */
} // :cond_0
} // :goto_0
return;
/* .line 351 */
} // :cond_1
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "/xp/games/"; // const-string v4, "/xp/games/"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v4 ).getAppID ( ); // invoke-virtual {v4}, Lcom/openfeint/internal/OpenFeintInternal;->getAppID()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "/achievements/"; // const-string v4, "/achievements/"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 353 */
/* .local v0, "path":Ljava/lang/String; */
/* new-instance v1, Lcom/openfeint/api/resource/Achievement$5; */
/* invoke-direct {v1, p0, v0, p1}, Lcom/openfeint/api/resource/Achievement$5;-><init>(Lcom/openfeint/api/resource/Achievement;Ljava/lang/String;Lcom/openfeint/api/resource/Achievement$LoadCB;)V */
/* .line 371 */
/* .local v1, "req":Lcom/openfeint/internal/request/JSONRequest; */
(( com.openfeint.internal.request.JSONRequest ) v1 ).launch ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/request/JSONRequest;->launch()V
} // .end method
public void unlock ( com.openfeint.api.resource.Achievement$UnlockCB p0 ) {
/* .locals 2 */
/* .param p1, "cb" # Lcom/openfeint/api/resource/Achievement$UnlockCB; */
/* .prologue */
/* .line 201 */
int v0 = 0; // const/4 v0, 0x0
/* .line 202 */
/* .local v0, "upCB":Lcom/openfeint/api/resource/Achievement$UpdateProgressionCB; */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 203 */
/* new-instance v0, Lcom/openfeint/api/resource/Achievement$3; */
} // .end local v0 # "upCB":Lcom/openfeint/api/resource/Achievement$UpdateProgressionCB;
/* invoke-direct {v0, p0, p1}, Lcom/openfeint/api/resource/Achievement$3;-><init>(Lcom/openfeint/api/resource/Achievement;Lcom/openfeint/api/resource/Achievement$UnlockCB;)V */
/* .line 212 */
/* .restart local v0 # "upCB":Lcom/openfeint/api/resource/Achievement$UpdateProgressionCB; */
} // :cond_0
/* const/high16 v1, 0x42c80000 # 100.0f */
(( com.openfeint.api.resource.Achievement ) p0 ).updateProgression ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lcom/openfeint/api/resource/Achievement;->updateProgression(FLcom/openfeint/api/resource/Achievement$UpdateProgressionCB;)V
/* .line 213 */
return;
} // .end method
public void updateProgression ( Float p0, com.openfeint.api.resource.Achievement$UpdateProgressionCB p1 ) {
/* .locals 8 */
/* .param p1, "pctComplete" # F */
/* .param p2, "cb" # Lcom/openfeint/api/resource/Achievement$UpdateProgressionCB; */
/* .prologue */
int v6 = 0; // const/4 v6, 0x0
int v5 = 0; // const/4 v5, 0x0
/* const/high16 v1, 0x42c80000 # 100.0f */
/* .line 237 */
/* cmpg-float v7, p1, v6 */
/* if-gez v7, :cond_1 */
/* .line 239 */
/* .local v6, "clampedPctComplete":F */
} // :goto_0
(( com.openfeint.api.resource.Achievement ) p0 ).resourceID ( ); // invoke-virtual {p0}, Lcom/openfeint/api/resource/Achievement;->resourceID()Ljava/lang/String;
/* .line 242 */
/* .local v4, "resID":Ljava/lang/String; */
/* if-nez v4, :cond_3 */
/* .line 243 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 244 */
com.openfeint.internal.OpenFeintInternal .getRString ( v1 );
(( com.openfeint.api.resource.Achievement$UpdateProgressionCB ) p2 ).onFailure ( v1 ); // invoke-virtual {p2, v1}, Lcom/openfeint/api/resource/Achievement$UpdateProgressionCB;->onFailure(Ljava/lang/String;)V
/* .line 322 */
} // :cond_0
} // :goto_1
return;
/* .line 237 */
} // .end local v4 # "resID":Ljava/lang/String;
} // .end local v6 # "clampedPctComplete":F
} // :cond_1
/* cmpl-float v7, p1, v1 */
/* if-lez v7, :cond_2 */
/* move v6, v1 */
} // :cond_2
/* move v6, p1 */
/* .line 250 */
/* .restart local v4 # "resID":Ljava/lang/String; */
/* .restart local v6 # "clampedPctComplete":F */
} // :cond_3
v7 = com.openfeint.internal.offline.OfflineSupport .getClientCompletionPercentage ( v4 );
/* cmpg-float v7, v6, v7 */
/* if-gtz v7, :cond_4 */
/* .line 251 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 252 */
(( com.openfeint.api.resource.Achievement$UpdateProgressionCB ) p2 ).onSuccess ( v5 ); // invoke-virtual {p2, v5}, Lcom/openfeint/api/resource/Achievement$UpdateProgressionCB;->onSuccess(Z)V
/* .line 258 */
} // :cond_4
com.openfeint.internal.offline.OfflineSupport .updateClientCompletionPercentage ( v4,v6 );
/* .line 260 */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v7 ).getUserID ( ); // invoke-virtual {v7}, Lcom/openfeint/internal/OpenFeintInternal;->getUserID()Ljava/lang/String;
/* if-nez v7, :cond_6 */
/* .line 262 */
v7 = com.openfeint.internal.offline.OfflineSupport .getClientCompletionPercentage ( v4 );
/* iput v7, p0, Lcom/openfeint/api/resource/Achievement;->percentComplete:F */
/* .line 263 */
/* iget v7, p0, Lcom/openfeint/api/resource/Achievement;->percentComplete:F */
/* cmpl-float v1, v7, v1 */
/* if-nez v1, :cond_5 */
int v1 = 1; // const/4 v1, 0x1
} // :goto_2
/* iput-boolean v1, p0, Lcom/openfeint/api/resource/Achievement;->isUnlocked:Z */
/* .line 264 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 265 */
(( com.openfeint.api.resource.Achievement$UpdateProgressionCB ) p2 ).onSuccess ( v5 ); // invoke-virtual {p2, v5}, Lcom/openfeint/api/resource/Achievement$UpdateProgressionCB;->onSuccess(Z)V
} // :cond_5
/* move v1, v5 */
/* .line 263 */
/* .line 270 */
} // :cond_6
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "/xp/games/"; // const-string v5, "/xp/games/"
(( java.lang.StringBuilder ) v1 ).append ( v5 ); // invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v5 ).getAppID ( ); // invoke-virtual {v5}, Lcom/openfeint/internal/OpenFeintInternal;->getAppID()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v5 ); // invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = "/achievements/"; // const-string v5, "/achievements/"
(( java.lang.StringBuilder ) v1 ).append ( v5 ); // invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = "/unlock"; // const-string v5, "/unlock"
(( java.lang.StringBuilder ) v1 ).append ( v5 ); // invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 272 */
/* .local v3, "path":Ljava/lang/String; */
/* new-instance v2, Lcom/openfeint/internal/request/OrderedArgList; */
/* invoke-direct {v2}, Lcom/openfeint/internal/request/OrderedArgList;-><init>()V */
/* .line 273 */
/* .local v2, "args":Lcom/openfeint/internal/request/OrderedArgList; */
final String v1 = "percent_complete"; // const-string v1, "percent_complete"
/* new-instance v5, Ljava/lang/Float; */
/* invoke-direct {v5, v6}, Ljava/lang/Float;-><init>(F)V */
(( java.lang.Float ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/Float;->toString()Ljava/lang/String;
(( com.openfeint.internal.request.OrderedArgList ) v2 ).put ( v1, v5 ); // invoke-virtual {v2, v1, v5}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 275 */
/* new-instance v0, Lcom/openfeint/api/resource/Achievement$4; */
/* move-object v1, p0 */
/* move-object v5, p2 */
/* invoke-direct/range {v0 ..v6}, Lcom/openfeint/api/resource/Achievement$4;-><init>(Lcom/openfeint/api/resource/Achievement;Lcom/openfeint/internal/request/OrderedArgList;Ljava/lang/String;Ljava/lang/String;Lcom/openfeint/api/resource/Achievement$UpdateProgressionCB;F)V */
/* .line 321 */
/* .local v0, "req":Lcom/openfeint/internal/request/JSONRequest; */
(( com.openfeint.internal.request.JSONRequest ) v0 ).launch ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/request/JSONRequest;->launch()V
/* goto/16 :goto_1 */
} // .end method

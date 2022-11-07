public class com.openfeint.internal.offline.OfflineSupport {
	 /* .source "OfflineSupport.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/openfeint/internal/offline/OfflineSupport$DB;, */
	 /* Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;, */
	 /* Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.String TAG;
private static final java.lang.String TEMPORARY_USER_ID;
private static com.openfeint.internal.offline.OfflineSupport$DB db;
private static java.util.concurrent.atomic.AtomicBoolean updateInProgress;
private static java.lang.String userID;
/* # direct methods */
static com.openfeint.internal.offline.OfflineSupport ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 300 */
	 /* .line 301 */
	 /* .line 302 */
	 /* new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean; */
	 int v1 = 0; // const/4 v1, 0x0
	 /* invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V */
	 return;
} // .end method
public com.openfeint.internal.offline.OfflineSupport ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 31 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 93 */
	 return;
} // .end method
static Boolean access$000 ( java.lang.String p0, java.lang.String p1 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Ljava/lang/String; */
	 /* .param p1, "x1" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 31 */
	 v0 = 	 com.openfeint.internal.offline.OfflineSupport .streq ( p0,p1 );
} // .end method
static void access$100 ( java.lang.String p0 ) { //synthethic
	 /* .locals 0 */
	 /* .param p0, "x0" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 31 */
	 com.openfeint.internal.offline.OfflineSupport .deleteDataFile ( p0 );
	 return;
} // .end method
static java.util.concurrent.atomic.AtomicBoolean access$200 ( ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 31 */
	 v0 = com.openfeint.internal.offline.OfflineSupport.updateInProgress;
} // .end method
static com.openfeint.internal.offline.OfflineSupport$DB access$300 ( ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 31 */
	 v0 = com.openfeint.internal.offline.OfflineSupport.db;
} // .end method
static void access$400 ( ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 31 */
	 com.openfeint.internal.offline.OfflineSupport .save ( );
	 return;
} // .end method
static void access$500 ( ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 31 */
	 com.openfeint.internal.offline.OfflineSupport .uploadScoresWithBlobs ( );
	 return;
} // .end method
private static void deleteDataFile ( java.lang.String p0 ) {
	 /* .locals 2 */
	 /* .param p0, "fileName" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 289 */
	 try { // :try_start_0
		 com.openfeint.internal.OpenFeintInternal .getInstance ( );
		 (( com.openfeint.internal.OpenFeintInternal ) v1 ).getContext ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
		 /* .line 290 */
		 /* .local v0, "context":Landroid/content/Context; */
		 (( android.content.Context ) v0 ).getFileStreamPath ( p0 ); // invoke-virtual {v0, p0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
		 (( java.io.File ) v1 ).getPath ( ); // invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;
		 (( android.content.Context ) v0 ).deleteFile ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 293 */
	 } // .end local v0 # "context":Landroid/content/Context;
} // :goto_0
return;
/* .line 291 */
/* :catch_0 */
/* move-exception v1 */
} // .end method
private static java.lang.String filename ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p0, "forUserID" # Ljava/lang/String; */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 305 */
/* if-nez p0, :cond_1 */
/* .line 308 */
} // :cond_0
} // :goto_0
/* .line 306 */
} // :cond_1
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v2 ).getAppID ( ); // invoke-virtual {v2}, Lcom/openfeint/internal/OpenFeintInternal;->getAppID()Ljava/lang/String;
/* .line 307 */
/* .local v0, "appID":Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 308 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "of.offline."; // const-string v2, "of.offline."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "."; // const-string v2, "."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
private static java.lang.String fullPath ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "fileName" # Ljava/lang/String; */
/* .prologue */
/* .line 296 */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v1 ).getContext ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
/* .line 297 */
/* .local v0, "context":Landroid/content/Context; */
(( android.content.Context ) v0 ).getFileStreamPath ( p0 ); // invoke-virtual {v0, p0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
(( java.io.File ) v1 ).getPath ( ); // invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;
} // .end method
public static Float getClientCompletionPercentage ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "resourceID" # Ljava/lang/String; */
/* .prologue */
/* .line 507 */
v1 = com.openfeint.internal.offline.OfflineSupport.db;
(( com.openfeint.internal.offline.OfflineSupport$DB ) v1 ).findAchievement ( p0 ); // invoke-virtual {v1, p0}, Lcom/openfeint/internal/offline/OfflineSupport$DB;->findAchievement(Ljava/lang/String;)Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;
/* .line 508 */
/* .local v0, "a":Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement; */
/* if-nez v0, :cond_0 */
int v1 = 0; // const/4 v1, 0x0
/* .line 509 */
} // :goto_0
} // :cond_0
/* iget v1, v0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->clientCompletionPercentage:F */
} // .end method
private static Boolean isUserTemporary ( ) {
/* .locals 2 */
/* .prologue */
/* .line 324 */
final String v0 = "0"; // const-string v0, "0"
v1 = com.openfeint.internal.offline.OfflineSupport.userID;
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
} // .end method
private static java.lang.String now ( ) {
/* .locals 2 */
/* .prologue */
/* .line 312 */
v0 = com.openfeint.internal.resource.DateResourceProperty.sDateParser;
/* new-instance v1, Ljava/util/Date; */
/* invoke-direct {v1}, Ljava/util/Date;-><init>()V */
(( java.text.DateFormat ) v0 ).format ( v1 ); // invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
} // .end method
public static void postOfflineScore ( com.openfeint.api.resource.Score p0, com.openfeint.api.resource.Leaderboard p1 ) {
/* .locals 12 */
/* .param p0, "s" # Lcom/openfeint/api/resource/Score; */
/* .param p1, "l" # Lcom/openfeint/api/resource/Leaderboard; */
/* .prologue */
/* .line 513 */
v7 = com.openfeint.internal.offline.OfflineSupport.userID;
/* if-nez v7, :cond_1 */
/* .line 572 */
} // :cond_0
} // :goto_0
return;
/* .line 515 */
} // :cond_1
/* new-instance v5, Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore; */
/* invoke-direct {v5}, Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;-><init>()V */
/* .line 516 */
/* .local v5, "os":Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore; */
(( com.openfeint.api.resource.Leaderboard ) p1 ).resourceID ( ); // invoke-virtual {p1}, Lcom/openfeint/api/resource/Leaderboard;->resourceID()Ljava/lang/String;
this.leaderboardID = v7;
/* .line 517 */
/* iget-wide v7, p0, Lcom/openfeint/api/resource/Score;->score:J */
/* iput-wide v7, v5, Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;->score:J */
/* .line 518 */
v7 = this.displayText;
this.displayText = v7;
/* .line 519 */
v7 = this.customData;
this.customData = v7;
/* .line 520 */
com.openfeint.internal.offline.OfflineSupport .now ( );
this.timestamp = v7;
/* .line 521 */
v7 = this.blob;
if ( v7 != null) { // if-eqz v7, :cond_7
/* .line 523 */
int v1 = 0; // const/4 v1, 0x0
/* .line 524 */
/* .local v1, "existingScore":Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore; */
v7 = com.openfeint.internal.offline.OfflineSupport.db;
v7 = this.scores;
(( java.util.ArrayList ) v7 ).iterator ( ); // invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
/* .local v3, "i$":Ljava/util/Iterator; */
v7 = } // :cond_2
if ( v7 != null) { // if-eqz v7, :cond_3
/* check-cast v6, Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore; */
/* .line 525 */
/* .local v6, "scan":Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore; */
v7 = this.leaderboardID;
v8 = this.leaderboardID;
v7 = (( java.lang.String ) v7 ).equals ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_2
/* .line 526 */
/* move-object v1, v6 */
/* .line 531 */
} // .end local v6 # "scan":Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;
} // :cond_3
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 532 */
/* iget-boolean v7, p1, Lcom/openfeint/api/resource/Leaderboard;->allowsWorseScores:Z */
/* if-nez v7, :cond_5 */
/* iget-boolean v7, p1, Lcom/openfeint/api/resource/Leaderboard;->descendingSortOrder:Z */
if ( v7 != null) { // if-eqz v7, :cond_4
/* iget-wide v7, v1, Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;->score:J */
/* iget-wide v9, p0, Lcom/openfeint/api/resource/Score;->score:J */
/* cmp-long v7, v7, v9 */
/* if-ltz v7, :cond_5 */
} // :cond_4
/* iget-boolean v7, p1, Lcom/openfeint/api/resource/Leaderboard;->descendingSortOrder:Z */
/* if-nez v7, :cond_0 */
/* iget-wide v7, v1, Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;->score:J */
/* iget-wide v9, p0, Lcom/openfeint/api/resource/Score;->score:J */
/* cmp-long v7, v7, v9 */
/* if-lez v7, :cond_0 */
/* .line 536 */
} // :cond_5
v7 = this.blobFileName;
com.openfeint.internal.offline.OfflineSupport .deleteDataFile ( v7 );
/* .line 537 */
v7 = com.openfeint.internal.offline.OfflineSupport.db;
v7 = this.scores;
(( java.util.ArrayList ) v7 ).remove ( v1 ); // invoke-virtual {v7, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
/* .line 544 */
} // :cond_6
final String v2 = "unknown.blob"; // const-string v2, "unknown.blob"
/* .line 547 */
/* .local v2, "filename":Ljava/lang/String; */
try { // :try_start_0
final String v7 = "SHA1"; // const-string v7, "SHA1"
java.security.MessageDigest .getInstance ( v7 );
/* .line 548 */
/* .local v4, "md":Ljava/security/MessageDigest; */
v7 = this.blob;
(( java.security.MessageDigest ) v4 ).update ( v7 ); // invoke-virtual {v4, v7}, Ljava/security/MessageDigest;->update([B)V
/* .line 549 */
final String v7 = "%s.blob"; // const-string v7, "%s.blob"
int v8 = 1; // const/4 v8, 0x1
/* new-array v8, v8, [Ljava/lang/Object; */
int v9 = 0; // const/4 v9, 0x0
/* new-instance v10, Ljava/lang/String; */
(( java.security.MessageDigest ) v4 ).digest ( ); // invoke-virtual {v4}, Ljava/security/MessageDigest;->digest()[B
org.apache.commons.codec.binary.Hex .encodeHex ( v11 );
/* invoke-direct {v10, v11}, Ljava/lang/String;-><init>([C)V */
/* aput-object v10, v8, v9 */
java.lang.String .format ( v7,v8 );
/* :try_end_0 */
/* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 555 */
} // .end local v4 # "md":Ljava/security/MessageDigest;
} // :goto_1
try { // :try_start_1
v7 = this.blob;
com.openfeint.internal.offline.OfflineSupport .fullPath ( v2 );
com.openfeint.internal.Util .saveFile ( v7,v8 );
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 561 */
this.blobFileName = v2;
/* .line 564 */
} // .end local v1 # "existingScore":Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;
} // .end local v2 # "filename":Ljava/lang/String;
} // .end local v3 # "i$":Ljava/util/Iterator;
} // :cond_7
v7 = com.openfeint.internal.offline.OfflineSupport.db;
v7 = this.scores;
(( java.util.ArrayList ) v7 ).add ( v5 ); // invoke-virtual {v7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 565 */
com.openfeint.internal.offline.OfflineSupport .save ( );
/* .line 568 */
v7 = com.openfeint.internal.offline.OfflineSupport .isUserTemporary ( );
/* if-nez v7, :cond_0 */
/* .line 569 */
com.openfeint.internal.OpenFeintInternal .getRString ( v7 );
final String v8 = "@drawable/of_icon_highscore_notification"; // const-string v8, "@drawable/of_icon_highscore_notification"
v9 = com.openfeint.api.Notification$Category.HighScore;
v10 = com.openfeint.api.Notification$Type.Success;
com.openfeint.internal.notifications.SimpleNotification .show ( v7,v8,v9,v10 );
/* goto/16 :goto_0 */
/* .line 556 */
/* .restart local v1 # "existingScore":Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore; */
/* .restart local v2 # "filename":Ljava/lang/String; */
/* .restart local v3 # "i$":Ljava/util/Iterator; */
/* :catch_0 */
/* move-exception v0 */
/* .line 558 */
/* .local v0, "e":Ljava/io/IOException; */
/* goto/16 :goto_0 */
/* .line 550 */
} // .end local v0 # "e":Ljava/io/IOException;
/* :catch_1 */
/* move-exception v7 */
} // .end method
static final void removeAndUploadNext ( com.openfeint.internal.offline.OfflineSupport$OfflineScore p0 ) {
/* .locals 1 */
/* .param p0, "os" # Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore; */
/* .prologue */
/* .line 359 */
v0 = com.openfeint.internal.offline.OfflineSupport.db;
v0 = this.scores;
(( java.util.ArrayList ) v0 ).remove ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
/* .line 360 */
com.openfeint.internal.offline.OfflineSupport .save ( );
/* .line 361 */
com.openfeint.internal.offline.OfflineSupport .uploadScoresWithBlobs ( );
/* .line 362 */
return;
} // .end method
private static void removeDBForUser ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "forUserID" # Ljava/lang/String; */
/* .prologue */
/* .line 329 */
com.openfeint.internal.offline.OfflineSupport .filename ( p0 );
com.openfeint.internal.offline.OfflineSupport .deleteDataFile ( v0 );
/* .line 330 */
return;
} // .end method
private static void save ( ) {
/* .locals 2 */
/* .prologue */
/* .line 575 */
v1 = com.openfeint.internal.offline.OfflineSupport.userID;
com.openfeint.internal.offline.OfflineSupport .filename ( v1 );
/* .line 576 */
/* .local v0, "fileName":Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = com.openfeint.internal.offline.OfflineSupport.db;
(( com.openfeint.internal.offline.OfflineSupport$DB ) v1 ).save ( v0 ); // invoke-virtual {v1, v0}, Lcom/openfeint/internal/offline/OfflineSupport$DB;->save(Ljava/lang/String;)V
/* .line 577 */
} // :cond_0
return;
} // .end method
public static void setUserDeclined ( ) {
/* .locals 1 */
/* .prologue */
/* .line 316 */
int v0 = 0; // const/4 v0, 0x0
com.openfeint.internal.offline.OfflineSupport .setUserID ( v0 );
/* .line 317 */
return;
} // .end method
public static void setUserID ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "newUserID" # Ljava/lang/String; */
/* .prologue */
/* .line 334 */
if ( p0 != null) { // if-eqz p0, :cond_0
v1 = com.openfeint.internal.offline.OfflineSupport.userID;
v1 = (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 349 */
} // :goto_0
return;
/* .line 336 */
} // :cond_0
com.openfeint.internal.offline.OfflineSupport .filename ( p0 );
com.openfeint.internal.offline.OfflineSupport$DB .load ( v1 );
/* .line 338 */
/* .local v0, "newUserDB":Lcom/openfeint/internal/offline/OfflineSupport$DB; */
v1 = com.openfeint.internal.offline.OfflineSupport .isUserTemporary ( );
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 340 */
v1 = com.openfeint.internal.offline.OfflineSupport.db;
(( com.openfeint.internal.offline.OfflineSupport$DB ) v1 ).merge ( v0 ); // invoke-virtual {v1, v0}, Lcom/openfeint/internal/offline/OfflineSupport$DB;->merge(Lcom/openfeint/internal/offline/OfflineSupport$DB;)V
/* .line 341 */
final String v1 = "0"; // const-string v1, "0"
com.openfeint.internal.offline.OfflineSupport .removeDBForUser ( v1 );
/* .line 346 */
} // :goto_1
/* .line 348 */
com.openfeint.internal.offline.OfflineSupport .trySubmitOfflineData ( );
/* .line 344 */
} // :cond_1
} // .end method
public static void setUserTemporary ( ) {
/* .locals 1 */
/* .prologue */
/* .line 320 */
final String v0 = "0"; // const-string v0, "0"
com.openfeint.internal.offline.OfflineSupport .setUserID ( v0 );
/* .line 321 */
return;
} // .end method
private static Boolean streq ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p0, "lhs" # Ljava/lang/String; */
/* .param p1, "rhs" # Ljava/lang/String; */
/* .prologue */
/* .line 36 */
/* if-nez p0, :cond_1 */
/* if-nez p1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
v0 = (( java.lang.String ) p0 ).equals ( p1 ); // invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
} // .end method
public static void trySubmitOfflineData ( ) {
/* .locals 2 */
/* .prologue */
/* .line 352 */
v0 = com.openfeint.internal.offline.OfflineSupport.userID;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = com.openfeint.internal.offline.OfflineSupport.userID;
final String v1 = "0"; // const-string v1, "0"
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
v0 = com.openfeint.api.OpenFeint .isUserLoggedIn ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 353 */
com.openfeint.internal.offline.OfflineSupport .updateToServer ( );
/* .line 355 */
} // :cond_0
return;
} // .end method
public static void updateClientCompletionPercentage ( java.lang.String p0, Float p1 ) {
/* .locals 2 */
/* .param p0, "resourceID" # Ljava/lang/String; */
/* .param p1, "completionPercentage" # F */
/* .prologue */
/* .line 473 */
v1 = com.openfeint.internal.offline.OfflineSupport.userID;
/* if-nez v1, :cond_1 */
/* .line 489 */
} // :cond_0
} // :goto_0
return;
/* .line 475 */
} // :cond_1
v1 = com.openfeint.internal.offline.OfflineSupport.db;
(( com.openfeint.internal.offline.OfflineSupport$DB ) v1 ).findAchievement ( p0 ); // invoke-virtual {v1, p0}, Lcom/openfeint/internal/offline/OfflineSupport$DB;->findAchievement(Ljava/lang/String;)Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;
/* .line 476 */
/* .local v0, "a":Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement; */
/* if-nez v0, :cond_2 */
/* .line 477 */
/* new-instance v0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement; */
} // .end local v0 # "a":Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;
/* invoke-direct {v0}, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;-><init>()V */
/* .line 478 */
/* .restart local v0 # "a":Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement; */
this.resourceID = p0;
/* .line 479 */
int v1 = 0; // const/4 v1, 0x0
/* iput v1, v0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->serverCompletionPercentage:F */
/* .line 480 */
/* iput p1, v0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->clientCompletionPercentage:F */
/* .line 481 */
com.openfeint.internal.offline.OfflineSupport .now ( );
this.timestamp = v1;
/* .line 482 */
v1 = com.openfeint.internal.offline.OfflineSupport.db;
v1 = this.achievements;
(( java.util.ArrayList ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 483 */
com.openfeint.internal.offline.OfflineSupport .save ( );
/* .line 484 */
} // :cond_2
/* iget v1, v0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->clientCompletionPercentage:F */
/* cmpg-float v1, v1, p1 */
/* if-gez v1, :cond_0 */
/* .line 485 */
/* iput p1, v0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->clientCompletionPercentage:F */
/* .line 486 */
com.openfeint.internal.offline.OfflineSupport .now ( );
this.timestamp = v1;
/* .line 487 */
com.openfeint.internal.offline.OfflineSupport .save ( );
} // .end method
public static void updateServerCompletionPercentage ( java.lang.String p0, Float p1 ) {
/* .locals 2 */
/* .param p0, "resourceID" # Ljava/lang/String; */
/* .param p1, "completionPercentage" # F */
/* .prologue */
/* .line 492 */
v1 = com.openfeint.internal.offline.OfflineSupport.userID;
/* if-nez v1, :cond_0 */
/* .line 504 */
} // :goto_0
return;
/* .line 494 */
} // :cond_0
v1 = com.openfeint.internal.offline.OfflineSupport.db;
(( com.openfeint.internal.offline.OfflineSupport$DB ) v1 ).findAchievement ( p0 ); // invoke-virtual {v1, p0}, Lcom/openfeint/internal/offline/OfflineSupport$DB;->findAchievement(Ljava/lang/String;)Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;
/* .line 495 */
/* .local v0, "a":Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement; */
/* if-nez v0, :cond_1 */
/* .line 496 */
/* new-instance v0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement; */
} // .end local v0 # "a":Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;
/* invoke-direct {v0}, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;-><init>()V */
/* .line 497 */
/* .restart local v0 # "a":Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement; */
this.resourceID = p0;
/* .line 498 */
/* iput p1, v0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->clientCompletionPercentage:F */
/* .line 499 */
v1 = com.openfeint.internal.offline.OfflineSupport.db;
v1 = this.achievements;
(( java.util.ArrayList ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 501 */
} // :cond_1
/* iput p1, v0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->serverCompletionPercentage:F */
/* .line 502 */
com.openfeint.internal.offline.OfflineSupport .now ( );
this.timestamp = v1;
/* .line 503 */
com.openfeint.internal.offline.OfflineSupport .save ( );
} // .end method
private static synchronized void updateToServer ( ) {
/* .locals 15 */
/* .prologue */
/* .line 403 */
/* const-class v9, Lcom/openfeint/internal/offline/OfflineSupport; */
/* monitor-enter v9 */
try { // :try_start_0
v8 = com.openfeint.internal.offline.OfflineSupport.updateInProgress;
int v10 = 0; // const/4 v10, 0x0
int v11 = 1; // const/4 v11, 0x1
(( java.util.concurrent.atomic.AtomicBoolean ) v8 ).compareAndSet ( v10, v11 ); // invoke-virtual {v8, v10, v11}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z
/* :try_end_0 */
v8 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v8, :cond_0 */
/* .line 470 */
/* .local v0, "clonedDB":Lcom/openfeint/internal/offline/OfflineSupport$DB; */
/* .local v1, "currAchievement":I */
/* .local v2, "currScore":I */
/* .local v3, "i$":Ljava/util/Iterator; */
/* .local v5, "oal":Lcom/openfeint/internal/request/OrderedArgList; */
} // :goto_0
/* monitor-exit v9 */
return;
/* .line 405 */
} // .end local v0 # "clonedDB":Lcom/openfeint/internal/offline/OfflineSupport$DB;
} // .end local v1 # "currAchievement":I
} // .end local v2 # "currScore":I
} // .end local v3 # "i$":Ljava/util/Iterator;
} // .end local v5 # "oal":Lcom/openfeint/internal/request/OrderedArgList;
} // :cond_0
try { // :try_start_1
v8 = com.openfeint.internal.offline.OfflineSupport.db;
(( com.openfeint.internal.offline.OfflineSupport$DB ) v8 ).dup ( ); // invoke-virtual {v8}, Lcom/openfeint/internal/offline/OfflineSupport$DB;->dup()Lcom/openfeint/internal/offline/OfflineSupport$DB;
/* .line 407 */
/* .restart local v0 # "clonedDB":Lcom/openfeint/internal/offline/OfflineSupport$DB; */
/* new-instance v5, Lcom/openfeint/internal/request/OrderedArgList; */
/* invoke-direct {v5}, Lcom/openfeint/internal/request/OrderedArgList;-><init>()V */
/* .line 408 */
/* .restart local v5 # "oal":Lcom/openfeint/internal/request/OrderedArgList; */
int v1 = 0; // const/4 v1, 0x0
/* .line 409 */
/* .restart local v1 # "currAchievement":I */
v8 = this.achievements;
(( java.util.ArrayList ) v8 ).iterator ( ); // invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
/* .restart local v3 # "i$":Ljava/util/Iterator; */
} // :cond_1
v8 = } // :goto_1
if ( v8 != null) { // if-eqz v8, :cond_2
/* check-cast v4, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement; */
/* .line 410 */
/* .local v4, "oa":Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement; */
/* iget v8, v4, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->clientCompletionPercentage:F */
/* iget v10, v4, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->serverCompletionPercentage:F */
/* cmpl-float v8, v8, v10 */
if ( v8 != null) { // if-eqz v8, :cond_1
/* .line 411 */
final String v8 = "OfflineSupport"; // const-string v8, "OfflineSupport"
final String v10 = "Updating achievement %s from known %f to %f completion"; // const-string v10, "Updating achievement %s from known %f to %f completion"
int v11 = 3; // const/4 v11, 0x3
/* new-array v11, v11, [Ljava/lang/Object; */
int v12 = 0; // const/4 v12, 0x0
v13 = this.resourceID;
/* aput-object v13, v11, v12 */
int v12 = 1; // const/4 v12, 0x1
/* iget v13, v4, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->serverCompletionPercentage:F */
java.lang.Float .valueOf ( v13 );
/* aput-object v13, v11, v12 */
int v12 = 2; // const/4 v12, 0x2
/* iget v13, v4, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->clientCompletionPercentage:F */
java.lang.Float .valueOf ( v13 );
/* aput-object v13, v11, v12 */
java.lang.String .format ( v10,v11 );
com.openfeint.internal.OpenFeintInternal .log ( v8,v10 );
/* .line 412 */
final String v8 = "achievements[%d][id]"; // const-string v8, "achievements[%d][id]"
int v10 = 1; // const/4 v10, 0x1
/* new-array v10, v10, [Ljava/lang/Object; */
int v11 = 0; // const/4 v11, 0x0
java.lang.Integer .valueOf ( v1 );
/* aput-object v12, v10, v11 */
java.lang.String .format ( v8,v10 );
v10 = this.resourceID;
(( com.openfeint.internal.request.OrderedArgList ) v5 ).put ( v8, v10 ); // invoke-virtual {v5, v8, v10}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 413 */
final String v8 = "achievements[%d][percent_complete]"; // const-string v8, "achievements[%d][percent_complete]"
int v10 = 1; // const/4 v10, 0x1
/* new-array v10, v10, [Ljava/lang/Object; */
int v11 = 0; // const/4 v11, 0x0
java.lang.Integer .valueOf ( v1 );
/* aput-object v12, v10, v11 */
java.lang.String .format ( v8,v10 );
/* iget v10, v4, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->clientCompletionPercentage:F */
java.lang.Float .toString ( v10 );
(( com.openfeint.internal.request.OrderedArgList ) v5 ).put ( v8, v10 ); // invoke-virtual {v5, v8, v10}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 414 */
final String v8 = "achievements[%d][timestamp]"; // const-string v8, "achievements[%d][timestamp]"
int v10 = 1; // const/4 v10, 0x1
/* new-array v10, v10, [Ljava/lang/Object; */
int v11 = 0; // const/4 v11, 0x0
java.lang.Integer .valueOf ( v1 );
/* aput-object v12, v10, v11 */
java.lang.String .format ( v8,v10 );
v10 = this.timestamp;
(( com.openfeint.internal.request.OrderedArgList ) v5 ).put ( v8, v10 ); // invoke-virtual {v5, v8, v10}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 415 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 419 */
} // .end local v4 # "oa":Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;
} // :cond_2
int v2 = 0; // const/4 v2, 0x0
/* .line 420 */
/* .restart local v2 # "currScore":I */
v8 = this.scores;
(( java.util.ArrayList ) v8 ).iterator ( ); // invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
} // :cond_3
v8 = } // :goto_2
if ( v8 != null) { // if-eqz v8, :cond_6
/* check-cast v6, Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore; */
/* .line 421 */
/* .local v6, "os":Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore; */
v8 = this.blobFileName;
/* if-nez v8, :cond_3 */
/* .line 422 */
final String v8 = "OfflineSupport"; // const-string v8, "OfflineSupport"
final String v10 = "Posting score %d to leaderboard %s"; // const-string v10, "Posting score %d to leaderboard %s"
int v11 = 2; // const/4 v11, 0x2
/* new-array v11, v11, [Ljava/lang/Object; */
int v12 = 0; // const/4 v12, 0x0
/* iget-wide v13, v6, Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;->score:J */
java.lang.Long .valueOf ( v13,v14 );
/* aput-object v13, v11, v12 */
int v12 = 1; // const/4 v12, 0x1
v13 = this.leaderboardID;
/* aput-object v13, v11, v12 */
java.lang.String .format ( v10,v11 );
com.openfeint.internal.OpenFeintInternal .log ( v8,v10 );
/* .line 423 */
final String v8 = "high_scores[%d][leaderboard_id]"; // const-string v8, "high_scores[%d][leaderboard_id]"
int v10 = 1; // const/4 v10, 0x1
/* new-array v10, v10, [Ljava/lang/Object; */
int v11 = 0; // const/4 v11, 0x0
java.lang.Integer .valueOf ( v2 );
/* aput-object v12, v10, v11 */
java.lang.String .format ( v8,v10 );
v10 = this.leaderboardID;
(( com.openfeint.internal.request.OrderedArgList ) v5 ).put ( v8, v10 ); // invoke-virtual {v5, v8, v10}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 424 */
final String v8 = "high_scores[%d][score]"; // const-string v8, "high_scores[%d][score]"
int v10 = 1; // const/4 v10, 0x1
/* new-array v10, v10, [Ljava/lang/Object; */
int v11 = 0; // const/4 v11, 0x0
java.lang.Integer .valueOf ( v2 );
/* aput-object v12, v10, v11 */
java.lang.String .format ( v8,v10 );
/* iget-wide v10, v6, Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;->score:J */
java.lang.Long .toString ( v10,v11 );
(( com.openfeint.internal.request.OrderedArgList ) v5 ).put ( v8, v10 ); // invoke-virtual {v5, v8, v10}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 425 */
v8 = this.displayText;
if ( v8 != null) { // if-eqz v8, :cond_4
/* .line 426 */
final String v8 = "high_scores[%d][display_text]"; // const-string v8, "high_scores[%d][display_text]"
int v10 = 1; // const/4 v10, 0x1
/* new-array v10, v10, [Ljava/lang/Object; */
int v11 = 0; // const/4 v11, 0x0
java.lang.Integer .valueOf ( v2 );
/* aput-object v12, v10, v11 */
java.lang.String .format ( v8,v10 );
v10 = this.displayText;
(( com.openfeint.internal.request.OrderedArgList ) v5 ).put ( v8, v10 ); // invoke-virtual {v5, v8, v10}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 428 */
} // :cond_4
v8 = this.customData;
if ( v8 != null) { // if-eqz v8, :cond_5
/* .line 429 */
final String v8 = "high_scores[%d][custom_data]"; // const-string v8, "high_scores[%d][custom_data]"
int v10 = 1; // const/4 v10, 0x1
/* new-array v10, v10, [Ljava/lang/Object; */
int v11 = 0; // const/4 v11, 0x0
java.lang.Integer .valueOf ( v2 );
/* aput-object v12, v10, v11 */
java.lang.String .format ( v8,v10 );
v10 = this.customData;
(( com.openfeint.internal.request.OrderedArgList ) v5 ).put ( v8, v10 ); // invoke-virtual {v5, v8, v10}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 431 */
} // :cond_5
final String v8 = "high_scores[%d][timestamp]"; // const-string v8, "high_scores[%d][timestamp]"
int v10 = 1; // const/4 v10, 0x1
/* new-array v10, v10, [Ljava/lang/Object; */
int v11 = 0; // const/4 v11, 0x0
java.lang.Integer .valueOf ( v2 );
/* aput-object v12, v10, v11 */
java.lang.String .format ( v8,v10 );
v10 = this.timestamp;
(( com.openfeint.internal.request.OrderedArgList ) v5 ).put ( v8, v10 ); // invoke-virtual {v5, v8, v10}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 432 */
/* add-int/lit8 v2, v2, 0x1 */
/* goto/16 :goto_2 */
/* .line 437 */
} // .end local v6 # "os":Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;
} // :cond_6
/* if-nez v1, :cond_7 */
/* if-nez v2, :cond_7 */
/* .line 438 */
com.openfeint.internal.offline.OfflineSupport .uploadScoresWithBlobs ( );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* goto/16 :goto_0 */
/* .line 403 */
} // .end local v1 # "currAchievement":I
} // .end local v2 # "currScore":I
} // .end local v3 # "i$":Ljava/util/Iterator;
} // .end local v5 # "oal":Lcom/openfeint/internal/request/OrderedArgList;
/* :catchall_0 */
/* move-exception v8 */
/* monitor-exit v9 */
/* throw v8 */
/* .line 442 */
/* .restart local v1 # "currAchievement":I */
/* .restart local v2 # "currScore":I */
/* .restart local v3 # "i$":Ljava/util/Iterator; */
/* .restart local v5 # "oal":Lcom/openfeint/internal/request/OrderedArgList; */
} // :cond_7
try { // :try_start_2
/* new-instance v8, Ljava/lang/StringBuilder; */
/* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
final String v10 = "/xp/games/"; // const-string v10, "/xp/games/"
(( java.lang.StringBuilder ) v8 ).append ( v10 ); // invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v10 ).getAppID ( ); // invoke-virtual {v10}, Lcom/openfeint/internal/OpenFeintInternal;->getAppID()Ljava/lang/String;
(( java.lang.StringBuilder ) v8 ).append ( v10 ); // invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v10 = "/offline_syncs"; // const-string v10, "/offline_syncs"
(( java.lang.StringBuilder ) v8 ).append ( v10 ); // invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 444 */
/* .local v7, "path":Ljava/lang/String; */
/* new-instance v8, Lcom/openfeint/internal/offline/OfflineSupport$2; */
/* invoke-direct {v8, v5, v7, v0}, Lcom/openfeint/internal/offline/OfflineSupport$2;-><init>(Lcom/openfeint/internal/request/OrderedArgList;Ljava/lang/String;Lcom/openfeint/internal/offline/OfflineSupport$DB;)V */
(( com.openfeint.internal.offline.OfflineSupport$2 ) v8 ).launch ( ); // invoke-virtual {v8}, Lcom/openfeint/internal/offline/OfflineSupport$2;->launch()V
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* goto/16 :goto_0 */
} // .end method
private static void uploadScoresWithBlobs ( ) {
/* .locals 6 */
/* .prologue */
/* .line 365 */
v3 = com.openfeint.internal.offline.OfflineSupport.db;
v3 = this.scores;
(( java.util.ArrayList ) v3 ).iterator ( ); // invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
/* .local v0, "i$":Ljava/util/Iterator; */
v3 = } // :cond_0
if ( v3 != null) { // if-eqz v3, :cond_2
/* check-cast v1, Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore; */
/* .line 366 */
/* .local v1, "os":Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore; */
v3 = this.blobFileName;
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 368 */
/* new-instance v2, Lcom/openfeint/api/resource/Score; */
/* iget-wide v3, v1, Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;->score:J */
/* invoke-direct {v2, v3, v4}, Lcom/openfeint/api/resource/Score;-><init>(J)V */
/* .line 369 */
/* .local v2, "s":Lcom/openfeint/api/resource/Score; */
v3 = this.customData;
this.customData = v3;
/* .line 370 */
v3 = this.displayText;
this.displayText = v3;
/* .line 372 */
try { // :try_start_0
v3 = this.blobFileName;
com.openfeint.internal.offline.OfflineSupport .fullPath ( v3 );
com.openfeint.internal.Util .readWholeFile ( v3 );
this.blob = v3;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 376 */
} // :goto_0
v3 = this.blob;
/* if-nez v3, :cond_1 */
/* .line 378 */
com.openfeint.internal.offline.OfflineSupport .removeAndUploadNext ( v1 );
/* .line 400 */
} // .end local v1 # "os":Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;
} // .end local v2 # "s":Lcom/openfeint/api/resource/Score;
} // :goto_1
return;
/* .line 380 */
/* .restart local v1 # "os":Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore; */
/* .restart local v2 # "s":Lcom/openfeint/api/resource/Score; */
} // :cond_1
/* new-instance v3, Lcom/openfeint/api/resource/Leaderboard; */
v4 = this.leaderboardID;
/* invoke-direct {v3, v4}, Lcom/openfeint/api/resource/Leaderboard;-><init>(Ljava/lang/String;)V */
v4 = this.timestamp;
/* new-instance v5, Lcom/openfeint/internal/offline/OfflineSupport$1; */
/* invoke-direct {v5, v1}, Lcom/openfeint/internal/offline/OfflineSupport$1;-><init>(Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;)V */
(( com.openfeint.api.resource.Score ) v2 ).submitToFromOffline ( v3, v4, v5 ); // invoke-virtual {v2, v3, v4, v5}, Lcom/openfeint/api/resource/Score;->submitToFromOffline(Lcom/openfeint/api/resource/Leaderboard;Ljava/lang/String;Lcom/openfeint/api/resource/Score$SubmitToCB;)V
/* .line 399 */
} // .end local v1 # "os":Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;
} // .end local v2 # "s":Lcom/openfeint/api/resource/Score;
} // :cond_2
v3 = com.openfeint.internal.offline.OfflineSupport.updateInProgress;
int v4 = 0; // const/4 v4, 0x0
(( java.util.concurrent.atomic.AtomicBoolean ) v3 ).set ( v4 ); // invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
/* .line 373 */
/* .restart local v1 # "os":Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore; */
/* .restart local v2 # "s":Lcom/openfeint/api/resource/Score; */
/* :catch_0 */
/* move-exception v3 */
} // .end method

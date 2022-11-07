public class com.openfeint.internal.offline.OfflineSupport$DB {
	 /* .source "OfflineSupport.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/openfeint/internal/offline/OfflineSupport; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "DB" */
} // .end annotation
/* # static fields */
private static final Integer STREAM_VERSION;
/* # instance fields */
public java.util.ArrayList achievements;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public java.util.ArrayList scores;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.openfeint.internal.offline.OfflineSupport$DB ( ) {
/* .locals 1 */
/* .prologue */
/* .line 93 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 96 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.achievements = v0;
/* .line 97 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.scores = v0;
return;
} // .end method
public static com.openfeint.internal.offline.OfflineSupport$DB load ( java.lang.String p0 ) {
/* .locals 15 */
/* .param p0, "fileName" # Ljava/lang/String; */
/* .prologue */
/* .line 183 */
/* new-instance v7, Lcom/openfeint/internal/offline/OfflineSupport$DB; */
/* invoke-direct {v7}, Lcom/openfeint/internal/offline/OfflineSupport$DB;-><init>()V */
/* .line 184 */
/* .local v7, "rv":Lcom/openfeint/internal/offline/OfflineSupport$DB; */
int v5 = 0; // const/4 v5, 0x0
/* .line 186 */
/* .local v5, "ois":Ljava/io/ObjectInputStream; */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 188 */
try { // :try_start_0
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v10 ).getContext ( ); // invoke-virtual {v10}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
(( android.content.Context ) v10 ).openFileInput ( p0 ); // invoke-virtual {v10, p0}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
com.openfeint.internal.Encryption .decryptionWrap ( v10 );
/* .line 189 */
/* .local v2, "is":Ljava/io/InputStream; */
/* new-instance v6, Ljava/io/ObjectInputStream; */
/* invoke-direct {v6, v2}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_4 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 190 */
} // .end local v5 # "ois":Ljava/io/ObjectInputStream;
/* .local v6, "ois":Ljava/io/ObjectInputStream; */
try { // :try_start_1
v9 = (( java.io.ObjectInputStream ) v6 ).readInt ( ); // invoke-virtual {v6}, Ljava/io/ObjectInputStream;->readInt()I
/* .line 191 */
/* .local v9, "streamVersion":I */
/* packed-switch v9, :pswitch_data_0 */
/* .line 219 */
/* new-instance v10, Ljava/lang/Exception; */
final String v11 = "Unrecognized stream version %d"; // const-string v11, "Unrecognized stream version %d"
int v12 = 1; // const/4 v12, 0x1
/* new-array v12, v12, [Ljava/lang/Object; */
int v13 = 0; // const/4 v13, 0x0
java.lang.Integer .valueOf ( v9 );
/* aput-object v14, v12, v13 */
java.lang.String .format ( v11,v12 );
/* invoke-direct {v10, v11}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V */
/* throw v10 */
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
/* .line 221 */
} // .end local v9 # "streamVersion":I
/* :catch_0 */
/* move-exception v1 */
/* move-object v5, v6 */
/* .line 222 */
} // .end local v2 # "is":Ljava/io/InputStream;
} // .end local v6 # "ois":Ljava/io/ObjectInputStream;
/* .local v1, "e":Ljava/lang/Exception; */
/* .restart local v5 # "ois":Ljava/io/ObjectInputStream; */
} // :goto_0
try { // :try_start_2
final String v10 = "OfflineSupport"; // const-string v10, "OfflineSupport"
/* new-instance v11, Ljava/lang/StringBuilder; */
/* invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V */
final String v12 = "Couldn\'t load offline achievements - "; // const-string v12, "Couldn\'t load offline achievements - "
(( java.lang.StringBuilder ) v11 ).append ( v12 ); // invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Exception ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v11 ).append ( v12 ); // invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v11 ).toString ( ); // invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v10,v11 );
/* .line 223 */
v10 = this.achievements;
(( java.util.ArrayList ) v10 ).clear ( ); // invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V
/* .line 224 */
v10 = this.scores;
(( java.util.ArrayList ) v10 ).clear ( ); // invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 226 */
if ( v5 != null) { // if-eqz v5, :cond_0
try { // :try_start_3
(( java.io.ObjectInputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/ObjectInputStream;->close()V
/* :try_end_3 */
/* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_2 */
/* .line 230 */
} // .end local v1 # "e":Ljava/lang/Exception;
} // :cond_0
} // :goto_1
/* .line 194 */
} // .end local v5 # "ois":Ljava/io/ObjectInputStream;
/* .restart local v2 # "is":Ljava/io/InputStream; */
/* .restart local v6 # "ois":Ljava/io/ObjectInputStream; */
/* .restart local v9 # "streamVersion":I */
/* :pswitch_0 */
try { // :try_start_4
v3 = (( java.io.ObjectInputStream ) v6 ).readInt ( ); // invoke-virtual {v6}, Ljava/io/ObjectInputStream;->readInt()I
/* .line 195 */
/* .local v3, "numAchievements":I */
} // :goto_2
/* if-lez v3, :cond_1 */
/* .line 196 */
/* new-instance v0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement; */
/* invoke-direct {v0}, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;-><init>()V */
/* .line 197 */
/* .local v0, "a":Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement; */
(( java.io.ObjectInputStream ) v6 ).readObject ( ); // invoke-virtual {v6}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
/* check-cast v10, Ljava/lang/String; */
this.resourceID = v10;
/* .line 198 */
v10 = (( java.io.ObjectInputStream ) v6 ).readFloat ( ); // invoke-virtual {v6}, Ljava/io/ObjectInputStream;->readFloat()F
/* iput v10, v0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->clientCompletionPercentage:F */
/* .line 199 */
v10 = (( java.io.ObjectInputStream ) v6 ).readFloat ( ); // invoke-virtual {v6}, Ljava/io/ObjectInputStream;->readFloat()F
/* iput v10, v0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->serverCompletionPercentage:F */
/* .line 200 */
(( java.io.ObjectInputStream ) v6 ).readObject ( ); // invoke-virtual {v6}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
/* check-cast v10, Ljava/lang/String; */
this.timestamp = v10;
/* .line 201 */
v10 = this.achievements;
(( java.util.ArrayList ) v10 ).add ( v0 ); // invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 195 */
/* add-int/lit8 v3, v3, -0x1 */
/* .line 204 */
} // .end local v0 # "a":Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;
} // :cond_1
v4 = (( java.io.ObjectInputStream ) v6 ).readInt ( ); // invoke-virtual {v6}, Ljava/io/ObjectInputStream;->readInt()I
/* .line 205 */
/* .local v4, "numScores":I */
} // :goto_3
/* if-lez v4, :cond_2 */
/* .line 206 */
/* new-instance v8, Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore; */
/* invoke-direct {v8}, Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;-><init>()V */
/* .line 207 */
/* .local v8, "s":Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore; */
(( java.io.ObjectInputStream ) v6 ).readObject ( ); // invoke-virtual {v6}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
/* check-cast v10, Ljava/lang/String; */
this.leaderboardID = v10;
/* .line 208 */
(( java.io.ObjectInputStream ) v6 ).readLong ( ); // invoke-virtual {v6}, Ljava/io/ObjectInputStream;->readLong()J
/* move-result-wide v10 */
/* iput-wide v10, v8, Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;->score:J */
/* .line 209 */
(( java.io.ObjectInputStream ) v6 ).readObject ( ); // invoke-virtual {v6}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
/* check-cast v10, Ljava/lang/String; */
this.displayText = v10;
/* .line 210 */
(( java.io.ObjectInputStream ) v6 ).readObject ( ); // invoke-virtual {v6}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
/* check-cast v10, Ljava/lang/String; */
this.customData = v10;
/* .line 211 */
(( java.io.ObjectInputStream ) v6 ).readObject ( ); // invoke-virtual {v6}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
/* check-cast v10, Ljava/lang/String; */
this.blobFileName = v10;
/* .line 212 */
(( java.io.ObjectInputStream ) v6 ).readObject ( ); // invoke-virtual {v6}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
/* check-cast v10, Ljava/lang/String; */
this.timestamp = v10;
/* .line 213 */
v10 = this.scores;
(( java.util.ArrayList ) v10 ).add ( v8 ); // invoke-virtual {v10, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* :try_end_4 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_0 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_1 */
/* .line 205 */
/* add-int/lit8 v4, v4, -0x1 */
/* .line 226 */
} // .end local v8 # "s":Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;
} // :cond_2
if ( v6 != null) { // if-eqz v6, :cond_3
try { // :try_start_5
(( java.io.ObjectInputStream ) v6 ).close ( ); // invoke-virtual {v6}, Ljava/io/ObjectInputStream;->close()V
/* :try_end_5 */
/* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_1 */
} // :cond_3
/* move-object v5, v6 */
} // .end local v6 # "ois":Ljava/io/ObjectInputStream;
/* .restart local v5 # "ois":Ljava/io/ObjectInputStream; */
} // .end local v5 # "ois":Ljava/io/ObjectInputStream;
/* .restart local v6 # "ois":Ljava/io/ObjectInputStream; */
/* :catch_1 */
/* move-exception v10 */
/* move-object v5, v6 */
/* .line 227 */
} // .end local v6 # "ois":Ljava/io/ObjectInputStream;
/* .restart local v5 # "ois":Ljava/io/ObjectInputStream; */
/* .line 226 */
} // .end local v2 # "is":Ljava/io/InputStream;
} // .end local v3 # "numAchievements":I
} // .end local v4 # "numScores":I
} // .end local v9 # "streamVersion":I
/* :catchall_0 */
/* move-exception v10 */
} // :goto_4
if ( v5 != null) { // if-eqz v5, :cond_4
try { // :try_start_6
(( java.io.ObjectInputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/ObjectInputStream;->close()V
/* :try_end_6 */
/* .catch Ljava/io/IOException; {:try_start_6 ..:try_end_6} :catch_3 */
} // :cond_4
} // :goto_5
/* throw v10 */
/* .restart local v1 # "e":Ljava/lang/Exception; */
/* :catch_2 */
/* move-exception v10 */
/* goto/16 :goto_1 */
} // .end local v1 # "e":Ljava/lang/Exception;
/* :catch_3 */
/* move-exception v11 */
} // .end local v5 # "ois":Ljava/io/ObjectInputStream;
/* .restart local v2 # "is":Ljava/io/InputStream; */
/* .restart local v6 # "ois":Ljava/io/ObjectInputStream; */
/* :catchall_1 */
/* move-exception v10 */
/* move-object v5, v6 */
} // .end local v6 # "ois":Ljava/io/ObjectInputStream;
/* .restart local v5 # "ois":Ljava/io/ObjectInputStream; */
/* .line 221 */
} // .end local v2 # "is":Ljava/io/InputStream;
/* :catch_4 */
/* move-exception v1 */
/* goto/16 :goto_0 */
/* .line 191 */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
/* # virtual methods */
public void clear ( ) {
/* .locals 1 */
/* .prologue */
/* .line 273 */
v0 = this.achievements;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
/* .line 274 */
v0 = this.scores;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
/* .line 275 */
return;
} // .end method
public com.openfeint.internal.offline.OfflineSupport$DB dup ( ) {
/* .locals 6 */
/* .prologue */
/* .line 101 */
/* new-instance v2, Lcom/openfeint/internal/offline/OfflineSupport$DB; */
/* invoke-direct {v2}, Lcom/openfeint/internal/offline/OfflineSupport$DB;-><init>()V */
/* .line 102 */
/* .local v2, "rv":Lcom/openfeint/internal/offline/OfflineSupport$DB; */
v4 = this.scores;
(( java.util.ArrayList ) v4 ).iterator ( ); // invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
/* .local v1, "i$":Ljava/util/Iterator; */
v4 = } // :goto_0
if ( v4 != null) { // if-eqz v4, :cond_0
/* check-cast v3, Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore; */
/* .local v3, "s":Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore; */
v4 = this.scores;
(( com.openfeint.internal.offline.OfflineSupport$OfflineScore ) v3 ).dup ( ); // invoke-virtual {v3}, Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;->dup()Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;
(( java.util.ArrayList ) v4 ).add ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 103 */
} // .end local v3 # "s":Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;
} // :cond_0
v4 = this.achievements;
(( java.util.ArrayList ) v4 ).iterator ( ); // invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v4 = } // :goto_1
if ( v4 != null) { // if-eqz v4, :cond_1
/* check-cast v0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement; */
/* .local v0, "a":Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement; */
v4 = this.achievements;
(( com.openfeint.internal.offline.OfflineSupport$OfflineAchievement ) v0 ).dup ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->dup()Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;
(( java.util.ArrayList ) v4 ).add ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 104 */
} // .end local v0 # "a":Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;
} // :cond_1
} // .end method
public com.openfeint.internal.offline.OfflineSupport$OfflineAchievement findAchievement ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "resourceID" # Ljava/lang/String; */
/* .prologue */
/* .line 278 */
v2 = this.achievements;
(( java.util.ArrayList ) v2 ).iterator ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
/* .local v1, "i$":Ljava/util/Iterator; */
v2 = } // :cond_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement; */
/* .line 279 */
/* .local v0, "a":Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement; */
v2 = this.resourceID;
v2 = (( java.lang.String ) v2 ).equals ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 283 */
} // .end local v0 # "a":Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;
} // :goto_0
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void merge ( com.openfeint.internal.offline.OfflineSupport$DB p0 ) {
/* .locals 5 */
/* .param p1, "newUserDB" # Lcom/openfeint/internal/offline/OfflineSupport$DB; */
/* .prologue */
/* .line 110 */
v3 = this.achievements;
(( java.util.ArrayList ) v3 ).iterator ( ); // invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
/* .local v1, "i$":Ljava/util/Iterator; */
v3 = } // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_2
/* check-cast v2, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement; */
/* .line 111 */
/* .local v2, "newUserAchievement":Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement; */
v3 = this.resourceID;
(( com.openfeint.internal.offline.OfflineSupport$DB ) p0 ).findAchievement ( v3 ); // invoke-virtual {p0, v3}, Lcom/openfeint/internal/offline/OfflineSupport$DB;->findAchievement(Ljava/lang/String;)Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;
/* .line 112 */
/* .local v0, "currentUserAchievement":Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement; */
/* if-nez v0, :cond_0 */
/* .line 114 */
v3 = this.achievements;
(( com.openfeint.internal.offline.OfflineSupport$OfflineAchievement ) v2 ).dup ( ); // invoke-virtual {v2}, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->dup()Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;
(( java.util.ArrayList ) v3 ).add ( v4 ); // invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 117 */
} // :cond_0
/* iget v3, v0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->clientCompletionPercentage:F */
/* iget v4, v2, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->clientCompletionPercentage:F */
/* cmpg-float v3, v3, v4 */
/* if-gez v3, :cond_1 */
/* .line 118 */
/* iget v3, v2, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->clientCompletionPercentage:F */
/* iput v3, v0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->clientCompletionPercentage:F */
/* .line 119 */
v3 = this.timestamp;
this.timestamp = v3;
/* .line 122 */
} // :cond_1
/* iget v3, v0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->serverCompletionPercentage:F */
/* iget v4, v2, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->serverCompletionPercentage:F */
v3 = java.lang.Math .max ( v3,v4 );
/* iput v3, v0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->serverCompletionPercentage:F */
/* .line 132 */
} // .end local v0 # "currentUserAchievement":Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;
} // .end local v2 # "newUserAchievement":Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;
} // :cond_2
v3 = this.scores;
v4 = this.scores;
(( java.util.ArrayList ) v3 ).addAll ( v4 ); // invoke-virtual {v3, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
/* .line 133 */
return;
} // .end method
public void removeReferencedBlobs ( ) {
/* .locals 3 */
/* .prologue */
/* .line 267 */
v2 = this.scores;
(( java.util.ArrayList ) v2 ).iterator ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
/* .local v0, "i$":Ljava/util/Iterator; */
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* check-cast v1, Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore; */
/* .line 268 */
/* .local v1, "os":Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore; */
v2 = this.blobFileName;
com.openfeint.internal.offline.OfflineSupport .access$100 ( v2 );
/* .line 270 */
} // .end local v1 # "os":Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;
} // :cond_0
return;
} // .end method
public void save ( java.lang.String p0 ) {
/* .locals 8 */
/* .param p1, "fileName" # Ljava/lang/String; */
/* .prologue */
/* .line 234 */
int v2 = 0; // const/4 v2, 0x0
/* .line 235 */
/* .local v2, "oos":Ljava/io/ObjectOutputStream; */
int v4 = 0; // const/4 v4, 0x0
/* .line 239 */
/* .local v4, "os":Ljava/io/OutputStream; */
try { // :try_start_0
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v6 ).getContext ( ); // invoke-virtual {v6}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
int v7 = 0; // const/4 v7, 0x0
(( android.content.Context ) v6 ).openFileOutput ( p1, v7 ); // invoke-virtual {v6, p1, v7}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
com.openfeint.internal.Encryption .encryptionWrap ( v6 );
/* .line 240 */
/* new-instance v3, Ljava/io/ObjectOutputStream; */
/* invoke-direct {v3, v4}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_7 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* .line 241 */
} // .end local v2 # "oos":Ljava/io/ObjectOutputStream;
/* .local v3, "oos":Ljava/io/ObjectOutputStream; */
int v6 = 0; // const/4 v6, 0x0
try { // :try_start_1
(( java.io.ObjectOutputStream ) v3 ).writeInt ( v6 ); // invoke-virtual {v3, v6}, Ljava/io/ObjectOutputStream;->writeInt(I)V
/* .line 242 */
v6 = this.achievements;
v6 = (( java.util.ArrayList ) v6 ).size ( ); // invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
(( java.io.ObjectOutputStream ) v3 ).writeInt ( v6 ); // invoke-virtual {v3, v6}, Ljava/io/ObjectOutputStream;->writeInt(I)V
/* .line 243 */
v6 = this.achievements;
(( java.util.ArrayList ) v6 ).iterator ( ); // invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
/* .local v1, "i$":Ljava/util/Iterator; */
v6 = } // :goto_0
if ( v6 != null) { // if-eqz v6, :cond_2
/* check-cast v0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement; */
/* .line 244 */
/* .local v0, "a":Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement; */
v6 = this.resourceID;
(( java.io.ObjectOutputStream ) v3 ).writeObject ( v6 ); // invoke-virtual {v3, v6}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
/* .line 245 */
/* iget v6, v0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->clientCompletionPercentage:F */
(( java.io.ObjectOutputStream ) v3 ).writeFloat ( v6 ); // invoke-virtual {v3, v6}, Ljava/io/ObjectOutputStream;->writeFloat(F)V
/* .line 246 */
/* iget v6, v0, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->serverCompletionPercentage:F */
(( java.io.ObjectOutputStream ) v3 ).writeFloat ( v6 ); // invoke-virtual {v3, v6}, Ljava/io/ObjectOutputStream;->writeFloat(F)V
/* .line 247 */
v6 = this.timestamp;
(( java.io.ObjectOutputStream ) v3 ).writeObject ( v6 ); // invoke-virtual {v3, v6}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 259 */
} // .end local v0 # "a":Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;
} // .end local v1 # "i$":Ljava/util/Iterator;
/* :catch_0 */
/* move-exception v6 */
/* move-object v2, v3 */
/* .line 261 */
} // .end local v3 # "oos":Ljava/io/ObjectOutputStream;
/* .restart local v2 # "oos":Ljava/io/ObjectOutputStream; */
} // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_0
try { // :try_start_2
(( java.io.ObjectOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/ObjectOutputStream;->close()V
/* :try_end_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_3 */
/* .line 262 */
} // :cond_0
} // :goto_2
if ( v4 != null) { // if-eqz v4, :cond_1
try { // :try_start_3
(( java.io.OutputStream ) v4 ).close ( ); // invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
/* :try_end_3 */
/* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_4 */
/* .line 264 */
} // :cond_1
} // :goto_3
return;
/* .line 249 */
} // .end local v2 # "oos":Ljava/io/ObjectOutputStream;
/* .restart local v1 # "i$":Ljava/util/Iterator; */
/* .restart local v3 # "oos":Ljava/io/ObjectOutputStream; */
} // :cond_2
try { // :try_start_4
v6 = this.scores;
v6 = (( java.util.ArrayList ) v6 ).size ( ); // invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
(( java.io.ObjectOutputStream ) v3 ).writeInt ( v6 ); // invoke-virtual {v3, v6}, Ljava/io/ObjectOutputStream;->writeInt(I)V
/* .line 250 */
v6 = this.scores;
(( java.util.ArrayList ) v6 ).iterator ( ); // invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v6 = } // :goto_4
if ( v6 != null) { // if-eqz v6, :cond_5
/* check-cast v5, Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore; */
/* .line 251 */
/* .local v5, "s":Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore; */
v6 = this.leaderboardID;
(( java.io.ObjectOutputStream ) v3 ).writeObject ( v6 ); // invoke-virtual {v3, v6}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
/* .line 252 */
/* iget-wide v6, v5, Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;->score:J */
(( java.io.ObjectOutputStream ) v3 ).writeLong ( v6, v7 ); // invoke-virtual {v3, v6, v7}, Ljava/io/ObjectOutputStream;->writeLong(J)V
/* .line 253 */
v6 = this.displayText;
(( java.io.ObjectOutputStream ) v3 ).writeObject ( v6 ); // invoke-virtual {v3, v6}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
/* .line 254 */
v6 = this.customData;
(( java.io.ObjectOutputStream ) v3 ).writeObject ( v6 ); // invoke-virtual {v3, v6}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
/* .line 255 */
v6 = this.blobFileName;
(( java.io.ObjectOutputStream ) v3 ).writeObject ( v6 ); // invoke-virtual {v3, v6}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
/* .line 256 */
v6 = this.timestamp;
(( java.io.ObjectOutputStream ) v3 ).writeObject ( v6 ); // invoke-virtual {v3, v6}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
/* :try_end_4 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_0 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* .line 261 */
} // .end local v1 # "i$":Ljava/util/Iterator;
} // .end local v5 # "s":Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;
/* :catchall_0 */
/* move-exception v6 */
/* move-object v2, v3 */
} // .end local v3 # "oos":Ljava/io/ObjectOutputStream;
/* .restart local v2 # "oos":Ljava/io/ObjectOutputStream; */
} // :goto_5
if ( v2 != null) { // if-eqz v2, :cond_3
try { // :try_start_5
(( java.io.ObjectOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/ObjectOutputStream;->close()V
/* :try_end_5 */
/* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_5 */
/* .line 262 */
} // :cond_3
} // :goto_6
if ( v4 != null) { // if-eqz v4, :cond_4
try { // :try_start_6
(( java.io.OutputStream ) v4 ).close ( ); // invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
/* :try_end_6 */
/* .catch Ljava/io/IOException; {:try_start_6 ..:try_end_6} :catch_6 */
} // :cond_4
} // :goto_7
/* throw v6 */
/* .line 258 */
} // .end local v2 # "oos":Ljava/io/ObjectOutputStream;
/* .restart local v1 # "i$":Ljava/util/Iterator; */
/* .restart local v3 # "oos":Ljava/io/ObjectOutputStream; */
} // :cond_5
try { // :try_start_7
(( java.io.ObjectOutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/ObjectOutputStream;->close()V
/* :try_end_7 */
/* .catch Ljava/lang/Exception; {:try_start_7 ..:try_end_7} :catch_0 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_0 */
/* .line 261 */
if ( v3 != null) { // if-eqz v3, :cond_6
try { // :try_start_8
(( java.io.ObjectOutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/ObjectOutputStream;->close()V
/* :try_end_8 */
/* .catch Ljava/io/IOException; {:try_start_8 ..:try_end_8} :catch_2 */
/* .line 262 */
} // :cond_6
} // :goto_8
if ( v4 != null) { // if-eqz v4, :cond_7
try { // :try_start_9
(( java.io.OutputStream ) v4 ).close ( ); // invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
/* :try_end_9 */
/* .catch Ljava/io/IOException; {:try_start_9 ..:try_end_9} :catch_1 */
} // :cond_7
/* move-object v2, v3 */
} // .end local v3 # "oos":Ljava/io/ObjectOutputStream;
/* .restart local v2 # "oos":Ljava/io/ObjectOutputStream; */
} // .end local v2 # "oos":Ljava/io/ObjectOutputStream;
/* .restart local v3 # "oos":Ljava/io/ObjectOutputStream; */
/* :catch_1 */
/* move-exception v6 */
/* move-object v2, v3 */
/* .line 263 */
} // .end local v3 # "oos":Ljava/io/ObjectOutputStream;
/* .restart local v2 # "oos":Ljava/io/ObjectOutputStream; */
/* .line 261 */
} // .end local v2 # "oos":Ljava/io/ObjectOutputStream;
/* .restart local v3 # "oos":Ljava/io/ObjectOutputStream; */
/* :catch_2 */
/* move-exception v6 */
} // .end local v1 # "i$":Ljava/util/Iterator;
} // .end local v3 # "oos":Ljava/io/ObjectOutputStream;
/* .restart local v2 # "oos":Ljava/io/ObjectOutputStream; */
/* :catch_3 */
/* move-exception v6 */
/* .line 262 */
/* :catch_4 */
/* move-exception v6 */
/* .line 261 */
/* :catch_5 */
/* move-exception v7 */
/* .line 262 */
/* :catch_6 */
/* move-exception v7 */
/* .line 261 */
/* :catchall_1 */
/* move-exception v6 */
/* .line 259 */
/* :catch_7 */
/* move-exception v6 */
} // .end method
public void updateOnUpload ( com.openfeint.internal.offline.OfflineSupport$DB p0 ) {
/* .locals 10 */
/* .param p1, "otherDB" # Lcom/openfeint/internal/offline/OfflineSupport$DB; */
/* .prologue */
/* .line 140 */
v8 = this.achievements;
(( java.util.ArrayList ) v8 ).iterator ( ); // invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
/* .local v1, "i$":Ljava/util/Iterator; */
v8 = } // :goto_0
if ( v8 != null) { // if-eqz v8, :cond_1
/* check-cast v6, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement; */
/* .line 141 */
/* .local v6, "otherAchievement":Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement; */
v8 = this.resourceID;
(( com.openfeint.internal.offline.OfflineSupport$DB ) p0 ).findAchievement ( v8 ); // invoke-virtual {p0, v8}, Lcom/openfeint/internal/offline/OfflineSupport$DB;->findAchievement(Ljava/lang/String;)Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;
/* .line 142 */
/* .local v3, "myAchievement":Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement; */
/* if-nez v3, :cond_0 */
/* .line 144 */
(( com.openfeint.internal.offline.OfflineSupport$OfflineAchievement ) v6 ).dup ( ); // invoke-virtual {v6}, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->dup()Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;
/* .line 145 */
v8 = this.achievements;
(( java.util.ArrayList ) v8 ).add ( v3 ); // invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 149 */
} // :cond_0
/* iget v8, v3, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->serverCompletionPercentage:F */
/* iget v9, v6, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->clientCompletionPercentage:F */
v8 = java.lang.Math .max ( v8,v9 );
/* iput v8, v3, Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;->serverCompletionPercentage:F */
/* .line 157 */
} // .end local v3 # "myAchievement":Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;
} // .end local v6 # "otherAchievement":Lcom/openfeint/internal/offline/OfflineSupport$OfflineAchievement;
} // :cond_1
v5 = this.scores;
/* .line 158 */
/* .local v5, "oldScores":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;>;" */
/* new-instance v8, Ljava/util/ArrayList; */
/* invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V */
this.scores = v8;
/* .line 159 */
(( java.util.ArrayList ) v5 ).iterator ( ); // invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
} // .end local v1 # "i$":Ljava/util/Iterator;
} // :cond_2
v8 = } // :goto_1
if ( v8 != null) { // if-eqz v8, :cond_6
/* check-cast v4, Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore; */
/* .line 161 */
/* .local v4, "myScore":Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore; */
v8 = this.blobFileName;
if ( v8 != null) { // if-eqz v8, :cond_3
/* .line 162 */
v8 = this.scores;
(( java.util.ArrayList ) v8 ).add ( v4 ); // invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 167 */
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
/* .line 168 */
/* .local v0, "found":Z */
v8 = this.scores;
(( java.util.ArrayList ) v8 ).iterator ( ); // invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
/* .local v2, "i$":Ljava/util/Iterator; */
v8 = } // :cond_4
if ( v8 != null) { // if-eqz v8, :cond_5
/* check-cast v7, Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore; */
/* .line 169 */
/* .local v7, "otherScore":Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore; */
v8 = (( com.openfeint.internal.offline.OfflineSupport$OfflineScore ) v4 ).eq ( v7 ); // invoke-virtual {v4, v7}, Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;->eq(Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;)Z
if ( v8 != null) { // if-eqz v8, :cond_4
/* .line 170 */
int v0 = 1; // const/4 v0, 0x1
/* .line 176 */
} // .end local v7 # "otherScore":Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;
} // :cond_5
/* if-nez v0, :cond_2 */
/* .line 177 */
v8 = this.scores;
(( java.util.ArrayList ) v8 ).add ( v4 ); // invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 180 */
} // .end local v0 # "found":Z
} // .end local v2 # "i$":Ljava/util/Iterator;
} // .end local v4 # "myScore":Lcom/openfeint/internal/offline/OfflineSupport$OfflineScore;
} // :cond_6
return;
} // .end method

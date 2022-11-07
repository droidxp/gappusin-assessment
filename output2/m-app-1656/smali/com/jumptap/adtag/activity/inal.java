class inal implements java.lang.Runnable {
	 /* .source "JTVideo.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/jumptap/adtag/activity/JTVideo;->runSaveVideoThread(Lcom/jumptap/adtag/db/DBManager;Landroid/content/Context;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x8 */
/* name = null */
} // .end annotation
/* # instance fields */
final android.content.Context val$context; //synthetic
final com.jumptap.adtag.db.DBManager val$dbManager; //synthetic
/* # direct methods */
 inal ( ) {
/* .locals 0 */
/* .prologue */
/* .line 217 */
this.val$context = p1;
this.val$dbManager = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 6 */
/* .prologue */
/* .line 221 */
try { // :try_start_0
	 v3 = 	 com.jumptap.adtag.activity.JTVideo .access$000 ( );
	 /* if-nez v3, :cond_0 */
	 /* .line 222 */
	 int v3 = 1; // const/4 v3, 0x1
	 com.jumptap.adtag.activity.JTVideo .access$002 ( v3 );
	 /* .line 224 */
	 com.jumptap.adtag.activity.JTVideo .access$100 ( );
	 v4 = this.val$context;
	 com.jumptap.adtag.activity.JTVideo .saveVideoToFile ( v3,v4 );
	 /* .line 227 */
	 /* new-instance v3, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v4 = ""; // const-string v4, ""
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 java.lang.System .currentTimeMillis ( );
	 /* move-result-wide v4 */
	 (( java.lang.StringBuilder ) v3 ).append ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 228 */
	 /* .local v0, "date":Ljava/lang/String; */
	 /* new-instance v2, Lcom/jumptap/adtag/media/VideoCacheItem; */
	 com.jumptap.adtag.activity.JTVideo .access$200 ( );
	 /* invoke-direct {v2, v3, v0}, Lcom/jumptap/adtag/media/VideoCacheItem;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
	 /* .line 229 */
	 /* .local v2, "item":Lcom/jumptap/adtag/media/VideoCacheItem; */
	 v3 = this.val$dbManager;
	 (( com.jumptap.adtag.db.DBManager ) v3 ).insertVideoCacheItem ( v2 ); // invoke-virtual {v3, v2}, Lcom/jumptap/adtag/db/DBManager;->insertVideoCacheItem(Lcom/jumptap/adtag/media/VideoCacheItem;)J
	 /* .line 232 */
	 int v3 = 0; // const/4 v3, 0x0
	 com.jumptap.adtag.activity.JTVideo .access$002 ( v3 );
	 /* :try_end_0 */
	 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 238 */
} // .end local v0 # "date":Ljava/lang/String;
} // .end local v2 # "item":Lcom/jumptap/adtag/media/VideoCacheItem;
} // :cond_0
} // :goto_0
return;
/* .line 234 */
/* :catch_0 */
/* move-exception v1 */
/* .line 235 */
/* .local v1, "e":Ljava/io/IOException; */
final String v3 = "JtAd"; // const-string v3, "JtAd"
final String v4 = "cannot save video"; // const-string v4, "cannot save video"
android.util.Log .e ( v3,v4,v1 );
} // .end method

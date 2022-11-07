class com.mobfox.video.sdk.CacheManager$1 implements java.lang.Runnable {
	 /* .source "CacheManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/mobfox/video/sdk/CacheManager;->downloadVideoInfo(Lcom/mobfox/video/sdk/RequestData;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.video.sdk.CacheManager this$0; //synthetic
private final com.mobfox.video.sdk.RequestData val$requestData; //synthetic
/* # direct methods */
 com.mobfox.video.sdk.CacheManager$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
this.val$requestData = p2;
/* .line 287 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
static com.mobfox.video.sdk.CacheManager access$0 ( com.mobfox.video.sdk.CacheManager$1 p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 287 */
v0 = this.this$0;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 13 */
/* .prologue */
int v12 = 3; // const/4 v12, 0x3
int v11 = 0; // const/4 v11, 0x0
/* .line 290 */
final String v7 = "MOBFOX"; // const-string v7, "MOBFOX"
v7 = android.util.Log .isLoggable ( v7,v12 );
if ( v7 != null) { // if-eqz v7, :cond_0
	 /* .line 291 */
	 final String v7 = "MOBFOX"; // const-string v7, "MOBFOX"
	 final String v8 = "MobFox CacheManager start downloading"; // const-string v8, "MobFox CacheManager start downloading"
	 android.util.Log .d ( v7,v8 );
	 /* .line 293 */
} // :cond_0
v7 = this.this$0;
int v8 = 1; // const/4 v8, 0x1
/* iput-boolean v8, v7, Lcom/mobfox/video/sdk/CacheManager;->mDownloading:Z */
/* .line 294 */
v7 = this.this$0;
/* iput-boolean v11, v7, Lcom/mobfox/video/sdk/CacheManager;->mCancel:Z */
/* .line 295 */
v7 = this.this$0;
v7 = this.mManager;
(( com.mobfox.video.sdk.MobFoxAdManager ) v7 ).getContext ( ); // invoke-virtual {v7}, Lcom/mobfox/video/sdk/MobFoxAdManager;->getContext()Landroid/content/Context;
/* .line 296 */
/* .local v0, "ctx":Landroid/content/Context; */
v7 = com.mobfox.video.sdk.Util .isNetworkAvailable ( v0 );
if ( v7 != null) { // if-eqz v7, :cond_1
	 /* .line 297 */
	 /* new-instance v4, Lcom/mobfox/video/sdk/RequestVideoList; */
	 /* invoke-direct {v4}, Lcom/mobfox/video/sdk/RequestVideoList;-><init>()V */
	 /* .line 300 */
	 /* .local v4, "request":Lcom/mobfox/video/sdk/RequestVideoList; */
	 try { // :try_start_0
		 v7 = this.val$requestData;
		 (( com.mobfox.video.sdk.RequestVideoList ) v4 ).sendRequest ( v7 ); // invoke-virtual {v4, v7}, Lcom/mobfox/video/sdk/RequestVideoList;->sendRequest(Lcom/mobfox/video/sdk/RequestData;)Ljava/util/HashMap;
		 /* .line 301 */
		 /* .local v6, "videoList":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Long;>;" */
		 if ( v6 != null) { // if-eqz v6, :cond_1
			 /* .line 302 */
			 (( java.util.HashMap ) v6 ).keySet ( ); // invoke-virtual {v6}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
			 /* .line 303 */
			 /* .local v3, "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;" */
		 } // :goto_0
		 /* :try_end_0 */
		 v7 = 		 /* .catch Lcom/mobfox/video/sdk/RequestException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* if-nez v7, :cond_3 */
		 /* .line 314 */
	 } // .end local v3 # "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
} // .end local v4 # "request":Lcom/mobfox/video/sdk/RequestVideoList;
} // .end local v6 # "videoList":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Long;>;"
} // :cond_1
} // :goto_1
v7 = this.this$0;
/* iput-boolean v11, v7, Lcom/mobfox/video/sdk/CacheManager;->mDownloading:Z */
/* .line 315 */
final String v7 = "MOBFOX"; // const-string v7, "MOBFOX"
v7 = android.util.Log .isLoggable ( v7,v12 );
if ( v7 != null) { // if-eqz v7, :cond_2
/* .line 316 */
final String v7 = "MOBFOX"; // const-string v7, "MOBFOX"
final String v8 = "MobFox CacheManager download Thread finished"; // const-string v8, "MobFox CacheManager download Thread finished"
android.util.Log .d ( v7,v8 );
/* .line 318 */
} // :cond_2
v7 = this.this$0;
/* new-instance v8, Lcom/mobfox/video/sdk/CacheManager$1$1; */
v9 = this.val$requestData;
/* invoke-direct {v8, p0, v9}, Lcom/mobfox/video/sdk/CacheManager$1$1;-><init>(Lcom/mobfox/video/sdk/CacheManager$1;Lcom/mobfox/video/sdk/RequestData;)V */
this.mDownloadRunnable = v8;
/* .line 324 */
v7 = this.this$0;
v7 = this.mManager;
(( com.mobfox.video.sdk.MobFoxAdManager ) v7 ).getHandler ( ); // invoke-virtual {v7}, Lcom/mobfox/video/sdk/MobFoxAdManager;->getHandler()Landroid/os/Handler;
v8 = this.this$0;
v8 = this.mDownloadRunnable;
/* .line 325 */
/* const-wide/32 v9, 0x927c0 */
/* .line 324 */
(( android.os.Handler ) v7 ).postDelayed ( v8, v9, v10 ); // invoke-virtual {v7, v8, v9, v10}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
/* .line 327 */
return;
/* .line 304 */
/* .restart local v3 # "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;" */
/* .restart local v4 # "request":Lcom/mobfox/video/sdk/RequestVideoList; */
/* .restart local v6 # "videoList":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Long;>;" */
} // :cond_3
try { // :try_start_1
/* check-cast v5, Ljava/lang/String; */
/* .line 305 */
/* .local v5, "url":Ljava/lang/String; */
(( java.util.HashMap ) v6 ).get ( v5 ); // invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v2, Ljava/lang/Long; */
/* .line 306 */
/* .local v2, "expire":Ljava/lang/Long; */
v7 = this.this$0;
v8 = this.val$requestData;
(( com.mobfox.video.sdk.RequestData ) v8 ).getUserAgent2 ( ); // invoke-virtual {v8}, Lcom/mobfox/video/sdk/RequestData;->getUserAgent2()Ljava/lang/String;
/* .line 307 */
(( java.lang.Long ) v2 ).longValue ( ); // invoke-virtual {v2}, Ljava/lang/Long;->longValue()J
/* move-result-wide v9 */
/* .line 306 */
(( com.mobfox.video.sdk.CacheManager ) v7 ).downloadVideo ( v8, v5, v9, v10 ); // invoke-virtual {v7, v8, v5, v9, v10}, Lcom/mobfox/video/sdk/CacheManager;->downloadVideo(Ljava/lang/String;Ljava/lang/String;J)V
/* :try_end_1 */
/* .catch Lcom/mobfox/video/sdk/RequestException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 310 */
} // .end local v2 # "expire":Ljava/lang/Long;
} // .end local v3 # "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;"
} // .end local v5 # "url":Ljava/lang/String;
} // .end local v6 # "videoList":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Long;>;"
/* :catch_0 */
/* move-exception v1 */
/* .line 311 */
/* .local v1, "e":Lcom/mobfox/video/sdk/RequestException; */
(( com.mobfox.video.sdk.RequestException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Lcom/mobfox/video/sdk/RequestException;->printStackTrace()V
} // .end method

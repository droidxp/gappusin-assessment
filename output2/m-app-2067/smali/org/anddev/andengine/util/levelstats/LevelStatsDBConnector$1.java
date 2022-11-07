class org.anddev.andengine.util.levelstats.LevelStatsDBConnector$1 implements java.lang.Runnable {
	 /* # interfaces */
	 /* # instance fields */
	 final org.anddev.andengine.util.levelstats.LevelStatsDBConnector this$0; //synthetic
	 private final org.anddev.andengine.util.Callback val$pCallback; //synthetic
	 private final Integer val$pLevelID; //synthetic
	 private final Integer val$pSecondsElapsed; //synthetic
	 private final Boolean val$pSolved; //synthetic
	 /* # direct methods */
	 org.anddev.andengine.util.levelstats.LevelStatsDBConnector$1 ( ) {
		 /* .locals 0 */
		 this.this$0 = p1;
		 /* iput p2, p0, Lorg/anddev/andengine/util/levelstats/LevelStatsDBConnector$1;->val$pLevelID:I */
		 /* iput-boolean p3, p0, Lorg/anddev/andengine/util/levelstats/LevelStatsDBConnector$1;->val$pSolved:Z */
		 /* iput p4, p0, Lorg/anddev/andengine/util/levelstats/LevelStatsDBConnector$1;->val$pSecondsElapsed:I */
		 this.val$pCallback = p5;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 7 */
		 int v6 = 0; // const/4 v6, 0x0
		 try { // :try_start_0
			 /* new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient; */
			 /* invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V */
			 /* new-instance v1, Lorg/apache/http/client/methods/HttpPost; */
			 v2 = this.this$0;
			 org.anddev.andengine.util.levelstats.LevelStatsDBConnector .access$0 ( v2 );
			 /* invoke-direct {v1, v2}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V */
			 /* new-instance v2, Ljava/util/ArrayList; */
			 int v3 = 4; // const/4 v3, 0x4
			 /* invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V */
			 /* new-instance v3, Lorg/apache/http/message/BasicNameValuePair; */
			 final String v4 = "level_id"; // const-string v4, "level_id"
			 /* iget v5, p0, Lorg/anddev/andengine/util/levelstats/LevelStatsDBConnector$1;->val$pLevelID:I */
			 java.lang.String .valueOf ( v5 );
			 /* invoke-direct {v3, v4, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
			 /* new-instance v3, Lorg/apache/http/message/BasicNameValuePair; */
			 final String v4 = "solved"; // const-string v4, "solved"
			 /* iget-boolean v5, p0, Lorg/anddev/andengine/util/levelstats/LevelStatsDBConnector$1;->val$pSolved:Z */
			 if ( v5 != null) { // if-eqz v5, :cond_1
				 final String v5 = "1"; // const-string v5, "1"
			 } // :goto_0
			 /* invoke-direct {v3, v4, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
			 /* new-instance v3, Lorg/apache/http/message/BasicNameValuePair; */
			 final String v4 = "secondsplayed"; // const-string v4, "secondsplayed"
			 /* iget v5, p0, Lorg/anddev/andengine/util/levelstats/LevelStatsDBConnector$1;->val$pSecondsElapsed:I */
			 java.lang.String .valueOf ( v5 );
			 /* invoke-direct {v3, v4, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
			 /* new-instance v3, Lorg/apache/http/message/BasicNameValuePair; */
			 final String v4 = "player_id"; // const-string v4, "player_id"
			 v5 = this.this$0;
			 v5 = 			 org.anddev.andengine.util.levelstats.LevelStatsDBConnector .access$1 ( v5 );
			 java.lang.String .valueOf ( v5 );
			 /* invoke-direct {v3, v4, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
			 /* new-instance v3, Lorg/apache/http/message/BasicNameValuePair; */
			 final String v4 = "secret"; // const-string v4, "secret"
			 v5 = this.this$0;
			 org.anddev.andengine.util.levelstats.LevelStatsDBConnector .access$2 ( v5 );
			 java.lang.String .valueOf ( v5 );
			 /* invoke-direct {v3, v4, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
			 /* new-instance v3, Lorg/apache/http/client/entity/UrlEncodedFormEntity; */
			 /* invoke-direct {v3, v2}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;)V */
			 v1 = 			 (( org.apache.http.client.methods.HttpPost ) v1 ).setEntity ( v3 ); // invoke-virtual {v1, v3}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
			 /* const/16 v2, 0xc8 */
			 /* if-ne v1, v2, :cond_3 */
			 org.anddev.andengine.util.StreamUtils .readFully ( v0 );
			 final String v1 = "<success/>"; // const-string v1, "<success/>"
			 v0 = 			 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 if ( v0 != null) { // if-eqz v0, :cond_2
				 v0 = this.val$pCallback;
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 v0 = this.val$pCallback;
					 int v1 = 1; // const/4 v1, 0x1
					 java.lang.Boolean .valueOf ( v1 );
				 } // :cond_0
			 } // :goto_1
			 return;
		 } // :cond_1
		 final String v5 = "0"; // const-string v5, "0"
	 } // :cond_2
	 v0 = this.val$pCallback;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.val$pCallback;
		 int v1 = 0; // const/4 v1, 0x0
		 java.lang.Boolean .valueOf ( v1 );
		 /* :try_end_0 */
		 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 org.anddev.andengine.util.Debug .e ( v0 );
		 v0 = this.val$pCallback;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.val$pCallback;
			 java.lang.Boolean .valueOf ( v6 );
		 } // :cond_3
		 try { // :try_start_1
			 v0 = this.val$pCallback;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 v0 = this.val$pCallback;
				 int v1 = 0; // const/4 v1, 0x0
				 java.lang.Boolean .valueOf ( v1 );
				 /* :try_end_1 */
				 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
			 } // .end method

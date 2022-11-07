class com.heyzap.sdk.HeyzapAnalytics {
	 /* # static fields */
	 private static final java.lang.String HEYZAP_ANALYTICS_ID_PREF;
	 private static final java.lang.String HEYZAP_ENDPOINT;
	 private static final java.lang.String HEYZAP_SDK_PLATFORM;
	 private static final java.lang.String HEYZAP_SDK_VERSION;
	 public static final java.lang.String LOG_TAG;
	 private static java.lang.String deviceId;
	 private static Boolean loaded;
	 private static java.lang.String packageName;
	 private static java.util.concurrent.ExecutorService requestThread;
	 private static java.lang.String trackHash;
	 /* # direct methods */
	 static com.heyzap.sdk.HeyzapAnalytics ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 com.heyzap.sdk.HeyzapAnalytics.loaded = (v0!= 0);
		 final String v0 = "unknown"; // const-string v0, "unknown"
		 final String v0 = "unknown"; // const-string v0, "unknown"
		 final String v0 = ""; // const-string v0, ""
		 java.util.concurrent.Executors .newSingleThreadExecutor ( );
		 return;
	 } // .end method
	 com.heyzap.sdk.HeyzapAnalytics ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 static java.lang.String access$000 ( ) { //synthethic
		 /* .locals 1 */
		 v0 = com.heyzap.sdk.HeyzapAnalytics.packageName;
	 } // .end method
	 static java.lang.String access$100 ( ) { //synthethic
		 /* .locals 1 */
		 v0 = com.heyzap.sdk.HeyzapAnalytics.deviceId;
	 } // .end method
	 static java.lang.String access$200 ( ) { //synthethic
		 /* .locals 1 */
		 v0 = com.heyzap.sdk.HeyzapAnalytics.trackHash;
	 } // .end method
	 static java.lang.String access$202 ( java.lang.String p0 ) { //synthethic
		 /* .locals 0 */
	 } // .end method
	 static java.lang.String access$300 ( java.io.InputStream p0 ) { //synthethic
		 /* .locals 1 */
		 com.heyzap.sdk.HeyzapAnalytics .convertStreamToString ( p0 );
	 } // .end method
	 static void access$400 ( android.content.Context p0, java.lang.String p1 ) { //synthethic
		 /* .locals 0 */
		 com.heyzap.sdk.HeyzapAnalytics .setTrackHash ( p0,p1 );
		 return;
	 } // .end method
	 static java.lang.String access$500 ( android.content.Context p0 ) { //synthethic
		 /* .locals 1 */
		 com.heyzap.sdk.HeyzapAnalytics .getTrackHash ( p0 );
	 } // .end method
	 private static java.lang.String convertStreamToString ( java.io.InputStream p0 ) {
		 /* .locals 4 */
		 /* new-instance v0, Ljava/io/BufferedReader; */
		 /* new-instance v1, Ljava/io/InputStreamReader; */
		 /* invoke-direct {v1, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V */
		 /* invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 } // :goto_0
	 try { // :try_start_0
		 (( java.io.BufferedReader ) v0 ).readLine ( ); // invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 /* new-instance v3, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
			 (( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 final String v3 = "\n"; // const-string v3, "\n"
			 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 /* :try_end_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 try { // :try_start_1
				 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
				 /* :try_end_1 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
				 try { // :try_start_2
					 (( java.io.InputStream ) p0 ).close ( ); // invoke-virtual {p0}, Ljava/io/InputStream;->close()V
					 /* :try_end_2 */
					 /* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_2 */
				 } // :goto_1
				 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 } // :cond_0
			 try { // :try_start_3
				 (( java.io.InputStream ) p0 ).close ( ); // invoke-virtual {p0}, Ljava/io/InputStream;->close()V
				 /* :try_end_3 */
				 /* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_1 */
				 /* :catch_1 */
				 /* move-exception v0 */
				 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
				 /* :catch_2 */
				 /* move-exception v0 */
				 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
				 /* :catchall_0 */
				 /* move-exception v0 */
				 try { // :try_start_4
					 (( java.io.InputStream ) p0 ).close ( ); // invoke-virtual {p0}, Ljava/io/InputStream;->close()V
					 /* :try_end_4 */
					 /* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_3 */
				 } // :goto_2
				 /* throw v0 */
				 /* :catch_3 */
				 /* move-exception v1 */
				 (( java.io.IOException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
			 } // .end method
			 public static java.lang.String getAnalyticsReferrer ( android.content.Context p0 ) {
				 /* .locals 1 */
				 int v0 = 0; // const/4 v0, 0x0
				 com.heyzap.sdk.HeyzapAnalytics .getAnalyticsReferrer ( p0,v0 );
			 } // .end method
			 public static java.lang.String getAnalyticsReferrer ( android.content.Context p0, java.lang.String p1 ) {
				 /* .locals 3 */
				 com.heyzap.sdk.HeyzapAnalytics .getTrackHash ( p0 );
				 if ( v0 != null) { // if-eqz v0, :cond_1
					 /* new-instance v1, Ljava/lang/StringBuilder; */
					 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
					 final String v2 = "utm_medium=device&utm_source=heyzap_track&utm_campaign="; // const-string v2, "utm_medium=device&utm_source=heyzap_track&utm_campaign="
					 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 } // :goto_0
				 if ( p1 != null) { // if-eqz p1, :cond_0
					 /* new-instance v1, Ljava/lang/StringBuilder; */
					 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
					 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 final String v1 = "&"; // const-string v1, "&"
					 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 } // :cond_0
				 java.net.URLEncoder .encode ( v0 );
			 } // :cond_1
			 /* new-instance v0, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v1 = "utm_medium=device&utm_source=sdk&utm_campaign="; // const-string v1, "utm_medium=device&utm_source=sdk&utm_campaign="
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 } // .end method
		 private static java.lang.String getTrackHash ( android.content.Context p0 ) {
			 /* .locals 3 */
			 int v2 = 0; // const/4 v2, 0x0
			 v0 = com.heyzap.sdk.HeyzapAnalytics.trackHash;
			 /* if-nez v0, :cond_0 */
			 final String v0 = "heyzap_button_analytics_id"; // const-string v0, "heyzap_button_analytics_id"
			 int v1 = 0; // const/4 v1, 0x0
			 (( android.content.Context ) p0 ).getSharedPreferences ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 final String v1 = "heyzap_button_analytics_id"; // const-string v1, "heyzap_button_analytics_id"
			 } // :cond_0
			 v0 = com.heyzap.sdk.HeyzapAnalytics.trackHash;
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 v0 = com.heyzap.sdk.HeyzapAnalytics.trackHash;
				 (( java.lang.String ) v0 ).trim ( ); // invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
				 final String v1 = ""; // const-string v1, ""
				 v0 = 				 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
				 if ( v0 != null) { // if-eqz v0, :cond_1
					 /* move-object v0, v2 */
				 } // :goto_0
			 } // :cond_1
			 v0 = com.heyzap.sdk.HeyzapAnalytics.trackHash;
		 } // .end method
		 private static void init ( android.content.Context p0 ) {
			 /* .locals 3 */
			 v0 = android.os.Build.PRODUCT;
			 (( android.content.Context ) p0 ).getContentResolver ( ); // invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
			 final String v2 = "android_id"; // const-string v2, "android_id"
			 android.provider.Settings$Secure .getString ( v1,v2 );
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 if ( v1 != null) { // if-eqz v1, :cond_0
					 /* new-instance v2, Ljava/lang/StringBuilder; */
					 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
					 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 final String v2 = "_"; // const-string v2, "_"
					 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 } // :cond_0
				 /* new-instance v0, Ljava/lang/Thread; */
				 /* new-instance v1, Lcom/heyzap/sdk/HeyzapAnalytics$2; */
				 /* invoke-direct {v1, p0}, Lcom/heyzap/sdk/HeyzapAnalytics$2;-><init>(Landroid/content/Context;)V */
				 /* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
				 (( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
				 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
				 return;
			 } // .end method
			 private static void setTrackHash ( android.content.Context p0, java.lang.String p1 ) {
				 /* .locals 3 */
				 if ( p1 != null) { // if-eqz p1, :cond_0
					 (( java.lang.String ) p1 ).trim ( ); // invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
					 final String v1 = ""; // const-string v1, ""
					 v0 = 					 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
					 /* if-nez v0, :cond_0 */
					 v0 = com.heyzap.sdk.HeyzapAnalytics.trackHash;
					 v0 = 					 (( java.lang.String ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
					 /* if-nez v0, :cond_0 */
					 final String v0 = "heyzap_button_analytics_id"; // const-string v0, "heyzap_button_analytics_id"
					 int v1 = 0; // const/4 v1, 0x0
					 (( android.content.Context ) p0 ).getSharedPreferences ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
					 final String v1 = "heyzap_button_analytics_id"; // const-string v1, "heyzap_button_analytics_id"
					 v2 = com.heyzap.sdk.HeyzapAnalytics.trackHash;
				 } // :cond_0
				 return;
			 } // .end method
			 public static synchronized void trackEvent ( android.content.Context p0, java.lang.String p1 ) {
				 /* .locals 4 */
				 /* const-class v0, Lcom/heyzap/sdk/HeyzapAnalytics; */
				 /* monitor-enter v0 */
				 try { // :try_start_0
					 final String v1 = "HeyzapSDK"; // const-string v1, "HeyzapSDK"
					 /* new-instance v2, Ljava/lang/StringBuilder; */
					 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
					 final String v3 = "Tracking "; // const-string v3, "Tracking "
					 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 (( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 final String v3 = " event."; // const-string v3, " event."
					 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
					 android.util.Log .d ( v1,v2 );
					 /* sget-boolean v1, Lcom/heyzap/sdk/HeyzapAnalytics;->loaded:Z */
					 /* if-nez v1, :cond_0 */
					 com.heyzap.sdk.HeyzapAnalytics .init ( p0 );
					 int v1 = 1; // const/4 v1, 0x1
					 com.heyzap.sdk.HeyzapAnalytics.loaded = (v1!= 0);
				 } // :cond_0
				 v1 = com.heyzap.sdk.HeyzapAnalytics.requestThread;
				 /* new-instance v2, Lcom/heyzap/sdk/HeyzapAnalytics$1; */
				 /* invoke-direct {v2, p1, p0}, Lcom/heyzap/sdk/HeyzapAnalytics$1;-><init>(Ljava/lang/String;Landroid/content/Context;)V */
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* monitor-exit v0 */
				 return;
				 /* :catchall_0 */
				 /* move-exception v1 */
				 /* monitor-exit v0 */
				 /* throw v1 */
			 } // .end method

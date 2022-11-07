public class com.a.d.a {
	 /* # static fields */
	 public static Boolean a;
	 private static android.content.Context b;
	 private static Integer c;
	 private static Boolean d;
	 private static android.media.MediaPlayer e;
	 /* # direct methods */
	 static com.a.d.a ( ) {
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
		 com.a.d.a.a = (v0!= 0);
		 return;
	 } // .end method
	 public com.a.d.a ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 com.a.d.a.d = (p3!= 0);
		 return;
	 } // .end method
	 public static void b ( ) {
		 /* .locals 1 */
		 v0 = com.a.d.a.e;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = com.a.d.a.e;
			 (( android.media.MediaPlayer ) v0 ).pause ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
		 } // :cond_0
		 return;
	 } // .end method
	 public static void c ( ) {
		 /* .locals 3 */
		 v0 = com.a.d.a.e;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 try { // :try_start_0
				 v0 = com.a.d.a.e;
				 v0 = 				 (( android.media.MediaPlayer ) v0 ).isPlaying ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 v0 = com.a.d.a.e;
					 (( android.media.MediaPlayer ) v0 ).stop ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V
					 /* :try_end_0 */
					 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
				 } // :cond_0
			 } // :goto_0
			 v0 = com.a.d.a.e;
			 (( android.media.MediaPlayer ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
		 } // :cond_1
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 v1 = java.lang.System.out;
		 final String v2 = "\u80cc\u666f\u97f3\u4e50\u91ca\u653e\u8d44\u6e90\u9519\u8bef"; // const-string v2, "\u80cc\u666f\u97f3\u4e50\u91ca\u653e\u8d44\u6e90\u9519\u8bef"
		 (( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
		 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
	 } // .end method
	 /* # virtual methods */
	 public void a ( ) {
		 /* .locals 4 */
		 /* sget-boolean v0, Lcom/a/d/a;->a:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = com.a.d.a.b;
			 android.media.MediaPlayer .create ( v0,v1 );
			 try { // :try_start_0
				 v0 = com.a.d.a.e;
				 /* sget-boolean v1, Lcom/a/d/a;->d:Z */
				 (( android.media.MediaPlayer ) v0 ).setLooping ( v1 ); // invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setLooping(Z)V
				 v0 = com.a.d.a.e;
				 (( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
				 /* :try_end_0 */
				 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 } // :cond_0
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
		 v1 = java.lang.System.out;
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 final String v3 = "e===="; // const-string v3, "e===="
		 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 (( java.io.PrintStream ) v1 ).println ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
	 } // .end method

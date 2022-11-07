public class inal {
	 /* # static fields */
	 private static android.media.MediaPlayer a;
	 private static Boolean b;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 com.doodle.ltcsmyb.d.d.b = (v0!= 0);
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void a ( ) {
		 /* .locals 1 */
		 v0 = com.doodle.ltcsmyb.d.d.a;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = com.doodle.ltcsmyb.d.d.a;
			 (( android.media.MediaPlayer ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
		 return;
	 } // .end method
	 public static void a ( java.lang.String p0, android.content.Context p1 ) {
		 /* .locals 7 */
		 v0 = com.doodle.ltcsmyb.d.d.a;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Landroid/media/MediaPlayer; */
		 /* invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V */
	 } // :cond_0
	 try { // :try_start_0
		 (( android.content.Context ) p1 ).getAssets ( ); // invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
		 (( android.content.res.AssetManager ) v0 ).openFd ( p0 ); // invoke-virtual {v0, p0}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 try { // :try_start_1
			 v0 = com.doodle.ltcsmyb.d.d.a;
			 (( android.media.MediaPlayer ) v0 ).reset ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V
			 v0 = com.doodle.ltcsmyb.d.d.a;
			 int v1 = 1; // const/4 v1, 0x1
			 (( android.media.MediaPlayer ) v0 ).setLooping ( v1 ); // invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setLooping(Z)V
			 v0 = com.doodle.ltcsmyb.d.d.a;
			 (( android.content.res.AssetFileDescriptor ) v6 ).getFileDescriptor ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;
			 (( android.content.res.AssetFileDescriptor ) v6 ).getStartOffset ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J
			 /* move-result-wide v2 */
			 (( android.content.res.AssetFileDescriptor ) v6 ).getLength ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getLength()J
			 /* move-result-wide v4 */
			 /* invoke-virtual/range {v0 ..v5}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V */
			 v0 = com.doodle.ltcsmyb.d.d.a;
			 int v1 = 3; // const/4 v1, 0x3
			 (( android.media.MediaPlayer ) v0 ).setAudioStreamType ( v1 ); // invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V
			 (( android.content.res.AssetFileDescriptor ) v6 ).close ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->close()V
			 /* :try_end_1 */
			 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
			 /* .catch Ljava/lang/IllegalStateException; {:try_start_1 ..:try_end_1} :catch_2 */
			 try { // :try_start_2
				 v0 = com.doodle.ltcsmyb.d.d.a;
				 (( android.media.MediaPlayer ) v0 ).prepare ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V
				 /* :try_end_2 */
				 /* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_3 */
				 v0 = com.doodle.ltcsmyb.d.d.a;
				 (( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
			 } // :goto_0
			 return;
			 /* :catch_0 */
			 /* move-exception v0 */
			 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
			 /* :catch_1 */
			 /* move-exception v0 */
			 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
			 /* :catch_2 */
			 /* move-exception v0 */
			 (( java.lang.IllegalStateException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/IllegalStateException;->printStackTrace()V
			 /* :catch_3 */
			 /* move-exception v0 */
			 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
		 } // .end method
		 public static void b ( ) {
			 /* .locals 1 */
			 v0 = com.doodle.ltcsmyb.d.d.a;
			 /* if-nez v0, :cond_0 */
		 } // :goto_0
		 return;
	 } // :cond_0
	 v0 = com.doodle.ltcsmyb.d.d.a;
	 (( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
} // .end method
public static void c ( ) {
	 /* .locals 1 */
	 v0 = com.doodle.ltcsmyb.d.d.a;
	 /* if-nez v0, :cond_0 */
} // :goto_0
return;
} // :cond_0
v0 = com.doodle.ltcsmyb.d.d.a;
(( android.media.MediaPlayer ) v0 ).stop ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V
} // .end method
public static void d ( ) {
/* .locals 1 */
v0 = com.doodle.ltcsmyb.d.d.a;
/* if-nez v0, :cond_0 */
} // :goto_0
return;
} // :cond_0
v0 = com.doodle.ltcsmyb.d.d.a;
(( android.media.MediaPlayer ) v0 ).pause ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
} // .end method
public static android.media.MediaPlayer e ( ) {
/* .locals 1 */
v0 = com.doodle.ltcsmyb.d.d.a;
} // .end method

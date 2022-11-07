public class com.wiyun.engine.sound.AudioManager implements android.media.AudioTrack$OnPlaybackPositionUpdateListener {
	 /* # interfaces */
	 /* # static fields */
	 public static final Integer FORMAT_MP3;
	 public static final Integer FORMAT_OGG;
	 public static final Integer FORMAT_WAV;
	 private static java.lang.String sBgPath;
	 private static Integer sBgRepeatCount;
	 private static Integer sBgResId;
	 private static Float sBgVolume;
	 private static Boolean sCanPlay;
	 private static Float sEffectVolume;
	 private static Boolean sMute;
	 private static java.util.Map sPath2SoundIdMap;
	 private static android.media.MediaPlayer sPlayer;
	 private static Boolean sPlaying;
	 private static android.media.SoundPool sPool;
	 private static java.util.Map sResId2SoundIdMap;
	 private static java.util.Map sSoundId2StreamIdMap;
	 /* # direct methods */
	 public com.wiyun.engine.sound.AudioManager ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 static Integer access$0 ( ) { //synthethic
		 /* .locals 1 */
	 } // .end method
	 static void access$1 ( Integer p0 ) { //synthethic
		 /* .locals 0 */
		 return;
	 } // .end method
	 static android.media.MediaPlayer access$2 ( ) { //synthethic
		 /* .locals 1 */
		 v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
	 } // .end method
	 static void access$3 ( Boolean p0 ) { //synthethic
		 /* .locals 0 */
		 com.wiyun.engine.sound.AudioManager.sPlaying = (p0!= 0);
		 return;
	 } // .end method
	 static void access$4 ( Boolean p0 ) { //synthethic
		 /* .locals 0 */
		 com.wiyun.engine.sound.AudioManager.sCanPlay = (p0!= 0);
		 return;
	 } // .end method
	 static Boolean access$5 ( ) { //synthethic
		 /* .locals 1 */
		 /* sget-boolean v0, Lcom/wiyun/engine/sound/AudioManager;->sPlaying:Z */
	 } // .end method
	 static synchronized void destroyMediaPlayerBackend ( ) {
		 /* .locals 2 */
		 /* const-class v1, Lcom/wiyun/engine/sound/AudioManager; */
		 /* monitor-enter v1 */
		 try { // :try_start_0
			 v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
				 (( android.media.MediaPlayer ) v0 ).stop ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V
				 v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
				 (( android.media.MediaPlayer ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
				 int v0 = 0; // const/4 v0, 0x0
			 } // :cond_0
			 v0 = com.wiyun.engine.sound.AudioManager.sPool;
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 v0 = com.wiyun.engine.sound.AudioManager.sPool;
				 (( android.media.SoundPool ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/SoundPool;->release()V
				 int v0 = 0; // const/4 v0, 0x0
			 } // :cond_1
			 v0 = com.wiyun.engine.sound.AudioManager.sResId2SoundIdMap;
			 int v0 = 0; // const/4 v0, 0x0
			 v0 = com.wiyun.engine.sound.AudioManager.sPath2SoundIdMap;
			 int v0 = 0; // const/4 v0, 0x0
			 v0 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
			 int v0 = 0; // const/4 v0, 0x0
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* monitor-exit v1 */
			 return;
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* monitor-exit v1 */
			 /* throw v0 */
		 } // .end method
		 public static native Boolean isBackgroundMusicPaused ( ) {
		 } // .end method
		 public static native Boolean isBackgroundPlaying ( ) {
		 } // .end method
		 public static native Boolean isMuted ( ) {
		 } // .end method
		 static synchronized Boolean mpIsBackgroundPlaying ( ) {
			 /* .locals 2 */
			 /* const-class v1, Lcom/wiyun/engine/sound/AudioManager; */
			 /* monitor-enter v1 */
			 try { // :try_start_0
				 v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* if-nez v0, :cond_0 */
				 int v0 = 0; // const/4 v0, 0x0
			 } // :goto_0
			 /* monitor-exit v1 */
		 } // :cond_0
		 try { // :try_start_1
			 /* sget-boolean v0, Lcom/wiyun/engine/sound/AudioManager;->sPlaying:Z */
			 /* :try_end_1 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* monitor-exit v1 */
			 /* throw v0 */
		 } // .end method
		 static synchronized Boolean mpIsMute ( ) {
			 /* .locals 2 */
			 /* const-class v0, Lcom/wiyun/engine/sound/AudioManager; */
			 /* monitor-enter v0 */
			 try { // :try_start_0
				 /* sget-boolean v1, Lcom/wiyun/engine/sound/AudioManager;->sMute:Z */
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* monitor-exit v0 */
				 /* :catchall_0 */
				 /* move-exception v1 */
				 /* monitor-exit v0 */
				 /* throw v1 */
			 } // .end method
			 static synchronized void mpPauseBackgroundMusic ( ) {
				 /* .locals 2 */
				 /* const-class v1, Lcom/wiyun/engine/sound/AudioManager; */
				 /* monitor-enter v1 */
				 try { // :try_start_0
					 v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
					 /* :try_end_0 */
					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
					 /* if-nez v0, :cond_1 */
				 } // :cond_0
			 } // :goto_0
			 /* monitor-exit v1 */
			 return;
		 } // :cond_1
		 try { // :try_start_1
			 /* sget-boolean v0, Lcom/wiyun/engine/sound/AudioManager;->sPlaying:Z */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
				 (( android.media.MediaPlayer ) v0 ).pause ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
				 /* :try_end_1 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
				 /* :catchall_0 */
				 /* move-exception v0 */
				 /* monitor-exit v1 */
				 /* throw v0 */
			 } // .end method
			 static synchronized void mpPlayBackgroundMusic ( Integer p0, Integer p1, Integer p2 ) {
				 /* .locals 2 */
				 /* const-class v1, Lcom/wiyun/engine/sound/AudioManager; */
				 /* monitor-enter v1 */
				 try { // :try_start_0
					 v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
					 /* :try_end_0 */
					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
					 /* if-nez v0, :cond_1 */
				 } // :cond_0
			 } // :goto_0
			 /* monitor-exit v1 */
			 return;
		 } // :cond_1
		 try { // :try_start_1
			 /* sget-boolean v0, Lcom/wiyun/engine/sound/AudioManager;->sPlaying:Z */
			 /* if-nez v0, :cond_0 */
			 int v0 = 1; // const/4 v0, 0x1
			 com.wiyun.engine.sound.AudioManager.sPlaying = (v0!= 0);
			 /* if-eq v0, p0, :cond_2 */
			 int v0 = 0; // const/4 v0, 0x0
			 com.wiyun.engine.sound.AudioManager.sCanPlay = (v0!= 0);
			 com.wiyun.engine.sound.AudioManager .mpPreloadBackgroundMusic ( p0 );
		 } // :cond_2
		 /* sget-boolean v0, Lcom/wiyun/engine/sound/AudioManager;->sCanPlay:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
			 (( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
			 /* :try_end_1 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* monitor-exit v1 */
			 /* throw v0 */
		 } // .end method
		 static synchronized void mpPlayBackgroundMusic ( java.lang.String p0, Boolean p1, Integer p2 ) {
			 /* .locals 2 */
			 /* const-class v1, Lcom/wiyun/engine/sound/AudioManager; */
			 /* monitor-enter v1 */
			 try { // :try_start_0
				 v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* if-nez v0, :cond_1 */
			 } // :cond_0
		 } // :goto_0
		 /* monitor-exit v1 */
		 return;
	 } // :cond_1
	 try { // :try_start_1
		 /* sget-boolean v0, Lcom/wiyun/engine/sound/AudioManager;->sPlaying:Z */
		 /* if-nez v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
		 com.wiyun.engine.sound.AudioManager.sPlaying = (v0!= 0);
		 v0 = com.wiyun.engine.sound.AudioManager.sBgPath;
		 v0 = 		 (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 /* if-nez v0, :cond_2 */
		 int v0 = 0; // const/4 v0, 0x0
		 com.wiyun.engine.sound.AudioManager.sCanPlay = (v0!= 0);
		 com.wiyun.engine.sound.AudioManager .mpPreloadBackgroundMusic ( p0,p1 );
	 } // :cond_2
	 /* sget-boolean v0, Lcom/wiyun/engine/sound/AudioManager;->sCanPlay:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
		 (( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
		 /* :try_end_1 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
		 /* :catchall_0 */
		 /* move-exception v0 */
		 /* monitor-exit v1 */
		 /* throw v0 */
	 } // .end method
	 static synchronized void mpPlayEffect ( Integer p0 ) {
		 /* .locals 10 */
		 int v4 = 0; // const/4 v4, 0x0
		 /* const-class v9, Lcom/wiyun/engine/sound/AudioManager; */
		 /* monitor-enter v9 */
		 try { // :try_start_0
			 v1 = com.wiyun.engine.sound.AudioManager.sPool;
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 v1 = com.wiyun.engine.sound.AudioManager.sResId2SoundIdMap;
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* if-nez v1, :cond_1 */
			 } // :cond_0
		 } // :goto_0
		 /* monitor-exit v9 */
		 return;
	 } // :cond_1
	 try { // :try_start_1
		 com.wiyun.engine.sound.AudioManager .mpPreloadEffect ( p0 );
		 v1 = com.wiyun.engine.sound.AudioManager.sResId2SoundIdMap;
		 java.lang.Integer .valueOf ( p0 );
		 /* move-object v0, v1 */
		 /* check-cast v0, Ljava/lang/Integer; */
		 /* move-object v8, v0 */
		 if ( v8 != null) { // if-eqz v8, :cond_0
			 v1 = com.wiyun.engine.sound.AudioManager.sPool;
			 v2 = 			 (( java.lang.Integer ) v8 ).intValue ( ); // invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I
			 /* sget-boolean v3, Lcom/wiyun/engine/sound/AudioManager;->sMute:Z */
			 if ( v3 != null) { // if-eqz v3, :cond_2
				 /* move v3, v4 */
			 } // :goto_1
			 /* sget-boolean v5, Lcom/wiyun/engine/sound/AudioManager;->sMute:Z */
			 if ( v5 != null) { // if-eqz v5, :cond_3
			 } // :goto_2
			 int v5 = 0; // const/4 v5, 0x0
			 int v6 = 0; // const/4 v6, 0x0
			 /* const/high16 v7, 0x3f800000 # 1.0f */
			 v2 = 			 /* invoke-virtual/range {v1 ..v7}, Landroid/media/SoundPool;->play(IFFIIF)I */
			 /* if-nez v2, :cond_4 */
			 final String v1 = "libwiengine"; // const-string v1, "libwiengine"
			 /* new-instance v2, Ljava/lang/StringBuilder; */
			 final String v3 = "Failed to play sound resId: "; // const-string v3, "Failed to play sound resId: "
			 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 (( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 android.util.Log .w ( v1,v2 );
			 /* :try_end_1 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
			 /* :catchall_0 */
			 /* move-exception v1 */
			 /* monitor-exit v9 */
			 /* throw v1 */
		 } // :cond_2
		 try { // :try_start_2
		 } // :cond_3
	 } // :cond_4
	 v1 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
	 /* check-cast v1, Ljava/util/List; */
	 /* if-nez v1, :cond_5 */
	 /* new-instance v1, Ljava/util/ArrayList; */
	 /* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
	 v3 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
} // :cond_5
java.lang.Integer .valueOf ( v2 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
} // .end method
static synchronized void mpPlayEffect ( java.lang.String p0, Boolean p1 ) {
/* .locals 10 */
int v4 = 0; // const/4 v4, 0x0
/* const-class v9, Lcom/wiyun/engine/sound/AudioManager; */
/* monitor-enter v9 */
try { // :try_start_0
	 v1 = com.wiyun.engine.sound.AudioManager.sPool;
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 v1 = com.wiyun.engine.sound.AudioManager.sPath2SoundIdMap;
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* if-nez v1, :cond_1 */
	 } // :cond_0
} // :goto_0
/* monitor-exit v9 */
return;
} // :cond_1
try { // :try_start_1
com.wiyun.engine.sound.AudioManager .mpPreloadEffect ( p0,p1 );
v1 = com.wiyun.engine.sound.AudioManager.sPath2SoundIdMap;
/* move-object v0, v1 */
/* check-cast v0, Ljava/lang/Integer; */
/* move-object v8, v0 */
if ( v8 != null) { // if-eqz v8, :cond_0
	 v1 = com.wiyun.engine.sound.AudioManager.sPool;
	 v2 = 	 (( java.lang.Integer ) v8 ).intValue ( ); // invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I
	 /* sget-boolean v3, Lcom/wiyun/engine/sound/AudioManager;->sMute:Z */
	 if ( v3 != null) { // if-eqz v3, :cond_2
		 /* move v3, v4 */
	 } // :goto_1
	 /* sget-boolean v5, Lcom/wiyun/engine/sound/AudioManager;->sMute:Z */
	 if ( v5 != null) { // if-eqz v5, :cond_3
	 } // :goto_2
	 int v5 = 0; // const/4 v5, 0x0
	 int v6 = 0; // const/4 v6, 0x0
	 /* const/high16 v7, 0x3f800000 # 1.0f */
	 v2 = 	 /* invoke-virtual/range {v1 ..v7}, Landroid/media/SoundPool;->play(IFFIIF)I */
	 /* if-nez v2, :cond_4 */
	 final String v1 = "libwiengine"; // const-string v1, "libwiengine"
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 final String v3 = "Failed to play sound path: "; // const-string v3, "Failed to play sound path: "
	 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .w ( v1,v2 );
	 /* :try_end_1 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
	 /* :catchall_0 */
	 /* move-exception v1 */
	 /* monitor-exit v9 */
	 /* throw v1 */
} // :cond_2
try { // :try_start_2
} // :cond_3
} // :cond_4
v1 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
/* check-cast v1, Ljava/util/List; */
/* if-nez v1, :cond_5 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
v3 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
} // :cond_5
java.lang.Integer .valueOf ( v2 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
} // .end method
static synchronized void mpPreloadBackgroundMusic ( Integer p0 ) {
/* .locals 8 */
/* const-class v6, Lcom/wiyun/engine/sound/AudioManager; */
/* monitor-enter v6 */
try { // :try_start_0
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* if-nez v0, :cond_1 */
} // :cond_0
} // :goto_0
/* monitor-exit v6 */
return;
} // :cond_1
try { // :try_start_1
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).openRawResourceFd ( p0 ); // invoke-virtual {v0, p0}, Landroid/content/res/Resources;->openRawResourceFd(I)Landroid/content/res/AssetFileDescriptor;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
try { // :try_start_2
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
(( android.content.res.AssetFileDescriptor ) v7 ).getFileDescriptor ( ); // invoke-virtual {v7}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;
(( android.content.res.AssetFileDescriptor ) v7 ).getStartOffset ( ); // invoke-virtual {v7}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J
/* move-result-wide v2 */
(( android.content.res.AssetFileDescriptor ) v7 ).getLength ( ); // invoke-virtual {v7}, Landroid/content/res/AssetFileDescriptor;->getLength()J
/* move-result-wide v4 */
/* invoke-virtual/range {v0 ..v5}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V */
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
(( android.media.MediaPlayer ) v0 ).prepareAsync ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepareAsync()V
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
if ( v7 != null) { // if-eqz v7, :cond_0
try { // :try_start_3
(( android.content.res.AssetFileDescriptor ) v7 ).close ( ); // invoke-virtual {v7}, Landroid/content/res/AssetFileDescriptor;->close()V
/* :try_end_3 */
/* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_0 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
/* :catch_0 */
/* move-exception v0 */
/* :catch_1 */
/* move-exception v0 */
try { // :try_start_4
	 final String v0 = "libwiengine"; // const-string v0, "libwiengine"
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "Failed to preload background music: "; // const-string v2, "Failed to preload background music: "
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .w ( v0,v1 );
	 /* :try_end_4 */
	 /* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
	 if ( v7 != null) { // if-eqz v7, :cond_0
		 try { // :try_start_5
			 (( android.content.res.AssetFileDescriptor ) v7 ).close ( ); // invoke-virtual {v7}, Landroid/content/res/AssetFileDescriptor;->close()V
			 /* :try_end_5 */
			 /* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_2 */
			 /* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
			 /* :catch_2 */
			 /* move-exception v0 */
			 /* :catchall_0 */
			 /* move-exception v0 */
			 if ( v7 != null) { // if-eqz v7, :cond_2
				 try { // :try_start_6
					 (( android.content.res.AssetFileDescriptor ) v7 ).close ( ); // invoke-virtual {v7}, Landroid/content/res/AssetFileDescriptor;->close()V
					 /* :try_end_6 */
					 /* .catch Ljava/io/IOException; {:try_start_6 ..:try_end_6} :catch_3 */
					 /* .catchall {:try_start_6 ..:try_end_6} :catchall_1 */
				 } // :cond_2
			 } // :goto_1
			 try { // :try_start_7
				 /* throw v0 */
				 /* :try_end_7 */
				 /* .catchall {:try_start_7 ..:try_end_7} :catchall_1 */
				 /* :catchall_1 */
				 /* move-exception v0 */
				 /* monitor-exit v6 */
				 /* throw v0 */
				 /* :catch_3 */
				 /* move-exception v1 */
			 } // .end method
			 static synchronized void mpPreloadBackgroundMusic ( java.lang.String p0, Boolean p1 ) {
				 /* .locals 8 */
				 /* const-class v7, Lcom/wiyun/engine/sound/AudioManager; */
				 /* monitor-enter v7 */
				 try { // :try_start_0
					 v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
					 /* :try_end_0 */
					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
					 /* if-nez v0, :cond_1 */
				 } // :cond_0
			 } // :goto_0
			 /* monitor-exit v7 */
			 return;
		 } // :cond_1
		 int v0 = 0; // const/4 v0, 0x0
		 if ( p1 != null) { // if-eqz p1, :cond_2
			 try { // :try_start_1
				 v1 = com.wiyun.engine.sound.AudioManager.sPlayer;
				 (( android.media.MediaPlayer ) v1 ).setDataSource ( p0 ); // invoke-virtual {v1, p0}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V
				 /* :try_end_1 */
				 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
			 } // :goto_1
			 try { // :try_start_2
				 v1 = com.wiyun.engine.sound.AudioManager.sPlayer;
				 (( android.media.MediaPlayer ) v1 ).prepareAsync ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->prepareAsync()V
				 /* :try_end_2 */
				 /* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
				 /* .catchall {:try_start_2 ..:try_end_2} :catchall_3 */
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 try { // :try_start_3
						 (( android.content.res.AssetFileDescriptor ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->close()V
						 /* :try_end_3 */
						 /* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_0 */
						 /* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
						 /* :catch_0 */
						 /* move-exception v0 */
					 } // :cond_2
					 try { // :try_start_4
						 com.wiyun.engine.nodes.Director .getInstance ( );
						 (( com.wiyun.engine.nodes.Director ) v1 ).getContext ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
						 (( android.content.Context ) v1 ).getAssets ( ); // invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
						 (( android.content.res.AssetManager ) v1 ).openFd ( p0 ); // invoke-virtual {v1, p0}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
						 /* :try_end_4 */
						 /* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_1 */
						 /* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
						 try { // :try_start_5
							 v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
							 (( android.content.res.AssetFileDescriptor ) v6 ).getFileDescriptor ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;
							 (( android.content.res.AssetFileDescriptor ) v6 ).getStartOffset ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J
							 /* move-result-wide v2 */
							 (( android.content.res.AssetFileDescriptor ) v6 ).getLength ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getLength()J
							 /* move-result-wide v4 */
							 /* invoke-virtual/range {v0 ..v5}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V */
							 /* :try_end_5 */
							 /* .catch Ljava/lang/Exception; {:try_start_5 ..:try_end_5} :catch_4 */
							 /* .catchall {:try_start_5 ..:try_end_5} :catchall_2 */
							 /* move-object v0, v6 */
							 /* :catch_1 */
							 /* move-exception v1 */
						 } // :goto_2
						 try { // :try_start_6
							 final String v1 = "libwiengine"; // const-string v1, "libwiengine"
							 /* new-instance v2, Ljava/lang/StringBuilder; */
							 final String v3 = "Failed to preload background music: "; // const-string v3, "Failed to preload background music: "
							 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
							 (( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
							 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
							 android.util.Log .w ( v1,v2 );
							 /* :try_end_6 */
							 /* .catchall {:try_start_6 ..:try_end_6} :catchall_3 */
							 if ( v0 != null) { // if-eqz v0, :cond_0
								 try { // :try_start_7
									 (( android.content.res.AssetFileDescriptor ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->close()V
									 /* :try_end_7 */
									 /* .catch Ljava/io/IOException; {:try_start_7 ..:try_end_7} :catch_2 */
									 /* .catchall {:try_start_7 ..:try_end_7} :catchall_1 */
									 /* :catch_2 */
									 /* move-exception v0 */
									 /* :catchall_0 */
									 /* move-exception v1 */
									 /* move-object v6, v0 */
									 /* move-object v0, v1 */
								 } // :goto_3
								 if ( v6 != null) { // if-eqz v6, :cond_3
									 try { // :try_start_8
										 (( android.content.res.AssetFileDescriptor ) v6 ).close ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->close()V
										 /* :try_end_8 */
										 /* .catch Ljava/io/IOException; {:try_start_8 ..:try_end_8} :catch_3 */
										 /* .catchall {:try_start_8 ..:try_end_8} :catchall_1 */
									 } // :cond_3
								 } // :goto_4
								 try { // :try_start_9
									 /* throw v0 */
									 /* :try_end_9 */
									 /* .catchall {:try_start_9 ..:try_end_9} :catchall_1 */
									 /* :catchall_1 */
									 /* move-exception v0 */
									 /* monitor-exit v7 */
									 /* throw v0 */
									 /* :catch_3 */
									 /* move-exception v1 */
									 /* :catchall_2 */
									 /* move-exception v0 */
									 /* :catchall_3 */
									 /* move-exception v1 */
									 /* move-object v6, v0 */
									 /* move-object v0, v1 */
									 /* :catch_4 */
									 /* move-exception v0 */
									 /* move-object v0, v6 */
								 } // .end method
								 static synchronized void mpPreloadEffect ( Integer p0 ) {
									 /* .locals 4 */
									 /* const-class v1, Lcom/wiyun/engine/sound/AudioManager; */
									 /* monitor-enter v1 */
									 try { // :try_start_0
										 v0 = com.wiyun.engine.sound.AudioManager.sPool;
										 if ( v0 != null) { // if-eqz v0, :cond_0
											 v0 = com.wiyun.engine.sound.AudioManager.sResId2SoundIdMap;
											 /* :try_end_0 */
											 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
											 /* if-nez v0, :cond_1 */
										 } // :cond_0
									 } // :goto_0
									 /* monitor-exit v1 */
									 return;
								 } // :cond_1
								 try { // :try_start_1
									 v0 = com.wiyun.engine.sound.AudioManager.sResId2SoundIdMap;
									 v0 = 									 java.lang.Integer .valueOf ( p0 );
									 /* if-nez v0, :cond_0 */
									 v0 = com.wiyun.engine.sound.AudioManager.sPool;
									 com.wiyun.engine.nodes.Director .getInstance ( );
									 (( com.wiyun.engine.nodes.Director ) v2 ).getContext ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
									 int v3 = 0; // const/4 v3, 0x0
									 v0 = 									 (( android.media.SoundPool ) v0 ).load ( v2, p0, v3 ); // invoke-virtual {v0, v2, p0, v3}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I
									 v2 = com.wiyun.engine.sound.AudioManager.sResId2SoundIdMap;
									 java.lang.Integer .valueOf ( p0 );
									 java.lang.Integer .valueOf ( v0 );
									 /* :try_end_1 */
									 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
									 /* :catchall_0 */
									 /* move-exception v0 */
									 /* monitor-exit v1 */
									 /* throw v0 */
								 } // .end method
								 static synchronized void mpPreloadEffect ( java.lang.String p0, Boolean p1 ) {
									 /* .locals 5 */
									 /* const-class v2, Lcom/wiyun/engine/sound/AudioManager; */
									 /* monitor-enter v2 */
									 try { // :try_start_0
										 v0 = com.wiyun.engine.sound.AudioManager.sPool;
										 if ( v0 != null) { // if-eqz v0, :cond_0
											 v0 = com.wiyun.engine.sound.AudioManager.sPath2SoundIdMap;
											 /* :try_end_0 */
											 /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
											 /* if-nez v0, :cond_1 */
										 } // :cond_0
									 } // :goto_0
									 /* monitor-exit v2 */
									 return;
								 } // :cond_1
								 try { // :try_start_1
									 v0 = com.wiyun.engine.sound.AudioManager.sPath2SoundIdMap;
									 /* :try_end_1 */
									 v0 = 									 /* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
									 /* if-nez v0, :cond_0 */
									 int v0 = 0; // const/4 v0, 0x0
									 if ( p1 != null) { // if-eqz p1, :cond_3
										 try { // :try_start_2
											 v1 = com.wiyun.engine.sound.AudioManager.sPool;
											 int v3 = 0; // const/4 v3, 0x0
											 (( android.media.SoundPool ) v1 ).load ( p0, v3 ); // invoke-virtual {v1, p0, v3}, Landroid/media/SoundPool;->load(Ljava/lang/String;I)I
											 /* :try_end_2 */
											 /* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_1 */
											 v1 = 											 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
										 } // :goto_1
										 int v3 = -1; // const/4 v3, -0x1
										 /* if-eq v1, v3, :cond_2 */
										 try { // :try_start_3
											 v3 = com.wiyun.engine.sound.AudioManager.sPath2SoundIdMap;
											 java.lang.Integer .valueOf ( v1 );
											 /* :try_end_3 */
											 /* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_1 */
											 /* .catchall {:try_start_3 ..:try_end_3} :catchall_2 */
										 } // :cond_2
										 if ( v0 != null) { // if-eqz v0, :cond_0
											 try { // :try_start_4
												 (( android.content.res.AssetFileDescriptor ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->close()V
												 /* :try_end_4 */
												 /* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_0 */
												 /* .catchall {:try_start_4 ..:try_end_4} :catchall_1 */
												 /* :catch_0 */
												 /* move-exception v0 */
											 } // :cond_3
											 try { // :try_start_5
												 com.wiyun.engine.nodes.Director .getInstance ( );
												 (( com.wiyun.engine.nodes.Director ) v1 ).getContext ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
												 (( android.content.Context ) v1 ).getAssets ( ); // invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
												 (( android.content.res.AssetManager ) v1 ).openFd ( p0 ); // invoke-virtual {v1, p0}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
												 /* :try_end_5 */
												 /* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_1 */
												 /* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
												 try { // :try_start_6
													 v1 = com.wiyun.engine.sound.AudioManager.sPool;
													 int v3 = 0; // const/4 v3, 0x0
													 (( android.media.SoundPool ) v1 ).load ( v0, v3 ); // invoke-virtual {v1, v0, v3}, Landroid/media/SoundPool;->load(Landroid/content/res/AssetFileDescriptor;I)I
													 /* :try_end_6 */
													 /* .catch Ljava/io/IOException; {:try_start_6 ..:try_end_6} :catch_1 */
													 v1 = 													 /* .catchall {:try_start_6 ..:try_end_6} :catchall_2 */
													 /* :catch_1 */
													 /* move-exception v1 */
													 if ( v0 != null) { // if-eqz v0, :cond_0
														 try { // :try_start_7
															 (( android.content.res.AssetFileDescriptor ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->close()V
															 /* :try_end_7 */
															 /* .catch Ljava/io/IOException; {:try_start_7 ..:try_end_7} :catch_2 */
															 /* .catchall {:try_start_7 ..:try_end_7} :catchall_1 */
															 /* :catch_2 */
															 /* move-exception v0 */
															 /* :catchall_0 */
															 /* move-exception v1 */
															 /* move-object v4, v1 */
															 /* move-object v1, v0 */
															 /* move-object v0, v4 */
														 } // :goto_2
														 if ( v1 != null) { // if-eqz v1, :cond_4
															 try { // :try_start_8
																 (( android.content.res.AssetFileDescriptor ) v1 ).close ( ); // invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->close()V
																 /* :try_end_8 */
																 /* .catch Ljava/io/IOException; {:try_start_8 ..:try_end_8} :catch_3 */
																 /* .catchall {:try_start_8 ..:try_end_8} :catchall_1 */
															 } // :cond_4
														 } // :goto_3
														 try { // :try_start_9
															 /* throw v0 */
															 /* :try_end_9 */
															 /* .catchall {:try_start_9 ..:try_end_9} :catchall_1 */
															 /* :catchall_1 */
															 /* move-exception v0 */
															 /* monitor-exit v2 */
															 /* throw v0 */
															 /* :catch_3 */
															 /* move-exception v1 */
															 /* :catchall_2 */
															 /* move-exception v1 */
															 /* move-object v4, v1 */
															 /* move-object v1, v0 */
															 /* move-object v0, v4 */
														 } // .end method
														 static synchronized void mpRemoveAllEffects ( ) {
															 /* .locals 6 */
															 /* const-class v1, Lcom/wiyun/engine/sound/AudioManager; */
															 /* monitor-enter v1 */
															 try { // :try_start_0
																 v0 = com.wiyun.engine.sound.AudioManager.sPool;
																 if ( v0 != null) { // if-eqz v0, :cond_0
																	 v0 = com.wiyun.engine.sound.AudioManager.sResId2SoundIdMap;
																	 /* :try_end_0 */
																	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																	 /* if-nez v0, :cond_1 */
																 } // :cond_0
															 } // :goto_0
															 /* monitor-exit v1 */
															 return;
														 } // :cond_1
														 try { // :try_start_1
															 v0 = com.wiyun.engine.sound.AudioManager.sResId2SoundIdMap;
														 v0 = 														 } // :goto_1
														 /* if-nez v0, :cond_2 */
														 v0 = com.wiyun.engine.sound.AudioManager.sPath2SoundIdMap;
													 v0 = 													 } // :goto_2
													 /* if-nez v0, :cond_5 */
													 v0 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
													 v0 = com.wiyun.engine.sound.AudioManager.sResId2SoundIdMap;
													 v0 = com.wiyun.engine.sound.AudioManager.sPath2SoundIdMap;
													 /* :try_end_1 */
													 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
													 /* :catchall_0 */
													 /* move-exception v0 */
													 /* monitor-exit v1 */
													 /* throw v0 */
												 } // :cond_2
												 try { // :try_start_2
													 /* check-cast v0, Ljava/util/Map$Entry; */
													 /* check-cast v0, Ljava/lang/Integer; */
													 v3 = 													 (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
													 v0 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
													 java.lang.Integer .valueOf ( v3 );
													 /* check-cast v0, Ljava/util/List; */
													 if ( v0 != null) { // if-eqz v0, :cond_3
													 v0 = 													 } // :goto_3
													 /* if-nez v0, :cond_4 */
												 } // :cond_3
												 v0 = com.wiyun.engine.sound.AudioManager.sPool;
												 (( android.media.SoundPool ) v0 ).unload ( v3 ); // invoke-virtual {v0, v3}, Landroid/media/SoundPool;->unload(I)Z
											 } // :cond_4
											 /* check-cast v0, Ljava/lang/Integer; */
											 v0 = 											 (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
											 v5 = com.wiyun.engine.sound.AudioManager.sPool;
											 (( android.media.SoundPool ) v5 ).stop ( v0 ); // invoke-virtual {v5, v0}, Landroid/media/SoundPool;->stop(I)V
										 } // :cond_5
										 /* check-cast v0, Ljava/util/Map$Entry; */
										 /* check-cast v0, Ljava/lang/Integer; */
										 v3 = 										 (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
										 v0 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
										 java.lang.Integer .valueOf ( v3 );
										 /* check-cast v0, Ljava/util/List; */
										 if ( v0 != null) { // if-eqz v0, :cond_6
										 v0 = 										 } // :goto_4
										 /* if-nez v0, :cond_7 */
									 } // :cond_6
									 v0 = com.wiyun.engine.sound.AudioManager.sPool;
									 (( android.media.SoundPool ) v0 ).unload ( v3 ); // invoke-virtual {v0, v3}, Landroid/media/SoundPool;->unload(I)Z
									 /* goto/16 :goto_2 */
								 } // :cond_7
								 /* check-cast v0, Ljava/lang/Integer; */
								 v0 = 								 (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
								 v5 = com.wiyun.engine.sound.AudioManager.sPool;
								 (( android.media.SoundPool ) v5 ).stop ( v0 ); // invoke-virtual {v5, v0}, Landroid/media/SoundPool;->stop(I)V
								 /* :try_end_2 */
								 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
							 } // .end method
							 static synchronized void mpRemoveEffect ( Integer p0 ) {
								 /* .locals 5 */
								 /* const-class v2, Lcom/wiyun/engine/sound/AudioManager; */
								 /* monitor-enter v2 */
								 try { // :try_start_0
									 v0 = com.wiyun.engine.sound.AudioManager.sPool;
									 if ( v0 != null) { // if-eqz v0, :cond_0
										 v0 = com.wiyun.engine.sound.AudioManager.sResId2SoundIdMap;
										 /* :try_end_0 */
										 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
										 /* if-nez v0, :cond_1 */
									 } // :cond_0
								 } // :goto_0
								 /* monitor-exit v2 */
								 return;
							 } // :cond_1
							 try { // :try_start_1
								 v0 = com.wiyun.engine.sound.AudioManager.sResId2SoundIdMap;
								 java.lang.Integer .valueOf ( p0 );
								 /* check-cast v0, Ljava/lang/Integer; */
								 if ( v0 != null) { // if-eqz v0, :cond_0
									 v1 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
									 /* check-cast v1, Ljava/util/List; */
									 if ( v1 != null) { // if-eqz v1, :cond_2
									 v1 = 									 } // :goto_1
									 /* if-nez v1, :cond_3 */
								 } // :cond_2
								 v1 = com.wiyun.engine.sound.AudioManager.sPool;
								 v0 = 								 (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
								 (( android.media.SoundPool ) v1 ).unload ( v0 ); // invoke-virtual {v1, v0}, Landroid/media/SoundPool;->unload(I)Z
								 /* :try_end_1 */
								 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
								 /* :catchall_0 */
								 /* move-exception v0 */
								 /* monitor-exit v2 */
								 /* throw v0 */
							 } // :cond_3
							 try { // :try_start_2
								 /* check-cast v1, Ljava/lang/Integer; */
								 v1 = 								 (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
								 v4 = com.wiyun.engine.sound.AudioManager.sPool;
								 (( android.media.SoundPool ) v4 ).stop ( v1 ); // invoke-virtual {v4, v1}, Landroid/media/SoundPool;->stop(I)V
								 /* :try_end_2 */
								 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
							 } // .end method
							 static synchronized void mpRemoveEffect ( java.lang.String p0 ) {
								 /* .locals 5 */
								 /* const-class v2, Lcom/wiyun/engine/sound/AudioManager; */
								 /* monitor-enter v2 */
								 try { // :try_start_0
									 v0 = com.wiyun.engine.sound.AudioManager.sPool;
									 if ( v0 != null) { // if-eqz v0, :cond_0
										 v0 = com.wiyun.engine.sound.AudioManager.sPath2SoundIdMap;
										 /* :try_end_0 */
										 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
										 /* if-nez v0, :cond_1 */
									 } // :cond_0
								 } // :goto_0
								 /* monitor-exit v2 */
								 return;
							 } // :cond_1
							 try { // :try_start_1
								 v0 = com.wiyun.engine.sound.AudioManager.sPath2SoundIdMap;
								 /* check-cast v0, Ljava/lang/Integer; */
								 if ( v0 != null) { // if-eqz v0, :cond_0
									 v1 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
									 /* check-cast v1, Ljava/util/List; */
									 if ( v1 != null) { // if-eqz v1, :cond_2
									 v1 = 									 } // :goto_1
									 /* if-nez v1, :cond_3 */
								 } // :cond_2
								 v1 = com.wiyun.engine.sound.AudioManager.sPool;
								 v0 = 								 (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
								 (( android.media.SoundPool ) v1 ).unload ( v0 ); // invoke-virtual {v1, v0}, Landroid/media/SoundPool;->unload(I)Z
								 /* :try_end_1 */
								 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
								 /* :catchall_0 */
								 /* move-exception v0 */
								 /* monitor-exit v2 */
								 /* throw v0 */
							 } // :cond_3
							 try { // :try_start_2
								 /* check-cast v1, Ljava/lang/Integer; */
								 v1 = 								 (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
								 v4 = com.wiyun.engine.sound.AudioManager.sPool;
								 (( android.media.SoundPool ) v4 ).stop ( v1 ); // invoke-virtual {v4, v1}, Landroid/media/SoundPool;->stop(I)V
								 /* :try_end_2 */
								 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
							 } // .end method
							 static synchronized void mpResumeBackgroundMusic ( ) {
								 /* .locals 2 */
								 /* const-class v1, Lcom/wiyun/engine/sound/AudioManager; */
								 /* monitor-enter v1 */
								 try { // :try_start_0
									 v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
									 /* :try_end_0 */
									 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
									 /* if-nez v0, :cond_1 */
								 } // :cond_0
							 } // :goto_0
							 /* monitor-exit v1 */
							 return;
						 } // :cond_1
						 try { // :try_start_1
							 /* sget-boolean v0, Lcom/wiyun/engine/sound/AudioManager;->sPlaying:Z */
							 if ( v0 != null) { // if-eqz v0, :cond_0
								 v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
								 (( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
								 /* :try_end_1 */
								 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
								 /* :catchall_0 */
								 /* move-exception v0 */
								 /* monitor-exit v1 */
								 /* throw v0 */
							 } // .end method
							 static synchronized void mpSetBackgroundVolume ( Float p0 ) {
								 /* .locals 2 */
								 /* const-class v1, Lcom/wiyun/engine/sound/AudioManager; */
								 /* monitor-enter v1 */
								 try { // :try_start_0
									 v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
									 /* :try_end_0 */
									 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
									 /* if-nez v0, :cond_1 */
								 } // :cond_0
							 } // :goto_0
							 /* monitor-exit v1 */
							 return;
						 } // :cond_1
						 try { // :try_start_1
							 /* sget-boolean v0, Lcom/wiyun/engine/sound/AudioManager;->sMute:Z */
							 /* if-nez v0, :cond_0 */
							 v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
							 (( android.media.MediaPlayer ) v0 ).setVolume ( p0, p0 ); // invoke-virtual {v0, p0, p0}, Landroid/media/MediaPlayer;->setVolume(FF)V
							 /* :try_end_1 */
							 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
							 /* :catchall_0 */
							 /* move-exception v0 */
							 /* monitor-exit v1 */
							 /* throw v0 */
						 } // .end method
						 static synchronized void mpSetEffectVolume ( Float p0 ) {
							 /* .locals 7 */
							 /* const-class v1, Lcom/wiyun/engine/sound/AudioManager; */
							 /* monitor-enter v1 */
							 try { // :try_start_0
								 v0 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
							 } // :cond_0
							 /* :try_end_0 */
							 v0 = 							 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
							 /* if-nez v0, :cond_1 */
							 /* monitor-exit v1 */
							 return;
						 } // :cond_1
						 try { // :try_start_1
							 /* check-cast v0, Ljava/util/Map$Entry; */
							 /* check-cast v0, Ljava/util/List; */
						 v0 = 						 } // :goto_0
						 if ( v0 != null) { // if-eqz v0, :cond_0
							 /* check-cast v0, Ljava/lang/Integer; */
							 v4 = com.wiyun.engine.sound.AudioManager.sPool;
							 v0 = 							 (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
							 (( android.media.SoundPool ) v4 ).setVolume ( v0, v5, v6 ); // invoke-virtual {v4, v0, v5, v6}, Landroid/media/SoundPool;->setVolume(IFF)V
							 /* :try_end_1 */
							 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
							 /* :catchall_0 */
							 /* move-exception v0 */
							 /* monitor-exit v1 */
							 /* throw v0 */
						 } // .end method
						 static synchronized void mpSetMute ( Boolean p0 ) {
							 /* .locals 7 */
							 /* const-class v1, Lcom/wiyun/engine/sound/AudioManager; */
							 /* monitor-enter v1 */
							 try { // :try_start_0
								 v0 = com.wiyun.engine.sound.AudioManager.sPool;
								 /* :try_end_0 */
								 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
								 /* if-nez v0, :cond_1 */
							 } // :cond_0
							 /* monitor-exit v1 */
							 return;
						 } // :cond_1
						 try { // :try_start_1
							 v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
							 if ( v0 != null) { // if-eqz v0, :cond_0
								 /* sget-boolean v0, Lcom/wiyun/engine/sound/AudioManager;->sMute:Z */
								 /* if-eq v0, p0, :cond_0 */
								 com.wiyun.engine.sound.AudioManager.sMute = (p0!= 0);
								 if ( p0 != null) { // if-eqz p0, :cond_3
									 v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
									 int v2 = 0; // const/4 v2, 0x0
									 int v3 = 0; // const/4 v3, 0x0
									 (( android.media.MediaPlayer ) v0 ).setVolume ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/media/MediaPlayer;->setVolume(FF)V
									 v0 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
								 v0 = 								 } // :cond_2
								 if ( v0 != null) { // if-eqz v0, :cond_0
									 /* check-cast v0, Ljava/util/Map$Entry; */
									 /* check-cast v0, Ljava/util/List; */
								 v0 = 								 } // :goto_0
								 if ( v0 != null) { // if-eqz v0, :cond_2
									 /* check-cast v0, Ljava/lang/Integer; */
									 v0 = 									 (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
									 v4 = com.wiyun.engine.sound.AudioManager.sPool;
									 int v5 = 0; // const/4 v5, 0x0
									 int v6 = 0; // const/4 v6, 0x0
									 (( android.media.SoundPool ) v4 ).setVolume ( v0, v5, v6 ); // invoke-virtual {v4, v0, v5, v6}, Landroid/media/SoundPool;->setVolume(IFF)V
									 /* :try_end_1 */
									 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
									 /* :catchall_0 */
									 /* move-exception v0 */
									 /* monitor-exit v1 */
									 /* throw v0 */
								 } // :cond_3
								 try { // :try_start_2
									 v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
									 (( android.media.MediaPlayer ) v0 ).setVolume ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/media/MediaPlayer;->setVolume(FF)V
									 v0 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
								 v0 = 								 } // :cond_4
								 if ( v0 != null) { // if-eqz v0, :cond_0
									 /* check-cast v0, Ljava/util/Map$Entry; */
									 /* check-cast v0, Ljava/util/List; */
								 v0 = 								 } // :goto_1
								 if ( v0 != null) { // if-eqz v0, :cond_4
									 /* check-cast v0, Ljava/lang/Integer; */
									 v0 = 									 (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
									 v4 = com.wiyun.engine.sound.AudioManager.sPool;
									 (( android.media.SoundPool ) v4 ).setVolume ( v0, v5, v6 ); // invoke-virtual {v4, v0, v5, v6}, Landroid/media/SoundPool;->setVolume(IFF)V
									 /* :try_end_2 */
									 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
								 } // .end method
								 static synchronized void mpStopBackgroundMusic ( ) {
									 /* .locals 2 */
									 /* const-class v1, Lcom/wiyun/engine/sound/AudioManager; */
									 /* monitor-enter v1 */
									 try { // :try_start_0
										 v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
										 /* :try_end_0 */
										 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
										 /* if-nez v0, :cond_1 */
									 } // :cond_0
								 } // :goto_0
								 /* monitor-exit v1 */
								 return;
							 } // :cond_1
							 try { // :try_start_1
								 /* sget-boolean v0, Lcom/wiyun/engine/sound/AudioManager;->sPlaying:Z */
								 if ( v0 != null) { // if-eqz v0, :cond_0
									 v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
									 (( android.media.MediaPlayer ) v0 ).stop ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V
									 v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
									 (( android.media.MediaPlayer ) v0 ).reset ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V
									 int v0 = 0; // const/4 v0, 0x0
									 int v0 = 0; // const/4 v0, 0x0
									 int v0 = 0; // const/4 v0, 0x0
									 com.wiyun.engine.sound.AudioManager.sPlaying = (v0!= 0);
									 /* :try_end_1 */
									 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
									 /* :catchall_0 */
									 /* move-exception v0 */
									 /* monitor-exit v1 */
									 /* throw v0 */
								 } // .end method
								 static synchronized void mpStopEffect ( Integer p0 ) {
									 /* .locals 5 */
									 /* const-class v2, Lcom/wiyun/engine/sound/AudioManager; */
									 /* monitor-enter v2 */
									 try { // :try_start_0
										 v0 = com.wiyun.engine.sound.AudioManager.sPool;
										 if ( v0 != null) { // if-eqz v0, :cond_0
											 v0 = com.wiyun.engine.sound.AudioManager.sResId2SoundIdMap;
											 /* :try_end_0 */
											 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
											 /* if-nez v0, :cond_1 */
										 } // :cond_0
									 } // :goto_0
									 /* monitor-exit v2 */
									 return;
								 } // :cond_1
								 try { // :try_start_1
									 v0 = com.wiyun.engine.sound.AudioManager.sResId2SoundIdMap;
									 v0 = 									 java.lang.Integer .valueOf ( p0 );
									 if ( v0 != null) { // if-eqz v0, :cond_0
										 v0 = com.wiyun.engine.sound.AudioManager.sResId2SoundIdMap;
										 java.lang.Integer .valueOf ( p0 );
										 /* check-cast v0, Ljava/lang/Integer; */
										 if ( v0 != null) { // if-eqz v0, :cond_0
											 v1 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
											 /* check-cast v1, Ljava/util/List; */
											 if ( v1 != null) { // if-eqz v1, :cond_0
											 v1 = 											 } // :goto_1
											 /* if-nez v1, :cond_2 */
											 v1 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
											 /* :try_end_1 */
											 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
											 /* :catchall_0 */
											 /* move-exception v0 */
											 /* monitor-exit v2 */
											 /* throw v0 */
										 } // :cond_2
										 try { // :try_start_2
											 /* check-cast v1, Ljava/lang/Integer; */
											 v1 = 											 (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
											 v4 = com.wiyun.engine.sound.AudioManager.sPool;
											 (( android.media.SoundPool ) v4 ).stop ( v1 ); // invoke-virtual {v4, v1}, Landroid/media/SoundPool;->stop(I)V
											 /* :try_end_2 */
											 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
										 } // .end method
										 static synchronized void mpStopEffect ( java.lang.String p0 ) {
											 /* .locals 5 */
											 /* const-class v2, Lcom/wiyun/engine/sound/AudioManager; */
											 /* monitor-enter v2 */
											 try { // :try_start_0
												 v0 = com.wiyun.engine.sound.AudioManager.sPool;
												 if ( v0 != null) { // if-eqz v0, :cond_0
													 v0 = com.wiyun.engine.sound.AudioManager.sPath2SoundIdMap;
													 /* :try_end_0 */
													 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
													 /* if-nez v0, :cond_1 */
												 } // :cond_0
											 } // :goto_0
											 /* monitor-exit v2 */
											 return;
										 } // :cond_1
										 try { // :try_start_1
											 v0 = 											 v0 = com.wiyun.engine.sound.AudioManager.sPath2SoundIdMap;
											 if ( v0 != null) { // if-eqz v0, :cond_0
												 v0 = com.wiyun.engine.sound.AudioManager.sPath2SoundIdMap;
												 /* check-cast v0, Ljava/lang/Integer; */
												 if ( v0 != null) { // if-eqz v0, :cond_0
													 v1 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
													 /* check-cast v1, Ljava/util/List; */
													 if ( v1 != null) { // if-eqz v1, :cond_0
													 v1 = 													 } // :goto_1
													 /* if-nez v1, :cond_2 */
													 v1 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
													 /* :try_end_1 */
													 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
													 /* :catchall_0 */
													 /* move-exception v0 */
													 /* monitor-exit v2 */
													 /* throw v0 */
												 } // :cond_2
												 try { // :try_start_2
													 /* check-cast v1, Ljava/lang/Integer; */
													 v1 = 													 (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
													 v4 = com.wiyun.engine.sound.AudioManager.sPool;
													 (( android.media.SoundPool ) v4 ).stop ( v1 ); // invoke-virtual {v4, v1}, Landroid/media/SoundPool;->stop(I)V
													 /* :try_end_2 */
													 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
												 } // .end method
												 private static native void onPeriodicNotification ( ) {
												 } // .end method
												 public static native void pauseBackgroundMusic ( ) {
												 } // .end method
												 public static native void playBackgroundMusic ( Integer p0 ) {
												 } // .end method
												 public static native void playBackgroundMusic ( Integer p0, Integer p1, Integer p2 ) {
												 } // .end method
												 public static native void playBackgroundMusic ( java.lang.String p0, Boolean p1, Integer p2 ) {
												 } // .end method
												 public static native void playEffect ( Integer p0 ) {
												 } // .end method
												 public static native void playEffect ( Integer p0, Integer p1 ) {
												 } // .end method
												 public static void playEffect ( java.lang.String p0 ) {
													 /* .locals 1 */
													 int v0 = 0; // const/4 v0, 0x0
													 com.wiyun.engine.sound.AudioManager .playEffect ( p0,v0 );
													 return;
												 } // .end method
												 public static native void playEffect ( java.lang.String p0, Boolean p1 ) {
												 } // .end method
												 public static native void preloadBackgroundMusic ( Integer p0 ) {
												 } // .end method
												 public static native void preloadBackgroundMusic ( Integer p0, Integer p1 ) {
												 } // .end method
												 public static native void preloadBackgroundMusic ( java.lang.String p0, Boolean p1 ) {
												 } // .end method
												 public static native void preloadEffect ( Integer p0 ) {
												 } // .end method
												 public static native void preloadEffect ( Integer p0, Integer p1 ) {
												 } // .end method
												 public static void preloadEffect ( java.lang.String p0 ) {
													 /* .locals 1 */
													 int v0 = 0; // const/4 v0, 0x0
													 com.wiyun.engine.sound.AudioManager .preloadEffect ( p0,v0 );
													 return;
												 } // .end method
												 public static native void preloadEffect ( java.lang.String p0, Boolean p1 ) {
												 } // .end method
												 public static native void removeAllEffects ( ) {
												 } // .end method
												 public static native void removeEffect ( Integer p0 ) {
												 } // .end method
												 public static native void removeEffect ( java.lang.String p0 ) {
												 } // .end method
												 public static native void resumeBackgroundMusic ( ) {
												 } // .end method
												 public static native void setBackgroundVolume ( Float p0 ) {
												 } // .end method
												 public static native void setEffectVolume ( Float p0 ) {
												 } // .end method
												 public static native void setMute ( Boolean p0 ) {
												 } // .end method
												 static synchronized void setupMediaPlayerBackend ( ) {
													 /* .locals 5 */
													 /* const-class v1, Lcom/wiyun/engine/sound/AudioManager; */
													 /* monitor-enter v1 */
													 try { // :try_start_0
														 /* new-instance v0, Landroid/media/SoundPool; */
														 /* const/16 v2, 0xa */
														 int v3 = 3; // const/4 v3, 0x3
														 int v4 = 0; // const/4 v4, 0x0
														 /* invoke-direct {v0, v2, v3, v4}, Landroid/media/SoundPool;-><init>(III)V */
														 /* new-instance v0, Ljava/util/HashMap; */
														 /* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
														 /* new-instance v0, Ljava/util/HashMap; */
														 /* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
														 /* new-instance v0, Ljava/util/HashMap; */
														 /* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
														 int v0 = -1; // const/4 v0, -0x1
														 int v0 = 0; // const/4 v0, 0x0
														 com.wiyun.engine.sound.AudioManager.sPlaying = (v0!= 0);
														 /* const/high16 v0, 0x3f800000 # 1.0f */
														 /* const/high16 v0, 0x3f800000 # 1.0f */
														 int v0 = 0; // const/4 v0, 0x0
														 int v0 = 0; // const/4 v0, 0x0
														 int v0 = 0; // const/4 v0, 0x0
														 com.wiyun.engine.sound.AudioManager.sMute = (v0!= 0);
														 int v0 = 0; // const/4 v0, 0x0
														 com.wiyun.engine.sound.AudioManager.sCanPlay = (v0!= 0);
														 /* new-instance v0, Landroid/media/MediaPlayer; */
														 /* invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V */
														 int v2 = 0; // const/4 v2, 0x0
														 (( android.media.MediaPlayer ) v0 ).setLooping ( v2 ); // invoke-virtual {v0, v2}, Landroid/media/MediaPlayer;->setLooping(Z)V
														 v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
														 int v2 = 3; // const/4 v2, 0x3
														 (( android.media.MediaPlayer ) v0 ).setAudioStreamType ( v2 ); // invoke-virtual {v0, v2}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V
														 v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
														 /* new-instance v2, Lcom/wiyun/engine/sound/AudioManager$1; */
														 /* invoke-direct {v2}, Lcom/wiyun/engine/sound/AudioManager$1;-><init>()V */
														 (( android.media.MediaPlayer ) v0 ).setOnCompletionListener ( v2 ); // invoke-virtual {v0, v2}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V
														 v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
														 /* new-instance v2, Lcom/wiyun/engine/sound/AudioManager$2; */
														 /* invoke-direct {v2}, Lcom/wiyun/engine/sound/AudioManager$2;-><init>()V */
														 (( android.media.MediaPlayer ) v0 ).setOnPreparedListener ( v2 ); // invoke-virtual {v0, v2}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V
														 /* :try_end_0 */
														 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
														 /* monitor-exit v1 */
														 return;
														 /* :catchall_0 */
														 /* move-exception v0 */
														 /* monitor-exit v1 */
														 /* throw v0 */
													 } // .end method
													 public static native void stopBackgroundMusic ( ) {
													 } // .end method
													 public static native void stopEffect ( Integer p0 ) {
													 } // .end method
													 public static void stopEffect ( java.lang.String p0 ) {
														 /* .locals 1 */
														 int v0 = 0; // const/4 v0, 0x0
														 com.wiyun.engine.sound.AudioManager .stopEffect ( p0,v0 );
														 return;
													 } // .end method
													 public static native void stopEffect ( java.lang.String p0, Boolean p1 ) {
													 } // .end method
													 /* # virtual methods */
													 public void onMarkerReached ( android.media.AudioTrack p0 ) {
														 /* .locals 0 */
														 return;
													 } // .end method
													 public void onPeriodicNotification ( android.media.AudioTrack p0 ) {
														 /* .locals 0 */
														 com.wiyun.engine.sound.AudioManager .onPeriodicNotification ( );
														 return;
													 } // .end method

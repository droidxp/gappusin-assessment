public class org.anddev.andengine.audio.music.MusicFactory {
	 /* # static fields */
	 private static java.lang.String sAssetBasePath;
	 /* # direct methods */
	 static org.anddev.andengine.audio.music.MusicFactory ( ) {
		 /* .locals 1 */
		 final String v0 = ""; // const-string v0, ""
		 return;
	 } // .end method
	 public org.anddev.andengine.audio.music.MusicFactory ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.audio.music.Music createMusicFromAsset ( org.anddev.andengine.audio.music.MusicManager p0, android.content.Context p1, java.lang.String p2 ) {
		 /* .locals 6 */
		 /* new-instance v0, Landroid/media/MediaPlayer; */
		 /* invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V */
		 (( android.content.Context ) p1 ).getAssets ( ); // invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 v3 = org.anddev.andengine.audio.music.MusicFactory.sAssetBasePath;
		 java.lang.String .valueOf ( v3 );
		 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 (( android.content.res.AssetManager ) v1 ).openFd ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
		 (( android.content.res.AssetFileDescriptor ) v4 ).getFileDescriptor ( ); // invoke-virtual {v4}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;
		 (( android.content.res.AssetFileDescriptor ) v4 ).getStartOffset ( ); // invoke-virtual {v4}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J
		 /* move-result-wide v2 */
		 (( android.content.res.AssetFileDescriptor ) v4 ).getLength ( ); // invoke-virtual {v4}, Landroid/content/res/AssetFileDescriptor;->getLength()J
		 /* move-result-wide v4 */
		 /* invoke-virtual/range {v0 ..v5}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V */
		 (( android.media.MediaPlayer ) v0 ).prepare ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V
		 /* new-instance v1, Lorg/anddev/andengine/audio/music/Music; */
		 /* invoke-direct {v1, p0, v0}, Lorg/anddev/andengine/audio/music/Music;-><init>(Lorg/anddev/andengine/audio/music/MusicManager;Landroid/media/MediaPlayer;)V */
		 (( org.anddev.andengine.audio.music.MusicManager ) p0 ).add ( v1 ); // invoke-virtual {p0, v1}, Lorg/anddev/andengine/audio/music/MusicManager;->add(Lorg/anddev/andengine/audio/IAudioEntity;)V
	 } // .end method
	 public static org.anddev.andengine.audio.music.Music createMusicFromFile ( org.anddev.andengine.audio.music.MusicManager p0, java.io.File p1 ) {
		 /* .locals 2 */
		 /* new-instance v0, Landroid/media/MediaPlayer; */
		 /* invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V */
		 /* new-instance v1, Ljava/io/FileInputStream; */
		 /* invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
		 (( java.io.FileInputStream ) v1 ).getFD ( ); // invoke-virtual {v1}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;
		 (( android.media.MediaPlayer ) v0 ).setDataSource ( v1 ); // invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;)V
		 (( android.media.MediaPlayer ) v0 ).prepare ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V
		 /* new-instance v1, Lorg/anddev/andengine/audio/music/Music; */
		 /* invoke-direct {v1, p0, v0}, Lorg/anddev/andengine/audio/music/Music;-><init>(Lorg/anddev/andengine/audio/music/MusicManager;Landroid/media/MediaPlayer;)V */
		 (( org.anddev.andengine.audio.music.MusicManager ) p0 ).add ( v1 ); // invoke-virtual {p0, v1}, Lorg/anddev/andengine/audio/music/MusicManager;->add(Lorg/anddev/andengine/audio/IAudioEntity;)V
	 } // .end method
	 public static org.anddev.andengine.audio.music.Music createMusicFromResource ( org.anddev.andengine.audio.music.MusicManager p0, android.content.Context p1, Integer p2 ) {
		 /* .locals 2 */
		 android.media.MediaPlayer .create ( p1,p2 );
		 (( android.media.MediaPlayer ) v0 ).prepare ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V
		 /* new-instance v1, Lorg/anddev/andengine/audio/music/Music; */
		 /* invoke-direct {v1, p0, v0}, Lorg/anddev/andengine/audio/music/Music;-><init>(Lorg/anddev/andengine/audio/music/MusicManager;Landroid/media/MediaPlayer;)V */
		 (( org.anddev.andengine.audio.music.MusicManager ) p0 ).add ( v1 ); // invoke-virtual {p0, v1}, Lorg/anddev/andengine/audio/music/MusicManager;->add(Lorg/anddev/andengine/audio/IAudioEntity;)V
	 } // .end method
	 public static void reset ( ) {
		 /* .locals 1 */
		 final String v0 = ""; // const-string v0, ""
		 org.anddev.andengine.audio.music.MusicFactory .setAssetBasePath ( v0 );
		 return;
	 } // .end method
	 public static void setAssetBasePath ( java.lang.String p0 ) {
		 /* .locals 2 */
		 final String v0 = "/"; // const-string v0, "/"
		 v0 = 		 (( java.lang.String ) p0 ).endsWith ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
		 /* if-nez v0, :cond_0 */
		 v0 = 		 (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
		 /* if-nez v0, :cond_1 */
	 } // :cond_0
	 return;
} // :cond_1
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "pAssetBasePath must end with \'/\' or be lenght zero."; // const-string v1, "pAssetBasePath must end with \'/\' or be lenght zero."
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method

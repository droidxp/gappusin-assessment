public class org.anddev.andengine.audio.sound.SoundFactory {
	 /* # static fields */
	 private static java.lang.String sAssetBasePath;
	 /* # direct methods */
	 static org.anddev.andengine.audio.sound.SoundFactory ( ) {
		 /* .locals 1 */
		 final String v0 = ""; // const-string v0, ""
		 return;
	 } // .end method
	 public org.anddev.andengine.audio.sound.SoundFactory ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.audio.sound.Sound createSoundFromAsset ( org.anddev.andengine.audio.sound.SoundManager p0, android.content.Context p1, java.lang.String p2 ) {
		 /* .locals 4 */
		 (( org.anddev.andengine.audio.sound.SoundManager ) p0 ).getSoundPool ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/audio/sound/SoundManager;->getSoundPool()Landroid/media/SoundPool;
		 (( android.content.Context ) p1 ).getAssets ( ); // invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 v3 = org.anddev.andengine.audio.sound.SoundFactory.sAssetBasePath;
		 java.lang.String .valueOf ( v3 );
		 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 (( android.content.res.AssetManager ) v1 ).openFd ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
		 int v2 = 1; // const/4 v2, 0x1
		 v0 = 		 (( android.media.SoundPool ) v0 ).load ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/media/SoundPool;->load(Landroid/content/res/AssetFileDescriptor;I)I
		 /* new-instance v1, Lorg/anddev/andengine/audio/sound/Sound; */
		 /* invoke-direct {v1, p0, v0}, Lorg/anddev/andengine/audio/sound/Sound;-><init>(Lorg/anddev/andengine/audio/sound/SoundManager;I)V */
		 (( org.anddev.andengine.audio.sound.SoundManager ) p0 ).add ( v1 ); // invoke-virtual {p0, v1}, Lorg/anddev/andengine/audio/sound/SoundManager;->add(Lorg/anddev/andengine/audio/IAudioEntity;)V
	 } // .end method
	 public static org.anddev.andengine.audio.sound.Sound createSoundFromFileDescriptor ( org.anddev.andengine.audio.sound.SoundManager p0, java.io.FileDescriptor p1, Long p2, Long p3 ) {
		 /* .locals 7 */
		 (( org.anddev.andengine.audio.sound.SoundManager ) p0 ).getSoundPool ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/audio/sound/SoundManager;->getSoundPool()Landroid/media/SoundPool;
		 int v6 = 1; // const/4 v6, 0x1
		 /* move-object v1, p1 */
		 /* move-wide v2, p2 */
		 /* move-wide v4, p4 */
		 v0 = 		 /* invoke-virtual/range {v0 ..v6}, Landroid/media/SoundPool;->load(Ljava/io/FileDescriptor;JJI)I */
		 /* new-instance v1, Lorg/anddev/andengine/audio/sound/Sound; */
		 /* invoke-direct {v1, p0, v0}, Lorg/anddev/andengine/audio/sound/Sound;-><init>(Lorg/anddev/andengine/audio/sound/SoundManager;I)V */
		 (( org.anddev.andengine.audio.sound.SoundManager ) p0 ).add ( v1 ); // invoke-virtual {p0, v1}, Lorg/anddev/andengine/audio/sound/SoundManager;->add(Lorg/anddev/andengine/audio/IAudioEntity;)V
	 } // .end method
	 public static org.anddev.andengine.audio.sound.Sound createSoundFromPath ( org.anddev.andengine.audio.sound.SoundManager p0, java.lang.String p1 ) {
		 /* .locals 2 */
		 (( org.anddev.andengine.audio.sound.SoundManager ) p0 ).getSoundPool ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/audio/sound/SoundManager;->getSoundPool()Landroid/media/SoundPool;
		 int v1 = 1; // const/4 v1, 0x1
		 v0 = 		 (( android.media.SoundPool ) v0 ).load ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/media/SoundPool;->load(Ljava/lang/String;I)I
		 /* new-instance v1, Lorg/anddev/andengine/audio/sound/Sound; */
		 /* invoke-direct {v1, p0, v0}, Lorg/anddev/andengine/audio/sound/Sound;-><init>(Lorg/anddev/andengine/audio/sound/SoundManager;I)V */
		 (( org.anddev.andengine.audio.sound.SoundManager ) p0 ).add ( v1 ); // invoke-virtual {p0, v1}, Lorg/anddev/andengine/audio/sound/SoundManager;->add(Lorg/anddev/andengine/audio/IAudioEntity;)V
	 } // .end method
	 public static org.anddev.andengine.audio.sound.Sound createSoundFromResource ( org.anddev.andengine.audio.sound.SoundManager p0, android.content.Context p1, Integer p2 ) {
		 /* .locals 2 */
		 (( org.anddev.andengine.audio.sound.SoundManager ) p0 ).getSoundPool ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/audio/sound/SoundManager;->getSoundPool()Landroid/media/SoundPool;
		 int v1 = 1; // const/4 v1, 0x1
		 v0 = 		 (( android.media.SoundPool ) v0 ).load ( p1, p2, v1 ); // invoke-virtual {v0, p1, p2, v1}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I
		 /* new-instance v1, Lorg/anddev/andengine/audio/sound/Sound; */
		 /* invoke-direct {v1, p0, v0}, Lorg/anddev/andengine/audio/sound/Sound;-><init>(Lorg/anddev/andengine/audio/sound/SoundManager;I)V */
		 (( org.anddev.andengine.audio.sound.SoundManager ) p0 ).add ( v1 ); // invoke-virtual {p0, v1}, Lorg/anddev/andengine/audio/sound/SoundManager;->add(Lorg/anddev/andengine/audio/IAudioEntity;)V
	 } // .end method
	 public static void reset ( ) {
		 /* .locals 1 */
		 final String v0 = ""; // const-string v0, ""
		 org.anddev.andengine.audio.sound.SoundFactory .setAssetBasePath ( v0 );
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

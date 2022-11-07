public class org.anddev.andengine.audio.sound.SoundManager extends org.anddev.andengine.audio.BaseAudioManager {
	 /* # static fields */
	 private static final Integer MAX_SIMULTANEOUS_STREAMS_DEFAULT;
	 /* # instance fields */
	 private final android.media.SoundPool mSoundPool;
	 /* # direct methods */
	 public org.anddev.andengine.audio.sound.SoundManager ( ) {
		 /* .locals 1 */
		 int v0 = 5; // const/4 v0, 0x5
		 /* invoke-direct {p0, v0}, Lorg/anddev/andengine/audio/sound/SoundManager;-><init>(I)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.audio.sound.SoundManager ( ) {
		 /* .locals 3 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/audio/BaseAudioManager;-><init>()V */
		 /* new-instance v0, Landroid/media/SoundPool; */
		 int v1 = 3; // const/4 v1, 0x3
		 int v2 = 0; // const/4 v2, 0x0
		 /* invoke-direct {v0, p1, v1, v2}, Landroid/media/SoundPool;-><init>(III)V */
		 this.mSoundPool = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 android.media.SoundPool getSoundPool ( ) {
		 /* .locals 1 */
		 v0 = this.mSoundPool;
	 } // .end method
	 public void releaseAll ( ) {
		 /* .locals 1 */
		 /* invoke-super {p0}, Lorg/anddev/andengine/audio/BaseAudioManager;->releaseAll()V */
		 v0 = this.mSoundPool;
		 (( android.media.SoundPool ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/SoundPool;->release()V
		 return;
	 } // .end method

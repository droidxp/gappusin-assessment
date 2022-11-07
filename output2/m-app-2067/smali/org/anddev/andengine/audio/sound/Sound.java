public class org.anddev.andengine.audio.sound.Sound extends org.anddev.andengine.audio.BaseAudioEntity {
	 /* # instance fields */
	 private Integer mLoopCount;
	 private Float mRate;
	 private final Integer mSoundID;
	 private Integer mStreamID;
	 /* # direct methods */
	 org.anddev.andengine.audio.sound.Sound ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/audio/BaseAudioEntity;-><init>(Lorg/anddev/andengine/audio/IAudioManager;)V */
		 /* iput v0, p0, Lorg/anddev/andengine/audio/sound/Sound;->mStreamID:I */
		 /* iput v0, p0, Lorg/anddev/andengine/audio/sound/Sound;->mLoopCount:I */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* iput v0, p0, Lorg/anddev/andengine/audio/sound/Sound;->mRate:F */
		 /* iput p2, p0, Lorg/anddev/andengine/audio/sound/Sound;->mSoundID:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected org.anddev.andengine.audio.IAudioManager getAudioManager ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.audio.sound.Sound ) p0 ).getAudioManager ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/audio/sound/Sound;->getAudioManager()Lorg/anddev/andengine/audio/sound/SoundManager;
	 } // .end method
	 protected org.anddev.andengine.audio.sound.SoundManager getAudioManager ( ) {
		 /* .locals 0 */
		 /* invoke-super {p0}, Lorg/anddev/andengine/audio/BaseAudioEntity;->getAudioManager()Lorg/anddev/andengine/audio/IAudioManager; */
		 /* check-cast p0, Lorg/anddev/andengine/audio/sound/SoundManager; */
	 } // .end method
	 public void onMasterVolumeChanged ( Float p0 ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lorg/anddev/andengine/audio/sound/Sound;->mLeftVolume:F */
		 /* iget v1, p0, Lorg/anddev/andengine/audio/sound/Sound;->mRightVolume:F */
		 (( org.anddev.andengine.audio.sound.Sound ) p0 ).setVolume ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/anddev/andengine/audio/sound/Sound;->setVolume(FF)V
		 return;
	 } // .end method
	 public void pause ( ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lorg/anddev/andengine/audio/sound/Sound;->mStreamID:I */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( org.anddev.andengine.audio.sound.Sound ) p0 ).getAudioManager ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/audio/sound/Sound;->getAudioManager()Lorg/anddev/andengine/audio/sound/SoundManager;
			 (( org.anddev.andengine.audio.sound.SoundManager ) v0 ).getSoundPool ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/audio/sound/SoundManager;->getSoundPool()Landroid/media/SoundPool;
			 /* iget v1, p0, Lorg/anddev/andengine/audio/sound/Sound;->mStreamID:I */
			 (( android.media.SoundPool ) v0 ).pause ( v1 ); // invoke-virtual {v0, v1}, Landroid/media/SoundPool;->pause(I)V
		 } // :cond_0
		 return;
	 } // .end method
	 public void play ( ) {
		 /* .locals 7 */
		 v0 = 		 (( org.anddev.andengine.audio.sound.Sound ) p0 ).getMasterVolume ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/audio/sound/Sound;->getMasterVolume()F
		 /* iget v1, p0, Lorg/anddev/andengine/audio/sound/Sound;->mLeftVolume:F */
		 /* mul-float v2, v1, v0 */
		 /* iget v1, p0, Lorg/anddev/andengine/audio/sound/Sound;->mRightVolume:F */
		 /* mul-float v3, v1, v0 */
		 (( org.anddev.andengine.audio.sound.Sound ) p0 ).getAudioManager ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/audio/sound/Sound;->getAudioManager()Lorg/anddev/andengine/audio/sound/SoundManager;
		 (( org.anddev.andengine.audio.sound.SoundManager ) v0 ).getSoundPool ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/audio/sound/SoundManager;->getSoundPool()Landroid/media/SoundPool;
		 /* iget v1, p0, Lorg/anddev/andengine/audio/sound/Sound;->mSoundID:I */
		 int v4 = 1; // const/4 v4, 0x1
		 /* iget v5, p0, Lorg/anddev/andengine/audio/sound/Sound;->mLoopCount:I */
		 /* iget v6, p0, Lorg/anddev/andengine/audio/sound/Sound;->mRate:F */
		 v0 = 		 /* invoke-virtual/range {v0 ..v6}, Landroid/media/SoundPool;->play(IFFIIF)I */
		 /* iput v0, p0, Lorg/anddev/andengine/audio/sound/Sound;->mStreamID:I */
		 return;
	 } // .end method
	 public void release ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void resume ( ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lorg/anddev/andengine/audio/sound/Sound;->mStreamID:I */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( org.anddev.andengine.audio.sound.Sound ) p0 ).getAudioManager ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/audio/sound/Sound;->getAudioManager()Lorg/anddev/andengine/audio/sound/SoundManager;
			 (( org.anddev.andengine.audio.sound.SoundManager ) v0 ).getSoundPool ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/audio/sound/SoundManager;->getSoundPool()Landroid/media/SoundPool;
			 /* iget v1, p0, Lorg/anddev/andengine/audio/sound/Sound;->mStreamID:I */
			 (( android.media.SoundPool ) v0 ).resume ( v1 ); // invoke-virtual {v0, v1}, Landroid/media/SoundPool;->resume(I)V
		 } // :cond_0
		 return;
	 } // .end method
	 public void setLoopCount ( Integer p0 ) {
		 /* .locals 2 */
		 /* iput p1, p0, Lorg/anddev/andengine/audio/sound/Sound;->mLoopCount:I */
		 /* iget v0, p0, Lorg/anddev/andengine/audio/sound/Sound;->mStreamID:I */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 (( org.anddev.andengine.audio.sound.Sound ) p0 ).getAudioManager ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/audio/sound/Sound;->getAudioManager()Lorg/anddev/andengine/audio/sound/SoundManager;
			 (( org.anddev.andengine.audio.sound.SoundManager ) v0 ).getSoundPool ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/audio/sound/SoundManager;->getSoundPool()Landroid/media/SoundPool;
			 /* iget v1, p0, Lorg/anddev/andengine/audio/sound/Sound;->mStreamID:I */
			 (( android.media.SoundPool ) v0 ).setLoop ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/media/SoundPool;->setLoop(II)V
		 } // :cond_0
		 return;
	 } // .end method
	 public void setLooping ( Boolean p0 ) {
		 /* .locals 1 */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 int v0 = -1; // const/4 v0, -0x1
		 } // :goto_0
		 (( org.anddev.andengine.audio.sound.Sound ) p0 ).setLoopCount ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/audio/sound/Sound;->setLoopCount(I)V
		 return;
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
public void setRate ( Float p0 ) {
	 /* .locals 2 */
	 /* iput p1, p0, Lorg/anddev/andengine/audio/sound/Sound;->mRate:F */
	 /* iget v0, p0, Lorg/anddev/andengine/audio/sound/Sound;->mStreamID:I */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 (( org.anddev.andengine.audio.sound.Sound ) p0 ).getAudioManager ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/audio/sound/Sound;->getAudioManager()Lorg/anddev/andengine/audio/sound/SoundManager;
		 (( org.anddev.andengine.audio.sound.SoundManager ) v0 ).getSoundPool ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/audio/sound/SoundManager;->getSoundPool()Landroid/media/SoundPool;
		 /* iget v1, p0, Lorg/anddev/andengine/audio/sound/Sound;->mStreamID:I */
		 (( android.media.SoundPool ) v0 ).setRate ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/media/SoundPool;->setRate(IF)V
	 } // :cond_0
	 return;
} // .end method
public void setVolume ( Float p0, Float p1 ) {
	 /* .locals 4 */
	 /* invoke-super {p0, p1, p2}, Lorg/anddev/andengine/audio/BaseAudioEntity;->setVolume(FF)V */
	 /* iget v0, p0, Lorg/anddev/andengine/audio/sound/Sound;->mStreamID:I */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = 		 (( org.anddev.andengine.audio.sound.Sound ) p0 ).getMasterVolume ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/audio/sound/Sound;->getMasterVolume()F
		 /* iget v1, p0, Lorg/anddev/andengine/audio/sound/Sound;->mLeftVolume:F */
		 /* mul-float/2addr v1, v0 */
		 /* iget v2, p0, Lorg/anddev/andengine/audio/sound/Sound;->mRightVolume:F */
		 /* mul-float/2addr v0, v2 */
		 (( org.anddev.andengine.audio.sound.Sound ) p0 ).getAudioManager ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/audio/sound/Sound;->getAudioManager()Lorg/anddev/andengine/audio/sound/SoundManager;
		 (( org.anddev.andengine.audio.sound.SoundManager ) v2 ).getSoundPool ( ); // invoke-virtual {v2}, Lorg/anddev/andengine/audio/sound/SoundManager;->getSoundPool()Landroid/media/SoundPool;
		 /* iget v3, p0, Lorg/anddev/andengine/audio/sound/Sound;->mStreamID:I */
		 (( android.media.SoundPool ) v2 ).setVolume ( v3, v1, v0 ); // invoke-virtual {v2, v3, v1, v0}, Landroid/media/SoundPool;->setVolume(IFF)V
	 } // :cond_0
	 return;
} // .end method
public void stop ( ) {
	 /* .locals 2 */
	 /* iget v0, p0, Lorg/anddev/andengine/audio/sound/Sound;->mStreamID:I */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 (( org.anddev.andengine.audio.sound.Sound ) p0 ).getAudioManager ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/audio/sound/Sound;->getAudioManager()Lorg/anddev/andengine/audio/sound/SoundManager;
		 (( org.anddev.andengine.audio.sound.SoundManager ) v0 ).getSoundPool ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/audio/sound/SoundManager;->getSoundPool()Landroid/media/SoundPool;
		 /* iget v1, p0, Lorg/anddev/andengine/audio/sound/Sound;->mStreamID:I */
		 (( android.media.SoundPool ) v0 ).stop ( v1 ); // invoke-virtual {v0, v1}, Landroid/media/SoundPool;->stop(I)V
	 } // :cond_0
	 return;
} // .end method

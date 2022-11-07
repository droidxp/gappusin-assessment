public class org.anddev.andengine.audio.music.Music extends org.anddev.andengine.audio.BaseAudioEntity {
	 /* # instance fields */
	 private final android.media.MediaPlayer mMediaPlayer;
	 /* # direct methods */
	 org.anddev.andengine.audio.music.Music ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/audio/BaseAudioEntity;-><init>(Lorg/anddev/andengine/audio/IAudioManager;)V */
		 this.mMediaPlayer = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected org.anddev.andengine.audio.IAudioManager getAudioManager ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.audio.music.Music ) p0 ).getAudioManager ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/audio/music/Music;->getAudioManager()Lorg/anddev/andengine/audio/music/MusicManager;
	 } // .end method
	 protected org.anddev.andengine.audio.music.MusicManager getAudioManager ( ) {
		 /* .locals 0 */
		 /* invoke-super {p0}, Lorg/anddev/andengine/audio/BaseAudioEntity;->getAudioManager()Lorg/anddev/andengine/audio/IAudioManager; */
		 /* check-cast p0, Lorg/anddev/andengine/audio/music/MusicManager; */
	 } // .end method
	 public android.media.MediaPlayer getMediaPlayer ( ) {
		 /* .locals 1 */
		 v0 = this.mMediaPlayer;
	 } // .end method
	 public Boolean isPlaying ( ) {
		 /* .locals 1 */
		 v0 = this.mMediaPlayer;
		 v0 = 		 (( android.media.MediaPlayer ) v0 ).isPlaying ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
	 } // .end method
	 public void onMasterVolumeChanged ( Float p0 ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lorg/anddev/andengine/audio/music/Music;->mLeftVolume:F */
		 /* iget v1, p0, Lorg/anddev/andengine/audio/music/Music;->mRightVolume:F */
		 (( org.anddev.andengine.audio.music.Music ) p0 ).setVolume ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/anddev/andengine/audio/music/Music;->setVolume(FF)V
		 return;
	 } // .end method
	 public void pause ( ) {
		 /* .locals 1 */
		 v0 = this.mMediaPlayer;
		 (( android.media.MediaPlayer ) v0 ).pause ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
		 return;
	 } // .end method
	 public void play ( ) {
		 /* .locals 1 */
		 v0 = this.mMediaPlayer;
		 (( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
		 return;
	 } // .end method
	 public void release ( ) {
		 /* .locals 1 */
		 v0 = this.mMediaPlayer;
		 (( android.media.MediaPlayer ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
		 return;
	 } // .end method
	 public void resume ( ) {
		 /* .locals 1 */
		 v0 = this.mMediaPlayer;
		 (( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
		 return;
	 } // .end method
	 public void seekTo ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = this.mMediaPlayer;
		 (( android.media.MediaPlayer ) v0 ).seekTo ( p1 ); // invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->seekTo(I)V
		 return;
	 } // .end method
	 public void setLooping ( Boolean p0 ) {
		 /* .locals 1 */
		 v0 = this.mMediaPlayer;
		 (( android.media.MediaPlayer ) v0 ).setLooping ( p1 ); // invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setLooping(Z)V
		 return;
	 } // .end method
	 public void setOnCompletionListener ( android.media.MediaPlayer$OnCompletionListener p0 ) {
		 /* .locals 1 */
		 v0 = this.mMediaPlayer;
		 (( android.media.MediaPlayer ) v0 ).setOnCompletionListener ( p1 ); // invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V
		 return;
	 } // .end method
	 public void setVolume ( Float p0, Float p1 ) {
		 /* .locals 3 */
		 /* invoke-super {p0, p1, p2}, Lorg/anddev/andengine/audio/BaseAudioEntity;->setVolume(FF)V */
		 (( org.anddev.andengine.audio.music.Music ) p0 ).getAudioManager ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/audio/music/Music;->getAudioManager()Lorg/anddev/andengine/audio/music/MusicManager;
		 v0 = 		 (( org.anddev.andengine.audio.music.MusicManager ) v0 ).getMasterVolume ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/audio/music/MusicManager;->getMasterVolume()F
		 /* mul-float v1, p1, v0 */
		 /* mul-float/2addr v0, p2 */
		 v2 = this.mMediaPlayer;
		 (( android.media.MediaPlayer ) v2 ).setVolume ( v1, v0 ); // invoke-virtual {v2, v1, v0}, Landroid/media/MediaPlayer;->setVolume(FF)V
		 return;
	 } // .end method
	 public void stop ( ) {
		 /* .locals 1 */
		 v0 = this.mMediaPlayer;
		 (( android.media.MediaPlayer ) v0 ).stop ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V
		 return;
	 } // .end method

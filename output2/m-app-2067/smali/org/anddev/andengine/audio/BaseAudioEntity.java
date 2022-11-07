public abstract class org.anddev.andengine.audio.BaseAudioEntity implements org.anddev.andengine.audio.IAudioEntity {
	 /* # interfaces */
	 /* # instance fields */
	 private final org.anddev.andengine.audio.IAudioManager mAudioManager;
	 protected Float mLeftVolume;
	 protected Float mRightVolume;
	 /* # direct methods */
	 public org.anddev.andengine.audio.BaseAudioEntity ( ) {
		 /* .locals 1 */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput v0, p0, Lorg/anddev/andengine/audio/BaseAudioEntity;->mLeftVolume:F */
		 /* iput v0, p0, Lorg/anddev/andengine/audio/BaseAudioEntity;->mRightVolume:F */
		 this.mAudioManager = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Float getActualLeftVolume ( ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lorg/anddev/andengine/audio/BaseAudioEntity;->mLeftVolume:F */
		 v1 = 		 (( org.anddev.andengine.audio.BaseAudioEntity ) p0 ).getMasterVolume ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/audio/BaseAudioEntity;->getMasterVolume()F
		 /* mul-float/2addr v0, v1 */
	 } // .end method
	 public Float getActualRightVolume ( ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lorg/anddev/andengine/audio/BaseAudioEntity;->mRightVolume:F */
		 v1 = 		 (( org.anddev.andengine.audio.BaseAudioEntity ) p0 ).getMasterVolume ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/audio/BaseAudioEntity;->getMasterVolume()F
		 /* mul-float/2addr v0, v1 */
	 } // .end method
	 protected org.anddev.andengine.audio.IAudioManager getAudioManager ( ) {
		 /* .locals 1 */
		 v0 = this.mAudioManager;
	 } // .end method
	 public Float getLeftVolume ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/audio/BaseAudioEntity;->mLeftVolume:F */
	 } // .end method
	 protected Float getMasterVolume ( ) {
		 /* .locals 1 */
		 v0 = 		 v0 = this.mAudioManager;
	 } // .end method
	 public Float getRightVolume ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/audio/BaseAudioEntity;->mRightVolume:F */
	 } // .end method
	 public Float getVolume ( ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lorg/anddev/andengine/audio/BaseAudioEntity;->mLeftVolume:F */
		 /* iget v1, p0, Lorg/anddev/andengine/audio/BaseAudioEntity;->mRightVolume:F */
		 /* add-float/2addr v0, v1 */
		 /* const/high16 v1, 0x3f000000 # 0.5f */
		 /* mul-float/2addr v0, v1 */
	 } // .end method
	 public final void setVolume ( Float p0 ) {
		 /* .locals 0 */
		 (( org.anddev.andengine.audio.BaseAudioEntity ) p0 ).setVolume ( p1, p1 ); // invoke-virtual {p0, p1, p1}, Lorg/anddev/andengine/audio/BaseAudioEntity;->setVolume(FF)V
		 return;
	 } // .end method
	 public void setVolume ( Float p0, Float p1 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lorg/anddev/andengine/audio/BaseAudioEntity;->mLeftVolume:F */
		 /* iput p2, p0, Lorg/anddev/andengine/audio/BaseAudioEntity;->mRightVolume:F */
		 return;
	 } // .end method

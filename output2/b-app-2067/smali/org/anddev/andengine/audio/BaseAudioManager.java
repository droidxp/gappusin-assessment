public abstract class org.anddev.andengine.audio.BaseAudioManager implements org.anddev.andengine.audio.IAudioManager {
	 /* # interfaces */
	 /* # instance fields */
	 protected final java.util.ArrayList mAudioEntities;
	 protected Float mMasterVolume;
	 /* # direct methods */
	 public org.anddev.andengine.audio.BaseAudioManager ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.mAudioEntities = v0;
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* iput v0, p0, Lorg/anddev/andengine/audio/BaseAudioManager;->mMasterVolume:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void add ( org.anddev.andengine.audio.IAudioEntity p0 ) {
		 /* .locals 1 */
		 v0 = this.mAudioEntities;
		 (( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
		 return;
	 } // .end method
	 public Float getMasterVolume ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/audio/BaseAudioManager;->mMasterVolume:F */
	 } // .end method
	 public void releaseAll ( ) {
		 /* .locals 3 */
		 v0 = this.mAudioEntities;
		 v1 = 		 (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
		 int v2 = 1; // const/4 v2, 0x1
		 /* sub-int/2addr v1, v2 */
	 } // :goto_0
	 /* if-gez v1, :cond_0 */
	 return;
} // :cond_0
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p0, Lorg/anddev/andengine/audio/IAudioEntity; */
/* add-int/lit8 v1, v1, -0x1 */
} // .end method
public void setMasterVolume ( Float p0 ) {
/* .locals 3 */
/* iput p1, p0, Lorg/anddev/andengine/audio/BaseAudioManager;->mMasterVolume:F */
v0 = this.mAudioEntities;
v1 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v1, v2 */
} // :goto_0
/* if-gez v1, :cond_0 */
return;
} // :cond_0
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast p0, Lorg/anddev/andengine/audio/IAudioEntity; */
/* add-int/lit8 v1, v1, -0x1 */
} // .end method

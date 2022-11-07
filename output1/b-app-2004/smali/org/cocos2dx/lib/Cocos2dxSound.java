public class org.cocos2dx.lib.Cocos2dxSound {
	 /* .source "Cocos2dxSound.java" */
	 /* # static fields */
	 private static final Integer MAX_SIMULTANEOUS_STREAMS_DEFAULT;
	 private static final Integer SOUND_PRIORITY;
	 private static final Integer SOUND_QUALITY;
	 private static final Float SOUND_RATE;
	 private static final java.lang.String TAG;
	 /* # instance fields */
	 private final Integer INVALID_SOUND_ID;
	 private final Integer INVALID_STREAM_ID;
	 private android.content.Context mContext;
	 private Float mLeftVolume;
	 private java.util.HashMap mPathSoundIDMap;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/HashMap", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/Integer;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private Float mRightVolume;
private java.util.HashMap mSoundIdStreamIdMap;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/Integer;", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private android.media.SoundPool mSoundPool;
/* # direct methods */
public org.cocos2dx.lib.Cocos2dxSound ( ) {
/* .locals 1 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
int v0 = -1; // const/4 v0, -0x1
/* .line 61 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 58 */
/* iput v0, p0, Lorg/cocos2dx/lib/Cocos2dxSound;->INVALID_SOUND_ID:I */
/* .line 59 */
/* iput v0, p0, Lorg/cocos2dx/lib/Cocos2dxSound;->INVALID_STREAM_ID:I */
/* .line 62 */
this.mContext = p1;
/* .line 63 */
/* invoke-direct {p0}, Lorg/cocos2dx/lib/Cocos2dxSound;->initData()V */
/* .line 64 */
return;
} // .end method
private void initData ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 5; // const/4 v3, 0x5
/* const/high16 v2, 0x3f000000 # 0.5f */
/* .line 231 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.mSoundIdStreamIdMap = v0;
/* .line 232 */
/* new-instance v0, Landroid/media/SoundPool; */
int v1 = 3; // const/4 v1, 0x3
/* invoke-direct {v0, v3, v1, v3}, Landroid/media/SoundPool;-><init>(III)V */
this.mSoundPool = v0;
/* .line 233 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.mPathSoundIDMap = v0;
/* .line 235 */
/* iput v2, p0, Lorg/cocos2dx/lib/Cocos2dxSound;->mLeftVolume:F */
/* .line 236 */
/* iput v2, p0, Lorg/cocos2dx/lib/Cocos2dxSound;->mRightVolume:F */
/* .line 237 */
return;
} // .end method
private void pauseOrResumeAllEffects ( Boolean p0 ) {
/* .locals 4 */
/* .param p1, "isPause" # Z */
/* .prologue */
/* .line 241 */
v3 = this.mSoundIdStreamIdMap;
(( java.util.HashMap ) v3 ).entrySet ( ); // invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
/* .line 242 */
/* .local v1, "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;" */
v3 = } // :goto_0
/* if-nez v3, :cond_0 */
/* .line 251 */
return;
/* .line 243 */
} // :cond_0
/* check-cast v0, Ljava/util/Map$Entry; */
/* .line 244 */
/* .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/lang/Integer;>;" */
/* check-cast v3, Ljava/lang/Integer; */
v2 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
/* .line 245 */
/* .local v2, "soundId":I */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 246 */
(( org.cocos2dx.lib.Cocos2dxSound ) p0 ).pauseEffect ( v2 ); // invoke-virtual {p0, v2}, Lorg/cocos2dx/lib/Cocos2dxSound;->pauseEffect(I)V
/* .line 248 */
} // :cond_1
(( org.cocos2dx.lib.Cocos2dxSound ) p0 ).resumeEffect ( v2 ); // invoke-virtual {p0, v2}, Lorg/cocos2dx/lib/Cocos2dxSound;->resumeEffect(I)V
} // .end method
/* # virtual methods */
public Integer createSoundIdFromAsset ( java.lang.String p0 ) {
/* .locals 5 */
/* .param p1, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 219 */
int v1 = -1; // const/4 v1, -0x1
/* .line 222 */
/* .local v1, "soundId":I */
try { // :try_start_0
v2 = this.mSoundPool;
v3 = this.mContext;
(( android.content.Context ) v3 ).getAssets ( ); // invoke-virtual {v3}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
(( android.content.res.AssetManager ) v3 ).openFd ( p1 ); // invoke-virtual {v3, p1}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
int v4 = 0; // const/4 v4, 0x0
(( android.media.SoundPool ) v2 ).load ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/media/SoundPool;->load(Landroid/content/res/AssetFileDescriptor;I)I
/* :try_end_0 */
v1 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 227 */
} // :goto_0
/* .line 223 */
/* :catch_0 */
/* move-exception v0 */
/* .line 224 */
/* .local v0, "e":Ljava/lang/Exception; */
final String v2 = "Cocos2dxSound"; // const-string v2, "Cocos2dxSound"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "error: "; // const-string v4, "error: "
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.Exception ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v2,v3,v0 );
} // .end method
public void end ( ) {
/* .locals 1 */
/* .prologue */
/* .line 211 */
v0 = this.mSoundPool;
(( android.media.SoundPool ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/SoundPool;->release()V
/* .line 212 */
v0 = this.mPathSoundIDMap;
(( java.util.HashMap ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
/* .line 213 */
v0 = this.mSoundIdStreamIdMap;
(( java.util.HashMap ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
/* .line 215 */
/* invoke-direct {p0}, Lorg/cocos2dx/lib/Cocos2dxSound;->initData()V */
/* .line 216 */
return;
} // .end method
public Float getEffectsVolume ( ) {
/* .locals 2 */
/* .prologue */
/* .line 187 */
/* iget v0, p0, Lorg/cocos2dx/lib/Cocos2dxSound;->mLeftVolume:F */
/* iget v1, p0, Lorg/cocos2dx/lib/Cocos2dxSound;->mRightVolume:F */
/* add-float/2addr v0, v1 */
/* const/high16 v1, 0x40000000 # 2.0f */
/* div-float/2addr v0, v1 */
} // .end method
public void pauseAllEffects ( ) {
/* .locals 1 */
/* .prologue */
/* .line 168 */
int v0 = 1; // const/4 v0, 0x1
/* invoke-direct {p0, v0}, Lorg/cocos2dx/lib/Cocos2dxSound;->pauseOrResumeAllEffects(Z)V */
/* .line 169 */
return;
} // .end method
public void pauseEffect ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "soundId" # I */
/* .prologue */
/* .line 149 */
v1 = this.mSoundIdStreamIdMap;
java.lang.Integer .valueOf ( p1 );
(( java.util.HashMap ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Integer; */
/* .line 151 */
/* .local v0, "streamId":Ljava/lang/Integer; */
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
int v2 = -1; // const/4 v2, -0x1
/* if-eq v1, v2, :cond_0 */
/* .line 152 */
v1 = this.mSoundPool;
v2 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
(( android.media.SoundPool ) v1 ).pause ( v2 ); // invoke-virtual {v1, v2}, Landroid/media/SoundPool;->pause(I)V
/* .line 153 */
v1 = this.mPathSoundIDMap;
java.lang.Integer .valueOf ( p1 );
(( java.util.HashMap ) v1 ).remove ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 155 */
} // :cond_0
return;
} // .end method
public Integer playEffect ( java.lang.String p0, Boolean p1 ) {
/* .locals 9 */
/* .param p1, "path" # Ljava/lang/String; */
/* .param p2, "isLoop" # Z */
/* .prologue */
int v5 = -1; // const/4 v5, -0x1
/* .line 101 */
v0 = this.mPathSoundIDMap;
(( java.util.HashMap ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v7, Ljava/lang/Integer; */
/* .line 103 */
/* .local v7, "soundId":Ljava/lang/Integer; */
if ( v7 != null) { // if-eqz v7, :cond_2
/* .line 106 */
v0 = this.mSoundPool;
v1 = (( java.lang.Integer ) v7 ).intValue ( ); // invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I
(( android.media.SoundPool ) v0 ).stop ( v1 ); // invoke-virtual {v0, v1}, Landroid/media/SoundPool;->stop(I)V
/* .line 109 */
v0 = this.mSoundPool;
v1 = (( java.lang.Integer ) v7 ).intValue ( ); // invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I
/* iget v2, p0, Lorg/cocos2dx/lib/Cocos2dxSound;->mLeftVolume:F */
/* .line 110 */
/* iget v3, p0, Lorg/cocos2dx/lib/Cocos2dxSound;->mRightVolume:F */
int v4 = 1; // const/4 v4, 0x1
if ( p2 != null) { // if-eqz p2, :cond_1
} // :goto_0
/* const/high16 v6, 0x3f800000 # 1.0f */
/* .line 109 */
v8 = /* invoke-virtual/range {v0 ..v6}, Landroid/media/SoundPool;->play(IFFIIF)I */
/* .line 113 */
/* .local v8, "streamId":I */
v0 = this.mSoundIdStreamIdMap;
java.lang.Integer .valueOf ( v8 );
(( java.util.HashMap ) v0 ).put ( v7, v1 ); // invoke-virtual {v0, v7, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 136 */
} // .end local v8 # "streamId":I
} // :goto_1
v5 = (( java.lang.Integer ) v7 ).intValue ( ); // invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I
} // :cond_0
/* .line 110 */
} // :cond_1
int v5 = 0; // const/4 v5, 0x0
/* .line 116 */
} // :cond_2
v0 = (( org.cocos2dx.lib.Cocos2dxSound ) p0 ).preloadEffect ( p1 ); // invoke-virtual {p0, p1}, Lorg/cocos2dx/lib/Cocos2dxSound;->preloadEffect(Ljava/lang/String;)I
java.lang.Integer .valueOf ( v0 );
/* .line 117 */
v0 = (( java.lang.Integer ) v7 ).intValue ( ); // invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I
/* if-eq v0, v5, :cond_0 */
/* .line 133 */
(( org.cocos2dx.lib.Cocos2dxSound ) p0 ).playEffect ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/cocos2dx/lib/Cocos2dxSound;->playEffect(Ljava/lang/String;Z)I
} // .end method
public Integer preloadEffect ( java.lang.String p0 ) {
/* .locals 4 */
/* .param p1, "path" # Ljava/lang/String; */
/* .prologue */
int v3 = -1; // const/4 v3, -0x1
/* .line 67 */
int v0 = -1; // const/4 v0, -0x1
/* .line 70 */
/* .local v0, "soundId":I */
v1 = this.mPathSoundIDMap;
(( java.util.HashMap ) v1 ).get ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 71 */
v1 = this.mPathSoundIDMap;
(( java.util.HashMap ) v1 ).get ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/Integer; */
v0 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
/* .line 84 */
} // :cond_0
} // :goto_0
/* .line 73 */
} // :cond_1
v0 = (( org.cocos2dx.lib.Cocos2dxSound ) p0 ).createSoundIdFromAsset ( p1 ); // invoke-virtual {p0, p1}, Lorg/cocos2dx/lib/Cocos2dxSound;->createSoundIdFromAsset(Ljava/lang/String;)I
/* .line 75 */
/* if-eq v0, v3, :cond_0 */
/* .line 77 */
v1 = this.mSoundIdStreamIdMap;
java.lang.Integer .valueOf ( v0 );
java.lang.Integer .valueOf ( v3 );
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 80 */
v1 = this.mPathSoundIDMap;
java.lang.Integer .valueOf ( v0 );
(( java.util.HashMap ) v1 ).put ( p1, v2 ); // invoke-virtual {v1, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // .end method
public void resumeAllEffects ( ) {
/* .locals 1 */
/* .prologue */
/* .line 173 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, v0}, Lorg/cocos2dx/lib/Cocos2dxSound;->pauseOrResumeAllEffects(Z)V */
/* .line 174 */
return;
} // .end method
public void resumeEffect ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "soundId" # I */
/* .prologue */
/* .line 158 */
v1 = this.mSoundIdStreamIdMap;
java.lang.Integer .valueOf ( p1 );
(( java.util.HashMap ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Integer; */
/* .line 160 */
/* .local v0, "streamId":Ljava/lang/Integer; */
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
int v2 = -1; // const/4 v2, -0x1
/* if-eq v1, v2, :cond_0 */
/* .line 161 */
v1 = this.mSoundPool;
v2 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
(( android.media.SoundPool ) v1 ).resume ( v2 ); // invoke-virtual {v1, v2}, Landroid/media/SoundPool;->resume(I)V
/* .line 162 */
v1 = this.mPathSoundIDMap;
java.lang.Integer .valueOf ( p1 );
(( java.util.HashMap ) v1 ).remove ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 164 */
} // :cond_0
return;
} // .end method
public void setEffectsVolume ( Float p0 ) {
/* .locals 6 */
/* .param p1, "volume" # F */
/* .prologue */
/* .line 193 */
int v2 = 0; // const/4 v2, 0x0
/* cmpg-float v2, p1, v2 */
/* if-gez v2, :cond_0 */
/* .line 194 */
int p1 = 0; // const/4 p1, 0x0
/* .line 196 */
} // :cond_0
/* const/high16 v2, 0x3f800000 # 1.0f */
/* cmpl-float v2, p1, v2 */
/* if-lez v2, :cond_1 */
/* .line 197 */
/* const/high16 p1, 0x3f800000 # 1.0f */
/* .line 200 */
} // :cond_1
/* iput p1, p0, Lorg/cocos2dx/lib/Cocos2dxSound;->mRightVolume:F */
/* iput p1, p0, Lorg/cocos2dx/lib/Cocos2dxSound;->mLeftVolume:F */
/* .line 203 */
v2 = this.mSoundIdStreamIdMap;
(( java.util.HashMap ) v2 ).entrySet ( ); // invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
/* .line 204 */
/* .local v1, "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;" */
v2 = } // :goto_0
/* if-nez v2, :cond_2 */
/* .line 208 */
return;
/* .line 205 */
} // :cond_2
/* check-cast v0, Ljava/util/Map$Entry; */
/* .line 206 */
/* .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/lang/Integer;>;" */
v3 = this.mSoundPool;
/* check-cast v2, Ljava/lang/Integer; */
v2 = (( java.lang.Integer ) v2 ).intValue ( ); // invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
/* iget v4, p0, Lorg/cocos2dx/lib/Cocos2dxSound;->mLeftVolume:F */
/* iget v5, p0, Lorg/cocos2dx/lib/Cocos2dxSound;->mRightVolume:F */
(( android.media.SoundPool ) v3 ).setVolume ( v2, v4, v5 ); // invoke-virtual {v3, v2, v4, v5}, Landroid/media/SoundPool;->setVolume(IFF)V
} // .end method
public void stopAllEffects ( ) {
/* .locals 4 */
/* .prologue */
/* .line 178 */
v3 = this.mSoundIdStreamIdMap;
(( java.util.HashMap ) v3 ).entrySet ( ); // invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
/* .line 179 */
/* .local v1, "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;" */
v3 = } // :goto_0
/* if-nez v3, :cond_0 */
/* .line 184 */
return;
/* .line 180 */
} // :cond_0
/* check-cast v0, Ljava/util/Map$Entry; */
/* .line 181 */
/* .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/lang/Integer;>;" */
/* check-cast v3, Ljava/lang/Integer; */
v2 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
/* .line 182 */
/* .local v2, "soundId":I */
(( org.cocos2dx.lib.Cocos2dxSound ) p0 ).stopEffect ( v2 ); // invoke-virtual {p0, v2}, Lorg/cocos2dx/lib/Cocos2dxSound;->stopEffect(I)V
} // .end method
public void stopEffect ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "soundId" # I */
/* .prologue */
/* .line 140 */
v1 = this.mSoundIdStreamIdMap;
java.lang.Integer .valueOf ( p1 );
(( java.util.HashMap ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Integer; */
/* .line 142 */
/* .local v0, "streamId":Ljava/lang/Integer; */
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
int v2 = -1; // const/4 v2, -0x1
/* if-eq v1, v2, :cond_0 */
/* .line 143 */
v1 = this.mSoundPool;
v2 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
(( android.media.SoundPool ) v1 ).stop ( v2 ); // invoke-virtual {v1, v2}, Landroid/media/SoundPool;->stop(I)V
/* .line 144 */
v1 = this.mPathSoundIDMap;
java.lang.Integer .valueOf ( p1 );
(( java.util.HashMap ) v1 ).remove ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 146 */
} // :cond_0
return;
} // .end method
public void unloadEffect ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 89 */
v1 = this.mPathSoundIDMap;
(( java.util.HashMap ) v1 ).remove ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Integer; */
/* .line 91 */
/* .local v0, "soundId":Ljava/lang/Integer; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 93 */
v1 = this.mSoundPool;
v2 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
(( android.media.SoundPool ) v1 ).unload ( v2 ); // invoke-virtual {v1, v2}, Landroid/media/SoundPool;->unload(I)Z
/* .line 96 */
v1 = this.mSoundIdStreamIdMap;
(( java.util.HashMap ) v1 ).remove ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 98 */
} // :cond_0
return;
} // .end method

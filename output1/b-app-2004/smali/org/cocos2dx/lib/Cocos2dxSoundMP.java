public class org.cocos2dx.lib.Cocos2dxSoundMP {
	 /* .source "Cocos2dxSoundMP.java" */
	 /* # static fields */
	 private static final Integer MAX_MPARRAY_LENGTH;
	 private static final Integer MAX_PLAY_PER_SOUNDTRACK;
	 private static final Integer MAX_SIMULTANEOUS_STREAMS_DEFAULT;
	 private static final java.lang.String TAG;
	 /* # instance fields */
	 private final Integer INVALID_SOUND_ID;
	 private android.content.Context mContext;
	 private Float mLeftVolume;
	 private android.media.MediaPlayer mMediaPlayer;
	 private java.util.concurrent.ConcurrentHashMap mPathSoundIDMap;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/concurrent/ConcurrentHashMap", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/Integer;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private Float mRightVolume;
/* # direct methods */
public org.cocos2dx.lib.Cocos2dxSoundMP ( ) {
/* .locals 1 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 64 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 60 */
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->INVALID_SOUND_ID:I */
/* .line 65 */
this.mContext = p1;
/* .line 66 */
/* invoke-direct {p0}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->initData()V */
/* .line 67 */
return;
} // .end method
static android.media.MediaPlayer access$0 ( org.cocos2dx.lib.Cocos2dxSoundMP p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 62 */
v0 = this.mMediaPlayer;
} // .end method
static java.util.concurrent.ConcurrentHashMap access$1 ( org.cocos2dx.lib.Cocos2dxSoundMP p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 51 */
v0 = this.mPathSoundIDMap;
} // .end method
private android.media.MediaPlayer createMediaplayerFromAssets ( java.lang.String p0 ) {
/* .locals 9 */
/* .param p1, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 379 */
int v8 = 0; // const/4 v8, 0x0
/* .line 382 */
/* .local v8, "mediaPlayer":Landroid/media/MediaPlayer; */
try { // :try_start_0
	 v1 = this.mContext;
	 (( android.content.Context ) v1 ).getAssets ( ); // invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
	 (( android.content.res.AssetManager ) v1 ).openFd ( p1 ); // invoke-virtual {v1, p1}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
	 /* .line 384 */
	 /* .local v6, "assetFileDescritor":Landroid/content/res/AssetFileDescriptor; */
	 /* new-instance v0, Landroid/media/MediaPlayer; */
	 /* invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V */
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 385 */
} // .end local v8 # "mediaPlayer":Landroid/media/MediaPlayer;
/* .local v0, "mediaPlayer":Landroid/media/MediaPlayer; */
try { // :try_start_1
	 (( android.content.res.AssetFileDescriptor ) v6 ).getFileDescriptor ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;
	 /* .line 386 */
	 (( android.content.res.AssetFileDescriptor ) v6 ).getStartOffset ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J
	 /* move-result-wide v2 */
	 (( android.content.res.AssetFileDescriptor ) v6 ).getLength ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getLength()J
	 /* move-result-wide v4 */
	 /* .line 385 */
	 /* invoke-virtual/range {v0 ..v5}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V */
	 /* .line 387 */
	 (( android.media.MediaPlayer ) v0 ).prepare ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V
	 /* .line 388 */
	 /* new-instance v1, Lorg/cocos2dx/lib/Cocos2dxSoundMP$1; */
	 /* invoke-direct {v1, p0}, Lorg/cocos2dx/lib/Cocos2dxSoundMP$1;-><init>(Lorg/cocos2dx/lib/Cocos2dxSoundMP;)V */
	 (( android.media.MediaPlayer ) v0 ).setOnCompletionListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V
	 /* .line 414 */
	 /* iget v1, p0, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->mLeftVolume:F */
	 /* iget v2, p0, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->mRightVolume:F */
	 (( android.media.MediaPlayer ) v0 ).setVolume ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/media/MediaPlayer;->setVolume(FF)V
	 /* :try_end_1 */
	 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
	 /* .line 422 */
} // .end local v6 # "assetFileDescritor":Landroid/content/res/AssetFileDescriptor;
} // :goto_0
/* .line 416 */
} // .end local v0 # "mediaPlayer":Landroid/media/MediaPlayer;
/* .restart local v8 # "mediaPlayer":Landroid/media/MediaPlayer; */
/* :catch_0 */
/* move-exception v7 */
/* move-object v0, v8 */
/* .line 417 */
} // .end local v8 # "mediaPlayer":Landroid/media/MediaPlayer;
/* .restart local v0 # "mediaPlayer":Landroid/media/MediaPlayer; */
/* .local v7, "e":Ljava/lang/Exception; */
} // :goto_1
int v0 = 0; // const/4 v0, 0x0
/* .line 418 */
final String v1 = "Cocos2dxSoundMP"; // const-string v1, "Cocos2dxSoundMP"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "error: "; // const-string v3, "error: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.Exception ) v7 ).getMessage ( ); // invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v1,v2,v7 );
/* .line 419 */
final String v1 = "Cocos2dxSoundMP"; // const-string v1, "Cocos2dxSoundMP"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "Asset: "; // const-string v3, "Asset: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v1,v2 );
/* .line 416 */
} // .end local v7 # "e":Ljava/lang/Exception;
/* .restart local v6 # "assetFileDescritor":Landroid/content/res/AssetFileDescriptor; */
/* :catch_1 */
/* move-exception v7 */
} // .end method
private void initData ( ) {
/* .locals 5 */
/* .prologue */
/* const/16 v4, 0x2d */
/* const/high16 v3, 0x3f000000 # 0.5f */
/* .line 348 */
/* new-array v1, v4, [Landroid/media/MediaPlayer; */
this.mMediaPlayer = v1;
/* .line 349 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
/* if-lt v0, v4, :cond_0 */
/* .line 353 */
/* new-instance v1, Ljava/util/concurrent/ConcurrentHashMap; */
/* invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V */
this.mPathSoundIDMap = v1;
/* .line 355 */
/* iput v3, p0, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->mLeftVolume:F */
/* .line 356 */
/* iput v3, p0, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->mRightVolume:F */
/* .line 357 */
return;
/* .line 351 */
} // :cond_0
v1 = this.mMediaPlayer;
int v2 = 0; // const/4 v2, 0x0
/* aput-object v2, v1, v0 */
/* .line 349 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
private void pauseOrResumeAllEffects ( Boolean p0 ) {
/* .locals 4 */
/* .param p1, "isPause" # Z */
/* .prologue */
/* .line 361 */
v3 = this.mPathSoundIDMap;
(( java.util.concurrent.ConcurrentHashMap ) v3 ).entrySet ( ); // invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;
/* .line 362 */
/* .local v1, "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;" */
v3 = } // :goto_0
/* if-nez v3, :cond_0 */
/* .line 371 */
return;
/* .line 363 */
} // :cond_0
/* check-cast v0, Ljava/util/Map$Entry; */
/* .line 364 */
/* .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Integer;>;" */
/* check-cast v3, Ljava/lang/Integer; */
v2 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
/* .line 365 */
/* .local v2, "soundId":I */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 366 */
(( org.cocos2dx.lib.Cocos2dxSoundMP ) p0 ).pauseEffect ( v2 ); // invoke-virtual {p0, v2}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->pauseEffect(I)V
/* .line 368 */
} // :cond_1
(( org.cocos2dx.lib.Cocos2dxSoundMP ) p0 ).resumeEffect ( v2 ); // invoke-virtual {p0, v2}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->resumeEffect(I)V
} // .end method
private Integer playEffectFromOtherChannel ( java.lang.String p0, Boolean p1, Integer p2 ) {
/* .locals 7 */
/* .param p1, "path" # Ljava/lang/String; */
/* .param p2, "isLoop" # Z */
/* .param p3, "channel" # I */
/* .prologue */
int v4 = -1; // const/4 v4, -0x1
/* .line 180 */
/* new-instance v5, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( p1 );
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v5 ).append ( p3 ); // invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 182 */
/* .local v1, "haskey":Ljava/lang/String; */
int v5 = 3; // const/4 v5, 0x3
/* if-lt p3, v5, :cond_1 */
/* .line 229 */
} // :cond_0
} // :goto_0
/* .line 186 */
} // :cond_1
v5 = this.mPathSoundIDMap;
(( java.util.concurrent.ConcurrentHashMap ) v5 ).get ( v1 ); // invoke-virtual {v5, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v3, Ljava/lang/Integer; */
/* .line 187 */
/* .local v3, "soundId":Ljava/lang/Integer; */
if ( v3 != null) { // if-eqz v3, :cond_4
/* .line 189 */
v4 = this.mMediaPlayer;
v5 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
/* aget-object v4, v4, v5 */
/* if-nez v4, :cond_2 */
/* .line 190 */
final String v4 = "Cocos2dxSoundMP"; // const-string v4, "Cocos2dxSoundMP"
/* new-instance v5, Ljava/lang/StringBuilder; */
final String v6 = "playEffect:mMediaPlayer is null - "; // const-string v6, "playEffect:mMediaPlayer is null - "
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v5 ).append ( p1 ); // invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = "channel: "; // const-string v6, "channel: "
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( p3 ); // invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v4,v5 );
/* .line 229 */
} // :goto_1
int v4 = 1; // const/4 v4, 0x1
/* .line 192 */
} // :cond_2
int v2 = 0; // const/4 v2, 0x0
/* .line 194 */
/* .local v2, "isplaying":Z */
try { // :try_start_0
v4 = this.mMediaPlayer;
v5 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
/* aget-object v4, v4, v5 */
(( android.media.MediaPlayer ) v4 ).isPlaying ( ); // invoke-virtual {v4}, Landroid/media/MediaPlayer;->isPlaying()Z
/* :try_end_0 */
v2 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 202 */
} // :goto_2
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 205 */
/* add-int/lit8 v4, p3, 0x1 */
/* invoke-direct {p0, p1, p2, v4}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->playEffectFromOtherChannel(Ljava/lang/String;ZI)I */
/* .line 195 */
/* :catch_0 */
/* move-exception v0 */
/* .line 198 */
/* .local v0, "e":Ljava/lang/Exception; */
int v2 = 1; // const/4 v2, 0x1
/* .line 199 */
final String v4 = "Cocos2dxSoundMP"; // const-string v4, "Cocos2dxSoundMP"
final String v5 = "playEffect: isplaying error state"; // const-string v5, "playEffect: isplaying error state"
android.util.Log .e ( v4,v5 );
/* .line 210 */
} // .end local v0 # "e":Ljava/lang/Exception;
} // :cond_3
try { // :try_start_1
v4 = this.mMediaPlayer;
v5 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
/* aget-object v4, v4, v5 */
(( android.media.MediaPlayer ) v4 ).setLooping ( p2 ); // invoke-virtual {v4, p2}, Landroid/media/MediaPlayer;->setLooping(Z)V
/* .line 211 */
v4 = this.mMediaPlayer;
v5 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
/* aget-object v4, v4, v5 */
(( android.media.MediaPlayer ) v4 ).start ( ); // invoke-virtual {v4}, Landroid/media/MediaPlayer;->start()V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 212 */
/* :catch_1 */
/* move-exception v0 */
/* .line 213 */
/* .restart local v0 # "e":Ljava/lang/Exception; */
final String v4 = "Cocos2dxSoundMP"; // const-string v4, "Cocos2dxSoundMP"
final String v5 = "playEffect: error state"; // const-string v5, "playEffect: error state"
android.util.Log .e ( v4,v5 );
/* .line 221 */
} // .end local v0 # "e":Ljava/lang/Exception;
} // .end local v2 # "isplaying":Z
} // :cond_4
v5 = /* invoke-direct {p0, p1, p3}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->preloadEffect(Ljava/lang/String;I)I */
java.lang.Integer .valueOf ( v5 );
/* .line 222 */
v5 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
/* if-eq v5, v4, :cond_0 */
/* .line 227 */
/* invoke-direct {p0, p1, p2, p3}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->playEffectFromOtherChannel(Ljava/lang/String;ZI)I */
} // .end method
private Integer preloadEffect ( java.lang.String p0, Integer p1 ) {
/* .locals 5 */
/* .param p1, "path" # Ljava/lang/String; */
/* .param p2, "channel" # I */
/* .prologue */
/* .line 156 */
int v1 = -1; // const/4 v1, -0x1
/* .line 158 */
/* .local v1, "soundId":I */
int v3 = 3; // const/4 v3, 0x3
/* if-lt p2, v3, :cond_0 */
/* move v2, v1 */
/* .line 175 */
} // .end local v1 # "soundId":I
/* .local v2, "soundId":I */
} // :goto_0
/* .line 162 */
} // .end local v2 # "soundId":I
/* .restart local v1 # "soundId":I */
} // :cond_0
/* new-instance v3, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( p1 );
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( p2 ); // invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 165 */
/* .local v0, "haskey":Ljava/lang/String; */
v3 = this.mPathSoundIDMap;
(( java.util.concurrent.ConcurrentHashMap ) v3 ).get ( v0 ); // invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 166 */
v3 = this.mPathSoundIDMap;
(( java.util.concurrent.ConcurrentHashMap ) v3 ).get ( v0 ); // invoke-virtual {v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v3, Ljava/lang/Integer; */
v1 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
} // :cond_1
} // :goto_1
/* move v2, v1 */
/* .line 175 */
} // .end local v1 # "soundId":I
/* .restart local v2 # "soundId":I */
/* .line 168 */
} // .end local v2 # "soundId":I
/* .restart local v1 # "soundId":I */
} // :cond_2
v1 = (( org.cocos2dx.lib.Cocos2dxSoundMP ) p0 ).createSoundIdFromAsset ( p1 ); // invoke-virtual {p0, p1}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->createSoundIdFromAsset(Ljava/lang/String;)I
/* .line 170 */
int v3 = -1; // const/4 v3, -0x1
/* if-eq v1, v3, :cond_1 */
/* .line 172 */
v3 = this.mPathSoundIDMap;
java.lang.Integer .valueOf ( v1 );
(( java.util.concurrent.ConcurrentHashMap ) v3 ).put ( v0, v4 ); // invoke-virtual {v3, v0, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // .end method
/* # virtual methods */
public Integer createSoundIdFromAsset ( java.lang.String p0 ) {
/* .locals 4 */
/* .param p1, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 324 */
int v1 = -1; // const/4 v1, -0x1
/* .line 327 */
/* .local v1, "soundId":I */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "emptySlot":I */
} // :goto_0
/* const/16 v2, 0x2d */
/* if-lt v0, v2, :cond_1 */
/* .line 335 */
} // :goto_1
int v2 = -1; // const/4 v2, -0x1
/* if-eq v1, v2, :cond_0 */
/* .line 337 */
v2 = this.mMediaPlayer;
/* invoke-direct {p0, p1}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->createMediaplayerFromAssets(Ljava/lang/String;)Landroid/media/MediaPlayer; */
/* aput-object v3, v2, v1 */
/* .line 338 */
v2 = this.mMediaPlayer;
/* aget-object v2, v2, v1 */
/* if-nez v2, :cond_0 */
/* .line 340 */
int v1 = -1; // const/4 v1, -0x1
/* .line 344 */
} // :cond_0
/* .line 329 */
} // :cond_1
v2 = this.mMediaPlayer;
/* aget-object v2, v2, v0 */
/* if-nez v2, :cond_2 */
/* .line 331 */
/* move v1, v0 */
/* .line 332 */
/* .line 327 */
} // :cond_2
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public void end ( ) {
/* .locals 3 */
/* .prologue */
/* .line 308 */
v1 = this.mPathSoundIDMap;
(( java.util.concurrent.ConcurrentHashMap ) v1 ).clear ( ); // invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V
/* .line 309 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
/* const/16 v1, 0x2d */
/* if-lt v0, v1, :cond_0 */
/* .line 320 */
/* invoke-direct {p0}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->initData()V */
/* .line 321 */
return;
/* .line 311 */
} // :cond_0
v1 = this.mMediaPlayer;
/* aget-object v1, v1, v0 */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 314 */
try { // :try_start_0
v1 = this.mMediaPlayer;
/* aget-object v1, v1, v0 */
(( android.media.MediaPlayer ) v1 ).release ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->release()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 317 */
} // :goto_1
v1 = this.mMediaPlayer;
int v2 = 0; // const/4 v2, 0x0
/* aput-object v2, v1, v0 */
/* .line 309 */
} // :cond_1
/* add-int/lit8 v0, v0, 0x1 */
/* .line 315 */
/* :catch_0 */
/* move-exception v1 */
} // .end method
public Float getEffectsVolume ( ) {
/* .locals 2 */
/* .prologue */
/* .line 280 */
/* iget v0, p0, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->mLeftVolume:F */
/* iget v1, p0, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->mRightVolume:F */
/* add-float/2addr v0, v1 */
/* const/high16 v1, 0x40000000 # 2.0f */
/* div-float/2addr v0, v1 */
} // .end method
public void pauseAllEffects ( ) {
/* .locals 1 */
/* .prologue */
/* .line 261 */
int v0 = 1; // const/4 v0, 0x1
/* invoke-direct {p0, v0}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->pauseOrResumeAllEffects(Z)V */
/* .line 262 */
return;
} // .end method
public void pauseEffect ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "soundId" # I */
/* .prologue */
/* .line 242 */
v0 = this.mMediaPlayer;
/* aget-object v0, v0, p1 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 244 */
try { // :try_start_0
v0 = this.mMediaPlayer;
/* aget-object v0, v0, p1 */
(( android.media.MediaPlayer ) v0 ).pause ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 248 */
} // :cond_0
} // :goto_0
return;
/* .line 245 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
public Integer playEffect ( java.lang.String p0, Boolean p1 ) {
/* .locals 6 */
/* .param p1, "path" # Ljava/lang/String; */
/* .param p2, "isLoop" # Z */
/* .prologue */
int v3 = -1; // const/4 v3, -0x1
/* .line 105 */
v4 = this.mPathSoundIDMap;
(( java.util.concurrent.ConcurrentHashMap ) v4 ).get ( p1 ); // invoke-virtual {v4, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v2, Ljava/lang/Integer; */
/* .line 107 */
/* .local v2, "soundId":Ljava/lang/Integer; */
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 109 */
v3 = this.mMediaPlayer;
v4 = (( java.lang.Integer ) v2 ).intValue ( ); // invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
/* aget-object v3, v3, v4 */
/* if-nez v3, :cond_1 */
/* .line 110 */
final String v3 = "Cocos2dxSoundMP"; // const-string v3, "Cocos2dxSoundMP"
/* new-instance v4, Ljava/lang/StringBuilder; */
final String v5 = "playEffect:mMediaPlayer is null - "; // const-string v5, "playEffect:mMediaPlayer is null - "
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v4 ).append ( p1 ); // invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v3,v4 );
/* .line 148 */
} // :goto_0
v3 = (( java.lang.Integer ) v2 ).intValue ( ); // invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
} // :cond_0
/* .line 112 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 114 */
/* .local v1, "isplaying":Z */
try { // :try_start_0
v3 = this.mMediaPlayer;
v4 = (( java.lang.Integer ) v2 ).intValue ( ); // invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
/* aget-object v3, v3, v4 */
(( android.media.MediaPlayer ) v3 ).isPlaying ( ); // invoke-virtual {v3}, Landroid/media/MediaPlayer;->isPlaying()Z
/* :try_end_0 */
v1 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 122 */
} // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 125 */
int v3 = 1; // const/4 v3, 0x1
/* invoke-direct {p0, p1, p2, v3}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->playEffectFromOtherChannel(Ljava/lang/String;ZI)I */
/* .line 115 */
/* :catch_0 */
/* move-exception v0 */
/* .line 118 */
/* .local v0, "e":Ljava/lang/Exception; */
int v1 = 1; // const/4 v1, 0x1
/* .line 119 */
final String v3 = "Cocos2dxSoundMP"; // const-string v3, "Cocos2dxSoundMP"
final String v4 = "playEffect: isplaying error state"; // const-string v4, "playEffect: isplaying error state"
android.util.Log .e ( v3,v4 );
/* .line 130 */
} // .end local v0 # "e":Ljava/lang/Exception;
} // :cond_2
try { // :try_start_1
v3 = this.mMediaPlayer;
v4 = (( java.lang.Integer ) v2 ).intValue ( ); // invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
/* aget-object v3, v3, v4 */
(( android.media.MediaPlayer ) v3 ).setLooping ( p2 ); // invoke-virtual {v3, p2}, Landroid/media/MediaPlayer;->setLooping(Z)V
/* .line 131 */
v3 = this.mMediaPlayer;
v4 = (( java.lang.Integer ) v2 ).intValue ( ); // invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
/* aget-object v3, v3, v4 */
(( android.media.MediaPlayer ) v3 ).start ( ); // invoke-virtual {v3}, Landroid/media/MediaPlayer;->start()V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 132 */
/* :catch_1 */
/* move-exception v0 */
/* .line 133 */
/* .restart local v0 # "e":Ljava/lang/Exception; */
final String v3 = "Cocos2dxSoundMP"; // const-string v3, "Cocos2dxSoundMP"
final String v4 = "playEffect: error state"; // const-string v4, "playEffect: error state"
android.util.Log .e ( v3,v4 );
/* .line 139 */
} // .end local v0 # "e":Ljava/lang/Exception;
} // .end local v1 # "isplaying":Z
} // :cond_3
v4 = (( org.cocos2dx.lib.Cocos2dxSoundMP ) p0 ).preloadEffect ( p1 ); // invoke-virtual {p0, p1}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->preloadEffect(Ljava/lang/String;)I
java.lang.Integer .valueOf ( v4 );
/* .line 140 */
v4 = (( java.lang.Integer ) v2 ).intValue ( ); // invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
/* if-eq v4, v3, :cond_0 */
/* .line 145 */
(( org.cocos2dx.lib.Cocos2dxSoundMP ) p0 ).playEffect ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->playEffect(Ljava/lang/String;Z)I
} // .end method
public Integer preloadEffect ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 70 */
int v0 = -1; // const/4 v0, -0x1
/* .line 73 */
/* .local v0, "soundId":I */
v1 = this.mPathSoundIDMap;
(( java.util.concurrent.ConcurrentHashMap ) v1 ).get ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 74 */
v1 = this.mPathSoundIDMap;
(( java.util.concurrent.ConcurrentHashMap ) v1 ).get ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/Integer; */
v0 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
/* .line 83 */
} // :cond_0
} // :goto_0
/* .line 76 */
} // :cond_1
v0 = (( org.cocos2dx.lib.Cocos2dxSoundMP ) p0 ).createSoundIdFromAsset ( p1 ); // invoke-virtual {p0, p1}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->createSoundIdFromAsset(Ljava/lang/String;)I
/* .line 78 */
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_0 */
/* .line 80 */
v1 = this.mPathSoundIDMap;
java.lang.Integer .valueOf ( v0 );
(( java.util.concurrent.ConcurrentHashMap ) v1 ).put ( p1, v2 ); // invoke-virtual {v1, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // .end method
public void resumeAllEffects ( ) {
/* .locals 1 */
/* .prologue */
/* .line 266 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, v0}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->pauseOrResumeAllEffects(Z)V */
/* .line 267 */
return;
} // .end method
public void resumeEffect ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "soundId" # I */
/* .prologue */
/* .line 251 */
v0 = this.mMediaPlayer;
/* aget-object v0, v0, p1 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 253 */
try { // :try_start_0
v0 = this.mMediaPlayer;
/* aget-object v0, v0, p1 */
(( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 257 */
} // :cond_0
} // :goto_0
return;
/* .line 254 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
public void setEffectsVolume ( Float p0 ) {
/* .locals 4 */
/* .param p1, "volume" # F */
/* .prologue */
/* .line 286 */
int v1 = 0; // const/4 v1, 0x0
/* cmpg-float v1, p1, v1 */
/* if-gez v1, :cond_0 */
/* .line 287 */
int p1 = 0; // const/4 p1, 0x0
/* .line 289 */
} // :cond_0
/* const/high16 v1, 0x3f800000 # 1.0f */
/* cmpl-float v1, p1, v1 */
/* if-lez v1, :cond_1 */
/* .line 290 */
/* const/high16 p1, 0x3f800000 # 1.0f */
/* .line 293 */
} // :cond_1
/* iput p1, p0, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->mRightVolume:F */
/* iput p1, p0, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->mLeftVolume:F */
/* .line 295 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
/* const/16 v1, 0x2d */
/* if-lt v0, v1, :cond_2 */
/* .line 305 */
return;
/* .line 297 */
} // :cond_2
v1 = this.mMediaPlayer;
/* aget-object v1, v1, v0 */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 300 */
try { // :try_start_0
v1 = this.mMediaPlayer;
/* aget-object v1, v1, v0 */
/* iget v2, p0, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->mLeftVolume:F */
/* iget v3, p0, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->mRightVolume:F */
(( android.media.MediaPlayer ) v1 ).setVolume ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/media/MediaPlayer;->setVolume(FF)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 295 */
} // :cond_3
} // :goto_1
/* add-int/lit8 v0, v0, 0x1 */
/* .line 301 */
/* :catch_0 */
/* move-exception v1 */
} // .end method
public void stopAllEffects ( ) {
/* .locals 4 */
/* .prologue */
/* .line 271 */
v3 = this.mPathSoundIDMap;
(( java.util.concurrent.ConcurrentHashMap ) v3 ).entrySet ( ); // invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;
/* .line 272 */
/* .local v1, "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;" */
v3 = } // :goto_0
/* if-nez v3, :cond_0 */
/* .line 277 */
return;
/* .line 273 */
} // :cond_0
/* check-cast v0, Ljava/util/Map$Entry; */
/* .line 274 */
/* .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Integer;>;" */
/* check-cast v3, Ljava/lang/Integer; */
v2 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
/* .line 275 */
/* .local v2, "soundId":I */
(( org.cocos2dx.lib.Cocos2dxSoundMP ) p0 ).stopEffect ( v2 ); // invoke-virtual {p0, v2}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->stopEffect(I)V
} // .end method
public void stopEffect ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "soundId" # I */
/* .prologue */
/* .line 233 */
v0 = this.mMediaPlayer;
/* aget-object v0, v0, p1 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 235 */
try { // :try_start_0
v0 = this.mMediaPlayer;
/* aget-object v0, v0, p1 */
(( android.media.MediaPlayer ) v0 ).stop ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 239 */
} // :cond_0
} // :goto_0
return;
/* .line 236 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
public void unloadEffect ( java.lang.String p0 ) {
/* .locals 4 */
/* .param p1, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 88 */
v1 = this.mPathSoundIDMap;
(( java.util.concurrent.ConcurrentHashMap ) v1 ).remove ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Integer; */
/* .line 90 */
/* .local v0, "soundId":Ljava/lang/Integer; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 92 */
v1 = this.mMediaPlayer;
v2 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* aget-object v1, v1, v2 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 96 */
try { // :try_start_0
v1 = this.mMediaPlayer;
v2 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* aget-object v1, v1, v2 */
(( android.media.MediaPlayer ) v1 ).release ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->release()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 99 */
} // :goto_0
v1 = this.mMediaPlayer;
v2 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
int v3 = 0; // const/4 v3, 0x0
/* aput-object v3, v1, v2 */
/* .line 102 */
} // :cond_0
return;
/* .line 97 */
/* :catch_0 */
/* move-exception v1 */
} // .end method

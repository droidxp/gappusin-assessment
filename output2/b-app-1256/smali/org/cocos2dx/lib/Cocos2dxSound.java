public class org.cocos2dx.lib.Cocos2dxSound {
	 /* .source "Cocos2dxSound.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/cocos2dx/lib/Cocos2dxSound$OnLoadCompletedListener;, */
	 /* Lorg/cocos2dx/lib/Cocos2dxSound$SoundInfoForLoadedCompleted; */
	 /* } */
} // .end annotation
/* # static fields */
private static final Integer INVALID_SOUND_ID;
private static final Integer INVALID_STREAM_ID;
private static final Integer MAX_SIMULTANEOUS_STREAMS_DEFAULT;
private static final Integer SOUND_PRIORITY;
private static final Integer SOUND_QUALITY;
private static final Float SOUND_RATE;
private static final java.lang.String TAG;
/* # instance fields */
private final android.content.Context mContext;
private final java.util.ArrayList mEffecToPlayWhenLoadedArray;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lorg/cocos2dx/lib/Cocos2dxSound$SoundInfoForLoadedCompleted;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private Float mLeftVolume;
private final java.util.HashMap mPathSoundIDMap;
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
private final java.util.HashMap mPathStreamIDsMap;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Ljava/lang/Integer;", */
/* ">;>;" */
/* } */
} // .end annotation
} // .end field
private Float mRightVolume;
private java.util.concurrent.Semaphore mSemaphore;
private android.media.SoundPool mSoundPool;
private Integer mStreamIdSyn;
/* # direct methods */
public org.cocos2dx.lib.Cocos2dxSound ( ) {
/* .locals 1 */
/* .param p1, "pContext" # Landroid/content/Context; */
/* .prologue */
/* .line 78 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 57 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.mPathStreamIDsMap = v0;
/* .line 59 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.mPathSoundIDMap = v0;
/* .line 61 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.mEffecToPlayWhenLoadedArray = v0;
/* .line 79 */
this.mContext = p1;
/* .line 81 */
/* invoke-direct {p0}, Lorg/cocos2dx/lib/Cocos2dxSound;->initData()V */
/* .line 82 */
return;
} // .end method
static java.util.ArrayList access$0 ( org.cocos2dx.lib.Cocos2dxSound p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 61 */
v0 = this.mEffecToPlayWhenLoadedArray;
} // .end method
static Integer access$1 ( org.cocos2dx.lib.Cocos2dxSound p0, java.lang.String p1, Integer p2, Boolean p3 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 278 */
v0 = /* invoke-direct {p0, p1, p2, p3}, Lorg/cocos2dx/lib/Cocos2dxSound;->doPlayEffect(Ljava/lang/String;IZ)I */
} // .end method
static void access$2 ( org.cocos2dx.lib.Cocos2dxSound p0, Integer p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 63 */
/* iput p1, p0, Lorg/cocos2dx/lib/Cocos2dxSound;->mStreamIdSyn:I */
return;
} // .end method
static java.util.concurrent.Semaphore access$3 ( org.cocos2dx.lib.Cocos2dxSound p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 64 */
v0 = this.mSemaphore;
} // .end method
private Integer doPlayEffect ( java.lang.String p0, Integer p1, Boolean p2 ) {
/* .locals 9 */
/* .param p1, "pPath" # Ljava/lang/String; */
/* .param p2, "soundId" # I */
/* .param p3, "pLoop" # Z */
/* .prologue */
/* .line 280 */
v0 = this.mSoundPool;
/* iget v2, p0, Lorg/cocos2dx/lib/Cocos2dxSound;->mLeftVolume:F */
/* iget v3, p0, Lorg/cocos2dx/lib/Cocos2dxSound;->mRightVolume:F */
int v4 = 1; // const/4 v4, 0x1
if ( p3 != null) { // if-eqz p3, :cond_1
int v5 = -1; // const/4 v5, -0x1
} // :goto_0
/* const/high16 v6, 0x3f800000 # 1.0f */
/* move v1, p2 */
v7 = /* invoke-virtual/range {v0 ..v6}, Landroid/media/SoundPool;->play(IFFIIF)I */
/* .line 283 */
/* .local v7, "streamID":I */
v0 = this.mPathStreamIDsMap;
(( java.util.HashMap ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v8, Ljava/util/ArrayList; */
/* .line 284 */
/* .local v8, "streamIDs":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;" */
/* if-nez v8, :cond_0 */
/* .line 285 */
/* new-instance v8, Ljava/util/ArrayList; */
} // .end local v8 # "streamIDs":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
/* invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V */
/* .line 286 */
/* .restart local v8 # "streamIDs":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;" */
v0 = this.mPathStreamIDsMap;
(( java.util.HashMap ) v0 ).put ( p1, v8 ); // invoke-virtual {v0, p1, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 288 */
} // :cond_0
java.lang.Integer .valueOf ( v7 );
(( java.util.ArrayList ) v8 ).add ( v0 ); // invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 290 */
/* .line 280 */
} // .end local v7 # "streamID":I
} // .end local v8 # "streamIDs":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
} // :cond_1
int v5 = 0; // const/4 v5, 0x0
} // .end method
private void initData ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 5; // const/4 v3, 0x5
/* const/high16 v2, 0x3f000000 # 0.5f */
/* .line 85 */
/* new-instance v0, Landroid/media/SoundPool; */
int v1 = 3; // const/4 v1, 0x3
/* invoke-direct {v0, v3, v1, v3}, Landroid/media/SoundPool;-><init>(III)V */
this.mSoundPool = v0;
/* .line 86 */
v0 = this.mSoundPool;
/* new-instance v1, Lorg/cocos2dx/lib/Cocos2dxSound$OnLoadCompletedListener; */
/* invoke-direct {v1, p0}, Lorg/cocos2dx/lib/Cocos2dxSound$OnLoadCompletedListener;-><init>(Lorg/cocos2dx/lib/Cocos2dxSound;)V */
(( android.media.SoundPool ) v0 ).setOnLoadCompleteListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/media/SoundPool;->setOnLoadCompleteListener(Landroid/media/SoundPool$OnLoadCompleteListener;)V
/* .line 88 */
/* iput v2, p0, Lorg/cocos2dx/lib/Cocos2dxSound;->mLeftVolume:F */
/* .line 89 */
/* iput v2, p0, Lorg/cocos2dx/lib/Cocos2dxSound;->mRightVolume:F */
/* .line 91 */
/* new-instance v0, Ljava/util/concurrent/Semaphore; */
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
/* invoke-direct {v0, v1, v2}, Ljava/util/concurrent/Semaphore;-><init>(IZ)V */
this.mSemaphore = v0;
/* .line 92 */
return;
} // .end method
/* # virtual methods */
public Integer createSoundIDFromAsset ( java.lang.String p0 ) {
/* .locals 5 */
/* .param p1, "pPath" # Ljava/lang/String; */
/* .prologue */
/* .line 262 */
int v1 = -1; // const/4 v1, -0x1
/* .line 265 */
/* .local v1, "soundID":I */
try { // :try_start_0
final String v2 = "/"; // const-string v2, "/"
v2 = (( java.lang.String ) p1 ).startsWith ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 266 */
v2 = this.mSoundPool;
int v3 = 0; // const/4 v3, 0x0
v1 = (( android.media.SoundPool ) v2 ).load ( p1, v3 ); // invoke-virtual {v2, p1, v3}, Landroid/media/SoundPool;->load(Ljava/lang/String;I)I
/* .line 275 */
} // :goto_0
/* .line 268 */
} // :cond_0
v2 = this.mSoundPool;
v3 = this.mContext;
(( android.content.Context ) v3 ).getAssets ( ); // invoke-virtual {v3}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
(( android.content.res.AssetManager ) v3 ).openFd ( p1 ); // invoke-virtual {v3, p1}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
int v4 = 0; // const/4 v4, 0x0
(( android.media.SoundPool ) v2 ).load ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/media/SoundPool;->load(Landroid/content/res/AssetFileDescriptor;I)I
/* :try_end_0 */
v1 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 270 */
/* :catch_0 */
/* move-exception v0 */
/* .line 271 */
/* .local v0, "e":Ljava/lang/Exception; */
int v1 = -1; // const/4 v1, -0x1
/* .line 272 */
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
/* .locals 2 */
/* .prologue */
/* const/high16 v1, 0x3f000000 # 0.5f */
/* .line 250 */
v0 = this.mSoundPool;
(( android.media.SoundPool ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/SoundPool;->release()V
/* .line 251 */
v0 = this.mPathStreamIDsMap;
(( java.util.HashMap ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
/* .line 252 */
v0 = this.mPathSoundIDMap;
(( java.util.HashMap ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
/* .line 253 */
v0 = this.mEffecToPlayWhenLoadedArray;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
/* .line 255 */
/* iput v1, p0, Lorg/cocos2dx/lib/Cocos2dxSound;->mLeftVolume:F */
/* .line 256 */
/* iput v1, p0, Lorg/cocos2dx/lib/Cocos2dxSound;->mRightVolume:F */
/* .line 258 */
/* invoke-direct {p0}, Lorg/cocos2dx/lib/Cocos2dxSound;->initData()V */
/* .line 259 */
return;
} // .end method
public Float getEffectsVolume ( ) {
/* .locals 2 */
/* .prologue */
/* .line 223 */
/* iget v0, p0, Lorg/cocos2dx/lib/Cocos2dxSound;->mLeftVolume:F */
/* iget v1, p0, Lorg/cocos2dx/lib/Cocos2dxSound;->mRightVolume:F */
/* add-float/2addr v0, v1 */
/* const/high16 v1, 0x40000000 # 2.0f */
/* div-float/2addr v0, v1 */
} // .end method
public void pauseAllEffects ( ) {
/* .locals 1 */
/* .prologue */
/* .line 188 */
v0 = this.mSoundPool;
(( android.media.SoundPool ) v0 ).autoPause ( ); // invoke-virtual {v0}, Landroid/media/SoundPool;->autoPause()V
/* .line 189 */
return;
} // .end method
public void pauseEffect ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "pStreamID" # I */
/* .prologue */
/* .line 180 */
v0 = this.mSoundPool;
(( android.media.SoundPool ) v0 ).pause ( p1 ); // invoke-virtual {v0, p1}, Landroid/media/SoundPool;->pause(I)V
/* .line 181 */
return;
} // .end method
public Integer playEffect ( java.lang.String p0, Boolean p1 ) {
/* .locals 8 */
/* .param p1, "pPath" # Ljava/lang/String; */
/* .param p2, "pLoop" # Z */
/* .prologue */
int v3 = -1; // const/4 v3, -0x1
/* .line 134 */
v4 = this.mPathSoundIDMap;
(( java.util.HashMap ) v4 ).get ( p1 ); // invoke-virtual {v4, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/Integer; */
/* .line 135 */
/* .local v1, "soundID":Ljava/lang/Integer; */
int v2 = -1; // const/4 v2, -0x1
/* .line 137 */
/* .local v2, "streamID":I */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 139 */
v3 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
v2 = /* invoke-direct {p0, p1, v3, p2}, Lorg/cocos2dx/lib/Cocos2dxSound;->doPlayEffect(Ljava/lang/String;IZ)I */
} // :goto_0
/* move v3, v2 */
/* .line 164 */
} // :cond_0
} // :goto_1
/* .line 142 */
} // :cond_1
v4 = (( org.cocos2dx.lib.Cocos2dxSound ) p0 ).preloadEffect ( p1 ); // invoke-virtual {p0, p1}, Lorg/cocos2dx/lib/Cocos2dxSound;->preloadEffect(Ljava/lang/String;)I
java.lang.Integer .valueOf ( v4 );
/* .line 143 */
v4 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
/* if-eq v4, v3, :cond_0 */
/* .line 149 */
v4 = this.mSoundPool;
/* monitor-enter v4 */
/* .line 151 */
try { // :try_start_0
v5 = this.mEffecToPlayWhenLoadedArray;
/* new-instance v6, Lorg/cocos2dx/lib/Cocos2dxSound$SoundInfoForLoadedCompleted; */
v7 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
/* invoke-direct {v6, p0, p1, v7, p2}, Lorg/cocos2dx/lib/Cocos2dxSound$SoundInfoForLoadedCompleted;-><init>(Lorg/cocos2dx/lib/Cocos2dxSound;Ljava/lang/String;IZ)V */
(( java.util.ArrayList ) v5 ).add ( v6 ); // invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 155 */
try { // :try_start_1
v5 = this.mSemaphore;
(( java.util.concurrent.Semaphore ) v5 ).acquire ( ); // invoke-virtual {v5}, Ljava/util/concurrent/Semaphore;->acquire()V
/* .line 157 */
/* iget v2, p0, Lorg/cocos2dx/lib/Cocos2dxSound;->mStreamIdSyn:I */
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 149 */
try { // :try_start_2
/* monitor-exit v4 */
/* :catchall_0 */
/* move-exception v3 */
/* monitor-exit v4 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* throw v3 */
/* .line 158 */
/* :catch_0 */
/* move-exception v0 */
/* .line 159 */
/* .local v0, "e":Ljava/lang/Exception; */
try { // :try_start_3
/* monitor-exit v4 */
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
} // .end method
public Integer preloadEffect ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "pPath" # Ljava/lang/String; */
/* .prologue */
/* .line 107 */
v1 = this.mPathSoundIDMap;
(( java.util.HashMap ) v1 ).get ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Integer; */
/* .line 109 */
/* .local v0, "soundID":Ljava/lang/Integer; */
/* if-nez v0, :cond_0 */
/* .line 110 */
v1 = (( org.cocos2dx.lib.Cocos2dxSound ) p0 ).createSoundIDFromAsset ( p1 ); // invoke-virtual {p0, p1}, Lorg/cocos2dx/lib/Cocos2dxSound;->createSoundIDFromAsset(Ljava/lang/String;)I
java.lang.Integer .valueOf ( v1 );
/* .line 111 */
v1 = this.mPathSoundIDMap;
(( java.util.HashMap ) v1 ).put ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 114 */
} // :cond_0
v1 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
} // .end method
public void resumeAllEffects ( ) {
/* .locals 5 */
/* .prologue */
/* .line 194 */
v3 = this.mPathStreamIDsMap;
v3 = (( java.util.HashMap ) v3 ).isEmpty ( ); // invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z
/* if-nez v3, :cond_1 */
/* .line 195 */
v3 = this.mPathStreamIDsMap;
(( java.util.HashMap ) v3 ).entrySet ( ); // invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
/* .line 196 */
/* .local v1, "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/ArrayList<Ljava/lang/Integer;>;>;>;" */
v3 = } // :cond_0
/* if-nez v3, :cond_2 */
/* .line 203 */
} // .end local v1 # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/ArrayList<Ljava/lang/Integer;>;>;>;"
} // :cond_1
return;
/* .line 197 */
/* .restart local v1 # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/ArrayList<Ljava/lang/Integer;>;>;>;" */
} // :cond_2
/* check-cast v0, Ljava/util/Map$Entry; */
/* .line 198 */
/* .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/ArrayList<Ljava/lang/Integer;>;>;" */
/* check-cast v3, Ljava/util/ArrayList; */
(( java.util.ArrayList ) v3 ).iterator ( ); // invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v3 = } // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_0
/* check-cast v3, Ljava/lang/Integer; */
v2 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
/* .line 199 */
/* .local v2, "pStreamID":I */
v3 = this.mSoundPool;
(( android.media.SoundPool ) v3 ).resume ( v2 ); // invoke-virtual {v3, v2}, Landroid/media/SoundPool;->resume(I)V
} // .end method
public void resumeEffect ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "pStreamID" # I */
/* .prologue */
/* .line 184 */
v0 = this.mSoundPool;
(( android.media.SoundPool ) v0 ).resume ( p1 ); // invoke-virtual {v0, p1}, Landroid/media/SoundPool;->resume(I)V
/* .line 185 */
return;
} // .end method
public void setEffectsVolume ( Float p0 ) {
/* .locals 7 */
/* .param p1, "pVolume" # F */
/* .prologue */
/* .line 228 */
int v3 = 0; // const/4 v3, 0x0
/* cmpg-float v3, p1, v3 */
/* if-gez v3, :cond_0 */
/* .line 229 */
int p1 = 0; // const/4 p1, 0x0
/* .line 231 */
} // :cond_0
/* const/high16 v3, 0x3f800000 # 1.0f */
/* cmpl-float v3, p1, v3 */
/* if-lez v3, :cond_1 */
/* .line 232 */
/* const/high16 p1, 0x3f800000 # 1.0f */
/* .line 235 */
} // :cond_1
/* iput p1, p0, Lorg/cocos2dx/lib/Cocos2dxSound;->mRightVolume:F */
/* iput p1, p0, Lorg/cocos2dx/lib/Cocos2dxSound;->mLeftVolume:F */
/* .line 238 */
v3 = this.mPathStreamIDsMap;
v3 = (( java.util.HashMap ) v3 ).isEmpty ( ); // invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z
/* if-nez v3, :cond_3 */
/* .line 239 */
v3 = this.mPathStreamIDsMap;
(( java.util.HashMap ) v3 ).entrySet ( ); // invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
/* .line 240 */
/* .local v1, "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/ArrayList<Ljava/lang/Integer;>;>;>;" */
v3 = } // :cond_2
/* if-nez v3, :cond_4 */
/* .line 247 */
} // .end local v1 # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/ArrayList<Ljava/lang/Integer;>;>;>;"
} // :cond_3
return;
/* .line 241 */
/* .restart local v1 # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/ArrayList<Ljava/lang/Integer;>;>;>;" */
} // :cond_4
/* check-cast v0, Ljava/util/Map$Entry; */
/* .line 242 */
/* .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/ArrayList<Ljava/lang/Integer;>;>;" */
/* check-cast v3, Ljava/util/ArrayList; */
(( java.util.ArrayList ) v3 ).iterator ( ); // invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v3 = } // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_2
/* check-cast v3, Ljava/lang/Integer; */
v2 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
/* .line 243 */
/* .local v2, "pStreamID":I */
v3 = this.mSoundPool;
/* iget v5, p0, Lorg/cocos2dx/lib/Cocos2dxSound;->mLeftVolume:F */
/* iget v6, p0, Lorg/cocos2dx/lib/Cocos2dxSound;->mRightVolume:F */
(( android.media.SoundPool ) v3 ).setVolume ( v2, v5, v6 ); // invoke-virtual {v3, v2, v5, v6}, Landroid/media/SoundPool;->setVolume(IFF)V
} // .end method
public void stopAllEffects ( ) {
/* .locals 5 */
/* .prologue */
/* .line 208 */
v3 = this.mPathStreamIDsMap;
v3 = (( java.util.HashMap ) v3 ).isEmpty ( ); // invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z
/* if-nez v3, :cond_1 */
/* .line 209 */
v3 = this.mPathStreamIDsMap;
(( java.util.HashMap ) v3 ).entrySet ( ); // invoke-virtual {v3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
/* .line 210 */
/* .local v1, "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;" */
v3 = } // :cond_0
/* if-nez v3, :cond_2 */
/* .line 219 */
} // .end local v1 # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
} // :cond_1
v3 = this.mPathStreamIDsMap;
(( java.util.HashMap ) v3 ).clear ( ); // invoke-virtual {v3}, Ljava/util/HashMap;->clear()V
/* .line 220 */
return;
/* .line 211 */
/* .restart local v1 # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;" */
} // :cond_2
/* check-cast v0, Ljava/util/Map$Entry; */
/* .line 212 */
/* .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/util/ArrayList<Ljava/lang/Integer;>;>;" */
/* check-cast v3, Ljava/util/ArrayList; */
(( java.util.ArrayList ) v3 ).iterator ( ); // invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v3 = } // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_0
/* check-cast v3, Ljava/lang/Integer; */
v2 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
/* .line 213 */
/* .local v2, "pStreamID":I */
v3 = this.mSoundPool;
(( android.media.SoundPool ) v3 ).stop ( v2 ); // invoke-virtual {v3, v2}, Landroid/media/SoundPool;->stop(I)V
} // .end method
public void stopEffect ( Integer p0 ) {
/* .locals 4 */
/* .param p1, "pStreamID" # I */
/* .prologue */
/* .line 168 */
v1 = this.mSoundPool;
(( android.media.SoundPool ) v1 ).stop ( p1 ); // invoke-virtual {v1, p1}, Landroid/media/SoundPool;->stop(I)V
/* .line 171 */
v1 = this.mPathStreamIDsMap;
(( java.util.HashMap ) v1 ).keySet ( ); // invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
v1 = } // :cond_0
/* if-nez v1, :cond_1 */
/* .line 177 */
} // :goto_0
return;
/* .line 171 */
} // :cond_1
/* check-cast v0, Ljava/lang/String; */
/* .line 172 */
/* .local v0, "pPath":Ljava/lang/String; */
v1 = this.mPathStreamIDsMap;
(( java.util.HashMap ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/util/ArrayList; */
java.lang.Integer .valueOf ( p1 );
v1 = (( java.util.ArrayList ) v1 ).contains ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 173 */
v1 = this.mPathStreamIDsMap;
(( java.util.HashMap ) v1 ).get ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/util/ArrayList; */
v2 = this.mPathStreamIDsMap;
(( java.util.HashMap ) v2 ).get ( v0 ); // invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v2, Ljava/util/ArrayList; */
java.lang.Integer .valueOf ( p1 );
v2 = (( java.util.ArrayList ) v2 ).indexOf ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I
(( java.util.ArrayList ) v1 ).remove ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
} // .end method
public void unloadEffect ( java.lang.String p0 ) {
/* .locals 6 */
/* .param p1, "pPath" # Ljava/lang/String; */
/* .prologue */
/* .line 119 */
v3 = this.mPathStreamIDsMap;
(( java.util.HashMap ) v3 ).get ( p1 ); // invoke-virtual {v3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v2, Ljava/util/ArrayList; */
/* .line 120 */
/* .local v2, "streamIDs":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;" */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 121 */
(( java.util.ArrayList ) v2 ).iterator ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v4 = } // :goto_0
/* if-nez v4, :cond_1 */
/* .line 125 */
} // :cond_0
v3 = this.mPathStreamIDsMap;
(( java.util.HashMap ) v3 ).remove ( p1 ); // invoke-virtual {v3, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 128 */
v3 = this.mPathSoundIDMap;
(( java.util.HashMap ) v3 ).get ( p1 ); // invoke-virtual {v3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/Integer; */
/* .line 129 */
/* .local v1, "soundID":Ljava/lang/Integer; */
v3 = this.mSoundPool;
v4 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
(( android.media.SoundPool ) v3 ).unload ( v4 ); // invoke-virtual {v3, v4}, Landroid/media/SoundPool;->unload(I)Z
/* .line 130 */
v3 = this.mPathSoundIDMap;
(( java.util.HashMap ) v3 ).remove ( p1 ); // invoke-virtual {v3, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 131 */
return;
/* .line 121 */
} // .end local v1 # "soundID":Ljava/lang/Integer;
} // :cond_1
/* check-cast v0, Ljava/lang/Integer; */
/* .line 122 */
/* .local v0, "pStreamID":Ljava/lang/Integer; */
v4 = this.mSoundPool;
v5 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
(( android.media.SoundPool ) v4 ).stop ( v5 ); // invoke-virtual {v4, v5}, Landroid/media/SoundPool;->stop(I)V
} // .end method

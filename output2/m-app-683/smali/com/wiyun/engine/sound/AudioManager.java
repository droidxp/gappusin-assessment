public class com.wiyun.engine.sound.AudioManager implements android.media.AudioTrack$OnPlaybackPositionUpdateListener {
	 /* .source "AudioManager.java" */
	 /* # interfaces */
	 /* # static fields */
	 public static final Integer FORMAT_MP3;
	 public static final Integer FORMAT_OGG;
	 public static final Integer FORMAT_WAV;
	 private static java.lang.String sBgPath;
	 private static Integer sBgRepeatCount;
	 private static Integer sBgResId;
	 private static Float sBgVolume;
	 private static Boolean sCanPlay;
	 private static Float sEffectVolume;
	 private static Boolean sMute;
	 private static java.util.Map sPath2SoundIdMap;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/Integer;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private static android.media.MediaPlayer sPlayer;
private static Boolean sPlaying;
private static android.media.SoundPool sPool;
private static java.util.Map sResId2SoundIdMap;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/Integer;", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static java.util.Map sSoundId2StreamIdMap;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/Integer;", */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/Integer;", */
/* ">;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.wiyun.engine.sound.AudioManager ( ) {
/* .locals 0 */
/* .prologue */
/* .line 26 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
static Integer access$0 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 40 */
} // .end method
static void access$1 ( Integer p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 40 */
return;
} // .end method
static android.media.MediaPlayer access$2 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 35 */
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
} // .end method
static void access$3 ( Boolean p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 41 */
com.wiyun.engine.sound.AudioManager.sPlaying = (p0!= 0);
return;
} // .end method
static void access$4 ( Boolean p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 47 */
com.wiyun.engine.sound.AudioManager.sCanPlay = (p0!= 0);
return;
} // .end method
static Boolean access$5 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 41 */
/* sget-boolean v0, Lcom/wiyun/engine/sound/AudioManager;->sPlaying:Z */
} // .end method
static synchronized void destroyMediaPlayerBackend ( ) {
/* .locals 2 */
/* .prologue */
/* .line 88 */
/* const-class v1, Lcom/wiyun/engine/sound/AudioManager; */
/* monitor-enter v1 */
try { // :try_start_0
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 89 */
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
(( android.media.MediaPlayer ) v0 ).stop ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V
/* .line 90 */
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
(( android.media.MediaPlayer ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
/* .line 91 */
int v0 = 0; // const/4 v0, 0x0
/* .line 93 */
} // :cond_0
v0 = com.wiyun.engine.sound.AudioManager.sPool;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 94 */
v0 = com.wiyun.engine.sound.AudioManager.sPool;
(( android.media.SoundPool ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/SoundPool;->release()V
/* .line 95 */
int v0 = 0; // const/4 v0, 0x0
/* .line 97 */
} // :cond_1
v0 = com.wiyun.engine.sound.AudioManager.sResId2SoundIdMap;
/* .line 98 */
int v0 = 0; // const/4 v0, 0x0
/* .line 99 */
v0 = com.wiyun.engine.sound.AudioManager.sPath2SoundIdMap;
/* .line 100 */
int v0 = 0; // const/4 v0, 0x0
/* .line 101 */
v0 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
/* .line 102 */
int v0 = 0; // const/4 v0, 0x0
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 103 */
/* monitor-exit v1 */
return;
/* .line 88 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* throw v0 */
} // .end method
public static native Boolean isBackgroundMusicPaused ( ) {
} // .end method
public static native Boolean isBackgroundPlaying ( ) {
} // .end method
public static native Boolean isMuted ( ) {
} // .end method
static synchronized Boolean mpIsBackgroundPlaying ( ) {
/* .locals 2 */
/* .prologue */
/* .line 221 */
/* const-class v1, Lcom/wiyun/engine/sound/AudioManager; */
/* monitor-enter v1 */
try { // :try_start_0
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v0, :cond_0 */
/* .line 222 */
int v0 = 0; // const/4 v0, 0x0
/* .line 224 */
} // :goto_0
/* monitor-exit v1 */
} // :cond_0
try { // :try_start_1
/* sget-boolean v0, Lcom/wiyun/engine/sound/AudioManager;->sPlaying:Z */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 221 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* throw v0 */
} // .end method
static synchronized Boolean mpIsMute ( ) {
/* .locals 2 */
/* .prologue */
/* .line 451 */
/* const-class v0, Lcom/wiyun/engine/sound/AudioManager; */
/* monitor-enter v0 */
try { // :try_start_0
/* sget-boolean v1, Lcom/wiyun/engine/sound/AudioManager;->sMute:Z */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit v0 */
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* throw v1 */
} // .end method
static synchronized void mpPauseBackgroundMusic ( ) {
/* .locals 2 */
/* .prologue */
/* .line 203 */
/* const-class v1, Lcom/wiyun/engine/sound/AudioManager; */
/* monitor-enter v1 */
try { // :try_start_0
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v0, :cond_1 */
/* .line 209 */
} // :cond_0
} // :goto_0
/* monitor-exit v1 */
return;
/* .line 206 */
} // :cond_1
try { // :try_start_1
/* sget-boolean v0, Lcom/wiyun/engine/sound/AudioManager;->sPlaying:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 207 */
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
(( android.media.MediaPlayer ) v0 ).pause ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 203 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* throw v0 */
} // .end method
static synchronized void mpPlayBackgroundMusic ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* .param p0, "resId" # I */
/* .param p1, "format" # I */
/* .param p2, "repeatCount" # I */
/* .prologue */
/* .line 154 */
/* const-class v1, Lcom/wiyun/engine/sound/AudioManager; */
/* monitor-enter v1 */
try { // :try_start_0
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v0, :cond_1 */
/* .line 167 */
} // :cond_0
} // :goto_0
/* monitor-exit v1 */
return;
/* .line 157 */
} // :cond_1
try { // :try_start_1
/* sget-boolean v0, Lcom/wiyun/engine/sound/AudioManager;->sPlaying:Z */
/* if-nez v0, :cond_0 */
/* .line 158 */
int v0 = 1; // const/4 v0, 0x1
com.wiyun.engine.sound.AudioManager.sPlaying = (v0!= 0);
/* .line 159 */
/* .line 160 */
/* if-eq v0, p0, :cond_2 */
/* .line 161 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.sound.AudioManager.sCanPlay = (v0!= 0);
/* .line 162 */
com.wiyun.engine.sound.AudioManager .mpPreloadBackgroundMusic ( p0 );
/* .line 164 */
} // :cond_2
/* sget-boolean v0, Lcom/wiyun/engine/sound/AudioManager;->sCanPlay:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 165 */
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
(( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 154 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* throw v0 */
} // .end method
static synchronized void mpPlayBackgroundMusic ( java.lang.String p0, Boolean p1, Integer p2 ) {
/* .locals 2 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "isFile" # Z */
/* .param p2, "repeatCount" # I */
/* .prologue */
/* .line 170 */
/* const-class v1, Lcom/wiyun/engine/sound/AudioManager; */
/* monitor-enter v1 */
try { // :try_start_0
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v0, :cond_1 */
/* .line 183 */
} // :cond_0
} // :goto_0
/* monitor-exit v1 */
return;
/* .line 173 */
} // :cond_1
try { // :try_start_1
/* sget-boolean v0, Lcom/wiyun/engine/sound/AudioManager;->sPlaying:Z */
/* if-nez v0, :cond_0 */
/* .line 174 */
int v0 = 1; // const/4 v0, 0x1
com.wiyun.engine.sound.AudioManager.sPlaying = (v0!= 0);
/* .line 175 */
/* .line 176 */
v0 = com.wiyun.engine.sound.AudioManager.sBgPath;
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_2 */
/* .line 177 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.sound.AudioManager.sCanPlay = (v0!= 0);
/* .line 178 */
com.wiyun.engine.sound.AudioManager .mpPreloadBackgroundMusic ( p0,p1 );
/* .line 180 */
} // :cond_2
/* sget-boolean v0, Lcom/wiyun/engine/sound/AudioManager;->sCanPlay:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 181 */
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
(( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 170 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* throw v0 */
} // .end method
static synchronized void mpPlayEffect ( Integer p0 ) {
/* .locals 11 */
/* .param p0, "resId" # I */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 288 */
/* const-class v10, Lcom/wiyun/engine/sound/AudioManager; */
/* monitor-enter v10 */
try { // :try_start_0
v0 = com.wiyun.engine.sound.AudioManager.sPool;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = com.wiyun.engine.sound.AudioManager.sResId2SoundIdMap;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v0, :cond_1 */
/* .line 307 */
} // :cond_0
} // :goto_0
/* monitor-exit v10 */
return;
/* .line 291 */
} // :cond_1
try { // :try_start_1
com.wiyun.engine.sound.AudioManager .mpPreloadEffect ( p0 );
/* .line 292 */
v0 = com.wiyun.engine.sound.AudioManager.sResId2SoundIdMap;
java.lang.Integer .valueOf ( p0 );
/* check-cast v7, Ljava/lang/Integer; */
/* .line 293 */
/* .local v7, "soundId":Ljava/lang/Integer; */
if ( v7 != null) { // if-eqz v7, :cond_0
/* .line 294 */
v0 = com.wiyun.engine.sound.AudioManager.sPool;
v1 = (( java.lang.Integer ) v7 ).intValue ( ); // invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I
/* sget-boolean v2, Lcom/wiyun/engine/sound/AudioManager;->sMute:Z */
if ( v2 != null) { // if-eqz v2, :cond_2
/* move v2, v3 */
} // :goto_1
/* sget-boolean v4, Lcom/wiyun/engine/sound/AudioManager;->sMute:Z */
if ( v4 != null) { // if-eqz v4, :cond_3
} // :goto_2
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
/* const/high16 v6, 0x3f800000 # 1.0f */
v8 = /* invoke-virtual/range {v0 ..v6}, Landroid/media/SoundPool;->play(IFFIIF)I */
/* .line 295 */
/* .local v8, "streamId":I */
/* if-nez v8, :cond_4 */
/* .line 296 */
final String v0 = "libwiengine"; // const-string v0, "libwiengine"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Failed to play sound resId: "; // const-string v2, "Failed to play sound resId: "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v0,v1 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 288 */
} // .end local v7 # "soundId":Ljava/lang/Integer;
} // .end local v8 # "streamId":I
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v10 */
/* throw v0 */
/* .line 294 */
/* .restart local v7 # "soundId":Ljava/lang/Integer; */
} // :cond_2
try { // :try_start_2
} // :cond_3
/* .line 300 */
/* .restart local v8 # "streamId":I */
} // :cond_4
v0 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
/* check-cast v9, Ljava/util/List; */
/* .line 301 */
/* .local v9, "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;" */
/* if-nez v9, :cond_5 */
/* .line 302 */
/* new-instance v9, Ljava/util/ArrayList; */
} // .end local v9 # "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
/* invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V */
/* .line 303 */
/* .restart local v9 # "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;" */
v0 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
/* .line 305 */
} // :cond_5
java.lang.Integer .valueOf ( v8 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
} // .end method
static synchronized void mpPlayEffect ( java.lang.String p0, Boolean p1 ) {
/* .locals 11 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "isFile" # Z */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 310 */
/* const-class v10, Lcom/wiyun/engine/sound/AudioManager; */
/* monitor-enter v10 */
try { // :try_start_0
v0 = com.wiyun.engine.sound.AudioManager.sPool;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = com.wiyun.engine.sound.AudioManager.sPath2SoundIdMap;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v0, :cond_1 */
/* .line 329 */
} // :cond_0
} // :goto_0
/* monitor-exit v10 */
return;
/* .line 313 */
} // :cond_1
try { // :try_start_1
com.wiyun.engine.sound.AudioManager .mpPreloadEffect ( p0,p1 );
/* .line 314 */
v0 = com.wiyun.engine.sound.AudioManager.sPath2SoundIdMap;
/* check-cast v7, Ljava/lang/Integer; */
/* .line 315 */
/* .local v7, "soundId":Ljava/lang/Integer; */
if ( v7 != null) { // if-eqz v7, :cond_0
/* .line 316 */
v0 = com.wiyun.engine.sound.AudioManager.sPool;
v1 = (( java.lang.Integer ) v7 ).intValue ( ); // invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I
/* sget-boolean v2, Lcom/wiyun/engine/sound/AudioManager;->sMute:Z */
if ( v2 != null) { // if-eqz v2, :cond_2
/* move v2, v3 */
} // :goto_1
/* sget-boolean v4, Lcom/wiyun/engine/sound/AudioManager;->sMute:Z */
if ( v4 != null) { // if-eqz v4, :cond_3
} // :goto_2
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
/* const/high16 v6, 0x3f800000 # 1.0f */
v8 = /* invoke-virtual/range {v0 ..v6}, Landroid/media/SoundPool;->play(IFFIIF)I */
/* .line 317 */
/* .local v8, "streamId":I */
/* if-nez v8, :cond_4 */
/* .line 318 */
final String v0 = "libwiengine"; // const-string v0, "libwiengine"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Failed to play sound path: "; // const-string v2, "Failed to play sound path: "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v0,v1 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 310 */
} // .end local v7 # "soundId":Ljava/lang/Integer;
} // .end local v8 # "streamId":I
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v10 */
/* throw v0 */
/* .line 316 */
/* .restart local v7 # "soundId":Ljava/lang/Integer; */
} // :cond_2
try { // :try_start_2
} // :cond_3
/* .line 322 */
/* .restart local v8 # "streamId":I */
} // :cond_4
v0 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
/* check-cast v9, Ljava/util/List; */
/* .line 323 */
/* .local v9, "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;" */
/* if-nez v9, :cond_5 */
/* .line 324 */
/* new-instance v9, Ljava/util/ArrayList; */
} // .end local v9 # "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
/* invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V */
/* .line 325 */
/* .restart local v9 # "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;" */
v0 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
/* .line 327 */
} // :cond_5
java.lang.Integer .valueOf ( v8 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
} // .end method
static synchronized void mpPreloadBackgroundMusic ( Integer p0 ) {
/* .locals 10 */
/* .param p0, "resId" # I */
/* .prologue */
/* .line 106 */
/* const-class v9, Lcom/wiyun/engine/sound/AudioManager; */
/* monitor-enter v9 */
try { // :try_start_0
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* if-nez v0, :cond_1 */
/* .line 124 */
} // :cond_0
} // :goto_0
/* monitor-exit v9 */
return;
/* .line 109 */
} // :cond_1
try { // :try_start_1
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
/* .line 110 */
/* .local v7, "context":Landroid/content/Context; */
(( android.content.Context ) v7 ).getResources ( ); // invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).openRawResourceFd ( p0 ); // invoke-virtual {v0, p0}, Landroid/content/res/Resources;->openRawResourceFd(I)Landroid/content/res/AssetFileDescriptor;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
/* .line 112 */
/* .local v6, "afd":Landroid/content/res/AssetFileDescriptor; */
try { // :try_start_2
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
(( android.content.res.AssetFileDescriptor ) v6 ).getFileDescriptor ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;
(( android.content.res.AssetFileDescriptor ) v6 ).getStartOffset ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J
/* move-result-wide v2 */
(( android.content.res.AssetFileDescriptor ) v6 ).getLength ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getLength()J
/* move-result-wide v4 */
/* invoke-virtual/range {v0 ..v5}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V */
/* .line 113 */
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
(( android.media.MediaPlayer ) v0 ).prepareAsync ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepareAsync()V
/* .line 114 */
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 119 */
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 120 */
try { // :try_start_3
(( android.content.res.AssetFileDescriptor ) v6 ).close ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->close()V
/* :try_end_3 */
/* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_0 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
/* .line 121 */
/* :catch_0 */
/* move-exception v0 */
/* .line 115 */
/* :catch_1 */
/* move-exception v8 */
/* .line 116 */
/* .local v8, "e":Ljava/lang/Exception; */
try { // :try_start_4
final String v0 = "libwiengine"; // const-string v0, "libwiengine"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Failed to preload background music: "; // const-string v2, "Failed to preload background music: "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v0,v1 );
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* .line 119 */
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 120 */
try { // :try_start_5
(( android.content.res.AssetFileDescriptor ) v6 ).close ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->close()V
/* :try_end_5 */
/* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_2 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
/* .line 121 */
/* :catch_2 */
/* move-exception v0 */
/* .line 117 */
} // .end local v8 # "e":Ljava/lang/Exception;
/* :catchall_0 */
/* move-exception v0 */
/* .line 119 */
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 120 */
try { // :try_start_6
(( android.content.res.AssetFileDescriptor ) v6 ).close ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->close()V
/* :try_end_6 */
/* .catch Ljava/io/IOException; {:try_start_6 ..:try_end_6} :catch_3 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_1 */
/* .line 123 */
} // :cond_2
} // :goto_1
try { // :try_start_7
/* throw v0 */
/* :try_end_7 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_1 */
/* .line 106 */
} // .end local v6 # "afd":Landroid/content/res/AssetFileDescriptor;
} // .end local v7 # "context":Landroid/content/Context;
/* :catchall_1 */
/* move-exception v0 */
/* monitor-exit v9 */
/* throw v0 */
/* .line 121 */
/* .restart local v6 # "afd":Landroid/content/res/AssetFileDescriptor; */
/* .restart local v7 # "context":Landroid/content/Context; */
/* :catch_3 */
/* move-exception v1 */
} // .end method
static synchronized void mpPreloadBackgroundMusic ( java.lang.String p0, Boolean p1 ) {
/* .locals 11 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "isFile" # Z */
/* .prologue */
/* .line 127 */
/* const-class v10, Lcom/wiyun/engine/sound/AudioManager; */
/* monitor-enter v10 */
try { // :try_start_0
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* if-nez v0, :cond_1 */
/* .line 151 */
} // :cond_0
} // :goto_0
/* monitor-exit v10 */
return;
/* .line 130 */
} // :cond_1
int v6 = 0; // const/4 v6, 0x0
/* .line 132 */
/* .local v6, "afd":Landroid/content/res/AssetFileDescriptor; */
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 133 */
try { // :try_start_1
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
(( android.media.MediaPlayer ) v0 ).setDataSource ( p0 ); // invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V
/* .line 140 */
} // :goto_1
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
(( android.media.MediaPlayer ) v0 ).prepareAsync ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepareAsync()V
/* .line 141 */
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 146 */
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 147 */
try { // :try_start_2
(( android.content.res.AssetFileDescriptor ) v6 ).close ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->close()V
/* :try_end_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
/* .line 148 */
/* :catch_0 */
/* move-exception v0 */
/* .line 135 */
} // :cond_2
try { // :try_start_3
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
/* .line 136 */
/* .local v8, "context":Landroid/content/Context; */
(( android.content.Context ) v8 ).getAssets ( ); // invoke-virtual {v8}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
/* .line 137 */
/* .local v7, "am":Landroid/content/res/AssetManager; */
(( android.content.res.AssetManager ) v7 ).openFd ( p0 ); // invoke-virtual {v7, p0}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
/* .line 138 */
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
(( android.content.res.AssetFileDescriptor ) v6 ).getFileDescriptor ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;
(( android.content.res.AssetFileDescriptor ) v6 ).getStartOffset ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J
/* move-result-wide v2 */
(( android.content.res.AssetFileDescriptor ) v6 ).getLength ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getLength()J
/* move-result-wide v4 */
/* invoke-virtual/range {v0 ..v5}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V */
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_1 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* .line 142 */
} // .end local v7 # "am":Landroid/content/res/AssetManager;
} // .end local v8 # "context":Landroid/content/Context;
/* :catch_1 */
/* move-exception v9 */
/* .line 143 */
/* .local v9, "e":Ljava/lang/Exception; */
try { // :try_start_4
final String v0 = "libwiengine"; // const-string v0, "libwiengine"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Failed to preload background music: "; // const-string v2, "Failed to preload background music: "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v0,v1 );
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* .line 146 */
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 147 */
try { // :try_start_5
(( android.content.res.AssetFileDescriptor ) v6 ).close ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->close()V
/* :try_end_5 */
/* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_2 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
/* .line 148 */
/* :catch_2 */
/* move-exception v0 */
/* .line 144 */
} // .end local v9 # "e":Ljava/lang/Exception;
/* :catchall_0 */
/* move-exception v0 */
/* .line 146 */
if ( v6 != null) { // if-eqz v6, :cond_3
/* .line 147 */
try { // :try_start_6
(( android.content.res.AssetFileDescriptor ) v6 ).close ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->close()V
/* :try_end_6 */
/* .catch Ljava/io/IOException; {:try_start_6 ..:try_end_6} :catch_3 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_1 */
/* .line 150 */
} // :cond_3
} // :goto_2
try { // :try_start_7
/* throw v0 */
/* :try_end_7 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_1 */
/* .line 127 */
} // .end local v6 # "afd":Landroid/content/res/AssetFileDescriptor;
/* :catchall_1 */
/* move-exception v0 */
/* monitor-exit v10 */
/* throw v0 */
/* .line 148 */
/* .restart local v6 # "afd":Landroid/content/res/AssetFileDescriptor; */
/* :catch_3 */
/* move-exception v1 */
} // .end method
static synchronized void mpPreloadEffect ( Integer p0 ) {
/* .locals 5 */
/* .param p0, "resId" # I */
/* .prologue */
/* .line 248 */
/* const-class v2, Lcom/wiyun/engine/sound/AudioManager; */
/* monitor-enter v2 */
try { // :try_start_0
v1 = com.wiyun.engine.sound.AudioManager.sPool;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = com.wiyun.engine.sound.AudioManager.sResId2SoundIdMap;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v1, :cond_1 */
/* .line 255 */
} // :cond_0
} // :goto_0
/* monitor-exit v2 */
return;
/* .line 251 */
} // :cond_1
try { // :try_start_1
v1 = com.wiyun.engine.sound.AudioManager.sResId2SoundIdMap;
v1 = java.lang.Integer .valueOf ( p0 );
/* if-nez v1, :cond_0 */
/* .line 252 */
v1 = com.wiyun.engine.sound.AudioManager.sPool;
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v3 ).getContext ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
int v4 = 0; // const/4 v4, 0x0
v0 = (( android.media.SoundPool ) v1 ).load ( v3, p0, v4 ); // invoke-virtual {v1, v3, p0, v4}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I
/* .line 253 */
/* .local v0, "soundId":I */
v1 = com.wiyun.engine.sound.AudioManager.sResId2SoundIdMap;
java.lang.Integer .valueOf ( p0 );
java.lang.Integer .valueOf ( v0 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 248 */
} // .end local v0 # "soundId":I
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v2 */
/* throw v1 */
} // .end method
static synchronized void mpPreloadEffect ( java.lang.String p0, Boolean p1 ) {
/* .locals 7 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "isFile" # Z */
/* .prologue */
/* .line 258 */
/* const-class v5, Lcom/wiyun/engine/sound/AudioManager; */
/* monitor-enter v5 */
try { // :try_start_0
v4 = com.wiyun.engine.sound.AudioManager.sPool;
if ( v4 != null) { // if-eqz v4, :cond_0
v4 = com.wiyun.engine.sound.AudioManager.sPath2SoundIdMap;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* if-nez v4, :cond_1 */
/* .line 285 */
} // :cond_0
} // :goto_0
/* monitor-exit v5 */
return;
/* .line 261 */
} // :cond_1
try { // :try_start_1
v4 = com.wiyun.engine.sound.AudioManager.sPath2SoundIdMap;
/* :try_end_1 */
v4 = /* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
/* if-nez v4, :cond_0 */
/* .line 262 */
int v0 = 0; // const/4 v0, 0x0
/* .line 263 */
/* .local v0, "afd":Landroid/content/res/AssetFileDescriptor; */
int v3 = -1; // const/4 v3, -0x1
/* .line 265 */
/* .local v3, "soundId":I */
if ( p1 != null) { // if-eqz p1, :cond_3
/* .line 266 */
try { // :try_start_2
v4 = com.wiyun.engine.sound.AudioManager.sPool;
int v6 = 0; // const/4 v6, 0x0
v3 = (( android.media.SoundPool ) v4 ).load ( p0, v6 ); // invoke-virtual {v4, p0, v6}, Landroid/media/SoundPool;->load(Ljava/lang/String;I)I
/* .line 273 */
} // :goto_1
int v4 = -1; // const/4 v4, -0x1
/* if-eq v3, v4, :cond_2 */
/* .line 274 */
v4 = com.wiyun.engine.sound.AudioManager.sPath2SoundIdMap;
java.lang.Integer .valueOf ( v3 );
/* :try_end_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_1 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 279 */
} // :cond_2
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 280 */
try { // :try_start_3
(( android.content.res.AssetFileDescriptor ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->close()V
/* :try_end_3 */
/* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_0 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
/* .line 281 */
/* :catch_0 */
/* move-exception v4 */
/* .line 268 */
} // :cond_3
try { // :try_start_4
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v4 ).getContext ( ); // invoke-virtual {v4}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
/* .line 269 */
/* .local v2, "context":Landroid/content/Context; */
(( android.content.Context ) v2 ).getAssets ( ); // invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
/* .line 270 */
/* .local v1, "am":Landroid/content/res/AssetManager; */
(( android.content.res.AssetManager ) v1 ).openFd ( p0 ); // invoke-virtual {v1, p0}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
/* .line 271 */
v4 = com.wiyun.engine.sound.AudioManager.sPool;
int v6 = 0; // const/4 v6, 0x0
(( android.media.SoundPool ) v4 ).load ( v0, v6 ); // invoke-virtual {v4, v0, v6}, Landroid/media/SoundPool;->load(Landroid/content/res/AssetFileDescriptor;I)I
/* :try_end_4 */
/* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_1 */
v3 = /* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* .line 276 */
} // .end local v1 # "am":Landroid/content/res/AssetManager;
} // .end local v2 # "context":Landroid/content/Context;
/* :catch_1 */
/* move-exception v4 */
/* .line 279 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 280 */
try { // :try_start_5
(( android.content.res.AssetFileDescriptor ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->close()V
/* :try_end_5 */
/* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_2 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
/* .line 281 */
/* :catch_2 */
/* move-exception v4 */
/* .line 277 */
/* :catchall_0 */
/* move-exception v4 */
/* .line 279 */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 280 */
try { // :try_start_6
(( android.content.res.AssetFileDescriptor ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->close()V
/* :try_end_6 */
/* .catch Ljava/io/IOException; {:try_start_6 ..:try_end_6} :catch_3 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_1 */
/* .line 283 */
} // :cond_4
} // :goto_2
try { // :try_start_7
/* throw v4 */
/* :try_end_7 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_1 */
/* .line 258 */
} // .end local v0 # "afd":Landroid/content/res/AssetFileDescriptor;
} // .end local v3 # "soundId":I
/* :catchall_1 */
/* move-exception v4 */
/* monitor-exit v5 */
/* throw v4 */
/* .line 281 */
/* .restart local v0 # "afd":Landroid/content/res/AssetFileDescriptor; */
/* .restart local v3 # "soundId":I */
/* :catch_3 */
/* move-exception v6 */
} // .end method
static synchronized void mpRemoveAllEffects ( ) {
/* .locals 9 */
/* .prologue */
/* .line 366 */
/* const-class v6, Lcom/wiyun/engine/sound/AudioManager; */
/* monitor-enter v6 */
try { // :try_start_0
v5 = com.wiyun.engine.sound.AudioManager.sPool;
if ( v5 != null) { // if-eqz v5, :cond_0
v5 = com.wiyun.engine.sound.AudioManager.sResId2SoundIdMap;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v5, :cond_1 */
/* .line 390 */
/* .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/lang/Integer;>;" */
/* .local v2, "soundId":I */
/* .local v4, "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;" */
} // :cond_0
} // :goto_0
/* monitor-exit v6 */
return;
/* .line 369 */
} // .end local v0 # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/lang/Integer;>;"
} // .end local v2 # "soundId":I
} // .end local v4 # "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
} // :cond_1
try { // :try_start_1
v5 = com.wiyun.engine.sound.AudioManager.sResId2SoundIdMap;
/* .restart local v0 # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/lang/Integer;>;" */
/* .restart local v2 # "soundId":I */
/* .restart local v4 # "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;" */
v5 = } // :goto_1
/* if-nez v5, :cond_2 */
/* .line 378 */
v5 = com.wiyun.engine.sound.AudioManager.sPath2SoundIdMap;
v5 = } // :goto_2
/* if-nez v5, :cond_5 */
/* .line 387 */
v5 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
/* .line 388 */
v5 = com.wiyun.engine.sound.AudioManager.sResId2SoundIdMap;
/* .line 389 */
v5 = com.wiyun.engine.sound.AudioManager.sPath2SoundIdMap;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 366 */
} // .end local v4 # "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
/* :catchall_0 */
/* move-exception v5 */
/* monitor-exit v6 */
/* throw v5 */
/* .line 369 */
/* .restart local v4 # "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;" */
} // :cond_2
try { // :try_start_2
} // .end local v0 # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/lang/Integer;>;"
/* check-cast v0, Ljava/util/Map$Entry; */
/* .line 370 */
/* .restart local v0 # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/lang/Integer;>;" */
} // .end local v2 # "soundId":I
} // .end local v4 # "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
/* check-cast v5, Ljava/lang/Integer; */
v2 = (( java.lang.Integer ) v5 ).intValue ( ); // invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I
/* .line 371 */
/* .restart local v2 # "soundId":I */
v5 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
java.lang.Integer .valueOf ( v2 );
/* check-cast v4, Ljava/util/List; */
/* .line 372 */
/* .restart local v4 # "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;" */
if ( v4 != null) { // if-eqz v4, :cond_3
/* .line 373 */
v5 = } // :goto_3
/* if-nez v5, :cond_4 */
/* .line 376 */
} // :cond_3
v5 = com.wiyun.engine.sound.AudioManager.sPool;
(( android.media.SoundPool ) v5 ).unload ( v2 ); // invoke-virtual {v5, v2}, Landroid/media/SoundPool;->unload(I)Z
/* .line 373 */
} // :cond_4
/* check-cast v5, Ljava/lang/Integer; */
v3 = (( java.lang.Integer ) v5 ).intValue ( ); // invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I
/* .line 374 */
/* .local v3, "streamId":I */
v5 = com.wiyun.engine.sound.AudioManager.sPool;
(( android.media.SoundPool ) v5 ).stop ( v3 ); // invoke-virtual {v5, v3}, Landroid/media/SoundPool;->stop(I)V
/* .line 378 */
} // .end local v3 # "streamId":I
} // :cond_5
/* check-cast v1, Ljava/util/Map$Entry; */
/* .line 379 */
/* .local v1, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Integer;>;" */
/* check-cast v5, Ljava/lang/Integer; */
v2 = (( java.lang.Integer ) v5 ).intValue ( ); // invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I
/* .line 380 */
v5 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
java.lang.Integer .valueOf ( v2 );
} // .end local v4 # "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
/* check-cast v4, Ljava/util/List; */
/* .line 381 */
/* .restart local v4 # "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;" */
if ( v4 != null) { // if-eqz v4, :cond_6
/* .line 382 */
v5 = } // :goto_4
/* if-nez v5, :cond_7 */
/* .line 385 */
} // :cond_6
v5 = com.wiyun.engine.sound.AudioManager.sPool;
(( android.media.SoundPool ) v5 ).unload ( v2 ); // invoke-virtual {v5, v2}, Landroid/media/SoundPool;->unload(I)Z
/* goto/16 :goto_2 */
/* .line 382 */
} // :cond_7
/* check-cast v5, Ljava/lang/Integer; */
v3 = (( java.lang.Integer ) v5 ).intValue ( ); // invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I
/* .line 383 */
/* .restart local v3 # "streamId":I */
v5 = com.wiyun.engine.sound.AudioManager.sPool;
(( android.media.SoundPool ) v5 ).stop ( v3 ); // invoke-virtual {v5, v3}, Landroid/media/SoundPool;->stop(I)V
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
} // .end method
static synchronized void mpRemoveEffect ( Integer p0 ) {
/* .locals 6 */
/* .param p0, "resId" # I */
/* .prologue */
/* .line 393 */
/* const-class v4, Lcom/wiyun/engine/sound/AudioManager; */
/* monitor-enter v4 */
try { // :try_start_0
v3 = com.wiyun.engine.sound.AudioManager.sPool;
if ( v3 != null) { // if-eqz v3, :cond_0
v3 = com.wiyun.engine.sound.AudioManager.sResId2SoundIdMap;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v3, :cond_1 */
/* .line 405 */
} // :cond_0
} // :goto_0
/* monitor-exit v4 */
return;
/* .line 396 */
} // :cond_1
try { // :try_start_1
v3 = com.wiyun.engine.sound.AudioManager.sResId2SoundIdMap;
java.lang.Integer .valueOf ( p0 );
/* check-cast v0, Ljava/lang/Integer; */
/* .line 397 */
/* .local v0, "soundId":Ljava/lang/Integer; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 398 */
v3 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
/* check-cast v2, Ljava/util/List; */
/* .line 399 */
/* .local v2, "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;" */
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 400 */
v3 = } // :goto_1
/* if-nez v3, :cond_3 */
/* .line 403 */
} // :cond_2
v3 = com.wiyun.engine.sound.AudioManager.sPool;
v5 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
(( android.media.SoundPool ) v3 ).unload ( v5 ); // invoke-virtual {v3, v5}, Landroid/media/SoundPool;->unload(I)Z
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 393 */
} // .end local v0 # "soundId":Ljava/lang/Integer;
} // .end local v2 # "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
/* :catchall_0 */
/* move-exception v3 */
/* monitor-exit v4 */
/* throw v3 */
/* .line 400 */
/* .restart local v0 # "soundId":Ljava/lang/Integer; */
/* .restart local v2 # "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;" */
} // :cond_3
try { // :try_start_2
/* check-cast v3, Ljava/lang/Integer; */
v1 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
/* .line 401 */
/* .local v1, "streamId":I */
v3 = com.wiyun.engine.sound.AudioManager.sPool;
(( android.media.SoundPool ) v3 ).stop ( v1 ); // invoke-virtual {v3, v1}, Landroid/media/SoundPool;->stop(I)V
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
} // .end method
static synchronized void mpRemoveEffect ( java.lang.String p0 ) {
/* .locals 6 */
/* .param p0, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 408 */
/* const-class v4, Lcom/wiyun/engine/sound/AudioManager; */
/* monitor-enter v4 */
try { // :try_start_0
v3 = com.wiyun.engine.sound.AudioManager.sPool;
if ( v3 != null) { // if-eqz v3, :cond_0
v3 = com.wiyun.engine.sound.AudioManager.sPath2SoundIdMap;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v3, :cond_1 */
/* .line 420 */
} // :cond_0
} // :goto_0
/* monitor-exit v4 */
return;
/* .line 411 */
} // :cond_1
try { // :try_start_1
v3 = com.wiyun.engine.sound.AudioManager.sPath2SoundIdMap;
/* check-cast v0, Ljava/lang/Integer; */
/* .line 412 */
/* .local v0, "soundId":Ljava/lang/Integer; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 413 */
v3 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
/* check-cast v2, Ljava/util/List; */
/* .line 414 */
/* .local v2, "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;" */
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 415 */
v3 = } // :goto_1
/* if-nez v3, :cond_3 */
/* .line 418 */
} // :cond_2
v3 = com.wiyun.engine.sound.AudioManager.sPool;
v5 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
(( android.media.SoundPool ) v3 ).unload ( v5 ); // invoke-virtual {v3, v5}, Landroid/media/SoundPool;->unload(I)Z
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 408 */
} // .end local v0 # "soundId":Ljava/lang/Integer;
} // .end local v2 # "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
/* :catchall_0 */
/* move-exception v3 */
/* monitor-exit v4 */
/* throw v3 */
/* .line 415 */
/* .restart local v0 # "soundId":Ljava/lang/Integer; */
/* .restart local v2 # "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;" */
} // :cond_3
try { // :try_start_2
/* check-cast v3, Ljava/lang/Integer; */
v1 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
/* .line 416 */
/* .local v1, "streamId":I */
v3 = com.wiyun.engine.sound.AudioManager.sPool;
(( android.media.SoundPool ) v3 ).stop ( v1 ); // invoke-virtual {v3, v1}, Landroid/media/SoundPool;->stop(I)V
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
} // .end method
static synchronized void mpResumeBackgroundMusic ( ) {
/* .locals 2 */
/* .prologue */
/* .line 212 */
/* const-class v1, Lcom/wiyun/engine/sound/AudioManager; */
/* monitor-enter v1 */
try { // :try_start_0
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v0, :cond_1 */
/* .line 218 */
} // :cond_0
} // :goto_0
/* monitor-exit v1 */
return;
/* .line 215 */
} // :cond_1
try { // :try_start_1
/* sget-boolean v0, Lcom/wiyun/engine/sound/AudioManager;->sPlaying:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 216 */
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
(( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 212 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* throw v0 */
} // .end method
static synchronized void mpSetBackgroundVolume ( Float p0 ) {
/* .locals 2 */
/* .param p0, "volume" # F */
/* .prologue */
/* .line 228 */
/* const-class v1, Lcom/wiyun/engine/sound/AudioManager; */
/* monitor-enter v1 */
try { // :try_start_0
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v0, :cond_1 */
/* .line 234 */
} // :cond_0
} // :goto_0
/* monitor-exit v1 */
return;
/* .line 231 */
} // :cond_1
try { // :try_start_1
/* .line 232 */
/* sget-boolean v0, Lcom/wiyun/engine/sound/AudioManager;->sMute:Z */
/* if-nez v0, :cond_0 */
/* .line 233 */
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
(( android.media.MediaPlayer ) v0 ).setVolume ( p0, p0 ); // invoke-virtual {v0, p0, p0}, Landroid/media/MediaPlayer;->setVolume(FF)V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 228 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* throw v0 */
} // .end method
static synchronized void mpSetEffectVolume ( Float p0 ) {
/* .locals 9 */
/* .param p0, "volume" # F */
/* .prologue */
/* .line 237 */
/* const-class v3, Lcom/wiyun/engine/sound/AudioManager; */
/* monitor-enter v3 */
try { // :try_start_0
/* .line 240 */
v2 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
} // :cond_0
/* :try_end_0 */
v2 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v2, :cond_1 */
/* .line 245 */
/* monitor-exit v3 */
return;
/* .line 240 */
} // :cond_1
try { // :try_start_1
/* check-cast v0, Ljava/util/Map$Entry; */
/* .line 241 */
/* .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/Integer;>;>;" */
/* check-cast v2, Ljava/util/List; */
v5 = } // :goto_0
if ( v5 != null) { // if-eqz v5, :cond_0
/* check-cast v1, Ljava/lang/Integer; */
/* .line 242 */
/* .local v1, "streamId":Ljava/lang/Integer; */
v5 = com.wiyun.engine.sound.AudioManager.sPool;
v6 = (( java.lang.Integer ) v1 ).intValue ( ); // invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
(( android.media.SoundPool ) v5 ).setVolume ( v6, v7, v8 ); // invoke-virtual {v5, v6, v7, v8}, Landroid/media/SoundPool;->setVolume(IFF)V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 237 */
} // .end local v0 # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/Integer;>;>;"
} // .end local v1 # "streamId":Ljava/lang/Integer;
/* :catchall_0 */
/* move-exception v2 */
/* monitor-exit v3 */
/* throw v2 */
} // .end method
static synchronized void mpSetMute ( Boolean p0 ) {
/* .locals 9 */
/* .param p0, "mute" # Z */
/* .prologue */
/* .line 423 */
/* const-class v4, Lcom/wiyun/engine/sound/AudioManager; */
/* monitor-enter v4 */
try { // :try_start_0
v3 = com.wiyun.engine.sound.AudioManager.sPool;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v3, :cond_1 */
/* .line 448 */
} // :cond_0
/* monitor-exit v4 */
return;
/* .line 425 */
} // :cond_1
try { // :try_start_1
v3 = com.wiyun.engine.sound.AudioManager.sPlayer;
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 428 */
/* sget-boolean v3, Lcom/wiyun/engine/sound/AudioManager;->sMute:Z */
/* if-eq v3, p0, :cond_0 */
/* .line 429 */
com.wiyun.engine.sound.AudioManager.sMute = (p0!= 0);
/* .line 430 */
if ( p0 != null) { // if-eqz p0, :cond_3
/* .line 431 */
v3 = com.wiyun.engine.sound.AudioManager.sPlayer;
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
(( android.media.MediaPlayer ) v3 ).setVolume ( v5, v6 ); // invoke-virtual {v3, v5, v6}, Landroid/media/MediaPlayer;->setVolume(FF)V
/* .line 432 */
v3 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
v3 = } // :cond_2
if ( v3 != null) { // if-eqz v3, :cond_0
/* check-cast v0, Ljava/util/Map$Entry; */
/* .line 433 */
/* .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/Integer;>;>;" */
/* check-cast v2, Ljava/util/List; */
/* .line 434 */
/* .local v2, "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;" */
v3 = } // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_2
/* check-cast v3, Ljava/lang/Integer; */
v1 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
/* .line 435 */
/* .local v1, "streamId":I */
v3 = com.wiyun.engine.sound.AudioManager.sPool;
int v7 = 0; // const/4 v7, 0x0
int v8 = 0; // const/4 v8, 0x0
(( android.media.SoundPool ) v3 ).setVolume ( v1, v7, v8 ); // invoke-virtual {v3, v1, v7, v8}, Landroid/media/SoundPool;->setVolume(IFF)V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 423 */
} // .end local v0 # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/Integer;>;>;"
} // .end local v1 # "streamId":I
} // .end local v2 # "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
/* :catchall_0 */
/* move-exception v3 */
/* monitor-exit v4 */
/* throw v3 */
/* .line 439 */
} // :cond_3
try { // :try_start_2
v3 = com.wiyun.engine.sound.AudioManager.sPlayer;
(( android.media.MediaPlayer ) v3 ).setVolume ( v5, v6 ); // invoke-virtual {v3, v5, v6}, Landroid/media/MediaPlayer;->setVolume(FF)V
/* .line 440 */
v3 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
v3 = } // :cond_4
if ( v3 != null) { // if-eqz v3, :cond_0
/* check-cast v0, Ljava/util/Map$Entry; */
/* .line 441 */
/* .restart local v0 # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/Integer;Ljava/util/List<Ljava/lang/Integer;>;>;" */
/* check-cast v2, Ljava/util/List; */
/* .line 442 */
/* .restart local v2 # "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;" */
v3 = } // :goto_1
if ( v3 != null) { // if-eqz v3, :cond_4
/* check-cast v3, Ljava/lang/Integer; */
v1 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
/* .line 443 */
/* .restart local v1 # "streamId":I */
v3 = com.wiyun.engine.sound.AudioManager.sPool;
(( android.media.SoundPool ) v3 ).setVolume ( v1, v7, v8 ); // invoke-virtual {v3, v1, v7, v8}, Landroid/media/SoundPool;->setVolume(IFF)V
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
} // .end method
static synchronized void mpStopBackgroundMusic ( ) {
/* .locals 2 */
/* .prologue */
/* .line 186 */
/* const-class v1, Lcom/wiyun/engine/sound/AudioManager; */
/* monitor-enter v1 */
try { // :try_start_0
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v0, :cond_1 */
/* .line 200 */
} // :cond_0
} // :goto_0
/* monitor-exit v1 */
return;
/* .line 189 */
} // :cond_1
try { // :try_start_1
/* sget-boolean v0, Lcom/wiyun/engine/sound/AudioManager;->sPlaying:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 194 */
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
(( android.media.MediaPlayer ) v0 ).stop ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V
/* .line 195 */
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
(( android.media.MediaPlayer ) v0 ).reset ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V
/* .line 196 */
int v0 = 0; // const/4 v0, 0x0
/* .line 197 */
int v0 = 0; // const/4 v0, 0x0
/* .line 198 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.sound.AudioManager.sPlaying = (v0!= 0);
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 186 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* throw v0 */
} // .end method
static synchronized void mpStopEffect ( Integer p0 ) {
/* .locals 6 */
/* .param p0, "resId" # I */
/* .prologue */
/* .line 332 */
/* const-class v4, Lcom/wiyun/engine/sound/AudioManager; */
/* monitor-enter v4 */
try { // :try_start_0
v3 = com.wiyun.engine.sound.AudioManager.sPool;
if ( v3 != null) { // if-eqz v3, :cond_0
v3 = com.wiyun.engine.sound.AudioManager.sResId2SoundIdMap;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v3, :cond_1 */
/* .line 346 */
} // :cond_0
} // :goto_0
/* monitor-exit v4 */
return;
/* .line 335 */
} // :cond_1
try { // :try_start_1
v3 = com.wiyun.engine.sound.AudioManager.sResId2SoundIdMap;
v3 = java.lang.Integer .valueOf ( p0 );
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 336 */
v3 = com.wiyun.engine.sound.AudioManager.sResId2SoundIdMap;
java.lang.Integer .valueOf ( p0 );
/* check-cast v0, Ljava/lang/Integer; */
/* .line 337 */
/* .local v0, "soundId":Ljava/lang/Integer; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 338 */
v3 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
/* check-cast v2, Ljava/util/List; */
/* .line 339 */
/* .local v2, "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;" */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 340 */
v3 = } // :goto_1
/* if-nez v3, :cond_2 */
/* .line 342 */
v3 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 332 */
} // .end local v0 # "soundId":Ljava/lang/Integer;
} // .end local v2 # "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
/* :catchall_0 */
/* move-exception v3 */
/* monitor-exit v4 */
/* throw v3 */
/* .line 340 */
/* .restart local v0 # "soundId":Ljava/lang/Integer; */
/* .restart local v2 # "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;" */
} // :cond_2
try { // :try_start_2
/* check-cast v3, Ljava/lang/Integer; */
v1 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
/* .line 341 */
/* .local v1, "streamId":I */
v3 = com.wiyun.engine.sound.AudioManager.sPool;
(( android.media.SoundPool ) v3 ).stop ( v1 ); // invoke-virtual {v3, v1}, Landroid/media/SoundPool;->stop(I)V
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
} // .end method
static synchronized void mpStopEffect ( java.lang.String p0 ) {
/* .locals 6 */
/* .param p0, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 349 */
/* const-class v4, Lcom/wiyun/engine/sound/AudioManager; */
/* monitor-enter v4 */
try { // :try_start_0
v3 = com.wiyun.engine.sound.AudioManager.sPool;
if ( v3 != null) { // if-eqz v3, :cond_0
v3 = com.wiyun.engine.sound.AudioManager.sPath2SoundIdMap;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v3, :cond_1 */
/* .line 363 */
} // :cond_0
} // :goto_0
/* monitor-exit v4 */
return;
/* .line 352 */
} // :cond_1
try { // :try_start_1
v3 = v3 = com.wiyun.engine.sound.AudioManager.sPath2SoundIdMap;
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 353 */
v3 = com.wiyun.engine.sound.AudioManager.sPath2SoundIdMap;
/* check-cast v0, Ljava/lang/Integer; */
/* .line 354 */
/* .local v0, "soundId":Ljava/lang/Integer; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 355 */
v3 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
/* check-cast v2, Ljava/util/List; */
/* .line 356 */
/* .local v2, "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;" */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 357 */
v3 = } // :goto_1
/* if-nez v3, :cond_2 */
/* .line 359 */
v3 = com.wiyun.engine.sound.AudioManager.sSoundId2StreamIdMap;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 349 */
} // .end local v0 # "soundId":Ljava/lang/Integer;
} // .end local v2 # "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;"
/* :catchall_0 */
/* move-exception v3 */
/* monitor-exit v4 */
/* throw v3 */
/* .line 357 */
/* .restart local v0 # "soundId":Ljava/lang/Integer; */
/* .restart local v2 # "streamIds":Ljava/util/List;, "Ljava/util/List<Ljava/lang/Integer;>;" */
} // :cond_2
try { // :try_start_2
/* check-cast v3, Ljava/lang/Integer; */
v1 = (( java.lang.Integer ) v3 ).intValue ( ); // invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I
/* .line 358 */
/* .local v1, "streamId":I */
v3 = com.wiyun.engine.sound.AudioManager.sPool;
(( android.media.SoundPool ) v3 ).stop ( v1 ); // invoke-virtual {v3, v1}, Landroid/media/SoundPool;->stop(I)V
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
} // .end method
private static native void onPeriodicNotification ( ) {
} // .end method
public static native void pauseBackgroundMusic ( ) {
} // .end method
public static native void playBackgroundMusic ( Integer p0 ) {
} // .end method
public static native void playBackgroundMusic ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
public static native void playBackgroundMusic ( java.lang.String p0, Boolean p1, Integer p2 ) {
} // .end method
public static native void playEffect ( Integer p0 ) {
} // .end method
public static native void playEffect ( Integer p0, Integer p1 ) {
} // .end method
public static void playEffect ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 579 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.sound.AudioManager .playEffect ( p0,v0 );
/* .line 580 */
return;
} // .end method
public static native void playEffect ( java.lang.String p0, Boolean p1 ) {
} // .end method
public static native void preloadBackgroundMusic ( Integer p0 ) {
} // .end method
public static native void preloadBackgroundMusic ( Integer p0, Integer p1 ) {
} // .end method
public static native void preloadBackgroundMusic ( java.lang.String p0, Boolean p1 ) {
} // .end method
public static native void preloadEffect ( Integer p0 ) {
} // .end method
public static native void preloadEffect ( Integer p0, Integer p1 ) {
} // .end method
public static void preloadEffect ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 635 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.sound.AudioManager .preloadEffect ( p0,v0 );
/* .line 636 */
return;
} // .end method
public static native void preloadEffect ( java.lang.String p0, Boolean p1 ) {
} // .end method
public static native void removeAllEffects ( ) {
} // .end method
public static native void removeEffect ( Integer p0 ) {
} // .end method
public static native void removeEffect ( java.lang.String p0 ) {
} // .end method
public static native void resumeBackgroundMusic ( ) {
} // .end method
public static native void setBackgroundVolume ( Float p0 ) {
} // .end method
public static native void setEffectVolume ( Float p0 ) {
} // .end method
public static native void setMute ( Boolean p0 ) {
} // .end method
static synchronized void setupMediaPlayerBackend ( ) {
/* .locals 5 */
/* .prologue */
/* .line 50 */
/* const-class v1, Lcom/wiyun/engine/sound/AudioManager; */
/* monitor-enter v1 */
try { // :try_start_0
/* new-instance v0, Landroid/media/SoundPool; */
/* const/16 v2, 0xa */
int v3 = 3; // const/4 v3, 0x3
int v4 = 0; // const/4 v4, 0x0
/* invoke-direct {v0, v2, v3, v4}, Landroid/media/SoundPool;-><init>(III)V */
/* .line 51 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 52 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 53 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 54 */
int v0 = -1; // const/4 v0, -0x1
/* .line 55 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.sound.AudioManager.sPlaying = (v0!= 0);
/* .line 56 */
/* const/high16 v0, 0x3f800000 # 1.0f */
/* .line 57 */
/* const/high16 v0, 0x3f800000 # 1.0f */
/* .line 58 */
int v0 = 0; // const/4 v0, 0x0
/* .line 59 */
int v0 = 0; // const/4 v0, 0x0
/* .line 60 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.sound.AudioManager.sMute = (v0!= 0);
/* .line 61 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.sound.AudioManager.sCanPlay = (v0!= 0);
/* .line 63 */
/* new-instance v0, Landroid/media/MediaPlayer; */
/* invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V */
/* .line 64 */
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
int v2 = 0; // const/4 v2, 0x0
(( android.media.MediaPlayer ) v0 ).setLooping ( v2 ); // invoke-virtual {v0, v2}, Landroid/media/MediaPlayer;->setLooping(Z)V
/* .line 65 */
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
int v2 = 3; // const/4 v2, 0x3
(( android.media.MediaPlayer ) v0 ).setAudioStreamType ( v2 ); // invoke-virtual {v0, v2}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V
/* .line 66 */
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
/* new-instance v2, Lcom/wiyun/engine/sound/AudioManager$1; */
/* invoke-direct {v2}, Lcom/wiyun/engine/sound/AudioManager$1;-><init>()V */
(( android.media.MediaPlayer ) v0 ).setOnCompletionListener ( v2 ); // invoke-virtual {v0, v2}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V
/* .line 77 */
v0 = com.wiyun.engine.sound.AudioManager.sPlayer;
/* new-instance v2, Lcom/wiyun/engine/sound/AudioManager$2; */
/* invoke-direct {v2}, Lcom/wiyun/engine/sound/AudioManager$2;-><init>()V */
(( android.media.MediaPlayer ) v0 ).setOnPreparedListener ( v2 ); // invoke-virtual {v0, v2}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 85 */
/* monitor-exit v1 */
return;
/* .line 50 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* throw v0 */
} // .end method
public static native void stopBackgroundMusic ( ) {
} // .end method
public static native void stopEffect ( Integer p0 ) {
} // .end method
public static void stopEffect ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 603 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.sound.AudioManager .stopEffect ( p0,v0 );
/* .line 604 */
return;
} // .end method
public static native void stopEffect ( java.lang.String p0, Boolean p1 ) {
} // .end method
/* # virtual methods */
public void onMarkerReached ( android.media.AudioTrack p0 ) {
/* .locals 0 */
/* .param p1, "track" # Landroid/media/AudioTrack; */
/* .prologue */
/* .line 682 */
return;
} // .end method
public void onPeriodicNotification ( android.media.AudioTrack p0 ) {
/* .locals 0 */
/* .param p1, "track" # Landroid/media/AudioTrack; */
/* .prologue */
/* .line 686 */
com.wiyun.engine.sound.AudioManager .onPeriodicNotification ( );
/* .line 687 */
return;
} // .end method

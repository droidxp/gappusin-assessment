public class org.cocos2dx.lib.Cocos2dxMusic {
	 /* .source "Cocos2dxMusic.java" */
	 /* # static fields */
	 private static final java.lang.String TAG;
	 /* # instance fields */
	 private android.media.MediaPlayer mBackgroundMediaPlayer;
	 private android.content.Context mContext;
	 private java.lang.String mCurrentPath;
	 private Boolean mIsPaused;
	 private Float mLeftVolume;
	 private Float mRightVolume;
	 /* # direct methods */
	 public org.cocos2dx.lib.Cocos2dxMusic ( ) {
		 /* .locals 0 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 46 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 47 */
		 this.mContext = p1;
		 /* .line 48 */
		 /* invoke-direct {p0}, Lorg/cocos2dx/lib/Cocos2dxMusic;->initData()V */
		 /* .line 49 */
		 return;
	 } // .end method
	 private android.media.MediaPlayer createMediaplayerFromAssets ( java.lang.String p0 ) {
		 /* .locals 9 */
		 /* .param p1, "path" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 206 */
		 int v8 = 0; // const/4 v8, 0x0
		 /* .line 209 */
		 /* .local v8, "mediaPlayer":Landroid/media/MediaPlayer; */
		 try { // :try_start_0
			 v1 = this.mContext;
			 (( android.content.Context ) v1 ).getAssets ( ); // invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
			 (( android.content.res.AssetManager ) v1 ).openFd ( p1 ); // invoke-virtual {v1, p1}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
			 /* .line 211 */
			 /* .local v6, "assetFileDescritor":Landroid/content/res/AssetFileDescriptor; */
			 /* new-instance v0, Landroid/media/MediaPlayer; */
			 /* invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 212 */
		 } // .end local v8 # "mediaPlayer":Landroid/media/MediaPlayer;
		 /* .local v0, "mediaPlayer":Landroid/media/MediaPlayer; */
		 try { // :try_start_1
			 (( android.content.res.AssetFileDescriptor ) v6 ).getFileDescriptor ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;
			 /* .line 213 */
			 (( android.content.res.AssetFileDescriptor ) v6 ).getStartOffset ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J
			 /* move-result-wide v2 */
			 (( android.content.res.AssetFileDescriptor ) v6 ).getLength ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getLength()J
			 /* move-result-wide v4 */
			 /* .line 212 */
			 /* invoke-virtual/range {v0 ..v5}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V */
			 /* .line 214 */
			 (( android.media.MediaPlayer ) v0 ).prepare ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V
			 /* .line 216 */
			 /* iget v1, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mLeftVolume:F */
			 /* iget v2, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mRightVolume:F */
			 (( android.media.MediaPlayer ) v0 ).setVolume ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/media/MediaPlayer;->setVolume(FF)V
			 /* :try_end_1 */
			 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
			 /* .line 222 */
		 } // .end local v6 # "assetFileDescritor":Landroid/content/res/AssetFileDescriptor;
	 } // :goto_0
	 /* .line 217 */
} // .end local v0 # "mediaPlayer":Landroid/media/MediaPlayer;
/* .restart local v8 # "mediaPlayer":Landroid/media/MediaPlayer; */
/* :catch_0 */
/* move-exception v7 */
/* move-object v0, v8 */
/* .line 218 */
} // .end local v8 # "mediaPlayer":Landroid/media/MediaPlayer;
/* .restart local v0 # "mediaPlayer":Landroid/media/MediaPlayer; */
/* .local v7, "e":Ljava/lang/Exception; */
} // :goto_1
int v0 = 0; // const/4 v0, 0x0
/* .line 219 */
final String v1 = "Cocos2dxMusic"; // const-string v1, "Cocos2dxMusic"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "error: "; // const-string v3, "error: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.Exception ) v7 ).getMessage ( ); // invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v1,v2,v7 );
/* .line 217 */
} // .end local v7 # "e":Ljava/lang/Exception;
/* .restart local v6 # "assetFileDescritor":Landroid/content/res/AssetFileDescriptor; */
/* :catch_1 */
/* move-exception v7 */
} // .end method
private void initData ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* const/high16 v0, 0x3f000000 # 0.5f */
/* .line 193 */
/* iput v0, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mLeftVolume:F */
/* .line 194 */
/* iput v0, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mRightVolume:F */
/* .line 195 */
this.mBackgroundMediaPlayer = v1;
/* .line 196 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mIsPaused:Z */
/* .line 197 */
this.mCurrentPath = v1;
/* .line 198 */
return;
} // .end method
/* # virtual methods */
public void end ( ) {
/* .locals 1 */
/* .prologue */
/* .line 162 */
v0 = this.mBackgroundMediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 163 */
v0 = this.mBackgroundMediaPlayer;
(( android.media.MediaPlayer ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
/* .line 166 */
} // :cond_0
/* invoke-direct {p0}, Lorg/cocos2dx/lib/Cocos2dxMusic;->initData()V */
/* .line 167 */
return;
} // .end method
public Float getBackgroundVolume ( ) {
/* .locals 2 */
/* .prologue */
/* .line 170 */
v0 = this.mBackgroundMediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 171 */
/* iget v0, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mLeftVolume:F */
/* iget v1, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mRightVolume:F */
/* add-float/2addr v0, v1 */
/* const/high16 v1, 0x40000000 # 2.0f */
/* div-float/2addr v0, v1 */
/* .line 173 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isBackgroundMusicPlaying ( ) {
/* .locals 2 */
/* .prologue */
/* .line 150 */
int v0 = 0; // const/4 v0, 0x0
/* .line 152 */
/* .local v0, "ret":Z */
v1 = this.mBackgroundMediaPlayer;
/* if-nez v1, :cond_0 */
/* .line 153 */
int v0 = 0; // const/4 v0, 0x0
/* .line 158 */
} // :goto_0
/* .line 155 */
} // :cond_0
v1 = this.mBackgroundMediaPlayer;
v0 = (( android.media.MediaPlayer ) v1 ).isPlaying ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->isPlaying()Z
} // .end method
public void pauseBackgroundMusic ( ) {
/* .locals 1 */
/* .prologue */
/* .line 120 */
v0 = this.mBackgroundMediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mBackgroundMediaPlayer;
v0 = (( android.media.MediaPlayer ) v0 ).isPlaying ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 121 */
v0 = this.mBackgroundMediaPlayer;
(( android.media.MediaPlayer ) v0 ).pause ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
/* .line 122 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mIsPaused:Z */
/* .line 124 */
} // :cond_0
return;
} // .end method
public void playBackgroundMusic ( java.lang.String p0, Boolean p1 ) {
/* .locals 3 */
/* .param p1, "path" # Ljava/lang/String; */
/* .param p2, "isLoop" # Z */
/* .prologue */
/* .line 68 */
v1 = this.mCurrentPath;
/* if-nez v1, :cond_1 */
/* .line 71 */
/* invoke-direct {p0, p1}, Lorg/cocos2dx/lib/Cocos2dxMusic;->createMediaplayerFromAssets(Ljava/lang/String;)Landroid/media/MediaPlayer; */
this.mBackgroundMediaPlayer = v1;
/* .line 72 */
this.mCurrentPath = p1;
/* .line 89 */
} // :cond_0
} // :goto_0
v1 = this.mBackgroundMediaPlayer;
/* if-nez v1, :cond_3 */
/* .line 90 */
final String v1 = "Cocos2dxMusic"; // const-string v1, "Cocos2dxMusic"
final String v2 = "playBackgroundMusic: background media player is null"; // const-string v2, "playBackgroundMusic: background media player is null"
android.util.Log .e ( v1,v2 );
/* .line 107 */
} // :goto_1
return;
/* .line 75 */
} // :cond_1
v1 = this.mCurrentPath;
v1 = (( java.lang.String ) v1 ).equals ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_0 */
/* .line 79 */
v1 = this.mBackgroundMediaPlayer;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 80 */
v1 = this.mBackgroundMediaPlayer;
(( android.media.MediaPlayer ) v1 ).release ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->release()V
/* .line 82 */
} // :cond_2
/* invoke-direct {p0, p1}, Lorg/cocos2dx/lib/Cocos2dxMusic;->createMediaplayerFromAssets(Ljava/lang/String;)Landroid/media/MediaPlayer; */
this.mBackgroundMediaPlayer = v1;
/* .line 85 */
this.mCurrentPath = p1;
/* .line 93 */
} // :cond_3
v1 = this.mBackgroundMediaPlayer;
(( android.media.MediaPlayer ) v1 ).stop ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->stop()V
/* .line 95 */
v1 = this.mBackgroundMediaPlayer;
(( android.media.MediaPlayer ) v1 ).setLooping ( p2 ); // invoke-virtual {v1, p2}, Landroid/media/MediaPlayer;->setLooping(Z)V
/* .line 98 */
try { // :try_start_0
v1 = this.mBackgroundMediaPlayer;
(( android.media.MediaPlayer ) v1 ).prepare ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->prepare()V
/* .line 99 */
v1 = this.mBackgroundMediaPlayer;
int v2 = 0; // const/4 v2, 0x0
(( android.media.MediaPlayer ) v1 ).seekTo ( v2 ); // invoke-virtual {v1, v2}, Landroid/media/MediaPlayer;->seekTo(I)V
/* .line 100 */
v1 = this.mBackgroundMediaPlayer;
(( android.media.MediaPlayer ) v1 ).start ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->start()V
/* .line 102 */
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mIsPaused:Z */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 103 */
/* :catch_0 */
/* move-exception v0 */
/* .line 104 */
/* .local v0, "e":Ljava/lang/Exception; */
final String v1 = "Cocos2dxMusic"; // const-string v1, "Cocos2dxMusic"
final String v2 = "playBackgroundMusic: error state"; // const-string v2, "playBackgroundMusic: error state"
android.util.Log .e ( v1,v2 );
} // .end method
public void preloadBackgroundMusic ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 52 */
v0 = this.mCurrentPath;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mCurrentPath;
v0 = (( java.lang.String ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_2 */
/* .line 56 */
} // :cond_0
v0 = this.mBackgroundMediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 57 */
v0 = this.mBackgroundMediaPlayer;
(( android.media.MediaPlayer ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
/* .line 60 */
} // :cond_1
/* invoke-direct {p0, p1}, Lorg/cocos2dx/lib/Cocos2dxMusic;->createMediaplayerFromAssets(Ljava/lang/String;)Landroid/media/MediaPlayer; */
this.mBackgroundMediaPlayer = v0;
/* .line 63 */
this.mCurrentPath = p1;
/* .line 65 */
} // :cond_2
return;
} // .end method
public void resumeBackgroundMusic ( ) {
/* .locals 1 */
/* .prologue */
/* .line 127 */
v0 = this.mBackgroundMediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mIsPaused:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 128 */
v0 = this.mBackgroundMediaPlayer;
(( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
/* .line 129 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mIsPaused:Z */
/* .line 131 */
} // :cond_0
return;
} // .end method
public void rewindBackgroundMusic ( ) {
/* .locals 3 */
/* .prologue */
/* .line 134 */
v1 = this.mBackgroundMediaPlayer;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 135 */
v1 = this.mBackgroundMediaPlayer;
(( android.media.MediaPlayer ) v1 ).stop ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->stop()V
/* .line 138 */
try { // :try_start_0
v1 = this.mBackgroundMediaPlayer;
(( android.media.MediaPlayer ) v1 ).prepare ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->prepare()V
/* .line 139 */
v1 = this.mBackgroundMediaPlayer;
int v2 = 0; // const/4 v2, 0x0
(( android.media.MediaPlayer ) v1 ).seekTo ( v2 ); // invoke-virtual {v1, v2}, Landroid/media/MediaPlayer;->seekTo(I)V
/* .line 140 */
v1 = this.mBackgroundMediaPlayer;
(( android.media.MediaPlayer ) v1 ).start ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->start()V
/* .line 142 */
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mIsPaused:Z */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 147 */
} // :cond_0
} // :goto_0
return;
/* .line 143 */
/* :catch_0 */
/* move-exception v0 */
/* .line 144 */
/* .local v0, "e":Ljava/lang/Exception; */
final String v1 = "Cocos2dxMusic"; // const-string v1, "Cocos2dxMusic"
final String v2 = "rewindBackgroundMusic: error state"; // const-string v2, "rewindBackgroundMusic: error state"
android.util.Log .e ( v1,v2 );
} // .end method
public void setBackgroundVolume ( Float p0 ) {
/* .locals 3 */
/* .param p1, "volume" # F */
/* .prologue */
/* .line 178 */
int v0 = 0; // const/4 v0, 0x0
/* cmpg-float v0, p1, v0 */
/* if-gez v0, :cond_0 */
/* .line 179 */
int p1 = 0; // const/4 p1, 0x0
/* .line 182 */
} // :cond_0
/* const/high16 v0, 0x3f800000 # 1.0f */
/* cmpl-float v0, p1, v0 */
/* if-lez v0, :cond_1 */
/* .line 183 */
/* const/high16 p1, 0x3f800000 # 1.0f */
/* .line 186 */
} // :cond_1
/* iput p1, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mRightVolume:F */
/* iput p1, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mLeftVolume:F */
/* .line 187 */
v0 = this.mBackgroundMediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 188 */
v0 = this.mBackgroundMediaPlayer;
/* iget v1, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mLeftVolume:F */
/* iget v2, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mRightVolume:F */
(( android.media.MediaPlayer ) v0 ).setVolume ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/media/MediaPlayer;->setVolume(FF)V
/* .line 190 */
} // :cond_2
return;
} // .end method
public void stopBackgroundMusic ( ) {
/* .locals 1 */
/* .prologue */
/* .line 110 */
v0 = this.mBackgroundMediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 111 */
v0 = this.mBackgroundMediaPlayer;
(( android.media.MediaPlayer ) v0 ).stop ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V
/* .line 115 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mIsPaused:Z */
/* .line 117 */
} // :cond_0
return;
} // .end method

public class org.cocos2dx.lib.Cocos2dxMusic {
	 /* .source "Cocos2dxMusic.java" */
	 /* # static fields */
	 private static final java.lang.String TAG;
	 /* # instance fields */
	 private android.media.MediaPlayer mBackgroundMediaPlayer;
	 private final android.content.Context mContext;
	 private java.lang.String mCurrentPath;
	 private Float mLeftVolume;
	 private Boolean mPaused;
	 private Float mRightVolume;
	 /* # direct methods */
	 static org.cocos2dx.lib.Cocos2dxMusic ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 36 */
		 /* const-class v0, Lorg/cocos2dx/lib/Cocos2dxMusic; */
		 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 return;
	 } // .end method
	 public org.cocos2dx.lib.Cocos2dxMusic ( ) {
		 /* .locals 0 */
		 /* .param p1, "pContext" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 53 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 54 */
		 this.mContext = p1;
		 /* .line 56 */
		 /* invoke-direct {p0}, Lorg/cocos2dx/lib/Cocos2dxMusic;->initData()V */
		 /* .line 57 */
		 return;
	 } // .end method
	 private android.media.MediaPlayer createMediaplayerFromAssets ( java.lang.String p0 ) {
		 /* .locals 8 */
		 /* .param p1, "pPath" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 226 */
		 /* new-instance v0, Landroid/media/MediaPlayer; */
		 /* invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V */
		 /* .line 229 */
		 /* .local v0, "mediaPlayer":Landroid/media/MediaPlayer; */
		 try { // :try_start_0
			 final String v1 = "/"; // const-string v1, "/"
			 v1 = 			 (( java.lang.String ) p1 ).startsWith ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 /* .line 230 */
				 (( android.media.MediaPlayer ) v0 ).setDataSource ( p1 ); // invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V
				 /* .line 236 */
			 } // :goto_0
			 (( android.media.MediaPlayer ) v0 ).prepare ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V
			 /* .line 238 */
			 /* iget v1, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mLeftVolume:F */
			 /* iget v2, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mRightVolume:F */
			 (( android.media.MediaPlayer ) v0 ).setVolume ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/media/MediaPlayer;->setVolume(FF)V
			 /* .line 244 */
		 } // :goto_1
		 /* .line 232 */
	 } // :cond_0
	 v1 = this.mContext;
	 (( android.content.Context ) v1 ).getAssets ( ); // invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
	 (( android.content.res.AssetManager ) v1 ).openFd ( p1 ); // invoke-virtual {v1, p1}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
	 /* .line 233 */
	 /* .local v6, "assetFileDescritor":Landroid/content/res/AssetFileDescriptor; */
	 (( android.content.res.AssetFileDescriptor ) v6 ).getFileDescriptor ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;
	 (( android.content.res.AssetFileDescriptor ) v6 ).getStartOffset ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J
	 /* move-result-wide v2 */
	 (( android.content.res.AssetFileDescriptor ) v6 ).getLength ( ); // invoke-virtual {v6}, Landroid/content/res/AssetFileDescriptor;->getLength()J
	 /* move-result-wide v4 */
	 /* invoke-virtual/range {v0 ..v5}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V */
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 239 */
} // .end local v6 # "assetFileDescritor":Landroid/content/res/AssetFileDescriptor;
/* :catch_0 */
/* move-exception v7 */
/* .line 240 */
/* .local v7, "e":Ljava/lang/Exception; */
int v0 = 0; // const/4 v0, 0x0
/* .line 241 */
v1 = org.cocos2dx.lib.Cocos2dxMusic.TAG;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "error: "; // const-string v3, "error: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.Exception ) v7 ).getMessage ( ); // invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v1,v2,v7 );
} // .end method
private void initData ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* const/high16 v0, 0x3f000000 # 0.5f */
/* .line 211 */
/* iput v0, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mLeftVolume:F */
/* .line 212 */
/* iput v0, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mRightVolume:F */
/* .line 213 */
this.mBackgroundMediaPlayer = v1;
/* .line 214 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mPaused:Z */
/* .line 215 */
this.mCurrentPath = v1;
/* .line 216 */
return;
} // .end method
/* # virtual methods */
public void end ( ) {
/* .locals 1 */
/* .prologue */
/* .line 180 */
v0 = this.mBackgroundMediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 181 */
	 v0 = this.mBackgroundMediaPlayer;
	 (( android.media.MediaPlayer ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
	 /* .line 184 */
} // :cond_0
/* invoke-direct {p0}, Lorg/cocos2dx/lib/Cocos2dxMusic;->initData()V */
/* .line 185 */
return;
} // .end method
public Float getBackgroundVolume ( ) {
/* .locals 2 */
/* .prologue */
/* .line 188 */
v0 = this.mBackgroundMediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 189 */
	 /* iget v0, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mLeftVolume:F */
	 /* iget v1, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mRightVolume:F */
	 /* add-float/2addr v0, v1 */
	 /* const/high16 v1, 0x40000000 # 2.0f */
	 /* div-float/2addr v0, v1 */
	 /* .line 191 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isBackgroundMusicPlaying ( ) {
/* .locals 2 */
/* .prologue */
/* .line 168 */
int v0 = 0; // const/4 v0, 0x0
/* .line 170 */
/* .local v0, "ret":Z */
v1 = this.mBackgroundMediaPlayer;
/* if-nez v1, :cond_0 */
/* .line 171 */
int v0 = 0; // const/4 v0, 0x0
/* .line 176 */
} // :goto_0
/* .line 173 */
} // :cond_0
v1 = this.mBackgroundMediaPlayer;
v0 = (( android.media.MediaPlayer ) v1 ).isPlaying ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->isPlaying()Z
} // .end method
public void pauseBackgroundMusic ( ) {
/* .locals 1 */
/* .prologue */
/* .line 138 */
v0 = this.mBackgroundMediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mBackgroundMediaPlayer;
v0 = (( android.media.MediaPlayer ) v0 ).isPlaying ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 139 */
v0 = this.mBackgroundMediaPlayer;
(( android.media.MediaPlayer ) v0 ).pause ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
/* .line 140 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mPaused:Z */
/* .line 142 */
} // :cond_0
return;
} // .end method
public void playBackgroundMusic ( java.lang.String p0, Boolean p1 ) {
/* .locals 3 */
/* .param p1, "pPath" # Ljava/lang/String; */
/* .param p2, "isLoop" # Z */
/* .prologue */
/* .line 88 */
v1 = this.mCurrentPath;
/* if-nez v1, :cond_1 */
/* .line 90 */
/* invoke-direct {p0, p1}, Lorg/cocos2dx/lib/Cocos2dxMusic;->createMediaplayerFromAssets(Ljava/lang/String;)Landroid/media/MediaPlayer; */
this.mBackgroundMediaPlayer = v1;
/* .line 91 */
this.mCurrentPath = p1;
/* .line 107 */
} // :cond_0
} // :goto_0
v1 = this.mBackgroundMediaPlayer;
/* if-nez v1, :cond_3 */
/* .line 108 */
v1 = org.cocos2dx.lib.Cocos2dxMusic.TAG;
final String v2 = "playBackgroundMusic: background media player is null"; // const-string v2, "playBackgroundMusic: background media player is null"
android.util.Log .e ( v1,v2 );
/* .line 125 */
} // :goto_1
return;
/* .line 93 */
} // :cond_1
v1 = this.mCurrentPath;
v1 = (( java.lang.String ) v1 ).equals ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_0 */
/* .line 97 */
v1 = this.mBackgroundMediaPlayer;
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 98 */
v1 = this.mBackgroundMediaPlayer;
(( android.media.MediaPlayer ) v1 ).release ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->release()V
/* .line 100 */
} // :cond_2
/* invoke-direct {p0, p1}, Lorg/cocos2dx/lib/Cocos2dxMusic;->createMediaplayerFromAssets(Ljava/lang/String;)Landroid/media/MediaPlayer; */
this.mBackgroundMediaPlayer = v1;
/* .line 103 */
this.mCurrentPath = p1;
/* .line 111 */
} // :cond_3
v1 = this.mBackgroundMediaPlayer;
(( android.media.MediaPlayer ) v1 ).stop ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->stop()V
/* .line 113 */
v1 = this.mBackgroundMediaPlayer;
(( android.media.MediaPlayer ) v1 ).setLooping ( p2 ); // invoke-virtual {v1, p2}, Landroid/media/MediaPlayer;->setLooping(Z)V
/* .line 116 */
try { // :try_start_0
v1 = this.mBackgroundMediaPlayer;
(( android.media.MediaPlayer ) v1 ).prepare ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->prepare()V
/* .line 117 */
v1 = this.mBackgroundMediaPlayer;
int v2 = 0; // const/4 v2, 0x0
(( android.media.MediaPlayer ) v1 ).seekTo ( v2 ); // invoke-virtual {v1, v2}, Landroid/media/MediaPlayer;->seekTo(I)V
/* .line 118 */
v1 = this.mBackgroundMediaPlayer;
(( android.media.MediaPlayer ) v1 ).start ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->start()V
/* .line 120 */
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mPaused:Z */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 121 */
/* :catch_0 */
/* move-exception v0 */
/* .line 122 */
/* .local v0, "e":Ljava/lang/Exception; */
v1 = org.cocos2dx.lib.Cocos2dxMusic.TAG;
final String v2 = "playBackgroundMusic: error state"; // const-string v2, "playBackgroundMusic: error state"
android.util.Log .e ( v1,v2 );
} // .end method
public void preloadBackgroundMusic ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "pPath" # Ljava/lang/String; */
/* .prologue */
/* .line 72 */
v0 = this.mCurrentPath;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mCurrentPath;
v0 = (( java.lang.String ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_2 */
/* .line 76 */
} // :cond_0
v0 = this.mBackgroundMediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 77 */
v0 = this.mBackgroundMediaPlayer;
(( android.media.MediaPlayer ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
/* .line 80 */
} // :cond_1
/* invoke-direct {p0, p1}, Lorg/cocos2dx/lib/Cocos2dxMusic;->createMediaplayerFromAssets(Ljava/lang/String;)Landroid/media/MediaPlayer; */
this.mBackgroundMediaPlayer = v0;
/* .line 83 */
this.mCurrentPath = p1;
/* .line 85 */
} // :cond_2
return;
} // .end method
public void resumeBackgroundMusic ( ) {
/* .locals 1 */
/* .prologue */
/* .line 145 */
v0 = this.mBackgroundMediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mPaused:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 146 */
v0 = this.mBackgroundMediaPlayer;
(( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
/* .line 147 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mPaused:Z */
/* .line 149 */
} // :cond_0
return;
} // .end method
public void rewindBackgroundMusic ( ) {
/* .locals 3 */
/* .prologue */
/* .line 152 */
v1 = this.mBackgroundMediaPlayer;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 153 */
v1 = this.mBackgroundMediaPlayer;
(( android.media.MediaPlayer ) v1 ).stop ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->stop()V
/* .line 156 */
try { // :try_start_0
v1 = this.mBackgroundMediaPlayer;
(( android.media.MediaPlayer ) v1 ).prepare ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->prepare()V
/* .line 157 */
v1 = this.mBackgroundMediaPlayer;
int v2 = 0; // const/4 v2, 0x0
(( android.media.MediaPlayer ) v1 ).seekTo ( v2 ); // invoke-virtual {v1, v2}, Landroid/media/MediaPlayer;->seekTo(I)V
/* .line 158 */
v1 = this.mBackgroundMediaPlayer;
(( android.media.MediaPlayer ) v1 ).start ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->start()V
/* .line 160 */
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mPaused:Z */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 165 */
} // :cond_0
} // :goto_0
return;
/* .line 161 */
/* :catch_0 */
/* move-exception v0 */
/* .line 162 */
/* .local v0, "e":Ljava/lang/Exception; */
v1 = org.cocos2dx.lib.Cocos2dxMusic.TAG;
final String v2 = "rewindBackgroundMusic: error state"; // const-string v2, "rewindBackgroundMusic: error state"
android.util.Log .e ( v1,v2 );
} // .end method
public void setBackgroundVolume ( Float p0 ) {
/* .locals 3 */
/* .param p1, "pVolume" # F */
/* .prologue */
/* .line 196 */
int v0 = 0; // const/4 v0, 0x0
/* cmpg-float v0, p1, v0 */
/* if-gez v0, :cond_0 */
/* .line 197 */
int p1 = 0; // const/4 p1, 0x0
/* .line 200 */
} // :cond_0
/* const/high16 v0, 0x3f800000 # 1.0f */
/* cmpl-float v0, p1, v0 */
/* if-lez v0, :cond_1 */
/* .line 201 */
/* const/high16 p1, 0x3f800000 # 1.0f */
/* .line 204 */
} // :cond_1
/* iput p1, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mRightVolume:F */
/* iput p1, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mLeftVolume:F */
/* .line 205 */
v0 = this.mBackgroundMediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 206 */
v0 = this.mBackgroundMediaPlayer;
/* iget v1, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mLeftVolume:F */
/* iget v2, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mRightVolume:F */
(( android.media.MediaPlayer ) v0 ).setVolume ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/media/MediaPlayer;->setVolume(FF)V
/* .line 208 */
} // :cond_2
return;
} // .end method
public void stopBackgroundMusic ( ) {
/* .locals 1 */
/* .prologue */
/* .line 128 */
v0 = this.mBackgroundMediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 129 */
v0 = this.mBackgroundMediaPlayer;
(( android.media.MediaPlayer ) v0 ).stop ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V
/* .line 133 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lorg/cocos2dx/lib/Cocos2dxMusic;->mPaused:Z */
/* .line 135 */
} // :cond_0
return;
} // .end method

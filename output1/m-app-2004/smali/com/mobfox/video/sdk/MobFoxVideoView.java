public class com.mobfox.video.sdk.MobFoxVideoView extends android.view.SurfaceView implements com.mobfox.video.sdk.MobFoxMediaController$MediaPlayerControl {
	 /* .source "MobFoxVideoView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/mobfox/video/sdk/MobFoxVideoView$OnStartListener;, */
	 /* Lcom/mobfox/video/sdk/MobFoxVideoView$OnTimeEventListener; */
	 /* } */
} // .end annotation
/* # static fields */
private static final Integer STATE_ERROR;
private static final Integer STATE_IDLE;
private static final Integer STATE_PAUSED;
private static final Integer STATE_PLAYBACK_COMPLETED;
private static final Integer STATE_PLAYING;
private static final Integer STATE_PREPARED;
private static final Integer STATE_PREPARING;
/* # instance fields */
private android.media.MediaPlayer$OnBufferingUpdateListener mBufferingUpdateListener;
private android.media.MediaPlayer$OnCompletionListener mCompletionListener;
private android.content.Context mContext;
private Integer mCurrentBufferPercentage;
private Integer mCurrentState;
private Integer mDisplayMode;
private Integer mDuration;
private android.media.MediaPlayer$OnErrorListener mErrorListener;
public android.os.Handler mHandler;
private Integer mHeight;
private com.mobfox.video.sdk.MobFoxMediaController mMediaController;
private android.media.MediaPlayer mMediaPlayer;
private android.media.MediaPlayer$OnCompletionListener mOnCompletionListener;
private android.media.MediaPlayer$OnErrorListener mOnErrorListener;
private android.media.MediaPlayer$OnPreparedListener mOnPreparedListener;
private com.mobfox.video.sdk.MobFoxVideoView$OnStartListener mOnStartListener;
private Boolean mPlayWhenSurfaceReady;
android.media.MediaPlayer$OnPreparedListener mPreparedListener;
android.view.SurfaceHolder$Callback mSHCallback;
private Integer mSeekWhenPrepared;
android.media.MediaPlayer$OnVideoSizeChangedListener mSizeChangedListener;
private Integer mSurfaceHeight;
private Boolean mSurfaceReady;
private Integer mSurfaceWidth;
private Integer mTargetState;
private java.util.HashMap mTimeEventListeners;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/Integer;", */
/* "Ljava/util/Vector", */
/* "<", */
/* "Lcom/mobfox/video/sdk/MobFoxVideoView$OnTimeEventListener;", */
/* ">;>;" */
/* } */
} // .end annotation
} // .end field
private java.lang.Runnable mTimeEventRunnable;
private java.lang.Thread mTimeEventThread;
private android.os.ConditionVariable mTimeEventThreadDone;
private android.net.Uri mUri;
private Integer mVideoHeight;
private Integer mVideoWidth;
private Integer mWidth;
/* # direct methods */
public com.mobfox.video.sdk.MobFoxVideoView ( ) {
/* .locals 2 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "width" # I */
/* .param p3, "height" # I */
/* .param p4, "displayMode" # I */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 69 */
/* invoke-direct {p0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V */
/* .line 39 */
/* iput v1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mCurrentState:I */
/* .line 40 */
/* iput v1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mTargetState:I */
/* .line 42 */
int v0 = 0; // const/4 v0, 0x0
this.mMediaPlayer = v0;
/* .line 58 */
/* iput-boolean v1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mSurfaceReady:Z */
/* .line 62 */
/* new-instance v0, Landroid/os/ConditionVariable; */
/* .line 63 */
/* invoke-direct {v0, v1}, Landroid/os/ConditionVariable;-><init>(Z)V */
this.mTimeEventThreadDone = v0;
/* .line 64 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.mTimeEventListeners = v0;
/* .line 267 */
/* new-instance v0, Lcom/mobfox/video/sdk/MobFoxVideoView$1; */
/* invoke-direct {v0, p0}, Lcom/mobfox/video/sdk/MobFoxVideoView$1;-><init>(Lcom/mobfox/video/sdk/MobFoxVideoView;)V */
this.mSizeChangedListener = v0;
/* .line 276 */
/* new-instance v0, Lcom/mobfox/video/sdk/MobFoxVideoView$2; */
/* invoke-direct {v0, p0}, Lcom/mobfox/video/sdk/MobFoxVideoView$2;-><init>(Lcom/mobfox/video/sdk/MobFoxVideoView;)V */
this.mPreparedListener = v0;
/* .line 314 */
/* new-instance v0, Lcom/mobfox/video/sdk/MobFoxVideoView$3; */
/* invoke-direct {v0, p0}, Lcom/mobfox/video/sdk/MobFoxVideoView$3;-><init>(Lcom/mobfox/video/sdk/MobFoxVideoView;)V */
this.mCompletionListener = v0;
/* .line 327 */
/* new-instance v0, Lcom/mobfox/video/sdk/MobFoxVideoView$4; */
/* invoke-direct {v0, p0}, Lcom/mobfox/video/sdk/MobFoxVideoView$4;-><init>(Lcom/mobfox/video/sdk/MobFoxVideoView;)V */
this.mErrorListener = v0;
/* .line 348 */
/* new-instance v0, Lcom/mobfox/video/sdk/MobFoxVideoView$5; */
/* invoke-direct {v0, p0}, Lcom/mobfox/video/sdk/MobFoxVideoView$5;-><init>(Lcom/mobfox/video/sdk/MobFoxVideoView;)V */
this.mBufferingUpdateListener = v0;
/* .line 354 */
/* new-instance v0, Lcom/mobfox/video/sdk/MobFoxVideoView$6; */
/* invoke-direct {v0, p0}, Lcom/mobfox/video/sdk/MobFoxVideoView$6;-><init>(Lcom/mobfox/video/sdk/MobFoxVideoView;)V */
this.mSHCallback = v0;
/* .line 70 */
this.mContext = p1;
/* .line 71 */
/* iput p2, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mWidth:I */
/* .line 72 */
/* iput p3, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mHeight:I */
/* .line 73 */
/* iput p4, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mDisplayMode:I */
/* .line 74 */
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->initVideoView()V */
/* .line 75 */
return;
} // .end method
static void access$0 ( com.mobfox.video.sdk.MobFoxVideoView p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 239 */
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->setVideoDisplaySize()V */
return;
} // .end method
static void access$1 ( com.mobfox.video.sdk.MobFoxVideoView p0, Integer p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 39 */
/* iput p1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mCurrentState:I */
return;
} // .end method
static android.media.MediaPlayer$OnErrorListener access$10 ( com.mobfox.video.sdk.MobFoxVideoView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 55 */
v0 = this.mOnErrorListener;
} // .end method
static void access$11 ( com.mobfox.video.sdk.MobFoxVideoView p0, Integer p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 54 */
/* iput p1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mCurrentBufferPercentage:I */
return;
} // .end method
static void access$12 ( com.mobfox.video.sdk.MobFoxVideoView p0, Integer p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 47 */
/* iput p1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mSurfaceWidth:I */
return;
} // .end method
static void access$13 ( com.mobfox.video.sdk.MobFoxVideoView p0, Integer p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 48 */
/* iput p1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mSurfaceHeight:I */
return;
} // .end method
static void access$14 ( com.mobfox.video.sdk.MobFoxVideoView p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 58 */
/* iput-boolean p1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mSurfaceReady:Z */
return;
} // .end method
static Boolean access$15 ( com.mobfox.video.sdk.MobFoxVideoView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 57 */
/* iget-boolean v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mPlayWhenSurfaceReady:Z */
} // .end method
static void access$16 ( com.mobfox.video.sdk.MobFoxVideoView p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 140 */
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->openVideo()V */
return;
} // .end method
static void access$17 ( com.mobfox.video.sdk.MobFoxVideoView p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 390 */
/* invoke-direct {p0, p1}, Lcom/mobfox/video/sdk/MobFoxVideoView;->release(Z)V */
return;
} // .end method
static Integer access$18 ( com.mobfox.video.sdk.MobFoxVideoView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 39 */
/* iget v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mCurrentState:I */
} // .end method
static java.util.HashMap access$19 ( com.mobfox.video.sdk.MobFoxVideoView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 64 */
v0 = this.mTimeEventListeners;
} // .end method
static android.media.MediaPlayer$OnPreparedListener access$2 ( com.mobfox.video.sdk.MobFoxVideoView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 53 */
v0 = this.mOnPreparedListener;
} // .end method
static android.os.ConditionVariable access$20 ( com.mobfox.video.sdk.MobFoxVideoView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 62 */
v0 = this.mTimeEventThreadDone;
} // .end method
static android.media.MediaPlayer access$3 ( com.mobfox.video.sdk.MobFoxVideoView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 42 */
v0 = this.mMediaPlayer;
} // .end method
static com.mobfox.video.sdk.MobFoxMediaController access$4 ( com.mobfox.video.sdk.MobFoxVideoView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 50 */
v0 = this.mMediaController;
} // .end method
static Integer access$5 ( com.mobfox.video.sdk.MobFoxVideoView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 56 */
/* iget v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mSeekWhenPrepared:I */
} // .end method
static Boolean access$6 ( com.mobfox.video.sdk.MobFoxVideoView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 58 */
/* iget-boolean v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mSurfaceReady:Z */
} // .end method
static Integer access$7 ( com.mobfox.video.sdk.MobFoxVideoView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 40 */
/* iget v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mTargetState:I */
} // .end method
static void access$8 ( com.mobfox.video.sdk.MobFoxVideoView p0, Integer p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 40 */
/* iput p1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mTargetState:I */
return;
} // .end method
static android.media.MediaPlayer$OnCompletionListener access$9 ( com.mobfox.video.sdk.MobFoxVideoView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 51 */
v0 = this.mOnCompletionListener;
} // .end method
private void attachMediaController ( ) {
/* .locals 2 */
/* .prologue */
/* .line 233 */
v0 = this.mMediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mMediaController;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 234 */
	 v0 = this.mMediaController;
	 (( com.mobfox.video.sdk.MobFoxMediaController ) v0 ).setMediaPlayer ( p0 ); // invoke-virtual {v0, p0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->setMediaPlayer(Lcom/mobfox/video/sdk/MobFoxMediaController$MediaPlayerControl;)V
	 /* .line 235 */
	 v0 = this.mMediaController;
	 v1 = 	 /* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->isInPlaybackState()Z */
	 (( com.mobfox.video.sdk.MobFoxMediaController ) v0 ).setEnabled ( v1 ); // invoke-virtual {v0, v1}, Lcom/mobfox/video/sdk/MobFoxMediaController;->setEnabled(Z)V
	 /* .line 237 */
} // :cond_0
return;
} // .end method
private void initVideoView ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 102 */
/* new-instance v0, Landroid/os/Handler; */
/* invoke-direct {v0}, Landroid/os/Handler;-><init>()V */
this.mHandler = v0;
/* .line 103 */
/* iput v2, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoWidth:I */
/* .line 104 */
/* iput v2, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoHeight:I */
/* .line 105 */
/* iput v2, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mSurfaceWidth:I */
/* .line 106 */
/* iput v2, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mSurfaceHeight:I */
/* .line 107 */
/* iput-boolean v2, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mSurfaceReady:Z */
/* .line 108 */
(( com.mobfox.video.sdk.MobFoxVideoView ) p0 ).setVisibility ( v2 ); // invoke-virtual {p0, v2}, Lcom/mobfox/video/sdk/MobFoxVideoView;->setVisibility(I)V
/* .line 109 */
(( com.mobfox.video.sdk.MobFoxVideoView ) p0 ).getHolder ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->getHolder()Landroid/view/SurfaceHolder;
v1 = this.mSHCallback;
/* .line 110 */
(( com.mobfox.video.sdk.MobFoxVideoView ) p0 ).getHolder ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->getHolder()Landroid/view/SurfaceHolder;
int v1 = 3; // const/4 v1, 0x3
/* .line 111 */
(( com.mobfox.video.sdk.MobFoxVideoView ) p0 ).setFocusable ( v3 ); // invoke-virtual {p0, v3}, Lcom/mobfox/video/sdk/MobFoxVideoView;->setFocusable(Z)V
/* .line 112 */
(( com.mobfox.video.sdk.MobFoxVideoView ) p0 ).setFocusableInTouchMode ( v3 ); // invoke-virtual {p0, v3}, Lcom/mobfox/video/sdk/MobFoxVideoView;->setFocusableInTouchMode(Z)V
/* .line 113 */
(( com.mobfox.video.sdk.MobFoxVideoView ) p0 ).requestFocus ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->requestFocus()Z
/* .line 114 */
/* iput v2, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mCurrentState:I */
/* .line 115 */
/* iput v2, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mTargetState:I */
/* .line 116 */
return;
} // .end method
private Boolean isInPlaybackState ( ) {
/* .locals 3 */
/* .prologue */
int v0 = 1; // const/4 v0, 0x1
/* .line 533 */
v1 = this.mMediaPlayer;
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* iget v1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mCurrentState:I */
	 int v2 = -1; // const/4 v2, -0x1
	 /* if-eq v1, v2, :cond_0 */
	 /* .line 534 */
	 /* iget v1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mCurrentState:I */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* iget v1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mCurrentState:I */
		 /* if-eq v1, v0, :cond_0 */
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 533 */
} // .end method
private void openVideo ( ) {
/* .locals 7 */
/* .prologue */
int v2 = 3; // const/4 v2, 0x3
int v6 = 1; // const/4 v6, 0x1
int v5 = 0; // const/4 v5, 0x0
int v4 = -1; // const/4 v4, -0x1
/* .line 141 */
v1 = this.mUri;
/* if-nez v1, :cond_1 */
/* .line 222 */
} // :cond_0
} // :goto_0
return;
/* .line 144 */
} // :cond_1
/* iput-boolean v5, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mPlayWhenSurfaceReady:Z */
/* .line 145 */
/* iget-boolean v1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mSurfaceReady:Z */
/* if-nez v1, :cond_2 */
/* .line 146 */
/* iput-boolean v6, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mPlayWhenSurfaceReady:Z */
/* .line 147 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
v1 = android.util.Log .isLoggable ( v1,v2 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 148 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
final String v2 = "Open Video not starting until surface created"; // const-string v2, "Open Video not starting until surface created"
android.util.Log .d ( v1,v2 );
/* .line 152 */
} // :cond_2
/* invoke-direct {p0, v5}, Lcom/mobfox/video/sdk/MobFoxVideoView;->release(Z)V */
/* .line 154 */
try { // :try_start_0
/* new-instance v1, Landroid/media/MediaPlayer; */
/* invoke-direct {v1}, Landroid/media/MediaPlayer;-><init>()V */
this.mMediaPlayer = v1;
/* .line 155 */
v1 = this.mMediaPlayer;
(( com.mobfox.video.sdk.MobFoxVideoView ) p0 ).getHolder ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->getHolder()Landroid/view/SurfaceHolder;
(( android.media.MediaPlayer ) v1 ).setDisplay ( v2 ); // invoke-virtual {v1, v2}, Landroid/media/MediaPlayer;->setDisplay(Landroid/view/SurfaceHolder;)V
/* .line 156 */
v1 = this.mMediaPlayer;
v2 = this.mPreparedListener;
(( android.media.MediaPlayer ) v1 ).setOnPreparedListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V
/* .line 157 */
v1 = this.mMediaPlayer;
v2 = this.mSizeChangedListener;
(( android.media.MediaPlayer ) v1 ).setOnVideoSizeChangedListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/media/MediaPlayer;->setOnVideoSizeChangedListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V
/* .line 158 */
int v1 = -1; // const/4 v1, -0x1
/* iput v1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mDuration:I */
/* .line 159 */
v1 = this.mMediaPlayer;
v2 = this.mCompletionListener;
(( android.media.MediaPlayer ) v1 ).setOnCompletionListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V
/* .line 160 */
v1 = this.mMediaPlayer;
v2 = this.mErrorListener;
(( android.media.MediaPlayer ) v1 ).setOnErrorListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V
/* .line 161 */
v1 = this.mMediaPlayer;
v2 = this.mBufferingUpdateListener;
(( android.media.MediaPlayer ) v1 ).setOnBufferingUpdateListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/media/MediaPlayer;->setOnBufferingUpdateListener(Landroid/media/MediaPlayer$OnBufferingUpdateListener;)V
/* .line 162 */
int v1 = 0; // const/4 v1, 0x0
/* iput v1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mCurrentBufferPercentage:I */
/* .line 163 */
v1 = this.mMediaPlayer;
v2 = this.mContext;
v3 = this.mUri;
(( android.media.MediaPlayer ) v1 ).setDataSource ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V
/* .line 164 */
v1 = this.mMediaPlayer;
int v2 = 3; // const/4 v2, 0x3
(( android.media.MediaPlayer ) v1 ).setAudioStreamType ( v2 ); // invoke-virtual {v1, v2}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V
/* .line 165 */
v1 = this.mMediaPlayer;
int v2 = 1; // const/4 v2, 0x1
(( android.media.MediaPlayer ) v1 ).setScreenOnWhilePlaying ( v2 ); // invoke-virtual {v1, v2}, Landroid/media/MediaPlayer;->setScreenOnWhilePlaying(Z)V
/* .line 166 */
v1 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v1 ).prepareAsync ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->prepareAsync()V
/* .line 167 */
/* new-instance v1, Lcom/mobfox/video/sdk/MobFoxVideoView$7; */
/* invoke-direct {v1, p0}, Lcom/mobfox/video/sdk/MobFoxVideoView$7;-><init>(Lcom/mobfox/video/sdk/MobFoxVideoView;)V */
this.mTimeEventRunnable = v1;
/* .line 203 */
/* new-instance v1, Ljava/lang/Thread; */
v2 = this.mTimeEventRunnable;
/* invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
this.mTimeEventThread = v1;
/* .line 204 */
v1 = this.mTimeEventThread;
(( java.lang.Thread ) v1 ).start ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->start()V
/* .line 205 */
int v1 = 1; // const/4 v1, 0x1
/* iput v1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mCurrentState:I */
/* .line 206 */
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->attachMediaController()V */
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_1 */
/* goto/16 :goto_0 */
/* .line 207 */
/* :catch_0 */
/* move-exception v0 */
/* .line 208 */
/* .local v0, "ex":Ljava/io/IOException; */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "Unable to open content: "; // const-string v3, "Unable to open content: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = this.mUri;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v1,v2,v0 );
/* .line 209 */
/* iput v4, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mCurrentState:I */
/* .line 210 */
/* iput v4, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mTargetState:I */
/* .line 211 */
v1 = this.mErrorListener;
v2 = this.mMediaPlayer;
/* goto/16 :goto_0 */
/* .line 214 */
} // .end local v0 # "ex":Ljava/io/IOException;
/* :catch_1 */
/* move-exception v0 */
/* .line 215 */
/* .local v0, "ex":Ljava/lang/IllegalArgumentException; */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "Unable to open content: "; // const-string v3, "Unable to open content: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = this.mUri;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v1,v2,v0 );
/* .line 216 */
/* iput v4, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mCurrentState:I */
/* .line 217 */
/* iput v4, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mTargetState:I */
/* .line 218 */
v1 = this.mErrorListener;
v2 = this.mMediaPlayer;
/* goto/16 :goto_0 */
} // .end method
private void release ( Boolean p0 ) {
/* .locals 3 */
/* .param p1, "cleartargetstate" # Z */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
int v1 = 0; // const/4 v1, 0x0
/* .line 391 */
v0 = this.mMediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 392 */
/* iput v1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mCurrentState:I */
/* .line 393 */
v0 = this.mTimeEventThread;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 394 */
v0 = this.mTimeEventThreadDone;
(( android.os.ConditionVariable ) v0 ).open ( ); // invoke-virtual {v0}, Landroid/os/ConditionVariable;->open()V
/* .line 395 */
this.mTimeEventThread = v2;
/* .line 397 */
} // :cond_0
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).reset ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V
/* .line 398 */
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
/* .line 399 */
this.mMediaPlayer = v2;
/* .line 400 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 401 */
/* iput v1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mTargetState:I */
/* .line 404 */
} // :cond_1
return;
} // .end method
private void setVideoDisplaySize ( ) {
/* .locals 3 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 240 */
/* iput v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoWidth:I */
/* .line 241 */
/* iput v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoHeight:I */
/* .line 242 */
v0 = this.mMediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 243 */
v0 = this.mMediaPlayer;
v0 = (( android.media.MediaPlayer ) v0 ).getVideoWidth ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->getVideoWidth()I
/* iput v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoWidth:I */
/* .line 244 */
v0 = this.mMediaPlayer;
v0 = (( android.media.MediaPlayer ) v0 ).getVideoHeight ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->getVideoHeight()I
/* iput v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoHeight:I */
/* .line 246 */
} // :cond_0
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 247 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "MobFoxVideoView setVideoDisplaySize View Size ("; // const-string v2, "MobFoxVideoView setVideoDisplaySize View Size ("
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 248 */
/* iget v2, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mWidth:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = ","; // const-string v2, ","
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mHeight:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = ") Video size ("; // const-string v2, ") Video size ("
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoWidth:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 249 */
final String v2 = ","; // const-string v2, ","
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoHeight:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = ") surface:("; // const-string v2, ") surface:("
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mSurfaceWidth:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = ","; // const-string v2, ","
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 250 */
/* iget v2, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mSurfaceHeight:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = ")"; // const-string v2, ")"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 247 */
android.util.Log .d ( v0,v1 );
/* .line 252 */
} // :cond_1
/* iget-boolean v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mSurfaceReady:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
/* iget v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoWidth:I */
/* if-lez v0, :cond_3 */
/* iget v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoHeight:I */
/* if-lez v0, :cond_3 */
/* .line 253 */
/* iget v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mDisplayMode:I */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_2 */
/* .line 254 */
/* iget v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoWidth:I */
/* iget v1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mHeight:I */
/* mul-int/2addr v0, v1 */
/* iget v1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mWidth:I */
/* iget v2, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoHeight:I */
/* mul-int/2addr v1, v2 */
/* if-le v0, v1, :cond_4 */
/* .line 256 */
/* iget v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mWidth:I */
/* iget v1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoHeight:I */
/* mul-int/2addr v0, v1 */
/* iget v1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoWidth:I */
/* div-int/2addr v0, v1 */
/* iput v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mHeight:I */
/* .line 262 */
} // :cond_2
} // :goto_0
(( com.mobfox.video.sdk.MobFoxVideoView ) p0 ).getHolder ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->getHolder()Landroid/view/SurfaceHolder;
/* iget v1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mWidth:I */
/* iget v2, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mHeight:I */
/* .line 265 */
} // :cond_3
return;
/* .line 257 */
} // :cond_4
/* iget v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoWidth:I */
/* iget v1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mHeight:I */
/* mul-int/2addr v0, v1 */
/* iget v1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mWidth:I */
/* iget v2, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoHeight:I */
/* mul-int/2addr v1, v2 */
/* if-ge v0, v1, :cond_2 */
/* .line 259 */
/* iget v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mHeight:I */
/* iget v1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoWidth:I */
/* mul-int/2addr v0, v1 */
/* iget v1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoHeight:I */
/* div-int/2addr v0, v1 */
/* iput v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mWidth:I */
} // .end method
private void toggleMediaControlsVisiblity ( ) {
/* .locals 1 */
/* .prologue */
/* .line 453 */
v0 = this.mMediaController;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 454 */
v0 = this.mMediaController;
(( com.mobfox.video.sdk.MobFoxMediaController ) v0 ).toggle ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->toggle()V
/* .line 456 */
} // :cond_0
return;
} // .end method
/* # virtual methods */
public Integer getBufferPercentage ( ) {
/* .locals 1 */
/* .prologue */
/* .line 526 */
v0 = this.mMediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 527 */
/* iget v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mCurrentBufferPercentage:I */
/* .line 529 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer getCurrentPosition ( ) {
/* .locals 1 */
/* .prologue */
/* .line 506 */
v0 = /* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->isInPlaybackState()Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 507 */
v0 = this.mMediaPlayer;
v0 = (( android.media.MediaPlayer ) v0 ).getCurrentPosition ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I
/* .line 509 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer getDuration ( ) {
/* .locals 1 */
/* .prologue */
/* .line 494 */
v0 = /* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->isInPlaybackState()Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 495 */
/* iget v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mDuration:I */
/* if-lez v0, :cond_0 */
/* .line 496 */
/* iget v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mDuration:I */
/* .line 502 */
} // :goto_0
/* .line 498 */
} // :cond_0
v0 = this.mMediaPlayer;
v0 = (( android.media.MediaPlayer ) v0 ).getDuration ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->getDuration()I
/* iput v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mDuration:I */
/* .line 499 */
/* iget v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mDuration:I */
/* .line 501 */
} // :cond_1
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mDuration:I */
/* .line 502 */
/* iget v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mDuration:I */
} // .end method
public Boolean isPlaying ( ) {
/* .locals 1 */
/* .prologue */
/* .line 522 */
v0 = /* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->isInPlaybackState()Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mMediaPlayer;
v0 = (( android.media.MediaPlayer ) v0 ).isPlaying ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 3 */
/* .param p1, "keyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 425 */
int v2 = 4; // const/4 v2, 0x4
/* if-eq p1, v2, :cond_1 */
/* .line 426 */
/* const/16 v2, 0x18 */
/* if-eq p1, v2, :cond_1 */
/* .line 427 */
/* const/16 v2, 0x19 */
/* if-eq p1, v2, :cond_1 */
/* .line 428 */
/* const/16 v2, 0x52 */
/* if-eq p1, v2, :cond_1 */
/* .line 429 */
int v2 = 5; // const/4 v2, 0x5
/* if-eq p1, v2, :cond_1 */
/* .line 430 */
int v2 = 6; // const/4 v2, 0x6
/* if-eq p1, v2, :cond_1 */
/* move v0, v1 */
/* .line 431 */
/* .local v0, "isKeyCodeSupported":Z */
} // :goto_0
v2 = /* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->isInPlaybackState()Z */
if ( v2 != null) { // if-eqz v2, :cond_4
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 432 */
v2 = this.mMediaController;
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 433 */
/* const/16 v2, 0x4f */
/* if-eq p1, v2, :cond_0 */
/* .line 434 */
/* const/16 v2, 0x55 */
/* if-ne p1, v2, :cond_3 */
/* .line 435 */
} // :cond_0
v2 = this.mMediaPlayer;
v2 = (( android.media.MediaPlayer ) v2 ).isPlaying ( ); // invoke-virtual {v2}, Landroid/media/MediaPlayer;->isPlaying()Z
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 436 */
(( com.mobfox.video.sdk.MobFoxVideoView ) p0 ).pause ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->pause()V
/* .line 449 */
} // :goto_1
/* .line 430 */
} // .end local v0 # "isKeyCodeSupported":Z
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 438 */
/* .restart local v0 # "isKeyCodeSupported":Z */
} // :cond_2
(( com.mobfox.video.sdk.MobFoxVideoView ) p0 ).start ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->start()V
/* .line 441 */
} // :cond_3
/* const/16 v1, 0x56 */
/* if-ne p1, v1, :cond_5 */
/* .line 442 */
v1 = this.mMediaPlayer;
v1 = (( android.media.MediaPlayer ) v1 ).isPlaying ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->isPlaying()Z
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 443 */
(( com.mobfox.video.sdk.MobFoxVideoView ) p0 ).pause ( ); // invoke-virtual {p0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->pause()V
/* .line 449 */
} // :cond_4
} // :goto_2
v1 = /* invoke-super {p0, p1, p2}, Landroid/view/SurfaceView;->onKeyDown(ILandroid/view/KeyEvent;)Z */
/* .line 445 */
} // :cond_5
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->toggleMediaControlsVisiblity()V */
} // .end method
protected void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 5 */
/* .param p1, "widthMeasureSpec" # I */
/* .param p2, "heightMeasureSpec" # I */
/* .prologue */
/* .line 79 */
/* iget v1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mWidth:I */
/* .line 80 */
/* .local v1, "width":I */
/* iget v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mHeight:I */
/* .line 81 */
/* .local v0, "height":I */
/* iget v2, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoWidth:I */
/* if-lez v2, :cond_0 */
/* iget v2, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoHeight:I */
/* if-lez v2, :cond_0 */
/* .line 82 */
/* iget v2, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mDisplayMode:I */
int v3 = 1; // const/4 v3, 0x1
/* if-ne v2, v3, :cond_0 */
/* .line 83 */
/* iget v2, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoWidth:I */
/* mul-int/2addr v2, v0 */
/* iget v3, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoHeight:I */
/* mul-int/2addr v3, v1 */
/* if-le v2, v3, :cond_2 */
/* .line 85 */
/* iget v2, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoHeight:I */
/* mul-int/2addr v2, v1 */
/* iget v3, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoWidth:I */
/* div-int v0, v2, v3 */
/* .line 92 */
} // :cond_0
} // :goto_0
(( com.mobfox.video.sdk.MobFoxVideoView ) p0 ).setMeasuredDimension ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->setMeasuredDimension(II)V
/* .line 93 */
final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
int v3 = 3; // const/4 v3, 0x3
v2 = android.util.Log .isLoggable ( v2,v3 );
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 94 */
final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "MobFoxVideoView onMeasure video size ("; // const-string v4, "MobFoxVideoView onMeasure video size ("
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v4, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoWidth:I */
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 95 */
final String v4 = ","; // const-string v4, ","
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v4, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoHeight:I */
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v4 = ") surface:("; // const-string v4, ") surface:("
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v4, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mSurfaceWidth:I */
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v4 = ","; // const-string v4, ","
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 96 */
/* iget v4, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mSurfaceHeight:I */
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v4 = ") Setting size:("; // const-string v4, ") Setting size:("
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v4 = ","; // const-string v4, ","
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 97 */
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v4 = ")"; // const-string v4, ")"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 94 */
android.util.Log .d ( v2,v3 );
/* .line 99 */
} // :cond_1
return;
/* .line 86 */
} // :cond_2
/* iget v2, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoWidth:I */
/* mul-int/2addr v2, v0 */
/* iget v3, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoHeight:I */
/* mul-int/2addr v3, v1 */
/* if-ge v2, v3, :cond_0 */
/* .line 88 */
/* iget v2, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoWidth:I */
/* mul-int/2addr v2, v0 */
/* iget v3, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mVideoHeight:I */
/* div-int v1, v2, v3 */
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 1 */
/* .param p1, "ev" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 408 */
v0 = /* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->isInPlaybackState()Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mMediaController;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 409 */
v0 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
/* if-nez v0, :cond_0 */
/* .line 410 */
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->toggleMediaControlsVisiblity()V */
/* .line 412 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean onTrackballEvent ( android.view.MotionEvent p0 ) {
/* .locals 1 */
/* .param p1, "ev" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 417 */
v0 = /* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->isInPlaybackState()Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mMediaController;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 418 */
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->toggleMediaControlsVisiblity()V */
/* .line 420 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void pause ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 4; // const/4 v1, 0x4
/* .line 480 */
v0 = /* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->isInPlaybackState()Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 481 */
v0 = this.mMediaPlayer;
v0 = (( android.media.MediaPlayer ) v0 ).isPlaying ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 482 */
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).pause ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
/* .line 483 */
/* iput v1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mCurrentState:I */
/* .line 484 */
v0 = this.mMediaController;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 485 */
v0 = this.mMediaController;
(( com.mobfox.video.sdk.MobFoxMediaController ) v0 ).onPause ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->onPause()V
/* .line 489 */
} // :cond_0
/* iput v1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mTargetState:I */
/* .line 490 */
return;
} // .end method
public void seekTo ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "msec" # I */
/* .prologue */
/* .line 513 */
v0 = /* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->isInPlaybackState()Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 514 */
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).seekTo ( p1 ); // invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->seekTo(I)V
/* .line 515 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mSeekWhenPrepared:I */
/* .line 519 */
} // :goto_0
return;
/* .line 517 */
} // :cond_0
/* iput p1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mSeekWhenPrepared:I */
} // .end method
public void setMediaController ( com.mobfox.video.sdk.MobFoxMediaController p0 ) {
/* .locals 1 */
/* .param p1, "controller" # Lcom/mobfox/video/sdk/MobFoxMediaController; */
/* .prologue */
/* .line 225 */
v0 = this.mMediaController;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 226 */
v0 = this.mMediaController;
(( com.mobfox.video.sdk.MobFoxMediaController ) v0 ).hide ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/MobFoxMediaController;->hide()V
/* .line 228 */
} // :cond_0
this.mMediaController = p1;
/* .line 229 */
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->attachMediaController()V */
/* .line 230 */
return;
} // .end method
public void setOnCompletionListener ( android.media.MediaPlayer$OnCompletionListener p0 ) {
/* .locals 0 */
/* .param p1, "l" # Landroid/media/MediaPlayer$OnCompletionListener; */
/* .prologue */
/* .line 542 */
this.mOnCompletionListener = p1;
/* .line 543 */
return;
} // .end method
public void setOnErrorListener ( android.media.MediaPlayer$OnErrorListener p0 ) {
/* .locals 0 */
/* .param p1, "l" # Landroid/media/MediaPlayer$OnErrorListener; */
/* .prologue */
/* .line 546 */
this.mOnErrorListener = p1;
/* .line 547 */
return;
} // .end method
public void setOnPreparedListener ( android.media.MediaPlayer$OnPreparedListener p0 ) {
/* .locals 0 */
/* .param p1, "l" # Landroid/media/MediaPlayer$OnPreparedListener; */
/* .prologue */
/* .line 538 */
this.mOnPreparedListener = p1;
/* .line 539 */
return;
} // .end method
public void setOnStartListener ( com.mobfox.video.sdk.MobFoxVideoView$OnStartListener p0 ) {
/* .locals 0 */
/* .param p1, "l" # Lcom/mobfox/video/sdk/MobFoxVideoView$OnStartListener; */
/* .prologue */
/* .line 550 */
this.mOnStartListener = p1;
/* .line 551 */
return;
} // .end method
public void setOnTimeEventListener ( Integer p0, com.mobfox.video.sdk.MobFoxVideoView$OnTimeEventListener p1 ) {
/* .locals 3 */
/* .param p1, "time" # I */
/* .param p2, "onTimeEventListener" # Lcom/mobfox/video/sdk/MobFoxVideoView$OnTimeEventListener; */
/* .prologue */
/* .line 555 */
v1 = this.mTimeEventListeners;
java.lang.Integer .valueOf ( p1 );
(( java.util.HashMap ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/util/Vector; */
/* .line 556 */
/* .local v0, "listeners":Ljava/util/Vector;, "Ljava/util/Vector<Lcom/mobfox/video/sdk/MobFoxVideoView$OnTimeEventListener;>;" */
/* if-nez v0, :cond_0 */
/* .line 557 */
/* new-instance v0, Ljava/util/Vector; */
} // .end local v0 # "listeners":Ljava/util/Vector;, "Ljava/util/Vector<Lcom/mobfox/video/sdk/MobFoxVideoView$OnTimeEventListener;>;"
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
/* .line 558 */
/* .restart local v0 # "listeners":Ljava/util/Vector;, "Ljava/util/Vector<Lcom/mobfox/video/sdk/MobFoxVideoView$OnTimeEventListener;>;" */
v1 = this.mTimeEventListeners;
java.lang.Integer .valueOf ( p1 );
(( java.util.HashMap ) v1 ).put ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 560 */
} // :cond_0
(( java.util.Vector ) v0 ).add ( p2 ); // invoke-virtual {v0, p2}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
/* .line 561 */
return;
} // .end method
public void setVideoPath ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 119 */
android.net.Uri .parse ( p1 );
(( com.mobfox.video.sdk.MobFoxVideoView ) p0 ).setVideoURI ( v0 ); // invoke-virtual {p0, v0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->setVideoURI(Landroid/net/Uri;)V
/* .line 120 */
return;
} // .end method
public void setVideoURI ( android.net.Uri p0 ) {
/* .locals 1 */
/* .param p1, "uri" # Landroid/net/Uri; */
/* .prologue */
/* .line 123 */
this.mUri = p1;
/* .line 124 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mSeekWhenPrepared:I */
/* .line 125 */
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->openVideo()V */
/* .line 126 */
return;
} // .end method
public void start ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 3; // const/4 v3, 0x3
/* .line 459 */
/* iput v3, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mTargetState:I */
/* .line 460 */
v1 = /* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->isInPlaybackState()Z */
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 461 */
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "com.android.music.musicservicecommand"; // const-string v1, "com.android.music.musicservicecommand"
/* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 462 */
/* .local v0, "intent":Landroid/content/Intent; */
final String v1 = "command"; // const-string v1, "command"
final String v2 = "pause"; // const-string v2, "pause"
(( android.content.Intent ) v0 ).putExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 463 */
v1 = this.mContext;
(( android.content.Context ) v1 ).sendBroadcast ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
/* .line 464 */
v1 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v1 ).start ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->start()V
/* .line 465 */
v1 = this.mMediaController;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 466 */
v1 = this.mMediaController;
(( com.mobfox.video.sdk.MobFoxMediaController ) v1 ).onStart ( ); // invoke-virtual {v1}, Lcom/mobfox/video/sdk/MobFoxMediaController;->onStart()V
/* .line 468 */
} // :cond_0
/* iget v1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mCurrentState:I */
int v2 = 2; // const/4 v2, 0x2
/* if-ne v1, v2, :cond_1 */
/* .line 469 */
v1 = this.mOnStartListener;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 470 */
v1 = this.mOnStartListener;
/* .line 473 */
} // :cond_1
/* iput v3, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mCurrentState:I */
/* .line 477 */
} // .end local v0 # "intent":Landroid/content/Intent;
} // :cond_2
} // :goto_0
return;
/* .line 474 */
} // :cond_3
v1 = this.mMediaPlayer;
/* if-nez v1, :cond_2 */
/* .line 475 */
/* invoke-direct {p0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->openVideo()V */
} // .end method
public void stopPlayback ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 129 */
v0 = this.mMediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 130 */
v0 = this.mMediaPlayer;
v0 = (( android.media.MediaPlayer ) v0 ).isPlaying ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 131 */
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).stop ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V
/* .line 133 */
} // :cond_0
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
/* .line 134 */
int v0 = 0; // const/4 v0, 0x0
this.mMediaPlayer = v0;
/* .line 135 */
/* iput v1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mCurrentState:I */
/* .line 136 */
/* iput v1, p0, Lcom/mobfox/video/sdk/MobFoxVideoView;->mTargetState:I */
/* .line 138 */
} // :cond_1
return;
} // .end method

public class com.wiyun.engine.utils.VideoPlayingActivity extends android.app.Activity implements android.media.MediaPlayer$OnBufferingUpdateListener implements android.media.MediaPlayer$OnCompletionListener implements android.media.MediaPlayer$OnVideoSizeChangedListener implements android.media.MediaPlayer$OnPreparedListener implements android.view.SurfaceHolder$Callback implements android.view.View$OnTouchListener implements android.content.DialogInterface$OnClickListener {
	 /* .source "VideoPlayingActivity.java" */
	 /* # interfaces */
	 /* # static fields */
	 public static final Integer CONTINUE;
	 private static final Integer DIALOG_COMPLETION;
	 private static final Integer DIALOG_PAUSE;
	 public static final Integer EXIT;
	 public static final java.lang.String EXTRA_IN_COMPLETION_INTENT;
	 public static final java.lang.String EXTRA_IN_END_ON_TOUCH;
	 public static final java.lang.String EXTRA_IN_NO_COMPLETION_DIALOG;
	 public static final java.lang.String EXTRA_IN_VIDEO_ASSET_PATH;
	 public static final java.lang.String EXTRA_IN_VIDEO_IS_FILE;
	 public static final java.lang.String EXTRA_IN_VIDEO_RES_ID;
	 public static final java.lang.String EXTRA_IN_VIDEO_URL;
	 public static final Integer REPLAY;
	 /* # instance fields */
	 private java.lang.String mAssetPath;
	 private Boolean mBackKeyTracking;
	 private android.content.Intent mCompletionIntent;
	 private Boolean mEndOnTouch;
	 private android.content.res.AssetFileDescriptor mFD;
	 private android.view.SurfaceHolder mHolder;
	 private Boolean mIsFile;
	 private Boolean mIsVideoReadyToBePlayed;
	 private Boolean mIsVideoSizeKnown;
	 private java.util.Map mLabels;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/util/Map", */
	 /* "<", */
	 /* "Ljava/lang/Integer;", */
	 /* "Ljava/lang/String;", */
	 /* ">;>;" */
	 /* } */
} // .end annotation
} // .end field
private android.media.MediaPlayer mMediaPlayer;
private Boolean mNoCompletionDialog;
private android.view.SurfaceView mPreview;
private Integer mVideoHeight;
private java.lang.String mVideoUrl;
private Integer mVideoWidth;
/* # direct methods */
public com.wiyun.engine.utils.VideoPlayingActivity ( ) {
/* .locals 1 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 63 */
/* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
/* .line 134 */
/* iput-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mIsVideoReadyToBePlayed:Z */
/* .line 135 */
/* iput-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mIsVideoSizeKnown:Z */
/* .line 63 */
return;
} // .end method
private void end ( ) {
/* .locals 2 */
/* .prologue */
/* .line 357 */
v1 = this.mCompletionIntent;
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 358 */
	 v1 = this.mCompletionIntent;
	 (( android.content.Intent ) v1 ).getComponent ( ); // invoke-virtual {v1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;
	 /* .line 359 */
	 /* .local v0, "comp":Landroid/content/ComponentName; */
	 /* if-nez v0, :cond_1 */
	 /* .line 360 */
	 v1 = this.mCompletionIntent;
	 (( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).sendBroadcast ( v1 ); // invoke-virtual {p0, v1}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->sendBroadcast(Landroid/content/Intent;)V
	 /* .line 369 */
} // :goto_0
int v1 = 0; // const/4 v1, 0x0
this.mCompletionIntent = v1;
/* .line 372 */
} // .end local v0 # "comp":Landroid/content/ComponentName;
} // :cond_0
(( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->finish()V
/* .line 373 */
return;
/* .line 363 */
/* .restart local v0 # "comp":Landroid/content/ComponentName; */
} // :cond_1
try { // :try_start_0
v1 = this.mCompletionIntent;
(( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).startActivity ( v1 ); // invoke-virtual {p0, v1}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->startActivity(Landroid/content/Intent;)V
/* :try_end_0 */
/* .catch Landroid/content/ActivityNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 364 */
/* :catch_0 */
/* move-exception v1 */
} // .end method
private java.lang.String getLabel ( Integer p0 ) {
/* .locals 4 */
/* .param p1, "id" # I */
/* .prologue */
int v3 = 2; // const/4 v3, 0x2
/* .line 245 */
(( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getConfiguration ( ); // invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
v2 = this.locale;
(( java.util.Locale ) v2 ).getLanguage ( ); // invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;
/* .line 246 */
/* .local v0, "lan":Ljava/lang/String; */
v2 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* if-le v2, v3, :cond_0 */
/* .line 247 */
int v2 = 0; // const/4 v2, 0x0
(( java.lang.String ) v0 ).substring ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 248 */
} // :cond_0
v2 = this.mLabels;
/* check-cast v1, Ljava/util/Map; */
/* .line 249 */
/* .local v1, "map":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;" */
/* if-nez v1, :cond_1 */
/* .line 250 */
final String v2 = ""; // const-string v2, ""
/* .line 252 */
} // :goto_0
} // :cond_1
java.lang.Integer .valueOf ( p1 );
/* check-cast v2, Ljava/lang/String; */
} // .end method
private void init ( ) {
/* .locals 10 */
/* .prologue */
int v9 = 2; // const/4 v9, 0x2
int v8 = 1; // const/4 v8, 0x1
int v7 = 0; // const/4 v7, 0x0
/* .line 187 */
/* new-instance v5, Ljava/util/HashMap; */
/* invoke-direct {v5}, Ljava/util/HashMap;-><init>()V */
this.mLabels = v5;
/* .line 188 */
/* new-instance v1, Ljava/util/HashMap; */
/* invoke-direct {v1}, Ljava/util/HashMap;-><init>()V */
/* .line 189 */
/* .local v1, "en":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;" */
java.lang.Integer .valueOf ( v7 );
final String v6 = "Replay"; // const-string v6, "Replay"
/* .line 190 */
java.lang.Integer .valueOf ( v8 );
final String v6 = "Exit"; // const-string v6, "Exit"
/* .line 191 */
java.lang.Integer .valueOf ( v9 );
final String v6 = "Continue"; // const-string v6, "Continue"
/* .line 192 */
v5 = this.mLabels;
final String v6 = "en"; // const-string v6, "en"
/* .line 193 */
/* new-instance v4, Ljava/util/HashMap; */
/* invoke-direct {v4}, Ljava/util/HashMap;-><init>()V */
/* .line 194 */
/* .local v4, "zh":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/String;>;" */
java.lang.Integer .valueOf ( v7 );
final String v6 = "\u91cd\u65b0\u64ad\u653e"; // const-string v6, "\u91cd\u65b0\u64ad\u653e"
/* .line 195 */
java.lang.Integer .valueOf ( v8 );
final String v6 = "\u9000\u51fa\u89c6\u9891"; // const-string v6, "\u9000\u51fa\u89c6\u9891"
/* .line 196 */
java.lang.Integer .valueOf ( v9 );
final String v6 = "\u7ee7\u7eed\u64ad\u653e"; // const-string v6, "\u7ee7\u7eed\u64ad\u653e"
/* .line 197 */
v5 = this.mLabels;
final String v6 = "zh"; // const-string v6, "zh"
/* .line 200 */
(( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->getIntent()Landroid/content/Intent;
/* .line 201 */
/* .local v3, "intent":Landroid/content/Intent; */
final String v5 = "EXTRA_IN_VIDEO_URL"; // const-string v5, "EXTRA_IN_VIDEO_URL"
(( android.content.Intent ) v3 ).getStringExtra ( v5 ); // invoke-virtual {v3, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
this.mVideoUrl = v5;
/* .line 202 */
final String v5 = "EXTRA_IN_VIDEO_ASSET_PATH"; // const-string v5, "EXTRA_IN_VIDEO_ASSET_PATH"
(( android.content.Intent ) v3 ).getStringExtra ( v5 ); // invoke-virtual {v3, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
this.mAssetPath = v5;
/* .line 203 */
final String v5 = "EXTRA_IN_VIDEO_IS_FILE"; // const-string v5, "EXTRA_IN_VIDEO_IS_FILE"
v5 = (( android.content.Intent ) v3 ).getBooleanExtra ( v5, v7 ); // invoke-virtual {v3, v5, v7}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
/* iput-boolean v5, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mIsFile:Z */
/* .line 204 */
final String v5 = "EXTRA_IN_VIDEO_RES_ID"; // const-string v5, "EXTRA_IN_VIDEO_RES_ID"
v2 = (( android.content.Intent ) v3 ).getIntExtra ( v5, v7 ); // invoke-virtual {v3, v5, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
/* .line 205 */
/* .local v2, "id":I */
final String v5 = "EXTRA_IN_COMPLETION_INTENT"; // const-string v5, "EXTRA_IN_COMPLETION_INTENT"
(( android.content.Intent ) v3 ).getParcelableExtra ( v5 ); // invoke-virtual {v3, v5}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
/* check-cast v5, Landroid/content/Intent; */
this.mCompletionIntent = v5;
/* .line 206 */
final String v5 = "EXTRA_IN_NO_COMPLETION_DIALOG"; // const-string v5, "EXTRA_IN_NO_COMPLETION_DIALOG"
v5 = (( android.content.Intent ) v3 ).getBooleanExtra ( v5, v7 ); // invoke-virtual {v3, v5, v7}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
/* iput-boolean v5, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mNoCompletionDialog:Z */
/* .line 207 */
final String v5 = "EXTRA_IN_END_ON_TOUCH"; // const-string v5, "EXTRA_IN_END_ON_TOUCH"
v5 = (( android.content.Intent ) v3 ).getBooleanExtra ( v5, v7 ); // invoke-virtual {v3, v5, v7}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
/* iput-boolean v5, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mEndOnTouch:Z */
/* .line 210 */
v5 = this.mVideoUrl;
v5 = android.text.TextUtils .isEmpty ( v5 );
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 212 */
try { // :try_start_0
v5 = this.mAssetPath;
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 213 */
/* iget-boolean v5, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mIsFile:Z */
/* if-nez v5, :cond_0 */
/* .line 214 */
(( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).getAssets ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->getAssets()Landroid/content/res/AssetManager;
v6 = this.mAssetPath;
(( android.content.res.AssetManager ) v5 ).openFd ( v6 ); // invoke-virtual {v5, v6}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
this.mFD = v5;
/* .line 223 */
} // :cond_0
} // :goto_0
return;
/* .line 216 */
} // :cond_1
(( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v5 ).openRawResourceFd ( v2 ); // invoke-virtual {v5, v2}, Landroid/content/res/Resources;->openRawResourceFd(I)Landroid/content/res/AssetFileDescriptor;
this.mFD = v5;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 219 */
/* :catch_0 */
/* move-exception v0 */
/* .line 220 */
/* .local v0, "e":Ljava/io/IOException; */
(( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
} // .end method
private void initViews ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 154 */
v0 = this.mPreview;
(( android.view.SurfaceView ) v0 ).setFocusable ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/SurfaceView;->setFocusable(Z)V
/* .line 155 */
v0 = this.mPreview;
(( android.view.SurfaceView ) v0 ).setFocusableInTouchMode ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/SurfaceView;->setFocusableInTouchMode(Z)V
/* .line 156 */
v0 = this.mPreview;
(( android.view.SurfaceView ) v0 ).setOnTouchListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/view/SurfaceView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
/* .line 159 */
v0 = this.mPreview;
(( android.view.SurfaceView ) v0 ).getHolder ( ); // invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;
this.mHolder = v0;
/* .line 162 */
v0 = this.mHolder;
/* .line 165 */
v0 = this.mHolder;
int v1 = 3; // const/4 v1, 0x3
/* .line 166 */
return;
} // .end method
private void playVideo ( ) {
/* .locals 7 */
/* .prologue */
/* .line 398 */
try { // :try_start_0
v0 = this.mMediaPlayer;
/* if-nez v0, :cond_0 */
/* .line 399 */
/* new-instance v0, Landroid/media/MediaPlayer; */
/* invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V */
this.mMediaPlayer = v0;
/* .line 401 */
} // :cond_0
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).reset ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V
/* .line 404 */
v0 = this.mVideoUrl;
v0 = android.text.TextUtils .isEmpty ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 405 */
/* iget-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mIsFile:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 406 */
v0 = this.mMediaPlayer;
v1 = this.mAssetPath;
(( android.media.MediaPlayer ) v0 ).setDataSource ( v1 ); // invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V
/* .line 414 */
} // :goto_0
v0 = this.mMediaPlayer;
v1 = this.mHolder;
(( android.media.MediaPlayer ) v0 ).setDisplay ( v1 ); // invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDisplay(Landroid/view/SurfaceHolder;)V
/* .line 417 */
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).prepareAsync ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepareAsync()V
/* .line 420 */
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).setOnBufferingUpdateListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnBufferingUpdateListener(Landroid/media/MediaPlayer$OnBufferingUpdateListener;)V
/* .line 421 */
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).setOnCompletionListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V
/* .line 422 */
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).setOnPreparedListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V
/* .line 423 */
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).setOnVideoSizeChangedListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnVideoSizeChangedListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V
/* .line 424 */
v0 = this.mMediaPlayer;
int v1 = 3; // const/4 v1, 0x3
(( android.media.MediaPlayer ) v0 ).setAudioStreamType ( v1 ); // invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V
/* .line 428 */
} // :goto_1
return;
/* .line 408 */
} // :cond_1
v0 = this.mMediaPlayer;
v1 = this.mFD;
(( android.content.res.AssetFileDescriptor ) v1 ).getFileDescriptor ( ); // invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;
v2 = this.mFD;
(( android.content.res.AssetFileDescriptor ) v2 ).getStartOffset ( ); // invoke-virtual {v2}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J
/* move-result-wide v2 */
v4 = this.mFD;
(( android.content.res.AssetFileDescriptor ) v4 ).getLength ( ); // invoke-virtual {v4}, Landroid/content/res/AssetFileDescriptor;->getLength()J
/* move-result-wide v4 */
/* invoke-virtual/range {v0 ..v5}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 425 */
/* :catch_0 */
/* move-exception v6 */
/* .line 426 */
/* .local v6, "e":Ljava/lang/Exception; */
final String v0 = "libwiengine"; // const-string v0, "libwiengine"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "error: "; // const-string v2, "error: "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.Exception ) v6 ).getMessage ( ); // invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v0,v1,v6 );
/* .line 410 */
} // .end local v6 # "e":Ljava/lang/Exception;
} // :cond_2
try { // :try_start_1
v0 = this.mMediaPlayer;
v1 = this.mVideoUrl;
(( android.media.MediaPlayer ) v0 ).setDataSource ( v1 ); // invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
} // .end method
private void showCompletionDialog ( ) {
/* .locals 1 */
/* .prologue */
/* .line 385 */
int v0 = -1; // const/4 v0, -0x1
(( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).setResult ( v0 ); // invoke-virtual {p0, v0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->setResult(I)V
/* .line 386 */
/* iget-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mNoCompletionDialog:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 387 */
/* invoke-direct {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->end()V */
/* .line 390 */
} // :goto_0
return;
/* .line 389 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
(( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).showDialog ( v0 ); // invoke-virtual {p0, v0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->showDialog(I)V
} // .end method
private void showPauseDialog ( ) {
/* .locals 1 */
/* .prologue */
/* .line 380 */
int v0 = 0; // const/4 v0, 0x0
(( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).setResult ( v0 ); // invoke-virtual {p0, v0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->setResult(I)V
/* .line 381 */
int v0 = 2; // const/4 v0, 0x2
(( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).showDialog ( v0 ); // invoke-virtual {p0, v0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->showDialog(I)V
/* .line 382 */
return;
} // .end method
private void start ( ) {
/* .locals 3 */
/* .prologue */
/* .line 313 */
v0 = this.mHolder;
/* iget v1, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mVideoWidth:I */
/* iget v2, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mVideoHeight:I */
/* .line 315 */
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
/* .line 316 */
return;
} // .end method
/* # virtual methods */
public void onBufferingUpdate ( android.media.MediaPlayer p0, Integer p1 ) {
/* .locals 0 */
/* .param p1, "mp" # Landroid/media/MediaPlayer; */
/* .param p2, "percent" # I */
/* .prologue */
/* .line 393 */
return;
} // .end method
public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
/* .locals 2 */
/* .param p1, "arg0" # Landroid/content/DialogInterface; */
/* .param p2, "which" # I */
/* .prologue */
/* .line 338 */
/* packed-switch p2, :pswitch_data_0 */
/* .line 354 */
} // :cond_0
} // :goto_0
return;
/* .line 340 */
/* :pswitch_0 */
v0 = this.mMediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 341 */
v0 = this.mMediaPlayer;
int v1 = 0; // const/4 v1, 0x0
(( android.media.MediaPlayer ) v0 ).seekTo ( v1 ); // invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->seekTo(I)V
/* .line 342 */
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
/* .line 346 */
/* :pswitch_1 */
v0 = this.mMediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 347 */
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
/* .line 351 */
/* :pswitch_2 */
/* invoke-direct {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->end()V */
/* .line 338 */
/* :pswitch_data_0 */
/* .packed-switch -0x3 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public void onCompletion ( android.media.MediaPlayer p0 ) {
/* .locals 0 */
/* .param p1, "mp" # Landroid/media/MediaPlayer; */
/* .prologue */
/* .line 376 */
/* invoke-direct {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->showCompletionDialog()V */
/* .line 377 */
return;
} // .end method
protected void onCreate ( android.os.Bundle p0 ) {
/* .locals 2 */
/* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
/* .prologue */
/* const/16 v1, 0x400 */
/* .line 141 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
/* .line 142 */
int v0 = 1; // const/4 v0, 0x1
(( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).requestWindowFeature ( v0 ); // invoke-virtual {p0, v0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->requestWindowFeature(I)Z
/* .line 143 */
(( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->getWindow()Landroid/view/Window;
(( android.view.Window ) v0 ).setFlags ( v1, v1 ); // invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V
/* .line 145 */
/* new-instance v0, Landroid/view/SurfaceView; */
/* invoke-direct {v0, p0}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V */
this.mPreview = v0;
/* .line 146 */
v0 = this.mPreview;
(( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).setContentView ( v0 ); // invoke-virtual {p0, v0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->setContentView(Landroid/view/View;)V
/* .line 148 */
/* invoke-direct {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->init()V */
/* .line 150 */
/* invoke-direct {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->initViews()V */
/* .line 151 */
return;
} // .end method
protected android.app.Dialog onCreateDialog ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "id" # I */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
int v1 = 0; // const/4 v1, 0x0
/* .line 227 */
/* packed-switch p1, :pswitch_data_0 */
/* .line 240 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreateDialog(I)Landroid/app/Dialog; */
} // :goto_0
/* .line 229 */
/* :pswitch_0 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
/* invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* .line 230 */
/* invoke-direct {p0, v1}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->getLabel(I)Ljava/lang/String; */
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 231 */
/* invoke-direct {p0, v2}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->getLabel(I)Ljava/lang/String; */
(( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 232 */
(( android.app.AlertDialog$Builder ) v0 ).create ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
/* .line 234 */
/* :pswitch_1 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
/* invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* .line 235 */
/* invoke-direct {p0, v1}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->getLabel(I)Ljava/lang/String; */
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 236 */
/* invoke-direct {p0, v2}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->getLabel(I)Ljava/lang/String; */
(( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 237 */
int v1 = 2; // const/4 v1, 0x2
/* invoke-direct {p0, v1}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->getLabel(I)Ljava/lang/String; */
(( android.app.AlertDialog$Builder ) v0 ).setNeutralButton ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 238 */
(( android.app.AlertDialog$Builder ) v0 ).create ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
/* .line 227 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
protected void onDestroy ( ) {
/* .locals 1 */
/* .prologue */
/* .line 172 */
try { // :try_start_0
v0 = this.mFD;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 173 */
v0 = this.mFD;
(( android.content.res.AssetFileDescriptor ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->close()V
/* .line 174 */
int v0 = 0; // const/4 v0, 0x0
this.mFD = v0;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 180 */
} // :cond_0
} // :goto_0
v0 = this.mHolder;
/* .line 182 */
/* invoke-super {p0}, Landroid/app/Activity;->onDestroy()V */
/* .line 183 */
return;
/* .line 176 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 2 */
/* .param p1, "keyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
int v0 = 1; // const/4 v0, 0x1
/* .line 257 */
v1 = (( android.view.KeyEvent ) p2 ).getKeyCode ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I
/* packed-switch v1, :pswitch_data_0 */
/* .line 262 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* .line 259 */
/* :pswitch_0 */
/* iput-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mBackKeyTracking:Z */
/* .line 257 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x4 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public Boolean onKeyUp ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 2 */
/* .param p1, "keyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 268 */
v1 = (( android.view.KeyEvent ) p2 ).getKeyCode ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I
/* packed-switch v1, :pswitch_data_0 */
/* .line 278 */
} // :cond_0
} // :goto_0
/* .line 270 */
/* :pswitch_0 */
/* iget-boolean v1, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mBackKeyTracking:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 271 */
/* iput-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mBackKeyTracking:Z */
/* .line 272 */
(( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->finish()V
/* .line 273 */
int v0 = 1; // const/4 v0, 0x1
/* .line 268 */
/* :pswitch_data_0 */
/* .packed-switch 0x4 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public void onPrepared ( android.media.MediaPlayer p0 ) {
/* .locals 1 */
/* .param p1, "mp" # Landroid/media/MediaPlayer; */
/* .prologue */
/* .line 331 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mIsVideoReadyToBePlayed:Z */
/* .line 332 */
/* iget-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mIsVideoReadyToBePlayed:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mIsVideoSizeKnown:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 333 */
/* invoke-direct {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->start()V */
/* .line 335 */
} // :cond_0
return;
} // .end method
public Boolean onTouch ( android.view.View p0, android.view.MotionEvent p1 ) {
/* .locals 1 */
/* .param p1, "v" # Landroid/view/View; */
/* .param p2, "e" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 283 */
v0 = this.mMediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 284 */
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).pause ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
/* .line 286 */
/* iget-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mEndOnTouch:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 287 */
/* invoke-direct {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->end()V */
/* .line 291 */
} // :cond_0
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
/* .line 289 */
} // :cond_1
/* invoke-direct {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->showPauseDialog()V */
} // .end method
public void onVideoSizeChanged ( android.media.MediaPlayer p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .param p1, "mp" # Landroid/media/MediaPlayer; */
/* .param p2, "width" # I */
/* .param p3, "height" # I */
/* .prologue */
/* .line 319 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* if-nez p3, :cond_1 */
/* .line 328 */
} // :cond_0
} // :goto_0
return;
/* .line 322 */
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mIsVideoSizeKnown:Z */
/* .line 323 */
/* iput p2, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mVideoWidth:I */
/* .line 324 */
/* iput p3, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mVideoHeight:I */
/* .line 325 */
/* iget-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mIsVideoReadyToBePlayed:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mIsVideoSizeKnown:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 326 */
/* invoke-direct {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->start()V */
} // .end method
public void surfaceChanged ( android.view.SurfaceHolder p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .param p2, "format" # I */
/* .param p3, "width" # I */
/* .param p4, "height" # I */
/* .prologue */
/* .line 297 */
return;
} // .end method
public void surfaceCreated ( android.view.SurfaceHolder p0 ) {
/* .locals 0 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .prologue */
/* .line 300 */
/* invoke-direct {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->playVideo()V */
/* .line 301 */
return;
} // .end method
public void surfaceDestroyed ( android.view.SurfaceHolder p0 ) {
/* .locals 1 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .prologue */
/* .line 304 */
v0 = this.mMediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 305 */
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).stop ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V
/* .line 306 */
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
/* .line 307 */
int v0 = 0; // const/4 v0, 0x0
this.mMediaPlayer = v0;
/* .line 309 */
} // :cond_0
return;
} // .end method

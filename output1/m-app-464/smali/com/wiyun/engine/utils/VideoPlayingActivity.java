public class com.wiyun.engine.utils.VideoPlayingActivity extends android.app.Activity implements android.content.DialogInterface$OnClickListener implements android.media.MediaPlayer$OnBufferingUpdateListener implements android.media.MediaPlayer$OnCompletionListener implements android.media.MediaPlayer$OnPreparedListener implements android.media.MediaPlayer$OnVideoSizeChangedListener implements android.view.SurfaceHolder$Callback implements android.view.View$OnTouchListener {
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
	 private android.media.MediaPlayer mMediaPlayer;
	 private Boolean mNoCompletionDialog;
	 private android.view.SurfaceView mPreview;
	 private Integer mVideoHeight;
	 private java.lang.String mVideoUrl;
	 private Integer mVideoWidth;
	 /* # direct methods */
	 public com.wiyun.engine.utils.VideoPlayingActivity ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 /* iput-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mIsVideoReadyToBePlayed:Z */
		 /* iput-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mIsVideoSizeKnown:Z */
		 return;
	 } // .end method
	 private void end ( ) {
		 /* .locals 1 */
		 v0 = this.mCompletionIntent;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.mCompletionIntent;
			 (( android.content.Intent ) v0 ).getComponent ( ); // invoke-virtual {v0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;
			 /* if-nez v0, :cond_1 */
			 v0 = this.mCompletionIntent;
			 (( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).sendBroadcast ( v0 ); // invoke-virtual {p0, v0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->sendBroadcast(Landroid/content/Intent;)V
		 } // :goto_0
		 int v0 = 0; // const/4 v0, 0x0
		 this.mCompletionIntent = v0;
	 } // :cond_0
	 (( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->finish()V
	 return;
} // :cond_1
try { // :try_start_0
	 v0 = this.mCompletionIntent;
	 (( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).startActivity ( v0 ); // invoke-virtual {p0, v0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->startActivity(Landroid/content/Intent;)V
	 /* :try_end_0 */
	 /* .catch Landroid/content/ActivityNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v0 */
} // .end method
private java.lang.String getLabel ( Integer p0 ) {
	 /* .locals 3 */
	 int v2 = 2; // const/4 v2, 0x2
	 (( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->getResources()Landroid/content/res/Resources;
	 (( android.content.res.Resources ) v0 ).getConfiguration ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
	 v0 = this.locale;
	 (( java.util.Locale ) v0 ).getLanguage ( ); // invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;
	 v1 = 	 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
	 /* if-le v1, v2, :cond_0 */
	 int v1 = 0; // const/4 v1, 0x0
	 (( java.lang.String ) v0 ).substring ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
} // :cond_0
v1 = this.mLabels;
/* check-cast v0, Ljava/util/Map; */
/* if-nez v0, :cond_1 */
final String v0 = ""; // const-string v0, ""
} // :goto_0
} // :cond_1
java.lang.Integer .valueOf ( p1 );
/* check-cast v0, Ljava/lang/String; */
} // .end method
private void init ( ) {
/* .locals 6 */
int v5 = 2; // const/4 v5, 0x2
int v4 = 1; // const/4 v4, 0x1
int v3 = 0; // const/4 v3, 0x0
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.mLabels = v0;
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
java.lang.Integer .valueOf ( v3 );
final String v2 = "Replay"; // const-string v2, "Replay"
java.lang.Integer .valueOf ( v4 );
final String v2 = "Exit"; // const-string v2, "Exit"
java.lang.Integer .valueOf ( v5 );
final String v2 = "Continue"; // const-string v2, "Continue"
v1 = this.mLabels;
final String v2 = "en"; // const-string v2, "en"
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
java.lang.Integer .valueOf ( v3 );
final String v2 = "\u91cd\u65b0\u64ad\u653e"; // const-string v2, "\u91cd\u65b0\u64ad\u653e"
java.lang.Integer .valueOf ( v4 );
final String v2 = "\u9000\u51fa\u89c6\u9891"; // const-string v2, "\u9000\u51fa\u89c6\u9891"
java.lang.Integer .valueOf ( v5 );
final String v2 = "\u7ee7\u7eed\u64ad\u653e"; // const-string v2, "\u7ee7\u7eed\u64ad\u653e"
v1 = this.mLabels;
final String v2 = "zh"; // const-string v2, "zh"
(( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->getIntent()Landroid/content/Intent;
final String v0 = "EXTRA_IN_VIDEO_URL"; // const-string v0, "EXTRA_IN_VIDEO_URL"
(( android.content.Intent ) v1 ).getStringExtra ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
this.mVideoUrl = v0;
final String v0 = "EXTRA_IN_VIDEO_ASSET_PATH"; // const-string v0, "EXTRA_IN_VIDEO_ASSET_PATH"
(( android.content.Intent ) v1 ).getStringExtra ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
this.mAssetPath = v0;
final String v0 = "EXTRA_IN_VIDEO_IS_FILE"; // const-string v0, "EXTRA_IN_VIDEO_IS_FILE"
v0 = (( android.content.Intent ) v1 ).getBooleanExtra ( v0, v3 ); // invoke-virtual {v1, v0, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
/* iput-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mIsFile:Z */
final String v0 = "EXTRA_IN_VIDEO_RES_ID"; // const-string v0, "EXTRA_IN_VIDEO_RES_ID"
v2 = (( android.content.Intent ) v1 ).getIntExtra ( v0, v3 ); // invoke-virtual {v1, v0, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
final String v0 = "EXTRA_IN_COMPLETION_INTENT"; // const-string v0, "EXTRA_IN_COMPLETION_INTENT"
(( android.content.Intent ) v1 ).getParcelableExtra ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;
/* check-cast v0, Landroid/content/Intent; */
this.mCompletionIntent = v0;
final String v0 = "EXTRA_IN_NO_COMPLETION_DIALOG"; // const-string v0, "EXTRA_IN_NO_COMPLETION_DIALOG"
v0 = (( android.content.Intent ) v1 ).getBooleanExtra ( v0, v3 ); // invoke-virtual {v1, v0, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
/* iput-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mNoCompletionDialog:Z */
final String v0 = "EXTRA_IN_END_ON_TOUCH"; // const-string v0, "EXTRA_IN_END_ON_TOUCH"
v0 = (( android.content.Intent ) v1 ).getBooleanExtra ( v0, v3 ); // invoke-virtual {v1, v0, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
/* iput-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mEndOnTouch:Z */
v0 = this.mVideoUrl;
v0 = android.text.TextUtils .isEmpty ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
try { // :try_start_0
v0 = this.mAssetPath;
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* iget-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mIsFile:Z */
	 /* if-nez v0, :cond_0 */
	 (( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).getAssets ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->getAssets()Landroid/content/res/AssetManager;
	 v1 = this.mAssetPath;
	 (( android.content.res.AssetManager ) v0 ).openFd ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
	 this.mFD = v0;
} // :cond_0
} // :goto_0
return;
} // :cond_1
(( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).openRawResourceFd ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->openRawResourceFd(I)Landroid/content/res/AssetFileDescriptor;
this.mFD = v0;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
(( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
} // .end method
private void initViews ( ) {
/* .locals 2 */
int v1 = 1; // const/4 v1, 0x1
v0 = this.mPreview;
(( android.view.SurfaceView ) v0 ).setFocusable ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/SurfaceView;->setFocusable(Z)V
v0 = this.mPreview;
(( android.view.SurfaceView ) v0 ).setFocusableInTouchMode ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/SurfaceView;->setFocusableInTouchMode(Z)V
v0 = this.mPreview;
(( android.view.SurfaceView ) v0 ).setOnTouchListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/view/SurfaceView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
v0 = this.mPreview;
(( android.view.SurfaceView ) v0 ).getHolder ( ); // invoke-virtual {v0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;
this.mHolder = v0;
v0 = this.mHolder;
v0 = this.mHolder;
int v1 = 3; // const/4 v1, 0x3
return;
} // .end method
private void playVideo ( ) {
/* .locals 6 */
try { // :try_start_0
v0 = this.mMediaPlayer;
/* if-nez v0, :cond_0 */
/* new-instance v0, Landroid/media/MediaPlayer; */
/* invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V */
this.mMediaPlayer = v0;
} // :cond_0
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).reset ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V
v0 = this.mVideoUrl;
v0 = android.text.TextUtils .isEmpty ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_2
/* iget-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mIsFile:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.mMediaPlayer;
v1 = this.mAssetPath;
(( android.media.MediaPlayer ) v0 ).setDataSource ( v1 ); // invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V
} // :goto_0
v0 = this.mMediaPlayer;
v1 = this.mHolder;
(( android.media.MediaPlayer ) v0 ).setDisplay ( v1 ); // invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDisplay(Landroid/view/SurfaceHolder;)V
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).prepareAsync ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepareAsync()V
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).setOnBufferingUpdateListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnBufferingUpdateListener(Landroid/media/MediaPlayer$OnBufferingUpdateListener;)V
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).setOnCompletionListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).setOnPreparedListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).setOnVideoSizeChangedListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnVideoSizeChangedListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V
v0 = this.mMediaPlayer;
int v1 = 3; // const/4 v1, 0x3
(( android.media.MediaPlayer ) v0 ).setAudioStreamType ( v1 ); // invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V
} // :goto_1
return;
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
/* :catch_0 */
/* move-exception v0 */
final String v1 = "libwiengine"; // const-string v1, "libwiengine"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "error: "; // const-string v3, "error: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.Exception ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v1,v2,v0 );
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
int v0 = -1; // const/4 v0, -0x1
(( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).setResult ( v0 ); // invoke-virtual {p0, v0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->setResult(I)V
/* iget-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mNoCompletionDialog:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* invoke-direct {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->end()V */
} // :goto_0
return;
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
(( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).showDialog ( v0 ); // invoke-virtual {p0, v0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->showDialog(I)V
} // .end method
private void showPauseDialog ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
(( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).setResult ( v0 ); // invoke-virtual {p0, v0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->setResult(I)V
int v0 = 2; // const/4 v0, 0x2
(( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).showDialog ( v0 ); // invoke-virtual {p0, v0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->showDialog(I)V
return;
} // .end method
private void start ( ) {
/* .locals 3 */
v0 = this.mHolder;
/* iget v1, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mVideoWidth:I */
/* iget v2, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mVideoHeight:I */
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
return;
} // .end method
/* # virtual methods */
public void onBufferingUpdate ( android.media.MediaPlayer p0, Integer p1 ) {
/* .locals 0 */
return;
} // .end method
public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
/* .locals 2 */
/* packed-switch p2, :pswitch_data_0 */
} // :cond_0
} // :goto_0
return;
/* :pswitch_0 */
v0 = this.mMediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mMediaPlayer;
int v1 = 0; // const/4 v1, 0x0
(( android.media.MediaPlayer ) v0 ).seekTo ( v1 ); // invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->seekTo(I)V
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
/* :pswitch_1 */
v0 = this.mMediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
/* :pswitch_2 */
/* invoke-direct {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->end()V */
/* :pswitch_data_0 */
/* .packed-switch -0x3 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public void onCompletion ( android.media.MediaPlayer p0 ) {
/* .locals 0 */
/* invoke-direct {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->showCompletionDialog()V */
return;
} // .end method
protected void onCreate ( android.os.Bundle p0 ) {
/* .locals 2 */
/* const/16 v1, 0x400 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
com.games.a .a ( p0 );
int v0 = 1; // const/4 v0, 0x1
(( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).requestWindowFeature ( v0 ); // invoke-virtual {p0, v0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->requestWindowFeature(I)Z
(( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->getWindow()Landroid/view/Window;
(( android.view.Window ) v0 ).setFlags ( v1, v1 ); // invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V
/* new-instance v0, Landroid/view/SurfaceView; */
/* invoke-direct {v0, p0}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V */
this.mPreview = v0;
v0 = this.mPreview;
(( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).setContentView ( v0 ); // invoke-virtual {p0, v0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->setContentView(Landroid/view/View;)V
/* invoke-direct {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->init()V */
/* invoke-direct {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->initViews()V */
return;
} // .end method
protected android.app.Dialog onCreateDialog ( Integer p0 ) {
/* .locals 3 */
int v2 = 1; // const/4 v2, 0x1
int v1 = 0; // const/4 v1, 0x0
/* packed-switch p1, :pswitch_data_0 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreateDialog(I)Landroid/app/Dialog; */
} // :goto_0
/* :pswitch_0 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
/* invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* invoke-direct {p0, v1}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->getLabel(I)Ljava/lang/String; */
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* invoke-direct {p0, v2}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->getLabel(I)Ljava/lang/String; */
(( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
(( android.app.AlertDialog$Builder ) v0 ).create ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
/* :pswitch_1 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
/* invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* invoke-direct {p0, v1}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->getLabel(I)Ljava/lang/String; */
(( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* invoke-direct {p0, v2}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->getLabel(I)Ljava/lang/String; */
(( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
int v1 = 2; // const/4 v1, 0x2
/* invoke-direct {p0, v1}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->getLabel(I)Ljava/lang/String; */
(( android.app.AlertDialog$Builder ) v0 ).setNeutralButton ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
(( android.app.AlertDialog$Builder ) v0 ).create ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
protected void onDestroy ( ) {
/* .locals 1 */
try { // :try_start_0
v0 = this.mFD;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mFD;
(( android.content.res.AssetFileDescriptor ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/content/res/AssetFileDescriptor;->close()V
int v0 = 0; // const/4 v0, 0x0
this.mFD = v0;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_0
} // :goto_0
v0 = this.mHolder;
/* invoke-super {p0}, Landroid/app/Activity;->onDestroy()V */
return;
/* :catch_0 */
/* move-exception v0 */
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 2 */
int v0 = 1; // const/4 v0, 0x1
v1 = (( android.view.KeyEvent ) p2 ).getKeyCode ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I
/* packed-switch v1, :pswitch_data_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* :pswitch_0 */
/* iput-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mBackKeyTracking:Z */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x4 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public Boolean onKeyUp ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
v1 = (( android.view.KeyEvent ) p2 ).getKeyCode ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I
/* packed-switch v1, :pswitch_data_0 */
} // :cond_0
} // :goto_0
/* :pswitch_0 */
/* iget-boolean v1, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mBackKeyTracking:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* iput-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mBackKeyTracking:Z */
(( com.wiyun.engine.utils.VideoPlayingActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->finish()V
int v0 = 1; // const/4 v0, 0x1
/* :pswitch_data_0 */
/* .packed-switch 0x4 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public void onPrepared ( android.media.MediaPlayer p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mIsVideoReadyToBePlayed:Z */
/* iget-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mIsVideoReadyToBePlayed:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mIsVideoSizeKnown:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* invoke-direct {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->start()V */
} // :cond_0
return;
} // .end method
public Boolean onTouch ( android.view.View p0, android.view.MotionEvent p1 ) {
/* .locals 1 */
v0 = this.mMediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).pause ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
/* iget-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mEndOnTouch:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* invoke-direct {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->end()V */
} // :cond_0
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
/* invoke-direct {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->showPauseDialog()V */
} // .end method
public void onVideoSizeChanged ( android.media.MediaPlayer p0, Integer p1, Integer p2 ) {
/* .locals 1 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* if-nez p3, :cond_1 */
} // :cond_0
} // :goto_0
return;
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mIsVideoSizeKnown:Z */
/* iput p2, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mVideoWidth:I */
/* iput p3, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mVideoHeight:I */
/* iget-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mIsVideoReadyToBePlayed:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lcom/wiyun/engine/utils/VideoPlayingActivity;->mIsVideoSizeKnown:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* invoke-direct {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->start()V */
} // .end method
public void surfaceChanged ( android.view.SurfaceHolder p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
return;
} // .end method
public void surfaceCreated ( android.view.SurfaceHolder p0 ) {
/* .locals 0 */
/* invoke-direct {p0}, Lcom/wiyun/engine/utils/VideoPlayingActivity;->playVideo()V */
return;
} // .end method
public void surfaceDestroyed ( android.view.SurfaceHolder p0 ) {
/* .locals 1 */
v0 = this.mMediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).stop ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V
v0 = this.mMediaPlayer;
(( android.media.MediaPlayer ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
int v0 = 0; // const/4 v0, 0x0
this.mMediaPlayer = v0;
} // :cond_0
return;
} // .end method

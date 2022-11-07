public class com.jumptap.adtag.media.JtVideoAdView extends android.view.SurfaceView implements android.widget.MediaController$MediaPlayerControl {
	 /* .source "JtVideoAdView.java" */
	 /* # interfaces */
	 /* # static fields */
	 private static com.jumptap.adtag.media.JtVideoAdView videoViewInstance;
	 /* # instance fields */
	 private android.media.MediaPlayer$OnBufferingUpdateListener bufferingUpdateListener;
	 private android.media.MediaPlayer$OnCompletionListener completionListener;
	 private android.content.Context context;
	 private Integer currentBufferPercentage;
	 private Boolean isPrepared;
	 private android.widget.MediaController mediaController;
	 private android.media.MediaPlayer mediaPlayer;
	 private android.media.MediaPlayer$OnCompletionListener onCompletionListener;
	 private android.media.MediaPlayer$OnPreparedListener onPreparedListener;
	 android.media.MediaPlayer$OnPreparedListener preparedListener;
	 private Integer seekWhenPrepared;
	 android.view.SurfaceHolder$Callback shCallback;
	 private android.view.SurfaceHolder surfaceHolder;
	 private android.net.Uri uri;
	 private Integer videoHeight;
	 private Integer videoWidth;
	 /* # direct methods */
	 private com.jumptap.adtag.media.JtVideoAdView ( ) {
		 /* .locals 1 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 54 */
		 /* invoke-direct {p0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V */
		 /* .line 34 */
		 this.surfaceHolder = v0;
		 /* .line 35 */
		 this.mediaPlayer = v0;
		 /* .line 151 */
		 /* new-instance v0, Lcom/jumptap/adtag/media/JtVideoAdView$1; */
		 /* invoke-direct {v0, p0}, Lcom/jumptap/adtag/media/JtVideoAdView$1;-><init>(Lcom/jumptap/adtag/media/JtVideoAdView;)V */
		 this.bufferingUpdateListener = v0;
		 /* .line 159 */
		 /* new-instance v0, Lcom/jumptap/adtag/media/JtVideoAdView$2; */
		 /* invoke-direct {v0, p0}, Lcom/jumptap/adtag/media/JtVideoAdView$2;-><init>(Lcom/jumptap/adtag/media/JtVideoAdView;)V */
		 this.completionListener = v0;
		 /* .line 185 */
		 /* new-instance v0, Lcom/jumptap/adtag/media/JtVideoAdView$3; */
		 /* invoke-direct {v0, p0}, Lcom/jumptap/adtag/media/JtVideoAdView$3;-><init>(Lcom/jumptap/adtag/media/JtVideoAdView;)V */
		 this.preparedListener = v0;
		 /* .line 278 */
		 /* new-instance v0, Lcom/jumptap/adtag/media/JtVideoAdView$4; */
		 /* invoke-direct {v0, p0}, Lcom/jumptap/adtag/media/JtVideoAdView$4;-><init>(Lcom/jumptap/adtag/media/JtVideoAdView;)V */
		 this.shCallback = v0;
		 /* .line 55 */
		 this.context = p1;
		 /* .line 56 */
		 /* invoke-direct {p0}, Lcom/jumptap/adtag/media/JtVideoAdView;->initVideoView()V */
		 /* .line 57 */
		 return;
	 } // .end method
	 static Integer access$002 ( com.jumptap.adtag.media.JtVideoAdView p0, Integer p1 ) { //synthethic
		 /* .locals 0 */
		 /* .param p0, "x0" # Lcom/jumptap/adtag/media/JtVideoAdView; */
		 /* .param p1, "x1" # I */
		 /* .prologue */
		 /* .line 26 */
		 /* iput p1, p0, Lcom/jumptap/adtag/media/JtVideoAdView;->currentBufferPercentage:I */
	 } // .end method
	 static android.widget.MediaController access$100 ( com.jumptap.adtag.media.JtVideoAdView p0 ) { //synthethic
		 /* .locals 1 */
		 /* .param p0, "x0" # Lcom/jumptap/adtag/media/JtVideoAdView; */
		 /* .prologue */
		 /* .line 26 */
		 v0 = this.mediaController;
	 } // .end method
	 static void access$1000 ( com.jumptap.adtag.media.JtVideoAdView p0 ) { //synthethic
		 /* .locals 0 */
		 /* .param p0, "x0" # Lcom/jumptap/adtag/media/JtVideoAdView; */
		 /* .prologue */
		 /* .line 26 */
		 /* invoke-direct {p0}, Lcom/jumptap/adtag/media/JtVideoAdView;->openVideo()V */
		 return;
	 } // .end method
	 static android.media.MediaPlayer$OnCompletionListener access$200 ( com.jumptap.adtag.media.JtVideoAdView p0 ) { //synthethic
		 /* .locals 1 */
		 /* .param p0, "x0" # Lcom/jumptap/adtag/media/JtVideoAdView; */
		 /* .prologue */
		 /* .line 26 */
		 v0 = this.onCompletionListener;
	 } // .end method
	 static android.media.MediaPlayer access$300 ( com.jumptap.adtag.media.JtVideoAdView p0 ) { //synthethic
		 /* .locals 1 */
		 /* .param p0, "x0" # Lcom/jumptap/adtag/media/JtVideoAdView; */
		 /* .prologue */
		 /* .line 26 */
		 v0 = this.mediaPlayer;
	 } // .end method
	 static android.media.MediaPlayer access$302 ( com.jumptap.adtag.media.JtVideoAdView p0, android.media.MediaPlayer p1 ) { //synthethic
		 /* .locals 0 */
		 /* .param p0, "x0" # Lcom/jumptap/adtag/media/JtVideoAdView; */
		 /* .param p1, "x1" # Landroid/media/MediaPlayer; */
		 /* .prologue */
		 /* .line 26 */
		 this.mediaPlayer = p1;
	 } // .end method
	 static Boolean access$400 ( com.jumptap.adtag.media.JtVideoAdView p0 ) { //synthethic
		 /* .locals 1 */
		 /* .param p0, "x0" # Lcom/jumptap/adtag/media/JtVideoAdView; */
		 /* .prologue */
		 /* .line 26 */
		 /* iget-boolean v0, p0, Lcom/jumptap/adtag/media/JtVideoAdView;->isPrepared:Z */
	 } // .end method
	 static Boolean access$402 ( com.jumptap.adtag.media.JtVideoAdView p0, Boolean p1 ) { //synthethic
		 /* .locals 0 */
		 /* .param p0, "x0" # Lcom/jumptap/adtag/media/JtVideoAdView; */
		 /* .param p1, "x1" # Z */
		 /* .prologue */
		 /* .line 26 */
		 /* iput-boolean p1, p0, Lcom/jumptap/adtag/media/JtVideoAdView;->isPrepared:Z */
	 } // .end method
	 static android.media.MediaPlayer$OnPreparedListener access$500 ( com.jumptap.adtag.media.JtVideoAdView p0 ) { //synthethic
		 /* .locals 1 */
		 /* .param p0, "x0" # Lcom/jumptap/adtag/media/JtVideoAdView; */
		 /* .prologue */
		 /* .line 26 */
		 v0 = this.onPreparedListener;
	 } // .end method
	 static Integer access$600 ( com.jumptap.adtag.media.JtVideoAdView p0 ) { //synthethic
		 /* .locals 1 */
		 /* .param p0, "x0" # Lcom/jumptap/adtag/media/JtVideoAdView; */
		 /* .prologue */
		 /* .line 26 */
		 /* iget v0, p0, Lcom/jumptap/adtag/media/JtVideoAdView;->videoWidth:I */
	 } // .end method
	 static Integer access$602 ( com.jumptap.adtag.media.JtVideoAdView p0, Integer p1 ) { //synthethic
		 /* .locals 0 */
		 /* .param p0, "x0" # Lcom/jumptap/adtag/media/JtVideoAdView; */
		 /* .param p1, "x1" # I */
		 /* .prologue */
		 /* .line 26 */
		 /* iput p1, p0, Lcom/jumptap/adtag/media/JtVideoAdView;->videoWidth:I */
	 } // .end method
	 static Integer access$700 ( com.jumptap.adtag.media.JtVideoAdView p0 ) { //synthethic
		 /* .locals 1 */
		 /* .param p0, "x0" # Lcom/jumptap/adtag/media/JtVideoAdView; */
		 /* .prologue */
		 /* .line 26 */
		 /* iget v0, p0, Lcom/jumptap/adtag/media/JtVideoAdView;->videoHeight:I */
	 } // .end method
	 static Integer access$702 ( com.jumptap.adtag.media.JtVideoAdView p0, Integer p1 ) { //synthethic
		 /* .locals 0 */
		 /* .param p0, "x0" # Lcom/jumptap/adtag/media/JtVideoAdView; */
		 /* .param p1, "x1" # I */
		 /* .prologue */
		 /* .line 26 */
		 /* iput p1, p0, Lcom/jumptap/adtag/media/JtVideoAdView;->videoHeight:I */
	 } // .end method
	 static Integer access$800 ( com.jumptap.adtag.media.JtVideoAdView p0 ) { //synthethic
		 /* .locals 1 */
		 /* .param p0, "x0" # Lcom/jumptap/adtag/media/JtVideoAdView; */
		 /* .prologue */
		 /* .line 26 */
		 /* iget v0, p0, Lcom/jumptap/adtag/media/JtVideoAdView;->seekWhenPrepared:I */
	 } // .end method
	 static android.view.SurfaceHolder access$902 ( com.jumptap.adtag.media.JtVideoAdView p0, android.view.SurfaceHolder p1 ) { //synthethic
		 /* .locals 0 */
		 /* .param p0, "x0" # Lcom/jumptap/adtag/media/JtVideoAdView; */
		 /* .param p1, "x1" # Landroid/view/SurfaceHolder; */
		 /* .prologue */
		 /* .line 26 */
		 this.surfaceHolder = p1;
	 } // .end method
	 private void attachMediaController ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 144 */
		 v0 = this.mediaPlayer;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.mediaController;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 145 */
				 v0 = this.mediaController;
				 (( android.widget.MediaController ) v0 ).setAnchorView ( p0 ); // invoke-virtual {v0, p0}, Landroid/widget/MediaController;->setAnchorView(Landroid/view/View;)V
				 /* .line 146 */
				 v0 = this.mediaController;
				 (( android.widget.MediaController ) v0 ).setMediaPlayer ( p0 ); // invoke-virtual {v0, p0}, Landroid/widget/MediaController;->setMediaPlayer(Landroid/widget/MediaController$MediaPlayerControl;)V
				 /* .line 147 */
				 v0 = this.mediaController;
				 int v1 = 1; // const/4 v1, 0x1
				 (( android.widget.MediaController ) v0 ).setEnabled ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/MediaController;->setEnabled(Z)V
				 /* .line 149 */
			 } // :cond_0
			 return;
		 } // .end method
		 public static com.jumptap.adtag.media.JtVideoAdView getInstance ( android.content.Context p0 ) {
			 /* .locals 1 */
			 /* .param p0, "context" # Landroid/content/Context; */
			 /* .prologue */
			 /* .line 60 */
			 v0 = com.jumptap.adtag.media.JtVideoAdView.videoViewInstance;
			 /* if-nez v0, :cond_0 */
			 /* .line 61 */
			 /* new-instance v0, Lcom/jumptap/adtag/media/JtVideoAdView; */
			 /* invoke-direct {v0, p0}, Lcom/jumptap/adtag/media/JtVideoAdView;-><init>(Landroid/content/Context;)V */
			 /* .line 64 */
		 } // :cond_0
		 v0 = com.jumptap.adtag.media.JtVideoAdView.videoViewInstance;
	 } // .end method
	 private void initVideoView ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 int v2 = 1; // const/4 v2, 0x1
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 68 */
		 /* iput v0, p0, Lcom/jumptap/adtag/media/JtVideoAdView;->videoWidth:I */
		 /* .line 69 */
		 /* iput v0, p0, Lcom/jumptap/adtag/media/JtVideoAdView;->videoHeight:I */
		 /* .line 71 */
		 (( com.jumptap.adtag.media.JtVideoAdView ) p0 ).getHolder ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/media/JtVideoAdView;->getHolder()Landroid/view/SurfaceHolder;
		 v1 = this.shCallback;
		 /* .line 72 */
		 (( com.jumptap.adtag.media.JtVideoAdView ) p0 ).getHolder ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/media/JtVideoAdView;->getHolder()Landroid/view/SurfaceHolder;
		 int v1 = 3; // const/4 v1, 0x3
		 /* .line 73 */
		 (( com.jumptap.adtag.media.JtVideoAdView ) p0 ).setFocusable ( v2 ); // invoke-virtual {p0, v2}, Lcom/jumptap/adtag/media/JtVideoAdView;->setFocusable(Z)V
		 /* .line 74 */
		 (( com.jumptap.adtag.media.JtVideoAdView ) p0 ).setFocusableInTouchMode ( v2 ); // invoke-virtual {p0, v2}, Lcom/jumptap/adtag/media/JtVideoAdView;->setFocusableInTouchMode(Z)V
		 /* .line 75 */
		 (( com.jumptap.adtag.media.JtVideoAdView ) p0 ).requestFocus ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/media/JtVideoAdView;->requestFocus()Z
		 /* .line 76 */
		 return;
	 } // .end method
	 private void openVideo ( ) {
		 /* .locals 5 */
		 /* .prologue */
		 /* .line 105 */
		 v2 = this.uri;
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 v2 = this.surfaceHolder;
			 /* if-nez v2, :cond_1 */
			 /* .line 106 */
		 } // :cond_0
		 final String v2 = "ZL"; // const-string v2, "ZL"
		 final String v3 = "XXXXXXXXXXXXXXXXXXXXXX"; // const-string v3, "XXXXXXXXXXXXXXXXXXXXXX"
		 android.util.Log .d ( v2,v3 );
		 /* .line 141 */
	 } // :goto_0
	 return;
	 /* .line 109 */
} // :cond_1
final String v2 = "ZL"; // const-string v2, "ZL"
final String v3 = "YYYYYYYYYYYYYYYYY"; // const-string v3, "YYYYYYYYYYYYYYYYY"
android.util.Log .d ( v2,v3 );
/* .line 111 */
/* new-instance v1, Landroid/content/Intent; */
final String v2 = "com.android.music.musicservicecommand"; // const-string v2, "com.android.music.musicservicecommand"
/* invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 112 */
/* .local v1, "i":Landroid/content/Intent; */
final String v2 = "command"; // const-string v2, "command"
final String v3 = "pause"; // const-string v3, "pause"
(( android.content.Intent ) v1 ).putExtra ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 113 */
v2 = this.context;
(( android.content.Context ) v2 ).sendBroadcast ( v1 ); // invoke-virtual {v2, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
/* .line 115 */
v2 = this.mediaPlayer;
if ( v2 != null) { // if-eqz v2, :cond_2
	 /* .line 117 */
	 v2 = this.mediaPlayer;
	 (( android.media.MediaPlayer ) v2 ).reset ( ); // invoke-virtual {v2}, Landroid/media/MediaPlayer;->reset()V
	 /* .line 118 */
	 v2 = this.mediaPlayer;
	 (( android.media.MediaPlayer ) v2 ).release ( ); // invoke-virtual {v2}, Landroid/media/MediaPlayer;->release()V
	 /* .line 119 */
	 int v2 = 0; // const/4 v2, 0x0
	 this.mediaPlayer = v2;
	 /* .line 122 */
} // :cond_2
try { // :try_start_0
	 /* new-instance v2, Landroid/media/MediaPlayer; */
	 /* invoke-direct {v2}, Landroid/media/MediaPlayer;-><init>()V */
	 this.mediaPlayer = v2;
	 /* .line 123 */
	 v2 = this.mediaPlayer;
	 v3 = this.preparedListener;
	 (( android.media.MediaPlayer ) v2 ).setOnPreparedListener ( v3 ); // invoke-virtual {v2, v3}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V
	 /* .line 124 */
	 int v2 = 0; // const/4 v2, 0x0
	 /* iput-boolean v2, p0, Lcom/jumptap/adtag/media/JtVideoAdView;->isPrepared:Z */
	 /* .line 125 */
	 v2 = this.mediaPlayer;
	 v3 = this.completionListener;
	 (( android.media.MediaPlayer ) v2 ).setOnCompletionListener ( v3 ); // invoke-virtual {v2, v3}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V
	 /* .line 126 */
	 v2 = this.mediaPlayer;
	 v3 = this.bufferingUpdateListener;
	 (( android.media.MediaPlayer ) v2 ).setOnBufferingUpdateListener ( v3 ); // invoke-virtual {v2, v3}, Landroid/media/MediaPlayer;->setOnBufferingUpdateListener(Landroid/media/MediaPlayer$OnBufferingUpdateListener;)V
	 /* .line 127 */
	 int v2 = 0; // const/4 v2, 0x0
	 /* iput v2, p0, Lcom/jumptap/adtag/media/JtVideoAdView;->currentBufferPercentage:I */
	 /* .line 128 */
	 v2 = this.mediaPlayer;
	 v3 = this.context;
	 v4 = this.uri;
	 (( android.media.MediaPlayer ) v2 ).setDataSource ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/media/MediaPlayer;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V
	 /* .line 129 */
	 v2 = this.mediaPlayer;
	 v3 = this.surfaceHolder;
	 (( android.media.MediaPlayer ) v2 ).setDisplay ( v3 ); // invoke-virtual {v2, v3}, Landroid/media/MediaPlayer;->setDisplay(Landroid/view/SurfaceHolder;)V
	 /* .line 130 */
	 v2 = this.mediaPlayer;
	 int v3 = 3; // const/4 v3, 0x3
	 (( android.media.MediaPlayer ) v2 ).setAudioStreamType ( v3 ); // invoke-virtual {v2, v3}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V
	 /* .line 131 */
	 v2 = this.mediaPlayer;
	 int v3 = 1; // const/4 v3, 0x1
	 (( android.media.MediaPlayer ) v2 ).setScreenOnWhilePlaying ( v3 ); // invoke-virtual {v2, v3}, Landroid/media/MediaPlayer;->setScreenOnWhilePlaying(Z)V
	 /* .line 132 */
	 v2 = this.mediaPlayer;
	 (( android.media.MediaPlayer ) v2 ).prepareAsync ( ); // invoke-virtual {v2}, Landroid/media/MediaPlayer;->prepareAsync()V
	 /* .line 133 */
	 /* invoke-direct {p0}, Lcom/jumptap/adtag/media/JtVideoAdView;->attachMediaController()V */
	 /* :try_end_0 */
	 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_1 */
	 /* .line 134 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* .line 135 */
	 /* .local v0, "ex":Ljava/io/IOException; */
	 final String v2 = "JtAd"; // const-string v2, "JtAd"
	 /* new-instance v3, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v4 = "Unable to open content: "; // const-string v4, "Unable to open content: "
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v4 = this.uri;
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .w ( v2,v3,v0 );
	 /* goto/16 :goto_0 */
	 /* .line 137 */
} // .end local v0 # "ex":Ljava/io/IOException;
/* :catch_1 */
/* move-exception v0 */
/* .line 138 */
/* .local v0, "ex":Ljava/lang/IllegalArgumentException; */
final String v2 = "JtAd"; // const-string v2, "JtAd"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Unable to open content: "; // const-string v4, "Unable to open content: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.uri;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v2,v3,v0 );
/* goto/16 :goto_0 */
} // .end method
private void setVideoPath ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 93 */
android.net.Uri .parse ( p1 );
/* invoke-direct {p0, v0}, Lcom/jumptap/adtag/media/JtVideoAdView;->setVideoURI(Landroid/net/Uri;)V */
/* .line 94 */
return;
} // .end method
private void setVideoURI ( android.net.Uri p0 ) {
/* .locals 1 */
/* .param p1, "uri" # Landroid/net/Uri; */
/* .prologue */
/* .line 97 */
this.uri = p1;
/* .line 98 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/jumptap/adtag/media/JtVideoAdView;->seekWhenPrepared:I */
/* .line 99 */
/* invoke-direct {p0}, Lcom/jumptap/adtag/media/JtVideoAdView;->openVideo()V */
/* .line 100 */
(( com.jumptap.adtag.media.JtVideoAdView ) p0 ).requestLayout ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/media/JtVideoAdView;->requestLayout()V
/* .line 101 */
(( com.jumptap.adtag.media.JtVideoAdView ) p0 ).invalidate ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/media/JtVideoAdView;->invalidate()V
/* .line 102 */
return;
} // .end method
private void toggleMediaControlsVisiblity ( ) {
/* .locals 1 */
/* .prologue */
/* .line 242 */
v0 = this.mediaController;
v0 = (( android.widget.MediaController ) v0 ).isShowing ( ); // invoke-virtual {v0}, Landroid/widget/MediaController;->isShowing()Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 243 */
	 v0 = this.mediaController;
	 (( android.widget.MediaController ) v0 ).hide ( ); // invoke-virtual {v0}, Landroid/widget/MediaController;->hide()V
	 /* .line 247 */
} // :goto_0
return;
/* .line 245 */
} // :cond_0
v0 = this.mediaController;
(( android.widget.MediaController ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/MediaController;->show()V
} // .end method
/* # virtual methods */
public Boolean canPause ( ) {
/* .locals 1 */
/* .prologue */
/* .line 402 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean canSeekBackward ( ) {
/* .locals 1 */
/* .prologue */
/* .line 406 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean canSeekForward ( ) {
/* .locals 1 */
/* .prologue */
/* .line 410 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Integer getBufferPercentage ( ) {
/* .locals 1 */
/* .prologue */
/* .line 395 */
v0 = this.mediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 396 */
/* iget v0, p0, Lcom/jumptap/adtag/media/JtVideoAdView;->currentBufferPercentage:I */
/* .line 398 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer getCurrentPosition ( ) {
/* .locals 1 */
/* .prologue */
/* .line 368 */
v0 = this.mediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lcom/jumptap/adtag/media/JtVideoAdView;->isPrepared:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 369 */
v0 = this.mediaPlayer;
v0 = (( android.media.MediaPlayer ) v0 ).getCurrentPosition ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I
/* .line 371 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer getDuration ( ) {
/* .locals 4 */
/* .prologue */
/* .line 356 */
int v0 = -1; // const/4 v0, -0x1
/* .line 357 */
/* .local v0, "duration":I */
v2 = this.mediaPlayer;
if ( v2 != null) { // if-eqz v2, :cond_0
/* iget-boolean v2, p0, Lcom/jumptap/adtag/media/JtVideoAdView;->isPrepared:Z */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 359 */
try { // :try_start_0
	 v2 = this.mediaPlayer;
	 (( android.media.MediaPlayer ) v2 ).getDuration ( ); // invoke-virtual {v2}, Landroid/media/MediaPlayer;->getDuration()I
	 /* :try_end_0 */
	 v0 = 	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 364 */
} // :cond_0
} // :goto_0
/* .line 360 */
/* :catch_0 */
/* move-exception v1 */
/* .line 361 */
/* .local v1, "e":Ljava/lang/Exception; */
final String v2 = "JtAd"; // const-string v2, "JtAd"
final String v3 = "Problem in getDuration"; // const-string v3, "Problem in getDuration"
android.util.Log .e ( v2,v3,v1 );
} // .end method
public Boolean isPlaying ( ) {
/* .locals 1 */
/* .prologue */
/* .line 383 */
v0 = this.mediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lcom/jumptap/adtag/media/JtVideoAdView;->isPrepared:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 385 */
	 v0 = this.mediaPlayer;
	 v0 = 	 (( android.media.MediaPlayer ) v0 ).isPlaying ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
	 /* .line 387 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isReady ( ) {
/* .locals 1 */
/* .prologue */
/* .line 391 */
v0 = this.mediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lcom/jumptap/adtag/media/JtVideoAdView;->isPrepared:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 1 */
/* .param p1, "keyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
/* .line 252 */
/* iget-boolean v0, p0, Lcom/jumptap/adtag/media/JtVideoAdView;->isPrepared:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
int v0 = 4; // const/4 v0, 0x4
/* if-eq p1, v0, :cond_2 */
/* const/16 v0, 0x18 */
/* if-eq p1, v0, :cond_2 */
/* const/16 v0, 0x19 */
/* if-eq p1, v0, :cond_2 */
/* const/16 v0, 0x52 */
/* if-eq p1, v0, :cond_2 */
int v0 = 5; // const/4 v0, 0x5
/* if-eq p1, v0, :cond_2 */
int v0 = 6; // const/4 v0, 0x6
/* if-eq p1, v0, :cond_2 */
v0 = this.mediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_2
	 v0 = this.mediaController;
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* .line 261 */
		 /* const/16 v0, 0x4f */
		 /* if-ne p1, v0, :cond_1 */
		 /* .line 262 */
		 v0 = this.mediaPlayer;
		 v0 = 		 (( android.media.MediaPlayer ) v0 ).isPlaying ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 263 */
			 (( com.jumptap.adtag.media.JtVideoAdView ) p0 ).pause ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/media/JtVideoAdView;->pause()V
			 /* .line 264 */
			 v0 = this.mediaController;
			 (( android.widget.MediaController ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/MediaController;->show()V
			 /* .line 269 */
		 } // :goto_0
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 275 */
	 } // :goto_1
	 /* .line 266 */
} // :cond_0
(( com.jumptap.adtag.media.JtVideoAdView ) p0 ).start ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/media/JtVideoAdView;->start()V
/* .line 267 */
v0 = this.mediaController;
(( android.widget.MediaController ) v0 ).hide ( ); // invoke-virtual {v0}, Landroid/widget/MediaController;->hide()V
/* .line 271 */
} // :cond_1
/* invoke-direct {p0}, Lcom/jumptap/adtag/media/JtVideoAdView;->toggleMediaControlsVisiblity()V */
/* .line 275 */
} // :cond_2
v0 = /* invoke-super {p0, p1, p2}, Landroid/view/SurfaceView;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 1 */
/* .param p1, "ev" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 218 */
/* iget-boolean v0, p0, Lcom/jumptap/adtag/media/JtVideoAdView;->isPrepared:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 219 */
v0 = this.mediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.mediaController;
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 220 */
	 /* invoke-direct {p0}, Lcom/jumptap/adtag/media/JtVideoAdView;->toggleMediaControlsVisiblity()V */
	 /* .line 230 */
} // :cond_0
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
/* .line 222 */
} // :cond_1
v0 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
/* if-nez v0, :cond_0 */
/* .line 223 */
v0 = this.mediaPlayer;
v0 = (( android.media.MediaPlayer ) v0 ).isPlaying ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 224 */
(( com.jumptap.adtag.media.JtVideoAdView ) p0 ).pause ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/media/JtVideoAdView;->pause()V
/* .line 226 */
} // :cond_2
(( com.jumptap.adtag.media.JtVideoAdView ) p0 ).start ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/media/JtVideoAdView;->start()V
} // .end method
public Boolean onTrackballEvent ( android.view.MotionEvent p0 ) {
/* .locals 1 */
/* .param p1, "ev" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 235 */
/* iget-boolean v0, p0, Lcom/jumptap/adtag/media/JtVideoAdView;->isPrepared:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mediaController;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 236 */
	 /* invoke-direct {p0}, Lcom/jumptap/adtag/media/JtVideoAdView;->toggleMediaControlsVisiblity()V */
	 /* .line 238 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void pause ( ) {
/* .locals 1 */
/* .prologue */
/* .line 348 */
v0 = this.mediaPlayer;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* iget-boolean v0, p0, Lcom/jumptap/adtag/media/JtVideoAdView;->isPrepared:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 349 */
		 v0 = this.mediaPlayer;
		 v0 = 		 (( android.media.MediaPlayer ) v0 ).isPlaying ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 350 */
			 v0 = this.mediaPlayer;
			 (( android.media.MediaPlayer ) v0 ).pause ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
			 /* .line 353 */
		 } // :cond_0
		 return;
	 } // .end method
	 public void prepare ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "path" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 87 */
		 /* invoke-direct {p0, p1}, Lcom/jumptap/adtag/media/JtVideoAdView;->setVideoPath(Ljava/lang/String;)V */
		 /* .line 88 */
		 (( com.jumptap.adtag.media.JtVideoAdView ) p0 ).requestFocus ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/media/JtVideoAdView;->requestFocus()Z
		 /* .line 90 */
		 return;
	 } // .end method
	 public void seekTo ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p1, "msec" # I */
		 /* .prologue */
		 /* .line 375 */
		 v0 = this.mediaPlayer;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* iget-boolean v0, p0, Lcom/jumptap/adtag/media/JtVideoAdView;->isPrepared:Z */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 376 */
				 v0 = this.mediaPlayer;
				 (( android.media.MediaPlayer ) v0 ).seekTo ( p1 ); // invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->seekTo(I)V
				 /* .line 380 */
			 } // :goto_0
			 return;
			 /* .line 378 */
		 } // :cond_0
		 /* iput p1, p0, Lcom/jumptap/adtag/media/JtVideoAdView;->seekWhenPrepared:I */
	 } // .end method
	 public void setMediaController ( android.widget.MediaController p0 ) {
		 /* .locals 1 */
		 /* .param p1, "controller" # Landroid/widget/MediaController; */
		 /* .prologue */
		 /* .line 79 */
		 v0 = this.mediaController;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 80 */
			 v0 = this.mediaController;
			 (( android.widget.MediaController ) v0 ).hide ( ); // invoke-virtual {v0}, Landroid/widget/MediaController;->hide()V
			 /* .line 82 */
		 } // :cond_0
		 this.mediaController = p1;
		 /* .line 83 */
		 /* invoke-direct {p0}, Lcom/jumptap/adtag/media/JtVideoAdView;->attachMediaController()V */
		 /* .line 84 */
		 return;
	 } // .end method
	 public void start ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 320 */
		 final String v0 = "ZL"; // const-string v0, "ZL"
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "start mediaPlayer="; // const-string v2, "start mediaPlayer="
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v2 = this.mediaPlayer;
		 (( java.lang.Object ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v2 = " isPrepared"; // const-string v2, " isPrepared"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget-boolean v2, p0, Lcom/jumptap/adtag/media/JtVideoAdView;->isPrepared:Z */
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .d ( v0,v1 );
		 /* .line 321 */
		 v0 = this.mediaPlayer;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* iget-boolean v0, p0, Lcom/jumptap/adtag/media/JtVideoAdView;->isPrepared:Z */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 322 */
				 v0 = this.mediaPlayer;
				 (( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
				 /* .line 325 */
			 } // :cond_0
			 return;
		 } // .end method

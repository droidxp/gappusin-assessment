public class com.jumptap.adtag.media.JTMediaPlayer implements android.media.MediaPlayer$OnBufferingUpdateListener implements android.media.MediaPlayer$OnCompletionListener implements android.media.MediaPlayer$OnPreparedListener implements android.view.SurfaceHolder$Callback implements android.view.View$OnTouchListener implements android.media.MediaPlayer$OnErrorListener {
	 /* .source "JTMediaPlayer.java" */
	 /* # interfaces */
	 /* # static fields */
	 private static com.jumptap.adtag.media.JTMediaPlayer jtMediaPlayer;
	 /* # instance fields */
	 private android.view.SurfaceHolder holder;
	 private Boolean isPrepared;
	 private Integer mVideoHeight;
	 private Integer mVideoWidth;
	 private android.media.MediaPlayer mediaPlayer;
	 private android.media.MediaPlayer$OnCompletionListener onCompletionListener;
	 /* # direct methods */
	 static com.jumptap.adtag.media.JTMediaPlayer ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 31 */
		 int v0 = 0; // const/4 v0, 0x0
		 return;
	 } // .end method
	 private com.jumptap.adtag.media.JTMediaPlayer ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 44 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 29 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/jumptap/adtag/media/JTMediaPlayer;->isPrepared:Z */
		 /* .line 45 */
		 return;
	 } // .end method
	 public static com.jumptap.adtag.media.JTMediaPlayer getInstance ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 52 */
		 v0 = com.jumptap.adtag.media.JTMediaPlayer.jtMediaPlayer;
		 /* if-nez v0, :cond_0 */
		 /* .line 53 */
		 /* new-instance v0, Lcom/jumptap/adtag/media/JTMediaPlayer; */
		 /* invoke-direct {v0}, Lcom/jumptap/adtag/media/JTMediaPlayer;-><init>()V */
		 /* .line 55 */
	 } // :cond_0
	 v0 = com.jumptap.adtag.media.JTMediaPlayer.jtMediaPlayer;
} // .end method
/* # virtual methods */
public Integer getCurrentPosition ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 100 */
	 v0 = this.mediaPlayer;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* iget-boolean v0, p0, Lcom/jumptap/adtag/media/JTMediaPlayer;->isPrepared:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 101 */
			 v0 = this.mediaPlayer;
			 v0 = 			 (( android.media.MediaPlayer ) v0 ).getCurrentPosition ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I
			 /* .line 103 */
		 } // :goto_0
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer getDuration ( ) {
	 /* .locals 4 */
	 /* .prologue */
	 /* .line 107 */
	 int v0 = -1; // const/4 v0, -0x1
	 /* .line 108 */
	 /* .local v0, "duration":I */
	 v2 = this.mediaPlayer;
	 if ( v2 != null) { // if-eqz v2, :cond_0
		 /* iget-boolean v2, p0, Lcom/jumptap/adtag/media/JTMediaPlayer;->isPrepared:Z */
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 /* .line 110 */
			 try { // :try_start_0
				 v2 = this.mediaPlayer;
				 (( android.media.MediaPlayer ) v2 ).getDuration ( ); // invoke-virtual {v2}, Landroid/media/MediaPlayer;->getDuration()I
				 /* :try_end_0 */
				 v0 = 				 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* .line 115 */
			 } // :cond_0
		 } // :goto_0
		 /* .line 111 */
		 /* :catch_0 */
		 /* move-exception v1 */
		 /* .line 112 */
		 /* .local v1, "e":Ljava/lang/Exception; */
		 final String v2 = "JtAd"; // const-string v2, "JtAd"
		 final String v3 = "Problem in getDuration"; // const-string v3, "Problem in getDuration"
		 android.util.Log .e ( v2,v3,v1 );
	 } // .end method
	 public Boolean isReady ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 63 */
		 /* iget-boolean v0, p0, Lcom/jumptap/adtag/media/JTMediaPlayer;->isPrepared:Z */
	 } // .end method
	 public void onBufferingUpdate ( android.media.MediaPlayer p0, Integer p1 ) {
		 /* .locals 3 */
		 /* .param p1, "arg0" # Landroid/media/MediaPlayer; */
		 /* .param p2, "percent" # I */
		 /* .prologue */
		 /* .line 168 */
		 final String v0 = "JtAd"; // const-string v0, "JtAd"
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "onBufferingUpdate percent:"; // const-string v2, "onBufferingUpdate percent:"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .d ( v0,v1 );
		 /* .line 169 */
		 return;
	 } // .end method
	 public void onCompletion ( android.media.MediaPlayer p0 ) {
		 /* .locals 2 */
		 /* .param p1, "mp" # Landroid/media/MediaPlayer; */
		 /* .prologue */
		 /* .line 172 */
		 final String v0 = "JtAd"; // const-string v0, "JtAd"
		 final String v1 = "onCompletion called"; // const-string v1, "onCompletion called"
		 android.util.Log .d ( v0,v1 );
		 /* .line 181 */
		 v0 = this.onCompletionListener;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 182 */
			 v0 = this.onCompletionListener;
			 v1 = this.mediaPlayer;
			 /* .line 187 */
		 } // :cond_0
		 return;
	 } // .end method
	 public Boolean onError ( android.media.MediaPlayer p0, Integer p1, Integer p2 ) {
		 /* .locals 3 */
		 /* .param p1, "mp" # Landroid/media/MediaPlayer; */
		 /* .param p2, "what" # I */
		 /* .param p3, "extra" # I */
		 /* .prologue */
		 /* .line 210 */
		 final String v0 = "ZL"; // const-string v0, "ZL"
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "Error in playing video type="; // const-string v2, "Error in playing video type="
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v2 = " extra="; // const-string v2, " extra="
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .e ( v0,v1 );
		 /* .line 211 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public void onPrepared ( android.media.MediaPlayer p0 ) {
		 /* .locals 2 */
		 /* .param p1, "mediaplayer" # Landroid/media/MediaPlayer; */
		 /* .prologue */
		 /* .line 190 */
		 final String v0 = "JtAd"; // const-string v0, "JtAd"
		 final String v1 = "onPrepared called"; // const-string v1, "onPrepared called"
		 android.util.Log .d ( v0,v1 );
		 /* .line 191 */
		 v0 = this.mediaPlayer;
		 v0 = 		 (( android.media.MediaPlayer ) v0 ).getVideoWidth ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->getVideoWidth()I
		 /* iput v0, p0, Lcom/jumptap/adtag/media/JTMediaPlayer;->mVideoWidth:I */
		 /* .line 192 */
		 v0 = this.mediaPlayer;
		 v0 = 		 (( android.media.MediaPlayer ) v0 ).getVideoHeight ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->getVideoHeight()I
		 /* iput v0, p0, Lcom/jumptap/adtag/media/JTMediaPlayer;->mVideoHeight:I */
		 /* .line 193 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lcom/jumptap/adtag/media/JTMediaPlayer;->isPrepared:Z */
		 /* .line 194 */
		 return;
	 } // .end method
	 public Boolean onTouch ( android.view.View p0, android.view.MotionEvent p1 ) {
		 /* .locals 1 */
		 /* .param p1, "v" # Landroid/view/View; */
		 /* .param p2, "event" # Landroid/view/MotionEvent; */
		 /* .prologue */
		 /* .line 197 */
		 /* iget-boolean v0, p0, Lcom/jumptap/adtag/media/JTMediaPlayer;->isPrepared:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 198 */
			 v0 = 			 (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
			 /* if-nez v0, :cond_0 */
			 /* .line 199 */
			 v0 = this.mediaPlayer;
			 v0 = 			 (( android.media.MediaPlayer ) v0 ).isPlaying ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
			 if ( v0 != null) { // if-eqz v0, :cond_1
				 /* .line 200 */
				 (( com.jumptap.adtag.media.JTMediaPlayer ) p0 ).pause ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/media/JTMediaPlayer;->pause()V
				 /* .line 206 */
			 } // :cond_0
		 } // :goto_0
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 202 */
	 } // :cond_1
	 (( com.jumptap.adtag.media.JTMediaPlayer ) p0 ).play ( ); // invoke-virtual {p0}, Lcom/jumptap/adtag/media/JTMediaPlayer;->play()V
} // .end method
public void pause ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 119 */
	 v0 = this.mediaPlayer;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* iget-boolean v0, p0, Lcom/jumptap/adtag/media/JTMediaPlayer;->isPrepared:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 120 */
			 v0 = this.mediaPlayer;
			 v0 = 			 (( android.media.MediaPlayer ) v0 ).isPlaying ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 121 */
				 v0 = this.mediaPlayer;
				 (( android.media.MediaPlayer ) v0 ).pause ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
				 /* .line 124 */
			 } // :cond_0
			 return;
		 } // .end method
		 public void play ( ) {
			 /* .locals 1 */
			 /* .prologue */
			 /* .line 127 */
			 v0 = this.mediaPlayer;
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* iget-boolean v0, p0, Lcom/jumptap/adtag/media/JTMediaPlayer;->isPrepared:Z */
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 /* .line 128 */
					 v0 = this.mediaPlayer;
					 (( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
					 /* .line 130 */
				 } // :cond_0
				 return;
			 } // .end method
			 public void prepareVideo ( java.io.FileDescriptor p0 ) {
				 /* .locals 4 */
				 /* .param p1, "fileDescriptor" # Ljava/io/FileDescriptor; */
				 /* .prologue */
				 /* .line 83 */
				 try { // :try_start_0
					 /* new-instance v1, Landroid/media/MediaPlayer; */
					 /* invoke-direct {v1}, Landroid/media/MediaPlayer;-><init>()V */
					 this.mediaPlayer = v1;
					 /* .line 85 */
					 v1 = this.mediaPlayer;
					 (( android.media.MediaPlayer ) v1 ).setDataSource ( p1 ); // invoke-virtual {v1, p1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;)V
					 /* .line 87 */
					 v1 = this.mediaPlayer;
					 int v2 = 1; // const/4 v2, 0x1
					 (( android.media.MediaPlayer ) v1 ).setScreenOnWhilePlaying ( v2 ); // invoke-virtual {v1, v2}, Landroid/media/MediaPlayer;->setScreenOnWhilePlaying(Z)V
					 /* .line 88 */
					 v1 = this.mediaPlayer;
					 (( android.media.MediaPlayer ) v1 ).prepare ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->prepare()V
					 /* .line 89 */
					 v1 = this.mediaPlayer;
					 (( android.media.MediaPlayer ) v1 ).setOnBufferingUpdateListener ( p0 ); // invoke-virtual {v1, p0}, Landroid/media/MediaPlayer;->setOnBufferingUpdateListener(Landroid/media/MediaPlayer$OnBufferingUpdateListener;)V
					 /* .line 90 */
					 v1 = this.mediaPlayer;
					 (( android.media.MediaPlayer ) v1 ).setOnCompletionListener ( p0 ); // invoke-virtual {v1, p0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V
					 /* .line 91 */
					 v1 = this.mediaPlayer;
					 (( android.media.MediaPlayer ) v1 ).setOnPreparedListener ( p0 ); // invoke-virtual {v1, p0}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V
					 /* .line 92 */
					 v1 = this.mediaPlayer;
					 int v2 = 3; // const/4 v2, 0x3
					 (( android.media.MediaPlayer ) v1 ).setAudioStreamType ( v2 ); // invoke-virtual {v1, v2}, Landroid/media/MediaPlayer;->setAudioStreamType(I)V
					 /* :try_end_0 */
					 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
					 /* .line 97 */
				 } // :goto_0
				 return;
				 /* .line 94 */
				 /* :catch_0 */
				 /* move-exception v0 */
				 /* .line 95 */
				 /* .local v0, "e":Ljava/lang/Exception; */
				 final String v1 = "JtAd"; // const-string v1, "JtAd"
				 /* new-instance v2, Ljava/lang/StringBuilder; */
				 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
				 final String v3 = "error: "; // const-string v3, "error: "
				 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.Exception ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
				 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 android.util.Log .e ( v1,v2,v0 );
			 } // .end method
			 public void release ( ) {
				 /* .locals 2 */
				 /* .prologue */
				 int v1 = 0; // const/4 v1, 0x0
				 /* .line 156 */
				 v0 = this.mediaPlayer;
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 /* .line 157 */
					 v0 = this.mediaPlayer;
					 (( android.media.MediaPlayer ) v0 ).reset ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V
					 /* .line 158 */
					 v0 = this.mediaPlayer;
					 (( android.media.MediaPlayer ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
					 /* .line 159 */
					 this.mediaPlayer = v1;
					 /* .line 162 */
				 } // :cond_0
				 int v0 = 0; // const/4 v0, 0x0
				 /* iput-boolean v0, p0, Lcom/jumptap/adtag/media/JTMediaPlayer;->isPrepared:Z */
				 /* .line 163 */
				 this.holder = v1;
				 /* .line 165 */
				 return;
			 } // .end method
			 public void setOnCompletionListener ( android.media.MediaPlayer$OnCompletionListener p0 ) {
				 /* .locals 0 */
				 /* .param p1, "completionListener" # Landroid/media/MediaPlayer$OnCompletionListener; */
				 /* .prologue */
				 /* .line 73 */
				 this.onCompletionListener = p1;
				 /* .line 74 */
				 return;
			 } // .end method
			 public void setVideoView ( android.widget.VideoView p0 ) {
				 /* .locals 3 */
				 /* .param p1, "videoView" # Landroid/widget/VideoView; */
				 /* .prologue */
				 int v2 = 1; // const/4 v2, 0x1
				 /* .line 139 */
				 (( android.widget.VideoView ) p1 ).getHolder ( ); // invoke-virtual {p1}, Landroid/widget/VideoView;->getHolder()Landroid/view/SurfaceHolder;
				 this.holder = v0;
				 /* .line 140 */
				 v0 = this.holder;
				 /* .line 141 */
				 v0 = this.holder;
				 int v1 = 3; // const/4 v1, 0x3
				 /* .line 143 */
				 (( android.widget.VideoView ) p1 ).setOnTouchListener ( p0 ); // invoke-virtual {p1, p0}, Landroid/widget/VideoView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
				 /* .line 144 */
				 (( android.widget.VideoView ) p1 ).setFocusable ( v2 ); // invoke-virtual {p1, v2}, Landroid/widget/VideoView;->setFocusable(Z)V
				 /* .line 145 */
				 (( android.widget.VideoView ) p1 ).setFocusableInTouchMode ( v2 ); // invoke-virtual {p1, v2}, Landroid/widget/VideoView;->setFocusableInTouchMode(Z)V
				 /* .line 153 */
				 return;
			 } // .end method
			 public void stop ( ) {
				 /* .locals 1 */
				 /* .prologue */
				 /* .line 133 */
				 v0 = this.mediaPlayer;
				 (( android.media.MediaPlayer ) v0 ).stop ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V
				 /* .line 134 */
				 int v0 = 0; // const/4 v0, 0x0
				 /* iput-boolean v0, p0, Lcom/jumptap/adtag/media/JTMediaPlayer;->isPrepared:Z */
				 /* .line 135 */
				 return;
			 } // .end method
			 public void surfaceChanged ( android.view.SurfaceHolder p0, Integer p1, Integer p2, Integer p3 ) {
				 /* .locals 2 */
				 /* .param p1, "holder" # Landroid/view/SurfaceHolder; */
				 /* .param p2, "format" # I */
				 /* .param p3, "width" # I */
				 /* .param p4, "height" # I */
				 /* .prologue */
				 /* .line 216 */
				 final String v0 = "JtAd"; // const-string v0, "JtAd"
				 final String v1 = "surfaceChanged called"; // const-string v1, "surfaceChanged called"
				 android.util.Log .d ( v0,v1 );
				 /* .line 217 */
				 return;
			 } // .end method
			 public void surfaceCreated ( android.view.SurfaceHolder p0 ) {
				 /* .locals 2 */
				 /* .param p1, "holder" # Landroid/view/SurfaceHolder; */
				 /* .prologue */
				 /* .line 220 */
				 final String v0 = "JtAd"; // const-string v0, "JtAd"
				 final String v1 = "surfaceCreated called"; // const-string v1, "surfaceCreated called"
				 android.util.Log .d ( v0,v1 );
				 /* .line 221 */
				 v0 = this.mediaPlayer;
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 /* iget-boolean v0, p0, Lcom/jumptap/adtag/media/JTMediaPlayer;->isPrepared:Z */
					 if ( v0 != null) { // if-eqz v0, :cond_0
						 /* .line 222 */
						 v0 = this.mediaPlayer;
						 (( android.media.MediaPlayer ) v0 ).setDisplay ( p1 ); // invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setDisplay(Landroid/view/SurfaceHolder;)V
						 /* .line 223 */
						 /* iget v0, p0, Lcom/jumptap/adtag/media/JTMediaPlayer;->mVideoWidth:I */
						 if ( v0 != null) { // if-eqz v0, :cond_0
							 /* iget v0, p0, Lcom/jumptap/adtag/media/JTMediaPlayer;->mVideoHeight:I */
							 if ( v0 != null) { // if-eqz v0, :cond_0
								 /* .line 225 */
								 v0 = this.mediaPlayer;
								 (( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
								 /* .line 230 */
							 } // :cond_0
							 return;
						 } // .end method
						 public void surfaceDestroyed ( android.view.SurfaceHolder p0 ) {
							 /* .locals 2 */
							 /* .param p1, "holder" # Landroid/view/SurfaceHolder; */
							 /* .prologue */
							 /* .line 233 */
							 final String v0 = "JtAd"; // const-string v0, "JtAd"
							 final String v1 = "surfaceDestroyed called"; // const-string v1, "surfaceDestroyed called"
							 android.util.Log .d ( v0,v1 );
							 /* .line 234 */
							 return;
						 } // .end method

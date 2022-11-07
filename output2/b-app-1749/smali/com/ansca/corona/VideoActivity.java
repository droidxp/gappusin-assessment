public class com.ansca.corona.VideoActivity extends android.app.Activity {
	 /* .source "VideoActivity.java" */
	 /* # instance fields */
	 private Integer myVideoId;
	 private android.widget.VideoView myVideoView;
	 /* # direct methods */
	 public com.ansca.corona.VideoActivity ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 13 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 return;
	 } // .end method
	 static Integer access$000 ( com.ansca.corona.VideoActivity p0 ) { //synthethic
		 /* .locals 1 */
		 /* .param p0, "x0" # Lcom/ansca/corona/VideoActivity; */
		 /* .prologue */
		 /* .line 13 */
		 /* iget v0, p0, Lcom/ansca/corona/VideoActivity;->myVideoId:I */
	 } // .end method
	 /* # virtual methods */
	 public void finish ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 65 */
		 /* invoke-super {p0}, Landroid/app/Activity;->finish()V */
		 /* .line 68 */
		 (( com.ansca.corona.VideoActivity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/ansca/corona/VideoActivity;->getIntent()Landroid/content/Intent;
		 v0 = 		 (( android.content.Intent ) v0 ).getFlags ( ); // invoke-virtual {v0}, Landroid/content/Intent;->getFlags()I
		 /* const/high16 v1, 0x10000 */
		 /* and-int/2addr v0, v1 */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 69 */
			 (( com.ansca.corona.VideoActivity ) p0 ).overridePendingTransition ( v2, v2 ); // invoke-virtual {p0, v2, v2}, Lcom/ansca/corona/VideoActivity;->overridePendingTransition(II)V
			 /* .line 71 */
		 } // :cond_0
		 return;
	 } // .end method
	 protected void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 5 */
		 /* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
		 /* .prologue */
		 int v3 = -1; // const/4 v3, -0x1
		 /* .line 27 */
		 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
		 /* .line 30 */
		 /* new-instance v0, Landroid/widget/FrameLayout; */
		 /* invoke-direct {v0, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V */
		 /* .line 31 */
		 /* .local v0, "layout":Landroid/widget/FrameLayout; */
		 (( com.ansca.corona.VideoActivity ) p0 ).setContentView ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/VideoActivity;->setContentView(Landroid/view/View;)V
		 /* .line 33 */
		 /* new-instance v1, Landroid/widget/FrameLayout$LayoutParams; */
		 /* const/16 v2, 0x11 */
		 /* invoke-direct {v1, v3, v3, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V */
		 /* .line 37 */
		 /* .local v1, "layoutParams":Landroid/widget/FrameLayout$LayoutParams; */
		 /* new-instance v2, Landroid/widget/VideoView; */
		 /* invoke-direct {v2, p0}, Landroid/widget/VideoView;-><init>(Landroid/content/Context;)V */
		 this.myVideoView = v2;
		 /* .line 38 */
		 v2 = this.myVideoView;
		 (( android.widget.FrameLayout ) v0 ).addView ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
		 /* .line 41 */
		 v2 = this.myVideoView;
		 /* new-instance v3, Lcom/ansca/corona/VideoActivity$1; */
		 /* invoke-direct {v3, p0}, Lcom/ansca/corona/VideoActivity$1;-><init>(Lcom/ansca/corona/VideoActivity;)V */
		 (( android.widget.VideoView ) v2 ).setOnCompletionListener ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/VideoView;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V
		 /* .line 50 */
		 (( com.ansca.corona.VideoActivity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/ansca/corona/VideoActivity;->getIntent()Landroid/content/Intent;
		 (( android.content.Intent ) v2 ).getExtras ( ); // invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
		 final String v3 = "media_controls_enabled"; // const-string v3, "media_controls_enabled"
		 v2 = 		 (( android.os.Bundle ) v2 ).getBoolean ( v3 ); // invoke-virtual {v2, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 /* .line 51 */
			 v2 = this.myVideoView;
			 /* new-instance v3, Landroid/widget/MediaController; */
			 /* invoke-direct {v3, p0}, Landroid/widget/MediaController;-><init>(Landroid/content/Context;)V */
			 (( android.widget.VideoView ) v2 ).setMediaController ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/VideoView;->setMediaController(Landroid/widget/MediaController;)V
			 /* .line 53 */
		 } // :cond_0
		 v2 = this.myVideoView;
		 (( com.ansca.corona.VideoActivity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/ansca/corona/VideoActivity;->getIntent()Landroid/content/Intent;
		 (( android.content.Intent ) v3 ).getExtras ( ); // invoke-virtual {v3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
		 final String v4 = "video_uri"; // const-string v4, "video_uri"
		 (( android.os.Bundle ) v3 ).getString ( v4 ); // invoke-virtual {v3, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
		 android.net.Uri .parse ( v3 );
		 (( android.widget.VideoView ) v2 ).setVideoURI ( v3 ); // invoke-virtual {v2, v3}, Landroid/widget/VideoView;->setVideoURI(Landroid/net/Uri;)V
		 /* .line 54 */
		 (( com.ansca.corona.VideoActivity ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/ansca/corona/VideoActivity;->getIntent()Landroid/content/Intent;
		 (( android.content.Intent ) v2 ).getExtras ( ); // invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
		 final String v3 = "video_id"; // const-string v3, "video_id"
		 v2 = 		 (( android.os.Bundle ) v2 ).getInt ( v3 ); // invoke-virtual {v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
		 /* iput v2, p0, Lcom/ansca/corona/VideoActivity;->myVideoId:I */
		 /* .line 55 */
		 v2 = this.myVideoView;
		 (( android.widget.VideoView ) v2 ).start ( ); // invoke-virtual {v2}, Landroid/widget/VideoView;->start()V
		 /* .line 56 */
		 return;
	 } // .end method

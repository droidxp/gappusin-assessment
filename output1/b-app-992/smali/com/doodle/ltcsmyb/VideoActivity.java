public class com.doodle.ltcsmyb.VideoActivity extends android.app.Activity {
	 /* # instance fields */
	 private android.widget.VideoView a;
	 /* # direct methods */
	 public com.doodle.ltcsmyb.VideoActivity ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 return;
	 } // .end method
	 static void a ( com.doodle.ltcsmyb.VideoActivity p0 ) { //synthethic
		 /* .locals 1 */
		 int v0 = -1; // const/4 v0, -0x1
		 (( com.doodle.ltcsmyb.VideoActivity ) p0 ).setResult ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/VideoActivity;->setResult(I)V
		 (( com.doodle.ltcsmyb.VideoActivity ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/doodle/ltcsmyb/VideoActivity;->finish()V
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 2 */
		 int v0 = 3; // const/4 v0, 0x3
		 (( com.doodle.ltcsmyb.VideoActivity ) p0 ).setVolumeControlStream ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/VideoActivity;->setVolumeControlStream(I)V
		 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
		 /* const v0, 0x7f030024 */
		 (( com.doodle.ltcsmyb.VideoActivity ) p0 ).setContentView ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/VideoActivity;->setContentView(I)V
		 int v0 = 1; // const/4 v0, 0x1
		 com.doodle.ltcsmyb.a.a.a = (v0!= 0);
		 /* const v0, 0x7f090068 */
		 (( com.doodle.ltcsmyb.VideoActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodle/ltcsmyb/VideoActivity;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/VideoView; */
		 this.a = v0;
		 final String v0 = "android.resource://com.doodle.cheesetower/raw/story"; // const-string v0, "android.resource://com.doodle.cheesetower/raw/story"
		 android.net.Uri .parse ( v0 );
		 v1 = this.a;
		 (( android.widget.VideoView ) v1 ).setVideoURI ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/VideoView;->setVideoURI(Landroid/net/Uri;)V
		 v0 = this.a;
		 /* new-instance v1, Lcom/doodle/ltcsmyb/k; */
		 /* invoke-direct {v1, p0}, Lcom/doodle/ltcsmyb/k;-><init>(Lcom/doodle/ltcsmyb/VideoActivity;)V */
		 (( android.widget.VideoView ) v0 ).setOnTouchListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
		 v0 = this.a;
		 /* new-instance v1, Lcom/doodle/ltcsmyb/l; */
		 /* invoke-direct {v1, p0}, Lcom/doodle/ltcsmyb/l;-><init>(Lcom/doodle/ltcsmyb/VideoActivity;)V */
		 (( android.widget.VideoView ) v0 ).setOnCompletionListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/VideoView;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V
		 v0 = this.a;
		 (( android.widget.VideoView ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/widget/VideoView;->start()V
		 return;
	 } // .end method

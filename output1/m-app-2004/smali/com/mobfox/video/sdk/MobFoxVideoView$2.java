class com.mobfox.video.sdk.MobFoxVideoView$2 implements android.media.MediaPlayer$OnPreparedListener {
	 /* .source "MobFoxVideoView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/mobfox/video/sdk/MobFoxVideoView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.video.sdk.MobFoxVideoView this$0; //synthetic
/* # direct methods */
 com.mobfox.video.sdk.MobFoxVideoView$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 276 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onPrepared ( android.media.MediaPlayer p0 ) {
/* .locals 4 */
/* .param p1, "mp" # Landroid/media/MediaPlayer; */
/* .prologue */
int v3 = 3; // const/4 v3, 0x3
/* .line 278 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
v1 = android.util.Log .isLoggable ( v1,v3 );
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 279 */
	 final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
	 final String v2 = "MobFoxVideoView onPrepared"; // const-string v2, "MobFoxVideoView onPrepared"
	 android.util.Log .d ( v1,v2 );
	 /* .line 281 */
} // :cond_0
v1 = this.this$0;
int v2 = 2; // const/4 v2, 0x2
com.mobfox.video.sdk.MobFoxVideoView .access$1 ( v1,v2 );
/* .line 283 */
v1 = this.this$0;
com.mobfox.video.sdk.MobFoxVideoView .access$2 ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* .line 284 */
	 v1 = this.this$0;
	 com.mobfox.video.sdk.MobFoxVideoView .access$2 ( v1 );
	 v2 = this.this$0;
	 com.mobfox.video.sdk.MobFoxVideoView .access$3 ( v2 );
	 /* .line 286 */
} // :cond_1
v1 = this.this$0;
com.mobfox.video.sdk.MobFoxVideoView .access$4 ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_2
	 /* .line 287 */
	 v1 = this.this$0;
	 com.mobfox.video.sdk.MobFoxVideoView .access$4 ( v1 );
	 int v2 = 1; // const/4 v2, 0x1
	 (( com.mobfox.video.sdk.MobFoxMediaController ) v1 ).setEnabled ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/video/sdk/MobFoxMediaController;->setEnabled(Z)V
	 /* .line 289 */
} // :cond_2
v1 = this.this$0;
v0 = com.mobfox.video.sdk.MobFoxVideoView .access$5 ( v1 );
/* .line 292 */
/* .local v0, "seekToPosition":I */
if ( v0 != null) { // if-eqz v0, :cond_3
	 /* .line 293 */
	 v1 = this.this$0;
	 (( com.mobfox.video.sdk.MobFoxVideoView ) v1 ).seekTo ( v0 ); // invoke-virtual {v1, v0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->seekTo(I)V
	 /* .line 295 */
} // :cond_3
v1 = this.this$0;
v1 = com.mobfox.video.sdk.MobFoxVideoView .access$6 ( v1 );
/* if-nez v1, :cond_5 */
/* .line 296 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
v1 = android.util.Log .isLoggable ( v1,v3 );
if ( v1 != null) { // if-eqz v1, :cond_4
	 /* .line 297 */
	 final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
	 /* .line 298 */
	 final String v2 = "MobFoxVideoView onPrepared surface not ready yet"; // const-string v2, "MobFoxVideoView onPrepared surface not ready yet"
	 /* .line 297 */
	 android.util.Log .d ( v1,v2 );
	 /* .line 311 */
} // :cond_4
} // :goto_0
return;
/* .line 302 */
} // :cond_5
v1 = this.this$0;
com.mobfox.video.sdk.MobFoxVideoView .access$0 ( v1 );
/* .line 303 */
v1 = this.this$0;
v1 = com.mobfox.video.sdk.MobFoxVideoView .access$7 ( v1 );
/* if-ne v1, v3, :cond_6 */
/* .line 304 */
v1 = this.this$0;
(( com.mobfox.video.sdk.MobFoxVideoView ) v1 ).start ( ); // invoke-virtual {v1}, Lcom/mobfox/video/sdk/MobFoxVideoView;->start()V
/* .line 305 */
} // :cond_6
v1 = this.this$0;
v1 = (( com.mobfox.video.sdk.MobFoxVideoView ) v1 ).isPlaying ( ); // invoke-virtual {v1}, Lcom/mobfox/video/sdk/MobFoxVideoView;->isPlaying()Z
/* if-nez v1, :cond_4 */
/* .line 306 */
/* if-nez v0, :cond_7 */
v1 = this.this$0;
v1 = (( com.mobfox.video.sdk.MobFoxVideoView ) v1 ).getCurrentPosition ( ); // invoke-virtual {v1}, Lcom/mobfox/video/sdk/MobFoxVideoView;->getCurrentPosition()I
/* if-lez v1, :cond_4 */
/* .line 307 */
} // :cond_7
v1 = this.this$0;
com.mobfox.video.sdk.MobFoxVideoView .access$4 ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_4
/* .line 308 */
v1 = this.this$0;
com.mobfox.video.sdk.MobFoxVideoView .access$4 ( v1 );
int v2 = 0; // const/4 v2, 0x0
(( com.mobfox.video.sdk.MobFoxMediaController ) v1 ).show ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/video/sdk/MobFoxMediaController;->show(I)V
} // .end method

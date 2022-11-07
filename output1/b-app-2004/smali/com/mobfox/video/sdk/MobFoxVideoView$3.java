class com.mobfox.video.sdk.MobFoxVideoView$3 implements android.media.MediaPlayer$OnCompletionListener {
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
 com.mobfox.video.sdk.MobFoxVideoView$3 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 314 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onCompletion ( android.media.MediaPlayer p0 ) {
/* .locals 2 */
/* .param p1, "mp" # Landroid/media/MediaPlayer; */
/* .prologue */
int v1 = 5; // const/4 v1, 0x5
/* .line 316 */
v0 = this.this$0;
com.mobfox.video.sdk.MobFoxVideoView .access$1 ( v0,v1 );
/* .line 317 */
v0 = this.this$0;
com.mobfox.video.sdk.MobFoxVideoView .access$8 ( v0,v1 );
/* .line 318 */
v0 = this.this$0;
com.mobfox.video.sdk.MobFoxVideoView .access$4 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 319 */
	 v0 = this.this$0;
	 com.mobfox.video.sdk.MobFoxVideoView .access$4 ( v0 );
	 int v1 = 0; // const/4 v1, 0x0
	 (( com.mobfox.video.sdk.MobFoxMediaController ) v0 ).show ( v1 ); // invoke-virtual {v0, v1}, Lcom/mobfox/video/sdk/MobFoxMediaController;->show(I)V
	 /* .line 321 */
} // :cond_0
v0 = this.this$0;
com.mobfox.video.sdk.MobFoxVideoView .access$9 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 322 */
	 v0 = this.this$0;
	 com.mobfox.video.sdk.MobFoxVideoView .access$9 ( v0 );
	 v1 = this.this$0;
	 com.mobfox.video.sdk.MobFoxVideoView .access$3 ( v1 );
	 /* .line 324 */
} // :cond_1
return;
} // .end method

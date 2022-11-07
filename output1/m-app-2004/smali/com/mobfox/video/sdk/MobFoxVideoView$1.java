class com.mobfox.video.sdk.MobFoxVideoView$1 implements android.media.MediaPlayer$OnVideoSizeChangedListener {
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
 com.mobfox.video.sdk.MobFoxVideoView$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 267 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onVideoSizeChanged ( android.media.MediaPlayer p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* .param p1, "mp" # Landroid/media/MediaPlayer; */
/* .param p2, "width" # I */
/* .param p3, "height" # I */
/* .prologue */
/* .line 269 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 270 */
	 final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
	 final String v1 = "MobFoxVideoView OnVideoSizeChangedListener"; // const-string v1, "MobFoxVideoView OnVideoSizeChangedListener"
	 android.util.Log .d ( v0,v1 );
	 /* .line 272 */
} // :cond_0
v0 = this.this$0;
com.mobfox.video.sdk.MobFoxVideoView .access$0 ( v0 );
/* .line 273 */
return;
} // .end method

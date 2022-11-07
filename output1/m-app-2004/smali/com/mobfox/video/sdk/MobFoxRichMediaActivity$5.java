class com.mobfox.video.sdk.MobFoxRichMediaActivity$5 implements android.media.MediaPlayer$OnPreparedListener {
	 /* .source "MobFoxRichMediaActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/mobfox/video/sdk/MobFoxRichMediaActivity; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.video.sdk.MobFoxRichMediaActivity this$0; //synthetic
/* # direct methods */
 com.mobfox.video.sdk.MobFoxRichMediaActivity$5 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 797 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onPrepared ( android.media.MediaPlayer p0 ) {
/* .locals 2 */
/* .param p1, "mp" # Landroid/media/MediaPlayer; */
/* .prologue */
/* .line 801 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 802 */
	 final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
	 final String v1 = "MobFoxRichMediaActivity onPrepared MediaPlayer"; // const-string v1, "MobFoxRichMediaActivity onPrepared MediaPlayer"
	 android.util.Log .d ( v0,v1 );
	 /* .line 804 */
} // :cond_0
v0 = this.this$0;
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$4 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 805 */
	 v0 = this.this$0;
	 com.mobfox.video.sdk.MobFoxRichMediaActivity .access$4 ( v0 );
	 (( java.util.Timer ) v0 ).cancel ( ); // invoke-virtual {v0}, Ljava/util/Timer;->cancel()V
	 /* .line 806 */
	 v0 = this.this$0;
	 int v1 = 0; // const/4 v1, 0x0
	 com.mobfox.video.sdk.MobFoxRichMediaActivity .access$5 ( v0,v1 );
	 /* .line 808 */
} // :cond_1
v0 = this.this$0;
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$6 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_2
	 /* .line 809 */
	 v0 = this.this$0;
	 com.mobfox.video.sdk.MobFoxRichMediaActivity .access$6 ( v0 );
	 /* const/16 v1, 0x8 */
	 (( android.widget.FrameLayout ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V
	 /* .line 811 */
} // :cond_2
v0 = this.this$0;
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$7 ( v0 );
(( com.mobfox.video.sdk.MobFoxVideoView ) v0 ).requestFocus ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/MobFoxVideoView;->requestFocus()Z
/* .line 812 */
return;
} // .end method

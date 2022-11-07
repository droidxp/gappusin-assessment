class com.mobfox.video.sdk.MobFoxRichMediaActivity$19 implements android.media.MediaPlayer$OnCompletionListener {
	 /* .source "MobFoxRichMediaActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.video.sdk.MobFoxRichMediaActivity this$0; //synthetic
/* # direct methods */
 com.mobfox.video.sdk.MobFoxRichMediaActivity$19 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 1254 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onCompletion ( android.media.MediaPlayer p0 ) {
/* .locals 2 */
/* .param p1, "mp" # Landroid/media/MediaPlayer; */
/* .prologue */
/* .line 1258 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 1259 */
	 final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
	 final String v1 = " onCompletion Video"; // const-string v1, " onCompletion Video"
	 android.util.Log .d ( v0,v1 );
	 /* .line 1261 */
} // :cond_0
v0 = this.this$0;
(( com.mobfox.video.sdk.MobFoxRichMediaActivity ) v0 ).onHideCustomView ( ); // invoke-virtual {v0}, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity;->onHideCustomView()V
/* .line 1262 */
return;
} // .end method

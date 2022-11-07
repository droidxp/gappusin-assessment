class com.mobfox.video.sdk.MobFoxRichMediaActivity$4 implements android.media.MediaPlayer$OnErrorListener {
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
 com.mobfox.video.sdk.MobFoxRichMediaActivity$4 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 787 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Boolean onError ( android.media.MediaPlayer p0, Integer p1, Integer p2 ) {
/* .locals 3 */
/* .param p1, "mp" # Landroid/media/MediaPlayer; */
/* .param p2, "what" # I */
/* .param p3, "extra" # I */
/* .prologue */
/* .line 791 */
v0 = this.this$0;
final String v1 = "Cannot play video"; // const-string v1, "Cannot play video"
/* .line 792 */
int v2 = 1; // const/4 v2, 0x1
/* .line 791 */
android.widget.Toast .makeText ( v0,v1,v2 );
/* .line 792 */
(( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
/* .line 793 */
int v0 = 0; // const/4 v0, 0x0
} // .end method

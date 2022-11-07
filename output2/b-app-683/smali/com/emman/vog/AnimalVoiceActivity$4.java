class com.emman.vog.AnimalVoiceActivity$4 implements android.media.MediaPlayer$OnCompletionListener {
	 /* .source "AnimalVoiceActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/emman/vog/AnimalVoiceActivity;->initPlayer(Ljava/util/List;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.emman.vog.AnimalVoiceActivity this$0; //synthetic
/* # direct methods */
 com.emman.vog.AnimalVoiceActivity$4 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 203 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onCompletion ( android.media.MediaPlayer p0 ) {
/* .locals 2 */
/* .param p1, "mp" # Landroid/media/MediaPlayer; */
/* .prologue */
/* .line 207 */
v0 = this.this$0;
v0 = this.speakBtn;
/* const v1, 0x7f020062 */
(( android.widget.Button ) v0 ).setBackgroundResource ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V
/* .line 208 */
return;
} // .end method

class com.wiyun.engine.sound.AudioManager$2 implements android.media.MediaPlayer$OnPreparedListener {
	 /* .source "AudioManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/wiyun/engine/sound/AudioManager;->setupMediaPlayerBackend()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # direct methods */
 com.wiyun.engine.sound.AudioManager$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 77 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 1 */
return;
} // .end method
/* # virtual methods */
public void onPrepared ( android.media.MediaPlayer p0 ) {
/* .locals 1 */
/* .param p1, "player" # Landroid/media/MediaPlayer; */
/* .prologue */
/* .line 79 */
int v0 = 1; // const/4 v0, 0x1
com.wiyun.engine.sound.AudioManager .access$4 ( v0 );
/* .line 80 */
v0 = com.wiyun.engine.sound.AudioManager .access$5 ( );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 81 */
	 com.wiyun.engine.sound.AudioManager .access$2 ( );
	 (( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
	 /* .line 83 */
} // :cond_0
return;
} // .end method

class com.wiyun.engine.sound.AudioManager$1 implements android.media.MediaPlayer$OnCompletionListener {
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
 com.wiyun.engine.sound.AudioManager$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 66 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 1 */
return;
} // .end method
/* # virtual methods */
public void onCompletion ( android.media.MediaPlayer p0 ) {
/* .locals 1 */
/* .param p1, "player" # Landroid/media/MediaPlayer; */
/* .prologue */
/* .line 68 */
v0 = com.wiyun.engine.sound.AudioManager .access$0 ( );
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 69 */
	 v0 = 	 com.wiyun.engine.sound.AudioManager .access$0 ( );
	 /* if-lez v0, :cond_0 */
	 /* .line 70 */
	 v0 = 	 com.wiyun.engine.sound.AudioManager .access$0 ( );
	 /* add-int/lit8 v0, v0, -0x1 */
	 com.wiyun.engine.sound.AudioManager .access$1 ( v0 );
	 /* .line 71 */
} // :cond_0
com.wiyun.engine.sound.AudioManager .access$2 ( );
(( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
/* .line 75 */
} // :goto_0
return;
/* .line 73 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.sound.AudioManager .access$3 ( v0 );
} // .end method

class org.haxe.nme.ManagedMediaPlayer$1 implements android.media.MediaPlayer$OnCompletionListener {
	 /* .source "Sound.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lorg/haxe/nme/ManagedMediaPlayer;-><init>(Landroid/media/MediaPlayer;FFI)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final org.haxe.nme.ManagedMediaPlayer this$0; //synthetic
final org.haxe.nme.ManagedMediaPlayer val$mmp; //synthetic
/* # direct methods */
 org.haxe.nme.ManagedMediaPlayer$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 41 */
this.this$0 = p1;
this.val$mmp = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onCompletion ( android.media.MediaPlayer p0 ) {
/* .locals 2 */
/* .param p1, "mp" # Landroid/media/MediaPlayer; */
/* .prologue */
/* .line 43 */
v0 = this.val$mmp;
/* iget v1, v0, Lorg/haxe/nme/ManagedMediaPlayer;->loopsLeft:I */
/* add-int/lit8 v1, v1, -0x1 */
/* iput v1, v0, Lorg/haxe/nme/ManagedMediaPlayer;->loopsLeft:I */
/* if-lez v1, :cond_0 */
/* .line 44 */
int v0 = 0; // const/4 v0, 0x0
(( android.media.MediaPlayer ) p1 ).seekTo ( v0 ); // invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->seekTo(I)V
/* .line 45 */
(( android.media.MediaPlayer ) p1 ).start ( ); // invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V
/* .line 49 */
} // :goto_0
return;
/* .line 47 */
} // :cond_0
v0 = this.val$mmp;
(( org.haxe.nme.ManagedMediaPlayer ) v0 ).setComplete ( ); // invoke-virtual {v0}, Lorg/haxe/nme/ManagedMediaPlayer;->setComplete()V
} // .end method

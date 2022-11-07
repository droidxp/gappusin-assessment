class com.ansca.corona.VideoActivity$1 implements android.media.MediaPlayer$OnCompletionListener {
	 /* .source "VideoActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/VideoActivity;->onCreate(Landroid/os/Bundle;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.VideoActivity this$0; //synthetic
/* # direct methods */
 com.ansca.corona.VideoActivity$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 41 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onCompletion ( android.media.MediaPlayer p0 ) {
/* .locals 2 */
/* .param p1, "player" # Landroid/media/MediaPlayer; */
/* .prologue */
/* .line 43 */
com.ansca.corona.Controller .getEventManager ( );
v1 = this.this$0;
v1 = com.ansca.corona.VideoActivity .access$000 ( v1 );
(( com.ansca.corona.events.EventManager ) v0 ).videoEnded ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/events/EventManager;->videoEnded(I)V
/* .line 44 */
com.ansca.corona.Controller .getMediaManager ( );
(( com.ansca.corona.MediaManager ) v0 ).resumeAll ( ); // invoke-virtual {v0}, Lcom/ansca/corona/MediaManager;->resumeAll()V
/* .line 45 */
v0 = this.this$0;
(( com.ansca.corona.VideoActivity ) v0 ).finish ( ); // invoke-virtual {v0}, Lcom/ansca/corona/VideoActivity;->finish()V
/* .line 46 */
return;
} // .end method

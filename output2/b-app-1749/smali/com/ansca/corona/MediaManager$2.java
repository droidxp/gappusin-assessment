class com.ansca.corona.MediaManager$2 implements android.media.MediaPlayer$OnCompletionListener {
	 /* .source "MediaManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/MediaManager;->loadSound(ILjava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.MediaManager this$0; //synthetic
final Integer val$id; //synthetic
/* # direct methods */
 com.ansca.corona.MediaManager$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 101 */
this.this$0 = p1;
/* iput p2, p0, Lcom/ansca/corona/MediaManager$2;->val$id:I */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onCompletion ( android.media.MediaPlayer p0 ) {
/* .locals 3 */
/* .param p1, "mp" # Landroid/media/MediaPlayer; */
/* .prologue */
/* .line 103 */
(( android.media.MediaPlayer ) p1 ).release ( ); // invoke-virtual {p1}, Landroid/media/MediaPlayer;->release()V
/* .line 104 */
v0 = this.this$0;
com.ansca.corona.MediaManager .access$000 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 105 */
	 v0 = this.this$0;
	 com.ansca.corona.MediaManager .access$000 ( v0 );
	 /* new-instance v1, Ljava/lang/Integer; */
	 /* iget v2, p0, Lcom/ansca/corona/MediaManager$2;->val$id:I */
	 /* invoke-direct {v1, v2}, Ljava/lang/Integer;-><init>(I)V */
	 (( java.util.HashMap ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
	 /* .line 108 */
} // :cond_0
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 109 */
	 com.ansca.corona.Controller .getEventManager ( );
	 /* iget v1, p0, Lcom/ansca/corona/MediaManager$2;->val$id:I */
	 (( com.ansca.corona.events.EventManager ) v0 ).soundEnded ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/events/EventManager;->soundEnded(I)V
	 /* .line 111 */
} // :cond_1
return;
} // .end method

public class com.ansca.corona.events.MediaEvent extends com.ansca.corona.events.Event {
	 /* .source "MediaEvent.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/ansca/corona/events/MediaEvent$1;, */
	 /* Lcom/ansca/corona/events/MediaEvent$Event; */
	 /* } */
} // .end annotation
/* # instance fields */
com.ansca.corona.events.MediaEvent$Event myEvent;
Boolean myLooping;
Integer myMediaId;
java.lang.String myMediaName;
/* # direct methods */
 com.ansca.corona.events.MediaEvent ( ) {
	 /* .locals 1 */
	 /* .param p1, "id" # I */
	 /* .param p2, "event" # Lcom/ansca/corona/events/MediaEvent$Event; */
	 /* .prologue */
	 /* .line 31 */
	 /* invoke-direct {p0}, Lcom/ansca/corona/events/Event;-><init>()V */
	 /* .line 9 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput-boolean v0, p0, Lcom/ansca/corona/events/MediaEvent;->myLooping:Z */
	 /* .line 32 */
	 this.myEvent = p2;
	 /* .line 33 */
	 /* iput p1, p0, Lcom/ansca/corona/events/MediaEvent;->myMediaId:I */
	 /* .line 34 */
	 return;
} // .end method
 com.ansca.corona.events.MediaEvent ( ) {
	 /* .locals 1 */
	 /* .param p1, "id" # I */
	 /* .param p2, "name" # Ljava/lang/String; */
	 /* .param p3, "event" # Lcom/ansca/corona/events/MediaEvent$Event; */
	 /* .prologue */
	 /* .line 37 */
	 /* invoke-direct {p0}, Lcom/ansca/corona/events/Event;-><init>()V */
	 /* .line 9 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput-boolean v0, p0, Lcom/ansca/corona/events/MediaEvent;->myLooping:Z */
	 /* .line 38 */
	 this.myEvent = p3;
	 /* .line 39 */
	 /* iput p1, p0, Lcom/ansca/corona/events/MediaEvent;->myMediaId:I */
	 /* .line 40 */
	 this.myMediaName = p2;
	 /* .line 41 */
	 return;
} // .end method
 com.ansca.corona.events.MediaEvent ( ) {
	 /* .locals 1 */
	 /* .param p1, "name" # Ljava/lang/String; */
	 /* .param p2, "event" # Lcom/ansca/corona/events/MediaEvent$Event; */
	 /* .prologue */
	 /* .line 25 */
	 /* invoke-direct {p0}, Lcom/ansca/corona/events/Event;-><init>()V */
	 /* .line 9 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput-boolean v0, p0, Lcom/ansca/corona/events/MediaEvent;->myLooping:Z */
	 /* .line 26 */
	 this.myEvent = p2;
	 /* .line 27 */
	 this.myMediaName = p1;
	 /* .line 28 */
	 return;
} // .end method
/* # virtual methods */
public void Send ( ) {
	 /* .locals 4 */
	 /* .prologue */
	 /* .line 50 */
	 v0 = com.ansca.corona.events.MediaEvent$1.$SwitchMap$com$ansca$corona$events$MediaEvent$Event;
	 v1 = this.myEvent;
	 v1 = 	 (( com.ansca.corona.events.MediaEvent$Event ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/ansca/corona/events/MediaEvent$Event;->ordinal()I
	 /* aget v0, v0, v1 */
	 /* packed-switch v0, :pswitch_data_0 */
	 /* .line 76 */
} // :goto_0
/* :pswitch_0 */
return;
/* .line 54 */
/* :pswitch_1 */
com.ansca.corona.Controller .getMediaManager ( );
/* iget v1, p0, Lcom/ansca/corona/events/MediaEvent;->myMediaId:I */
/* iget-boolean v2, p0, Lcom/ansca/corona/events/MediaEvent;->myLooping:Z */
(( com.ansca.corona.MediaManager ) v0 ).playMedia ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/ansca/corona/MediaManager;->playMedia(IZ)V
/* .line 57 */
/* :pswitch_2 */
com.ansca.corona.Controller .getMediaManager ( );
/* iget v1, p0, Lcom/ansca/corona/events/MediaEvent;->myMediaId:I */
(( com.ansca.corona.MediaManager ) v0 ).stopMedia ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/MediaManager;->stopMedia(I)V
/* .line 60 */
/* :pswitch_3 */
com.ansca.corona.Controller .getMediaManager ( );
/* iget v1, p0, Lcom/ansca/corona/events/MediaEvent;->myMediaId:I */
(( com.ansca.corona.MediaManager ) v0 ).pauseMedia ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/MediaManager;->pauseMedia(I)V
/* .line 63 */
/* :pswitch_4 */
com.ansca.corona.Controller .getMediaManager ( );
/* iget v1, p0, Lcom/ansca/corona/events/MediaEvent;->myMediaId:I */
(( com.ansca.corona.MediaManager ) v0 ).resumeMedia ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/MediaManager;->resumeMedia(I)V
/* .line 66 */
/* :pswitch_5 */
com.ansca.corona.Controller .getMediaManager ( );
/* iget v1, p0, Lcom/ansca/corona/events/MediaEvent;->myMediaId:I */
v2 = this.myMediaName;
int v3 = 1; // const/4 v3, 0x1
(( com.ansca.corona.MediaManager ) v0 ).playVideo ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/ansca/corona/MediaManager;->playVideo(ILjava/lang/String;Z)V
/* .line 70 */
/* :pswitch_6 */
/* iget v0, p0, Lcom/ansca/corona/events/MediaEvent;->myMediaId:I */
com.ansca.corona.JavaToNativeShim .soundEndCallback ( v0 );
/* .line 73 */
/* :pswitch_7 */
/* iget v0, p0, Lcom/ansca/corona/events/MediaEvent;->myMediaId:I */
com.ansca.corona.JavaToNativeShim .videoEndCallback ( v0 );
/* .line 50 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_4 */
/* :pswitch_5 */
/* :pswitch_6 */
/* :pswitch_7 */
} // .end packed-switch
} // .end method
public void setLooping ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "l" # Z */
/* .prologue */
/* .line 45 */
/* iput-boolean p1, p0, Lcom/ansca/corona/events/MediaEvent;->myLooping:Z */
/* .line 46 */
return;
} // .end method

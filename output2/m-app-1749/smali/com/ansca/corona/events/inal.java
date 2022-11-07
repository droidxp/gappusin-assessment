class inal extends java.lang.Enum {
	 /* .source "MediaEvent.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/ansca/corona/events/MediaEvent; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x4018 */
/* name = "Event" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Enum", */
/* "<", */
/* "Lcom/ansca/corona/events/MediaEvent$Event;", */
/* ">;" */
/* } */
} // .end annotation
/* # static fields */
private static final com.ansca.corona.events.MediaEvent$Event $VALUES; //synthetic
public static final com.ansca.corona.events.MediaEvent$Event LoadSound;
public static final com.ansca.corona.events.MediaEvent$Event PauseSound;
public static final com.ansca.corona.events.MediaEvent$Event PlaySound;
public static final com.ansca.corona.events.MediaEvent$Event PlayVideo;
public static final com.ansca.corona.events.MediaEvent$Event ResumeSound;
public static final com.ansca.corona.events.MediaEvent$Event SoundEnded;
public static final com.ansca.corona.events.MediaEvent$Event StopSound;
public static final com.ansca.corona.events.MediaEvent$Event VideoEnded;
/* # direct methods */
static inal ( ) {
/* .locals 8 */
/* .prologue */
int v7 = 4; // const/4 v7, 0x4
int v6 = 3; // const/4 v6, 0x3
int v5 = 2; // const/4 v5, 0x2
int v4 = 1; // const/4 v4, 0x1
int v3 = 0; // const/4 v3, 0x0
/* .line 12 */
/* new-instance v0, Lcom/ansca/corona/events/MediaEvent$Event; */
final String v1 = "LoadSound"; // const-string v1, "LoadSound"
/* invoke-direct {v0, v1, v3}, Lcom/ansca/corona/events/MediaEvent$Event;-><init>(Ljava/lang/String;I)V */
/* .line 13 */
/* new-instance v0, Lcom/ansca/corona/events/MediaEvent$Event; */
final String v1 = "PlaySound"; // const-string v1, "PlaySound"
/* invoke-direct {v0, v1, v4}, Lcom/ansca/corona/events/MediaEvent$Event;-><init>(Ljava/lang/String;I)V */
/* .line 14 */
/* new-instance v0, Lcom/ansca/corona/events/MediaEvent$Event; */
final String v1 = "StopSound"; // const-string v1, "StopSound"
/* invoke-direct {v0, v1, v5}, Lcom/ansca/corona/events/MediaEvent$Event;-><init>(Ljava/lang/String;I)V */
/* .line 15 */
/* new-instance v0, Lcom/ansca/corona/events/MediaEvent$Event; */
final String v1 = "PauseSound"; // const-string v1, "PauseSound"
/* invoke-direct {v0, v1, v6}, Lcom/ansca/corona/events/MediaEvent$Event;-><init>(Ljava/lang/String;I)V */
/* .line 16 */
/* new-instance v0, Lcom/ansca/corona/events/MediaEvent$Event; */
final String v1 = "ResumeSound"; // const-string v1, "ResumeSound"
/* invoke-direct {v0, v1, v7}, Lcom/ansca/corona/events/MediaEvent$Event;-><init>(Ljava/lang/String;I)V */
/* .line 17 */
/* new-instance v0, Lcom/ansca/corona/events/MediaEvent$Event; */
final String v1 = "PlayVideo"; // const-string v1, "PlayVideo"
int v2 = 5; // const/4 v2, 0x5
/* invoke-direct {v0, v1, v2}, Lcom/ansca/corona/events/MediaEvent$Event;-><init>(Ljava/lang/String;I)V */
/* .line 18 */
/* new-instance v0, Lcom/ansca/corona/events/MediaEvent$Event; */
final String v1 = "SoundEnded"; // const-string v1, "SoundEnded"
int v2 = 6; // const/4 v2, 0x6
/* invoke-direct {v0, v1, v2}, Lcom/ansca/corona/events/MediaEvent$Event;-><init>(Ljava/lang/String;I)V */
/* .line 19 */
/* new-instance v0, Lcom/ansca/corona/events/MediaEvent$Event; */
final String v1 = "VideoEnded"; // const-string v1, "VideoEnded"
int v2 = 7; // const/4 v2, 0x7
/* invoke-direct {v0, v1, v2}, Lcom/ansca/corona/events/MediaEvent$Event;-><init>(Ljava/lang/String;I)V */
/* .line 11 */
/* const/16 v0, 0x8 */
/* new-array v0, v0, [Lcom/ansca/corona/events/MediaEvent$Event; */
v1 = com.ansca.corona.events.MediaEvent$Event.LoadSound;
/* aput-object v1, v0, v3 */
v1 = com.ansca.corona.events.MediaEvent$Event.PlaySound;
/* aput-object v1, v0, v4 */
v1 = com.ansca.corona.events.MediaEvent$Event.StopSound;
/* aput-object v1, v0, v5 */
v1 = com.ansca.corona.events.MediaEvent$Event.PauseSound;
/* aput-object v1, v0, v6 */
v1 = com.ansca.corona.events.MediaEvent$Event.ResumeSound;
/* aput-object v1, v0, v7 */
int v1 = 5; // const/4 v1, 0x5
v2 = com.ansca.corona.events.MediaEvent$Event.PlayVideo;
/* aput-object v2, v0, v1 */
int v1 = 6; // const/4 v1, 0x6
v2 = com.ansca.corona.events.MediaEvent$Event.SoundEnded;
/* aput-object v2, v0, v1 */
int v1 = 7; // const/4 v1, 0x7
v2 = com.ansca.corona.events.MediaEvent$Event.VideoEnded;
/* aput-object v2, v0, v1 */
return;
} // .end method
private inal ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 11 */
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
return;
} // .end method
public static com.ansca.corona.events.MediaEvent$Event valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 11 */
/* const-class v0, Lcom/ansca/corona/events/MediaEvent$Event; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast v0, Lcom/ansca/corona/events/MediaEvent$Event; */
} // .end method
public static com.ansca.corona.events.MediaEvent$Event values ( ) {
/* .locals 1 */
/* .prologue */
/* .line 11 */
v0 = com.ansca.corona.events.MediaEvent$Event.$VALUES;
(( com.ansca.corona.events.MediaEvent$Event ) v0 ).clone ( ); // invoke-virtual {v0}, [Lcom/ansca/corona/events/MediaEvent$Event;->clone()Ljava/lang/Object;
/* check-cast v0, [Lcom/ansca/corona/events/MediaEvent$Event; */
} // .end method

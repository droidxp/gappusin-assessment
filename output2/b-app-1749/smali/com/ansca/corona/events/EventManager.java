public class com.ansca.corona.events.EventManager {
	 /* .source "EventManager.java" */
	 /* # instance fields */
	 private java.util.Queue myEvents;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Queue", */
	 /* "<", */
	 /* "Lcom/ansca/corona/events/Event;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.ansca.corona.events.EventManager ( ) {
/* .locals 1 */
/* .prologue */
/* .line 22 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 20 */
/* new-instance v0, Ljava/util/LinkedList; */
/* invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V */
this.myEvents = v0;
/* .line 23 */
return;
} // .end method
public static Integer touchActionToPhase ( Integer p0 ) {
/* .locals 4 */
/* .param p0, "action" # I */
/* .prologue */
/* .line 36 */
int v0 = 0; // const/4 v0, 0x0
/* .line 38 */
/* .local v0, "phase":I */
/* packed-switch p0, :pswitch_data_0 */
/* .line 54 */
/* :pswitch_0 */
v1 = java.lang.System.err;
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Unknown touch phase "; // const-string v3, "Unknown touch phase "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v1 ).println ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 58 */
} // :goto_0
/* .line 41 */
/* :pswitch_1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 42 */
/* .line 44 */
/* :pswitch_2 */
int v0 = 1; // const/4 v0, 0x1
/* .line 45 */
/* .line 48 */
/* :pswitch_3 */
int v0 = 3; // const/4 v0, 0x3
/* .line 49 */
/* .line 51 */
/* :pswitch_4 */
int v0 = 4; // const/4 v0, 0x4
/* .line 52 */
/* .line 38 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_1 */
/* :pswitch_3 */
/* :pswitch_2 */
/* :pswitch_4 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_3 */
} // .end packed-switch
} // .end method
/* # virtual methods */
public void accelerometerEvent ( Double p0, Double p1, Double p2, Double p3 ) {
/* .locals 9 */
/* .param p1, "x" # D */
/* .param p3, "y" # D */
/* .param p5, "z" # D */
/* .param p7, "deltaTime" # D */
/* .prologue */
/* .line 67 */
/* new-instance v0, Lcom/ansca/corona/events/AccelerometerEvent; */
/* move-wide v1, p1 */
/* move-wide v3, p3 */
/* move-wide v5, p5 */
/* move-wide/from16 v7, p7 */
/* invoke-direct/range {v0 ..v8}, Lcom/ansca/corona/events/AccelerometerEvent;-><init>(DDDD)V */
/* .line 69 */
/* .local v0, "e":Lcom/ansca/corona/events/Event; */
(( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* .line 70 */
return;
} // .end method
public void adRequestEvent ( Boolean p0 ) {
/* .locals 1 */
/* .param p1, "isError" # Z */
/* .prologue */
/* .line 257 */
/* new-instance v0, Lcom/ansca/corona/events/AdRequestEvent; */
/* invoke-direct {v0, p1}, Lcom/ansca/corona/events/AdRequestEvent;-><init>(Z)V */
/* .line 258 */
/* .local v0, "e":Lcom/ansca/corona/events/Event; */
(( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* .line 259 */
return;
} // .end method
public synchronized void addEvent ( com.ansca.corona.events.Event p0 ) {
/* .locals 1 */
/* .param p1, "e" # Lcom/ansca/corona/events/Event; */
/* .prologue */
/* .line 26 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.myEvents;
/* .line 28 */
com.ansca.corona.Controller .requestEventRender ( );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 29 */
/* monitor-exit p0 */
return;
/* .line 26 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public void creditsRequestEvent ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .param p1, "newPoints" # I */
/* .param p2, "totalPoints" # I */
/* .prologue */
/* .line 271 */
/* new-instance v0, Lcom/ansca/corona/events/CreditsRequestEvent; */
/* invoke-direct {v0, p1, p2}, Lcom/ansca/corona/events/CreditsRequestEvent;-><init>(II)V */
/* .line 273 */
/* .local v0, "e":Lcom/ansca/corona/events/Event; */
(( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* .line 274 */
return;
} // .end method
public void didFailLoadUrlEvent ( Integer p0, java.lang.String p1, java.lang.String p2, Integer p3 ) {
/* .locals 1 */
/* .param p1, "id" # I */
/* .param p2, "failingUrl" # Ljava/lang/String; */
/* .param p3, "description" # Ljava/lang/String; */
/* .param p4, "errorCode" # I */
/* .prologue */
/* .line 212 */
/* new-instance v0, Lcom/ansca/corona/events/DidFailLoadUrlEvent; */
/* invoke-direct {v0, p1, p2, p3, p4}, Lcom/ansca/corona/events/DidFailLoadUrlEvent;-><init>(ILjava/lang/String;Ljava/lang/String;I)V */
/* .line 214 */
/* .local v0, "e":Lcom/ansca/corona/events/Event; */
(( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* .line 215 */
return;
} // .end method
public synchronized void fbConnectRequestEvent ( java.lang.String p0, Boolean p1 ) {
/* .locals 2 */
/* .param p1, "msg" # Ljava/lang/String; */
/* .param p2, "isError" # Z */
/* .prologue */
/* .line 236 */
/* monitor-enter p0 */
try { // :try_start_0
/* new-instance v0, Lcom/ansca/corona/events/FBConnectEvent; */
/* invoke-direct {v0, p1, p2}, Lcom/ansca/corona/events/FBConnectEvent;-><init>(Ljava/lang/String;Z)V */
/* .line 237 */
/* .local v0, "e":Lcom/ansca/corona/events/Event; */
(( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 238 */
/* monitor-exit p0 */
return;
/* .line 236 */
} // .end local v0 # "e":Lcom/ansca/corona/events/Event;
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit p0 */
/* throw v1 */
} // .end method
public synchronized void fbConnectRequestEvent ( java.lang.String p0, Boolean p1, Boolean p2 ) {
/* .locals 2 */
/* .param p1, "msg" # Ljava/lang/String; */
/* .param p2, "isError" # Z */
/* .param p3, "didComplete" # Z */
/* .prologue */
/* .line 242 */
/* monitor-enter p0 */
try { // :try_start_0
/* new-instance v0, Lcom/ansca/corona/events/FBConnectEvent; */
/* invoke-direct {v0, p1, p2, p3}, Lcom/ansca/corona/events/FBConnectEvent;-><init>(Ljava/lang/String;ZZ)V */
/* .line 243 */
/* .local v0, "e":Lcom/ansca/corona/events/Event; */
(( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 244 */
/* monitor-exit p0 */
return;
/* .line 242 */
} // .end local v0 # "e":Lcom/ansca/corona/events/Event;
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit p0 */
/* throw v1 */
} // .end method
public synchronized void fbConnectSessionEvent ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "phase" # I */
/* .prologue */
/* .line 219 */
/* monitor-enter p0 */
int v0 = 0; // const/4 v0, 0x0
/* const-wide/16 v1, 0x0 */
try { // :try_start_0
(( com.ansca.corona.events.EventManager ) p0 ).fbConnectSessionEvent ( p1, v0, v1, v2 ); // invoke-virtual {p0, p1, v0, v1, v2}, Lcom/ansca/corona/events/EventManager;->fbConnectSessionEvent(ILjava/lang/String;J)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 220 */
/* monitor-exit p0 */
return;
/* .line 219 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized void fbConnectSessionEvent ( Integer p0, java.lang.String p1, Long p2 ) {
/* .locals 2 */
/* .param p1, "phase" # I */
/* .param p2, "accessToken" # Ljava/lang/String; */
/* .param p3, "tokenExpiration" # J */
/* .prologue */
/* .line 224 */
/* monitor-enter p0 */
try { // :try_start_0
	 /* new-instance v0, Lcom/ansca/corona/events/FBConnectEvent; */
	 /* invoke-direct {v0, p1, p2, p3, p4}, Lcom/ansca/corona/events/FBConnectEvent;-><init>(ILjava/lang/String;J)V */
	 /* .line 225 */
	 /* .local v0, "e":Lcom/ansca/corona/events/Event; */
	 (( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 226 */
	 /* monitor-exit p0 */
	 return;
	 /* .line 224 */
} // .end local v0 # "e":Lcom/ansca/corona/events/Event;
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit p0 */
/* throw v1 */
} // .end method
public synchronized void fbConnectSessionEventError ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "msg" # Ljava/lang/String; */
/* .prologue */
/* .line 230 */
/* monitor-enter p0 */
try { // :try_start_0
	 /* new-instance v0, Lcom/ansca/corona/events/FBConnectEvent; */
	 /* invoke-direct {v0, p1}, Lcom/ansca/corona/events/FBConnectEvent;-><init>(Ljava/lang/String;)V */
	 /* .line 231 */
	 /* .local v0, "e":Lcom/ansca/corona/events/Event; */
	 (( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 232 */
	 /* monitor-exit p0 */
	 return;
	 /* .line 230 */
} // .end local v0 # "e":Lcom/ansca/corona/events/Event;
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit p0 */
/* throw v1 */
} // .end method
public void gyroscopeEvent ( Double p0, Double p1, Double p2, Double p3 ) {
/* .locals 9 */
/* .param p1, "x" # D */
/* .param p3, "y" # D */
/* .param p5, "z" # D */
/* .param p7, "deltaTime" # D */
/* .prologue */
/* .line 74 */
/* new-instance v0, Lcom/ansca/corona/events/GyroscopeEvent; */
/* move-wide v1, p1 */
/* move-wide v3, p3 */
/* move-wide v5, p5 */
/* move-wide/from16 v7, p7 */
/* invoke-direct/range {v0 ..v8}, Lcom/ansca/corona/events/GyroscopeEvent;-><init>(DDDD)V */
/* .line 76 */
/* .local v0, "e":Lcom/ansca/corona/events/Event; */
(( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* .line 77 */
return;
} // .end method
public void headingEvent ( Float p0 ) {
/* .locals 16 */
/* .param p1, "heading" # F */
/* .prologue */
/* .line 88 */
/* new-instance v1, Lcom/ansca/corona/events/LocationEvent; */
/* const-wide/16 v2, 0x0 */
/* const-wide/16 v4, 0x0 */
/* const-wide/16 v6, 0x0 */
/* const-wide/16 v8, 0x0 */
/* const-wide/16 v10, 0x0 */
/* move/from16 v0, p1 */
/* float-to-double v12, v0 */
/* const-wide/16 v14, 0x0 */
/* invoke-direct/range {v1 ..v15}, Lcom/ansca/corona/events/LocationEvent;-><init>(DDDDDDD)V */
/* .line 90 */
/* .local v1, "e":Lcom/ansca/corona/events/Event; */
/* move-object/from16 v0, p0 */
(( com.ansca.corona.events.EventManager ) v0 ).addEvent ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* .line 91 */
return;
} // .end method
public synchronized void imagePickerEvent ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "selectedFileName" # Ljava/lang/String; */
/* .prologue */
/* .line 282 */
/* monitor-enter p0 */
try { // :try_start_0
	 /* new-instance v0, Lcom/ansca/corona/events/ImagePickerEvent; */
	 /* invoke-direct {v0, p1}, Lcom/ansca/corona/events/ImagePickerEvent;-><init>(Ljava/lang/String;)V */
	 /* .line 283 */
	 /* .local v0, "e":Lcom/ansca/corona/events/ImagePickerEvent; */
	 (( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 284 */
	 /* monitor-exit p0 */
	 return;
	 /* .line 282 */
} // .end local v0 # "e":Lcom/ansca/corona/events/ImagePickerEvent;
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit p0 */
/* throw v1 */
} // .end method
public synchronized void keyboardEvent ( android.view.KeyEvent p0 ) {
/* .locals 2 */
/* .param p1, "keyEvent" # Landroid/view/KeyEvent; */
/* .prologue */
/* .line 277 */
/* monitor-enter p0 */
try { // :try_start_0
	 /* new-instance v0, Lcom/ansca/corona/events/KeyboardEvent; */
	 /* invoke-direct {v0, p1}, Lcom/ansca/corona/events/KeyboardEvent;-><init>(Landroid/view/KeyEvent;)V */
	 /* .line 278 */
	 /* .local v0, "e":Lcom/ansca/corona/events/KeyboardEvent; */
	 (( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 279 */
	 /* monitor-exit p0 */
	 return;
	 /* .line 277 */
} // .end local v0 # "e":Lcom/ansca/corona/events/KeyboardEvent;
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit p0 */
/* throw v1 */
} // .end method
public void loadEventSound ( Integer p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p1, "id" # I */
/* .param p2, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 135 */
com.ansca.corona.Controller .getMediaManager ( );
(( com.ansca.corona.MediaManager ) v0 ).loadEventSound ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/ansca/corona/MediaManager;->loadEventSound(ILjava/lang/String;)V
/* .line 136 */
return;
} // .end method
public void loadSound ( Integer p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p1, "id" # I */
/* .param p2, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 130 */
com.ansca.corona.Controller .getMediaManager ( );
(( com.ansca.corona.MediaManager ) v0 ).loadSound ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/ansca/corona/MediaManager;->loadSound(ILjava/lang/String;)V
/* .line 131 */
return;
} // .end method
public void locationEvent ( Double p0, Double p1, Double p2, Double p3, Double p4, Double p5, Double p6 ) {
/* .locals 15 */
/* .param p1, "latitude" # D */
/* .param p3, "longitude" # D */
/* .param p5, "altitude" # D */
/* .param p7, "accuracy" # D */
/* .param p9, "speed" # D */
/* .param p11, "bearing" # D */
/* .param p13, "time" # D */
/* .prologue */
/* .line 81 */
/* new-instance v0, Lcom/ansca/corona/events/LocationEvent; */
/* move-wide/from16 v1, p1 */
/* move-wide/from16 v3, p3 */
/* move-wide/from16 v5, p5 */
/* move-wide/from16 v7, p7 */
/* move-wide/from16 v9, p9 */
/* move-wide/from16 v11, p11 */
/* move-wide/from16 v13, p13 */
/* invoke-direct/range {v0 ..v14}, Lcom/ansca/corona/events/LocationEvent;-><init>(DDDDDDD)V */
/* .line 83 */
/* .local v0, "e":Lcom/ansca/corona/events/Event; */
(( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* .line 84 */
return;
} // .end method
public void nativeAlertResult ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "which" # I */
/* .prologue */
/* .line 109 */
/* new-instance v0, Lcom/ansca/corona/events/AlertEvent; */
/* invoke-direct {v0, p1}, Lcom/ansca/corona/events/AlertEvent;-><init>(I)V */
/* .line 111 */
/* .local v0, "e":Lcom/ansca/corona/events/Event; */
(( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* .line 112 */
return;
} // .end method
public void networkRequestEvent ( Integer p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 1 */
/* .param p1, "listenerId" # I */
/* .param p2, "response" # Ljava/lang/String; */
/* .param p3, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 247 */
/* new-instance v0, Lcom/ansca/corona/events/NetworkRequestEvent; */
/* invoke-direct {v0, p1, p2, p3}, Lcom/ansca/corona/events/NetworkRequestEvent;-><init>(ILjava/lang/String;Ljava/lang/String;)V */
/* .line 248 */
/* .local v0, "e":Lcom/ansca/corona/events/Event; */
(( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* .line 249 */
return;
} // .end method
public void networkRequestEvent ( Integer p0, java.lang.String p1, java.lang.String p2, Integer p3 ) {
/* .locals 1 */
/* .param p1, "listenerId" # I */
/* .param p2, "response" # Ljava/lang/String; */
/* .param p3, "url" # Ljava/lang/String; */
/* .param p4, "statusCode" # I */
/* .prologue */
/* .line 252 */
/* new-instance v0, Lcom/ansca/corona/events/NetworkRequestEvent; */
/* invoke-direct {v0, p1, p2, p3, p4}, Lcom/ansca/corona/events/NetworkRequestEvent;-><init>(ILjava/lang/String;Ljava/lang/String;I)V */
/* .line 253 */
/* .local v0, "e":Lcom/ansca/corona/events/Event; */
(( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* .line 254 */
return;
} // .end method
public com.ansca.corona.events.MultitouchEvent newMultitouchEvent ( ) {
/* .locals 1 */
/* .prologue */
/* .line 62 */
/* new-instance v0, Lcom/ansca/corona/events/MultitouchEvent; */
/* invoke-direct {v0}, Lcom/ansca/corona/events/MultitouchEvent;-><init>()V */
} // .end method
public void orientationChanged ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .param p1, "newOrientation" # I */
/* .param p2, "oldOrientation" # I */
/* .prologue */
/* .line 102 */
/* new-instance v0, Lcom/ansca/corona/events/OrientationEvent; */
/* invoke-direct {v0, p1, p2}, Lcom/ansca/corona/events/OrientationEvent;-><init>(II)V */
/* .line 104 */
/* .local v0, "e":Lcom/ansca/corona/events/Event; */
(( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* .line 105 */
return;
} // .end method
public void pauseSound ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 156 */
/* new-instance v0, Lcom/ansca/corona/events/MediaEvent; */
v1 = com.ansca.corona.events.MediaEvent$Event.PauseSound;
/* invoke-direct {v0, p1, v1}, Lcom/ansca/corona/events/MediaEvent;-><init>(ILcom/ansca/corona/events/MediaEvent$Event;)V */
/* .line 158 */
/* .local v0, "e":Lcom/ansca/corona/events/Event; */
(( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* .line 159 */
return;
} // .end method
public void playSound ( Integer p0, java.lang.String p1, Boolean p2 ) {
/* .locals 2 */
/* .param p1, "id" # I */
/* .param p2, "soundName" # Ljava/lang/String; */
/* .param p3, "loop" # Z */
/* .prologue */
/* .line 140 */
/* new-instance v0, Lcom/ansca/corona/events/MediaEvent; */
v1 = com.ansca.corona.events.MediaEvent$Event.PlaySound;
/* invoke-direct {v0, p1, p2, v1}, Lcom/ansca/corona/events/MediaEvent;-><init>(ILjava/lang/String;Lcom/ansca/corona/events/MediaEvent$Event;)V */
/* .line 142 */
/* .local v0, "e":Lcom/ansca/corona/events/MediaEvent; */
(( com.ansca.corona.events.MediaEvent ) v0 ).setLooping ( p3 ); // invoke-virtual {v0, p3}, Lcom/ansca/corona/events/MediaEvent;->setLooping(Z)V
/* .line 144 */
(( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* .line 145 */
return;
} // .end method
public void playVideo ( Integer p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p1, "id" # I */
/* .param p2, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 170 */
/* new-instance v0, Lcom/ansca/corona/events/MediaEvent; */
v1 = com.ansca.corona.events.MediaEvent$Event.PlayVideo;
/* invoke-direct {v0, p1, p2, v1}, Lcom/ansca/corona/events/MediaEvent;-><init>(ILjava/lang/String;Lcom/ansca/corona/events/MediaEvent$Event;)V */
/* .line 172 */
/* .local v0, "e":Lcom/ansca/corona/events/Event; */
(( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* .line 173 */
return;
} // .end method
public synchronized void removeAllEvents ( ) {
/* .locals 1 */
/* .prologue */
/* .line 32 */
/* monitor-enter p0 */
try { // :try_start_0
	 v0 = this.myEvents;
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* .line 33 */
	 /* monitor-exit p0 */
	 return;
	 /* .line 32 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // .end method
public void resize ( java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, Integer p5, Integer p6, Integer p7 ) {
	 /* .locals 9 */
	 /* .param p1, "name" # Ljava/lang/String; */
	 /* .param p2, "documentsDir" # Ljava/lang/String; */
	 /* .param p3, "temporaryDir" # Ljava/lang/String; */
	 /* .param p4, "cachesDir" # Ljava/lang/String; */
	 /* .param p5, "systemCachesDir" # Ljava/lang/String; */
	 /* .param p6, "w" # I */
	 /* .param p7, "h" # I */
	 /* .param p8, "orientation" # I */
	 /* .prologue */
	 /* .line 123 */
	 /* new-instance v0, Lcom/ansca/corona/events/ResizeEvent; */
	 /* move-object v1, p1 */
	 /* move-object v2, p2 */
	 /* move-object v3, p3 */
	 /* move-object v4, p4 */
	 /* move-object v5, p5 */
	 /* move v6, p6 */
	 /* move/from16 v7, p7 */
	 /* move/from16 v8, p8 */
	 /* invoke-direct/range {v0 ..v8}, Lcom/ansca/corona/events/ResizeEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V */
	 /* .line 125 */
	 /* .local v0, "e":Lcom/ansca/corona/events/Event; */
	 (( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
	 /* .line 126 */
	 return;
} // .end method
public void resumeSound ( Integer p0 ) {
	 /* .locals 2 */
	 /* .param p1, "id" # I */
	 /* .prologue */
	 /* .line 163 */
	 /* new-instance v0, Lcom/ansca/corona/events/MediaEvent; */
	 v1 = com.ansca.corona.events.MediaEvent$Event.ResumeSound;
	 /* invoke-direct {v0, p1, v1}, Lcom/ansca/corona/events/MediaEvent;-><init>(ILcom/ansca/corona/events/MediaEvent$Event;)V */
	 /* .line 165 */
	 /* .local v0, "e":Lcom/ansca/corona/events/Event; */
	 (( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
	 /* .line 166 */
	 return;
} // .end method
public synchronized void sendEvents ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 265 */
	 /* monitor-enter p0 */
} // :goto_0
try { // :try_start_0
	 v1 = this.myEvents;
	 /* check-cast v0, Lcom/ansca/corona/events/Event; */
	 /* .local v0, "e":Lcom/ansca/corona/events/Event; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 266 */
		 (( com.ansca.corona.events.Event ) v0 ).Send ( ); // invoke-virtual {v0}, Lcom/ansca/corona/events/Event;->Send()V
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* .line 265 */
	 } // .end local v0 # "e":Lcom/ansca/corona/events/Event;
	 /* :catchall_0 */
	 /* move-exception v1 */
	 /* monitor-exit p0 */
	 /* throw v1 */
	 /* .line 268 */
	 /* .restart local v0 # "e":Lcom/ansca/corona/events/Event; */
} // :cond_0
/* monitor-exit p0 */
return;
} // .end method
public void shouldLoadUrlEvent ( Integer p0, android.webkit.WebView p1, java.lang.String p2, java.lang.String p3 ) {
/* .locals 1 */
/* .param p1, "id" # I */
/* .param p2, "webView" # Landroid/webkit/WebView; */
/* .param p3, "originalUrl" # Ljava/lang/String; */
/* .param p4, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 205 */
/* new-instance v0, Lcom/ansca/corona/events/ShouldLoadUrlEvent; */
/* invoke-direct {v0, p1, p2, p3, p4}, Lcom/ansca/corona/events/ShouldLoadUrlEvent;-><init>(ILandroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 207 */
/* .local v0, "e":Lcom/ansca/corona/events/Event; */
(( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* .line 208 */
return;
} // .end method
public void soundEnded ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 177 */
/* new-instance v0, Lcom/ansca/corona/events/MediaEvent; */
v1 = com.ansca.corona.events.MediaEvent$Event.SoundEnded;
/* invoke-direct {v0, p1, v1}, Lcom/ansca/corona/events/MediaEvent;-><init>(ILcom/ansca/corona/events/MediaEvent$Event;)V */
/* .line 179 */
/* .local v0, "e":Lcom/ansca/corona/events/Event; */
(( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* .line 180 */
return;
} // .end method
public void stopSound ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 149 */
/* new-instance v0, Lcom/ansca/corona/events/MediaEvent; */
v1 = com.ansca.corona.events.MediaEvent$Event.StopSound;
/* invoke-direct {v0, p1, v1}, Lcom/ansca/corona/events/MediaEvent;-><init>(ILcom/ansca/corona/events/MediaEvent$Event;)V */
/* .line 151 */
/* .local v0, "e":Lcom/ansca/corona/events/Event; */
(( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* .line 152 */
return;
} // .end method
public void tapEvent ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .param p1, "x" # I */
/* .param p2, "y" # I */
/* .param p3, "count" # I */
/* .prologue */
/* .line 116 */
/* new-instance v0, Lcom/ansca/corona/events/TapEvent; */
/* invoke-direct {v0, p1, p2, p3}, Lcom/ansca/corona/events/TapEvent;-><init>(III)V */
/* .line 118 */
/* .local v0, "e":Lcom/ansca/corona/events/Event; */
(( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* .line 119 */
return;
} // .end method
public void textEditingEvent ( Integer p0, Integer p1, Integer p2, java.lang.String p3, java.lang.String p4, java.lang.String p5 ) {
/* .locals 7 */
/* .param p1, "id" # I */
/* .param p2, "start_pos" # I */
/* .param p3, "num_deleted" # I */
/* .param p4, "new_characters" # Ljava/lang/String; */
/* .param p5, "old_string" # Ljava/lang/String; */
/* .param p6, "new_string" # Ljava/lang/String; */
/* .prologue */
/* .line 198 */
/* new-instance v0, Lcom/ansca/corona/events/TextEditingEvent; */
/* move v1, p1 */
/* move v2, p2 */
/* move v3, p3 */
/* move-object v4, p4 */
/* move-object v5, p5 */
/* move-object v6, p6 */
/* invoke-direct/range {v0 ..v6}, Lcom/ansca/corona/events/TextEditingEvent;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 200 */
/* .local v0, "e":Lcom/ansca/corona/events/Event; */
(( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* .line 201 */
return;
} // .end method
public void textEvent ( Integer p0, Boolean p1, Boolean p2 ) {
/* .locals 1 */
/* .param p1, "id" # I */
/* .param p2, "hasFocus" # Z */
/* .param p3, "isDone" # Z */
/* .prologue */
/* .line 191 */
/* new-instance v0, Lcom/ansca/corona/events/TextEvent; */
/* invoke-direct {v0, p1, p2, p3}, Lcom/ansca/corona/events/TextEvent;-><init>(IZZ)V */
/* .line 193 */
/* .local v0, "e":Lcom/ansca/corona/events/Event; */
(( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* .line 194 */
return;
} // .end method
public void touchEvent ( com.ansca.corona.events.TouchData p0 ) {
/* .locals 1 */
/* .param p1, "t" # Lcom/ansca/corona/events/TouchData; */
/* .prologue */
/* .line 95 */
/* new-instance v0, Lcom/ansca/corona/events/TouchEvent; */
/* invoke-direct {v0, p1}, Lcom/ansca/corona/events/TouchEvent;-><init>(Lcom/ansca/corona/events/TouchData;)V */
/* .line 97 */
/* .local v0, "e":Lcom/ansca/corona/events/Event; */
(( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* .line 98 */
return;
} // .end method
public void videoEnded ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 184 */
/* new-instance v0, Lcom/ansca/corona/events/MediaEvent; */
v1 = com.ansca.corona.events.MediaEvent$Event.VideoEnded;
/* invoke-direct {v0, p1, v1}, Lcom/ansca/corona/events/MediaEvent;-><init>(ILcom/ansca/corona/events/MediaEvent$Event;)V */
/* .line 186 */
/* .local v0, "e":Lcom/ansca/corona/events/Event; */
(( com.ansca.corona.events.EventManager ) p0 ).addEvent ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
/* .line 187 */
return;
} // .end method

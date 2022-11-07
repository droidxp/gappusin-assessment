class de.hellowins.UnityApiWebSocket$1 implements de.roderick.weberknecht.WebSocketEventHandler {
	 /* .source "UnityApiWebSocket.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lde/hellowins/UnityApiWebSocket;->connect()Ljava/lang/String; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final de.hellowins.UnityApiWebSocket this$0; //synthetic
/* # direct methods */
 de.hellowins.UnityApiWebSocket$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 68 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClose ( ) {
/* .locals 2 */
/* .prologue */
/* .line 76 */
v0 = this.this$0;
v0 = this.logData;
final String v1 = "WebSocket: close"; // const-string v1, "WebSocket: close"
(( de.hellowins.LogData ) v0 ).addLog ( v1 ); // invoke-virtual {v0, v1}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 77 */
v0 = this.this$0;
(( de.hellowins.UnityApiWebSocket ) v0 ).handleClose ( ); // invoke-virtual {v0}, Lde/hellowins/UnityApiWebSocket;->handleClose()V
/* .line 78 */
return;
} // .end method
public void onMessage ( de.roderick.weberknecht.WebSocketMessage p0 ) {
/* .locals 1 */
/* .param p1, "message" # Lde/roderick/weberknecht/WebSocketMessage; */
/* .prologue */
/* .line 81 */
v0 = this.this$0;
(( de.hellowins.UnityApiWebSocket ) v0 ).handleMessage ( p1 ); // invoke-virtual {v0, p1}, Lde/hellowins/UnityApiWebSocket;->handleMessage(Lde/roderick/weberknecht/WebSocketMessage;)V
/* .line 82 */
return;
} // .end method
public void onOpen ( ) {
/* .locals 2 */
/* .prologue */
/* .line 71 */
v0 = this.this$0;
v0 = this.logData;
final String v1 = "WebSocket: open"; // const-string v1, "WebSocket: open"
(( de.hellowins.LogData ) v0 ).addLog ( v1 ); // invoke-virtual {v0, v1}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 72 */
v0 = this.this$0;
(( de.hellowins.UnityApiWebSocket ) v0 ).sendOneTimeKey ( ); // invoke-virtual {v0}, Lde/hellowins/UnityApiWebSocket;->sendOneTimeKey()V
/* .line 73 */
return;
} // .end method
